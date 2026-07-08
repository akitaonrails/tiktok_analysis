package com.ss.android.ugc.aweme.ecommerce.tts.addresslist.us.addressitem;

import X.C01GW;
import X.C452501pT;
import X.C803003Bs;
import X.C972603rA;
import X.C974903rX;
import X.InterfaceC1631620sYq;
import X.InterfaceC972703rB;
import X.InterfaceC975703rf;
import android.view.View;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.ShippingAddressRichInfo;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichTextExtraInfo;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS545S0100000_1;

/* JADX INFO: loaded from: classes2.dex */
public final class UsAddressItemVH extends ECJediViewHolder<C974903rX> implements InterfaceC972703rB {
    public final /* synthetic */ C803003Bs LLJILJIL;
    public final Function0<? extends InterfaceC975703rf> LLJILJILJ;
    public LinearLayout LLJILLL;
    public ConstraintLayout LLJJ;
    public TuxIconView LLJJI;
    public TuxTextView LLJJIII;
    public LinearLayout LLJJIJI;
    public final C01GW LLJJIJIIJIL;

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

    public final LinearLayout W5() {
        View viewFindViewById = this.LLJJIJI;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.ah6) : null;
            this.LLJJIJI = (LinearLayout) viewFindViewById;
        }
        return (LinearLayout) viewFindViewById;
    }

    public final ConstraintLayout X5() {
        View viewFindViewById = this.LLJJ;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.ah5) : null;
            this.LLJJ = (ConstraintLayout) viewFindViewById;
        }
        return (ConstraintLayout) viewFindViewById;
    }

    public final TuxIconView a6() {
        View viewFindViewById = this.LLJJI;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.ah7) : null;
            this.LLJJI = (TuxIconView) viewFindViewById;
        }
        return (TuxIconView) viewFindViewById;
    }

    public final InterfaceC975703rf b6() {
        return (InterfaceC975703rf) this.LLJJIJIIJIL.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:76:0x01c4  */
    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void rr(java.lang.Object r26) {
        /*
            Method dump skipped, instruction units count: 1072
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.tts.addresslist.us.addressitem.UsAddressItemVH.rr(java.lang.Object):void");
    }

    public UsAddressItemVH(View view, AwS545S0100000_1 awS545S0100000_1) {
        super(view);
        this.LLJILJIL = new C803003Bs();
        this.LLJILJILJ = awS545S0100000_1;
        this.LLJJIJIIJIL = C452501pT.LIZIZ(new AwS545S0100000_1(this, 1736));
    }

    public final void d6(boolean z, View view, Address address, InterfaceC1631620sYq<? super View, ? super String, ? super ECRichTextExtraInfo, Unit> interfaceC1631620sYq) {
        C803003Bs c803003Bs = this.LLJILJIL;
        c803003Bs.getClass();
        C972603rA.LIZ(c803003Bs, z, view, address, interfaceC1631620sYq);
    }

    public static void c6(LaneParams laneParams, int i, boolean z, int i2, boolean z2, boolean z3, String str) {
        laneParams.plusAssign("module_name", "address");
        laneParams.plusAssign("is_default", Integer.valueOf(z ? 1 : 0));
        laneParams.plusAssign("rank", Integer.valueOf(i2));
        laneParams.plusAssign("is_address_deliverable", Integer.valueOf(z3 ? 1 : 0));
        laneParams.plusAssign("is_selected", Integer.valueOf(z2 ? 1 : 0));
        laneParams.plusAssign("is_valid", Integer.valueOf(i));
        laneParams.plusAssign("invalid_reason_code", str);
    }
}
