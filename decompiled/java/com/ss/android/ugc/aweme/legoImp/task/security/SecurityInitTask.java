package com.ss.android.ugc.aweme.legoImp.task.security;

import X.C0CCZ;
import X.C0VZ0;
import X.C0WH4;
import X.C2188811AlT;
import X.C793770VBv;
import X.C812710VuP;
import X.C829170Wfr;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.security.Provider;
import java.security.Security;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public final class SecurityInitTask implements C0CCZ {
    public static final SecurityInitTask LL = new SecurityInitTask();

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "SecurityInitTask";
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ boolean meetTrigger() {
        return true;
    }

    @Override // X.C0CCZ
    public final /* synthetic */ boolean serialExecute() {
        return false;
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ int targetProcess() {
        return C0VZ0.LIZ();
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ EnumC799980VZs triggerType() {
        return C0VZ0.LIZIZ(this);
    }

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        return EnumC799870VZh.BOOT_FINISH;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) throws JSONException {
        int i;
        if (context != null) {
            LL.getClass();
            try {
                C0WH4.LIZ(context);
                LIZ(0, "success");
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                if (e instanceof C829170Wfr) {
                    LIZ(-1, "GooglePlayServicesRepairableException");
                } else if (e instanceof C812710VuP) {
                    LIZ(-2, "GooglePlayServicesNotAvailableException");
                } else {
                    LIZ(-3, "UnknownException");
                }
            }
            LL.getClass();
            Provider provider = Security.getProvider("GmsCore_OpenSSL");
            if (provider != null) {
                i = 1;
            } else {
                i = 0;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("gms_core_openssl", i);
            String name = null;
            C793770VBv.LJIIJ("security_init_task", 0, jSONObject, null, null);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("verifySecurityProvider: ");
            if (provider != null) {
                name = provider.getName();
            }
            sbLIZ.append(name);
            C2188811AlT.LIZIZ(sbLIZ);
        }
    }

    public static void LIZ(int i, String str) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("err_code", i);
        jSONObject.put("err_msg", str);
        C793770VBv.LJIIJ("security_init_task", 0, jSONObject, null, null);
    }
}
