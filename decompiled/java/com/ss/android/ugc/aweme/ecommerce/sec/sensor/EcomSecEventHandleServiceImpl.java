package com.ss.android.ugc.aweme.ecommerce.sec.sensor;

import X.C00J8;
import X.C0CGR;
import X.C14AJ;
import X.C14AK;
import X.C202205149z;
import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.api.IAppContextManagerService;
import com.ss.android.ugc.aweme.ecommerce.sec.captcha.EcomSecurityEventMatchersModel;
import com.ss.android.ugc.aweme.ecommerce.sec.captcha.EcomSecurityVerifySdkModel;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class EcomSecEventHandleServiceImpl implements IEcomSecEventHandleService {
    public final String LIZ = "hook_event";
    public final String LIZIZ = "track_info_params";

    @Override // com.ss.android.ugc.aweme.ecommerce.sec.sensor.IEcomSecEventHandleService
    public final void LIZ(String str, JSONObject jSONObject) {
        Object objOptString;
        EcomSecurityVerifySdkModel ecomSecurityVerifySdkModel = C0CGR.LIZ;
        if (ecomSecurityVerifySdkModel.enableOecSdk == 1 && str != null) {
            JSONObject jSONObject2 = new JSONObject();
            if (C0CGR.LIZIZ.contains(str)) {
                ArrayList arrayList = new ArrayList();
                for (EcomSecurityEventMatchersModel ecomSecurityEventMatchersModel : ecomSecurityVerifySdkModel.eventMatchers) {
                    if (!ecomSecurityEventMatchersModel.trackInfoParams.isEmpty()) {
                        arrayList.addAll(ecomSecurityEventMatchersModel.trackInfoParams);
                    }
                }
                Iterator it2 = arrayList.iterator();
                while (true) {
                    objOptString = null;
                    if (!it2.hasNext()) {
                        break;
                    }
                    String str2 = (String) it2.next();
                    if (jSONObject != null) {
                        try {
                            objOptString = jSONObject.optString(str2);
                        } catch (JSONException e) {
                        }
                    }
                    jSONObject2.put(str2, objOptString);
                }
                Context applicationContext = ((IAppContextManagerService) ServiceManager.get().getService(IAppContextManagerService.class)).getApplicationContext();
                JSONObject jSONObject3 = new JSONObject();
                try {
                    jSONObject3.put(this.LIZ, str);
                    jSONObject3.put(this.LIZIZ, jSONObject2);
                } catch (JSONException e2) {
                }
                Object obj = C00J8.LIZ().get("newGY");
                if (obj instanceof Boolean) {
                    objOptString = obj;
                }
                if (Intrinsics.LJFF(objOptString, Boolean.TRUE)) {
                    C14AK.LIZIZ(applicationContext).LJFF(jSONObject3);
                    return;
                }
                if (C14AJ.LLJILLL == null) {
                    synchronized (C14AJ.class) {
                        try {
                            if (C14AJ.LLJILLL == null) {
                                C14AJ.LLJILLL = new C14AJ(applicationContext);
                            }
                        } finally {
                            TryCatchGuardChecker.doCheck(e2);
                        }
                    }
                }
                C14AJ.LLJILJIL = 3;
                C14AJ.LLJILJILJ = C202205149z.LIZ();
                C14AJ.LLJILLL.LJFF(jSONObject3);
            }
        }
    }
}
