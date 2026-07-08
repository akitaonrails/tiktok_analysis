package com.ss.android.ugc.aweme.subscription.mainactivityassem;

import X.C01GW;
import X.C0K77;
import X.C0PEM;
import X.C0RUJ;
import X.C0S8X;
import X.C0SBM;
import X.C0SBO;
import X.C1150504el;
import X.C1620980sHg;
import X.C23250099c;
import X.C452501pT;
import X.C786410Ut5;
import android.os.Bundle;
import androidx.lifecycle.LifecycleOwnerKt;
import com.ss.android.ugc.aweme.base.BaseMainContainerAssem;
import com.ss.android.ugc.aweme.videohotswap.service.IPaidContentVideoHotSwapService;
import kotlin.jvm.internal.AFwS198S0000000_11;

/* JADX INFO: loaded from: classes12.dex */
public final class PGCSubsMainActivityAssem extends BaseMainContainerAssem implements C0RUJ {
    public final C01GW LL = C452501pT.LIZIZ(new C0S8X());
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(207));

    @Override // X.C0RUJ
    public final void Ie() {
    }

    @Override // X.C0RUJ
    public final String T1() {
        return "pgc_subs_main_activity_assem";
    }

    @Override // X.C0RUJ
    public final void a6() {
    }

    @Override // X.C0RUJ
    public final void lj() {
    }

    @Override // X.C0RUJ
    public final boolean m8() {
        return false;
    }

    public final IPaidContentVideoHotSwapService bo() {
        return (IPaidContentVideoHotSwapService) this.LL.getValue();
    }

    @Override // X.AbstractC738140SxQ
    public final void onDestroy() {
        C0SBM c0sbm = (C0SBM) this.LLILLJJLI.getValue();
        C0K77 c0k77 = (C0K77) c0sbm.LIZIZ.getValue();
        if (c0k77 != null) {
            c0k77.LJJIJL(c0sbm.LIZ);
        }
        super.onDestroy();
    }

    @Override // com.ss.android.ugc.aweme.base.BaseMainContainerAssem, X.InterfaceC1593530rZP
    public final void onCreate(Bundle bundle) {
        String strJ4 = C786410Ut5.j4("main_act_assem_lifecycle_%s_%s", new Object[]{"PGCSubsMainActivityAssem", "onCreate_with_bundle"});
        C1150504el.LIZ().LIZLLL(strJ4, false);
        super.onCreate(bundle);
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), C0PEM.LIZJ, null, new C0SBO(this, null), 2);
        C0SBM c0sbm = (C0SBM) this.LLILLJJLI.getValue();
        C0K77 c0k77 = (C0K77) c0sbm.LIZIZ.getValue();
        if (c0k77 != null) {
            c0k77.LJJIJIIJI(c0sbm.LIZ, new C1620980sHg(c0sbm, 2));
        }
        C1150504el.LIZ().LJI(strJ4, false);
    }
}
