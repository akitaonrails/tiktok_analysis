package com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.producthighlight;

import X.C01GW;
import X.C1421830n6T;
import X.C1421850n6V;
import X.C1954807lC;
import X.C2262131DgR;
import X.C452501pT;
import X.C786410Ut5;
import X.EnumC1421840n6U;
import X.InterfaceC1421750n6L;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.basicui.listitem.common.AbsFullSpanVH;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BasicPopUp;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel;
import kotlin.jvm.internal.AwS149S1100000_35;
import kotlin.jvm.internal.AwS566S0100000_22;
import kotlin.jvm.internal.AwS614S0100000_35;

/* JADX INFO: loaded from: classes23.dex */
public final class ProductHighlightVH extends AbsFullSpanVH<ProductHighlightVO> {
    public final C01GW LLJJIJIL;
    public View LLJJJ;
    public final C2262131DgR LLJJJIL;

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.basicui.listitem.common.AbsFullSpanVH, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final String c6() {
        ModuleConfig moduleConfig;
        C1421830n6T c1421830n6T = EnumC1421840n6U.Companion;
        ProductHighlightUIConfig productHighlightUIConfig = X5().uiConfig;
        Integer num = (productHighlightUIConfig == null || (moduleConfig = productHighlightUIConfig.moduleConfig) == null) ? null : moduleConfig.direction;
        c1421830n6T.getClass();
        int i = C1421850n6V.LIZ[C1421830n6T.LIZ(num).ordinal()];
        if (i == 1) {
            return "c2903.d0";
        }
        if (i == 2) {
            return "c6983.d0";
        }
        throw new C1954807lC();
    }

    public final PdpViewModel d6() {
        return (PdpViewModel) this.LLJJIJIL.getValue();
    }

    public final void e6() {
        BasicPopUp basicPopUp;
        ProductHighlightData productHighlightData = X5().moduleData;
        if (productHighlightData == null || (basicPopUp = productHighlightData.popUp) == null) {
            return;
        }
        d6().LLLLJ.LJIIIIZZ(basicPopUp, c6(), null);
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x0094 A[PHI: r1
      0x0094: PHI (r1v4 java.util.List<com.ss.android.ugc.aweme.ecommerce.base.pdp.view.iconlabelgroup.MaxWidthRule>) = 
      (r1v3 java.util.List<com.ss.android.ugc.aweme.ecommerce.base.pdp.view.iconlabelgroup.MaxWidthRule>)
      (r1v6 java.util.List<com.ss.android.ugc.aweme.ecommerce.base.pdp.view.iconlabelgroup.MaxWidthRule>)
      (r1v6 java.util.List<com.ss.android.ugc.aweme.ecommerce.base.pdp.view.iconlabelgroup.MaxWidthRule>)
     binds: [B:53:0x0091, B:47:0x0082, B:49:0x0086] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void rr(java.lang.Object r9) {
        /*
            Method dump skipped, instruction units count: 204
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.producthighlight.ProductHighlightVH.rr(java.lang.Object):void");
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.1DgR] */
    public ProductHighlightVH(ViewGroup viewGroup, View view) {
        View view2 = view;
        if (view == null) {
            FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
            C786410Ut5.a6(frameLayout, new ViewGroup.LayoutParams(-1, -2));
            view2 = frameLayout;
        }
        super(view2);
        this.LLJJIJIL = C452501pT.LIZIZ(new AwS566S0100000_22(this, 1070));
        this.LLJJJIL = new InterfaceC1421750n6L() { // from class: X.1DgR
            @Override // X.InterfaceC1421750n6L
            public final void LIZ() {
                C1748720vbi.LIZLLL(this.LIZ.itemView, new C10515049h(), new AwS614S0100000_35(this.LIZ, 226));
            }

            @Override // X.InterfaceC1421750n6L
            public final void LIZIZ() {
                C1748720vbi.LIZLLL(this.LIZ.itemView, new C10516049i(), new AwS614S0100000_35(this.LIZ, 225));
                this.LIZ.e6();
            }

            @Override // X.InterfaceC1421750n6L
            public final void LIZJ(String str) {
                C1748720vbi.LIZLLL(this.LIZ.itemView, new C049X(), new AwS149S1100000_35(str, this.LIZ, 6));
            }

            @Override // X.InterfaceC1421750n6L
            public final void LIZLLL(String str) {
                C1748720vbi.LIZLLL(this.LIZ.itemView, new C10523049p(), new AwS149S1100000_35(str, this.LIZ, 7));
            }

            @Override // X.InterfaceC1421750n6L
            public final void onButtonClick(String str) {
                C1748720vbi.LIZLLL(this.LIZ.itemView, new C10516049i(), new AwS614S0100000_35(this.LIZ, 224));
                C1748720vbi.LIZLLL(this.LIZ.itemView, new C049Y(), new AwS149S1100000_35(str, this.LIZ, 5));
                this.LIZ.e6();
            }
        };
    }
}
