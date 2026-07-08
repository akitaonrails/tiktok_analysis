package com.bytedance.ies.sdk.widgets;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ies.sdk.widgets.IAnimatableWidget;
import com.bytedance.ies.sdk.widgets.widgetloadpriority.RoomRecycleWidget;

/* JADX INFO: loaded from: classes18.dex */
public abstract class AnimatableRoomRecyclableWidget extends RoomRecycleWidget implements IAnimatableWidget {
    @Override // com.bytedance.ies.sdk.widgets.widgetloadpriority.RoomRecycleWidget, com.bytedance.ies.sdk.widgets.configuration.LiveRecycleSourceWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.ies.sdk.widgets.IAnimatableWidget
    public void animateHide() {
        IAnimatableWidget.DefaultImpls.animateHide(this);
    }

    @Override // com.bytedance.ies.sdk.widgets.IAnimatableWidget
    public void animateShow() {
        IAnimatableWidget.DefaultImpls.animateShow(this);
    }

    @Override // com.bytedance.ies.sdk.widgets.IAnimatableWidget
    public void cancelHideAnimation() {
        IAnimatableWidget.DefaultImpls.cancelHideAnimation(this);
    }

    @Override // com.bytedance.ies.sdk.widgets.IAnimatableWidget
    public void cancelShowAnimation() {
        IAnimatableWidget.DefaultImpls.cancelShowAnimation(this);
    }

    public void onHideAnimationEnd() {
        IAnimatableWidget.DefaultImpls.onHideAnimationEnd(this);
    }

    @Override // com.bytedance.ies.sdk.widgets.IAnimatableWidget
    public void onHideAnimationStart() {
        IAnimatableWidget.DefaultImpls.onHideAnimationStart(this);
    }

    @Override // com.bytedance.ies.sdk.widgets.IAnimatableWidget
    public void onShowAnimationEnd() {
        IAnimatableWidget.DefaultImpls.onShowAnimationEnd(this);
    }

    public void onShowAnimationStart() {
        IAnimatableWidget.DefaultImpls.onShowAnimationStart(this);
    }
}
