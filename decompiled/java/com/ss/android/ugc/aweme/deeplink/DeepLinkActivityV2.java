package com.ss.android.ugc.aweme.deeplink;

import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C10ZH;
import X.C13LP;
import X.C1617800sCY;
import X.C1697810uHb;
import X.C1701330uNH;
import X.C19252910Tv;
import X.C19262710Xp;
import X.C19263610Xy;
import X.C19263710Xz;
import X.C19264810Yk;
import X.C19266010Yw;
import X.C1936707iH;
import X.C1962707mT;
import X.C198H;
import X.C199Y;
import X.C20684815ws;
import X.C2344009Gk;
import X.C581900Ms0;
import X.C786410Ut5;
import X.C844470XAv;
import X.InterfaceC214902198i;
import X.InterfaceC214930199k;
import X.RunnableC19262910Xr;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Toast;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.scene.Scene;
import com.bytedance.scene.navigation.NavigationScene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.SAFFragmentRootScene;
import java.util.List;
import kotlin.jvm.internal.AFwS271S0000000_28;
import kotlin.jvm.internal.AwS547S0100000_3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes29.dex */
public class DeepLinkActivityV2 extends C199Y {
    public static final List<String> LLIZLLLIL = C1697810uHb.LJIIJJI("com.ss.android.ugc.aweme.im.sdk.chat.ui.singleactivity.ChatRootFragment", "com.ss.android.ugc.aweme.spark.SparkSAFFragment", "com.ss.android.ugc.aweme.poi.detail.container.slash.PoiDetailSlashFragment");
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiEpHELIOSLD8/ISsnZws2LTUAICE4CSY4IDk6PDwaew==";
    public final Class<? extends InterfaceC214902198i> LL = DeeplinkFragment.class;
    public final boolean LLILLJJLI = true;
    public final boolean LLILLL = ((Boolean) C1936707iH.LIZ.getValue()).booleanValue();
    public final float LLILZ = C1617800sCY.LIZ();
    public final C19264810Yk LLILZIL = new C19264810Yk();
    public Intent LLILZLL;
    public boolean LLIZ;

    @Override // X.C199Y
    public final boolean getCheckActivityLifecycle() {
        return false;
    }

    @Override // X.C199Y, X.InterfaceC214897198d
    public final boolean isDelegateFragmentManager() {
        return true;
    }

