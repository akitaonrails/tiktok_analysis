package com.tiktok.strategycenterengineimpl.storagecenter.model;

import X.C1697810uHb;
import java.util.List;

/* JADX INFO: loaded from: classes35.dex */
public final class TTMStrategyModel {
    public List<TTMActionModel> actionInfo;
    public TTMPackageModel packageInfo;
    public String strategyKey;

    public TTMStrategyModel() {
        this(null, null, null);
    }

    private final native long nativeMakeStrategyModel(String str, long j, long[] jArr, int i);

    public long makeNativeModel() {
        List<TTMActionModel> list = this.actionInfo;
        int i = 0;
        int size = list != null ? list.size() : 0;
        long[] jArr = new long[size];
        List<TTMActionModel> list2 = this.actionInfo;
        if (list2 != null) {
            for (TTMActionModel tTMActionModel : list2) {
                int i2 = i + 1;
                if (i < 0) {
                    C1697810uHb.LJIJI();
                    throw null;
                }
                jArr[i] = tTMActionModel.makeNativeModel();
                i = i2;
            }
        }
        String str = this.strategyKey;
        if (str == null) {
            str = "";
        }
        TTMPackageModel tTMPackageModel = this.packageInfo;
        return nativeMakeStrategyModel(str, tTMPackageModel != null ? tTMPackageModel.makeNativeModel() : 0L, jArr, size);
    }

    public final List<TTMActionModel> getActionInfo() {
        return this.actionInfo;
    }

    public final TTMPackageModel getPackageInfo() {
        return this.packageInfo;
    }

    public final String getStrategyKey() {
        return this.strategyKey;
    }

    public final void setActionInfo(List<TTMActionModel> list) {
        this.actionInfo = list;
    }

    public final void setPackageInfo(TTMPackageModel tTMPackageModel) {
        this.packageInfo = tTMPackageModel;
    }

    public final void setStrategyKey(String str) {
        this.strategyKey = str;
    }

    public TTMStrategyModel(String str, TTMPackageModel tTMPackageModel, List<TTMActionModel> list) {
        this.strategyKey = str;
        this.packageInfo = tTMPackageModel;
        this.actionInfo = list;
    }
}
