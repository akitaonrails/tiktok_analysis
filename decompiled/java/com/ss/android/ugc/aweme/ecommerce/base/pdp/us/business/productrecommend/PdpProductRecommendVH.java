package com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.productrecommend;

import X.C01GW;
import X.C0Q4Y;
import X.C1326490kch;
import X.C1748730vbj;
import X.C1748770vbn;
import X.C20600815jK;
import X.C452501pT;
import X.C954703oH;
import X.InterfaceC1748810vbr;
import X.InterfaceC1891350zJl;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import Y.AsS52S0100000_26;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.basicui.listitem.common.AbsFullSpanVH;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS570S0100000_26;
import p8b.c;

/* JADX INFO: loaded from: classes27.dex */
public final class PdpProductRecommendVH extends AbsFullSpanVH<ProductRecommendVO> implements InterfaceC1748810vbr, c {
    public final C01GW LLJJIJIL;
    public final C01GW LLJJJ;
    public final ConstraintLayout LLJJJIL;
    public final TuxTextView LLJJJJ;
    public final TuxIconView LLJJJJJIL;
    public final View LLJJJJLIIL;
    public final ViewGroup LLJJL;
    public View LLJJLIIIJLLLLLLLZ;
    public final String LLJL;
    public String LLJLIL;
    public int LLJLILLLLZIIL;

    @Override // X.InterfaceC1748810vbr, X.InterfaceC1748860vbw
    public final void Q3(C1748770vbn c1748770vbn) {
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.basicui.listitem.common.AbsFullSpanVH, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // X.InterfaceC1748810vbr
    public final InterfaceC1748810vbr d8() {
        return C1748730vbj.LIZ(this.itemView);
    }

    public final ViewOnAttachStateChangeListenerC20604515jv getPowerList() {
        return (ViewOnAttachStateChangeListenerC20604515jv) this.LLJJIJIL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.basicui.listitem.common.AbsFullSpanVH, com.bytedance.jedi.ext.adapter.JediViewHolder
    public final void onCreate() {
        super.onCreate();
        C1326490kch.LIZ.getClass();
        C1326490kch.LJIIIIZZ("PdpProductRecommendVH", "onCreate", null);
    }

    @Override // p8b.c
    public final String getViewName() {
        return this.LLJL;
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0203 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:184:0x01fd A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0078  */
    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void rr(java.lang.Object r26) {
        /*
            Method dump skipped, instruction units count: 700
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.productrecommend.PdpProductRecommendVH.rr(java.lang.Object):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public PdpProductRecommendVH(ViewGroup viewGroup, View view) {
        C20600815jK<InterfaceC1891350zJl> state;
        if (view == null) {
            C01GW c01gw = C954703oH.LIZ;
            view = C954703oH.LIZ(viewGroup.getContext(), R.layout.asw, viewGroup, false);
        }
        super(view);
        this.LLJJIJIL = C452501pT.LIZIZ(new AwS570S0100000_26(this, 1589));
        this.LLJJJ = C452501pT.LIZIZ(new AwS570S0100000_26(this, 1590));
        this.LLJJJIL = (ConstraintLayout) this.itemView.findViewById(R.id.yaz);
        this.LLJJJJ = (TuxTextView) this.itemView.findViewById(R.id.tv_title_phase_two);
        this.LLJJJJJIL = (TuxIconView) this.itemView.findViewById(R.id.k5v);
        this.LLJJJJLIIL = this.itemView.findViewById(R.id.vex);
        this.LLJJL = (ViewGroup) this.itemView.findViewById(R.id.k1b);
        this.LLJL = "PdpProductRecommendVH";
        this.LLJLIL = "";
        ViewOnAttachStateChangeListenerC20604515jv powerList = getPowerList();
        if (powerList != null) {
            powerList.setOrientation(0);
        }
        ViewOnAttachStateChangeListenerC20604515jv powerList2 = getPowerList();
        if (powerList2 != null && (state = powerList2.getState()) != null) {
            state.LIZLLL = C0Q4Y.BUFFER;
        }
        ViewOnAttachStateChangeListenerC20604515jv powerList3 = getPowerList();
        if (powerList3 != null) {
            powerList3.LJIILJJIL(ProductRecommendFeedCell.class, ProductRecommendViewMoreCell.class);
        }
        ViewOnAttachStateChangeListenerC20604515jv powerList4 = getPowerList();
        if (powerList4 != null) {
            powerList4.addOnScrollListener(new AsS52S0100000_26(this, 9));
        }
    }
}
