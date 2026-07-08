package com.bytedance.pumbaa.hybrid.governance.jsi;

import X.C09CT;
import X.C1697810uHb;
import X.C2188811AlT;
import com.bytedance.pumbaa.hybrid.governance.api.BaseGovernanceModel;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes36.dex */
public final class PnsJsiConfigModel extends BaseGovernanceModel {

    @C09CT("allAllowList")
    public final List<String> allAllowList;

    @C09CT("firstPartyList")
    public final List<String> firstPartyList;

    @C09CT("thirdPartyList")
    public final List<ThirdPartyJSIItem> thirdPartyList;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PnsJsiConfigModel)) {
            return false;
        }
        PnsJsiConfigModel pnsJsiConfigModel = (PnsJsiConfigModel) obj;
        return Intrinsics.LJFF(this.allAllowList, pnsJsiConfigModel.allAllowList) && Intrinsics.LJFF(this.firstPartyList, pnsJsiConfigModel.firstPartyList) && Intrinsics.LJFF(this.thirdPartyList, pnsJsiConfigModel.thirdPartyList);
    }

    public final int hashCode() {
        return (((this.allAllowList.hashCode() * 31) + this.firstPartyList.hashCode()) * 31) + this.thirdPartyList.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PnsJsiConfigModel(allAllowList=");
        sbLIZ.append(this.allAllowList);
        sbLIZ.append(", firstPartyList=");
        sbLIZ.append(this.firstPartyList);
        sbLIZ.append(", thirdPartyList=");
        sbLIZ.append(this.thirdPartyList);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public PnsJsiConfigModel() {
        this(C1697810uHb.LJIILJJIL("com.ss.android.ugc.aweme.checkout.ShopifyCheckoutMessageBridge#postMessage", "com.ss.android.ugc.aweme.compliance.sandbox.webview.TTHYBRIDXHR#postMessage", "InJavaScriptLocalObj#showSource", "JSInterface#getManifest", "JSInterface#getPageConfig", "com.bytedance.sdk.xbridge.protocol.impl.web.JSB2Impl#invokeMethod", "com.bytedance.sdk.xbridge.protocol.impl.web.JSB3Impl#_invokeMethod", "com.bytedance.sdk.xbridge.protocol.impl.web.JSB3Impl#call", "com.bytedance.sdk.xbridge.protocol.impl.web.JSB4Impl#_invokeMethod", "com.bytedance.ies.web.jsbridge2.WebViewBridge#invokeMethod", "com.bytedance.ies.bullet.service.webkit.GlobalProps#getGlobalProps", "com.bytedance.lynx.hybrid.webkit.GlobalProps#getGlobalProps", "com.ss.android.ugc.aweme.hybridkit.web.hooks.RestrictiveRuleReporter#reportRestrictiveRule", "JSInterface#postMessage", "com.bytedance.hybrid.spark.security.web_js.core.WJSIReport#postMessage", "com.ss.android.ugc.aweme.compliance.sandbox.webview.WebViewInterceptReport#postMessage", "com.ss.android.anywheredoor.core.jsbridge.ArenaJSBridge#invokeMethod", "Callback#on", "LogBoxCallback#postMessage", "#handle", "JSBridge#findAll", "#communicateToPlatform", "#hdtLighthouseInfo", "#log", "#emitVConsoleReady", "com.bytedance.sdk.bridge.js.delegate.JavaScriptInterfaceModule#call", "com.bytedance.sdk.bridge.js.delegate.JavaScriptInterfaceModule#callSync", "com.bytedance.sdk.bridge.js.delegate.JavaScriptInterfaceModule#_invokeMethod", "com.facebook.appevents.FacebookSDKJSInterface#sendEvent"), C1697810uHb.LJIILJJIL("com.bytedance.android.monitorV2.webview.WebViewMonitorJsBridge#request", "com.bytedance.android.monitorV2.webview.WebViewMonitorJsBridge#sendInitTimeInfo", "com.bytedance.android.monitorV2.webview.WebViewMonitorJsBridge#terminatedPreCollect", "com.bytedance.android.monitorV2.webview.WebViewMonitorJsBridge#traceMark", "com.bytedance.android.monitorV2.webview.WebViewMonitorJsBridge#batch", "com.bytedance.android.monitorV2.webview.WebViewMonitorJsBridge#config", "com.bytedance.android.monitorV2.webview.WebViewMonitorJsBridge#cover", "com.bytedance.android.monitorV2.webview.WebViewMonitorJsBridge#customReport", "com.bytedance.android.monitorV2.webview.WebViewMonitorJsBridge#injectJS", "com.bytedance.android.monitorV2.webview.WebViewMonitorJsBridge#reportDirectly", "com.bytedance.android.monitorV2.webview.WebViewMonitorJsBridge#reportPageLatestData", "com.bytedance.android.monitorV2.webview.WebViewMonitorJsBridge#reportPiaInfo", "com.bytedance.android.monitorV2.webview.WebViewMonitorJsBridge#reportVerifiedData", "com.bytedance.android.monitorV2.webview.WebViewMonitorJsBridge#getInfo", "com.bytedance.android.monitorV2.webview.WebViewMonitorJsBridge#getVersion", "com.bytedance.android.monitor.webview.WebViewMonitorJsBridge#batch", "com.bytedance.android.monitor.webview.WebViewMonitorJsBridge#cover", "com.bytedance.android.monitor.webview.WebViewMonitorJsBridge#customReport", "com.bytedance.android.monitor.webview.WebViewMonitorJsBridge#injectJS", "com.bytedance.android.monitor.webview.WebViewMonitorJsBridge#reportDirectly", "com.bytedance.android.monitor.webview.WebViewMonitorJsBridge#reportPageLatestData", "com.bytedance.android.monitor.webview.WebViewMonitorJsBridge#sendInitTimeInfo", "com.bytedance.android.monitor.webview.WebViewMonitorJsBridge#getVersion", "AndroidJsInterface#callMethodParams", "AndroidJsInterface#offMethodParams", "AndroidJsInterface#onMethodParams", "JS2NativeInterface#_invokeMethod", "com.ss.android.ugc.aweme.i18n.xbridge.compliance.bridge.route.PnsWebApIInterface#historyGo"), C1697810uHb.LJIILJJIL(new ThirdPartyJSIItem("com.ss.android.ugc.aweme.amazon.AmazonShopWebInterfaceHandler#postMessage", C1697810uHb.LJIILJJIL(".amazon.com", "shop-external.amazon"))));
    }

    public PnsJsiConfigModel(List<String> list, List<String> list2, List<ThirdPartyJSIItem> list3) {
        super(null, false, false, false, false);
        this.allAllowList = list;
        this.firstPartyList = list2;
        this.thirdPartyList = list3;
    }
}
