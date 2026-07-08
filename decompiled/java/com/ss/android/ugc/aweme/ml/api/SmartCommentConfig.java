package com.ss.android.ugc.aweme.ml.api;

import X.C09CT;
import X.EnumC993940byK;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.ss.android.ugc.aweme.ml.infra.SmartSceneConfig;
import java.io.Serializable;

/* JADX INFO: loaded from: classes35.dex */
public class SmartCommentConfig extends SmartSceneConfig implements Serializable {

    @C09CT("block_server_preload_without_wifi")
    public final Boolean blockServerPreloadWithoutWifi;

    @C09CT("play_duration")
    public int playDuration;

    @C09CT("trigger_scene_id")
    public int triggerSceneId;

    @C09CT("wifi_netLevel")
    public final Integer wifiNetLevel;

    @C09CT("wwan_netLevel")
    public final Integer wwanNetLevel;

    @C09CT("can_pending")
    public boolean canPending = true;

    @C09CT("preload_mode")
    public int preloadMode = 1;

    @C09CT("client_ai_threshold")
    public double clientAIThreshold = 0.5d;

    @C09CT("recommend_threshold")
    public double recommendThreshold = 0.5d;

    @C09CT("wait_count_for_real")
    public int waitCountForReal = 2;

    @C09CT("ttl")
    public int ttl = DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL;

    @C09CT("network")
    public final int networkType = EnumC993940byK.ONLY_WIFI.getValue();

    public final Boolean getBlockServerPreloadWithoutWifi() {
        return this.blockServerPreloadWithoutWifi;
    }

    public final boolean getCanPending() {
        return this.canPending;
    }

    public final double getClientAIThreshold() {
        return this.clientAIThreshold;
    }

    public final int getNetworkType() {
        return this.networkType;
    }

    public final int getPlayDuration() {
        return this.playDuration;
    }

    public final int getPreloadMode() {
        return this.preloadMode;
    }

    public final double getRecommendThreshold() {
        return this.recommendThreshold;
    }

    public final int getTriggerSceneId() {
        return this.triggerSceneId;
    }

    public final int getTtl() {
        return this.ttl;
    }

    public final int getWaitCountForReal() {
        return this.waitCountForReal;
    }

    public final Integer getWifiNetLevel() {
        return this.wifiNetLevel;
    }

    public final Integer getWwanNetLevel() {
        return this.wwanNetLevel;
    }

    public final void setCanPending(boolean z) {
        this.canPending = z;
    }

    public final void setClientAIThreshold(double d) {
        this.clientAIThreshold = d;
    }

    public final void setPlayDuration(int i) {
        this.playDuration = i;
    }

    public final void setPreloadMode(int i) {
        this.preloadMode = i;
    }

    public final void setRecommendThreshold(double d) {
        this.recommendThreshold = d;
    }

    public final void setTriggerSceneId(int i) {
        this.triggerSceneId = i;
    }

    public final void setTtl(int i) {
        this.ttl = i;
    }

    public final void setWaitCountForReal(int i) {
        this.waitCountForReal = i;
    }
}
