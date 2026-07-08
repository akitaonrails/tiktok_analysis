package com.ss.android.ugc.aweme.live;

import X.AbstractActivityC484150Iyj;
import X.C1161920gLG;
import X.C1308910kAL;
import X.C1697810uHb;
import X.C19EH;
import X.C1AKO;
import X.C299020Bno;
import X.C335910DEv;
import X.EnumC335920DEw;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import androidx.fragment.app.Fragment;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes5.dex */
public final class LiveStudioMonitorActivity extends AbstractActivityC484150Iyj {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiklPyHELIOSp9BCw6LBwnPSElJgI8Jiw4Jj0SKzElPyYnMQ==";
    public C1AKO LL;

    @Override // X.AbstractActivityC484150Iyj, com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onResume() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.live.LiveStudioMonitorActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.live.LiveStudioMonitorActivity", "onResume", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStart() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.live.LiveStudioMonitorActivity", "onStart", true);
        super.onStart();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.live.LiveStudioMonitorActivity", "onStart", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.live.LiveStudioMonitorActivity", "onWindowFocusChanged", true);
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

    @Override // X.AbstractActivityC484150Iyj, com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Fragment fragment;
        View decorView;
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.live.LiveStudioMonitorActivity", "onCreate", true);
        setTheme(R.style.xm);
        super.onCreate(bundle);
        setContentView(R.layout.dbb);
        Window window = getWindow();
        if (window != null) {
            window.addFlags(128);
        }
        Window window2 = getWindow();
        if (window2 != null && (decorView = window2.getDecorView()) != null) {
            decorView.setBackgroundColor(-16777216);
        }
        C1AKO c1akoCreateLiveStudioMonitorFragment = ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).createLiveStudioMonitorFragment(this, bundle);
        this.LL = c1akoCreateLiveStudioMonitorFragment;
        if (c1akoCreateLiveStudioMonitorFragment != null) {
            C19EH c19ehLJIIJ = getSupportFragmentManager().LJIIJ();
            C1AKO c1ako = this.LL;
            if (c1ako != null && (fragment = c1ako.getFragment()) != null) {
                c19ehLJIIJ.LJIJ(R.id.iiv, fragment, null);
            }
            c19ehLJIIJ.LJIIIZ();
        } else {
            finish();
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.live.LiveStudioMonitorActivity", "onCreate", false);
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
}
