package com.ss.android.ugc.aweme.innerpush.core;

import X.C01GW;
import X.C19290510dT;
import X.C19329910jp;
import X.C19330110jr;
import X.C19330710jx;
import X.C19331310k3;
import X.C1C7U;
import X.C20641015po;
import X.C20666215ts;
import X.C2188811AlT;
import X.C2214201BlK;
import X.C452501pT;
import X.InterfaceC2385309Wh;
import android.os.Looper;
import android.os.Message;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushMessage;
import com.ss.android.ugc.aweme.innerpush.core.InnerPushQueueLooper;
import com.tts.oecverify.BdTuring;
import java.util.PriorityQueue;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS217S0000000_28;

/* JADX INFO: loaded from: classes29.dex */
public final class InnerPushQueueLooper extends BPEAHandler {
    public static final InnerPushQueueLooper LL = new InnerPushQueueLooper();
    public static final C01GW LLILLJJLI = C452501pT.LIZIZ(new C20641015po());
    public static volatile boolean LLILLL;

    public static PriorityQueue LJII() {
        return (PriorityQueue) LLILLJJLI.getValue();
    }

    public InnerPushQueueLooper() {
        super(Looper.getMainLooper());
    }

    public static void LJ(InnerPushMessage innerPushMessage) {
        innerPushMessage.getTracker().LJJII = 0L;
        innerPushMessage.getTracker().LJJIII = 0L;
        innerPushMessage.getTracker().LJJIIJ = 0L;
        innerPushMessage.getTracker().LJJIIJZLJL = 0L;
        innerPushMessage.getTracker().LJJIIZ = 0L;
        innerPushMessage.getTracker().LJJIIZI = 0L;
        innerPushMessage.getTracker().LJJIJIIJI = 0L;
        innerPushMessage.getTracker().LJJIJIIJIL = 0L;
        innerPushMessage.getTracker().LJJIJ = 0L;
    }

