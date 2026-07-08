package com.bytedance.android.starship.solaria;

import X.C01GW;
import X.C1513100pTg;
import X.C20320714fF;
import X.C20320814fG;
import X.C452501pT;
import com.bytedance.android.starship.engine.service.StarshipEngineService;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.LinkedHashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes32.dex */
public final class StarshipSolaria implements IStarshipSolaria {
    public final C01GW LIZ = C452501pT.LIZIZ(new C20320714fF());
    public final C01GW LIZIZ = C452501pT.LIZIZ(new C20320814fG());

    @Override // com.bytedance.android.starship.solaria.IStarshipSolaria
    public final Object LIZJ(String str) {
        Object obj;
        synchronized (this.LIZIZ.getValue()) {
            try {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                ((C1513100pTg) this.LIZIZ.getValue()).LIZJ(str, linkedHashMap);
                obj = linkedHashMap.get(str);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return obj;
    }

    @Override // com.bytedance.android.starship.solaria.IStarshipSolaria
    public final void LIZ(String str, JSONObject jSONObject) {
        if (str == null) {
            return;
        }
        ((StarshipEngineService) ServiceManager.get().getService(StarshipEngineService.class)).onAppLogEvent(str, jSONObject);
    }

    @Override // com.bytedance.android.starship.solaria.IStarshipSolaria
    public final void LIZIZ(String str, JSONObject jSONObject) {
        StarshipEngineService starshipEngineService = (StarshipEngineService) this.LIZ.getValue();
        if (starshipEngineService != null) {
            starshipEngineService.LIZ(str);
        }
    }
}
