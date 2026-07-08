package com.ss.android.ugc.aweme.relation.service;

import X.AbstractC848400XPy;
import X.C0AJO;
import X.C0T09;
import X.C0XQ7;
import X.C1070930dyV;
import X.C11S5;
import X.C1234300iE0;
import X.C1239300iM4;
import X.C1242590iRN;
import X.C1720106oR;
import X.C19EG;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C451201pG;
import X.C451401pI;
import X.C451501pJ;
import X.C451701pL;
import X.C5180020c;
import X.InterfaceC1234320iE2;
import X.InterfaceC1234330iE3;
import X.InterfaceC1234410iEB;
import X.InterfaceC1234700iEe;
import X.InterfaceC1362350lYX;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.keva.Keva;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.relation.fragment.ShareInviteContentFragment;
import com.ss.android.ugc.aweme.relation.spi.IInviteFriendsService;
import kotlin.jvm.internal.AwS422S0200000_21;

/* JADX INFO: loaded from: classes20.dex */
public final class InviteFriendsService implements IInviteFriendsService {
    @Override // com.ss.android.ugc.aweme.relation.spi.IInviteFriendsService
    public final InterfaceC1234320iE2 LIZ() {
        return C1234300iE0.LIZ.LIZ().LIZIZ;
    }

    @Override // com.ss.android.ugc.aweme.relation.spi.IInviteFriendsService
    public final InterfaceC1234330iE3 LIZJ() {
        return C1234300iE0.LIZ.LIZ().LIZJ;
    }

    @Override // com.ss.android.ugc.aweme.relation.spi.IInviteFriendsService
    public final void LJI() {
        C451501pJ.LIZ.getClass();
        String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
        if (!(((Number) C0AJO.LIZ.getValue()).intValue() == 1)) {
            int i = C2187451AjH.LIZ;
            C1720106oR.LJI("LinkStatusFixer", "not enable fix!");
            return;
        }
        if (((Keva) C451501pJ.LIZIZ.getValue()).getBoolean(curUserId, false)) {
            int i2 = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(curUserId);
            sbLIZ.append(" has fixed!");
            C1720106oR.LJI("LinkStatusFixer", C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        if (((Keva) C451501pJ.LIZJ.getValue()).getBoolean(curUserId, false)) {
            C1239300iM4.LIZLLL(C451501pJ.LIZLLL.LJ(true).LJJIJIIJI(C11S5.LIZ()), C1239300iM4.LIZIZ, new C5180020c(curUserId, 15));
            return;
        }
        int i3 = C2187451AjH.LIZ;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(curUserId);
        sbLIZ2.append(" not shown!");
        C1720106oR.LJI("LinkStatusFixer", C2188811AlT.LIZIZ(sbLIZ2));
    }

    @Override // com.ss.android.ugc.aweme.relation.spi.IInviteFriendsService
    public final InterfaceC1234410iEB LJII() {
        return new C1242590iRN();
    }

    @Override // com.ss.android.ugc.aweme.relation.spi.IInviteFriendsService
    public final void LJFF(Activity activity) {
        C451701pL.LIZ.getClass();
        C451701pL.LIZ(activity);
    }

    @Override // com.ss.android.ugc.aweme.relation.spi.IInviteFriendsService
    public final C0T09 LIZIZ(C19EG c19eg, boolean z) {
        if (C451401pI.LIZ()) {
            return new C451201pG(c19eg, z);
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.relation.spi.IInviteFriendsService
    public final InterfaceC1362350lYX LIZLLL(final Context context, final Bundle bundle) {
        return new InterfaceC1362350lYX(context, bundle) { // from class: X.0iE8
            public final FragmentManager LIZ;
            public final C1390920mIc LIZIZ;

            @Override // X.InterfaceC1362350lYX
            public final void show() {
                LJJ(false);
            }

            @Override // X.InterfaceC1362350lYX
            public final void LJJ(boolean z) {
                int i = C2187451AjH.LIZ;
                C1720106oR.LJI("ShareInviteSheet", "show invite friends sheet!");
                FragmentManager fragmentManager = this.LIZ;
                if (fragmentManager != null) {
                    C13E8<String> c13e8 = C1391850mK7.LIZ;
                    TuxSheet tuxSheet = this.LIZIZ.LIZ;
                    tuxSheet.LLJJIJIIJIL = z;
                    tuxSheet.show(fragmentManager, "ShareInviteSheet");
                }
            }

            {
                FragmentManager supportFragmentManager;
                C19EG c19egLIZIZ = C1388190mED.LIZIZ(context);
                if (c19egLIZIZ != null) {
                    supportFragmentManager = c19egLIZIZ.getSupportFragmentManager();
                } else {
                    supportFragmentManager = null;
                }
                this.LIZ = supportFragmentManager;
                Fragment fragmentInstantiate = Fragment.instantiate(context, ShareInviteContentFragment.class.getName(), bundle);
                C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
                c1390920mIc.LIZ.LLJJIJI = fragmentInstantiate;
                c1390920mIc.LJIIIIZZ(1);
                this.LIZIZ = c1390920mIc;
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.relation.spi.IInviteFriendsService
    public final InterfaceC1234700iEe LJ(Context context, Bundle bundle, String str, String str2, AwS422S0200000_21 awS422S0200000_21, AwS422S0200000_21 awS422S0200000_212) {
        return new C1070930dyV(context, bundle, str, str2, awS422S0200000_21, awS422S0200000_212);
    }
}
