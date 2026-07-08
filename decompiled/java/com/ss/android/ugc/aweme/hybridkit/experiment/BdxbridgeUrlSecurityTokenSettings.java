package com.ss.android.ugc.aweme.hybridkit.experiment;

import X.C09CT;
import X.C1697810uHb;
import com.bytedance.ies.abmock.SettingsManager;
import java.util.List;

/* JADX INFO: loaded from: classes24.dex */
public final class BdxbridgeUrlSecurityTokenSettings {
    public static final BdxbridgeUrlSecurityTokenModel LIZ = new BdxbridgeUrlSecurityTokenModel(true, "!function(){var e='__JSB_SECURITY_TOKEN__',_={fe_hook_v1:!1,fe_hook_v2:!1,fe_use_v1:!1,fe_use_v2:!1,fe_token:e,fe_have_gp:o(),fe_inject_time:Date.now(),fe_runtime_time:!1,fe_runtime_have_gp:o(),fe_cost_time:0,fe_errors:[],fe_code_version:'1.0.0'};window.__jsb_s_inject_data__=_;var t=Boolean(window.ToutiaoJSBridge&&window.ToutiaoJSBridge.invokeMethod);function n(){if(!_.fe_hook_v1){_.fe_hook_v1=!0;var t=e;['__JSBridgeIframe_SetResult__','__JSBridgeIframe_SetResult','__ToutiaoJSBridgeIframe_SetResult__','__ToutiaoJSBridgeIframe_SetResult'].some((function(e){return function(e){var _=document.getElementById(e),n=Boolean(_);n||((_=document.createElement('iframe')).id=e,_.style='display:none');var o=_.src;Object.defineProperty(_,'src',{get:function(){return o},set:function(e){if(o=e,e.indexOf('SCENE_FETCHQUEUE')>-1){var _=e.split('&');return''.concat(_[0],'&').concat(function(e){var _=decodeURIComponent(escape(atob(e))),n=JSON.parse(_);n.forEach((function(e){e.token=t}));var o=JSON.stringify(n);return btoa(unescape(encodeURIComponent(o)))}(_[1]))}return o}}),n||document.documentElement.append(_);return n}(e)}))}}function o(){return void 0!==(window.__globalprops&&window.__globalprops.getGlobalProps)}!function(){if(!t)return _.fe_errors.push('Fails to hook V2 because there is no V2 API'),!1;var i=e,r=function(e){var _=JSON.parse(e);return _.token=i,JSON.stringify(_)},a=window.ToutiaoJSBridge;if('undefined'!=typeof Proxy){!function(e){var _=new Proxy(e,{get:function(e,_){return'invokeMethod'===_?function(t){window.__jsb_s_inject_data__.fe_runtime_time=Date.now(),window.__jsb_s_inject_data__.fe_runtime_have_gp=o(),window.__jsb_s_inject_data__.fe_use_v2=!0;var n=r(t);return e[_](n)}:'_fetchQueue'===_?function(){return n(),window.__jsb_s_inject_data__.fe_runtime_time=Date.now(),window.__jsb_s_inject_data__.fe_runtime_have_gp=o(),window.__jsb_s_inject_data__.fe_use_v1=!0,e[_]()}:e[_]}});window.ToutiaoJSBridge=_}(a)}else{var u=a;Object.defineProperty(window,'ToutiaoJSBridge',{get:function(){return u},set:function(e){var _,t,i;e&&(t=(_=e).invokeMethod,i=_._fetchQueue,Object.defineProperties(_,{invokeMethod:{get:function(){return function(e){var _=r(e);return window.__jsb_s_inject_data__.fe_runtime_time=Date.now(),window.__jsb_s_inject_data__.fe_runtime_have_gp=o(),window.__jsb_s_inject_data__.fe_use_v2=!0,t(_)}},set:function(e){t=e}},_fetchQueue:{get:function(){return function(){return n(),window.__jsb_s_inject_data__.fe_runtime_time=Date.now(),window.__jsb_s_inject_data__.fe_runtime_have_gp=o(),window.__jsb_s_inject_data__.fe_use_v1=!0,i()}},set:function(e){i=e}}}),u=e,Object.defineProperty(window,'ToutiaoJSBridge',{writable:!1,value:u}))}})}_.fe_hook_v2=!0}(),_.fe_cost_time=Date.now()-_.fe_inject_time}();", "__JSB_SECURITY_TOKEN__", false, true, C1697810uHb.LJIIJJI("https://activity.tiktok.com/magic/eco/runtime/release/", "https://inapp.tiktokv.com/falcon/incentive_campaign/task.html", "https://inapp.tiktokv.com/falcon/incentive_campaign/gold_coin.html"), true, true, true, false, false, false);

    public static final class BdxbridgeUrlSecurityTokenModel {

        @C09CT("JSCode")
        public final String JSCode;

        @C09CT("allPageNoTokenCannotPass")
        public final boolean allPageNoTokenCannotPass;

        @C09CT("allPageToInjectJS")
        public final boolean allPageToInjectJS;

        @C09CT("enable")
        public final boolean enable;

        @C09CT("iframeCallCanBePass")
        public final boolean iframeCallCanBePass;

        @C09CT("markNewSolution")
        public final boolean markNewSolution;

        @C09CT("noAuthConfigUseUrl")
        public final boolean noAuthConfigUseUrl;

        @C09CT("noAuthTokenPassUrlList")
        public final List<String> noAuthTokenPassUrlList;

        @C09CT("noTokenUseUrl")
        public final boolean noTokenUseUrl;

        @C09CT("reportAllTokenState")
        public final boolean reportAllTokenState;

        @C09CT("tokenDefine")
        public final String tokenDefine;

