package com.bytedance.android.livesdk.unityanimation.service;

import X.C1749590vd7;
import X.InterfaceC1749600vd8;
import com.bytedance.android.live.unityanimation.service.IUnityAnimationService;
import com.bytedance.android.livesdk.unityanimation.event.UnityAnimationDataChannel;
import com.bytedance.android.livesdk.unityanimation.widget.EventAreaUnityAnimationWidget;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* JADX INFO: loaded from: classes27.dex */
public class UnityAnimationService implements IUnityAnimationService {
    @Override // com.bytedance.android.live.unityanimation.service.IUnityAnimationService
    public final Class<EventAreaUnityAnimationWidget> BI0() {
        return EventAreaUnityAnimationWidget.class;
    }

    @Override // com.bytedance.android.live.unityanimation.service.IUnityAnimationService
    public final void lN1(DataChannel dataChannel, String str, InterfaceC1749600vd8 interfaceC1749600vd8) {
        if (dataChannel != null) {
            dataChannel.LC0(UnityAnimationDataChannel.class, new C1749590vd7(str, interfaceC1749600vd8));
        }
    }
}
