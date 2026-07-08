package com.ss.android.ugc.aweme.services.interceptor;

import X.C01GW;
import X.C0XGR;
import X.C10UK;
import X.C123100dR;
import X.C15O7;
import X.C19249810Sq;
import X.C20684815ws;
import X.C2188811AlT;
import X.C2214201BlK;
import X.C452501pT;
import X.EnumC852910Xd3;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.compliance.api.services.agegate.IAgeGateService;
import com.ss.android.ugc.aweme.pns.agegate.data.PNSErrorModel;
import com.ss.android.ugc.aweme.services.IRegistrationAgeGateService;
import com.ss.android.ugc.aweme.services.interceptor.callback.AgeGateCallback;
import com.ss.android.ugc.aweme.services.interceptor.callback.AgeGateCallbackManager;
import com.ss.android.ugc.aweme.services.interceptor.callback.AgeGateResult;
import java.net.URI;
import java.net.URISyntaxException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import kotlin.jvm.internal.AFwS217S0000000_28;
import v7.o;

/* JADX INFO: loaded from: classes29.dex */
public final class AgeGateInterceptor implements IInterceptor {
    public Bundle currentActivityData;
    public Integer currentErrorCode;
    public String currentUrlPath;
    public static final Companion Companion = new Companion();
    public static final int $stable = 8;
    public final SimpleDateFormat requestDateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.ROOT);
    public final C01GW ageGateService$delegate = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(360));

    public static final class Companion {
    }

    private final C10UK callbackForSDK() {
        return new C10UK() { // from class: com.ss.android.ugc.aweme.services.interceptor.AgeGateInterceptor.callbackForSDK.1
            @Override // X.C10UK
            public boolean onCancel() {
                AgeGateInterceptor.this.mobAgeGateCallbackResult(AgeGateResult.CANCEL);
                AgeGateInterceptor.this.getAgeGateService().dismiss();
                AgeGateCallbackManager companion = AgeGateCallbackManager.Companion.getInstance();
                if (companion == null) {
                    return true;
                }
                companion.notifyResult(null);
                return true;
            }

            @Override // X.C10UK
            public boolean onDeviceBlocked() {
                AgeGateInterceptor.this.mobAgeGateCallbackResult(AgeGateResult.DEVICE_BLOCK);
                AgeGateInterceptor.this.getAgeGateService().dismiss();
                AgeGateCallbackManager companion = AgeGateCallbackManager.Companion.getInstance();
                if (companion == null) {
                    return true;
                }
                companion.notifyResult(null);
                return true;
            }

            @Override // X.C10UK
            public boolean onError(PNSErrorModel pNSErrorModel) {
                AgeGateInterceptor.this.mobAgeGateCallbackResult(AgeGateResult.ERROR);
                AgeGateInterceptor.this.getAgeGateService().dismiss();
                AgeGateCallbackManager companion = AgeGateCallbackManager.Companion.getInstance();
                if (companion != null) {
                    companion.notifyResult(null);
                    return false;
                }
                return false;
            }

            @Override // X.C10UK
            public boolean onSuccess(C19249810Sq c19249810Sq) {
                String str;
                AgeGateInterceptor.this.mobAgeGateCallbackResult(AgeGateResult.SUCCESS);
                Date date = c19249810Sq.LIZIZ;
                if (date != null) {
                    str = AgeGateInterceptor.this.requestDateFormat.format(date);
                } else {
                    str = null;
                }
                AgeGateCallbackManager companion = AgeGateCallbackManager.Companion.getInstance();
                if (companion != null) {
                    companion.notifyResult(str);
                    return true;
                }
                return true;
            }

            @Override // X.C10UK
            public boolean onUnderage(C19249810Sq c19249810Sq) {
                AgeGateInterceptor.this.getAgeGateService().dismiss();
                AgeGateInterceptor.this.handleUnderage();
                return true;
            }
        };
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void launchSignupAgeGate() {
        /*
            Method dump skipped, instruction units count: 231
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.services.interceptor.AgeGateInterceptor.launchSignupAgeGate():void");
    }

    private final void mobApiInterceptedMissingBirthday() {
        String string;
        C0XGR c0xgr = new C0XGR();
        Bundle bundle = this.currentActivityData;
        if (bundle == null || (string = bundle.getString("platform")) == null) {
            string = "";
        }
        c0xgr.LIZLLL("platform", string);
        c0xgr.LIZ(C123100dR.LIZ(ComplianceServiceProvider.LIZLLL().LIZIZ()) ? 1 : 0, "if_exist");
        C20684815ws.LJIILLIIL("api_intercepted_missing_birthday", c0xgr.LIZ);
    }

    private final void mobInterceptedBirthdayStillMissing() {
        String string;
        C0XGR c0xgr = new C0XGR();
        Bundle bundle = this.currentActivityData;
        if (bundle == null || (string = bundle.getString("platform")) == null) {
            string = "";
        }
        c0xgr.LIZLLL("platform", string);
        C20684815ws.LJIILLIIL("intercepted_birthday_still_missing", c0xgr.LIZ);
    }

    public final IRegistrationAgeGateService getAgeGateService() {
        return (IRegistrationAgeGateService) this.ageGateService$delegate.getValue();
    }

    public final void handleUnderage() {
        mobAgeGateCallbackResult(AgeGateResult.UNDERAGE);
        Bundle bundle = new Bundle();
        bundle.putInt("next_page", EnumC852910Xd3.FTC_CREATE_ACCOUNT.getValue());
        Bundle bundle2 = this.currentActivityData;
        bundle.putBoolean("child_account_not_expected_upon_signup_success", bundle2 != null ? bundle2.getBoolean("child_account_not_expected_upon_signup_success") : false);
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(C2214201BlK.LJFF(), "//account/ftc");
        smartRouteBuildRoute.withParam(bundle);
        smartRouteBuildRoute.open();
    }

    public static Bundle INVOKEVIRTUAL_com_ss_android_ugc_aweme_services_interceptor_AgeGateInterceptor_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
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

    public final void mobAgeGateCallbackResult(AgeGateResult ageGateResult) {
        String string;
        C0XGR c0xgr = new C0XGR();
        Bundle bundle = this.currentActivityData;
        if (bundle == null || (string = bundle.getString("platform")) == null) {
            string = "";
        }
        c0xgr.LIZLLL("platform", string);
        c0xgr.LIZ(ageGateResult.getValue(), "age_gate_result");
        C20684815ws.LJIILLIIL("age_gate_call_back_result", c0xgr.LIZ);
    }

    public final void register(final o<String> oVar) {
        AgeGateCallbackManager companion = AgeGateCallbackManager.Companion.getInstance();
        if (companion != null) {
            companion.register(new AgeGateCallback() { // from class: com.ss.android.ugc.aweme.services.interceptor.AgeGateInterceptor.register.1
                @Override // com.ss.android.ugc.aweme.services.interceptor.callback.AgeGateCallback
                public void onComplete(String str) {
                    oVar.LIZJ(str);
                }
            });
        }
    }

    public final void setBirthday(int i) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.ROOT);
        Calendar calendar = Calendar.getInstance();
        if (i <= 0) {
            i = 20;
        }
        calendar.add(1, -i);
        IAgeGateService iAgeGateServiceLIZLLL = ComplianceServiceProvider.LIZLLL();
        String str = simpleDateFormat.format(calendar.getTime());
        if (str == null) {
            str = "";
        }
        iAgeGateServiceLIZLLL.LJIILL(str);
    }

    private final C15O7<String> startAgeGate(Context context, String str, String str2) {
        o<String> oVar = new o<>();
        if (context != null && str2 != null) {
            this.currentUrlPath = getPathFromUrl(str);
            register(oVar);
            launchSignupAgeGate();
            return oVar.LIZ;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Activity or response is null, activity: ");
        sbLIZ.append(context);
        sbLIZ.append(", response: ");
        sbLIZ.append(str2);
        oVar.LIZIZ(new Exception(C2188811AlT.LIZIZ(sbLIZ)));
        return oVar.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x006a A[PHI: r1
      0x006a: PHI (r1v6 java.lang.Integer) = (r1v5 java.lang.Integer), (r1v7 java.lang.Integer) binds: [B:20:0x0065, B:22:0x0068] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.ss.android.ugc.aweme.services.interceptor.IInterceptor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.Map<java.lang.String, java.lang.String> tryToIntercept(java.lang.String r8, com.bytedance.retrofit2.client.Request r9, java.lang.String r10, int r11, java.util.Map<java.lang.String, java.lang.String> r12) {
        /*
            Method dump skipped, instruction units count: 249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.services.interceptor.AgeGateInterceptor.tryToIntercept(java.lang.String, com.bytedance.retrofit2.client.Request, java.lang.String, int, java.util.Map):java.util.Map");
    }
}
