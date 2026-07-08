package com.ss.lyrax.engine;

import X.C2188811AlT;
import com.ss.lyrax.audio.LyraxAudioOption;
import com.ss.lyrax.video.LyraxVideoOption;

/* JADX INFO: loaded from: classes21.dex */
public class LyraxEngineOption {
    public LyraxAppOption appOption = new LyraxAppOption();
    public LyraxAndroidOption androidOption = new LyraxAndroidOption();
    public LyraxAudioOption audioOption = new LyraxAudioOption();
    public LyraxVideoOption videoOption = new LyraxVideoOption();
    public LyraxNetworkOption networkOption = new LyraxNetworkOption();
    public LyraxBusinessOption businessOption = new LyraxBusinessOption();
    public LyraxScene scene = LyraxScene.LIVE;
    public String liveSettings = "";
    public String resourceDownloadUrl = "";
    public boolean enableHttpVpaasConfig = false;
    public ILyraxEngineListener listener = null;
    public String logSdkWebsocketUrl = "";
    public boolean enableEventUpload = false;
    public boolean enableLocalLogCallback = false;
    public boolean inAnchorNet = false;
    public String autotestParameters = "";
    public String parameters = "";
    public boolean forceInitEnv = true;
    public boolean enableRemoveSceneNone = false;
    public int videoStrategyActiveScene = -1;
    public boolean enableLowLatencyPull = false;
    public boolean enablePreConnection = false;
    public boolean enableCreatePCInAdvance = false;
    public boolean enablePreGetConfig = false;

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LyraxEngineOption{appOption=");
        sbLIZ.append(this.appOption);
        sbLIZ.append(", androidOption=");
        sbLIZ.append(this.androidOption);
        sbLIZ.append(", audioOption=");
        sbLIZ.append(this.audioOption);
        sbLIZ.append(", networkOption=");
        sbLIZ.append(this.networkOption);
        sbLIZ.append(", businessOption=");
        sbLIZ.append(this.businessOption);
        sbLIZ.append(", scene=");
        sbLIZ.append(this.scene);
        sbLIZ.append(", liveSettings='");
        sbLIZ.append(this.liveSettings);
        sbLIZ.append('\'');
        sbLIZ.append(", enableHttpVpaasConfig=");
        sbLIZ.append(this.enableHttpVpaasConfig);
        sbLIZ.append(", listener=");
        sbLIZ.append(this.listener);
        sbLIZ.append(", logSdkWebsocketUrl='");
        sbLIZ.append(this.logSdkWebsocketUrl);
        sbLIZ.append('\'');
        sbLIZ.append(", enableEventUpload=");
        sbLIZ.append(this.enableEventUpload);
        sbLIZ.append(", enableLocalLogCallback=");
        sbLIZ.append(this.enableLocalLogCallback);
        sbLIZ.append(", inAnchorNet=");
        sbLIZ.append(this.inAnchorNet);
        sbLIZ.append(", autotestParameters='");
        sbLIZ.append(this.autotestParameters);
        sbLIZ.append('\'');
        sbLIZ.append(", parameters='");
        sbLIZ.append(this.parameters);
        sbLIZ.append('\'');
        sbLIZ.append(", forceInitEnv=");
        sbLIZ.append(this.forceInitEnv);
        sbLIZ.append(", enableRemoveSceneNone=");
        sbLIZ.append(this.enableRemoveSceneNone);
        sbLIZ.append(", videoStrategyActiveScene=");
        sbLIZ.append(this.videoStrategyActiveScene);
        sbLIZ.append(", enablePreGetConfig=");
        sbLIZ.append(this.enablePreGetConfig);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public boolean enableCreatePCInAdvance() {
        return this.enableCreatePCInAdvance;
    }

    public boolean enableEventUpload() {
        return this.enableEventUpload;
    }

    public boolean enableHttpVpaasConfig() {
        return this.enableHttpVpaasConfig;
    }

    public boolean enableLocalLogCallback() {
        return this.enableLocalLogCallback;
    }

    public boolean enableLowLatencyPull() {
        return this.enableLowLatencyPull;
    }

    public boolean enablePreConnection() {
        return this.enablePreConnection;
    }

    public boolean enablePreGetConfig() {
        return this.enablePreGetConfig;
    }

    public boolean enableRemoveSceneNone() {
        return this.enableRemoveSceneNone;
    }

    public boolean forceInitEnv() {
        return this.forceInitEnv;
    }

    public LyraxAndroidOption getAndroidOption() {
        return this.androidOption;
    }

    public LyraxAppOption getAppOption() {
        return this.appOption;
    }

    public LyraxAudioOption getAudioOption() {
        return this.audioOption;
    }

    public String getAutotestParameters() {
        return this.autotestParameters;
    }

    public LyraxBusinessOption getBusinessOption() {
        return this.businessOption;
    }

    public ILyraxEngineListener getListener() {
        return this.listener;
    }

    public String getLiveSettings() {
        return this.liveSettings;
    }

    public String getLogSdkWebsocketUrl() {
        return this.logSdkWebsocketUrl;
    }

    public LyraxNetworkOption getNetworkOption() {
        return this.networkOption;
    }

    public String getParameters() {
        return this.parameters;
    }

    public String getResourceDownloadUrl() {
        return this.resourceDownloadUrl;
    }

    public LyraxScene getScene() {
        return this.scene;
    }

    public LyraxVideoOption getVideoOption() {
        return this.videoOption;
    }

    public int getVideoStrategyActiveScene() {
        return this.videoStrategyActiveScene;
    }

    public boolean isInAnchorNet() {
        return this.inAnchorNet;
    }
}
