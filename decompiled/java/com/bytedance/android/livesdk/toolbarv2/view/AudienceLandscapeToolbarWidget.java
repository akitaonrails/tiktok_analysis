package com.bytedance.android.livesdk.toolbarv2.view;

import X.C0J1N;
import X.C1099910ejF;
import X.C11RD;
import X.C1701940uOG;
import X.C426750GoL;
import X.C473130Igx;
import X.C497740JfY;
import X.C784440Upu;
import X.C786410Ut5;
import X.EnumC1088870eRR;
import X.EnumC1094650eal;
import Y.AfS186S0100000_17;
import android.view.View;
import android.widget.LinearLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.livesetting.game.GameLiveLandscapeToolButtonOptSetting;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes18.dex */
public final class AudienceLandscapeToolbarWidget extends AbsToolbarWidget {
    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.hxh;
    }

    @Override // com.bytedance.android.livesdk.toolbarv2.view.AbsToolbarWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
        EnumC1088870eRR.RIGHT.release(this.dataChannel);
    }

    @Override // com.bytedance.android.livesdk.toolbarv2.view.AbsToolbarWidget
    public final void x1() {
        LinearLayout linearLayout = this.LL;
        if (linearLayout != null) {
            y1(linearLayout, EnumC1088870eRR.RIGHT);
        }
    }

    @Override // com.bytedance.android.livesdk.toolbarv2.view.AbsToolbarWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
        super.onInit(objArr);
        LinearLayout linearLayout = this.LL;
        if (linearLayout != null) {
            EnumC1094650eal enumC1094650eal = EnumC1094650eal.LANDSCAPE;
            EnumC1088870eRR enumC1088870eRR = EnumC1088870eRR.RIGHT;
            C426750GoL.LJIIL(linearLayout, Integer.valueOf((int) C497740JfY.LIZIZ(C1099910ejF.LJ(enumC1094650eal, enumC1088870eRR, true, false))), 0, Integer.valueOf((int) C497740JfY.LIZIZ(C1099910ejF.LJ(enumC1094650eal, enumC1088870eRR, false, false))), 0, 16);
        }
    }

    @Override // com.bytedance.android.livesdk.toolbarv2.view.AbsToolbarWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        super.onLoad(objArr);
        View view = getView();
        if (view != null) {
            view.setLayoutDirection(0);
        }
        if (GameLiveLandscapeToolButtonOptSetting.INSTANCE.isEnable()) {
            ((C0J1N) C784440Upu.LIZ().LJ(C473130Igx.class).LJJJLZIJ(C1701940uOG.LIZIZ()).LIZJ(C11RD.LJ(this))).LIZJ(new AfS186S0100000_17(this, 65));
        }
    }

    public final void z1(Function1<? super View, Boolean> function1) {
        boolean z;
        LinearLayout linearLayout = this.LL;
        if (linearLayout != null) {
            int childCount = linearLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = linearLayout.getChildAt(i);
                if (childAt.getVisibility() == 8) {
                    z = true;
                } else {
                    z = false;
                }
                int visibility = 4;
                if (z || !function1.invoke(childAt).booleanValue()) {
                    if (childAt.getVisibility() == 4) {
                        visibility = 0;
                    } else {
                        visibility = childAt.getVisibility();
                    }
                }
                C786410Ut5.LJLLLLLL(visibility, childAt);
            }
        }
    }
}
