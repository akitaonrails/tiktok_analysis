package com.ss.android.ugc.aweme.services;

import X.AbstractC1234810iEp;
import X.AbstractC845940XGm;
import X.C01GW;
import X.C09UZ;
import X.C0WZX;
import X.C0XH1;
import X.C0XQ5;
import X.C0XZ4;
import X.C1234760iEk;
import X.C15O7;
import X.C1701330uNH;
import X.C1899807cK;
import X.C1C7U;
import X.C2204961BRm;
import X.C452501pT;
import X.C816290W0l;
import X.C844470XAv;
import X.C845960XGo;
import X.C846070XGz;
import X.C850810XZf;
import X.EnumC1233840iDG;
import X.InterfaceC2385309Wh;
import X.InterfaceC848770XRj;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.account.login.twostep.AddVerificationResponse;
import com.ss.android.ugc.aweme.account.login.twostep.AuthDeviceResponse;
import com.ss.android.ugc.aweme.account.login.twostep.AvailableWaysResponse;
import com.ss.android.ugc.aweme.account.login.twostep.TwoStepAuthApi;
import com.ss.android.ugc.aweme.account.login.twostep.TwoStepVerificationManagementActivity;
import com.ss.android.ugc.aweme.account.login.twostep.UnusualInfoResponse;
import com.ss.android.ugc.aweme.deeplink.IDeepLinkService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import java.util.HashMap;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.AFwS303S0000000_19;
import kotlin.text.u;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes20.dex */
public final class TwoStepVerificationService implements InterfaceC848770XRj {
    public final C01GW response$delegate = C452501pT.LIZIZ(new TwoStepVerificationService$response$2());
    public C15O7<AddVerificationResponse> task;
    public AuthDeviceResponse trustDeviceResponse;
    public static final Companion Companion = new Companion();
    public static final int $stable = 8;
    public static final String REPO_NAME = "2sv_enhancements";
    public static final Keva keva = Keva.getRepo("2sv_enhancements");
    public static final C01GW<Boolean> isNewTo2svEnhancements$delegate = C452501pT.LIZIZ(new TwoStepVerificationService$Companion$isNewTo2svEnhancements$2());

