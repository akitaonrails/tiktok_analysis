package com.bytedance.android.livesdk.game.broadcast.widget;

import X.C011Z;
import X.C1143680frq;
import X.C786410Ut5;
import Y.ACListenerS142S0100000_7;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes8.dex */
public final class DualDeviceErrorWidget extends LiveRecyclableWidget {
    public static final /* synthetic */ int LLIZ = 0;
    public final boolean LL;
    public final String LLILLJJLI;
    public final String LLILLL;
    public final boolean LLILZ;
    public View LLILZIL;
    public View LLILZLL;

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.gyz;
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
    public final int getThemeOverlay(Context context) {
        return C011Z.LIZ.LJ();
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
        View viewFindViewById;
        View view;
        TextView textView;
        View view2;
        TextView textView2;
        View view3 = getView();
        View viewFindViewById2 = null;
        if (view3 != null) {
            viewFindViewById = view3.findViewById(R.id.wrong_btn);
        } else {
            viewFindViewById = null;
        }
        this.LLILZIL = viewFindViewById;
        View view4 = getView();
        if (view4 != null) {
            viewFindViewById2 = view4.findViewById(R.id.wrong_icon);
        }
        this.LLILZLL = viewFindViewById2;
        View view5 = this.LLILZIL;
        if (view5 != null) {
            C786410Ut5.I7(new ACListenerS142S0100000_7(this, 66), view5);
        }
        if (this.LLILZ) {
            C1143680frq.LJ(this.LLILZLL, "tiktok_live_game_demand_2", "ttlive_dual_device_wrong_icon2.png", ImageView.ScaleType.CENTER_INSIDE);
        } else {
            C1143680frq.LJ(this.LLILZLL, "tiktok_live_game_demand_2", "ttlive_dual_device_wrong_icon.png", ImageView.ScaleType.CENTER_INSIDE);
        }
        String str = this.LLILLL;
        if (str != null && (view2 = getView()) != null && (textView2 = (TextView) view2.findViewById(R.id.wrong_title)) != null) {
            textView2.setText(str);
        }
        String str2 = this.LLILLJJLI;
        if (str2 != null && (view = getView()) != null && (textView = (TextView) view.findViewById(R.id.wrong_tip)) != null) {
            textView.setText(str2);
        }
    }

    public DualDeviceErrorWidget(boolean z, String str, String str2, boolean z2) {
        this.LL = z;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = z2;
    }
}
