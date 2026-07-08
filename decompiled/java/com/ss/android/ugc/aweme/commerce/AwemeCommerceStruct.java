package com.ss.android.ugc.aweme.commerce;

import X.C09CS;
import X.C09CT;
import com.ss.android.ugc.aweme.commerce.model.MissionItemStatus;
import com.ss.android.ugc.aweme.commerce.model.UnderWaterInfo;
import com.ss.android.ugc.aweme.commercialize.model.DouplusToastStructV3;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.utils.StringJsonAdapterFactory;
import java.io.Serializable;

/* JADX INFO: loaded from: classes36.dex */
public class AwemeCommerceStruct implements Serializable, Cloneable {

    @C09CT("ad_event_type")
    public int adEventType;

    @C09CT("ad_extra_msg")
    public String adExtraMsg;

    @C09CT("entrance")
    public String adFeedBackEntrance;

    @C09CT("ad_id")
    public String adId;

    @C09CT("ad_auth_status")
    public int ad_auth_status;

    @C09CT("ad_source")
    public int ad_source;

    @C09CT("advertiser_id")
    public String advId;

    @C09CT("adv_promotable")
    public boolean adv_promotable;

    @C09CT("auction_ad_invited")
    public boolean auction_ad_invited;

    @C09CT("avoid_global_pendant")
    public boolean avoid_global_pendant;

    @C09CT("bc_label_test_text")
    public String bcHashtagText;

    @C09CT("biz_account")
    public BizAccountInfo bizAccountInfo;

    @C09CT("brand_organic_type")
    public long brandOrganicType;

    @C09CT("branded_content_type")
    public long brandedContentType;

    @C09CT("card_infos")
    public CardStruct cardStruct;

    @C09CT("commerce_label_info")
    public CommerceLabelInfo commerceLabelInfo;

    @C09CT("commerce_traffic_type")
    public String commerceTrafficType;

    @C09CT("creative_id")
    public String creativeId;

    @C09CT("dark_post_source")
    public int darkPostSource;

    @C09CT("dark_post_status")
    public int darkPostStatus;

    @C09CT("digg_show_scene")
    public int diggShowScene;

    @C09CT("disable_mid_roll_status_code")
    public int disableMidRollStatusCode;

    @C09CT("douplus_toast")
    public DouplusToastStructV3 douplus_toast;

    @C09CT("bc_label_test_text_for_gecc")
    public String ecSearchBoBcLabelText;

    @C09CT("enable_ad_star_hub")
    public boolean enableAdStarHub;

    @C09CT("enable_mid_roll")
    public boolean enableMidRoll;

    @C09CT("favorite_show_scene")
    public int favoriteShowScene;

    @C09CT("feedback_submitted")
    public boolean hasUserSubmittedFeedback;

    @C09CT("mid_roll_replace_time")
    public long insertAdTime;

    @C09CT("is_contextual_ad")
    public boolean isContextualAd;

    @C09CT("is_diversion_ad")
    public boolean isDiversionAd;

    @C09CT("is_music_not_clickable")
    public boolean isMusicNotClickable;

    @C09CT("is_personal_page_forbidden")
    public boolean isPersonalPageForbidden;

    @C09CT("is_pseudo_ad")
    public boolean isPseudoAd;

    @C09CT("item_id")
    public String itemId;

    @C09CT("last_view_time")
    public long lastViewTime;

    @C09CT("mid_roll_type")
    public int midRollType;

    @C09CT("mission_id")
    public long missionId;

    @C09CT("mission_item_status")
    public MissionItemStatus missionItemStatus;

    @C09CT("organic_log_extra")
    public String organicLogExtra;

    @C09CT("prevent_delete")
    public boolean preventDelete;

    @C09CT("prevent_friend_see")
    public boolean preventFriendSee;

    @C09CT("prevent_mission_duet_private")
    public boolean preventMissionDuetPrivate;

    @C09CT("prevent_privacy_reason")
    public String preventPrivacyReason;

    @C09CT("prevent_self_see")
    public boolean preventSelfSee;

    @C09CT("prevent_share")
    public boolean preventShare;

