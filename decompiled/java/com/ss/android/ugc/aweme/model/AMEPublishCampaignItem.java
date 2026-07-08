package com.ss.android.ugc.aweme.model;

import X.C09CT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class AMEPublishCampaignItem {

    @C09CT("activity_deadline")
    public final String activityDeadline;

    @C09CT("activity_id")
    public final String activityId;

    @C09CT("activity_large_banner_dark_mode_url")
    public final String activityLargeBannerDarkModeUrl;

    @C09CT("activity_large_banner_light_mode_url")
    public final String activityLargeBannerLightModeUrl;

    @C09CT("activity_large_banner_text")
    public final String activityLargeBannerText;

    @C09CT("activity_medium_banner_dark_mode_url")
    public final String activityMediumBannerDarkModeUrl;

    @C09CT("activity_medium_banner_light_mode_url")
    public final String activityMediumBannerLightModeUrl;

    @C09CT("activity_page_schema")
    public final String activityPageSchema;

    @C09CT("activity_small_banner_dark_mode_url")
    public final String activitySmallBannerDarkModeUrl;

    @C09CT("activity_small_banner_light_mode_url")
    public final String activitySmallBannerLightModeUrl;

    @C09CT("activity_medium_banner_text")
    public final String activitySmallBannerText;

    @C09CT("activity_title")
    public final String activityTitle;

    @C09CT("end_timestamp")
    public final long endTimestamp;

    @C09CT("start_timestamp")
    public final long startTimestamp;

    public AMEPublishCampaignItem() {
        this(null, null, null, null, null, null, null, null, null, null, null, 0L, 0L, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AMEPublishCampaignItem)) {
            return false;
        }
        AMEPublishCampaignItem aMEPublishCampaignItem = (AMEPublishCampaignItem) obj;
        return Intrinsics.LJFF(this.activityId, aMEPublishCampaignItem.activityId) && Intrinsics.LJFF(this.activityTitle, aMEPublishCampaignItem.activityTitle) && Intrinsics.LJFF(this.activityDeadline, aMEPublishCampaignItem.activityDeadline) && Intrinsics.LJFF(this.activityLargeBannerLightModeUrl, aMEPublishCampaignItem.activityLargeBannerLightModeUrl) && Intrinsics.LJFF(this.activityMediumBannerLightModeUrl, aMEPublishCampaignItem.activityMediumBannerLightModeUrl) && Intrinsics.LJFF(this.activitySmallBannerLightModeUrl, aMEPublishCampaignItem.activitySmallBannerLightModeUrl) && Intrinsics.LJFF(this.activityLargeBannerDarkModeUrl, aMEPublishCampaignItem.activityLargeBannerDarkModeUrl) && Intrinsics.LJFF(this.activityMediumBannerDarkModeUrl, aMEPublishCampaignItem.activityMediumBannerDarkModeUrl) && Intrinsics.LJFF(this.activitySmallBannerDarkModeUrl, aMEPublishCampaignItem.activitySmallBannerDarkModeUrl) && Intrinsics.LJFF(this.activityLargeBannerText, aMEPublishCampaignItem.activityLargeBannerText) && Intrinsics.LJFF(this.activitySmallBannerText, aMEPublishCampaignItem.activitySmallBannerText) && this.startTimestamp == aMEPublishCampaignItem.startTimestamp && this.endTimestamp == aMEPublishCampaignItem.endTimestamp && Intrinsics.LJFF(this.activityPageSchema, aMEPublishCampaignItem.activityPageSchema);
    }

    public final String toString() {
        return "AMEPublishCampaignItem(activityId=" + this.activityId + ", activityTitle=" + this.activityTitle + ", activityDeadline=" + this.activityDeadline + ", activityLargeBannerLightModeUrl=" + this.activityLargeBannerLightModeUrl + ", activityMediumBannerLightModeUrl=" + this.activityMediumBannerLightModeUrl + ", activitySmallBannerLightModeUrl=" + this.activitySmallBannerLightModeUrl + ", activityLargeBannerDarkModeUrl=" + this.activityLargeBannerDarkModeUrl + ", activityMediumBannerDarkModeUrl=" + this.activityMediumBannerDarkModeUrl + ", activitySmallBannerDarkModeUrl=" + this.activitySmallBannerDarkModeUrl + ", activityLargeBannerText=" + this.activityLargeBannerText + ", activitySmallBannerText=" + this.activitySmallBannerText + ", startTimestamp=" + this.startTimestamp + ", endTimestamp=" + this.endTimestamp + ", activityPageSchema=" + this.activityPageSchema + ')';
    }

    public AMEPublishCampaignItem(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, long j, long j2, String str12) {
        this.activityId = str;
        this.activityTitle = str2;
        this.activityDeadline = str3;
        this.activityLargeBannerLightModeUrl = str4;
        this.activityMediumBannerLightModeUrl = str5;
        this.activitySmallBannerLightModeUrl = str6;
        this.activityLargeBannerDarkModeUrl = str7;
        this.activityMediumBannerDarkModeUrl = str8;
        this.activitySmallBannerDarkModeUrl = str9;
        this.activityLargeBannerText = str10;
        this.activitySmallBannerText = str11;
        this.startTimestamp = j;
        this.endTimestamp = j2;
        this.activityPageSchema = str12;
    }
}
