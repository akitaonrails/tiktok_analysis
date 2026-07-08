package com.bytedance.ies.xbridge.autoservice;

import X.C1323820kYO;
import X.C13LQ;
import X.C1543190qGD;
import X.C1543800qHC;
import X.C1543910qHN;
import X.C2348309Ib;
import X.EnumC1059790dgX;
import X.EnumC1063300dmC;
import X.InterfaceC1063690dmp;
import X.InterfaceC1063920dnC;
import X.InterfaceC1107590evd;
import X.InterfaceC1543380qGW;
import com.bytedance.ies.xbridge.autoservice.XBridgeDowngraderService;
import com.bytedance.sdk.xbridge.services.IXBridgeDowngraderService;
import com.bytedance.sdk.xbridge.services.IXBridgeDowngraderServiceProvider;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.react.bridge.ReadableMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.Unit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes24.dex */
public final class XBridgeDowngraderService implements IXBridgeDowngraderService, IXBridgeDowngraderServiceProvider {
    public final ConcurrentHashMap<String, InterfaceC1063690dmp> nameToXBridgeMap = new ConcurrentHashMap<>();

    @Override // com.bytedance.sdk.xbridge.services.IXBridgeDowngraderServiceProvider
    public IXBridgeDowngraderService provideIXBridgeDowngraderService() {
        return new XBridgeDowngraderService();
    }

    @Override // com.bytedance.sdk.xbridge.services.IXBridgeDowngraderService
    public void release() {
        Iterator<Map.Entry<String, InterfaceC1063690dmp>> it2 = this.nameToXBridgeMap.entrySet().iterator();
        while (it2.hasNext()) {
            it2.next().getValue().release();
        }
        this.nameToXBridgeMap.clear();
    }

    public final ConcurrentHashMap<String, InterfaceC1063690dmp> getNameToXBridgeMap() {
        return this.nameToXBridgeMap;
    }

    private final JSONObject changeParamsToJSONObject(C1543910qHN c1543910qHN) {
        Object obj = c1543910qHN.LJIIIIZZ;
        if (obj instanceof JSONObject) {
            return (JSONObject) obj;
        }
        if (obj instanceof ReadableMap) {
            ReadableMap readableMap = (ReadableMap) obj;
            ReadableMap readableMapUnWrapperParams = unWrapperParams(readableMap);
            if (readableMapUnWrapperParams != null) {
                readableMap = readableMapUnWrapperParams;
            }
            return C2348309Ib.LIZLLL(readableMap.asHashMap());
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (map != null) {
                C1543800qHC.LIZ.getClass();
                JSONObject jSONObjectLIZJ = C1543800qHC.LIZJ(map);
                if (jSONObjectLIZJ != null) {
                    return jSONObjectLIZJ;
                }
            }
            return new JSONObject();
        }
        return new JSONObject();
    }

    private final EnumC1059790dgX getPlatformByBridgeContext(C1543190qGD c1543190qGD) {
        EnumC1063300dmC enumC1063300dmC = c1543190qGD.LJIILJJIL;
        if (enumC1063300dmC == EnumC1063300dmC.LYNX) {
            return EnumC1059790dgX.LYNX;
        }
        if (enumC1063300dmC == EnumC1063300dmC.WEB) {
            return EnumC1059790dgX.WEB;
        }
        return EnumC1059790dgX.ALL;
    }

    private final ReadableMap unWrapperParams(ReadableMap readableMap) {
        ReadableMap map;
        if (readableMap != null && (map = readableMap.getMap("data")) != null) {
            return map;
        }
        return readableMap;
    }

    public final String printException(Throwable th) {
        return C13LQ.LJJJ(th.getStackTrace(), "\n", null, null, null, 62);
    }

    private final InterfaceC1107590evd createXBridgeParams(C1543190qGD c1543190qGD, C1543910qHN c1543910qHN) {
        return new C1323820kYO(changeParamsToJSONObject(c1543910qHN));
    }

    public final Object changeDataToEnginePlatform(C1543190qGD c1543190qGD, Map<String, Object> map) {
        EnumC1063300dmC enumC1063300dmC = c1543190qGD.LJIILJJIL;
        if (enumC1063300dmC == EnumC1063300dmC.WEB) {
            C1543800qHC.LIZ.getClass();
            return C1543800qHC.LIZJ(map);
        }
        if (enumC1063300dmC != EnumC1063300dmC.LYNX) {
            return map;
        }
        return C1543800qHC.LIZ(map);
    }

