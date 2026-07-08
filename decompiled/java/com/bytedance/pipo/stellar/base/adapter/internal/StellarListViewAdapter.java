package com.bytedance.pipo.stellar.base.adapter.internal;

import X.C1720570usJ;
import X.C1720860usm;
import X.EnumC1720960usw;
import X.InterfaceC1720770usd;
import com.bytedance.pipo.stellar.base.model.ContainerCardDO;
import kotlin.jvm.internal.AFwS268S0000000_26;
import kotlin.jvm.internal.AwS570S0100000_26;

/* JADX INFO: loaded from: classes27.dex */
public final class StellarListViewAdapter extends StellarBaseCardAdapter<ContainerCardDO> {
    public StellarListViewAdapter() {
        super(new C1720860usm(), EnumC1720960usw.CONTAINER_LIST.getValue(), null, AFwS268S0000000_26.get$arr$(27), null, 52);
    }

    @Override // com.bytedance.pipo.stellar.base.adapter.internal.StellarBaseCardAdapter
    public final void a6(C1720570usJ c1720570usJ) {
        C1720860usm c1720860usm;
        InterfaceC1720770usd interfaceC1720770usd = this.LLIZLLLIL;
        if ((interfaceC1720770usd instanceof C1720860usm) && (c1720860usm = (C1720860usm) interfaceC1720770usd) != null) {
            AwS570S0100000_26 awS570S0100000_26 = new AwS570S0100000_26(this, 1402);
            AwS570S0100000_26 awS570S0100000_262 = new AwS570S0100000_26(this, 1403);
            c1720860usm.LLILZ = awS570S0100000_26;
            c1720860usm.LLILZIL = awS570S0100000_262;
        }
    }
}
