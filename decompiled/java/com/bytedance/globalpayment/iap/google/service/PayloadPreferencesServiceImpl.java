package com.bytedance.globalpayment.iap.google.service;

import X.C1794820wo4;
import X.C2085008Eu;
import X.C810670Vr7;
import android.content.Context;
import com.bytedance.globalpayment.service.manager.iap.google.PayloadPreferencesService;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes28.dex */
public class PayloadPreferencesServiceImpl implements PayloadPreferencesService {
    public static volatile PayloadPreferencesService instance;

    public static PayloadPreferencesService getInstance() {
        if (instance == null) {
            synchronized (PayloadPreferencesServiceImpl.class) {
                try {
                    if (instance == null) {
                        instance = new PayloadPreferencesServiceImpl();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return instance;
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.google.PayloadPreferencesService
    public void removePayload(Context context, String str) {
        if (C1794820wo4.LIZ == null) {
            C1794820wo4.LIZ = C810670Vr7.LIZJ(context, 0, "payload_prefs");
        }
        C1794820wo4.LIZ.edit().remove(C2085008Eu.LIZ(str)).apply();
    }
}