    @C09CT("pseudo_ad_data")
    public AwemeRawAd pseudoAdData;

    @C09CT("mid_roll_request_time")
    public long requestMidAdTime;

    @C09CT("mid_roll_request_time_before_end")
    public long requestMidAdTimeBeforeEnd;

    @C09CT("send_notice_time")
    public int sendNoticeTime;

    @C09CT("show_share_link")
    public boolean show_share_link;

    @C09CT("study_id")
    public String studyId;

    @C09CT("style_info")
    @C09CS(StringJsonAdapterFactory.class)
    public AwemeRawAd styleInfo;

    @C09CT("under_water")
    public UnderWaterInfo underWaterInfo;

    @C09CT("with_comment_filter_words")
    public boolean withCommentFilterWords;

    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public AwemeCommerceStruct m172clone() {
        AwemeCommerceStruct awemeCommerceStruct = new AwemeCommerceStruct();
        awemeCommerceStruct.ad_auth_status = this.ad_auth_status;
        awemeCommerceStruct.ad_source = this.ad_source;
        awemeCommerceStruct.avoid_global_pendant = this.avoid_global_pendant;
        awemeCommerceStruct.show_share_link = this.show_share_link;
        awemeCommerceStruct.douplus_toast = this.douplus_toast;
        awemeCommerceStruct.auction_ad_invited = this.auction_ad_invited;
        awemeCommerceStruct.withCommentFilterWords = this.withCommentFilterWords;
        awemeCommerceStruct.adv_promotable = this.adv_promotable;
        awemeCommerceStruct.preventDelete = this.preventDelete;
        awemeCommerceStruct.preventSelfSee = this.preventSelfSee;
        awemeCommerceStruct.preventMissionDuetPrivate = this.preventMissionDuetPrivate;
        awemeCommerceStruct.preventFriendSee = this.preventFriendSee;
        awemeCommerceStruct.preventPrivacyReason = this.preventPrivacyReason;
        awemeCommerceStruct.preventShare = this.preventShare;
        awemeCommerceStruct.cardStruct = this.cardStruct;
        awemeCommerceStruct.hasUserSubmittedFeedback = this.hasUserSubmittedFeedback;
        awemeCommerceStruct.lastViewTime = this.lastViewTime;
        awemeCommerceStruct.isMusicNotClickable = this.isMusicNotClickable;
        awemeCommerceStruct.isPersonalPageForbidden = this.isPersonalPageForbidden;
        awemeCommerceStruct.darkPostSource = this.darkPostSource;
        awemeCommerceStruct.darkPostStatus = this.darkPostStatus;
        awemeCommerceStruct.missionId = this.missionId;
        awemeCommerceStruct.missionItemStatus = this.missionItemStatus;
        awemeCommerceStruct.itemId = this.itemId;
        awemeCommerceStruct.advId = this.advId;
        awemeCommerceStruct.adId = this.adId;
        awemeCommerceStruct.creativeId = this.creativeId;
        awemeCommerceStruct.studyId = this.studyId;
        awemeCommerceStruct.bizAccountInfo = this.bizAccountInfo;
        awemeCommerceStruct.adEventType = this.adEventType;
        awemeCommerceStruct.bcHashtagText = this.bcHashtagText;
        awemeCommerceStruct.ecSearchBoBcLabelText = this.ecSearchBoBcLabelText;
        awemeCommerceStruct.commerceLabelInfo = this.commerceLabelInfo;
        awemeCommerceStruct.adFeedBackEntrance = this.adFeedBackEntrance;
        awemeCommerceStruct.sendNoticeTime = this.sendNoticeTime;
        awemeCommerceStruct.diggShowScene = this.diggShowScene;
        awemeCommerceStruct.favoriteShowScene = this.favoriteShowScene;
        awemeCommerceStruct.enableMidRoll = this.enableMidRoll;
        awemeCommerceStruct.insertAdTime = this.insertAdTime;
        awemeCommerceStruct.requestMidAdTime = this.requestMidAdTime;
        awemeCommerceStruct.midRollType = this.midRollType;
        awemeCommerceStruct.requestMidAdTimeBeforeEnd = this.requestMidAdTimeBeforeEnd;
        awemeCommerceStruct.disableMidRollStatusCode = this.disableMidRollStatusCode;
        awemeCommerceStruct.isPseudoAd = this.isPseudoAd;
        awemeCommerceStruct.pseudoAdData = this.pseudoAdData;
        awemeCommerceStruct.isContextualAd = this.isContextualAd;
        awemeCommerceStruct.isDiversionAd = this.isDiversionAd;
        awemeCommerceStruct.commerceTrafficType = this.commerceTrafficType;
        awemeCommerceStruct.styleInfo = this.styleInfo;
        awemeCommerceStruct.enableAdStarHub = this.enableAdStarHub;
        awemeCommerceStruct.underWaterInfo = this.underWaterInfo;
        return awemeCommerceStruct;
    }

