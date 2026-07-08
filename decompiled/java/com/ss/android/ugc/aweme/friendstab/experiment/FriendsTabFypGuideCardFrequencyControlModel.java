package com.ss.android.ugc.aweme.friendstab.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes36.dex */
public final class FriendsTabFypGuideCardFrequencyControlModel {

    @C09CT("fyp_guide_card_frequency_control_days")
    public final Integer frequencyControlDays;

    @C09CT("fyp_guide_card_uninterested_count_threshold")
    public final Integer frequencyControlExitedCount;

    @C09CT("fyp_guide_card_uninterested_permanent_exit_count_threshold")
    public final Integer frequencyControlPermanentExitCount;

    public FriendsTabFypGuideCardFrequencyControlModel(Integer num, Integer num2, Integer num3) {
        this.frequencyControlDays = num;
        this.frequencyControlExitedCount = num2;
        this.frequencyControlPermanentExitCount = num3;
    }
}
