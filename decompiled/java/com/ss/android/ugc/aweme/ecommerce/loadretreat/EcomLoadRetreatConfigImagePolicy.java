package com.ss.android.ugc.aweme.ecommerce.loadretreat;

import X.C09CT;

/* JADX INFO: loaded from: classes21.dex */
public final class EcomLoadRetreatConfigImagePolicy {

    @C09CT("lynx_image_clear")
    public final Integer lynxImageClear;

    @C09CT("lynx_image_clear_delay")
    public final Long lynxImageClearDelay;

    @C09CT("lynx_image_clear_run")
    public final Integer lynxImageClearRun;

    @C09CT("lynx_image_update")
    public final Integer lynxImageUpdate;

    public EcomLoadRetreatConfigImagePolicy() {
        this(null, null, null, null);
    }

    public EcomLoadRetreatConfigImagePolicy(Integer num, Integer num2, Integer num3, Long l) {
        this.lynxImageUpdate = num;
        this.lynxImageClear = num2;
        this.lynxImageClearRun = num3;
        this.lynxImageClearDelay = l;
    }
}
