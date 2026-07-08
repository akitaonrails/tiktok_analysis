package com.bytedance.hybrid.spark.security.impl;

import X.C821850WLv;
import X.C828420Wee;
import com.bytedance.hybrid.spark.security.api.protocols.SparkSecurityJSBService;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes14.dex */
public final class SparkSecurityJSBDomainReporter implements SparkSecurityJSBService {
    public static final Set<String> LIZIZ = Collections.newSetFromMap(new ConcurrentHashMap());
    public static final Object LIZJ = new Object();
    public final ConcurrentHashMap<String, Pattern> LIZ = new ConcurrentHashMap<>();

    @Override // com.bytedance.hybrid.spark.security.api.protocols.SparkSecurityJSBService
    public C821850WLv handleDidExecuteJSBridgeMethodEvent(C828420Wee c828420Wee) {
        return null;
    }

    @Override // com.bytedance.hybrid.spark.security.api.protocols.SparkSecurityService
    public boolean interceptable() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x00e7  */
    @Override // com.bytedance.hybrid.spark.security.api.protocols.SparkSecurityJSBService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public X.C821850WLv handleWillExecuteJSBridgeMethodEvent(X.C828420Wee r19) {
        /*
            Method dump skipped, instruction units count: 545
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.hybrid.spark.security.impl.SparkSecurityJSBDomainReporter.handleWillExecuteJSBridgeMethodEvent(X.0Wee):X.0WLv");
    }
}
