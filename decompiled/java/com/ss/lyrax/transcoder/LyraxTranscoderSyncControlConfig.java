package com.ss.lyrax.transcoder;

/* JADX INFO: loaded from: classes21.dex */
public class LyraxTranscoderSyncControlConfig {
    public int maxCacheTimeMS = 200;
    public LyraxTranscoderSyncStrategy syncStrategy = LyraxTranscoderSyncStrategy.NO_SYNC;
    public String baseUserId = "";
    public boolean videoNeedSDKMix = true;

    public String getBaseUserId() {
        return this.baseUserId;
    }

    public int getMaxCacheTimeMS() {
        return this.maxCacheTimeMS;
    }

    public LyraxTranscoderSyncStrategy getSyncStrategy() {
        return this.syncStrategy;
    }

    public boolean getVideoNeedSDKMix() {
        return this.videoNeedSDKMix;
    }

    public void setBaseUserId(String str) {
        this.baseUserId = str;
    }

    public void setMaxCacheTimeMS(int i) {
        this.maxCacheTimeMS = i;
    }

    public void setSyncStrategy(LyraxTranscoderSyncStrategy lyraxTranscoderSyncStrategy) {
        this.syncStrategy = lyraxTranscoderSyncStrategy;
    }

    public void setVideoNeedSDKMix(boolean z) {
        this.videoNeedSDKMix = z;
    }
}
