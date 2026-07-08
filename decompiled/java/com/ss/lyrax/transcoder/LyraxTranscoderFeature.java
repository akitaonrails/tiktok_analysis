package com.ss.lyrax.transcoder;

/* JADX INFO: loaded from: classes21.dex */
public class LyraxTranscoderFeature {
    public String featureName;
    public String options;
    public String projectKey;

    public String getFeatureName() {
        return this.featureName;
    }

    public String getOptions() {
        return this.options;
    }

    public String getProjectKey() {
        return this.projectKey;
    }

    public LyraxTranscoderFeature(String str, String str2, String str3) {
        this.featureName = str;
        this.projectKey = str2;
        this.options = str3;
    }
}
