package com.ss.android.ugc.aweme.ecommerce.base.address.edit.viewholder;

import X.C01GW;
import X.C11EA;
import X.C13LE;
import X.C1743750vTh;
import X.C1745300vWC;
import X.C1745480vWU;
import X.C1745680vWo;
import X.C19719912Dl;
import X.C2217371BqR;
import X.C452501pT;
import X.C770702zh;
import X.C992303uL;
import X.InterfaceC420801kM;
import X.InterfaceC998610c5r;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.jedi.arch.JediViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.address.candinput.CandHelper;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditFragment;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditState;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel;
import com.zhiliaoapp.musically.R;
import eha.a0;
import kotlin.jvm.internal.AwS270S0300000_26;
import kotlin.jvm.internal.AwS640S0100000_26;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class TextInputItemViewHolder extends BaseViewHolder implements InterfaceC998610c5r {
    public final AddressEditFragment LLJILJILJ;
    public final C01GW LLJILLL;
    public a0 LLJJ;
    public InterfaceC420801kM LLJJI;

    @Override // com.ss.android.ugc.aweme.ecommerce.base.address.edit.viewholder.BaseViewHolder, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // X.InterfaceC998610c5r
    public final View l() {
        a0 a0Var = this.LLJJ;
        if (a0Var != null) {
            return a0Var.l();
        }
        return null;
    }

    @Override // X.InterfaceC998610c5r
    public final boolean w2() {
        a0 a0Var = this.LLJJ;
        if (a0Var != null) {
            return a0Var.w2();
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder
    public final void onDestroy() {
        C1743750vTh.LIZ(this);
        a0 a0Var = this.LLJJ;
        if (a0Var != null) {
            CandHelper candHelper = a0Var.LLILZLL;
            PopupWindow popupWindow = candHelper.LIZJ;
            if (popupWindow == null) {
                popupWindow = null;
            }
            popupWindow.dismiss();
            candHelper.LJIILIIL.removeMessages(1);
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.address.edit.viewholder.BaseViewHolder
    /* JADX INFO: renamed from: W5 */
    public final void rr(C1745680vWo c1745680vWo) {
        super.rr(c1745680vWo);
        if (this.LLJJ == null) {
            this.LLJJ = new a0((C1745300vWC) this.itemView, this.LLJILJILJ, (AddressEditViewModel) this.LLJILLL.getValue(), false);
        }
        InterfaceC420801kM interfaceC420801kM = this.LLJJI;
        if (interfaceC420801kM != null) {
            interfaceC420801kM.dispose();
        }
        this.LLJJI = null;
        if (C770702zh.LIZIZ(c1745680vWo.LIZIZ())) {
            this.LLJJI = C11EA.LJII(this, (JediViewModel) this.LLJILLL.getValue(), new C2217371BqR() { // from class: X.0vW2
                @Override // X.C2217371BqR, X.AbstractC2217331BqN, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return Boolean.valueOf(((AddressEditState) obj).isDontKnowZipCode());
                }

                @Override // X.C2217371BqR, X.AbstractC2217331BqN
                public final void set(Object obj, Object obj2) {
                    ((AddressEditState) obj).setDontKnowZipCode(((Boolean) obj2).booleanValue());
                }
            }, new AwS640S0100000_26(this, 86));
        }
        a0 a0Var = this.LLJJ;
        if (a0Var != null) {
            a0Var.LIZJ(c1745680vWo);
        }
        X5();
        if (!c1745680vWo.LJII) {
            if (Intrinsics.LJFF(c1745680vWo.LIZ.key, "address") || Intrinsics.LJFF(c1745680vWo.LIZ.key, "address_detail")) {
                C1745480vWU c1745480vWU = ((AddressEditViewModel) this.LLJILLL.getValue()).LLJJIJIL;
                String str = c1745680vWo.LIZ.key;
                if (str == null) {
                    str = "";
                }
                c1745480vWU.LJIIIZ(str, ((AddressEditViewModel) this.LLJILLL.getValue()).LLJJIJIIJIL, null);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.address.edit.viewholder.BaseViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public final /* bridge */ /* synthetic */ void rr(Object obj) {
        rr((C1745680vWo) obj);
    }

    public TextInputItemViewHolder(ViewGroup viewGroup, AddressEditFragment addressEditFragment) {
        super(C992303uL.LIZ(viewGroup.getContext(), R.layout.ajh, viewGroup));
        this.LLJILJILJ = addressEditFragment;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(AddressEditViewModel.class);
        this.LLJILLL = C452501pT.LIZIZ(new AwS270S0300000_26(this, c19719912DlLIZ, c19719912DlLIZ, 28));
    }
}
