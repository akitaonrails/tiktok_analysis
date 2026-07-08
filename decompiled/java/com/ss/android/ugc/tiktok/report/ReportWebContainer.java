package com.ss.android.ugc.tiktok.report;

import X.AbstractC1539070q9Z;
import X.AnimationAnimationListenerC1401870maH;
import X.C06MM;
import X.C0IKF;
import X.C0TVI;
import X.C100C;
import X.C12ES;
import X.C1308910kAL;
import X.C1381180m2u;
import X.C1381320m38;
import X.C1387800mDa;
import X.C1402230mar;
import X.C1402400mb8;
import X.C14K9;
import X.C1537900q7g;
import X.C1541950qED;
import X.C1548820qPI;
import X.C1697810uHb;
import X.C19738212Km;
import X.C19738412Ko;
import X.C20244914Jj;
import X.C2097608Jq;
import X.C299020Bno;
import X.C335910DEv;
import X.C465320IMo;
import X.C786410Ut5;
import X.EnumC335920DEw;
import X.InterfaceC1381130m2p;
import X.InterfaceC1381790m3t;
import X.InterfaceC1387770mDX;
import X.InterfaceC1387810mDb;
import X.InterfaceC1387820mDc;
import X.InterfaceC1432560nNm;
import X.InterfaceC1519030pdF;
import X.InterfaceC20190413zK;
import X.SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
import Y.ACListenerS155S0100000_21;
import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.autofill.AutofillManager;
import androidx.lifecycle.LifecycleObserver;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS259S0000000_21;
import kotlin.jvm.internal.AwS670S0100000_21;

