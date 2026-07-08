package com.bytedance.android.livesdkapi.host.dummy;

import android.content.Intent;
import com.bytedance.android.livesdkapi.host.ILiveHostSandbox;

/* JADX INFO: loaded from: classes36.dex */
public final class LiveHostSandboxDummy implements ILiveHostSandbox {
    public static final int $stable = 0;

    @Override // com.bytedance.android.livesdkapi.host.ILiveHostSandbox
    public void appendDataFlowId(Intent intent, int i) {
    }

    @Override // com.bytedance.android.livesdkapi.host.ILiveHostSandbox
    public boolean needInterceptBySandbox(Intent intent, int i) {
        return false;
    }

    @Override // com.bytedance.android.livesdkapi.host.ILiveHostSandbox
    public /* bridge */ /* synthetic */ void onInit() {
    }
}
