package com.ss.android.ugc.aweme.ml.infra;

import X.C09CT;

/* JADX INFO: loaded from: classes24.dex */
public final class SmartSdkConfig {

    @C09CT("engine_type")
    public String engineType = "mlsdk";

    @C09CT("mlsdk")
    public MLSdkConfig mlSdkConfig;

    @C09CT("pitaya_ml")
    public PitayaMLConfig pitayaMLConfig;

    public String toString() {
        return super.toString();
    }

    public final String getEngineType() {
        return this.engineType;
    }

    public final MLSdkConfig getMlSdkConfig() {
        return this.mlSdkConfig;
    }

    public final PitayaMLConfig getPitayaMLConfig() {
        return this.pitayaMLConfig;
    }

    public final void setEngineType(String str) {
        this.engineType = str;
    }

    public final void setMlSdkConfig(MLSdkConfig mLSdkConfig) {
        this.mlSdkConfig = mLSdkConfig;
    }

    public final void setPitayaMLConfig(PitayaMLConfig pitayaMLConfig) {
        this.pitayaMLConfig = pitayaMLConfig;
    }
}
