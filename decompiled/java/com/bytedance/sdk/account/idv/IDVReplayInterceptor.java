package com.bytedance.sdk.account.idv;

import X.C080U;
import X.C0X52;
import X.C0XMB;
import X.C1494590ozp;
import X.InterfaceC1904907d9;
import X.InterfaceC841770X0l;
import android.net.Uri;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class IDVReplayInterceptor implements InterfaceC1904907d9 {
    public static final IDVReplayInterceptor LL = new IDVReplayInterceptor();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC1904907d9
    public final C0X52<?> intercept(InterfaceC841770X0l interfaceC841770X0l) throws Exception {
        String str;
        String strOptString;
        Request request = ((C1494590ozp) interfaceC841770X0l).LIZJ;
        try {
            C1494590ozp c1494590ozp = (C1494590ozp) interfaceC841770X0l;
            C0X52<?> c0x52LIZ = c1494590ozp.LIZ(request);
            C080U c080uLIZ = c0x52LIZ.LIZ.LIZ("x-tt-verify-idv-decision-conf");
            if (c080uLIZ != null) {
                try {
                    JSONObject jSONObject = new JSONObject(c080uLIZ.LIZIZ);
                    if (!jSONObject.optBoolean("need_replay", true)) {
                        Uri.Builder builderBuildUpon = UriProtector.parse(request.getUrl()).buildUpon();
                        if (jSONObject.has("passport_ticket")) {
                            builderBuildUpon.appendQueryParameter("passport_ticket", JSONObjectProtectorUtils.getString(jSONObject, "passport_ticket"));
                        }
                        T t = c0x52LIZ.LIZIZ;
                        if ((t instanceof String) && (str = (String) t) != null) {
                            JSONObject jSONObjectOptJSONObject = new JSONObject(str).optJSONObject("data");
                            if (jSONObjectOptJSONObject != null && (strOptString = jSONObjectOptJSONObject.optString("sms_code_key")) != null && strOptString.length() != 0) {
                                builderBuildUpon.appendQueryParameter("sms_code_key", strOptString);
                            }
                        }
                        C0XMB c0xmbNewBuilder = request.newBuilder();
                        c0xmbNewBuilder.LIZJ(builderBuildUpon.toString());
                        return c1494590ozp.LIZ(c0xmbNewBuilder.LIZ());
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
            return c0x52LIZ;
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            throw e2;
        }
    }
}
