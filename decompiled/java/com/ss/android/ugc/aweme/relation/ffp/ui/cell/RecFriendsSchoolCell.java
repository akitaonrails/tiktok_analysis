package com.ss.android.ugc.aweme.relation.ffp.ui.cell;

import X.AbstractC1069740dwa;
import X.C01GW;
import X.C1069730dwZ;
import X.C1245830iWb;
import X.C1245840iWc;
import X.C1245860iWe;
import X.C1245880iWg;
import X.C1388190mED;
import X.C19EG;
import X.C384050F3z;
import X.C419910GdJ;
import X.C452501pT;
import X.C786410Ut5;
import X.EnumC1231460i9Q;
import X.EnumC338580DPc;
import android.content.Context;
import android.view.ViewGroup;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.ur.school.service.SchoolFlowLauncher;
import com.ss.android.ugc.ur.school.service.UserCampusService;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS560S0100000_16;

/* JADX INFO: loaded from: classes17.dex */
public final class RecFriendsSchoolCell extends RecFriendsTopBaseCell<C1069730dwZ> {
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new AwS560S0100000_16(this, 535));
    public final C01GW LLJ = C452501pT.LIZIZ(new AwS560S0100000_16(this, 536));

    public static boolean S5() {
        String currentUserID;
        UserCampusService userCampusService;
        IUserService iUserService = (IUserService) PluggableExtentionKt.pluggableSpi$default(IUserService.class, false, false, false, 14, null);
        return (iUserService == null || (currentUserID = iUserService.getCurrentUserID()) == null || (userCampusService = (UserCampusService) PluggableExtentionKt.pluggableSpi$default(UserCampusService.class, false, false, false, 14, null)) == null || userCampusService.LJFF(currentUserID) == null) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.relation.ffp.ui.cell.RecFriendsTopBaseCell
    public final void R5(AbstractC1069740dwa abstractC1069740dwa) {
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(this.itemView.getContext());
        if (c19egLIZIZ != null) {
            C1245880iWg c1245880iWg = C1245880iWg.LIZ;
            EnumC1231460i9Q enumC1231460i9Q = EnumC1231460i9Q.FIND_FRIENDS_PAGE;
            C1245860iWe c1245860iWe = new C1245860iWe(enumC1231460i9Q, null, null);
            boolean zS5 = S5();
            c1245880iWg.getClass();
            C1245880iWg.LIZLLL(c1245860iWe, zS5);
            boolean z = false;
            ((SchoolFlowLauncher) ServiceManager.get().getService(SchoolFlowLauncher.class)).LIZ(c19egLIZIZ, new C1245830iWb(EnumC338580DPc.FIND_SCHOOL_FRIENDS, new C1245860iWe(enumC1231460i9Q, null, null), z, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, z, 124));
        }
    }

    @Override // com.ss.android.ugc.aweme.relation.ffp.ui.cell.RecFriendsTopBaseCell, com.bytedance.ies.powerlist.PowerCell
    /* JADX INFO: renamed from: T5, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final void onBindItemView(C1069730dwZ c1069730dwZ) {
        int i;
        int i2;
        super.onBindItemView(c1069730dwZ);
        Context context = this.itemView.getContext();
        TuxIconView tuxIconViewL5 = L5();
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_person_phd_fill;
        c419910GdJ.LJ = Integer.valueOf(R.attr.ee);
        c419910GdJ.LIZJ = ((Number) this.LLIZLLLIL.getValue()).intValue();
        c419910GdJ.LIZIZ = ((Number) this.LLIZLLLIL.getValue()).intValue();
        tuxIconViewL5.setTuxIcon(c419910GdJ);
        ViewGroup.LayoutParams layoutParams = tuxIconViewL5.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = ((Number) this.LLJ.getValue()).intValue();
            layoutParams.width = ((Number) this.LLJ.getValue()).intValue();
            C786410Ut5.W5(tuxIconViewL5, layoutParams);
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.fe);
            c384050F3z.LIZJ = Float.valueOf(((Number) this.LLJ.getValue()).intValue());
            tuxIconViewL5.setBackground(c384050F3z.LIZ(context));
            C1245840iWc.LIZ.getClass();
            boolean zLIZ = C1245840iWc.LIZ();
            TuxTextView tuxTextViewN5 = N5();
            if (zLIZ) {
                i = 2131846973;
            } else {
                i = 2131846975;
            }
            tuxTextViewN5.setText(i);
            TuxTextView tuxTextView = this.LLILZIL;
            if (tuxTextView != null) {
                if (zLIZ) {
                    i2 = 2131846972;
                } else {
                    i2 = 2131846974;
                }
                tuxTextView.setText(i2);
            }
            C786410Ut5.LJLLLLLL(8, I5());
            C1245880iWg c1245880iWg = C1245880iWg.LIZ;
            C1245860iWe c1245860iWe = new C1245860iWe(EnumC1231460i9Q.FIND_FRIENDS_PAGE, null, null);
            Boolean boolValueOf = Boolean.valueOf(S5());
            c1245880iWg.getClass();
            C1245880iWg.LJ(c1245860iWe, boolValueOf);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
    }
}
