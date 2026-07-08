package com.bytedance.touchpoint.api.model;

import X.C09CT;
import X.C1893670zNV;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes29.dex */
public final class TimerPendant extends C1893670zNV {

    @C09CT("activity_id")
    public String activityId;

    @C09CT("award_cycle_interval")
    public Integer awardCycleInterval;

    @C09CT("award_end_frame")
    public Integer awardEndFrame;

    @C09CT("award_text_bg_colors")
    public List<String> awardTextBGColor;

    @C09CT("award_transition_frame")
    public Integer awardTransitionFrame;

    @C09CT("bar_color")
    public List<String> barColor;

    @C09CT("bg_color")
    public List<String> bgColor;

    @C09CT("bottom_text_show")
    public Boolean bottomTexShow;

    @C09CT("bottom_text")
    public String bottomText;

    @C09CT("bottom_text_bg_colors")
    public List<String> bottomTextBGColors;

    @C09CT("animation_lottie_name")
    public String breathLottieName;

    @C09CT("closable")
    public Boolean canBeClosed;

    @C09CT("display_with_normal_pendant")
    public Boolean displayWithNormalPendant;

    @C09CT("extra")
    public String extra;

    @C09CT("force_show")
    public Boolean forceShow;

    @C09CT("icon_url")
    public String iconUrl;

    @C09CT("timer_lottie_file_md5")
    public String lottieFileMd5;

    @C09CT("timer_lottie_file_zip")
    public String lottieFileZip;

    @C09CT("lottie_name")
    public String lottieName;

    @C09CT("scene_lottie_names")
    public List<Object> lottieNames;

    @C09CT("need_login_gate")
    public Boolean needLoginGate;

    @C09CT("notification_id")
    public String notificationId;

    @C09CT("notification_name")
    public String notificationName;

    @C09CT("valid_pages")
    public List<String> pageType;

    @C09CT("retention_component")
    public RetentionInfo retentionInfo;

    @C09CT("award_lottie_name")
    public String rewardLottieName;

    @C09CT("award_text")
    public String rewardText;

    @C09CT("get_reward_url")
    public String rewardUrl;

    @C09CT("show_award_text")
    public Boolean showAwardText;

    @C09CT("shrink_after")
    public Integer shrinkAfter;

    @C09CT("shrink_after_condition")
    public String shrinkCondition;

    @C09CT("shrink_lottie_name")
    public String shrinkLottieName;

    @C09CT("text_bg_color")
    public String textBGColor;

    @C09CT("text_bg_colors")
    public List<String> textBGColors;

