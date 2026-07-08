package com.bytedance.ies.sdk.widgets.widgetloadpriority;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.widgets.LiveWidget;

/* JADX INFO: loaded from: classes8.dex */
public abstract class RoomWidget extends LiveWidget {
    public void onGetRoomInfo(Room room) {
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public RoomWidget() {
        register(Room.class);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public <T> void onCustomInfoCallBack(T t) {
        if (t instanceof Room) {
            onGetRoomInfo((Room) t);
        }
        super.onCustomInfoCallBack(t);
    }
}
