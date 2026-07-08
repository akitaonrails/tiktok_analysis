package com.ss.android.ugc.aweme.signal;

import X.AbstractC20655215s6;
import X.AbstractC637050Oyl;
import X.AbstractC637410OzL;
import X.C054G;
import X.C080A;
import X.C080G;
import X.C080R;
import X.C0PEM;
import X.C123100dR;
import X.C13007057d;
import X.C20551615bO;
import X.C20551715bP;
import X.C20554115bn;
import X.C20571615ec;
import X.C20681515wL;
import X.C20681915wP;
import X.C20682015wQ;
import X.C20682815wY;
import X.C20682915wZ;
import X.C20684615wq;
import X.C20684815ws;
import X.C2097608Jq;
import X.C2097908Jt;
import X.C2104108Md;
import X.C2129308Vv;
import X.C2188811AlT;
import X.C2296808zG;
import X.C23250099c;
import X.C2357209Lm;
import X.EnumC1781240wSA;
import X.EnumC20654715s1;
import X.InterfaceC1273504yb;
import X.InterfaceC20683915wj;
import X.InterfaceC805220ViK;
import X.InterfaceC830890Wid;
import X.InterfaceC830900Wie;
import android.content.Context;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.n;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.fetch.OutreachFetchRequestBody;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.outreach.dispersion.monitor.OutreachMonitorServiceImpl;
import com.ss.android.ugc.aweme.outreach.dispersion.spi.IOutreachMonitorService;
import com.ss.android.ugc.aweme.outreach.signal.IOutreachManager;
import com.ss.android.ugc.aweme.outreach.signal.config.OutreachClearStrategyConfig;
import com.ss.android.ugc.aweme.outreach.signal.debug.IOutreachSignalDebug;
import com.ss.android.ugc.aweme.outreach.signal.model.OutreachPathEventConfig;
import com.ss.android.ugc.aweme.outreach.signal.model.OutreachTimingConfig;
import com.ss.android.ugc.aweme.outreach.signal.model.PSPOutreachActionResult;
import com.ss.android.ugc.aweme.outreach.signal.model.TimingAction;
import com.ss.android.ugc.aweme.outreach.signal.model.TimingOutreachEntry;
import com.ss.android.ugc.aweme.performanceopt.api.IDowngradeApi;
import com.ss.android.ugc.aweme.service.IFeedDebugService;
import com.ss.android.ugc.aweme.signal.OutreachManagerImpl;
import com.tiktok.strategycenterengine.manager.TTMStrategyCenterManager;
import com.tiktok.ttm.TTMParamData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import kotlin.Pair;
import kotlin.jvm.internal.AwS432S0200000_31;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes32.dex */
public final class OutreachManagerImpl implements IOutreachManager, IOutreachSignalDebug {
    public boolean LIZ;
    public final C20681515wL LIZIZ = new C20681515wL();
    public final String LIZJ = "clear_partial_outreach_strategy";
    public final C054G LIZLLL = C2296808zG.LIZ(C0PEM.LIZJ);

    @Override // com.ss.android.ugc.aweme.outreach.signal.IOutreachManager
    public final void LJIIJ() {
        InterfaceC830900Wie sceneStrategyWithKey;
        C20571615ec.LIZ.getClass();
        C20571615ec.LIZ("onMainActivity destroy");
        C20682915wZ c20682915wZ = (C20682915wZ) this.LIZIZ.LIZIZ.getValue();
        InterfaceC830890Wid interfaceC830890Wid = c20682915wZ.LIZIZ;
        if (interfaceC830890Wid == null) {
            interfaceC830890Wid = c20682915wZ.LIZJ;
        }
        List<String> list = ((OutreachClearStrategyConfig) C20551615bO.LIZIZ.getValue()).outreachTimingList;
        if (list != null) {
            for (String str : list) {
                if (C123100dR.LIZ(str) && (sceneStrategyWithKey = TTMStrategyCenterManager.getSceneStrategyWithKey(interfaceC830890Wid, str)) != null) {
                    C20571615ec c20571615ec = C20571615ec.LIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("clear strategy: ");
                    sbLIZ.append(str);
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    c20571615ec.getClass();
                    C20571615ec.LIZ(strLIZIZ);
                    sceneStrategyWithKey.LIZ();
                }
            }
        }
        TTMStrategyCenterManager.asyncEmitEventToGlobalStrategyEventStream(this.LIZJ, new JSONObject(), (ExecutorService) null);
    }

