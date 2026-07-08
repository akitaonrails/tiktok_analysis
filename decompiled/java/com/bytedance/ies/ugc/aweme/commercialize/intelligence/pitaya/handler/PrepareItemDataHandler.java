package com.bytedance.ies.ugc.aweme.commercialize.intelligence.pitaya.handler;

import X.AbstractC2245151Cu9;
import X.C01GW;
import X.C098200Yq;
import X.C1022620cia;
import X.C1617880sCg;
import X.C189200o6;
import X.C1AF0;
import X.C2188811AlT;
import X.C2245111Cu5;
import X.C2245121Cu6;
import X.C2245131Cu7;
import X.C2245141Cu8;
import X.C2245161CuA;
import X.C2245351CuT;
import X.C293430Ben;
import X.C452501pT;
import X.C786410Ut5;
import X.C844470XAv;
import X.InterfaceC2245181CuC;
import com.bytedance.ies.ugc.aweme.commercialize.intelligence.pitaya.model.AdRerankInput;
import com.bytedance.ies.ugc.aweme.commercialize.intelligence.pitaya.model.BaseRankModel;
import com.bytedance.ies.ugc.aweme.commercialize.intelligence.pitaya.model.CandidateAdData;
import com.bytedance.ies.ugc.aweme.commercialize.intelligence.pitaya.model.ExtraAdRequestJson;
import com.bytedance.ies.ugc.aweme.commercialize.intelligence.pitaya.model.ParamJson;
import com.bytedance.ies.ugc.aweme.commercialize.intelligence.pitaya.model.PostRollAdRequestJson;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.pitaya.api.PTYTaskResultCallback;
import com.bytedance.pitaya.api.PitayaCoreFactory;
import com.bytedance.pitaya.api.bean.PTYError;
import com.bytedance.pitaya.api.bean.PTYPackageInfo;
import com.bytedance.pitaya.api.bean.PTYTaskConfig;
import com.bytedance.pitaya.api.bean.PTYTaskData;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.n;
import com.google.gson.p;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS225S0000000_34;
import kotlin.text.Charsets;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes35.dex */
public final class PrepareItemDataHandler extends AbstractC2245151Cu9 {
    public final String LIZ;
    public final String LIZIZ;
    public final C01GW LIZJ;

    public PrepareItemDataHandler() {
        C844470XAv.LIZ.getClass();
        this.LIZ = C844470XAv.LJFF();
        this.LIZIZ = String.valueOf(C844470XAv.LJIIJ);
        this.LIZJ = C452501pT.LIZIZ(AFwS225S0000000_34.get$arr$(20));
    }

    public static JSONObject LIZIZ(C2245111Cu5 c2245111Cu5) {
        PostRollAdRequestJson postRollAdRequestJson;
        C2245141Cu8 c2245141Cu8;
        C2245131Cu7 c2245131Cu7 = c2245111Cu5.LJFF;
        int i = c2245131Cu7.LIZ;
        long j = c2245131Cu7.LJFF;
        long j2 = c2245131Cu7.LJI;
        String str = c2245131Cu7.LIZIZ;
        List<BaseRankModel> list = c2245111Cu5.LIZJ;
        Long lValueOf = Long.valueOf(c2245111Cu5.LIZLLL.LIZ);
        Long lValueOf2 = Long.valueOf(c2245111Cu5.LIZLLL.LIZIZ);
        C2245121Cu6 c2245121Cu6 = c2245111Cu5.LIZLLL;
        String str2 = c2245121Cu6.LIZJ;
        Integer numValueOf = Integer.valueOf(c2245121Cu6.LJ);
        C2245121Cu6 c2245121Cu62 = c2245111Cu5.LIZLLL;
        ExtraAdRequestJson extraAdRequestJson = new ExtraAdRequestJson(lValueOf, lValueOf2, str2, numValueOf, c2245121Cu62.LIZLLL, c2245121Cu62.LJFF);
        C293430Ben.LIZ.getClass();
        if (C293430Ben.LIZ() && (c2245141Cu8 = c2245111Cu5.LJ) != null && c2245141Cu8.LIZJ != null) {
            Long lValueOf3 = Long.valueOf(c2245141Cu8.LIZ);
            C2245141Cu8 c2245141Cu82 = c2245111Cu5.LJ;
            postRollAdRequestJson = new PostRollAdRequestJson(lValueOf3, c2245141Cu82.LIZIZ, c2245141Cu82.LIZJ);
        } else {
            postRollAdRequestJson = null;
        }
        return new JSONObject(GsonProtectorUtils.toJson(C1617880sCg.LIZ, new AdRerankInput("adjust_items", new ParamJson(Integer.valueOf(i), Long.valueOf(j), Long.valueOf(j2), str, extraAdRequestJson, postRollAdRequestJson, list))));
    }

