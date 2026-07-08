package com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.biz.card.price;

import X.AbstractC1764350w0v;
import X.C01GW;
import X.C1561330qjT;
import X.C1755600vmo;
import X.C1763620vzk;
import X.C1764380w0y;
import X.C1764420w12;
import X.C452501pT;
import X.C786410Ut5;
import X.C953803o8;
import Y.ARunnableS93S0200000_24;
import android.content.Context;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.biz.card.price.SeaPriceBffVH;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.container.di.IPageStateContextCallback;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.container.di.PageStateContext;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.container.vh.AbsCardVH;
import com.zhiliaoapp.musically.R;
import g1c.AjS70S0100000_26;
import kotlin.jvm.internal.AwS570S0100000_26;

/* JADX INFO: loaded from: classes27.dex */
public final class SeaPriceBffVH extends AbsCardVH<SeaPriceBffVO, C1764380w0y, C1764420w12> {
    public final C01GW LLJJI;
    public C1763620vzk LLJJIII;
    public C953803o8 LLJJIJI;
    public String LLJJIJIIJIL;
    public final C1561330qjT LLJJIJIL;

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.container.vh.AbsCardVH, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.container.vh.AbsCardVH
    public final void c6() {
        this.LLJJIII = (C1763620vzk) this.itemView.findViewById(R.id.u4y);
        this.LLJJIJI = (C953803o8) this.itemView.findViewById(R.id.u4x);
        C1763620vzk c1763620vzk = this.LLJJIII;
        if (c1763620vzk != null) {
            C786410Ut5.I7(new AjS70S0100000_26(this, 13), c1763620vzk);
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.container.vh.AbsCardVH
    public final void e6() {
        PageStateContext pageStateContextA6;
        super.e6();
        String str = this.LLJJIJIIJIL;
        if (str == null || (pageStateContextA6 = a6()) == null) {
            return;
        }
        PageStateContext.LJFF(pageStateContextA6, "sku_id", str);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r0v4, types: [X.0qjT] */
    public SeaPriceBffVH(ViewGroup viewGroup) {
        C1755600vmo c1755600vmo = C1755600vmo.LIZ;
        Context context = viewGroup.getContext();
        c1755600vmo.getClass();
        super(C1755600vmo.LIZ(R.layout.awt, context, viewGroup, false, false));
        this.LLJJI = C452501pT.LIZIZ(new AwS570S0100000_26(this, 404));
        this.LLJJIJIL = new IPageStateContextCallback() { // from class: X.0qjT
            @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.container.di.IPageStateContextCallback
            public final void invoke(Object obj, Object obj2) {
                SeaPriceBffVH seaPriceBffVH = this.LIZ;
                HandlerHook.viewPost(seaPriceBffVH.itemView, new ARunnableS93S0200000_24(seaPriceBffVH, obj2, 4));
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.container.vh.AbsCardVH
    public final void b6(AbstractC1764350w0v abstractC1764350w0v) {
        Object objLIZ;
        String str;
        PageStateContext pageStateContextA6;
        PageStateContext pageStateContextA62 = a6();
        String strLIZIZ = null;
        if (pageStateContextA62 != null) {
            objLIZ = PageStateContext.LIZ(pageStateContextA62, "sku_id");
        } else {
            objLIZ = null;
        }
        if (objLIZ instanceof String) {
            str = (String) objLIZ;
        } else {
            str = null;
        }
        String str2 = this.LLJJIJIIJIL;
        if (str2 != null && (pageStateContextA6 = a6()) != null) {
            PageStateContext.LJFF(pageStateContextA6, "sku_id", str2);
        }
        PageStateContext pageStateContextA63 = a6();
        if (pageStateContextA63 != null) {
            strLIZIZ = PageStateContext.LIZIZ(pageStateContextA63, "sku_id", this.LLJJIJIL);
        }
        this.LLJJIJIIJIL = strLIZIZ;
        f6(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f6(java.lang.String r10) {
        /*
            r9 = this;
            boolean r0 = r9.LLJI
            if (r0 != 0) goto L5
            return
        L5:
            if (r10 != 0) goto L5a
            VM extends X.0w0v<VO, MO> r0 = r9.LLJIJIL
            if (r0 == 0) goto L36
            VO extends X.04Ez r0 = r0.LLILZ
            com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.biz.card.price.SeaPriceBffVO r0 = (com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.biz.card.price.SeaPriceBffVO) r0
            if (r0 == 0) goto L36
            com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.biz.card.price.PDPSeaBffPrice r0 = r0.productPrice
        L13:
            if (r0 == 0) goto L36
        L15:
            boolean r1 = X.C300330Bpv.LIZ()
            if (r1 == 0) goto L37
            java.lang.String r2 = r0.hidePriceTip
            if (r2 == 0) goto L37
            boolean r1 = kotlin.text.a0.LJJJIL(r2)
            if (r1 != 0) goto L37
            X.0vzk r0 = r9.LLJJIII
            X.C03DZ.LIZ(r0)
            X.03o8 r0 = r9.LLJJIJI
            X.C03DZ.LIZJ(r0)
            X.03o8 r0 = r9.LLJJIJI
            if (r0 == 0) goto L36
            r0.setText(r2)
        L36:
            return
        L37:
            X.03o8 r1 = r9.LLJJIJI
            X.C03DZ.LIZ(r1)
            X.0vzk r1 = r9.LLJJIII
            X.C03DZ.LIZJ(r1)
            X.0vzk r1 = r9.LLJJIII
            if (r1 == 0) goto L36
            X.03o5 r2 = new X.03o5
            java.lang.String r3 = r0.discount
            java.lang.String r4 = r0.pricePrefix
            java.lang.String r5 = r0.realPrice
            java.lang.String r6 = r0.realPriceDecimal
            boolean r7 = r0.needIcon
            java.lang.String r8 = r0.originalPrice
            r2.<init>(r3, r4, r5, r6, r7, r8)
            r1.s0(r2)
            return
        L5a:
            VM extends X.0w0v<VO, MO> r0 = r9.LLJIJIL
            if (r0 == 0) goto L70
            VO extends X.04Ez r0 = r0.LLILZ
            com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.biz.card.price.SeaPriceBffVO r0 = (com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.biz.card.price.SeaPriceBffVO) r0
            if (r0 == 0) goto L70
            java.util.Map<java.lang.String, com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.biz.card.price.PDPSeaBffPrice> r0 = r0.skuPrices
            if (r0 == 0) goto L70
            java.lang.Object r0 = r0.get(r10)
            com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.biz.card.price.PDPSeaBffPrice r0 = (com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.biz.card.price.PDPSeaBffPrice) r0
            if (r0 != 0) goto L15
        L70:
            VM extends X.0w0v<VO, MO> r0 = r9.LLJIJIL
            if (r0 == 0) goto L36
            VO extends X.04Ez r0 = r0.LLILZ
            com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.biz.card.price.SeaPriceBffVO r0 = (com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.biz.card.price.SeaPriceBffVO) r0
            if (r0 == 0) goto L36
            com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.biz.card.price.PDPSeaBffPrice r0 = r0.productPrice
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.biz.card.price.SeaPriceBffVH.f6(java.lang.String):void");
    }
}
