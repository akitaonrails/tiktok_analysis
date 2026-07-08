package com.ss.android.ugc.aweme.component.interestfeedbackbuttoncomponent;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class AnoleInterestFeedbackButtonModel {

    @C09CT("button_no_text")
    public final String buttonNoText;

    @C09CT("button_yes_text")
    public final String buttonYesText;

    @C09CT("display_probability")
    public final Float displayProbability;

    @C09CT("feedback_no_toast")
    public final String feedbackNoToast;

    @C09CT("feedback_yes_toast")
    public final String feedbackYesToast;

    @C09CT("item_count")
    public final Integer itemCount;

    @C09CT("pause_days_after_click")
    public final Integer pauseDaysAfterClick;

    @C09CT("pause_days_after_show")
    public final Integer pauseDaysAfterShow;

    @C09CT("should_show_icon")
    public final Boolean shouldShowIcon;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnoleInterestFeedbackButtonModel)) {
            return false;
        }
        AnoleInterestFeedbackButtonModel anoleInterestFeedbackButtonModel = (AnoleInterestFeedbackButtonModel) obj;
        return Intrinsics.LJFF(this.buttonYesText, anoleInterestFeedbackButtonModel.buttonYesText) && Intrinsics.LJFF(this.buttonNoText, anoleInterestFeedbackButtonModel.buttonNoText) && Intrinsics.LJFF(this.feedbackYesToast, anoleInterestFeedbackButtonModel.feedbackYesToast) && Intrinsics.LJFF(this.feedbackNoToast, anoleInterestFeedbackButtonModel.feedbackNoToast) && Intrinsics.LJFF(this.pauseDaysAfterShow, anoleInterestFeedbackButtonModel.pauseDaysAfterShow) && Intrinsics.LJFF(this.pauseDaysAfterClick, anoleInterestFeedbackButtonModel.pauseDaysAfterClick) && Intrinsics.LJFF(this.itemCount, anoleInterestFeedbackButtonModel.itemCount) && Intrinsics.LJFF(this.displayProbability, anoleInterestFeedbackButtonModel.displayProbability) && Intrinsics.LJFF(this.shouldShowIcon, anoleInterestFeedbackButtonModel.shouldShowIcon);
    }

    public final int hashCode() {
        String str = this.buttonYesText;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.buttonNoText;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.feedbackYesToast;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.feedbackNoToast;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num = this.pauseDaysAfterShow;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.pauseDaysAfterClick;
        int iHashCode6 = (iHashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.itemCount;
        int iHashCode7 = (iHashCode6 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Float f = this.displayProbability;
        int iHashCode8 = (iHashCode7 + (f == null ? 0 : f.hashCode())) * 31;
        Boolean bool = this.shouldShowIcon;
        return iHashCode8 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AnoleInterestFeedbackButtonModel(buttonYesText=");
        sbLIZ.append(this.buttonYesText);
        sbLIZ.append(", buttonNoText=");
        sbLIZ.append(this.buttonNoText);
        sbLIZ.append(", feedbackYesToast=");
        sbLIZ.append(this.feedbackYesToast);
        sbLIZ.append(", feedbackNoToast=");
        sbLIZ.append(this.feedbackNoToast);
        sbLIZ.append(", pauseDaysAfterShow=");
        sbLIZ.append(this.pauseDaysAfterShow);
        sbLIZ.append(", pauseDaysAfterClick=");
        sbLIZ.append(this.pauseDaysAfterClick);
        sbLIZ.append(", itemCount=");
        sbLIZ.append(this.itemCount);
        sbLIZ.append(", displayProbability=");
        sbLIZ.append(this.displayProbability);
        sbLIZ.append(", shouldShowIcon=");
        sbLIZ.append(this.shouldShowIcon);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public AnoleInterestFeedbackButtonModel() {
        this("", "", "", "", 0, 0, 0, Float.valueOf(1.0f), Boolean.FALSE);
    }

    public AnoleInterestFeedbackButtonModel(String str, String str2, String str3, String str4, Integer num, Integer num2, Integer num3, Float f, Boolean bool) {
        this.buttonYesText = str;
        this.buttonNoText = str2;
        this.feedbackYesToast = str3;
        this.feedbackNoToast = str4;
        this.pauseDaysAfterShow = num;
        this.pauseDaysAfterClick = num2;
        this.itemCount = num3;
        this.displayProbability = f;
        this.shouldShowIcon = bool;
    }
}
