package com.ss.android.ugc.aweme.feed.model.ad;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes17.dex */
public final class AdRewardData implements Serializable {

    @C09CT("countdown_info")
    public RewardAdCountdownInfo countDownInfo;

    @C09CT("retention_popup")
    public RewardAdRetentionPopup retentionPopup;

    @C09CT("reward_duration")
    public Long rewardDuration;

    public final RewardAdCountdownInfo getCountDownInfo() {
        return this.countDownInfo;
    }

    public final RewardAdRetentionPopup getRetentionPopup() {
        return this.retentionPopup;
    }

    public final Long getRewardDuration() {
        return this.rewardDuration;
    }

    public final void setCountDownInfo(RewardAdCountdownInfo rewardAdCountdownInfo) {
        this.countDownInfo = rewardAdCountdownInfo;
    }

    public final void setRetentionPopup(RewardAdRetentionPopup rewardAdRetentionPopup) {
        this.retentionPopup = rewardAdRetentionPopup;
    }

    public final void setRewardDuration(Long l) {
        this.rewardDuration = l;
    }
}
