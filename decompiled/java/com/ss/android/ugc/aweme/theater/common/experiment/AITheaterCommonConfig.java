package com.ss.android.ugc.aweme.theater.common.experiment;

import X.C09CT;
import X.C786410Ut5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class AITheaterCommonConfig {

    @C09CT("about_ai_self_slug")
    public final String aboutAiSelfSlug;

    @C09CT("asset_tab_has_button")
    public final boolean assetTabHasButton;

    @C09CT("click_num_to_make_cast_banner_never_show")
    public final int clickNumToMakeCastBannerNeverShow;

    @C09CT("daily_banner_show_limit")
    public final int dailyBannerShowLimit;

    @C09CT("edit_toolbar_entrance_enable")
    public final boolean editToolbarEntranceEnable;

    @C09CT("enable_video_need_token")
    public final boolean enableVideoNeedToken;

    @C09CT("gatekeeper_feature_id")
    public final String gatekeeperFeatureId;

    @C09CT("input_force_insert_mention_enable")
    public final boolean inputForceInsertMentionEnable;

    @C09CT("learn_more_slug")
    public final String learnMoreSlug;

    @C09CT("learn_more_slug_us")
    public final String learnMoreSlugUs;

    @C09CT("max_input_char_count")
    public final int maxInputCharCount;

    @C09CT("max_mention_user_count")
    public final int maxMentionCount;

    @C09CT("not_click_banner_num_to_make_it_disappear_3_days")
    public final int notClickBannerNumToMakeItDisappear3Days;

    @C09CT("record_subtab_entrance_enable")
    public final boolean recordSubtabEntranceEnable;

    @C09CT("record_toolbar_entrance_enable")
    public final boolean recordToolbarEntranceEnable;

    @C09CT("show_model_name_in_banner")
    public final boolean showModelNameInBanner;

    @C09CT("show_model_name_in_subtitle")
    public final boolean showModelNameInSubtitle;

    @C09CT("support_follow_path_to_create_new")
    public final boolean supportFollowPathToCreateNew;

    @C09CT("upload_photo_max_edge")
    public final int uploadPhotoMaxEdge;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AITheaterCommonConfig)) {
            return false;
        }
        AITheaterCommonConfig aITheaterCommonConfig = (AITheaterCommonConfig) obj;
        return this.uploadPhotoMaxEdge == aITheaterCommonConfig.uploadPhotoMaxEdge && this.maxMentionCount == aITheaterCommonConfig.maxMentionCount && this.recordToolbarEntranceEnable == aITheaterCommonConfig.recordToolbarEntranceEnable && this.recordSubtabEntranceEnable == aITheaterCommonConfig.recordSubtabEntranceEnable && this.maxInputCharCount == aITheaterCommonConfig.maxInputCharCount && this.assetTabHasButton == aITheaterCommonConfig.assetTabHasButton && Intrinsics.LJFF(this.learnMoreSlug, aITheaterCommonConfig.learnMoreSlug) && Intrinsics.LJFF(this.learnMoreSlugUs, aITheaterCommonConfig.learnMoreSlugUs) && Intrinsics.LJFF(this.aboutAiSelfSlug, aITheaterCommonConfig.aboutAiSelfSlug) && this.clickNumToMakeCastBannerNeverShow == aITheaterCommonConfig.clickNumToMakeCastBannerNeverShow && this.notClickBannerNumToMakeItDisappear3Days == aITheaterCommonConfig.notClickBannerNumToMakeItDisappear3Days && this.dailyBannerShowLimit == aITheaterCommonConfig.dailyBannerShowLimit && this.showModelNameInBanner == aITheaterCommonConfig.showModelNameInBanner && this.showModelNameInSubtitle == aITheaterCommonConfig.showModelNameInSubtitle && this.editToolbarEntranceEnable == aITheaterCommonConfig.editToolbarEntranceEnable && this.inputForceInsertMentionEnable == aITheaterCommonConfig.inputForceInsertMentionEnable && this.supportFollowPathToCreateNew == aITheaterCommonConfig.supportFollowPathToCreateNew && Intrinsics.LJFF(this.gatekeeperFeatureId, aITheaterCommonConfig.gatekeeperFeatureId) && this.enableVideoNeedToken == aITheaterCommonConfig.enableVideoNeedToken;
    }

    public final int hashCode() {
        return (((((((((((((((((((((((((((((((((((this.uploadPhotoMaxEdge * 31) + this.maxMentionCount) * 31) + C786410Ut5.Z2(this.recordToolbarEntranceEnable)) * 31) + C786410Ut5.Z2(this.recordSubtabEntranceEnable)) * 31) + this.maxInputCharCount) * 31) + C786410Ut5.Z2(this.assetTabHasButton)) * 31) + this.learnMoreSlug.hashCode()) * 31) + this.learnMoreSlugUs.hashCode()) * 31) + this.aboutAiSelfSlug.hashCode()) * 31) + this.clickNumToMakeCastBannerNeverShow) * 31) + this.notClickBannerNumToMakeItDisappear3Days) * 31) + this.dailyBannerShowLimit) * 31) + C786410Ut5.Z2(this.showModelNameInBanner)) * 31) + C786410Ut5.Z2(this.showModelNameInSubtitle)) * 31) + C786410Ut5.Z2(this.editToolbarEntranceEnable)) * 31) + C786410Ut5.Z2(this.inputForceInsertMentionEnable)) * 31) + C786410Ut5.Z2(this.supportFollowPathToCreateNew)) * 31) + this.gatekeeperFeatureId.hashCode()) * 31) + C786410Ut5.Z2(this.enableVideoNeedToken);
    }

    public final String toString() {
        return "AITheaterCommonConfig(uploadPhotoMaxEdge=" + this.uploadPhotoMaxEdge + ", maxMentionCount=" + this.maxMentionCount + ", recordToolbarEntranceEnable=" + this.recordToolbarEntranceEnable + ", recordSubtabEntranceEnable=" + this.recordSubtabEntranceEnable + ", maxInputCharCount=" + this.maxInputCharCount + ", assetTabHasButton=" + this.assetTabHasButton + ", learnMoreSlug=" + this.learnMoreSlug + ", learnMoreSlugUs=" + this.learnMoreSlugUs + ", aboutAiSelfSlug=" + this.aboutAiSelfSlug + ", clickNumToMakeCastBannerNeverShow=" + this.clickNumToMakeCastBannerNeverShow + ", notClickBannerNumToMakeItDisappear3Days=" + this.notClickBannerNumToMakeItDisappear3Days + ", dailyBannerShowLimit=" + this.dailyBannerShowLimit + ", showModelNameInBanner=" + this.showModelNameInBanner + ", showModelNameInSubtitle=" + this.showModelNameInSubtitle + ", editToolbarEntranceEnable=" + this.editToolbarEntranceEnable + ", inputForceInsertMentionEnable=" + this.inputForceInsertMentionEnable + ", supportFollowPathToCreateNew=" + this.supportFollowPathToCreateNew + ", gatekeeperFeatureId=" + this.gatekeeperFeatureId + ", enableVideoNeedToken=" + this.enableVideoNeedToken + ')';
    }

    public AITheaterCommonConfig() {
        this(1920, 3, true, false, 500, true, "ai-theater-learn-more", "ai-theater-learn-more-us", "about-ai-self", 15, Integer.MAX_VALUE, Integer.MAX_VALUE, false, false, true, true, false, "uas_2038", true);
    }

    public AITheaterCommonConfig(int i, int i2, boolean z, boolean z2, int i3, boolean z3, String str, String str2, String str3, int i4, int i5, int i6, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, String str4, boolean z9) {
        this.uploadPhotoMaxEdge = i;
        this.maxMentionCount = i2;
        this.recordToolbarEntranceEnable = z;
        this.recordSubtabEntranceEnable = z2;
        this.maxInputCharCount = i3;
        this.assetTabHasButton = z3;
        this.learnMoreSlug = str;
        this.learnMoreSlugUs = str2;
        this.aboutAiSelfSlug = str3;
        this.clickNumToMakeCastBannerNeverShow = i4;
        this.notClickBannerNumToMakeItDisappear3Days = i5;
        this.dailyBannerShowLimit = i6;
        this.showModelNameInBanner = z4;
        this.showModelNameInSubtitle = z5;
        this.editToolbarEntranceEnable = z6;
        this.inputForceInsertMentionEnable = z7;
        this.supportFollowPathToCreateNew = z8;
        this.gatekeeperFeatureId = str4;
        this.enableVideoNeedToken = z9;
    }
}
