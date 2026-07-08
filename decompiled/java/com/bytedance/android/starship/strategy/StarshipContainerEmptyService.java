package com.bytedance.android.starship.strategy;

import X.EnumC1306750k6r;
import X.InterfaceC1306890k75;
import com.bytedance.android.starship.strategy.CancelableJob;
import com.bytedance.android.starship.strategy.DecisionConfig;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes21.dex */
public final class StarshipContainerEmptyService implements IStarshipContainerService {
    @Override // com.bytedance.android.starship.strategy.IStarshipContainerService
    public final InterfaceC1306890k75 LIZ(EnumC1306750k6r enumC1306750k6r) {
        return new InterfaceC1306890k75() { // from class: X.0k6u
            @Override // X.InterfaceC1306890k75
            public final Map<String, DecisionConfig> LIZLLL(String str) {
                return null;
            }

            @Override // X.InterfaceC1306890k75
            public final Map<String, DecisionConfig> LJII() {
                return null;
            }

            @Override // X.InterfaceC1306890k75
            public final void LJIIIIZZ(JSONObject jSONObject, List<String> list, Function1<? super C1307030k7J, Unit> function1) {
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
        };
    }
}
