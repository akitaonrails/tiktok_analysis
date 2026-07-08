package com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.modulesdui.listitem.desc;

import X.C01GW;
import X.C10515049h;
import X.C13LE;
import X.C1406520mhm;
import X.C1748720vbi;
import X.C1755600vmo;
import X.C19719912Dl;
import X.C452501pT;
import X.C786410Ut5;
import android.content.Context;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsBrickFullSpanVH;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.SeaPdpViewModel;
import com.zhiliaoapp.musically.R;
import g1c.AjS70S0100000_26;
import kotlin.jvm.internal.AFwS215S0000000_26;
import kotlin.jvm.internal.AFwS268S0000000_26;
import kotlin.jvm.internal.AwS270S0300000_26;

/* JADX INFO: loaded from: classes27.dex */
public final class SeaSeeLessVH extends AbsBrickFullSpanVH<C1406520mhm> {
    public final C01GW LLJJIJIL;

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsBrickFullSpanVH, com.ss.android.ugc.aweme.ecommerce.base.pdp.basicui.listitem.common.AbsFullSpanVH, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public SeaSeeLessVH(ViewGroup viewGroup) {
        C1755600vmo c1755600vmo = C1755600vmo.LIZ;
        Context context = viewGroup.getContext();
        c1755600vmo.getClass();
        super(C1755600vmo.LIZ(R.layout.axh, context, viewGroup, false, true));
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SeaPdpViewModel.class);
        this.LLJJIJIL = C452501pT.LIZIZ(new AwS270S0300000_26(this, c19719912DlLIZ, c19719912DlLIZ, 64));
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsBrickFullSpanVH, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    /* JADX INFO: renamed from: d6, reason: merged with bridge method [inline-methods] */
    public final void rr(C1406520mhm c1406520mhm) {
        super.rr(c1406520mhm);
        C1748720vbi.LJFF(this.itemView, new C10515049h(), AFwS215S0000000_26.get$arr$(117), AFwS268S0000000_26.get$arr$(214));
        C786410Ut5.I7(new AjS70S0100000_26(this, 15), this.itemView);
    }
}
