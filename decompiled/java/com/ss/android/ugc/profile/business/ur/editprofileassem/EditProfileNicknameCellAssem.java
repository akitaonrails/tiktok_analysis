package com.ss.android.ugc.profile.business.ur.editprofileassem;

import X.C019F;
import X.C1155230gAT;
import X.C11G4;
import X.C1215510hjh;
import X.C1215970hkR;
import X.C1266290j3b;
import X.C127K;
import X.C1388190mED;
import X.C13LE;
import X.C1559260qg8;
import X.C1637806bA;
import X.C19719912Dl;
import X.C19EG;
import X.C2217381BqS;
import X.C723590SZx;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.InterfaceC2217461Bqa;
import Y.ACListenerS154S0100000_19;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.ecommerce.showcase.service.IECommerceShowcaseService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.profile.model.SpecialAccount;
import com.ss.android.ugc.aweme.profile.model.TTSeller;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.profile.business.ur.editprofileviewmodel.EditProfileNamesViewModel;
import java.util.List;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS633S0100000_19;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class EditProfileNicknameCellAssem extends UIContentAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJIJIL;
    public final AssemVMLazy LLIZLLLIL;
    public C127K LLJ;
    public final C1559260qg8 LLJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(EditProfileNicknameCellAssem.class, "editProfileNamesVM", "getEditProfileNamesVM()Lcom/ss/android/ugc/profile/business/ur/editprofileviewmodel/EditProfileNamesViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJIJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public EditProfileNicknameCellAssem() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(EditProfileNamesViewModel.class);
        this.LLIZLLLIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), C019F.LIZ, C1637806bA.LIZ, new AwS563S0100000_19(c19719912DlLIZ, 2255), AFwS257S0000000_19.get$arr$(398), null, true);
        this.LLJI = new C1559260qg8(new C723590SZx(this, C1155230gAT.class, null), checkSupervisorPrepared());
    }

    public final EditProfileNamesViewModel Ho() {
        AssemVMLazy assemVMLazy = this.LLIZLLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJIJIL;
        return (EditProfileNamesViewModel) assemVMLazy.getValue();
    }

    public final boolean Go() {
        TTSeller seller;
        C19EG c19egLIZIZ;
        FragmentManager supportFragmentManager;
        IECommerceShowcaseService iECommerceShowcaseService;
        User user = Ho().LLILLJJLI;
        if (user == null) {
            user = null;
        }
        SpecialAccount specialAccount = user.specialAccount;
        boolean z = false;
        if (specialAccount != null && (seller = specialAccount.getSeller()) != null && seller.getType() == 1 && seller.isAllowListSeller()) {
            z = true;
            Context context = getContext();
            if (context != null && (c19egLIZIZ = C1388190mED.LIZIZ(context)) != null && (supportFragmentManager = c19egLIZIZ.getSupportFragmentManager()) != null && (iECommerceShowcaseService = (IECommerceShowcaseService) PluggableExtentionKt.pluggableSpi$default(IECommerceShowcaseService.class, false, false, false, 14, null)) != null) {
                iECommerceShowcaseService.LJ(supportFragmentManager);
            }
        }
        return z;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        C127K c127k;
        super.onViewCreated(view);
        User user = null;
        if ((view instanceof C127K) && (c127k = (C127K) view) != null) {
            this.LLJ = c127k;
            C11G4 c11g4LIZ = C1215970hkR.LIZ(c127k);
            if (c11g4LIZ != null) {
                c11g4LIZ.LJIILL(new ACListenerS154S0100000_19(this, 165));
            }
            EditProfileNamesViewModel editProfileNamesViewModelHo = Ho();
            selectSubscribe(editProfileNamesViewModelHo, new C2217381BqS() { // from class: X.0hjm
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C1215500hjg) obj).LLILLJJLI;
                }
            }, new C2217381BqS() { // from class: X.0hji
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return Integer.valueOf(((C1215500hjg) obj).LLILZ);
                }
            }, new C2217381BqS() { // from class: X.0hjj
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return Boolean.valueOf(((C1215500hjg) obj).LLIZ);
                }
            }, new C2217381BqS() { // from class: X.0hjl
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return Boolean.valueOf(((C1215500hjg) obj).LLIZLLLIL);
                }
            }, C736820SvI.LIZIZ(editProfileNamesViewModelHo.usedInReusedScene), null, new C1266290j3b(this, 1));
            C736680Sv4.LJIIIIZZ(this, Ho(), new C2217381BqS() { // from class: X.0hjk
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C1215500hjg) obj).LLJ;
                }
            }, null, new AwS633S0100000_19(this, 134), 6);
            EditProfileNamesViewModel editProfileNamesViewModelHo2 = Ho();
            User user2 = editProfileNamesViewModelHo2.LLILLJJLI;
            if (user2 == null) {
                user2 = null;
            }
            String nickname = user2.getNickname();
            if (nickname == null) {
                nickname = "";
            }
            User user3 = editProfileNamesViewModelHo2.LLILLJJLI;
            if (user3 == null) {
                user3 = null;
            }
            int nickNameModifyTs = user3.getNickNameModifyTs();
            User user4 = editProfileNamesViewModelHo2.LLILLJJLI;
            if (user4 == null) {
                user4 = null;
            }
            boolean z = true;
            boolean zContains = false;
            if (!Intrinsics.LJFF(user4.getUniqueId(), nickname) && nickname.length() != 0) {
                z = false;
            }
            User user5 = editProfileNamesViewModelHo2.LLILLJJLI;
            if (user5 != null) {
                user = user5;
            }
            List<String> list = user.boldFields;
            if (list != null) {
                zContains = list.contains("nickname");
            }
            editProfileNamesViewModelHo2.setState(new C1215510hjh(nickname, nickNameModifyTs, z, zContains));
        }
    }
}
