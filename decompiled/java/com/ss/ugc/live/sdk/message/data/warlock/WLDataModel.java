package com.ss.ugc.live.sdk.message.data.warlock;

/* JADX INFO: loaded from: classes35.dex */
public final class WLDataModel {
    public WLType type = WLType.COMMON;
    public String subType = "";
    public String name = "";
    public long time = System.currentTimeMillis();
    public String params = "{}";
    public String result = "{}";

    public final String getName() {
        return this.name;
    }

    public final String getParams() {
        return this.params;
    }

    public final String getResult() {
        return this.result;
    }

    public final String getSubType() {
        return this.subType;
    }

    public final long getTime() {
        return this.time;
    }

    public final WLType getType() {
        return this.type;
    }

    public final void setName(String str) {
        this.name = str;
    }

    public final void setParams(String str) {
        this.params = str;
    }

    public final void setResult(String str) {
        this.result = str;
    }

    public final void setSubType(String str) {
        this.subType = str;
    }

    public final void setTime(long j) {
        this.time = j;
    }

    public final void setType(WLType wLType) {
        this.type = wLType;
    }
}
