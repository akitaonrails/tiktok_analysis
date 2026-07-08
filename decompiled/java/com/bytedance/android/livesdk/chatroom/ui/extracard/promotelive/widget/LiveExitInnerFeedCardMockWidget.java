package com.bytedance.android.livesdk.chatroom.ui.extracard.promotelive.widget;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import webcast.api.room.EncourageGoLiveCard;

/* JADX INFO: loaded from: classes8.dex */
public final class LiveExitInnerFeedCardMockWidget extends ILiveExitParentCardWidget {
    @Override // com.bytedance.android.livesdk.chatroom.ui.extracard.promotelive.widget.ILiveExitParentCardWidget, com.bytedance.android.livesdk.chatroom.ui.extracard.promotelive.widget.ILiveNewStyleCardWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public LiveExitInnerFeedCardMockWidget(EncourageGoLiveCard encourageGoLiveCard) {
        super(encourageGoLiveCard);
    }
}
