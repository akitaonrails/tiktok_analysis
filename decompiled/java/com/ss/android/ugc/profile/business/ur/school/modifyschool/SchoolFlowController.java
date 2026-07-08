package com.ss.android.ugc.profile.business.ur.school.modifyschool;

import X.AbstractC20656215sG;
import X.C01GW;
import X.C1007300cJs;
import X.C1216270hkv;
import X.C1245800iWY;
import X.C1245810iWZ;
import X.C1245830iWb;
import X.C1245840iWc;
import X.C1245860iWe;
import X.C1246160iX8;
import X.C1389890mGx;
import X.C1668306g5;
import X.C19EG;
import X.C291240BbG;
import X.C338000DMw;
import X.C452501pT;
import X.C736460Sui;
import X.C786410Ut5;
import android.os.Bundle;
import com.bytedance.poplayer.core.PopupManager;
import com.ss.android.ugc.aweme.friends.model.SchoolMutualStruct;
import com.ss.android.ugc.ur.school.service.SchoolFlowLauncher;
import com.ss.android.ugc.ur.school.service.UserCampusService;
import kotlin.jvm.internal.AFwS187S0000000_2;
import kotlin.jvm.internal.AFwS207S0000000_19;
import kotlin.jvm.internal.AwS263S0300000_19;

/* JADX INFO: loaded from: classes20.dex */
public final class SchoolFlowController implements SchoolFlowLauncher {
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(513));
    public final C01GW LIZIZ = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(514));
    public final C01GW LIZJ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(742));

    public static void LIZJ(C19EG c19eg, C1245830iWb c1245830iWb) {
        CampusFlowFragment campusFlowFragment = new CampusFlowFragment();
        Bundle bundle = new Bundle();
        C786410Ut5.LJJIZ(bundle, "CampusFlowFragmentInputLandingPage", c1245830iWb.LIZ);
        C786410Ut5.LJJIZ(bundle, "CampusFlowFragmentInputEnterFrom", c1245830iWb.LIZIZ);
        bundle.putBoolean("skip_fsfp", c1245830iWb.LIZJ);
        C786410Ut5.LJJIZ(bundle, "CampusFlowFragmentLandingTab", c1245830iWb.LIZLLL);
        C786410Ut5.LJJJI("CampusFlowFragmentInsertAwemeId", c1245830iWb.LJ, bundle);
        campusFlowFragment.setArguments(bundle);
        campusFlowFragment.show(c19eg.getSupportFragmentManager(), "CampusFlowFragment");
    }

    @Override // com.ss.android.ugc.ur.school.service.SchoolFlowLauncher
    public final void LIZ(C19EG c19eg, C1245830iWb c1245830iWb) {
        C338000DMw c338000DMwLJFF;
        AbstractC20656215sG c1245810iWZ;
        if (!C1246160iX8.LIZ() && C736460Sui.LIZIZ(c1245830iWb.LIZIZ.externalEnterFrom)) {
            C1389890mGx c1389890mGx = new C1389890mGx(c19eg);
            c1389890mGx.LJIIJ(C1216270hkv.LIZJ(2131831029));
            c1389890mGx.LJIIJJI();
            return;
        }
        UserCampusService userCampusService = (UserCampusService) this.LIZIZ.getValue();
        if (userCampusService != null) {
            c338000DMwLJFF = userCampusService.LJFF((String) this.LIZJ.getValue());
        } else {
            c338000DMwLJFF = null;
        }
        if (c338000DMwLJFF == null && !((C1007300cJs) this.LIZ.getValue()).LIZ().getBoolean("has_seen_add_school_popup", false)) {
            C1245840iWc.LIZ.getClass();
            if (!C1245840iWc.LIZIZ() && !c1245830iWb.LJI) {
                C1245860iWe c1245860iWe = c1245830iWb.LIZIZ;
                AwS263S0300000_19 awS263S0300000_19 = new AwS263S0300000_19(this, c19eg, c1245830iWb, 14);
                if (C291240BbG.LIZ()) {
                    c1245810iWZ = new C1245800iWY(c19eg, c1245860iWe, awS263S0300000_19);
                } else {
                    c1245810iWZ = new C1245810iWZ(c19eg, c1245860iWe, awS263S0300000_19);
                }
                PopupManager.LJIIZILJ(c1245810iWZ, new C1668306g5("campus_add_school_popup"));
                return;
            }
        }
        LIZJ(c19eg, c1245830iWb);
    }

    @Override // com.ss.android.ugc.ur.school.service.SchoolFlowLauncher
    public final void LIZIZ(C19EG c19eg, C1245830iWb c1245830iWb) {
        if (!C1246160iX8.LIZ() && C736460Sui.LIZIZ(c1245830iWb.LIZIZ.externalEnterFrom)) {
            C1389890mGx c1389890mGx = new C1389890mGx(c19eg);
            c1389890mGx.LJIIJ(C1216270hkv.LIZJ(2131831029));
            c1389890mGx.LJIIJJI();
            return;
        }
        CampusFlowFragment campusFlowFragment = new CampusFlowFragment();
        Bundle bundle = new Bundle();
        C786410Ut5.LJJIZ(bundle, "CampusFlowFragmentInputLandingPage", c1245830iWb.LIZ);
        C786410Ut5.LJJIZ(bundle, "CampusFlowFragmentInputEnterFrom", c1245830iWb.LIZIZ);
        bundle.putBoolean("skip_fsfp", c1245830iWb.LIZJ);
        C786410Ut5.LJJIZ(bundle, "CampusFlowFragmentLandingTab", c1245830iWb.LIZLLL);
        C786410Ut5.LJJJI("CampusFlowFragmentInsertAwemeId", c1245830iWb.LJ, bundle);
        SchoolMutualStruct schoolMutualStruct = c1245830iWb.LJFF;
        if (schoolMutualStruct != null) {
            C786410Ut5.LJJIZ(bundle, "CampusFlowFragmentInputSchoolMutualStruct", schoolMutualStruct);
        }
        campusFlowFragment.setArguments(bundle);
        campusFlowFragment.show(c19eg.getSupportFragmentManager(), "CampusFlowFragment");
    }
}
