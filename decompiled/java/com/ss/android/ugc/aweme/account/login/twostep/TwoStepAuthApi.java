package com.ss.android.ugc.aweme.account.login.twostep;

import X.C01GW;
import X.C080U;
import X.C0CQT;
import X.C123100dR;
import X.C15O7;
import X.C2188811AlT;
import X.C452501pT;
import X.InterfaceC1364105Vn;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501100pAK;
import X.InterfaceC1501200pAU;
import X.InterfaceC1501240pAY;
import X.InterfaceC1501300pAe;
import X.InterfaceC2174808fa;
import com.bytedance.keva.Keva;
import com.ss.android.account.token.TTTokenUtils;
import com.ss.android.ugc.aweme.account.interfaces.GetNonceResponse;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS207S0000000_19;

/* JADX INFO: loaded from: classes20.dex */
public final class TwoStepAuthApi {
    public static final TwoStepAuthApi LIZ = new TwoStepAuthApi();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(28));
    public static String LIZJ;

    public interface Api {
        @InterfaceC1501200pAU("/passport/safe/two_step_verification/get_auth_device_list/")
        C15O7<AuthDeviceResponse> LIZ();

        @InterfaceC1501200pAU("/passport/auth/available_ways/")
        C15O7<AvailableWaysResponse> LIZIZ();

        @InterfaceC1501200pAU("/passport/safe/two_step_verification/get_verification_list/")
        C15O7<AddVerificationResponse> LIZJ();

        @InterfaceC1501200pAU("/passport/safe/api/user/unusual_info_preview/")
        C15O7<UnusualInfoResponse> LIZLLL();

        @InterfaceC1501240pAY("/passport/safe/two_step_verification/add_auth_device/")
        @InterfaceC1501300pAe
        C15O7<AuthDeviceResponse> addAuthDevice(@InterfaceC1501100pAK("verify_ticket") String str, @InterfaceC1501100pAK("target_device") Long l, @InterfaceC1501100pAK("ticket") String str2);

        @InterfaceC1501240pAY("/passport/safe/two_step_verification/add_auth_device/v2/")
        @InterfaceC1501300pAe
        C15O7<AuthDeviceResponse> addAuthDeviceV2(@InterfaceC1501100pAK("target_device") Long l);

        @InterfaceC1501240pAY("/passport/safe/two_step_verification/add_verification/")
        @InterfaceC1501300pAe
        C15O7<AddVerificationResponse> addVerification(@InterfaceC1501100pAK("verify_ticket") String str, @InterfaceC1501100pAK("verify_way") String str2, @InterfaceC1501100pAK("is_default") int i);

        @InterfaceC1501240pAY("/passport/safe/two_step_verification/add_verification/v2/")
        @InterfaceC1501300pAe
        C15O7<AddVerificationResponse> addVerificationV2(@InterfaceC1501100pAK("verify_way") String str, @InterfaceC1501100pAK("is_default") int i);

        @InterfaceC1501240pAY("/passport/totp/bind_verify/")
        @InterfaceC1501300pAe
        C15O7<BindVerifyResponse> bindTotpVerify(@InterfaceC1501100pAK("aid") int i, @InterfaceC1501100pAK("code") String str, @InterfaceC2174808fa List<C080U> list);

        @InterfaceC1501240pAY("/passport/totp/status/")
        @InterfaceC1501300pAe
        C15O7<Object> checkTotpStatus(@InterfaceC1501100pAK("aid") int i, @InterfaceC2174808fa List<C080U> list);

        @InterfaceC1501200pAU("/passport/auth/available_ways/")
        Object getAvailableWays(@InterfaceC1501070pAH("passport_ticket") String str, InterfaceC1364105Vn<? super AvailableWaysResponse> interfaceC1364105Vn);

        @InterfaceC1501240pAY("/passport/auth/available_ways/")
        @InterfaceC1501300pAe
        Object getAvailableWaysForHL(@InterfaceC1501100pAK("user_id") String str, @InterfaceC1501100pAK("successful_login_token") String str2, InterfaceC1364105Vn<? super AvailableWaysResponse> interfaceC1364105Vn);

        @InterfaceC1501240pAY("/passport/auth/get_nonce/")
        @InterfaceC1501300pAe
        Object getNonce(@InterfaceC1501100pAK("platform") String str, @InterfaceC2174808fa List<C080U> list, InterfaceC1364105Vn<? super GetNonceResponse> interfaceC1364105Vn);

        @InterfaceC1501200pAU("/passport/safe/recommend_device/list/")
        C15O7<RecommendDeviceResponse> getRecommendDeviceList(@InterfaceC2174808fa List<C080U> list);

        @InterfaceC1501240pAY("/passport/totp/register/v2/")
        @InterfaceC1501300pAe
        C15O7<BindOrUpdateTOTPResponse> registerTotp(@InterfaceC1501100pAK("aid") int i, @InterfaceC1501100pAK("device_id") long j, @InterfaceC1501100pAK("verify_ticket") String str, @InterfaceC2174808fa List<C080U> list);

        @InterfaceC1501240pAY("/passport/safe/two_step_verification/remove_all/")
        @InterfaceC1501300pAe
        C15O7<AddVerificationResponse> removeAllVerification(@InterfaceC1501100pAK("verify_ticket") String str);

        @InterfaceC1501240pAY("/passport/safe/two_step_verification/remove_auth_device/")
        @InterfaceC1501300pAe
        C15O7<AuthDeviceResponse> removeAuthDevice(@InterfaceC1501100pAK("del_did") String str);

        @InterfaceC1501240pAY("/passport/safe/two_step_verification/remove_verification/")
        @InterfaceC1501300pAe
        C15O7<AddVerificationResponse> removeVerification(@InterfaceC1501100pAK("verify_ticket") String str, @InterfaceC1501100pAK("verify_way") String str2);

        @InterfaceC1501240pAY("/passport/safe/two_step_verification/remove_verification/v2/")
        @InterfaceC1501300pAe
        C15O7<AddVerificationResponse> removeVerificationV2(@InterfaceC1501100pAK("verify_way") String str);

        @InterfaceC1501240pAY("/passport/email/send_code/")
        @InterfaceC1501300pAe
        C15O7<SendEmailCodeResponse> sendEmailCode(@InterfaceC1501100pAK("verify_ticket") String str, @InterfaceC1501100pAK("type") Integer num, @InterfaceC1501100pAK("email_theme") Integer num2);

        @InterfaceC1501240pAY("/passport/mobile/send_code/v1/")
        @InterfaceC1501300pAe
        C15O7<SendSmsCodeResponse> sendSmsCode(@InterfaceC1501100pAK("verify_ticket") String str, @InterfaceC1501100pAK("type") Integer num, @InterfaceC1501100pAK("is6Digits") int i);

        @InterfaceC1501240pAY("/passport/totp/update/")
        @InterfaceC1501300pAe
        C15O7<BindOrUpdateTOTPResponse> updateTotp(@InterfaceC1501100pAK("aid") int i, @InterfaceC1501100pAK("device_id") long j, @InterfaceC1501100pAK("verify_ticket") String str, @InterfaceC2174808fa List<C080U> list);

        @InterfaceC1501240pAY("/passport/email/check_code/")
        @InterfaceC1501300pAe
        C15O7<TwoStepApiResponse> verifyEmailCode(@InterfaceC1501100pAK("mix_mode") Integer num, @InterfaceC1501100pAK("email") String str, @InterfaceC1501100pAK("code") String str2, @InterfaceC1501100pAK("type") int i, @InterfaceC1501100pAK("verify_ticket") String str3);

        @InterfaceC1501240pAY("/passport/account/verify/")
        @InterfaceC1501300pAe
        C15O7<TwoStepApiResponse> verifyPassword(@InterfaceC1501100pAK("username") String str, @InterfaceC1501100pAK("mobile") String str2, @InterfaceC1501100pAK("email") String str3, @InterfaceC1501100pAK("password") String str4, @InterfaceC1501100pAK("mix_mode") int i, @InterfaceC1501100pAK("verify_ticket") String str5);

        @InterfaceC1501240pAY("/passport/mobile/check_code/")
        @InterfaceC1501300pAe
        C15O7<TwoStepApiResponse> verifySmsCode(@InterfaceC1501100pAK("mix_mode") Integer num, @InterfaceC1501100pAK("mobile") String str, @InterfaceC1501100pAK("code") String str2, @InterfaceC1501100pAK("type") int i, @InterfaceC1501100pAK("verify_ticket") String str3);

        @InterfaceC1501240pAY("/passport/auth/verify/")
        @InterfaceC1501300pAe
        C15O7<TwoStepApiResponse> verifyThirdParty(@InterfaceC1501100pAK("access_token") String str, @InterfaceC1501100pAK("access_token_secret") String str2, @InterfaceC1501100pAK("code") String str3, @InterfaceC1501100pAK("expires_in") Integer num, @InterfaceC1501100pAK("openid") Integer num2, @InterfaceC1501100pAK("platform") String str4, @InterfaceC1501100pAK("platform_app_id") Integer num3, @InterfaceC1501100pAK("mid") Integer num4, @InterfaceC1501100pAK("verify_ticket") String str5);

        @InterfaceC1501240pAY("/passport/totp/verify/")
        @InterfaceC1501300pAe
        C15O7<VerifyTOTPResponse> verifyTotp(@InterfaceC1501100pAK("aid") int i, @InterfaceC1501100pAK("code") String str, @InterfaceC2174808fa List<C080U> list);

        @InterfaceC1501240pAY("/passport/totp/verify_without_login/")
        @InterfaceC1501300pAe
        C15O7<VerifyTOTPResponse> verifyTotpWithoutLogin(@InterfaceC1501100pAK("aid") int i, @InterfaceC1501100pAK("code") String str, @InterfaceC1501100pAK("verify_ticket") String str2, @InterfaceC2174808fa List<C080U> list);
    }

    public static Api LIZIZ() {
        return (Api) LIZIZ.getValue();
    }

    public static boolean LJI() {
        return Keva.getRepo("two_step_verification").getBoolean("ask_next_time", false);
    }

    public static List LJ(String str) {
        ArrayList arrayList = new ArrayList();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(C0CQT.LIZJ);
        sbLIZ.append(str);
        String strLIZ = TTTokenUtils.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        if (C123100dR.LIZ(strLIZ)) {
            arrayList.add(new C080U("x-tt-passport-csrf-token", strLIZ));
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(java.lang.String r6, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.account.login.twostep.AvailableWaysResponse> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof X.C1236800iI2
            if (r0 == 0) goto L20
            r4 = r7
            X.0iI2 r4 = (X.C1236800iI2) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L20
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r3 = r4.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r1 = 1
            if (r0 == 0) goto L2e
            if (r0 != r1) goto L26
            goto L3e
        L20:
            X.0iI2 r4 = new X.0iI2
            r4.<init>(r5, r7)
            goto L12
        L26:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2e:
            X.C155000ia.LIZIZ(r3)
            com.ss.android.ugc.aweme.account.login.twostep.TwoStepAuthApi$Api r0 = LIZIZ()     // Catch: java.lang.Exception -> L44
            r4.LLILLL = r1     // Catch: java.lang.Exception -> L44
            java.lang.Object r3 = r0.getAvailableWays(r6, r4)     // Catch: java.lang.Exception -> L44
            if (r3 != r2) goto L41
            return r2
        L3e:
            X.C155000ia.LIZIZ(r3)     // Catch: java.lang.Exception -> L44
        L41:
            com.ss.android.ugc.aweme.account.login.twostep.AvailableWaysResponse r3 = (com.ss.android.ugc.aweme.account.login.twostep.AvailableWaysResponse) r3     // Catch: java.lang.Exception -> L44
            return r3
        L44:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            com.ss.android.ugc.aweme.account.login.twostep.AvailableWaysResponse r3 = new com.ss.android.ugc.aweme.account.login.twostep.AvailableWaysResponse
            java.lang.String r1 = r0.getMessage()
            r0 = 0
            r3.<init>(r1, r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.account.login.twostep.TwoStepAuthApi.LIZJ(java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJFF(java.lang.String r8, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.account.interfaces.GetNonceResponse> r9) {
        /*
            r7 = this;
            r0 = 137998(0x21b0e, float:1.93376E-40)
            boolean r6 = com.bytedance.pumbaa.utility.method_id.MethodIDManager.LJI(r0)
            boolean r0 = r9 instanceof X.C1236820iI4
            if (r0 == 0) goto L33
            r5 = r9
            X.0iI4 r5 = (X.C1236820iI4) r5
            int r2 = r5.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L33
            int r2 = r2 - r1
            r5.LLILLL = r2
        L19:
            java.lang.Object r4 = r5.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r5.LLILLL
            r2 = 1
            if (r0 == 0) goto L39
            if (r0 == r2) goto L54
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            if (r6 == 0) goto L32
            com.bytedance.pumbaa.utility.method_id.MethodIDManager.LJ()
        L32:
            throw r1
        L33:
            X.0iI4 r5 = new X.0iI4
            r5.<init>(r7, r9)
            goto L19
        L39:
            X.C155000ia.LIZIZ(r4)
            com.ss.android.ugc.aweme.account.login.twostep.TwoStepAuthApi$Api r1 = LIZIZ()     // Catch: java.lang.Exception -> L5a
            java.lang.String r0 = "/passport/auth/get_nonce/"
            java.util.List r0 = LJ(r0)     // Catch: java.lang.Exception -> L5a
            r5.LLILLL = r2     // Catch: java.lang.Exception -> L5a
            java.lang.Object r4 = r1.getNonce(r8, r0, r5)     // Catch: java.lang.Exception -> L5a
            if (r4 != r3) goto L57
            if (r6 == 0) goto L53
            com.bytedance.pumbaa.utility.method_id.MethodIDManager.LJ()
        L53:
            return r3
        L54:
            X.C155000ia.LIZIZ(r4)     // Catch: java.lang.Exception -> L5a
        L57:
            com.ss.android.ugc.aweme.account.interfaces.GetNonceResponse r4 = (com.ss.android.ugc.aweme.account.interfaces.GetNonceResponse) r4     // Catch: java.lang.Exception -> L5a
            goto L68
        L5a:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            com.ss.android.ugc.aweme.account.interfaces.GetNonceResponse r4 = new com.ss.android.ugc.aweme.account.interfaces.GetNonceResponse
            java.lang.String r1 = r0.getMessage()
            r0 = 0
            r4.<init>(r1, r0)
        L68:
            if (r6 == 0) goto L6d
            com.bytedance.pumbaa.utility.method_id.MethodIDManager.LJ()
        L6d:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.account.login.twostep.TwoStepAuthApi.LJFF(java.lang.String, X.05Vn):java.lang.Object");
    }

    public static C15O7 LIZ(String str, String str2, int i) {
        return LIZIZ().addAuthDeviceV2(null);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(java.lang.String r6, java.lang.String r7, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.account.login.twostep.AvailableWaysResponse> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof X.C1236810iI3
            if (r0 == 0) goto L20
            r4 = r8
            X.0iI3 r4 = (X.C1236810iI3) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L20
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r3 = r4.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r1 = 1
            if (r0 == 0) goto L2e
            if (r0 != r1) goto L26
            goto L3e
        L20:
            X.0iI3 r4 = new X.0iI3
            r4.<init>(r5, r8)
            goto L12
        L26:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2e:
            X.C155000ia.LIZIZ(r3)
            com.ss.android.ugc.aweme.account.login.twostep.TwoStepAuthApi$Api r0 = LIZIZ()     // Catch: java.lang.Exception -> L44
            r4.LLILLL = r1     // Catch: java.lang.Exception -> L44
            java.lang.Object r3 = r0.getAvailableWaysForHL(r6, r7, r4)     // Catch: java.lang.Exception -> L44
            if (r3 != r2) goto L41
            return r2
        L3e:
            X.C155000ia.LIZIZ(r3)     // Catch: java.lang.Exception -> L44
        L41:
            com.ss.android.ugc.aweme.account.login.twostep.AvailableWaysResponse r3 = (com.ss.android.ugc.aweme.account.login.twostep.AvailableWaysResponse) r3     // Catch: java.lang.Exception -> L44
            return r3
        L44:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            com.ss.android.ugc.aweme.account.login.twostep.AvailableWaysResponse r3 = new com.ss.android.ugc.aweme.account.login.twostep.AvailableWaysResponse
            java.lang.String r1 = r0.getMessage()
            r0 = 0
            r3.<init>(r1, r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.account.login.twostep.TwoStepAuthApi.LIZLLL(java.lang.String, java.lang.String, X.05Vn):java.lang.Object");
    }
}
