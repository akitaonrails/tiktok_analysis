package com.ss.android.ugc.aweme.journey;

import X.C01GW;
import X.C04TD;
import X.C10T7;
import X.C1192204lU;
import X.C1514430pVp;
import X.C19254310Uj;
import X.C19254410Uk;
import X.C2097808Js;
import X.C452501pT;
import X.C7740030o;
import X.C823050WQl;
import Y.ARunnableS128S0100000_28;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.plugin.IPluginService;
import com.ss.android.ugc.aweme.plugin.signal.IFeedImpressionService;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: loaded from: classes29.dex */
public final class NewUserSignalService implements INewUserSignalService {
    public final C01GW LIZ = C452501pT.LIZIZ(new C19254310Uj());
    public final C01GW LIZIZ = C452501pT.LIZIZ(new C1192204lU());
    public final C01GW LIZJ;
    public final Gson LIZLLL;
    public LinkedHashMap<String, Long> LJ;
    public volatile String LJFF;

    public static INewUserSignalService LIZJ() {
        Object objLIZ = C04TD.LIZ(INewUserSignalService.class, false);
        if (objLIZ != null) {
            return (INewUserSignalService) objLIZ;
        }
        if (C04TD.x1 == null) {
            synchronized (INewUserSignalService.class) {
                if (C04TD.x1 == null) {
                    C04TD.x1 = new NewUserSignalService();
                }
            }
        }
        return C04TD.x1;
    }

    public NewUserSignalService() {
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(new C19254410Uk());
        this.LIZJ = c01gwLIZIZ;
        this.LIZLLL = C7740030o.LIZ().getGson();
        this.LJFF = ((Keva) c01gwLIZIZ.getValue()).getString("duration_json_snapshot", "");
    }

    @Override // com.ss.android.ugc.aweme.journey.INewUserSignalService
    public final C10T7 LIZIZ() {
        if (!(System.currentTimeMillis() - C1514430pVp.LIZ() < 259200000)) {
            return null;
        }
        C10T7 newUserFeedSignalModel = ((IPluginService) this.LIZ.getValue()).getNewUserFeedSignalModel();
        newUserFeedSignalModel.LJ = this.LJFF;
        newUserFeedSignalModel.LJFF = Integer.valueOf(((IFeedImpressionService) this.LIZIZ.getValue()).LIZJ(null, true));
        newUserFeedSignalModel.LJI = Integer.valueOf(((IFeedImpressionService) this.LIZIZ.getValue()).LIZ(null, true));
        return newUserFeedSignalModel;
    }

    @Override // com.ss.android.ugc.aweme.journey.INewUserSignalService
    public final void LIZ(long j, String str) {
        LinkedHashMap<String, Long> linkedHashMap;
        if (System.currentTimeMillis() - C1514430pVp.LIZ() < 259200000) {
            String json = null;
            if (this.LJ == null) {
                String string = ((Keva) this.LIZJ.getValue()).getString("ordered_duration_map", "");
                if (string.length() > 0) {
                    try {
                        linkedHashMap = (LinkedHashMap) this.LIZLLL.LJIIIIZZ(string, new TypeToken<LinkedHashMap<String, Long>>() { // from class: X.04sy
                        }.getType());
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                    if (linkedHashMap == null) {
                        linkedHashMap = new LinkedHashMap<>();
                    }
                    this.LJ = linkedHashMap;
                } else {
                    linkedHashMap = new LinkedHashMap<>();
                    this.LJ = linkedHashMap;
                }
            }
            LinkedHashMap<String, Long> linkedHashMap2 = this.LJ;
            if (linkedHashMap2 != null) {
                linkedHashMap2.put(str, Long.valueOf(j));
            }
            LinkedHashMap<String, Long> linkedHashMap3 = this.LJ;
            if (linkedHashMap3 != null) {
                List<Pair> listLJIL = C2097808Js.LJIL(linkedHashMap3);
                ArrayList arrayList = new ArrayList();
                for (Pair pair : listLJIL) {
                    arrayList.add(new PageDurationNode((String) pair.getFirst(), ((Number) pair.getSecond()).longValue()));
                }
                json = GsonProtectorUtils.toJson(this.LIZLLL, arrayList, List.class);
            }
            this.LJFF = json;
            C823050WQl.LIZIZ().submit(new ARunnableS128S0100000_28(this, 94));
        }
    }
}
