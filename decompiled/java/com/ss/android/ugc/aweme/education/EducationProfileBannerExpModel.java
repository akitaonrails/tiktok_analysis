package com.ss.android.ugc.aweme.education;

import X.C09CT;

/* JADX INFO: loaded from: classes35.dex */
public final class EducationProfileBannerExpModel {

    @C09CT("activity_id")
    public final String activityId;

    @C09CT("banner_text")
    public final String bannerText;

    @C09CT("button_text")
    public final String buttonText;

    @C09CT("scheme")
    public final String scheme;

    @C09CT("subTitle_text")
    public final String subTitleText;

    @C09CT("title_text")
    public final String titleText;

    @C09CT("user_id_cohort")
    public final String userIdCohort;

    public EducationProfileBannerExpModel() {
        this("", "", "", "", "", "", "");
    }

    public EducationProfileBannerExpModel(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.titleText = str;
        this.subTitleText = str2;
        this.buttonText = str3;
        this.activityId = str4;
        this.bannerText = str5;
        this.userIdCohort = str6;
        this.scheme = str7;
    }
}
