package com.facebook.login;

import X.C0W01;
import X.C0W50;
import X.C0W7K;
import X.C13LP;
import X.C13LQ;
import X.C13LR;
import X.C14SE;
import X.C1BIP;
import X.C1BIT;
import X.C1BJ5;
import X.C1BJO;
import X.C1BJY;
import X.C20012613Sa;
import X.C2202501BIa;
import X.C2202531BId;
import X.C2202601BIk;
import X.C2202701BIu;
import X.C2202721BIw;
import X.C2202741BIy;
import X.C2202781BJc;
import X.C786410Ut5;
import X.C807660VmG;
import X.C810670Vr7;
import X.C817470W4z;
import X.C821590WKv;
import X.C824920WXq;
import X.EnumC2202541BIe;
import X.EnumC2202671BIr;
import X.EnumC824980WXw;
import X.InterfaceC1701380uNM;
import X.InterfaceC2202521BIc;
import Y.ARunnableS134S0100000_34;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.facebook.AccessToken;
import com.facebook.AuthenticationToken;
import com.facebook.FacebookActivity;
import com.facebook.FacebookSdk;
import com.facebook.Profile;
import com.facebook.login.LoginClient;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes35.dex */
public class LoginManager {
    public static final C2202781BJc LJIIIZ = new C2202781BJc();
    public static final Set<String> LJIIJ = C13LQ.LJLIIL(new String[]{"ads_management", "create_event", "rsvp_event"});
    public static volatile LoginManager LJIIJJI;
    public final SharedPreferences LIZJ;
    public String LJ;
    public boolean LJFF;
    public boolean LJII;
    public boolean LJIIIIZZ;
    public C1BIT LIZ = C1BIT.NATIVE_WITH_FALLBACK;
    public C1BIP LIZIZ = C1BIP.FRIENDS;
    public String LIZLLL = "rerequest";
    public EnumC824980WXw LJI = EnumC824980WXw.FACEBOOK;

    static {
        LoginManager.class.toString();
    }

    public final void LIZLLL() {
        AccessToken.Companion.getClass();
        C2202741BIy.LJFF.LIZ().LIZJ(null, true);
        AuthenticationToken.Companion.getClass();
        C821590WKv.LIZ(null);
        Profile.Companion.getClass();
        C2202701BIu.LIZLLL.LIZ().LIZ(null, true);
        SharedPreferences.Editor editorEdit = this.LIZJ.edit();
        editorEdit.putBoolean("express_login_allowed", false);
        editorEdit.apply();
    }

