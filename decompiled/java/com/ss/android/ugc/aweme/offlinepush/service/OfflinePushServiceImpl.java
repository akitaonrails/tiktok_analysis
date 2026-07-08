package com.ss.android.ugc.aweme.offlinepush.service;

import X.C098200Yq;
import X.C09JN;
import X.C0BZR;
import X.C0VI1;
import X.C0VQ7;
import X.C0VQA;
import X.C10I8;
import X.C10I9;
import X.C10IC;
import X.C10ID;
import X.C10IF;
import X.C10IG;
import X.C10IK;
import X.C10IL;
import X.C10IM;
import X.C1226404r0;
import X.C1566300qrU;
import X.C1575050r5b;
import X.C1575100r5g;
import X.C1576970r8h;
import X.C189200o6;
import X.C1906580ziK;
import X.C19319410i8;
import X.C1EE1;
import X.C2188811AlT;
import X.C816090Vzr;
import X.C844470XAv;
import X.InterfaceC625970Ogt;
import android.content.Intent;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.network.spi.INetworkStateService;
import com.ss.android.ugc.aweme.offlinepush.api.IOfflinePushService;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS213S0000000_24;
import kotlin.jvm.internal.AFwS217S0000000_28;
import kotlin.jvm.internal.AwS16S1001000_9;
import kotlin.jvm.internal.AwS27S2000000_2;
import kotlin.jvm.internal.AwS4S0001100_13;
import kotlin.jvm.internal.AwS87S1000000_2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes29.dex */
public final class OfflinePushServiceImpl implements IOfflinePushService {
    public final C19319410i8 LIZ = new C19319410i8("push_Service");

    @Override // com.ss.android.ugc.aweme.offlinepush.api.IOfflinePushService
    public final void LIZIZ() {
        if (C0BZR.LIZ()) {
            this.LIZ.LJIIJJI(AFwS217S0000000_28.get$arr$(319));
            Iterator<Integer> it2 = C1226404r0.LIZ.iterator();
            while (it2.hasNext()) {
                C10ID.LJIIIIZZ(it2.next().intValue(), 0L);
            }
            C0VQ7.LIZ.getClass();
            C0VQ7.LIZ(1);
            C0VQ7.LIZ(2);
            C0VQ7.LIZ(3);
            C816090Vzr.LIZ.getClass();
            C816090Vzr.LIZ();
            C1566300qrU.LIZ = 0L;
            C1566300qrU.LIZIZ = "";
            C10IC.LIZ.getClass();
            C10IC.LIZIZ.LJIIJJI(AFwS217S0000000_28.get$arr$(774));
        }
    }

