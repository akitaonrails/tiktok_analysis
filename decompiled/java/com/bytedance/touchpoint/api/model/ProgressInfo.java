package com.bytedance.touchpoint.api.model;

import X.C09CT;

/* JADX INFO: loaded from: classes29.dex */
public final class ProgressInfo {

    @C09CT("anti_cheat_status")
    public Integer antiCheatStatus;

    @C09CT("award_amount")
    public Integer awardAmount;

    @C09CT("claimable")
    public Boolean claimable;

    @C09CT("current_progress")
    public final Integer currentProgress;

    @C09CT("enable_show_top_award_tips")
    public Boolean enableShowTopRewards;

    @C09CT("retain_new_day")
    public Boolean retainNewDay;

    @C09CT("single_award_format")
    public String singleAwardFormat;

    @C09CT("single_award_position")
    public String singleAwardPosition;

    @C09CT("single_award_progress")
    public Integer singleAwardProgress;

    @C09CT("show_with_touchpoint_id")
    public Integer touchPointId;

    public ProgressInfo() {
        this(0, 0, 0, Boolean.FALSE, 0, 0, Boolean.FALSE, null, "top", null);
    }

    public ProgressInfo(Integer num, Integer num2, Integer num3, Boolean bool, Integer num4, Integer num5, Boolean bool2, Boolean bool3, String str, String str2) {
        this.currentProgress = num;
        this.awardAmount = num2;
        this.singleAwardProgress = num3;
        this.claimable = bool;
        this.antiCheatStatus = num4;
        this.touchPointId = num5;
        this.enableShowTopRewards = bool2;
        this.retainNewDay = bool3;
        this.singleAwardPosition = str;
        this.singleAwardFormat = str2;
    }
}
