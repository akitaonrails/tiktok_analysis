package com.bytedance.hybrid.spark.roma.deploy.model;

import X.C09CT;

/* JADX INFO: loaded from: classes4.dex */
public final class DeployExtraConfig {

    @C09CT("spark_app_id")
    public final String sparkAppKey;

    @C09CT("page_id")
    public final String sparkPageKey;

    public DeployExtraConfig() {
        this("", "");
    }

    public DeployExtraConfig(String str, String str2) {
        this.sparkAppKey = str;
        this.sparkPageKey = str2;
    }
}
