package com.ss.android.ugc.aweme.mix.editplaylist;

import X.AbstractActivityC446870Hfh;
import X.C01GW;
import X.C0DRA;
import X.C1308910kAL;
import X.C1697810uHb;
import X.C20097313kJ;
import X.C299020Bno;
import X.C335910DEv;
import X.C723850SaN;
import X.EnumC335920DEw;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.router.arg.RouteArgExtension;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS199S0000000_12;
import kotlin.jvm.internal.AwS591S0100000_12;

/* JADX INFO: loaded from: classes13.dex */
public final class EditPlaylistActivity extends AbstractActivityC446870Hfh {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiglMWE2LCHELIOSw4OSMyMSklOjt9DSElPR8/KTwgIDwnCSY4IDk6PDw=";
    public final C01GW LL = RouteArgExtension.INSTANCE.navArg(this, AFwS199S0000000_12.get$arr$(197));

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onResume() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.mix.editplaylist.EditPlaylistActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.mix.editplaylist.EditPlaylistActivity", "onResume", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStart() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.mix.editplaylist.EditPlaylistActivity", "onStart", true);
        super.onStart();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.mix.editplaylist.EditPlaylistActivity", "onStart", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.mix.editplaylist.EditPlaylistActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // X.AbstractActivityC446870Hfh
    public final Fragment LLLLLZL() {
        return new EditPlaylistFragment();
    }

    public final EditPlaylistActivityArg LLLLZI() {
        return (EditPlaylistActivityArg) this.LL.getValue();
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

    @Override // X.AbstractActivityC446870Hfh, com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public final void onCreate(Bundle bundle) {
        View view;
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.mix.editplaylist.EditPlaylistActivity", "onCreate", true);
        super.onCreate(bundle);
        Integer mixLabel = LLLLZI().getMixLabel();
        if (mixLabel != null && mixLabel.intValue() == 1) {
            C0DRA.LIZ(getWindow(), false);
            View viewFindViewById = findViewById(R.id.iiv);
            Object parent = null;
            if (viewFindViewById != null) {
                parent = viewFindViewById.getParent();
            }
            if ((parent instanceof ViewGroup) && (view = (View) parent) != null) {
                view.setFitsSystemWindows(false);
                if (view.getPaddingTop() != 0) {
                    view.setPadding(view.getPaddingLeft(), 0, view.getPaddingRight(), view.getPaddingBottom());
                }
                C20097313kJ.LIZJ(view);
            }
            if (viewFindViewById != null) {
                viewFindViewById.setFitsSystemWindows(false);
            }
        }
        C723850SaN.LIZIZ(this, new AwS591S0100000_12(this, 634));
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.mix.editplaylist.EditPlaylistActivity", "onCreate", false);
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
