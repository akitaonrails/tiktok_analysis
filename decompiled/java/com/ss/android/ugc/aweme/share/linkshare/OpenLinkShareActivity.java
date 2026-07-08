package com.ss.android.ugc.aweme.share.linkshare;

import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C1308910kAL;
import X.C13LP;
import X.C1697810uHb;
import X.C1701330uNH;
import X.C20684815ws;
import X.C2344009Gk;
import X.C299020Bno;
import X.C335910DEv;
import X.C786410Ut5;
import X.EnumC335920DEw;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.app.IAwemeApplicationService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IMainService;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.text.a0;
import ttpobfuscated.e3;

/* JADX INFO: loaded from: classes8.dex */
public final class OpenLinkShareActivity extends BaseActivity {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjYkKD02ZiHELIOSklJyQgICQ+LGEcOCAiBSY9IxYkKD02CSY4IDk6PDw=";

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onResume() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.share.linkshare.OpenLinkShareActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.share.linkshare.OpenLinkShareActivity", "onResume", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStart() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.share.linkshare.OpenLinkShareActivity", "onStart", true);
        super.onStart();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.share.linkshare.OpenLinkShareActivity", "onStart", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.share.linkshare.OpenLinkShareActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStop() {
        super.onStop();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            try {
                getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        try {
            getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
        }
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public final void onCreate(Bundle bundle) throws Throwable {
        List listLJJLIIIJILLIZJL;
        String str;
        String upperCase;
        String string;
        Bundle bundle2;
        Bundle extras;
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.share.linkshare.OpenLinkShareActivity", "onCreate", true);
        super.onCreate(bundle);
        Bundle extras2 = null;
        if (!((IAwemeApplicationService) ServiceManager.get().getService(IAwemeApplicationService.class)).isAppHot()) {
            Intent mainActivityIntent = ((IMainService) ServiceManager.get().getService(IMainService.class)).getMainActivityIntent(this);
            if (mainActivityIntent != null) {
                try {
                    extras = getIntent().getExtras();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (extras != null) {
                    string = extras.getString("com.tiktok.opensdk.share.extra.CLIENT_KEY");
                } else {
                    string = null;
                }
                try {
                    bundle2 = mainActivityIntent.getExtras();
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                }
                if (bundle2 == null) {
                    bundle2 = new Bundle();
                }
                C786410Ut5.LJJJI("launch_method", "link_share", bundle2);
                C786410Ut5.LJJJI("channel", string, bundle2);
                mainActivityIntent.replaceExtras(bundle2);
                if (string == null) {
                    string = "";
                }
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LJIIIIZZ("channel", string);
                c2344009Gk.LJIIIIZZ("launch_method", "link_share");
                c2344009Gk.LJIIIIZZ("sdk_name", "");
                c2344009Gk.LJFF("sdk_version", "");
                C20684815ws.LJIILLIIL("launch_log", c2344009Gk.LIZ);
            }
            LLLLLZL(this, mainActivityIntent);
        }
        Activity[] activityStack = ActivityStack.getActivityStack();
        ArrayList<Activity> arrayList = new ArrayList();
        for (Activity activity : activityStack) {
            if (activity instanceof OpenLinkShareMainActivity) {
                arrayList.add(activity);
            }
        }
        for (Activity activity2 : arrayList) {
            activity2.finish();
            C786410Ut5.ae(0, activity2, 0);
        }
        String action = getIntent().getAction();
        if (action != null && (listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(action, new String[]{e3.d}, 0, 6)) != null && (str = (String) C13LP.LJJLIIIJL(listLJJLIIIJILLIZJL)) != null && (upperCase = str.toUpperCase(Locale.ROOT)) != null) {
            Bundle bundle3 = new Bundle();
            C786410Ut5.LJJJI("com.tiktok.opensdk.share.extra.PROXY_INTENT_ACTION", upperCase, bundle3);
            try {
                extras2 = getIntent().getExtras();
            } catch (Exception e3) {
                TryCatchGuardChecker.doCheck(e3);
            }
            C786410Ut5.LJJIIJZLJL(bundle3, extras2);
            Intent intent = new Intent("com.tiktok.opensdk.share.PROXY_LINK_SHARE");
            intent.putExtras(bundle3);
            intent.setData(getIntent().getData());
            LLLLLZL(this, intent);
            finish();
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.share.linkshare.OpenLinkShareActivity", "onCreate", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i) {
        boolean z;
        super.setTheme(i);
        if (C299020Bno.LIZ() != 0) {
            boolean z2 = false;
            if (!C1697810uHb.LJIIJJI(Integer.valueOf(R.style.a9t), Integer.valueOf(R.style.a9u), Integer.valueOf(R.style.a9v), Integer.valueOf(R.style.a9s)).contains(Integer.valueOf(i))) {
                Integer numLIZ = C1308910kAL.LIZ(R.attr.g0c, this);
                if (numLIZ != null && numLIZ.intValue() == -1) {
                    z = true;
                } else {
                    z = false;
                }
                Integer numLIZ2 = C1308910kAL.LIZ(R.attr.g0d, this);
                if (numLIZ2 == null || numLIZ2.intValue() != 0) {
                    z2 = true;
                }
                if (z) {
                    getTheme().applyStyle(R.style.a9u, true);
                } else {
                    getTheme().applyStyle(R.style.a9t, true);
                }
                if (z2) {
                    getTheme().applyStyle(R.style.a9v, true);
                } else {
                    getTheme().applyStyle(R.style.a9s, true);
                }
            }
        }
        EnumC335920DEw enumC335920DEwLIZ = C335910DEv.LIZ();
        if (enumC335920DEwLIZ == EnumC335920DEw.V1) {
            getTheme().applyStyle(R.style.a9x, true);
        } else {
            if (enumC335920DEwLIZ != EnumC335920DEw.V2) {
                return;
            }
            getTheme().applyStyle(R.style.a9y, true);
        }
    }

    public static void LLLLLZL(OpenLinkShareActivity openLinkShareActivity, Intent intent) throws Throwable {
        Intent intent2 = intent;
        Activity activity = openLinkShareActivity;
        RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(activity, intent2, "Context_startActivity_1");
        C1701330uNH.LIZ(intent2, activity);
        C0WZX c0wzx = new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmgYo3Lkj63B1G8K9Sc6UyBtUvUyCdcBG/saJVsLPQaQrmh7wg=", null);
        C0WST c0wst = new C0WST();
        Object[] objArr = {intent2};
        C0WZW c0wzw = new C0WZW(false, "(Landroid/content/Intent;)V", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(11098, "com/ss/android/ugc/aweme/share/linkshare/OpenLinkShareActivity", "startActivity", activity, objArr, "void", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(11098, "com/ss/android/ugc/aweme/share/linkshare/OpenLinkShareActivity", "startActivity", null, objArr, activity, c0wzw, false);
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
        c0wst.LIZ(11098, "com/ss/android/ugc/aweme/share/linkshare/OpenLinkShareActivity", "startActivity", null, objArr, activity, c0wzw, true);
    }
}
