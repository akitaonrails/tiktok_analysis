package com.ss.android.ugc.aweme.ecommerce.tts.addressedit.us.vh;

import X.C01GW;
import X.C049X;
import X.C1397760mTe;
import X.C13LE;
import X.C1745680vWo;
import X.C1748720vbi;
import X.C1748730vbj;
import X.C19719912Dl;
import X.C20094413jq;
import X.C452501pT;
import X.C786410Ut5;
import X.C992303uL;
import X.EnumC1397840mTm;
import X.EnumC1746650vYN;
import X.InterfaceC1748810vbr;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel;
import com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder;
import com.zhiliaoapp.musically.R;
import g1c.AjS70S0100000_26;
import kotlin.jvm.internal.AwS270S0300000_26;
import kotlin.jvm.internal.AwS605S0100000_26;
import u4.q0;

/* JADX INFO: loaded from: classes27.dex */
public final class USDeleteButtonViewHolder extends ECJediViewHolder<C1745680vWo> {
    public LinearLayoutCompat LLJILJIL;
    public boolean LLJILJILJ;
    public final C01GW LLJILLL;

    @Override // com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final LinearLayoutCompat W5() {
        View viewFindViewById = this.LLJILJIL;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.fkn) : null;
            this.LLJILJIL = (LinearLayoutCompat) viewFindViewById;
        }
        return (LinearLayoutCompat) viewFindViewById;
    }

    public final AddressEditViewModel X5() {
        return (AddressEditViewModel) this.LLJILLL.getValue();
    }

    public USDeleteButtonViewHolder(ViewGroup viewGroup) {
        super(C992303uL.LIZ(viewGroup.getContext(), R.layout.aie, viewGroup));
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(AddressEditViewModel.class);
        this.LLJILLL = C452501pT.LIZIZ(new AwS270S0300000_26(this, c19719912DlLIZ, c19719912DlLIZ, 136));
    }

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public final void rr(Object obj) {
        if (X5().LLLLL == EnumC1746650vYN.EDIT) {
            LinearLayoutCompat linearLayoutCompatW5 = W5();
            if (linearLayoutCompatW5 != null) {
                linearLayoutCompatW5.setContentDescription(this.itemView.getContext().getString(2131832680));
            }
            int i = C20094413jq.LJIIZILJ;
            LinearLayoutCompat linearLayoutCompatW52 = W5();
            C1397760mTe c1397760mTe = new C1397760mTe();
            String name = Button.class.getName();
            c1397760mTe.LIZIZ = EnumC1397840mTm.NONE;
            c1397760mTe.LIZJ = name;
            q0.LJIJ(linearLayoutCompatW52, c1397760mTe.LIZ());
            if (!this.LLJILJILJ) {
                this.LLJILJILJ = true;
                InterfaceC1748810vbr interfaceC1748810vbrLIZ = C1748730vbj.LIZ(this.itemView);
                if (interfaceC1748810vbrLIZ != null) {
                    C1748720vbi.LIZIZ(interfaceC1748810vbrLIZ, new C049X(), new AwS605S0100000_26(this, 760));
                }
            }
            C786410Ut5.I7(new AjS70S0100000_26(this, 91), W5());
        }
    }
}
