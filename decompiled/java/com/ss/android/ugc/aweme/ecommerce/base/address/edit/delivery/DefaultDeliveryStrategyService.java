package com.ss.android.ugc.aweme.ecommerce.base.address.edit.delivery;

import X.AbstractC1002403vy;
import X.AbstractC1003203w6;
import X.AbstractC1746380vXw;
import X.C040C;
import X.C1746260vXk;
import X.C19465311Dn;
import X.EnumC969503qf;
import X.InterfaceC1002303vx;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import kotlin.jvm.internal.AFwS268S0000000_26;
import kotlin.jvm.internal.AwS605S0100000_26;

/* JADX INFO: loaded from: classes27.dex */
@C040C(name = "delivery_instructions")
public class DefaultDeliveryStrategyService extends AbstractC1003203w6<DeliveryInstructionViewModel> {
    @Override // com.ss.android.ugc.aweme.ecommerce.core.engine.IComponentStrategyService
    public final ViewModel LIZIZ() {
        return new DeliveryInstructionViewModel();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.core.engine.IComponentStrategyService
    public final EnumC969503qf getType() {
        return EnumC969503qf.DEFAULT;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.core.engine.IComponentStrategyService
    public final InterfaceC1002303vx<DeliveryInstructionViewModel> LIZJ(final LifecycleOwner lifecycleOwner) {
        return new AbstractC1002403vy<DeliveryInstructionViewModel>(lifecycleOwner) { // from class: X.0vXj
        };
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.core.engine.IComponentStrategyService
    public final void LJ(AbstractC1746380vXw abstractC1746380vXw, C19465311Dn c19465311Dn) {
        if (!(abstractC1746380vXw instanceof C1746260vXk)) {
            return;
        }
        c19465311Dn.LJFF(new AwS605S0100000_26(abstractC1746380vXw, (AbstractC1746380vXw<Object>) 907), AFwS268S0000000_26.get$arr$(765), null);
        c19465311Dn.LJFF(new AwS605S0100000_26(abstractC1746380vXw, (AbstractC1746380vXw<Object>) 908), AFwS268S0000000_26.get$arr$(766), null);
    }
}
