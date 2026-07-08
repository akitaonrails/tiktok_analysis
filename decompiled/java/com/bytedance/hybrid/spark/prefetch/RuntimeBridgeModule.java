package com.bytedance.hybrid.spark.prefetch;

import X.C1297520jry;
import X.C1297530jrz;
import android.content.Context;
import com.lynx.jsbridge.LynxModule;
import com.lynx.react.bridge.WritableArray;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes21.dex */
public final class RuntimeBridgeModule extends LynxModule {
    public static final C1297520jry Companion = new C1297520jry();
    public C1297530jrz bridgeParam;

    public static final WritableArray convertJSONArray2JavaOnlyArray(JSONArray jSONArray) {
        Companion.getClass();
        return C1297520jry.LIZ(jSONArray);
    }

    public RuntimeBridgeModule(Context context, Object obj) {
        C1297530jrz c1297530jrz;
        super(context, obj);
        if (obj instanceof C1297530jrz) {
            c1297530jrz = (C1297530jrz) obj;
        } else {
            c1297530jrz = null;
        }
        this.bridgeParam = c1297530jrz;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:5|(13:7|(1:9)(1:17)|10|(1:12)(1:16)|13|(1:15)|37|20|(1:23)|24|(1:39)(1:28)|32|(1:41)(2:35|36))(1:18)|19|37|20|(1:23)|24|(2:26|39)(1:29)|32|(1:41)(1:40)) */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a1, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a2, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r5);
        r4 = new X.C098200Yq(r5);
        X.C189200o6.m2constructorimpl(r4);
     */
    @X.InterfaceC1063790dmz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void call(java.lang.String r19, com.lynx.react.bridge.ReadableMap r20, com.lynx.react.bridge.Callback r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.hybrid.spark.prefetch.RuntimeBridgeModule.call(java.lang.String, com.lynx.react.bridge.ReadableMap, com.lynx.react.bridge.Callback):void");
    }
}
