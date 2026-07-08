package com.ss.android.ugc.aweme.im.strategy.api;

import X.C2201971BFz;
import X.InterfaceC1364105Vn;
import X.InterfaceC1501120pAM;
import X.InterfaceC1501200pAU;
import X.InterfaceC2177008fw;
import com.ss.android.ugc.aweme.im.strategy.StrategyConfigData;

/* JADX INFO: loaded from: classes35.dex */
public interface StrategyApi {
    public static final C2201971BFz LIZ = C2201971BFz.LIZ;

    @InterfaceC1501200pAU("im/scp/strategy_config/get/")
    Object getStrategyConfig(@InterfaceC1501120pAM("scenes") String str, @InterfaceC2177008fw Object obj, InterfaceC1364105Vn<? super StrategyConfigData> interfaceC1364105Vn);
}
