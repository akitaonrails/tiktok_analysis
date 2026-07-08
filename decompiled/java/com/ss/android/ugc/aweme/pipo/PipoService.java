package com.ss.android.ugc.aweme.pipo;

import X.AbstractC1538690q8x;
import X.AnonymousClass0676;
import X.AnonymousClass0677;
import X.AnonymousClass1438;
import X.C01LQ;
import X.C098200Yq;
import X.C0PEM;
import X.C0WUI;
import X.C1062300dka;
import X.C13LP;
import X.C143C;
import X.C143I;
import X.C1503940pEu;
import X.C1529970put;
import X.C1530930pwR;
import X.C1537900q7g;
import X.C1541950qED;
import X.C1547610qNL;
import X.C1547870qNl;
import X.C1697810uHb;
import X.C1708710uZB;
import X.C1708720uZC;
import X.C1712810ufn;
import X.C1713870uhV;
import X.C1715650ukN;
import X.C1715670ukP;
import X.C1715740ukW;
import X.C1716300ulQ;
import X.C1717770unn;
import X.C1723420uwu;
import X.C1723670uxJ;
import X.C1723680uxK;
import X.C1723700uxM;
import X.C1723740uxQ;
import X.C1723750uxR;
import X.C1723930uxj;
import X.C1723960uxm;
import X.C1723980uxo;
import X.C1723990uxp;
import X.C1724020uxs;
import X.C1724040uxu;
import X.C1724060uxw;
import X.C1724260uyG;
import X.C1724530uyh;
import X.C1725310uzx;
import X.C1725550v0L;
import X.C1725680v0Y;
import X.C1726000v14;
import X.C1836510xtJ;
import X.C189200o6;
import X.C1905807dI;
import X.C1954807lC;
import X.C19EG;
import X.C20118013ne;
import X.C20118213ng;
import X.C20118413ni;
import X.C20118613nk;
import X.C20118713nl;
import X.C20118913nn;
import X.C20119213nq;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C2273341DyW;
import X.C2296808zG;
import X.C23250099c;
import X.C259800zU;
import X.C743980TGi;
import X.C786410Ut5;
import X.C797990VSb;
import X.C836770Ws7;
import X.C932203ke;
import X.EnumC1714450uiR;
import X.EnumC202057144h;
import X.EnumC688760Qzy;
import X.EnumC743970TGh;
import X.EnumC911403hI;
import X.EnumC925903jd;
import X.EnumC989003to;
import X.InterfaceC1063690dmp;
import X.InterfaceC1063710dmr;
import X.InterfaceC1713650uh9;
import X.InterfaceC202062144m;
import X.InterfaceC829930Wh5;
import X.InterfaceC830890Wid;
import X.RunnableC514501zT;
import android.content.Context;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.pipo.security.IPipoSecuritySdk;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.bnpl.IBNPLService;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.bnpl.BnplMiddleActivity;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.pipo.cashier.IPIPOCashierService;
import com.ss.android.ugc.aweme.pipo.ccdc.IPipoCcdcService;
import com.ss.android.ugc.aweme.pipo.constants.gecko.PIPOGeckoRegister;
import com.ss.android.ugc.aweme.pipo.probe.IProbeService;
import com.ss.android.ugc.aweme.pipo.register.RefundSilentRegisterInterceptor;
import com.ss.android.ugc.aweme.pipo.veritas.IPIPOVeritasService;
import com.ss.android.ugc.aweme.pipo.veritas.IPIPOVeritasServiceNoDf;
import com.ss.android.ugc.aweme.verify.IPipoVerifyCenterService;
import com.tiktok.strategycenterengine.manager.TTMStrategyCenterManager;
import defpackage.PipoJsbRegisterOptimizeInfo;
import defpackage.b4;
import defpackage.h5;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.text.Regex;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes27.dex */
public final class PipoService implements IPipoService {
    @Override // com.ss.android.ugc.aweme.pipo.IPipoService
    public final void LIZJ() {
        C1724020uxs.LL.LJJJZ();
    }

