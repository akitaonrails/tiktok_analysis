package com.bytedance.ies.abmock.datacenter.plugin;

/* JADX INFO: loaded from: classes.dex */
public abstract class BasePluginMockModelJson {
    public StringBuilder mockModelJsonBuilder;

    public String getMockModelJson() {
        StringBuilder sb = this.mockModelJsonBuilder;
        return sb == null ? "[]" : sb.toString();
    }
}
