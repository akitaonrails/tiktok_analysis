package com.bytedance.android.starship.solaria.define;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class FeatureHouseDataConfig implements Serializable {

    @C09CT("relative_convert")
    public boolean convert;

    @C09CT("features")
    public List<FeatureGroupConfig> featureGroup;

    @C09CT("pty_features")
    public PtyFeatureConfig ptyfeatures;

    @C09CT("reals")
    public List<FeatureGroupConfig> realFeatureGroup;

    @C09CT("name")
    public String scene;

    @C09CT("upload_configs")
    public FeatureUploadConfig uploadEvent;

    @C09CT("version")
    public String version;

    public FeatureHouseDataConfig() {
        this(null, null, null, null, false, null, null);
    }

    public final void setConvert(boolean z) {
        this.convert = z;
    }

    public final void setFeatureGroup(List<FeatureGroupConfig> list) {
        this.featureGroup = list;
    }

    public final void setPtyfeatures(PtyFeatureConfig ptyFeatureConfig) {
        this.ptyfeatures = ptyFeatureConfig;
    }

    public final void setRealFeatureGroup(List<FeatureGroupConfig> list) {
        this.realFeatureGroup = list;
    }

    public final void setScene(String str) {
        this.scene = str;
    }

    public final void setUploadEvent(FeatureUploadConfig featureUploadConfig) {
        this.uploadEvent = featureUploadConfig;
    }

    public final void setVersion(String str) {
        this.version = str;
    }

    public FeatureHouseDataConfig(String str, String str2, FeatureUploadConfig featureUploadConfig, List<FeatureGroupConfig> list, boolean z, List<FeatureGroupConfig> list2, PtyFeatureConfig ptyFeatureConfig) {
        this.scene = str;
        this.version = str2;
        this.uploadEvent = featureUploadConfig;
        this.featureGroup = list;
        this.convert = z;
        this.realFeatureGroup = list2;
        this.ptyfeatures = ptyFeatureConfig;
    }
}
