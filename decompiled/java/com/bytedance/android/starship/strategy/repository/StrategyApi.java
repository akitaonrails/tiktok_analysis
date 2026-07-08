package com.bytedance.android.starship.strategy.repository;

import X.C11NZ;
import X.InterfaceC1485405rg;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501350pAj;

/* JADX INFO: loaded from: classes21.dex */
public interface StrategyApi {
    @InterfaceC1501170pAR("/starship/strategy_config")
    C11NZ<StrategiesData> fetchStrategies(@InterfaceC1485405rg RequestData requestData, @InterfaceC1501350pAj("starship-traceparent") String str);
}