    public final void LJIILLIIL() {
        C20681515wL c20681515wL = this.LIZIZ;
        for (AbstractC20655215s6 abstractC20655215s6 : (Set) c20681515wL.LIZ.getValue()) {
            abstractC20655215s6.LIZ = c20681515wL;
            abstractC20655215s6.LIZIZ();
        }
        IOutreachMonitorService iOutreachMonitorServiceLIZ = OutreachMonitorServiceImpl.LIZ();
        if (iOutreachMonitorServiceLIZ != null) {
            iOutreachMonitorServiceLIZ.init();
        }
        IFeedDebugService iFeedDebugService = (IFeedDebugService) PluggableExtentionKt.pluggableSpi$default(IFeedDebugService.class, false, false, false, 14, null);
        if (iFeedDebugService != null) {
            iFeedDebugService.LJIJJLI();
        }
    }

    public static boolean LJIILL(PSPOutreachActionResult pSPOutreachActionResult) {
        List<TimingOutreachEntry> list;
        OutreachTimingConfig outreachTimingConfigLIZ = C2129308Vv.LIZ();
        TimingOutreachEntry timingOutreachEntry = null;
        if (outreachTimingConfigLIZ != null && (list = outreachTimingConfigLIZ.outreachTimingConfig) != null) {
            Iterator<TimingOutreachEntry> it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                TimingOutreachEntry next = it2.next();
                if (u.LJIJI(next.timingKey, pSPOutreachActionResult.outreachTimingKey, false)) {
                    timingOutreachEntry = next;
                    break;
                }
            }
            TimingOutreachEntry timingOutreachEntry2 = timingOutreachEntry;
            if (timingOutreachEntry2 != null) {
                Keva keva = (Keva) C20684615wq.LIZIZ.getValue();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(pSPOutreachActionResult.outreachTimingKey);
                sbLIZ.append("_last_outreach_signal_timestamp");
                long j = keva.getLong(C2188811AlT.LIZIZ(sbLIZ), 0L);
                Long l = timingOutreachEntry2.frequency;
                if (l == null || System.currentTimeMillis() - j > l.longValue() || j == 0) {
                    return false;
                }
                return true;
            }
            return true;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.outreach.signal.IOutreachManager
    public final void LIZIZ(EnumC20654715s1 enumC20654715s1) {
        try {
            this.LIZIZ.LIZ().LIZIZ.remove(enumC20654715s1);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C20571615ec c20571615ec = C20571615ec.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("removeOutreachFetchCallBack throw: ");
            sbLIZ.append(th);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            c20571615ec.getClass();
            C20571615ec.LIZIZ(strLIZIZ);
        }
    }

    @Override // com.ss.android.ugc.aweme.outreach.signal.IOutreachManager
    public final Pair LIZJ(EnumC20654715s1 enumC20654715s1) {
        try {
            C20571615ec c20571615ec = C20571615ec.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("signal: triggerOutreachTiming, ");
            sbLIZ.append("feed_widget");
            sbLIZ.append(", outreach: ");
            sbLIZ.append(enumC20654715s1.getTypeName());
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            c20571615ec.getClass();
            C20571615ec.LIZJ(strLIZIZ);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("feed_widget");
            sbLIZ2.append("_manual");
            String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
            C080A.LIZIZ("signal_trigger", strLIZIZ2, enumC20654715s1.getTypeName(), null, null);
            PSPOutreachActionResult pSPOutreachActionResultLJIIZILJ = LJIIZILJ(strLIZIZ2);
            Integer num = pSPOutreachActionResultLJIIZILJ.errCode;
            if (num != null && num.intValue() == 0) {
                Map<String, Object> map = pSPOutreachActionResultLJIIZILJ.outreachCondition;
                C20554115bn c20554115bn = new C20554115bn(0, "trigger success");
                C080A.LIZIZ("decision_make", strLIZIZ2, enumC20654715s1.getTypeName(), null, null);
                C080A.LIZIZ("trigger_dispatch", "feed_widget", enumC20654715s1.getTypeName(), null, null);
                OutreachPathEventConfig outreachPathEventConfigLIZ = C20682815wY.LIZ();
                if (outreachPathEventConfigLIZ != null && outreachPathEventConfigLIZ.outreachTriggerPSPActively) {
                    C20684815ws.LJIILLIIL("outreach_trigger_psp_actively", C2097608Jq.LJIIJ(new Pair("action_type", "trigger"), new Pair("outreach_timing_key", strLIZIZ2), new Pair("outreach_conditions", pSPOutreachActionResultLJIIZILJ.outreachCondition.toString()), new Pair("error_code", CardStruct.IStatusCode.DEFAULT)));
                }
                return new Pair(c20554115bn, map);
            }
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("trigger timing: ");
            sbLIZ3.append("feed_widget");
            sbLIZ3.append(", psp run error: ");
            String str = pSPOutreachActionResultLJIIZILJ.errorMsg;
            String str2 = "no msg";
            if (str == null) {
                str = "no msg";
            }
            sbLIZ3.append(str);
            C20571615ec.LIZIZ(C2188811AlT.LIZIZ(sbLIZ3));
            String str3 = pSPOutreachActionResultLJIIZILJ.errorMsg;
            if (str3 != null) {
                str2 = str3;
            }
            return new Pair(new C20554115bn(-2, str2), new LinkedHashMap());
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C20571615ec c20571615ec2 = C20571615ec.LIZ;
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("triggerOutreachTiming throw: ");
            sbLIZ4.append(th);
            String strLIZIZ3 = C2188811AlT.LIZIZ(sbLIZ4);
            c20571615ec2.getClass();
            C20571615ec.LIZIZ(strLIZIZ3);
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append("run throwable: ");
            sbLIZ5.append(th.getMessage());
            return new Pair(new C20554115bn(-3, C2188811AlT.LIZIZ(sbLIZ5)), new LinkedHashMap());
        }
    }

    @Override // com.ss.android.ugc.aweme.outreach.signal.IOutreachManager
    public final void LIZLLL(EnumC20654715s1 enumC20654715s1) {
        try {
            this.LIZIZ.LIZ().LJ.remove(enumC20654715s1);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C20571615ec c20571615ec = C20571615ec.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("removeFetchInterceptor throw: ");
            sbLIZ.append(th);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            c20571615ec.getClass();
            C20571615ec.LIZIZ(strLIZIZ);
        }
    }

    @Override // com.ss.android.ugc.aweme.outreach.signal.IOutreachManager
    public final void LJFF(EnumC20654715s1 enumC20654715s1) {
        try {
            this.LIZIZ.LIZ().LIZLLL.remove(enumC20654715s1);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C20571615ec c20571615ec = C20571615ec.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("registerParamInjector throw: ");
            sbLIZ.append(th);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            c20571615ec.getClass();
            C20571615ec.LIZIZ(strLIZIZ);
        }
    }

    @Override // com.ss.android.ugc.aweme.outreach.signal.IOutreachManager
    public final void LJII(Context context) {
        if (C2357209Lm.LIZ().enableAsyncInit) {
            C23250099c.LIZLLL(this.LIZLLL, null, null, new C13007057d(this, context, null), 3);
        } else {
            LJIILIIL(context);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x002d  */
    @Override // com.ss.android.ugc.aweme.outreach.signal.IOutreachManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.Pair<X.C20554115bn, java.util.Map<java.lang.String, java.lang.Object>> LJIIIZ(X.EnumC20654715s1 r6) {
        /*
            Method dump skipped, instruction units count: 242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.signal.OutreachManagerImpl.LJIIIZ(X.15s1):kotlin.Pair");
    }

    @Override // com.ss.android.ugc.aweme.outreach.signal.IOutreachManager
    public final void LJIIL(EnumC20654715s1 enumC20654715s1) {
        try {
            this.LIZIZ.LIZ().LIZJ.remove(enumC20654715s1);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C20571615ec c20571615ec = C20571615ec.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("removeOutreachTriggerCallBack throw: ");
            sbLIZ.append(th);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            c20571615ec.getClass();
            C20571615ec.LIZIZ(strLIZIZ);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [X.15wP, X.15wj] */
    public final void LJIILIIL(Context context) {
        try {
            if (!C2104108Md.LIZLLL(context)) {
                return;
            }
            if (!((Boolean) C080R.LIZ.getValue()).booleanValue()) {
                C20571615ec.LIZ.getClass();
                C20571615ec.LIZIZ("init fail, enable_outreach_signal false");
                return;
            }
            if (!this.LIZ) {
                this.LIZ = true;
                C20571615ec.LIZ.getClass();
                C20571615ec.LIZ("init outreach signal manager");
                LJIILLIIL();
                C20682915wZ c20682915wZ = (C20682915wZ) this.LIZIZ.LIZIZ.getValue();
                ?? r3 = new InterfaceC20683915wj() { // from class: X.15wP
                    @Override // X.InterfaceC20683915wj
                    public final void LIZ(InterfaceC805220ViK interfaceC805220ViK) {
                        boolean z;
                        this.LIZ.getClass();
                        PSPOutreachActionResult pSPOutreachActionResultLJIILJJIL = OutreachManagerImpl.LJIILJJIL("", interfaceC805220ViK, false);
                        Integer num = pSPOutreachActionResultLJIILJJIL.errCode;
                        if (num != null && num.intValue() == 0) {
                            C20682015wQ c20682015wQ = (C20682015wQ) this.LIZ.LIZIZ.LIZLLL.getValue();
                            c20682015wQ.getClass();
                            if (pSPOutreachActionResultLJIILJJIL.isNewTiming) {
                                c20682015wQ.LJII(pSPOutreachActionResultLJIILJJIL);
                                return;
                            }
                            String str = pSPOutreachActionResultLJIILJJIL.outreachTimingKey;
                            Map<String, Object> map = pSPOutreachActionResultLJIILJJIL.outreachCondition;
                            try {
                                C20571615ec c20571615ec = C20571615ec.LIZ;
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("signal: onTimingComing: ");
                                sbLIZ.append(str);
                                sbLIZ.append(", conditionParam: ");
                                sbLIZ.append(map);
                                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                                c20571615ec.getClass();
                                C20571615ec.LIZJ(strLIZIZ);
                                OutreachPathEventConfig outreachPathEventConfigLIZ = C20682815wY.LIZ();
                                if (outreachPathEventConfigLIZ != null && outreachPathEventConfigLIZ.outreachTimingComing) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                if (z) {
                                    C20684815ws.LJIILLIIL("outreach_timing_coming", C2097608Jq.LJIIJ(new Pair("outreach_timing_key", str), new Pair("outreach_conditions", map.toString())));
                                }
                                ArrayList<EnumC20654715s1> arrayList = new ArrayList();
                                Map map2 = (Map) ((LinkedHashMap) c20682015wQ.LIZIZ).get(str);
                                if (map2 != null && !map2.isEmpty()) {
                                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                                    for (Map.Entry entry : map2.entrySet()) {
                                        String str2 = ((TimingAction) entry.getValue()).outreachType;
                                        String str3 = ((TimingAction) entry.getValue()).actionType;
                                        EnumC20654715s1 enumC20654715s1LIZ = C20654615s0.LIZ(str2);
                                        if (enumC20654715s1LIZ == null) {
                                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                            sbLIZ2.append("OutreachType not found: ");
                                            sbLIZ2.append(str2);
                                            C080G.LIZLLL("decision_make", str, str2, 20003, C2188811AlT.LIZIZ(sbLIZ2), null, null, 200);
                                        } else {
                                            ((C20654815s2) c20682015wQ.LIZ().LJFF.getValue()).LIZLLL(enumC20654715s1LIZ);
                                            if (Intrinsics.LJFF(str3, "fetch")) {
                                                InterfaceC20684015wk interfaceC20684015wk = (InterfaceC20684015wk) ((LinkedHashMap) c20682015wQ.LIZ().LIZ().LJ).get(enumC20654715s1LIZ);
                                                if (interfaceC20684015wk != null && interfaceC20684015wk.LIZ(str)) {
                                                    C080G.LIZLLL("decision_make", str, enumC20654715s1LIZ.getTypeName(), 20005, "biz fetch interceptor returned true", null, null, 200);
                                                    C20571615ec c20571615ec2 = C20571615ec.LIZ;
                                                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                                    sbLIZ3.append("onTimingComing, intercept fetch: ");
                                                    sbLIZ3.append(enumC20654715s1LIZ.getTypeName());
                                                    String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ3);
                                                    c20571615ec2.getClass();
                                                    C20571615ec.LIZIZ(strLIZIZ2);
                                                } else {
                                                    AbstractC637410OzL abstractC637410OzL = (AbstractC637410OzL) ((LinkedHashMap) c20682015wQ.LIZ().LIZ().LIZLLL).get(enumC20654715s1LIZ);
                                                    if (abstractC637410OzL != null) {
                                                        linkedHashMap2.put(enumC20654715s1LIZ.getTypeName(), abstractC637410OzL);
                                                    }
                                                    boolean zBooleanValue = ((Boolean) C261820ANw.LIZ.getValue()).booleanValue();
                                                    AbstractC637050Oyl abstractC637050Oyl = (AbstractC637050Oyl) ((LinkedHashMap) c20682015wQ.LIZ().LIZ().LIZIZ).get(enumC20654715s1LIZ);
                                                    if (abstractC637050Oyl != null) {
                                                        linkedHashMap.put(enumC20654715s1LIZ.getTypeName(), abstractC637050Oyl);
                                                        if (zBooleanValue) {
                                                            arrayList.add(enumC20654715s1LIZ);
                                                        }
                                                        C080A.LIZIZ("decision_make", str, enumC20654715s1LIZ.getTypeName(), null, null);
                                                    } else {
                                                        String typeName = enumC20654715s1LIZ.getTypeName();
                                                        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                                                        sbLIZ4.append("no fetch callback for ");
                                                        sbLIZ4.append(str);
                                                        C080G.LIZLLL("decision_make", str, typeName, 20004, C2188811AlT.LIZIZ(sbLIZ4), null, null, 200);
                                                        C20571615ec c20571615ec3 = C20571615ec.LIZ;
                                                        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                                                        sbLIZ5.append("onTimingComing, no fetch callback: ");
                                                        sbLIZ5.append(str2);
                                                        String strLIZIZ3 = C2188811AlT.LIZIZ(sbLIZ5);
                                                        c20571615ec3.getClass();
                                                        C20571615ec.LIZIZ(strLIZIZ3);
                                                    }
                                                    if (!zBooleanValue) {
                                                        arrayList.add(enumC20654715s1LIZ);
                                                    }
                                                }
                                            } else if (Intrinsics.LJFF(str3, "trigger")) {
                                                InterfaceC1273504yb interfaceC1273504yb = (InterfaceC1273504yb) ((LinkedHashMap) c20682015wQ.LIZ().LIZ().LIZJ).get(enumC20654715s1LIZ);
                                                if (interfaceC1273504yb != null) {
                                                    C20571615ec c20571615ec4 = C20571615ec.LIZ;
                                                    StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                                                    sbLIZ6.append("signal: onTimingComing: ");
                                                    sbLIZ6.append(str);
                                                    sbLIZ6.append(", trigger callback, ");
                                                    sbLIZ6.append(enumC20654715s1LIZ.getTypeName());
                                                    String strLIZIZ4 = C2188811AlT.LIZIZ(sbLIZ6);
                                                    c20571615ec4.getClass();
                                                    C20571615ec.LIZJ(strLIZIZ4);
                                                    C080A.LIZIZ("decision_make", str, enumC20654715s1LIZ.getTypeName(), null, null);
                                                    C080A.LIZIZ("trigger_dispatch", str, enumC20654715s1LIZ.getTypeName(), null, null);
                                                    interfaceC1273504yb.ac(str, map);
                                                    OutreachPathEventConfig outreachPathEventConfigLIZ2 = C20682815wY.LIZ();
                                                    if (outreachPathEventConfigLIZ2 != null && outreachPathEventConfigLIZ2.outreachCallback) {
                                                        C20684815ws.LJIILLIIL("outreach_callback", C2097608Jq.LJIIJ(new Pair("outreach_type", entry.getKey()), new Pair("action_type", "trigger"), new Pair("outreach_timing_key", str), new Pair("outreach_conditions", map.toString()), new Pair("is_active", CardStruct.IStatusCode.DEFAULT)));
                                                    }
                                                } else {
                                                    String typeName2 = enumC20654715s1LIZ.getTypeName();
                                                    StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                                                    sbLIZ7.append("trigger callback not registered for ");
                                                    sbLIZ7.append(str);
                                                    C080G.LIZLLL("decision_make", str, typeName2, 20004, C2188811AlT.LIZIZ(sbLIZ7), null, null, 200);
                                                }
                                            }
                                        }
                                    }
                                    if (linkedHashMap.isEmpty()) {
                                        C20571615ec c20571615ec5 = C20571615ec.LIZ;
                                        StringBuilder sbLIZ8 = C2188811AlT.LIZ();
                                        sbLIZ8.append("signal: onTimingComing: ");
                                        sbLIZ8.append(str);
                                        sbLIZ8.append(", fetchCallBackMap null, return");
                                        String strLIZIZ5 = C2188811AlT.LIZIZ(sbLIZ8);
                                        c20571615ec5.getClass();
                                        C20571615ec.LIZJ(strLIZIZ5);
                                        return;
                                    }
                                    OutreachFetchRequestBody outreachFetchRequestBody = new OutreachFetchRequestBody(null, null, null, null, null);
                                    outreachFetchRequestBody.setFetchTiming(str);
                                    ArrayList arrayList2 = new ArrayList();
                                    for (EnumC20654715s1 enumC20654715s1 : arrayList) {
                                        arrayList2.add(enumC20654715s1.getTypeName());
                                        C080A.LIZIZ("fetch_request", str, enumC20654715s1.getTypeName(), null, null);
                                    }
                                    outreachFetchRequestBody.setEnableOutreachTypes(arrayList2);
                                    String strLJIILL = new Gson().LJIILL(map);
                                    strLJIILL.toString();
                                    outreachFetchRequestBody.setCrossOutreachSignal(strLJIILL);
                                    outreachFetchRequestBody.setSingleOutreachSignal(C20682015wQ.LJFF(linkedHashMap2));
                                    long jCurrentTimeMillis = System.currentTimeMillis();
                                    InterfaceC595380NWu interfaceC595380NWu = C595350NWr.LIZ;
                                    C595350NWr.LIZ(outreachFetchRequestBody, new C20682415wU(c20682015wQ, str, arrayList2, map, linkedHashMap, jCurrentTimeMillis), new C20682115wR(c20682015wQ, str, arrayList2, map, linkedHashMap));
                                    return;
                                }
                                StringBuilder sbLIZ9 = C2188811AlT.LIZ();
                                sbLIZ9.append("no timing action config for ");
                                sbLIZ9.append(str);
                                C080G.LIZLLL("decision_make", str, null, 20001, C2188811AlT.LIZIZ(sbLIZ9), null, null, 204);
                                StringBuilder sbLIZ10 = C2188811AlT.LIZ();
                                sbLIZ10.append("signal: onTimingComing: ");
                                sbLIZ10.append(str);
                                sbLIZ10.append(", timingActionList null, return");
                                C20571615ec.LIZIZ(C2188811AlT.LIZIZ(sbLIZ10));
                                return;
                            } catch (Exception e) {
                                TryCatchGuardChecker.doCheck(e);
                                C20571615ec c20571615ec6 = C20571615ec.LIZ;
                                StringBuilder sbLIZ11 = C2188811AlT.LIZ();
                                sbLIZ11.append("signal: onTimingComing ");
                                sbLIZ11.append(str);
                                sbLIZ11.append(" Error; ");
                                sbLIZ11.append(e);
                                String strLIZIZ6 = C2188811AlT.LIZIZ(sbLIZ11);
                                c20571615ec6.getClass();
                                C20571615ec.LIZIZ(strLIZIZ6);
                                return;
                            }
                        }
                        Integer num2 = pSPOutreachActionResultLJIILJJIL.errCode;
                        if (num2 != null && num2.intValue() == 3) {
                            return;
                        }
                        C20571615ec c20571615ec7 = C20571615ec.LIZ;
                        StringBuilder sbLIZ12 = C2188811AlT.LIZ();
                        sbLIZ12.append("async actionResult fail: code: ");
                        sbLIZ12.append(pSPOutreachActionResultLJIILJJIL.errCode);
                        sbLIZ12.append(", msg: ");
                        sbLIZ12.append(pSPOutreachActionResultLJIILJJIL.errorMsg);
                        String strLIZIZ7 = C2188811AlT.LIZIZ(sbLIZ12);
                        c20571615ec7.getClass();
                        C20571615ec.LIZIZ(strLIZIZ7);
                    }
                };
                c20682915wZ.getClass();
                if (C2357209Lm.LIZ().optDelaySceneInit) {
                    IDowngradeApi iDowngradeApi = (IDowngradeApi) PluggableExtentionKt.pluggableSpi$default(IDowngradeApi.class, false, false, false, 14, null);
                    if (iDowngradeApi != null) {
                        iDowngradeApi.LJI(new AwS432S0200000_31(c20682915wZ, (C20681915wP) r3, 125));
                        return;
                    }
                    return;
                }
                c20682915wZ.LJ(r3);
                return;
            }
            C20571615ec.LIZ.getClass();
            C20571615ec.LIZ("has init outreach signal manager, return");
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C20571615ec c20571615ec = C20571615ec.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("asyncRegisterPSPOutreachCallback throw error: ");
            sbLIZ.append(th);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            c20571615ec.getClass();
            C20571615ec.LIZIZ(strLIZIZ);
        }
    }

    public final PSPOutreachActionResult LJIIZILJ(String str) {
        String str2;
        if (!((Boolean) C080R.LIZ.getValue()).booleanValue()) {
            if (C20682815wY.LIZ().outreachTriggerPSPActively) {
                C20684815ws.LJIILLIIL("outreach_trigger_psp_actively", C2097608Jq.LJIIJ(new Pair("outreach_timing_key", str), new Pair("error_msg", "psp switch not ready"), new Pair("error_code", "10000")));
            }
            C080G.LIZLLL("strategy_execute", str, null, 10001, "enable_outreach_signal enable false", null, null, 204);
            return new PSPOutreachActionResult(-1, str, "enable_outreach_signal enable false", null, false, null, null, null, null, false, 1016, null);
        }
        C20682915wZ c20682915wZ = (C20682915wZ) this.LIZIZ.LIZIZ.getValue();
        InterfaceC830890Wid interfaceC830890Wid = c20682915wZ.LIZIZ;
        if (interfaceC830890Wid == null && (interfaceC830890Wid = c20682915wZ.LIZJ) == null) {
            if (C20682815wY.LIZ().outreachTriggerPSPActively) {
                C20684815ws.LJIILLIIL("outreach_trigger_psp_actively", C2097608Jq.LJIIJ(new Pair("outreach_timing_key", str), new Pair("error_msg", "psp scene not ready"), new Pair("error_code", "10001")));
            }
            C080G.LIZLLL("strategy_execute", str, null, 10002, "syncRunPSPOutreach, no scene", null, null, 204);
            return new PSPOutreachActionResult(8, str, "syncRunPSPOutreach, no scene", null, false, null, null, null, null, false, 1016, null);
        }
        if (Intrinsics.LJFF(interfaceC830890Wid.getSceneKey(), EnumC1781240wSA.FEED_OUTREACH.getSceneName())) {
            str2 = "outreach_event_process";
        } else {
            str2 = "outreach_event_process_cold_start";
        }
        InterfaceC805220ViK interfaceC805220ViKRunScene = TTMStrategyCenterManager.runScene(interfaceC830890Wid, str2, new TTMParamData((Map<String, Object>) C2097908Jt.LIZJ(new Pair("timing_key", str))));
        if (interfaceC805220ViKRunScene == null) {
            C20571615ec.LIZ.getClass();
            C20571615ec.LIZ("syncRunPSPOutreach result null");
            if (C20682815wY.LIZ().outreachTriggerPSPActively) {
                C20684815ws.LJIILLIIL("outreach_trigger_psp_actively", C2097608Jq.LJIIJ(new Pair("outreach_timing_key", str), new Pair("error_msg", "execute error"), new Pair("error_code", "10002"), new Pair("extra_info", "no psp result")));
            }
            C080G.LIZLLL("strategy_execute", str, null, 10003, "syncRunPSPOutreach, no strategy result", null, null, 204);
            return new PSPOutreachActionResult(7, str, "syncRunPSPOutreach, no strategy result", null, false, null, null, null, null, false, 1016, null);
        }
        return LJIILJJIL(str, interfaceC805220ViKRunScene, true);
    }

    @Override // com.ss.android.ugc.aweme.outreach.signal.IOutreachManager
    public final void LIZ(EnumC20654715s1 enumC20654715s1, InterfaceC1273504yb interfaceC1273504yb) {
        try {
            this.LIZIZ.LIZ().LIZJ.put(enumC20654715s1, interfaceC1273504yb);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C20571615ec c20571615ec = C20571615ec.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("registerOutreachTriggerTimingCallBack throw: ");
            sbLIZ.append(th);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            c20571615ec.getClass();
            C20571615ec.LIZIZ(strLIZIZ);
        }
    }

    @Override // com.ss.android.ugc.aweme.outreach.signal.IOutreachManager
    public final void LJI(EnumC20654715s1 enumC20654715s1, C20551715bP c20551715bP) {
        try {
            this.LIZIZ.LIZ().LJ.put(enumC20654715s1, c20551715bP);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C20571615ec c20571615ec = C20571615ec.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("addFetchInterceptor throw: ");
            sbLIZ.append(th);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            c20571615ec.getClass();
            C20571615ec.LIZIZ(strLIZIZ);
        }
    }

    @Override // com.ss.android.ugc.aweme.outreach.signal.IOutreachManager
    public final void LJIIIIZZ(EnumC20654715s1 enumC20654715s1, AbstractC637050Oyl abstractC637050Oyl) {
        try {
            this.LIZIZ.LIZ().LIZIZ.put(enumC20654715s1, abstractC637050Oyl);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C20571615ec c20571615ec = C20571615ec.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("registerOutreachFetchTimingCallBack throw: ");
            sbLIZ.append(th);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            c20571615ec.getClass();
            C20571615ec.LIZIZ(strLIZIZ);
        }
    }

    @Override // com.ss.android.ugc.aweme.outreach.signal.IOutreachManager
    public final void LJIIJJI(EnumC20654715s1 enumC20654715s1, AbstractC637410OzL abstractC637410OzL) {
        try {
            this.LIZIZ.LIZ().LIZLLL.put(enumC20654715s1, abstractC637410OzL);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C20571615ec c20571615ec = C20571615ec.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("registerParamInjector throw: ");
            sbLIZ.append(th);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            c20571615ec.getClass();
            C20571615ec.LIZIZ(strLIZIZ);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:230:0x0650, code lost:
    
        if (r1 != null) goto L242;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:141:0x04b4  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0543  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0640  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x064e  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0654  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x06e4  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0731  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0781  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x07c6  */
    /* JADX WARN: Type inference failed for: r11v21, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r11v23, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r11v3, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r11v4, types: [java.util.List<java.lang.String>] */
    /* JADX WARN: Type inference failed for: r11v5, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.util.List<? extends java.util.List<? extends java.lang.Object>>] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.ss.android.ugc.aweme.outreach.signal.model.PSPOutreachActionResult LJIILJJIL(java.lang.String r49, X.InterfaceC805220ViK r50, boolean r51) {
        /*
            Method dump skipped, instruction units count: 2226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.signal.OutreachManagerImpl.LJIILJJIL(java.lang.String, X.0ViK, boolean):com.ss.android.ugc.aweme.outreach.signal.model.PSPOutreachActionResult");
    }

    @Override // com.ss.android.ugc.aweme.outreach.signal.IOutreachManager
    public final void LJ(EnumC20654715s1 enumC20654715s1, String str, AbstractC637050Oyl abstractC637050Oyl) {
        try {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append("_manual");
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            C20571615ec c20571615ec = C20571615ec.LIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("signal: trigger fetch timing: ");
            sbLIZ2.append(strLIZIZ);
            sbLIZ2.append(", from: ");
            sbLIZ2.append(enumC20654715s1.getTypeName());
            String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
            c20571615ec.getClass();
            C20571615ec.LIZJ(strLIZIZ2);
            C080A.LIZIZ("signal_trigger", strLIZIZ, enumC20654715s1.getTypeName(), null, null);
            PSPOutreachActionResult pSPOutreachActionResultLJIIZILJ = LJIIZILJ(strLIZIZ);
            Integer num = pSPOutreachActionResultLJIIZILJ.errCode;
            if (num != null && num.intValue() == 0) {
                C080A.LIZIZ("decision_make", strLIZIZ, enumC20654715s1.getTypeName(), null, null);
                OutreachPathEventConfig outreachPathEventConfigLIZ = C20682815wY.LIZ();
                if (outreachPathEventConfigLIZ != null && outreachPathEventConfigLIZ.outreachTriggerPSPActively) {
                    C20684815ws.LJIILLIIL("outreach_trigger_psp_actively", C2097608Jq.LJIIJ(new Pair("action_type", "fetch"), new Pair("outreach_timing_key", strLIZIZ), new Pair("outreach_conditions", pSPOutreachActionResultLJIIZILJ.outreachCondition.toString()), new Pair("error_code", CardStruct.IStatusCode.DEFAULT)));
                }
                ((C20682015wQ) this.LIZIZ.LIZLLL.getValue()).LJI(pSPOutreachActionResultLJIIZILJ.outreachTimingKey, enumC20654715s1, pSPOutreachActionResultLJIIZILJ.outreachCondition, abstractC637050Oyl, pSPOutreachActionResultLJIIZILJ.bizCondition);
                return;
            }
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("trigger fetch timing: ");
            sbLIZ3.append(str);
            sbLIZ3.append(", run error: ");
            String str2 = pSPOutreachActionResultLJIIZILJ.errorMsg;
            String str3 = "no msg";
            if (str2 == null) {
                str2 = "no msg";
            }
            sbLIZ3.append(str2);
            C20571615ec.LIZIZ(C2188811AlT.LIZIZ(sbLIZ3));
            String str4 = pSPOutreachActionResultLJIIZILJ.errorMsg;
            if (str4 != null) {
                str3 = str4;
            }
            abstractC637050Oyl.LIZ(new C20554115bn(-2, str3), str, new n(), new LinkedHashMap());
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C20571615ec c20571615ec2 = C20571615ec.LIZ;
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("triggerOutreachFetchWithType throw: ");
            sbLIZ4.append(th);
            String strLIZIZ3 = C2188811AlT.LIZIZ(sbLIZ4);
            c20571615ec2.getClass();
            C20571615ec.LIZIZ(strLIZIZ3);
        }
    }
}
