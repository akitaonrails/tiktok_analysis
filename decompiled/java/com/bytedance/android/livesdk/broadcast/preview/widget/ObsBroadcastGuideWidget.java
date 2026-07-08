package com.bytedance.android.livesdk.broadcast.preview.widget;

import X.C0UQX;
import X.C1338270kvh;
import X.InterfaceC465660INw;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.broadcast.banner.BannerWidget;
import com.zhiliaoapp.musically.R;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public final class ObsBroadcastGuideWidget extends BannerWidget {
    public final String LLJI;

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.i0p;
    }

    @Override // com.bytedance.android.live.broadcast.banner.BannerWidget, com.bytedance.android.live.broadcast.preview.PreviewWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.broadcast.banner.BannerWidget
    public final void J1() {
        C0UQX.LJIIIIZZ(this.dataChannel, "show", "obs_guide_banner", this.LLILZIL);
        Map<String, Object> map = C1338270kvh.LIZ;
    }

    @Override // com.bytedance.android.live.broadcast.banner.BannerWidget, com.bytedance.android.live.broadcast.preview.PreviewWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void show() throws Exception {
        Boolean boolLIZ = InterfaceC465660INw.Zc.LIZ();
        if (boolLIZ == null || !boolLIZ.booleanValue()) {
            super.show();
        }
    }

    public ObsBroadcastGuideWidget() {
        this.LLILZLL = 3;
        this.LLJI = "obs_live_new_broadcast_education_banner";
    }

    @Override // com.bytedance.android.live.broadcast.banner.BannerWidget, com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void onShow() {
        super.onShow();
        Map<String, Object> map = C1338270kvh.LIZ;
    }

    @Override // com.bytedance.android.live.broadcast.banner.BannerWidget
    public final String H1() {
        return this.LLJI;
    }
}
