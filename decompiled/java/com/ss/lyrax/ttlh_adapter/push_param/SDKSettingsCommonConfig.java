package com.ss.lyrax.ttlh_adapter.push_param;

/* JADX INFO: loaded from: classes21.dex */
public class SDKSettingsCommonConfig {
    public boolean anchorNetNoRoomJoinRoomOnce;
    public String autotestAccessHost;
    public String autotestLogSdkWebsocketUrl;
    public String autotestParameters;
    public String autotestRtcAppId;
    public boolean enableAppDataSeiIntercept;
    public boolean enableArchOptLog;
    public boolean enableArchOptPhase1;
    public boolean enableArchOptPhase2;
    public boolean enableGuestUseRTCVideo2;
    public boolean enableLyraxAutotest;
    public boolean enableMockSeiIntercept;
    public boolean enableNativeLive;
    public boolean enableNewSurfaceAsync;
    public boolean enableSandBoxShutDown;
    public boolean enableSeiIntercept;
    public boolean enableVideoIntercept;
    public String sessionId;

    public SDKSettingsCommonConfig() {
        this.sessionId = "";
        this.autotestParameters = "";
        this.autotestLogSdkWebsocketUrl = "";
        this.autotestRtcAppId = "";
        this.autotestAccessHost = "";
        this.enableNewSurfaceAsync = true;
    }

    public boolean getAnchorNetNoRoomJoinRoomOnce() {
        return this.anchorNetNoRoomJoinRoomOnce;
    }

    public String getAutotestAccessHost() {
        return this.autotestAccessHost;
    }

    public String getAutotestLogSdkWebsocketUrl() {
        return this.autotestLogSdkWebsocketUrl;
    }

    public String getAutotestParameters() {
        return this.autotestParameters;
    }

    public String getAutotestRtcAppId() {
        return this.autotestRtcAppId;
    }

    public boolean getEnableAppDataSeiIntercept() {
        return this.enableAppDataSeiIntercept;
    }

    public boolean getEnableArchOptLog() {
        return this.enableArchOptLog;
    }

    public boolean getEnableArchOptPhase1() {
        return this.enableArchOptPhase1;
    }

    public boolean getEnableArchOptPhase2() {
        return this.enableArchOptPhase2;
    }

    public boolean getEnableGuestUseRTCVideo2() {
        return this.enableGuestUseRTCVideo2;
    }

    public boolean getEnableLyraxAutotest() {
        return this.enableLyraxAutotest;
    }

    public boolean getEnableMockSeiIntercept() {
        return this.enableMockSeiIntercept;
    }

    public boolean getEnableNativeLive() {
        return this.enableNativeLive;
    }

    public boolean getEnableNewSurfaceAsync() {
        return this.enableNewSurfaceAsync;
    }

    public boolean getEnableSandBoxShutDown() {
        return this.enableSandBoxShutDown;
    }

    public boolean getEnableSeiIntercept() {
        return this.enableSeiIntercept;
    }

    public boolean getEnableVideoIntercept() {
        return this.enableVideoIntercept;
    }

    public String getSessionId() {
        return this.sessionId;
    }

    public SDKSettingsCommonConfig(String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, String str2, String str3, String str4, String str5) {
        this.sessionId = str;
        this.enableVideoIntercept = z;
        this.enableSeiIntercept = z2;
        this.enableSandBoxShutDown = z3;
        this.enableAppDataSeiIntercept = z4;
        this.enableMockSeiIntercept = z5;
        this.enableArchOptPhase1 = z6;
        this.enableArchOptLog = z7;
        this.enableArchOptPhase2 = z8;
        this.enableGuestUseRTCVideo2 = z9;
        this.autotestParameters = str2;
        this.autotestRtcAppId = str4;
        this.autotestAccessHost = str5;
        this.autotestLogSdkWebsocketUrl = str3;
        this.enableLyraxAutotest = z10;
        this.anchorNetNoRoomJoinRoomOnce = z11;
        this.enableNewSurfaceAsync = z12;
        this.enableNativeLive = z13;
    }
}
