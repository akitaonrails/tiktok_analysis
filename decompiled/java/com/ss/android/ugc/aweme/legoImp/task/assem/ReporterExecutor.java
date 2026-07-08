package com.ss.android.ugc.aweme.legoImp.task.assem;

import X.C01GW;
import X.C0C2C;
import X.C0C2D;
import X.C1C7U;
import X.C259800zU;
import X.C279390AxF;
import X.C452501pT;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.AFwS190S0000000_4;

/* JADX INFO: loaded from: classes5.dex */
public final class ReporterExecutor implements Executor {
    public static final C01GW<ReporterExecutor> LLILZIL = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(1723));
    public volatile int LLILLL;
    public final C01GW LL = C452501pT.LIZIZ(new C0C2D());
    public final Object LLILLJJLI = new Object();
    public final C01GW LLILZ = C452501pT.LIZIZ(new C0C2C(this));

    public static final class RunnableHandler extends BPEAHandler {
        public RunnableHandler(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            Runnable runnable;
            C1C7U.LIZ("ReporterExecutor$RunnableHandler@cef.handleMessage");
            Object messageObj = HandlerHook.getMessageObj(message.obj);
            if ((messageObj instanceof Runnable) && (runnable = (Runnable) messageObj) != null) {
                runnable.run();
                C1C7U.LIZIZ("ReporterExecutor$RunnableHandler@cef.handleMessage");
            } else {
                C1C7U.LIZIZ("ReporterExecutor$RunnableHandler@cef.handleMessage");
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        if (runnable == 0) {
            return;
        }
        if (((Boolean) C279390AxF.LIZIZ.getValue()).booleanValue()) {
            C259800zU c259800zU = new C259800zU();
            boolean z = true;
            this.LLILLL++;
            if (this.LLILLL <= 20) {
                z = false;
            }
            synchronized (this.LLILLJJLI) {
                try {
                    c259800zU.element = runnable;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            if (z) {
                Message messageObtain = Message.obtain();
                messageObtain.obj = c259800zU.element;
                ((Handler) this.LLILZ.getValue()).sendMessage(messageObtain);
                this.LLILLL = 0;
                return;
            }
            return;
        }
        Message messageObtain2 = Message.obtain();
        messageObtain2.obj = runnable;
        ((Handler) this.LLILZ.getValue()).sendMessage(messageObtain2);
    }
}
