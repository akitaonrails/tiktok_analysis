package com.ss.android.ugc.profile.business.ur.editprofileassem;

import X.C019F;
import X.C1155230gAT;
import X.C11G4;
import X.C1215970hkR;
import X.C127K;
import X.C13LE;
import X.C1559260qg8;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C723590SZx;
import X.C724750Sbp;
import X.C736680Sv4;
import X.InterfaceC2217461Bqa;
import Y.ACListenerS154S0100000_19;
import android.view.View;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.model.UserPronounsInfo;
import com.ss.android.ugc.profile.business.ur.editprofileviewmodel.EditProfilePronounViewModel;
import com.ss.android.ugc.profile.business.ur.editprofileviewmodel.EditProfileSyncSharedViewModel;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.AwS106S0110000_19;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS668S0100000_19;

/* JADX INFO: loaded from: classes20.dex */
public final class EditProfilePronounCellAssem extends UIContentAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJIJIL;
    public final AssemVMLazy LLIZLLLIL;
    public C127K LLJ;
    public final C1559260qg8 LLJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(EditProfilePronounCellAssem.class, "editProfilePronounVM", "getEditProfilePronounVM()Lcom/ss/android/ugc/profile/business/ur/editprofileviewmodel/EditProfilePronounViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJIJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public EditProfilePronounCellAssem() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(EditProfilePronounViewModel.class);
        this.LLIZLLLIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), C019F.LIZ, C1637806bA.LIZ, new AwS563S0100000_19(c19719912DlLIZ, 2257), AFwS257S0000000_19.get$arr$(400), null, true);
        this.LLJI = new C1559260qg8(new C723590SZx(this, C1155230gAT.class, null), checkSupervisorPrepared());
    }

    public final EditProfilePronounViewModel Go() {
        AssemVMLazy assemVMLazy = this.LLIZLLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJIJIL;
        return (EditProfilePronounViewModel) assemVMLazy.getValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        C127K c127k;
        super.onViewCreated(view);
        EditProfileSyncSharedViewModel editProfileSyncSharedViewModel = null;
        if ((view instanceof C127K) && (c127k = (C127K) view) != null) {
            this.LLJ = c127k;
            C11G4 c11g4LIZ = C1215970hkR.LIZ(c127k);
            if (c11g4LIZ != null) {
                c11g4LIZ.LJIILL(new ACListenerS154S0100000_19(this, 167));
            }
            C736680Sv4.LJIIIZ(this, Go(), new C2217381BqS() { // from class: X.0hkL
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C1215890hkJ) obj).LL;
                }
            }, new C2217381BqS() { // from class: X.0hkK
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return Boolean.valueOf(((C1215890hkJ) obj).LLILLJJLI);
                }
            }, null, new AwS668S0100000_19(this, 18), 12);
            EditProfilePronounViewModel editProfilePronounViewModelGo = Go();
            User user = editProfilePronounViewModelGo.LLILLJJLI;
            if (user == null) {
                user = null;
            }
            UserPronounsInfo pronounsInfo = user.getPronounsInfo();
            EditProfileSyncSharedViewModel editProfileSyncSharedViewModel2 = editProfilePronounViewModelGo.LL;
            if (editProfileSyncSharedViewModel2 != null) {
                editProfileSyncSharedViewModel = editProfileSyncSharedViewModel2;
            }
            editProfilePronounViewModelGo.setState(new AwS106S0110000_19(pronounsInfo, editProfileSyncSharedViewModel.vQ2(), 9));
            editProfilePronounViewModelGo.vQ2(pronounsInfo);
        }
    }
}
