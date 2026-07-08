package com.ss.android.ugc.aweme.ecommercelive.audience.common.business.audience.config;

import X.C09CT;

/* JADX INFO: loaded from: classes33.dex */
public final class EcomShopBagDailyAnimModel {

    @C09CT("anim_daily_bag")
    public final String animDailyBag;

    @C09CT("enable")
    public final Integer enable;

    @C09CT("interval")
    public final Integer interval;

    public EcomShopBagDailyAnimModel() {
        this(null, 0, "https://sf16-sg.tiktokcdn.com/obj/eden-sg/nuptbzuvj_aulauvj_ljylttvjl/ljhwZthlaukjlkulzlp/ec_shop_bag_lottie_urls/anim_new_bag/anim_daily.zip");
    }

    public EcomShopBagDailyAnimModel(Integer num, Integer num2, String str) {
        this.interval = num;
        this.enable = num2;
        this.animDailyBag = str;
    }
}
