package com.bytedance.android.livesdk.broadcast.preview.widget.livestudio;

import X.C0IJT;
import X.C0ULT;
import X.C474500IjA;
import X.C497740JfY;
import X.C760180Trs;
import X.C770630UKv;
import X.C786410Ut5;
import X.InterfaceC1106030et7;
import Y.ACListenerS147S0100000_12;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.broadcast.banner.BannerWidget;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes13.dex */
public final class PreviewLiveStudioTipsWidget extends BannerWidget {
    public final String LLJI;

    @Override // com.bytedance.android.live.broadcast.banner.BannerWidget, com.bytedance.android.live.broadcast.preview.PreviewWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.broadcast.banner.BannerWidget
    public final void J1() {
        String str = this.LLILZIL;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_studio_available_show");
        c474500IjALIZ.LJJII(C770630UKv.LIZ(), "anchor_id");
        c474500IjALIZ.LJJ(str);
        c474500IjALIZ.LIZ();
    }

    @Override // com.bytedance.android.live.broadcast.banner.BannerWidget, com.bytedance.android.live.broadcast.preview.PreviewWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void show() throws Exception {
        Boolean boolLIZIZ = InterfaceC1106030et7.f6.LIZIZ(this.LLILZIL);
        if (boolLIZIZ == null || !boolLIZIZ.booleanValue()) {
            super.show();
        }
    }

    public PreviewLiveStudioTipsWidget() {
        this.LLILZLL = 3;
        this.LLJI = "live_studio_launch_banner";
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void E1() {
        C0ULT c0ult;
        super.E1();
        if (C760180Trs.LJI()) {
            View view = getView();
            if ((view instanceof C0ULT) && (c0ult = (C0ULT) view) != null) {
                c0ult.setTitle(C497740JfY.LJIJI(2131853595));
                c0ult.setSubTitle(C497740JfY.LJIJI(2131853556));
                c0ult.setRightIcon(true);
                c0ult.setLeftIcon(R.raw.icon_computer);
            }
        }
        View view2 = getView();
        if (view2 != null) {
            C786410Ut5.I7(new ACListenerS147S0100000_12(this, 153), view2);
        }
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return C760180Trs.LJI() ? R.layout.i1m : R.layout.i1l;
    }

    @Override // com.bytedance.android.live.broadcast.banner.BannerWidget
    public final String H1() {
        return this.LLJI;
    }
}
