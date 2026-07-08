package com.bytedance.android.livesdk.comp.api.linkcore.model;

/* JADX INFO: loaded from: classes32.dex */
public final class MatchComponentTypeInfo {
    public long duration;
    public boolean isReported;
    public ComponentTypeResult result;
    public String startShowTime;

    public final boolean isReported() {
        return this.isReported;
    }

    public final void setDuration(long j) {
        this.duration = j;
    }

    public final void setReported(boolean z) {
        this.isReported = z;
    }

    public final void setResult(ComponentTypeResult componentTypeResult) {
        this.result = componentTypeResult;
    }

    public final void setStartShowTime(String str) {
        this.startShowTime = str;
    }

    public MatchComponentTypeInfo(String str, long j, ComponentTypeResult componentTypeResult, boolean z) {
        this.startShowTime = str;
        this.duration = j;
        this.result = componentTypeResult;
        this.isReported = z;
    }
}
