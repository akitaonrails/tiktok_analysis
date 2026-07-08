package com.ss.android.ugc.aweme.ecommerce.search.suggest.vm;

import X.C098200Yq;
import X.C099M;
import X.C099Q;
import X.C099R;
import X.C0QER;
import X.C1849707Mh;
import X.C189200o6;
import X.C2252611DEt;
import X.C650500PfM;
import X.C673690Qbf;
import X.C844470XAv;
import X.InterfaceC1364105Vn;
import X.InterfaceC20236714Gf;
import com.bytedance.pitaya.api.PTYTaskResultCallback;
import com.bytedance.pitaya.api.PitayaCoreFactory;
import com.bytedance.pitaya.api.bean.PTYError;
import com.bytedance.pitaya.api.bean.PTYPackageInfo;
import com.bytedance.pitaya.api.bean.PTYTaskConfig;
import com.bytedance.pitaya.api.bean.PTYTaskData;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.search.ecommerce.entrance.ECSearchEntranceData;
import com.ss.android.ugc.aweme.search.model.SearchHistory;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS241S0000000_10;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public final class EcSearchMiddlePitayaHelper {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZIZ(C0QER c0qer) {
        ECSearchEntranceData ecSearchEntranceData;
        if (c0qer != null && (ecSearchEntranceData = c0qer.getEcSearchEntranceData()) != null && !ecSearchEntranceData.getBooleanStrategy("disable_history_strategy") && C1849707Mh.LIZJ) {
            return true;
        }
        return false;
    }

    public static JSONObject LIZ(C0QER c0qer, List list) {
        int iLIZ;
        ECSearchEntranceData ecSearchEntranceData;
        if (c0qer != null && (ecSearchEntranceData = c0qer.getEcSearchEntranceData()) != null) {
            iLIZ = C650500PfM.LIZ(ecSearchEntranceData);
        } else {
            iLIZ = -100;
        }
        JSONArray jSONArray = new JSONArray();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            String str = ((SearchHistory) it2.next()).keyword;
            if (str != null) {
                jSONArray.put(str);
            }
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("root_enter_from_type", iLIZ);
        jSONObject.put("queries", jSONArray);
        return jSONObject;
    }

    public static void LIZJ(C673690Qbf c673690Qbf, JSONObject jSONObject) throws JSONException {
        Object objOpt;
        for (String str : C1849707Mh.LIZLLL) {
            JSONObject jSONObject2 = c673690Qbf.LIZIZ;
            if (jSONObject2 != null) {
                objOpt = jSONObject2.opt(str);
            } else {
                objOpt = null;
            }
            jSONObject.put(str, objOpt);
        }
    }

    public static Object LIZLLL(JSONObject jSONObject, InterfaceC1364105Vn interfaceC1364105Vn) {
        final C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(interfaceC1364105Vn));
        c2252611DEt.LJIJJ();
        c2252611DEt.LJJII(AFwS241S0000000_10.get$arr$(80));
        C844470XAv.LIZ.getClass();
        PitayaCoreFactory.getCore(String.valueOf(C844470XAv.LJIIJ)).runTask("gec_search_middle_feature", new PTYTaskData(jSONObject), new PTYTaskConfig(false, null, -1.0f), new PTYTaskResultCallback() { // from class: com.ss.android.ugc.aweme.ecommerce.search.suggest.vm.EcSearchMiddlePitayaHelper$runPitayaTaskSynchronously$2$2
            @Override // com.bytedance.pitaya.api.PTYTaskResultCallback
            public void onResult(boolean z, PTYError pTYError, PTYTaskData pTYTaskData, PTYPackageInfo pTYPackageInfo) {
                JSONObject params;
                if (z && pTYTaskData != null) {
                    params = pTYTaskData.getParams();
                } else {
                    params = null;
                }
                C673690Qbf c673690Qbf = new C673690Qbf(Boolean.valueOf(z), params);
                InterfaceC20236714Gf<C673690Qbf> interfaceC20236714Gf = c2252611DEt;
                try {
                    if (interfaceC20236714Gf.isActive()) {
                        C189200o6.m2constructorimpl(c673690Qbf);
                        interfaceC20236714Gf.resumeWith(c673690Qbf);
                    }
                    C189200o6.m2constructorimpl(Unit.LIZ);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C189200o6.m2constructorimpl(new C098200Yq(th));
                }
            }
        });
        Object objLJIJ = c2252611DEt.LJIJ();
        if (objLJIJ == C099R.LJFF()) {
            C099Q.LIZJ(interfaceC1364105Vn);
        }
        return objLJIJ;
    }
}
