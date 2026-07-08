package com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes27.dex */
public final class PreLiveBillboardInfo {

    @C09CT("billboard_type")
    public final Integer billboardType;

    @C09CT("billboard_image_list")
    public final List<ImageItem> imageList;

    @C09CT("image_url")
    public final String imageUrl;

    @C09CT("is_display_campaign_banner")
    public final Boolean isDisplayCampaignBanner;

    @C09CT("is_billboard_v1")
    public final Boolean isNewBillboard;

    @C09CT("is_new_user")
    public final Boolean isNewUser;

    @C09CT("billboard_template_list")
    public final List<RespTemplateItem> templateList;

    public PreLiveBillboardInfo() {
        this(null, null, null, null, Boolean.FALSE, null, null);
    }

    public PreLiveBillboardInfo(Integer num, Boolean bool, List<RespTemplateItem> list, List<ImageItem> list2, Boolean bool2, String str, Boolean bool3) {
        this.billboardType = num;
        this.isNewUser = bool;
        this.templateList = list;
        this.imageList = list2;
        this.isDisplayCampaignBanner = bool2;
        this.imageUrl = str;
        this.isNewBillboard = bool3;
    }
}
