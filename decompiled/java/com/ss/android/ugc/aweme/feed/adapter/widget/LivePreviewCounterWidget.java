package com.ss.android.ugc.aweme.feed.adapter.widget;

import X.C1ACA;
import X.C20441214yg;
import X.C2188811AlT;
import X.C748910TZh;
import X.InterfaceC473820Ii4;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;

/* JADX INFO: loaded from: classes8.dex */
public final class LivePreviewCounterWidget extends LiveWatchPreviewWidget {
    public InterfaceC473820Ii4 LLJ;

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final void M1() {
        C20441214yg.LJIIIZ("LivePreviewCounterWidget", "destroyPreviewCounter");
        InterfaceC473820Ii4 interfaceC473820Ii4 = this.LLJ;
        if (interfaceC473820Ii4 != null) {
            interfaceC473820Ii4.LIZIZ();
        }
        this.LLJ = null;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
        C20441214yg.LIZIZ("LivePreviewCounterWidget", "onUnload");
        M1();
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget
    public final void F1() {
        C1ACA c1aca;
        LiveRoomStruct liveRoomStruct;
        Long lValueOf = Long.valueOf(UserService.getInstance().user().getCurrentUserId());
        DataChannel dataChannel = this.dataChannel;
        Long lValueOf2 = (dataChannel == null || (c1aca = (C1ACA) dataChannel.gg0(C748910TZh.class)) == null || (liveRoomStruct = c1aca.LIZJ) == null) ? null : Long.valueOf(liveRoomStruct.id);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("startPreviewCounter, roomId:");
        sbLIZ.append(lValueOf2);
        C20441214yg.LJIIIZ("LivePreviewCounterWidget", C2188811AlT.LIZIZ(sbLIZ));
        if (lValueOf == null || lValueOf2 == null) {
            return;
        }
        M1();
        InterfaceC473820Ii4 interfaceC473820Ii4D6 = ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).d6(String.valueOf(lValueOf), String.valueOf(lValueOf2));
        this.LLJ = interfaceC473820Ii4D6;
        if (interfaceC473820Ii4D6 != null) {
            interfaceC473820Ii4D6.LIZ();
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget
    public final void L1() {
        super.L1();
        M1();
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget
    public final void LJLIIIL(int i) {
        this.LL = false;
        M1();
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
        C20441214yg.LIZIZ("LivePreviewCounterWidget", "onInit");
    }
}
