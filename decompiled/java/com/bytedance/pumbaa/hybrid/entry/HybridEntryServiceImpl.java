package com.bytedance.pumbaa.hybrid.entry;

import X.C0275007l;
import X.C098200Yq;
import X.C0VZK;
import X.C0WLQ;
import X.C0WNH;
import X.C0WNT;
import X.C0WNW;
import X.C1104804Tu;
import X.C1110204Vw;
import X.C189200o6;
import X.C2097608Jq;
import X.C822040WMo;
import android.os.SystemClock;
import com.bytedance.pumbaa.hybrid.api.IHybridHookService;
import com.bytedance.pumbaa.hybrid.governance.api.BaseGovernanceModel;
import com.bytedance.pumbaa.hybrid.governance.api.HybridGovernanceServiceDefaultImpl;
import com.bytedance.pumbaa.hybrid.governance.api.IHybridGovernanceService;
import com.bytedance.pumbaa.hybrid.monitor.api.IHybridMonitorPureService;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.orbu.core.TTKOrbu;
import com.orbu.core.adapter.TTKResponse;
import com.orbu.core.adapter.TTKResponseKt;
import com.orbu.core.adapter.TTKWebRouterRequest;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.Collections;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS557S0100000_13;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public final class HybridEntryServiceImpl implements IHybridEntryService {
    public Function0<C822040WMo> LIZ;

    @Override // com.bytedance.pumbaa.hybrid.entry.IHybridEntryService
    public final void LIZ(AwS557S0100000_13 awS557S0100000_13) throws Throwable {
        Object c098200Yq;
        C822040WMo c822040WMoInvoke;
        this.LIZ = awS557S0100000_13;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j = 0;
        try {
            Function0<C822040WMo> function0 = this.LIZ;
            if (function0 != null && (c822040WMoInvoke = function0.invoke()) != null) {
                long j2 = c822040WMoInvoke.LIZ.LIZLLL;
                if (j2 != 0) {
                    PnsHybridPerformanceSampleModel pnsHybridPerformanceSampleModel = C0275007l.LIZ;
                    PnsHybridPerformanceSampleModel pnsHybridPerformanceSampleModel2 = (PnsHybridPerformanceSampleModel) C0VZK.LIZIZ().LIZJ(PnsHybridPerformanceSampleModel.class, "pns_hybrid_performance_sample", pnsHybridPerformanceSampleModel);
                    if (pnsHybridPerformanceSampleModel2 != null) {
                        pnsHybridPerformanceSampleModel = pnsHybridPerformanceSampleModel2;
                    }
                    C0WLQ.LIZ = pnsHybridPerformanceSampleModel.sampleRate;
                    JSONObject jSONObject = new JSONObject();
                    long j3 = jElapsedRealtime - j2;
                    if (j3 < 0) {
                        j3 = 0;
                    }
                    jSONObject.put("delay_ms", j3);
                    C0WLQ.LIZIZ("pbh_init_start", null, jSONObject);
                }
                C0VZK.LIZ = c822040WMoInvoke.LIZ;
                C1110204Vw.LIZ().LIZIZ(c822040WMoInvoke.LJFF.LIZ);
                C1110204Vw.LIZ().LJ(c822040WMoInvoke.LJFF.LIZIZ);
                C1104804Tu.LIZ().init();
                IHybridHookService iHybridHookService = (IHybridHookService) ServiceManager.get().getService(IHybridHookService.class);
                if (iHybridHookService != null) {
                    iHybridHookService.LIZ(c822040WMoInvoke.LJ);
                }
                IHybridMonitorPureService iHybridMonitorPureService = (IHybridMonitorPureService) ServiceManager.get().getService(IHybridMonitorPureService.class);
                if (iHybridMonitorPureService != null) {
                    iHybridMonitorPureService.init(c822040WMoInvoke.LIZJ);
                }
                IHybridGovernanceService iHybridGovernanceServiceCreateIHybridGovernanceServicebyMonsterPlugin = HybridGovernanceServiceDefaultImpl.createIHybridGovernanceServicebyMonsterPlugin(false);
                if (iHybridGovernanceServiceCreateIHybridGovernanceServicebyMonsterPlugin != null) {
                    iHybridGovernanceServiceCreateIHybridGovernanceServicebyMonsterPlugin.init(c822040WMoInvoke.LIZIZ);
                }
                C0WNW c0wnw = c822040WMoInvoke.LIZLLL;
                C0WNT.LIZ = c0wnw;
                c0wnw.getClass();
                HybridGovernanceServiceDefaultImpl.createIHybridGovernanceServicebyMonsterPlugin(false).addAction(new C0WNH() { // from class: X.0WN5
                    @Override // X.C0WNH
                    public final boolean LIZJ() {
                        return false;
                    }

                    @Override // X.C0WNH
                    public final List<C0WND> LIZ() {
                        return Collections.singletonList(C0WND.ALL);
                    }

                    @Override // X.C0WMB
                    public final BaseGovernanceModel LIZIZ() {
                        TTKOrbu tTKOrbu = TTKOrbu.INSTANCE;
                        return new BaseGovernanceModel(null, tTKOrbu.enableInterceptor(), tTKOrbu.enableInterceptor(), true, false);
                    }

                    @Override // X.C0WMB
                    public final C0WMF LIZLLL() {
                        return new C0WMF("SandboxValidAction", C0WN8.ROUTER, C0WNE.L3, 50050, 16);
                    }

                    @Override // X.C0WMB
                    public final C0WM1 LJ(C0WMD c0wmd) throws JSONException {
                        C0WN7 c0wn7;
                        String str;
                        Integer numValueOf;
                        Object objLIZ = c0wmd.LIZ();
                        String description = null;
                        if (!(objLIZ instanceof C0WN7) || (c0wn7 = (C0WN7) objLIZ) == null) {
                            return null;
                        }
                        TTKOrbu tTKOrbu = TTKOrbu.INSTANCE;
                        boolean zEnableInterceptor = tTKOrbu.enableInterceptor();
                        C822060WMq.LIZ(this, zEnableInterceptor);
                        if (!zEnableInterceptor) {
                            return null;
                        }
                        int i = c0wn7.LJFF;
                        if (i != 0) {
                            if (i != 1) {
                                if (i != 2) {
                                    str = "";
                                } else {
                                    str = "cct";
                                }
                            } else {
                                str = "iab";
                            }
                        } else {
                            str = "pureruntime";
                        }
                        int i2 = c0wn7.LJI;
                        if (i2 == 0) {
                            if (C0WNT.LIZ != null) {
                                i2 = 402685958;
                            } else {
                                i2 = 0;
                            }
                        }
                        TTKResponse tTKResponseShouldInterceptTTKRequest = tTKOrbu.shouldInterceptTTKRequest(new TTKWebRouterRequest("", c0wn7.LIZLLL, str, C2097908Jt.LIZJ(new Pair("x-tt-dataflow-id", String.valueOf(i2)))));
                        if (!TTKResponseKt.isBlock(tTKResponseShouldInterceptTTKRequest)) {
                            return null;
                        }
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("intercepted by sandbox, code: ");
                        if (tTKResponseShouldInterceptTTKRequest != null) {
                            numValueOf = Integer.valueOf(TTKResponseKt.getStatusCode(tTKResponseShouldInterceptTTKRequest));
                        } else {
                            numValueOf = null;
                        }
                        sbLIZ.append(numValueOf);
                        sbLIZ.append(", desc: ");
                        if (tTKResponseShouldInterceptTTKRequest != null) {
                            description = TTKResponseKt.getDescription(tTKResponseShouldInterceptTTKRequest);
                        }
                        sbLIZ.append(description);
                        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("url", c0wn7.LIZLLL);
                        jSONObject2.put("dataflowId", c0wn7.LJI);
                        jSONObject2.put("webRuntime", str);
                        return new C0WM1(true, jSONObject2, jSONObject2, new C821850WLv(true, C2097908Jt.LIZJ(new Pair("error", new C821880WLy(103, strLIZIZ)))));
                    }
                });
                c098200Yq = Unit.LIZ;
                C189200o6.m2constructorimpl(c098200Yq);
            } else {
                return;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m8isSuccessimpl(c098200Yq)) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("sdk_init_result", 1);
            JSONObject jSONObject3 = new JSONObject();
            long jElapsedRealtime2 = SystemClock.elapsedRealtime() - jElapsedRealtime;
            if (jElapsedRealtime2 < 0) {
                jElapsedRealtime2 = 0;
            }
            jSONObject3.put("duration", jElapsedRealtime2);
            C0WLQ.LIZIZ("pbh_init_finish", jSONObject2, jSONObject3);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put("sdk_init_result", 0);
            JSONObject jSONObject5 = new JSONObject();
            long jElapsedRealtime3 = SystemClock.elapsedRealtime() - jElapsedRealtime;
            if (jElapsedRealtime3 >= 0) {
                j = jElapsedRealtime3;
            }
            jSONObject5.put("duration", j);
            C0WLQ.LIZIZ("pbh_init_finish", jSONObject4, jSONObject5);
            C0VZK.LIZ(thM5exceptionOrNullimpl, "pbh_init_error", C2097608Jq.LJIIJ(new Pair("message", "pbh_init_error")));
            throw thM5exceptionOrNullimpl;
        }
    }
}
