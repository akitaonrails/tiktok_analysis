package com.tiktok.strategycenterengineimpl.storagecenter.model;

/* JADX INFO: loaded from: classes35.dex */
public final class TTMActionModel {
    public String actionParam;
    public int actionType;
    public int orderIndex;
    public String strategyKey;

    private final native long nativeSaveActionModel(String str, int i, String str2, int i2);

    public long makeNativeModel() {
        String str = this.strategyKey;
        int i = this.actionType;
        String str2 = this.actionParam;
        if (str2 == null) {
            str2 = "";
        }
        return nativeSaveActionModel(str, i, str2, this.orderIndex);
    }

    public final String getActionParam() {
        return this.actionParam;
    }

    public final int getActionType() {
        return this.actionType;
    }

    public final int getOrderIndex() {
        return this.orderIndex;
    }

    public final String getStrategyKey() {
        return this.strategyKey;
    }

    public final void setActionParam(String str) {
        this.actionParam = str;
    }

    public final void setActionType(int i) {
        this.actionType = i;
    }

    public final void setOrderIndex(int i) {
        this.orderIndex = i;
    }

    public final void setStrategyKey(String str) {
        this.strategyKey = str;
    }

    public TTMActionModel(String str, int i, String str2, int i2) {
        this.strategyKey = str;
        this.actionType = i;
        this.actionParam = str2;
        this.orderIndex = i2;
    }
}
