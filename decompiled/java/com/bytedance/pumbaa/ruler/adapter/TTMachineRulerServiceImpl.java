package com.bytedance.pumbaa.ruler.adapter;

import X.AbstractC839740Wwu;
import X.C080000Rq;
import X.C08KC;
import X.C098200Yq;
import X.C0WLW;
import X.C0WLX;
import X.C189200o6;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C825320WZe;
import X.C839130Wvv;
import X.C839190Ww1;
import X.C839590Wwf;
import X.C839730Wwt;
import X.InterfaceC829690Wgh;
import X.InterfaceC839770Wwx;
import X.InterfaceC839830Wx3;
import android.util.Log;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.pitaya.cep_engine.CepEngineManager;
import com.bytedance.pns.pns_ttmachine_adapter.TTMAdapter;
import com.bytedance.pns.pns_ttmachine_adapter.TTMStateExecutionTimeStatistics;
import com.bytedance.pns.pns_ttmachine_adapter.TTMStatePreprocessTimeStatistics;
import com.bytedance.pns.pns_ttmachine_adapter.TTMachineExecuteResult;
import com.bytedance.pumbaa.ruler.adapter.api.IRuleEngineService;
import com.bytedance.pumbaa.ruler.adapter.api.RuleEngineConfig;
import com.bytedance.pumbaa.ruler.base.models.RuleModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.n;
import com.tiktok.ttm.TTMParamData;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes14.dex */
public final class TTMachineRulerServiceImpl implements IRuleEngineService {
    public static volatile boolean LIZ;
    public static Function0<C839590Wwf> LIZIZ;
    public static C839190Ww1 LIZJ;

    @Override // com.bytedance.pumbaa.ruler.adapter.api.IRuleEngineService
    public final void getParamValue() {
    }

