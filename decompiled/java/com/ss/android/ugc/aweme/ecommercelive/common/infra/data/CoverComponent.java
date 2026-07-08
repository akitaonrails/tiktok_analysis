package com.ss.android.ugc.aweme.ecommercelive.common.infra.data;

import X.C09CT;

/* JADX INFO: loaded from: classes33.dex */
public final class CoverComponent {

    @C09CT("da_info")
    public final String daInfo;

    @C09CT("smart_image_jump_pdp_index")
    public final Integer smartImageJumpPdpIndex;

    @C09CT("smart_image_set_jump_pdp_cache")
    public final Boolean smartImageSetJumpPdpCache;

    public CoverComponent() {
        this(Boolean.FALSE, 0, null);
    }

    public CoverComponent(Boolean bool, Integer num, String str) {
        this.smartImageSetJumpPdpCache = bool;
        this.smartImageJumpPdpIndex = num;
        this.daInfo = str;
    }
}
