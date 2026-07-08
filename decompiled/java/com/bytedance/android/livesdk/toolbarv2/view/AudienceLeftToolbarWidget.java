package com.bytedance.android.livesdk.toolbarv2.view;

import X.C1099910ejF;
import X.C426750GoL;
import X.C497740JfY;
import X.EnumC1088870eRR;
import X.EnumC1094650eal;
import android.widget.LinearLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes18.dex */
public final class AudienceLeftToolbarWidget extends AbsToolbarWidget {
    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.hxi;
    }

    @Override // com.bytedance.android.livesdk.toolbarv2.view.AbsToolbarWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
        EnumC1088870eRR.LEFT.release(this.dataChannel);
    }

    @Override // com.bytedance.android.livesdk.toolbarv2.view.AbsToolbarWidget
    public final void x1() {
        LinearLayout linearLayout = this.LL;
        if (linearLayout != null) {
            y1(linearLayout, EnumC1088870eRR.LEFT);
        }
    }

    public final void z1() {
        LinearLayout linearLayout = this.LL;
        if (linearLayout != null) {
            EnumC1094650eal enumC1094650eal = EnumC1094650eal.PORTRAIT;
            EnumC1088870eRR enumC1088870eRR = EnumC1088870eRR.LEFT;
            C426750GoL.LJIIL(linearLayout, Integer.valueOf((int) C497740JfY.LIZIZ(C1099910ejF.LJ(enumC1094650eal, enumC1088870eRR, true, false))), 0, Integer.valueOf((int) C497740JfY.LIZIZ(C1099910ejF.LJ(enumC1094650eal, enumC1088870eRR, false, false))), 0, 16);
        }
    }

    @Override // com.bytedance.android.livesdk.toolbarv2.view.AbsToolbarWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
        super.onInit(objArr);
        z1();
    }

    @Override // com.bytedance.android.livesdk.toolbarv2.view.AbsToolbarWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        super.onLoad(objArr);
        z1();
    }
}
