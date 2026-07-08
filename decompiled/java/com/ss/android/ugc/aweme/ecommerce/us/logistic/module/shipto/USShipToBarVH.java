package com.ss.android.ugc.aweme.ecommerce.us.logistic.module.shipto;

import X.C01GW;
import X.C03FV;
import X.C13LE;
import X.C19719912Dl;
import X.C452501pT;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.vh.ShipToBarHolder;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.vm.DeliveryPanelViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS270S0300000_26;

/* JADX INFO: loaded from: classes2.dex */
public final class USShipToBarVH extends ShipToBarHolder {
    public ConstraintLayout LLJJ;
    public TuxTextView LLJJI;
    public TuxTextView LLJJIII;
    public final C01GW LLJJIJI;

    @Override // com.ss.android.ugc.aweme.ecommerce.base.delivery.vh.ShipToBarHolder, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final TuxTextView X5() {
        View viewFindViewById = this.LLJJIII;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.goz) : null;
            this.LLJJIII = (TuxTextView) viewFindViewById;
        }
        return (TuxTextView) viewFindViewById;
    }

    public final TuxTextView a6() {
        View viewFindViewById = this.LLJJI;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.v60) : null;
            this.LLJJI = (TuxTextView) viewFindViewById;
        }
        return (TuxTextView) viewFindViewById;
    }

    public USShipToBarVH(ViewGroup viewGroup) {
        super(viewGroup, R.layout.b1l, 2);
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(DeliveryPanelViewModel.class);
        this.LLJJIJI = C452501pT.LIZIZ(new AwS270S0300000_26(this, c19719912DlLIZ, c19719912DlLIZ, 94));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001d A[PHI: r2
      0x001d: PHI (r2v1 android.view.View) = (r2v0 android.view.View), (r2v11 android.view.View) binds: [B:3:0x0009, B:8:0x001b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r0v5, types: [T, java.lang.String] */
    @Override // com.ss.android.ugc.aweme.ecommerce.base.delivery.vh.ShipToBarHolder
    /* JADX INFO: renamed from: W5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void rr(X.C03FV r7) {
        /*
            Method dump skipped, instruction units count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.us.logistic.module.shipto.USShipToBarVH.rr(X.03FV):void");
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.delivery.vh.ShipToBarHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public final /* bridge */ /* synthetic */ void rr(Object obj) {
        rr((C03FV) obj);
    }
}
