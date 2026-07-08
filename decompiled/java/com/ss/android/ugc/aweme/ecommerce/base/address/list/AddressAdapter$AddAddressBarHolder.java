package com.ss.android.ugc.aweme.ecommerce.base.address.list;

import X.C0136002c;
import X.C01GW;
import X.C03J8;
import X.C049X;
import X.C1397760mTe;
import X.C1748720vbi;
import X.C1748730vbj;
import X.C20094413jq;
import X.C20094813ju;
import X.C427690Gpr;
import X.C452501pT;
import X.C786410Ut5;
import X.EnumC1397840mTm;
import X.InterfaceC1748810vbr;
import X.InterfaceC975703rf;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder;
import g1c.AjS60S0100000_1;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS228S0000000_1;
import kotlin.jvm.internal.AwS545S0100000_1;

/* JADX INFO: loaded from: classes2.dex */
public final class AddressAdapter$AddAddressBarHolder extends ECJediViewHolder<C0136002c> {
    public final int LLJILJIL;
    public final Function0<? extends InterfaceC975703rf> LLJILJILJ;
    public boolean LLJILLL;
    public final C01GW LLJJ;

    @Override // com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.jedi.ext.adapter.JediViewHolder
    public final void onCreate() {
        C427690Gpr.LJ(this.itemView, 0.0f);
    }

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public final void rr(Object obj) {
        boolean z;
        int i = C20094413jq.LJIIZILJ;
        View view = this.itemView;
        C1397760mTe c1397760mTe = new C1397760mTe();
        c1397760mTe.LIZIZ = EnumC1397840mTm.BUTTON;
        c1397760mTe.LIZJ = null;
        C20094813ju.LIZ(view, c1397760mTe.LIZ());
        View view2 = this.itemView;
        if (this.LLJI != this.LLJILJIL - 1) {
            z = true;
        } else {
            z = false;
        }
        C03J8.LIZ(view2, z);
        if (!this.LLJILLL) {
            this.LLJILLL = true;
            InterfaceC1748810vbr interfaceC1748810vbrLIZ = C1748730vbj.LIZ(this.itemView);
            if (interfaceC1748810vbrLIZ != null) {
                C1748720vbi.LIZIZ(interfaceC1748810vbrLIZ, new C049X(), AFwS228S0000000_1.get$arr$(575));
            }
        }
        C786410Ut5.I7(new AjS60S0100000_1(this, 71), this.itemView);
    }

    public AddressAdapter$AddAddressBarHolder(View view, int i, AwS545S0100000_1 awS545S0100000_1) {
        super(view);
        this.LLJILJIL = i;
        this.LLJILJILJ = awS545S0100000_1;
        this.LLJJ = C452501pT.LIZIZ(new AwS545S0100000_1(this, 1560));
    }
}
