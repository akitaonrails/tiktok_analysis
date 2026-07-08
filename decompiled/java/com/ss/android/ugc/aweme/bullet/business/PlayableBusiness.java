package com.ss.android.ugc.aweme.bullet.business;

import X.C1038730d8Z;
import X.C1039190d9J;
import X.C1041600dDC;
import X.C1AF0;
import X.InterfaceC1039160d9G;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.bullet.business.BulletBusinessService;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public final class PlayableBusiness extends BulletBusinessService.Business {
    public PlayableBusiness(C1039190d9J c1039190d9J) {
        super(c1039190d9J);
    }

    public final void LIZ(boolean z, boolean z2) {
        Integer numLIZJ;
        C1041600dDC c1041600dDC = this.LIZ.LIZIZ;
        if ((c1041600dDC instanceof C1038730d8Z) && (numLIZJ = ((C1038730d8Z) c1041600dDC).LJJZZIII.LIZJ()) != null && numLIZJ.intValue() == 1) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("endcard_mute", z);
                jSONObject.put("endcard_show", z2);
                InterfaceC1039160d9G interfaceC1039160d9G = this.LIZ.LIZLLL;
                if (interfaceC1039160d9G != null) {
                    interfaceC1039160d9G.sendEvent("endcard_control_event", jSONObject);
                }
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
                C1AF0.LJ(e);
            }
        }
    }
}
