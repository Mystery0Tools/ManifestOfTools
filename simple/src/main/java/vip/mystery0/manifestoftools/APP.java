package vip.mystery0.manifestoftools;

import android.app.Application;
import android.os.Environment;

import vip.mystery0.crashhandler.CatchException;
import vip.mystery0.crashhandler.CrashHandler;
import vip.mystery0.logs.Logs;

public class APP extends Application {
	@Override
	public void onCreate() {
		super.onCreate();
		CrashHandler.getInstance(this)
				.setDir(Environment.getExternalStorageDirectory())
				.setPrefix("crash")//设置日志文件名称头部
				.setSuffix("txt")//设置日志文件扩展名
				.autoClean(3)//设置自动清理频率
				.doOnCatch(new CrashHandler.CatchExceptionListener() {
					@Override
					public void catchException(CatchException e) {
						//捕获异常时调用
					}
				})
//				.clean(new CrashHandler.AutoCleanListener() {
//					@Override
//					public void cleanDone() {
//						//清理日志文件成功
//					}
//
//					@Override
//					public void cleanError(Exception e) {
////					//清理日志文件失败
//					}
//				})
				.init();
		
		Logs.setLevel(Logs.Level.DEBUG);//设置日志显示级别
	}
}
