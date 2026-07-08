package com.ss.android.ugc.profile.business.ur.editprofileassem;

import X.C019F;
import X.C01GW;
import X.C11G4;
import X.C1215970hkR;
import X.C1245840iWc;
import X.C1245860iWe;
import X.C1245880iWg;
import X.C127K;
import X.C13LE;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C452501pT;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.EnumC1231460i9Q;
import X.InterfaceC2217461Bqa;
import android.content.Context;
import android.view.View;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.profile.business.ur.editprofileviewmodel.EditProfileSchoolViewModel;
import irm.AkS88S0100000_19;
import kotlin.jvm.internal.AFwS207S0000000_19;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS633S0100000_19;

/* JADX INFO: loaded from: classes20.dex */
public final class EditProfileSchoolCellAssem extends UIContentAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILJIL;
    public final AssemVMLazy LLIZLLLIL;
    public C127K LLJ;
    public final boolean LLJI;
    public final C01GW LLJIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(EditProfileSchoolCellAssem.class, "editProfileSchoolVM", "getEditProfileSchoolVM()Lcom/ss/android/ugc/profile/business/ur/editprofileviewmodel/EditProfileSchoolViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJILJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public EditProfileSchoolCellAssem() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(EditProfileSchoolViewModel.class);
        this.LLIZLLLIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), C019F.LIZ, C1637806bA.LIZ, new AwS563S0100000_19(c19719912DlLIZ, 2258), AFwS257S0000000_19.get$arr$(401), null, true);
        C1245840iWc.LIZ.getClass();
        this.LLJI = C1245840iWc.LIZ();
        this.LLJIJIL = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(426));
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        C127K c127k;
        C11G4 c11g4LIZ;
        String string;
        super.onViewCreated(view);
        if ((view instanceof C127K) && (c127k = (C127K) view) != null) {
            this.LLJ = c127k;
            if (this.LLJI) {
                Context context = getContext();
                if (context != null) {
                    string = context.getString(2131846966);
                } else {
                    string = null;
                }
                c127k.setTitle(string);
            }
            if (!((Boolean) this.LLJIJIL.getValue()).booleanValue()) {
                C127K c127k2 = this.LLJ;
                if (c127k2 != null) {
                    C786410Ut5.LLZLL(c127k2, 8);
                    return;
                }
                return;
            }
            AssemVMLazy assemVMLazy = this.LLIZLLLIL;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILJIL;
            C736680Sv4.LJIIIIZZ(this, assemVMLazy.getValue(), new C2217381BqS() { // from class: X.0hjO
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C338310DOb) obj).LL;
                }
            }, null, new AwS633S0100000_19(this, 135), 6);
            C127K c127k3 = this.LLJ;
            if (c127k3 != null && (c11g4LIZ = C1215970hkR.LIZ(c127k3)) != null) {
                c11g4LIZ.LJIILL(new AkS88S0100000_19(this, 5));
            }
            C1245880iWg c1245880iWg = C1245880iWg.LIZ;
            C1245860iWe c1245860iWe = new C1245860iWe(EnumC1231460i9Q.EDIT_PROFILE_PAGE, null, null);
            c1245880iWg.getClass();
            C1245880iWg.LJ(c1245860iWe, null);
        }
    }
}
