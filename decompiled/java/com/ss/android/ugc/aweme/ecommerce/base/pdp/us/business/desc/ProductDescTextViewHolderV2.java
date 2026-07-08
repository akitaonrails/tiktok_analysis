package com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.desc;

import X.C01GW;
import X.C1019103yf;
import X.C1025903zl;
import X.C1066100dqi;
import X.C1326490kch;
import X.C1406700mi4;
import X.C1406720mi6;
import X.C1748510vbN;
import X.C1752140vhE;
import X.C1752150vhF;
import X.C1755030vlt;
import X.C452501pT;
import X.C954703oH;
import X.EnumC1014603xw;
import X.InterfaceC1752190vhJ;
import X.InterfaceC999703vX;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import c1b.m;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsBrickFullSpanVH;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BasicPopUp;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS570S0100000_26;
import kotlin.jvm.internal.AwS605S0100000_26;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class ProductDescTextViewHolderV2 extends AbsBrickFullSpanVH<C1406720mi6> implements InterfaceC1752190vhJ {
    public final View LLJJIJIL;
    public final Function1<Integer, Object> LLJJJ;
    public final C01GW LLJJJIL;
    public C1752150vhF LLJJJJ;
    public m LLJJJJJIL;

    @Override // X.InterfaceC1752190vhJ
    public final void LJJJJJL(boolean z) {
    }

    @Override // X.InterfaceC1752190vhJ
    public final void h1(C1406700mi4 c1406700mi4, SmartImageView smartImageView, C1066100dqi c1066100dqi) {
    }

    @Override // X.InterfaceC1752190vhJ
    public final void l4(TuxSheet tuxSheet) {
    }

    @Override // X.InterfaceC1752190vhJ
    public final void m4(BasicPopUp basicPopUp, String str) {
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsBrickFullSpanVH, com.ss.android.ugc.aweme.ecommerce.base.pdp.basicui.listitem.common.AbsFullSpanVH, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // X.InterfaceC1752190vhJ
    public final void p2() {
    }

    public final PdpViewModel d6() {
        return (PdpViewModel) this.LLJJJIL.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.jedi.ext.adapter.JediViewHolder
    public final void onResume() {
        if (Intrinsics.LJFF(((C1406720mi6) this.LLILLJJLI).LLILLJJLI, "title")) {
            b6(new C1755030vlt(this.LLILLJJLI));
        } else {
            b6(null);
        }
    }

    @Override // com.bytedance.jedi.ext.adapter.JediViewHolder, X.C11EV
    public final void I5() {
        super.I5();
        d6().GR2().LIZ(this.LLJJ, this.LLJJJ, d6().LLLZL, d6().iH1(Integer.valueOf(d6().Tg2())));
    }

    @Override // X.InterfaceC1752190vhJ
    public final void LJJLIIIJILLIZJL() {
        PdpViewModel pdpViewModelD6 = d6();
        pdpViewModelD6.LLZ = true;
        pdpViewModelD6.setState(new AwS605S0100000_26(pdpViewModelD6, 917));
    }

    @Override // com.bytedance.jedi.ext.adapter.JediViewHolder, X.C11EV
    public final void P5() {
        super.P5();
        d6().GR2().LIZIZ(this.LLJJ);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsBrickFullSpanVH, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    /* JADX INFO: renamed from: e6, reason: merged with bridge method [inline-methods] */
    public final void rr(C1406720mi6 c1406720mi6) {
        C1752150vhF c1752150vhF;
        super.rr(c1406720mi6);
        C1326490kch.LIZ.getClass();
        C1326490kch.LJIIIIZZ("ProductDescTextViewHolderV2", "onBind", null);
        try {
            d6();
            this.LLJJJJ = (C1752150vhF) C1748510vbN.LIZ(this, R.id.fo6);
            d6().GR2().LJFF(this.LLJJ);
            if (this.LLJJJJJIL == null) {
                m mVarOE0 = c1406720mi6.LLJI;
                if (mVarOE0 == null) {
                    mVarOE0 = ((InterfaceC999703vX) C1025903zl.LIZ(d6(), InterfaceC999703vX.class)).oE0();
                }
                this.LLJJJJJIL = mVarOE0;
            }
            m mVar = this.LLJJJJJIL;
            if (mVar != null && (c1752150vhF = this.LLJJJJ) != null) {
                c1752150vhF.e0(c1406720mi6, this.LLJJ, mVar, this, this.LLJJJ);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1019103yf.LIZ(EnumC1014603xw.ERR10013, e, null);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ProductDescTextViewHolderV2(ViewGroup viewGroup, View view, C1752140vhE c1752140vhE) {
        View viewLIZ;
        if (view == null) {
            C01GW c01gw = C954703oH.LIZ;
            viewLIZ = C954703oH.LIZ(viewGroup.getContext(), R.layout.aug, viewGroup, false);
        } else {
            viewLIZ = view;
        }
        super(viewLIZ);
        this.LLJJIJIL = view;
        this.LLJJJ = c1752140vhE;
        this.LLJJJIL = C452501pT.LIZIZ(new AwS570S0100000_26(this, 23));
    }
}
