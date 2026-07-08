package com.ss.ttlivestreamer.livestreamv2.sdkparams;

import X.C09CT;
import X.C1274040jG6;
import com.ss.lyrax.ttlh_adapter.push_param.SDKSettingsCommonConfig;

/* JADX INFO: loaded from: classes21.dex */
public final class SandboxParams {

    @C09CT("enable_app_data_sei_intercept")
    public boolean enableAppDataSeiIntercept;

    @C09CT("enable_mock_sei_intercept")
    public boolean enableMockSeiIntercept;

    @C09CT("enable_sandbox_shutdown")
    public boolean enableSandBoxShutDown;

    @C09CT("enable_sei_intercept")
    public boolean enableSeiIntercept;

    @C09CT("enable_video_intercept")
    public boolean enableVideoIntercept;

    public final boolean LIZ() {
        return this.enableMockSeiIntercept && C1274040jG6.LIZ;
    }

    public final void LIZIZ(SDKSettingsCommonConfig sDKSettingsCommonConfig) {
        this.enableVideoIntercept = sDKSettingsCommonConfig.getEnableVideoIntercept();
        this.enableSeiIntercept = sDKSettingsCommonConfig.getEnableSeiIntercept();
        this.enableSandBoxShutDown = sDKSettingsCommonConfig.getEnableSandBoxShutDown();
        this.enableAppDataSeiIntercept = sDKSettingsCommonConfig.getEnableAppDataSeiIntercept();
        this.enableMockSeiIntercept = sDKSettingsCommonConfig.getEnableMockSeiIntercept();
    }
}
