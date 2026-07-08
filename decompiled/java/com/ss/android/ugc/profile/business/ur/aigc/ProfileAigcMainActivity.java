package com.ss.android.ugc.profile.business.ur.aigc;

import X.AbstractC19484711Kz;
import X.C01GW;
import X.C1067920dte;
import X.C11NJ;
import X.C11S5;
import X.C1221610htX;
import X.C1221730htj;
import X.C1221810htr;
import X.C1221850htv;
import X.C1239300iM4;
import X.C1308910kAL;
import X.C1390410mHn;
import X.C1697810uHb;
import X.C1701940uOG;
import X.C1954807lC;
import X.C19EH;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C299020Bno;
import X.C335910DEv;
import X.C452501pT;
import X.C786410Ut5;
import X.EnumC1221320ht4;
import X.EnumC1221770htn;
import X.EnumC1221920hu2;
import X.EnumC335920DEw;
import X.InterfaceC1221660htc;
import Y.AkS481S0100000_19;
import android.os.Bundle;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.bytedance.router.arg.RouteArgExtension;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.aigc.IAIGCAvatarService;
import com.ss.android.ugc.aweme.profile.aigc.ProfileAIGCMainArg;
import com.zhiliaoapp.musically.R;
import java.util.Locale;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.AFwS207S0000000_19;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class ProfileAigcMainActivity extends BaseActivity {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZjU+Jik6JCBiKzogISspOjHELIOSx9PTdiKCY0K2scOyA1ISkpCCY0KwgtICESKzElPyYnMQ==";
    public Bundle LLILLJJLI;
    public C1390410mHn LLILLL;
    public final C01GW LL = RouteArgExtension.INSTANCE.navArg(this);
    public final C11NJ LLILZ = new C11NJ();
    public final C01GW LLILZIL = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(411));
    public final C1221850htv LLILZLL = new InterfaceC1221660htc() { // from class: X.0htv
        @Override // X.InterfaceC1221660htc
        public void onUpdate(C1221710hth c1221710hth) {
        }
    };

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onResume() {
        ActivityAgent.onTrace("com.ss.android.ugc.profile.business.ur.aigc.ProfileAigcMainActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.profile.business.ur.aigc.ProfileAigcMainActivity", "onResume", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStart() {
        ActivityAgent.onTrace("com.ss.android.ugc.profile.business.ur.aigc.ProfileAigcMainActivity", "onStart", true);
        super.onStart();
        ActivityAgent.onTrace("com.ss.android.ugc.profile.business.ur.aigc.ProfileAigcMainActivity", "onStart", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.profile.business.ur.aigc.ProfileAigcMainActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        this.LLILZ.LJ();
        ((IAIGCAvatarService) this.LLILZIL.getValue()).fr(EnumC1221320ht4.SOCIAL, this.LLILZLL);
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

    public final void LLLLLZL(C1221730htj c1221730htj) {
        C1390410mHn c1390410mHn = this.LLILLL;
        if (c1390410mHn != null) {
            c1390410mHn.LIZLLL();
        }
        C1390410mHn c1390410mHn2 = this.LLILLL;
        if (c1390410mHn2 != null) {
            C786410Ut5.LLLZZIL(c1390410mHn2, 8);
        }
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("current status: ");
        sbLIZ.append(c1221730htj);
        sbLIZ.append(".status");
        C2188811AlT.LIZIZ(sbLIZ);
        switch (C1221810htr.LIZ[c1221730htj.LIZ.ordinal()]) {
            case 1:
            case 2:
                getSupportFragmentManager().LJLLILLLL();
                C19EH c19ehLJIIJ = getSupportFragmentManager().LJIIJ();
                ProfileAigcIntroFragmentV2 profileAigcIntroFragmentV2 = new ProfileAigcIntroFragmentV2();
                profileAigcIntroFragmentV2.setArguments(this.LLILLJJLI);
                c19ehLJIIJ.LJIJ(R.id.iiv, profileAigcIntroFragmentV2, null);
                c19ehLJIIJ.LJIIIZ();
                return;
            case 3:
                LLLLZI("fail");
                return;
            case 4:
                LLLLZI("creating");
                return;
            case 5:
                LLLLZI("in_queue");
                return;
            case 6:
                Bundle bundle = this.LLILLJJLI;
                if (bundle != null) {
                    C786410Ut5.LJJIZ(bundle, "avatar_result", c1221730htj.LIZIZ);
                }
                getSupportFragmentManager().LJLLILLLL();
                ProfileAigcChooseAvatarFragment profileAigcChooseAvatarFragment = new ProfileAigcChooseAvatarFragment();
                profileAigcChooseAvatarFragment.setArguments(this.LLILLJJLI);
                C19EH c19ehLJIIJ2 = getSupportFragmentManager().LJIIJ();
                c19ehLJIIJ2.LJIJ(R.id.iiv, profileAigcChooseAvatarFragment, null);
                c19ehLJIIJ2.LJIIIZ();
                return;
            default:
                throw new C1954807lC();
        }
    }

    public final void LLLLZI(String str) {
        getSupportFragmentManager().LJLLILLLL();
        ProfileAigcProgressFragment profileAigcProgressFragment = new ProfileAigcProgressFragment();
        Bundle bundle = this.LLILLJJLI;
        if (bundle != null) {
            C786410Ut5.LJJJI("enter_status", str, bundle);
        } else {
            bundle = null;
        }
        profileAigcProgressFragment.setArguments(bundle);
        C19EH c19ehLJIIJ = getSupportFragmentManager().LJIIJ();
        c19ehLJIIJ.LJIJ(R.id.iiv, profileAigcProgressFragment, null);
        c19ehLJIIJ.LJIIIZ();
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public final void onCreate(Bundle bundle) {
        String aigcStatus;
        ActivityAgent.onTrace("com.ss.android.ugc.profile.business.ur.aigc.ProfileAigcMainActivity", "onCreate", true);
        activityConfiguration(AFwS257S0000000_19.get$arr$(373));
        super.onCreate(bundle);
        if (!C1067920dte.LIZ()) {
            finish();
        }
        setContentView(R.layout.ebf);
        C1390410mHn c1390410mHn = (C1390410mHn) findViewById(R.id.gar);
        this.LLILLL = c1390410mHn;
        if (c1390410mHn != null) {
            C786410Ut5.LLLZZIL(c1390410mHn, 0);
        }
        C1390410mHn c1390410mHn2 = this.LLILLL;
        if (c1390410mHn2 != null) {
            c1390410mHn2.LIZJ();
        }
        ProfileAIGCMainArg profileAIGCMainArg = (ProfileAIGCMainArg) this.LL.getValue();
        if (profileAIGCMainArg != null) {
            Bundle bundle2 = new Bundle();
            String aigcEntrance = profileAIGCMainArg.getAigcEntrance();
            if (aigcEntrance != null) {
                C786410Ut5.LJJJI("entrance", aigcEntrance, bundle2);
            }
            Boolean introPageWithNavBar = profileAIGCMainArg.getIntroPageWithNavBar();
            if (introPageWithNavBar != null) {
                bundle2.putBoolean("intro_page_nav_bar", introPageWithNavBar.booleanValue());
            }
            String enterFrom = profileAIGCMainArg.getEnterFrom();
            if (enterFrom != null) {
                C786410Ut5.LJJJI("enter_from", enterFrom, bundle2);
                String string = EnumC1221920hu2.PERSONAL_HOMEPAGE.toString();
                Locale locale = Locale.ROOT;
                if (Intrinsics.LJFF(enterFrom, string.toLowerCase(locale))) {
                    C786410Ut5.LJJJI("enter_from_for_progress", EnumC1221920hu2.EDIT_PROFILE_PAGE.toString().toLowerCase(locale), bundle2);
                }
            }
            String enterMethod = profileAIGCMainArg.getEnterMethod();
            if (enterMethod != null) {
                C786410Ut5.LJJJI("enter_method", enterMethod, bundle2);
            }
            C1221610htX avatarResult = profileAIGCMainArg.getAvatarResult();
            if (avatarResult != null) {
                C786410Ut5.LJJIZ(bundle2, "avatar_result", avatarResult);
            }
            this.LLILLJJLI = bundle2;
        }
        ProfileAIGCMainArg profileAIGCMainArg2 = (ProfileAIGCMainArg) this.LL.getValue();
        C1221610htX avatarResult2 = null;
        if (profileAIGCMainArg2 != null && (aigcStatus = profileAIGCMainArg2.getAigcStatus()) != null) {
            EnumC1221770htn enumC1221770htnValueOf = EnumC1221770htn.valueOf(aigcStatus);
            ProfileAIGCMainArg profileAIGCMainArg3 = (ProfileAIGCMainArg) this.LL.getValue();
            if (profileAIGCMainArg3 != null) {
                avatarResult2 = profileAIGCMainArg3.getAvatarResult();
            }
            LLLLLZL(new C1221730htj(enumC1221770htnValueOf, avatarResult2));
        } else {
            this.LLILZ.LIZ(C1239300iM4.LIZLLL(AbstractC19484711Kz.LJIJI(new Callable() { // from class: X.0htg
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    EnumC1221770htn enumC1221770htn;
                    C1C7U.LIZ("ProfileAigcMainActivity@7481.onCreate$4$1");
                    C1221710hth c1221710hthGr = ((IAIGCAvatarService) C1221720hti.LIZ.getValue()).gr(EnumC1221320ht4.SOCIAL);
                    int i = C2187451AjH.LIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("current task status: ");
                    sbLIZ.append(c1221710hthGr);
                    C2188811AlT.LIZIZ(sbLIZ);
                    int i2 = C1221690htf.LIZ[c1221710hthGr.LIZ.ordinal()];
                    if (i2 == 1) {
                        enumC1221770htn = EnumC1221770htn.GENERATING;
                    } else if (i2 == 2) {
                        enumC1221770htn = EnumC1221770htn.IN_QUEUE;
                    } else if (i2 == 3) {
                        enumC1221770htn = EnumC1221770htn.SUCCESSFUL;
                    } else if (i2 == 4) {
                        enumC1221770htn = EnumC1221770htn.FAILED;
                    } else {
                        if (i2 != 5) {
                            throw new C1954807lC();
                        }
                        enumC1221770htn = EnumC1221770htn.IDLE;
                    }
                    Integer num = c1221710hthGr.LJ;
                    if (num != null) {
                        num.intValue();
                    }
                    C1221610htX c1221610htX = new C1221610htX();
                    C1221640hta c1221640hta = c1221710hthGr.LJFF;
                    c1221610htX.setAvatarUris(c1221640hta != null ? c1221640hta.LIZ : null);
                    C1221640hta c1221640hta2 = c1221710hthGr.LJFF;
                    c1221610htX.setRemainingQuota(c1221640hta2 != null ? c1221640hta2.LIZIZ : null);
                    C1221640hta c1221640hta3 = c1221710hthGr.LJFF;
                    c1221610htX.setTaskId(c1221640hta3 != null ? c1221640hta3.LIZJ : null);
                    String str = c1221710hthGr.LJI;
                    c1221610htX.setPathMode(str != null ? c1221610htX.getPathMode(str) : null);
                    Integer num2 = c1221710hthGr.LJII;
                    if (num2 != null) {
                        num2.intValue();
                    }
                    C1221730htj c1221730htj = new C1221730htj(enumC1221770htn, c1221610htX);
                    C1C7U.LIZIZ("ProfileAigcMainActivity@7481.onCreate$4$1");
                    return c1221730htj;
                }
            }).LJJIJIIJI(C11S5.LIZ()).LJJ(C1701940uOG.LIZIZ()).LJIL(new AkS481S0100000_19(this, 1)), AFwS257S0000000_19.get$arr$(374), C1239300iM4.LIZ));
        }
        ActivityAgent.onTrace("com.ss.android.ugc.profile.business.ur.aigc.ProfileAigcMainActivity", "onCreate", false);
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
