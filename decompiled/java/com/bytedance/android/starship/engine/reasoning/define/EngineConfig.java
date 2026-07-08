package com.bytedance.android.starship.engine.reasoning.define;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes24.dex */
public final class EngineConfig implements Serializable {

    @C09CT("type")
    public final int engineType;

    @C09CT("feature_set")
    public String featureSetName;

    @C09CT("model_out_type")
    public String outType;

    @C09CT("source")
    public String source;

    @C09CT("strategy_name")
    public String strategyName;

    @C09CT("upload_config")
    public EngineUploadConfig uploadConfig;

    public EngineConfig() {
        this(0, null, null, "classify", null);
    }

    public final void setFeatureSetName(String str) {
        this.featureSetName = str;
    }

    public final void setOutType(String str) {
        this.outType = str;
    }

    public final void setSource(String str) {
        this.source = str;
    }

    public final void setStrategyName(String str) {
        this.strategyName = str;
    }

    public final void setUploadConfig(EngineUploadConfig engineUploadConfig) {
        this.uploadConfig = engineUploadConfig;
    }

    public EngineConfig(int i, String str, String str2, String str3, EngineUploadConfig engineUploadConfig) {
        this.engineType = i;
        this.source = str;
        this.featureSetName = str2;
        this.outType = str3;
        this.uploadConfig = engineUploadConfig;
    }
}
