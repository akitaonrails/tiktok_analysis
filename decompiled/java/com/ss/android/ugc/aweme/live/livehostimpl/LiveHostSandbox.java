package com.ss.android.ugc.aweme.live.livehostimpl;

import X.C2429209fW;
import android.content.Intent;
import com.bytedance.android.livesdkapi.host.ILiveHostSandbox;

/* JADX INFO: loaded from: classes14.dex */
public final class LiveHostSandbox implements ILiveHostSandbox {
    public static final int $stable = 0;

    @Override // com.bytedance.android.livesdkapi.host.ILiveHostSandbox
    public /* bridge */ /* synthetic */ void onInit() {
    }

    @Override // com.bytedance.android.livesdkapi.host.ILiveHostSandbox
    public void appendDataFlowId(Intent intent, int i) {
        C2429209fW.LIZ().appendDataFlowId(intent, i);
    }

    @Override // com.bytedance.android.livesdkapi.host.ILiveHostSandbox
    public boolean needInterceptBySandbox(Intent intent, int i) {
        return C2429209fW.LIZ().needInterceptBySandbox(intent, i);
    }
}
