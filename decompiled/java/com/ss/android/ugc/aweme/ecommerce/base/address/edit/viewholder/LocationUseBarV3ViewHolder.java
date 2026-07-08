package com.ss.android.ugc.aweme.ecommerce.base.address.edit.viewholder;

import X.C01GW;
import X.C03CC;
import X.C03DZ;
import X.C13LE;
import X.C1745680vWo;
import X.C1745960vXG;
import X.C19719912Dl;
import X.C2341109Fh;
import X.C452501pT;
import X.C786410Ut5;
import X.C992303uL;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditFragment;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS215S0000000_26;
import kotlin.jvm.internal.AwS270S0300000_26;

/* JADX INFO: loaded from: classes27.dex */
public final class LocationUseBarV3ViewHolder extends BaseViewHolder {
    public static final /* synthetic */ int LLJJJIL = 0;
    public final AddressEditFragment LLJILJILJ;
    public boolean LLJILLL;
    public boolean LLJJ;
    public boolean LLJJI;
    public boolean LLJJIII;
    public final C01GW LLJJIJI;
    public final C1745960vXG LLJJIJIIJIL;
    public final C03CC LLJJIJIL;
    public boolean LLJJJ;

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
        c6(false);
        C2341109Fh c2341109Fh = C2341109Fh.LIZ;
        AFwS215S0000000_26 aFwS215S0000000_26 = AFwS215S0000000_26.get$arr$(72);
        c2341109Fh.getClass();
        C2341109Fh.LIZIZ(aFwS215S0000000_26);
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x019a  */
    @Override // com.ss.android.ugc.aweme.ecommerce.base.address.edit.viewholder.BaseViewHolder
    /* JADX INFO: renamed from: W5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void rr(X.C1745680vWo r18) {
        /*
            Method dump skipped, instruction units count: 416
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.address.edit.viewholder.LocationUseBarV3ViewHolder.rr(X.0vWo):void");
    }

    public final void c6(boolean z) {
        int i;
        int i2;
        int i3;
        int visibility = this.itemView.getVisibility();
        int i4 = 8;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        if (visibility == i) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = this.itemView.getLayoutParams();
        if (layoutParams != null) {
            if (z) {
                i2 = -1;
            } else {
                i2 = 0;
            }
            layoutParams.width = i2;
            if (z) {
                i3 = -2;
            } else {
                i3 = 0;
            }
            layoutParams.height = i3;
        }
        C786410Ut5.W5(this.itemView, layoutParams);
        View view = this.itemView;
        if (z) {
            i4 = 0;
        }
        C786410Ut5.LJLLLLLL(i4, view);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.address.edit.viewholder.BaseViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public final /* bridge */ /* synthetic */ void rr(Object obj) {
        rr((C1745680vWo) obj);
    }

    public LocationUseBarV3ViewHolder(ViewGroup viewGroup, AddressEditFragment addressEditFragment) {
        super(C992303uL.LIZ(viewGroup.getContext(), R.layout.aj0, viewGroup));
        this.LLJILJILJ = addressEditFragment;
        this.LLJILLL = true;
        this.LLJJ = true;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(AddressEditViewModel.class);
        this.LLJJIJI = C452501pT.LIZIZ(new AwS270S0300000_26(this, c19719912DlLIZ, c19719912DlLIZ, 21));
        this.LLJJIJIIJIL = (C1745960vXG) this.itemView.findViewById(R.id.j4y);
        this.LLJJIJIL = (C03CC) this.itemView.findViewById(R.id.use_location_layout);
    }
}
