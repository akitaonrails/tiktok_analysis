package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ab;

import X.C09CT;
import X.C13BV;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes2.dex */
public final class PipoEcomEnableBindVerifySettings {
    public static final PipoBindPreVerifyConfig LIZ = new PipoBindPreVerifyConfig(null, null, null, 7, null);

    public static final class PipoBindPreVerifyConfig {

        @C09CT("disable_payment_methods")
        public final List<String> disabledPmIdList;

        @C09CT("enable_bind_verify")
        public final Boolean enable;

        @C09CT("h5_bind_payment_methods")
        public final List<String> h5BindPaymentMethods;

        public PipoBindPreVerifyConfig() {
            this(null, null, null, 7, null);
        }

        public PipoBindPreVerifyConfig(Boolean bool, List<String> list, List<String> list2) {
            this.enable = bool;
            this.disabledPmIdList = list;
            this.h5BindPaymentMethods = list2;
        }

        public PipoBindPreVerifyConfig(Boolean bool, List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? Boolean.FALSE : bool, (i & 2) != 0 ? C13BV.INSTANCE : list, (i & 4) != 0 ? C13BV.INSTANCE : list2);
        }
    }
}
