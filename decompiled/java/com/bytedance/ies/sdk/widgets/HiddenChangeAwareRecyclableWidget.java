package com.bytedance.ies.sdk.widgets;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ies.sdk.widgets.IHiddenChangeAwareWidget;

/* JADX INFO: loaded from: classes8.dex */
public abstract class HiddenChangeAwareRecyclableWidget extends LiveRecyclableWidget implements IHiddenChangeAwareWidget {
    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public void hide() {
        super.hide();
        onHide();
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public void show() {
        super.show();
        onShow();
    }

    public void onHide() {
        IHiddenChangeAwareWidget.DefaultImpls.onHide(this);
    }

    @Override // com.bytedance.ies.sdk.widgets.IHiddenChangeAwareWidget
    public void onShow() {
        IHiddenChangeAwareWidget.DefaultImpls.onShow(this);
    }
}
