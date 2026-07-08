package com.bytedance.hybrid.spark.security.impl.service.gecko;

import com.bytedance.hybrid.spark.security.api.protocols.SparkSecurityGeckoCDNWriteService;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes14.dex */
public final class SparkSecurityGeckoCDNWriteServiceImpl implements SparkSecurityGeckoCDNWriteService {
    public final Function0<String> LIZ;

    @Override // com.bytedance.hybrid.spark.security.api.protocols.SparkSecurityService
    public boolean interceptable() {
        return true;
    }

    public final Function0<String> getGetIdc() {
        return this.LIZ;
    }

    public SparkSecurityGeckoCDNWriteServiceImpl(Function0<String> function0) {
        this.LIZ = function0;
        SparkSecurityGeckoRewriteSwitchList.LIZ();
        SparkSecurityGeckoRewriteConfigList.LIZ();
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x03b3 A[PHI: r8
      0x03b3: PHI (r8v8 java.lang.String) = (r8v6 java.lang.String), (r8v10 java.lang.String) binds: [B:103:0x03b1, B:101:0x03ad] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r1v42, types: [T, X.0WLq] */
    /* JADX WARN: Type inference failed for: r2v50, types: [T, X.0WLq] */
    /* JADX WARN: Type inference failed for: r2v6, types: [T, X.0WLq] */
    /* JADX WARN: Type inference failed for: r4v0, types: [T, X.0WLq, X.0WLw] */
    /* JADX WARN: Type inference failed for: r4v7, types: [T, X.0WLq] */
    /* JADX WARN: Type inference failed for: r5v2, types: [T, X.0WLq] */
    /* JADX WARN: Type inference failed for: r6v8, types: [T, X.0WLq] */
    @Override // com.bytedance.hybrid.spark.security.api.protocols.SparkSecurityGeckoCDNWriteService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public X.C821850WLv handleWillRewriteGeckoCDNWithEvent(X.C828420Wee r56) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 1733
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.hybrid.spark.security.impl.service.gecko.SparkSecurityGeckoCDNWriteServiceImpl.handleWillRewriteGeckoCDNWithEvent(X.0Wee):X.0WLv");
    }
}
