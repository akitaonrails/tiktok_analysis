package com.ss.android.ugc.aweme.live.rank;

import X.AbstractActivityC484150Iyj;
import X.C01GW;
import X.C1161920gLG;
import X.C1308910kAL;
import X.C1697810uHb;
import X.C19EH;
import X.C2095008Iq;
import X.C299020Bno;
import X.C335910DEv;
import X.C786410Ut5;
import X.EnumC335920DEw;
import android.content.Intent;
import android.os.Bundle;
import com.bytedance.android.live.rank.impl.list.OfflineRankListFragment;
import com.bytedance.android.livesdk.rank.api.IRankService;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.immersionbar.ImmersionBar;
import com.bytedance.router.arg.RouteArgExtension;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.system.TuxImmersionBar;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes28.dex */
public final class LiveOfflineRankListActivity extends AbstractActivityC484150Iyj {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiklPyp9OiHELIOSQiImEfITMpBik1JCwiLB0yJi4AIDwnCSY4IDk6PDw=";
    public final C01GW LL = RouteArgExtension.INSTANCE.navArg(this);

    @Override // X.AbstractActivityC484150Iyj, com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onResume() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.live.rank.LiveOfflineRankListActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.live.rank.LiveOfflineRankListActivity", "onResume", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStart() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.live.rank.LiveOfflineRankListActivity", "onStart", true);
        super.onStart();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.live.rank.LiveOfflineRankListActivity", "onStart", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.live.rank.LiveOfflineRankListActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // X.AbstractActivityC484150Iyj, com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onDestroy() {
        try {
            super.onDestroy();
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

    @Override // X.AbstractActivityC484150Iyj, com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public final void onCreate(Bundle bundle) {
        String stringExtra;
        String rankPeriod;
        boolean z;
        String rankGroupType;
        String selectRankType;
        String selectSubRankType;
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.live.rank.LiveOfflineRankListActivity", "onCreate", true);
        try {
            super.onCreate(bundle);
            if (bundle == null) {
                TuxImmersionBar tuxImmersionBar = new TuxImmersionBar(this, ImmersionBar.LJIILJJIL(this));
                tuxImmersionBar.LJIIIZ(-1);
                tuxImmersionBar.LJFF(-1);
                tuxImmersionBar.LIZLLL();
                setContentView(R.layout.fxe);
                Bundle bundle2 = new Bundle();
                OfflineRankActivityArgs offlineRankActivityArgs = (OfflineRankActivityArgs) this.LL.getValue();
                String rankPeriod2 = null;
                try {
                    stringExtra = getIntent().getStringExtra("tabParams");
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (stringExtra == null || stringExtra.length() <= 0) {
                    stringExtra = null;
                }
                C786410Ut5.LJJJI("tabParams", stringExtra, bundle2);
                Intent intent = getIntent();
                if (offlineRankActivityArgs != null) {
                    rankPeriod = offlineRankActivityArgs.getRankPeriod();
                } else {
                    rankPeriod = null;
                }
                Integer numLJIIJJI = C2095008Iq.LJIIJJI(LLLLZI("rank_period", rankPeriod));
                if (numLJIIJJI != null && numLJIIJJI.intValue() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                bundle2.putBoolean("history", intent.getBooleanExtra("history", z));
                C786410Ut5.LJJIIZI(bundle2, C786410Ut5.g3(getIntent(), "log_params"), "log_params");
                if (offlineRankActivityArgs != null) {
                    rankGroupType = offlineRankActivityArgs.getRankGroupType();
                } else {
                    rankGroupType = null;
                }
                LLLLZIL("rank_group_type", rankGroupType, bundle2);
                if (offlineRankActivityArgs != null) {
                    selectRankType = offlineRankActivityArgs.getSelectRankType();
                } else {
                    selectRankType = null;
                }
                LLLLZIL("select_rank_type", selectRankType, bundle2);
                if (offlineRankActivityArgs != null) {
                    selectSubRankType = offlineRankActivityArgs.getSelectSubRankType();
                } else {
                    selectSubRankType = null;
                }
                LLLLZIL("select_sub_rank_type", selectSubRankType, bundle2);
                if (offlineRankActivityArgs != null) {
                    rankPeriod2 = offlineRankActivityArgs.getRankPeriod();
                }
                LLLLZIL("rank_period", rankPeriod2, bundle2);
                if (offlineRankActivityArgs != null && offlineRankActivityArgs.getType() != null) {
                    Bundle bundle3 = new Bundle();
                    C786410Ut5.LJJJI("source", offlineRankActivityArgs.getSource(), bundle3);
                    C786410Ut5.LJJJI("rank_enter_type", offlineRankActivityArgs.getRankEnterType(), bundle3);
                    C786410Ut5.LJJIIZI(bundle2, bundle3, "log_params");
                }
                OfflineRankListFragment offlineRankListFragmentTi0 = ((IRankService) C1161920gLG.LIZJ(IRankService.class)).ti0();
                if (offlineRankListFragmentTi0 != null) {
                    offlineRankListFragmentTi0.setArguments(bundle2);
                    C19EH c19ehLJIIJ = getSupportFragmentManager().LJIIJ();
                    c19ehLJIIJ.LIZIZ(R.id.iiv, offlineRankListFragmentTi0);
                    c19ehLJIIJ.LJIIIZ();
                }
            } else {
                finish();
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            finish();
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.live.rank.LiveOfflineRankListActivity", "onCreate", false);
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

    public final String LLLLZI(String str, String str2) {
        String stringExtra;
        boolean z;
        boolean z2 = true;
        String str3 = null;
        if (str2 != null) {
            if (str2.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                str2 = null;
            }
            if (str2 != null) {
                return str2;
            }
        }
        try {
            stringExtra = getIntent().getStringExtra(str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            stringExtra = null;
        }
        if (stringExtra != null) {
            if (stringExtra.length() <= 0) {
                z2 = false;
            }
            if (z2) {
                str3 = stringExtra;
            }
        }
        if (str3 == null) {
            return "";
        }
        return str3;
    }

    public final void LLLLZIL(String str, String str2, Bundle bundle) {
        String strLLLLZI = LLLLZI(str, str2);
        if (strLLLLZI.length() > 0) {
            C786410Ut5.LJJJI(str, strLLLLZI, bundle);
        }
    }
}
