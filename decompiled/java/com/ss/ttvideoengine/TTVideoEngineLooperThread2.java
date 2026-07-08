package com.ss.ttvideoengine;

import X.C1467470oI5;
import X.C1468940oKS;
import X.C1470240oMY;
import X.C1471660oOq;
import X.C1C7U;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C786410Ut5;
import X.InterfaceC1467760oIY;
import X.InterfaceC1467780oIa;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.Parcel;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.bytex.pthread.base.convergence.hook.ThreadMethodProxy;
import com.ss.ttvideoengine.utils.TTVideoEngineLog;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes24.dex */
public final class TTVideoEngineLooperThread2 {
    public HandlerThread LIZ;
    public MessageHandler LIZIZ;
    public Lock LIZJ;
    public Parcel LIZLLL;
    public Handler LJ;
    public Lock LJFF;
    public Parcel LJI;
    public boolean LJII;
    public List<Condition> LJIIIIZZ;
    public final C1468940oKS LJIIIZ;
    public boolean LJIIJ;
    public boolean LJIIJJI;

    public final boolean LIZIZ() {
        if (this.LIZIZ == null) {
            return false;
        }
        Handler handler = this.LJ;
        if (handler != null && handler.getLooper() != null && this.LJ.getLooper().getThread() != null && !ThreadMethodProxy.isAlive(this.LJ.getLooper().getThread())) {
            int i = C2187451AjH.LIZ;
            TTVideoEngineLog.w("TTVideoEngineLooperThread", "main looper thread is not alive, return false");
            return false;
        }
        Looper looperMyLooper = Looper.myLooper() != null ? Looper.myLooper() : Looper.getMainLooper();
        Handler handler2 = this.LJ;
        if (handler2 != null && handler2.getLooper() != looperMyLooper) {
            return true;
        }
        if (this.LJ != null) {
            int i2 = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("mainHandler looper:");
            sbLIZ.append(this.LJ.getLooper());
            TTVideoEngineLog.d("TTVideoEngineLooperThread", C2188811AlT.LIZIZ(sbLIZ));
        }
        return false;
    }