    public static void LJIIIIZZ(InnerPushMessage innerPushMessage) {
        if (innerPushMessage.getTracker().LJJII > 0) {
            C20666215ts tracker = innerPushMessage.getTracker();
            long j = tracker.LJJIJL;
            C19329910jp.LIZ.getClass();
            tracker.LJJIJL = j + (System.currentTimeMillis() - innerPushMessage.getTracker().LJJII);
        } else if (innerPushMessage.getTracker().LJJIII > 0) {
            C20666215ts tracker2 = innerPushMessage.getTracker();
            long j2 = tracker2.LJJIJLIJ;
            C19329910jp.LIZ.getClass();
            tracker2.LJJIJLIJ = j2 + (System.currentTimeMillis() - innerPushMessage.getTracker().LJJIII);
        } else if (innerPushMessage.getTracker().LJJIIJ > 0) {
            C20666215ts tracker3 = innerPushMessage.getTracker();
            long j3 = tracker3.LJJIL;
            C19329910jp.LIZ.getClass();
            tracker3.LJJIL = j3 + (System.currentTimeMillis() - innerPushMessage.getTracker().LJJIIJ);
        } else if (innerPushMessage.getTracker().LJJIIJZLJL > 0) {
            C20666215ts tracker4 = innerPushMessage.getTracker();
            long j4 = tracker4.LJJIZ;
            C19329910jp.LIZ.getClass();
            tracker4.LJJIZ = j4 + (System.currentTimeMillis() - innerPushMessage.getTracker().LJJIIJZLJL);
        } else if (innerPushMessage.getTracker().LJJIIZ > 0) {
            C20666215ts tracker5 = innerPushMessage.getTracker();
            long j5 = tracker5.LJJJ;
            C19329910jp.LIZ.getClass();
            tracker5.LJJJ = j5 + (System.currentTimeMillis() - innerPushMessage.getTracker().LJJIIZ);
        } else if (innerPushMessage.getTracker().LJJIIZI > 0) {
            C20666215ts tracker6 = innerPushMessage.getTracker();
            long j6 = tracker6.LJJJI;
            C19329910jp.LIZ.getClass();
            tracker6.LJJJI = j6 + (System.currentTimeMillis() - innerPushMessage.getTracker().LJJIIZI);
        } else if (innerPushMessage.getTracker().LJJIJ > 0) {
            C20666215ts tracker7 = innerPushMessage.getTracker();
            long j7 = tracker7.LJJJIL;
            C19329910jp.LIZ.getClass();
            tracker7.LJJJIL = j7 + (System.currentTimeMillis() - innerPushMessage.getTracker().LJJIJ);
        } else if (innerPushMessage.getTracker().LJJIJIIJI > 0) {
            C20666215ts tracker8 = innerPushMessage.getTracker();
            long j8 = tracker8.LJJJJ;
            C19329910jp.LIZ.getClass();
            tracker8.LJJJJ = j8 + (System.currentTimeMillis() - innerPushMessage.getTracker().LJJIJIIJI);
        } else if (innerPushMessage.getTracker().LJJIJIIJIL > 0) {
            C20666215ts tracker9 = innerPushMessage.getTracker();
            long j9 = tracker9.LJJJJI;
            C19329910jp.LIZ.getClass();
            tracker9.LJJJJI = j9 + (System.currentTimeMillis() - innerPushMessage.getTracker().LJJIJIIJIL);
        }
        LJ(innerPushMessage);
        C19330110jr.LIZ.getClass();
        switch (C19330710jx.LIZ[C19330110jr.LJIIIZ(innerPushMessage).ordinal()]) {
            case 1:
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("handleMessageLatencyMob message:");
                sbLIZ.append(innerPushMessage);
                sbLIZ.append(" LIVE");
                C19290510dT.LIZLLL("InnerPushQueueLooper", C2188811AlT.LIZIZ(sbLIZ));
                C20666215ts tracker10 = innerPushMessage.getTracker();
                C19329910jp.LIZ.getClass();
                tracker10.LJJII = System.currentTimeMillis();
                break;
            case 2:
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("handleMessageLatencyMob message:");
                sbLIZ2.append(innerPushMessage);
                sbLIZ2.append(" SHOOTING");
                C19290510dT.LIZLLL("InnerPushQueueLooper", C2188811AlT.LIZIZ(sbLIZ2));
                C20666215ts tracker11 = innerPushMessage.getTracker();
                C19329910jp.LIZ.getClass();
                tracker11.LJJIII = System.currentTimeMillis();
                break;
            case 3:
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("handleMessageLatencyMob message:");
                sbLIZ3.append(innerPushMessage);
                sbLIZ3.append(" ALBUM");
                C19290510dT.LIZLLL("InnerPushQueueLooper", C2188811AlT.LIZIZ(sbLIZ3));
                C20666215ts tracker12 = innerPushMessage.getTracker();
                C19329910jp.LIZ.getClass();
                tracker12.LJJIIJ = System.currentTimeMillis();
                break;
            case 4:
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("handleMessageLatencyMob message:");
                sbLIZ4.append(innerPushMessage);
                sbLIZ4.append(" KEYBOARD");
                C19290510dT.LIZLLL("InnerPushQueueLooper", C2188811AlT.LIZIZ(sbLIZ4));
                C20666215ts tracker13 = innerPushMessage.getTracker();
                C19329910jp.LIZ.getClass();
                tracker13.LJJIIJZLJL = System.currentTimeMillis();
                break;
            case 5:
                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                sbLIZ5.append("handleMessageLatencyMob message:");
                sbLIZ5.append(innerPushMessage);
                sbLIZ5.append(" COMMERCEAD");
                C19290510dT.LIZLLL("InnerPushQueueLooper", C2188811AlT.LIZIZ(sbLIZ5));
                C20666215ts tracker14 = innerPushMessage.getTracker();
                C19329910jp.LIZ.getClass();
                tracker14.LJJIIZ = System.currentTimeMillis();
                break;
            case 6:
                StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                sbLIZ6.append("handleMessageLatencyMob message:");
                sbLIZ6.append(innerPushMessage);
                sbLIZ6.append(" POPUP_WINDOW");
                C19290510dT.LIZLLL("InnerPushQueueLooper", C2188811AlT.LIZIZ(sbLIZ6));
                C20666215ts tracker15 = innerPushMessage.getTracker();
                C19329910jp.LIZ.getClass();
                tracker15.LJJIIZI = System.currentTimeMillis();
                break;
            case 7:
                StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                sbLIZ7.append("handleMessageLatencyMob message:");
                sbLIZ7.append(innerPushMessage);
                sbLIZ7.append(" EXTERNAL_HANDLER");
                C19290510dT.LIZLLL("InnerPushQueueLooper", C2188811AlT.LIZIZ(sbLIZ7));
                C20666215ts tracker16 = innerPushMessage.getTracker();
                C19329910jp.LIZ.getClass();
                tracker16.LJJIJIIJI = System.currentTimeMillis();
                break;
            case 8:
                StringBuilder sbLIZ8 = C2188811AlT.LIZ();
                sbLIZ8.append("handleMessageLatencyMob message:");
                sbLIZ8.append(innerPushMessage);
                sbLIZ8.append(" LANDSCAPE_ORIENTATION");
                C19290510dT.LIZLLL("InnerPushQueueLooper", C2188811AlT.LIZIZ(sbLIZ8));
                C20666215ts tracker17 = innerPushMessage.getTracker();
                C19329910jp.LIZ.getClass();
                tracker17.LJJIJIIJIL = System.currentTimeMillis();
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                StringBuilder sbLIZ9 = C2188811AlT.LIZ();
                sbLIZ9.append("handleMessageLatencyMob message:");
                sbLIZ9.append(innerPushMessage);
                sbLIZ9.append(" CONNECT_NOW");
                C19290510dT.LIZLLL("InnerPushQueueLooper", C2188811AlT.LIZIZ(sbLIZ9));
                C20666215ts tracker18 = innerPushMessage.getTracker();
                C19329910jp.LIZ.getClass();
                tracker18.LJJIJ = System.currentTimeMillis();
                break;
            default:
                LJ(innerPushMessage);
                break;
        }
    }

