package com.ss.android.ugc.aweme.ecommerce.core.ab;

import X.C09CT;

/* JADX INFO: loaded from: classes2.dex */
public final class DynamicPreloadXmlConfig {

    @C09CT("enable_full_screen_preload")
    public final Boolean enableFullScreenPreload;

    @C09CT("enable_one_step_checkout_preload")
    public final Boolean enableOneStepCheckoutPreload;

    @C09CT("preload_dynamic_strategy")
    public final Integer preloadDynamicStrategy;

    public DynamicPreloadXmlConfig() {
        this(Boolean.FALSE, Boolean.FALSE, 0);
    }

    public DynamicPreloadXmlConfig(Boolean bool, Boolean bool2, Integer num) {
        this.enableFullScreenPreload = bool;
        this.enableOneStepCheckoutPreload = bool2;
        this.preloadDynamicStrategy = num;
    }
}
