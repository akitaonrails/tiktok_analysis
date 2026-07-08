package com.ss.android.ugc.aweme.im.common.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes3.dex */
public final class RemindUserTurnActiveStatusFrequencyControl {

    @C09CT("isEUuser")
    public final boolean euUser;

    @C09CT("getAffinityScore")
    public final int getAffinityScore;

    @C09CT("getForeverDisappearsCount")
    public final int getForeverDisappearsCount;

    @C09CT("getMinCooldownDaysAfterDisappearing")
    public final int getMinCooldownDaysAfterDisappearing;

    @C09CT("maxDisplayAllChat")
    public final int maxDisplayAllChat;

    @C09CT("maxDisplayPerChat")
    public final int maxDisplayPerChat;

    @C09CT("minTurnOffElapsedDaysBeforeShowingInlineNotice")
    public final int minTurnOffElapsedDaysBeforeShowingInlineNotice;

    public RemindUserTurnActiveStatusFrequencyControl() {
        this(7, 5, 14, 2, 1, 2, false);
    }

    public RemindUserTurnActiveStatusFrequencyControl(int i, int i2, int i3, int i4, int i5, int i6, boolean z) {
        this.minTurnOffElapsedDaysBeforeShowingInlineNotice = i;
        this.getAffinityScore = i2;
        this.getMinCooldownDaysAfterDisappearing = i3;
        this.getForeverDisappearsCount = i4;
        this.maxDisplayPerChat = i5;
        this.maxDisplayAllChat = i6;
        this.euUser = z;
    }
}