    public Integer getMissionItemStatus() {
        MissionItemStatus missionItemStatus = this.missionItemStatus;
        if (missionItemStatus == null) {
            return null;
        }
        return Integer.valueOf(missionItemStatus.getStatus());
    }

    public boolean isBrandOrganicContent() {
        return this.brandOrganicType > 0;
    }

    public boolean isBrandedContent() {
        return this.brandedContentType > 0;
    }

    public int getAdEventType() {
        return this.adEventType;
    }

    public String getAdExtraMsg() {
        return this.adExtraMsg;
    }

    public String getAdFeedBackEntrance() {
        return this.adFeedBackEntrance;
    }

    public String getAdId() {
        return this.adId;
    }

    public int getAdSource() {
        return this.ad_source;
    }

    public String getAdvId() {
        return this.advId;
    }

    public int getAuthStatus() {
        return this.ad_auth_status;
    }

    public String getBCHashtag() {
        return this.bcHashtagText;
    }

    public BizAccountInfo getBizAccountInfo() {
        return this.bizAccountInfo;
    }

    public CardStruct getCardStruct() {
        return this.cardStruct;
    }

    public CommerceLabelInfo getCommerceLabelInfo() {
        return this.commerceLabelInfo;
    }

    public String getCommerceTrafficType() {
        return this.commerceTrafficType;
    }

    public String getCreativeId() {
        return this.creativeId;
    }

    public int getDarkPostSource() {
        return this.darkPostSource;
    }

    public int getDarkPostStatus() {
        return this.darkPostStatus;
    }

    public int getDiggShowScene() {
        return this.diggShowScene;
    }

    public int getDisableMidRollStatusCode() {
        return this.disableMidRollStatusCode;
    }

    public DouplusToastStructV3 getDouplusToast() {
        return this.douplus_toast;
    }

    public String getEcSearchBoBcLabelText() {
        return this.ecSearchBoBcLabelText;
    }

    public int getFavoriteShowScene() {
        return this.favoriteShowScene;
    }

    public long getInsertAdTime() {
        return this.insertAdTime;
    }

    public String getItemId() {
        return this.itemId;
    }

    public long getLastViewTime() {
        return this.lastViewTime;
    }

    public int getMidRollType() {
        return this.midRollType;
    }

    public long getMissionId() {
        return this.missionId;
    }

    public MissionItemStatus getMissionItemStatusEnum() {
        return this.missionItemStatus;
    }

    public String getOrganicLogExtra() {
        return this.organicLogExtra;
    }

    public String getPreventPrivacyReason() {
        return this.preventPrivacyReason;
    }

    public AwemeRawAd getPseudoAdData() {
        return this.pseudoAdData;
    }

    public long getRequestMidAdTime() {
        return this.requestMidAdTime;
    }

    public long getRequestMidAdTimeBeforeEnd() {
        return this.requestMidAdTimeBeforeEnd;
    }

    public int getSendNoticeTime() {
        return this.sendNoticeTime;
    }

    public String getStudyId() {
        return this.studyId;
    }

    public AwemeRawAd getStyleInfo() {
        return this.styleInfo;
    }

    public UnderWaterInfo getUnderWaterInfo() {
        return this.underWaterInfo;
    }

    public boolean isAdvPromotable() {
        return this.adv_promotable;
    }

    public boolean isAuctionAdInvited() {
        return this.auction_ad_invited;
    }

