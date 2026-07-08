package com.ss.android.ugc.profile.business.ur.platform;

import X.AbstractC848400XPy;
import X.C0OBG;
import X.C0XQ7;
import X.C1216070hkb;
import X.C1216270hkv;
import X.C1248720ibG;
import X.C1251330ifT;
import X.C1252550ihR;
import X.C1252570ihT;
import X.C1252710ihh;
import X.C1253930ijf;
import X.C13BV;
import X.C13LE;
import X.C1558520qew;
import X.C19EG;
import X.C313510CQr;
import X.C724240Sb0;
import X.EnumC1248370iah;
import X.EnumC1249830id3;
import X.InterfaceC1215870hkH;
import X.InterfaceC1252070igf;
import com.bytedance.keva.Keva;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.profile.model.SignatureExtraInfo;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.profile.business.ur.header.IMineProfileEditAbility;
import com.ss.android.ugc.profile.business.ur.ui.ProfileEditBioFragment;
import com.ss.android.ugc.profile.platform.base.data.Describe;
import com.ss.android.ugc.profile.platform.business.header.business.bio.base.IHeaderBioAbility;
import com.ss.android.ugc.profile.platform.business.header.business.bio.business.signature.base.ProfileHeaderBaseSignatureComponent;
import com.ss.android.ugc.profile.platform.framework.aweme.profile.viewmodel.ProfileViewModel;
import java.util.List;

/* JADX INFO: loaded from: classes20.dex */
public final class ProfileHeaderTapToAddBioComponent extends ProfileHeaderBaseSignatureComponent {
    @Override // com.ss.android.ugc.profile.platform.business.header.business.bio.base.BioBaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void Oo() throws Throwable {
        C1251330ifT c1251330ifT = (C1251330ifT) C1252710ihh.LJIIIIZZ(this, C13LE.LIZ(InterfaceC1252070igf.class));
        User user = c1251330ifT != null ? c1251330ifT.LIZ : null;
        User curUser = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser();
        C1253930ijf c1253930ijf = C1253930ijf.LIZ;
        boolean z = curUser.getSignatureModifyTime() != 0;
        c1253930ijf.getClass();
        C1253930ijf.LIZIZ(z);
        C1252570ihT c1252570ihT = C1252570ihT.LIZ;
        C1252550ihR.LIZ.getClass();
        boolean z2 = !C1252550ihR.LJIIJJI(user, "bio");
        c1252570ihT.getClass();
        C1252570ihT.LIZLLL("bio", z2);
        C1252550ihR.LJII = false;
        TuxTextView tuxTextView = this.LLJLL;
        if (tuxTextView != null) {
            C1251330ifT c1251330ifT2 = (C1251330ifT) C1252710ihh.LJIIIIZZ(this, C13LE.LIZ(InterfaceC1252070igf.class));
            User user2 = c1251330ifT2 != null ? c1251330ifT2.LIZ : null;
            if (!C0OBG.LIZIZ(tuxTextView)) {
                Keva keva = C313510CQr.LIZ;
                if (keva != null) {
                    keva.storeBoolean("profile_v2_show_bio_hint", false);
                }
                String str = ProfileEditBioFragment._pnsPageId;
                ProfileEditBioFragment profileEditBioFragmentLIZ = C1216070hkb.LIZ(C1252550ihR.LJI(user2, "click_card", "bio"), "", C13BV.INSTANCE);
                profileEditBioFragmentLIZ.setUserVisibleHint(true);
                profileEditBioFragmentLIZ.LLJILJIL = new InterfaceC1215870hkH() { // from class: X.0iaj
                    @Override // X.InterfaceC1215870hkH
                    public final void LIZ(String str2, List<SignatureExtraInfo> list) {
                        IMineProfileEditAbility iMineProfileEditAbility = (IMineProfileEditAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this.LIZ), IMineProfileEditAbility.class, null);
                        if (iMineProfileEditAbility != null) {
                            iMineProfileEditAbility.sA(str2);
                        }
                    }
                };
                C19EG c19egLIZ = C724240Sb0.LIZ(this);
                if (c19egLIZ != null) {
                    profileEditBioFragmentLIZ.show(c19egLIZ.getSupportFragmentManager(), "EditNicknameDialog");
                }
                IHeaderBioAbility iHeaderBioAbility = (IHeaderBioAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), IHeaderBioAbility.class, null);
                if (iHeaderBioAbility != null) {
                    iHeaderBioAbility.Xu1(this.LLJLL);
                }
            }
        }
        kp(C1248720ibG.LIZ(EnumC1249830id3.HAS_TAP_BIO), EnumC1248370iah.BIO);
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.bio.business.signature.base.ProfileHeaderBaseSignatureComponent, com.ss.android.ugc.profile.platform.business.header.business.bio.business.signature.base.ISignatureAbility
    public final void IP2(String str, List list) {
        String text;
        Describe describe;
        if (!C313510CQr.LIZ()) {
            return;
        }
        ProfileViewModel profileViewModel = this.LLJLILLLLZIIL;
        if (profileViewModel != null) {
            C1252550ihR.LIZ.getClass();
            profileViewModel.hR2(C1252550ihR.LJIILLIIL());
        }
        lp(EnumC1248370iah.BIO, "HAS_TAP_BIO", C1216270hkv.LIZLLL(this.LLJLL));
        ProfileViewModel profileViewModel2 = this.LLJLILLLLZIIL;
        if (profileViewModel2 != null) {
            C1252550ihR.LIZ.getClass();
            profileViewModel2.hR2(C1252550ihR.LJIILLIIL());
        }
        C1252550ihR.LIZ.getClass();
        C1252550ihR.LJII = true;
        zp();
        TuxTextView tuxTextView = this.LLJLL;
        if (tuxTextView != null) {
            T t = this.LLJJLIIIJLLLLLLLZ;
            if (t != 0 && (describe = t.getDescribe()) != null) {
                text = describe.getText();
            } else {
                text = null;
            }
            tuxTextView.setText(text);
        }
    }
}
