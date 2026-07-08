package com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.modulesdui.listitem.review.customerreview;

import X.C01GW;
import X.C04IE;
import X.C13LE;
import X.C1750140ve0;
import X.C1755030vlt;
import X.C1755600vmo;
import X.C19719912Dl;
import X.C452501pT;
import Y.ARunnableS101S0100000_1;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.basicui.listitem.common.AbsFullSpanVH;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.SeaPdpViewModel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedList;
import kotlin.jvm.internal.AwS270S0300000_26;

/* JADX INFO: loaded from: classes2.dex */
public final class PdpReviewHeadViewHolder extends AbsFullSpanVH<C04IE> {
    public final String LLJJIJIL;
    public final C01GW LLJJJ;
    public final LinkedList<View> LLJJJIL;
    public final TuxIconView LLJJJJ;

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.basicui.listitem.common.AbsFullSpanVH, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final SeaPdpViewModel c6() {
        return (SeaPdpViewModel) this.LLJJJ.getValue();
    }

    @Override // com.bytedance.jedi.ext.adapter.JediViewHolder
    public final void onResume() {
        b6(new C1755030vlt(this.LLILLJJLI));
        View view = this.itemView;
        if (view != null) {
            HandlerHook.viewPost(view, new ARunnableS101S0100000_1(this, 20));
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.basicui.listitem.common.AbsFullSpanVH, com.bytedance.jedi.ext.adapter.JediViewHolder
    public final void onCreate() {
        super.onCreate();
        c6();
        C1750140ve0.LIZ(this.itemView, false);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public PdpReviewHeadViewHolder(ViewGroup viewGroup) {
        C1755600vmo c1755600vmo = C1755600vmo.LIZ;
        Context context = viewGroup.getContext();
        c1755600vmo.getClass();
        super(C1755600vmo.LIZ(R.layout.awi, context, viewGroup, false, true));
        this.LLJJIJIL = "PdpReviewHeadViewHolder";
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SeaPdpViewModel.class);
        this.LLJJJ = C452501pT.LIZIZ(new AwS270S0300000_26(this, c19719912DlLIZ, c19719912DlLIZ, 68));
        this.LLJJJIL = new LinkedList<>();
        this.LLJJJJ = (TuxIconView) this.itemView.findViewById(R.id.lsu);
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0321  */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void rr(java.lang.Object r19) {
        /*
            Method dump skipped, instruction units count: 1111
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.modulesdui.listitem.review.customerreview.PdpReviewHeadViewHolder.rr(java.lang.Object):void");
    }
}
