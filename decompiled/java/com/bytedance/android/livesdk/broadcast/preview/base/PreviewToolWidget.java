package com.bytedance.android.livesdk.broadcast.preview.base;

import X.C20736316Cj;
import X.C418440Gaw;
import X.C760180Trs;
import X.C814420VxA;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.livesetting.broadcast.PreviewEnterFpsOptSetting;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes8.dex */
public abstract class PreviewToolWidget extends PreviewToolBaseWidget {
    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget
    public final Integer J1() {
        return null;
    }

    public abstract int W1();

    public abstract int X1();

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget, com.bytedance.android.live.broadcast.preview.PreviewWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget, com.bytedance.android.widget.Widget
    public int getLayoutId() {
        return PreviewEnterFpsOptSetting.INSTANCE.enable() ? R.layout.i21 : R.layout.i1v;
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget
    public final void V1(View view) {
        Integer numL1;
        LiveIconView liveIconView;
        super.V1(view);
        View viewFindViewById = null;
        if (C760180Trs.LJFF() && L1() != null && ((numL1 = L1()) == null || numL1.intValue() != 0)) {
            Integer numL12 = L1();
            if (numL12 != null) {
                int iIntValue = numL12.intValue();
                View view2 = getView();
                if (view2 != null && (liveIconView = (LiveIconView) view2.findViewById(R.id.widget_icon)) != null) {
                    liveIconView.setPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2)));
                    liveIconView.setIcon(C20736316Cj.LJ(iIntValue, this.context));
                    liveIconView.setIconTint(C20736316Cj.LIZIZ(W1(), this.context));
                    return;
                }
                return;
            }
            return;
        }
        int iX1 = X1();
        View view3 = getView();
        if (view3 != null) {
            viewFindViewById = view3.findViewById(R.id.widget_icon);
        }
        if (viewFindViewById instanceof LiveIconView) {
            LiveIconView liveIconView2 = (LiveIconView) viewFindViewById;
            liveIconView2.setIcon(C20736316Cj.LJ(iX1, this.context));
            liveIconView2.setIconTint(C20736316Cj.LIZIZ(W1(), this.context));
        } else {
            if (!(viewFindViewById instanceof TuxIconView)) {
                return;
            }
            TuxIconView tuxIconView = (TuxIconView) viewFindViewById;
            tuxIconView.setIconRes(C20736316Cj.LJ(iX1, this.context));
            tuxIconView.setTintColor(C20736316Cj.LIZIZ(W1(), this.context));
        }
    }
}
