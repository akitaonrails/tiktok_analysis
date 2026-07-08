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
import android.view.View;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.profile.model.ProfileNgoStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.profile.business.ur.editprofileviewmodel.EditProfileNGOViewModel;
import irm.AkS88S0100000_19;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.AwS228S0300000_19;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS668S0100000_19;

/* JADX INFO: loaded from: classes20.dex */
public final class EditProfileNGOCellAssem extends UIContentAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJIJIL;
    public final AssemVMLazy LLIZLLLIL;
    public C127K LLJ;
    public final C1559260qg8 LLJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(EditProfileNGOCellAssem.class, "editProfileNgoVM", "getEditProfileNgoVM()Lcom/ss/android/ugc/profile/business/ur/editprofileviewmodel/EditProfileNGOViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJIJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public EditProfileNGOCellAssem() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(EditProfileNGOViewModel.class);
        this.LLIZLLLIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), C019F.LIZ, C1637806bA.LIZ, new AwS563S0100000_19(c19719912DlLIZ, 2253), AFwS257S0000000_19.get$arr$(396), null, true);
        this.LLJI = new C1559260qg8(new C723590SZx(this, C1155230gAT.class, null), checkSupervisorPrepared());
    }

    public final EditProfileNGOViewModel Go() {
        AssemVMLazy assemVMLazy = this.LLIZLLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJIJIL;
        return (EditProfileNGOViewModel) assemVMLazy.getValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        C127K c127k;
        String name;
        super.onViewCreated(view);
        ProfileNgoStruct profileNgoStruct = null;
        if ((view instanceof C127K) && (c127k = (C127K) view) != null) {
            this.LLJ = c127k;
            C11G4 c11g4LIZ = C1215970hkR.LIZ(c127k);
            if (c11g4LIZ != null) {
                c11g4LIZ.LJIILL(new AkS88S0100000_19(this, 4));
            }
            C736680Sv4.LJIIIZ(this, Go(), new C2217381BqS() { // from class: X.0hjQ
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C1215360hjS) obj).LLILLJJLI;
                }
            }, new C2217381BqS() { // from class: X.0hjP
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return Boolean.valueOf(((C1215360hjS) obj).LLILZ);
                }
            }, null, new AwS668S0100000_19(this, 16), 12);
            EditProfileNGOViewModel editProfileNGOViewModelGo = Go();
            User user = editProfileNGOViewModelGo.LLILLJJLI;
            if (user == null) {
                user = null;
            }
            ProfileNgoStruct profileNgoStruct2 = user.getProfileNgoStruct();
            if (profileNgoStruct2 != null && (name = profileNgoStruct2.getName()) != null && name.length() != 0) {
                profileNgoStruct = profileNgoStruct2;
            }
            editProfileNGOViewModelGo.setState(new AwS228S0300000_19(profileNgoStruct, profileNgoStruct2, editProfileNGOViewModelGo, 29));
        }
    }
}
