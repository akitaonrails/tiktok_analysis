package com.bytedance.forest.model;

/* JADX INFO: loaded from: classes24.dex */
public final class ForestEnvData {
    public final boolean isDebug;
    public final String name;
    public final ForestEnvType type;

    public final boolean isDebug() {
        return this.isDebug;
    }

    public ForestEnvData(ForestEnvType forestEnvType, String str, boolean z) {
        this.type = forestEnvType;
        this.name = str;
        this.isDebug = z;
    }
}
