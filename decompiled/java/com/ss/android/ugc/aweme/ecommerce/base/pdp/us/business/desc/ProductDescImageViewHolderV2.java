package com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.desc;

import X.C01GW;
import X.C1025903zl;
import X.C1054004Ag;
import X.C1066100dqi;
import X.C1326490kch;
import X.C1326790kdB;
import X.C1331670kl3;
import X.C1406700mi4;
import X.C1748510vbN;
import X.C1750100vdw;
import X.C1752130vhD;
import X.C1752170vhH;
import X.C1776120wJu;
import X.C452501pT;
import X.C954703oH;
import X.EnumC1338240kve;
import X.InterfaceC1752190vhJ;
import X.InterfaceC999703vX;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import c1b.m;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsBrickFullSpanVH;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BasicPopUp;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS427S0200000_26;
import kotlin.jvm.internal.AwS570S0100000_26;
import kotlin.jvm.internal.AwS605S0100000_26;

/* JADX INFO: loaded from: classes27.dex */
public final class ProductDescImageViewHolderV2 extends AbsBrickFullSpanVH<C1406700mi4> implements InterfaceC1752190vhJ {
    public final Function1<Integer, Object> LLJJIJIL;
    public final C01GW LLJJJ;
    public C1752170vhH LLJJJIL;
    public m LLJJJJ;

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
        return (PdpViewModel) this.LLJJJ.getValue();
    }

    @Override // com.bytedance.jedi.ext.adapter.JediViewHolder, X.C11EV
    public final void I5() {
        super.I5();
        d6().GR2().LIZ(this.LLJJ, this.LLJJIJIL, d6().LLLZL, d6().iH1(Integer.valueOf(d6().Tg2())));
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

    @Override // X.InterfaceC1752190vhJ
    public final void LJJJJJL(boolean z) {
        d6().LLJJI = z;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsBrickFullSpanVH, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    /* JADX INFO: renamed from: e6, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final void rr(C1406700mi4 c1406700mi4) {
        String str;
        super.rr(c1406700mi4);
        C1326490kch.LIZ.getClass();
        C1326490kch.LJIIIIZZ("ProductDescImageViewHolderV2", "onBind", null);
        this.LLJJJIL = (C1752170vhH) C1748510vbN.LIZ(this, R.id.fng);
        d6().GR2().LJFF(this.LLJJ);
        if (this.LLJJJJ == null) {
            m mVarOE0 = c1406700mi4.LLILZIL;
            if (mVarOE0 == null) {
                mVarOE0 = ((InterfaceC999703vX) C1025903zl.LIZ(d6(), InterfaceC999703vX.class)).oE0();
            }
            this.LLJJJJ = mVarOE0;
        }
        m mVar = this.LLJJJJ;
        if (mVar == null) {
            return;
        }
        C1752170vhH c1752170vhH = this.LLJJJIL;
        if (c1752170vhH != null) {
            c1752170vhH.LIZ(c1406700mi4, this.LLJJ, mVar, this, this.LLJJIJIL, new AwS427S0200000_26(c1406700mi4, this, 29));
        }
        if (c1406700mi4.LLILZ) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        C1054004Ag c1054004Ag = d6().LLJLILLLLZIIL;
        if (c1054004Ag != null) {
            C1054004Ag.LJJIJIIJIL(c1054004Ag, c1406700mi4.LL.getUri(), str, false);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ProductDescImageViewHolderV2(ViewGroup viewGroup, View view, C1752130vhD c1752130vhD) {
        if (view == null) {
            C01GW c01gw = C954703oH.LIZ;
            view = C954703oH.LIZ(viewGroup.getContext(), R.layout.aue, viewGroup, false);
        }
        super(view);
        this.LLJJIJIL = c1752130vhD;
        this.LLJJJ = C452501pT.LIZIZ(new AwS570S0100000_26(this, 22));
    }

    @Override // X.InterfaceC1752190vhJ
    public final void h1(C1406700mi4 c1406700mi4, SmartImageView smartImageView, C1066100dqi c1066100dqi) {
        C1326790kdB c1326790kdB = C1326790kdB.LIZ;
        Image image = c1406700mi4.LL;
        c1326790kdB.getClass();
        C1331670kl3 c1331670kl3LIZLLL = C1326790kdB.LIZLLL(image);
        c1331670kl3LIZLLL.LJJ = EnumC1338240kve.CENTER_CROP;
        EnumC1338240kve enumC1338240kve = EnumC1338240kve.CENTER;
        c1331670kl3LIZLLL.LJIILIIL = R.drawable.b5l;
        c1331670kl3LIZLLL.LJIILLIIL = enumC1338240kve;
        c1331670kl3LIZLLL.LIZLLL("CommerceHeadVH");
        c1331670kl3LIZLLL.LJJ(smartImageView);
        C1750100vdw.LIZ(c1331670kl3LIZLLL, c1406700mi4.LL, LifecycleOwnerKt.getLifecycleScope(this));
        c1331670kl3LIZLLL.LJIIJ(new C1776120wJu(c1066100dqi, 1));
    }
}
