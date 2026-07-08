package com.bytedance.pumbaa.hybrid.rasp.jsb;

import X.C0WL8;
import X.C0WL9;
import X.C0WLA;
import X.C0WLK;
import X.C2097608Jq;
import X.C821780WLo;
import X.C821850WLv;
import X.C828420Wee;
import X.EnumC821670WLd;
import android.webkit.WebView;
import com.bytedance.hybrid.spark.security.api.protocols.SparkSecurityJSBService;
import com.bytedance.pumbaa.hybrid.rasp.api.BridgeConfig;
import com.bytedance.pumbaa.hybrid.rasp.api.NavigationConfig;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Pair;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public final class JSBridgeRASPServiceImpl implements SparkSecurityJSBService {
    public final C0WLK LIZ;
    public final C0WL8 LIZIZ;

    @Override // com.bytedance.hybrid.spark.security.api.protocols.SparkSecurityService
    public boolean interceptable() {
        return false;
    }

    public final Pair<Boolean, String> LIZ(C828420Wee c828420Wee) {
        String str;
        String str2;
        Object obj = c828420Wee.LJFF.get("engineView");
        Object obj2 = c828420Wee.LJFF.get("URL");
        JSONObject jSONObject = null;
        if (obj2 instanceof String) {
            str = (String) obj2;
        } else {
            str = null;
        }
        if (obj == null) {
            return new Pair<>(Boolean.FALSE, null);
        }
        if (str == null) {
            return new Pair<>(Boolean.FALSE, null);
        }
        if (obj instanceof WebView) {
            str2 = "H5";
        } else {
            str2 = "LYNX";
        }
        String str3 = (String) c828420Wee.LJFF.get("JSINameSpace");
        String str4 = (String) c828420Wee.LJFF.get("JSIMethodName");
        String str5 = (String) c828420Wee.LJFF.get("JavascriptInterfaceModuleName");
        String str6 = (String) c828420Wee.LJFF.get("JSBName");
        String str7 = (String) c828420Wee.LJFF.get("JSBNameSpace");
        boolean zBooleanValue = ((Boolean) c828420Wee.LJFF.get("isAsync")).booleanValue();
        Object obj3 = c828420Wee.LJFF.get("JSBParamModel");
        if (obj3 instanceof JSONObject) {
            jSONObject = (JSONObject) obj3;
        }
        if (str7 == null) {
            str7 = "";
        }
        return C0WL9.LIZ(this.LIZIZ, new C0WLA(null, str6, str7, zBooleanValue, null, jSONObject, str, str3, str5, str4, null, null, null, null, str2, null, null, 979153));
    }

    @Override // com.bytedance.hybrid.spark.security.api.protocols.SparkSecurityJSBService
    public C821850WLv handleDidExecuteJSBridgeMethodEvent(C828420Wee c828420Wee) {
        return new C821850WLv(false, null);
    }

    @Override // com.bytedance.hybrid.spark.security.api.protocols.SparkSecurityJSBService
    public C821850WLv handleWillExecuteJSBridgeMethodEvent(C828420Wee c828420Wee) {
        boolean z;
        BridgeConfig bridgeConfig;
        NavigationConfig navigationConfig;
        C0WLK c0wlk = this.LIZ;
        if (c0wlk != null && (navigationConfig = c0wlk.LIZIZ) != null && !navigationConfig.enableRasp) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        if (c0wlk != null && (bridgeConfig = c0wlk.LIZ) != null && !bridgeConfig.raspSecurityEnable) {
            return null;
        }
        try {
            Pair<Boolean, String> pairLIZ = LIZ(c828420Wee);
            if (!pairLIZ.getFirst().booleanValue()) {
                return new C821850WLv(false, null);
            }
            String second = pairLIZ.getSecond();
            C821850WLv c821850WLv = new C821850WLv(true, null);
            c821850WLv.LJ = new C821780WLo(EnumC821670WLd.JSB_RASP_BLOCKED, C2097608Jq.LJIIJ(new Pair("strategyId", second)));
            return c821850WLv;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return new C821850WLv(false, null);
        }
    }

    public JSBridgeRASPServiceImpl(C0WLK c0wlk, C0WL8 c0wl8) {
        this.LIZ = c0wlk;
        this.LIZIZ = c0wl8;
    }
}
