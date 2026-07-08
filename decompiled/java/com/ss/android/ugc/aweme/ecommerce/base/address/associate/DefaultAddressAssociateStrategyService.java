package com.ss.android.ugc.aweme.ecommerce.base.address.associate;

import X.AbstractC1002403vy;
import X.AbstractC1003203w6;
import X.AbstractC1746380vXw;
import X.C040C;
import X.C19465311Dn;
import X.EnumC969503qf;
import X.InterfaceC1002303vx;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import java.util.List;

/* JADX INFO: loaded from: classes27.dex */
@C040C(name = "suggested_address_list")
public final class DefaultAddressAssociateStrategyService extends AbstractC1003203w6<AddressAssociateViewModel> {
    @Override // com.ss.android.ugc.aweme.ecommerce.core.engine.IComponentStrategyService
    public final void LJ(AbstractC1746380vXw abstractC1746380vXw, C19465311Dn c19465311Dn) {
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.core.engine.IComponentStrategyService
    public final ViewModel LIZIZ() {
        return new AddressAssociateViewModel();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.core.engine.IComponentStrategyService
    public final EnumC969503qf getType() {
        return EnumC969503qf.DEFAULT;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.core.engine.IComponentStrategyService
    public final InterfaceC1002303vx<AddressAssociateViewModel> LIZJ(final LifecycleOwner lifecycleOwner) {
        return new AbstractC1002403vy<AddressAssociateViewModel>(lifecycleOwner) { // from class: X.0vXr
            @Override // X.AbstractC1002403vy
            public final /* bridge */ /* synthetic */ void LIZJ(Fragment fragment, C19EG c19eg, ViewModel viewModel, List list) {
            }
        };
    }
}
