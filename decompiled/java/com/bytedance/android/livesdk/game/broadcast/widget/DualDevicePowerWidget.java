package com.bytedance.android.livesdk.game.broadcast.widget;

import X.C011Z;
import X.C1143680frq;
import X.C497740JfY;
import X.C786410Ut5;
import Y.ACListenerS142S0100000_7;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes8.dex */
public final class DualDevicePowerWidget extends LiveRecyclableWidget {
    public final String LL;
    public final boolean LLILLJJLI;

    public DualDevicePowerWidget() {
        this(null, false, 3);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return this.LLILLJJLI ? R.layout.gml : R.layout.gmk;
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getThemeOverlay(Context context) {
        return C011Z.LIZ.LJ();
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
        View view = getView();
        if (view != null) {
            TextView textView = (TextView) view.findViewById(R.id.rn8);
            if (textView != null) {
                String strLJIJI = this.LL;
                if (strLJIJI == null) {
                    strLJIJI = C497740JfY.LJIJI(2131843011);
                }
                textView.setText(strLJIJI);
            }
            View viewFindViewById = view.findViewById(R.id.rmz);
            if (viewFindViewById != null) {
                C1143680frq.LIZLLL(viewFindViewById, "tiktok_live_game_demand_2", "ttlive_dual_device_power.png");
            }
        }
        View view2 = getView();
        if (view2 != null) {
            C786410Ut5.I7(new ACListenerS142S0100000_7(this, 68), view2);
        }
    }

    public DualDevicePowerWidget(String str, boolean z, int i) {
        str = (i & 1) != 0 ? null : str;
        z = (i & 2) != 0 ? false : z;
        this.LL = str;
        this.LLILLJJLI = z;
    }
}
