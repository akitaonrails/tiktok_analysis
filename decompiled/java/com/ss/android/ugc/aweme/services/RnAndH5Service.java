package com.ss.android.ugc.aweme.services;

import X.C0W8O;
import X.C0XQD;
import X.C0XQE;
import X.C0XQJ;
import X.C0XQM;
import X.C0XQP;
import X.C1238280iKQ;
import X.C2097608Jq;
import X.C848220XPg;
import X.InterfaceC1051760dTa;
import X.InterfaceC1060510dhh;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.ies.web.jsbridge.IESJsBridge;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.Pair;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public final class RnAndH5Service implements InterfaceC1060510dhh {
    public static final int $stable = 0;

    public Map<String, Class<?>> getJavaMethodClass() {
        return C2097608Jq.LJIIIIZZ(new Pair("recentLoginUsersInfo", C848220XPg.class), new Pair("open_2sv", C0W8O.class), new Pair("loginH5Failed", C0XQE.class), new Pair("loginFromH5", C0XQD.class), new Pair("update_account_info", C0XQP.class));
    }

    @Override // X.InterfaceC1060510dhh
    public void notifyFromRnAndH5(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            if (TextUtils.equals("find_account_back", JSONObjectProtectorUtils.getString(jSONObject, "eventName"))) {
                JSONObject jSONObject2 = JSONObjectProtectorUtils.getJSONObject(jSONObject, "data");
                JSONObjectProtectorUtils.getString(jSONObject2, "platform");
                C0XQM.LIZ(new C0XQJ(new JSONObject(JSONObjectProtectorUtils.getString(jSONObject2, "user_info"))));
                C1238280iKQ.LIZIZ(4);
            } else if (TextUtils.equals("rebindPhone_certify_success", JSONObjectProtectorUtils.getString(jSONObject, "eventName"))) {
                C1238280iKQ.LIZIZ(8);
            }
            if (TextUtils.equals(JSONObjectProtectorUtils.getString(jSONObject, "eventName"), "account_recover_done")) {
                C1238280iKQ.LIZIZ(12);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    @Override // X.InterfaceC1060510dhh
    public Map<String, InterfaceC1051760dTa> getJavaMethods(WeakReference<Context> weakReference, IESJsBridge iESJsBridge) {
        return C2097608Jq.LJI(new Pair("recentLoginUsersInfo", new C848220XPg(iESJsBridge)), new Pair("open_2sv", new C0W8O(weakReference)), new Pair("loginH5Failed", new C0XQE()), new Pair("loginFromH5", new C0XQD(weakReference, iESJsBridge)), new Pair("update_account_info", new C0XQP()));
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // X.InterfaceC1060510dhh
    public InterfaceC1051760dTa getJavaMethodByName(WeakReference<Context> weakReference, IESJsBridge iESJsBridge, String str) {
        switch (str.hashCode()) {
            case -1863948490:
                if (!str.equals("update_account_info")) {
                    return null;
                }
                return new C0XQP();
            case -504370528:
                if (!str.equals("open_2sv")) {
                    return null;
                }
                return new C0W8O(weakReference);
            case -318443352:
                if (!str.equals("recentLoginUsersInfo")) {
                    return null;
                }
                return new C848220XPg(iESJsBridge);
            case 940754656:
                if (!str.equals("loginFromH5")) {
                    return null;
                }
                return new C0XQD(weakReference, iESJsBridge);
            case 1825757683:
                if (!str.equals("loginH5Failed")) {
                    return null;
                }
                return new C0XQE();
            default:
                return null;
        }
    }
}
