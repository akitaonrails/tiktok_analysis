package com.bytedance.android.starship.wrapper;

import X.C01GW;
import X.C1306060k5k;
import X.C1306390k6H;
import X.C1306400k6I;
import X.C1306960k7C;
import X.C1306990k7F;
import X.C1307000k7G;
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
import kotlin.jvm.internal.AwS35S0000100_20;
import kotlin.jvm.internal.AwS375S0200000_9;

/* JADX INFO: loaded from: classes21.dex */
public final class StarshipWrapper2 {
    public static final C1306960k7C Companion = new C1306960k7C();
    public static final Gson gson = new Gson();
    public static final C01GW<Map<Integer, InterfaceC1306890k75>> containers$delegate = C452501pT.LIZIZ(new C1306990k7F());
    public static final C01GW<IStarShipStrategy> starShipStrategyService$delegate = C452501pT.LIZIZ(new C1307000k7G());

    public static final native String invokeFunction(String str);

    public static final native void onRunStrategyResult(long j, Map<String, ? extends Object> map);

    public static final native void onStrategyResult(long j, Map<String, ? extends Object> map);

    public static final native void onUpdateStrategiesConfig(long j, Map<String, ? extends Object> map);

    public static final native String runStrategy(int i, String str, String str2, int i2, int i3);

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

    public static final String getStrategyVersion(int i, String str) {
        Companion.getClass();
        return C1306960k7C.LIZ(i).getStrategyVersion(str);
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
        return C1306960k7C.LIZ(i).registerStrategyCallback(new C1306400k6I(str), new AwS35S0000100_20(j, 2));
    }

    public static final Map<String, Object> runStrategy(int i, String str, Map<String, ? extends Object> map) {
        Companion.getClass();
        InterfaceC1306890k75 interfaceC1306890k75LIZ = C1306960k7C.LIZ(i);
        C1306400k6I c1306400k6I = new C1306400k6I(str);
        c1306400k6I.LIZIZ = new LinkedHashMap(map);
        CountDownLatch countDownLatch = new CountDownLatch(1);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        interfaceC1306890k75LIZ.runStrategy(c1306400k6I, new AwS375S0200000_9((Map) linkedHashMap, (Map<String, Object>) countDownLatch, (CountDownLatch) 16));
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
        InterfaceC1306890k75 interfaceC1306890k75LIZ = C1306960k7C.LIZ(i);
        C1306400k6I c1306400k6I = new C1306400k6I(str);
        c1306400k6I.LIZIZ = new LinkedHashMap(map);
        interfaceC1306890k75LIZ.runStrategy(c1306400k6I, new AwS35S0000100_20(j, 3));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017 A[Catch: Exception -> 0x001d, TRY_LEAVE, TryCatch #0 {Exception -> 0x001d, blocks: (B:4:0x000b, B:6:0x0011, B:7:0x0017), top: B:16:0x000b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void updateStrategiesConfig(int r4, java.util.Map<java.lang.String, ? extends java.lang.Object> r5, java.lang.String[] r6, long r7) {
        /*
            X.0k7C r0 = com.bytedance.android.starship.wrapper.StarshipWrapper2.Companion
            r0.getClass()
            X.0k75 r4 = X.C1306960k7C.LIZ(r4)
            if (r5 == 0) goto L17
            boolean r0 = r5.isEmpty()     // Catch: java.lang.Exception -> L1d
            if (r0 != 0) goto L17
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: java.lang.Exception -> L1d
            r3.<init>(r5)     // Catch: java.lang.Exception -> L1d
            goto L26
        L17:
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: java.lang.Exception -> L1d
            r3.<init>()     // Catch: java.lang.Exception -> L1d
            goto L26
        L1d:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            org.json.JSONObject r3 = new org.json.JSONObject
            r3.<init>()
        L26:
            if (r6 == 0) goto L36
            java.util.List r2 = X.C13LQ.LJJLL(r6)
        L2c:
            kotlin.jvm.internal.AwS35S0000100_20 r1 = new kotlin.jvm.internal.AwS35S0000100_20
            r0 = 4
            r1.<init>(r7, r0)
            r4.LJIIIIZZ(r3, r2, r1)
            return
        L36:
            r2 = 0
            goto L2c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.starship.wrapper.StarshipWrapper2.updateStrategiesConfig(int, java.util.Map, java.lang.String[], long):void");
    }

    public static final Map<String, Object> runStrategyWithEvent(int i, String str, Map<String, ? extends Object> map, String str2, Map<String, ? extends Object> map2) {
        Companion.getClass();
        InterfaceC1306890k75 interfaceC1306890k75LIZ = C1306960k7C.LIZ(i);
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
