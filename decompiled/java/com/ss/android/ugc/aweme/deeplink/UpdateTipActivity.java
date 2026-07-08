package com.ss.android.ugc.aweme.deeplink;

import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C1308910kAL;
import X.C1697810uHb;
import X.C1701330uNH;
import X.C20684815ws;
import X.C299020Bno;
import X.C335910DEv;
import X.C384050F3z;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C786410Ut5;
import X.C814420VxA;
import X.C844470XAv;
import X.EnumC335920DEw;
import Y.ACListenerS138S0100000_3;
import Y.ACListenerS141S0100000_6;
import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IMainService;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;

/* JADX INFO: loaded from: classes7.dex */
public class UpdateTipActivity extends BaseActivity {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiHELIOSEpLD8/ISsnZxojLCQ4LBs6OAQvPSYlITE1";
    public String LL = "";
    public UpdateTipsArgs LLILLJJLI;

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onResume() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.deeplink.UpdateTipActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.deeplink.UpdateTipActivity", "onResume", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStart() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.deeplink.UpdateTipActivity", "onStart", true);
        super.onStart();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.deeplink.UpdateTipActivity", "onStart", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.deeplink.UpdateTipActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final void LLLLZI() {
        Intent intent = new Intent(this, ((IMainService) ServiceManager.get().getService(IMainService.class)).getMainActivityClass());
        intent.addFlags(131072);
        LLLLLZL(this, intent);
        HashMap map = new HashMap();
        map.put("schema_url", this.LL);
        map.put("click_position", "back");
        C20684815ws.LJIILLIIL("schema_update_toast_click", map);
        finish();
    }

    public final void LLLLZIL() {
        try {
            if (getIntent().getExtras() != null) {
                String versionRequire = this.LLILLJJLI.getVersionRequire();
                if (TextUtils.isEmpty(versionRequire)) {
                    return;
                }
                ((TextView) findViewById(R.id.fi5)).setText(C786410Ut5.j4(getResources().getString(2131846682), new Object[]{versionRequire}));
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public final void LLLLZLL() {
        try {
            if (getIntent().getExtras() != null) {
                this.LL = this.LLILLJJLI.getUrlToGo();
                C844470XAv.LIZ.getClass();
                if (!TextUtils.equals(C844470XAv.LJIILL, "local_test") || this.LL.isEmpty()) {
                    return;
                }
                TextView textView = (TextView) findViewById(R.id.fi4);
                textView.setText(this.LL);
                C786410Ut5.LLIL(textView, 0);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
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

    @Override // X.ActivityC21503719Dn, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        LLLLZI();
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public final void onCreate(Bundle bundle) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.deeplink.UpdateTipActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView(R.layout.ki);
        this.LLILLJJLI = UpdateTipsArgs.getOrNew(this);
        View viewFindViewById = findViewById(R.id.fi6);
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_chevron_left_offset_ltr;
        viewFindViewById.setBackground(c419910GdJ.LIZ(this));
        View viewFindViewById2 = findViewById(R.id.fi3);
        C786410Ut5.I7(new ACListenerS141S0100000_6(this, 138), viewFindViewById);
        View viewFindViewById3 = findViewById(R.id.pcw);
        C419910GdJ c419910GdJ2 = new C419910GdJ();
        c419910GdJ2.LIZ = R.raw.icon_exclamation_mark;
        c419910GdJ2.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48));
        c419910GdJ2.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48));
        c419910GdJ2.LJ = Integer.valueOf(R.attr.a1p);
        TuxIconDrawable tuxIconDrawableLIZ = c419910GdJ2.LIZ(this);
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.c7);
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(50));
        c384050F3z.LJII = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(72));
        c384050F3z.LJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(72));
        viewFindViewById3.setBackground(new LayerDrawable(new Drawable[]{tuxIconDrawableLIZ, c384050F3z.LIZ(this)}));
        C844470XAv.LIZ.getClass();
        if (TextUtils.equals(C844470XAv.LJIILL, "local_test")) {
            C786410Ut5.LJLLLLLL(4, viewFindViewById2);
        } else {
            C786410Ut5.I7(new ACListenerS138S0100000_3(this, 18), viewFindViewById2);
        }
        LLLLZIL();
        LLLLZLL();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.deeplink.UpdateTipActivity", "onCreate", false);
    }

    @Override // X.ActivityC21503719Dn, androidx.activity.ComponentActivity, android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
        LLLLZIL();
        LLLLZLL();
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

    public static void LLLLLZL(UpdateTipActivity updateTipActivity, Intent intent) {
        Intent intent2 = intent;
        Activity activity = updateTipActivity;
        RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(activity, intent2, "Context_startActivity_1");
        C1701330uNH.LIZ(intent2, activity);
        C0WZX c0wzx = new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KO6tZo/C1TxW+mm5brgOs8TBpsJoJgyhAScT", null);
        C0WST c0wst = new C0WST();
        Object[] objArr = {intent2};
        C0WZW c0wzw = new C0WZW(false, "(Landroid/content/Intent;)V", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(11098, "com/ss/android/ugc/aweme/deeplink/UpdateTipActivity", "startActivity", activity, objArr, "void", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(11098, "com/ss/android/ugc/aweme/deeplink/UpdateTipActivity", "startActivity", null, objArr, activity, c0wzw, false);
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
        c0wst.LIZ(11098, "com/ss/android/ugc/aweme/deeplink/UpdateTipActivity", "startActivity", null, objArr, activity, c0wzw, true);
    }
}
