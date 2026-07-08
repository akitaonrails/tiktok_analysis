package com.bytedance.pipo.stellar.base.adapter.internal;

import X.C1720570usJ;
import X.C1721060ut6;
import X.EnumC1720960usw;
import X.InterfaceC1720770usd;
import com.bytedance.pipo.stellar.base.model.ContainerCardDO;
import kotlin.jvm.internal.AFwS268S0000000_26;
import kotlin.jvm.internal.AwS427S0200000_26;

/* JADX INFO: loaded from: classes27.dex */
public final class StellarStackAdapter extends StellarBaseCardAdapter<ContainerCardDO> {
    public StellarStackAdapter() {
        super(new C1721060ut6(), EnumC1720960usw.CONTAINER_STACK.getValue(), null, AFwS268S0000000_26.get$arr$(31), null, 52);
    }

    @Override // com.bytedance.pipo.stellar.base.adapter.internal.StellarBaseCardAdapter
    public final void a6(C1720570usJ c1720570usJ) {
        C1721060ut6 c1721060ut6;
        InterfaceC1720770usd interfaceC1720770usd = this.LLIZLLLIL;
        if ((interfaceC1720770usd instanceof C1721060ut6) && (c1721060ut6 = (C1721060ut6) interfaceC1720770usd) != null) {
            c1721060ut6.LLILZ = new AwS427S0200000_26(this, (StellarStackAdapter) c1720570usJ, (C1720570usJ<ContainerCardDO>) 75);
        }
    }
}
