package com.bytedance.ies.ugc.aweme.rich.model.feed.model.ad;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes7.dex */
public final class AdRewardData implements Serializable {

    @C09CT("gecko_data")
    public RewardCoinGeckoData coinGeckoData;

    @C09CT("countdown_info")
    public RewardAdCountdownInfo countDownInfo;

    @C09CT("one_to_n_info")
    public OneToNInfo oneToNInfo;

    @C09CT("photo_carousel_info")
    public PhotoCarouselInfo photoCarouselInfo;

    @C09CT("retention_popup")
    public RewardAdRetentionPopup retentionPopup;

    @C09CT("reward_duration")
    public Long rewardDuration;

    @C09CT("task")
    public AdRewardTaskData task;

    public final RewardCoinGeckoData getCoinGeckoData() {
        return this.coinGeckoData;
    }

    public final RewardAdCountdownInfo getCountDownInfo() {
        return this.countDownInfo;
    }

    public final OneToNInfo getOneToNInfo() {
        return this.oneToNInfo;
    }

    public final PhotoCarouselInfo getPhotoCarouselInfo() {
        return this.photoCarouselInfo;
    }

    public final RewardAdRetentionPopup getRetentionPopup() {
        return this.retentionPopup;
    }

    public final Long getRewardDuration() {
        return this.rewardDuration;
    }

    public final AdRewardTaskData getTask() {
        return this.task;
    }

    public final void setCoinGeckoData(RewardCoinGeckoData rewardCoinGeckoData) {
        this.coinGeckoData = rewardCoinGeckoData;
    }

    public final void setCountDownInfo(RewardAdCountdownInfo rewardAdCountdownInfo) {
        this.countDownInfo = rewardAdCountdownInfo;
    }

    public final void setOneToNInfo(OneToNInfo oneToNInfo) {
        this.oneToNInfo = oneToNInfo;
    }

    public final void setPhotoCarouselInfo(PhotoCarouselInfo photoCarouselInfo) {
        this.photoCarouselInfo = photoCarouselInfo;
    }

    public final void setRetentionPopup(RewardAdRetentionPopup rewardAdRetentionPopup) {
        this.retentionPopup = rewardAdRetentionPopup;
    }

    public final void setRewardDuration(Long l) {
        this.rewardDuration = l;
    }

    public final void setTask(AdRewardTaskData adRewardTaskData) {
        this.task = adRewardTaskData;
    }
}
