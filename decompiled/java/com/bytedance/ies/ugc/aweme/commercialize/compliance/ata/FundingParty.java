package com.bytedance.ies.ugc.aweme.commercialize.compliance.ata;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes29.dex */
public final class FundingParty implements Serializable {
    public static final int $stable = 8;

    @C09CT("orientation_track")
    public String eventTrackingText;

    @C09CT("orientation_text")
    public String fullText;

    @C09CT("icon_desc")
    public String iconDesc;

    @C09CT("info_type")
    public Integer infoType;

    @C09CT("orientation_item")
    public String linkText;

    @C09CT("url")
    public String linkUrl;

    @C09CT("show_icon")
    public Boolean showIcon;

    /* JADX INFO: renamed from: switch, reason: not valid java name */
    @C09CT("switch")
    public Integer f44switch;

    public FundingParty() {
        this(0, "", "", "", "", 0, Boolean.FALSE, "");
    }

    public final String getEventTrackingText() {
        return this.eventTrackingText;
    }

    public final String getFullText() {
        return this.fullText;
    }

    public final String getIconDesc() {
        return this.iconDesc;
    }

    public final Integer getInfoType() {
        return this.infoType;
    }

    public final String getLinkText() {
        return this.linkText;
    }

    public final String getLinkUrl() {
        return this.linkUrl;
    }

    public final Boolean getShowIcon() {
        return this.showIcon;
    }

    public final Integer getSwitch() {
        return this.f44switch;
    }

    public final void setEventTrackingText(String str) {
        this.eventTrackingText = str;
    }

    public final void setFullText(String str) {
        this.fullText = str;
    }

    public final void setIconDesc(String str) {
        this.iconDesc = str;
    }

    public final void setInfoType(Integer num) {
        this.infoType = num;
    }

    public final void setLinkText(String str) {
        this.linkText = str;
    }

    public final void setLinkUrl(String str) {
        this.linkUrl = str;
    }

    public final void setShowIcon(Boolean bool) {
        this.showIcon = bool;
    }

    public final void setSwitch(Integer num) {
        this.f44switch = num;
    }

    public FundingParty(Integer num, String str, String str2, String str3, String str4, Integer num2, Boolean bool, String str5) {
        this.infoType = num;
        this.fullText = str;
        this.linkUrl = str2;
        this.linkText = str3;
        this.eventTrackingText = str4;
        this.f44switch = num2;
        this.showIcon = bool;
        this.iconDesc = str5;
    }
}
