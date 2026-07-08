package com.bytedance.vcloud.strategy;

/* JADX INFO: loaded from: classes24.dex */
public interface IStrategyStateSupplier {
    String getNetworkRttListString(int i);

    double getNetworkScore();

    String getNetworkSignalListString(int i);

    double getNetworkSpeed();

    int getNetworkType();

    String mediaInfoJsonString(String str);

    String onAfterSelect(String str, String str2, int i, Object obj);

    String onBeforeSelect(String str, String str2, int i, Object obj);

    String selectBitrateJsonString(String str, int i);

    String selectBitrateJsonString(String str, String str2, int i);
}