    @Override // com.ss.android.ugc.aweme.pipo.IPipoService
    public final String LIZLLL() {
        C1547610qNL.LIZ.getClass();
        return C1547610qNL.LIZIZ();
    }

    @Override // com.ss.android.ugc.aweme.pipo.IPipoService
    public final void LJII() {
        C1723670uxJ.LIZ.LIZ();
        C1537900q7g c1537900q7g = C1541950qED.LIZJ;
        AbstractC1538690q8x abstractC1538690q8x = new AbstractC1538690q8x() { // from class: X.0uv7
            @Override // X.AbstractC1538690q8x
            public final String LJI() {
                return "pipo_credit_wallet";
            }

            @Override // X.AbstractC1538690q8x
            public final void LJ(SparkContext sparkContext, String str) {
                sparkContext.LJJLIIIJ(C1717770unn.LJIIIIZZ().getCurrentRegionCode(), "priority_region");
                super.LJ(sparkContext, str);
            }
        };
        c1537900q7g.getClass();
        C1537900q7g.LJIIIIZZ(abstractC1538690q8x);
        SmartRouter.addInterceptor(new RefundSilentRegisterInterceptor());
        if (AnonymousClass0677.LIZ.compareAndSet(false, true)) {
            C23250099c.LIZLLL(AnonymousClass0677.LIZIZ, null, null, new AnonymousClass0676(null), 3);
        }
    }

    @Override // com.ss.android.ugc.aweme.pipo.IPipoService
    public final String getRiskInfo() {
        return C1715650ukN.LIZ("");
    }