        @C09CT("useNewBDXBridgeTask")
        public final boolean useNewBDXBridgeTask;

        public BdxbridgeUrlSecurityTokenModel() {
            this(true, "!function(){var e='__JSB_SECURITY_TOKEN__',_={fe_hook_v1:!1,fe_hook_v2:!1,fe_use_v1:!1,fe_use_v2:!1,fe_token:e,fe_have_gp:o(),fe_inject_time:Date.now(),fe_runtime_time:!1,fe_runtime_have_gp:o(),fe_cost_time:0,fe_errors:[],fe_code_version:'1.0.0'};window.__jsb_s_inject_data__=_;var t=Boolean(window.ToutiaoJSBridge&&window.ToutiaoJSBridge.invokeMethod);function n(){if(!_.fe_hook_v1){_.fe_hook_v1=!0;var t=e;['__JSBridgeIframe_SetResult__','__JSBridgeIframe_SetResult','__ToutiaoJSBridgeIframe_SetResult__','__ToutiaoJSBridgeIframe_SetResult'].some((function(e){return function(e){var _=document.getElementById(e),n=Boolean(_);n||((_=document.createElement('iframe')).id=e,_.style='display:none');var o=_.src;Object.defineProperty(_,'src',{get:function(){return o},set:function(e){if(o=e,e.indexOf('SCENE_FETCHQUEUE')>-1){var _=e.split('&');return''.concat(_[0],'&').concat(function(e){var _=decodeURIComponent(escape(atob(e))),n=JSON.parse(_);n.forEach((function(e){e.token=t}));var o=JSON.stringify(n);return btoa(unescape(encodeURIComponent(o)))}(_[1]))}return o}}),n||document.documentElement.append(_);return n}(e)}))}}function o(){return void 0!==(window.__globalprops&&window.__globalprops.getGlobalProps)}!function(){if(!t)return _.fe_errors.push('Fails to hook V2 because there is no V2 API'),!1;var i=e,r=function(e){var _=JSON.parse(e);return _.token=i,JSON.stringify(_)},a=window.ToutiaoJSBridge;if('undefined'!=typeof Proxy){!function(e){var _=new Proxy(e,{get:function(e,_){return'invokeMethod'===_?function(t){window.__jsb_s_inject_data__.fe_runtime_time=Date.now(),window.__jsb_s_inject_data__.fe_runtime_have_gp=o(),window.__jsb_s_inject_data__.fe_use_v2=!0;var n=r(t);return e[_](n)}:'_fetchQueue'===_?function(){return n(),window.__jsb_s_inject_data__.fe_runtime_time=Date.now(),window.__jsb_s_inject_data__.fe_runtime_have_gp=o(),window.__jsb_s_inject_data__.fe_use_v1=!0,e[_]()}:e[_]}});window.ToutiaoJSBridge=_}(a)}else{var u=a;Object.defineProperty(window,'ToutiaoJSBridge',{get:function(){return u},set:function(e){var _,t,i;e&&(t=(_=e).invokeMethod,i=_._fetchQueue,Object.defineProperties(_,{invokeMethod:{get:function(){return function(e){var _=r(e);return window.__jsb_s_inject_data__.fe_runtime_time=Date.now(),window.__jsb_s_inject_data__.fe_runtime_have_gp=o(),window.__jsb_s_inject_data__.fe_use_v2=!0,t(_)}},set:function(e){t=e}},_fetchQueue:{get:function(){return function(){return n(),window.__jsb_s_inject_data__.fe_runtime_time=Date.now(),window.__jsb_s_inject_data__.fe_runtime_have_gp=o(),window.__jsb_s_inject_data__.fe_use_v1=!0,i()}},set:function(e){i=e}}}),u=e,Object.defineProperty(window,'ToutiaoJSBridge',{writable:!1,value:u}))}})}_.fe_hook_v2=!0}(),_.fe_cost_time=Date.now()-_.fe_inject_time}();", "__JSB_SECURITY_TOKEN__", false, true, C1697810uHb.LJIIJJI("https://activity.tiktok.com/magic/eco/runtime/release/", "https://inapp.tiktokv.com/falcon/incentive_campaign/task.html", "https://inapp.tiktokv.com/falcon/incentive_campaign/gold_coin.html"), true, true, true, false, false, false);
        }

        public BdxbridgeUrlSecurityTokenModel(boolean z, String str, String str2, boolean z2, boolean z3, List<String> list, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9) {
            this.enable = z;
            this.JSCode = str;
            this.tokenDefine = str2;
            this.noTokenUseUrl = z2;
            this.useNewBDXBridgeTask = z3;
            this.noAuthTokenPassUrlList = list;
            this.reportAllTokenState = z4;
            this.iframeCallCanBePass = z5;
            this.noAuthConfigUseUrl = z6;
            this.markNewSolution = z7;
            this.allPageToInjectJS = z8;
            this.allPageNoTokenCannotPass = z9;
        }
    }

    public static final BdxbridgeUrlSecurityTokenModel LIZ() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        BdxbridgeUrlSecurityTokenModel bdxbridgeUrlSecurityTokenModel = LIZ;
        BdxbridgeUrlSecurityTokenModel bdxbridgeUrlSecurityTokenModel2 = (BdxbridgeUrlSecurityTokenModel) settingsManagerLIZLLL.LJIIIIZZ("bdxbridge_url_security_token", BdxbridgeUrlSecurityTokenModel.class, bdxbridgeUrlSecurityTokenModel);
        return bdxbridgeUrlSecurityTokenModel2 != null ? bdxbridgeUrlSecurityTokenModel2 : bdxbridgeUrlSecurityTokenModel;
    }
}
