package com.bytedance.ies.ugc.aweme.rich.model.feed.model.ad;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes7.dex */
public final class AdRewardTaskData implements Serializable {

    @C09CT("ad_extra_data")
    public String adExtraData;

    @C09CT("bubble_info")
    public AdRewardBubbleInfo bubbleInfo;

    @C09CT("coin_reward_amount")
    public int coinRewardAmount;

    @C09CT("duration")
    public int duration;

    @C09CT("task_timer_image_url")
    public String taskTimerImageUrl;

    public final String getAdExtraData() {
        return this.adExtraData;
    }

    public final AdRewardBubbleInfo getBubbleInfo() {
        return this.bubbleInfo;
    }

    public final int getCoinRewardAmount() {
        return this.coinRewardAmount;
    }

    public final int getDuration() {
        return this.duration;
    }

    public final String getTaskTimerImageUrl() {
        return this.taskTimerImageUrl;
    }

    public final void setAdExtraData(String str) {
        this.adExtraData = str;
    }

    public final void setBubbleInfo(AdRewardBubbleInfo adRewardBubbleInfo) {
        this.bubbleInfo = adRewardBubbleInfo;
    }

    public final void setCoinRewardAmount(int i) {
        this.coinRewardAmount = i;
    }

    public final void setDuration(int i) {
        this.duration = i;
    }

    public final void setTaskTimerImageUrl(String str) {
        this.taskTimerImageUrl = str;
    }
}
