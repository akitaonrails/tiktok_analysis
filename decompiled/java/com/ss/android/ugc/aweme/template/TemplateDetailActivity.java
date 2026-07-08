package com.ss.android.ugc.aweme.template;

import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C1308910kAL;
import X.C1389600mGU;
import X.C1578630rBN;
import X.C1619690sFb;
import X.C1697810uHb;
import X.C19EH;
import X.C299020Bno;
import X.C335910DEv;
import X.C786410Ut5;
import X.EnumC335920DEw;
import X.InterfaceC1399350mWD;
import X.InterfaceC1581830rGX;
import X.InterfaceC655270Pn3;
import X.InterfaceC744180THc;
import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import bsj.a5;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.analysis.Analysis;
import com.ss.android.ugc.feed.platform.panel.RootPanelComponent;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS259S0000000_21;

/* JADX INFO: loaded from: classes22.dex */
public final class TemplateDetailActivity extends BaseActivity implements InterfaceC655270Pn3, InterfaceC1581830rGX, InterfaceC744180THc {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjEpJDHELIOS8/KTEpZxs2JTUgKDs2DCA4KCY/CSY4IDk6PDw=";
    public final List<InterfaceC1399350mWD> LL = new ArrayList();
    public String LLILLJJLI;

    @Override // X.InterfaceC1581830rGX
    public final String getPageName() {
        return "template_page";
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onResume() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.template.TemplateDetailActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.template.TemplateDetailActivity", "onResume", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStart() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.template.TemplateDetailActivity", "onStart", true);
        super.onStart();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.template.TemplateDetailActivity", "onStart", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.template.TemplateDetailActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // X.InterfaceC744180THc
    public final Analysis getAnalysis() {
        String str;
        try {
            str = this.LLILLJJLI;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        long j = str != null ? CastLongProtector.parseLong(str) : 0L;
        Analysis analysis = new Analysis();
        analysis.setLabelName("template_detail_fragment_tag");
        analysis.setExt_value(j);
        analysis.setValue(0L);
        return analysis;
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity
    public final void finish() {
        super.finish();
        C1619690sFb.LIZ(this, null);
    }

    public final void init() {
        TemplateAnchorConfig templateAnchorConfig;
        View viewFindViewById = findViewById(R.id.w0u);
        if (viewFindViewById != null) {
            C786410Ut5.LJLLLLLL(8, viewFindViewById);
        }
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        C19EH c19ehLJIIJ = supportFragmentManager.LJIIJ();
        Fragment fragmentLJJJJZI = supportFragmentManager.LJJJJZI("template_detail_fragment_tag");
        if (Build.VERSION.SDK_INT >= 33) {
            templateAnchorConfig = (TemplateAnchorConfig) getIntent().getSerializableExtra("template_anchor_config", TemplateAnchorConfig.class);
            if (templateAnchorConfig == null) {
                return;
            }
        } else {
            Serializable serializableExtra = getIntent().getSerializableExtra("template_anchor_config");
            if (!(serializableExtra instanceof TemplateAnchorConfig) || (templateAnchorConfig = (TemplateAnchorConfig) serializableExtra) == null) {
                return;
            }
        }
        this.LLILLJJLI = templateAnchorConfig.getTemplateId();
        templateAnchorConfig.setShootEnterFrom("template_detail");
        if (fragmentLJJJJZI == null) {
            TemplateDetailFragment.LLJILJIL.getClass();
            Bundle bundle = new Bundle();
            C786410Ut5.LJJIZ(bundle, "template_anchor_config", templateAnchorConfig);
            fragmentLJJJJZI = new TemplateDetailFragment();
            fragmentLJJJJZI.setArguments(bundle);
        }
        RootPanelComponent rootPanelComponentLIZJ = C1578630rBN.LIZJ(fragmentLJJJJZI);
        if (rootPanelComponentLIZJ != null) {
            rootPanelComponentLIZJ.setUserVisibleHint(true);
        }
        c19ehLJIIJ.LJIJ(R.id.eqx, fragmentLJJJJZI, "template_detail_fragment_tag");
        c19ehLJIIJ.LJIIJ();
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
    public final void onCreate(Bundle bundle) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.template.TemplateDetailActivity", "onCreate", true);
        activityConfiguration(AFwS259S0000000_21.get$arr$(229));
        super.onCreate(bundle);
        if (a5.LIZ()) {
            getWindow().addFlags(128);
        }
        setContentView(R.layout.jl);
        init();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.template.TemplateDetailActivity", "onCreate", false);
    }

    @Override // X.InterfaceC655270Pn3
    public final void registerActivityOnKeyDownListener(InterfaceC1399350mWD interfaceC1399350mWD) {
        if (!((ArrayList) this.LL).contains(interfaceC1399350mWD)) {
            ((ArrayList) this.LL).add(interfaceC1399350mWD);
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

    @Override // X.InterfaceC655270Pn3
    public final void unRegisterActivityOnKeyDownListener(InterfaceC1399350mWD interfaceC1399350mWD) {
        ((ArrayList) this.LL).remove(interfaceC1399350mWD);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19GS, android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (isDestroyed()) {
            return false;
        }
        Iterator it2 = ((ArrayList) this.LL).iterator();
        while (it2.hasNext()) {
            if (((InterfaceC1399350mWD) it2.next()).onKeyDown(i, keyEvent)) {
                return true;
            }
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) throws Throwable {
        Activity activity;
        Intent intent2;
        super.onActivityResult(i, i2, intent);
        if (i == 10086) {
            int iIntValue = -1;
            if (i2 == -1) {
                C0WZX c0wzx = new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP6tbo/C3SbYBksNBokeIeai1nOwx3qklHzBZH5kegY=", null);
                C0WST c0wst = new C0WST();
                Object[] objArr = {-1, intent};
                C0WZW c0wzw = new C0WZW(false, "(ILandroid/content/Intent;)V", c0wzx);
                C0WSU c0wsuLIZIZ = c0wst.LIZIZ(11071, "com/ss/android/ugc/aweme/template/TemplateDetailActivity", "setResult", this, objArr, "void", c0wzw);
                if (c0wsuLIZIZ.LIZ) {
                    c0wst.LIZ(11071, "com/ss/android/ugc/aweme/template/TemplateDetailActivity", "setResult", null, objArr, this, c0wzw, false);
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
                        activity = this;
                        intent2 = intent;
                    }
                    activity.setResult(iIntValue, intent2);
                    c0wst.LIZ(11071, "com/ss/android/ugc/aweme/template/TemplateDetailActivity", "setResult", null, objArr, activity, c0wzw, true);
                }
                finish();
                try {
                    C1389600mGU.LIZIZ(this);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
                overridePendingTransition(0, 0);
            }
        }
    }
}
