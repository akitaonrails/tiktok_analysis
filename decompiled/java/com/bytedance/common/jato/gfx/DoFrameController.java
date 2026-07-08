package com.bytedance.common.jato.gfx;

import X.C08IS;
import X.C08IT;
import X.C08IV;
import X.C1959307lv;
import X.C1960507m7;
import X.C1C7U;
import X.C20605085j;
import X.C2188811AlT;
import X.C786410Ut5;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Printer;
import android.view.Choreographer;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class DoFrameController {
    public static Handler LIZLLL;
    public static long[] LJFF;
    public static Printer LJI;
    public static ArrayList<C08IV> LJII;
    public static C08IT LJIIIIZZ;
    public static final ProxyFrameHandler LIZ = new ProxyFrameHandler(Looper.getMainLooper());
    public static volatile int LIZIZ = 0;
    public static volatile boolean LIZJ = false;
    public static Object LJ = null;

    public static class ProxyFrameHandler extends BPEAHandler {
        public String beginStr;
        public String endStr;

        @Override // android.os.Handler
        public String toString() {
            return C20605085j.LIZJ ? "DFC_H_ProxyFrameHandler" : super.toString();
        }

        public ProxyFrameHandler(Looper looper) {
            super(looper);
            this.beginStr = "<";
            this.endStr = ">";
        }

        public void fillStr(Object obj) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(">>>>> Dispatching to ");
            sbLIZ.append(toString());
            sbLIZ.append(" ");
            sbLIZ.append(obj);
            sbLIZ.append(": 0");
            this.beginStr = C2188811AlT.LIZIZ(sbLIZ);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("<<<<< Finished to ");
            sbLIZ2.append(toString());
            sbLIZ2.append(" ");
            sbLIZ2.append(obj);
            this.endStr = C2188811AlT.LIZIZ(sbLIZ2);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            C1C7U.LIZ("DoFrameController$ProxyFrameHandler@9c38.handleMessage");
            Handler handler = DoFrameController.LIZLLL;
            if (handler != null) {
                handler.handleMessage(message);
            }
            C1C7U.LIZIZ("DoFrameController$ProxyFrameHandler@9c38.handleMessage");
        }

        private boolean dispatchDoframe(Message message, long j) {
            if (DoFrameController.LJII != null) {
                for (int i = 0; i < DoFrameController.LJII.size(); i++) {
                    ((C08IV) ListProtector.get(DoFrameController.LJII, i)).LIZ();
                }
            }
            return false;
        }

        private void dispatchMessageNow(Message message, boolean z) {
            message.setTarget(this);
            Printer printer = DoFrameController.LJI;
            if (printer != null) {
                if (z) {
                    ProxyFrameHandler proxyFrameHandler = DoFrameController.LIZ;
                    printer.println(proxyFrameHandler.beginStr);
                    dispatchMessage(message);
                    DoFrameController.LJI.println(proxyFrameHandler.endStr);
                } else {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(">>>>> Dispatching to ");
                    sbLIZ.append(message.getTarget());
                    sbLIZ.append(" ");
                    sbLIZ.append(message.getCallback());
                    sbLIZ.append(": ");
                    sbLIZ.append(message.what);
                    printer.println(C2188811AlT.LIZIZ(sbLIZ));
                    dispatchMessage(message);
                    Printer printer2 = DoFrameController.LJI;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("<<<<< Finished to ");
                    sbLIZ2.append(message.getTarget());
                    sbLIZ2.append(" ");
                    sbLIZ2.append(message.getCallback());
                    printer2.println(C2188811AlT.LIZIZ(sbLIZ2));
                }
            } else {
                dispatchMessage(message);
            }
            message.recycle();
        }

        /* JADX WARN: Removed duplicated region for block: B:29:0x0073  */
        @Override // com.bytedance.bpea.transmit.delegate.BPEAHandler, android.os.Handler
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean sendMessageAtTime(android.os.Message r7, long r8) {
            /*
                r6 = this;
                java.lang.Runnable r1 = r7.getCallback()
                java.lang.Object r0 = com.bytedance.common.jato.gfx.DoFrameController.LJ
                if (r1 != r0) goto Lad
                boolean r0 = r6.dispatchDoframe(r7, r8)
                r5 = 1
                if (r0 == 0) goto L10
                return r5
            L10:
                int r3 = com.bytedance.common.jato.gfx.DoFrameController.LIZIZ
                r0 = 0
                r1 = 0
                switch(r3) {
                    case 1: goto L1d;
                    case 2: goto L22;
                    case 3: goto L29;
                    case 4: goto L8e;
                    case 5: goto L92;
                    case 6: goto L96;
                    case 7: goto L9e;
                    default: goto L18;
                }
            L18:
                boolean r0 = super.sendMessageAtTime(r7, r8)
                return r0
            L1d:
                boolean r0 = super.sendMessageAtTime(r7, r1)
                return r0
            L22:
                com.bytedance.common.jato.gfx.DoFrameController.LIZIZ = r0
                boolean r0 = super.sendMessageAtTime(r7, r1)
                return r0
            L29:
                android.os.MessageQueue r0 = X.C08IU.LIZ
                if (r0 != 0) goto L43
                android.os.Looper r0 = android.os.Looper.getMainLooper()
                if (r0 == 0) goto L43
                android.os.Looper r3 = android.os.Looper.getMainLooper()
                android.os.Looper r0 = android.os.Looper.myLooper()
                if (r3 != r0) goto L4a
                android.os.MessageQueue r0 = android.os.Looper.myQueue()
                X.C08IU.LIZ = r0
            L43:
                android.os.MessageQueue r4 = X.C08IU.LIZ
                java.lang.reflect.Field r0 = X.C08IU.LIZIZ
                if (r0 != 0) goto L6b
                goto L51
            L4a:
                android.os.MessageQueue r0 = r3.getQueue()
                X.C08IU.LIZ = r0
                goto L43
            L51:
                java.lang.String r0 = "android.os.MessageQueue"
                java.lang.Class r3 = java.lang.Class.forName(r0)     // Catch: java.lang.Exception -> L85
                java.lang.String r0 = "mMessages"
                java.lang.reflect.Field r0 = r3.getDeclaredField(r0)     // Catch: java.lang.Exception -> L85
                X.C08IU.LIZIZ = r0     // Catch: java.lang.Exception -> L85
                r0.setAccessible(r5)     // Catch: java.lang.Exception -> L85
                java.lang.reflect.Field r0 = X.C08IU.LIZIZ     // Catch: java.lang.Exception -> L85
                java.lang.Object r0 = r0.get(r4)     // Catch: java.lang.Exception -> L85
                android.os.Message r0 = (android.os.Message) r0     // Catch: java.lang.Exception -> L85
                goto L71
            L6b:
                java.lang.Object r0 = r0.get(r4)     // Catch: java.lang.Exception -> L80
                android.os.Message r0 = (android.os.Message) r0     // Catch: java.lang.Exception -> L80
            L71:
                if (r0 == 0) goto L89
                long r0 = r0.getWhen()
                long r0 = java.lang.Math.min(r0, r8)
                boolean r0 = super.sendMessageAtTime(r7, r0)
                return r0
            L80:
                r0 = move-exception
                com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
                goto L89
            L85:
                r0 = move-exception
                com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            L89:
                boolean r0 = super.sendMessageAtTime(r7, r1)
                return r0
            L8e:
                r6.dispatchMessageNow(r7, r0)
                return r5
            L92:
                r6.dispatchMessageNow(r7, r5)
                return r5
            L96:
                r0 = 500(0x1f4, double:2.47E-321)
                long r8 = r8 + r0
                boolean r0 = super.sendMessageAtTime(r7, r8)
                return r0
            L9e:
                X.08IT r0 = com.bytedance.common.jato.gfx.DoFrameController.LJIIIIZZ
                if (r0 == 0) goto La8
                boolean r0 = r0.LIZ(r6, r7, r8)
                if (r0 != 0) goto Lac
            La8:
                boolean r0 = super.sendMessageAtTime(r7, r8)
            Lac:
                return r0
            Lad:
                boolean r0 = super.sendMessageAtTime(r7, r8)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.common.jato.gfx.DoFrameController.ProxyFrameHandler.sendMessageAtTime(android.os.Message, long):boolean");
        }
    }

    public static void LIZ(C08IV c08iv) {
        if (C786410Ut5.u3() == Looper.getMainLooper().getThread()) {
            if (LJII == null) {
                LJII = new ArrayList<>();
            }
            LJII.add(c08iv);
            return;
        }
        throw new IllegalStateException("must call in main thread");
    }

    public static synchronized void LIZIZ(Choreographer choreographer, C08IS c08is) {
        if (LIZJ) {
            return;
        }
        try {
            Handler handler = (Handler) C1959307lv.LJ(choreographer, "mHandler");
            LIZLLL = handler;
            if (handler == null) {
                return;
            }
            LJ = C1959307lv.LJ(choreographer, "mDisplayEventReceiver");
            LJI = (Printer) C1959307lv.LJ(Looper.getMainLooper(), "mLogging");
            long jLIZJ = C1960507m7.LIZJ(C1959307lv.LIZJ(Choreographer.class, "mHandler"));
            ProxyFrameHandler proxyFrameHandler = LIZ;
            C1960507m7.LIZLLL(jLIZJ, choreographer, proxyFrameHandler);
            proxyFrameHandler.fillStr(LJ);
            Object objLJ = C1959307lv.LJ(choreographer, "mFrameInfo");
            if (objLJ != null) {
                if (Build.VERSION.SDK_INT >= 29) {
                    LJFF = (long[]) C1959307lv.LJ(objLJ, "frameInfo");
                } else {
                    LJFF = (long[]) C1959307lv.LJ(objLJ, "mFrameInfo");
                }
                if (LJFF == null) {
                    C08IS.LIZ(new IllegalStateException("frameArray"));
                }
            }
            LIZJ = true;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C08IS.LIZ(th);
        }
    }
}
