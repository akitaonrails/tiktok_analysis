package com.ss.android.ugc.profile.business.profile.info.identifier.page;

import X.C1308910kAL;
import X.C1697810uHb;
import X.C19EH;
import X.C299020Bno;
import X.C335910DEv;
import X.C337680DLq;
import X.C786410Ut5;
import X.EnumC335920DEw;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes5.dex */
public final class ProfileIdentifierActivity extends BaseActivity {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZjU+Jik6JCBiKzogISspOjx9ODcjLyY/LWslHELIOSJyk8ZiwoLCEnISMlLD19OCQrLGEDOioqICM2ASEpJzs6LiwpOw4wPCw6IDsq";
    public final int LL = R.layout.acl;
    public ProfileIdentifierFragment LLILLJJLI;

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onResume() {
        ActivityAgent.onTrace("com.ss.android.ugc.profile.business.profile.info.identifier.page.ProfileIdentifierActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.profile.business.profile.info.identifier.page.ProfileIdentifierActivity", "onResume", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStart() {
        ActivityAgent.onTrace("com.ss.android.ugc.profile.business.profile.info.identifier.page.ProfileIdentifierActivity", "onStart", true);
        super.onStart();
        ActivityAgent.onTrace("com.ss.android.ugc.profile.business.profile.info.identifier.page.ProfileIdentifierActivity", "onStart", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.profile.business.profile.info.identifier.page.ProfileIdentifierActivity", "onWindowFocusChanged", true);
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

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public final void onCreate(Bundle bundle) {
        String stringExtra;
        String stringExtra2;
        ActivityAgent.onTrace("com.ss.android.ugc.profile.business.profile.info.identifier.page.ProfileIdentifierActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView(this.LL);
        ProfileIdentifierFragment profileIdentifierFragment = null;
        String stringExtra3 = null;
        if (bundle == null) {
            if (this.LLILLJJLI == null) {
                C337680DLq c337680DLq = ProfileIdentifierFragment.LLJILJIL;
                try {
                    stringExtra = getIntent().getStringExtra("enter_from");
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    stringExtra = null;
                }
                try {
                    stringExtra2 = getIntent().getStringExtra("user_id");
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    stringExtra2 = null;
                }
                try {
                    stringExtra3 = getIntent().getStringExtra("sec_user_id");
                } catch (Exception e3) {
                    TryCatchGuardChecker.doCheck(e3);
                }
                int intExtra = getIntent().getIntExtra("scene_id", 0);
                c337680DLq.getClass();
                ProfileIdentifierFragment profileIdentifierFragment2 = new ProfileIdentifierFragment();
                Bundle bundle2 = new Bundle();
                C786410Ut5.LJJJI("enter_from", stringExtra, bundle2);
                C786410Ut5.LJJJI("user_id", stringExtra2, bundle2);
                C786410Ut5.LJJJI("sec_user_id", stringExtra3, bundle2);
                bundle2.putInt("scene_id", intExtra);
                profileIdentifierFragment2.setArguments(bundle2);
                C19EH c19ehLJIIJ = getSupportFragmentManager().LJIIJ();
                c19ehLJIIJ.LJIJ(R.id.iiv, profileIdentifierFragment2, "identifierFragmentTag");
                c19ehLJIIJ.LJIIJ();
                this.LLILLJJLI = profileIdentifierFragment2;
            }
        } else {
            Fragment fragmentLJJJJZI = getSupportFragmentManager().LJJJJZI("identifierFragmentTag");
            if (fragmentLJJJJZI instanceof ProfileIdentifierFragment) {
                profileIdentifierFragment = (ProfileIdentifierFragment) fragmentLJJJJZI;
            }
            this.LLILLJJLI = profileIdentifierFragment;
        }
        ActivityAgent.onTrace("com.ss.android.ugc.profile.business.profile.info.identifier.page.ProfileIdentifierActivity", "onCreate", false);
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
