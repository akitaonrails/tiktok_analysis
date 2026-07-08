package com.bytedance.bpea.transmit.hook;

import X.C0T58;
import X.C0T59;
import X.C0T5A;
import X.C0T5C;
import X.C0W9T;
import X.C0WP5;
import X.C762010Tup;
import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;

/* JADX INFO: loaded from: classes13.dex */
public final class HandlerHook {
    public static final C0T5A Companion = new C0T5A();

    public static final Handler createAsync(Looper looper) {
        Companion.getClass();
        if (C0WP5.LIZ()) {
            BPEAHandler bPEAHandler = new BPEAHandler(looper);
            bPEAHandler.makeAsynchronous();
            return bPEAHandler;
        }
        return Handler.createAsync(looper);
    }

    public static final Object getMessageObj(Object obj) {
        Companion.getClass();
        if (obj instanceof C0W9T) {
            return null;
        }
        if (!(obj instanceof C762010Tup)) {
            return obj;
        }
        return ((C762010Tup) obj).LIZ;
    }

    public static final void activityRunOnUiThread(Activity activity, Runnable runnable) {
        Companion.getClass();
        if (C0WP5.LIZ()) {
            activity.runOnUiThread(C0T5C.LIZ(runnable));
        } else {
            activity.runOnUiThread(runnable);
        }
    }

    public static final Handler createAsync(Looper looper, Handler.Callback callback) {
        Companion.getClass();
        if (C0WP5.LIZ()) {
            BPEAHandler bPEAHandler = new BPEAHandler(looper, callback);
            bPEAHandler.makeAsynchronous();
            return bPEAHandler;
        }
        return Handler.createAsync(looper, callback);
    }

    public static final boolean postAtFrontOfQueue(Handler handler, Runnable runnable) {
        Companion.getClass();
        if (handler instanceof BPEAHandler) {
            return ((BPEAHandler) handler).postAtFrontOfQueueByBPEA(runnable);
        }
        return handler.postAtFrontOfQueue(runnable);
    }

    public static final boolean sendMessageAtFrontOfQueue(Handler handler, Message message) {
        Companion.getClass();
        if (handler instanceof BPEAHandler) {
            return ((BPEAHandler) handler).sendMessageAtFrontOfQueueByBPEA(message);
        }
        return handler.sendMessageAtFrontOfQueue(message);
    }

    public static final boolean viewPost(View view, Runnable runnable) {
        Companion.getClass();
        if (runnable == null) {
            return view.post(runnable);
        }
        return view.post(C0T5A.LIZ(runnable));
    }

    public static final boolean viewRemoveCallbacks(View view, Runnable runnable) {
        C0T59 c0t59LIZ;
        Companion.getClass();
        if (runnable == null) {
            return view.removeCallbacks(runnable);
        }
        if (C0WP5.LIZ() && (c0t59LIZ = C0T58.LIZ(1, runnable, false)) != null) {
            runnable = c0t59LIZ;
        }
        return view.removeCallbacks(runnable);
    }

    public static final boolean viewPostDelay(View view, Runnable runnable, long j) {
        Companion.getClass();
        if (runnable == null) {
            return view.postDelayed(runnable, j);
        }
        return view.postDelayed(C0T5A.LIZ(runnable), j);
    }
}
