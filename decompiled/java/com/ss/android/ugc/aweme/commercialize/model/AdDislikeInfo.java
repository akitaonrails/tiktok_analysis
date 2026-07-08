package com.ss.android.ugc.aweme.commercialize.model;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public final class AdDislikeInfo implements Serializable {

    @C09CT("sub_categories")
    public final List<AdDislikeReasonModel> categoryList;

    @C09CT("desc")
    public final String desc;

    @C09CT("dislike_style")
    public final int dislikeStyle;

    @C09CT("dislike_ad_type")
    public final int dislikeType;

    @C09CT("enable_sub_category")
    public final int enable;

    @C09CT("enable_show_in_main_interaction")
    public final boolean enableAdShowDislikeIcon;

    @C09CT("enable_ttplus_banner")
    public final boolean enableTTPlusBanner;

    @C09CT("lynx_schema")
    public final String lynxSchema;

    @C09CT("submit_text")
    public final String submitText;

    @C09CT("title")
    public final String title;

    @C09CT("toast_text")
    public final String toastText;

    @C09CT("ttplus_banner_guide")
    public final String ttplusBannerGuide;

    @C09CT("ttplus_banner_image")
    public final String ttplusBannerImage;

    @C09CT("ttplus_banner_open_schema")
    public final String ttplusBannerOpenSchema;

    @C09CT("ttplus_banner_title")
    public final String ttplusBannerTitle;

    public AdDislikeInfo() {
        this(0, null, false, 0, 0, "Improve your ad experience", "I didn't like this ad because it was:", "Submit", "aweme://lynxview_popup?use_spark=1&surl=https%3A%2F%2Fsf-teko-source.tiktokcdn.com%2Fobj%2Ftiktok-teko-internal-sg%2F75%2Fteko%2Fresource%2Fads_dislike_page%2Ftemplate.js&channel=ads_dislike_page&bundle=template.js%26channel%3Dads_dislike_page%26bundle%3Dtemplate.js%26container_bg_color%3D00000000%26loading_bg_color%3D00000000%26hide_nav_bar%3D1%26show_mask%3D0", "Thanks, we'll show you fewer ads like this", false, "", "", "", "");
    }

    public final AdDislikeInfo copy(int i, List<AdDislikeReasonModel> list, boolean z, int i2, int i3, String str, String str2, String str3, String str4, String str5, boolean z2, String str6, String str7, String str8, String str9) {
        return new AdDislikeInfo(i, list, z, i2, i3, str, str2, str3, str4, str5, z2, str6, str7, str8, str9);
    }

    public AdDislikeInfo(int i, List<AdDislikeReasonModel> list, boolean z, int i2, int i3, String str, String str2, String str3, String str4, String str5, boolean z2, String str6, String str7, String str8, String str9) {
        this.enable = i;
        this.categoryList = list;
        this.enableAdShowDislikeIcon = z;
        this.dislikeStyle = i2;
        this.dislikeType = i3;
        this.title = str;
        this.desc = str2;
        this.submitText = str3;
        this.lynxSchema = str4;
        this.toastText = str5;
        this.enableTTPlusBanner = z2;
        this.ttplusBannerImage = str6;
        this.ttplusBannerTitle = str7;
        this.ttplusBannerGuide = str8;
        this.ttplusBannerOpenSchema = str9;
    }
}
