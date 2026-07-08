package com.ss.android.ugc.aweme.services.interceptor;

import X.C0WZX;
import X.C1250210idf;
import X.C15O7;
import X.C1701330uNH;
import X.C1C7U;
import X.C2179971ATj;
import X.C2188811AlT;
import X.C2204961BRm;
import X.C852980XdA;
import X.C852990XdB;
import X.EnumC852910Xd3;
import X.InterfaceC853000XdC;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.account.eventtracking.Error2046LoginEvent;
import com.ss.android.ugc.aweme.account.login.twostep.TwoStepAuthActivity;
import com.ss.android.ugc.aweme.account.login.twostep.TwoStepAuthApi;
import com.ss.android.ugc.aweme.account.login.twostep.TwpStep2046Bean;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Map;
import kotlin.text.a0;
import org.json.JSONObject;
import v7.o;

/* JADX INFO: loaded from: classes14.dex */
public final class TwoStepAuthenticationInterceptor implements IInterceptor {
    public static final int $stable = 8;
    public Integer currentErrorCode;
    public String currentUrlPath;

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnumC852910Xd3.values().length];
            try {
                iArr[EnumC852910Xd3.TWO_STEP_EMAIL_PASSWORD_VERIFY_SMS_2SV.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
                TryCatchGuardChecker.doCheck(e);
            }
            try {
                iArr[EnumC852910Xd3.TWO_STEP_EMAIL_PASSWORD_VERIFY_EMAIL_CODE_2SV.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
            try {
                iArr[EnumC852910Xd3.TWO_STEP_PHONE_VERIFY_EMAIL_CODE_2SV.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
                TryCatchGuardChecker.doCheck(e3);
            }
            try {
                iArr[EnumC852910Xd3.TWO_STEP_PHONE_VERIFY_PASSWORD_2SV.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
                TryCatchGuardChecker.doCheck(e4);
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private final String getPathFromUrl(String str) {
        String path = null;
        try {
            path = new URI(str).getPath();
            return path;
        } catch (NullPointerException e) {
            TryCatchGuardChecker.doCheck(e);
            return path;
        } catch (URISyntaxException e2) {
            TryCatchGuardChecker.doCheck(e2);
            return path;
        }
    }

    public final void register(final o<C852990XdB> oVar) {
        C852980XdA c852980XdALIZ = C852980XdA.LIZ();
        InterfaceC853000XdC interfaceC853000XdC = new InterfaceC853000XdC() { // from class: com.ss.android.ugc.aweme.services.interceptor.TwoStepAuthenticationInterceptor.register.1
            @Override // X.InterfaceC853000XdC
            public void onComplete(C852990XdB c852990XdB) {
                oVar.LIZJ(c852990XdB);
            }
        };
        c852980XdALIZ.getClass();
        synchronized (C852980XdA.LIZJ) {
            try {
                c852980XdALIZ.LIZ = interfaceC853000XdC;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static void INVOKEVIRTUAL_com_ss_android_ugc_aweme_services_interceptor_TwoStepAuthenticationInterceptor_com_bytedance_analytics_lancet_StartActivityLancet_startActivity(Context context, Intent intent) {
        C1701330uNH.LIZ(intent, context);
        C2204961BRm.LJJJJJL(context, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmtcYnH3zdD6C+6IY71X+ZfMc2NIVC1XrXqKyKPVhTtIFRY9/fD4mAAguVKNHlgkGyBZmDl", null));
    }

    public static void INVOKEVIRTUAL_com_ss_android_ugc_aweme_services_interceptor_TwoStepAuthenticationInterceptor_com_bytedance_router_monitor_page_PageLancet_startActivity(Context context, Intent intent) {
        RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(context, intent, "Context_startActivity_1");
        INVOKEVIRTUAL_com_ss_android_ugc_aweme_services_interceptor_TwoStepAuthenticationInterceptor_com_bytedance_analytics_lancet_StartActivityLancet_startActivity(context, intent);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private final Integer getAuthType(Integer num, String str) {
        String strOptString;
        if (num == null || num.intValue() != 2020) {
            if (num != null && num.intValue() == 2032) {
                return 1;
            }
            if (num != null && num.intValue() == 2033) {
                return 4;
            }
            if (num != null) {
                if (num.intValue() == 2025) {
                    return 3;
                }
                if (num.intValue() == 2031) {
                    return 5;
                }
                if (num.intValue() == 2067) {
                    return 6;
                }
            }
            if (num != null && num.intValue() == 2046) {
                if (str == null) {
                    str = "";
                }
                JSONObject jSONObjectOptJSONObject = new JSONObject(str).optJSONObject("data");
                if (jSONObjectOptJSONObject != null && (strOptString = jSONObjectOptJSONObject.optString("default_verify_way")) != null) {
                    switch (strOptString.hashCode()) {
                        case -797498437:
                            if (!strOptString.equals("pwd_verify")) {
                                return null;
                            }
                            break;
                        case 300626556:
                            if (strOptString.equals("email_verify")) {
                                return 4;
                            }
                            break;
                        case 312290780:
                            if (strOptString.equals("mobile_sms_verify")) {
                                return 1;
                            }
                            break;
                        case 961294113:
                            if (strOptString.equals("oauth_verify")) {
                                return 3;
                            }
                            break;
                        case 1972338561:
                            if (strOptString.equals("totp_verify")) {
                                return 7;
                            }
                            break;
                    }
                }
            }
            return null;
        }
        return 2;
    }

    public final String getPlatForm(String str, Map<String, String> map, EnumC852910Xd3 enumC852910Xd3) {
        if (TextUtils.isEmpty(str)) {
            return "unknown";
        }
        if (!a0.LJJIIZI(str, "/password/reset_by_ticket", false) && !a0.LJJIIZI(str, "/password/reset_by_email_ticket", false)) {
            if (a0.LJJIIZI(str, "/password/forced_reset_by_mobile_ticket", false)) {
                return "force_password_reset";
            }
            if (a0.LJJIIZI(str, "/passport/auth/login_only", false)) {
                String str2 = map.get("platform");
                if (str2 == null) {
                    return "";
                }
                return str2;
            }
            int i = WhenMappings.$EnumSwitchMapping$0[enumC852910Xd3.ordinal()];
            if (i != 1 && i != 2) {
                if (i != 3 && i != 4) {
                    return str;
                }
                return "sms_verification";
            }
            if (map == null || map.isEmpty()) {
                return "email";
            }
            if (map.containsKey("mobile")) {
                return "phone";
            }
            if (map.containsKey("email")) {
                return "email";
            }
            if (map.containsKey("username")) {
                return "handle";
            }
            if (!map.containsKey("not_login_ticket")) {
                return "unknown";
            }
            return "ticket";
        }
        return "forgot_password";
    }

    private final C15O7<C852990XdB> startTwoStepAuthentication(Context context, String str, String str2, Map<String, String> map) {
        o<C852990XdB> oVar = new o<>();
        if (context != null && str2 != null) {
            Integer authType = getAuthType(this.currentErrorCode, str2);
            if (authType == null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Failed to parse error code from JSON response: ");
                sbLIZ.append(str2);
                oVar.LIZIZ(new Exception(C2188811AlT.LIZIZ(sbLIZ)));
                return oVar.LIZ;
            }
            this.currentUrlPath = getPathFromUrl(str);
            Integer num = this.currentErrorCode;
            if (num != null && num.intValue() == 2046) {
                return authFor2046(context, oVar, str2, map, authType);
            }
            register(oVar);
            Intent intent = new Intent(context, (Class<?>) TwoStepAuthActivity.class);
            intent.putExtra("auth_type", authType.intValue());
            intent.putExtra("auth_data", str2);
            intent.putExtra("url_path", this.currentUrlPath);
            if (!(context instanceof Activity)) {
                intent.addFlags(268435456);
            }
            INVOKEVIRTUAL_com_ss_android_ugc_aweme_services_interceptor_TwoStepAuthenticationInterceptor_com_bytedance_router_monitor_page_PageLancet_startActivity(context, intent);
            return oVar.LIZ;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("Activity or response is null, activity: ");
        sbLIZ2.append(context);
        sbLIZ2.append(", response: ");
        sbLIZ2.append(str2);
        oVar.LIZIZ(new Exception(C2188811AlT.LIZIZ(sbLIZ2)));
        return oVar.LIZ;
    }

    private final C15O7<C852990XdB> authFor2046(final Context context, o<C852990XdB> oVar, final String str, final Map<String, String> map, final Integer num) {
        boolean z;
        String strOptString;
        new Error2046LoginEvent().LJIIIIZZ();
        if (!(context instanceof Activity)) {
            oVar.LIZIZ(new Exception("context is not Activity"));
            return oVar.LIZ;
        }
        register(oVar);
        final TwpStep2046Bean twpStep2046Bean = (TwpStep2046Bean) C1250210idf.LIZ(new JSONObject(str).optString("data"), TwpStep2046Bean.class);
        TwoStepAuthApi.LIZJ = twpStep2046Bean.verify_ticket;
        JSONObject jSONObjectOptJSONObject = new JSONObject(str).optJSONObject("data");
        if (jSONObjectOptJSONObject != null && (strOptString = jSONObjectOptJSONObject.optString("profile_key")) != null && !a0.LJJJIL(strOptString)) {
            z = false;
        } else {
            z = true;
        }
        final boolean z2 = !z;
        ((Activity) context).runOnUiThread(new Runnable() { // from class: com.ss.android.ugc.aweme.services.interceptor.TwoStepAuthenticationInterceptor.authFor2046.1
            @Override // java.lang.Runnable
            public final void run() {
                C1C7U.LIZ("TwoStepAuthenticationInterceptor@1630.authFor2046$1");
                com_ss_android_ugc_aweme_services_interceptor_TwoStepAuthenticationInterceptor$authFor2046$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                C1C7U.LIZIZ("TwoStepAuthenticationInterceptor@1630.authFor2046$1");
            }

            /* JADX WARN: Removed duplicated region for block: B:36:0x00b2  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void com_ss_android_ugc_aweme_services_interceptor_TwoStepAuthenticationInterceptor$authFor2046$1__run$___twin___() {
                /*
                    r13 = this;
                    java.util.Map<java.lang.String, java.lang.String> r1 = r1
                    if (r1 == 0) goto Lb6
                    java.lang.String r0 = "mobile"
                    java.lang.Object r1 = r1.get(r0)
                    java.lang.String r1 = (java.lang.String) r1
                Lc:
                    r0 = 0
                    java.lang.Boolean[] r0 = new java.lang.Boolean[r0]
                    java.lang.String r4 = X.C2093608Ic.LIZ(r1, r0)
                    java.lang.Integer r3 = r2
                    r2 = 1
                    if (r3 == 0) goto Lb2
                    int r0 = r3.intValue()
                    if (r0 != r2) goto L83
                    X.0Xd3 r8 = X.EnumC852910Xd3.TWO_STEP_EMAIL_PASSWORD_VERIFY_SMS_2SV
                L20:
                    java.lang.String r0 = com.ss.android.ugc.aweme.account.login.v2.base.CommonFlowActivity._pnsPageId
                    android.content.Context r7 = r4
                    android.app.Activity r7 = (android.app.Activity) r7
                    X.0Xce r9 = X.EnumC852660Xce.TWO_STEP_VERIFICATION
                    android.content.Intent r0 = r7.getIntent()
                    android.os.Bundle r10 = INVOKEVIRTUAL_com_ss_android_ugc_aweme_services_interceptor_TwoStepAuthenticationInterceptor$authFor2046$1_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras(r0)
                    if (r10 != 0) goto L37
                    android.os.Bundle r10 = new android.os.Bundle
                    r10.<init>()
                L37:
                    com.ss.android.ugc.aweme.account.login.twostep.TwpStep2046Bean r6 = r5
                    com.ss.android.ugc.aweme.services.interceptor.TwoStepAuthenticationInterceptor r5 = r6
                    java.util.Map<java.lang.String, java.lang.String> r4 = r1
                    java.util.ArrayList<com.ss.android.ugc.aweme.account.model.TwoStepVerifyWays> r1 = r6.verify_ways
                    java.lang.String r0 = "verify_ways"
                    X.C786410Ut5.LJJIZ(r10, r0, r1)
                    X.0Xct r0 = X.C852810Xct.LIZ
                    java.lang.String r3 = r6.verify_ticket
                    java.lang.String r1 = ""
                    if (r3 != 0) goto L4e
                    r3 = r1
                L4e:
                    r0.getClass()
                    java.lang.String r0 = "verify_ticket"
                    X.C786410Ut5.LJJJI(r0, r3, r10)
                    java.lang.String r0 = r6.not_login_ticket
                    if (r0 == 0) goto L5c
                    r1 = r0
                L5c:
                    java.lang.String r0 = "not_login_ticket"
                    X.C786410Ut5.LJJJI(r0, r1, r10)
                    java.lang.String r0 = "login_with_2sv"
                    r10.putBoolean(r0, r2)
                    java.lang.String r0 = r5.currentUrlPath
                    java.lang.String r1 = r5.getPlatForm(r0, r4, r8)
                    java.lang.String r0 = "platform"
                    X.C786410Ut5.LJJJI(r0, r1, r10)
                    java.lang.String r0 = "use_last_ttp_context"
                    r10.putBoolean(r0, r2)
                    com.ss.android.ugc.aweme.services.interceptor.TwoStepAuthenticationInterceptor$authFor2046$1$2 r11 = new com.ss.android.ugc.aweme.services.interceptor.TwoStepAuthenticationInterceptor$authFor2046$1$2
                    java.lang.String r0 = r7
                    r11.<init>()
                    r12 = 0
                    X.C851380Xaa.LIZ(r7, r8, r9, r10, r11, r12)
                    return
                L83:
                    int r1 = r3.intValue()
                    r0 = 4
                    if (r1 != r0) goto L9c
                    if (r4 == 0) goto L99
                    boolean r0 = kotlin.text.a0.LJJJIL(r4)
                    if (r0 != 0) goto L99
                    boolean r0 = r3
                    if (r0 != 0) goto L99
                    X.0Xd3 r8 = X.EnumC852910Xd3.TWO_STEP_PHONE_VERIFY_EMAIL_CODE_2SV
                    goto L20
                L99:
                    X.0Xd3 r8 = X.EnumC852910Xd3.TWO_STEP_EMAIL_PASSWORD_VERIFY_EMAIL_CODE_2SV
                    goto L20
                L9c:
                    int r1 = r3.intValue()
                    r0 = 2
                    if (r1 != r0) goto La7
                    X.0Xd3 r8 = X.EnumC852910Xd3.TWO_STEP_PHONE_VERIFY_PASSWORD_2SV
                    goto L20
                La7:
                    int r1 = r3.intValue()
                    r0 = 7
                    if (r1 != r0) goto Lb2
                    X.0Xd3 r8 = X.EnumC852910Xd3.VERIFY_TOTP
                    goto L20
                Lb2:
                    X.0Xd3 r8 = X.EnumC852910Xd3.TWO_STEP_PHONE_VERIFY_PASSWORD_2SV
                    goto L20
                Lb6:
                    r1 = 0
                    goto Lc
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.services.interceptor.TwoStepAuthenticationInterceptor.AnonymousClass1.com_ss_android_ugc_aweme_services_interceptor_TwoStepAuthenticationInterceptor$authFor2046$1__run$___twin___():void");
            }

            public static Bundle INVOKEVIRTUAL_com_ss_android_ugc_aweme_services_interceptor_TwoStepAuthenticationInterceptor$authFor2046$1_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras(Intent intent) {
                try {
                    return intent.getExtras();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    return null;
                }
            }

            public static void com_ss_android_ugc_aweme_services_interceptor_TwoStepAuthenticationInterceptor$authFor2046$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass1 anonymousClass1) {
                try {
                    anonymousClass1.com_ss_android_ugc_aweme_services_interceptor_TwoStepAuthenticationInterceptor$authFor2046$1__run$___twin___();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    if (!C2179971ATj.LIZ(th)) {
                        throw th;
                    }
                }
            }
        });
        return oVar.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0038  */
    @Override // com.ss.android.ugc.aweme.services.interceptor.IInterceptor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.Map<java.lang.String, java.lang.String> tryToIntercept(java.lang.String r7, com.bytedance.retrofit2.client.Request r8, java.lang.String r9, int r10, java.util.Map<java.lang.String, java.lang.String> r11) {
        /*
            Method dump skipped, instruction units count: 273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.services.interceptor.TwoStepAuthenticationInterceptor.tryToIntercept(java.lang.String, com.bytedance.retrofit2.client.Request, java.lang.String, int, java.util.Map):java.util.Map");
    }
}