    public class MessageHandler extends BPEAHandler {
        public final WeakReference<C1468940oKS> LL;

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:53:0x0119  */
        /* JADX WARN: Type inference failed for: r0v59, types: [android.os.Parcel] */
        /* JADX WARN: Type inference failed for: r4v1 */
        /* JADX WARN: Type inference failed for: r4v3 */
        /* JADX WARN: Type inference failed for: r4v4, types: [int] */
        /* JADX WARN: Type inference failed for: r4v5 */
        @Override // android.os.Handler
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void handleMessage(android.os.Message r16) {
            /*
                Method dump skipped, instruction units count: 592
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.ttvideoengine.TTVideoEngineLooperThread2.MessageHandler.handleMessage(android.os.Message):void");
        }

        public MessageHandler(C1468940oKS c1468940oKS, Looper looper) {
            super(looper);
            this.LL = new WeakReference<>(c1468940oKS);
        }
    }

    public class MyMainLooperHandler extends BPEAHandler {
        public final WeakReference<C1468940oKS> LL;

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            Condition condition;
            C1C7U.LIZ("TTVideoEngineLooperThread2$MyMainLooperHandler@588f.handleMessage");
            C1468940oKS c1468940oKS = this.LL.get();
            if (c1468940oKS == null) {
                int i = C2187451AjH.LIZ;
                TTVideoEngineLog.w("TTVideoEngineLooperThread", "engine is null, return.");
                C1C7U.LIZIZ("TTVideoEngineLooperThread2$MyMainLooperHandler@588f.handleMessage");
                return;
            }
            Object obj = null;
            if (HandlerHook.getMessageObj(message.obj) != null) {
                Map map = (Map) HandlerHook.getMessageObj(message.obj);
                if (map.containsKey("msgCond")) {
                    condition = (Condition) map.get("msgCond");
                } else {
                    condition = null;
                }
                if (map.containsKey("paramObj")) {
                    obj = map.get("paramObj");
                }
            } else {
                condition = null;
            }
            int i2 = message.what;
            if (i2 != 406) {
                if (i2 != 415) {
                    if (i2 != 422) {
                        if (i2 != 411) {
                            if (i2 != 412) {
                                int i3 = C2187451AjH.LIZ;
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("unknown message: ");
                                sbLIZ.append(message.what);
                                TTVideoEngineLog.w("TTVideoEngineLooperThread", C2188811AlT.LIZIZ(sbLIZ));
                            } else {
                                InterfaceC1467780oIa interfaceC1467780oIa = c1468940oKS.LLLLZLL;
                                if (interfaceC1467780oIa != null) {
                                    interfaceC1467780oIa.LJJJIL((C1467470oI5) obj);
                                }
                            }
                        } else {
                            C1470240oMY c1470240oMY = (C1470240oMY) obj;
                            InterfaceC1467760oIY interfaceC1467760oIY = c1468940oKS.LLLLZIL;
                            if (interfaceC1467760oIY != null) {
                                boolean zLJJIIZI = interfaceC1467760oIY.LJJIIZI(c1470240oMY);
                                TTVideoEngineLooperThread2.this.LJI.setDataPosition(0);
                                TTVideoEngineLooperThread2.this.LJI.writeInt(zLJJIIZI ? 1 : 0);
                            }
                        }
                    } else if (obj instanceof String) {
                        String str = (String) obj;
                        if (!str.equals(c1468940oKS.LJLIIL.LJIL)) {
                            int i4 = C2187451AjH.LIZ;
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("MSG_NOTIFY_VIDEO_SECOND_FRAME engine:");
                            sbLIZ2.append(c1468940oKS);
                            sbLIZ2.append(", traceId not same, should be:");
                            sbLIZ2.append(str);
                            sbLIZ2.append(", now:");
                            sbLIZ2.append(c1468940oKS.LJLIIL.LJIL);
                            TTVideoEngineLog.w("TTVideoEngineLooperThread", C2188811AlT.LIZIZ(sbLIZ2));
                        } else {
                            c1468940oKS.LLLLLZL.LJIIIIZZ(c1468940oKS.y5);
                        }
                    }
                } else if (obj instanceof Map) {
                    Map map2 = (Map) obj;
                    int iIntValue = ((Integer) map2.get("bufferStartAction")).intValue();
                    String str2 = (String) map2.get("traceid");
                    if (str2 != c1468940oKS.LJLIIL.LJIL) {
                        int i5 = C2187451AjH.LIZ;
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("MSG_NOTIFY_BUFFER_START engine:");
                        sbLIZ3.append(c1468940oKS);
                        sbLIZ3.append(", traceId not same, should be:");
                        sbLIZ3.append(str2);
                        sbLIZ3.append(", now:");
                        sbLIZ3.append(c1468940oKS.LJLIIL.LJIL);
                        TTVideoEngineLog.w("TTVideoEngineLooperThread", C2188811AlT.LIZIZ(sbLIZ3));
                    } else {
                        c1468940oKS.LLLLLZL.LJJJLIIL(message.arg1, message.arg2, iIntValue);
                    }
                }
            } else if (obj instanceof String) {
                String str3 = (String) obj;
                if (!str3.equals(c1468940oKS.LJLIIL.LJIL)) {
                    int i6 = C2187451AjH.LIZ;
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append("MSG_NOTIFY_RENDER_START engine:");
                    sbLIZ4.append(c1468940oKS);
                    sbLIZ4.append(", traceId not same, should be:");
                    sbLIZ4.append(str3);
                    sbLIZ4.append(", now:");
                    sbLIZ4.append(c1468940oKS.LJLIIL.LJIL);
                    TTVideoEngineLog.w("TTVideoEngineLooperThread", C2188811AlT.LIZIZ(sbLIZ4));
                } else {
                    c1468940oKS.LLLLLZL.LJ(c1468940oKS.y5);
                }
            }
            Lock lock = TTVideoEngineLooperThread2.this.LJFF;
            if (condition != null) {
                ReentrantLock reentrantLock = (ReentrantLock) lock;
                reentrantLock.lock();
                condition.signal();
                reentrantLock.unlock();
            }
            C1C7U.LIZIZ("TTVideoEngineLooperThread2$MyMainLooperHandler@588f.handleMessage");
        }

        public MyMainLooperHandler(C1468940oKS c1468940oKS, Looper looper) {
            super(looper);
            this.LL = new WeakReference<>(c1468940oKS);
        }
    }

    public TTVideoEngineLooperThread2(C1468940oKS c1468940oKS) {
        this.LJIIIZ = c1468940oKS;
    }

    public final boolean LIZ(boolean z) {
        if (this.LJII && z) {
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("mIsHandlingMainMsg return false, thread:");
            sbLIZ.append(Looper.myLooper().getThread());
            C1471660oOq.LIZJ("TTVideoEngineLooperThread", C2188811AlT.LIZIZ(sbLIZ));
            return false;
        }
        Lock lock = this.LIZJ;
        if (lock != null) {
            ((ReentrantLock) lock).lock();
            if (this.LIZIZ != null && Looper.myLooper() != this.LIZIZ.getLooper()) {
                ((ReentrantLock) this.LIZJ).unlock();
                return true;
            }
            ((ReentrantLock) this.LIZJ).unlock();
        }
        return false;
    }

    public final void LJ(Runnable runnable) {
        MessageHandler messageHandler;
        if (LIZ(false)) {
            if (this.LJIIIZ.LJLIIL.LIZIZ != 5 && (messageHandler = this.LIZIZ) != null) {
                C786410Ut5.LJJZZIII(messageHandler, runnable);
                return;
            }
            return;
        }
        runnable.run();
    }

    public final void LJFF(Runnable runnable) {
        Handler handler;
        if (LIZIZ()) {
            if (this.LJIIIZ.LJLIIL.LIZIZ != 5 && (handler = this.LJ) != null) {
                C786410Ut5.LJJZZIII(handler, runnable);
                return;
            }
            return;
        }
        runnable.run();
    }

    public final void LIZJ(int i, Object obj) {
        MessageHandler messageHandler;
        if (this.LJIIIZ.LJLIIL.LIZIZ != 5 && (messageHandler = this.LIZIZ) != null) {
            HashMap map = new HashMap();
            map.put("paramObj", obj);
            Message messageObtainMessage = messageHandler.obtainMessage(i, 0, 0);
            messageObtainMessage.obj = map;
            messageObtainMessage.sendToTarget();
        }
    }

    public final boolean LJI(int i, long j, Object obj) {
        MessageHandler messageHandler;
        boolean z = false;
        if (this.LJIIIZ.LJLIIL.LIZIZ == 5 || (messageHandler = this.LIZIZ) == null || this.LIZJ == null) {
            return false;
        }
        HashMap map = new HashMap();
        Condition conditionNewCondition = ((ReentrantLock) this.LIZJ).newCondition();
        Message messageObtainMessage = messageHandler.obtainMessage(i, 0, 0);
        map.put("paramObj", obj);
        map.put("msgCond", conditionNewCondition);
        boolean z2 = true;
        try {
            try {
                ((ReentrantLock) this.LIZJ).lock();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                ((ArrayList) this.LJIIIIZZ).remove(conditionNewCondition);
                ((ReentrantLock) this.LIZJ).unlock();
                throw th;
            }
        } catch (InterruptedException e) {
            e = e;
        }
        if (this.LJIIIZ.LJLIIL.LIZIZ != 5) {
            ((ArrayList) this.LJIIIIZZ).add(conditionNewCondition);
            messageObtainMessage.obj = map;
            messageObtainMessage.sendToTarget();
            if (j > 0) {
                if (!conditionNewCondition.await(j, TimeUnit.MILLISECONDS)) {
                    try {
                        if (messageHandler.hasMessages(i)) {
                            int i2 = C2187451AjH.LIZ;
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("handle message ");
                            sbLIZ.append(i);
                            sbLIZ.append(" timeout ");
                            sbLIZ.append(j);
                            C1471660oOq.LIZJ("TTVideoEngineLooperThread", C2188811AlT.LIZIZ(sbLIZ));
                            messageHandler.removeMessages(i);
                            z2 = false;
                        }
                    } catch (InterruptedException e2) {
                        e = e2;
                        z2 = false;
                        TryCatchGuardChecker.doCheck(e);
                        if (this.LJIIIZ.LJLIIL.LIZIZ != 5) {
                        }
                        ((ArrayList) this.LJIIIIZZ).remove(conditionNewCondition);
                        ((ReentrantLock) this.LIZJ).unlock();
                        return z;
                    }
                }
            } else {
                conditionNewCondition.await();
            }
            if (this.LJIIIZ.LJLIIL.LIZIZ != 5) {
                z = z2;
            }
        }
        ((ArrayList) this.LJIIIIZZ).remove(conditionNewCondition);
        ((ReentrantLock) this.LIZJ).unlock();
        return z;
    }

    public final void LIZLLL(int i, int i2, int i3, Object obj) {
        if (this.LJ != null) {
            HashMap map = new HashMap();
            map.put("paramObj", obj);
            Message messageObtainMessage = this.LJ.obtainMessage(i, i2, i3);
            messageObtainMessage.obj = map;
            messageObtainMessage.sendToTarget();
        }
    }
}
