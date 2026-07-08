package com.ss.android.ugc.aweme.ecommerce.base.address.edit.viewholder;

import X.AnonymousClass0378;
import X.C01GW;
import X.C13LE;
import X.C1743750vTh;
import X.C1745300vWC;
import X.C1745680vWo;
import X.C19719912Dl;
import X.C452501pT;
import X.C992303uL;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel;
import com.zhiliaoapp.musically.R;
import eha.k;
import kotlin.jvm.internal.AwS270S0300000_26;

/* JADX INFO: loaded from: classes27.dex */
public final class RegionSelectItemViewHolder extends BaseViewHolder {
    public final FragmentManager LLJILJILJ;
    public final C01GW LLJILLL;
    public k LLJJ;

    @Override // com.ss.android.ugc.aweme.ecommerce.base.address.edit.viewholder.BaseViewHolder, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final k a6() {
        if (this.LLJJ == null) {
            this.LLJJ = new k((C1745300vWC) this.itemView, this.LLJILJILJ, (AddressEditViewModel) this.LLJILLL.getValue(), true);
        }
        return this.LLJJ;
    }

    @Override // com.bytedance.jedi.ext.adapter.JediViewHolder
    public final void onCreate() {
        k kVarA6 = a6();
        if (kVarA6 != null) {
            AnonymousClass0378.LIZ().LIZLLL("ec_district_select", kVarA6);
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder
    public final void onDestroy() {
        C1743750vTh.LIZ(this);
        k kVar = this.LLJJ;
        if (kVar != null) {
            AnonymousClass0378.LIZ().LIZJ("ec_district_select", kVar);
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.address.edit.viewholder.BaseViewHolder
    /* JADX INFO: renamed from: W5 */
    public final void rr(C1745680vWo c1745680vWo) {
        super.rr(c1745680vWo);
        k kVarA6 = a6();
        if (kVarA6 != null) {
            kVarA6.LIZIZ(c1745680vWo, true);
        }
        X5();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.address.edit.viewholder.BaseViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public final /* bridge */ /* synthetic */ void rr(Object obj) {
        rr((C1745680vWo) obj);
    }

    public RegionSelectItemViewHolder(ViewGroup viewGroup, FragmentManager fragmentManager) {
        super(C992303uL.LIZ(viewGroup.getContext(), R.layout.ajb, viewGroup));
        this.LLJILJILJ = fragmentManager;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(AddressEditViewModel.class);
        this.LLJILLL = C452501pT.LIZIZ(new AwS270S0300000_26(this, c19719912DlLIZ, c19719912DlLIZ, 26));
    }
}
