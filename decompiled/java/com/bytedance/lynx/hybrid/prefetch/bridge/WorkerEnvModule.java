package com.bytedance.lynx.hybrid.prefetch.bridge;

import X.C098200Yq;
import X.C1531220pwu;
import X.C1531270pwz;
import X.C1531310px3;
import X.C1531370px9;
import X.C1531390pxB;
import X.C1531470pxJ;
import X.C189200o6;
import X.C2097608Jq;
import X.C2188811AlT;
import X.InterfaceC1522160piI;
import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.vmsdk.jsbridge.JSModule;
import com.bytedance.vmsdk.jsbridge.utils.ReadableMap;
import com.bytedance.vmsdk.jsbridge.utils.WritableMap;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes24.dex */
public final class WorkerEnvModule extends JSModule {
    public static final C1531390pxB Companion = new Object() { // from class: X.0pxB
    };
    public final C1531370px9 ctx;
    public WritableMap globalProps;
    public WritableMap initData;
    public String version;

    @InterfaceC1522160piI
    public final WritableMap getGlobalProps() {
        return this.globalProps;
    }

    @InterfaceC1522160piI
    public final WritableMap getInitialData() {
        return this.initData;
    }

    @InterfaceC1522160piI
    public final void onInit(ReadableMap readableMap) {
        String string;
        if (readableMap != null) {
            string = readableMap.getString("version", "null");
        } else {
            string = null;
        }
        this.version = string;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("JS Worker onInit, version = ");
        sbLIZ.append(this.version);
        C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0039  */
    @X.InterfaceC1522160piI
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void save(com.bytedance.vmsdk.jsbridge.utils.ReadableMap r5) {
        /*
            r4 = this;
            if (r5 == 0) goto L39
            java.lang.String r0 = "result"
            com.bytedance.vmsdk.jsbridge.utils.ReadableMap r0 = r5.getMap(r0)     // Catch: java.lang.Exception -> L52
            if (r0 == 0) goto L39
            java.util.HashMap r0 = r0.toHashMap()     // Catch: java.lang.Exception -> L52
            if (r0 == 0) goto L39
            java.util.Map r3 = X.C2097608Jq.LJIIZILJ(r0)     // Catch: java.lang.Exception -> L52
            if (r3 == 0) goto L46
            boolean r0 = X.C1535630q41.LJJIIJ     // Catch: java.lang.Exception -> L52
            java.lang.String r2 = "prefetchData"
            if (r0 == 0) goto L3b
            X.0px9 r0 = r4.ctx     // Catch: java.lang.Exception -> L52
            if (r0 == 0) goto L46
            X.0pwu r0 = r0.LIZJ     // Catch: java.lang.Exception -> L52
            if (r0 == 0) goto L46
            X.0q70 r0 = r0.LIZIZ     // Catch: java.lang.Exception -> L52
            if (r0 == 0) goto L46
            X.0pxS r1 = r0.hybridParams     // Catch: java.lang.Exception -> L52
            if (r1 == 0) goto L46
            kotlin.Pair r0 = new kotlin.Pair     // Catch: java.lang.Exception -> L52
            r0.<init>(r2, r3)     // Catch: java.lang.Exception -> L52
            java.util.Map r0 = X.C2097908Jt.LIZJ(r0)     // Catch: java.lang.Exception -> L52
            r1.LIZLLL(r0)     // Catch: java.lang.Exception -> L52
            goto L46
        L39:
            r3 = 0
            goto L46
        L3b:
            X.0px9 r0 = r4.ctx     // Catch: java.lang.Exception -> L52
            if (r0 == 0) goto L46
            java.util.Map<java.lang.String, java.lang.Object> r0 = r0.LIZ     // Catch: java.lang.Exception -> L52
            if (r0 == 0) goto L46
            r0.put(r2, r3)     // Catch: java.lang.Exception -> L52
        L46:
            X.0px9 r0 = r4.ctx     // Catch: java.lang.Exception -> L52
            if (r0 == 0) goto L69
            X.0pwu r0 = r0.LIZJ     // Catch: java.lang.Exception -> L52
            if (r0 == 0) goto L69
            r0.LJII(r3)     // Catch: java.lang.Exception -> L52
            return
        L52:
            r2 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r2)
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "fail to save data, error = "
            r1.append(r0)
            java.lang.String r0 = r2.getMessage()
            r1.append(r0)
            X.C2188811AlT.LIZIZ(r1)
        L69:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.lynx.hybrid.prefetch.bridge.WorkerEnvModule.save(com.bytedance.vmsdk.jsbridge.utils.ReadableMap):void");
    }

    public WorkerEnvModule(Context context, Object obj) {
        C1531370px9 c1531370px9;
        super(context, obj);
        Unit unit = null;
        if (obj instanceof C1531370px9) {
            c1531370px9 = (C1531370px9) obj;
        } else {
            c1531370px9 = null;
        }
        this.ctx = c1531370px9;
        if (c1531370px9 != null) {
            try {
                Map<String, Object> map = c1531370px9.LIZ;
                if (map != null) {
                    C1531470pxJ c1531470pxJ = WorkerBridgeModule.Companion;
                    JSONObject jSONObject = new JSONObject(map);
                    c1531470pxJ.getClass();
                    this.globalProps = C1531470pxJ.LIZIZ(jSONObject);
                }
                Map<Object, Object> map2 = c1531370px9.LIZIZ;
                if (map2 != null) {
                    C1531470pxJ c1531470pxJ2 = WorkerBridgeModule.Companion;
                    JSONObject jSONObject2 = new JSONObject(map2);
                    c1531470pxJ2.getClass();
                    this.initData = C1531470pxJ.LIZIZ(jSONObject2);
                    unit = Unit.LIZ;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return;
            }
        }
        C189200o6.m2constructorimpl(unit);
    }

    @InterfaceC1522160piI
    public final void log(String str, int i) {
        try {
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("[worker] ");
                            sbLIZ.append(str);
                            C2188811AlT.LIZIZ(sbLIZ);
                            return;
                        }
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("[worker] ");
                        sbLIZ2.append(str);
                        C2188811AlT.LIZIZ(sbLIZ2);
                        return;
                    }
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("[worker] ");
                    sbLIZ3.append(str);
                    C2188811AlT.LIZIZ(sbLIZ3);
                    return;
                }
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("[worker] ");
                sbLIZ4.append(str);
                C2188811AlT.LIZIZ(sbLIZ4);
                return;
            }
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append("[worker] ");
            sbLIZ5.append(str);
            C2188811AlT.LIZIZ(sbLIZ5);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    @InterfaceC1522160piI
    public final void saveSegmenting(String str, ReadableMap readableMap) {
        HashMap<String, Object> hashMap;
        Map mapLJIIZILJ;
        C1531370px9 c1531370px9;
        C1531220pwu c1531220pwu;
        Object objPutIfAbsent;
        if (readableMap != null) {
            try {
                ReadableMap map = readableMap.getMap("result");
                if (map != null && (hashMap = map.toHashMap()) != null && (mapLJIIZILJ = C2097608Jq.LJIIZILJ(hashMap)) != null && (c1531370px9 = this.ctx) != null && (c1531220pwu = c1531370px9.LIZJ) != null) {
                    ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) c1531220pwu.LJIIJ.getValue();
                    Object c1531310px3 = concurrentHashMap.get(str);
                    if (c1531310px3 == null && (objPutIfAbsent = concurrentHashMap.putIfAbsent(str, (c1531310px3 = new C1531310px3(str, c1531220pwu)))) != null) {
                        c1531310px3 = objPutIfAbsent;
                    }
                    C1531270pwz.LIZ((C1531310px3) c1531310px3, null, null, null, str, mapLJIIZILJ, 7);
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("fail to save data, error = ");
                sbLIZ.append(e.getMessage());
                C2188811AlT.LIZIZ(sbLIZ);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0090  */
    @X.InterfaceC1522160piI
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onFinished(int r7, java.lang.String r8, java.lang.Integer r9) {
        /*
            r6 = this;
            X.0px9 r1 = r6.ctx
            if (r1 == 0) goto L90
            X.0pwu r0 = r1.LIZJ
            if (r0 == 0) goto Lc
            java.lang.String r3 = r0.LIZJ
            if (r3 != 0) goto L12
        Lc:
            X.0pwu r0 = r1.LIZJ
            if (r0 == 0) goto L90
            java.lang.String r3 = r0.LIZ
        L12:
            r4 = 0
            if (r1 == 0) goto L8e
            X.0pwu r0 = r1.LIZJ
            if (r0 == 0) goto L8e
            X.0q70 r2 = r0.LIZIZ
        L1b:
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            java.lang.String r0 = "success"
            org.json.JSONObject r1 = r1.put(r0, r7)
            java.lang.String r0 = "errorCode"
            org.json.JSONObject r1 = r1.put(r0, r9)
            java.lang.String r0 = "errorMsg"
            org.json.JSONObject r1 = r1.put(r0, r8)
            java.lang.String r0 = "hybrid_prefetch_worker_finish"
            X.C1522300piW.LIZIZ(r0, r2, r3, r1)
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "worker on finished, status = "
            r1.append(r0)
            r1.append(r7)
            java.lang.String r5 = ", errorMsg = "
            r1.append(r5)
            r1.append(r8)
            java.lang.String r0 = ", errorCode = "
            r1.append(r0)
            r1.append(r9)
            X.C2188811AlT.LIZIZ(r1)
            r0 = 1
            if (r7 != r0) goto L66
            X.0px9 r0 = r6.ctx
            if (r0 == 0) goto L65
            X.0pwu r1 = r0.LIZJ
            if (r1 == 0) goto L65
            r0 = 7
            X.C1531220pwu.LJIIJ(r1, r4, r4, r4, r0)
        L65:
            return
        L66:
            X.0px9 r0 = r6.ctx
            if (r0 == 0) goto L65
            X.0pwu r3 = r0.LIZJ
            if (r3 == 0) goto L65
            r0 = 3
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "worker runtime error, errorCode = "
            r1.append(r0)
            r1.append(r9)
            r1.append(r5)
            r1.append(r8)
            java.lang.String r1 = X.C2188811AlT.LIZIZ(r1)
            r0 = 4
            X.C1531220pwu.LJIIJ(r3, r2, r1, r4, r0)
            return
        L8e:
            r2 = r4
            goto L1b
        L90:
            java.lang.String r3 = ""
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.lynx.hybrid.prefetch.bridge.WorkerEnvModule.onFinished(int, java.lang.String, java.lang.Integer):void");
    }
}
