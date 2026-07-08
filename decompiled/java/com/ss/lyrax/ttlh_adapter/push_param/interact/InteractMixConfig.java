package com.ss.lyrax.ttlh_adapter.push_param.interact;

/* JADX INFO: loaded from: classes21.dex */
public class InteractMixConfig {
    public boolean enableUpdateLiveTranscodingOptimization;
    public boolean mixStreamRatioOpt;
    public boolean updateRoomIdEarlyForStreamMix;

    public InteractMixConfig() {
        this.updateRoomIdEarlyForStreamMix = true;
    }

    public boolean getEnableUpdateLiveTranscodingOptimization() {
        return this.enableUpdateLiveTranscodingOptimization;
    }

    public boolean getMixStreamRatioOpt() {
        return this.mixStreamRatioOpt;
    }

    public boolean getUpdateRoomIdEarlyForStreamMix() {
        return this.updateRoomIdEarlyForStreamMix;
    }

    public InteractMixConfig(boolean z, boolean z2, boolean z3) {
        this.mixStreamRatioOpt = z;
        this.enableUpdateLiveTranscodingOptimization = z2;
        this.updateRoomIdEarlyForStreamMix = z3;
    }
}
