package com.ss.android.ugc.aweme.splash;

import X.AbstractC827890Wdn;
import X.C0CPH;
import X.C0NET;
import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C1150504el;
import X.C1400380mXs;
import X.C1499900p8O;
import X.C1591880rWk;
import X.C1701330uNH;
import X.C19221910Hx;
import X.C19EG;
import X.C1BN8;
import X.C20237514Gn;
import X.C20684815ws;
import X.C2344809Gs;
import X.C799900VZk;
import X.C810650Vr5;
import X.C810670Vr7;
import X.C826810Wc3;
import X.C827880Wdm;
import X.C844470XAv;
import X.C960203pA;
import X.EnumC1589930rTb;
import X.EnumC1998207sC;
import X.InterfaceC1916090zxf;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.launcher.service.crashsdk.ICrashSdkApi;
import com.ss.android.ugc.aweme.legoImp.task.UploadInstallEventTask;
import com.ss.android.ugc.aweme.legoImp.task.UploadSysStatusTask;
import com.ss.android.ugc.aweme.services.IAVServiceProxy;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes29.dex */
public class SplashActivity extends C19EG implements WeakHandler.IHandler, InterfaceC1916090zxf {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2HELIOSZjY8JS4gIGsfOSMyOy0NKjs6Piw4MA==";
    public static EnumC1998207sC sConfirmWelcomeType = EnumC1998207sC.FULL_SCREEN_WELCOME;
    public volatile boolean mAlive = true;
    public boolean mFirstResume = true;
    public final Handler mHandler = new WeakHandler(this);
    public boolean mInited;
    public boolean mJumped;
    public boolean mTrackSession;

    public void com_ss_android_ugc_aweme_splash_SplashActivity__onStop$___twin___() {
        super.onStop();
    }

    @Override // X.InterfaceC1916090zxf
    public boolean getCanCollectConsent() {
        return false;
    }

    public void goMainActivity() throws Throwable {
        goMainActivity(null);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
    }

    @Override // X.C19EG, android.app.Activity
    public void onStop() {
        com_ss_android_ugc_aweme_splash_SplashActivity_com_ss_android_ugc_aweme_lancet_ActivityEnterTransitionCoordinatorLancet_onStop(this);
    }

    public boolean quickLaunch() {
        return false;
    }

