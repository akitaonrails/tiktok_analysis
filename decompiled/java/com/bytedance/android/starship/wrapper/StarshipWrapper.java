package com.bytedance.android.starship.wrapper;

import X.C01GW;
import X.C1306060k5k;
import X.C1306390k6H;
import X.C1306400k6I;
import X.C1306950k7B;
import X.C2097608Jq;
import X.C452501pT;
import X.InterfaceC1294060jmO;
import X.InterfaceC1306890k75;
import com.bytedance.android.starship.engine.strategy.IStarShipStrategy;
import com.bytedance.android.starship.strategy.CancelableJob;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS208S0000000_20;
import kotlin.jvm.internal.AwS35S0000100_20;
import kotlin.jvm.internal.AwS375S0200000_9;

/* JADX INFO: loaded from: classes21.dex */
public final class StarshipWrapper {
    public static final C1306950k7B Companion = new C1306950k7B();
    public static final Gson gson = new Gson();
    public static final C01GW<Map<Integer, InterfaceC1306890k75>> containers$delegate = C452501pT.LIZIZ(AFwS208S0000000_20.get$arr$(24));
    public static final C01GW<IStarShipStrategy> starShipStrategyService$delegate = C452501pT.LIZIZ(AFwS208S0000000_20.get$arr$(25));

    public static final native void onRunStrategyResult(long j, Map<String, ? extends Object> map);

    public static final native void onStrategyResult(long j, Map<String, ? extends Object> map);

    public static final boolean isStrategyReady(String str) {
        Companion.getClass();
        IStarShipStrategy value = starShipStrategyService$delegate.getValue();
        if (value != null) {
            return value.isStrategyLoaded(str);
        }
        return false;
    }

    @InterfaceC1294060jmO
    public static final Map<String, Object> getNode(String str, String str2) {
        C1306390k6H<Map<String, Object>> c1306390k6HGf;
        Companion.getClass();
        IStarShipStrategy value = starShipStrategyService$delegate.getValue();
        if (value != null && (c1306390k6HGf = value.gf(str, str2)) != null) {
            return C2097608Jq.LJIIIIZZ(new Pair("error_code", c1306390k6HGf.LIZJ), new Pair("error_msg", c1306390k6HGf.LIZIZ), new Pair("node", c1306390k6HGf.LIZ));
        }
        return null;
    }

    public static final void sendEvent(String str, Map<String, ? extends Object> map) {
        Companion.getClass();
        IStarShipStrategy value = starShipStrategyService$delegate.getValue();
        if (value != null) {
            value.sendEvent(str, map);
        }
    }

    public static final CancelableJob registerStrategyCallback(int i, String str, long j) {
        Companion.getClass();
        return C1306950k7B.LIZ(i).registerStrategyCallback(new C1306400k6I(str), new AwS35S0000100_20(j, 0));
    }

    public static final Map<String, Object> runStrategy(int i, String str, Map<String, ? extends Object> map) {
        Companion.getClass();
        InterfaceC1306890k75 interfaceC1306890k75LIZ = C1306950k7B.LIZ(i);
        C1306400k6I c1306400k6I = new C1306400k6I(str);
        c1306400k6I.LIZIZ = new LinkedHashMap(map);
        CountDownLatch countDownLatch = new CountDownLatch(1);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        interfaceC1306890k75LIZ.runStrategy(c1306400k6I, new AwS375S0200000_9((Map) linkedHashMap, (Map<String, Object>) countDownLatch, (CountDownLatch) 15));
        try {
            countDownLatch.await();
            return linkedHashMap;
        } catch (InterruptedException e) {
            TryCatchGuardChecker.doCheck(e);
            linkedHashMap.put("error", e.getMessage());
            return linkedHashMap;
        }
    }

    public static final void runStrategy(int i, String str, Map<String, ? extends Object> map, long j) {
        Companion.getClass();
        InterfaceC1306890k75 interfaceC1306890k75LIZ = C1306950k7B.LIZ(i);
        C1306400k6I c1306400k6I = new C1306400k6I(str);
        c1306400k6I.LIZIZ = new LinkedHashMap(map);
        interfaceC1306890k75LIZ.runStrategy(c1306400k6I, new AwS35S0000100_20(j, 1));
    }

    public static final Map<String, Object> runStrategyWithEvent(int i, String str, Map<String, ? extends Object> map, String str2, Map<String, ? extends Object> map2) {
        Companion.getClass();
        InterfaceC1306890k75 interfaceC1306890k75LIZ = C1306950k7B.LIZ(i);
        C1306400k6I c1306400k6I = new C1306400k6I(str);
        c1306400k6I.LIZIZ = new LinkedHashMap(map);
        c1306400k6I.LIZJ = new Pair<>(str2, map2);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C1306060k5k c1306060k5kRunStrategyWithEvent = interfaceC1306890k75LIZ.runStrategyWithEvent(c1306400k6I);
        linkedHashMap.put("result", c1306060k5kRunStrategyWithEvent.LIZ);
        linkedHashMap.put("extra", c1306060k5kRunStrategyWithEvent.LIZJ);
        linkedHashMap.put("error", c1306060k5kRunStrategyWithEvent.LIZIZ);
        return linkedHashMap;
    }
}
