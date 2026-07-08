package com.ss.android.ugc.aweme.live.livehostimpl;

import X.C1580830rEv;
import X.C1580840rEw;
import com.bytedance.android.livesdkapi.host.IHostEvent;
import org.greenrobot.eventbus.EventBus;

/* JADX INFO: loaded from: classes25.dex */
public final class LiveHostEvent implements IHostEvent {
    @Override // com.bytedance.android.livesdkapi.host.IHostEvent
    public final /* bridge */ /* synthetic */ void onInit() {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostEvent
    public final void postRegisterEvent(String str) {
        EventBus.LIZLLL().LJIILL(new C1580830rEv(str));
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostEvent
    public final void postUnregisterEvent(String str) {
        EventBus.LIZLLL().LJIILL(new C1580840rEw(str));
    }
}
