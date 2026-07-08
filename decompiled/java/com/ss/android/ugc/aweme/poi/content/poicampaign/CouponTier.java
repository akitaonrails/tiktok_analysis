package com.ss.android.ugc.aweme.poi.content.poicampaign;

import X.C09CT;

/* JADX INFO: loaded from: classes19.dex */
public final class CouponTier {

    @C09CT("description")
    public final String desc;

    @C09CT("img")
    public final String img;

    @C09CT("tier")
    public final Integer tier;

    @C09CT("title")
    public final String title;

    public CouponTier(Integer num, String str, String str2, String str3) {
        this.tier = num;
        this.img = str;
        this.title = str2;
        this.desc = str3;
    }
}
