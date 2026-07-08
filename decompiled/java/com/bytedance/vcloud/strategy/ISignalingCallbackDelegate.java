package com.bytedance.vcloud.strategy;

import java.util.List;

/* JADX INFO: loaded from: classes24.dex */
public interface ISignalingCallbackDelegate {
    void handleCdnSwitch(List<String> list, long j, long j2, boolean z, String str, long j3);

    void onSignalIgnored(String str, long j, long j2, String str2);
}
