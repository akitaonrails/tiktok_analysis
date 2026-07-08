package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ab;

import X.C01GW;
import X.C09CT;
import X.C452501pT;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.AFwS185S0000000_1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class PipoOspSecondRefreshConfigSettings {
    public static final PipoOspSecondRefreshConfigModel LIZ = new PipoOspSecondRefreshConfigModel(null, null, null, 7, null);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS185S0000000_1.get$arr$(62));

    public static boolean LIZ() {
        C01GW c01gw = LIZIZ;
        Boolean bool = ((PipoOspSecondRefreshConfigModel) c01gw.getValue()).enableOptimization;
        Boolean bool2 = Boolean.TRUE;
        return Intrinsics.LJFF(bool, bool2) && Intrinsics.LJFF(((PipoOspSecondRefreshConfigModel) c01gw.getValue()).enableOptimizePromotion, bool2);
    }

    public static final class PipoOspSecondRefreshConfigModel {

        @C09CT("clear_installment_pm_list")
        public final List<String> clearInstallmentPmList;

        @C09CT("enable_optimization")
        public final Boolean enableOptimization;

        @C09CT("enable_optimize_promotion")
        public final Boolean enableOptimizePromotion;

        public PipoOspSecondRefreshConfigModel() {
            this(null, null, null, 7, null);
        }

        public PipoOspSecondRefreshConfigModel(Boolean bool, List<String> list, Boolean bool2) {
            this.enableOptimization = bool;
            this.clearInstallmentPmList = list;
            this.enableOptimizePromotion = bool2;
        }

        public PipoOspSecondRefreshConfigModel(Boolean bool, List list, Boolean bool2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? Boolean.FALSE : bool, (i & 2) != 0 ? Collections.singletonList("") : list, (i & 4) != 0 ? Boolean.FALSE : bool2);
        }
    }
}
