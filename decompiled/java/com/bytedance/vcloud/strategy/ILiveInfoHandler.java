package com.bytedance.vcloud.strategy;

/* JADX INFO: loaded from: classes24.dex */
public interface ILiveInfoHandler {
    void onLocalDnsResolved(String str);

    void onVpassResponse(String str);

    void syncStrategyOption(String str);
}
