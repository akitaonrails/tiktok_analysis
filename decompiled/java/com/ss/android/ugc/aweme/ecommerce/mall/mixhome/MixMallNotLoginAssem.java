package com.ss.android.ugc.aweme.ecommerce.mall.mixhome;

import X.C13LE;
import X.C1569200qwA;
import X.C1608210rx5;
import X.C1749280vcc;
import android.view.View;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.ecommerce.mall.ShopMallMixFragment;
import com.ss.android.ugc.aweme.ecommerce.mall.mixhome.utils.EcMallLoginHelper;
import kotlin.jvm.internal.AwS568S0100000_24;

/* JADX INFO: loaded from: classes25.dex */
public final class MixMallNotLoginAssem extends UIContentAssem {
    public static final /* synthetic */ int LLJIJIL = 0;
    public TuxNavBar LLIZLLLIL;
    public C1749280vcc LLJ;
    public final C1608210rx5 LLJI = new C1608210rx5(this, C13LE.LJII(ShopMallMixFragment.class));

    /* JADX WARN: Multi-variable type inference failed */
    public final ShopMallMixFragment Go() {
        return (ShopMallMixFragment) this.LLJI.getValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        C1569200qwA.LIZIZ(new AwS568S0100000_24(this, 1630), new AwS568S0100000_24(this, 1631));
        ((EcMallLoginHelper) Go().LLJJJJ.getValue()).LIZJ(this, new AwS568S0100000_24(this, 335));
    }
}
