package com.ss.android.ugc.aweme.legoImp.task;

import X.C01GW;
import X.C09JN;
import X.C0CCZ;
import X.C0VZ0;
import X.C1906580ziK;
import X.C293570Bf1;
import X.C452501pT;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import X.InterfaceC1601520rmI;
import X.InterfaceC19483011Ki;
import Y.AfS200S0100000_31;
import android.content.Context;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import java.util.List;
import kotlin.jvm.internal.AFwS221S0000000_31;

/* JADX INFO: loaded from: classes32.dex */
public final class LiveHistoryCardReportTask implements C0CCZ {
    public final C01GW LL = C452501pT.LIZIZ(AFwS221S0000000_31.get$arr$(214));
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(AFwS221S0000000_31.get$arr$(215));

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "LiveHistoryCardReportTask";
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ boolean meetTrigger() {
        return true;
    }

    @Override // X.C0CCZ
    public final /* synthetic */ boolean serialExecute() {
        return false;
    }

    @Override // X.InterfaceC800080Va2
    public final int targetProcess() {
        return 1;
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ EnumC799980VZs triggerType() {
        return C0VZ0.LIZIZ(this);
    }

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        return EnumC799870VZh.BOOT_FINISH;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        ILiveOuterService iLiveOuterService;
        InterfaceC1601520rmI interfaceC1601520rmIS3;
        if (C293570Bf1.LIZ()) {
            ILiveOuterService iLiveOuterService2 = (ILiveOuterService) PluggableExtentionKt.pluggableSpi$default(ILiveOuterService.class, false, false, false, 14, null);
            if (iLiveOuterService2 != null && (interfaceC1601520rmIS3 = iLiveOuterService2.S3()) != null) {
                interfaceC1601520rmIS3.LIZ(true);
            }
            if (((Boolean) this.LL.getValue()).booleanValue() && (iLiveOuterService = (ILiveOuterService) PluggableExtentionKt.pluggableSpi$default(ILiveOuterService.class, false, false, false, 14, null)) != null) {
                iLiveOuterService.Ai();
            }
            C1906580ziK.LIZJ().LJIIIZ().LJJIL(new InterfaceC19483011Ki() { // from class: X.09Pt
                @Override // X.InterfaceC19483011Ki
                public final boolean test(Object obj) {
                    return ((C813430VvZ) obj).LIZ.LIZ instanceof InterfaceC1711206n0;
                }
            }).LJJLL(new C09JN() { // from class: X.0rmX
                @Override // X.C09JN
                public final void accept(Object obj) {
                    InterfaceC1601520rmI interfaceC1601520rmIS32;
                    C1C7U.LIZ("LiveHistoryCardReportTask@daef.subscribeForRootPage$2");
                    ILiveOuterService iLiveOuterService3 = (ILiveOuterService) PluggableExtentionKt.pluggableSpi$default(ILiveOuterService.class, false, false, false, 14, null);
                    if (iLiveOuterService3 != null && (interfaceC1601520rmIS32 = iLiveOuterService3.S3()) != null) {
                        interfaceC1601520rmIS32.LIZ(true);
                    }
                    C1C7U.LIZIZ("LiveHistoryCardReportTask@daef.subscribeForRootPage$2");
                }
            }, new C09JN() { // from class: X.00OQ
                @Override // X.C09JN
                public final /* bridge */ /* synthetic */ void accept(Object obj) {
                    C1C7U.LIZ("LiveHistoryCardReportTask@daef.subscribeForRootPage$3");
                    C1C7U.LIZIZ("LiveHistoryCardReportTask@daef.subscribeForRootPage$3");
                }
            });
            C1906580ziK.LIZJ().LJI().LJJIL(new InterfaceC19483011Ki() { // from class: X.09Py
                @Override // X.InterfaceC19483011Ki
                public final boolean test(Object obj) {
                    return ((AbstractC1387200mCc) obj).LIZ instanceof InterfaceC1711206n0;
                }
            }).LJJLL(new AfS200S0100000_31(this, 10), new C09JN() { // from class: X.00OR
                @Override // X.C09JN
                public final /* bridge */ /* synthetic */ void accept(Object obj) {
                    C1C7U.LIZ("LiveHistoryCardReportTask@daef.subscribeForRootPage$6");
                    C1C7U.LIZIZ("LiveHistoryCardReportTask@daef.subscribeForRootPage$6");
                }
            });
            C1906580ziK.LIZJ().LJII().LJJIL(new InterfaceC19483011Ki() { // from class: X.09Pz
                @Override // X.InterfaceC19483011Ki
                public final boolean test(Object obj) {
                    return ((AbstractC1387200mCc) obj).LIZ instanceof InterfaceC1711206n0;
                }
            }).LJJLL(new AfS200S0100000_31(this, 11), new C09JN() { // from class: X.00OS
                @Override // X.C09JN
                public final /* bridge */ /* synthetic */ void accept(Object obj) {
                    C1C7U.LIZ("LiveHistoryCardReportTask@daef.subscribeForRootPage$9");
                    C1C7U.LIZIZ("LiveHistoryCardReportTask@daef.subscribeForRootPage$9");
                }
            });
        }
    }
}
