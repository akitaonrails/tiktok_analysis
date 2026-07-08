package com.ss.android.ugc.aweme.ecommerce.base.address.edit.viewholder;

import X.AnonymousClass0388;
import X.C01GW;
import X.C03CB;
import X.C03DZ;
import X.C13LE;
import X.C1745680vWo;
import X.C19719912Dl;
import X.C452501pT;
import X.C992303uL;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditFragment;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS270S0300000_26;
import kotlin.jvm.internal.AwS550S0100000_6;

/* JADX INFO: loaded from: classes27.dex */
public final class LocationUseBarV2ViewHolder extends BaseViewHolder {
    public final AddressEditFragment LLJILJILJ;
    public boolean LLJILLL;
    public boolean LLJJ;
    public boolean LLJJI;
    public boolean LLJJIII;
    public final C01GW LLJJIJI;
    public final AnonymousClass0388 LLJJIJIIJIL;
    public final C03CB LLJJIJIL;
    public final C01GW LLJJJ;
    public boolean LLJJJIL;
    public boolean LLJJJJ;

    @Override // com.ss.android.ugc.aweme.ecommerce.base.address.edit.viewholder.BaseViewHolder, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final AddressEditViewModel a6() {
        return (AddressEditViewModel) this.LLJJIJI.getValue();
    }

    public final void b6() {
        C03DZ.LIZ(this.LLJJIJIIJIL);
        C03DZ.LIZ(this.LLJJIJIL);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0126  */
    @Override // com.ss.android.ugc.aweme.ecommerce.base.address.edit.viewholder.BaseViewHolder
    /* JADX INFO: renamed from: W5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void rr(X.C1745680vWo r20) {
        /*
            Method dump skipped, instruction units count: 565
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.address.edit.viewholder.LocationUseBarV2ViewHolder.rr(X.0vWo):void");
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.address.edit.viewholder.BaseViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public final /* bridge */ /* synthetic */ void rr(Object obj) {
        rr((C1745680vWo) obj);
    }

    public LocationUseBarV2ViewHolder(ViewGroup viewGroup, AddressEditFragment addressEditFragment) {
        super(C992303uL.LIZ(viewGroup.getContext(), R.layout.aiz, viewGroup));
        this.LLJILJILJ = addressEditFragment;
        this.LLJILLL = true;
        this.LLJJ = true;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(AddressEditViewModel.class);
        this.LLJJIJI = C452501pT.LIZIZ(new AwS270S0300000_26(this, c19719912DlLIZ, c19719912DlLIZ, 20));
        this.LLJJIJIIJIL = (AnonymousClass0388) this.itemView.findViewById(R.id.j4y);
        this.LLJJIJIL = (C03CB) this.itemView.findViewById(R.id.use_location_layout);
        this.LLJJJ = C452501pT.LIZIZ(new AwS550S0100000_6(this, 69));
    }
}
