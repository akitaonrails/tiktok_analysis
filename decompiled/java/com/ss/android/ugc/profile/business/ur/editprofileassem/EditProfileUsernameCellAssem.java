package com.ss.android.ugc.profile.business.ur.editprofileassem;

import X.C019F;
import X.C01GW;
import X.C0PEM;
import X.C10EU;
import X.C1155230gAT;
import X.C11G4;
import X.C1215490hjf;
import X.C1215970hkR;
import X.C127K;
import X.C13081059z;
import X.C13LE;
import X.C1559260qg8;
import X.C1637806bA;
import X.C19719912Dl;
import X.C1DFH;
import X.C2107308Nj;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C2296808zG;
import X.C23250099c;
import X.C452501pT;
import X.C723590SZx;
import X.C724750Sbp;
import X.C736680Sv4;
import X.InterfaceC2217461Bqa;
import Y.ACListenerS154S0100000_19;
import android.view.View;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.profile.business.ur.editprofileviewmodel.EditProfileNamesViewModel;
import com.ss.android.ugc.profile.business.ur.editprofileviewmodel.EditProfileSyncSharedViewModel;
import kotlin.jvm.internal.AFwS207S0000000_19;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS633S0100000_19;
import kotlin.jvm.internal.AwS668S0100000_19;

/* JADX INFO: loaded from: classes20.dex */
public final class EditProfileUsernameCellAssem extends UIContentAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILJIL;
    public final AssemVMLazy LLIZLLLIL;
    public C127K LLJ;
    public final C1559260qg8 LLJI;
    public final C01GW LLJIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(EditProfileUsernameCellAssem.class, "editProfileNamesVM", "getEditProfileNamesVM()Lcom/ss/android/ugc/profile/business/ur/editprofileviewmodel/EditProfileNamesViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJILJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public EditProfileUsernameCellAssem() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(EditProfileNamesViewModel.class);
        this.LLIZLLLIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), C019F.LIZ, C1637806bA.LIZ, new AwS563S0100000_19(c19719912DlLIZ, 2259), AFwS257S0000000_19.get$arr$(402), null, true);
        this.LLJI = new C1559260qg8(new C723590SZx(this, C1155230gAT.class, null), checkSupervisorPrepared());
        this.LLJIJIL = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(427));
    }

    public final EditProfileNamesViewModel Go() {
        AssemVMLazy assemVMLazy = this.LLIZLLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILJIL;
        return (EditProfileNamesViewModel) assemVMLazy.getValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        C127K c127k;
        super.onViewCreated(view);
        if ((view instanceof C127K) && (c127k = (C127K) view) != null) {
            this.LLJ = c127k;
            C11G4 c11g4LIZ = C1215970hkR.LIZ(c127k);
            if (c11g4LIZ != null) {
                c11g4LIZ.LJIILL(new ACListenerS154S0100000_19(this, 168));
            }
            C736680Sv4.LJIIIZ(this, Go(), new C2217381BqS() { // from class: X.0hje
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C1215500hjg) obj).LL;
                }
            }, new C2217381BqS() { // from class: X.0hjG
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return Boolean.valueOf(((C1215500hjg) obj).LLILZLL);
                }
            }, null, new AwS668S0100000_19(this, 19), 12);
            C736680Sv4.LJIIIIZZ(this, Go(), new C2217381BqS() { // from class: X.0hjc
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C1215500hjg) obj).LLILZIL;
                }
            }, null, new AwS633S0100000_19(this, 136), 6);
            EditProfileSyncSharedViewModel editProfileSyncSharedViewModel = null;
            C736680Sv4.LJIIIIZZ(this, Go(), new C2217381BqS() { // from class: X.0hjd
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C1215500hjg) obj).LLJILJIL;
                }
            }, null, new AwS633S0100000_19(this, 137), 6);
            EditProfileNamesViewModel editProfileNamesViewModelGo = Go();
            if (editProfileNamesViewModelGo.LLILLL != 0) {
                C1DFH c1dfh = C0PEM.LIZ;
                C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C13081059z(editProfileNamesViewModelGo, null), 3);
            }
            User user = editProfileNamesViewModelGo.LLILLJJLI;
            if (user == null) {
                user = null;
            }
            String strLIZJ = C10EU.LIZJ(user);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("tiktok.com/@");
            sbLIZ.append(strLIZJ);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            EditProfileSyncSharedViewModel editProfileSyncSharedViewModel2 = editProfileNamesViewModelGo.LL;
            if (editProfileSyncSharedViewModel2 != null) {
                editProfileSyncSharedViewModel = editProfileSyncSharedViewModel2;
            }
            editProfileNamesViewModelGo.setState(new C1215490hjf(strLIZJ, strLIZIZ, editProfileNamesViewModelGo.vQ2(strLIZJ, editProfileSyncSharedViewModel.vQ2())));
        }
    }
}
