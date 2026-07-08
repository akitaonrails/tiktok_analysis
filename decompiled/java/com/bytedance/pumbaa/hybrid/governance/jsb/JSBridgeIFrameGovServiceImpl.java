package com.bytedance.pumbaa.hybrid.governance.jsb;

import X.C0WM1;
import X.C0WMG;
import X.C0WML;
import X.C0WNA;
import X.C821850WLv;
import X.C828420Wee;
import com.bytedance.hybrid.spark.security.api.protocols.SparkSecurityJSBService;

/* JADX INFO: loaded from: classes14.dex */
public final class JSBridgeIFrameGovServiceImpl implements SparkSecurityJSBService {
    public final C0WMG LIZ;

    @Override // com.bytedance.hybrid.spark.security.api.protocols.SparkSecurityJSBService
    public C821850WLv handleDidExecuteJSBridgeMethodEvent(C828420Wee c828420Wee) {
        return null;
    }

    @Override // com.bytedance.hybrid.spark.security.api.protocols.SparkSecurityService
    public boolean interceptable() {
        return true;
    }

    public JSBridgeIFrameGovServiceImpl(C0WMG c0wmg) {
        this.LIZ = c0wmg;
    }

    @Override // com.bytedance.hybrid.spark.security.api.protocols.SparkSecurityJSBService
    public C821850WLv handleWillExecuteJSBridgeMethodEvent(C828420Wee c828420Wee) {
        String str;
        String str2;
        String str3;
        C0WML c0wml = new C0WML();
        Object obj = c828420Wee.LJFF.get("mainframeURL");
        if (obj instanceof String) {
            str = (String) obj;
        } else {
            str = null;
        }
        Object obj2 = c828420Wee.LJFF.get("iframeURL");
        if (obj2 instanceof String) {
            str2 = (String) obj2;
        } else {
            str2 = null;
        }
        Object obj3 = c828420Wee.LJFF.get("JSBName");
        if (obj3 instanceof String) {
            str3 = (String) obj3;
        } else {
            str3 = null;
        }
        c0wml.LIZ = new C0WNA(str, str2, str3, c828420Wee);
        C0WM1 c0wm1LIZ = this.LIZ.LIZ(c0wml);
        if (c0wm1LIZ == null) {
            return null;
        }
        return c0wm1LIZ.LIZLLL;
    }
}
