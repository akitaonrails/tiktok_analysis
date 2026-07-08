package com.bytedance.touchpoint.api.model;

import X.C09CT;
import X.C1893670zNV;
import X.C786410Ut5;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes29.dex */
public final class NormalPendant extends C1893670zNV {

    @C09CT("activity_id")
    public String activityId;

    @C09CT("bottom_text")
    public Title bottomText;

    @C09CT("bottom_text_bg_color")
    public String bottomTextBgColor;

    @C09CT("pendant_click_action")
    public int clickAction;

    @C09CT("close_frequent_limit")
    public CloseFrequentLimit closeFrequentLimit;

    @C09CT("dismiss_after")
    public int dismissAfter;

    @C09CT("dismiss_after_seconds")
    public int dismissAfterSeconds;

    @C09CT("life_times")
    public int lifeTimes;

    @C09CT("lottie_file_md5")
    public String lottieFileMd5;

    @C09CT("lottie_file_zip")
    public String lottieFileZip;

    @C09CT("lottie_name")
    public String lottieName;

    @C09CT("shrink_lottie_name")
    public String lottieShrinkName;

    @C09CT("mini_pendant_closable")
    public boolean miniPendantClosable;

    @C09CT("need_login_gate")
    public boolean needLoginGate;

    @C09CT("normal_jump_link")
    public String normalJumpLink;

    @C09CT("pendant_disable_close")
    public Boolean pendantDisableClose;

    @C09CT("pendant_pic")
    public String pendantPic;

    @C09CT("pendant_shrink_pic")
    public String pendantShrinkPic;

    @C09CT("promotion_hashtag_ids")
    public List<String> promotionIds;

    @C09CT("show_after")
    public int showAfter;

    @C09CT("show_in_follow")
    public boolean showInFollow;

    @C09CT("show_times")
    public int showTimes;

    @C09CT("shrink_after")
    public int shrinkAfter;

    @C09CT("task_event_key")
    public String taskEventKey;

