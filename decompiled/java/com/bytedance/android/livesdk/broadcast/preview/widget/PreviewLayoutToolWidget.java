package com.bytedance.android.livesdk.broadcast.preview.widget;

import X.C497740JfY;
import X.C773970UXr;
import X.C781270Ukn;
import X.InterfaceC758000ToM;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.LinkMicMgPreviewLivePageSetting;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes13.dex */
public final class PreviewLayoutToolWidget extends PreviewToolBaseWidget {
    public final int LLILZLL = 2131854500;

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget
    public final Integer J1() {
        return null;
    }

    @Override // X.InterfaceC782830UnJ
    public final boolean LLLII() {
        return false;
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget, com.bytedance.android.live.broadcast.preview.PreviewWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget
    public final Integer L1() {
        return LinkMicMgPreviewLivePageSetting.INSTANCE.showLayoutInPreviewLivePage() ? Integer.valueOf(R.raw.icon_live_two_person) : Integer.valueOf(R.raw.icon_layout_tick);
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget, com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void C1() {
        super.C1();
        C773970UXr.LIZIZ("show");
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget
    public final String P1() {
        return C497740JfY.LJIJI(2131854500);
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget
    public final int O1() {
        return this.LLILZLL;
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget
    public final void onClick(View view) {
        C773970UXr.LIZIZ("click");
        InterfaceC758000ToM interfaceC758000ToMCI2 = C781270Ukn.LJIILJJIL().cI2();
        if (interfaceC758000ToMCI2 != null) {
            interfaceC758000ToMCI2.LIZ(this.widgetCallback.getFragment().getChildFragmentManager(), "multiguest_icon", this.dataChannel);
        }
    }
}
