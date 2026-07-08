package com.ss.android.ugc.aweme.app.crash;

import X.C0VSJ;
import X.C0W8H;
import X.C2156708cf;
import X.C2188191AkT;
import X.C2188811AlT;
import X.C2214201BlK;
import X.C2409809cO;
import X.C786410Ut5;
import X.C788530UwV;
import X.C805380Via;
import X.C817700W5w;
import X.C823670WSv;
import X.InterfaceC2156608ce;
import Y.ARunnableS9S1100000_3;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.app.JobIntentService;
import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.app.crash.LaunchProtectService;
import com.ss.android.ugc.aweme.nxreword.manager.NxRewordManager;
import java.io.File;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class LaunchProtectService extends JobIntentService {
    public static SharedPreferences LLILLJJLI;
    public final String LL = "https://sf-launch-protect.tiktokcdn.com/obj/tt-launch-protect-sg/android/";

    public static void LIZ(Context context) {
        if (LLILLJJLI == null) {
            LLILLJJLI = context.getSharedPreferences("launch_crash_intercept_sp", 0);
        }
        SharedPreferences sharedPreferences = LLILLJJLI;
        String string = sharedPreferences.getString("dynamic_clear_path_success", null);
        if (!TextUtils.isEmpty(string)) {
            C823670WSv.LJFF("dynamic_clear_path_success");
            C805380Via.LJFF("LaunchProtectException", "LaunchProtectService", new RuntimeException(string));
            sharedPreferences.edit().remove("dynamic_clear_path_success").commit();
        }
        String string2 = sharedPreferences.getString("dynamic_clear_path_failed", null);
        if (!TextUtils.isEmpty(string2)) {
            C823670WSv.LJFF("dynamic_clear_path_failed");
            C805380Via.LJFF("LaunchProtectException", "LaunchProtectService", new RuntimeException(string2));
            sharedPreferences.edit().remove("dynamic_clear_path_failed").commit();
        }
    }

    public static boolean LIZIZ(String str) {
        String strLIZIZ;
        C0VSJ c0vsj = new C0VSJ(str);
        if (!c0vsj.exists()) {
            return false;
        }
        if (c0vsj.isFile()) {
            return c0vsj.delete();
        }
        String[] list = c0vsj.list();
        if (list == null) {
            return false;
        }
        for (String str2 : list) {
            if (str2 != null) {
                String str3 = File.separator;
                if (str.endsWith(str3)) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(str);
                    sbLIZ.append(str2);
                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                } else {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(str);
                    sbLIZ2.append(str3);
                    sbLIZ2.append(str2);
                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                }
                C0VSJ c0vsj2 = new C0VSJ(strLIZIZ);
                if (c0vsj2.isFile()) {
                    c0vsj2.delete();
                }
                if (c0vsj2.isDirectory()) {
                    LIZIZ(strLIZIZ);
                }
            }
        }
        return c0vsj.delete();
    }

    @Override // androidx.core.app.JobIntentService, android.app.Service, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        if (NxRewordManager.LJIILIIL) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("attachBaseContextWrapper: ");
            sbLIZ.append(Log.getStackTraceString(new Throwable(context.toString())));
            C2188811AlT.LIZIZ(sbLIZ);
            context = new C817700W5w(context, false);
        }
        if (!C2214201BlK.LJIIJJI && C788530UwV.LIZ("serviceAttachBaseContext")) {
            C2188191AkT.LIZJ();
        }
        super.attachBaseContext(context);
    }

    @Override // androidx.core.app.JobIntentService
    public final void onHandleWork(Intent intent) {
        String stringExtra;
        String str;
        if (intent == null) {
            return;
        }
        String stringExtra2 = null;
        try {
            stringExtra = intent.getStringExtra("type");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            stringExtra = null;
        }
        if ("report_buried".equals(stringExtra)) {
            try {
                stringExtra2 = intent.getStringExtra("stack");
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
            C0W8H.LIZIZ("launch_crash_monitor_service", stringExtra2, new InterfaceC2156608ce() { // from class: X.09cP
                @Override // X.InterfaceC2156608ce
                public final void onError(int i, String str2) {
                }

                @Override // X.InterfaceC2156608ce
                public final void onSuccess(String str2) {
                }
            });
            return;
        }
        if ("dynamic_clear".equals(stringExtra)) {
            Context applicationContext = getApplicationContext();
            if (C2409809cO.LIZIZ && applicationContext == null) {
                applicationContext = C2409809cO.LIZ;
            }
            try {
                stringExtra2 = C786410Ut5.Y3(applicationContext.getPackageManager(), applicationContext.getPackageName(), 0).versionName;
            } catch (PackageManager.NameNotFoundException e3) {
                TryCatchGuardChecker.doCheck(e3);
            }
            StringBuilder sb = new StringBuilder(this.LL);
            Context applicationContext2 = getApplicationContext();
            if (C2409809cO.LIZIZ && applicationContext2 == null) {
                applicationContext2 = C2409809cO.LIZ;
            }
            String packageName = applicationContext2.getPackageName();
            if (packageName.contains("musically")) {
                str = "m";
            } else if (packageName.contains("trill")) {
                str = "t";
            } else {
                str = "usmain";
                if (!packageName.contains("usmain")) {
                    str = "coin";
                }
            }
            sb.append(str);
            if (!TextUtils.isEmpty(stringExtra2)) {
                sb.append("/");
                sb.append(stringExtra2);
            }
            sb.append("/config.txt");
            C2156708cf.LIZ.execute(new ARunnableS9S1100000_3(new InterfaceC2156608ce() { // from class: X.09cN
                @Override // X.InterfaceC2156608ce
                public final void onSuccess(String str2) {
                    try {
                        this.LIZ.getClass();
                        JSONArray jSONArray = JSONObjectProtectorUtils.getJSONArray(new JSONObject(str2), "path_to_clean");
                        int length = jSONArray.length();
                        String[] strArr = new String[length];
                        for (int i = 0; i < jSONArray.length(); i++) {
                            strArr[i] = JSONArrayProtectorUtils.getString(jSONArray, i);
                        }
                        for (int i2 = 0; i2 < length; i2++) {
                            String str3 = strArr[i2];
                            if (LaunchProtectService.LIZIZ(str3)) {
                                this.LIZ.LIZJ("dynamic_clear_path_success", "DynamicClearPath");
                            } else {
                                LaunchProtectService launchProtectService = this.LIZ;
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("delete path ");
                                sbLIZ.append(str3);
                                sbLIZ.append(" failed");
                                launchProtectService.LIZJ("dynamic_clear_path_failed", C2188811AlT.LIZIZ(sbLIZ));
                            }
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        this.LIZ.LIZJ("dynamic_clear_path_failed", th.toString());
                    }
                }

                @Override // X.InterfaceC2156608ce
                public final void onError(int i, String str2) {
                    LaunchProtectService launchProtectService = this.LIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("network error ");
                    sbLIZ.append(str2);
                    launchProtectService.LIZJ("dynamic_clear_path_failed", C2188811AlT.LIZIZ(sbLIZ));
                }
            }, sb.toString(), 5));
        }
    }

    public final void LIZJ(String str, String str2) {
        Context applicationContext = getApplicationContext();
        if (C2409809cO.LIZIZ && applicationContext == null) {
            applicationContext = C2409809cO.LIZ;
        }
        if (LLILLJJLI == null) {
            LLILLJJLI = applicationContext.getSharedPreferences("launch_crash_intercept_sp", 0);
        }
        LLILLJJLI.edit().putString(str, str2).commit();
    }
}
