package com.ss.android.ugc.aweme.main.assems;

import X.C08TN;
import X.C0X35;
import X.C1150504el;
import X.C20182613y4;
import X.C202098145w;
import X.C582600Mt8;
import X.C786410Ut5;
import com.ss.android.ugc.aweme.base.BaseMainContainerAssem;

/* JADX INFO: loaded from: classes25.dex */
public final class ColdBootActivityAssem extends BaseMainContainerAssem {
    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onResume_isOnResumeEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.base.BaseMainContainerAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        String strJ4 = C786410Ut5.j4("main_act_assem_lifecycle_%s_%s", new Object[]{"ColdBootActivityAssem", "onCreate"});
        C1150504el.LIZ().LIZLLL(strJ4, false);
        super.onCreate();
        C0X35.LJIIJJI("main_act_end_assem", true);
        C0X35.LJIIJJI("method_splash_ad_to_main_create_end", false);
        C0X35.LJIIJJI("cold_boot_main_create_duration", true);
        C0X35.LIZ("cold_boot_main_create_to_resume", true);
        C0X35.LIZIZ("cold_boot_main_create_to_resume");
        C582600Mt8.LIZ("cold_boot_main_create_to_resume");
        C202098145w c202098145wLIZ = C08TN.LIZ();
        c202098145wLIZ.getClass();
        c202098145wLIZ.getClass();
        C20182613y4.LIZLLL().LJ().LIZ("cold_boot_main_create_to_resume");
        C1150504el.LIZ().LJI(strJ4, false);
    }

    @Override // X.AbstractC738140SxQ
    public final void onResume() {
        String strJ4 = C786410Ut5.j4("main_act_assem_lifecycle_%s_%s", new Object[]{"ColdBootActivityAssem", "onResume"});
        C1150504el.LIZ().LIZLLL(strJ4, false);
        super.onResume();
        C0X35.LJIIJJI("cold_boot_main_resume_duration", true);
        C0X35.LIZ("cold_boot_main_resume_to_focus", true);
        C0X35.LIZJ("cold_boot_main_resume_to_focus", "main_resume_before_view_create");
        C0X35.LIZ("cold_boot_main_resume_to_measure", true);
        C582600Mt8.LIZ("cold_boot_main_resume_to_measure");
        C08TN.LIZ().getClass();
        C20182613y4.LIZLLL().LJ().LIZ("cold_boot_main_resume_to_focus");
        C1150504el.LIZ().LJI(strJ4, false);
    }
}
