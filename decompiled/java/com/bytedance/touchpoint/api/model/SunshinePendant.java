package com.bytedance.touchpoint.api.model;

import X.C09CT;
import X.C1893670zNV;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes29.dex */
public final class SunshinePendant extends C1893670zNV {

    @C09CT("activity_id")
    public String activityId;

    @C09CT("bottom_text")
    public Title bottomText;

    @C09CT("bottom_text_bg_color")
    public String bottomTextBgColor;

    @C09CT("close_frequent_limit")
    public CloseFrequentLimit closeFrequentLimit;

    @C09CT("normal_jump_link")
    public String jumpLink;

    @C09CT("lottie_file_md5")
    public String lottieFileMd5;

    @C09CT("lottie_file_zip")
    public String lottieFileZip;

    @C09CT("lottie_name")
    public String lottieName;

    @C09CT("notification_name")
    public String notificationName;

    @C09CT("pendant_disable_close")
    public Boolean pendantDisableClose;

    @C09CT("pendant_pic")
    public String pendantPic;

    @C09CT("popup_view")
    public DynamicDialog popup;

    public SunshinePendant() {
        this(null, null, null, null, null, null, null, null, null, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SunshinePendant)) {
            return false;
        }
        SunshinePendant sunshinePendant = (SunshinePendant) obj;
        return Intrinsics.LJFF(this.pendantPic, sunshinePendant.pendantPic) && Intrinsics.LJFF(this.bottomText, sunshinePendant.bottomText) && Intrinsics.LJFF(this.bottomTextBgColor, sunshinePendant.bottomTextBgColor) && Intrinsics.LJFF(this.popup, sunshinePendant.popup) && Intrinsics.LJFF(this.notificationName, sunshinePendant.notificationName) && Intrinsics.LJFF(this.jumpLink, sunshinePendant.jumpLink) && Intrinsics.LJFF(this.pendantDisableClose, sunshinePendant.pendantDisableClose) && Intrinsics.LJFF(this.closeFrequentLimit, sunshinePendant.closeFrequentLimit) && Intrinsics.LJFF(this.lottieName, sunshinePendant.lottieName) && Intrinsics.LJFF(this.lottieFileZip, sunshinePendant.lottieFileZip) && Intrinsics.LJFF(this.lottieFileMd5, sunshinePendant.lottieFileMd5) && Intrinsics.LJFF(this.activityId, sunshinePendant.activityId);
    }

    public final int hashCode() {
        String str = this.pendantPic;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Title title = this.bottomText;
        int iHashCode2 = (iHashCode + (title == null ? 0 : title.hashCode())) * 31;
        String str2 = this.bottomTextBgColor;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        DynamicDialog dynamicDialog = this.popup;
        int iHashCode4 = (iHashCode3 + (dynamicDialog == null ? 0 : dynamicDialog.hashCode())) * 31;
        String str3 = this.notificationName;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.jumpLink;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool = this.pendantDisableClose;
        int iHashCode7 = (iHashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
        CloseFrequentLimit closeFrequentLimit = this.closeFrequentLimit;
        int iHashCode8 = (iHashCode7 + (closeFrequentLimit == null ? 0 : closeFrequentLimit.hashCode())) * 31;
        String str5 = this.lottieName;
        int iHashCode9 = (iHashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.lottieFileZip;
        int iHashCode10 = (iHashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.lottieFileMd5;
        int iHashCode11 = (iHashCode10 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.activityId;
        return iHashCode11 + (str8 != null ? str8.hashCode() : 0);
    }

    public final String toString() {
        return "SunshinePendant(pendantPic=" + this.pendantPic + ", bottomText=" + this.bottomText + ", bottomTextBgColor=" + this.bottomTextBgColor + ", popup=" + this.popup + ", notificationName=" + this.notificationName + ", jumpLink=" + this.jumpLink + ", pendantDisableClose=" + this.pendantDisableClose + ", closeFrequentLimit=" + this.closeFrequentLimit + ", lottieName=" + this.lottieName + ", lottieFileZip=" + this.lottieFileZip + ", lottieFileMd5=" + this.lottieFileMd5 + ", activityId=" + this.activityId + ')';
    }

    public SunshinePendant(String str, Title title, String str2, DynamicDialog dynamicDialog, String str3, String str4, Boolean bool, CloseFrequentLimit closeFrequentLimit, String str5, String str6, String str7, String str8) {
        this.pendantPic = str;
        this.bottomText = title;
        this.bottomTextBgColor = str2;
        this.popup = dynamicDialog;
        this.notificationName = str3;
        this.jumpLink = str4;
        this.pendantDisableClose = bool;
        this.closeFrequentLimit = closeFrequentLimit;
        this.lottieName = str5;
        this.lottieFileZip = str6;
        this.lottieFileMd5 = str7;
        this.activityId = str8;
    }
}
