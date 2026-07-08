package com.bytedance.hybrid.spark.security.impl;

import X.C821850WLv;
import X.C828420Wee;
import com.bytedance.hybrid.spark.security.api.protocols.SparkSecurityJSBService;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes14.dex */
public final class SparkSecurityJSBParamReportService implements SparkSecurityJSBService {
    public static final Set<String> LIZJ = Collections.newSetFromMap(new ConcurrentHashMap());
    public static final Object LIZLLL = new Object();
    public final ConcurrentHashMap<String, Pattern> LIZ = new ConcurrentHashMap<>();
    public final Gson LIZIZ = new Gson();

    @Override // com.bytedance.hybrid.spark.security.api.protocols.SparkSecurityService
    public boolean interceptable() {
        return false;
    }

    public final boolean LIZIZ(String str) {
        synchronized (LIZLLL) {
            try {
                Set<String> set = LIZJ;
                if (set.contains(str)) {
                    return false;
                }
                if (set.size() >= 10000) {
                    set.clear();
                }
                set.add(str);
                return true;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // com.bytedance.hybrid.spark.security.api.protocols.SparkSecurityJSBService
    public C821850WLv handleDidExecuteJSBridgeMethodEvent(C828420Wee c828420Wee) {
        return LIZ(c828420Wee, false);
    }

    @Override // com.bytedance.hybrid.spark.security.api.protocols.SparkSecurityJSBService
    public C821850WLv handleWillExecuteJSBridgeMethodEvent(C828420Wee c828420Wee) {
        return LIZ(c828420Wee, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:170:0x01c7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0218 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0179  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C821850WLv LIZ(X.C828420Wee r26, boolean r27) {
        /*
            Method dump skipped, instruction units count: 782
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.hybrid.spark.security.impl.SparkSecurityJSBParamReportService.LIZ(X.0Wee, boolean):X.0WLv");
    }
}
