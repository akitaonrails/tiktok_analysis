package com.bytedance.ies.ugc.aweme.rich.model.feed.model.ad;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes17.dex */
public final class InterstitialAdInfo implements Serializable {

    @C09CT("interstitial_close_duration")
    public Long interstitialCloseDuration;

    @C09CT("interstitial_scene_type")
    public Integer interstitialSceneType;

    public final Long getInterstitialCloseDuration() {
        return this.interstitialCloseDuration;
    }

    public final Integer getInterstitialSceneType() {
        return this.interstitialSceneType;
    }

    public final void setInterstitialCloseDuration(Long l) {
        this.interstitialCloseDuration = l;
    }

    public final void setInterstitialSceneType(Integer num) {
        this.interstitialSceneType = num;
    }
}
