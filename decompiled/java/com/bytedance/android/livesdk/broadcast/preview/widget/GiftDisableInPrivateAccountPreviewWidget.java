package com.bytedance.android.livesdk.broadcast.preview.widget;

import X.C1161920gLG;
import X.C500260Jjc;
import X.InterfaceC1094160eZy;
import Y.ARunnableS112S0100000_12;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.broadcast.preview.PreviewWidget;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS591S0100000_12;

/* JADX INFO: loaded from: classes13.dex */
public final class GiftDisableInPrivateAccountPreviewWidget extends PreviewWidget {
    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.gnx;
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void onShow() {
        View view;
        if (((IHostAction) C1161920gLG.LIZJ(IHostAction.class)).isPrivateAccount() && C500260Jjc.LJJIFFI(InterfaceC1094160eZy.q2.LIZIZ()) && (view = this.contentView) != null) {
            HandlerHook.viewPost(view, new ARunnableS112S0100000_12(this, 73));
        }
        View view2 = getView();
        if (view2 != null) {
            C500260Jjc.LJLIIIL(500L, view2, new AwS591S0100000_12(this, 246));
        }
    }
}
