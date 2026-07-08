package com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.module.desc;

import X.C01GW;
import X.C13LE;
import X.C1406730mi7;
import X.C1750080vdu;
import X.C1755030vlt;
import X.C1755600vmo;
import X.C19719912Dl;
import X.C297101Dd;
import X.C452501pT;
import X.InterfaceC1750090vdv;
import android.content.Context;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsBrickFullSpanVH;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.SeaPdpViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS270S0300000_26;
import kotlin.jvm.internal.AwS605S0100000_26;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class SeaProductDescTextViewHolderV2 extends AbsBrickFullSpanVH<C1406730mi7> implements InterfaceC1750090vdv {
    public final Function1<Integer, Object> LLJJIJIL;
    public final C01GW LLJJJ;
    public C297101Dd LLJJJIL;
    public C1750080vdu LLJJJJ;

    @Override // X.InterfaceC1750090vdv
    public final void LJJJJJL(boolean z) {
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsBrickFullSpanVH, com.ss.android.ugc.aweme.ecommerce.base.pdp.basicui.listitem.common.AbsFullSpanVH, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final SeaPdpViewModel d6() {
        return (SeaPdpViewModel) this.LLJJJ.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.jedi.ext.adapter.JediViewHolder
    public final void onResume() {
        if (Intrinsics.LJFF(((C1406730mi7) this.LLILLJJLI).LLILLJJLI, "title")) {
            b6(new C1755030vlt(this.LLILLJJLI));
        } else {
            b6(null);
        }
    }

    @Override // com.bytedance.jedi.ext.adapter.JediViewHolder, X.C11EV
    public final void I5() {
        super.I5();
        d6().LR2().LIZ(getAbsoluteAdapterPosition(), this.LLJJIJIL, d6().LLLLZLL, d6().RR2(d6().Tg2()));
    }

    @Override // X.InterfaceC1750090vdv
    public final void LJJLIIIJILLIZJL() {
        SeaPdpViewModel seaPdpViewModelD6 = d6();
        seaPdpViewModelD6.LLLZI = true;
        seaPdpViewModelD6.setState(new AwS605S0100000_26(seaPdpViewModelD6, 651));
    }

    @Override // com.bytedance.jedi.ext.adapter.JediViewHolder, X.C11EV
    public final void P5() {
        super.P5();
        d6().LR2().LIZIZ(getAbsoluteAdapterPosition());
    }

    /* JADX WARN: Removed duplicated region for block: B:139:0x04d4  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0297 A[PHI: r15
      0x0297: PHI (r15v7 int) = (r15v3 int), (r15v3 int), (r15v8 int) binds: [B:88:0x02fb, B:92:0x030e, B:65:0x0296] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0313  */
    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsBrickFullSpanVH, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    /* JADX INFO: renamed from: e6, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void rr(X.C1406730mi7 r19) {
        /*
            Method dump skipped, instruction units count: 1279
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.module.desc.SeaProductDescTextViewHolderV2.rr(X.0mi7):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public SeaProductDescTextViewHolderV2(ViewGroup viewGroup, AwS605S0100000_26 awS605S0100000_26) {
        C1755600vmo c1755600vmo = C1755600vmo.LIZ;
        Context context = viewGroup.getContext();
        c1755600vmo.getClass();
        super(C1755600vmo.LIZ(R.layout.axa, context, viewGroup, false, true));
        this.LLJJIJIL = awS605S0100000_26;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SeaPdpViewModel.class);
        this.LLJJJ = C452501pT.LIZIZ(new AwS270S0300000_26(this, c19719912DlLIZ, c19719912DlLIZ, 134));
    }
}
