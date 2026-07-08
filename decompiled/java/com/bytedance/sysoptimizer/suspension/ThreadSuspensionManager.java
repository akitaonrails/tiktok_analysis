package com.bytedance.sysoptimizer.suspension;

import X.C1C7U;
import X.C786410Ut5;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;

/* JADX INFO: loaded from: classes10.dex */
public class ThreadSuspensionManager {
    public static ThreadSuspensionHandler mHanderThread;
    public static final Handler mMainHandler = new BPEAHandler(Looper.getMainLooper()) { // from class: com.bytedance.sysoptimizer.suspension.ThreadSuspensionManager.1
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            C1C7U.LIZ("ThreadSuspensionManager@f61c.<field>$1");
            if (message.what == 0) {
                ThreadSuspensionManager.stopTask();
            }
            super.handleMessage(message);
            C1C7U.LIZIZ("ThreadSuspensionManager@f61c.<field>$1");
        }
    };

    public static void start(SuspensionParam suspensionParam, ThreadSuspendedCallback threadSuspendedCallback, Runnable runnable) {
    }

    public static void stop() {
        Handler handler = mMainHandler;
        handler.removeMessages(0);
        Message messageObtain = Message.obtain();
        messageObtain.what = 0;
        C786410Ut5.LJLJJL(handler, messageObtain);
    }

    public static void stopTask() {
        ThreadSuspensionHandler threadSuspensionHandler = mHanderThread;
        if (threadSuspensionHandler != null) {
            threadSuspensionHandler.stopTask();
            mHanderThread = null;
        }
    }
}
