package com.ss.android.ugc.aweme.ecommerce.us.logistic.engine;

import X.AbstractC1746380vXw;
import X.C040C;
import X.C19465311Dn;
import X.C969003qa;
import X.EnumC969503qf;
import androidx.lifecycle.ViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.engine.address.DefaultAddressSelectStrategyService;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.page.address.AddressSelectViewModel;
import com.ss.android.ugc.aweme.ecommerce.us.logistic.vm.USAddressSelectViewModel;
import kotlin.jvm.internal.AFwS228S0000000_1;
import kotlin.jvm.internal.AwS580S0100000_1;

/* JADX INFO: loaded from: classes2.dex */
@C040C(name = "logistics_address")
public final class USAddressSelectStrategyService extends DefaultAddressSelectStrategyService {
    @Override // com.ss.android.ugc.aweme.ecommerce.base.delivery.engine.address.DefaultAddressSelectStrategyService, com.ss.android.ugc.aweme.ecommerce.core.engine.IComponentStrategyService
    public final ViewModel LIZIZ() {
        return new USAddressSelectViewModel();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.delivery.engine.address.DefaultAddressSelectStrategyService
    /* JADX INFO: renamed from: LJFF */
    public final AddressSelectViewModel LIZIZ() {
        return new USAddressSelectViewModel();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.delivery.engine.address.DefaultAddressSelectStrategyService, com.ss.android.ugc.aweme.ecommerce.core.engine.IComponentStrategyService
    public final EnumC969503qf getType() {
        return EnumC969503qf.US_LOGISTICS_ADDRESS;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.delivery.engine.address.DefaultAddressSelectStrategyService, com.ss.android.ugc.aweme.ecommerce.core.engine.IComponentStrategyService
    public final void LJ(AbstractC1746380vXw abstractC1746380vXw, C19465311Dn c19465311Dn) {
        if (!(abstractC1746380vXw instanceof C969003qa)) {
            return;
        }
        c19465311Dn.LJFF(new AwS580S0100000_1(abstractC1746380vXw, (AbstractC1746380vXw<Object>) 909), AFwS228S0000000_1.get$arr$(819), null);
        c19465311Dn.LJFF(new AwS580S0100000_1(abstractC1746380vXw, (AbstractC1746380vXw<Object>) 910), AFwS228S0000000_1.get$arr$(820), null);
        c19465311Dn.LJFF(new AwS580S0100000_1(abstractC1746380vXw, (AbstractC1746380vXw<Object>) 911), AFwS228S0000000_1.get$arr$(821), null);
        c19465311Dn.LJFF(new AwS580S0100000_1(abstractC1746380vXw, (AbstractC1746380vXw<Object>) 912), AFwS228S0000000_1.get$arr$(822), null);
        c19465311Dn.LJFF(new AwS580S0100000_1(abstractC1746380vXw, (AbstractC1746380vXw<Object>) 913), AFwS228S0000000_1.get$arr$(816), null);
        c19465311Dn.LJFF(new AwS580S0100000_1(abstractC1746380vXw, (AbstractC1746380vXw<Object>) 903), new AwS580S0100000_1(abstractC1746380vXw, (AbstractC1746380vXw<Object>) 905), null);
        c19465311Dn.LJFF(new AwS580S0100000_1(abstractC1746380vXw, (AbstractC1746380vXw<Object>) 907), AFwS228S0000000_1.get$arr$(817), null);
        c19465311Dn.LJFF(new AwS580S0100000_1(abstractC1746380vXw, (AbstractC1746380vXw<Object>) 908), AFwS228S0000000_1.get$arr$(818), null);
    }
}
