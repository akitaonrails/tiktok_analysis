package com.bytedance.pumbaa.hybrid.governance.jsinjection;

import X.C04TD;
import X.C08XD;
import X.C0WM7;
import X.C0WMA;
import X.C0WMB;
import X.C0WMJ;
import X.C0WMY;
import X.C0WN8;
import X.C1697810uHb;
import X.InterfaceC821980WMi;
import Y.AComparatorS32S0000000_13;
import Y.AComparatorS512S0100000_13;
import com.bytedance.hybrid.spark.security.api.SparkSecurityServiceCenter;
import com.bytedance.hybrid.spark.security.api.protocols.SparkSecurityJSInjectionService;
import com.bytedance.hybrid.spark.security.web_js.setting.JSInjectConfig;
import com.bytedance.pumbaa.governance.tool.api.IControlService;
import com.bytedance.pumbaa.governance.tool.model.ControlStrategy;
import com.bytedance.pumbaa.hybrid.governance.api.BaseGovernanceModel;
import com.bytedance.pumbaa.hybrid.governance.api.IHybridJsInjectionGovService;
import com.bytedance.pumbaa.hybrid.governance.api.config.IframeConfigItem;
import com.bytedance.pumbaa.hybrid.governance.jsinjection.settings.BlackItem;
import com.bytedance.pumbaa.hybrid.governance.jsinjection.settings.JsInjectionBlackListConfig;
import com.bytedance.pumbaa.hybrid.governance.jsinjection.settings.JsInjectionWhiteListSettings;
import com.bytedance.scene.Scene;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.text.a0;
import org.json.JSONException;
import org.json.JSONObject;
import ttpobfuscated.e3;

/* JADX INFO: loaded from: classes14.dex */
public final class HybridGovJSInjectionServiceImpl extends C0WM7<C0WMY> implements IHybridJsInjectionGovService {
    public C0WMJ LIZ;

    public static IHybridJsInjectionGovService LJ() {
        Object objLIZ = C04TD.LIZ(IHybridJsInjectionGovService.class, false);
        if (objLIZ != null) {
            return (IHybridJsInjectionGovService) objLIZ;
        }
        if (C04TD.LJJJJIZL == null) {
            synchronized (IHybridJsInjectionGovService.class) {
                if (C04TD.LJJJJIZL == null) {
                    C04TD.LJJJJIZL = new HybridGovJSInjectionServiceImpl();
                }
            }
        }
        return C04TD.LJJJJIZL;
    }

    @Override // com.bytedance.pumbaa.hybrid.governance.api.IHybridGovService
    public final C0WN8 LIZIZ() {
        return C0WN8.JSInjection;
    }

    @Override // X.C0WM7, com.bytedance.pumbaa.hybrid.governance.api.IHybridGovService
    public final void LIZJ(C0WMB c0wmb) {
        C0WMJ c0wmj = this.LIZ;
        if (c0wmj != null) {
            ((ArrayList) c0wmj.LIZ).remove(c0wmb);
            C08XD.LJJ(c0wmj.LIZ, new AComparatorS512S0100000_13(new AComparatorS32S0000000_13(41), 7));
        }
    }