    public final JSONObject LIZJ(C2245111Cu5 c2245111Cu5) throws JSONException {
        Object c098200Yq;
        List<BaseRankModel> list = c2245111Cu5.LIZJ;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("function_name", c2245111Cu5.LIZIZ);
        jSONObject.put("client_version", this.LIZ);
        JSONObject jSONObject2 = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        for (BaseRankModel baseRankModel : list) {
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("feed_status", baseRankModel.getFeedStatus());
            Gson gson = C1617880sCg.LIZ;
            jSONObject3.put("feed_data", new JSONObject(GsonProtectorUtils.toJson(gson, baseRankModel.getRankData())));
            jSONObject3.put("feed_action_data", new JSONObject(GsonProtectorUtils.toJson(gson, baseRankModel.getFeedActionData())));
            jSONArray.put(jSONObject3);
        }
        jSONObject2.put("recent_feed_list", jSONArray);
        try {
            c098200Yq = new JSONObject(c2245111Cu5.LJFF.LIZJ);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
            c098200Yq = new JSONObject();
        }
        jSONObject2.put("ab_params", c098200Yq);
        jSONObject2.put("trigger_source", c2245111Cu5.LJFF.LIZ);
        jSONObject2.put("trigger_scene", c2245111Cu5.LIZ.LIZLLL);
        jSONObject2.put("sati_param_for_pitaya", c2245111Cu5.LJFF.LIZIZ);
        JSONObject jSONObject4 = new JSONObject();
        jSONObject4.put("last_req_time", c2245111Cu5.LIZLLL.LIZ);
        jSONObject4.put("last_async_req_time", c2245111Cu5.LIZLLL.LIZIZ);
        jSONObject4.put("sati_param_for_pitaya", c2245111Cu5.LIZLLL.LIZJ);
        jSONObject4.put("drop_extra_ad_cnt", c2245111Cu5.LIZLLL.LJ);
        JSONArray jSONArray2 = new JSONArray();
        Iterator<CandidateAdData> it2 = c2245111Cu5.LIZLLL.LIZLLL.iterator();
        while (it2.hasNext()) {
            jSONArray2.put(new JSONObject(GsonProtectorUtils.toJson(C1617880sCg.LIZ, it2.next())));
        }
        jSONObject4.put("extra_ad_list", jSONArray2);
        jSONObject2.put("extra_ad_request_json", jSONObject4);
        C293430Ben.LIZ.getClass();
        if (C293430Ben.LIZ()) {
            JSONObject jSONObject5 = new JSONObject();
            C2245141Cu8 c2245141Cu8 = c2245111Cu5.LJ;
            if (c2245141Cu8 != null && c2245141Cu8.LIZJ != null) {
                jSONObject5.put("last_async_req_time", c2245141Cu8.LIZ);
                jSONObject5.put("sati_param_for_pitaya", c2245111Cu5.LJ.LIZIZ);
                jSONObject5.put("post_roll_ad", new JSONObject(GsonProtectorUtils.toJson(C1617880sCg.LIZ, c2245111Cu5.LJ.LIZJ)));
            }
            if (jSONObject5.length() > 0) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("[getPostRollParams] json=");
                sbLIZ.append(jSONObject5);
                C1022620cia.LIZ("PrepareItemDataHandler", C2188811AlT.LIZIZ(sbLIZ));
            }
            jSONObject2.put("post_roll_ad_request_json", jSONObject5);
        }
        jSONObject.put("param_json", jSONObject2);
        return jSONObject;
    }

    @Override // X.AbstractC2245151Cu9
    public final void LIZ(final C2245161CuA c2245161CuA, final InterfaceC2245181CuC interfaceC2245181CuC) {
        Integer numValueOf;
        C2245351CuT.LJ = System.currentTimeMillis();
        final C2245111Cu5 c2245111Cu5 = c2245161CuA.LIZ;
        JSONObject jSONObject = new JSONObject();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Process 2(pitaya input): list=(size=");
        List<BaseRankModel> list = c2245111Cu5.LIZJ;
        if (list != null) {
            numValueOf = Integer.valueOf(list.size());
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        sbLIZ.append(')');
        sbLIZ.append(c2245111Cu5.LIZJ);
        C1022620cia.LJ("PrepareItemDataHandler", C2188811AlT.LIZIZ(sbLIZ));
        try {
            if (((Boolean) this.LIZJ.getValue()).booleanValue()) {
                jSONObject = LIZIZ(c2245111Cu5);
            } else {
                jSONObject = LIZJ(c2245111Cu5);
            }
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            C1AF0.LJ(e);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("[internalHandle] e = ");
            sbLIZ2.append(e);
            C1022620cia.LIZIZ("PrepareItemDataHandler", C2188811AlT.LIZIZ(sbLIZ2));
        }
        C2245351CuT.LJJ = C786410Ut5.J3(jSONObject).getBytes(Charsets.UTF_8).length;
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("[internalHandle] pitaya.input=");
        sbLIZ3.append(jSONObject);
        sbLIZ3.append(", size=");
        sbLIZ3.append(C2245351CuT.LJJ);
        sbLIZ3.append(" Bytes");
        C1022620cia.LIZ("PrepareItemDataHandler", C2188811AlT.LIZIZ(sbLIZ3));
        C2245351CuT.LJFF = System.currentTimeMillis();
        PitayaCoreFactory.getCore(this.LIZIZ).runTask(c2245111Cu5.LIZ.LIZ, new PTYTaskData(jSONObject), new PTYTaskConfig(false, null, -1.0f), new PTYTaskResultCallback() { // from class: com.bytedance.ies.ugc.aweme.commercialize.intelligence.pitaya.handler.PrepareItemDataHandler$internalHandle$1
            @Override // com.bytedance.pitaya.api.PTYTaskResultCallback
            public void onResult(boolean z, PTYError pTYError, PTYTaskData pTYTaskData, PTYPackageInfo pTYPackageInfo) {
                JSONObject params;
                Object c098200Yq;
                if (pTYError != null && pTYError.getCode() != 0) {
                    InterfaceC2245181CuC interfaceC2245181CuC2 = interfaceC2245181CuC;
                    if (interfaceC2245181CuC2 != null) {
                        int code = pTYError.getCode();
                        String summary = pTYError.getSummary();
                        if (summary == null) {
                            summary = "";
                        }
                        interfaceC2245181CuC2.LIZIZ(code, summary, c2245161CuA);
                        return;
                    }
                    return;
                }
                C2245351CuT.LJIIJJI = System.currentTimeMillis();
                C2245111Cu5 c2245111Cu52 = c2245111Cu5;
                this.getClass();
                n nVar = new n();
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("[getLegacyRst] pitaya.output=");
                sbLIZ4.append(pTYTaskData);
                C1022620cia.LIZ("PrepareItemDataHandler", C2188811AlT.LIZIZ(sbLIZ4));
                if (pTYTaskData != null && (params = pTYTaskData.getParams()) != null) {
                    try {
                        new p();
                        nVar.LJJIFFI("rst", p.LIZJ(C786410Ut5.J3(params)));
                        c098200Yq = Unit.LIZ;
                        C189200o6.m2constructorimpl(c098200Yq);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        c098200Yq = new C098200Yq(th);
                        C189200o6.m2constructorimpl(c098200Yq);
                    }
                    C189200o6.m1boximpl(c098200Yq);
                }
                if (pTYError != null) {
                    nVar.LJJIIJ("err_info", pTYError.toString());
                }
                c2245111Cu52.LJI = nVar;
                c2245161CuA.LIZIZ(interfaceC2245181CuC);
            }
        });
    }
}
