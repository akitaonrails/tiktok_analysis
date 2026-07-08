package com.ss.android.ugc.aweme.commercialize.anchor.service;

import X.C04TD;
import X.C1617880sCg;
import X.C2188811AlT;
import X.C2276411E8h;
import X.C2344809Gs;
import X.EnumC1430380nKG;
import android.text.TextUtils;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.anchor.service.IGetLeadsAnchorService;
import com.ss.android.ugc.aweme.base.AnchorListManager;
import com.ss.android.ugc.aweme.shortvideo.model.AnchorPublishStruct;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes30.dex */
public final class GetLeadsAnchorService implements IGetLeadsAnchorService {
    public final Keva LIZ = Keva.getRepo("anchor_data_keva");
    public int LIZIZ = 1;

    public static IGetLeadsAnchorService LJ() {
        Object objLIZ = C04TD.LIZ(IGetLeadsAnchorService.class, false);
        if (objLIZ != null) {
            return (IGetLeadsAnchorService) objLIZ;
        }
        if (C04TD.LLJJL == null) {
            synchronized (IGetLeadsAnchorService.class) {
                if (C04TD.LLJJL == null) {
                    C04TD.LLJJL = new GetLeadsAnchorService();
                }
            }
        }
        return C04TD.LLJJL;
    }

    @Override // com.ss.android.ugc.aweme.anchor.service.IGetLeadsAnchorService
    public final int LIZ() {
        return this.LIZIZ;
    }

    @Override // com.ss.android.ugc.aweme.anchor.service.IGetLeadsAnchorService
    public final boolean LIZIZ(JSONObject jSONObject) {
        JSONObject jSONObject2;
        if (jSONObject != null && (jSONObject2 = JSONObjectProtectorUtils.getJSONObject(jSONObject, "data")) != null) {
            return LIZJ(Integer.valueOf(jSONObject2.optInt("leadsGenStatusCode")));
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.anchor.service.IGetLeadsAnchorService
    public final boolean LIZJ(Integer num) {
        if (num == null) {
            return false;
        }
        num.intValue();
        if (num.intValue() == this.LIZIZ) {
            return false;
        }
        this.LIZIZ = num.intValue();
        Map map = null;
        try {
            String string = this.LIZ.getString("anchor_map_key", null);
            if (!TextUtils.isEmpty(string)) {
                Map map2 = (Map) C1617880sCg.LIZ.LJIIIIZZ(string, new TypeToken<Map<String, AnchorPublishStruct>>() { // from class: X.0xAB
                }.getType());
                map = map2;
                if (map2 != null) {
                    Iterator it2 = map2.entrySet().iterator();
                    while (it2.hasNext()) {
                        AnchorPublishStruct anchorPublishStruct = (AnchorPublishStruct) ((Map.Entry) it2.next()).getValue();
                        if (anchorPublishStruct.type == EnumC1430380nKG.GET_LEADS.getTYPE()) {
                            anchorPublishStruct.getLeadsAnchorState = num.intValue();
                        }
                    }
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("GetLeadsAnchorService getLocalData Exception: ");
            sbLIZ.append(e);
            C2344809Gs.LJ(C2188811AlT.LIZIZ(sbLIZ));
            C2276411E8h.LIZIZ.LIZLLL("anchor_business", e);
        }
        AnchorListManager.LIZ.getClass();
        AnchorListManager.LJIILJJIL(map);
        this.LIZ.storeString("anchor_map_key", GsonProtectorUtils.toJson(C1617880sCg.LIZ, map, new TypeToken<Map<String, AnchorPublishStruct>>() { // from class: X.11G8
        }.getType()));
        return true;
    }

    @Override // com.ss.android.ugc.aweme.anchor.service.IGetLeadsAnchorService
    public final boolean LIZLLL(JSONObject jSONObject) {
        JSONObject jSONObject2;
        int iOptInt;
        if (jSONObject != null && (jSONObject2 = JSONObjectProtectorUtils.getJSONObject(jSONObject, "data")) != null && (iOptInt = jSONObject2.optInt("leadsGenStatusCode", 1)) == 0) {
            LIZJ(Integer.valueOf(iOptInt));
            return true;
        }
        return false;
    }
}