    @Override // com.ss.android.ugc.aweme.offlinepush.api.IOfflinePushService
    public final void LIZJ() {
        Object c098200Yq;
        Object c098200Yq2;
        Object c098200Yq3;
        Object c098200Yq4;
        Object c098200Yq5;
        Object c098200Yq6;
        Object c098200Yq7;
        if (C0BZR.LIZ()) {
            C10IM.LIZ.getClass();
            if (!C0BZR.LIZ()) {
                C10IM.LIZIZ.LJIIJJI(AFwS217S0000000_28.get$arr$(723));
                return;
            }
            C0VQA.LIZ.getClass();
            String strLIZ = C0VQA.LIZ();
            String str = C10IM.LIZJ;
            if (Intrinsics.LJFF(strLIZ, str) && !Intrinsics.LJFF(strLIZ, CardStruct.IStatusCode.DEFAULT)) {
                C10IM.LIZIZ.LJIIJJI(new AwS87S1000000_2(strLIZ, 44));
                return;
            }
            C19319410i8 c19319410i8 = C10IM.LIZIZ;
            c19319410i8.LJIIJJI(new AwS27S2000000_2(str, strLIZ, 1));
            if (!Intrinsics.LJFF(str, CardStruct.IStatusCode.DEFAULT)) {
                c19319410i8.LJIIJJI(new AwS87S1000000_2(str, 45));
                try {
                    C1576970r8h.LIZ.getClass();
                    C1576970r8h.LIZ();
                    c098200Yq5 = Unit.LIZ;
                    C189200o6.m2constructorimpl(c098200Yq5);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq5 = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq5);
                }
                Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq5);
                if (thM5exceptionOrNullimpl != null) {
                    C19319410i8 c19319410i82 = C10IM.LIZIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("[Bootstrap] S1 unregister on teardown failed ");
                    sbLIZ.append(thM5exceptionOrNullimpl);
                    c19319410i82.LJ(C2188811AlT.LIZIZ(sbLIZ));
                }
                try {
                    C10IF.LIZ.getClass();
                    C10IF.LIZIZ();
                    c098200Yq6 = Unit.LIZ;
                    C189200o6.m2constructorimpl(c098200Yq6);
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    c098200Yq6 = new C098200Yq(th2);
                    C189200o6.m2constructorimpl(c098200Yq6);
                }
                Throwable thM5exceptionOrNullimpl2 = C189200o6.m5exceptionOrNullimpl(c098200Yq6);
                if (thM5exceptionOrNullimpl2 != null) {
                    C19319410i8 c19319410i83 = C10IM.LIZIZ;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("[Bootstrap] S2 unregister on teardown failed ");
                    sbLIZ2.append(thM5exceptionOrNullimpl2);
                    c19319410i83.LJ(C2188811AlT.LIZIZ(sbLIZ2));
                }
                try {
                    C1566300qrU.LIZ = 0L;
                    C1566300qrU.LIZIZ = "";
                    c098200Yq7 = Unit.LIZ;
                    C189200o6.m2constructorimpl(c098200Yq7);
                } catch (Throwable th3) {
                    TryCatchGuardChecker.doCheck(th3);
                    c098200Yq7 = new C098200Yq(th3);
                    C189200o6.m2constructorimpl(c098200Yq7);
                }
                Throwable thM5exceptionOrNullimpl3 = C189200o6.m5exceptionOrNullimpl(c098200Yq7);
                if (thM5exceptionOrNullimpl3 != null) {
                    C19319410i8 c19319410i84 = C10IM.LIZIZ;
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("[Bootstrap] signalCache reset on teardown failed ");
                    sbLIZ3.append(thM5exceptionOrNullimpl3);
                    c19319410i84.LJ(C2188811AlT.LIZIZ(sbLIZ3));
                }
            }
            C10IM.LIZJ = strLIZ;
            try {
                C10I8.LIZ.getClass();
                Iterator<Integer> it2 = C1226404r0.LIZ.iterator();
                while (it2.hasNext()) {
                    C10I8.LIZIZ(it2.next().intValue());
                }
                c098200Yq = Unit.LIZ;
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th4) {
                TryCatchGuardChecker.doCheck(th4);
                c098200Yq = new C098200Yq(th4);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            Throwable thM5exceptionOrNullimpl4 = C189200o6.m5exceptionOrNullimpl(c098200Yq);
            if (thM5exceptionOrNullimpl4 != null) {
                C10IM.LIZIZ.LJ("[Bootstrap] reconcileAll on setup failed " + thM5exceptionOrNullimpl4);
            }
            try {
                C816090Vzr.LIZ.getClass();
                C816090Vzr.LIZ();
                c098200Yq2 = Unit.LIZ;
                C189200o6.m2constructorimpl(c098200Yq2);
            } catch (Throwable th5) {
                TryCatchGuardChecker.doCheck(th5);
                c098200Yq2 = new C098200Yq(th5);
                C189200o6.m2constructorimpl(c098200Yq2);
            }
            Throwable thM5exceptionOrNullimpl5 = C189200o6.m5exceptionOrNullimpl(c098200Yq2);
            if (thM5exceptionOrNullimpl5 != null) {
                C10IM.LIZIZ.LJ("[Bootstrap] cancelAll on setup failed " + thM5exceptionOrNullimpl5);
            }
            try {
                C844470XAv.LIZ.getClass();
                C0VI1.LJII(C844470XAv.LIZ()).LIZIZ("offline_push");
                C10IM.LIZIZ.LJIIJJI(AFwS217S0000000_28.get$arr$(724));
                c098200Yq3 = Unit.LIZ;
                C189200o6.m2constructorimpl(c098200Yq3);
            } catch (Throwable th6) {
                TryCatchGuardChecker.doCheck(th6);
                c098200Yq3 = new C098200Yq(th6);
                C189200o6.m2constructorimpl(c098200Yq3);
            }
            Throwable thM5exceptionOrNullimpl6 = C189200o6.m5exceptionOrNullimpl(c098200Yq3);
            if (thM5exceptionOrNullimpl6 != null) {
                C10IM.LIZIZ.LJ("[Bootstrap] cancelAllWorkByTag on setup failed " + thM5exceptionOrNullimpl6);
            }
            if (Intrinsics.LJFF(strLIZ, CardStruct.IStatusCode.DEFAULT)) {
                C10IM.LIZIZ.LJIIJJI(AFwS217S0000000_28.get$arr$(721));
                return;
            }
            if (!C1EE1.LIZIZ.LJJIZ()) {
                C10IM.LIZIZ.LJIIJJI(AFwS217S0000000_28.get$arr$(722));
                return;
            }
            if (C10ID.LJFF() && !C10ID.LIZJ().getBoolean("debug.ignore_frequency", false)) {
                C10IM.LIZIZ.LJIIJJI(new AwS87S1000000_2(strLIZ, 43));
                return;
            }
            if (C0BZR.LIZIZ(1)) {
                C1576970r8h.LIZ.getClass();
                if (C0BZR.LIZIZ(1) && C1576970r8h.LIZJ.compareAndSet(false, true)) {
                    C1576970r8h.LIZLLL = C1906580ziK.LIZJ().LIZ().LJLLLLLL(new C09JN() { // from class: X.0zCQ
                        @Override // X.C09JN
                        public final void accept(Object obj) {
                            C1C7U.LIZ("Strategy1Trigger@dc34.register$1");
                            if (((C606810Nr5) obj).LIZIZ) {
                                C1576970r8h.LIZ.getClass();
                                long j = C1566300qrU.LIZ;
                                C1575430r6D.LIZ.getClass();
                                int i = C1575430r6D.LIZ().strategy1BadSignalWindowSec;
                                if (i < 0) {
                                    i = 0;
                                }
                                if (j > 0) {
                                    if (i <= 0) {
                                        C1576970r8h.LIZIZ.LJIIJJI(AFwS217S0000000_28.get$arr$(467));
                                    } else {
                                        long jCurrentTimeMillis = System.currentTimeMillis() - j;
                                        if (jCurrentTimeMillis > ((long) i) * 1000) {
                                            C1576970r8h.LIZIZ.LJIIJJI(new AwS4S0001100_13(jCurrentTimeMillis, i, 0));
                                        } else {
                                            String str2 = C1566300qrU.LIZIZ;
                                            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                                            sbLIZ4.append("bad_signal_");
                                            sbLIZ4.append(str2);
                                            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ4);
                                            C19319410i8 c19319410i85 = C380901dv.LIZ;
                                            C23250099c.LIZLLL(C380901dv.LIZIZ, null, null, new C351601Yc(1, new C1879810z19(jCurrentTimeMillis, i, strLIZIZ, str2, null), null), 3);
                                        }
                                    }
                                }
                            } else {
                                C1576970r8h.LIZ.getClass();
                                C10I8.LIZ.getClass();
                                C10I8.LIZIZ(1);
                                C0VQ7.LIZ.getClass();
                                C0VQ7.LIZ(1);
                                C816090Vzr.LIZ.getClass();
                                C816090Vzr.LIZIZ(1);
                                C1566300qrU.LIZ = 0L;
                                C1566300qrU.LIZIZ = "";
                            }
                            C1C7U.LIZIZ("Strategy1Trigger@dc34.register$1");
                        }
                    });
                    C1576970r8h.LIZIZ.LJIIJJI(AFwS217S0000000_28.get$arr$(468));
                }
            }
            if (C0BZR.LIZIZ(2)) {
                C10IF.LIZ.getClass();
                if (C0BZR.LIZIZ(2)) {
                    C1575100r5g.LIZ.getClass();
                    if (!C1575100r5g.LIZIZ()) {
                        C10IF.LIZIZ.LJIIJJI(AFwS217S0000000_28.get$arr$(472));
                    } else if (C10IF.LJFF.compareAndSet(false, true)) {
                        C10IF.LJI = C1906580ziK.LIZJ().LIZ().LJLLLLLL(new C09JN() { // from class: X.0zCR
                            @Override // X.C09JN
                            public final void accept(Object obj) {
                                boolean z;
                                String str2;
                                C1C7U.LIZ("Strategy2Trigger@70f5.register$2");
                                if (((C606810Nr5) obj).LIZIZ) {
                                    C10IF.LIZ.getClass();
                                    if (!Intrinsics.LJFF(C10IF.LIZLLL, "cellular") && !Intrinsics.LJFF(C10IF.LIZLLL, "none")) {
                                        z = false;
                                    } else {
                                        z = true;
                                    }
                                    if (Intrinsics.LJFF(C10IF.LIZJ, "wifi") && z) {
                                        C1575430r6D.LIZ.getClass();
                                        int i = C1575430r6D.LIZ().strategy2SignalWindowSec;
                                        if (i >= 0 && i > 0) {
                                            long jCurrentTimeMillis = System.currentTimeMillis() - C10IF.LJ;
                                            if (C10IF.LJ > 0 && jCurrentTimeMillis <= ((long) i) * 1000) {
                                                if (Intrinsics.LJFF(C10IF.LIZLLL, "none")) {
                                                    str2 = "wifi_to_none";
                                                } else {
                                                    str2 = "wifi_to_cellular";
                                                }
                                                C19319410i8 c19319410i85 = C380901dv.LIZ;
                                                C23250099c.LIZLLL(C380901dv.LIZIZ, null, null, new C351601Yc(2, new C1879800z18(i, jCurrentTimeMillis, str2, null), null), 3);
                                            } else {
                                                C10IF.LIZIZ.LJIIJJI(new AwS4S0001100_13(jCurrentTimeMillis, i, 1));
                                            }
                                        } else {
                                            C10IF.LIZIZ.LJIIJJI(AFwS217S0000000_28.get$arr$(471));
                                        }
                                    } else {
                                        C10IF.LIZIZ.LJIIJJI(AFwS217S0000000_28.get$arr$(470));
                                    }
                                } else {
                                    C10IF.LIZ.getClass();
                                    C10IF.LIZJ = C10IF.LIZ();
                                    C10IF.LJ = 0L;
                                    C10I8.LIZ.getClass();
                                    C10I8.LIZIZ(2);
                                    C0VQ7.LIZ.getClass();
                                    C0VQ7.LIZ(2);
                                    C816090Vzr.LIZ.getClass();
                                    C816090Vzr.LIZIZ(2);
                                }
                                C1C7U.LIZIZ("Strategy2Trigger@70f5.register$2");
                            }
                        });
                        try {
                            INetworkStateService iNetworkStateService = (INetworkStateService) PluggableExtentionKt.pluggableSpi$default(INetworkStateService.class, false, false, false, 14, null);
                            if (iNetworkStateService != null) {
                                iNetworkStateService.observerNetworkChange(C10IF.LJII);
                                c098200Yq4 = Unit.LIZ;
                            } else {
                                c098200Yq4 = null;
                            }
                            C189200o6.m2constructorimpl(c098200Yq4);
                        } catch (Throwable th7) {
                            TryCatchGuardChecker.doCheck(th7);
                            c098200Yq4 = new C098200Yq(th7);
                            C189200o6.m2constructorimpl(c098200Yq4);
                        }
                        Throwable thM5exceptionOrNullimpl7 = C189200o6.m5exceptionOrNullimpl(c098200Yq4);
                        if (thM5exceptionOrNullimpl7 != null) {
                            C19319410i8 c19319410i85 = C10IF.LIZIZ;
                            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                            sbLIZ4.append("[S2] register network failed ");
                            sbLIZ4.append(thM5exceptionOrNullimpl7);
                            c19319410i85.LJ(C2188811AlT.LIZIZ(sbLIZ4));
                        }
                        C10IF.LIZJ = C10IF.LIZ();
                        C10IF.LIZLLL = C10IF.LIZJ;
                        C10IF.LIZIZ.LJIIJJI(AFwS217S0000000_28.get$arr$(473));
                    }
                }
            }
            if (C0BZR.LIZIZ(3)) {
                C10IG.LIZ.getClass();
                C10IG.LIZ("bootstrap_first_call");
                C10ID.LIZJ().LJIIIIZZ("last_foreground_ts", System.currentTimeMillis());
                C1575050r5b.LIZ.getClass();
                if (C1575050r5b.LIZJ.compareAndSet(false, true)) {
                    C1575050r5b.LIZ();
                    C1906580ziK.LIZJ().LIZ().LJLLLLLL(new C09JN() { // from class: X.0r5h
                        @Override // X.C09JN
                        public final void accept(Object obj) {
                            C1C7U.LIZ("OfflinePushForegroundTracker@f62a.register$1");
                            C10ID.LIZJ().LJIIIIZZ("last_foreground_ts", System.currentTimeMillis());
                            if (((C606810Nr5) obj).LIZIZ) {
                                C1575050r5b.LIZ.getClass();
                                C11JF c11jf = C1575050r5b.LIZLLL;
                                if (c11jf != null) {
                                    c11jf.dispose();
                                }
                                C1575050r5b.LIZLLL = null;
                                C1575050r5b.LIZIZ.LIZIZ(AFwS213S0000000_24.get$arr$(446));
                            } else {
                                C1575050r5b.LIZ.getClass();
                                C1575050r5b.LIZ();
                                C1575050r5b.LIZIZ.LIZIZ(AFwS213S0000000_24.get$arr$(447));
                            }
                            C1C7U.LIZIZ("OfflinePushForegroundTracker@f62a.register$1");
                        }
                    });
                    C1575050r5b c1575050r5b = C1575050r5b.LIZ;
                    C1575050r5b.LIZIZ.LJIIJJI(AFwS217S0000000_28.get$arr$(455));
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.offlinepush.api.IOfflinePushService
    public final boolean LIZLLL() {
        return C0BZR.LIZ() && !C10ID.LJFF();
    }

    @Override // com.ss.android.ugc.aweme.offlinepush.api.IOfflinePushService
    public final void LIZ(Intent intent) {
        int intExtra;
        String stringExtra;
        if (C0BZR.LIZ() && intent != null && intent.hasExtra("offline_push_strategy") && 1 <= (intExtra = intent.getIntExtra("offline_push_strategy", 0)) && intExtra < 4) {
            boolean booleanExtra = intent.getBooleanExtra("offline_mode_require_ug_first", true);
            try {
                stringExtra = intent.getStringExtra("offline_push_sender_uid");
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            if (stringExtra == null) {
                stringExtra = "";
            }
            C0VQA.LIZ.getClass();
            String strLIZ = C0VQA.LIZ();
            this.LIZ.LJIIJJI(new C10IK(intExtra, stringExtra, strLIZ, booleanExtra));
            if (stringExtra.length() > 0 && !Intrinsics.LJFF(stringExtra, strLIZ)) {
                this.LIZ.LJIIJJI(new C10IL(intExtra, stringExtra, strLIZ));
                return;
            }
            if (booleanExtra) {
                C1EE1.LIZIZ.LJJJJZ();
            }
            C10IC.LIZ.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            InterfaceC625970Ogt interfaceC625970OgtLIZJ = C10ID.LIZJ();
            interfaceC625970OgtLIZJ.LIZJ("consecutive_no_click", 0);
            interfaceC625970OgtLIZJ.LJIIIIZZ("last_clicked_ts", jCurrentTimeMillis);
            C10ID.LJIIIIZZ(intExtra, 0L);
            C10IC.LIZIZ.LJIIJJI(new AwS16S1001000_9(intExtra, 2));
            C10I9 c10i9 = C10I9.LIZ;
            InterfaceC625970Ogt interfaceC625970OgtLIZJ2 = C10ID.LIZJ();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("last_shown_ts_strategy_");
            sbLIZ.append(intExtra);
            long j = interfaceC625970OgtLIZJ2.getLong(C2188811AlT.LIZIZ(sbLIZ), 0L);
            String strLIZLLL = C10ID.LIZLLL(intExtra);
            c10i9.getClass();
            C10I9.LIZIZ("offline_push_click", C10I9.LIZ(j, strLIZLLL));
            C816090Vzr.LIZ.getClass();
            C816090Vzr.LIZIZ(intExtra);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0080  */
    @Override // com.ss.android.ugc.aweme.offlinepush.api.IOfflinePushService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJ(java.lang.String r5, java.lang.String r6) {
        /*
            r4 = this;
            boolean r0 = X.C0BZR.LIZ()
            if (r0 != 0) goto L7
            return
        L7:
            boolean r0 = X.C10ID.LJFF()
            if (r0 == 0) goto Le
            return
        Le:
            if (r5 == 0) goto L82
            int r0 = r5.length()
            if (r0 == 0) goto L82
            r0 = 0
        L17:
            java.lang.String r3 = ""
            if (r0 != 0) goto L80
            X.0Ogt r0 = X.C10ID.LIZJ()
            java.lang.String r1 = "user_high_active_time"
            java.lang.String r0 = r0.getString(r1, r3)
            if (r0 != 0) goto L28
            r0 = r3
        L28:
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r5, r0)
            if (r0 != 0) goto L80
            X.0Ogt r0 = X.C10ID.LIZJ()
            r0.LIZIZ(r1, r5)
            r2 = 1
        L36:
            if (r6 == 0) goto L7d
            int r0 = r6.length()
            if (r0 == 0) goto L7d
            X.0Ogt r0 = X.C10ID.LIZJ()
            java.lang.String r1 = "region_high_active_time"
            java.lang.String r0 = r0.getString(r1, r3)
            if (r0 == 0) goto L4b
            r3 = r0
        L4b:
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r6, r3)
            if (r0 != 0) goto L7d
            X.0Ogt r0 = X.C10ID.LIZJ()
            r0.LIZIZ(r1, r6)
        L58:
            X.10i8 r2 = r4.LIZ
            kotlin.jvm.internal.AwS27S2000000_2 r1 = new kotlin.jvm.internal.AwS27S2000000_2
            r0 = 0
            r1.<init>(r5, r6, r0)
            r2.LJIIJJI(r1)
            X.10IG r0 = X.C10IG.LIZ
            r0.getClass()
            r1 = 3
            boolean r0 = X.C0BZR.LIZIZ(r1)
            if (r0 == 0) goto L7c
            X.0VQ7 r0 = X.C0VQ7.LIZ
            r0.getClass()
            X.C0VQ7.LIZ(r1)
            java.lang.String r0 = "server_push"
            X.C10IG.LIZ(r0)
        L7c:
            return
        L7d:
            if (r2 != 0) goto L58
            return
        L80:
            r2 = 0
            goto L36
        L82:
            r0 = 1
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.offlinepush.service.OfflinePushServiceImpl.LJ(java.lang.String, java.lang.String):void");
    }
}
