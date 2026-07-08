package com.ss.android.ugc.profile.business.ur.editprofile.pronouns.ui;

import X.AbstractC1250290idn;
import X.C019F;
import X.C01GW;
import X.C0OM1;
import X.C1153890g8J;
import X.C11S5;
import X.C1232140iAW;
import X.C1233250iCJ;
import X.C1250250idj;
import X.C1250300ido;
import X.C1252710ihh;
import X.C1308910kAL;
import X.C13LE;
import X.C1559260qg8;
import X.C1637806bA;
import X.C1701940uOG;
import X.C19719912Dl;
import X.C1EDI;
import X.C20684815ws;
import X.C2217381BqS;
import X.C2344009Gk;
import X.C452501pT;
import X.C723580SZw;
import X.C724750Sbp;
import X.C736680Sv4;
import X.EnumC638250P1r;
import X.InterfaceC1233210iCF;
import X.InterfaceC1233230iCH;
import X.InterfaceC1233240iCI;
import X.InterfaceC1233260iCK;
import X.InterfaceC197023126r;
import X.InterfaceC2217461Bqa;
import X.InterfaceC447510Hgj;
import Y.AfS185S0100000_16;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.profile.business.ur.editprofile.pronouns.viewmodel.ProfileEditPronounsNavBarViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.AFwS303S0000000_19;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS668S0100000_19;

