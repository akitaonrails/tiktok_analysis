package com.bytedance.pumbaa.hybrid.governance.jsinjection.settings;

import X.C09CT;
import X.C1697810uHb;
import X.C2188811AlT;
import com.bytedance.pumbaa.hybrid.governance.api.BaseGovernanceModel;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes36.dex */
public final class JsInjectionWhiteListSettings {
    public static final InjectJsGuardConfig LIZ = new InjectJsGuardConfig(40, C1697810uHb.LJIILJJIL(new JsDigest(691, "288cbfd135797512aad91e1dc04b338f")), C1697810uHb.LJIILJJIL("com.byted.mgl.MglOluv"), C1697810uHb.LJIILJJIL("encodeURIComponent(document.documentElement.outerHTML)", "!function(){\"use strict\";", "javascript:(function(){   const iframe = document.querySelector(", "javascript:window.location.href=bytedance://adPageHtmlContent", "javascript:window.dialogPopUp()", "javascript:ToutiaoJSBridge", "javascript:window.ToutiaoJSBridge", "javascript:Native2JSBridge", "javascript:window.Native2JSBridge", "javascript:BDXBridge", "javascript:window.BDXBridge", "javascript:if(window.JSBridge", "ArenaJSBridge._handleMessageFromToutiao", "javascript:(function () {    window.reactId", "javascript: function getMetaContent(name) {", "javascript:(function extra(){", "(function() {        try {            var elementList", "ttJSBridge.", "(function () {\n  var _isAndroid", "\"use strict\";(function(){function perfReport", "window.__autoFillCallback__(", "window.__AutoFillPopupClose__()", "javascript:var _0x44e2=", "function t(t,e,n,r){return new(n||(n=Promise)", "!function(){\"use strict\";var t=-1,e=function(e){addEventListener", "[].forEach.call(document.querySelectorAll('audio,video')"));

    public static final class InjectJsGuardConfig extends BaseGovernanceModel {

        @C09CT("hybrid_container_white_list")
        public final List<String> hybridContainerWhiteList;

        @C09CT("js_digest_white_list")
        public final List<JsDigest> jsDigestWhiteList;

        @C09CT("js_prefix_white_list")
        public final List<String> jsPrefixWhiteList;

        @C09CT("short_len")
        public final int scriptClipLength;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InjectJsGuardConfig)) {
                return false;
            }
            InjectJsGuardConfig injectJsGuardConfig = (InjectJsGuardConfig) obj;
            return this.scriptClipLength == injectJsGuardConfig.scriptClipLength && Intrinsics.LJFF(this.jsDigestWhiteList, injectJsGuardConfig.jsDigestWhiteList) && Intrinsics.LJFF(this.hybridContainerWhiteList, injectJsGuardConfig.hybridContainerWhiteList) && Intrinsics.LJFF(this.jsPrefixWhiteList, injectJsGuardConfig.jsPrefixWhiteList);
        }

        public final int hashCode() {
            return (((((this.scriptClipLength * 31) + this.jsDigestWhiteList.hashCode()) * 31) + this.hybridContainerWhiteList.hashCode()) * 31) + this.jsPrefixWhiteList.hashCode();
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("InjectJsGuardConfig(scriptClipLength=");
            sbLIZ.append(this.scriptClipLength);
            sbLIZ.append(", jsDigestWhiteList=");
            sbLIZ.append(this.jsDigestWhiteList);
            sbLIZ.append(", hybridContainerWhiteList=");
            sbLIZ.append(this.hybridContainerWhiteList);
            sbLIZ.append(", jsPrefixWhiteList=");
            sbLIZ.append(this.jsPrefixWhiteList);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public InjectJsGuardConfig() {
            this(40, C1697810uHb.LJIILJJIL(new JsDigest(691, "288cbfd135797512aad91e1dc04b338f")), C1697810uHb.LJIILJJIL("com.byted.mgl.MglOluv"), C1697810uHb.LJIILJJIL("encodeURIComponent(document.documentElement.outerHTML)", "!function(){\"use strict\";", "javascript:(function(){   const iframe = document.querySelector(", "javascript:window.location.href=bytedance://adPageHtmlContent", "javascript:window.dialogPopUp()", "javascript:ToutiaoJSBridge", "javascript:window.ToutiaoJSBridge", "javascript:Native2JSBridge", "javascript:window.Native2JSBridge", "javascript:BDXBridge", "javascript:window.BDXBridge", "javascript:if(window.JSBridge", "ArenaJSBridge._handleMessageFromToutiao", "javascript:(function () {    window.reactId", "javascript: function getMetaContent(name) {", "javascript:(function extra(){", "(function() {        try {            var elementList", "ttJSBridge.", "(function () {\n  var _isAndroid", "\"use strict\";(function(){function perfReport", "window.__autoFillCallback__(", "window.__AutoFillPopupClose__()", "javascript:var _0x44e2=", "function t(t,e,n,r){return new(n||(n=Promise)", "!function(){\"use strict\";var t=-1,e=function(e){addEventListener", "[].forEach.call(document.querySelectorAll('audio,video')"));
        }

        public InjectJsGuardConfig(int i, List<JsDigest> list, List<String> list2, List<String> list3) {
            super(null, false, false, false, false);
            this.scriptClipLength = i;
            this.jsDigestWhiteList = list;
            this.hybridContainerWhiteList = list2;
            this.jsPrefixWhiteList = list3;
        }
    }

    /* JADX INFO: loaded from: classes14.dex */
    public static final class JsDigest {

        @C09CT("val")
        public final String digest;

        @C09CT("len")
        public final int len;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof JsDigest)) {
                return false;
            }
            JsDigest jsDigest = (JsDigest) obj;
            return this.len == jsDigest.len && Intrinsics.LJFF(this.digest, jsDigest.digest);
        }

        public JsDigest(int i, String str) {
            this.len = i;
            this.digest = str;
        }
    }
}