    private void mobLaunchMob() {
        try {
            Intent intent = getIntent();
            if (intent != null) {
                Uri data = intent.getData();
                boolean booleanExtra = getIntent().getBooleanExtra("from_notification", false);
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = data != null ? UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(data, "gd_label") : "";
                if (booleanExtra || strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter != null) {
                    C1400380mXs.LIZ().LIZIZ = false;
                    return;
                }
            }
            MobClick mobClickObtain = MobClick.obtain();
            mobClickObtain.setEventName("launch_app");
            mobClickObtain.setLabelName("enter_launch");
            C20684815ws.onEvent(mobClickObtain);
            C1400380mXs.LIZ().LIZIZ = false;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    @Override // X.C19EG, android.app.Activity
    public void onDestroy() {
        this.mHandler.removeMessages(100);
        this.mAlive = false;
        super.onDestroy();
    }

    public void tryInit() {
        if (this.mInited) {
            return;
        }
        this.mInited = true;
    }

    private void hotStartIntercept() {
        if (isHotStart()) {
            C20237514Gn.LIZIZ.LIZIZ();
        }
    }

    private boolean isHotStart() {
        Intent intent = getIntent();
        return isTaskRoot() && intent != null && intent.hasCategory("android.intent.category.LAUNCHER") && "android.intent.action.MAIN".equals(intent.getAction());
    }

    private void reportLaunchTime() {
        long jCurrentTimeMillis = System.currentTimeMillis() - C1150504el.LIZ().LJJII;
        int iLIZ = C826810Wc3.LIZ();
        C827880Wdm c827880WdmLIZIZ = AbstractC827890Wdn.LIZIZ();
        int i = c827880WdmLIZIZ.LIZ;
        if (i == -1 || i == 0 || i == 1) {
            C844470XAv.LIZ.getClass();
            c827880WdmLIZIZ.LIZ = (int) C844470XAv.LIZIZ();
        }
        int i2 = c827880WdmLIZIZ.LIZ;
        boolean z = iLIZ != i2;
        if (C1400380mXs.LIZ().LIZ) {
            C799900VZk.LIZ.getClass();
            C0CPH c0cph = new C0CPH();
            c0cph.LIZ(C1591880rWk.LIZIZ.LIZJ(jCurrentTimeMillis, z));
            c0cph.LIZIZ();
        }
        if (iLIZ == 0) {
            C844470XAv.LIZ.getClass();
            SharedPreferences.Editor editorEdit = C810670Vr7.LIZJ(C844470XAv.LIZ(), 0, "app_setting").edit();
            editorEdit.putInt("last_version_code", i2);
            C1499900p8O.LIZ(editorEdit);
        }
    }

    public Intent getMainIntent() {
        Intent intent = getIntent();
        ((IAVServiceProxy) ServiceManager.get().getService(IAVServiceProxy.class)).getApplicationService();
        Intent intent2 = new Intent(this, C19221910Hx.LIZJ());
        intent2.setFlags(335544320);
        if (intent != null) {
            intent2.setAction(intent.getAction());
            Set<String> categories = intent.getCategories();
            if (categories != null && !categories.isEmpty()) {
                Iterator<String> it2 = categories.iterator();
                while (it2.hasNext()) {
                    intent2.addCategory(it2.next());
                }
            }
            if (INVOKEVIRTUAL_com_ss_android_ugc_aweme_splash_SplashActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras(intent) != null) {
                intent2.putExtras(INVOKEVIRTUAL_com_ss_android_ugc_aweme_splash_SplashActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras(intent));
            }
        }
        return intent2;
    }

    @Override // X.C19EG, X.C19FO, android.app.Activity
    public void onResume() throws Throwable {
        Bundle bundleINVOKEVIRTUAL_com_ss_android_ugc_aweme_splash_SplashActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras;
        C1150504el.LIZ().LJIILJJIL(EnumC1589930rTb.SPLASH_RESUME);
        super.onResume();
        Intent intent = getIntent();
        if (!this.mFirstResume || this.mJumped) {
            return;
        }
        this.mFirstResume = false;
        if (intent != null && (bundleINVOKEVIRTUAL_com_ss_android_ugc_aweme_splash_SplashActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras = INVOKEVIRTUAL_com_ss_android_ugc_aweme_splash_SplashActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras(intent)) != null && bundleINVOKEVIRTUAL_com_ss_android_ugc_aweme_splash_SplashActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras.getBoolean("from_notification")) {
            C810650Vr5.LIZ(this, "more_tab", "notify_click");
            C810650Vr5.LIZ(this, "apn", "recall");
        }
        if (quickLaunch()) {
            goMainActivity();
        }
    }

    public void tryShowShortCutDlg() throws Throwable {
        C1150504el.LIZ().LIZLLL("method_splash_try_show_ad_duration", false);
        tryShowAdAndGoNext();
        C1150504el.LIZ().LJI("method_splash_try_show_ad_duration", false);
    }

    @Override // X.C19EG, android.app.Activity
    public void onStart() {
        super.onStart();
    }

    public void tryShowAdAndGoNext() throws Throwable {
        goMainActivity();
    }

    public static Bundle INVOKEVIRTUAL_com_ss_android_ugc_aweme_splash_SplashActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public static void com_ss_android_ugc_aweme_splash_SplashActivity_com_bytedance_sysoptimizer_EnterTransitionLancet_onStop(SplashActivity splashActivity) {
        splashActivity.com_ss_android_ugc_aweme_splash_SplashActivity__onStop$___twin___();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            try {
                splashActivity.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }

    public static void com_ss_android_ugc_aweme_splash_SplashActivity_com_ss_android_ugc_aweme_lancet_ActivityEnterTransitionCoordinatorLancet_onStop(SplashActivity splashActivity) {
        com_ss_android_ugc_aweme_splash_SplashActivity_com_bytedance_sysoptimizer_EnterTransitionLancet_onStop(splashActivity);
        try {
            splashActivity.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    @Override // X.C19FO, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        C0NET.LIZ.getClass();
        C0NET.LJIILJJIL();
        super.attachBaseContext(context);
    }

    public void goMainActivity(Bundle bundle) throws Throwable {
        this.mHandler.removeMessages(100);
        if (this.mJumped) {
            return;
        }
        this.mJumped = true;
        if (!this.mAlive) {
            return;
        }
        Intent mainIntent = getMainIntent();
        if (bundle != null) {
            mainIntent.putExtra("extra_splash_data", bundle);
        }
        INVOKEVIRTUAL_com_ss_android_ugc_aweme_splash_SplashActivity_com_bytedance_router_monitor_page_PageLancet_startActivity(this, mainIntent);
        if (!isFinishing()) {
            finish();
        }
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public void handleMsg(Message message) throws Throwable {
        if (this.mAlive && message.what == 100) {
            goMainActivity(message.getData());
        }
    }

    @Override // X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public void onCreate(Bundle bundle) throws Throwable {
        C1150504el.LIZ().LJI("cold_boot_application_to_splash", true);
        C1150504el.LIZ().LIZLLL("cold_boot_splash_duration", true);
        ((ICrashSdkApi) ServiceManager.get().getService(ICrashSdkApi.class)).LJIIZILJ(this);
        C1150504el.LIZ().LIZLLL("method_splash_super_duration", false);
        getWindow().setBackgroundDrawable(new ColorDrawable(C960203pA.LIZ(R.attr.c5, this)));
        super.onCreate(bundle);
        C1150504el.LIZ().LJI("method_splash_super_duration", false);
        if (getIntent() != null && TextUtils.equals(getIntent().getAction(), "android.intent.action.MAIN") && getIntent().getCategories() != null && getIntent().getCategories().size() > 0 && getIntent().getCategories().contains("android.intent.category.LAUNCHER") && !isTaskRoot() && C1BN8.LIZ().LIZIZ()) {
            C2344809Gs.LIZLLL(4, "SplashActivity", "finish SplashActivity directly");
            finish();
            return;
        }
        if (!isTaskRoot()) {
            goMainActivity();
            return;
        }
        this.mAlive = true;
        this.mFirstResume = true;
        this.mJumped = false;
        reportLaunchTime();
        mobLaunchMob();
        C1400380mXs.LIZ().LIZ = false;
        C799900VZk.LIZ.getClass();
        C0CPH c0cph = new C0CPH();
        c0cph.LIZ(new UploadInstallEventTask());
        c0cph.LIZIZ();
        if (sConfirmWelcomeType == EnumC1998207sC.NO_WELCOME) {
            this.mTrackSession = true;
            tryInit();
        }
        hotStartIntercept();
        if (!this.mJumped) {
            tryInit();
            if (!quickLaunch()) {
                tryShowShortCutDlg();
            }
        }
        C0CPH c0cph2 = new C0CPH();
        c0cph2.LIZ(C1591880rWk.LIZIZ.LJJIFFI());
        c0cph2.LIZIZ();
        C0CPH c0cph3 = new C0CPH();
        c0cph3.LIZ(new UploadSysStatusTask());
        c0cph3.LIZIZ();
        C1150504el.LIZ().LJI("cold_boot_splash_duration", true);
        C1150504el.LIZ().LIZLLL("cold_boot_splash_to_main", true);
    }

    public static void INVOKEVIRTUAL_com_ss_android_ugc_aweme_splash_SplashActivity_com_bytedance_analytics_lancet_StartActivityLancet_startActivity(SplashActivity splashActivity, Intent intent) throws Throwable {
        Intent intent2 = intent;
        Activity activity = splashActivity;
        C1701330uNH.LIZ(intent2, activity);
        C0WZX c0wzx = new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPm4b57d1Hx/XoQjhPsWL1ZSriVkyw==", null);
        C0WST c0wst = new C0WST();
        Object[] objArr = {intent2};
        C0WZW c0wzw = new C0WZW(false, "(Landroid/content/Intent;)V", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(11098, "com/ss/android/ugc/aweme/splash/SplashActivity", "startActivity", activity, objArr, "void", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(11098, "com/ss/android/ugc/aweme/splash/SplashActivity", "startActivity", null, objArr, activity, c0wzw, false);
            return;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null) {
            Object obj = objArr2[0];
            if (obj != null) {
                activity = (Activity) obj;
            }
            Object obj2 = objArr2[1];
            if (obj2 != null) {
                intent2 = (Intent) obj2;
            }
        }
        activity.startActivity(intent2);
        c0wst.LIZ(11098, "com/ss/android/ugc/aweme/splash/SplashActivity", "startActivity", null, objArr, activity, c0wzw, true);
    }

    public static void INVOKEVIRTUAL_com_ss_android_ugc_aweme_splash_SplashActivity_com_bytedance_router_monitor_page_PageLancet_startActivity(SplashActivity splashActivity, Intent intent) throws Throwable {
        RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(splashActivity, intent, "Context_startActivity_1");
        INVOKEVIRTUAL_com_ss_android_ugc_aweme_splash_SplashActivity_com_bytedance_analytics_lancet_StartActivityLancet_startActivity(splashActivity, intent);
    }
}
