package com.ss.android.ugc.aweme;

import X.C01GW;
import X.C10H0;
import X.C10MS;
import X.C10MT;
import X.C10MU;
import X.C10OZ;
import X.C10PO;
import X.C10QI;
import X.C1869320ykE;
import X.C1869330ykF;
import X.C1911410zq7;
import X.C1911490zqF;
import X.C1912470zrp;
import X.C19233710Ml;
import X.C19233810Mm;
import X.C19237810Oa;
import X.C2188811AlT;
import X.C452501pT;
import X.InterfaceC1866830ygD;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.journey.INewUserJourneyAppDiffService;
import com.ss.android.ugc.aweme.journey.IStrategyCenterService;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes29.dex */
public final class StrategyCenterService implements IStrategyCenterService {
    public boolean LIZ;
    public final C01GW LIZIZ = C452501pT.LIZIZ(new C1869330ykF());

    public static C19233710Ml LJIIJJI() {
        C19233810Mm.LIZ.getClass();
        return (C19233710Ml) C19233810Mm.LIZ(C19233710Ml.class);
    }

    @Override // com.ss.android.ugc.aweme.journey.IStrategyCenterService
    public final boolean LIZ() {
        C1911490zqF.LIZ.getClass();
        return C1911490zqF.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.journey.IStrategyCenterService
    public final boolean LIZIZ() {
        C10MT.LIZ.getClass();
        return ((Boolean) C10MT.LIZIZ.getValue()).booleanValue();
    }

    @Override // com.ss.android.ugc.aweme.journey.IStrategyCenterService
    public final boolean LIZJ() {
        INewUserJourneyAppDiffService iNewUserJourneyAppDiffService = (INewUserJourneyAppDiffService) PluggableExtentionKt.pluggableSpi$default(INewUserJourneyAppDiffService.class, false, false, false, 14, null);
        if (iNewUserJourneyAppDiffService != null) {
            iNewUserJourneyAppDiffService.LIZ();
        }
        IAccountService iAccountService = (IAccountService) PluggableExtentionKt.pluggableSpi$default(IAccountService.class, false, false, false, 14, null);
        Intrinsics.LJFF("US", iAccountService != null ? iAccountService.getStoreRegionUpperCase() : null);
        return LJIIJJI().LIZJ().length() == 0 || Intrinsics.LJFF(LJIIJJI().LIZJ(), "run");
    }

    @Override // com.ss.android.ugc.aweme.journey.IStrategyCenterService
    public final boolean LIZLLL() {
        InterfaceC1866830ygD interfaceC1866830ygD;
        C10PO.LIZ.getClass();
        C1912470zrp c1912470zrpLIZ = C10PO.LIZ();
        return (c1912470zrpLIZ == null || (interfaceC1866830ygD = (InterfaceC1866830ygD) c1912470zrpLIZ.LIZIZ(InterfaceC1866830ygD.class)) == null || !interfaceC1866830ygD.LIZ()) ? false : true;
    }

    @Override // com.ss.android.ugc.aweme.journey.IStrategyCenterService
    public final boolean LJ() {
        C10MU.LIZ.getClass();
        if (((Number) C10MU.LIZIZ.getValue()).intValue() > 0) {
            return true;
        }
        C10MS.LIZ.getClass();
        return C10MS.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.journey.IStrategyCenterService
    public final Set<String> LJI() {
        return (Set) ((C1869320ykE) this.LIZIZ.getValue()).LIZIZ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.journey.IStrategyCenterService
    public final boolean LJII() {
        boolean zLJFF = Intrinsics.LJFF(new C10H0().LIZJ(), "run");
        if (zLJFF) {
            this.LIZ = true;
        }
        return zLJFF;
    }

    @Override // com.ss.android.ugc.aweme.journey.IStrategyCenterService
    public final C10OZ LJIIIIZZ() {
        C19237810Oa.LIZ.getClass();
        return C19237810Oa.LIZIZ;
    }

    @Override // com.ss.android.ugc.aweme.journey.IStrategyCenterService
    public final boolean LJIIIZ() {
        return ((C10QI) this.LIZIZ.getValue()).LIZ("is_enable", false);
    }

    @Override // com.ss.android.ugc.aweme.journey.IStrategyCenterService
    public final boolean LJIIJ() {
        return !Intrinsics.LJFF(LJIIJJI().LIZLLL("page_style", "online"), "intro_android_swipe_up_tux_lottie.json");
    }

    @Override // com.ss.android.ugc.aweme.journey.IStrategyCenterService
    public final String hl() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("pageStyle: ");
        sbLIZ.append(LJIIJJI().LIZLLL("page_style", "online"));
        C1911410zq7.LIZ("StrategyCenterService", C2188811AlT.LIZIZ(sbLIZ));
        return Intrinsics.LJFF(LJIIJJI().LIZLLL("page_style", "online"), "revamp") ? "tt_swipe_up_tux_lottie.json" : "intro_android_swipe_up_tux_lottie.json";
    }

    @Override // com.ss.android.ugc.aweme.journey.IStrategyCenterService
    public final boolean LJFF() {
        return this.LIZ;
    }
}
