package com.ss.android.ugc.aweme.commercialize.model;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public final class AboutAdInfo implements Serializable {

    @C09CT("advertiser_items")
    public final List<AboutAdInfoItem> advertiserItem;

    @C09CT("match_audience_tags")
    public final String audienceTags;

    @C09CT("about_this_ad_items")
    public final List<AboutAdInfoItem> contentItem;

    @C09CT("about_this_ad_content_type")
    public Integer contentType;

    @C09CT("country_code")
    public final String countryCode;

    @C09CT("about_this_ad_feedback_response")
    public String feedbackResponseText;

    @C09CT("about_this_ad_feedback")
    public String feedbackText;

    @C09CT("about_this_ad_feedback_btn_no")
    public String feedbackValueNo;

    @C09CT("about_this_ad_feedback_btn_yes")
    public String feedbackValueYes;

    @C09CT("geo_id")
    public final String geoId;

    @C09CT("about_this_ad_adjust_settings")
    public String linkText;

    @C09CT("business_en_name_used")
    public final Boolean showQuestionMark;

    @C09CT("about_this_ad_title")
    public String title;

    public AboutAdInfo() {
        this(0, "", "", "", "", "", "", null, null, "", "", "", Boolean.FALSE);
    }

    public final List<AboutAdInfoItem> getAdvertiserItem() {
        return this.advertiserItem;
    }

    public final String getAudienceTags() {
        return this.audienceTags;
    }

    public final List<AboutAdInfoItem> getContentItem() {
        return this.contentItem;
    }

    public final Integer getContentType() {
        return this.contentType;
    }

    public final String getCountryCode() {
        return this.countryCode;
    }

    public final String getFeedbackResponseText() {
        return this.feedbackResponseText;
    }

    public final String getFeedbackText() {
        return this.feedbackText;
    }

    public final String getFeedbackValueNo() {
        return this.feedbackValueNo;
    }

    public final String getFeedbackValueYes() {
        return this.feedbackValueYes;
    }

    public final String getGeoId() {
        return this.geoId;
    }

    public final String getLinkText() {
        return this.linkText;
    }

    public final Boolean getShowQuestionMark() {
        return this.showQuestionMark;
    }

    public final String getTitle() {
        return this.title;
    }

    public final void setContentType(Integer num) {
        this.contentType = num;
    }

    public final void setFeedbackResponseText(String str) {
        this.feedbackResponseText = str;
    }

    public final void setFeedbackText(String str) {
        this.feedbackText = str;
    }

    public final void setFeedbackValueNo(String str) {
        this.feedbackValueNo = str;
    }

    public final void setFeedbackValueYes(String str) {
        this.feedbackValueYes = str;
    }

    public final void setLinkText(String str) {
        this.linkText = str;
    }

    public final void setTitle(String str) {
        this.title = str;
    }

    public AboutAdInfo(Integer num, String str, String str2, String str3, String str4, String str5, String str6, List<AboutAdInfoItem> list, List<AboutAdInfoItem> list2, String str7, String str8, String str9, Boolean bool) {
        this.contentType = num;
        this.title = str;
        this.linkText = str2;
        this.feedbackText = str3;
        this.feedbackValueYes = str4;
        this.feedbackValueNo = str5;
        this.feedbackResponseText = str6;
        this.contentItem = list;
        this.advertiserItem = list2;
        this.geoId = str7;
        this.countryCode = str8;
        this.audienceTags = str9;
        this.showQuestionMark = bool;
    }
}
