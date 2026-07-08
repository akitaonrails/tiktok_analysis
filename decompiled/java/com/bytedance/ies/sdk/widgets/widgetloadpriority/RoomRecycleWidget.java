package com.bytedance.ies.sdk.widgets.widgetloadpriority;

import android.view.View;
import android.view.animation.AlphaAnimation;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.livesetting.watchlive.LivePreloadInteractionLayerSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.widgets.RecycleSource;
import com.bytedance.ies.sdk.widgets.configuration.LiveRecycleSourceWidget;

/* JADX INFO: loaded from: classes8.dex */
public abstract class RoomRecycleWidget extends LiveRecycleSourceWidget {
    public boolean isAnimated;

    public void onGetRoomInfo(Room room) {
    }

    @Override // com.bytedance.ies.sdk.widgets.configuration.LiveRecycleSourceWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public RoomRecycleWidget() {
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

    @Override // com.bytedance.ies.sdk.widgets.configuration.LiveRecycleSourceWidget
    public void onUnload(RecycleSource recycleSource) {
        this.isAnimated = false;
    }

    @Override // com.bytedance.ies.sdk.widgets.configuration.LiveRecycleSourceWidget
    public void onLoad(RecycleSource recycleSource, Object[] objArr) {
        if (!this.isAnimated && LivePreloadInteractionLayerSetting.INSTANCE.isEnablePreload(this.dataChannel)) {
            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
            alphaAnimation.setDuration(200L);
            View view = getView();
            if (view != null) {
                view.startAnimation(alphaAnimation);
            }
            this.isAnimated = true;
        }
    }
}
