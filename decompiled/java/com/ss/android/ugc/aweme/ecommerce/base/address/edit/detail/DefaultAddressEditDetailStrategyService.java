package com.ss.android.ugc.aweme.ecommerce.base.address.edit.detail;

import X.AbstractC1002403vy;
import X.AbstractC1003203w6;
import X.AbstractC1746380vXw;
import X.C040C;
import X.C04CH;
import X.C1746190vXd;
import X.C19465311Dn;
import X.EnumC969503qf;
import X.InterfaceC1002303vx;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import kotlin.jvm.internal.AFwS268S0000000_26;
import kotlin.jvm.internal.AwS392S0200000_26;
import kotlin.jvm.internal.AwS580S0100000_1;
import kotlin.jvm.internal.AwS605S0100000_26;

/* JADX INFO: loaded from: classes27.dex */
@C040C(name = "add_address_and_detail")
public class DefaultAddressEditDetailStrategyService extends AbstractC1003203w6<AddressEditDetailViewModel> {
    @Override // com.ss.android.ugc.aweme.ecommerce.core.engine.IComponentStrategyService
    public final ViewModel LIZIZ() {
        return new AddressEditDetailViewModel();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.core.engine.IComponentStrategyService
    public final EnumC969503qf getType() {
        return EnumC969503qf.DEFAULT;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.core.engine.IComponentStrategyService
    public final InterfaceC1002303vx<AddressEditDetailViewModel> LIZJ(final LifecycleOwner lifecycleOwner) {
        return new AbstractC1002403vy<AddressEditDetailViewModel>(lifecycleOwner) { // from class: X.0vXe
        };
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.core.engine.IComponentStrategyService
    public final void LJ(AbstractC1746380vXw abstractC1746380vXw, C19465311Dn c19465311Dn) {
        if (!(abstractC1746380vXw instanceof C1746190vXd)) {
            return;
        }
        new C04CH("AddressEditDetailStrategyService").LIZJ(false);
        c19465311Dn.LJFF(new AwS392S0200000_26(this, (DefaultAddressEditDetailStrategyService) abstractC1746380vXw, (AbstractC1746380vXw<Object>) 264), new AwS605S0100000_26(abstractC1746380vXw, (AbstractC1746380vXw<Object>) 929), null);
        c19465311Dn.LJFF(new AwS580S0100000_1(abstractC1746380vXw, (AbstractC1746380vXw<Object>) 1114), AFwS268S0000000_26.get$arr$(774), null);
    }
}