    @Override // com.ss.android.ugc.aweme.pipo.IPipoService
    public final List<Class<? extends InterfaceC1063710dmr>> provideXBridgetIDLMethodList() {
        List<Class<? extends InterfaceC1063710dmr>> listLIZIZ;
        List<Class<? extends InterfaceC1063710dmr>> listProvideXBridgetIDLMethodList;
        List<Class<? extends InterfaceC1063710dmr>> listProvideXBridgetIDLMethodList2;
        IPIPOVeritasServiceNoDf iPIPOVeritasServiceNoDf = (IPIPOVeritasServiceNoDf) PluggableExtentionKt.pluggableSpi$default(IPIPOVeritasServiceNoDf.class, false, false, false, 14, null);
        if (iPIPOVeritasServiceNoDf != null) {
            iPIPOVeritasServiceNoDf.LIZ();
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(C1723420uwu.class);
        arrayList.addAll(((IPIPOCashierService) ServiceManager.get().getService(IPIPOCashierService.class)).LJIJI());
        arrayList.add(C1715740ukW.class);
        arrayList.add(C1715670ukP.class);
        arrayList.add(C0WUI.class);
        arrayList.add(C836770Ws7.class);
        IProbeService iProbeService = (IProbeService) PluggableExtentionKt.pluggableSpi$default(IProbeService.class, false, false, false, 14, null);
        if (iProbeService != null && (listProvideXBridgetIDLMethodList2 = iProbeService.provideXBridgetIDLMethodList()) != null) {
            arrayList.addAll(listProvideXBridgetIDLMethodList2);
        }
        IPipoSecuritySdk iPipoSecuritySdk = (IPipoSecuritySdk) PluggableExtentionKt.pluggableSpi$default(IPipoSecuritySdk.class, false, false, false, 14, null);
        if (iPipoSecuritySdk != null && (listProvideXBridgetIDLMethodList = iPipoSecuritySdk.provideXBridgetIDLMethodList()) != null) {
            arrayList.addAll(listProvideXBridgetIDLMethodList);
        }
        arrayList.add(C1726000v14.class);
        IPipoVerifyCenterService iPipoVerifyCenterService = (IPipoVerifyCenterService) PluggableExtentionKt.pluggableSpi$default(IPipoVerifyCenterService.class, false, false, false, 14, null);
        if (iPipoVerifyCenterService != null && (listLIZIZ = iPipoVerifyCenterService.LIZIZ()) != null && !listLIZIZ.isEmpty()) {
            arrayList.addAll(listLIZIZ);
        }
        arrayList.add(C1503940pEu.class);
        arrayList.add(C1529970put.class);
        arrayList.add(C1725680v0Y.class);
        arrayList.add(C1725550v0L.class);
        arrayList.add(C143I.class);
        arrayList.add(C143C.class);
        arrayList.add(AnonymousClass1438.class);
        arrayList.add(C1724530uyh.class);
        arrayList.add(C1530930pwR.class);
        arrayList.add(C1547870qNl.class);
        arrayList.add(C1725310uzx.class);
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.pipo.IPipoService
    public final void LJ() {
        String name;
        List<String> list;
        PipoJsbRegisterOptimizeInfo pipoJsbRegisterOptimizeInfoLIZ = h5.LIZ();
        if (pipoJsbRegisterOptimizeInfoLIZ.f0switch) {
            C932203ke.LIZ.getClass();
            ArrayList<Class> arrayList = new ArrayList();
            arrayList.add(C1723980uxo.class);
            arrayList.add(C1724260uyG.class);
            arrayList.add(C1724060uxw.class);
            arrayList.add(C1723990uxp.class);
            arrayList.add(C1723960uxm.class);
            arrayList.add(C1724040uxu.class);
            arrayList.add(C1723930uxj.class);
            for (Class cls : arrayList) {
                try {
                    name = ((InterfaceC1063690dmp) cls.newInstance()).getName();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    name = null;
                }
                PipoJsbRegisterOptimizeInfo pipoJsbRegisterOptimizeInfoLIZ2 = h5.LIZ();
                if (pipoJsbRegisterOptimizeInfoLIZ2.f0switch && (list = pipoJsbRegisterOptimizeInfoLIZ2.pipoOptConfigList) != null && !list.isEmpty() && C13LP.LJJJJ(name, pipoJsbRegisterOptimizeInfoLIZ2.pipoOptConfigList)) {
                    C1062300dka.LIZLLL(cls, null, null, 6);
                }
            }
            if (pipoJsbRegisterOptimizeInfoLIZ.enablePipoOpt) {
                C1723670uxJ.LIZ.LIZ();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.pipo.IPipoService
    public final boolean LJI() {
        return C1723750uxR.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.pipo.IPipoService
    public final String LJIIL() {
        return C2273341DyW.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.pipo.IPipoService
    public final void LJIILLIIL() {
        ((IPipoCcdcService) ServiceManager.get().getService(IPipoCcdcService.class)).LIZLLL();
    }

    @Override // com.ss.android.ugc.aweme.pipo.IPipoService
    public final String getDeviceId() {
        return C1716300ulQ.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.pipo.IPipoService
    public final void LIZIZ(final Function1<? super Boolean, Unit> function1) {
        EnumC202057144h enumC202057144h = EnumC202057144h.REPLACE;
        if (C1723740uxQ.LIZ()) {
            function1.invoke(Boolean.TRUE);
            return;
        }
        InterfaceC202062144m interfaceC202062144m = new InterfaceC202062144m() { // from class: X.0uxO
            @Override // X.InterfaceC202062144m
            public final void onFailed() {
                Function1<Boolean, Unit> function12 = function1;
                if (function12 != null) {
                    function12.invoke(Boolean.FALSE);
                }
                C1717770unn.LJFF().LIZLLL().LIZ("com.ss.android.ugc.aweme.df_pipo_bnpl", false);
            }

            @Override // X.InterfaceC202062144m
            public final void onSuccess() {
                C1717770unn.LJFF().LIZLLL().splitCompatInstall(C1717770unn.LIZJ().getApplicationContext());
                Function1<Boolean, Unit> function12 = function1;
                if (function12 != null) {
                    function12.invoke(Boolean.TRUE);
                }
                C1717770unn.LJFF().LIZLLL().LIZ("com.ss.android.ugc.aweme.df_pipo_bnpl", true);
            }
        };
        C1717770unn.LJFF().LJIILL(new C1723700uxM("com.ss.android.ugc.aweme.df_pipo_bnpl", enumC202057144h), interfaceC202062144m);
    }

    @Override // com.ss.android.ugc.aweme.pipo.IPipoService
    public final boolean LJFF(EnumC743970TGh enumC743970TGh) {
        int i = C743980TGi.LIZ[enumC743970TGh.ordinal()];
        if (i != 1 && i != 2) {
            throw new C1954807lC();
        }
        return C1723740uxQ.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.pipo.IPipoService
    public final void LJIIIZ(List<String> list) {
        C1547610qNL.LIZ.getClass();
        C1547610qNL.LIZ(list);
    }

    @Override // com.ss.android.ugc.aweme.pipo.IPipoService
    public final boolean LJIIJ(Context context) {
        if (C1836510xtJ.LIZIZ(context).LIZ() == 0) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.pipo.IPipoService
    public final void LJIIJJI(final String str) {
        SettingsManager.LIZLLL().getClass();
        if (SettingsManager.LIZ("pipo_param_check_v2_root_switch", true)) {
            try {
                if (!C1723680uxK.LIZ.containsKey(str)) {
                    TTMStrategyCenterManager.registerTTMStrategyCenterStateListener(new InterfaceC829930Wh5() { // from class: X.14eY
                        @Override // X.InterfaceC829930Wh5
                        public final void LIZ(EnumC829940Wh6 enumC829940Wh6) {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("ParamsCheckV2Handler#init");
                            sbLIZ.append(" ttmStrategyCenterStateChange, state: ");
                            sbLIZ.append(enumC829940Wh6);
                            C1712810ufn.LIZ(C2188811AlT.LIZIZ(sbLIZ));
                            if (enumC829940Wh6 == EnumC829940Wh6.TTMStateInitFinish) {
                                final String str2 = str;
                                TTMStrategyCenterManager.asyncRegisterSceneWithSceneKey(str2, null, null, new AbstractC830880Wic() { // from class: X.14eZ
                                    @Override // X.AbstractC830880Wic
                                    public final void LIZJ(InterfaceC830890Wid interfaceC830890Wid, EnumC2213771Bkd enumC2213771Bkd) {
                                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                        sbLIZ2.append("ParamsCheckV2Handler#init");
                                        sbLIZ2.append(" register ");
                                        sbLIZ2.append(str2);
                                        sbLIZ2.append(" returns: ");
                                        sbLIZ2.append(enumC2213771Bkd);
                                        C1712810ufn.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
                                        if (interfaceC830890Wid != null && enumC2213771Bkd == EnumC2213771Bkd.TTMStateCodeSuccess) {
                                            C1723680uxK.LIZ.put(str2, interfaceC830890Wid);
                                        }
                                    }
                                });
                                TTMStrategyCenterManager.deregisterTTMStrategyCenterStateListener(this);
                            }
                        }
                    });
                    C189200o6.m2constructorimpl(Unit.LIZ);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.pipo.IPipoService
    public final void LJIILJJIL(final Function1<? super Boolean, Unit> function1) {
        EnumC202057144h enumC202057144h = EnumC202057144h.REPLACE;
        if (C1723750uxR.LIZ()) {
            function1.invoke(Boolean.TRUE);
            return;
        }
        InterfaceC202062144m interfaceC202062144m = new InterfaceC202062144m() { // from class: X.0uxP
            @Override // X.InterfaceC202062144m
            public final void onFailed() {
                Function1<Boolean, Unit> function12 = function1;
                if (function12 != null) {
                    function12.invoke(Boolean.FALSE);
                }
                C1717770unn.LJFF().LIZLLL().LIZ("com.ss.android.ugc.aweme.df_pipo_external_payments", false);
            }

            @Override // X.InterfaceC202062144m
            public final void onSuccess() {
                C1717770unn.LJFF().LIZLLL().splitCompatInstall(C1717770unn.LIZJ().getApplicationContext());
                Function1<Boolean, Unit> function12 = function1;
                if (function12 != null) {
                    function12.invoke(Boolean.TRUE);
                }
                C1717770unn.LJFF().LIZLLL().LIZ("com.ss.android.ugc.aweme.df_pipo_external_payments", true);
            }
        };
        C1717770unn.LJFF().LJIILL(new C1723700uxM("com.ss.android.ugc.aweme.df_pipo_external_payments", enumC202057144h), interfaceC202062144m);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.ss.android.ugc.aweme.pipo.IPipoService
    public final Class<? extends InterfaceC1063710dmr> LJIIZILJ(String str) {
        switch (str.hashCode()) {
            case -2097869193:
                if (!str.equals("pipo.executeRiskJS")) {
                    return null;
                }
                return C20118413ni.class;
            case -212491835:
                if (!str.equals("pipo.onEvent")) {
                    return null;
                }
                return C20118913nn.class;
            case 702724384:
                if (!str.equals("pipo.encryptString")) {
                    return null;
                }
                return C20118213ng.class;
            case 1576812370:
                if (!str.equals("pipo.getStarlingData")) {
                    return null;
                }
                return C20118713nl.class;
            case 1707392825:
                if (!str.equals("pipo.openWebView")) {
                    return null;
                }
                return C20119213nq.class;
            case 1725319940:
                if (!str.equals("pipo.fetch")) {
                    return null;
                }
                return C20118613nk.class;
            case 1923191191:
                if (!str.equals("pipoAppInfo")) {
                    return null;
                }
                return C20118013ne.class;
            default:
                return null;
        }
    }

    @Override // com.ss.android.ugc.aweme.pipo.IPipoService
    public final void LIZ(String str, String str2, List list) {
        C1547610qNL.LIZ.getClass();
        if (C1547610qNL.LIZIZ.compareAndSet(false, true)) {
            C797990VSb.LIZ.LJIIJJI(new PIPOGeckoRegister());
        }
        C1547610qNL.LIZJ(str, str2, list);
    }

    /* JADX WARN: Type inference failed for: r0v59, types: [T, java.lang.Object] */
    @Override // com.ss.android.ugc.aweme.pipo.IPipoService
    public final void LJIILL(final String str, final String str2, String str3, JSONObject jSONObject, final List list, String str4) {
        SettingsManager.LIZLLL().getClass();
        if (SettingsManager.LIZ("pipo_param_check_v2_root_switch", true)) {
            try {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("checkParamsV2");
                sbLIZ.append(" check params v2: ");
                sbLIZ.append(str);
                sbLIZ.append(", ");
                sbLIZ.append(str2);
                C1712810ufn.LIZ(C2188811AlT.LIZIZ(sbLIZ));
                final long jCurrentTimeMillis = System.currentTimeMillis();
                Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair("EVENT_ORIGIN_FEATURE", "TEMAI"), new Pair("scene_name", str), new Pair("strategy_name", str2), new Pair("build_ts", C1717770unn.LIZJ().LJIIIIZZ()), new Pair("priority_region", C1717770unn.LJIIIIZZ().getCurrentRegionCode()));
                if (str4 != null) {
                }
                C1905807dI.LIZ("rd_pipo_params_v2_start_check", mapLJIIJ);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("biz_data", jSONObject);
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("app_version", C1717770unn.LIZJ().getVersionInfo().LIZ);
                jSONObject3.put("priority_region", C1717770unn.LJIIIIZZ().getCurrentRegionCode());
                jSONObject3.put("os", "android");
                jSONObject3.put("app_channel", C1717770unn.LIZJ().getChannel());
                jSONObject3.put("aid", String.valueOf(C1717770unn.LIZJ().getAppId()));
                jSONObject2.put("basic_info", jSONObject3);
                final JSONObject jSONObject4 = new JSONObject(new Regex(C13LP.LJJLIIIJ(C1697810uHb.LJIIJJI("payment", "pay", "pipo", "bank"), "|", null, null, 0, null, null, 62), EnumC688760Qzy.IGNORE_CASE).replace(C786410Ut5.J3(jSONObject2), "_osp_"));
                SettingsManager.LIZLLL().getClass();
                if (SettingsManager.LIZ("pipo_param_check_upload_checked_data", false)) {
                    C1905807dI.LIZ("rd_pipo_general_debug", C2097608Jq.LJIIIIZZ(new Pair("EVENT_ORIGIN_FEATURE", "TEMAI"), new Pair("item", "params_check_v2_full_checked_data"), new Pair("value", C786410Ut5.J3(jSONObject4))));
                }
                final LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("EVENT_ORIGIN_FEATURE", "TEMAI");
                linkedHashMap.put("scene_name", str);
                linkedHashMap.put("strategy_name", str2);
                linkedHashMap.put("build_ts", C1717770unn.LIZJ().LJIIIIZZ());
                if (str3 != null) {
                }
                linkedHashMap.put("priority_region", C1717770unn.LJIIIIZZ().getCurrentRegionCode());
                if (str4 != null) {
                    linkedHashMap.put("extra", str4);
                }
                final C259800zU c259800zU = new C259800zU();
                ConcurrentHashMap<String, InterfaceC830890Wid> concurrentHashMap = C1723680uxK.LIZ;
                if (concurrentHashMap.containsKey(str)) {
                    c259800zU.element = concurrentHashMap.get(str);
                }
                if (c259800zU.element == 0) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("checkParamsV2");
                    sbLIZ2.append(" scene: ");
                    sbLIZ2.append(str);
                    sbLIZ2.append(" is not ready yet");
                    C1712810ufn.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
                    linkedHashMap.put("error_code", "-10000");
                    linkedHashMap.put("error_msg", "scene is not ready yet");
                    linkedHashMap.put("duration", String.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
                    C1905807dI.LIZ("rd_pipo_params_v2_check_result", linkedHashMap);
                    C786410Ut5.LJJZZIII(new BPEAHandler(Looper.getMainLooper()), new RunnableC514501zT(linkedHashMap, 47));
                    return;
                }
                C1708720uZC c1708720uZCLIZ = C1708710uZB.LIZ("Cashier");
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("checkParamsV2");
                sbLIZ3.append(" psp engine ready to run");
                c1708720uZCLIZ.LIZ(4, C2188811AlT.LIZIZ(sbLIZ3));
                C189200o6.m2constructorimpl(C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C01LQ(new Runnable() { // from class: X.0uy4
                    public final /* synthetic */ Function1<Map<String, String>, Unit> LLIZLLLIL = null;

                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("ParamsCheckV2Handler@7bb.checkParamsV2$1$job$1");
                        try {
                            LIZ();
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("ParamsCheckV2Handler@7bb.checkParamsV2$1$job$1");
                    }

                    /* JADX WARN: Removed duplicated region for block: B:103:? A[RETURN, SYNTHETIC] */
                    /* JADX WARN: Removed duplicated region for block: B:36:0x00e9  */
                    /* JADX WARN: Removed duplicated region for block: B:49:0x010f  */
                    /* JADX WARN: Removed duplicated region for block: B:52:0x0147  */
                    /* JADX WARN: Removed duplicated region for block: B:53:0x014c  */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final void LIZ() {
                        /*
                            Method dump skipped, instruction units count: 550
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.RunnableC1724140uy4.LIZ():void");
                    }
                }, null), 3));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.pipo.IPipoService
    public final boolean LJIILIIL(BnplMiddleActivity bnplMiddleActivity, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Map map) {
        Object c098200Yq;
        IPIPOVeritasService iPIPOVeritasService;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("client_image_");
        sbLIZ.append(C1717770unn.LJIIIIZZ().getCurrentRegionCode().toLowerCase(new Locale("en")));
        LIZ("BNPL", "image", C1697810uHb.LJIILJJIL("client_image_common", C2188811AlT.LIZIZ(sbLIZ)));
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("433__82785__");
        sbLIZ2.append(C2273341DyW.LIZ());
        List listLJIILJJIL = C1697810uHb.LJIILJJIL("bnpl", C2188811AlT.LIZIZ(sbLIZ2), "bnpl_im", "bnpl_ticket_center", "bnpl_temp", "pipo_bnpl_kyc", "pipo_fe_customer_service", "kyc_inhouse");
        try {
            SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
            ArrayList<String> arrayList = b4.LIZ;
            ArrayList<String> arrayList2 = (ArrayList) settingsManagerLIZLLL.LJIIIIZZ("pipo_bnpl_gecko_offline_channels", ArrayList.class, arrayList);
            if (arrayList2 != null) {
                arrayList = arrayList2;
            }
            C189200o6.m2constructorimpl(Boolean.valueOf(listLJIILJJIL.addAll(arrayList)));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        SettingsManager.LIZLLL().getClass();
        if (SettingsManager.LIZ("pipo_bnpl_gecko_offline_enabled", true)) {
            LIZ("BNPL", "h5", listLJIILJJIL);
        } else {
            C1547610qNL.LIZ.getClass();
            C1547610qNL.LIZ(listLJIILJJIL);
        }
        try {
            if (LJFF(EnumC743970TGh.BNPL) && (iPIPOVeritasService = (IPIPOVeritasService) PluggableExtentionKt.pluggableSpi$default(IPIPOVeritasService.class, false, false, false, 14, null)) != null) {
                iPIPOVeritasService.init();
            }
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            c098200Yq = new C098200Yq(th2);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (!LJFF(EnumC743970TGh.BNPL)) {
            return false;
        }
        C1724020uxs.LL.LJJJZ();
        ((IBNPLService) ServiceManager.get().getService(IBNPLService.class)).LJFF(bnplMiddleActivity, str, str2, str3, str4, str5, str6, str7, str8, map);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v21, types: [X.0uhU] */
    @Override // com.ss.android.ugc.aweme.pipo.IPipoService
    public final boolean LJIIIIZZ(C19EG c19eg, String str, String str2, String str3, String str4, String str5, String str6, EnumC989003to enumC989003to, String str7, String str8, String str9, EnumC925903jd enumC925903jd, Float f, String str10, final Function1 function1) throws JSONException {
        EnumC1714450uiR enumC1714450uiR;
        if (str.length() != 0 && str3.length() != 0) {
            C1724020uxs.LL.LJJJZ();
            IPipoVerifyCenterService iPipoVerifyCenterService = (IPipoVerifyCenterService) ServiceManager.get().getService(IPipoVerifyCenterService.class);
            if (enumC989003to == EnumC989003to.FULL_PAGE) {
                enumC1714450uiR = EnumC1714450uiR.FULL_PAGE;
            } else {
                enumC1714450uiR = EnumC1714450uiR.HALF_PAGE;
            }
            iPipoVerifyCenterService.LIZLLL(c19eg, str, str4, str5, str6, enumC1714450uiR, str7, str8, str9, enumC925903jd, f, str10, new InterfaceC1713650uh9() { // from class: X.0uhU
                /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                /* JADX WARN: Code restructure failed: missing block: B:11:0x0027, code lost:
                
                    if (r1.equals("SESSION_EXPIRED") == false) goto L4;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:14:0x0030, code lost:
                
                    if (r1.equals("PENDING") == false) goto L4;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:21:0x0049, code lost:
                
                    if (r1.equals("REJECT") == false) goto L4;
                 */
                /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
                @Override // X.InterfaceC1713650uh9
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void LIZ(X.C1713690uhD r6) throws org.json.JSONException {
                    /*
                        r5 = this;
                        java.lang.String r1 = r6.LIZIZ
                        int r0 = r1.hashCode()
                        switch(r0) {
                            case -1881380961: goto L43;
                            case 2448401: goto L33;
                            case 35394935: goto L2a;
                            case 1141576252: goto L21;
                            case 1980572282: goto L11;
                            default: goto L9;
                        }
                    L9:
                        kotlin.jvm.functions.Function1<X.03hI, kotlin.Unit> r1 = r1
                        X.03hI r0 = X.EnumC911403hI.REJECT
                        r1.invoke(r0)
                        return
                    L11:
                        java.lang.String r0 = "CANCEL"
                        boolean r0 = r1.equals(r0)
                        if (r0 == 0) goto L9
                        kotlin.jvm.functions.Function1<X.03hI, kotlin.Unit> r1 = r1
                        X.03hI r0 = X.EnumC911403hI.CANCEL
                        r1.invoke(r0)
                        return
                    L21:
                        java.lang.String r0 = "SESSION_EXPIRED"
                        boolean r0 = r1.equals(r0)
                        if (r0 != 0) goto L4c
                        goto L9
                    L2a:
                        java.lang.String r0 = "PENDING"
                        boolean r0 = r1.equals(r0)
                        if (r0 != 0) goto L4c
                        goto L9
                    L33:
                        java.lang.String r0 = "PASS"
                        boolean r0 = r1.equals(r0)
                        if (r0 == 0) goto L9
                        kotlin.jvm.functions.Function1<X.03hI, kotlin.Unit> r1 = r1
                        X.03hI r0 = X.EnumC911403hI.PASS
                        r1.invoke(r0)
                        return
                    L43:
                        java.lang.String r0 = "REJECT"
                        boolean r0 = r1.equals(r0)
                        if (r0 != 0) goto L4c
                        goto L9
                    L4c:
                        r0 = 5
                        kotlin.Pair[] r4 = new kotlin.Pair[r0]
                        kotlin.Pair r2 = new kotlin.Pair
                        java.lang.String r1 = "verify_type"
                        java.lang.String r0 = "unknown"
                        r2.<init>(r1, r0)
                        r0 = 0
                        r4[r0] = r2
                        kotlin.Pair r2 = new kotlin.Pair
                        java.lang.String r1 = "error_code"
                        java.lang.String r0 = "4"
                        r2.<init>(r1, r0)
                        r0 = 1
                        r4[r0] = r2
                        X.0uYt r0 = r6.LJI
                        java.lang.String r3 = ""
                        if (r0 == 0) goto L71
                        java.lang.String r2 = r0.LIZ
                        if (r2 != 0) goto L72
                    L71:
                        r2 = r3
                    L72:
                        kotlin.Pair r1 = new kotlin.Pair
                        java.lang.String r0 = "error_message"
                        r1.<init>(r0, r2)
                        r0 = 2
                        r4[r0] = r1
                        kotlin.Pair r2 = new kotlin.Pair
                        java.lang.String r1 = "biz_type"
                        java.lang.String r0 = "BNPL"
                        r2.<init>(r1, r0)
                        r0 = 3
                        r4[r0] = r2
                        java.lang.String r0 = r6.LIZLLL
                        if (r0 == 0) goto L8d
                        r3 = r0
                    L8d:
                        kotlin.Pair r1 = new kotlin.Pair
                        java.lang.String r0 = "verifyId"
                        r1.<init>(r0, r3)
                        r0 = 4
                        r4[r0] = r1
                        java.util.Map r1 = X.C2097608Jq.LJIIIIZZ(r4)
                        java.lang.String r0 = "rd_pipo_bnpl_veryfication"
                        X.C1713870uhV.LIZ(r0, r1)
                        kotlin.jvm.functions.Function1<X.03hI, kotlin.Unit> r1 = r1
                        X.03hI r0 = X.EnumC911403hI.REJECT
                        r1.invoke(r0)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C1713860uhU.LIZ(X.0uhD):void");
                }
            });
            return true;
        }
        StringBuffer stringBuffer = new StringBuffer();
        if (str.length() == 0) {
            stringBuffer.append("verify info,");
        }
        if (str3.length() == 0) {
            stringBuffer.append("api host");
        }
        stringBuffer.append("empty");
        C1713870uhV.LIZ("rd_pipo_bnpl_veryfication", C2097608Jq.LJIIIIZZ(new Pair("verify_type", "unknown"), new Pair("error_code", "1"), new Pair("error_message", stringBuffer.toString()), new Pair("biz_type", "BNPL"), new Pair("verifyId", "")));
        function1.invoke(EnumC911403hI.REJECT);
        return false;
    }
}
