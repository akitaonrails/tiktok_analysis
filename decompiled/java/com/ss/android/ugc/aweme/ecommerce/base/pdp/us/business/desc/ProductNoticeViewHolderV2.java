package com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.desc;

import X.C01GW;
import X.C1066100dqi;
import X.C1326490kch;
import X.C1406500mhk;
import X.C1406700mi4;
import X.C1748510vbN;
import X.C1748970vc7;
import X.C452501pT;
import X.C808003Dq;
import X.C954703oH;
import X.InterfaceC1752190vhJ;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsBrickFullSpanVH;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BasicPopUp;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS570S0100000_26;

/* JADX INFO: loaded from: classes27.dex */
public final class ProductNoticeViewHolderV2 extends AbsBrickFullSpanVH<C1406500mhk> implements InterfaceC1752190vhJ {
    public final Fragment LLJJIJIL;
    public final C01GW LLJJJ;
    public C1748970vc7 LLJJJIL;

    @Override // X.InterfaceC1752190vhJ
    public final void LJJJJJL(boolean z) {
    }

    @Override // X.InterfaceC1752190vhJ
    public final void LJJLIIIJILLIZJL() {
    }

    @Override // X.InterfaceC1752190vhJ
    public final void h1(C1406700mi4 c1406700mi4, SmartImageView smartImageView, C1066100dqi c1066100dqi) {
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsBrickFullSpanVH, com.ss.android.ugc.aweme.ecommerce.base.pdp.basicui.listitem.common.AbsFullSpanVH, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // X.InterfaceC1752190vhJ
    public final void p2() {
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsBrickFullSpanVH, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    /* JADX INFO: renamed from: d6, reason: merged with bridge method [inline-methods] */
    public final void rr(C1406500mhk c1406500mhk) {
        super.rr(c1406500mhk);
        C1326490kch.LIZ.getClass();
        C1326490kch.LJIIIIZZ("ProductNoticeViewHolderV2", "onBind", null);
        this.LLJJJ.getValue();
        this.LLJJJIL = (C1748970vc7) C1748510vbN.LIZ(this, R.id.fnw);
        C1748970vc7 c1748970vc7 = this.LLJJJIL;
        if (c1748970vc7 != null) {
            c1748970vc7.e0(c1406500mhk, this);
        }
    }

    @Override // X.InterfaceC1752190vhJ
    public final void l4(TuxSheet tuxSheet) {
        C808003Dq.LJFF(tuxSheet, this.LLJJIJIL.getChildFragmentManager(), null, null, 12);
    }

    @Override // X.InterfaceC1752190vhJ
    public final void m4(BasicPopUp basicPopUp, String str) {
        ((PdpViewModel) this.LLJJJ.getValue()).LLLLJ.LJIIIIZZ(basicPopUp, str, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ProductNoticeViewHolderV2(ViewGroup viewGroup, ECBaseFragment eCBaseFragment, View view) {
        if (view == null) {
            C01GW c01gw = C954703oH.LIZ;
            view = C954703oH.LIZ(viewGroup.getContext(), R.layout.auf, viewGroup, false);
        }
        super(view);
        this.LLJJIJIL = eCBaseFragment;
        this.LLJJJ = C452501pT.LIZIZ(new AwS570S0100000_26(this, 25));
    }
}
