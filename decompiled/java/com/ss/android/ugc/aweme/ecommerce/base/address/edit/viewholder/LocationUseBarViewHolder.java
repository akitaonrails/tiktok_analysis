package com.ss.android.ugc.aweme.ecommerce.base.address.edit.viewholder;

import X.AnonymousClass0388;
import X.C01GW;
import X.C13LE;
import X.C1745220vW4;
import X.C1745680vWo;
import X.C19719912Dl;
import X.C418440Gaw;
import X.C452501pT;
import X.C786410Ut5;
import X.C814420VxA;
import X.C992303uL;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditFragment;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS270S0300000_26;

/* JADX INFO: loaded from: classes27.dex */
public final class LocationUseBarViewHolder extends BaseViewHolder {
    public final AddressEditFragment LLJILJILJ;
    public boolean LLJILLL;
    public boolean LLJJ;
    public boolean LLJJI;
    public boolean LLJJIII;
    public final C01GW LLJJIJI;
    public final AnonymousClass0388 LLJJIJIIJIL;
    public final C1745220vW4 LLJJIJIL;

    @Override // com.ss.android.ugc.aweme.ecommerce.base.address.edit.viewholder.BaseViewHolder, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final AddressEditViewModel a6() {
        return (AddressEditViewModel) this.LLJJIJI.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x001a  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0013  */
    @Override // com.ss.android.ugc.aweme.ecommerce.base.address.edit.viewholder.BaseViewHolder
    /* JADX INFO: renamed from: W5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void rr(X.C1745680vWo r13) {
        /*
            Method dump skipped, instruction units count: 265
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.address.edit.viewholder.LocationUseBarViewHolder.rr(X.0vWo):void");
    }

    public final void b6(boolean z) {
        boolean z2;
        int iLIZIZ;
        int iLIZIZ2;
        int i = 0;
        if (this.itemView.getVisibility() == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2 == z) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = this.itemView.getLayoutParams();
        if (layoutParams != null) {
            if (z) {
                iLIZIZ = -1;
            } else {
                iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0));
            }
            layoutParams.width = iLIZIZ;
            if (z) {
                iLIZIZ2 = -2;
            } else {
                iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0));
            }
            layoutParams.height = iLIZIZ2;
        }
        C786410Ut5.W5(this.itemView, layoutParams);
        View view = this.itemView;
        if (!z) {
            i = 8;
        }
        C786410Ut5.LJLLLLLL(i, view);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.address.edit.viewholder.BaseViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public final /* bridge */ /* synthetic */ void rr(Object obj) {
        rr((C1745680vWo) obj);
    }

    public LocationUseBarViewHolder(ViewGroup viewGroup, AddressEditFragment addressEditFragment) {
        super(C992303uL.LIZ(viewGroup.getContext(), R.layout.aiy, viewGroup));
        this.LLJILJILJ = addressEditFragment;
        this.LLJJ = true;
        this.LLJJI = true;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(AddressEditViewModel.class);
        this.LLJJIJI = C452501pT.LIZIZ(new AwS270S0300000_26(this, c19719912DlLIZ, c19719912DlLIZ, 22));
        this.LLJJIJIIJIL = (AnonymousClass0388) this.itemView.findViewById(R.id.j4y);
        this.LLJJIJIL = (C1745220vW4) this.itemView.findViewById(R.id.use_location_layout);
    }
}
