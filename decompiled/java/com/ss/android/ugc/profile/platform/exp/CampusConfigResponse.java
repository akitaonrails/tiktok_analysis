package com.ss.android.ugc.profile.platform.exp;

import X.C09CT;

/* JADX INFO: loaded from: classes20.dex */
public final class CampusConfigResponse {

    @C09CT("background_url")
    public final String backgroundUrl;

    @C09CT("campus_profile_banner_icon_url")
    public final String campusProfileBannerIconUrl;

    @C09CT("disable_find_school_friends")
    public final boolean disableFindSchoolFriends;

    @C09CT("enabled")
    public final boolean enabled;

    @C09CT("fyp_anchor_show_threshold")
    public final int fypAnchorShowThreshold;

    @C09CT("fyp_anchor_view_without_click_threshold")
    public final int fypAnchorViewWithoutClickThreshold;

    @C09CT("graduation_year_max")
    public final int graduationYearMax;

    @C09CT("graduation_year_min")
    public final int graduationYearMin;

    @C09CT("learn_more_url")
    public final String learnMoreUrl;

    @C09CT("popup_illustration_bg_url")
    public final String popupIllustrationBgUrl;

    @C09CT("popup_illustration_bottom_url")
    public final String popupIllustrationBottomUrl;

    @C09CT("popup_illustration_top_url")
    public final String popupIllustrationTopUrl;

    @C09CT("school_friends_rec_impr_threshold")
    public final int schoolFriendsRecImprThreshold;

    @C09CT("unidays_privacy_policy_url")
    public final String unidaysPrivacyPolicyUrl;

    @C09CT("unidays_tos_url")
    public final String unidaysTosUrl;

    public CampusConfigResponse() {
        this("https://sf16-va.tiktokcdn.com/obj/eden-va2/yb_shpjvz_rvarpa/ljhwZthlaukjlkulzlp/BG", 2035, 1970, false, false, "https://www.myunidays.com/content/identity-privacy-policy", "https://www.myunidays.com/content/identity-terms-of-service", "https://www.tiktok.com/support/", 0, 10, 10, "https://sf16-sg.tiktokcdn.com/obj/eden-sg/yb_shpjvz_rvarpa/ljhwZthlaukjlkulzlp/intro_gradient", "https://sf16-sg.tiktokcdn.com/obj/eden-sg/yb_shpjvz_rvarpa/ljhwZthlaukjlkulzlp/intro_illustration_btm_layer", "https://sf16-sg.tiktokcdn.com/obj/eden-sg/yb_shpjvz_rvarpa/ljhwZthlaukjlkulzlp/intro_illustration_top_layer", "https://sf16-sg.tiktokcdn.com/obj/eden-sg/yb_shpjvz_rvarpa/ljhwZthlaukjlkulzlp/campus_icon.png");
    }

    public CampusConfigResponse(String str, int i, int i2, boolean z, boolean z2, String str2, String str3, String str4, int i3, int i4, int i5, String str5, String str6, String str7, String str8) {
        this.backgroundUrl = str;
        this.graduationYearMax = i;
        this.graduationYearMin = i2;
        this.enabled = z;
        this.disableFindSchoolFriends = z2;
        this.unidaysPrivacyPolicyUrl = str2;
        this.unidaysTosUrl = str3;
        this.learnMoreUrl = str4;
        this.schoolFriendsRecImprThreshold = i3;
        this.fypAnchorShowThreshold = i4;
        this.fypAnchorViewWithoutClickThreshold = i5;
        this.popupIllustrationBgUrl = str5;
        this.popupIllustrationBottomUrl = str6;
        this.popupIllustrationTopUrl = str7;
        this.campusProfileBannerIconUrl = str8;
    }
}