    public final void LJIIIZ(boolean z) {
        if (!LLILLL && !hasMessages(1) && !LJII().isEmpty()) {
            if (InnerPushManager.INSTANCE.isPureMode()) {
                C19290510dT.LIZLLL("InnerPushQueueLooper", "[notifyLoop], pure mode is on, force stop looping");
                return;
            }
            InnerPushMessage innerPushMessage = (InnerPushMessage) LJII().peek();
            long j = 0;
            if (innerPushMessage != null) {
                if (innerPushMessage.getTracker().LJJIFFI > 0) {
                    C20666215ts tracker = innerPushMessage.getTracker();
                    long j2 = tracker.LJJIJIL;
                    C19329910jp.LIZ.getClass();
                    tracker.LJJIJIL = j2 + (System.currentTimeMillis() - innerPushMessage.getTracker().LJJIFFI);
                }
                innerPushMessage.getTracker().LJJIFFI = 0L;
            }
            if (C2214201BlK.LJIIJJI) {
                if (innerPushMessage != null) {
                    C20666215ts tracker2 = innerPushMessage.getTracker();
                    C19329910jp.LIZ.getClass();
                    tracker2.LJJIFFI = System.currentTimeMillis();
                    LL.getClass();
                    LJ(innerPushMessage);
                    return;
                }
                return;
            }
            if (!z) {
                j = 1000;
            }
            sendEmptyMessageDelayed(1, j);
        }
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        C1C7U.LIZ("InnerPushQueueLooper@7abe.handleMessage");
        removeMessages(1);
        LLILLL = true;
        C19331310k3.LJIIJ(AFwS217S0000000_28.get$arr$(1)).LIZLLL(new InterfaceC2385309Wh() { // from class: X.15pl
            @Override // X.InterfaceC2385309Wh
            public final Object then(C15O7 c15o7) {
                C1C7U.LIZ("InnerPushQueueLooper@7abe.loopInSerial$2");
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("loop end, queue:");
                InnerPushQueueLooper innerPushQueueLooper = InnerPushQueueLooper.LL;
                innerPushQueueLooper.getClass();
                sbLIZ.append(InnerPushQueueLooper.LJII().size());
                C19290510dT.LIZLLL("InnerPushQueueLooper", C2188811AlT.LIZIZ(sbLIZ));
                InnerPushQueueLooper.LLILLL = false;
                innerPushQueueLooper.LJIIIZ(false);
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("InnerPushQueueLooper@7abe.loopInSerial$2");
                return unit;
            }
        });
        C1C7U.LIZIZ("InnerPushQueueLooper@7abe.handleMessage");
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x014c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJFF(com.ss.android.ugc.aweme.innerpush.core.InnerPushQueueLooper r9, com.ss.android.ugc.aweme.innerpush.api.model.InnerPushMessage r10, int r11) {
        /*
            Method dump skipped, instruction units count: 380
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.innerpush.core.InnerPushQueueLooper.LJFF(com.ss.android.ugc.aweme.innerpush.core.InnerPushQueueLooper, com.ss.android.ugc.aweme.innerpush.api.model.InnerPushMessage, int):void");
    }
}
