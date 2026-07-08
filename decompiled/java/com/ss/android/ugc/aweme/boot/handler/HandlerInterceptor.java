package com.ss.android.ugc.aweme.boot.handler;

import X.AnonymousClass0716;
import X.AnonymousClass0883;
import X.C086V;
import X.C786410Ut5;
import X.InterfaceC20685088l;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.LinkedList;
import java.util.Queue;

/* JADX INFO: loaded from: classes4.dex */
public final class HandlerInterceptor {
    public static volatile HandlerInterceptor LIZIZ;
    public InterfaceC20685088l LIZ;

    public static HandlerInterceptor LIZ() {
        if (LIZIZ == null) {
            synchronized (HandlerInterceptor.class) {
                try {
                    if (LIZIZ == null) {
                        LIZIZ = new HandlerInterceptor();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LIZIZ;
    }

    public final void LIZIZ() {
        if (AnonymousClass0716.LIZ()) {
            if (this.LIZ == null) {
                this.LIZ = new DelegateActivityThreadHandler(AnonymousClass0883.LIZJ());
            }
            DelegateActivityThreadHandler delegateActivityThreadHandler = (DelegateActivityThreadHandler) this.LIZ;
            delegateActivityThreadHandler.getClass();
            delegateActivityThreadHandler.LLILLL = AnonymousClass0883.LIZ(delegateActivityThreadHandler) && AnonymousClass0883.LIZIZ(delegateActivityThreadHandler.LL, delegateActivityThreadHandler);
        }
    }

    public final void LIZJ() {
        InterfaceC20685088l interfaceC20685088l;
        if (!AnonymousClass0716.LIZ() || (interfaceC20685088l = this.LIZ) == null) {
            return;
        }
        DelegateActivityThreadHandler delegateActivityThreadHandler = (DelegateActivityThreadHandler) interfaceC20685088l;
        if (!delegateActivityThreadHandler.LLILLL) {
            return;
        }
        try {
            delegateActivityThreadHandler.LLILLL = false;
            if (AnonymousClass0883.LIZJ() == delegateActivityThreadHandler) {
                AnonymousClass0883.LIZ(delegateActivityThreadHandler.LL);
                AnonymousClass0883.LIZIZ(delegateActivityThreadHandler, delegateActivityThreadHandler.LL);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            Log.getStackTraceString(th);
        }
        while (true) {
            Message message = (Message) ((LinkedList) delegateActivityThreadHandler.LLILLJJLI).poll();
            if (message == null) {
                return;
            }
            Handler handlerLIZJ = AnonymousClass0883.LIZJ();
            if (C086V.LIZ(message)) {
                C786410Ut5.LJLJL(handlerLIZJ, message, -1L);
            } else {
                Message messageObtain = Message.obtain(message);
                C086V.LIZIZ(message);
                C786410Ut5.LJLJL(handlerLIZJ, messageObtain, -1L);
            }
        }
    }

    public static class DelegateActivityThreadHandler extends BPEAHandler implements InterfaceC20685088l {
        public final Handler LL;
        public final Queue<Message> LLILLJJLI;
        public boolean LLILLL;

        /* JADX WARN: Illegal instructions before constructor call */
        public DelegateActivityThreadHandler(Handler handler) {
            Looper mainLooper;
            if (handler != null) {
                mainLooper = handler.getLooper();
            } else {
                mainLooper = Looper.getMainLooper();
            }
            super(mainLooper);
            this.LLILLJJLI = new LinkedList();
            this.LL = handler;
        }

        @Override // com.bytedance.bpea.transmit.delegate.BPEAHandler, android.os.Handler
        public final void dispatchMessage(Message message) {
            Runnable callback;
            if (AnonymousClass0716.LIZ() && (callback = message.getCallback()) != null) {
                String name = callback.getClass().getName();
                boolean zContains = name.contains("LoadedApk$ReceiverDispatcher");
                boolean zContains2 = name.contains("LoadedApk$ServiceDispatcher");
                if (zContains || zContains2) {
                    ((LinkedList) this.LLILLJJLI).offer(message);
                    return;
                }
            }
            Handler handler = this.LL;
            if (handler != null) {
                handler.dispatchMessage(message);
            } else {
                super.dispatchMessage(message);
            }
        }
    }
}