    @C09CT("valid_pages")
    public List<String> validPages;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NormalPendant)) {
            return false;
        }
        NormalPendant normalPendant = (NormalPendant) obj;
        return Intrinsics.LJFF(this.activityId, normalPendant.activityId) && this.showTimes == normalPendant.showTimes && this.showInFollow == normalPendant.showInFollow && Intrinsics.LJFF(this.closeFrequentLimit, normalPendant.closeFrequentLimit) && Intrinsics.LJFF(this.promotionIds, normalPendant.promotionIds) && this.miniPendantClosable == normalPendant.miniPendantClosable && this.shrinkAfter == normalPendant.shrinkAfter && this.dismissAfter == normalPendant.dismissAfter && this.showAfter == normalPendant.showAfter && Intrinsics.LJFF(this.normalJumpLink, normalPendant.normalJumpLink) && Intrinsics.LJFF(this.pendantPic, normalPendant.pendantPic) && Intrinsics.LJFF(this.pendantShrinkPic, normalPendant.pendantShrinkPic) && Intrinsics.LJFF(this.pendantDisableClose, normalPendant.pendantDisableClose) && Intrinsics.LJFF(this.bottomText, normalPendant.bottomText) && Intrinsics.LJFF(this.bottomTextBgColor, normalPendant.bottomTextBgColor) && this.needLoginGate == normalPendant.needLoginGate && this.dismissAfterSeconds == normalPendant.dismissAfterSeconds && this.lifeTimes == normalPendant.lifeTimes && Intrinsics.LJFF(this.lottieName, normalPendant.lottieName) && Intrinsics.LJFF(this.lottieFileZip, normalPendant.lottieFileZip) && Intrinsics.LJFF(this.lottieFileMd5, normalPendant.lottieFileMd5) && Intrinsics.LJFF(this.lottieShrinkName, normalPendant.lottieShrinkName) && Intrinsics.LJFF(this.taskEventKey, normalPendant.taskEventKey) && Intrinsics.LJFF(this.validPages, normalPendant.validPages) && this.clickAction == normalPendant.clickAction;
    }

    public final int hashCode() {
        int iHashCode = ((((this.activityId.hashCode() * 31) + this.showTimes) * 31) + C786410Ut5.Z2(this.showInFollow)) * 31;
        CloseFrequentLimit closeFrequentLimit = this.closeFrequentLimit;
        int iHashCode2 = (((((((((((((((((iHashCode + (closeFrequentLimit == null ? 0 : closeFrequentLimit.hashCode())) * 31) + this.promotionIds.hashCode()) * 31) + C786410Ut5.Z2(this.miniPendantClosable)) * 31) + this.shrinkAfter) * 31) + this.dismissAfter) * 31) + this.showAfter) * 31) + this.normalJumpLink.hashCode()) * 31) + this.pendantPic.hashCode()) * 31) + this.pendantShrinkPic.hashCode()) * 31;
        Boolean bool = this.pendantDisableClose;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Title title = this.bottomText;
        int iHashCode4 = (iHashCode3 + (title == null ? 0 : title.hashCode())) * 31;
        String str = this.bottomTextBgColor;
        int iHashCode5 = (((((((iHashCode4 + (str == null ? 0 : str.hashCode())) * 31) + C786410Ut5.Z2(this.needLoginGate)) * 31) + this.dismissAfterSeconds) * 31) + this.lifeTimes) * 31;
        String str2 = this.lottieName;
        int iHashCode6 = (((((iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.lottieFileZip.hashCode()) * 31) + this.lottieFileMd5.hashCode()) * 31;
        String str3 = this.lottieShrinkName;
        int iHashCode7 = (iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.taskEventKey;
        int iHashCode8 = (iHashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        List<String> list = this.validPages;
        return ((iHashCode8 + (list != null ? list.hashCode() : 0)) * 31) + this.clickAction;
    }

    public final String toString() {
        return "NormalPendant(activityId=" + this.activityId + ", showTimes=" + this.showTimes + ", showInFollow=" + this.showInFollow + ", closeFrequentLimit=" + this.closeFrequentLimit + ", promotionIds=" + this.promotionIds + ", miniPendantClosable=" + this.miniPendantClosable + ", shrinkAfter=" + this.shrinkAfter + ", dismissAfter=" + this.dismissAfter + ", showAfter=" + this.showAfter + ", normalJumpLink=" + this.normalJumpLink + ", pendantPic=" + this.pendantPic + ", pendantShrinkPic=" + this.pendantShrinkPic + ", pendantDisableClose=" + this.pendantDisableClose + ", bottomText=" + this.bottomText + ", bottomTextBgColor=" + this.bottomTextBgColor + ", needLoginGate=" + this.needLoginGate + ", dismissAfterSeconds=" + this.dismissAfterSeconds + ", lifeTimes=" + this.lifeTimes + ", lottieName=" + this.lottieName + ", lottieFileZip=" + this.lottieFileZip + ", lottieFileMd5=" + this.lottieFileMd5 + ", lottieShrinkName=" + this.lottieShrinkName + ", taskEventKey=" + this.taskEventKey + ", validPages=" + this.validPages + ", clickAction=" + this.clickAction + ')';
    }

    public NormalPendant(String str, int i, boolean z, CloseFrequentLimit closeFrequentLimit, List<String> list, boolean z2, int i2, int i3, int i4, String str2, String str3, String str4, Boolean bool, Title title, String str5, boolean z3, int i5, int i6, String str6, String str7, String str8, String str9, String str10, List<String> list2, int i7) {
        this.activityId = str;
        this.showTimes = i;
        this.showInFollow = z;
        this.closeFrequentLimit = closeFrequentLimit;
        this.promotionIds = list;
        this.miniPendantClosable = z2;
        this.shrinkAfter = i2;
        this.dismissAfter = i3;
        this.showAfter = i4;
        this.normalJumpLink = str2;
        this.pendantPic = str3;
        this.pendantShrinkPic = str4;
        this.pendantDisableClose = bool;
        this.bottomText = title;
        this.bottomTextBgColor = str5;
        this.needLoginGate = z3;
        this.dismissAfterSeconds = i5;
        this.lifeTimes = i6;
        this.lottieName = str6;
        this.lottieFileZip = str7;
        this.lottieFileMd5 = str8;
        this.lottieShrinkName = str9;
        this.taskEventKey = str10;
        this.validPages = list2;
        this.clickAction = i7;
    }
}
