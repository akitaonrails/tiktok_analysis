package com.bytedance.pipo.stellar.base.adapter.internal;

import X.C1720570usJ;
import X.C1720760usc;
import X.EnumC1720960usw;
import X.InterfaceC1720050urT;
import X.InterfaceC1720700usW;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.pipo.stellar.base.card.CarouselBannerCard;
import com.bytedance.pipo.stellar.base.model.CarouselBannerDO;
import kotlin.jvm.internal.AFwS268S0000000_26;
import kotlin.jvm.internal.AwS427S0200000_26;

/* JADX INFO: loaded from: classes27.dex */
public final class StellarCarouselBannerAdapter extends StellarBaseCardAdapter<CarouselBannerDO> {
    public StellarCarouselBannerAdapter() {
        super(new CarouselBannerCard(), EnumC1720960usw.CAROUSEL_CARD_BANNER.getValue(), null, AFwS268S0000000_26.get$arr$(17), null, 52);
    }

    @Override // com.bytedance.pipo.stellar.base.adapter.internal.StellarBaseCardAdapter
    public final C1720760usc W5(C1720570usJ<CarouselBannerDO> c1720570usJ) {
        C1720760usc c1720760uscKa1;
        LifecycleOwner lifecycleOwner;
        boolean z;
        InterfaceC1720700usW interfaceC1720700usWR5 = R5();
        InterfaceC1720050urT interfaceC1720050urT = null;
        if (interfaceC1720700usWR5 != null) {
            c1720760uscKa1 = interfaceC1720700usWR5.Ka1();
        } else {
            c1720760uscKa1 = null;
        }
        if (c1720760uscKa1 != null) {
            lifecycleOwner = c1720760uscKa1.LIZ;
            interfaceC1720050urT = c1720760uscKa1.LIZIZ;
        } else {
            lifecycleOwner = null;
        }
        AwS427S0200000_26 awS427S0200000_26 = new AwS427S0200000_26(c1720760uscKa1, (C1720760usc) c1720570usJ, (C1720570usJ<CarouselBannerDO>) 4);
        if (c1720760uscKa1 != null) {
            z = c1720760uscKa1.LIZLLL;
        } else {
            z = true;
        }
        return new C1720760usc(lifecycleOwner, interfaceC1720050urT, awS427S0200000_26, z, null, 48);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.bytedance.pipo.stellar.base.adapter.internal.StellarBaseCardAdapter
    public final void V5(View view, C1720570usJ<CarouselBannerDO> c1720570usJ) {
        T t = c1720570usJ.LLJJ;
        if (t != null) {
            this.LLIZLLLIL.LJFF(view, t, c1720570usJ.LLJIJIL);
        }
    }
}