/* JADX INFO: loaded from: classes20.dex */
public final class ProfileEditPronounsNavBarAssem extends UIContentAssem implements InterfaceC1233260iCK {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJIJIL;
    public static final int LLJILJIL;
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2247));
    public final C1559260qg8 LLJ = new C1559260qg8(new C723580SZw(this, C1153890g8J.class, null), checkSupervisorPrepared());
    public final AssemVMLazy LLJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(ProfileEditPronounsNavBarAssem.class, "vm", "getVm()Lcom/ss/android/ugc/profile/business/ur/editprofile/pronouns/viewmodel/ProfileEditPronounsNavBarViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJIJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLJILJIL = 8;
    }

    public ProfileEditPronounsNavBarAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(ProfileEditPronounsNavBarViewModel.class);
        this.LLJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS563S0100000_19(c19719912DlLIZ, 2248), AFwS257S0000000_19.get$arr$(391), null, true);
    }

    private final void Oo() {
        C736680Sv4.LJIIIZ(this, Lo(), new C2217381BqS() { // from class: X.0iCG
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C995820c1M) obj).LLILLJJLI;
            }
        }, new C2217381BqS() { // from class: X.0iCC
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C995820c1M) obj).LL);
            }
        }, null, new AwS668S0100000_19(this, 15), 12);
        C736680Sv4.LJIIIIZZ(this, Lo(), new C2217381BqS() { // from class: X.0iCD
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C995820c1M) obj).LLILLL;
            }
        }, null, AFwS303S0000000_19.get$arr$(26), 6);
    }

    @Override // X.InterfaceC1233260iCK, X.InterfaceC724720Sbm, X.InterfaceC723730SaB
    public /* bridge */ /* synthetic */ String LIZ() {
        return null;
    }

    private final C1153890g8J Ho() {
        return (C1153890g8J) this.LLJ.getValue();
    }

    private final TuxNavBar Jo() {
        return (TuxNavBar) this.LLIZLLLIL.getValue();
    }

    private final ProfileEditPronounsNavBarViewModel Lo() {
        AssemVMLazy assemVMLazy = this.LLJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJIJIL;
        return (ProfileEditPronounsNavBarViewModel) assemVMLazy.getValue();
    }

    private final C1250250idj So() {
        String str;
        C1250250idj c1250250idj = new C1250250idj();
        C1153890g8J c1153890g8JHo = Ho();
        if (c1153890g8JHo == null || (str = c1153890g8JHo.LL) == null) {
            str = "";
        }
        c1250250idj.LIZJ = str;
        c1250250idj.LIZIZ = "title";
        return c1250250idj;
    }

    private final AbstractC1250290idn Vo() {
        String string;
        Resources resources;
        C1250300ido c1250300ido = new C1250300ido();
        c1250300ido.LIZIZ = "save";
        Context context = getContext();
        if (context == null || (resources = context.getResources()) == null || (string = resources.getString(2131833263)) == null) {
            string = "";
        }
        c1250300ido.LIZJ = string;
        c1250300ido.LIZ = new InterfaceC197023126r() { // from class: X.0iCE
            @Override // X.InterfaceC197023126r
            public final void LIZ() {
                this.LIZ.bp();
            }
        };
        return c1250300ido;
    }

    private final AbstractC1250290idn Zo() {
        String string;
        Resources resources;
        C1250300ido c1250300ido = new C1250300ido();
        c1250300ido.LIZIZ = "cancel";
        Context context = getContext();
        if (context == null || (resources = context.getResources()) == null || (string = resources.getString(2131828217)) == null) {
            string = "";
        }
        c1250300ido.LIZJ = string;
        c1250300ido.LIZLLL = EnumC638250P1r.SECONDARY;
        c1250300ido.LIZ = new InterfaceC197023126r() { // from class: X.0iCB
            @Override // X.InterfaceC197023126r
            public final void LIZ() {
                ((InterfaceC1233210iCF) C1252710ihh.LIZ(this.LIZ, C13LE.LIZ(InterfaceC1233210iCF.class), null)).gu(((InterfaceC1233230iCH) C1252710ihh.LIZ(this.LIZ, C13LE.LIZ(InterfaceC1233230iCH.class), null)).Vn());
            }
        };
        return c1250300ido;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0iCJ] */
    @Override // X.InterfaceC724720Sbm
    /* JADX INFO: renamed from: Go, reason: merged with bridge method [inline-methods] */
    public C1233250iCJ lt() {
        return new InterfaceC447510Hgj() { // from class: X.0iCJ
        };
    }

    public final void bp() {
        ((InterfaceC1233210iCF) C1252710ihh.LIZ(this, C13LE.LIZ(InterfaceC1233210iCF.class), null)).yh();
        ProfileEditPronounsNavBarViewModel profileEditPronounsNavBarViewModelLo = Lo();
        profileEditPronounsNavBarViewModelLo.LL.LIZ(((InterfaceC1233240iCI) profileEditPronounsNavBarViewModelLo.LLILLJJLI.getValue().getOperator()).LIZJ(((InterfaceC1233230iCH) C1252710ihh.LIZ(this, C13LE.LIZ(InterfaceC1233230iCH.class), null)).I9()).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS185S0100000_16(profileEditPronounsNavBarViewModelLo, 26), new AfS185S0100000_16(profileEditPronounsNavBarViewModelLo, 27)));
    }

    private final void No() {
        Integer numLIZJ;
        AbstractC1250290idn abstractC1250290idnZo = Zo();
        AbstractC1250290idn abstractC1250290idnVo = Vo();
        if (!C1EDI.LJ()) {
            C1250250idj c1250250idjSo = So();
            TuxNavBar tuxNavBarJo = Jo();
            C0OM1 c0om1 = new C0OM1();
            c0om1.LJ(abstractC1250290idnZo);
            c0om1.LIZJ = c1250250idjSo;
            c0om1.LIZIZ(abstractC1250290idnVo);
            c0om1.LIZLLL = true;
            tuxNavBarJo.setNavActions(c0om1);
            LLIZLLLIL();
            return;
        }
        TuxNavBar tuxNavBarJo2 = Jo();
        C0OM1 c0om12 = new C0OM1();
        c0om12.LJ(abstractC1250290idnZo);
        c0om12.LIZIZ(abstractC1250290idnVo);
        c0om12.LIZLLL = false;
        tuxNavBarJo2.setNavActions(c0om12);
        LLIZLLLIL();
        Context context = getContext();
        if (context == null || (numLIZJ = C1308910kAL.LIZJ(R.attr.uk, context)) == null) {
            return;
        }
        Jo().setNavBackground(numLIZJ.intValue());
    }

    @Override // X.InterfaceC1233260iCK
    public void LLFII() {
        Jo().LJJ(AFwS257S0000000_19.get$arr$(390), "save");
    }

    @Override // X.InterfaceC1233260iCK
    public void LLIZLLLIL() {
        Jo().LJJ(AFwS257S0000000_19.get$arr$(389), "save");
    }

    public final void ap(String str) {
        ((InterfaceC1233210iCF) C1252710ihh.LIZ(this, C13LE.LIZ(InterfaceC1233210iCF.class), null)).db(str);
        C1232140iAW.LIZ.getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("type", "pronoun");
        c2344009Gk.LJIIIIZZ("enter_method", "click_save");
        c2344009Gk.LJIIIIZZ("pronoun", str);
        C20684815ws.LJIILLIIL("save_profile", c2344009Gk.LIZ);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public void onViewCreated(View view) {
        No();
        Oo();
    }
}
