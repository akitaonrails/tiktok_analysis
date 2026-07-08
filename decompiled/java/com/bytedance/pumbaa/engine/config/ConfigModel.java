package com.bytedance.pumbaa.engine.config;

import X.C09CT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes14.dex */
public final class ConfigModel {

    @C09CT("config")
    public final String config;

    @C09CT("schema_version")
    public final int schemaVersion;

    public ConfigModel() {
        this(null, 1);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConfigModel)) {
            return false;
        }
        ConfigModel configModel = (ConfigModel) obj;
        return Intrinsics.LJFF(this.config, configModel.config) && this.schemaVersion == configModel.schemaVersion;
    }

    public ConfigModel(String str, int i) {
        this.config = str;
        this.schemaVersion = i;
    }
}
