package com.ss.android.ugc.aweme.ecommerce.search.page.mix;

import X.C142100gV;
import X.C1537720q7O;
import X.C418440Gaw;
import X.C677470Qhl;
import X.C679540Ql6;
import X.C786410Ut5;
import X.C814420VxA;
import Y.ARunnableS110S0100000_10;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.ecommerce.arch.MixAssemPowerCell;

/* JADX INFO: loaded from: classes11.dex */
public final class MultiSparkItemCell extends MixAssemPowerCell<MultiSparkItemAssem, C677470Qhl> {
    public MultiSparkItemAssem LLJ;

    @Override // com.bytedance.ext_power_list.AssemPowerCell
    public final ReusedUISlotAssem I5() {
        MultiSparkItemAssem multiSparkItemAssem = new MultiSparkItemAssem();
        this.LLJ = multiSparkItemAssem;
        return multiSparkItemAssem;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.arch.MixAssemPowerCell, com.bytedance.ies.powerlist.PowerCell
    public final void onViewAttachedToWindow() {
        ViewGroup viewGroup;
        super.onViewAttachedToWindow();
        View viewLJJIJL = LJJIJL();
        if (!(viewLJJIJL instanceof ViewGroup) || (viewGroup = (ViewGroup) viewLJJIJL) == null || viewGroup.getChildCount() != 0 || getItem() == 0) {
            return;
        }
        HandlerHook.viewPost(LJJIJL(), new ARunnableS110S0100000_10(this, 20));
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onViewDetachedFromWindow() {
        super.onViewDetachedFromWindow();
        MultiSparkItemAssem multiSparkItemAssem = this.LLJ;
        if (multiSparkItemAssem != null) {
            C1537720q7O c1537720q7O = multiSparkItemAssem.LLJLILLLLZIIL;
            if (c1537720q7O != null) {
                multiSparkItemAssem.op().vQ2().LJJI(c1537720q7O);
            }
            if (((Boolean) C142100gV.LIZ.getValue()).booleanValue()) {
                C679540Ql6 c679540Ql6 = multiSparkItemAssem.LLLFF;
                if (c679540Ql6 != null) {
                    c679540Ql6.LIZLLL = null;
                    c679540Ql6.LJJ = null;
                }
                multiSparkItemAssem.LLLFF = null;
            }
        }
    }

    @Override // com.bytedance.ext_power_list.AssemPowerCell, com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        C786410Ut5.a6(frameLayout, new FrameLayout.LayoutParams(-1, -2));
        frameLayout.setMinimumHeight(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10)));
        this.LL = frameLayout;
        Sl0(LJJIJL(), this);
        return LJJIJL();
    }
}
