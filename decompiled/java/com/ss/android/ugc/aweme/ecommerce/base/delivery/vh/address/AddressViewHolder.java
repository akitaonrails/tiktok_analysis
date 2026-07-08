package com.ss.android.ugc.aweme.ecommerce.base.delivery.vh.address;

import X.C01GW;
import X.C03J8;
import X.C11EA;
import X.C13LE;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C452501pT;
import X.C786410Ut5;
import X.C972603rA;
import X.C972803rC;
import X.C972903rD;
import X.InterfaceC1631620sYq;
import X.InterfaceC972703rB;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.jedi.arch.JediViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.ShippingAddressRichInfo;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.page.address.AddressSelectState;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.page.address.AddressSelectViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.ReachableAddress;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichTextExtraInfo;
import com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder;
import g1c.AjS40S0200000_1;
import kotlin.Unit;
import kotlin.jvm.internal.AwS270S0300000_26;
import kotlin.jvm.internal.AwS471S0200000_1;

/* JADX INFO: loaded from: classes2.dex */
public final class AddressViewHolder extends ECJediViewHolder<ReachableAddress> implements InterfaceC972703rB {
    public final /* synthetic */ C972803rC LLJILJIL;
    public final int LLJILJILJ;
    public final C01GW LLJILLL;

    @Override // X.InterfaceC972703rB
    public final void LLLLLLLLL(boolean z, View view, Address address) {
        this.LLJILJIL.LLLLLLLLL(z, view, address);
    }

    @Override // X.InterfaceC972703rB
    public final void X3(boolean z, View view, ShippingAddressRichInfo shippingAddressRichInfo, InterfaceC1631620sYq<? super View, ? super String, ? super ECRichTextExtraInfo, Unit> interfaceC1631620sYq) {
        this.LLJILJIL.X3(z, view, shippingAddressRichInfo, interfaceC1631620sYq);
    }

    @Override // com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public final void rr(Object obj) {
        boolean zBooleanValue;
        ReachableAddress reachableAddress = (ReachableAddress) obj;
        View view = this.itemView;
        boolean z = true;
        boolean zBooleanValue2 = false;
        if (this.LLILLL == this.LLJILJILJ - 1) {
            z = false;
        }
        C03J8.LIZ(view, z);
        C972903rD c972903rD = (C972903rD) this.itemView;
        c972903rD.setHasPrefix(false);
        Boolean bool = reachableAddress.reachable;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            zBooleanValue = false;
        }
        c972903rD.setReachable(zBooleanValue);
        c972903rD.setSuffixType(3);
        Address address = reachableAddress.address;
        if (address != null) {
            W5(c972903rD.getReachable(), c972903rD, address, null);
            C786410Ut5.I7(new AjS40S0200000_1(this, reachableAddress, 4), c972903rD);
            Boolean bool2 = reachableAddress.reachable;
            if (bool2 != null) {
                zBooleanValue2 = bool2.booleanValue();
            }
            c972903rD.setClickable(zBooleanValue2);
            C11EA.LJIIIIZZ(this, (JediViewModel) this.LLJILLL.getValue(), new C2217381BqS() { // from class: X.03qt
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj2) {
                    return ((AddressSelectState) obj2).getSelectedAddress();
                }
            }, new C2217381BqS() { // from class: X.03r6
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj2) {
                    return Integer.valueOf(((AddressSelectState) obj2).getCurrentAddressSelectType());
                }
            }, new AwS471S0200000_1(c972903rD, address, 0));
        }
    }

    public AddressViewHolder(int i, ViewGroup viewGroup) {
        super(new C972903rD(viewGroup.getContext()));
        this.LLJILJIL = new C972803rC();
        this.LLJILJILJ = i;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(AddressSelectViewModel.class);
        this.LLJILLL = C452501pT.LIZIZ(new AwS270S0300000_26(this, c19719912DlLIZ, c19719912DlLIZ, 4));
    }

    public final void W5(boolean z, View view, Address address, InterfaceC1631620sYq<? super View, ? super String, ? super ECRichTextExtraInfo, Unit> interfaceC1631620sYq) {
        C972803rC c972803rC = this.LLJILJIL;
        c972803rC.getClass();
        C972603rA.LIZ(c972803rC, z, view, address, interfaceC1631620sYq);
    }
}
