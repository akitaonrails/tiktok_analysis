package com.ss.android.ugc.aweme.nxet.vtree.v2;

import X.C098200Yq;
import X.C189200o6;
import X.C1C7U;
import X.C2188811AlT;
import X.C786410Ut5;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import android.os.Looper;
import android.os.Message;
import android.os.MessageQueue;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes24.dex */
public final class VTreeBuildManager$mainIdleSignal$1 implements MessageQueue.IdleHandler {
    public final List<Message> LL = new ArrayList();
    public boolean LLILLJJLI;
    public final VTreeBuildManager$mainIdleSignal$1$mainHandler$1 LLILLL;

    @Override // android.os.MessageQueue.IdleHandler
    public final boolean queueIdle() {
        removeMessages(2);
        for (Message message : (ArrayList) this.LL) {
            Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(LIZ(message.what));
            if (thM5exceptionOrNullimpl != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("handleMessage ");
                sbLIZ.append(message.what);
                sbLIZ.append(" ex: ");
                sbLIZ.append(thM5exceptionOrNullimpl);
                C2188811AlT.LIZIZ(sbLIZ);
            }
        }
        ((ArrayList) this.LL).clear();
        this.LLILLJJLI = false;
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.nxet.vtree.v2.VTreeBuildManager$mainIdleSignal$1$mainHandler$1] */
    public VTreeBuildManager$mainIdleSignal$1() {
        final Looper mainLooper = Looper.getMainLooper();
        this.LLILLL = new BPEAHandler(mainLooper) { // from class: com.ss.android.ugc.aweme.nxet.vtree.v2.VTreeBuildManager$mainIdleSignal$1$mainHandler$1
            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                C1C7U.LIZ("VTreeBuildManager@cf12.mainIdleSignal$1$mainHandler$1");
                if (message.what == 2) {
                    VTreeBuildManager$mainIdleSignal$1 vTreeBuildManager$mainIdleSignal$1 = this.LL;
                    vTreeBuildManager$mainIdleSignal$1.getClass();
                    Looper.getMainLooper().getQueue().removeIdleHandler(vTreeBuildManager$mainIdleSignal$1);
                    this.LL.queueIdle();
                }
                C1C7U.LIZIZ("VTreeBuildManager@cf12.mainIdleSignal$1$mainHandler$1");
            }
        };
    }

    public static Object LIZ(int i) {
        try {
            if (i != 0) {
                if (i == 1) {
                    boolean zLIZ = ViewOnAttachStateChangeListenerC1846530y9T.LIZ();
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("checkViewChange needBuildTree: ");
                    sbLIZ.append(zLIZ);
                    C2188811AlT.LIZIZ(sbLIZ);
                    if (zLIZ) {
                        VTreeBuildManager.LJIIL(false);
                    }
                }
            } else {
                VTreeBuildManager.LJIIJJI();
            }
            Unit unit = Unit.LIZ;
            C189200o6.m2constructorimpl(unit);
            return unit;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C098200Yq c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
            return c098200Yq;
        }
    }

    public final void LIZIZ(int i) {
        Iterator<Message> it2 = this.LL.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Message next = it2.next();
            if (next.what == i) {
                if (next != null) {
                    return;
                }
            }
        }
        Message messageObtain = Message.obtain();
        messageObtain.what = i;
        if (!this.LLILLJJLI) {
            this.LLILLJJLI = true;
            VTreeBuildManager$mainIdleSignal$1$mainHandler$1 vTreeBuildManager$mainIdleSignal$1$mainHandler$1 = this.LLILLL;
            Message messageObtain2 = Message.obtain();
            messageObtain2.what = 2;
            vTreeBuildManager$mainIdleSignal$1$mainHandler$1.sendMessageDelayed(messageObtain2, 100L);
            C786410Ut5.f3(this, getLooper().getQueue());
        }
        ((ArrayList) this.LL).add(messageObtain);
    }
}
