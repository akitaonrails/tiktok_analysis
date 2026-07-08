package com.ss.android.ugc.aweme.effectcreator.experiments;

import X.C09CT;

/* JADX INFO: loaded from: classes30.dex */
public final class AmeProfileDesignerBannerConfigData {

    @C09CT("top_designer_banner_image_url")
    public final String topDesignerBannerImgUrl;

    @C09CT("top_designer_banner_route_schema")
    public final String topDesignerBannerRouteSchema;

    public AmeProfileDesignerBannerConfigData() {
        this("https://lf19-effect.tiktokcdn-us.com/obj/eden-va2/aulpsj_lth_rvarpa/ljhwZthlaukjlkulzlp/images/profile_top_designer_banner/top_designer_banner_left_img.png", "aweme://roma_redirect/?spark_page=ttep_designer_leaderboard");
    }

    public AmeProfileDesignerBannerConfigData(String str, String str2) {
        this.topDesignerBannerImgUrl = str;
        this.topDesignerBannerRouteSchema = str2;
    }
}