/* JADX INFO: loaded from: classes22.dex */
public final class ReportWebContainer extends BaseActivity implements InterfaceC1432560nNm {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZjElIjs8I2HELIOSs+LD88OjFiGyojJzc4HioxCyoiPS46JiA+";
    public SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB LL;
    public int LLILLJJLI;
    public long LLILZ;
    public boolean LLILZIL;
    public Animation LLILZLL;
    public int LLIZ;
    public ViewGroup LLIZLLLIL;
    public View LLJ;
    public SparkContext LLJI;
    public InterfaceC1387820mDc LLJIJIL;
    public String LLJILJIL;
    public InterfaceC1381130m2p LLJILJILJ;
    public InterfaceC1381790m3t LLJILLL;
    public Set<String> LLJJ;
    public InterfaceC1387770mDX LLJJI;
    public String LLILLL = "";
    public final C1402230mar LLJJIII = new C1402230mar(this, 0);

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onResume() {
        ActivityAgent.onTrace("com.ss.android.ugc.tiktok.report.ReportWebContainer", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.tiktok.report.ReportWebContainer", "onResume", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStart() {
        ActivityAgent.onTrace("com.ss.android.ugc.tiktok.report.ReportWebContainer", "onStart", true);
        super.onStart();
        ActivityAgent.onTrace("com.ss.android.ugc.tiktok.report.ReportWebContainer", "onStart", false);
    }

    public final int LLLLZIL() throws Exception {
        if (Build.VERSION.SDK_INT < 30) {
            return C12ES.LJIIIIZZ(this);
        }
        C0IKF.LIZ.getClass();
        C465320IMo.LIZ();
        C19738412Ko c19738412KoLIZ = C19738212Km.LIZ(this);
        C20244914Jj c20244914JjLIZIZ = c19738412KoLIZ.LIZIZ.LIZIZ(WindowInsets.Type.systemBars());
        return (c19738412KoLIZ.LIZ().height() - c20244914JjLIZIZ.LIZIZ) - c20244914JjLIZIZ.LIZLLL;
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity
    public final void finish() {
        InterfaceC1387770mDX interfaceC1387770mDX = this.LLJJI;
        if (interfaceC1387770mDX != null) {
            interfaceC1387770mDX.LIZJ(this);
        }
        if (this.LLIZ <= 2) {
            Animation animation = this.LLILZLL;
            if (animation != null) {
                animation.cancel();
            }
            Animation animationLoadAnimation = AnimationUtils.loadAnimation(this, R.anim.ke);
            this.LLILZLL = animationLoadAnimation;
            if (animationLoadAnimation != null) {
                animationLoadAnimation.setAnimationListener(new AnimationAnimationListenerC1401870maH(this, 1));
                ViewGroup viewGroup = this.LLIZLLLIL;
                if (viewGroup != null) {
                    viewGroup.startAnimation(this.LLILZLL);
                }
                this.LLIZ = 3;
                return;
            }
            this.LLIZ = 4;
            if (isFinishing()) {
                return;
            }
            super.finish();
            C786410Ut5.le(this);
        }
    }

    public final void LLLLZI() {
        Bundle extras;
        Bundle extras2 = null;
        try {
            extras2 = getIntent().getExtras();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        int i = extras2 != null ? extras2.getInt("half_screen_height") : 0;
        try {
            extras = getIntent().getExtras();
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        double d = extras != null ? extras.getDouble("ratio") : 0.0d;
        Integer numValueOf = Integer.valueOf(i);
        this.LLILLJJLI = numValueOf.intValue() != 0 ? numValueOf.intValue() : (int) (d * ((double) LLLLZIL()));
    }

    public final void LLLLZLL() throws Exception {
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2;
        int iLLLLZIL = LLLLZIL();
        if (this.LLILLJJLI > iLLLLZIL) {
            ViewGroup viewGroup = this.LLIZLLLIL;
            if (viewGroup == null || (layoutParams2 = viewGroup.getLayoutParams()) == null) {
                return;
            }
            layoutParams2.height = iLLLLZIL;
            return;
        }
        ViewGroup viewGroup2 = this.LLIZLLLIL;
        if (viewGroup2 == null || (layoutParams = viewGroup2.getLayoutParams()) == null) {
            return;
        }
        layoutParams.height = this.LLILLJJLI;
    }

    @Override // X.ActivityC21503719Dn, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        super.onBackPressed();
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = this.LL;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB == null || !sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LJJIII()) {
            finish();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onDestroy() {
        String objectID;
        LifecycleObserver lifecycleObserverLJIILIIL;
        AutofillManager autofillManager;
        String reportType;
        String objectID2;
        String strLJ;
        Map<String, String> commonParams;
        long jCurrentTimeMillis = System.currentTimeMillis();
        C100C c100c = C100C.LIZ;
        InterfaceC1519030pdF interfaceC1519030pdFLIZJ = c100c.LIZJ();
        Pair[] pairArr = new Pair[5];
        pairArr[0] = new Pair("enter_time", String.valueOf(this.LLILZ));
        pairArr[1] = new Pair("exit_time", String.valueOf(jCurrentTimeMillis));
        pairArr[2] = new Pair("duration", String.valueOf(jCurrentTimeMillis - this.LLILZ));
        InterfaceC1381130m2p interfaceC1381130m2p = this.LLJILJILJ;
        String str = (interfaceC1381130m2p == null || (commonParams = interfaceC1381130m2p.getCommonParams()) == null) ? null : commonParams.get("enter_from");
        if (str == null) {
            str = "";
        }
        pairArr[3] = new Pair("enter_from", str);
        InterfaceC1381130m2p interfaceC1381130m2p2 = this.LLJILJILJ;
        if (interfaceC1381130m2p2 == null || (objectID = interfaceC1381130m2p2.getObjectID()) == null) {
            objectID = "";
        }
        pairArr[4] = new Pair("object_id", objectID);
        interfaceC1519030pdFLIZJ.LIZ("tns_report_webview", C2097608Jq.LJIIIIZZ(pairArr));
        if (!this.LLILZIL) {
            InterfaceC1519030pdF interfaceC1519030pdFLIZJ2 = c100c.LIZJ();
            Pair[] pairArr2 = new Pair[5];
            InterfaceC1381130m2p interfaceC1381130m2p3 = this.LLJILJILJ;
            if (interfaceC1381130m2p3 == null || (reportType = interfaceC1381130m2p3.getReportType()) == null) {
                reportType = "";
            }
            pairArr2[0] = new Pair("report_type", reportType);
            InterfaceC1381130m2p interfaceC1381130m2p4 = this.LLJILJILJ;
            if (interfaceC1381130m2p4 == null || (objectID2 = interfaceC1381130m2p4.getObjectID()) == null) {
                objectID2 = "";
            }
            pairArr2[1] = new Pair("object_id", objectID2);
            InterfaceC1381130m2p interfaceC1381130m2p5 = this.LLJILJILJ;
            if (interfaceC1381130m2p5 == null || (strLJ = interfaceC1381130m2p5.LJ()) == null) {
                strLJ = "";
            }
            pairArr2[2] = new Pair("owner_id", strLJ);
            pairArr2[3] = new Pair("duration", String.valueOf(System.currentTimeMillis() - this.LLILZ));
            pairArr2[4] = new Pair("url_path", this.LLILLL);
            interfaceC1519030pdFLIZJ2.LIZ("tns_report_container_drop", C2097608Jq.LJIIIIZZ(pairArr2));
        }
        if (Build.VERSION.SDK_INT >= 26 && (autofillManager = (AutofillManager) getSystemService(AutofillManager.class)) != null) {
            autofillManager.cancel();
        }
        Set<String> set = this.LLJJ;
        if (set != null) {
            C1402230mar c1402230mar = this.LLJJIII;
            Iterator<T> it2 = set.iterator();
            while (it2.hasNext()) {
                C1548820qPI.LJIIIIZZ((String) it2.next(), c1402230mar);
            }
        }
        InterfaceC1381130m2p interfaceC1381130m2p6 = this.LLJILJILJ;
        if (interfaceC1381130m2p6 != null && (lifecycleObserverLJIILIIL = interfaceC1381130m2p6.LJIILIIL()) != null) {
            getLifecycle().removeObserver(lifecycleObserverLJIILIIL);
        }
        if (isFinishing()) {
            String str2 = this.LLJILJIL;
            InterfaceC1381130m2p interfaceC1381130m2pRemove = C1387800mDa.LIZLLL.remove(str2 != null ? str2 : "");
            if (interfaceC1381130m2pRemove != null) {
                interfaceC1381130m2pRemove.LJI(null);
                interfaceC1381130m2pRemove.LIZJ(null);
                interfaceC1381130m2pRemove.LIZLLL();
            }
        }
        super.onDestroy();
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = this.LL;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null) {
            boolean z = SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LLLILZJ;
            sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LJJ(true);
        }
        this.LL = null;
        this.LLJJI = null;
        this.LLJILLL = null;
        this.LLJILJILJ = null;
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

    @Override // X.InterfaceC1432560nNm
    public final void KF(InterfaceC1387820mDc interfaceC1387820mDc) {
        this.LLJIJIL = interfaceC1387820mDc;
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) throws Exception {
        super.onConfigurationChanged(configuration);
        LLLLZI();
        LLLLZLL();
        InterfaceC1387770mDX interfaceC1387770mDX = this.LLJJI;
        if (interfaceC1387770mDX != null) {
            interfaceC1387770mDX.LIZLLL(this);
        }
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public final void onCreate(Bundle bundle) throws Exception {
        String stringExtra;
        InterfaceC1381790m3t interfaceC1381790m3tLIZIZ;
        Set<String> setLJIILJJIL;
        InterfaceC1387810mDb interfaceC1387810mDb;
        List listLIZ;
        ActivityAgent.onTrace("com.ss.android.ugc.tiktok.report.ReportWebContainer", "onCreate", true);
        activityConfiguration(AFwS259S0000000_21.get$arr$(310));
        super.onCreate(bundle);
        InterfaceC1387770mDX interfaceC1387770mDXInvoke = null;
        try {
            stringExtra = getIntent().getStringExtra("url");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            stringExtra = null;
        }
        String str = "";
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.LLILLL = stringExtra;
        try {
            String stringExtra2 = getIntent().getStringExtra("session_id");
            if (stringExtra2 != null) {
                str = stringExtra2;
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        this.LLJILJIL = str;
        InterfaceC1381130m2p c1381180m2u = (InterfaceC1381130m2p) ((LinkedHashMap) C1387800mDa.LIZLLL).get(str);
        if (c1381180m2u == null) {
            c1381180m2u = new C1381180m2u();
        }
        this.LLJILJILJ = c1381180m2u;
        LifecycleObserver lifecycleObserverLJIILIIL = c1381180m2u.LJIILIIL();
        if (lifecycleObserverLJIILIIL != null) {
            getLifecycle().addObserver(lifecycleObserverLJIILIIL);
        }
        InterfaceC1381130m2p interfaceC1381130m2p = this.LLJILJILJ;
        if (interfaceC1381130m2p != null) {
            interfaceC1381790m3tLIZIZ = interfaceC1381130m2p.LIZIZ();
        } else {
            interfaceC1381790m3tLIZIZ = null;
        }
        this.LLJILLL = interfaceC1381790m3tLIZIZ;
        InterfaceC1381130m2p interfaceC1381130m2p2 = this.LLJILJILJ;
        if (interfaceC1381130m2p2 != null) {
            setLJIILJJIL = interfaceC1381130m2p2.LJIILJJIL();
        } else {
            setLJIILJJIL = null;
        }
        this.LLJJ = setLJIILJJIL;
        if (setLJIILJJIL != null) {
            C1402230mar c1402230mar = this.LLJJIII;
            Iterator<T> it2 = setLJIILJJIL.iterator();
            while (it2.hasNext()) {
                C1548820qPI.LIZLLL((String) it2.next(), c1402230mar);
            }
        }
        InterfaceC1381130m2p interfaceC1381130m2p3 = this.LLJILJILJ;
        if (interfaceC1381130m2p3 != null && (interfaceC1387810mDb = C1387800mDa.LIZJ) != null && (listLIZ = interfaceC1387810mDb.LIZ()) != null) {
            Iterator it3 = listLIZ.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                C1381320m38 c1381320m38 = (C1381320m38) it3.next();
                if (c1381320m38.LIZ.invoke(interfaceC1381130m2p3).booleanValue()) {
                    interfaceC1387770mDXInvoke = c1381320m38.LIZIZ.invoke(interfaceC1381130m2p3);
                    break;
                }
            }
        }
        this.LLJJI = interfaceC1387770mDXInvoke;
        if (interfaceC1387770mDXInvoke != null) {
            interfaceC1387770mDXInvoke.LIZIZ(getLifecycle());
        }
        LLLLZI();
        this.LLILZ = System.currentTimeMillis();
        setContentView(R.layout.ely);
        C786410Ut5.le(this);
        this.LLIZLLLIL = (ViewGroup) findViewById(R.id.f_k);
        this.LLJ = findViewById(R.id.fy5);
        LLLLZLL();
        ViewGroup viewGroup = this.LLIZLLLIL;
        if (viewGroup != null) {
            C786410Ut5.bd(C12ES.LJIIIIZZ(this), viewGroup);
        }
        View view = this.LLJ;
        if (view != null) {
            C786410Ut5.I7(new ACListenerS155S0100000_21(this, 284), view);
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 35) {
            C14K9.LJIJJ(findViewById(R.id.trr), new C0TVI() { // from class: X.0xbW
                @Override // X.C0TVI
                public final C20246014Ju onApplyWindowInsets(View view2, C20246014Ju c20246014Ju) {
                    C20244914Jj c20244914JjLIZ = c20246014Ju.LIZ(135);
                    view2.setPadding(c20244914JjLIZ.LIZ, 0, c20244914JjLIZ.LIZJ, c20244914JjLIZ.LIZLLL);
                    C20246414Jy c20246414Jy = new C20246414Jy(c20246014Ju);
                    c20246414Jy.LIZ.LIZJ(135, C20244914Jj.LJ);
                    return c20246414Jy.LIZ();
                }
            });
        } else {
            C14K9.LJIJJ(findViewById(R.id.trr), new C0TVI() { // from class: X.0xbX
                @Override // X.C0TVI
                public final C20246014Ju onApplyWindowInsets(View view2, C20246014Ju c20246014Ju) {
                    C20244914Jj c20244914JjLIZ = c20246014Ju.LIZ(135);
                    view2.setPadding(c20244914JjLIZ.LIZ, 0, c20244914JjLIZ.LIZJ, c20244914JjLIZ.LIZLLL);
                    C20246414Jy c20246414Jy = new C20246414Jy(c20246014Ju);
                    c20246414Jy.LIZ.LIZJ(135, C20244914Jj.LJ);
                    return c20246414Jy.LIZ();
                }
            });
        }
        SparkContext sparkContext = new SparkContext();
        sparkContext.LJJLIIJ(this.LLILLL);
        sparkContext.LJJJJZI(new C1402400mb8(this, 1));
        sparkContext.sendEventListener = new AwS670S0100000_21(this, 24);
        this.LLJI = sparkContext;
        ViewGroup viewGroup2 = this.LLIZLLLIL;
        Activity activityLIZ = C06MM.LIZ(this);
        if (activityLIZ != null) {
            C1537900q7g c1537900q7g = C1541950qED.LIZJ;
            SparkContext sparkContext2 = this.LLJI;
            if (sparkContext2 != null) {
                c1537900q7g.getClass();
                SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZ = new C1541950qED(activityLIZ, sparkContext2).LIZ(false);
                C786410Ut5.C6(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZ, new ViewGroup.LayoutParams(-1, -1));
                if (viewGroup2 != null) {
                    viewGroup2.addView(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZ);
                }
                sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZ.LJIIIIZZ();
                this.LL = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZ;
            }
        }
        if (i >= 26) {
            getWindow().getDecorView().setImportantForAutofill(8);
        }
        ActivityAgent.onTrace("com.ss.android.ugc.tiktok.report.ReportWebContainer", "onCreate", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.tiktok.report.ReportWebContainer", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
        if (z && this.LLIZ <= 0) {
            Animation animation = this.LLILZLL;
            if (animation != null) {
                animation.cancel();
            }
            ViewGroup viewGroup = this.LLIZLLLIL;
            if (viewGroup != null) {
                C786410Ut5.bd(0.0f, viewGroup);
            }
            try {
                Animation animationLoadAnimation = AnimationUtils.loadAnimation(this, R.anim.kd);
                this.LLILZLL = animationLoadAnimation;
                if (animationLoadAnimation != null) {
                    animationLoadAnimation.setAnimationListener(new AnimationAnimationListenerC1401870maH(this, 2));
                    ViewGroup viewGroup2 = this.LLIZLLLIL;
                    if (viewGroup2 != null) {
                        viewGroup2.startAnimation(this.LLILZLL);
                    }
                    this.LLIZ = 1;
                    return;
                }
                this.LLIZ = 2;
            } catch (Resources.NotFoundException e) {
                TryCatchGuardChecker.doCheck(e);
                this.LLIZ = 2;
            }
        }
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

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        AbstractC1539070q9Z abstractC1539070q9Z;
        InterfaceC20190413zK interfaceC20190413zK;
        super.onActivityResult(i, i2, intent);
        SparkContext sparkContext = this.LLJI;
        if (sparkContext != null && (interfaceC20190413zK = (InterfaceC20190413zK) sparkContext.LJFF(InterfaceC20190413zK.class)) != null) {
            interfaceC20190413zK.onActivityResult(i, i2, intent);
        }
        SparkContext sparkContext2 = this.LLJI;
        if (sparkContext2 != null && (abstractC1539070q9Z = (AbstractC1539070q9Z) sparkContext2.LJFF(AbstractC1539070q9Z.class)) != null) {
            do {
                abstractC1539070q9Z.onActivityResult(i, i2, intent);
                AbstractC1539070q9Z next = abstractC1539070q9Z.next();
                if (next == null || !(next instanceof AbstractC1539070q9Z)) {
                    break;
                } else {
                    abstractC1539070q9Z = next;
                }
            } while (abstractC1539070q9Z != null);
        }
        InterfaceC1387820mDc interfaceC1387820mDc = this.LLJIJIL;
        if (interfaceC1387820mDc != null) {
            interfaceC1387820mDc.onActivityResult(i, i2, intent);
        }
    }
}
