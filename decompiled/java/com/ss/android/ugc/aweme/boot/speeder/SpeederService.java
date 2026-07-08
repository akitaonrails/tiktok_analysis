package com.ss.android.ugc.aweme.boot.speeder;

import X.AnonymousClass0883;
import X.C086V;
import X.C0CD2;
import X.C0WZX;
import X.C0X35;
import X.C1960207m4;
import X.C1961107mD;
import X.C20686088m;
import X.C20689088p;
import X.C2188811AlT;
import X.C2204961BRm;
import X.C786410Ut5;
import X.InterfaceC20687088n;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.MessageQueue;
import android.util.Log;
import android.view.Choreographer;
import android.view.ViewParent;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes4.dex */
public final class SpeederService {
    public static int LJII;
    public static int LJIIIIZZ;
    public volatile boolean LIZ;
    public final C20686088m LIZIZ = new C20686088m(this);
    public DelegateActivityThreadHandler LIZJ;
    public DelegateChoreographerHandler LIZLLL;
    public DelegateViewRootImplHandler LJ;
    public Boolean LJFF;
    public int LJI;

    public static class DelegateChoreographerHandler extends BPEAHandler implements InterfaceC20687088n {
        public final Handler LL;
        public final Object LLILLJJLI;
        public final Choreographer LLILLL;
        public boolean LLILZ;

        @Override // X.InterfaceC20687088n
        public final void start() {
            Choreographer choreographer = this.LLILLL;
            Class<?> cls = AnonymousClass0883.LIZ;
            try {
                C1960207m4.LIZIZ(C1960207m4.LIZ(C1961107mD.LIZ(choreographer.getClass(), "mHandler")), choreographer, this);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                Log.getStackTraceString(th);
            }
            boolean z = AnonymousClass0883.LIZIZ(this.LL, this);
            this.LLILZ = z;
        }

        @Override // com.bytedance.bpea.transmit.delegate.BPEAHandler, android.os.Handler
        public final void dispatchMessage(Message message) {
            Handler handler = this.LL;
            if (handler != null) {
                handler.dispatchMessage(message);
            } else {
                super.dispatchMessage(message);
            }
        }

        public DelegateChoreographerHandler(Handler handler, Choreographer choreographer) {
            Object objLIZJ;
            super(handler.getLooper());
            this.LL = handler;
            this.LLILLL = choreographer;
            Class<?> cls = AnonymousClass0883.LIZ;
            try {
                objLIZJ = C1961107mD.LIZJ(choreographer, "mDisplayEventReceiver");
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                Log.getStackTraceString(th);
                objLIZJ = null;
            }
            this.LLILLJJLI = objLIZJ;
        }

        @Override // X.InterfaceC20687088n
        public final boolean LIZIZ(Message message, long j) {
            return sendMessageAtTime(message, j);
        }

