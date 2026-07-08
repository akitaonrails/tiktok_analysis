package com.bytedance.pumbaa.hybrid.governance.jsi;

import X.C0WM1;
import X.C0WMH;
import X.C0WMP;
import X.C0WN9;
import X.C821850WLv;
import X.C828420Wee;
import com.bytedance.hybrid.spark.security.api.protocols.SparkSecurityJSIService;

/* JADX INFO: loaded from: classes14.dex */
public final class JavaScriptInterfaceGovServiceImpl implements SparkSecurityJSIService {
    public final C0WMH LIZ;

    @Override // com.bytedance.hybrid.spark.security.api.protocols.SparkSecurityService
    public boolean interceptable() {
        return true;
    }

    public JavaScriptInterfaceGovServiceImpl(C0WMH c0wmh) {
        this.LIZ = c0wmh;
    }

    @Override // com.bytedance.hybrid.spark.security.api.protocols.SparkSecurityJSIService
    public C821850WLv handleWillAddJavascriptInterface(C828420Wee c828420Wee) {
        String str;
        String str2;
        int iIntValue;
        Integer num;
        C0WMP c0wmp = new C0WMP();
        Object obj = c828420Wee.LJFF.get("URL");
        if (obj instanceof String) {
            str = (String) obj;
        } else {
            str = null;
        }
        Object obj2 = c828420Wee.LJFF.get("jsi_object");
        Object obj3 = c828420Wee.LJFF.get("jsi_name");
        if (obj3 instanceof String) {
            str2 = (String) obj3;
        } else {
            str2 = null;
        }
        Object obj4 = c828420Wee.LJFF.get("dataflowId");
        if ((obj4 instanceof Integer) && (num = (Integer) obj4) != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        c0wmp.LIZ = new C0WN9(str, obj2, str2, iIntValue, c828420Wee);
        C0WM1 c0wm1LIZ = this.LIZ.LIZ(c0wmp);
        if (c0wm1LIZ == null) {
            return null;
        }
        return c0wm1LIZ.LIZLLL;
    }
}
