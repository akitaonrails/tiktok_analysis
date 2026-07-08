package com.bytedance.hybrid.spark.security.web_js.core;

import X.C1537480q70;
import X.C1544840qIs;
import X.C1BVM;
import X.C1E6B;
import X.C1E6N;
import X.C2188811AlT;
import X.C821850WLv;
import X.C828420Wee;
import X.InterfaceC1531560pxS;
import X.InterfaceC1541990qEH;
import android.view.ViewParent;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import com.bytedance.hybrid.spark.security.api.SparkSecurityServiceCenter;
import com.bytedance.hybrid.spark.security.api.protocols.SparkSecurityJSIService;
import com.bytedance.hybrid.spark.security.api.protocols.SparkSecurityJSInjectionService;
import com.bytedance.lynx.hybrid.param.HybridSchemaParam;
import com.bytedance.lynx.hybrid.webkit.WebKitView;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.text.u;

/* JADX INFO: loaded from: classes14.dex */
public final class JSInjectionProviderExt extends C1BVM {
    public JSInjectionProviderExt() {
        super(3);
    }

    @Override // X.C1BVM, X.InterfaceC1548170qOF
    public final String LIZ() {
        return "JSInjectionProviderExt";
    }

    @Override // X.C1BVM
    public final void LJIIJJI(String str) {
        int iIntValue;
        WebKitView webKitView;
        C1537480q70 hybridContext;
        String str2;
        if (str != null && str.length() != 0 && u.LJJIIJZLJL(str, "javascript:", false)) {
            Object tag = this.LLILZIL.getTag(R.id.vsq);
            Integer numValueOf = null;
            if (!(tag instanceof String) || (str2 = (String) tag) == null || str2.length() == 0) {
                WebView webView = this.LLILZIL;
                if ((webView instanceof WebKitView) && (webKitView = (WebKitView) webView) != null && (hybridContext = webKitView.getHybridContext()) != null) {
                    numValueOf = Integer.valueOf(hybridContext.LJ());
                }
                WebView webView2 = this.LLILZIL;
                SparkSecurityJSInjectionService sparkSecurityJSInjectionService = (SparkSecurityJSInjectionService) SparkSecurityServiceCenter.INSTANCE.protocol();
                C828420Wee c828420Wee = new C828420Wee(C1E6N.SparkSecuritySolutionEndpointNative, C1E6N.SparkSecuritySolutionEndpointWebView, C1E6B.SparkSecuritySolutionChannelJSExecution);
                Map<String, Object> map = c828420Wee.LJFF;
                if (numValueOf != null) {
                    iIntValue = numValueOf.intValue();
                } else {
                    iIntValue = 0;
                }
                map.put("dataflowId", Integer.valueOf(iIntValue));
                c828420Wee.LJFF.put("URL", str);
                c828420Wee.LJFF.put("inject_script", str);
                c828420Wee.LJFF.put("engine_view", webView2);
                C821850WLv c821850WLvHandleWillLoadURLWithScriptWithEvent = sparkSecurityJSInjectionService.handleWillLoadURLWithScriptWithEvent(c828420Wee);
                if (c821850WLvHandleWillLoadURLWithScriptWithEvent != null && c821850WLvHandleWillLoadURLWithScriptWithEvent.LIZ) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("reject by spark security solution. URL: ");
                    sbLIZ.append(str);
                    C1544840qIs.LIZJ(C2188811AlT.LIZIZ(sbLIZ));
                    return;
                }
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("inject by native API loadUrl. URL: ");
                sbLIZ2.append(str);
                C1544840qIs.LIZJ(C2188811AlT.LIZIZ(sbLIZ2));
                super.LJIIJJI(str);
                return;
            }
        }
        super.LJIIJJI(str);
    }

    @Override // X.C1BVM
    public final void LIZIZ(Object obj, String str) {
        InterfaceC1541990qEH interfaceC1541990qEH;
        C1537480q70 hybridContext;
        HybridSchemaParam hybridSchemaParamLIZJ;
        SparkSecurityJSIService sparkSecurityJSIService = (SparkSecurityJSIService) SparkSecurityServiceCenter.INSTANCE.protocol();
        C828420Wee c828420Wee = new C828420Wee(C1E6N.SparkSecuritySolutionEndpointNative, C1E6N.SparkSecuritySolutionEndpointWebView, C1E6B.SparkSecuritySolutionJSI);
        Map<String, Object> map = c828420Wee.LJFF;
        String url = this.LLILZIL.getUrl();
        String str2 = "";
        if (url == null) {
            url = "";
        }
        map.put("URL", url);
        c828420Wee.LJFF.put("dataflowId", 0);
        ViewParent viewParent = this.LLILZIL;
        if (viewParent instanceof InterfaceC1541990qEH) {
            interfaceC1541990qEH = (InterfaceC1541990qEH) viewParent;
        } else {
            interfaceC1541990qEH = null;
        }
        if (interfaceC1541990qEH != null && (hybridContext = interfaceC1541990qEH.getHybridContext()) != null) {
            InterfaceC1531560pxS interfaceC1531560pxS = hybridContext.hybridParams;
            if (interfaceC1531560pxS != null && (hybridSchemaParamLIZJ = interfaceC1531560pxS.LIZJ()) != null) {
                Map<String, Object> map2 = c828420Wee.LJFF;
                String url2 = hybridSchemaParamLIZJ.getUrl();
                if (url2.length() == 0) {
                    url2 = hybridSchemaParamLIZJ.getSurl();
                }
                map2.put("URL", url2);
            } else {
                String strLJIJI = hybridContext.LJIJI();
                if (u.LJJIIJZLJL(strLJIJI, "http", false) && strLJIJI != null) {
                    c828420Wee.LJFF.put("URL", strLJIJI);
                }
            }
            c828420Wee.LJFF.put("dataflowId", Integer.valueOf(hybridContext.LJ()));
        }
        Map<String, Object> map3 = c828420Wee.LJFF;
        if (str != null) {
            str2 = str;
        }
        map3.put("jsi_name", str2);
        c828420Wee.LJFF.put("jsi_object", obj);
        C821850WLv c821850WLvHandleWillAddJavascriptInterface = sparkSecurityJSIService.handleWillAddJavascriptInterface(c828420Wee);
        if (c821850WLvHandleWillAddJavascriptInterface != null && c821850WLvHandleWillAddJavascriptInterface.LIZ) {
            return;
        }
        super.LIZIZ(obj, str);
    }

    @Override // X.C1BVM
    public final void LJFF(String str, ValueCallback<String> valueCallback) {
        int iIntValue;
        WebKitView webKitView;
        C1537480q70 hybridContext;
        String str2;
        String url = this.LLILZIL.getUrl();
        if (url != null && url.length() != 0 && str != null && str.length() != 0) {
            Object tag = this.LLILZIL.getTag(R.id.vsq);
            Integer numValueOf = null;
            if (!(tag instanceof String) || (str2 = (String) tag) == null || str2.length() == 0) {
                WebView webView = this.LLILZIL;
                if ((webView instanceof WebKitView) && (webKitView = (WebKitView) webView) != null && (hybridContext = webKitView.getHybridContext()) != null) {
                    numValueOf = Integer.valueOf(hybridContext.LJ());
                }
                WebView webView2 = this.LLILZIL;
                SparkSecurityJSInjectionService sparkSecurityJSInjectionService = (SparkSecurityJSInjectionService) SparkSecurityServiceCenter.INSTANCE.protocol();
                C828420Wee c828420Wee = new C828420Wee(C1E6N.SparkSecuritySolutionEndpointNative, C1E6N.SparkSecuritySolutionEndpointWebView, C1E6B.SparkSecuritySolutionChannelJSExecution);
                Map<String, Object> map = c828420Wee.LJFF;
                if (numValueOf != null) {
                    iIntValue = numValueOf.intValue();
                } else {
                    iIntValue = 0;
                }
                map.put("dataflowId", Integer.valueOf(iIntValue));
                c828420Wee.LJFF.put("URL", url);
                c828420Wee.LJFF.put("inject_script", str);
                c828420Wee.LJFF.put("engine_view", webView2);
                C821850WLv c821850WLvHandleWillEvaluateJSWithEvent = sparkSecurityJSInjectionService.handleWillEvaluateJSWithEvent(c828420Wee);
                if (c821850WLvHandleWillEvaluateJSWithEvent != null && c821850WLvHandleWillEvaluateJSWithEvent.LIZ) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("reject by spark security solution. URL: ");
                    sbLIZ.append(url);
                    C1544840qIs.LIZJ(C2188811AlT.LIZIZ(sbLIZ));
                    return;
                }
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("inject by native API evaluateJavaScript. URL: ");
                sbLIZ2.append(url);
                C1544840qIs.LIZJ(C2188811AlT.LIZIZ(sbLIZ2));
                super.LJFF(str, valueCallback);
                return;
            }
        }
        super.LJFF(str, valueCallback);
    }
}
