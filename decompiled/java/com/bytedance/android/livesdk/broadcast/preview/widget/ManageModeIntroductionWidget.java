package com.bytedance.android.livesdk.broadcast.preview.widget;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.broadcast.preview.PreviewWidget;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes.dex */
public final class ManageModeIntroductionWidget extends PreviewWidget {
    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.i1r;
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }
}
