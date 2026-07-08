package com.bytedance.android.livesdk.broadcast.preview.widget;

import X.C01GW;
import X.C452501pT;
import X.C5182020e;
import X.C5183020f;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.broadcast.api.PreviewLiveTabCapsuleColorThemeChangeEvent;
import com.bytedance.android.live.broadcast.preview.PreviewWidget;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes.dex */
public final class PreviewInviteGuestWidget extends PreviewWidget {
    public final C01GW LLILZ = C452501pT.LIZIZ(new C5182020e(this, 77));

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void D1() {
        this.LLILLL = false;
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.i1d;
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void onHide() {
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void onShow() {
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final boolean z1() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004a A[PHI: r4
      0x004a: PHI (r4v5 com.bytedance.android.livesdk.broadcast.preview.widget.MultiGuestPreviewSubWidget) = 
      (r4v0 com.bytedance.android.livesdk.broadcast.preview.widget.MultiGuestPreviewSubWidget)
      (r4v0 com.bytedance.android.livesdk.broadcast.preview.widget.MultiGuestPreviewSubWidget)
      (r4v0 com.bytedance.android.livesdk.broadcast.preview.widget.MultiGuestPreviewSubWidget)
      (r4v2 com.bytedance.android.livesdk.broadcast.preview.widget.MultiGuestPreviewSubWidget)
      (r4v7 com.bytedance.android.livesdk.broadcast.preview.widget.MultiGuestPreviewSubWidget)
     binds: [B:36:0x00bf, B:38:0x00c5, B:34:0x00b7, B:33:0x00b5, B:18:0x0048] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0135  */
    /* JADX WARN: Type inference failed for: r8v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.util.ArrayList] */
    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void C1() {
        /*
            Method dump skipped, instruction units count: 338
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.broadcast.preview.widget.PreviewInviteGuestWidget.C1():void");
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void E1() {
        super.E1();
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.EQ2(this, PreviewLiveTabCapsuleColorThemeChangeEvent.class, new C5183020f(this, 90));
        }
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void hide() {
        super.hide();
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void show() {
        super.show();
    }

    public final void G1(boolean z) {
        if (z) {
            super.show();
        } else {
            super.hide();
        }
    }
}
