package com.ss.android.ugc.aweme.discover.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes30.dex */
public final class HTCMissionModule implements Serializable {

    @C09CT("banner_type")
    public final Integer bannerType;

    @C09CT("description")
    public final FormattedText description;

    @C09CT("enable_popup_window")
    public final Boolean enablePopupWindow;

    @C09CT("is_eligible_user")
    public final Boolean isEligibleUser;

    @C09CT("mission_id")
    public final String missionId;

    @C09CT("mission_stage")
    public final Integer missionLabelType;

    @C09CT("open_url")
    public final String openUrl;

    @C09CT("participants_str")
    public final FormattedText participantsStr;

    @C09CT("progress_bar_text")
    public final String progressBarText;

    @C09CT("reward_consume_percent")
    public final Double rewardConsumePercent;

    @C09CT("text")
    public final String text;

    @C09CT("text_type")
    public final Integer textType;

    public final Boolean isEligibleUser() {
        return this.isEligibleUser;
    }

    public HTCMissionModule(String str, String str2, String str3, Boolean bool, Integer num, Double d, String str4, FormattedText formattedText, FormattedText formattedText2, Integer num2, Boolean bool2, Integer num3) {
        this.missionId = str;
        this.text = str2;
        this.openUrl = str3;
        this.isEligibleUser = bool;
        this.missionLabelType = num;
        this.rewardConsumePercent = d;
        this.progressBarText = str4;
        this.participantsStr = formattedText;
        this.description = formattedText2;
        this.bannerType = num2;
        this.enablePopupWindow = bool2;
        this.textType = num3;
    }
}
