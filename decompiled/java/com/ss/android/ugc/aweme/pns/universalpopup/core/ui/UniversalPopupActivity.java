package com.ss.android.ugc.aweme.pns.universalpopup.core.ui;

import X.C01GW;
import X.C08Q1;
import X.C0NRE;
import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C1389600mGU;
import X.C1701330uNH;
import X.C1914170zuZ;
import X.C19GS;
import X.C2173931A6d;
import X.C452501pT;
import X.C786410Ut5;
import X.C960203pA;
import X.InterfaceC1914220zue;
import Y.AObserverS230S0100000_28;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.pns.universalpopup.core.model.UniversalPopup;
import com.ss.android.ugc.aweme.pns.universalpopup.core.model.UniversalPopupResponse;
import com.tiktok.ef.i18n.service.manager.I18nServiceApi;
import com.tiktok.ef.i18nmanagerapi.service.i18n.I18nManagerServiceApi;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import kotlin.Pair;
import kotlin.jvm.internal.AwS572S0100000_28;

/* JADX INFO: loaded from: classes29.dex */
public final class UniversalPopupActivity extends C19GS {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjUiOmEmJiw6LD0gKSHELIOSk8Jj8mOGsvJj02ZjAlZxo9ITMpOzwyJBUjOTojCSY4IDk6PDw=";
    public final Stack<Pair<UniversalPopup, UniversalPopupUI>> LL = new Stack<>();
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new AwS572S0100000_28(this, 504));

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
    }

    @Override // X.C19EG, X.C19FO, android.app.Activity
    public final void onResume() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.pns.universalpopup.core.ui.UniversalPopupActivity", "onResume", true);
        super.onResume();
        if (LLLLZLL().LLJILJILJ) {
            LLLLZLL().LLJILJILJ = false;
            LLLLZLL().vQ2();
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.pns.universalpopup.core.ui.UniversalPopupActivity", "onResume", false);
    }

    @Override // X.C19GS, X.C19EG, android.app.Activity
    public final void onStart() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.pns.universalpopup.core.ui.UniversalPopupActivity", "onStart", true);
        super.onStart();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.pns.universalpopup.core.ui.UniversalPopupActivity", "onStart", false);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.pns.universalpopup.core.ui.UniversalPopupActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final InterfaceC1914220zue LLLLZI() {
        Bundle extras;
        C1914170zuZ.LIZ.getClass();
        Map<String, InterfaceC1914220zue> map = C1914170zuZ.LJIILJJIL;
        try {
            extras = getIntent().getExtras();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        int i = extras != null ? extras.getInt("universal_popup_activity_id") : 0;
        return (InterfaceC1914220zue) ((LinkedHashMap) map).get(String.valueOf(i));
    }

    public final UniversalPopupViewModel LLLLZLL() {
        return (UniversalPopupViewModel) this.LLILLJJLI.getValue();
    }

    public final UniversalPopupResponse LLLLZIL() {
        Bundle extras;
        try {
            extras = getIntent().getExtras();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        Serializable serializable = extras != null ? extras.getSerializable("universal_popup_response") : null;
        if (serializable instanceof UniversalPopupResponse) {
            return (UniversalPopupResponse) serializable;
        }
        return null;
    }

    @Override // android.app.Activity
    public final void finish() {
        super.finish();
        try {
            C1389600mGU.LIZIZ(this);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        overridePendingTransition(0, 0);
    }

    @Override // X.C19GS, X.C19EG, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        InterfaceC1914220zue interfaceC1914220zueLLLLZI = LLLLZI();
        if (interfaceC1914220zueLLLLZI != null) {
            interfaceC1914220zueLLLLZI.LIZLLL();
        }
    }

    @Override // X.C19GS, X.C19EG, android.app.Activity
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

    @Override // X.C19GS, X.C19FO, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        I18nManagerServiceApi i18nManagerServiceApiLIZ;
        I18nServiceApi i18nServiceApi = (I18nServiceApi) PluggableExtentionKt.pluggableSpi(I18nServiceApi.class);
        if (i18nServiceApi != null && (i18nManagerServiceApiLIZ = i18nServiceApi.LIZ()) != null) {
            context = i18nManagerServiceApiLIZ.LIZJ(context);
        }
        super.attachBaseContext(context);
    }

    @Override // X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public final void onCreate(Bundle bundle) {
        List<UniversalPopup> list;
        List<UniversalPopup> list2;
        Context contextN3;
        SettingsManager.LIZLLL().getClass();
        if (SettingsManager.LIZ("enable_universal_popup_dark_mode", false) && (C960203pA.LIZIZ(this) || (C08Q1.LIZJ() && ((getResources().getConfiguration().uiMode & 48) == 32 || ((contextN3 = C786410Ut5.N3(this)) != null && contextN3 != this && (contextN3.getResources().getConfiguration().uiMode & 48) == 32))))) {
            setTheme(R.style.y0);
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.pns.universalpopup.core.ui.UniversalPopupActivity", "onCreate", true);
        C2173931A6d.LIZ(this);
        super.onCreate(bundle);
        setContentView(R.layout.i60);
        C1914170zuZ.LIZ.getClass();
        C0NRE c0nre = (C0NRE) C1914170zuZ.LJIIJJI.getValue();
        UniversalPopupResponse universalPopupResponseLLLLZIL = LLLLZIL();
        if (universalPopupResponseLLLLZIL != null && (list2 = universalPopupResponseLLLLZIL.popups) != null) {
            ListProtector.get(list2, 0);
        }
        UniversalPopupResponse universalPopupResponseLLLLZIL2 = LLLLZIL();
        if (universalPopupResponseLLLLZIL2 != null && (list = universalPopupResponseLLLLZIL2.popups) != null) {
            ListProtector.get(list, 0);
        }
        c0nre.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("activity", "UniversalPopupActivity");
        c0nre.LIZ("pns_popup_activity_create", linkedHashMap);
        LLLLZLL().LLILZIL.observe(this, new AObserverS230S0100000_28(this, 40));
        LLLLZLL().LLIZ.observe(this, new AObserverS230S0100000_28(this, 41));
        C1914170zuZ.LJIILIIL.observe(this, new AObserverS230S0100000_28(this, 42));
        C1914170zuZ.LJIIL.observe(this, new AObserverS230S0100000_28(this, 43));
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.pns.universalpopup.core.ui.UniversalPopupActivity", "onCreate", false);
    }

    public static void LLLLLZL(UniversalPopupActivity universalPopupActivity, Intent intent) {
        Intent intent2 = intent;
        Activity activity = universalPopupActivity;
        RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(activity, intent2, "Context_startActivity_1");
        C1701330uNH.LIZ(intent2, activity);
        C0WZX c0wzx = new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPqmcNHb0jukrhVR62OaE7NxWxhDuwxMTObMiwHMCcrEj/xcTM5V5z12k047zb2L1aI=", null);
        C0WST c0wst = new C0WST();
        Object[] objArr = {intent2};
        C0WZW c0wzw = new C0WZW(false, "(Landroid/content/Intent;)V", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(11098, "com/ss/android/ugc/aweme/pns/universalpopup/core/ui/UniversalPopupActivity", "startActivity", activity, objArr, "void", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(11098, "com/ss/android/ugc/aweme/pns/universalpopup/core/ui/UniversalPopupActivity", "startActivity", null, objArr, activity, c0wzw, false);
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
        c0wst.LIZ(11098, "com/ss/android/ugc/aweme/pns/universalpopup/core/ui/UniversalPopupActivity", "startActivity", null, objArr, activity, c0wzw, true);
    }
}
