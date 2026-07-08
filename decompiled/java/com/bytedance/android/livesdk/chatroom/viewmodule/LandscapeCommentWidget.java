package com.bytedance.android.livesdk.chatroom.viewmodule;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ies.sdk.widgets.RecycleSource;
import com.zhiliaoapp.musically.R;
import org.json.JSONException;

/* JADX INFO: loaded from: classes18.dex */
public final class LandscapeCommentWidget extends CommentWidget {
    @Override // com.bytedance.android.livesdk.chatroom.viewmodule.CommentWidget, com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.hr8;
    }

    @Override // com.bytedance.android.livesdk.chatroom.viewmodule.CommentWidget, com.bytedance.ies.sdk.widgets.AnimatableRoomRecyclableWidget, com.bytedance.ies.sdk.widgets.widgetloadpriority.RoomRecycleWidget, com.bytedance.ies.sdk.widgets.configuration.LiveRecycleSourceWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.livesdk.chatroom.viewmodule.CommentWidget, com.bytedance.ies.sdk.widgets.widgetloadpriority.RoomRecycleWidget, com.bytedance.ies.sdk.widgets.configuration.LiveRecycleSourceWidget
    public final void onLoad(RecycleSource recycleSource, Object[] objArr) throws JSONException {
        super.onLoad(recycleSource, objArr);
    }
}