        @Override // com.bytedance.bpea.transmit.delegate.BPEAHandler, android.os.Handler
        public final boolean sendMessageAtTime(Message message, long j) {
            int iIntValue;
            Method methodLIZIZ;
            Handler handler;
            if (!this.LLILZ && (handler = this.LL) != null) {
                return C786410Ut5.LJLJL(handler, message, j);
            }
            if (this.LL != null) {
                if (message.getCallback() == this.LLILLJJLI) {
                    SpeederService speederService = C20689088p.LIZ;
                    if (speederService.LJFF == null) {
                        speederService.LJFF = Boolean.TRUE;
                        MessageQueue queue = Looper.getMainLooper().getQueue();
                        Class<?> cls = AnonymousClass0883.LIZ;
                        try {
                            methodLIZIZ = C1961107mD.LIZIZ(MessageQueue.class, "postSyncBarrier", Long.TYPE);
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            Log.getStackTraceString(th);
                        }
                        if (methodLIZIZ != null) {
                            iIntValue = ((Integer) C2204961BRm.a0(methodLIZIZ, queue, new Object[]{0L}, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOinbIuAySaPwIo21uiFiEsarLmotVq8Q2JJ", null))).intValue();
                        } else {
                            iIntValue = -1;
                        }
                        speederService.LJI = iIntValue;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("post SyncBarrier: ");
                        sbLIZ.append(speederService.LJI);
                        C2188811AlT.LIZIZ(sbLIZ);
                    }
                    if (SpeederService.LIZ()) {
                        int i = SpeederService.LJII;
                        SpeederService.LJII = i + 1;
                        return super.sendMessageAtTime(message, i);
                    }
                    Handler handler2 = this.LL;
                    int i2 = SpeederService.LJII;
                    SpeederService.LJII = i2 + 1;
                    return C786410Ut5.LJLJL(handler2, message, i2);
                }
                if (SpeederService.LIZ()) {
                    int i3 = SpeederService.LJIIIIZZ;
                    SpeederService.LJIIIIZZ = i3 + 1;
                    return super.sendMessageAtTime(message, i3);
                }
                Handler handler3 = this.LL;
                int i4 = SpeederService.LJIIIIZZ;
                SpeederService.LJIIIIZZ = i4 + 1;
                return C786410Ut5.LJLJL(handler3, message, i4);
            }
            return super.sendMessageAtTime(message, j);
        }
    }

    public static class DelegateViewRootImplHandler extends BPEAHandler implements InterfaceC20687088n {
        public final Handler LL;
        public final WeakReference<ViewParent> LLILLJJLI;
        public boolean LLILLL;

        public final void LJ() {
            try {
                ViewParent viewParent = this.LLILLJJLI.get();
                if (viewParent != null && AnonymousClass0883.LIZLLL(viewParent) == this) {
                    try {
                        C1960207m4.LIZIZ(C1960207m4.LIZ(C1961107mD.LIZ(viewParent.getClass(), "mHandler")), viewParent, this.LL);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        Log.getStackTraceString(th);
                    }
                    AnonymousClass0883.LIZIZ(this, this.LL);
                }
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
            }
        }

        @Override // X.InterfaceC20687088n
        public final void start() {
            ViewParent viewParent = this.LLILLJJLI.get();
            if (viewParent == null) {
                return;
            }
            Class<?> cls = AnonymousClass0883.LIZ;
            try {
                C1960207m4.LIZIZ(C1960207m4.LIZ(C1961107mD.LIZ(viewParent.getClass(), "mHandler")), viewParent, this);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                Log.getStackTraceString(th);
            }
            boolean z = AnonymousClass0883.LIZIZ(this.LL, this);
            this.LLILLL = z;
        }

        @Override // com.bytedance.bpea.transmit.delegate.BPEAHandler, android.os.Handler
        public final void dispatchMessage(Message message) {
            Handler handler = this.LL;
            if (handler != null) {
                handler.dispatchMessage(message);
            } else {
                super.dispatchMessage(message);
            }
        }

        public DelegateViewRootImplHandler(Handler handler, ViewParent viewParent) {
            super(handler.getLooper());
            this.LL = handler;
            this.LLILLJJLI = new WeakReference<>(viewParent);
        }

        @Override // X.InterfaceC20687088n
        public final boolean LIZIZ(Message message, long j) {
            return sendMessageAtTime(message, j);
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x001e  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x002a  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x008b  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x009f  */
        /* JADX WARN: Removed duplicated region for block: B:47:0x00c7  */
        /* JADX WARN: Removed duplicated region for block: B:49:0x00d3  */
        @Override // com.bytedance.bpea.transmit.delegate.BPEAHandler, android.os.Handler
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final boolean sendMessageAtTime(android.os.Message r13, long r14) {
            /*
                Method dump skipped, instruction units count: 230
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.boot.speeder.SpeederService.DelegateViewRootImplHandler.sendMessageAtTime(android.os.Message, long):boolean");
        }
    }

    public static class DelegateActivityThreadHandler extends BPEAHandler implements InterfaceC20687088n {
        public final Handler LL;
        public boolean LLILLJJLI;

        @Override // X.InterfaceC20687088n
        public final void start() {
            this.LLILLJJLI = AnonymousClass0883.LIZ(this) && AnonymousClass0883.LIZIZ(this.LL, this);
        }

        public DelegateActivityThreadHandler(Handler handler) {
            super(handler.getLooper());
            this.LL = handler;
        }

        @Override // com.bytedance.bpea.transmit.delegate.BPEAHandler, android.os.Handler
        public final void dispatchMessage(Message message) {
            Handler handler = this.LL;
            if (handler != null) {
                handler.dispatchMessage(message);
            } else {
                super.dispatchMessage(message);
            }
        }

        @Override // X.InterfaceC20687088n
        public final boolean LIZIZ(Message message, long j) {
            return sendMessageAtTime(message, j);
        }

        @Override // com.bytedance.bpea.transmit.delegate.BPEAHandler, android.os.Handler
        public final boolean sendMessageAtTime(Message message, long j) {
            Handler handler;
            if (!this.LLILLJJLI && (handler = this.LL) != null) {
                return C786410Ut5.LJLJL(handler, message, j);
            }
            if (this.LL != null) {
                if (message.what == 159) {
                    message.setAsynchronous(true);
                    if (SpeederService.LIZ()) {
                        int i = SpeederService.LJII;
                        SpeederService.LJII = i + 1;
                        return super.sendMessageAtTime(message, i);
                    }
                    Handler handler2 = this.LL;
                    int i2 = SpeederService.LJII;
                    SpeederService.LJII = i2 + 1;
                    return C786410Ut5.LJLJL(handler2, message, i2);
                }
                if (SpeederService.LIZ()) {
                    int i3 = SpeederService.LJIIIIZZ;
                    SpeederService.LJIIIIZZ = i3 + 1;
                    return super.sendMessageAtTime(message, i3);
                }
                Handler handler3 = this.LL;
                int i4 = SpeederService.LJIIIIZZ;
                SpeederService.LJIIIIZZ = i4 + 1;
                return C786410Ut5.LJLJL(handler3, message, i4);
            }
            return super.sendMessageAtTime(message, j);
        }
    }

    public static boolean LIZ() {
        return ((Boolean) C0CD2.LIZLLL.getValue()).booleanValue() || C0X35.LJIILIIL();
    }

    static {
        C0X35.LJIILIIL();
        LJIIIIZZ = 40;
    }

    public static void LIZIZ(Handler handler, InterfaceC20687088n interfaceC20687088n) {
        MessageQueue queue;
        Message message;
        Object obj;
        Class<?> cls = AnonymousClass0883.LIZ;
        LinkedList<Message> linkedList = new LinkedList();
        try {
            Method method = C086V.LIZ;
            try {
                queue = Looper.getMainLooper().getQueue();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                queue = null;
            }
            if (Build.VERSION.SDK_INT < 37) {
                try {
                    for (Message message2 = (Message) C086V.LJFF.get(queue); message2 != null; message2 = message) {
                        try {
                            obj = C086V.LIZJ.get(message2);
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                        if (obj != null) {
                            message = (Message) obj;
                        } else {
                            message = null;
                        }
                        if (message2.getTarget() == handler) {
                            linkedList.offer(Message.obtain(message2));
                        }
                    }
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            Log.getStackTraceString(e2);
        }
        for (Message message3 : linkedList) {
            handler.removeMessages(message3.what, HandlerHook.getMessageObj(message3.obj));
        }
        interfaceC20687088n.start();
        while (true) {
            Message message4 = (Message) linkedList.poll();
            if (message4 != null) {
                interfaceC20687088n.LIZIZ(message4, message4.getWhen());
            } else {
                return;
            }
        }
    }
}