    private final InterfaceC1063920dnC createXBridgeCallback(final C1543190qGD c1543190qGD, C1543910qHN c1543910qHN, final InterfaceC1543380qGW interfaceC1543380qGW) {
        return new InterfaceC1063920dnC() { // from class: X.0qJe
            @Override // X.InterfaceC1063920dnC
            public final void LIZ(Map<String, Object> map) {
                Object c098200Yq;
                Object objChangeDataToEnginePlatform = this.LIZ.changeDataToEnginePlatform(c1543190qGD, map);
                try {
                    interfaceC1543380qGW.LIZIZ(objChangeDataToEnginePlatform);
                    c098200Yq = Unit.LIZ;
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                InterfaceC1543380qGW interfaceC1543380qGW2 = interfaceC1543380qGW;
                XBridgeDowngraderService xBridgeDowngraderService = this.LIZ;
                Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
                if (thM5exceptionOrNullimpl != null) {
                    interfaceC1543380qGW2.LIZIZ(C2097608Jq.LJIIIIZZ(new Pair("code", Integer.valueOf(C386801es.DEFAULT)), new Pair("msg", xBridgeDowngraderService.printException(thM5exceptionOrNullimpl)), new Pair("data", objChangeDataToEnginePlatform)));
                }
            }
        };
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025 A[RETURN] */
    @Override // com.bytedance.sdk.xbridge.services.IXBridgeDowngraderService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean startXBridgeDownGrade(X.C1543190qGD r6, X.C1543910qHN r7, X.InterfaceC1543380qGW r8) {
        /*
            r5 = this;
            X.0dgX r2 = r5.getPlatformByBridgeContext(r6)
            java.util.concurrent.ConcurrentHashMap<java.lang.String, X.0dmp> r1 = r5.nameToXBridgeMap
            java.lang.String r0 = r7.LJFF
            boolean r0 = r1.contains(r0)
            r3 = 0
            if (r0 == 0) goto L26
            java.util.concurrent.ConcurrentHashMap<java.lang.String, X.0dmp> r1 = r5.nameToXBridgeMap
            java.lang.String r0 = r7.LJFF
            java.lang.Object r4 = r1.get(r0)
            X.0dmp r4 = (X.InterfaceC1063690dmp) r4
        L19:
            if (r4 == 0) goto L37
            java.util.concurrent.ConcurrentHashMap<java.lang.String, X.0dmp> r1 = r5.nameToXBridgeMap
            java.lang.String r0 = r7.LJFF
            r1.put(r0, r4)
        L22:
            r3 = 0
            if (r4 != 0) goto L39
            return r3
        L26:
            java.lang.String r1 = r7.LJFF
            java.lang.String r0 = "DEFAULT"
            java.lang.Class r0 = X.C1062300dka.LIZ(r2, r1, r0)
            if (r0 == 0) goto L37
            java.lang.Object r4 = r0.newInstance()
            X.0dmp r4 = (X.InterfaceC1063690dmp) r4
            goto L19
        L37:
            r4 = r3
            goto L22
        L39:
            X.0qGZ r0 = r6.LIZ
            if (r0 == 0) goto L5b
            X.0qIV r1 = r0.LJ
            if (r1 == 0) goto L5b
            java.lang.Class<X.0dge> r0 = X.C1059860dge.class
            java.lang.Object r0 = r1.LIZIZ(r0)
            X.0dge r0 = (X.C1059860dge) r0
            if (r0 == 0) goto L5b
            r4.LIZ(r0)
            X.0evd r1 = r5.createXBridgeParams(r6, r7)
            X.0dnC r0 = r5.createXBridgeCallback(r6, r7, r8)
            r4.LIZIZ(r1, r0, r2)
            r0 = 1
            return r0
        L5b:
            X.0qHP r2 = r7.LJJIFFI
            java.lang.String r1 = "XBridgeDowngrade_error"
            java.lang.String r0 = "XContextProviderFactory is null"
            r2.LIZ(r0, r1)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.xbridge.autoservice.XBridgeDowngraderService.startXBridgeDownGrade(X.0qGD, X.0qHN, X.0qGW):boolean");
    }
}
