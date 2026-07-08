package com.bytedance.platform.horae.java_impl.barrier;

import X.AnonymousClass0887;
import X.AnonymousClass0888;
import X.C0WZX;
import X.C1958407lm;
import X.C1963407ma;
import X.C1963507mb;
import X.C1964507ml;
import X.C1C7U;
import X.C2188811AlT;
import X.C2204961BRm;
import android.os.Looper;
import android.os.Message;
import android.os.MessageQueue;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class BarrierMonitor {
    public static final BarrierMonitor LIZLLL = new BarrierMonitor();
    public static Method LJ;
    public static Object LJFF;
    public static MessageQueue LJI;
    public static Field LJII;
    public static Field LJIIIIZZ;
    public static Field LJIIIZ;
    public static Field LJIIJ;
    public static Field LJIIJJI;
    public int LIZ;
    public int LIZIZ = -1;
    public BarrierHandler LIZJ;

    public final void LIZIZ() {
        Method methodLIZ;
        try {
            if (LJI == null || LJII == null || LJIIIIZZ == null || LJFF == null || LJIIIZ == null || LJIIJ == null || LJIIJJI == null) {
                LJI = (MessageQueue) C1963407ma.LIZ(Looper.class, "mQueue").get(Looper.getMainLooper());
                LJII = C1963407ma.LIZ(MessageQueue.class, "mMessages");
                LJIIIIZZ = C1963407ma.LIZ(MessageQueue.class, "mNextBarrierToken");
                Object objLIZIZ = C1964507ml.LIZIZ(Class.forName("android.view.WindowManagerGlobal"), "getInstance", new Object[0]);
                LJFF = objLIZIZ;
                LJIIIZ = C1963407ma.LIZ(objLIZIZ.getClass(), "mRoots");
                LJIIJ = C1963407ma.LIZ(Class.forName("android.view.ViewRootImpl"), "mTraversalBarrier");
                LJIIJJI = C1963407ma.LIZ(Message.class, "next");
                AnonymousClass0888.LIZIZ(AnonymousClass0887.INFO);
            }
            if (LJ == null) {
                Class[] clsArr = {Integer.TYPE};
                if (C1963507mb.LIZ()) {
                    try {
                        methodLIZ = C1958407lm.LIZ(MessageQueue.class, "removeSyncBarrier", clsArr);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        methodLIZ = null;
                    }
                } else {
                    methodLIZ = C1964507ml.LIZ(MessageQueue.class, "removeSyncBarrier", clsArr);
                }
                LJ = methodLIZ;
            }
            if (this.LIZJ == null) {
                this.LIZJ = new BarrierHandler(Looper.getMainLooper());
            }
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
        }
    }

    public class BarrierHandler extends BPEAHandler {
        public BarrierHandler(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) throws Throwable {
            C1C7U.LIZ("BarrierMonitor$BarrierHandler@6eb8.handleMessage");
            super.handleMessage(message);
            if (message.what == 1001) {
                try {
                    C2204961BRm.a0(BarrierMonitor.LJ, BarrierMonitor.LJI, new Object[]{Integer.valueOf(message.arg1)}, new C0WZX("dzBzEgAjS8/YVFkiQFyUajCVf5LEaLPGXpKJLSCaBvL6F2rDOTtqei9Th22fr+CmvWc0H1r5v6TwQJ12wg==", null));
                    AnonymousClass0888.LIZIZ(AnonymousClass0887.WARNING);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    e.toString();
                    AnonymousClass0888.LIZIZ(AnonymousClass0887.WARNING);
                }
            }
            C1C7U.LIZIZ("BarrierMonitor$BarrierHandler@6eb8.handleMessage");
        }
    }

    public static int LIZ(int i) throws IllegalAccessException {
        Object obj = LJIIIZ.get(LJFF);
        if (obj instanceof ArrayList) {
            ArrayList arrayList = (ArrayList) obj;
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                Object obj2 = ListProtector.get(arrayList, i2);
                if (((Integer) LJIIJ.get(obj2)).intValue() == i) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("mTraversalBarrier == token : for viewRoot:");
                    sbLIZ.append(obj2);
                    C2188811AlT.LIZIZ(sbLIZ);
                    AnonymousClass0888.LIZIZ(AnonymousClass0887.DEBUG);
                    return -1;
                }
            }
            return 0;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(" mRoots type is:");
        sbLIZ2.append(obj);
        C2188811AlT.LIZIZ(sbLIZ2);
        AnonymousClass0888.LIZ();
        return -1;
    }

    public final int LIZJ(WeakReference<Message> weakReference) {
        try {
            Message message = weakReference.get();
            ArrayList arrayList = new ArrayList();
            Message message2 = message;
            int i = -1;
            for (int i2 = 0; message2 != null && i2 < 5 && message2.getTarget() == null; i2++) {
                int i3 = message2.arg1;
                if (i3 < 0) {
                    break;
                }
                if (i3 > 0) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("barrier message:");
                    sbLIZ.append(message2);
                    sbLIZ.append(" getWhen:");
                    sbLIZ.append(message2.getWhen());
                    C2188811AlT.LIZIZ(sbLIZ);
                    AnonymousClass0888.LIZIZ(AnonymousClass0887.DEBUG);
                }
                i = message2.arg1;
                arrayList.add(Integer.valueOf(i));
                message2 = (Message) LJIIJJI.get(message2);
            }
            int size = arrayList.size();
            if (size > 0) {
                int i4 = 0;
                while (LIZ(((Integer) arrayList.get(i4)).intValue()) >= 0) {
                    i4++;
                    if (i4 >= size) {
                        if (this.LIZIZ != i) {
                            this.LIZ = 0;
                            this.LIZIZ = i;
                        }
                        int iIntValue = ((Integer) LJIIIIZZ.get(LJI)).intValue();
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("last barrier message token:");
                        sbLIZ2.append(i);
                        sbLIZ2.append(" MessageQueue::mNextBarrierToken:");
                        sbLIZ2.append(iIntValue);
                        C2188811AlT.LIZIZ(sbLIZ2);
                        AnonymousClass0887 anonymousClass0887 = AnonymousClass0887.INFO;
                        AnonymousClass0888.LIZIZ(anonymousClass0887);
                        if (i < iIntValue) {
                            this.LIZ++;
                        }
                        if (this.LIZ < 2) {
                            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                            sbLIZ3.append("token < mNextBarrierToken try again,mCheckTime:");
                            sbLIZ3.append(this.LIZ);
                            C2188811AlT.LIZIZ(sbLIZ3);
                            AnonymousClass0888.LIZIZ(anonymousClass0887);
                            return -1;
                        }
                        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                        sbLIZ4.append("firstMsg:");
                        sbLIZ4.append(message);
                        C2188811AlT.LIZIZ(sbLIZ4);
                        AnonymousClass0888.LIZIZ(AnonymousClass0887.WARNING);
                        this.LIZJ.removeMessages(1001);
                        int i5 = -1;
                        int i6 = 0;
                        do {
                            int iIntValue2 = ((Integer) arrayList.get(i6)).intValue();
                            if (iIntValue2 < iIntValue) {
                                Message messageObtainMessage = this.LIZJ.obtainMessage(1001, iIntValue2, 0);
                                messageObtainMessage.setAsynchronous(true);
                                this.LIZJ.sendMessage(messageObtainMessage);
                                i5 = iIntValue2;
                            }
                            i6++;
                        } while (i6 < size);
                        this.LIZ = 0;
                        this.LIZIZ = -1;
                        return i5;
                    }
                }
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            AnonymousClass0888.LIZIZ(AnonymousClass0887.WARNING);
        }
        return -1;
    }
}
