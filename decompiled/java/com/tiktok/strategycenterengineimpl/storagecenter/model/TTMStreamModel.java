package com.tiktok.strategycenterengineimpl.storagecenter.model;

/* JADX INFO: loaded from: classes35.dex */
public final class TTMStreamModel {
    public String sceneStreamKey;
    public String strategyStreamKey;
    public String streamKey;
    public String streamOptionStr;

    public TTMStreamModel() {
        this(null, null, null, null);
    }

    private final native long nativeMakeStreamModel(String str, String str2, String str3, String str4);

    public long makeNativeModel() {
        String str = this.sceneStreamKey;
        if (str == null) {
            str = "";
        }
        String str2 = this.strategyStreamKey;
        if (str2 == null) {
            str2 = "";
        }
        String str3 = this.streamKey;
        if (str3 == null) {
            str3 = "";
        }
        String str4 = this.streamOptionStr;
        return nativeMakeStreamModel(str, str2, str3, str4 != null ? str4 : "");
    }

    public final String getSceneStreamKey() {
        return this.sceneStreamKey;
    }

    public final String getStrategyStreamKey() {
        return this.strategyStreamKey;
    }

    public final String getStreamKey() {
        return this.streamKey;
    }

    public final String getStreamOptionStr() {
        return this.streamOptionStr;
    }

    public final void setSceneStreamKey(String str) {
        this.sceneStreamKey = str;
    }

    public final void setStrategyStreamKey(String str) {
        this.strategyStreamKey = str;
    }

    public final void setStreamKey(String str) {
        this.streamKey = str;
    }

    public final void setStreamOptionStr(String str) {
        this.streamOptionStr = str;
    }

    public TTMStreamModel(String str, String str2, String str3, String str4) {
        this.sceneStreamKey = str;
        this.strategyStreamKey = str2;
        this.streamKey = str3;
        this.streamOptionStr = str4;
    }
}
