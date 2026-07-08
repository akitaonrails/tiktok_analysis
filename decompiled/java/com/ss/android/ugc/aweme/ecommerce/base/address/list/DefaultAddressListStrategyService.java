package com.ss.android.ugc.aweme.ecommerce.base.address.list;

import X.AbstractC1003203w6;
import X.AbstractC1746380vXw;
import X.C040C;
import X.C04JV;
import X.C1002803w2;
import X.C19465311Dn;
import X.EnumC969503qf;
import X.InterfaceC1002303vx;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

/* JADX INFO: loaded from: classes2.dex */
@C040C(name = "shipping_info")
public class DefaultAddressListStrategyService extends AbstractC1003203w6<ViewModel> {
    @Override // com.ss.android.ugc.aweme.ecommerce.core.engine.IComponentStrategyService
    public void LJ(AbstractC1746380vXw abstractC1746380vXw, C19465311Dn c19465311Dn) {
    }

    @Override // X.AbstractC1003203w6, com.ss.android.ugc.aweme.ecommerce.core.engine.IComponentStrategyService
    public ViewModelProvider.Factory LIZ() {
        return new C04JV(0);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.core.engine.IComponentStrategyService
    public ViewModel LIZIZ() {
        return new AddressListViewModel();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.core.engine.IComponentStrategyService
    public EnumC969503qf getType() {
        return EnumC969503qf.DEFAULT;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.core.engine.IComponentStrategyService
    public InterfaceC1002303vx<ViewModel> LIZJ(LifecycleOwner lifecycleOwner) {
        return new C1002803w2(lifecycleOwner);
    }

    @Override // X.AbstractC1003203w6, com.ss.android.ugc.aweme.ecommerce.core.engine.IComponentStrategyService
    public void LIZLLL(ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv) {
        viewOnAttachStateChangeListenerC20604515jv.LJIILJJIL(AddressCell.class, AddAddressBarCell.class);
    }
}
