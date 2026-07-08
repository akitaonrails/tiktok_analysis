package com.ss.android.ugc.aweme.property;

import X.C09CT;
import com.ss.android.ugc.aweme.ml.infra.PitayaMLConfig;

/* JADX INFO: loaded from: classes23.dex */
public final class SmartCompileModelV1 extends SmartCompileBaseModel {
    public static final int $stable = 8;

    @C09CT("engine_type")
    public String engineType;

    @C09CT("hw_compile_setting")
    public final String hwCompileSetting;

    @C09CT("pitaya_ml")
    public final PitayaMLConfig pitayaMLConfig;

    @C09CT("sw_compile_setting")
    public final String swCompileSetting;

    public final String getEngineType() {
        return this.engineType;
    }

    public final String getHwCompileSetting() {
        return this.hwCompileSetting;
    }

    public final PitayaMLConfig getPitayaMLConfig() {
        return this.pitayaMLConfig;
    }

    public final String getSwCompileSetting() {
        return this.swCompileSetting;
    }

    public final void setEngineType(String str) {
        this.engineType = str;
    }

    public SmartCompileModelV1(String str, int i, String str2, String str3, String str4, String str5, PitayaMLConfig pitayaMLConfig) {
        super(str, i, str2);
        this.swCompileSetting = str3;
        this.hwCompileSetting = str4;
        this.engineType = str5;
        this.pitayaMLConfig = pitayaMLConfig;
    }
}
