package com.bytedance.android.starship.strategy;

import X.C1306060k5k;
import X.C1306400k6I;
import X.InterfaceC1307050k7L;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes21.dex */
public interface IStarShipBaseStrategy {
    boolean addDataProvider(InterfaceC1307050k7L interfaceC1307050k7L);

    void getStrategyResult(C1306400k6I c1306400k6I, Function1<? super C1306060k5k, Unit> function1);

    String getStrategyVersion(String str);

    boolean isStrategyLoaded(String str);

    void loadStarShipStrategy();

    CancelableJob registerStrategyCallback(C1306400k6I c1306400k6I, Function1<? super C1306060k5k, Unit> function1);

    boolean removeDataProvider(String str);

    void runStrategy(C1306400k6I c1306400k6I, Function1<? super C1306060k5k, Unit> function1);

    C1306060k5k runStrategySync(C1306400k6I c1306400k6I);

    C1306060k5k runStrategyWithEvent(C1306400k6I c1306400k6I);

    void sendEvent(String str, Map<String, ? extends Object> map);
}