    @C09CT("timer_jump_link")
    public String timerJumpLink;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TimerPendant)) {
            return false;
        }
        TimerPendant timerPendant = (TimerPendant) obj;
        return Intrinsics.LJFF(this.activityId, timerPendant.activityId) && Intrinsics.LJFF(this.timerJumpLink, timerPendant.timerJumpLink) && Intrinsics.LJFF(this.lottieFileZip, timerPendant.lottieFileZip) && Intrinsics.LJFF(this.lottieFileMd5, timerPendant.lottieFileMd5) && Intrinsics.LJFF(this.lottieNames, timerPendant.lottieNames) && Intrinsics.LJFF(this.bgColor, timerPendant.bgColor) && Intrinsics.LJFF(this.barColor, timerPendant.barColor) && Intrinsics.LJFF(this.lottieName, timerPendant.lottieName) && Intrinsics.LJFF(this.shrinkAfter, timerPendant.shrinkAfter) && Intrinsics.LJFF(this.shrinkCondition, timerPendant.shrinkCondition) && Intrinsics.LJFF(this.forceShow, timerPendant.forceShow) && Intrinsics.LJFF(this.shrinkLottieName, timerPendant.shrinkLottieName) && Intrinsics.LJFF(this.breathLottieName, timerPendant.breathLottieName) && Intrinsics.LJFF(this.rewardLottieName, timerPendant.rewardLottieName) && Intrinsics.LJFF(this.awardTransitionFrame, timerPendant.awardTransitionFrame) && Intrinsics.LJFF(this.awardEndFrame, timerPendant.awardEndFrame) && Intrinsics.LJFF(this.awardCycleInterval, timerPendant.awardCycleInterval) && Intrinsics.LJFF(this.rewardText, timerPendant.rewardText) && Intrinsics.LJFF(this.showAwardText, timerPendant.showAwardText) && Intrinsics.LJFF(this.canBeClosed, timerPendant.canBeClosed) && Intrinsics.LJFF(this.textBGColors, timerPendant.textBGColors) && Intrinsics.LJFF(this.awardTextBGColor, timerPendant.awardTextBGColor) && Intrinsics.LJFF(this.bottomTexShow, timerPendant.bottomTexShow) && Intrinsics.LJFF(this.bottomText, timerPendant.bottomText) && Intrinsics.LJFF(this.textBGColor, timerPendant.textBGColor) && Intrinsics.LJFF(this.needLoginGate, timerPendant.needLoginGate) && Intrinsics.LJFF(this.displayWithNormalPendant, timerPendant.displayWithNormalPendant) && Intrinsics.LJFF(this.notificationName, timerPendant.notificationName) && Intrinsics.LJFF(this.pageType, timerPendant.pageType) && Intrinsics.LJFF(this.extra, timerPendant.extra) && Intrinsics.LJFF(this.notificationId, timerPendant.notificationId) && Intrinsics.LJFF(this.iconUrl, timerPendant.iconUrl) && Intrinsics.LJFF(this.rewardUrl, timerPendant.rewardUrl) && Intrinsics.LJFF(this.bottomTextBGColors, timerPendant.bottomTextBGColors) && Intrinsics.LJFF(this.retentionInfo, timerPendant.retentionInfo);
    }

    public final int hashCode() {
        String str = this.activityId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.timerJumpLink;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.lottieFileZip;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.lottieFileMd5;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        List<Object> list = this.lottieNames;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        List<String> list2 = this.bgColor;
        int iHashCode6 = (iHashCode5 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<String> list3 = this.barColor;
        int iHashCode7 = (iHashCode6 + (list3 == null ? 0 : list3.hashCode())) * 31;
        String str5 = this.lottieName;
        int iHashCode8 = (iHashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num = this.shrinkAfter;
        int iHashCode9 = (iHashCode8 + (num == null ? 0 : num.hashCode())) * 31;
        String str6 = this.shrinkCondition;
        int iHashCode10 = (iHashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Boolean bool = this.forceShow;
        int iHashCode11 = (iHashCode10 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str7 = this.shrinkLottieName;
        int iHashCode12 = (iHashCode11 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.breathLottieName;
        int iHashCode13 = (iHashCode12 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.rewardLottieName;
        int iHashCode14 = (iHashCode13 + (str9 == null ? 0 : str9.hashCode())) * 31;
        Integer num2 = this.awardTransitionFrame;
        int iHashCode15 = (iHashCode14 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.awardEndFrame;
        int iHashCode16 = (iHashCode15 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.awardCycleInterval;
        int iHashCode17 = (iHashCode16 + (num4 == null ? 0 : num4.hashCode())) * 31;
        String str10 = this.rewardText;
        int iHashCode18 = (iHashCode17 + (str10 == null ? 0 : str10.hashCode())) * 31;
        Boolean bool2 = this.showAwardText;
        int iHashCode19 = (iHashCode18 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.canBeClosed;
        int iHashCode20 = (iHashCode19 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        List<String> list4 = this.textBGColors;
        int iHashCode21 = (iHashCode20 + (list4 == null ? 0 : list4.hashCode())) * 31;
        List<String> list5 = this.awardTextBGColor;
        int iHashCode22 = (iHashCode21 + (list5 == null ? 0 : list5.hashCode())) * 31;
        Boolean bool4 = this.bottomTexShow;
        int iHashCode23 = (iHashCode22 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        String str11 = this.bottomText;
        int iHashCode24 = (iHashCode23 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.textBGColor;
        int iHashCode25 = (iHashCode24 + (str12 == null ? 0 : str12.hashCode())) * 31;
        Boolean bool5 = this.needLoginGate;
        int iHashCode26 = (iHashCode25 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Boolean bool6 = this.displayWithNormalPendant;
        int iHashCode27 = (iHashCode26 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        String str13 = this.notificationName;
        int iHashCode28 = (iHashCode27 + (str13 == null ? 0 : str13.hashCode())) * 31;
        List<String> list6 = this.pageType;
        int iHashCode29 = (iHashCode28 + (list6 == null ? 0 : list6.hashCode())) * 31;
        String str14 = this.extra;
        int iHashCode30 = (iHashCode29 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.notificationId;
        int iHashCode31 = (iHashCode30 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.iconUrl;
        int iHashCode32 = (iHashCode31 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.rewardUrl;
        int iHashCode33 = (iHashCode32 + (str17 == null ? 0 : str17.hashCode())) * 31;
        List<String> list7 = this.bottomTextBGColors;
        int iHashCode34 = (iHashCode33 + (list7 == null ? 0 : list7.hashCode())) * 31;
        RetentionInfo retentionInfo = this.retentionInfo;
        return iHashCode34 + (retentionInfo != null ? retentionInfo.hashCode() : 0);
    }

    public final String toString() {
        return "TimerPendant(activityId=" + this.activityId + ", timerJumpLink=" + this.timerJumpLink + ", lottieFileZip=" + this.lottieFileZip + ", lottieFileMd5=" + this.lottieFileMd5 + ", lottieNames=" + this.lottieNames + ", bgColor=" + this.bgColor + ", barColor=" + this.barColor + ", lottieName=" + this.lottieName + ", shrinkAfter=" + this.shrinkAfter + ", shrinkCondition=" + this.shrinkCondition + ", forceShow=" + this.forceShow + ", shrinkLottieName=" + this.shrinkLottieName + ", breathLottieName=" + this.breathLottieName + ", rewardLottieName=" + this.rewardLottieName + ", awardTransitionFrame=" + this.awardTransitionFrame + ", awardEndFrame=" + this.awardEndFrame + ", awardCycleInterval=" + this.awardCycleInterval + ", rewardText=" + this.rewardText + ", showAwardText=" + this.showAwardText + ", canBeClosed=" + this.canBeClosed + ", textBGColors=" + this.textBGColors + ", awardTextBGColor=" + this.awardTextBGColor + ", bottomTexShow=" + this.bottomTexShow + ", bottomText=" + this.bottomText + ", textBGColor=" + this.textBGColor + ", needLoginGate=" + this.needLoginGate + ", displayWithNormalPendant=" + this.displayWithNormalPendant + ", notificationName=" + this.notificationName + ", pageType=" + this.pageType + ", extra=" + this.extra + ", notificationId=" + this.notificationId + ", iconUrl=" + this.iconUrl + ", rewardUrl=" + this.rewardUrl + ", bottomTextBGColors=" + this.bottomTextBGColors + ", retentionInfo=" + this.retentionInfo + ')';
    }

    public TimerPendant(String str, String str2, String str3, String str4, List<Object> list, List<String> list2, List<String> list3, String str5, Integer num, String str6, Boolean bool, String str7, String str8, String str9, Integer num2, Integer num3, Integer num4, String str10, Boolean bool2, Boolean bool3, List<String> list4, List<String> list5, Boolean bool4, String str11, String str12, Boolean bool5, Boolean bool6, String str13, List<String> list6, String str14, String str15, String str16, String str17, List<String> list7, RetentionInfo retentionInfo) {
        this.activityId = str;
        this.timerJumpLink = str2;
        this.lottieFileZip = str3;
        this.lottieFileMd5 = str4;
        this.lottieNames = list;
        this.bgColor = list2;
        this.barColor = list3;
        this.lottieName = str5;
        this.shrinkAfter = num;
        this.shrinkCondition = str6;
        this.forceShow = bool;
        this.shrinkLottieName = str7;
        this.breathLottieName = str8;
        this.rewardLottieName = str9;
        this.awardTransitionFrame = num2;
        this.awardEndFrame = num3;
        this.awardCycleInterval = num4;
        this.rewardText = str10;
        this.showAwardText = bool2;
        this.canBeClosed = bool3;
        this.textBGColors = list4;
        this.awardTextBGColor = list5;
        this.bottomTexShow = bool4;
        this.bottomText = str11;
        this.textBGColor = str12;
        this.needLoginGate = bool5;
        this.displayWithNormalPendant = bool6;
        this.notificationName = str13;
        this.pageType = list6;
        this.extra = str14;
        this.notificationId = str15;
        this.iconUrl = str16;
        this.rewardUrl = str17;
        this.bottomTextBGColors = list7;
        this.retentionInfo = retentionInfo;
    }
}