    public static final class Companion {
        public final boolean isNewTo2svEnhancements() {
            return TwoStepVerificationService.isNewTo2svEnhancements$delegate.getValue().booleanValue();
        }
    }

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnumC1233840iDG.values().length];
            try {
                iArr[EnumC1233840iDG.SMS.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
                TryCatchGuardChecker.doCheck(e);
            }
            try {
                iArr[EnumC1233840iDG.EMAIL.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
            try {
                iArr[EnumC1233840iDG.TOTP.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
                TryCatchGuardChecker.doCheck(e3);
            }
            try {
                iArr[EnumC1233840iDG.PASSWORD.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
                TryCatchGuardChecker.doCheck(e4);
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // X.InterfaceC848770XRj
    public C15O7<Boolean> getTwoStepVerificationStatusFromNetwork() {
        C15O7<AddVerificationResponse> twoStepStatus = getTwoStepStatus(false);
        this.task = twoStepStatus;
        return twoStepStatus.LJI(new InterfaceC2385309Wh() { // from class: com.ss.android.ugc.aweme.services.TwoStepVerificationService.getTwoStepVerificationStatusFromNetwork.1
            @Override // X.InterfaceC2385309Wh
            public final C15O7<Boolean> then(C15O7<AddVerificationResponse> c15o7) {
                if (!C09UZ.LIZLLL(c15o7)) {
                    if (TwoStepVerificationService.this.getResponse().get(C0XQ5.LIZLLL()) != null) {
                        TwoStepVerificationService.this.getResponse().remove(C0XQ5.LIZLLL());
                    }
                    return C15O7.LJIIJ(null);
                }
                AddVerificationResponse addVerificationResponseLJIIL = c15o7.LJIIL();
                if (u.LJIJI("success", addVerificationResponseLJIIL.message, true) && addVerificationResponseLJIIL.data != null) {
                    TwoStepVerificationService.this.getResponse().put(C0XQ5.LIZLLL(), addVerificationResponseLJIIL);
                    TwoStepVerificationService.this.setTwoStepVerificationResponseToCache(addVerificationResponseLJIIL);
                    return C15O7.LJIIJ(Boolean.valueOf(!TextUtils.isEmpty(addVerificationResponseLJIIL.data.default_verify_way)));
                }
                if (TwoStepVerificationService.this.getResponse().get(C0XQ5.LIZLLL()) != null) {
                    TwoStepVerificationService.this.getResponse().remove(C0XQ5.LIZLLL());
                }
                return C15O7.LJIIJ(null);
            }

            @Override // X.InterfaceC2385309Wh
            public /* bridge */ /* synthetic */ Object then(C15O7 c15o7) {
                C1C7U.LIZ("TwoStepVerificationService@935b.getTwoStepVerificationStatusFromNetwork$1");
                C15O7<Boolean> c15o7Then = then((C15O7<AddVerificationResponse>) c15o7);
                C1C7U.LIZIZ("TwoStepVerificationService@935b.getTwoStepVerificationStatusFromNetwork$1");
                return c15o7Then;
            }
        });
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [X.0iEj] */
    public void fetchDeviceName() {
        String string = keva.getString("device_name", "");
        if (string == null || string.length() == 0) {
            C0XZ4 c0xz4 = C0XZ4.LIZ;
            final AFwS257S0000000_19 aFwS257S0000000_19 = AFwS257S0000000_19.get$arr$(310);
            final AFwS303S0000000_19 aFwS303S0000000_19 = AFwS303S0000000_19.get$arr$(19);
            c0xz4.getClass();
            if (C850810XZf.LIZIZ == null) {
                synchronized (C850810XZf.class) {
                    try {
                        if (C850810XZf.LIZIZ == null) {
                            C850810XZf.LIZIZ = new C850810XZf();
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
            }
            C850810XZf c850810XZf = C850810XZf.LIZIZ;
            final ?? r3 = new AbstractC1234810iEp() { // from class: X.0iEj
                @Override // X.C0XH7
                public final void LJI(C0XGA c0xga) {
                    aFwS257S0000000_19.invoke(c0xga);
                }

                @Override // X.C0XH7
                public final void LJ(C0XGA c0xga, int i) {
                    aFwS303S0000000_19.invoke(c0xga, Integer.valueOf(i));
                }
            };
            final Context context = c850810XZf.LIZ;
            C846070XGz c846070XGz = new C846070XGz();
            c846070XGz.LIZ = C0XH1.LIZ("/passport/safe/login_device/list/");
            final C845960XGo c845960XGoLIZIZ = c846070XGz.LIZIZ();
            new AbstractC845940XGm<C1234760iEk>(context, c845960XGoLIZIZ, r3) { // from class: X.0iEl
                public static final /* synthetic */ int LJIIIZ = 0;
                public C1234760iEk LJIIIIZZ;

                @Override // X.AbstractC845940XGm
                public final void LJFF(JSONObject jSONObject, JSONObject jSONObject2) {
                }

                @Override // X.AbstractC845940XGm
                public final void LJ(C0XGA c0xga) {
                    C0XG9.LIZIZ("passport_login_device_list", null, null, c0xga, null);
                }

                @Override // X.AbstractC845940XGm
                public final void LJII(JSONObject jSONObject, JSONObject jSONObject2) {
                    C1234760iEk c1234760iEk = new C1234760iEk(true);
                    this.LJIIIIZZ = c1234760iEk;
                    c1234760iEk.LJIIIZ = jSONObject2;
                }

                @Override // X.AbstractC845940XGm
                public final C0XGA LJIIJ(boolean z, C845980XGq c845980XGq) {
                    C1234760iEk c1234760iEk = this.LJIIIIZZ;
                    if (c1234760iEk == null) {
                        c1234760iEk = new C1234760iEk(z);
                    } else {
                        c1234760iEk.LIZIZ = z;
                    }
                    if (!z) {
                        c1234760iEk.LIZLLL = c845980XGq.LIZIZ;
                        c1234760iEk.LJFF = c845980XGq.LIZJ;
                    }
                    return c1234760iEk;
                }
            }.LJIIIZ();
        }
    }

    public String getDeviceName() {
        String string = keva.getString("device_name", "");
        return (string == null || string.length() == 0) ? Build.MODEL : string;
    }

    public final HashMap<String, AddVerificationResponse> getResponse() {
        return (HashMap) this.response$delegate.getValue();
    }

    public final AddVerificationResponse getTwoStepVerificationResponseFromCache() {
        if (!Companion.isNewTo2svEnhancements()) {
            return getResponse().get(C0XQ5.LIZLLL());
        }
        keva.storeBoolean("is_new_to_2sv_enhancements", false);
        return null;
    }

    public final C15O7<AvailableWaysResponse> getAvailableWays() {
        return TwoStepAuthApi.LIZIZ().LIZIZ();
    }

    @Override // X.InterfaceC848770XRj
    public C15O7<Boolean> getSafeInfo() {
        return TwoStepAuthApi.LIZIZ().LIZLLL().LJI(new InterfaceC2385309Wh() { // from class: com.ss.android.ugc.aweme.services.TwoStepVerificationService.getSafeInfo.1
            @Override // X.InterfaceC2385309Wh
            public final C15O7<Boolean> then(C15O7<UnusualInfoResponse> c15o7) {
                UnusualInfoResponse.Data data;
                if (!C09UZ.LIZLLL(c15o7)) {
                    return C15O7.LJIIJ(Boolean.FALSE);
                }
                UnusualInfoResponse unusualInfoResponseLJIIL = c15o7.LJIIL();
                boolean z = true;
                if (u.LJIJI("success", unusualInfoResponseLJIIL.message, true) && (data = unusualInfoResponseLJIIL.data) != null && data.new_notice != null) {
                    if (data.new_notice.intValue() < 1) {
                        z = false;
                    }
                    return C15O7.LJIIJ(Boolean.valueOf(z));
                }
                return C15O7.LJIIJ(Boolean.FALSE);
            }

            @Override // X.InterfaceC2385309Wh
            public /* bridge */ /* synthetic */ Object then(C15O7 c15o7) {
                C1C7U.LIZ("TwoStepVerificationService@935b.getSafeInfo$1");
                C15O7<Boolean> c15o7Then = then((C15O7<UnusualInfoResponse>) c15o7);
                C1C7U.LIZIZ("TwoStepVerificationService@935b.getSafeInfo$1");
                return c15o7Then;
            }
        });
    }

    public Boolean getTwoStepVerificationStatusFromCache() {
        AddVerificationResponse.Data data;
        String str;
        AddVerificationResponse addVerificationResponse = getResponse().get(C0XQ5.LIZLLL());
        if (addVerificationResponse == null || (data = addVerificationResponse.data) == null || (str = data.default_verify_way) == null) {
            return null;
        }
        return Boolean.valueOf(!TextUtils.isEmpty(str));
    }

    @Override // X.InterfaceC848770XRj
    public int getTwoStepVerificationStatusFromLocal() {
        String strLIZLLL = C0XQ5.LIZLLL();
        Integer numValueOf = strLIZLLL.length() == 0 ? -1 : Integer.valueOf(C1899807cK.LIZ(strLIZLLL).getInt("tow_sv_status", -1));
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return -1;
    }

    public final AuthDeviceResponse getPreviousAuthDeviceListStatus() {
        return this.trustDeviceResponse;
    }

    public final C15O7<AddVerificationResponse> getTask() {
        return this.task;
    }

    public final C15O7<AddVerificationResponse> getTwoStepStatus(boolean z) {
        if (!z || this.task == null || Companion.isNewTo2svEnhancements()) {
            this.task = TwoStepAuthApi.LIZIZ().LIZJ();
        }
        return this.task;
    }

    public String getVerifyTypeFromMethod(EnumC1233840iDG enumC1233840iDG) {
        int i = WhenMappings.$EnumSwitchMapping$0[enumC1233840iDG.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        return "";
                    }
                    return "pwd_verify";
                }
                return "totp_verify";
            }
            return "email_verify";
        }
        return "mobile_sms_verify";
    }

    public void onOpenPushChallengePage(String str) {
        C816290W0l.LL.getClass();
        ((Keva) C816290W0l.LLILZIL.getValue()).storeLong(str, System.currentTimeMillis());
    }

    public final void setAuthDeviceListStatus(AuthDeviceResponse authDeviceResponse) {
        this.trustDeviceResponse = authDeviceResponse;
    }

    public final void setTask(C15O7<AddVerificationResponse> c15o7) {
        this.task = c15o7;
    }

    public final void setTwoStepVerificationResponseToCache(AddVerificationResponse addVerificationResponse) {
        String str;
        AddVerificationResponse.Data data;
        getResponse().put(C0XQ5.LIZLLL(), addVerificationResponse);
        AddVerificationResponse addVerificationResponse2 = getResponse().get(C0XQ5.LIZLLL());
        if (addVerificationResponse2 != null && (data = addVerificationResponse2.data) != null) {
            str = data.default_verify_way;
        } else {
            str = null;
        }
        C1899807cK.LIZ(C0XQ5.LIZLLL()).storeInt("tow_sv_status", !TextUtils.isEmpty(str) ? 1 : 0);
    }

    public static void INVOKEVIRTUAL_com_ss_android_ugc_aweme_services_TwoStepVerificationService_com_bytedance_analytics_lancet_StartActivityLancet_startActivity(Activity activity, Intent intent) {
        C1701330uNH.LIZ(intent, activity);
        C2204961BRm.LJIILLIIL(activity, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmtcYnH3zdD6BKjOrjzWfN5INCWaW2hKBazMKeN8A88vaPq", null));
    }

    public static void INVOKEVIRTUAL_com_ss_android_ugc_aweme_services_TwoStepVerificationService_com_bytedance_router_monitor_page_PageLancet_startActivity(Activity activity, Intent intent) {
        RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(activity, intent, "Context_startActivity_1");
        INVOKEVIRTUAL_com_ss_android_ugc_aweme_services_TwoStepVerificationService_com_bytedance_analytics_lancet_StartActivityLancet_startActivity(activity, intent);
    }

    @Override // X.InterfaceC848770XRj
    public void handlePushChallengeInfo(String str, String str2) {
        C816290W0l c816290W0l = C816290W0l.LL;
        c816290W0l.getClass();
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            C01GW c01gw = C816290W0l.LLILZIL;
            if (!((Keva) c01gw.getValue()).contains(str)) {
                try {
                    C844470XAv.LIZ.getClass();
                    Context contextLIZ = C844470XAv.LIZ();
                    Class<? extends Activity> clsLJLJJI = ((IDeepLinkService) ServiceManager.get().getService(IDeepLinkService.class)).LJLJJI("PushChallenegHelper#handlePushChallengeInfo");
                    if (clsLJLJJI != null) {
                        Intent intent = new Intent(contextLIZ, clsLJLJJI);
                        intent.setData(UriProtector.parse(str2));
                        intent.addFlags(268435456);
                        if (ActivityStack.isAppBackGround()) {
                            C816290W0l.LLILLJJLI = System.currentTimeMillis();
                            C816290W0l.LLILLL = intent;
                            C816290W0l.LLILZ = str;
                            ((Application) C844470XAv.LIZ()).registerActivityLifecycleCallbacks(c816290W0l);
                            return;
                        }
                        intent.addFlags(536870912);
                        ((Keva) c01gw.getValue()).storeLong(str, System.currentTimeMillis());
                        Context contextLIZ2 = C844470XAv.LIZ();
                        RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(contextLIZ2, intent, "Context_startActivity_1");
                        C1701330uNH.LIZ(intent, contextLIZ2);
                        C2204961BRm.LJJJJJL(contextLIZ2, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOurYJDb0ibECfF1owsk1rRolYszAemCplyRBIESIa/NT+bPLWtCWX8I", null));
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
        }
    }

    @Override // X.InterfaceC848770XRj
    public void openTwoStepVerificationManageActivity(Activity activity, String str) {
        Intent intent = new Intent(activity, (Class<?>) TwoStepVerificationManagementActivity.class);
        intent.putExtra("enter_from", str);
        INVOKEVIRTUAL_com_ss_android_ugc_aweme_services_TwoStepVerificationService_com_bytedance_router_monitor_page_PageLancet_startActivity(activity, intent);
    }
}
