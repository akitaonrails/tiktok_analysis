package com.ss.android.ugc.aweme.ecommerce.network;

import X.C09CT;
import X.C0C64;
import X.C13BV;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes24.dex */
public final class EcomNetworkInterceptOptConfig {
    public static final EcomNetworkInterceptOptModel LIZ;

    static {
        EcomNetworkInterceptOptModel ecomNetworkInterceptOptModel = new EcomNetworkInterceptOptModel(null, 1, null);
        EcomNetworkInterceptOptModel ecomNetworkInterceptOptModel2 = (EcomNetworkInterceptOptModel) C0C64.LJIILLIIL().LJJII(EcomNetworkInterceptOptModel.class, ecomNetworkInterceptOptModel, "ecom_intercept_opt_config", true);
        if (ecomNetworkInterceptOptModel2 != null) {
            ecomNetworkInterceptOptModel = ecomNetworkInterceptOptModel2;
        }
        LIZ = ecomNetworkInterceptOptModel;
    }

    public static final class EcomNetworkInterceptOptModel {

        @C09CT("ttnet_timing_white_list")
        public final List<String> ttnetTimingWhiteList;

        public EcomNetworkInterceptOptModel() {
            this(null, 1, null);
        }

        public EcomNetworkInterceptOptModel(List<String> list) {
            this.ttnetTimingWhiteList = list;
        }

        public EcomNetworkInterceptOptModel(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? C13BV.INSTANCE : list);
        }
    }
}
