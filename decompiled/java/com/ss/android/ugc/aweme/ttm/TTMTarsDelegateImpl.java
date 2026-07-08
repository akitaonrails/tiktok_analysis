package com.ss.android.ugc.aweme.ttm;

import X.C0Z0Y;
import X.C19719512Dh;
import X.C2213361Bjy;
import X.C2213371Bjz;
import X.C259800zU;
import X.EnumC2213351Bjx;
import X.InterfaceC882520Yji;
import X.InterfaceC892690Z0h;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.tars.TarsInstConfig;
import com.ss.android.ugc.aweme.tars.TarsSharedInterface;
import com.tiktok.strategycenterengine.coreinterface.TTMTarsDelegate;
import com.tiktok.ttm.TTMParamData;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import kotlin.jvm.internal.AwS613S0100000_34;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes35.dex */
public final class TTMTarsDelegateImpl implements TTMTarsDelegate {
    @Override // com.tiktok.strategycenterengine.coreinterface.TTMTarsDelegate
    public final void LJ() {
    }

    @Override // com.tiktok.strategycenterengine.coreinterface.TTMTarsDelegate
    public final void LIZIZ(C2213361Bjy c2213361Bjy) {
        Object obj;
        if (c2213361Bjy != null) {
            obj = c2213361Bjy.LIZ;
        } else {
            obj = null;
        }
        C0Z0Y c0z0y = (C0Z0Y) obj;
        if (c0z0y != null) {
            c0z0y.release();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.tiktok.strategycenterengine.coreinterface.TTMTarsDelegate
    public final C2213371Bjz LIZ(C2213361Bjy c2213361Bjy, TTMParamData tTMParamData) throws InterruptedException {
        Map<String, ? extends Object> map;
        Map map2;
        final LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("success", 0);
        C0Z0Y c0z0y = (C0Z0Y) c2213361Bjy.LIZ;
        Object inputData = tTMParamData.getInputData();
        Object obj = null;
        if (C19719512Dh.LJII(inputData) && (map2 = (Map) inputData) != null) {
            obj = map2.get("params");
        }
        if (C19719512Dh.LJII(obj) && (map = (Map) obj) != null) {
            final CountDownLatch countDownLatch = new CountDownLatch(1);
            final C259800zU c259800zU = new C259800zU();
            c0z0y.LJIIIIZZ(map, new InterfaceC892690Z0h() { // from class: X.1Bjv
                /* JADX WARN: Type inference failed for: r2v0, types: [T, X.1Bjz] */
                /* JADX WARN: Type inference failed for: r2v3, types: [T, X.1Bjz] */
                /* JADX WARN: Type inference incomplete: some casts might be missing */
                @Override // X.InterfaceC892690Z0h
                public final void LIZ(C882890YkJ c882890YkJ) {
                    C1512100pS4 c1512100pS4;
                    c259800zU.element = new C2213371Bjz(EnumC2213351Bjx.RUN_MODEL_ERROR.getValue(), linkedHashMap);
                    if (c882890YkJ.LJ) {
                        Object obj2 = ((LinkedHashMap) c882890YkJ.LIZJ).get("pitaya_output");
                        Object obj3 = null;
                        if ((obj2 instanceof C1512100pS4) && (c1512100pS4 = (C1512100pS4) obj2) != null && c1512100pS4.LIZIZ()) {
                            linkedHashMap.put("success", 1);
                            Map<String, Object> map3 = c1512100pS4.LJFF;
                            if (map3 != null) {
                                obj3 = map3.get("engine_type");
                            }
                            Object obj4 = map3;
                            if (Intrinsics.LJFF(obj3, "bytedt")) {
                                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                                linkedHashMap2.put("outputs", c1512100pS4.LJFF);
                                obj4 = linkedHashMap2;
                            }
                            Map<String, Object> map4 = linkedHashMap;
                            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                            linkedHashMap3.put("params", obj4);
                            map4.put("output", linkedHashMap3);
                            c259800zU.element = new C2213371Bjz(EnumC2213351Bjx.SUCCESS.getValue(), linkedHashMap);
                        }
                    }
                    countDownLatch.countDown();
                }
            });
            countDownLatch.await();
            C2213371Bjz c2213371Bjz = (C2213371Bjz) c259800zU.element;
            if (c2213371Bjz == null) {
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                linkedHashMap2.put("success", 0);
                return new C2213371Bjz(EnumC2213351Bjx.RUN_MODEL_ERROR.getValue(), linkedHashMap2);
            }
            return c2213371Bjz;
        }
        return new C2213371Bjz(EnumC2213351Bjx.PARAM_IS_NULL.getValue(), linkedHashMap);
    }

    @Override // com.tiktok.strategycenterengine.coreinterface.TTMTarsDelegate
    public final void LIZJ(String str, final AwS613S0100000_34 awS613S0100000_34) {
        C0Z0Y c0z0yLIZJ;
        TarsSharedInterface tarsSharedInterface = (TarsSharedInterface) PluggableExtentionKt.pluggableSpi$default(TarsSharedInterface.class, false, false, false, 14, null);
        if (tarsSharedInterface != null && (c0z0yLIZJ = tarsSharedInterface.LIZJ(str, new TarsInstConfig(true))) != null) {
            c0z0yLIZJ.LJFF(new InterfaceC882520Yji() { // from class: X.1Bjw
                @Override // X.InterfaceC882520Yji
                public final void LIZIZ(Map<String, ? extends Object> map) {
                }

                @Override // X.InterfaceC882520Yji
                public final void LIZ(C892820Z0u c892820Z0u) {
                    awS613S0100000_34.invoke(Integer.valueOf(EnumC2213351Bjx.DOWNLOAD_MODEL_FAIL.getValue()));
                }

                @Override // X.InterfaceC882520Yji
                public final void onSuccess(Object obj) {
                    awS613S0100000_34.invoke(Integer.valueOf(EnumC2213351Bjx.SUCCESS.getValue()));
                }
            });
            c0z0yLIZJ.release();
        } else {
            awS613S0100000_34.invoke(Integer.valueOf(EnumC2213351Bjx.ENGINE_IS_NULL.getValue()));
        }
    }

    @Override // com.tiktok.strategycenterengine.coreinterface.TTMTarsDelegate
    public final C2213361Bjy LIZLLL(String str, Map<String, ? extends Object> map) {
        Object obj;
        Number number;
        Integer numValueOf;
        TarsInstConfig tarsInstConfig;
        C0Z0Y c0z0yLIZJ;
        if (map != null) {
            obj = map.get("call_type");
        } else {
            obj = null;
        }
        if (!(obj instanceof Number) || (number = (Number) obj) == null || (numValueOf = Integer.valueOf(number.intValue())) == null) {
            return null;
        }
        boolean z = true;
        if (numValueOf.intValue() == 14) {
            tarsInstConfig = new TarsInstConfig(true);
        } else {
            tarsInstConfig = new TarsInstConfig(false);
        }
        TarsSharedInterface tarsSharedInterface = (TarsSharedInterface) PluggableExtentionKt.pluggableSpi$default(TarsSharedInterface.class, false, false, false, 14, null);
        if (tarsSharedInterface == null || (c0z0yLIZJ = tarsSharedInterface.LIZJ(str, tarsInstConfig)) == null) {
            return null;
        }
        if (numValueOf.intValue() != 14) {
            z = false;
        }
        return new C2213361Bjy(c0z0yLIZJ, z);
    }
}
