package com.bytedance.android.starship.engine.strategy;

import X.C1306060k5k;
import X.C1306390k6H;
import X.C1306400k6I;
import X.EnumC1306820k6y;
import X.InterfaceC1294060jmO;
import X.InterfaceC1307050k7L;
import com.bytedance.android.starship.strategy.CancelableJob;
import java.lang.reflect.Type;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS245S0000000_12;

/* JADX INFO: loaded from: classes21.dex */
public final class StarshipStrategyEmptyService implements IStarShipStrategy {
    @Override // com.bytedance.android.starship.engine.strategy.IStarShipStrategy
    @InterfaceC1294060jmO
    public final <T> C1306390k6H<T> LIZJ(String str, String str2, Type type) {
        return null;
    }

    @Override // com.bytedance.android.starship.engine.strategy.IStarShipStrategy
    @InterfaceC1294060jmO
    public final void LJIIJ(EnumC1306820k6y enumC1306820k6y, AFwS245S0000000_12 aFwS245S0000000_12) {
    }

    @Override // com.bytedance.android.starship.strategy.IStarShipBaseStrategy
    public final boolean addDataProvider(InterfaceC1307050k7L interfaceC1307050k7L) {
        return false;
    }

    @Override // com.bytedance.android.starship.strategy.IStarShipBaseStrategy
    public final void getStrategyResult(C1306400k6I c1306400k6I, Function1<? super C1306060k5k, Unit> function1) {
    }

    @Override // com.bytedance.android.starship.strategy.IStarShipBaseStrategy
    public final String getStrategyVersion(String str) {
        return null;
    }

    @Override // com.bytedance.android.starship.engine.strategy.IStarShipStrategy
    @InterfaceC1294060jmO
    public final C1306390k6H<Map<String, Object>> gf(String str, String str2) {
        return null;
    }

    @Override // com.bytedance.android.starship.strategy.IStarShipBaseStrategy
    public final boolean isStrategyLoaded(String str) {
        return false;
    }

    @Override // com.bytedance.android.starship.strategy.IStarShipBaseStrategy
    public final void loadStarShipStrategy() {
    }

    @Override // com.bytedance.android.starship.strategy.IStarShipBaseStrategy
    public final CancelableJob registerStrategyCallback(C1306400k6I c1306400k6I, Function1<? super C1306060k5k, Unit> function1) {
        return null;
    }

    @Override // com.bytedance.android.starship.strategy.IStarShipBaseStrategy
    public final boolean removeDataProvider(String str) {
        return false;
    }

    @Override // com.bytedance.android.starship.strategy.IStarShipBaseStrategy
    public final void runStrategy(C1306400k6I c1306400k6I, Function1<? super C1306060k5k, Unit> function1) {
    }

    @Override // com.bytedance.android.starship.strategy.IStarShipBaseStrategy
    public final void sendEvent(String str, Map<String, ? extends Object> map) {
    }

    @Override // com.bytedance.android.starship.strategy.IStarShipBaseStrategy
    public final C1306060k5k runStrategySync(C1306400k6I c1306400k6I) {
        return new C1306060k5k();
    }

    @Override // com.bytedance.android.starship.strategy.IStarShipBaseStrategy
    public final C1306060k5k runStrategyWithEvent(C1306400k6I c1306400k6I) {
        return new C1306060k5k();
    }
}
