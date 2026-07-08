package com.bytedance.hybrid.spark.roma.deploy.model;

import X.C09CT;

/* JADX INFO: loaded from: classes4.dex */
public final class SparkAppModel {

    @C09CT("details")
    public final SparkAppDetailsModel details;

    @C09CT("update_mode")
    public final UpdateMode updateMode;

    @C09CT("version")
    public final String version;

    public SparkAppModel() {
        this("", UpdateMode.LATEST, new SparkAppDetailsModel(null, null, null, 7, null));
    }

    public SparkAppModel(String str, UpdateMode updateMode, SparkAppDetailsModel sparkAppDetailsModel) {
        this.version = str;
        this.updateMode = updateMode;
        this.details = sparkAppDetailsModel;
    }
}
