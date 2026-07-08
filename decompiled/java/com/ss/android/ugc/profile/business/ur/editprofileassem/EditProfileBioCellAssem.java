package com.ss.android.ugc.profile.business.ur.editprofileassem;

import X.C019F;
import X.C09R3;
import X.C0P0T;
import X.C0ZP4;
import X.C1155230gAT;
import X.C11G4;
import X.C1215820hkC;
import X.C1215970hkR;
import X.C1216270hkv;
import X.C1266280j3a;
import X.C127K;
import X.C13BV;
import X.C13LE;
import X.C1559260qg8;
import X.C1637806bA;
import X.C1637906bB;
import X.C19719912Dl;
import X.C1EDI;
import X.C2217381BqS;
import X.C259800zU;
import X.C723590SZx;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C786410Ut5;
import X.InterfaceC2217461Bqa;
import X.ViewOnLayoutChangeListenerC1265870j2v;
import X.ViewTreeObserverOnPreDrawListenerC1216040hkY;
import Y.ACListenerS154S0100000_19;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.profile.model.SignatureExtraInfo;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.profile.business.ur.editprofileviewmodel.EditProfileAITheaterViewModel;
import com.ss.android.ugc.profile.business.ur.editprofileviewmodel.EditProfileBioViewModel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.AwS455S0200000_19;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class EditProfileBioCellAssem extends UIContentAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJI;
    public final AssemVMLazy LLIZLLLIL;
    public final AssemVMLazy LLJ;
    public C127K LLJI;
    public LinearLayout LLJIJIL;
    public TuxTextView LLJILJIL;
    public TuxTextView LLJILJILJ;
    public C0P0T LLJILLL;
    public ViewTreeObserverOnPreDrawListenerC1216040hkY LLJJ;
    public View LLJJI;
    public final C1559260qg8 LLJJIII;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(EditProfileBioCellAssem.class, "editProfileBioVM", "getEditProfileBioVM()Lcom/ss/android/ugc/profile/business/ur/editprofileviewmodel/EditProfileBioViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(EditProfileBioCellAssem.class, "editProfileAITheaterVM", "getEditProfileAITheaterVM()Lcom/ss/android/ugc/profile/business/ur/editprofileviewmodel/EditProfileAITheaterViewModel;", 0);
        c09r3.getClass();
        LLJJIJI = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    public EditProfileBioCellAssem() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(EditProfileBioViewModel.class);
        C019F c019f = C019F.LIZ;
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLIZLLLIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, c1637906bB, new AwS563S0100000_19(c19719912DlLIZ, 2251), AFwS257S0000000_19.get$arr$(394), null, true);
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(EditProfileAITheaterViewModel.class);
        this.LLJ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c019f, c1637906bB, new AwS563S0100000_19(c19719912DlLIZ2, 2252), AFwS257S0000000_19.get$arr$(395), null, true);
        this.LLJJIII = new C1559260qg8(new C723590SZx(this, C1155230gAT.class, null), checkSupervisorPrepared());
    }

    public final EditProfileBioViewModel Ho() {
        AssemVMLazy assemVMLazy = this.LLIZLLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJI;
        return (EditProfileBioViewModel) assemVMLazy.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [T, X.0ZP4] */
    public final void Jo() {
        C259800zU c259800zU = new C259800zU();
        AssemVMLazy assemVMLazy = this.LLJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJI;
        c259800zU.element = C736680Sv4.LJIIIIZZ(this, assemVMLazy.getValue(), new C2217381BqS() { // from class: X.0hkZ
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C317400CcM) obj).LL;
            }
        }, null, new AwS455S0200000_19(this, (EditProfileBioCellAssem) c259800zU, (C259800zU<C0ZP4>) 26), 6);
    }

    public final void Lo() {
        View view = this.LLJJI;
        ViewTreeObserverOnPreDrawListenerC1216040hkY viewTreeObserverOnPreDrawListenerC1216040hkY = this.LLJJ;
        if (view != null && viewTreeObserverOnPreDrawListenerC1216040hkY != null) {
            C786410Ut5.D3(view.getViewTreeObserver(), viewTreeObserverOnPreDrawListenerC1216040hkY);
        }
        this.LLJJI = null;
        this.LLJJ = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00a9 A[PHI: r1
      0x00a9: PHI (r1v3 java.lang.String) = (r1v1 java.lang.String), (r1v7 java.lang.String) binds: [B:36:0x00a4, B:20:0x003c] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Go(android.view.View r8) {
        /*
            r7 = this;
            boolean r0 = X.C0OBG.LIZIZ(r8)
            if (r0 == 0) goto L7
            return
        L7:
            boolean r0 = r7.LLILZ
            if (r0 != 0) goto Lc
            return
        Lc:
            com.ss.android.ugc.profile.business.ur.editprofileviewmodel.EditProfileBioViewModel r0 = r7.Ho()
            com.ss.android.ugc.profile.business.ur.editprofileviewmodel.EditProfileSyncSharedViewModel r0 = r0.LL
            r6 = 0
            if (r0 != 0) goto L16
            r0 = r6
        L16:
            boolean r0 = r0.vQ2()
            if (r0 == 0) goto L1d
            return
        L1d:
            boolean r0 = X.C1EDI.LJ()
            java.lang.String r4 = ""
            if (r0 == 0) goto L91
            com.bytedance.tux.input.TuxTextView r0 = r7.LLJILJIL
            if (r0 == 0) goto L8f
            java.lang.CharSequence r0 = r0.getText()
        L2d:
            java.lang.String r1 = java.lang.String.valueOf(r0)
            r0 = 2131838878(0x7f11479e, float:1.9310992E38)
            java.lang.String r0 = X.C1216270hkv.LIZJ(r0)
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto La9
        L3e:
            com.ss.android.ugc.profile.business.ur.editprofileviewmodel.EditProfileBioViewModel r5 = r7.Ho()
            java.lang.String r0 = com.ss.android.ugc.profile.business.ur.ui.ProfileEditBioFragment._pnsPageId
            X.002o r0 = r5.getState()
            X.0hkB r0 = (X.C1215810hkB) r0
            java.util.List<com.ss.android.ugc.aweme.profile.model.SignatureExtraInfo> r3 = r0.LLILLJJLI
            X.0ihR r2 = X.C1252550ihR.LIZ
            com.ss.android.ugc.aweme.profile.model.User r0 = r5.LLILLJJLI
            if (r0 == 0) goto L53
            r6 = r0
        L53:
            java.lang.String r0 = "bio"
            java.lang.String[] r1 = new java.lang.String[]{r0}
            r2.getClass()
            java.lang.String r0 = "click_save"
            android.os.Bundle r2 = X.C1252550ihR.LJI(r6, r0, r1)
            java.lang.String r1 = "enter_from"
            java.lang.String r0 = "edit_profile_page"
            X.C786410Ut5.LJJJI(r1, r0, r2)
            com.ss.android.ugc.profile.business.ur.ui.ProfileEditBioFragment r2 = X.C1216070hkb.LIZ(r2, r4, r3)
            r0 = 1
            r2.setUserVisibleHint(r0)
            X.0hkD r0 = new X.0hkD
            r0.<init>()
            r2.LLJILJIL = r0
            X.0P0T r0 = r7.LLJILLL
            if (r0 == 0) goto L7f
            r0.dismiss()
        L7f:
            X.19EG r0 = X.C724240Sb0.LIZ(r7)
            if (r0 == 0) goto L8e
            androidx.fragment.app.FragmentManager r1 = r0.getSupportFragmentManager()
            java.lang.String r0 = "EditBioDialog"
            r2.show(r1, r0)
        L8e:
            return
        L8f:
            r0 = r6
            goto L2d
        L91:
            X.127K r0 = r7.LLJI
            if (r0 == 0) goto La7
            java.lang.String r1 = X.C1215970hkR.LIZIZ(r0)
        L99:
            r0 = 2131833250(0x7f1131a2, float:1.9299577E38)
            java.lang.String r0 = X.C1216270hkv.LIZJ(r0)
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto La9
            goto L3e
        La7:
            r1 = r4
            goto L99
        La9:
            r4 = r1
            goto L3e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.profile.business.ur.editprofileassem.EditProfileBioCellAssem.Go(android.view.View):void");
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        C127K c127k;
        User user;
        boolean zContains;
        LinearLayout linearLayout;
        CharSequence text;
        TuxTextView tuxTextView;
        TuxTextView tuxTextView2;
        super.onViewCreated(view);
        User user2 = null;
        if (C1EDI.LJ()) {
            if ((view instanceof LinearLayout) && (linearLayout = (LinearLayout) view) != null) {
                this.LLJIJIL = linearLayout;
                TuxTextView tuxTextView3 = (TuxTextView) linearLayout.findViewById(R.id.z31);
                this.LLJILJIL = tuxTextView3;
                if (tuxTextView3 != null) {
                    text = tuxTextView3.getText();
                } else {
                    text = null;
                }
                if (Intrinsics.LJFF(text, C1216270hkv.LIZJ(2131838878)) && (tuxTextView2 = this.LLJILJIL) != null) {
                    tuxTextView2.setTuxFont(41);
                }
                LinearLayout linearLayout2 = this.LLJIJIL;
                if (linearLayout2 != null) {
                    tuxTextView = (TuxTextView) linearLayout2.findViewById(R.id.z4h);
                } else {
                    tuxTextView = null;
                }
                this.LLJILJILJ = tuxTextView;
                if (view.getResources().getConfiguration().screenWidthDp < 320) {
                    TuxTextView tuxTextView4 = this.LLJILJILJ;
                    if (tuxTextView4 != null) {
                        tuxTextView4.setWidth(C1216270hkv.LIZIZ(100));
                    }
                } else {
                    TuxTextView tuxTextView5 = this.LLJILJILJ;
                    if (tuxTextView5 != null) {
                        tuxTextView5.setWidth(C1216270hkv.LIZIZ(110));
                    }
                }
                LinearLayout linearLayout3 = this.LLJIJIL;
                if (linearLayout3 != null) {
                    C786410Ut5.R7(linearLayout3, new ACListenerS154S0100000_19(this, 162));
                }
                LinearLayout linearLayout4 = this.LLJIJIL;
                if (linearLayout4 != null) {
                    linearLayout4.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC1265870j2v(this, 4));
                }
            } else {
                return;
            }
        } else if ((view instanceof C127K) && (c127k = (C127K) view) != null) {
            this.LLJI = c127k;
            C11G4 c11g4LIZ = C1215970hkR.LIZ(c127k);
            if (c11g4LIZ != null) {
                c11g4LIZ.LJIILL(new ACListenerS154S0100000_19(this, 163));
            }
            C127K c127k2 = this.LLJI;
            if (c127k2 != null) {
                c127k2.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC1265870j2v(this, 5));
            }
        } else {
            return;
        }
        EditProfileBioViewModel editProfileBioViewModelHo = Ho();
        selectSubscribe(editProfileBioViewModelHo, new C2217381BqS() { // from class: X.0hkW
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1215810hkB) obj).LL;
            }
        }, new C2217381BqS() { // from class: X.0hkU
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((C1215810hkB) obj).LLILLL);
            }
        }, new C2217381BqS() { // from class: X.0hkV
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C1215810hkB) obj).LLILZ);
            }
        }, C736820SvI.LIZIZ(editProfileBioViewModelHo.usedInReusedScene), null, new C1266280j3a(this, 3));
        EditProfileBioViewModel editProfileBioViewModelHo2 = Ho();
        User user3 = editProfileBioViewModelHo2.LLILLJJLI;
        if (user3 == null) {
            user = null;
        } else {
            user = user3;
        }
        String str = user.signature;
        if (str == null) {
            str = "";
        }
        if (user3 == null) {
            user3 = null;
        }
        int signatureModifyTime = user3.getSignatureModifyTime();
        User user4 = editProfileBioViewModelHo2.LLILLJJLI;
        if (user4 == null) {
            user4 = null;
        }
        List<SignatureExtraInfo> signatureExtra = user4.getSignatureExtra();
        if (signatureExtra == null) {
            signatureExtra = C13BV.INSTANCE;
        }
        User user5 = editProfileBioViewModelHo2.LLILLJJLI;
        if (user5 != null) {
            user2 = user5;
        }
        List<String> list = user2.boldFields;
        if (list != null) {
            zContains = list.contains("bio");
        } else {
            zContains = false;
        }
        editProfileBioViewModelHo2.setState(new C1215820hkC(signatureModifyTime, str, signatureExtra, zContains));
    }
}
