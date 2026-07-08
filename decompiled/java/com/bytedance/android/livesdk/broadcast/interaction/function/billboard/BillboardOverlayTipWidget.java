package com.bytedance.android.livesdk.broadcast.interaction.function.billboard;

import X.C0IJT;
import X.C1090480eU2;
import X.C474500IjA;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.broadcast.BillboardOverlayShowEvent;
import com.bytedance.android.livesdk.broadcast.BillboardOverlayToastType;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS591S0100000_12;

/* JADX INFO: loaded from: classes13.dex */
public final class BillboardOverlayTipWidget extends LiveWidget {
    public static final /* synthetic */ int LLILZ = 0;
    public ViewGroup LL;
    public ViewGroup LLILLJJLI;
    public C1090480eU2 LLILLL;

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.g07;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onCreate() {
        super.onCreate();
        hide();
        View view = getView();
        this.LL = view != null ? (ViewGroup) view.findViewById(R.id.c1d) : null;
        View view2 = getView();
        this.LLILLJJLI = view2 != null ? (ViewGroup) view2.findViewById(R.id.c0u) : null;
        View view3 = getView();
        this.LLILLL = view3 != null ? (C1090480eU2) view3.findViewById(R.id.c19) : null;
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.BQ2(this, BillboardOverlayToastType.class, new AwS591S0100000_12(this, 170));
            dataChannel.BQ2(this, BillboardOverlayShowEvent.class, new AwS591S0100000_12(this, 171));
        }
    }

    public final void x1(String str) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_tiktokec_popup_show");
        c474500IjALIZ.LJJII("TEMAI", "EVENT_ORIGIN_FEATURE");
        c474500IjALIZ.LJJII("before_live", "live_status");
        c474500IjALIZ.LJJII("author", "user_type");
        c474500IjALIZ.LJJII(str, "popup_name");
        c474500IjALIZ.LIZ();
    }
}
