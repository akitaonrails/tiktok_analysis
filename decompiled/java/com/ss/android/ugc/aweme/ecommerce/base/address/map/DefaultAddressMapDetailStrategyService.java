package com.ss.android.ugc.aweme.ecommerce.base.address.map;

import X.AbstractC1002403vy;
import X.AbstractC1003203w6;
import X.AbstractC1746380vXw;
import X.C040C;
import X.C11DP;
import X.C1745680vWo;
import X.C1746280vXm;
import X.C19465311Dn;
import X.EnumC969503qf;
import X.InterfaceC1002303vx;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.InputItemDTO;
import java.util.List;
import kotlin.jvm.internal.AwS392S0200000_26;
import kotlin.jvm.internal.AwS605S0100000_26;

/* JADX INFO: loaded from: classes27.dex */
@C040C(name = "trajectory_map_for_address")
public final class DefaultAddressMapDetailStrategyService extends AbstractC1003203w6<AddressMapDetailViewModel> {
    @Override // com.ss.android.ugc.aweme.ecommerce.core.engine.IComponentStrategyService
    public final ViewModel LIZIZ() {
        return new AddressMapDetailViewModel();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.core.engine.IComponentStrategyService
    public final EnumC969503qf getType() {
        return EnumC969503qf.DEFAULT;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.core.engine.IComponentStrategyService
    public final InterfaceC1002303vx<AddressMapDetailViewModel> LIZJ(final LifecycleOwner lifecycleOwner) {
        return new AbstractC1002403vy<AddressMapDetailViewModel>(lifecycleOwner) { // from class: X.0vXi
            @Override // X.AbstractC1002403vy
            public final /* bridge */ /* synthetic */ void LIZJ(Fragment fragment, C19EG c19eg, ViewModel viewModel, List list) {
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.core.engine.IComponentStrategyService
    public final void LJ(AbstractC1746380vXw abstractC1746380vXw, C19465311Dn c19465311Dn) {
        if (!(abstractC1746380vXw instanceof C1746280vXm)) {
            return;
        }
        c19465311Dn.LJFF(new AwS392S0200000_26(this, (DefaultAddressMapDetailStrategyService) abstractC1746380vXw, (AbstractC1746380vXw<Object>) 181), new AwS605S0100000_26(abstractC1746380vXw, (AbstractC1746380vXw<Object>) 719), null);
        c19465311Dn.LJFF(new AwS392S0200000_26(this, (DefaultAddressMapDetailStrategyService) abstractC1746380vXw, (AbstractC1746380vXw<Object>) 182), new AwS605S0100000_26(abstractC1746380vXw, (AbstractC1746380vXw<Object>) 720), null);
    }

    public final boolean LJFF(int i, int i2, C11DP<Object> c11dp) {
        C1745680vWo c1745680vWo;
        InputItemDTO inputItemDTO;
        Integer num;
        Object objLLLIIIIL = c11dp.LLLIIIIL(i, false);
        if (!(objLLLIIIIL instanceof C1745680vWo) || (c1745680vWo = (C1745680vWo) objLLLIIIIL) == null || (inputItemDTO = c1745680vWo.LIZ) == null || (num = inputItemDTO.type) == null || num.intValue() != i2) {
            return false;
        }
        return true;
    }
}
