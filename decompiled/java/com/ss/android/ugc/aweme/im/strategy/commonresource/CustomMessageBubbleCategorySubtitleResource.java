package com.ss.android.ugc.aweme.im.strategy.commonresource;

import X.C09CT;
import X.C0ZMF;
import X.C0ZYB;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
public final class CustomMessageBubbleCategorySubtitleResource extends C0ZMF {
    public static final C0ZYB Companion = new Object() { // from class: X.0ZYB
    };

    @C09CT("base_string")
    public final String baseString;

    @C09CT("enable_show")
    public final Boolean enableShow;

    @C09CT("end_date")
    public final Float endDate;

    @C09CT("android_link")
    public final String link;

    @C09CT("link_replacement_string")
    public final String linkReplacementString;

    @C09CT("min_app_version")
    public final Long minAppVersion;

    @C09CT("start_date")
    public final Float startDate;

    public CustomMessageBubbleCategorySubtitleResource() {
        this(null, null, null, null, null, null, null);
    }

    public final CustomMessageBubbleCategorySubtitleResource copy(Boolean bool, Long l, String str, Float f, Float f2, String str2, String str3) {
        return new CustomMessageBubbleCategorySubtitleResource(bool, l, str, f, f2, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CustomMessageBubbleCategorySubtitleResource)) {
            return false;
        }
        CustomMessageBubbleCategorySubtitleResource customMessageBubbleCategorySubtitleResource = (CustomMessageBubbleCategorySubtitleResource) obj;
        return Intrinsics.LJFF(this.enableShow, customMessageBubbleCategorySubtitleResource.enableShow) && Intrinsics.LJFF(this.minAppVersion, customMessageBubbleCategorySubtitleResource.minAppVersion) && Intrinsics.LJFF(this.baseString, customMessageBubbleCategorySubtitleResource.baseString) && Intrinsics.LJFF(this.startDate, customMessageBubbleCategorySubtitleResource.startDate) && Intrinsics.LJFF(this.endDate, customMessageBubbleCategorySubtitleResource.endDate) && Intrinsics.LJFF(this.link, customMessageBubbleCategorySubtitleResource.link) && Intrinsics.LJFF(this.linkReplacementString, customMessageBubbleCategorySubtitleResource.linkReplacementString);
    }

    public int hashCode() {
        Boolean bool = this.enableShow;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Long l = this.minAppVersion;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        String str = this.baseString;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Float f = this.startDate;
        int iHashCode4 = (iHashCode3 + (f == null ? 0 : f.hashCode())) * 31;
        Float f2 = this.endDate;
        int iHashCode5 = (iHashCode4 + (f2 == null ? 0 : f2.hashCode())) * 31;
        String str2 = this.link;
        int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.linkReplacementString;
        return iHashCode6 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CustomMessageBubbleCategorySubtitleResource(enableShow=");
        sbLIZ.append(this.enableShow);
        sbLIZ.append(", minAppVersion=");
        sbLIZ.append(this.minAppVersion);
        sbLIZ.append(", baseString=");
        sbLIZ.append(this.baseString);
        sbLIZ.append(", startDate=");
        sbLIZ.append(this.startDate);
        sbLIZ.append(", endDate=");
        sbLIZ.append(this.endDate);
        sbLIZ.append(", link=");
        sbLIZ.append(this.link);
        sbLIZ.append(", linkReplacementString=");
        sbLIZ.append(this.linkReplacementString);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final String getBaseString() {
        return this.baseString;
    }

    public final Boolean getEnableShow() {
        return this.enableShow;
    }

    public final Float getEndDate() {
        return this.endDate;
    }

    public final String getLink() {
        return this.link;
    }

    public final String getLinkReplacementString() {
        return this.linkReplacementString;
    }

    public final Long getMinAppVersion() {
        return this.minAppVersion;
    }

    public final Float getStartDate() {
        return this.startDate;
    }

    public CustomMessageBubbleCategorySubtitleResource(Boolean bool, Long l, String str, Float f, Float f2, String str2, String str3) {
        this.enableShow = bool;
        this.minAppVersion = l;
        this.baseString = str;
        this.startDate = f;
        this.endDate = f2;
        this.link = str2;
        this.linkReplacementString = str3;
    }
}
