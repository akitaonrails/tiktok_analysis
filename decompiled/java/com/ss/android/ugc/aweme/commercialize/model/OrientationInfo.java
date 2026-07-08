package com.ss.android.ugc.aweme.commercialize.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes29.dex */
public final class OrientationInfo implements Serializable {
    public String buttonText;

    @C09CT("disable_text")
    public String disableText;

    @C09CT("enable_text")
    public String enableText;

    @C09CT("orientation_track")
    public String eventTrackingText;

    @C09CT("orientation_text")
    public String fullText;

    @C09CT("geo_country_type")
    public String geoCountryType;

    @C09CT("info_type")
    public Integer infoType;
    public Boolean isLastItem;
    public String itemDescription;
    public Integer itemType;

    @C09CT("orientation_item")
    public String linkText;

    @C09CT("url")
    public String linkUrl;
    public Boolean showQuestionMark;

    /* JADX INFO: renamed from: switch, reason: not valid java name */
    @C09CT("switch")
    public Integer f50switch;
    public String title;

    public OrientationInfo() {
        this(0, "", "", "", "", "", "", "", 0, "", 0, Boolean.FALSE, "", Boolean.FALSE, "");
    }

    public final OrientationInfo copy(Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, Integer num2, String str8, Integer num3, Boolean bool, String str9, Boolean bool2, String str10) {
        return new OrientationInfo(num, str, str2, str3, str4, str5, str6, str7, num2, str8, num3, bool, str9, bool2, str10);
    }

    public final Boolean isLastItem() {
        return this.isLastItem;
    }

    public final void setButtonText(String str) {
        this.buttonText = str;
    }

    public final void setDisableText(String str) {
        this.disableText = str;
    }

    public final void setEnableText(String str) {
        this.enableText = str;
    }

    public final void setEventTrackingText(String str) {
        this.eventTrackingText = str;
    }

    public final void setFullText(String str) {
        this.fullText = str;
    }

    public final void setGeoCountryType(String str) {
        this.geoCountryType = str;
    }

    public final void setInfoType(Integer num) {
        this.infoType = num;
    }

    public final void setItemDescription(String str) {
        this.itemDescription = str;
    }

    public final void setItemType(Integer num) {
        this.itemType = num;
    }

    public final void setLastItem(Boolean bool) {
        this.isLastItem = bool;
    }

    public final void setLinkText(String str) {
        this.linkText = str;
    }

    public final void setLinkUrl(String str) {
        this.linkUrl = str;
    }

    public final void setShowQuestionMark(Boolean bool) {
        this.showQuestionMark = bool;
    }

    public final void setSwitch(Integer num) {
        this.f50switch = num;
    }

    public final void setTitle(String str) {
        this.title = str;
    }

    public OrientationInfo(Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, Integer num2, String str8, Integer num3, Boolean bool, String str9, Boolean bool2, String str10) {
        this.infoType = num;
        this.fullText = str;
        this.linkUrl = str2;
        this.linkText = str3;
        this.eventTrackingText = str4;
        this.geoCountryType = str5;
        this.enableText = str6;
        this.disableText = str7;
        this.f50switch = num2;
        this.title = str8;
        this.itemType = num3;
        this.isLastItem = bool;
        this.buttonText = str9;
        this.showQuestionMark = bool2;
        this.itemDescription = str10;
    }
}
