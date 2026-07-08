package com.ss.android.ugc.aweme.ecommerce.base.cart.cache;

import X.C09CT;
import java.util.Map;

/* JADX INFO: loaded from: classes27.dex */
public final class CartPreloadConfig {

    @C09CT("diff_cart_params")
    public final DiffCartParams diffCartParams;

    @C09CT("enable_atc_preload_all_scene")
    public final Boolean enableAtcPreloadAllScene;

    @C09CT("enable_cart_entry_preload")
    public final Boolean enableCartEntryPreload;

    @C09CT("enable_cart_preload")
    public final Boolean enableCartPreload;

    @C09CT("enable_clear_cache")
    public final Boolean enableClearCache;

    @C09CT("enable_get_cart_preload")
    public final Boolean enableGetCartPreload;

    @C09CT("extra_request_params")
    public final Map<String, Object> extraRequestParams;

    public CartPreloadConfig(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Map<String, ? extends Object> map, DiffCartParams diffCartParams) {
        this.enableAtcPreloadAllScene = bool;
        this.enableCartPreload = bool2;
        this.enableGetCartPreload = bool3;
        this.enableCartEntryPreload = bool4;
        this.enableClearCache = bool5;
        this.extraRequestParams = map;
        this.diffCartParams = diffCartParams;
    }
}
