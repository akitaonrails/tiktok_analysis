package com.bytedance.ies.sdk.widgets;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ies.sdk.widgets.IAnimatableWidget;
import com.bytedance.ies.sdk.widgets.configuration.LiveRecycleSourceWidget;

/* JADX INFO: loaded from: classes18.dex */
public abstract class AnimatableRecyclableWidget extends LiveRecycleSourceWidget implements IAnimatableWidget {
    @Override // com.bytedance.ies.sdk.widgets.configuration.LiveRecycleSourceWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public void animateHide() {
        IAnimatableWidget.DefaultImpls.animateHide(this);
    }

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

    public void onHideAnimationStart() {
        IAnimatableWidget.DefaultImpls.onHideAnimationStart(this);
    }

    public void onShowAnimationEnd() {
        IAnimatableWidget.DefaultImpls.onShowAnimationEnd(this);
    }

    public void onShowAnimationStart() {
        IAnimatableWidget.DefaultImpls.onShowAnimationStart(this);
    }
}
