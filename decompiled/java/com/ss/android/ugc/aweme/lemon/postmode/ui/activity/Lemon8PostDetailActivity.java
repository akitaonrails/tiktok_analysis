package com.ss.android.ugc.aweme.lemon.postmode.ui.activity;

import X.C01GW;
import X.C0HYG;
import X.C0I27;
import X.C0I28;
import X.C1220000hqw;
import X.C1308910kAL;
import X.C1341050l0B;
import X.C1355870lO5;
import X.C13LE;
import X.C1554960qZC;
import X.C1558360qeg;
import X.C1697810uHb;
import X.C19EG;
import X.C19EH;
import X.C2344809Gs;
import X.C299020Bno;
import X.C335910DEv;
import X.C338530DOx;
import X.C442390HWj;
import X.C442430HWn;
import X.C452070Ho5;
import X.C452501pT;
import X.C724750Sbp;
import X.C736950SvV;
import X.EnumC335920DEw;
import android.content.Context;
import android.os.Bundle;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.lemon.postmode.model.PostModeDetailParams;
import com.ss.android.ugc.aweme.lemon.postmode.ui.common.PhotoSharedViewModel;
import com.ss.android.ugc.aweme.lemon.postmode.ui.common.PostModeTimeLoggerViewModel;
import com.ss.android.ugc.aweme.lemon.postmode.ui.fragment.LemonPostDetailFragment;
import com.ss.android.ugc.aweme.lemon.postmode.viewmodel.PostModeContainerViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS209S0000000_21;
import kotlin.jvm.internal.AFwS259S0000000_21;
import kotlin.jvm.internal.AwS550S0100000_6;
import kotlin.jvm.internal.AwS565S0100000_21;