    public LoginManager() {
        C0W7K.LJFF();
        this.LIZJ = C810670Vr7.LIZJ(FacebookSdk.LIZJ(), 0, "com.facebook.loginManager");
        if (!FacebookSdk.LJIIJJI || C0W01.LIZ() == null) {
            return;
        }
        C817470W4z.LIZ(FacebookSdk.LIZJ(), "com.android.chrome", new C824920WXq());
        Context contextLIZJ = FacebookSdk.LIZJ();
        String packageName = FacebookSdk.LIZJ().getPackageName();
        if (packageName != null) {
            final Context contextN3 = C786410Ut5.N3(contextLIZJ);
            try {
                C817470W4z.LIZ(contextN3, packageName, new C0W50() { // from class: X.0W07
                    @Override // android.content.ServiceConnection
                    public final void onServiceDisconnected(ComponentName componentName) {
                    }

                    @Override // X.C0W50
                    public final void onCustomTabsServiceConnected(ComponentName componentName, C817470W4z c817470W4z) {
                        c817470W4z.LIZLLL();
                        contextN3.unbindService(this);
                    }
                });
            } catch (SecurityException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    public static Intent LIZIZ(LoginClient.Request request) {
        Intent intent = new Intent();
        intent.setClass(FacebookSdk.LIZJ(), FacebookActivity.class);
        intent.setAction(request.loginBehavior.toString());
        Bundle bundle = new Bundle();
        C786410Ut5.LJJIJL(bundle, "request", request);
        intent.putExtra("com.facebook.LoginFragment:Request", bundle);
        return intent;
    }

    public final LoginClient.Request LIZ(C13LR c13lr) {
        String strLIZ;
        C14SE c14se = C14SE.S256;
        try {
            strLIZ = C20012613Sa.LIZ(c13lr.LIZJ, c14se);
        } catch (C1BJO e) {
            TryCatchGuardChecker.doCheck(e);
            c14se = C14SE.PLAIN;
            strLIZ = c13lr.LIZJ;
        }
        LoginClient.Request request = new LoginClient.Request(this.LIZ, C13LP.LLIIJI(c13lr.LIZ), this.LIZIZ, this.LIZLLL, FacebookSdk.LIZLLL(), UUID.randomUUID().toString(), this.LJI, c13lr.LIZIZ, c13lr.LIZJ, strLIZ, c14se);
        AccessToken.Companion.getClass();
        request.isRerequest = C2202721BIw.LIZJ();
        request.messengerPageId = this.LJ;
        request.resetMessengerState = this.LJFF;
        request.isFamilyLogin = this.LJII;
        request.shouldSkipAccountDeduplication = this.LJIIIIZZ;
        return request;
    }

    public static void LJ(Context context, LoginClient.Request request) {
        C2202601BIk c2202601BIkLIZ = C1BJY.LIZ.LIZ(context);
        if (c2202601BIkLIZ != null && !C807660VmG.LIZ(c2202601BIkLIZ)) {
            try {
                ScheduledExecutorService scheduledExecutorService = C2202601BIk.LIZLLL;
                Bundle bundleLIZ = C1BJ5.LIZ(request.authId);
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("login_behavior", request.loginBehavior.toString());
                    LoginClient.Companion.getClass();
                    jSONObject.put("request_code", EnumC2202541BIe.Login.toRequestCode());
                    jSONObject.put("permissions", TextUtils.join(",", request.permissions));
                    jSONObject.put("default_audience", request.defaultAudience.toString());
                    jSONObject.put("isReauthorize", request.isRerequest);
                    String str = c2202601BIkLIZ.LIZJ;
                    if (str != null) {
                        jSONObject.put("facebookVersion", str);
                    }
                    EnumC824980WXw enumC824980WXw = request.loginTargetApp;
                    if (enumC824980WXw != null) {
                        jSONObject.put("target_app", enumC824980WXw.toString());
                    }
                    C786410Ut5.LJJJI("6_extras", C786410Ut5.J3(jSONObject), bundleLIZ);
                } catch (JSONException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                c2202601BIkLIZ.LIZIZ.getClass();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }

    public final void LJI(InterfaceC1701380uNM interfaceC1701380uNM, LoginClient.Request request) {
        LJ(interfaceC1701380uNM.LIZ(), request);
        C2202531BId c2202531BId = C2202501BIa.LIZIZ;
        EnumC2202541BIe enumC2202541BIe = EnumC2202541BIe.Login;
        int requestCode = enumC2202541BIe.toRequestCode();
        InterfaceC2202521BIc interfaceC2202521BIc = new InterfaceC2202521BIc() { // from class: X.1BIb
            @Override // X.InterfaceC2202521BIc
            public final void LIZ(int i, Intent intent) {
                this.LIZ.LJFF(i, intent, null);
            }
        };
        synchronized (c2202531BId) {
            Map<Integer, InterfaceC2202521BIc> map = C2202501BIa.LIZJ;
            if (!((HashMap) map).containsKey(Integer.valueOf(requestCode))) {
                ((HashMap) map).put(Integer.valueOf(requestCode), interfaceC2202521BIc);
            }
        }
        Intent intentLIZIZ = LIZIZ(request);
        if (FacebookSdk.LIZJ().getPackageManager().resolveActivity(intentLIZIZ, 0) != null) {
            try {
                LoginClient.Companion.getClass();
                interfaceC1701380uNM.startActivityForResult(intentLIZIZ, enumC2202541BIe.toRequestCode());
                return;
            } catch (ActivityNotFoundException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        C1BJO c1bjo = new C1BJO("Log in attempt failed: FacebookActivity could not be started. Please make sure you added FacebookActivity to the AndroidManifest.");
        LIZJ(interfaceC1701380uNM.LIZ(), EnumC2202671BIr.ERROR, null, c1bjo, false, request);
        throw c1bjo;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJFF(int r15, android.content.Intent r16, X.InterfaceC2206961BZe r17) {
        /*
            Method dump skipped, instruction units count: 339
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.login.LoginManager.LJFF(int, android.content.Intent, X.1BZe):void");
    }

    public static void LIZJ(Context context, EnumC2202671BIr enumC2202671BIr, Map map, C1BJO c1bjo, boolean z, LoginClient.Request request) {
        String str;
        C2202601BIk c2202601BIkLIZ = C1BJY.LIZ.LIZ(context);
        if (c2202601BIkLIZ == null) {
            return;
        }
        if (request == null) {
            ScheduledExecutorService scheduledExecutorService = C2202601BIk.LIZLLL;
            if (!C807660VmG.LIZ(C2202601BIk.class)) {
                try {
                    c2202601BIkLIZ.LIZ("");
                    return;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    return;
                }
            }
            return;
        }
        HashMap map2 = new HashMap();
        if (z) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        map2.put("try_login_activity", str);
        String str2 = request.authId;
        if (!C807660VmG.LIZ(c2202601BIkLIZ)) {
            ScheduledExecutorService scheduledExecutorService2 = C2202601BIk.LIZLLL;
            try {
                Bundle bundleLIZ = C1BJ5.LIZ(str2);
                if (enumC2202671BIr != null) {
                    C786410Ut5.LJJJI("2_result", enumC2202671BIr.getLoggingValue(), bundleLIZ);
                }
                JSONObject jSONObject = null;
                if (c1bjo != null && c1bjo.getMessage() != null) {
                    C786410Ut5.LJJJI("5_error_message", c1bjo.getMessage(), bundleLIZ);
                }
                if (!map2.isEmpty()) {
                    jSONObject = new JSONObject(map2);
                }
                if (map != null) {
                    if (jSONObject == null) {
                        jSONObject = new JSONObject();
                    }
                    try {
                        for (Map.Entry entry : map.entrySet()) {
                            String str3 = (String) entry.getKey();
                            String str4 = (String) entry.getValue();
                            if (str3 != null) {
                                jSONObject.put(str3, str4);
                            }
                        }
                    } catch (JSONException e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                } else {
                    if (jSONObject != null) {
                    }
                    c2202601BIkLIZ.LIZIZ.getClass();
                    if (enumC2202671BIr != EnumC2202671BIr.SUCCESS && !C807660VmG.LIZ(c2202601BIkLIZ)) {
                        try {
                            C2202601BIk.LIZLLL.schedule(new ARunnableS134S0100000_34(c2202601BIkLIZ, C1BJ5.LIZ(str2), 89), 5L, TimeUnit.SECONDS);
                            return;
                        } catch (Throwable th2) {
                            TryCatchGuardChecker.doCheck(th2);
                            return;
                        }
                    }
                }
                C786410Ut5.LJJJI("6_extras", C786410Ut5.J3(jSONObject), bundleLIZ);
                c2202601BIkLIZ.LIZIZ.getClass();
                if (enumC2202671BIr != EnumC2202671BIr.SUCCESS) {
                }
            } catch (Throwable th3) {
                TryCatchGuardChecker.doCheck(th3);
            }
        }
    }
}
