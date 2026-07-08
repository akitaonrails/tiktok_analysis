package com.ss.android.ugc.aweme.pipo.hybrid;

import X.C09CT;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes27.dex */
public final class PipoEcomPayinStandaloneContainerConfig {

    @C09CT("bind_disabled_redirect_payment_methods")
    public final List<String> bindDisabledRedirectPaymentMethods;

    @C09CT("jump_to_ecom_host_traits")
    public final List<String> jumpToEcomHostTraits;

    @C09CT("jump_to_ecom_paths_traits")
    public final List<String> jumpToEcomPathsTraits;

    @C09CT("pay_disabled_redirect_payment_methods")
    public final List<String> payDisabledRedirectPaymentMethods;

    public PipoEcomPayinStandaloneContainerConfig() {
        this(null, null, null, null, 15, null);
    }

    public PipoEcomPayinStandaloneContainerConfig(List<String> list, List<String> list2, List<String> list3, List<String> list4) {
        this.bindDisabledRedirectPaymentMethods = list;
        this.payDisabledRedirectPaymentMethods = list2;
        this.jumpToEcomPathsTraits = list3;
        this.jumpToEcomHostTraits = list4;
    }

    public PipoEcomPayinStandaloneContainerConfig(List list, List list2, List list3, List list4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Collections.singletonList("") : list, (i & 2) != 0 ? Collections.singletonList("") : list2, (i & 4) != 0 ? Collections.singletonList("fe_tiktok_ecommerce_") : list3, (i & 8) != 0 ? Collections.singletonList("oec-api") : list4);
    }
}
