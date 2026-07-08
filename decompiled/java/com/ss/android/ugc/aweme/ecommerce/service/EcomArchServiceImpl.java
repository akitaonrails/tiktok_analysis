package com.ss.android.ugc.aweme.ecommerce.service;

import X.C052I;
import X.C052K;
import X.C1228304rJ;
import X.C13048058s;
import X.C1326840kdG;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class EcomArchServiceImpl implements IEcomArchService {
    public static final /* synthetic */ int LIZIZ = 0;
    public final C052I LIZ = new C052K() { // from class: X.052I
        @Override // X.C052K
        public final void onEvent(String str, JSONObject jSONObject) {
            if (C1228304rJ.LIZ.contains(str)) {
                try {
                    jSONObject.put("all_key_values", C786410Ut5.J3(jSONObject));
                } catch (CancellationException e) {
                    TryCatchGuardChecker.doCheck(e);
                    throw e;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
                C1507790pL7.LIZ.getClass();
                C1507790pL7.LIZLLL(str + "_full_sample", jSONObject);
            }
        }
    };

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IEcomArchService
    public final void onBootFinish() {
        C1326840kdG.LIZ.getClass();
        C1326840kdG.LJ();
        if (!C1228304rJ.LIZ.isEmpty()) {
            C13048058s c13048058s = C13048058s.LIZ;
            C052I c052i = this.LIZ;
            c13048058s.getClass();
            ArrayList<C052K> arrayList = C13048058s.LJ;
            synchronized (arrayList) {
                try {
                    arrayList.add(c052i);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }
}
