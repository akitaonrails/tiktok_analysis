package com.ss.bytertc.engine.live;

/* JADX INFO: loaded from: classes4.dex */
public class ChorusCacheSyncConfig {
    public int maxCacheTimeMs = 2000;
    public ChorusCacheSyncMode mode = ChorusCacheSyncMode.CHORUS_CACHE_SYNC_MODE_RETRANSMITTER;
    public int videoFps = 15;

    public int getChorusCacheSyncConfigMode() {
        return this.mode.value();
    }

    public int getChorusCacheSyncConfigMaxCacheTimeMs() {
        return this.maxCacheTimeMs;
    }

    public int getChorusCacheSyncConfigVideoFps() {
        return this.videoFps;
    }

    public int getMaxCacheTimeMs() {
        return this.maxCacheTimeMs;
    }

    public ChorusCacheSyncMode getMode() {
        return this.mode;
    }

    public int getVideoFps() {
        return this.videoFps;
    }

    public ChorusCacheSyncConfig setMaxCacheTimeMs(int i) {
        this.maxCacheTimeMs = i;
        return this;
    }

    public ChorusCacheSyncConfig setMode(ChorusCacheSyncMode chorusCacheSyncMode) {
        this.mode = chorusCacheSyncMode;
        return this;
    }

    public ChorusCacheSyncConfig setVideoFps(int i) {
        this.videoFps = i;
        return this;
    }
}
