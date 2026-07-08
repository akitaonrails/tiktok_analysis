package com.ss.android.ugc.aweme.account.network;

import X.C01GW;
import X.C0DQM;
import X.C0X52;
import X.C13LQ;
import X.C1440005kM;
import X.C1494590ozp;
import X.C305950Byz;
import X.C452501pT;
import X.InterfaceC1904907d9;
import X.InterfaceC841770X0l;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.IOException;
import java.util.Locale;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class AgeVerificationNewUserInterceptor implements InterfaceC1904907d9 {
    public static final AgeVerificationNewUserInterceptor LL = new AgeVerificationNewUserInterceptor();
    public static final C01GW LLILLJJLI = C452501pT.LIZIZ(new C305950Byz());
    public static final Set<String> LLILLL = C13LQ.LJLIIL(new String[]{"/passport/web/email/register_verify_login", "/passport/email/oauth_bind_register_or_login", "/passport/web/mobile_email_register", "/passport/mobile/sms_login", "/passport/employee/account/create", "/passport/web/sms_login", "/passport/carrier_auth/login_continue", "/passport/mobile/oauth_bind_register_or_login", "/passport/email/register/v2", "/passport/auth/login", "/passport/web/sms_login_continue", "/passport/email/register_verify_login", "/passport/mobile/sms_login_continue", "/passport/web/auth/login", "/passport/app/email/register/ticket_register", "/passport/web/email/register/ticket_register", "/passport/mobile/register", "/passport/web/auth/login_only", "/passport/auth/login_only", "/passport/web/mobile/bind_login", "/passport/auth/only_login", "/passport/web/email/quick_login", "/passport/web/email/register_verify", "/passport/web/email/register/v2", "/passport/username/register"});

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC1904907d9
    public final C0X52<?> intercept(InterfaceC841770X0l interfaceC841770X0l) {
        C1494590ozp c1494590ozp = (C1494590ozp) interfaceC841770X0l;
        Request request = c1494590ozp.LIZJ;
        String path = UriProtector.parse(request.getUrl()).getPath();
        String string = "";
        if (path == null) {
            path = "";
        }
        C0X52<?> c0x52LIZ = c1494590ozp.LIZ(request);
        String strLJLJJI = a0.LJLJJI(path.toLowerCase(Locale.ROOT), '/');
        if (((Boolean) LLILLJJLI.getValue()).booleanValue() && LLILLL.contains(strLJLJJI)) {
            try {
                JSONObject jSONObject = JSONObjectProtectorUtils.getJSONObject(new JSONObject((String) c0x52LIZ.LIZIZ), "data");
                if (Intrinsics.LJFF(JSONObjectProtectorUtils.getString(jSONObject, "new_user"), "1") && jSONObject.has("age_verification_type")) {
                    string = JSONObjectProtectorUtils.getString(jSONObject, "age_verification_type");
                }
            } catch (IOException e) {
                TryCatchGuardChecker.doCheck(e);
            }
            int i = CastIntegerProtector.parseInt(string);
            if (i > 0) {
                C1440005kM.LIZ(new C0DQM(String.valueOf(i)));
            }
        }
        return c0x52LIZ;
    }
}
