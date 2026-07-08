package com.ss.android.ugc.aweme.ecommercelive.common.infra.settings;

import X.C09CT;

/* JADX INFO: loaded from: classes36.dex */
public final class ECLiveAnimDowngradeScoreModel {

    @C09CT("pin_card_anim_downgrade_score")
    public final Float pinCardAnimDowngradeScore;

    @C09CT("shop_bag_icon_anim_downgrade_score")
    public final Float shopBagIconAnimDowngradeScore;

    @C09CT("shop_bag_pop_up_anim_downgrade_score")
    public final Float shopBagPopupAnimDowngradeScore;

    @C09CT("short_touch_preview_anim_downgrade_score")
    public final Float shortTouchPreviewAnimDowngradeScore;

    public ECLiveAnimDowngradeScoreModel() {
        this(null, null, null, null);
    }

    public ECLiveAnimDowngradeScoreModel(Float f, Float f2, Float f3, Float f4) {
        this.pinCardAnimDowngradeScore = f;
        this.shopBagIconAnimDowngradeScore = f2;
        this.shopBagPopupAnimDowngradeScore = f3;
        this.shortTouchPreviewAnimDowngradeScore = f4;
    }
}