    public boolean isAvoidGlobalPendant() {
        return this.avoid_global_pendant;
    }

    public boolean isContextualAd() {
        return this.isContextualAd;
    }

    public boolean isDiversionAd() {
        return this.isDiversionAd;
    }

    public boolean isEnableAdStarHub() {
        return this.enableAdStarHub;
    }

    public boolean isEnableMidRoll() {
        return this.enableMidRoll;
    }

    public boolean isHasUserSubmittedFeedback() {
        return this.hasUserSubmittedFeedback;
    }

    public boolean isMusicNotClickable() {
        return this.isMusicNotClickable;
    }

    public boolean isPersonalPageForbidden() {
        return this.isPersonalPageForbidden;
    }

    public boolean isPreventDelete() {
        return this.preventDelete;
    }

    public boolean isPreventFriendSee() {
        return this.preventFriendSee;
    }

    public boolean isPreventMissionDuetPrivate() {
        return this.preventMissionDuetPrivate;
    }

    public boolean isPreventSelfSee() {
        return this.preventSelfSee;
    }

    public boolean isPreventShare() {
        return this.preventShare;
    }

    public boolean isPseudoAd() {
        return this.isPseudoAd;
    }

    public boolean isShowShareLink() {
        return this.show_share_link;
    }

    public boolean isWithCommentFilterWords() {
        return this.withCommentFilterWords;
    }

    public void setAdId(String str) {
        this.adId = str;
    }

    public void setAdvId(String str) {
        this.advId = str;
    }

    public void setAdvPromotable(boolean z) {
        this.adv_promotable = z;
    }

    public void setBrandOrganicType(long j) {
        this.brandOrganicType = j;
    }

    public void setBrandedContentType(long j) {
        this.brandedContentType = j;
    }

    public void setCardStruct(CardStruct cardStruct) {
        this.cardStruct = cardStruct;
    }

    public void setCreativeId(String str) {
        this.creativeId = str;
    }

    public void setDarkPostSource(int i) {
        this.darkPostSource = i;
    }

    public void setDarkPostStatus(int i) {
        this.darkPostStatus = i;
    }

    public void setDiggShowScene(int i) {
        this.diggShowScene = i;
    }

    public void setEnableAdStarHub(boolean z) {
        this.enableAdStarHub = z;
    }

    public void setFavoriteShowScene(int i) {
        this.favoriteShowScene = i;
    }

    public void setHasUserSubmittedFeedback(boolean z) {
        this.hasUserSubmittedFeedback = z;
    }

    public void setItemId(String str) {
        this.itemId = str;
    }

    public void setLastViewTime(long j) {
        this.lastViewTime = j;
    }

    public void setMissionId(long j) {
        this.missionId = j;
    }

    public void setMissionItemStatus(MissionItemStatus missionItemStatus) {
        this.missionItemStatus = missionItemStatus;
    }

    public void setMusicNotClickable(boolean z) {
        this.isMusicNotClickable = z;
    }

    public void setPersonalPageForbidden(boolean z) {
        this.isPersonalPageForbidden = z;
    }

    public void setPreventDelete(boolean z) {
        this.preventDelete = z;
    }

    public void setPreventFriendSee(boolean z) {
        this.preventFriendSee = z;
    }

    public void setPreventMissionDuetPrivate(boolean z) {
        this.preventMissionDuetPrivate = z;
    }

    public void setPreventPrivacyReason(String str) {
        this.preventPrivacyReason = str;
    }

    public void setPreventSelfSee(boolean z) {
        this.preventSelfSee = z;
    }

    public void setPreventShare(boolean z) {
        this.preventShare = z;
    }

    public void setSendNoticeTime(int i) {
        this.sendNoticeTime = i;
    }

    public void setStyleInfo(AwemeRawAd awemeRawAd) {
        this.styleInfo = awemeRawAd;
    }

    public void setUnderWaterInfo(UnderWaterInfo underWaterInfo) {
        this.underWaterInfo = underWaterInfo;
    }

    public void setWithCommentFilterWords(boolean z) {
        this.withCommentFilterWords = z;
    }
}
