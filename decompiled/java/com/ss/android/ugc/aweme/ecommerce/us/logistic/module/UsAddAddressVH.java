package com.ss.android.ugc.aweme.ecommerce.us.logistic.module;

import X.C01GW;
import X.C049X;
import X.C13LE;
import X.C1748720vbi;
import X.C1748730vbj;
import X.C19719912Dl;
import X.C452501pT;
import X.C786410Ut5;
import X.C970803qs;
import X.InterfaceC1748810vbr;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.page.address.AddressSelectViewModel;
import com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder;
import g1c.AjS60S0100000_1;
import kotlin.jvm.internal.AFwS228S0000000_1;
import kotlin.jvm.internal.AwS270S0300000_26;

/* JADX INFO: loaded from: classes2.dex */
public final class UsAddAddressVH extends ECJediViewHolder<C970803qs> {
    public final C01GW LLJILJIL;
    public boolean LLJILJILJ;

    @Override // com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public UsAddAddressVH(View view) {
        super(view);
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(AddressSelectViewModel.class);
        this.LLJILJIL = C452501pT.LIZIZ(new AwS270S0300000_26(this, c19719912DlLIZ, c19719912DlLIZ, 86));
    }

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public final void rr(Object obj) {
        if (!this.LLJILJILJ) {
            this.LLJILJILJ = true;
            InterfaceC1748810vbr interfaceC1748810vbrLIZ = C1748730vbj.LIZ(this.itemView);
            if (interfaceC1748810vbrLIZ != null) {
                C1748720vbi.LIZIZ(interfaceC1748810vbrLIZ, new C049X(), AFwS228S0000000_1.get$arr$(855));
            }
        }
        C786410Ut5.I7(new AjS60S0100000_1(this, 135), this.itemView);
    }
}
