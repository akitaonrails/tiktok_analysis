package com.bytedance.android.starship.engine.strategy;

import X.C1306060k5k;
import X.C1306070k5l;
import X.C1306390k6H;
import X.C1306400k6I;
import X.C1306480k6Q;
import X.C1306510k6T;
import X.C1306520k6U;
import X.C1306800k6w;
import X.C23250099c;
import X.C436800HAw;
import X.C589410N9v;
import X.EnumC1306750k6r;
import X.EnumC1306820k6y;
import X.InterfaceC1307050k7L;
import com.bytedance.android.starship.strategy.CancelableJob;
import com.bytedance.android.starship.strategy.repository.ContainerInput;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS245S0000000_12;
import kotlin.jvm.internal.AwS264S0300000_20;

/* JADX INFO: loaded from: classes21.dex */
public final class StarShipStrategyService implements IStarShipStrategy {
    @Override // com.bytedance.android.starship.strategy.IStarShipBaseStrategy
    public final void loadStarShipStrategy() {
        C1306520k6U.LIZJ();
    }

    @Override // com.bytedance.android.starship.strategy.IStarShipBaseStrategy
    public final boolean addDataProvider(InterfaceC1307050k7L interfaceC1307050k7L) {
        ((ConcurrentHashMap) C589410N9v.LIZ.getValue()).put(interfaceC1307050k7L.getName(), interfaceC1307050k7L);
        return true;
    }

    @Override // com.bytedance.android.starship.strategy.IStarShipBaseStrategy
    public final String getStrategyVersion(String str) {
        return C1306480k6Q.LIZ(str).getStrategyVersion(str);
    }

    @Override // com.bytedance.android.starship.strategy.IStarShipBaseStrategy
    public final boolean isStrategyLoaded(String str) {
        C1306510k6T.LIZ.getClass();
        C1306520k6U.LIZJ();
        return C1306480k6Q.LIZ(str).isStrategyLoaded(str);
    }

    @Override // com.bytedance.android.starship.strategy.IStarShipBaseStrategy
    public final boolean removeDataProvider(String str) {
        ((ConcurrentHashMap) C589410N9v.LIZ.getValue()).remove(str);
        return true;
    }

    @Override // com.bytedance.android.starship.strategy.IStarShipBaseStrategy
    public final C1306060k5k runStrategySync(C1306400k6I c1306400k6I) {
        return C1306480k6Q.LIZ(c1306400k6I.LIZ).runStrategySync(c1306400k6I);
    }

    @Override // com.bytedance.android.starship.strategy.IStarShipBaseStrategy
    public final C1306060k5k runStrategyWithEvent(C1306400k6I c1306400k6I) {
        return new C1306060k5k();
    }

    @Override // com.bytedance.android.starship.engine.strategy.IStarShipStrategy
    public final void LJIIJ(EnumC1306820k6y enumC1306820k6y, AFwS245S0000000_12 aFwS245S0000000_12) {
        C1306510k6T.LIZ.getClass();
        if (enumC1306820k6y != EnumC1306820k6y.START_LIVE) {
            if (aFwS245S0000000_12 != null) {
                aFwS245S0000000_12.invoke(Boolean.FALSE);
            }
        } else {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put(EnumC1306750k6r.TTLH_CLIENT.getValue(), new ContainerInput(null, null));
            C1306520k6U.LIZIZ();
            C1306520k6U.LJI("updateStrategiesConfig_scene", new AwS264S0300000_20(enumC1306820k6y, linkedHashMap, aFwS245S0000000_12, 3));
        }
    }

    @Override // com.bytedance.android.starship.strategy.IStarShipBaseStrategy
    public final void getStrategyResult(C1306400k6I c1306400k6I, Function1<? super C1306060k5k, Unit> function1) {
        C1306480k6Q.LIZ(c1306400k6I.LIZ).getStrategyResult(c1306400k6I, function1);
    }

    @Override // com.bytedance.android.starship.engine.strategy.IStarShipStrategy
    public final C1306390k6H<Map<String, Object>> gf(String str, String str2) {
        return C1306480k6Q.LIZ(str).LIZJ(str, str2, new TypeToken<Map<String, ? extends Object>>() { // from class: X.0k73
        }.getType());
    }

    @Override // com.bytedance.android.starship.strategy.IStarShipBaseStrategy
    public final CancelableJob registerStrategyCallback(C1306400k6I c1306400k6I, Function1<? super C1306060k5k, Unit> function1) {
        C1306510k6T.LIZ.getClass();
        if (C1306480k6Q.LIZLLL) {
            return C1306480k6Q.LIZ(c1306400k6I.LIZ).registerStrategyCallback(c1306400k6I, function1);
        }
        return new C1306800k6w(c1306400k6I, function1);
    }

    @Override // com.bytedance.android.starship.strategy.IStarShipBaseStrategy
    public final void runStrategy(C1306400k6I c1306400k6I, Function1<? super C1306060k5k, Unit> function1) {
        C1306480k6Q.LIZ(c1306400k6I.LIZ).runStrategy(c1306400k6I, function1);
    }

    @Override // com.bytedance.android.starship.strategy.IStarShipBaseStrategy
    public final void sendEvent(String str, Map<String, ? extends Object> map) {
        C1306070k5l c1306070k5l = C1306070k5l.LIZ;
        C23250099c.LIZLLL(C1306070k5l.LIZIZ, null, null, new C436800HAw(str, map, null), 3);
    }

    @Override // com.bytedance.android.starship.engine.strategy.IStarShipStrategy
    public final <T> C1306390k6H<T> LIZJ(String str, String str2, Type type) {
        return C1306480k6Q.LIZ(str).LIZJ(str, str2, type);
    }
}
