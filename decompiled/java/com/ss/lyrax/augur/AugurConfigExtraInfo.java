package com.ss.lyrax.augur;

import com.ss.lyrax.engine.LyraxLiveType;
import com.ss.lyrax.engine.LyraxScene;

/* JADX INFO: loaded from: classes21.dex */
public class AugurConfigExtraInfo {
    public int getConfigDurationMs;
    public boolean isCachedConfig;
    public LyraxLiveType liveType;
    public LyraxScene scene;
    public AugurConfigSource source;

    public int getConfigDurationMs() {
        return this.getConfigDurationMs;
    }

    public LyraxLiveType getLiveType() {
        return this.liveType;
    }

    public LyraxScene getScene() {
        return this.scene;
    }

    public AugurConfigSource getSource() {
        return this.source;
    }

    public boolean isCachedConfig() {
        return this.isCachedConfig;
    }

    public AugurConfigExtraInfo(AugurConfigSource augurConfigSource, LyraxScene lyraxScene) {
        this.source = augurConfigSource;
        this.scene = lyraxScene;
        this.liveType = LyraxLiveType.VIDEO;
    }

    public AugurConfigExtraInfo(AugurConfigSource augurConfigSource, LyraxScene lyraxScene, LyraxLiveType lyraxLiveType, boolean z, int i) {
        this.source = augurConfigSource;
        this.scene = lyraxScene;
        this.liveType = lyraxLiveType;
        this.isCachedConfig = z;
        this.getConfigDurationMs = i;
    }
}