    @Override // X.C199Y, com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public void onResume() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.deeplink.DeepLinkActivityV2", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.deeplink.DeepLinkActivityV2", "onResume", false);
    }

    @Override // X.C199Y, com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public void onStart() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.deeplink.DeepLinkActivityV2", "onStart", true);
        super.onStart();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.deeplink.DeepLinkActivityV2", "onStart", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.deeplink.DeepLinkActivityV2", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // X.C199Y, com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onDestroy() throws Throwable {
        Activity activity;
        super.onDestroy();
        C10ZH.LIZIZ.LJJIJ();
        Intent intent = this.LLILZLL;
        if (intent != null) {
            RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(this, intent, "Context_startActivity_1");
            C1701330uNH.LIZ(intent, this);
            C0WZX c0wzx = new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KO6tZo/C1TxW+nisb6k2v/7Dl+B/OxO+IMR9HQ==", null);
            C0WST c0wst = new C0WST();
            Object[] objArr = {intent};
            C0WZW c0wzw = new C0WZW(false, "(Landroid/content/Intent;)V", c0wzx);
            C0WSU c0wsuLIZIZ = c0wst.LIZIZ(11098, "com/ss/android/ugc/aweme/deeplink/DeepLinkActivityV2", "startActivity", this, objArr, "void", c0wzw);
            if (c0wsuLIZIZ.LIZ) {
                c0wst.LIZ(11098, "com/ss/android/ugc/aweme/deeplink/DeepLinkActivityV2", "startActivity", null, objArr, this, c0wzw, false);
            } else {
                Object[] objArr2 = c0wsuLIZIZ.LIZJ;
                if (objArr2 != null) {
                    Object obj = objArr2[0];
                    activity = obj != null ? (Activity) obj : this;
                    Object obj2 = objArr2[1];
                    if (obj2 != null) {
                        intent = (Intent) obj2;
                    }
                } else {
                    activity = this;
                }
                activity.startActivity(intent);
                c0wst.LIZ(11098, "com/ss/android/ugc/aweme/deeplink/DeepLinkActivityV2", "startActivity", null, objArr, activity, c0wzw, true);
            }
            this.LLILZLL = null;
        }
    }

    @Override // X.C199Y
    public final float getAutoRecycleInvisibleScenesThreshold() {
        return this.LLILZ;
    }

    @Override // X.C199Y
    public final boolean getEnableNavigation() {
        return this.LLILLJJLI;
    }

    @Override // X.C199Y, X.InterfaceC214897198d
    public final boolean getEnableSAF() {
        return this.LLILLL;
    }

    @Override // X.C199Y
    public final Class<? extends InterfaceC214902198i> getRootFragmentClz() {
        return this.LL;
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19FO, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        int i;
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean zLIZ = C19262710Xp.LIZ();
        C581900Ms0.LIZ = jCurrentTimeMillis;
        if (zLIZ) {
            i = 2;
        } else {
            i = 1;
        }
        C581900Ms0.LIZIZ = i;
        if (!zLIZ) {
            C581900Ms0.LJI = true;
        }
        super.attachBaseContext(context);
    }

    @Override // X.C199Y, com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public void onCreate(Bundle bundle) {
        String string;
        String stringExtra;
        boolean zLJI = MethodIDManager.LJI(71997);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.deeplink.DeepLinkActivityV2", "onCreate", true);
        activityConfiguration(AFwS271S0000000_28.get$arr$(93));
        super.onCreate(bundle);
        getIntent().putExtra("is_route_activity", true);
        C19252910Tv.LIZIZ.LIZIZ(this);
        C19263710Xz c19263710Xz = C19263710Xz.LIZ;
        Intent intent = getIntent();
        c19263710Xz.getClass();
        C19263710Xz.LIZ(intent);
        Uri data = getIntent().getData();
        if (data == null || (string = data.toString()) == null) {
            string = "";
        }
        RunnableC19262910Xr runnableC19262910Xr = new RunnableC19262910Xr(this, C19263710Xz.LJIILL, C19263710Xz.LJIILJJIL, string);
        if (C19266010Yw.LIZ()) {
            C20684815ws.LJFF().execute(runnableC19262910Xr);
        } else {
            runnableC19262910Xr.run();
        }
        C19263610Xy c19263610Xy = new C19263610Xy();
        Intent intent2 = getIntent();
        C19264810Yk c19264810Yk = this.LLILZIL;
        try {
            stringExtra = getIntent().getStringExtra("saf_scene");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            stringExtra = null;
        }
        c19263610Xy.LJI(this, intent2, c19264810Yk, new C1962707mT(false, null, stringExtra, null, null, null, null, new AwS547S0100000_3(this, 19), 123));
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.deeplink.DeepLinkActivityV2", "onCreate", false);
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    @Override // X.C199Y, X.ActivityC21503719Dn, androidx.activity.ComponentActivity, android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        String stringExtra = null;
        try {
            String stringExtra2 = intent.getStringExtra("inner_from");
            if (stringExtra2 != null) {
                int iHashCode = stringExtra2.hashCode();
                if (iHashCode != -414536821) {
                    if (iHashCode != -274828254) {
                        if (iHashCode == 929166351 && stringExtra2.equals("require_login")) {
                            C19263710Xz.LJ("LoginNode");
                            C10ZH.LIZIZ.LJLILLLLZI("", "");
                            return;
                        }
                        return;
                    }
                    if (stringExtra2.equals("switch_account")) {
                        C19263710Xz.LJ("MultiAccountNode");
                        C10ZH.LIZIZ.LJLILLLLZI("", "");
                        return;
                    }
                    return;
                }
                if (stringExtra2.equals("new_user_journey")) {
                    C19263710Xz.LJ("NewUserJourneyNode");
                    C10ZH.LIZIZ.LJLILLLLZI("", "");
                    return;
                }
                return;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (!this.LLIZ) {
            finish();
            this.LLILZLL = intent;
            return;
        }
        C10ZH.LIZIZ.LJJIJ();
        C19263610Xy c19263610Xy = new C19263610Xy();
        C19264810Yk c19264810Yk = this.LLILZIL;
        try {
            stringExtra = intent.getStringExtra("saf_scene");
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        c19263610Xy.LJI(this, intent, c19264810Yk, new C1962707mT(false, null, stringExtra, null, null, null, null, null, 251));
    }

    @Override // X.C199Y, X.InterfaceC214897198d
    public final void beforeNavigating(Scene scene, Scene scene2) throws Exception {
        Bundle bundle;
        Scene scene3;
        NavigationScene navigationScene;
        super.beforeNavigating(scene, scene2);
        this.LLIZ = true;
        getWindow().clearFlags(1024);
        C198H rootSAFSceneWrapper = getRootSAFSceneWrapper();
        if (rootSAFSceneWrapper != null && (scene3 = rootSAFSceneWrapper.getScene()) != null && (navigationScene = getNavigationScene()) != null) {
            navigationScene.LLLIIIIL(scene3, new InterfaceC214930199k() { // from class: X.10YQ
                @Override // X.InterfaceC214930199k
                public final void LLJJI(Scene scene4, Scene scene5, boolean z) {
                    NavigationScene navigationScene2;
                    Scene scene6;
                    NavigationScene navigationScene3;
                    C198H rootSAFSceneWrapper2 = this.LL.getRootSAFSceneWrapper();
                    if (rootSAFSceneWrapper2 != null && (scene6 = rootSAFSceneWrapper2.getScene()) != null && (navigationScene3 = this.LL.getNavigationScene()) != null) {
                        navigationScene3.remove(scene6);
                    }
                    if (((Boolean) C1936407iE.LIZ.getValue()).booleanValue() && (navigationScene2 = this.LL.getNavigationScene()) != null) {
                        navigationScene2.LLJIJIL = null;
                    }
                    this.LL.rootSAFSceneWrapper = null;
                }
            });
        }
        String string = null;
        if ((scene2 instanceof SAFFragmentRootScene) && scene2 != null && (bundle = scene2.mArguments) != null) {
            string = bundle.getString("fragmentClass");
        }
        C844470XAv.LIZ.getClass();
        if (Intrinsics.LJFF(C844470XAv.LJIILL, "local_test")) {
            C786410Ut5.re(Toast.makeText(this, "deeplink enter saf", 0));
            if (!C13LP.LJJJJ(string, LLIZLLLIL)) {
                throw new Exception("saf fragment not in deeplink white list!(Only show in LocalTest, please contact daiyibin or zhaoxuan.li)");
            }
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("type", "deeplink_saf");
        c2344009Gk.LJIIIIZZ("sub_type", string);
        C20684815ws.LJIILLIIL("intention_detection_flag", c2344009Gk.LIZ);
    }
}
