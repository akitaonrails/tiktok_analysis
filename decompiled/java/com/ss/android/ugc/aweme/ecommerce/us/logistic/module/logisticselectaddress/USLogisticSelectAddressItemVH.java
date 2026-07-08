package com.ss.android.ugc.aweme.ecommerce.us.logistic.module.logisticselectaddress;

import X.C01GW;
import X.C03IW;
import X.C03IZ;
import X.C0H1U;
import X.C11EA;
import X.C12ES;
import X.C13LE;
import X.C1841350y17;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C452501pT;
import X.C786410Ut5;
import X.C803003Bs;
import X.C972603rA;
import X.InterfaceC1631620sYq;
import X.InterfaceC972703rB;
import Y.ARunnableS3S0310000_1;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.jedi.arch.JediViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.ShippingAddressRichInfo;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.page.address.AddressSelectState;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.page.address.AddressSelectViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.ReachableAddress;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichTextExtraInfo;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder;
import com.zhiliaoapp.musically.R;
import g1c.AjS1S0310000_1;
import kotlin.Unit;
import kotlin.jvm.internal.AwS270S0300000_26;
import kotlin.jvm.internal.AwS650S0100000_1;

/* JADX INFO: loaded from: classes2.dex */
public final class USLogisticSelectAddressItemVH extends ECJediViewHolder<ReachableAddress> implements InterfaceC972703rB {
    public static final /* synthetic */ int LLJILLL = 0;
    public final /* synthetic */ C803003Bs LLJILJIL;
    public final C01GW LLJILJILJ;

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

    public USLogisticSelectAddressItemVH(ViewGroup viewGroup) {
        super(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.b0m, viewGroup, false));
        this.LLJILJIL = new C803003Bs();
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(AddressSelectViewModel.class);
        this.LLJILJILJ = C452501pT.LIZIZ(new AwS270S0300000_26(this, c19719912DlLIZ, c19719912DlLIZ, 89));
    }

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public final void rr(Object obj) {
        boolean zBooleanValue;
        ReachableAddress reachableAddress = (ReachableAddress) obj;
        Drawable background = this.itemView.findViewById(R.id.fj0).getBackground();
        if (background != null) {
            background.setAlpha(255);
        }
        Address address = reachableAddress.address;
        if (address != null) {
            Boolean bool = reachableAddress.reachable;
            int i = 0;
            if (bool != null) {
                zBooleanValue = bool.booleanValue();
            } else {
                zBooleanValue = false;
            }
            this.itemView.setClickable(zBooleanValue);
            C0H1U.LIZIZ(this.itemView.findViewById(R.id.b8t));
            C12ES.LJIILL(0, this.itemView.findViewById(R.id.goi));
            C12ES.LJIILL(0, this.itemView.findViewById(R.id.sp_));
            ((C1841350y17) this.itemView.findViewById(R.id.sp_)).setChecked(reachableAddress.isSelect);
            View viewFindViewById = this.itemView.findViewById(R.id.fj0);
            if (!address.LJII()) {
                i = 8;
            }
            C786410Ut5.LJLLLLLL(i, viewFindViewById);
            X5(zBooleanValue, this.itemView, address, null);
            C03IW c03iw = (C03IW) this.itemView.findViewById(R.id.hce);
            c03iw.setStyle(C03IZ.LIZ(reachableAddress.hintMessageStyle));
            c03iw.setMsg(reachableAddress.invalidHintMessage);
            C786410Ut5.I7(new AjS1S0310000_1(this, zBooleanValue, address, reachableAddress, 1), this.itemView.findViewById(R.id.goi));
            C786410Ut5.I7(new AjS1S0310000_1(this, zBooleanValue, address, reachableAddress, 2), this.itemView);
            C11EA.LJIIIIZZ(this, (JediViewModel) this.LLJILJILJ.getValue(), new C2217381BqS() { // from class: X.03qu
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj2) {
                    return ((AddressSelectState) obj2).getSelectedAddress();
                }
            }, new C2217381BqS() { // from class: X.03r9
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj2) {
                    return Integer.valueOf(((AddressSelectState) obj2).getCurrentAddressSelectType());
                }
            }, new AwS650S0100000_1(address, 38));
            HandlerHook.viewPost(this.itemView, new ARunnableS3S0310000_1(address, reachableAddress, this, zBooleanValue, 1));
        }
    }

    public final void X5(boolean z, View view, Address address, InterfaceC1631620sYq<? super View, ? super String, ? super ECRichTextExtraInfo, Unit> interfaceC1631620sYq) {
        C803003Bs c803003Bs = this.LLJILJIL;
        c803003Bs.getClass();
        C972603rA.LIZ(c803003Bs, z, view, address, interfaceC1631620sYq);
    }

    public static void W5(LaneParams laneParams, boolean z, boolean z2, int i, boolean z3, boolean z4) {
        laneParams.plusAssign("module_name", "address");
        laneParams.plusAssign("is_default", String.valueOf(z2 ? 1 : 0));
        laneParams.plusAssign("is_valid", String.valueOf(z ? 1 : 0));
        laneParams.plusAssign("rank", Integer.valueOf(i));
        laneParams.plusAssign("is_address_deliverable", String.valueOf(z4 ? 1 : 0));
        laneParams.plusAssign("is_selected", String.valueOf(z3 ? 1 : 0));
    }
}
