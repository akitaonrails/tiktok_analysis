package com.ss.android.ugc.aweme.profile.model;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes20.dex */
public class CommerceUserInfo implements Serializable {

    @C09CT("account_promote_related")
    public int accountPromoteRelated;

    @C09CT("ad_authorization")
    public boolean adAuthorization;

    @C09CT("ad_experience_entry")
    public boolean adExperienceEntry;

    @C09CT("ad_experience_text")
    public String adExperienceText;

    @C09CT("ads_feedback_entry")
    public boolean adFeedbackEntry;

    @C09CT("ad_influencer_type")
    public int adInfluencerType;

    @C09CT("ad_revenue_rits")
    public List<Integer> adRevenueRits;

    @C09CT("ad_revenue_sharing")
    public boolean adRevenueSharing;

    @C09CT("clf_type")
    public int clfType;

    @C09CT("has_ads_entry")
    public boolean hasAdEntry;

    @C09CT("has_promote")
    public boolean hasPromote;

    @C09CT("has_tcm_entry")
    public boolean hasTcmEntry;

    @C09CT("is_ad_partner")
    public boolean isAdPartner;

    @C09CT("is_auction_ad_influencer")
    public boolean isAuctionAdInfluencer;

    @C09CT("link_user_info")
    public LinkUserInfoStruct linkUserInfo;

    @C09CT("notification_config")
    public int notificationConfig;

    @C09CT("promote_pay_type")
    public int promotePayType;

    @C09CT("show_star_atlas_cooperation")
    public boolean showStarAtlasCooperation;

    @C09CT("star_atlas")
    public int starAtlas;

    public String getAdExperienceText() {
        return this.adExperienceText;
    }

    public int getAdInfluencerType() {
        return this.adInfluencerType;
    }

    public List<Integer> getAdRevenueRits() {
        return this.adRevenueRits;
    }

    public int getClfType() {
        return this.clfType;
    }

    public LinkUserInfoStruct getLinkUserInfo() {
        return this.linkUserInfo;
    }

    public int getNotificationConfig() {
        return this.notificationConfig;
    }

    public int getPromotePayType() {
        return this.promotePayType;
    }

    public int getStarAtlas() {
        return this.starAtlas;
    }

    public boolean isAdPartner() {
        return this.isAdPartner;
    }

    public boolean isAdRevenueSharing() {
        return this.adRevenueSharing;
    }

    public boolean isAuctionAdInfluencer() {
        return this.isAuctionAdInfluencer;
    }

    public boolean isHasAdExperienceEntry() {
        return this.adExperienceEntry;
    }

    public boolean isHasAdFeedbackEntry() {
        return this.adFeedbackEntry;
    }

    public boolean isHasTcmEntry() {
        return this.hasTcmEntry;
    }

    public boolean isShowStarAtlasCooperation() {
        return this.showStarAtlasCooperation;
    }

    public void setAdExperienceText(String str) {
        this.adExperienceText = str;
    }

    public void setNotificationConfig(int i) {
        this.notificationConfig = i;
    }
}
