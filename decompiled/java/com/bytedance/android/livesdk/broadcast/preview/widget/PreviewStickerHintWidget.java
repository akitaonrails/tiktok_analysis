package com.bytedance.android.livesdk.broadcast.preview.widget;

import X.C500260Jjc;
import X.C770890ULv;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.broadcast.preview.PreviewWidget;
import com.bytedance.android.livesdk.broadcast.trymode.guide.StickerHintShowingChannel;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes13.dex */
public final class PreviewStickerHintWidget extends PreviewWidget {
    public C770890ULv LLILZ;

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.h4x;
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void E1() {
        View view;
        super.E1();
        if (this.LLILZ == null && (view = getView()) != null) {
            this.LLILZ = new C770890ULv(view, this.dataChannel, this);
        }
        C770890ULv c770890ULv = this.LLILZ;
        if (c770890ULv != null) {
            c770890ULv.LIZIZ();
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onDestroy() {
        super.onDestroy();
        C770890ULv c770890ULv = this.LLILZ;
        if (c770890ULv != null) {
            C500260Jjc.LJJIFFI(null);
            c770890ULv.LIZ.zW(StickerHintShowingChannel.class, Boolean.FALSE);
        }
    }
}
