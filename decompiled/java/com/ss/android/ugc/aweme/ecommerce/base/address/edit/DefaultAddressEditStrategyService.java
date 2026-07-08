package com.ss.android.ugc.aweme.ecommerce.base.address.edit;

import X.AbstractC1003203w6;
import X.AbstractC1746380vXw;
import X.C040C;
import X.C11DP;
import X.C1745680vWo;
import X.C1746220vXg;
import X.C1746340vXs;
import X.C19465311Dn;
import X.EnumC969503qf;
import X.InterfaceC1002303vx;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.InputItemDTO;
import kotlin.jvm.internal.AFwS268S0000000_26;
import kotlin.jvm.internal.AwS392S0200000_26;
import kotlin.jvm.internal.AwS605S0100000_26;

/* JADX INFO: loaded from: classes27.dex */
@C040C(name = "shipping_address")
public class DefaultAddressEditStrategyService extends AbstractC1003203w6<AddressEditViewModel> {
    @Override // com.ss.android.ugc.aweme.ecommerce.core.engine.IComponentStrategyService
    /* JADX INFO: renamed from: LJFF, reason: merged with bridge method [inline-methods] */
    public AddressEditViewModel LIZIZ() {
        return new AddressEditViewModel();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.core.engine.IComponentStrategyService
    public EnumC969503qf getType() {
        return EnumC969503qf.DEFAULT;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.core.engine.IComponentStrategyService
    public InterfaceC1002303vx<AddressEditViewModel> LIZJ(LifecycleOwner lifecycleOwner) {
        return new C1746340vXs(lifecycleOwner);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.core.engine.IComponentStrategyService
    public void LJ(AbstractC1746380vXw abstractC1746380vXw, C19465311Dn c19465311Dn) {
        if (!(abstractC1746380vXw instanceof C1746220vXg)) {
            return;
        }
        c19465311Dn.LJFF(new AwS392S0200000_26(this, (DefaultAddressEditStrategyService) abstractC1746380vXw, (AbstractC1746380vXw<Object>) 208), AFwS268S0000000_26.get$arr$(726), null);
        c19465311Dn.LJFF(new AwS392S0200000_26(this, (DefaultAddressEditStrategyService) abstractC1746380vXw, (AbstractC1746380vXw<Object>) 210), AFwS268S0000000_26.get$arr$(727), null);
        c19465311Dn.LJFF(new AwS392S0200000_26(this, (DefaultAddressEditStrategyService) abstractC1746380vXw, (AbstractC1746380vXw<Object>) 213), new AwS605S0100000_26(abstractC1746380vXw, (AbstractC1746380vXw<Object>) 828), null);
        c19465311Dn.LJFF(new AwS392S0200000_26(this, (DefaultAddressEditStrategyService) abstractC1746380vXw, (AbstractC1746380vXw<Object>) 217), new AwS605S0100000_26(abstractC1746380vXw, (AbstractC1746380vXw<Object>) 830), null);
        LJI((C1746220vXg) abstractC1746380vXw, c19465311Dn);
    }

    public final void LJI(C1746220vXg c1746220vXg, C19465311Dn c19465311Dn) {
        c19465311Dn.LJFF(new AwS392S0200000_26(this, c1746220vXg, 233), new AwS605S0100000_26(c1746220vXg, 825), null);
        c19465311Dn.LJFF(new AwS392S0200000_26(this, c1746220vXg, 228), new AwS605S0100000_26(c1746220vXg, 853), null);
        c19465311Dn.LJFF(new AwS392S0200000_26(this, c1746220vXg, 203), new AwS605S0100000_26(c1746220vXg, 819), null);
        c19465311Dn.LJFF(new AwS392S0200000_26(this, c1746220vXg, 204), new AwS605S0100000_26(c1746220vXg, 821), null);
        c19465311Dn.LJFF(new AwS392S0200000_26(this, c1746220vXg, 206), new AwS605S0100000_26(c1746220vXg, 832), null);
        c19465311Dn.LJFF(new AwS392S0200000_26(this, c1746220vXg, 221), AFwS268S0000000_26.get$arr$(735), null);
        c19465311Dn.LJFF(new AwS392S0200000_26(this, c1746220vXg, 223), new AwS605S0100000_26(c1746220vXg, 843), null);
        c19465311Dn.LJFF(new AwS392S0200000_26(this, c1746220vXg, 225), new AwS605S0100000_26(c1746220vXg, 847), null);
        c19465311Dn.LJFF(new AwS392S0200000_26(this, c1746220vXg, 229), new AwS605S0100000_26(c1746220vXg, 849), null);
        c19465311Dn.LJFF(new AwS392S0200000_26(this, c1746220vXg, 231), new AwS605S0100000_26(c1746220vXg, 852), null);
        c19465311Dn.LJFF(new AwS392S0200000_26(this, c1746220vXg, 236), new AwS605S0100000_26(c1746220vXg, 817), null);
        c19465311Dn.LJFF(new AwS605S0100000_26(c1746220vXg, 818), new AwS605S0100000_26(c1746220vXg, 820), null);
        c19465311Dn.LJFF(new AwS392S0200000_26(this, c1746220vXg, 205), new AwS605S0100000_26(c1746220vXg, 822), null);
        c19465311Dn.LJFF(new AwS392S0200000_26(this, c1746220vXg, 207), new AwS605S0100000_26(c1746220vXg, 823), null);
        c19465311Dn.LJFF(new AwS392S0200000_26(this, c1746220vXg, 209), new AwS605S0100000_26(c1746220vXg, 826), null);
        c19465311Dn.LJFF(new AwS605S0100000_26(c1746220vXg, 827), AFwS268S0000000_26.get$arr$(730), null);
        c19465311Dn.LJFF(new AwS392S0200000_26(this, c1746220vXg, 219), new AwS605S0100000_26(c1746220vXg, 833), null);
        c19465311Dn.LJFF(new AwS392S0200000_26(this, c1746220vXg, 222), new AwS605S0100000_26(c1746220vXg, 837), null);
        c19465311Dn.LJFF(new AwS392S0200000_26(this, c1746220vXg, 224), AFwS268S0000000_26.get$arr$(740), null);
        c19465311Dn.LJFF(new AwS392S0200000_26(this, c1746220vXg, 226), AFwS268S0000000_26.get$arr$(741), null);
        c19465311Dn.LJFF(new AwS392S0200000_26(this, c1746220vXg, 230), AFwS268S0000000_26.get$arr$(742), null);
        c19465311Dn.LJFF(new AwS392S0200000_26(this, c1746220vXg, 234), AFwS268S0000000_26.get$arr$(744), null);
    }

    public final boolean LJII(int i, int i2, C11DP<Object> c11dp) {
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
