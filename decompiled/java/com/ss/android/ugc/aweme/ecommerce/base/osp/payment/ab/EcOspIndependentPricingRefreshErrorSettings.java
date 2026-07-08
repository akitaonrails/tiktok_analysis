package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ab;

import X.C01GW;
import X.C09CT;
import X.C452501pT;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.AFwS185S0000000_1;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes2.dex */
public final class EcOspIndependentPricingRefreshErrorSettings {
    public static final RefreshModel LIZ = new RefreshModel(null, null, 0, 7, null);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS185S0000000_1.get$arr$(55));

    public static final class RefreshModel {

        @C09CT("enable")
        public final Boolean enable;

        @C09CT("error_list")
        public final List<String> errorList;

        @C09CT("retry_times")
        public final int retryTimes;

        public RefreshModel() {
            this(null, null, 0, 7, null);
        }

        public RefreshModel(Boolean bool, List<String> list, int i) {
            this.enable = bool;
            this.errorList = list;
            this.retryTimes = i;
        }

        public RefreshModel(Boolean bool, List list, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? Boolean.TRUE : bool, (i2 & 2) != 0 ? Collections.singletonList("23005057") : list, (i2 & 4) != 0 ? 5 : i);
        }
    }
}
