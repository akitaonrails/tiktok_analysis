package com.ss.android.ugc.aweme.tako.otherpage.sheet;

import X.AbstractC738140SxQ;
import X.C019F;
import X.C01GW;
import X.C09R3;
import X.C0DSB;
import X.C1220000hqw;
import X.C1295960jpS;
import X.C13LC;
import X.C13LE;
import X.C14FV;
import X.C14TF;
import X.C1558520qew;
import X.C1637806bA;
import X.C1637906bB;
import X.C1855770yON;
import X.C1860520yW2;
import X.C1862090yYZ;
import X.C1862330yYx;
import X.C1862760yZe;
import X.C1863130yaF;
import X.C1863850ybP;
import X.C1864200yby;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C326630CrF;
import X.C418440Gaw;
import X.C426770GoN;
import X.C451610HnL;
import X.C452070Ho5;
import X.C452501pT;
import X.C723700Sa8;
import X.C724750Sbp;
import X.C786410Ut5;
import X.C814420VxA;
import X.C844350XAj;
import X.C960203pA;
import X.EnumC1863020ya4;
import X.InterfaceC2217461Bqa;
import Y.ALAdapterS12S0300000_27;
import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.tako.botpage.components.action.multiple.TakoMultipleSelectVM;
import com.ss.android.ugc.aweme.tako.botpage.vm.ability.ITakoScreenTypeAbility;
import com.ss.android.ugc.aweme.tako.otherpage.botcenter.TakoBotCenterViewModel;
import com.ss.android.ugc.aweme.tako.signal.ITakoContextAbility;
import com.ss.android.ugc.aweme.tako.startup.onboarding.vm.TakoOnboardingViewModel;
import com.ss.android.ugc.aweme.tako.ui.TakoChatUIAbility;
import com.ss.android.ugc.aweme.tako.vm.TakoFragmentViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS269S0000000_27;
import kotlin.jvm.internal.AwS571S0100000_27;
import kotlin.jvm.internal.AwS606S0100000_27;
import kotlin.jvm.internal.AwS641S0100000_27;
import org.json.JSONException;

