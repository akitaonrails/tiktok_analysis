package com.bytedance.helios.network.api.service;

/* JADX INFO: loaded from: classes14.dex */
public final class ReplaceConfig {
    public String target;
    public String value;

    public ReplaceConfig() {
        this("", "key");
    }

    public final void setTarget(String str) {
        this.target = str;
    }

    public final void setValue(String str) {
        this.value = str;
    }

    public ReplaceConfig(String str, String str2) {
        this.value = str;
        this.target = str2;
    }
}