/* JADX INFO: loaded from: classes22.dex */
public final class Lemon8PostDetailActivity extends BaseActivity {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZikpJCA9ZjUjOjs+JyEpHELIOSZzo6ZiQvPSYlITE1ZwM2JSoicR88OzEILDsyISkNKjs6Piw4MA==";
    public LemonPostDetailFragment LL;
    public PostModeDetailParams LLILLJJLI;
    public final C01GW LLILLL = C452501pT.LIZIZ(new AwS565S0100000_21(this, 680));
    public final C01GW LLILZ = C452501pT.LIZIZ(new AwS565S0100000_21(this, 679));
    public final C736950SvV LLILZIL = new C736950SvV(C13LE.LIZ(PhotoSharedViewModel.class), new AwS565S0100000_21((C19EG) this, 1486), new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS259S0000000_21.get$arr$(409), new C0I27(this), new C0I28(this), new C338530DOx(this));
    public final C01GW LLILZLL = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(292));

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStart() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.lemon.postmode.ui.activity.Lemon8PostDetailActivity", "onStart", true);
        super.onStart();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.lemon.postmode.ui.activity.Lemon8PostDetailActivity", "onStart", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.lemon.postmode.ui.activity.Lemon8PostDetailActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // X.ActivityC21503719Dn, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        PostModeContainerViewModel postModeContainerViewModel = (PostModeContainerViewModel) this.LLILLL.getValue();
        C0HYG c0hyg = C0HYG.BACK_USE_SWIPE_ANIM;
        if (postModeContainerViewModel.LL.getValue() == null) {
            postModeContainerViewModel.LL.setValue(c0hyg);
        }
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onResume() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.lemon.postmode.ui.activity.Lemon8PostDetailActivity", "onResume", true);
        super.onResume();
        PostModeTimeLoggerViewModel postModeTimeLoggerViewModel = (PostModeTimeLoggerViewModel) this.LLILZ.getValue();
        postModeTimeLoggerViewModel.getClass();
        postModeTimeLoggerViewModel.LL = Long.valueOf(System.currentTimeMillis());
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.lemon.postmode.ui.activity.Lemon8PostDetailActivity", "onResume", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onPause() throws Throwable {
        super.onPause();
        PostModeTimeLoggerViewModel postModeTimeLoggerViewModel = (PostModeTimeLoggerViewModel) this.LLILZ.getValue();
        postModeTimeLoggerViewModel.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        Long l = postModeTimeLoggerViewModel.LL;
        postModeTimeLoggerViewModel.LLILLJJLI += jCurrentTimeMillis - (l != null ? l.longValue() : 0L);
        AwS550S0100000_6 awS550S0100000_6 = postModeTimeLoggerViewModel.LLILLL;
        if (awS550S0100000_6 != null) {
            awS550S0100000_6.invoke();
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

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Bundle bundle2;
        LemonPostDetailFragment lemonPostDetailFragment;
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.lemon.postmode.ui.activity.Lemon8PostDetailActivity", "onCreate", true);
        this.LLILLJJLI = ((PhotoSharedViewModel) this.LLILZIL.getValue()).LLILLL;
        C1554960qZC.LIZ(C1558360qeg.LJI(this, null), (C1341050l0B) this.LLILZLL.getValue(), C1341050l0B.class, "source_default_key");
        if (this.LLILLJJLI == null || ((PhotoSharedViewModel) this.LLILZIL.getValue()).LLILLJJLI == null) {
            C2344809Gs.LJI(new Exception("Full page was launched without params"));
            finish();
        }
        activityConfiguration(AFwS259S0000000_21.get$arr$(185));
        activityConfiguration(AFwS259S0000000_21.get$arr$(186));
        super.onCreate(bundle);
        setContentView(R.layout.daa);
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        Fragment fragmentLJJJJZI = supportFragmentManager.LJJJJZI("POST_MODE_DETAIL_FRAGMENT");
        if (!(fragmentLJJJJZI instanceof LemonPostDetailFragment) || (lemonPostDetailFragment = (LemonPostDetailFragment) fragmentLJJJJZI) == null) {
            try {
                bundle2 = getIntent().getExtras();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            if (bundle2 == null) {
                bundle2 = new Bundle();
            }
            LemonPostDetailFragment.LLJILJILJ.getClass();
            lemonPostDetailFragment = new LemonPostDetailFragment();
            lemonPostDetailFragment.setArguments(bundle2);
        }
        this.LL = lemonPostDetailFragment;
        C19EH c19ehLJIIJ = supportFragmentManager.LJIIJ();
        c19ehLJIIJ.LJIJ(R.id.rks, lemonPostDetailFragment, "POST_MODE_DETAIL_FRAGMENT");
        c19ehLJIIJ.LJIIJ();
        C1355870lO5 c1355870lO5 = ((PhotoSharedViewModel) this.LLILZIL.getValue()).LLILZ;
        if (c1355870lO5 != null) {
            c1355870lO5.LIZIZ = System.currentTimeMillis();
            c1355870lO5.LIZ();
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.lemon.postmode.ui.activity.Lemon8PostDetailActivity", "onCreate", false);
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

    public final void LLLLLZL(Context context, FrameLayout frameLayout) {
        LemonPostDetailFragment lemonPostDetailFragment = this.LL;
        if (lemonPostDetailFragment != null) {
            C442430HWn c442430HWn = lemonPostDetailFragment.LLIZ;
            if (c442430HWn != null) {
                C442390HWj c442390HWj = new C442390HWj(context, lemonPostDetailFragment.NR().LLILLJJLI, lemonPostDetailFragment.MR(), c442430HWn);
                lemonPostDetailFragment.LLJIJIL = c442390HWj;
                frameLayout.addView(c442390HWj);
            } else {
                C2344809Gs.LIZLLL(4, "PostModeCrash", "postmodemodel  is null");
            }
        } else {
            finish();
        }
        if (this.LL == null) {
            C2344809Gs.LIZLLL(4, "PostModeCrash", "postModeDetailFragment is null");
        }
    }
}
