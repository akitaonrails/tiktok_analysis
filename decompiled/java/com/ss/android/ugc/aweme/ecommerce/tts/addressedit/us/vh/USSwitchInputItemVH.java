package com.ss.android.ugc.aweme.ecommerce.tts.addressedit.us.vh;

import X.C01GW;
import X.C03J8;
import X.C0H9H;
import X.C127A;
import X.C127K;
import X.C13LE;
import X.C1745480vWU;
import X.C1745680vWo;
import X.C1775870wJV;
import X.C19719912Dl;
import X.C426750GoL;
import X.C452501pT;
import X.C786410Ut5;
import X.C992303uL;
import X.EnumC1746650vYN;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.viewholder.BaseViewHolder;
import com.zhiliaoapp.musically.R;
import g1c.AjS70S0100000_26;
import kotlin.jvm.internal.AwS270S0300000_26;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public class USSwitchInputItemVH extends BaseViewHolder {
    public final int LLJILJILJ;
    public final C01GW LLJILLL;

    @Override // com.ss.android.ugc.aweme.ecommerce.base.address.edit.viewholder.BaseViewHolder, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final AddressEditViewModel a6() {
        return (AddressEditViewModel) this.LLJILLL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.address.edit.viewholder.BaseViewHolder
    /* JADX INFO: renamed from: W5 */
    public final void rr(C1745680vWo c1745680vWo) {
        super.rr(c1745680vWo);
        boolean z = true;
        if (a6().LLLLL == EnumC1746650vYN.EDIT) {
            View view = this.itemView;
            if (getLayoutPosition() == this.LLJILJILJ - 2) {
                z = false;
            }
            C03J8.LIZ(view, z);
        } else {
            View view2 = this.itemView;
            if (getLayoutPosition() == this.LLJILJILJ - 1) {
                z = false;
            }
            C03J8.LIZ(view2, z);
        }
        C426750GoL.LJIIL(this.itemView, null, Integer.valueOf(C0H9H.LIZIZ(8)), null, Integer.valueOf(C0H9H.LIZIZ(8)), 21);
        C127K c127k = (C127K) this.itemView;
        c127k.setTitle(c1745680vWo.LIZ.title);
        c127k.setSubtitle(c1745680vWo.LIZ.hint);
        C127A c127a = (C127A) c127k.getAccessory();
        c127a.LJIILLIIL(null);
        Object obj = c1745680vWo.LIZIZ;
        if (!(obj instanceof String)) {
            obj = null;
        }
        c127a.LJIILJJIL(Intrinsics.LJFF(obj, "1"));
        if (a6().LLLLIILL) {
            a6().LLIZLLLIL = Boolean.valueOf(c127a.LJIILIIL());
            C1745480vWU.LJFF(a6().LLJJIJIL, "default_PUDO_address", null, null, 6);
        }
        c127a.LJIILLIIL(new C1775870wJV(c127a, c1745680vWo, this, 1));
        if (!c1745680vWo.LJFF) {
            C786410Ut5.Y7((ConstraintLayout) this.itemView.findViewById(R.id.dlh), null);
            C786410Ut5.I7(new AjS70S0100000_26(this, 92), this.itemView.findViewById(R.id.dlh));
            ((C127K) this.itemView).setCellEnabled(false);
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.address.edit.viewholder.BaseViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public final /* bridge */ /* synthetic */ void rr(Object obj) {
        rr((C1745680vWo) obj);
    }

    public USSwitchInputItemVH(int i, ViewGroup viewGroup) {
        super(C992303uL.LIZ(viewGroup.getContext(), R.layout.b0l, viewGroup));
        this.LLJILJILJ = i;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(AddressEditViewModel.class);
        this.LLJILLL = C452501pT.LIZIZ(new AwS270S0300000_26(this, c19719912DlLIZ, c19719912DlLIZ, 137));
    }
}
