package com.bytedance.android.livesdk.broadcast.preview.widget;

import X.C0UJW;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes13.dex */
public final class PreviewRevisionCustomThreeWidget extends PreviewRevisionCustomBaseWidget {
    @Override // com.bytedance.android.livesdk.broadcast.preview.widget.PreviewRevisionCustomBaseWidget, com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget, com.bytedance.android.live.broadcast.preview.PreviewWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget, com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void E1() {
        boolean z = C0UJW.LIZ;
        Integer num = (Integer) ((LinkedHashMap) C0UJW.LJFF).get(3);
        this.LLILZLL = num != null ? num.intValue() : 0;
        super.E1();
    }
}
