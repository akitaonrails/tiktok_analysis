package com.ss.android.ugc.aweme.ecommerce.mall.mixhome.diversion.traffic.model;

import X.C01GW;
import X.C09CT;
import X.C452501pT;
import com.google.gson.q;
import kotlin.jvm.internal.AwS578S0100000_34;

/* JADX INFO: loaded from: classes35.dex */
public final class MallExtraInfo {
    public final C01GW LIZ;

    @C09CT("author_id")
    public final String authorId;

    @C09CT("aweme_id")
    public final String awemeId;

    @C09CT("campaign_id")
    public final String campaignId;

    @C09CT("coupon_type_id")
    public final String couponTypeId;

    @C09CT("creative_id")
    public final String creativeId;

    @C09CT("group_id")
    public final String groupId;

    @C09CT("mall_direct_trigger")
    public final String mallDirectTrigger;

    @C09CT("mall_direct_type")
    public final String mallDirectType;

    @C09CT("mall_homepage_visited_type")
    public final q mallHomepageVisitedTypePrimitive;

    @C09CT("mall_landing_page")
    public final String mallLandingPage;

    @C09CT("mall_out_source")
    public final String mallOutSource;

    @C09CT("material_id")
    public final String materialId;

    @C09CT("product_id")
    public final String productId;

    @C09CT("resource_task_id")
    public final String resourceTaskId;

    @C09CT("seller_id")
    public final String sellerId;

    @C09CT("template_id")
    public final String templateId;

    @C09CT("track_id")
    public final String trackId;

    @C09CT("vt_scores")
    public final String vtScores;

    public MallExtraInfo() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
    }

    public final String LIZ() {
        return (String) this.LIZ.getValue();
    }

    public MallExtraInfo(String str, String str2, q qVar, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17) {
        this.mallOutSource = str;
        this.mallLandingPage = str2;
        this.mallHomepageVisitedTypePrimitive = qVar;
        this.campaignId = str3;
        this.materialId = str4;
        this.groupId = str5;
        this.mallDirectType = str6;
        this.mallDirectTrigger = str7;
        this.templateId = str8;
        this.awemeId = str9;
        this.productId = str10;
        this.sellerId = str11;
        this.authorId = str12;
        this.couponTypeId = str13;
        this.resourceTaskId = str14;
        this.creativeId = str15;
        this.trackId = str16;
        this.vtScores = str17;
        this.LIZ = C452501pT.LIZIZ(new AwS578S0100000_34(this, 37));
    }
}
