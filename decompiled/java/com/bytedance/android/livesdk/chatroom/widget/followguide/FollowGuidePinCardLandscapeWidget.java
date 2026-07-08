package com.bytedance.android.livesdk.chatroom.widget.followguide;

import X.C1161920gLG;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.function.IRoomFunctionService;

/* JADX INFO: loaded from: classes8.dex */
public final class FollowGuidePinCardLandscapeWidget extends FollowGuidePinCardWidget {
    @Override // com.bytedance.android.livesdk.chatroom.widget.followguide.FollowGuidePinCardWidget, X.InterfaceC1102150emr
    public final int getComponentType() {
        return 0;
    }

    @Override // com.bytedance.android.livesdk.chatroom.widget.followguide.FollowGuidePinCardWidget, com.bytedance.android.livesdk.chatroom.widget.followguide.FollowGuideAbsWidget, com.bytedance.android.livesdk.notify.AnimatableNotifyWidget, com.bytedance.ies.sdk.widgets.AnimatableRecyclableWidget, com.bytedance.ies.sdk.widgets.configuration.LiveRecycleSourceWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.livesdk.chatroom.widget.followguide.FollowGuidePinCardWidget, com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return ((IRoomFunctionService) C1161920gLG.LIZJ(IRoomFunctionService.class)).C22(false);
    }
}
