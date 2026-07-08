package com.bytedance.android.livesdk.broadcast.preview.widget;

import X.C0IJT;
import X.C1090480eU2;
import X.C13LE;
import X.C474500IjA;
import X.C770220UJg;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.broadcast.preview.PreviewWidget;
import com.bytedance.android.livesdk.broadcast.BillboardOverlayShowEvent;
import com.bytedance.android.livesdk.broadcast.BillboardOverlayToastType;
import com.bytedance.android.livesdk.dataChannel.BillboardOverlayVisibilityChannel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS591S0100000_12;

/* JADX INFO: loaded from: classes13.dex */
public final class PreviewBillboardOverlayWidget extends PreviewWidget {
    public ViewGroup LLILZ;
    public ViewGroup LLILZIL;
    public C1090480eU2 LLILZLL;

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.hh8;
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void onHide() {
        C770220UJg c770220UJg = C770220UJg.LIZ;
        C770220UJg.LJ(C13LE.LIZ(BillboardOverlayVisibilityChannel.class));
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void onShow() {
        C770220UJg c770220UJg = C770220UJg.LIZ;
        C770220UJg.LIZLLL(C13LE.LIZ(BillboardOverlayVisibilityChannel.class));
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void C1() {
        super.C1();
        hide();
        View view = getView();
        this.LLILZ = view != null ? (ViewGroup) view.findViewById(R.id.c1d) : null;
        View view2 = getView();
        this.LLILZIL = view2 != null ? (ViewGroup) view2.findViewById(R.id.c0u) : null;
        View view3 = getView();
        this.LLILZLL = view3 != null ? (C1090480eU2) view3.findViewById(R.id.c19) : null;
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.BQ2(this, BillboardOverlayShowEvent.class, new AwS591S0100000_12(this, 256));
            dataChannel.BQ2(this, BillboardOverlayToastType.class, new AwS591S0100000_12(this, 257));
        }
    }

    public final void G1(String str) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_tiktokec_popup_show");
        c474500IjALIZ.LJJII("TEMAI", "EVENT_ORIGIN_FEATURE");
        c474500IjALIZ.LJJII(0, "room_id");
        c474500IjALIZ.LJJII("before_live", "live_status");
        c474500IjALIZ.LJJII("author", "user_type");
        c474500IjALIZ.LJJII(str, "popup_name");
        c474500IjALIZ.LIZ();
    }
}
