package com.ss.android.ugc.aweme.assem;

import X.C01GW;
import X.C0RUJ;
import X.C10MP;
import X.C10R5;
import X.C10RS;
import X.C10RU;
import X.C10SD;
import X.C1150504el;
import X.C1514430pVp;
import X.C19245610Ra;
import X.C19254610Um;
import X.C19259110Wf;
import X.C19EG;
import X.C2187701Ajg;
import X.C2230608oa;
import X.C452501pT;
import X.C724240Sb0;
import X.C746350TPl;
import X.C786410Ut5;
import X.C844470XAv;
import X.InterfaceC1554640qYg;
import X.InterfaceC494301wD;
import android.app.Activity;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.base.BaseMainContainerAssem;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.journey.NewUserGuideAbility;
import com.ss.android.ugc.aweme.service.newusermode.INewUserModeService;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes29.dex */
public final class NewUserGuideAssem extends BaseMainContainerAssem implements NewUserGuideAbility, C0RUJ, InterfaceC1554640qYg {
    public final C01GW LL = C452501pT.LIZIZ(new C19245610Ra(this));
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new C10RU(this));

    @Override // X.C0RUJ
    public final void Ie() {
    }

    @Override // X.C0RUJ
    public final String T1() {
        return "coldboot_degrade_newuserguideassem";
    }

    @Override // X.C0RUJ
    public final void a6() {
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onPause_isOnPauseEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.C0RUJ
    public final void lj() {
    }

    @Override // X.C0RUJ
    public final boolean m8() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.base.BaseMainContainerAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        Activity activity;
        INewUserModeService iNewUserModeService;
        String strJ4 = C786410Ut5.j4("main_act_assem_lifecycle_%s_%s", new Object[]{"NewUserGuideAssem", "onCreate"});
        C1150504el.LIZ().LIZLLL(strJ4, false);
        super.onCreate();
        if ((C1514430pVp.LIZLLL().booleanValue() || (iNewUserModeService = (INewUserModeService) PluggableExtentionKt.pluggableSpi$default(INewUserModeService.class, false, false, false, 14, null)) == null || !iNewUserModeService.LIZIZ()) && (activity = (Activity) this.LL.getValue()) != null) {
            C1150504el.LIZ().LIZLLL("main_act_user_guide_observe", false);
            C1150504el.LIZ().LIZLLL("method_create_calculate_newuser_value", false);
            C19254610Um c19254610Um = C19254610Um.LIZIZ;
            c19254610Um.LJJIJL((Activity) this.LL.getValue(), activity.getIntent());
            C1150504el.LIZ().LJI("method_create_calculate_newuser_value", false);
            C1150504el.LIZ().LIZLLL("method_create_welcome_duration", false);
            C844470XAv.LIZ.getClass();
            int iLIZLLL = (int) C844470XAv.LIZLLL();
            C19259110Wf c19259110Wf = C746350TPl.LIZ;
            if (c19259110Wf.LIZ == null) {
                c19259110Wf.LIZ = new C2230608oa<>("last_app_version_code", 0);
            }
            if (iLIZLLL > c19259110Wf.LIZ.LIZ().intValue()) {
                Keva.getRepo("repo_new_version_journey").storeBoolean("key_new_version", true);
                Keva repo = Keva.getRepo("repo_story_cold_start");
                if (repo.getBoolean("key_new_user", false)) {
                    repo.storeBoolean("key_new_user", false);
                } else {
                    repo.storeBoolean("key_new_version", true);
                }
            }
            C10R5 c10r5 = C10R5.LJIIIIZZ;
            C10RS.LIZ();
            C10RS.LIZIZ(activity.getIntent());
            if (C10RS.LIZ().LIZ()) {
                C10MP.LIZ.getClass();
                if (!Intrinsics.LJFF(C10MP.LIZ(), Boolean.TRUE) && C10MP.LIZIZ) {
                    c19254610Um.LJIIZILJ(activity, true, false, false, false, false, false, null);
                }
            }
            C1150504el.LIZ().LJI("method_create_welcome_duration", false);
            C10RS.LIZ();
            C10RS.LIZIZ(activity.getIntent());
            C1150504el.LIZ().LJI("main_act_user_guide_observe", false);
        }
        C1150504el.LIZ().LJI(strJ4, false);
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != -935865689) {
            return null;
        }
        return this;
    }

    @Override // com.ss.android.ugc.aweme.journey.NewUserGuideAbility
    public final boolean isNewUser() {
        return ((Boolean) this.LLILLJJLI.getValue()).booleanValue();
    }

    @Override // X.AbstractC738140SxQ
    public final void onPause() {
        Window window;
        View decorView;
        ViewTreeObserver viewTreeObserver;
        super.onPause();
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ == null || (window = c19egLIZ.getWindow()) == null || (decorView = window.getDecorView()) == null || (viewTreeObserver = decorView.getViewTreeObserver()) == null) {
            return;
        }
        C10SD c10sd = C10SD.LL;
        viewTreeObserver.removeOnPreDrawListener(c10sd);
        C2187701Ajg.LIZIZ(viewTreeObserver, c10sd, ViewTreeObserver.OnPreDrawListener.class);
    }

    @Override // com.ss.android.ugc.aweme.base.BaseMainContainerAssem, X.InterfaceC1593530rZP
    public final void onWindowFocusChanged(boolean z, boolean z2) {
        INewUserModeService iNewUserModeService;
        super.onWindowFocusChanged(z, z2);
        if (C1514430pVp.LIZLLL().booleanValue() || (iNewUserModeService = (INewUserModeService) PluggableExtentionKt.pluggableSpi$default(INewUserModeService.class, false, false, false, 14, null)) == null || iNewUserModeService.LIZIZ()) {
        }
    }
}