/* JADX INFO: loaded from: classes28.dex */
public final class SevenSheetTopTitleAssem extends UISlotAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLILZ;
    public TuxTextView LLJJI;
    public TuxTextView LLJJIII;
    public TuxIconView LLJJIJI;
    public TuxIconView LLJJIJIIJIL;
    public TuxTextView LLJJIJIL;
    public SmartImageView LLJJJ;
    public View LLJJJIL;
    public View LLJJJJ;
    public View LLJJJJJIL;
    public View LLJJJJLIIL;
    public View LLJJL;
    public View LLJJLIIIJLLLLLLLZ;
    public boolean LLJL;
    public C426770GoN LLJLIL;
    public boolean LLJLILLLLZIIL;
    public C1295960jpS LLJLL;
    public final AssemVMLazy LLJLLIL;
    public final AssemVMLazy LLJLLL;
    public final C01GW LLJZ;
    public final C01GW LLJZIJLIL;
    public final C01GW LLL;
    public final C01GW LLLF;
    public final C01GW LLLFF;
    public boolean LLLFFI;
    public boolean LLLFZ;
    public View LLLI;
    public boolean LLLII;
    public View LLLIIII;
    public View LLLIIIIL;
    public View LLLIIIL;
    public boolean LLLIIL;
    public final AssemVMLazy LLLIILIL;
    public final C1862760yZe LLLIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SevenSheetTopTitleAssem.class, "multipleSelectVM", "getMultipleSelectVM()Lcom/ss/android/ugc/aweme/tako/botpage/components/action/multiple/TakoMultipleSelectVM;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(SevenSheetTopTitleAssem.class, "sheetVM", "getSheetVM()Lcom/ss/android/ugc/aweme/tako/otherpage/sheet/TakoSheetVM;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(SevenSheetTopTitleAssem.class, "fragmentVM", "getFragmentVM()Lcom/ss/android/ugc/aweme/tako/vm/TakoFragmentViewModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(SevenSheetTopTitleAssem.class, "onboardingVM", "getOnboardingVM()Lcom/ss/android/ugc/aweme/tako/startup/onboarding/vm/TakoOnboardingViewModel;", 0);
        c09r3.getClass();
        LLLILZ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4};
    }

    /* JADX WARN: Type inference failed for: r0v35, types: [X.0yZe] */
    public SevenSheetTopTitleAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(TakoMultipleSelectVM.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLJLLIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, c1637906bB, new AwS571S0100000_27(c19719912DlLIZ, 916), AFwS269S0000000_27.get$arr$(287), null, true);
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(TakoSheetVM.class);
        this.LLJLLL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c019f, c1637906bB, new AwS571S0100000_27(c19719912DlLIZ2, 917), AFwS269S0000000_27.get$arr$(288), null, true);
        this.LLJZ = C452501pT.LIZIZ(new AwS571S0100000_27(this, 922));
        this.LLJZIJLIL = C452501pT.LIZIZ(new AwS571S0100000_27(this, 923));
        this.LLL = C452501pT.LIZIZ(new AwS571S0100000_27(this, 913));
        this.LLLF = C452501pT.LIZIZ(new AwS571S0100000_27(this, 921));
        this.LLLFF = C452501pT.LIZIZ(new AwS571S0100000_27(this, 914));
        C13LE.LIZ(TakoBotCenterViewModel.class);
        AFwS269S0000000_27.get$arr$(291);
        new AwS571S0100000_27((AbstractC738140SxQ) this, 920);
        new C451610HnL(this, true, true);
        new C723700Sa8(this);
        new C452070Ho5();
        C724750Sbp.LJII(this);
        C1220000hqw.LIZ(this);
        C19719912Dl c19719912DlLIZ3 = C13LE.LIZ(TakoFragmentViewModel.class);
        C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ3), c019f, c1637906bB, new AwS571S0100000_27(c19719912DlLIZ3, 918), AFwS269S0000000_27.get$arr$(289), null, true);
        C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
        C19719912Dl c19719912DlLIZ4 = C13LE.LIZ(TakoOnboardingViewModel.class);
        this.LLLIILIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ4), c019f, c1637906bB, new AwS571S0100000_27(c19719912DlLIZ4, 919), AFwS269S0000000_27.get$arr$(290), null, true);
        this.LLLIL = new C14FV() { // from class: X.0yZe
            @Override // X.C14FV
            public final void LIZIZ() throws JSONException {
                C13LC<C1863850ybP> c13lcT71;
                C1863850ybP c1863850ybP;
                ITakoContextAbility iTakoContextAbilityMp = this.LIZ.mp();
                if (iTakoContextAbilityMp == null || (c13lcT71 = iTakoContextAbilityMp.T71()) == null || (c1863850ybP = (C1863850ybP) c13lcT71.LIZIZ()) == null) {
                    return;
                }
                C1862330yYx c1862330yYx = C1862330yYx.LIZ;
                String str = c1863850ybP.LLILZIL;
                String str2 = c1863850ybP.LLILZLL;
                if (str2 == null) {
                    str2 = "";
                }
                C1862330yYx.LJLLL(c1862330yYx, str, str2, c1863850ybP.LLIZ, c1863850ybP.LL, c1863850ybP.LLILLJJLI, "popup");
            }

            @Override // X.C14FV
            public final void onSuccess() {
                this.LIZ.op();
            }

            @Override // X.C14FV
            public final void LIZ(String str) throws JSONException {
                this.LIZ.Ap(str);
                this.LIZ.op();
            }

            @Override // X.C14FV
            public final void LIZJ(String str) throws JSONException {
                this.LIZ.Ap(str);
            }
        };
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.fm1;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onResume_isOnResumeEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    public final void Fp() {
        if (!this.LLLFFI) {
            View view = this.LLLIIII;
            if (view != null) {
                C0DSB.LIZIZ(view);
                return;
            }
            return;
        }
        if (up()) {
            SmartImageView smartImageView = this.LLJJJ;
            if (smartImageView != null) {
                C0DSB.LIZIZ(smartImageView);
            }
            TuxTextView tuxTextView = this.LLJJIJIL;
            if (tuxTextView != null) {
                C0DSB.LIZIZ(tuxTextView);
            }
            View view2 = this.LLLIIII;
            if (view2 != null) {
                C0DSB.LIZJ(view2);
                return;
            }
            return;
        }
        SmartImageView smartImageView2 = this.LLJJJ;
        if (smartImageView2 != null) {
            C0DSB.LIZJ(smartImageView2);
        }
        TuxTextView tuxTextView2 = this.LLJJIJIL;
        if (tuxTextView2 != null) {
            C0DSB.LIZJ(tuxTextView2);
        }
        View view3 = this.LLLIIII;
        if (view3 != null) {
            C0DSB.LIZIZ(view3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void hp() {
        /*
            r7 = this;
            X.0yON r0 = X.C1855770yON.LIZ
            r0.getClass()
            boolean r0 = X.C1855770yON.LIZIZ()
            if (r0 == 0) goto L90
            X.0yJU r0 = X.C1852740yJU.LIZ
            r0.getClass()
            boolean r0 = X.C1852740yJU.LIZ()
            if (r0 == 0) goto L90
            X.0jpS r1 = r7.kp()
            r0 = 0
            if (r1 == 0) goto L20
            X.C786410Ut5.LLD(r0, r1)
        L20:
            X.0yW2 r0 = X.C1860520yW2.LIZ
            com.ss.android.ugc.aweme.tako.ccl.model.api.TakoTopTitleConfigResponse r0 = r0.LJIILL()
            java.util.List<com.ss.android.ugc.aweme.tako.ccl.model.api.NewActionBarItem> r0 = r0.navBarList
            r5 = 0
            r3 = 1
            if (r0 == 0) goto L9a
            java.util.Iterator r6 = r0.iterator()
        L30:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L98
            java.lang.Object r4 = r6.next()
            r2 = r4
            com.ss.android.ugc.aweme.tako.ccl.model.api.NewActionBarItem r2 = (com.ss.android.ugc.aweme.tako.ccl.model.api.NewActionBarItem) r2
            int r1 = r2.type
            r0 = 4
            if (r1 != r0) goto L30
            java.lang.String r0 = r2.name
            boolean r0 = X.C123100dR.LIZ(r0)
            if (r0 == 0) goto L30
        L4a:
            com.ss.android.ugc.aweme.tako.ccl.model.api.NewActionBarItem r4 = (com.ss.android.ugc.aweme.tako.ccl.model.api.NewActionBarItem) r4
            if (r4 == 0) goto L9b
            X.03IT r1 = new X.03IT
            X.0jpS r0 = r7.kp()
            if (r0 == 0) goto L91
            android.content.Context r0 = r0.getContext()
            if (r0 == 0) goto L91
            boolean r0 = X.C960203pA.LIZIZ(r0)
            if (r0 != r3) goto L91
            java.lang.String r0 = r4.darkIcon
            java.lang.String r0 = java.lang.String.valueOf(r0)
        L68:
            java.util.List r0 = java.util.Collections.singletonList(r0)
            r1.<init>(r0)
            X.0kl3 r2 = X.C1331660kl2.LJIIJ(r1)
            X.0yd5 r1 = new X.0yd5
            r0 = 1
            r1.<init>(r7, r0)
            r2.LJJII(r1)
        L7c:
            X.0yJc r3 = X.C1860410yVr.LIZIZ()
            X.0jpS r2 = r7.kp()
            if (r2 == 0) goto L90
            Y.ACListenerS91S0300000_27 r1 = new Y.ACListenerS91S0300000_27
            r0 = 14
            r1.<init>(r7, r4, r3, r0)
            X.C786410Ut5.c8(r2, r1)
        L90:
            return
        L91:
            java.lang.String r0 = r4.lightIcon
            java.lang.String r0 = java.lang.String.valueOf(r0)
            goto L68
        L98:
            r4 = r5
            goto L4a
        L9a:
            r4 = r5
        L9b:
            X.0jpS r0 = r7.kp()
            if (r0 == 0) goto Lbf
            android.content.Context r0 = r0.getContext()
            if (r0 == 0) goto Lbf
            boolean r0 = X.C960203pA.LIZIZ(r0)
            if (r0 != r3) goto Lbf
            r1 = 2130973786(0x7f04145a, float:1.7556377E38)
        Lb0:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            r7.tp(r5, r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            r7.sp(r5, r0)
            goto L7c
        Lbf:
            r1 = 2130973787(0x7f04145b, float:1.7556379E38)
            goto Lb0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tako.otherpage.sheet.SevenSheetTopTitleAssem.hp():void");
    }

    public final C1295960jpS kp() {
        View viewFindViewById = this.LLJLL;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.k41) : null;
            this.LLJLL = (C1295960jpS) viewFindViewById;
        }
        return (C1295960jpS) viewFindViewById;
    }

    public final TakoSheetVM lp() {
        AssemVMLazy assemVMLazy = this.LLJLLL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLILZ;
        return (TakoSheetVM) assemVMLazy.getValue();
    }

    public final ITakoContextAbility mp() {
        return (ITakoContextAbility) this.LLJZ.getValue();
    }

    public final boolean up() {
        C1863130yaF.LIZ.getClass();
        return C1863130yaF.LIZ() && C14TF.LIZIZ.LJJIJ(getContext());
    }

    public final String ip() {
        C13LC<C1864200yby> c13lcAp0;
        C1864200yby c1864200yby;
        String str;
        ITakoContextAbility iTakoContextAbilityMp = mp();
        return (iTakoContextAbilityMp == null || (c13lcAp0 = iTakoContextAbilityMp.Ap0()) == null || (c1864200yby = (C1864200yby) c13lcAp0.LIZIZ()) == null || (str = c1864200yby.LL) == null) ? "" : str;
    }

    public final boolean isTako() {
        C13LC<C1863850ybP> c13lcT71;
        C1863850ybP c1863850ybP;
        ITakoContextAbility iTakoContextAbilityMp;
        C13LC<C1863850ybP> c13lcT712;
        C1863850ybP c1863850ybP2;
        ITakoContextAbility iTakoContextAbilityMp2 = mp();
        return (iTakoContextAbilityMp2 == null || (c13lcT71 = iTakoContextAbilityMp2.T71()) == null || (c1863850ybP = (C1863850ybP) c13lcT71.LIZIZ()) == null || c1863850ybP.LLJJ != 1 || (iTakoContextAbilityMp = mp()) == null || (c13lcT712 = iTakoContextAbilityMp.T71()) == null || (c1863850ybP2 = (C1863850ybP) c13lcT712.LIZIZ()) == null || c1863850ybP2.LLJJI != 1) ? false : true;
    }

    @Override // X.AbstractC738140SxQ
    public final void onResume() {
        super.onResume();
        if (this.LLLFFI && up()) {
            if (this.LLLIIIIL != null || this.LLLIIIL != null) {
                Bp("chat", "on");
                Bp("video", "off");
            }
            C326630CrF.LIZ.LIZJ(getContext());
            return;
        }
        if (this.LLLFFI) {
            C1863130yaF.LIZ.getClass();
            if (C1863130yaF.LIZ()) {
                yp();
            }
        }
    }

    public final void op() {
        String str;
        String str2;
        String str3;
        C13LC<C1863850ybP> c13lcT71;
        C1863850ybP c1863850ybP;
        C13LC<C1863850ybP> c13lcT712;
        C1863850ybP c1863850ybP2;
        String str4;
        C13LC<C1863850ybP> c13lcT713;
        C1863850ybP c1863850ybP3;
        C13LC<C1863850ybP> c13lcT714;
        C1863850ybP c1863850ybP4;
        C13LC<C1863850ybP> c13lcT715;
        C1863850ybP c1863850ybP5;
        C13LC<C1863850ybP> c13lcT716;
        C1863850ybP c1863850ybP6;
        lp().setState(new AwS606S0100000_27(new C1862090yYZ(), 637));
        C1862330yYx c1862330yYx = C1862330yYx.LIZ;
        ITakoContextAbility iTakoContextAbilityMp = mp();
        String str5 = "";
        if (iTakoContextAbilityMp == null || (c13lcT716 = iTakoContextAbilityMp.T71()) == null || (c1863850ybP6 = (C1863850ybP) c13lcT716.LIZIZ()) == null || (str = c1863850ybP6.LL) == null) {
            str = "";
        }
        ITakoContextAbility iTakoContextAbilityMp2 = mp();
        if (iTakoContextAbilityMp2 == null || (c13lcT715 = iTakoContextAbilityMp2.T71()) == null || (c1863850ybP5 = (C1863850ybP) c13lcT715.LIZIZ()) == null || (str2 = c1863850ybP5.LLILLJJLI) == null) {
            str2 = "";
        }
        ITakoContextAbility iTakoContextAbilityMp3 = mp();
        if (iTakoContextAbilityMp3 == null || (c13lcT714 = iTakoContextAbilityMp3.T71()) == null || (c1863850ybP4 = (C1863850ybP) c13lcT714.LIZIZ()) == null || (str3 = c1863850ybP4.LLILZIL) == null) {
            str3 = "";
        }
        ITakoContextAbility iTakoContextAbilityMp4 = mp();
        String str6 = null;
        String str7 = (iTakoContextAbilityMp4 == null || (c13lcT713 = iTakoContextAbilityMp4.T71()) == null || (c1863850ybP3 = (C1863850ybP) c13lcT713.LIZIZ()) == null) ? null : c1863850ybP3.LLJJJJLIIL;
        ITakoContextAbility iTakoContextAbilityMp5 = mp();
        if (iTakoContextAbilityMp5 != null && (c13lcT712 = iTakoContextAbilityMp5.T71()) != null && (c1863850ybP2 = (C1863850ybP) c13lcT712.LIZIZ()) != null && (str4 = c1863850ybP2.LLILZLL) != null) {
            str5 = str4;
        }
        ITakoContextAbility iTakoContextAbilityMp6 = mp();
        if (iTakoContextAbilityMp6 != null && (c13lcT71 = iTakoContextAbilityMp6.T71()) != null && (c1863850ybP = (C1863850ybP) c13lcT71.LIZIZ()) != null) {
            str6 = c1863850ybP.LLIZ;
        }
        C1862330yYx.LJJIJLIJ(c1862330yYx, str, str2, str3, str7, "seven_split_screen", str5, str6);
    }

    public final void yp() {
        C13LC<C1863850ybP> c13lcT71;
        C1863850ybP c1863850ybP;
        ITakoContextAbility iTakoContextAbilityMp = mp();
        if (iTakoContextAbilityMp == null || (c13lcT71 = iTakoContextAbilityMp.T71()) == null || (c1863850ybP = (C1863850ybP) c13lcT71.LIZIZ()) == null) {
            return;
        }
        C1862330yYx c1862330yYx = C1862330yYx.LIZ;
        String str = c1863850ybP.LL;
        if (str == null) {
            str = "";
        }
        String str2 = c1863850ybP.LLILLJJLI;
        C1862330yYx.LJ(c1862330yYx, str, str2 != null ? str2 : "", "tab_show");
    }

    public final void Ap(String str) throws JSONException {
        C13LC<C1863850ybP> c13lcT71;
        C1863850ybP c1863850ybP;
        ITakoContextAbility iTakoContextAbilityMp = mp();
        if (iTakoContextAbilityMp != null && (c13lcT71 = iTakoContextAbilityMp.T71()) != null && (c1863850ybP = (C1863850ybP) c13lcT71.LIZIZ()) != null) {
            C1862330yYx c1862330yYx = C1862330yYx.LIZ;
            String str2 = c1863850ybP.LLILZIL;
            String str3 = c1863850ybP.LLILZLL;
            if (str3 == null) {
                str3 = "";
            }
            C1862330yYx.LJLLJ(c1862330yYx, str2, c1863850ybP.LL, c1863850ybP.LLILLJJLI, str3, c1863850ybP.LLIZ, "popup", str);
        }
    }

    public final void Ep(boolean z) {
        int i = 0;
        if (this.LLLFFI) {
            TuxTextView tuxTextView = this.LLJJIII;
            if (tuxTextView != null) {
                if (!z) {
                    i = 8;
                }
                C786410Ut5.LJLLLLLL(i, tuxTextView);
                return;
            }
            return;
        }
        TuxTextView tuxTextView2 = this.LLJJI;
        if (tuxTextView2 == null) {
            return;
        }
        if (!z) {
            i = 8;
        }
        C786410Ut5.LJLLLLLL(i, tuxTextView2);
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x01e4  */
    @Override // com.bytedance.assem.arch.core.UIAssem
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r9) {
        /*
            Method dump skipped, instruction units count: 517
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tako.otherpage.sheet.SevenSheetTopTitleAssem.onViewCreated(android.view.View):void");
    }

    public final void zp(String str) {
        String str2;
        String str3;
        C13LC<C1863850ybP> c13lcT71;
        C1863850ybP c1863850ybP;
        String strUN0;
        EnumC1863020ya4 enumC1863020ya4JS1;
        C13LC<C1864200yby> c13lcAp0;
        C1864200yby c1864200yby;
        C13LC<C1864200yby> c13lcAp02;
        C1864200yby c1864200yby2;
        TakoChatUIAbility takoChatUIAbility = (TakoChatUIAbility) this.LLLF.getValue();
        if (takoChatUIAbility != null && takoChatUIAbility.Ve0()) {
            ITakoContextAbility iTakoContextAbilityMp = mp();
            String mobOnboardingStyle = null;
            if (iTakoContextAbilityMp != null && (c13lcAp02 = iTakoContextAbilityMp.Ap0()) != null && (c1864200yby2 = (C1864200yby) c13lcAp02.LIZIZ()) != null) {
                str2 = c1864200yby2.LL;
            } else {
                str2 = null;
            }
            String str4 = "";
            if (str2 == null) {
                str2 = "";
            }
            ITakoContextAbility iTakoContextAbilityMp2 = mp();
            if (iTakoContextAbilityMp2 != null && (c13lcAp0 = iTakoContextAbilityMp2.Ap0()) != null && (c1864200yby = (C1864200yby) c13lcAp0.LIZIZ()) != null) {
                str3 = c1864200yby.LLILLJJLI;
            } else {
                str3 = null;
            }
            ITakoContextAbility iTakoContextAbilityMp3 = mp();
            if (iTakoContextAbilityMp3 != null && (c13lcT71 = iTakoContextAbilityMp3.T71()) != null && (c1863850ybP = (C1863850ybP) c13lcT71.LIZIZ()) != null) {
                C1862330yYx c1862330yYx = C1862330yYx.LIZ;
                String str5 = c1863850ybP.LL;
                if (str5 == null) {
                    str5 = "";
                }
                String str6 = c1863850ybP.LLILLJJLI;
                if (str6 == null) {
                    str6 = "";
                }
                String str7 = c1863850ybP.LLILZIL;
                if (str7 == null) {
                    str7 = "";
                }
                String str8 = c1863850ybP.LLIZ;
                TakoChatUIAbility takoChatUIAbility2 = (TakoChatUIAbility) this.LLLF.getValue();
                if (takoChatUIAbility2 != null) {
                    strUN0 = takoChatUIAbility2.uN0();
                } else {
                    strUN0 = null;
                }
                String str9 = c1863850ybP.LLJ;
                if (str9 == null) {
                    str9 = "";
                }
                if (str3 != null) {
                    str4 = str3;
                }
                TakoChatUIAbility takoChatUIAbility3 = (TakoChatUIAbility) this.LLLF.getValue();
                if (takoChatUIAbility3 != null && (enumC1863020ya4JS1 = takoChatUIAbility3.jS1()) != null) {
                    mobOnboardingStyle = enumC1863020ya4JS1.getMobOnboardingStyle();
                }
                C1862330yYx.LJJZ(512, c1862330yYx, str5, str6, str7, str2, str8, strUN0, str9, str4, str, mobOnboardingStyle);
            }
        }
    }

    public final void Bp(String str, String str2) {
        C13LC<C1863850ybP> c13lcT71;
        C1863850ybP c1863850ybP;
        ITakoContextAbility iTakoContextAbilityMp = mp();
        if (iTakoContextAbilityMp != null && (c13lcT71 = iTakoContextAbilityMp.T71()) != null && (c1863850ybP = (C1863850ybP) c13lcT71.LIZIZ()) != null) {
            C1862330yYx c1862330yYx = C1862330yYx.LIZ;
            String str3 = c1863850ybP.LL;
            if (str3 == null) {
                str3 = "";
            }
            String str4 = c1863850ybP.LLILLJJLI;
            if (str4 == null) {
                str4 = "";
            }
            String str5 = c1863850ybP.LLILZIL;
            if (str5 == null) {
                str5 = "";
            }
            String strIp = ip();
            String strNZ0 = null;
            ITakoScreenTypeAbility iTakoScreenTypeAbility = (ITakoScreenTypeAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), ITakoScreenTypeAbility.class, null);
            if (iTakoScreenTypeAbility != null) {
                strNZ0 = iTakoScreenTypeAbility.nZ0();
            }
            C1862330yYx.LJJII(c1862330yYx, str3, str4, str5, strIp, strNZ0, str, str2);
        }
    }

    public final void sp(Bitmap bitmap, Integer num) {
        Context context;
        C1855770yON.LIZ.getClass();
        if (C1855770yON.LIZIZ()) {
            C1860520yW2.LIZ.getClass();
            if (C1860520yW2.LJIIL().getInt("tako_key_top_title_square_entrance_anim_show_times", 0) < 3 && C1860520yW2.LJI()) {
                C1295960jpS c1295960jpSKp = kp();
                if (c1295960jpSKp != null) {
                    c1295960jpSKp.addAnimatorListener(new ALAdapterS12S0300000_27(bitmap, this, num, 1));
                }
                C1295960jpS c1295960jpSKp2 = kp();
                if (c1295960jpSKp2 != null && (context = c1295960jpSKp2.getContext()) != null && C960203pA.LIZIZ(context)) {
                    C1295960jpS c1295960jpSKp3 = kp();
                    if (c1295960jpSKp3 != null) {
                        C844350XAj.LIZ.LJFF(new AwS641S0100000_27(c1295960jpSKp3, 70), true);
                        return;
                    }
                    return;
                }
                C1295960jpS c1295960jpSKp4 = kp();
                if (c1295960jpSKp4 == null) {
                    return;
                }
                C844350XAj.LIZ.LJFF(new AwS641S0100000_27(c1295960jpSKp4, 71), false);
            }
        }
    }

    public final void tp(Bitmap bitmap, Integer num) {
        C1295960jpS c1295960jpSKp;
        if (bitmap != null && (c1295960jpSKp = kp()) != null) {
            c1295960jpSKp.setImageBitmap(bitmap);
        }
        if (num != null) {
            num.intValue();
            C1295960jpS c1295960jpSKp2 = kp();
            if (c1295960jpSKp2 != null) {
                c1295960jpSKp2.setImageResource(num.intValue());
            }
        }
    }
}
