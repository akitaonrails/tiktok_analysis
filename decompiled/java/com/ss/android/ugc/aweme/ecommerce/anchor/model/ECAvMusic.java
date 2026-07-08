package com.ss.android.ugc.aweme.ecommerce.anchor.model;

import X.C09CT;

/* JADX INFO: loaded from: classes32.dex */
public final class ECAvMusic {

    @C09CT("is_commerce_music")
    public Boolean isCommerceMusic;

    @C09CT("has_commerce_right")
    public Boolean isHasCommerceRight;

    @C09CT("has_commerce_right_strict")
    public Boolean isHasCommerceRightStrict;

    public ECAvMusic(Boolean bool, Boolean bool2, Boolean bool3) {
        this.isHasCommerceRight = bool;
        this.isCommerceMusic = bool2;
        this.isHasCommerceRightStrict = bool3;
    }
}