    @Override // X.C0WM7
    public final void LIZLLL(C0WMY c0wmy) {
        final C0WMY c0wmy2 = c0wmy;
        if (c0wmy2 != null && !c0wmy2.LIZ) {
            return;
        }
        C0WMJ c0wmj = new C0WMJ(C1697810uHb.LJIIJJI(new InterfaceC821980WMi(c0wmy2) { // from class: X.0WMf
            public final C0WMY LIZ;

            @Override // X.C0WMB
            public final BaseGovernanceModel LIZIZ() {
                JsInjectionWhiteListSettings.InjectJsGuardConfig injectJsGuardConfig = JsInjectionWhiteListSettings.LIZ;
                JsInjectionWhiteListSettings.InjectJsGuardConfig injectJsGuardConfig2 = JsInjectionWhiteListSettings.LIZ;
                BaseGovernanceModel baseGovernanceModel = (BaseGovernanceModel) C821960WMg.LIZ(JsInjectionWhiteListSettings.InjectJsGuardConfig.class, "inject_js_guard_settings", injectJsGuardConfig2);
                return baseGovernanceModel != null ? baseGovernanceModel : injectJsGuardConfig2;
            }

            @Override // X.C0WMB
            public final C0WMF LIZLLL() {
                return new C0WMF("JSInjectionWhiteListAction", C0WN8.JSInjection, C0WNE.L3, 2, 16);
            }

            {
                this.LIZ = c0wmy2;
            }

            /* JADX WARN: Removed duplicated region for block: B:70:0x00fb  */
            @Override // X.C0WMB
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final X.C0WM1 LJ(X.C0WMD r16) throws org.json.JSONException {
                /*
                    Method dump skipped, instruction units count: 407
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C821950WMf.LJ(X.0WMD):X.0WM1");
            }
        }, new InterfaceC821980WMi(c0wmy2) { // from class: X.0WMc
            public final C0WMY LIZ;

            @Override // X.C0WMB
            public final BaseGovernanceModel LIZIZ() {
                JsInjectionBlackListConfig jsInjectionBlackListConfig = C1201104mv.LIZ;
                BaseGovernanceModel baseGovernanceModel = (BaseGovernanceModel) C821960WMg.LIZ(JsInjectionBlackListConfig.class, "pns_js_injection_blacklist", jsInjectionBlackListConfig);
                return baseGovernanceModel != null ? baseGovernanceModel : jsInjectionBlackListConfig;
            }

            @Override // X.C0WMB
            public final C0WMF LIZLLL() {
                return new C0WMF("JSInjectionBlackListAction", C0WN8.JSInjection, C0WNE.L3, 0, 16);
            }

            {
                this.LIZ = c0wmy2;
            }

            @Override // X.C0WMB
            public final C0WM1 LJ(C0WMD c0wmd) throws JSONException {
                C821940WMe c821940WMe;
                String str;
                JSInjectConfig jSInjectConfig;
                InterfaceC1094604Pw interfaceC1094604Pw;
                List<String> list;
                Object objLIZ = c0wmd.LIZ();
                if (!(objLIZ instanceof C821940WMe) || (c821940WMe = (C821940WMe) objLIZ) == null) {
                    return null;
                }
                C0WMZ c0wmz = c821940WMe.LIZ;
                if ((c0wmz != C0WMZ.EVALUATE_BY_JS_INJECT_SDK && c0wmz != C0WMZ.INIT_SCRIPT_BY_JS_INJECT_SDK) || c821940WMe.LJII || (str = c821940WMe.LIZJ) == null || (jSInjectConfig = c821940WMe.LJFF) == null) {
                    return null;
                }
                String str2 = c821940WMe.LJIIIIZZ;
                if (str2 != null) {
                    str = str2;
                }
                JsInjectionBlackListConfig jsInjectionBlackListConfig = C1201104mv.LIZ;
                JsInjectionBlackListConfig jsInjectionBlackListConfig2 = (JsInjectionBlackListConfig) C821960WMg.LIZ(JsInjectionBlackListConfig.class, "pns_js_injection_blacklist", jsInjectionBlackListConfig);
                if (jsInjectionBlackListConfig2 != null) {
                    jsInjectionBlackListConfig = jsInjectionBlackListConfig2;
                }
                String str3 = jSInjectConfig.name;
                List<BlackItem> list2 = jsInjectionBlackListConfig.blackList;
                if (list2 != null) {
                    for (BlackItem blackItem : list2) {
                        String str4 = blackItem.url;
                        if (str4 != null && str4.length() != 0) {
                            if (a0.LJJIIZI(str, blackItem.url, true) && ((list = blackItem.names) == null || list.isEmpty() || (str3 != null && str3.length() != 0 && blackItem.names.contains(str3)))) {
                                C821850WLv c821850WLv = new C821850WLv(true, C2097908Jt.LIZJ(new Pair("error", new C821880WLy(101, "hit pns global black list"))));
                                JSONObject jSONObject = new JSONObject();
                                jSONObject.put("injectName", jSInjectConfig.name);
                                jSONObject.put("dataflowId", c821940WMe.LJI);
                                LIZLLL();
                                jSONObject.put(Scene.SCENE_SERVICE, "JSInjectionBlackListAction");
                                return new C0WM1(true, jSONObject, jSONObject, c821850WLv);
                            }
                        } else {
                            List<String> list3 = blackItem.names;
                            if (list3 != null && !list3.isEmpty() && str3 != null && str3.length() != 0 && blackItem.names.contains(str3)) {
                                C821850WLv c821850WLv2 = new C821850WLv(true, C2097908Jt.LIZJ(new Pair("error", new C821880WLy(101, "hit pns global black list"))));
                                JSONObject jSONObject2 = new JSONObject();
                                jSONObject2.put("injectName", jSInjectConfig.name);
                                jSONObject2.put("dataflowId", c821940WMe.LJI);
                                LIZLLL();
                                jSONObject2.put(Scene.SCENE_SERVICE, "JSInjectionBlackListAction");
                                return new C0WM1(true, jSONObject2, jSONObject2, c821850WLv2);
                            }
                        }
                    }
                }
                C0WMY c0wmy3 = this.LIZ;
                if (c0wmy3 != null && (interfaceC1094604Pw = c0wmy3.LIZLLL) != null) {
                    interfaceC1094604Pw.LIZ(c821940WMe.LIZIZ);
                }
                return null;
            }
        }, new InterfaceC821980WMi(c0wmy2) { // from class: X.0WMd
            public final C0WMY LIZ;

            @Override // X.C0WMB
            public final BaseGovernanceModel LIZIZ() {
                return new BaseGovernanceModel(null, true, true, false, false);
            }

            @Override // X.C0WMB
            public final C0WMF LIZLLL() {
                return new C0WMF("JSInjectionIFrameAction", C0WN8.JSInjection, C0WNE.L3, 1, 16);
            }

            {
                this.LIZ = c0wmy2;
            }

            @Override // X.C0WMB
            public final C0WM1 LJ(C0WMD c0wmd) throws JSONException {
                C821940WMe c821940WMe;
                String str;
                int iIntValue;
                List<IframeConfigItem> list;
                IframeConfigItem iframeConfigItem;
                List<IframeConfigItem> list2;
                IframeConfigItem next;
                Object objLIZ = c0wmd.LIZ();
                if (!(objLIZ instanceof C821940WMe) || (c821940WMe = (C821940WMe) objLIZ) == null) {
                    return null;
                }
                C0WMZ c0wmz = c821940WMe.LIZ;
                if ((c0wmz != C0WMZ.EVALUATE_BY_JS_INJECT_SDK && c0wmz != C0WMZ.INIT_SCRIPT_BY_JS_INJECT_SDK) || !c821940WMe.LJII || (str = c821940WMe.LIZJ) == null) {
                    return null;
                }
                String str2 = c821940WMe.LJIIIIZZ;
                if (str2 == null) {
                    str2 = str;
                }
                JSInjectConfig jSInjectConfig = c821940WMe.LJFF;
                if (jSInjectConfig == null) {
                    return null;
                }
                Integer num = c821940WMe.LJI;
                if (num != null) {
                    iIntValue = num.intValue();
                } else {
                    iIntValue = 0;
                }
                IControlService iControlServiceLIZ = C821970WMh.LIZ();
                LIZLLL();
                ControlStrategy controlStrategyLIZ = iControlServiceLIZ.LIZ();
                C821850WLv c821850WLv = new C821850WLv(false, C2097908Jt.LIZJ(new Pair("info", "inject success")));
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("canInjectJudgeByIframeList -> injectKey: ");
                sbLIZ.append(jSInjectConfig.name);
                sbLIZ.append(", strategy:");
                sbLIZ.append(controlStrategyLIZ);
                sbLIZ.append(" config: ");
                C0WMY c0wmy3 = this.LIZ;
                if (c0wmy3 != null) {
                    list = c0wmy3.LIZJ;
                } else {
                    list = null;
                }
                sbLIZ.append(list);
                sbLIZ.append(", iframeUrl: ");
                sbLIZ.append(str);
                sbLIZ.append(", mainframeUrl: ");
                sbLIZ.append(str2);
                C2188811AlT.LIZIZ(sbLIZ);
                C0WMY c0wmy4 = this.LIZ;
                if (c0wmy4 != null && (list2 = c0wmy4.LIZJ) != null) {
                    Iterator<IframeConfigItem> it2 = list2.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            next = it2.next();
                            if (next.jsName.contains(jSInjectConfig.name)) {
                                break;
                            }
                        } else {
                            next = null;
                            break;
                        }
                    }
                    iframeConfigItem = next;
                } else {
                    iframeConfigItem = null;
                }
                if (iframeConfigItem == null) {
                    controlStrategyLIZ.LIZ(true);
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(jSInjectConfig.name);
                    sbLIZ2.append(" can not inject to iframe, no corresponding configuration");
                    c821850WLv = new C821850WLv(true, C2097908Jt.LIZJ(new Pair("error", new C821880WLy(102, C2188811AlT.LIZIZ(sbLIZ2)))));
                } else if ((!iframeConfigItem.allowBusinessList.isEmpty()) && !iframeConfigItem.allowBusinessList.contains(String.valueOf(iIntValue))) {
                    controlStrategyLIZ.LIZ(true);
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append(jSInjectConfig.name);
                    sbLIZ3.append(" inject iframe failed, allowBusinessList do not contains ");
                    sbLIZ3.append(iIntValue);
                    c821850WLv = new C821850WLv(true, C2097908Jt.LIZJ(new Pair("error", new C821880WLy(103, C2188811AlT.LIZIZ(sbLIZ3)))));
                } else {
                    if (str2.length() != 0) {
                        if (!iframeConfigItem.mainFrameAllowList.contains(e3.d)) {
                            Iterator<String> it3 = iframeConfigItem.mainFrameAllowList.iterator();
                            while (true) {
                                if (!it3.hasNext()) {
                                    break;
                                }
                                String next2 = it3.next();
                                if (a0.LJJIIZI(str2, next2, false)) {
                                    if (next2 == null) {
                                        break;
                                    }
                                }
                            }
                            controlStrategyLIZ.LIZ(true);
                            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                            sbLIZ4.append(jSInjectConfig.name);
                            sbLIZ4.append(" inject iframe failed, mainframeUrl do not in AllowList");
                            c821850WLv = new C821850WLv(true, C2097908Jt.LIZJ(new Pair("error", new C821880WLy(104, C2188811AlT.LIZIZ(sbLIZ4)))));
                        }
                    } else {
                        controlStrategyLIZ.LIZ(true);
                        StringBuilder sbLIZ42 = C2188811AlT.LIZ();
                        sbLIZ42.append(jSInjectConfig.name);
                        sbLIZ42.append(" inject iframe failed, mainframeUrl do not in AllowList");
                        c821850WLv = new C821850WLv(true, C2097908Jt.LIZJ(new Pair("error", new C821880WLy(104, C2188811AlT.LIZIZ(sbLIZ42)))));
                    }
                    return null;
                }
                if (c821850WLv.LIZ) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("injectName", jSInjectConfig.name);
                    jSONObject.put("dataflowId", iIntValue);
                    LIZLLL();
                    jSONObject.put(Scene.SCENE_SERVICE, "JSInjectionIFrameAction");
                    return new C0WM1(true, jSONObject, jSONObject, c821850WLv);
                }
                return null;
            }
        }));
        this.LIZ = c0wmj;
        SparkSecurityServiceCenter.INSTANCE.registerService(SparkSecurityJSInjectionService.class, new JSInjectionSparkServiceImpl(c0wmj));
    }

    @Override // X.C0WM7, com.bytedance.pumbaa.hybrid.governance.api.IHybridGovService
    public final void addAction(C0WMB c0wmb) {
        C0WMJ c0wmj = this.LIZ;
        if (c0wmj != null) {
            C0WMA.LIZJ(c0wmb);
            ((ArrayList) c0wmj.LIZ).add(c0wmb);
            C08XD.LJJ(c0wmj.LIZ, new AComparatorS512S0100000_13(new AComparatorS32S0000000_13(41), 7));
        }
    }
}
