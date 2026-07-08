package com.bytedance.android.livesdk.toolbarv2.view;

import X.C1099910ejF;
import X.C1161920gLG;
import X.C426750GoL;
import X.C497740JfY;
import X.EnumC1088870eRR;
import X.EnumC1094650eal;
import X.InterfaceC1088880eRS;
import android.view.View;
import android.widget.LinearLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.gift.DutyGiftChangedEvent;
import com.bytedance.android.live.toolbar.IToolbarService;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS596S0100000_17;

/* JADX INFO: loaded from: classes18.dex */
public final class AnchorToolbarWidget extends AbsToolbarWidget {
    public LinearLayout LLILLJJLI;
    public LinearLayout LLILLL;

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.hxg;
    }

    @Override // com.bytedance.android.livesdk.toolbarv2.view.AbsToolbarWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
        InterfaceC1088880eRS interfaceC1088880eRSMn1 = ((IToolbarService) C1161920gLG.LIZJ(IToolbarService.class)).Mn1(this.dataChannel);
        if (interfaceC1088880eRSMn1 != null) {
            interfaceC1088880eRSMn1.releaseAll();
        }
    }

    @Override // com.bytedance.android.livesdk.toolbarv2.view.AbsToolbarWidget
    public final void x1() {
        LinearLayout linearLayout = this.LLILLJJLI;
        if (linearLayout != null) {
            y1(linearLayout, EnumC1088870eRR.LEFT);
        }
        LinearLayout linearLayout2 = this.LLILLL;
        if (linearLayout2 != null) {
            y1(linearLayout2, EnumC1088870eRR.RIGHT);
        }
    }

    @Override // com.bytedance.android.livesdk.toolbarv2.view.AbsToolbarWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
        LinearLayout linearLayout;
        View view = getView();
        LinearLayout linearLayout2 = null;
        if (view != null) {
            linearLayout = (LinearLayout) view.findViewById(R.id.mjp);
        } else {
            linearLayout = null;
        }
        this.LLILLJJLI = linearLayout;
        View view2 = getView();
        if (view2 != null) {
            linearLayout2 = (LinearLayout) view2.findViewById(R.id.tks);
        }
        this.LLILLL = linearLayout2;
        LinearLayout linearLayout3 = this.LLILLJJLI;
        if (linearLayout3 != null) {
            EnumC1094650eal enumC1094650eal = EnumC1094650eal.PORTRAIT;
            EnumC1088870eRR enumC1088870eRR = EnumC1088870eRR.LEFT;
            C426750GoL.LJIIL(linearLayout3, Integer.valueOf((int) C497740JfY.LIZIZ(C1099910ejF.LJ(enumC1094650eal, enumC1088870eRR, true, true))), 0, Integer.valueOf((int) C497740JfY.LIZIZ(C1099910ejF.LJ(enumC1094650eal, enumC1088870eRR, false, true))), 0, 16);
        }
        LinearLayout linearLayout4 = this.LLILLL;
        if (linearLayout4 != null) {
            EnumC1094650eal enumC1094650eal2 = EnumC1094650eal.PORTRAIT;
            EnumC1088870eRR enumC1088870eRR2 = EnumC1088870eRR.RIGHT;
            C426750GoL.LJIIL(linearLayout4, Integer.valueOf((int) C497740JfY.LIZIZ(C1099910ejF.LJ(enumC1094650eal2, enumC1088870eRR2, true, true))), 0, Integer.valueOf((int) C497740JfY.LIZIZ(C1099910ejF.LJ(enumC1094650eal2, enumC1088870eRR2, false, true))), 0, 16);
        }
    }

    @Override // com.bytedance.android.livesdk.toolbarv2.view.AbsToolbarWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        super.onLoad(objArr);
        this.dataChannel.EQ2(this, DutyGiftChangedEvent.class, new AwS596S0100000_17(this, 247));
    }
}
