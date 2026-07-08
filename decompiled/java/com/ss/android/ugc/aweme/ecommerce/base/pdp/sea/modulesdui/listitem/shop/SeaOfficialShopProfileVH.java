package com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.modulesdui.listitem.shop;

import X.C01GW;
import X.C13LE;
import X.C1743750vTh;
import X.C1753740vjo;
import X.C1755030vlt;
import X.C19719912Dl;
import X.C384050F3z;
import X.C418440Gaw;
import X.C426750GoL;
import X.C452501pT;
import X.C814420VxA;
import X.C940803m2;
import X.C950403na;
import X.C951303nj;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.basicui.listitem.common.AbsFullSpanVH;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.SeaPdpViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS270S0300000_26;

/* JADX INFO: loaded from: classes2.dex */
public final class SeaOfficialShopProfileVH extends AbsFullSpanVH<SeaOfficialShopProfileVO> {
    public static final int LLJJJJJIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2));
    public static final int LLJJJJLIIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
    public static final int LLJJL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
    public static final int LLJJLIIIJLLLLLLLZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
    public static final int LLJL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(5));
    public final C01GW LLJJIJIL;
    public C940803m2 LLJJJ;
    public final C950403na LLJJJIL;
    public final C951303nj LLJJJJ;

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.basicui.listitem.common.AbsFullSpanVH, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final SeaPdpViewModel c6() {
        return (SeaPdpViewModel) this.LLJJIJIL.getValue();
    }

    @Override // com.bytedance.jedi.ext.adapter.JediViewHolder
    public final void onPause() {
        C950403na c950403na = this.LLJJJIL;
        if (c950403na != null) {
            c950403na.LIZJ(true);
        }
    }

    @Override // com.bytedance.jedi.ext.adapter.JediViewHolder
    public final void onResume() {
        b6(new C1755030vlt(this.LLILLJJLI));
        C950403na c950403na = this.LLJJJIL;
        if (c950403na != null) {
            c950403na.LIZIZ();
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.basicui.listitem.common.AbsFullSpanVH, com.bytedance.jedi.ext.adapter.JediViewHolder
    public final void onCreate() {
        super.onCreate();
        this.LLJJJJ.setViewPreLoader((C1753740vjo) c6().WR2().LIZ.getValue());
    }

    @Override // com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder
    public final void onDestroy() {
        C1743750vTh.LIZ(this);
        C950403na c950403na = this.LLJJJIL;
        if (c950403na != null) {
            c950403na.LIZJ(false);
        }
        C951303nj c951303nj = this.LLJJJJ;
        c951303nj.LLJI = null;
        c951303nj.LLJIJIL = null;
        c951303nj.LLJILJIL.clear();
    }

    public SeaOfficialShopProfileVH(ViewGroup viewGroup) {
        C950403na c950403na;
        super(new C950403na(viewGroup.getContext(), null, 6));
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SeaPdpViewModel.class);
        this.LLJJIJIL = C452501pT.LIZIZ(new AwS270S0300000_26(this, c19719912DlLIZ, c19719912DlLIZ, 75));
        View view = this.itemView;
        if (view instanceof C950403na) {
            c950403na = (C950403na) view;
        } else {
            c950403na = null;
        }
        this.LLJJJIL = c950403na;
        C951303nj c951303nj = new C951303nj(this.itemView.getContext(), null, 0);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c951303nj);
        c951303nj.setLayoutParams(layoutParams);
        int i = LLJJJJJIL;
        C426750GoL.LJIIIZ(c951303nj, Integer.valueOf(i), Integer.valueOf(i), Integer.valueOf(i), Integer.valueOf(i), false, 16);
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.zm);
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(10));
        c951303nj.setBackground(c384050F3z.LIZ(c951303nj.getContext()));
        if (c950403na != null) {
            c950403na.addView(c951303nj);
        }
        this.LLJJJJ = c951303nj;
    }

    /* JADX WARN: Removed duplicated region for block: B:75:0x01c4  */
    /* JADX WARN: Type inference failed for: r3v89, types: [X.03m2] */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void rr(java.lang.Object r24) {
        /*
            Method dump skipped, instruction units count: 722
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.modulesdui.listitem.shop.SeaOfficialShopProfileVH.rr(java.lang.Object):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d6(java.lang.String r28, com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.modulesdui.listitem.shop.SeaOfficialShopProfileVO r29) {
        /*
            Method dump skipped, instruction units count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.modulesdui.listitem.shop.SeaOfficialShopProfileVH.d6(java.lang.String, com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.modulesdui.listitem.shop.SeaOfficialShopProfileVO):void");
    }
}
