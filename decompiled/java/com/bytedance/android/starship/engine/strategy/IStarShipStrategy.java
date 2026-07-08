package com.bytedance.android.starship.engine.strategy;

import X.C1306390k6H;
import X.EnumC1306820k6y;
import X.InterfaceC1294060jmO;
import com.bytedance.android.starship.strategy.IStarShipBaseStrategy;
import java.lang.reflect.Type;
import java.util.Map;
import kotlin.jvm.internal.AFwS245S0000000_12;

/* JADX INFO: loaded from: classes21.dex */
public interface IStarShipStrategy extends IStarShipBaseStrategy {
    @InterfaceC1294060jmO
    <T> C1306390k6H<T> LIZJ(String str, String str2, Type type);

    @InterfaceC1294060jmO
    void LJIIJ(EnumC1306820k6y enumC1306820k6y, AFwS245S0000000_12 aFwS245S0000000_12);

    @InterfaceC1294060jmO
    C1306390k6H<Map<String, Object>> gf(String str, String str2);
}
