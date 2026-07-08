package com.bytedance.android.livesdk.broadcast.preview.widget;

import X.C0UJW;
import X.C1161920gLG;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdkapi.host.IHostEcommerce;
import webcast.data.BottomContainerComponent;

/* JADX INFO: loaded from: classes13.dex */
public final class PreviewRevisionEcCouponWidget extends PreviewRevisionCustomBaseWidget {
    @Override // com.bytedance.android.livesdk.broadcast.preview.widget.PreviewRevisionCustomBaseWidget, com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget, com.bytedance.android.live.broadcast.preview.PreviewWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget, com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void E1() {
        this.LLILZLL = 28;
        super.E1();
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.widget.PreviewRevisionCustomBaseWidget, com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void onShow() {
        IHostEcommerce iHostEcommerce;
        super.onShow();
        BottomContainerComponent bottomContainerComponentLIZ = C0UJW.LIZ(28);
        if (bottomContainerComponentLIZ == null || (iHostEcommerce = (IHostEcommerce) C1161920gLG.LIZJ(IHostEcommerce.class)) == null) {
            return;
        }
        iHostEcommerce.in(bottomContainerComponentLIZ, true);
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.widget.PreviewRevisionCustomBaseWidget, com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget
    public final void onClick(View view) {
        IHostEcommerce iHostEcommerce;
        super.onClick(view);
        BottomContainerComponent bottomContainerComponentLIZ = C0UJW.LIZ(28);
        if (bottomContainerComponentLIZ != null && (iHostEcommerce = (IHostEcommerce) C1161920gLG.LIZJ(IHostEcommerce.class)) != null) {
            iHostEcommerce.in(bottomContainerComponentLIZ, false);
        }
    }
}
