package com.bytedance.pumbaa.hybrid.governance.network;

import X.C0WMR;
import X.C0WMV;
import X.C0WMX;
import X.C821850WLv;
import X.C828420Wee;
import com.bytedance.hybrid.spark.security.api.protocols.SparkSecurityJSBService;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes14.dex */
public final class JSBridgeNetColoringServiceImpl implements SparkSecurityJSBService {
    public final C0WMR LIZ;

    @Override // com.bytedance.hybrid.spark.security.api.protocols.SparkSecurityService
    public boolean interceptable() {
        return false;
    }

    public JSBridgeNetColoringServiceImpl(C0WMR c0wmr) {
        this.LIZ = c0wmr;
    }

    @Override // com.bytedance.hybrid.spark.security.api.protocols.SparkSecurityJSBService
    public C821850WLv handleDidExecuteJSBridgeMethodEvent(C828420Wee c828420Wee) {
        C0WMR c0wmr = this.LIZ;
        if (c0wmr != null && Intrinsics.LJFF(c0wmr.LIZIZ, Boolean.TRUE)) {
            ((HashMap) C0WMX.LIZ().LIZ).remove(C0WMV.class);
            return null;
        }
        return null;
    }

    @Override // com.bytedance.hybrid.spark.security.api.protocols.SparkSecurityJSBService
    public C821850WLv handleWillExecuteJSBridgeMethodEvent(C828420Wee c828420Wee) {
        boolean zLJFF;
        C0WMR c0wmr = this.LIZ;
        if (c0wmr != null) {
            zLJFF = Intrinsics.LJFF(c0wmr.LIZIZ, Boolean.TRUE);
        } else {
            zLJFF = false;
        }
        if (zLJFF) {
            Object obj = c828420Wee.LJFF.get("engineView");
            Object obj2 = c828420Wee.LJFF.get("URL");
            if (!(obj2 instanceof String)) {
                obj2 = null;
            }
            Object obj3 = c828420Wee.LJFF.get("JSBName");
            if (obj == null || obj2 == null || obj3 == null) {
                return null;
            }
            ((HashMap) C0WMX.LIZ().LIZ).put(C0WMV.class, new C0WMV());
        }
        return null;
    }
}
