package com.ss.android.ugc.aweme.mvtemplate.view;

import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C1308910kAL;
import X.C1389600mGU;
import X.C1697810uHb;
import X.C19EH;
import X.C299020Bno;
import X.C335910DEv;
import X.C786410Ut5;
import X.EnumC335920DEw;
import X.InterfaceC744180THc;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.analysis.Analysis;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.AsyncAVService;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS259S0000000_21;

/* JADX INFO: loaded from: classes22.dex */
public final class MovieDetailActivity extends BaseActivity implements InterfaceC744180THc {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2Zig6PSo+HELIOSOCktPSp9PiwpPmEeJzMlLAs2PCQlJQ4wPCw6IDsq";
    public String LL = "";
    public int LLILLJJLI = 1;
    public String LLILLL = "";
    public String LLILZ = "";
    public String LLILZIL = "";
    public int LLILZLL;
    public boolean LLIZ;

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onResume() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.mvtemplate.view.MovieDetailActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.mvtemplate.view.MovieDetailActivity", "onResume", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStart() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.mvtemplate.view.MovieDetailActivity", "onStart", true);
        super.onStart();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.mvtemplate.view.MovieDetailActivity", "onStart", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.mvtemplate.view.MovieDetailActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // X.InterfaceC744180THc
    public final Analysis getAnalysis() {
        long j;
        long j2 = 0;
        try {
            j = CastLongProtector.parseLong(this.LL);
        } catch (Exception e) {
            e = e;
            j = 0;
        }
        try {
            j2 = CastLongProtector.parseLong(this.LLILZIL);
        } catch (Exception e2) {
            e = e2;
            TryCatchGuardChecker.doCheck(e);
        }
        Analysis analysis = new Analysis();
        analysis.setLabelName("mv_page");
        analysis.setExt_value(j);
        analysis.setValue(j2);
        return analysis;
    }

    public final void init() throws Throwable {
        String stringExtra;
        String stringExtra2;
        boolean z;
        String stringExtra3 = null;
        try {
            stringExtra3 = getIntent().getStringExtra("mv_id");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        String str = "";
        if (stringExtra3 == null) {
            stringExtra3 = "";
        }
        this.LL = stringExtra3;
        this.LLILLJJLI = getIntent().getIntExtra("source_id", 1);
        try {
            stringExtra = getIntent().getStringExtra("enter_method");
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.LLILZ = stringExtra;
        try {
            stringExtra2 = getIntent().getStringExtra("enter_from");
        } catch (Exception e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        if (stringExtra2 == null) {
            stringExtra2 = "";
        }
        this.LLILLL = stringExtra2;
        try {
            String stringExtra4 = getIntent().getStringExtra("group_id");
            if (stringExtra4 != null) {
                str = stringExtra4;
            }
        } catch (Exception e4) {
            TryCatchGuardChecker.doCheck(e4);
        }
        this.LLILZIL = str;
        this.LLILZLL = getIntent().getIntExtra("type", 0);
        this.LLIZ = getIntent().getBooleanExtra("enter_record_from_feed", false);
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        C19EH c19ehLJIIJ = supportFragmentManager.LJIIJ();
        Fragment fragmentLJJJJZI = supportFragmentManager.LJJJJZI("movie_detail_fragment_tag");
        if (fragmentLJJJJZI == null) {
            String str2 = MovieDetailFragment._pnsPageId;
            String str3 = this.LL;
            String str4 = this.LLILLL;
            String str5 = this.LLILZIL;
            String str6 = this.LLILZ;
            int i = this.LLILZLL;
            int i2 = this.LLILLJJLI;
            boolean z2 = this.LLIZ;
            fragmentLJJJJZI = new MovieDetailFragment();
            Bundle bundle = new Bundle(3);
            C786410Ut5.LJJJI("mv_id", str3, bundle);
            C786410Ut5.LJJJI("enter_from", str4, bundle);
            C786410Ut5.LJJJI("enter_method", str6, bundle);
            C786410Ut5.LJJJI("group_id", str5, bundle);
            bundle.putInt("type", i);
            bundle.putInt("source_id", i2);
            bundle.putBoolean("enter_record_from_feed", z2);
            fragmentLJJJJZI.setArguments(bundle);
            z = true;
        } else {
            z = true;
        }
        fragmentLJJJJZI.setUserVisibleHint(z);
        c19ehLJIIJ.LJIJ(R.id.eqx, fragmentLJJJJZI, "movie_detail_fragment_tag");
        c19ehLJIIJ.LJIIIZ();
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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.mvtemplate.view.MovieDetailActivity", "onCreate", true);
        activityConfiguration(AFwS259S0000000_21.get$arr$(206));
        super.onCreate(bundle);
        setContentView(R.layout.jl);
        init();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.mvtemplate.view.MovieDetailActivity", "onCreate", false);
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
    public final void onActivityResult(final int i, final int i2, final Intent intent) throws Throwable {
        Intent intent2;
        Activity activity;
        int i3;
        super.onActivityResult(i, i2, intent);
        ((IExternalService) ServiceManager.get().getService(IExternalService.class)).asyncService(this, "movie_detail", new IExternalService.ServiceLoadCallback() { // from class: X.0mPA
            @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
            public final void onDismiss() {
                IExternalService.ServiceLoadCallback.DefaultImpls.onDismiss(this);
            }

            @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
            public final void onFailed() {
                IExternalService.ServiceLoadCallback.DefaultImpls.onFailed(this);
            }

            @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
            public final void onOK() {
                IExternalService.ServiceLoadCallback.DefaultImpls.onOK(this);
            }

            @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
            public final void onLoad(AsyncAVService asyncAVService, long j) {
                asyncAVService.uiService().recordService().recordActivityResult(this.LIZ, i, i2, intent);
            }
        });
        if (i == 10086) {
            int iIntValue = -1;
            if (i2 == -1) {
                C0WZX c0wzx = new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOe+d5rDzD5kR86Yfv2ex63xFfxqBltvWkRlXm3xHb8mzpbN", null);
                C0WST c0wst = new C0WST();
                Object[] objArr = {-1, intent};
                C0WZW c0wzw = new C0WZW(false, "(ILandroid/content/Intent;)V", c0wzx);
                C0WSU c0wsuLIZIZ = c0wst.LIZIZ(11071, "com/ss/android/ugc/aweme/mvtemplate/view/MovieDetailActivity", "setResult", this, objArr, "void", c0wzw);
                if (c0wsuLIZIZ.LIZ) {
                    c0wst.LIZ(11071, "com/ss/android/ugc/aweme/mvtemplate/view/MovieDetailActivity", "setResult", null, objArr, this, c0wzw, false);
                    i3 = 0;
                } else {
                    Object[] objArr2 = c0wsuLIZIZ.LIZJ;
                    if (objArr2 != null) {
                        Object obj = objArr2[0];
                        if (obj != null) {
                            activity = (Activity) obj;
                        } else {
                            activity = this;
                        }
                        Object obj2 = objArr2[1];
                        if (obj2 != null) {
                            iIntValue = ((Integer) obj2).intValue();
                        }
                        Object obj3 = c0wsuLIZIZ.LIZJ[2];
                        if (obj3 != null) {
                            intent2 = (Intent) obj3;
                        } else {
                            intent2 = intent;
                        }
                    } else {
                        intent2 = intent;
                        activity = this;
                    }
                    activity.setResult(iIntValue, intent2);
                    i3 = 0;
                    c0wst.LIZ(11071, "com/ss/android/ugc/aweme/mvtemplate/view/MovieDetailActivity", "setResult", null, objArr, activity, c0wzw, true);
                }
                finish();
                try {
                    C1389600mGU.LIZIZ(this);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
                overridePendingTransition(i3, i3);
            }
        }
    }
}
