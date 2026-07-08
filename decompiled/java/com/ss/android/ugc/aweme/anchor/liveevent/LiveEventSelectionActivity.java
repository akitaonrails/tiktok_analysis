package com.ss.android.ugc.aweme.anchor.liveevent;

import X.C1117360fBO;
import X.C1308910kAL;
import X.C13BV;
import X.C1697810uHb;
import X.C19EH;
import X.C299020Bno;
import X.C335910DEv;
import X.C446980Hfs;
import X.EnumC335920DEw;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.anchor.AnchorBaseActivity;
import com.ss.android.ugc.aweme.liveevent.LiveEventModule;
import com.ss.android.ugc.aweme.liveevent.LiveEventSelectionFragment;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: loaded from: classes8.dex */
public final class LiveEventSelectionActivity extends AnchorBaseActivity {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiQiKic8OmsgIDHELIOSk2LTMpJzt9BCw6LAolLSs4Gio/LSY4ICA9CSY4IDk6PDw=";
    public LiveEventSelectionFragment LLIZ;

    @Override // com.ss.android.ugc.aweme.anchor.AnchorBaseActivity, com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public final void onCreate(Bundle bundle) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.anchor.liveevent.LiveEventSelectionActivity", "onCreate", true);
        super.onCreate(bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.anchor.liveevent.LiveEventSelectionActivity", "onCreate", false);
    }

    @Override // com.ss.android.ugc.aweme.anchor.AnchorBaseActivity, com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onResume() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.anchor.liveevent.LiveEventSelectionActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.anchor.liveevent.LiveEventSelectionActivity", "onResume", false);
    }

    @Override // com.ss.android.ugc.aweme.anchor.AnchorBaseActivity, com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStart() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.anchor.liveevent.LiveEventSelectionActivity", "onStart", true);
        super.onStart();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.anchor.liveevent.LiveEventSelectionActivity", "onStart", false);
    }

    @Override // com.ss.android.ugc.aweme.anchor.AnchorBaseActivity, com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.anchor.liveevent.LiveEventSelectionActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // com.ss.android.ugc.aweme.anchor.AnchorBaseActivity
    public final void LLLLLZL() {
        C19EH c19ehLJIIJ = getSupportFragmentManager().LJIIJ();
        if (this.LLIZ == null) {
            this.LLIZ = new LiveEventSelectionFragment();
        }
        LiveEventSelectionFragment liveEventSelectionFragment = this.LLIZ;
        if (liveEventSelectionFragment != null) {
            c19ehLJIIJ.LIZIZ(R.id.iio, liveEventSelectionFragment);
            c19ehLJIIJ.LJIIJ();
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

    @Override // com.ss.android.ugc.aweme.anchor.AnchorBaseActivity, X.AnonymousClass1192
    public final void LLJJIJI(LiveEventModule liveEventModule) {
        List list;
        LiveEventSelectionFragment liveEventSelectionFragment = this.LLIZ;
        if (liveEventSelectionFragment != null && liveEventModule != null) {
            liveEventSelectionFragment.LLJILJILJ = liveEventModule;
            liveEventSelectionFragment.MR().setClickable(true);
            liveEventSelectionFragment.MR().setBackground(new ColorDrawable(C446980Hfs.LIZ(liveEventSelectionFragment.getContext(), R.color.ct)));
            liveEventSelectionFragment.MR().setTextColor(C446980Hfs.LIZ(liveEventSelectionFragment.getContext(), R.color.f569bc));
            C1117360fBO c1117360fBO = liveEventSelectionFragment.LLJILLL;
            if (c1117360fBO == null || (list = c1117360fBO.LL) == null) {
                list = C13BV.INSTANCE;
            }
            for (Object obj : list) {
                if ((obj instanceof LiveEventModule) && !Intrinsics.LJFF(obj, liveEventModule)) {
                    LiveEventModule liveEventModule2 = (LiveEventModule) obj;
                    if (!u.LJIJI(liveEventModule2.id, liveEventModule.id, true)) {
                        liveEventModule2.LIZ = false;
                    }
                }
            }
            C1117360fBO c1117360fBO2 = liveEventSelectionFragment.LLJILLL;
            if (c1117360fBO2 != null) {
                c1117360fBO2.notifyDataSetChanged();
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
}
