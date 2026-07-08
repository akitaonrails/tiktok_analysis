package com.ss.android.ugc.aweme.ecommerce.base.delivery.vh.sea.pudo;

import X.C01GW;
import X.C03F3;
import X.C13LE;
import X.C1841350y17;
import X.C19719912Dl;
import X.C452501pT;
import X.C786410Ut5;
import X.InterfaceC420801kM;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.vm.DeliveryPanelViewModel;
import com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS270S0300000_26;

/* JADX INFO: loaded from: classes2.dex */
public final class SeaPudoViewHolder extends ECJediViewHolder<C03F3> {
    public final C01GW LLJILJIL;
    public LinearLayout LLJILJILJ;
    public C1841350y17 LLJILLL;
    public TuxTextView LLJJ;
    public SmartImageView LLJJI;
    public InterfaceC420801kM LLJJIII;

    @Override // com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final SmartImageView W5() {
        View viewFindViewById = this.LLJJI;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.l60) : null;
            this.LLJJI = (SmartImageView) viewFindViewById;
        }
        return (SmartImageView) viewFindViewById;
    }

    public SeaPudoViewHolder(ViewGroup viewGroup) {
        super(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.ant, viewGroup, false));
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(DeliveryPanelViewModel.class);
        this.LLJILJIL = C452501pT.LIZIZ(new AwS270S0300000_26(this, c19719912DlLIZ, c19719912DlLIZ, 38));
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0080 A[PHI: r5
      0x0080: PHI (r5v6 android.view.View) = (r5v5 android.view.View), (r5v16 android.view.View) binds: [B:24:0x006d, B:29:0x007e] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void rr(java.lang.Object r21) {
        /*
            Method dump skipped, instruction units count: 541
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.delivery.vh.sea.pudo.SeaPudoViewHolder.rr(java.lang.Object):void");
    }
}
