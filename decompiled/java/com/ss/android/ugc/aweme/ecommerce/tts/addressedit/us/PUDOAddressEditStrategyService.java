package com.ss.android.ugc.aweme.ecommerce.tts.addressedit.us;

import X.AbstractC1746380vXw;
import X.C040C;
import X.C1746220vXg;
import X.C1746350vXt;
import X.C19465311Dn;
import X.EnumC969503qf;
import X.InterfaceC1002303vx;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.DefaultAddressEditStrategyService;
import kotlin.jvm.internal.AFwS228S0000000_1;
import kotlin.jvm.internal.AFwS268S0000000_26;
import kotlin.jvm.internal.AwS392S0200000_26;
import kotlin.jvm.internal.AwS580S0100000_1;
import kotlin.jvm.internal.AwS605S0100000_26;

/* JADX INFO: loaded from: classes27.dex */
@C040C(name = "pickup_person")
public final class PUDOAddressEditStrategyService extends DefaultAddressEditStrategyService {
    @Override // com.ss.android.ugc.aweme.ecommerce.base.address.edit.DefaultAddressEditStrategyService, com.ss.android.ugc.aweme.ecommerce.core.engine.IComponentStrategyService
    public final ViewModel LIZIZ() {
        return new USAddressEditViewModel();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.address.edit.DefaultAddressEditStrategyService
    /* JADX INFO: renamed from: LJFF */
    public final AddressEditViewModel LIZIZ() {
        return new USAddressEditViewModel();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.address.edit.DefaultAddressEditStrategyService, com.ss.android.ugc.aweme.ecommerce.core.engine.IComponentStrategyService
    public final EnumC969503qf getType() {
        return EnumC969503qf.TTS_US_ADDRESS_EDIT_V1;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.address.edit.DefaultAddressEditStrategyService, com.ss.android.ugc.aweme.ecommerce.core.engine.IComponentStrategyService
    public final InterfaceC1002303vx<AddressEditViewModel> LIZJ(LifecycleOwner lifecycleOwner) {
        return new C1746350vXt(lifecycleOwner);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.address.edit.DefaultAddressEditStrategyService, com.ss.android.ugc.aweme.ecommerce.core.engine.IComponentStrategyService
    public final void LJ(AbstractC1746380vXw abstractC1746380vXw, C19465311Dn c19465311Dn) {
        c19465311Dn.LJFF(new AwS392S0200000_26(this, (PUDOAddressEditStrategyService) abstractC1746380vXw, (AbstractC1746380vXw<Object>) 158), AFwS228S0000000_1.get$arr$(669), null);
        if (abstractC1746380vXw instanceof C1746220vXg) {
            c19465311Dn.LJFF(new AwS392S0200000_26(this, (PUDOAddressEditStrategyService) abstractC1746380vXw, (AbstractC1746380vXw<Object>) 159), new AwS605S0100000_26(abstractC1746380vXw, (AbstractC1746380vXw<Object>) 664), null);
            c19465311Dn.LJFF(new AwS392S0200000_26(this, (PUDOAddressEditStrategyService) abstractC1746380vXw, (AbstractC1746380vXw<Object>) 160), new AwS605S0100000_26(abstractC1746380vXw, (AbstractC1746380vXw<Object>) 665), null);
            c19465311Dn.LJFF(new AwS392S0200000_26(this, (PUDOAddressEditStrategyService) abstractC1746380vXw, (AbstractC1746380vXw<Object>) 161), new AwS605S0100000_26(abstractC1746380vXw, (AbstractC1746380vXw<Object>) 666), null);
            c19465311Dn.LJFF(new AwS392S0200000_26(this, (PUDOAddressEditStrategyService) abstractC1746380vXw, (AbstractC1746380vXw<Object>) 162), new AwS605S0100000_26(abstractC1746380vXw, (AbstractC1746380vXw<Object>) 659), null);
            c19465311Dn.LJFF(new AwS580S0100000_1(abstractC1746380vXw, (AbstractC1746380vXw<Object>) 757), AFwS228S0000000_1.get$arr$(668), null);
            LJI((C1746220vXg) abstractC1746380vXw, c19465311Dn);
            c19465311Dn.LJFF(new AwS392S0200000_26(this, (PUDOAddressEditStrategyService) abstractC1746380vXw, (AbstractC1746380vXw<Object>) 154), new AwS605S0100000_26(abstractC1746380vXw, (AbstractC1746380vXw<Object>) 662), null);
            c19465311Dn.LJFF(new AwS392S0200000_26(this, (PUDOAddressEditStrategyService) abstractC1746380vXw, (AbstractC1746380vXw<Object>) 156), AFwS268S0000000_26.get$arr$(631), null);
        }
    }
}
