package com.ss.android.ugc.aweme.ecommerce.base.address.list;

import X.C01GW;
import X.C03IW;
import X.C03J8;
import X.C10516049i;
import X.C1308910kAL;
import X.C1748720vbi;
import X.C452501pT;
import X.C786410Ut5;
import X.C972603rA;
import X.C972803rC;
import X.C972903rD;
import X.InterfaceC1631620sYq;
import X.InterfaceC972703rB;
import X.InterfaceC975703rf;
import Y.ARunnableS10S0400000_1;
import android.view.View;
import android.widget.LinearLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.ShippingAddressRichInfo;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.ReachableAddress;
import com.ss.android.ugc.aweme.ecommerce.event.monitor.IPageNodeMonitorService;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichTextExtraInfo;
import com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.zhiliaoapp.musically.R;
import g1c.AjS20S0300000_1;
import g1c.AjS7S0400000_1;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS100S0400000_1;
import kotlin.jvm.internal.AwS10S1210000_1;
import kotlin.jvm.internal.AwS545S0100000_1;
import kotlin.jvm.internal.AwS56S0210000_1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class AddressAdapter$AddressViewHolder extends ECJediViewHolder<ReachableAddress> implements InterfaceC972703rB {
    public final /* synthetic */ C972803rC LLJILJIL;
    public final int LLJILJILJ;
    public final Function0<? extends InterfaceC975703rf> LLJILLL;
    public LinearLayout LLJJ;
    public final C01GW LLJJI;

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

    public final InterfaceC975703rf W5() {
        return (InterfaceC975703rf) this.LLJJI.getValue();
    }

    public final boolean X5() {
        if (Intrinsics.LJFF(W5().l81(), Boolean.TRUE)) {
            return false;
        }
        return W5().xW();
    }

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public final void rr(Object obj) {
        boolean z;
        int i;
        ReachableAddress reachableAddress = (ReachableAddress) obj;
        View view = this.itemView;
        boolean zBooleanValue = false;
        if (this.LLJI != this.LLJILJILJ - 1) {
            z = true;
        } else {
            z = false;
        }
        C03J8.LIZ(view, z);
        View viewFindViewById = this.LLJJ;
        if (viewFindViewById == null) {
            View view2 = this.itemView;
            if (view2 != null) {
                viewFindViewById = view2.findViewById(R.id.fk8);
            } else {
                viewFindViewById = null;
            }
            this.LLJJ = (LinearLayout) viewFindViewById;
        }
        LinearLayout linearLayout = (LinearLayout) viewFindViewById;
        if (linearLayout != null) {
            C786410Ut5.LJJJJJL(linearLayout);
        }
        C972903rD c972903rD = (C972903rD) this.itemView;
        c972903rD.setUiMode("show_all");
        c972903rD.setHasPrefix(false);
        if (!W5().d41() && !X5()) {
            i = 1;
        } else {
            i = 3;
        }
        c972903rD.setSuffixType(i);
        if (W5().PY0()) {
            Boolean bool = reachableAddress.reachable;
            if (bool != null) {
                zBooleanValue = bool.booleanValue();
            }
        } else {
            zBooleanValue = true;
        }
        c972903rD.setReachable(zBooleanValue);
        c972903rD.getHintTextFromXml().setText(reachableAddress.invalidHintMessage);
        Integer num = reachableAddress.hintMessageStyle;
        if (num != null && num.intValue() == 1) {
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1j, c972903rD.getContext());
            if (numLIZJ != null) {
                c972903rD.getHintTextFromXml().setTextColor(numLIZJ.intValue());
            }
            c972903rD.getHintTextFromXml().setBackground(c972903rD.getContext().getDrawable(R.drawable.b3q));
        } else {
            c972903rD.getHintTextFromXml().setBackground(c972903rD.getContext().getDrawable(R.drawable.b2c));
            Integer numLIZJ2 = C1308910kAL.LIZJ(C03IW.LLILZ.LIZLLL, c972903rD.getContext());
            if (numLIZJ2 != null) {
                c972903rD.getHintTextFromXml().setTextColor(numLIZJ2.intValue());
            }
        }
        c972903rD.setHintText(reachableAddress.invalidHintMessage);
        c972903rD.setPaddingVertical(22);
        Address address = reachableAddress.address;
        if (address != null) {
            W5().ml(new AwS100S0400000_1(address, this, reachableAddress, c972903rD, 16));
            a6(c972903rD.getReachable(), c972903rD, address, null);
            c972903rD.setDefault(address.LJII());
            if (W5().xW()) {
                c972903rD.setUnavailable(!c972903rD.getReachable());
            }
            if (!W5().d41() && !X5()) {
                if (c972903rD.getReachable()) {
                    if (W5().vj2()) {
                        C786410Ut5.I7(new AjS20S0300000_1(this, address, reachableAddress, 30), c972903rD);
                    } else {
                        C786410Ut5.I7(new AjS7S0400000_1(address, this, reachableAddress, c972903rD, 8), c972903rD);
                    }
                }
                C786410Ut5.I7(new AjS7S0400000_1(address, this, reachableAddress, c972903rD, 9), c972903rD.getEditFromXml());
            } else {
                if (W5().d41()) {
                    C786410Ut5.I7(new AjS20S0300000_1(this, address, reachableAddress, 29), c972903rD);
                }
                if (X5()) {
                    C786410Ut5.I7(new AjS7S0400000_1(address, this, reachableAddress, c972903rD, 7), c972903rD);
                }
            }
            HandlerHook.viewPost(this.itemView, new ARunnableS10S0400000_1(this, address, reachableAddress, c972903rD, 1));
        }
    }

    public AddressAdapter$AddressViewHolder(C972903rD c972903rD, int i, AwS545S0100000_1 awS545S0100000_1) {
        super(c972903rD);
        this.LLJILJIL = new C972803rC();
        this.LLJILJILJ = i;
        this.LLJILLL = awS545S0100000_1;
        this.LLJJI = C452501pT.LIZIZ(new AwS545S0100000_1(this, 1565));
    }

    public final void b6(boolean z, String str, ReachableAddress reachableAddress) {
        ((IPageNodeMonitorService) ServiceManager.get().getService(IPageNodeMonitorService.class)).LJIIIZ("shipping_address");
        if (W5().xW()) {
            C1748720vbi.LIZLLL(this.itemView, new C10516049i(), new AwS56S0210000_1(reachableAddress, z, this, 3));
        } else {
            C1748720vbi.LIZLLL(this.itemView, new C10516049i(), new AwS10S1210000_1(reachableAddress, z, this, str, 0));
        }
    }

    public final void a6(boolean z, View view, Address address, InterfaceC1631620sYq<? super View, ? super String, ? super ECRichTextExtraInfo, Unit> interfaceC1631620sYq) {
        C972803rC c972803rC = this.LLJILJIL;
        c972803rC.getClass();
        C972603rA.LIZ(c972803rC, z, view, address, interfaceC1631620sYq);
    }
}
