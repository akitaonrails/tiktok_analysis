package com.ss.android.ugc.aweme.account.settings;

import X.AbstractC310860CGm;
import X.C310890CGp;
import X.C310900CGq;
import X.C310920CGs;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class AccountSdkSettingsManagerApiImpl implements IAccountSdkSettingsManagerApi {
    @Override // com.ss.android.ugc.aweme.account.settings.IAccountSdkSettingsManagerApi
    public final void LIZ() throws JSONException {
        String string;
        JSONObject jSONObject = new JSONObject();
        for (AbstractC310860CGm abstractC310860CGm : (List) C310920CGs.LIZ.getValue()) {
            String strLIZ = abstractC310860CGm.LIZ();
            try {
                string = ((Keva) abstractC310860CGm.LIZ.getValue()).getString(abstractC310860CGm.LIZ(), "");
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
            }
            JSONObject jSONObject2 = string.length() > 0 ? new JSONObject(string) : abstractC310860CGm.LIZIZ();
            jSONObject.put(strLIZ, jSONObject2);
        }
        C310920CGs.LIZ(jSONObject);
        C310900CGq.LIZ = (C310890CGp) C310920CGs.LIZIZ.getValue();
    }
}