    @Override // com.bytedance.pumbaa.ruler.adapter.api.IRuleEngineService
    public final void LIZIZ() {
        try {
            TTMStatePreprocessTimeStatistics tTMStatePreprocessTimeStatisticsInitWrapper = TTMAdapter.initWrapper(C08KC.LIZJ(new BufferedReader(new InputStreamReader(LIZJ.LIZ.getAssets().open("pns_kids_ruler_config_ttm.json")))));
            Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(new Pair("preprocessTotalTime", Float.valueOf(tTMStatePreprocessTimeStatisticsInitWrapper.getPreprocessTotalTime() / 1000.0f)), new Pair("decodeTotalTime", Float.valueOf(tTMStatePreprocessTimeStatisticsInitWrapper.getDecodeTotalTime() / 1000.0f)), new Pair("bindBdiSymbolTotalTime", Float.valueOf(tTMStatePreprocessTimeStatisticsInitWrapper.getBindBdiSymbolTotalTime() / 1000.0f)));
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("switchConfig:");
            sbLIZ.append(mapLJIIIIZZ);
            C189200o6.m2constructorimpl(Integer.valueOf(Log.d("Pumbaa-RuleEngine", C2188811AlT.LIZIZ(sbLIZ))));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    @Override // com.bytedance.pumbaa.base.ICommonService
    public final void LJ() {
        C839590Wwf c839590WwfInvoke;
        n nVar;
        try {
            Function0<C839590Wwf> function0 = LIZIZ;
            if (function0 != null && (c839590WwfInvoke = function0.invoke()) != null && (nVar = c839590WwfInvoke.LIZIZ) != null) {
                TTMAdapter.initWrapper(nVar.toString());
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    @Override // com.bytedance.pumbaa.ruler.adapter.api.IRuleEngineService
    public final C0WLX LIZLLL(Map map) {
        C839590Wwf c839590WwfInvoke;
        RuleEngineConfig ruleEngineConfig;
        String str = (String) ((LinkedHashMap) map).get("source");
        int i = 0;
        if (!LIZ) {
            return new C0WLX(0, null, null, 255);
        }
        Function0<C839590Wwf> function0 = LIZIZ;
        if (function0 != null && (c839590WwfInvoke = function0.invoke()) != null && (ruleEngineConfig = c839590WwfInvoke.LIZ) != null && ruleEngineConfig.enableRuleEngine) {
            long jNanoTime = System.nanoTime();
            TTMachineExecuteResult tTMachineExecuteResultValidate3Wrapper = TTMAdapter.validate3Wrapper(str, new TTMParamData((Map<String, Object>) map));
            long jNanoTime2 = System.nanoTime();
            ArrayList<C0WLW> arrayList = new ArrayList();
            int length = tTMachineExecuteResultValidate3Wrapper.getPolicyConfig().length;
            for (int i2 = 0; i2 < length; i2++) {
                n nVar = (n) GsonProtectorUtils.fromJson(new Gson(), tTMachineExecuteResultValidate3Wrapper.getPolicyConfig()[i2], n.class);
                RuleModel ruleModel = new RuleModel(nVar.LJJIIZ("title").LJIL(), nVar.LJJIIZ("conf"), "", nVar.LJJIIZ("key").LJIL());
                arrayList.add(new C0WLW(ruleModel, ruleModel.conf, tTMachineExecuteResultValidate3Wrapper.getResults()[i2], 10));
            }
            long jNanoTime3 = System.nanoTime();
            TTMStateExecutionTimeStatistics executionTimeStatistics = tTMachineExecuteResultValidate3Wrapper.getExecutionTimeStatistics();
            C2097608Jq.LJIIIIZZ(new Pair("ttm_total_cost", Float.valueOf((jNanoTime3 - jNanoTime) / 1000000.0f)), new Pair("ttm_jni_cost", Float.valueOf((jNanoTime2 - jNanoTime) / 1000000.0f)), new Pair("ttm_result_adapter_cost", Float.valueOf((jNanoTime3 - jNanoTime2) / 1000000.0f)), new Pair("ttm_c_runEngineTotalTime", Float.valueOf(executionTimeStatistics.getRunEngineTotalTime() / 1000.0f)), new Pair("ttm_c_callBdiTotalTime", Float.valueOf(executionTimeStatistics.getCallBdiTotalTime() / 1000.0f)), new Pair("ttm_c_callUsrBdiTotalTime", Float.valueOf(executionTimeStatistics.getCallUsrBdiTotalTime() / 1000.0f)), new Pair("ttm_c_callJniMethodTime", Float.valueOf(executionTimeStatistics.getCallJniMethodTime() / 1000.0f)));
            for (C0WLW c0wlw : arrayList) {
            }
            if (tTMachineExecuteResultValidate3Wrapper.getStrategyName().length == 0) {
                i = 309;
            }
            return new C0WLX(i, Arrays.asList(tTMachineExecuteResultValidate3Wrapper.getStrategyName()), arrayList, 118);
        }
        return new C0WLX(0, null, null, 255);
    }

    @Override // com.bytedance.pumbaa.ruler.adapter.api.IRuleEngineService
    public final void LJFF(final AbstractC839740Wwu abstractC839740Wwu) {
        TTMAdapter.addFunction(abstractC839740Wwu.LIZ, new InterfaceC829690Wgh() { // from class: X.0Wwv
            @Override // X.InterfaceC829690Wgh
            public final Object LIZ(List list) {
                return abstractC839740Wwu.LIZ(list);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [X.0Wws] */
    @Override // com.bytedance.pumbaa.base.ICommonService
    public final void LIZJ(C839190Ww1 c839190Ww1, Object obj, Object obj2, Object obj3) {
        C839590Wwf c839590WwfInvoke;
        Map<String, Function0<Boolean>> map;
        C839730Wwt c839730Wwt = (C839730Wwt) obj;
        Function0<C839590Wwf> function0 = (Function0) obj2;
        if (C825320WZe.LIZJ()) {
            C839130Wvv c839130Wvv = (C839130Wvv) c839730Wwt.LIZ;
            if (c839130Wvv != null && (map = c839130Wvv.LJIIIIZZ) != null) {
                for (Map.Entry<String, Function0<Boolean>> entry : map.entrySet()) {
                    final String key = entry.getKey();
                    final C080000Rq c080000Rq = new C080000Rq(entry);
                    final ?? r2 = new InterfaceC839770Wwx<T>(key, c080000Rq) { // from class: X.0Wws
                        public final Function0<T> LIZ;

                        @Override // X.InterfaceC839770Wwx
                        public final T getValue() {
                            return this.LIZ.invoke();
                        }

                        {
                            this.LIZ = c080000Rq;
                        }
                    };
                    TTMAdapter.addFunction(key, new InterfaceC829690Wgh() { // from class: X.0Www
                        @Override // X.InterfaceC829690Wgh
                        public final Object LIZ(List list) {
                            return r2.getValue();
                        }
                    });
                }
            }
            LJFF(new AbstractC839740Wwu() { // from class: X.0Wwr
                @Override // X.AbstractC839740Wwu
                public final Object LIZ(List<? extends Object> list) {
                    Float f;
                    Object obj4 = null;
                    boolean z = false;
                    if (list != null) {
                        obj4 = ListProtector.get(list, 0);
                    }
                    if ((obj4 instanceof Float) && (f = (Float) obj4) != null) {
                        float fFloatValue = f.floatValue();
                        if (fFloatValue >= 1.0f || (fFloatValue > 0.0f && AbstractC19994813Le.Default.nextDouble(0.0d, 1.0d) <= fFloatValue)) {
                            z = true;
                        }
                    }
                    return Boolean.valueOf(z);
                }
            });
            LIZIZ = function0;
            LIZJ = c839190Ww1;
            String strLIZ = null;
            if (function0 != null) {
                c839590WwfInvoke = function0.invoke();
            } else {
                c839590WwfInvoke = null;
            }
            if (c839590WwfInvoke.LIZ.enableRuleEngine) {
                InterfaceC839830Wx3 interfaceC839830Wx3 = (InterfaceC839830Wx3) c839730Wwt.LIZIZ;
                if (interfaceC839830Wx3 != null) {
                    strLIZ = interfaceC839830Wx3.LIZ();
                }
                try {
                    TTMStatePreprocessTimeStatistics tTMStatePreprocessTimeStatisticsInitWrapper = TTMAdapter.initWrapper(C08KC.LIZJ(new BufferedReader(new InputStreamReader(c839190Ww1.LIZ.getAssets().open(strLIZ)))));
                    n nVar = c839590WwfInvoke.LIZIZ;
                    if (nVar != null) {
                        TTMAdapter.initWrapper(nVar.toString());
                    }
                    CepEngineManager.INSTANCE.init();
                    LIZ = true;
                    C2097608Jq.LJIIIIZZ(new Pair("preprocessTotalTime", Float.valueOf(tTMStatePreprocessTimeStatisticsInitWrapper.getPreprocessTotalTime() / 1000.0f)), new Pair("decodeTotalTime", Float.valueOf(tTMStatePreprocessTimeStatisticsInitWrapper.getDecodeTotalTime() / 1000.0f)), new Pair("bindBdiSymbolTotalTime", Float.valueOf(tTMStatePreprocessTimeStatisticsInitWrapper.getBindBdiSymbolTotalTime() / 1000.0f)));
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
        }
    }
}
