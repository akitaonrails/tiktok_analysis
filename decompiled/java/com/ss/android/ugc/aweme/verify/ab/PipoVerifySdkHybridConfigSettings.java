package com.ss.android.ugc.aweme.verify.ab;

import X.C09CT;
import X.C13BV;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes27.dex */
public final class PipoVerifySdkHybridConfigSettings {
    public static final PipoVerifySdkHybridConfigModel LIZ = new PipoVerifySdkHybridConfigModel(null, 1, null);

    public static final class PipoVerifySdkHybridConfigModel {

        @C09CT("enable_list")
        public final List<HybridConfigModel> sourceList;

        public PipoVerifySdkHybridConfigModel() {
            this(null, 1, null);
        }

        public PipoVerifySdkHybridConfigModel(List<HybridConfigModel> list) {
            this.sourceList = list;
        }

        public PipoVerifySdkHybridConfigModel(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? C13BV.INSTANCE : list);
        }
    }

    public static final class HybridConfigModel {

        @C09CT("biz_type")
        public final String bizType;

        @C09CT("enter_from")
        public final String enterFrom;

        @C09CT("payment_method")
        public final String paymentMethod;

        @C09CT("pipo_product_cat")
        public final String pipoProductCat;

        public HybridConfigModel() {
            this(null, null, null, null);
        }

        public HybridConfigModel(String str, String str2, String str3, String str4) {
            this.bizType = str;
            this.paymentMethod = str2;
            this.pipoProductCat = str3;
            this.enterFrom = str4;
        }
    }
}
