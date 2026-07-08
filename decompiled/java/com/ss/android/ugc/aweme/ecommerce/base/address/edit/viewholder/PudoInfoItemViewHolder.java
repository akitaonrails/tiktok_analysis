package com.ss.android.ugc.aweme.ecommerce.base.address.edit.viewholder;

import X.C01GW;
import X.C13LE;
import X.C1747210vZH;
import X.C19719912Dl;
import X.C452501pT;
import X.C992303uL;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel;
import com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS270S0300000_26;

/* JADX INFO: loaded from: classes27.dex */
public final class PudoInfoItemViewHolder extends ECJediViewHolder<C1747210vZH> {
    public final C01GW LLJILJIL;
    public boolean LLJILJILJ;

    @Override // com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final AddressEditViewModel W5() {
        return (AddressEditViewModel) this.LLJILJIL.getValue();
    }

    public PudoInfoItemViewHolder(ViewGroup viewGroup) {
        super(C992303uL.LIZ(viewGroup.getContext(), R.layout.aja, viewGroup));
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(AddressEditViewModel.class);
        this.LLJILJIL = C452501pT.LIZIZ(new AwS270S0300000_26(this, c19719912DlLIZ, c19719912DlLIZ, 121));
        this.LLJILJILJ = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01e9  */
    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void rr(java.lang.Object r23) {
        /*
            Method dump skipped, instruction units count: 492
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.address.edit.viewholder.PudoInfoItemViewHolder.rr(java.lang.Object):void");
    }
}
