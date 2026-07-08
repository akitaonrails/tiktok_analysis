package com.ss.lyrax.augur;

import com.ss.lyrax.engine.AugurStatusCallback;
import com.ss.lyrax.engine.LyraxAppLogHandler;
import com.ss.lyrax.engine.LyraxLiveType;
import com.ss.lyrax.engine.LyraxScene;

/* JADX INFO: loaded from: classes21.dex */
public class AugurOption {
    public LyraxAppLogHandler appLogHandler;
    public long configRequesterHandle;
    public AugurStatusCallback statusCallback;
    public String appId = "";
    public String configJson = "{}";
    public AugurConfigMigrationConfig configMigrationConfig = new AugurConfigMigrationConfig();
    public LyraxScene scene = LyraxScene.LINKMIC;
    public LyraxLiveType liveType = LyraxLiveType.VIDEO;

    public String getAppId() {
        return this.appId;
    }

    public LyraxAppLogHandler getAppLogHandler() {
        return this.appLogHandler;
    }

    public String getConfigJson() {
        return this.configJson;
    }

    public AugurConfigMigrationConfig getConfigMigrationConfig() {
        return this.configMigrationConfig;
    }

    public long getConfigRequesterHandle() {
        return this.configRequesterHandle;
    }

    public LyraxLiveType getLiveType() {
        return this.liveType;
    }

    public LyraxScene getScene() {
        return this.scene;
    }

    public AugurStatusCallback getStatusCallback() {
        return this.statusCallback;
    }
}
