package com.ss.android.ugc.aweme.video;

import X.C1505160pGs;
import X.C1505230pGz;
import X.C1505260pH2;
import X.C1510700pPo;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.player.sdk.api.IPortraitService;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes24.dex */
public class SmartPortraitService implements IPortraitService {
    public JSONObject getPortraits() {
        ConcurrentHashMap<String, String> concurrentHashMapLJI = C1510700pPo.LIZ().LJI();
        if (concurrentHashMapLJI == null || concurrentHashMapLJI.isEmpty()) {
            return null;
        }
        return new JSONObject(concurrentHashMapLJI);
    }

    public JSONObject getServerPortraits() {
        C1510700pPo.LIZ().getClass();
        ConcurrentHashMap<String, String> concurrentHashMapLJI = C1505260pH2.LIZ().LJI();
        if (concurrentHashMapLJI == null || concurrentHashMapLJI.isEmpty()) {
            return null;
        }
        return new JSONObject(concurrentHashMapLJI);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.IPortraitService
    public Map<String, String> getGroupPortraits(String str) {
        C1505160pGs c1505160pGsLIZ = C1510700pPo.LIZ();
        ConcurrentHashMap concurrentHashMap = null;
        if (str != null) {
            List<String> list = c1505160pGsLIZ.LJII.get(str);
            if (list != null) {
                for (String str2 : list) {
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    String strLIZJ = c1505160pGsLIZ.LIZJ(str2);
                    if (strLIZJ != null) {
                        concurrentHashMap.put(str2, strLIZJ);
                    }
                }
            }
        } else {
            c1505160pGsLIZ.getClass();
        }
        return concurrentHashMap;
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.IPortraitService
    public String getPortrait(String str) {
        return C1510700pPo.LIZ().LIZJ(str);
    }

    public void updatePortraits(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        Iterator<String> itKeys = jSONObject.keys();
        ConcurrentHashMap<String, String> concurrentHashMap = new ConcurrentHashMap<>();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            try {
                concurrentHashMap.put(next, JSONObjectProtectorUtils.getString(jSONObject, next));
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        C1510700pPo.LIZ().getClass();
        C1505230pGz.LIZ().LJIIJ(concurrentHashMap);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.IPortraitService
    public void addGroupConfig(String str, List<String> list) {
        C1505160pGs c1505160pGsLIZ = C1510700pPo.LIZ();
        c1505160pGsLIZ.getClass();
        if (str != null) {
            if (list != null) {
                c1505160pGsLIZ.LJII.put(str, list);
            } else {
                c1505160pGsLIZ.LJII.remove(str);
            }
        }
    }

    public void updatePortrait(String str, String str2) {
        C1510700pPo.LIZ().getClass();
        C1505230pGz.LIZ().LJIIIZ(str, str2);
    }
}
