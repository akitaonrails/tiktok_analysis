package com.bytedance.android.livesdk.broadcast.interaction.widget;

import X.C500260Jjc;
import X.C770890ULv;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.broadcast.trymode.guide.StickerHintShowingChannel;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes13.dex */
public final class StickerHintWidget extends LiveRecyclableWidget {
    public C770890ULv LL;

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.h4x;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
        C770890ULv c770890ULv = this.LL;
        if (c770890ULv != null) {
            C500260Jjc.LJJIFFI(null);
            c770890ULv.LIZ.zW(StickerHintShowingChannel.class, Boolean.FALSE);
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        View view;
        if (this.LL == null && (view = getView()) != null) {
            this.LL = new C770890ULv(view, this.dataChannel, this);
        }
        C770890ULv c770890ULv = this.LL;
        if (c770890ULv != null) {
            c770890ULv.LIZIZ();
        }
    }
}
