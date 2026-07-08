package com.bytedance.android.livesdkapi.host.dummy;

import com.bytedance.android.livesdkapi.host.IHostWarlock;
import com.ss.ugc.live.sdk.message.data.warlock.WLDataModel;

/* JADX INFO: loaded from: classes35.dex */
public class LiveHostWarlockDummy implements IHostWarlock {
    @Override // com.bytedance.android.livesdkapi.host.IHostWarlock
    public final boolean isOpen() {
        return false;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostWarlock
    public final void sendMessage(WLDataModel wLDataModel) {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostWarlock
    public final /* bridge */ /* synthetic */ void onInit() {
    }
}
