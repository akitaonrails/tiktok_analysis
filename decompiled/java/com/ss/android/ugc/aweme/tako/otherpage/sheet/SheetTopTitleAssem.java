package com.ss.android.ugc.aweme.tako.otherpage.sheet;

import X.C019F;
import X.C01GW;
import X.C09R3;
import X.C13LC;
import X.C13LE;
import X.C14FV;
import X.C1637806bA;
import X.C1637906bB;
import X.C1852920yJm;
import X.C1862090yYZ;
import X.C1862330yYx;
import X.C1862780yZg;
import X.C1863850ybP;
import X.C1864200yby;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C426770GoN;
import X.C452501pT;
import X.C724750Sbp;
import X.C786410Ut5;
import X.EnumC1863020ya4;
import X.InterfaceC2217461Bqa;
import android.view.View;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.tako.botpage.components.action.multiple.TakoMultipleSelectVM;
import com.ss.android.ugc.aweme.tako.experiment.TakoInfoModel;
import com.ss.android.ugc.aweme.tako.signal.ITakoContextAbility;
import com.ss.android.ugc.aweme.tako.startup.onboarding.vm.TakoOnboardingViewModel;
import com.ss.android.ugc.aweme.tako.ui.TakoChatUIAbility;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS269S0000000_27;
import kotlin.jvm.internal.AwS571S0100000_27;
import kotlin.jvm.internal.AwS606S0100000_27;
import org.json.JSONException;

/* JADX INFO: loaded from: classes28.dex */
public final class SheetTopTitleAssem extends UISlotAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLIIIL;
    public TuxIconView LLJJI;
    public TuxIconView LLJJIII;
    public View LLJJIJI;
    public View LLJJIJIIJIL;
    public View LLJJIJIL;
    public View LLJJJ;
    public View LLJJJIL;
    public View LLJJJJ;
    public TuxTextView LLJJJJJIL;
    public TuxTextView LLJJJJLIIL;
    public SmartImageView LLJJL;
    public TuxTextView LLJJLIIIJLLLLLLLZ;
    public View LLJL;
    public boolean LLJLIL;
    public C426770GoN LLJLILLLLZIIL;
    public boolean LLJLL;
    public boolean LLJLLIL;
    public boolean LLJLLL;
    public final AssemVMLazy LLJZ;
    public final AssemVMLazy LLJZIJLIL;
    public final C01GW LLL;
    public final C01GW LLLF;
    public final C01GW LLLFF;
    public final C01GW LLLFFI;
    public final C01GW LLLFZ;
    public final AssemVMLazy LLLI;
    public final C01GW LLLII;
    public boolean LLLIIII;
    public final C1862780yZg LLLIIIIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SheetTopTitleAssem.class, "multipleSelectVM", "getMultipleSelectVM()Lcom/ss/android/ugc/aweme/tako/botpage/components/action/multiple/TakoMultipleSelectVM;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(SheetTopTitleAssem.class, "sheetVM", "getSheetVM()Lcom/ss/android/ugc/aweme/tako/otherpage/sheet/TakoSheetVM;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(SheetTopTitleAssem.class, "onboardingVM", "getOnboardingVM()Lcom/ss/android/ugc/aweme/tako/startup/onboarding/vm/TakoOnboardingViewModel;", 0);
        c09r3.getClass();
        LLLIIIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3};
    }

    /* JADX WARN: Type inference failed for: r0v24, types: [X.0yZg] */
    public SheetTopTitleAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(TakoMultipleSelectVM.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLJZ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, c1637906bB, new AwS571S0100000_27(c19719912DlLIZ, 928), AFwS269S0000000_27.get$arr$(292), null, true);
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(TakoSheetVM.class);
        this.LLJZIJLIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c019f, c1637906bB, new AwS571S0100000_27(c19719912DlLIZ2, 929), AFwS269S0000000_27.get$arr$(293), null, true);
        this.LLL = C452501pT.LIZIZ(new AwS571S0100000_27(this, 932));
        this.LLLF = C452501pT.LIZIZ(new AwS571S0100000_27(this, 933));
        this.LLLFF = C452501pT.LIZIZ(new AwS571S0100000_27(this, 927));
        this.LLLFFI = C452501pT.LIZIZ(new AwS571S0100000_27(this, 925));
        this.LLLFZ = C452501pT.LIZIZ(new AwS571S0100000_27(this, 931));
        C19719912Dl c19719912DlLIZ3 = C13LE.LIZ(TakoOnboardingViewModel.class);
        this.LLLI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ3), c019f, c1637906bB, new AwS571S0100000_27(c19719912DlLIZ3, 930), AFwS269S0000000_27.get$arr$(294), null, true);
        this.LLLII = C452501pT.LIZIZ(new AwS571S0100000_27(this, 924));
        this.LLLIIIIL = new C14FV() { // from class: X.0yZg
            @Override // X.C14FV
            public final void LIZIZ() throws JSONException {
                C13LC<C1863850ybP> c13lcT71;
                C1863850ybP c1863850ybP;
                ITakoContextAbility iTakoContextAbilityKp = this.LIZ.kp();
                if (iTakoContextAbilityKp == null || (c13lcT71 = iTakoContextAbilityKp.T71()) == null || (c1863850ybP = (C1863850ybP) c13lcT71.LIZIZ()) == null) {
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
                this.LIZ.lp();
            }

            @Override // X.C14FV
            public final void LIZ(String str) throws JSONException {
                this.LIZ.op(str);
                this.LIZ.lp();
            }

            @Override // X.C14FV
            public final void LIZJ(String str) throws JSONException {
                this.LIZ.op(str);
            }
        };
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.fm1;
    }

    public final TakoSheetVM ip() {
        AssemVMLazy assemVMLazy = this.LLJZIJLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLIIIL;
        return (TakoSheetVM) assemVMLazy.getValue();
    }

    public final ITakoContextAbility kp() {
        return (ITakoContextAbility) this.LLL.getValue();
    }

    public final String hp() {
        C13LC<C1863850ybP> c13lcT71;
        C1863850ybP c1863850ybP;
        if (isTako()) {
            TakoInfoModel takoInfoModel = C1852920yJm.LIZ;
            return C1852920yJm.LIZ.botName;
        }
        ITakoContextAbility iTakoContextAbilityKp = kp();
        if (iTakoContextAbilityKp == null || (c13lcT71 = iTakoContextAbilityKp.T71()) == null || (c1863850ybP = (C1863850ybP) c13lcT71.LIZIZ()) == null) {
            return null;
        }
        return c1863850ybP.LLJJIII;
    }

    public final boolean isTako() {
        C13LC<C1863850ybP> c13lcT71;
        C1863850ybP c1863850ybP;
        ITakoContextAbility iTakoContextAbilityKp;
        C13LC<C1863850ybP> c13lcT712;
        C1863850ybP c1863850ybP2;
        ITakoContextAbility iTakoContextAbilityKp2 = kp();
        return (iTakoContextAbilityKp2 == null || (c13lcT71 = iTakoContextAbilityKp2.T71()) == null || (c1863850ybP = (C1863850ybP) c13lcT71.LIZIZ()) == null || c1863850ybP.LLJJ != 1 || (iTakoContextAbilityKp = kp()) == null || (c13lcT712 = iTakoContextAbilityKp.T71()) == null || (c1863850ybP2 = (C1863850ybP) c13lcT712.LIZIZ()) == null || c1863850ybP2.LLJJI != 1) ? false : true;
    }

    public final void lp() {
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
        ip().setState(new AwS606S0100000_27(new C1862090yYZ(), 637));
        C1862330yYx c1862330yYx = C1862330yYx.LIZ;
        ITakoContextAbility iTakoContextAbilityKp = kp();
        String str5 = "";
        if (iTakoContextAbilityKp == null || (c13lcT716 = iTakoContextAbilityKp.T71()) == null || (c1863850ybP6 = (C1863850ybP) c13lcT716.LIZIZ()) == null || (str = c1863850ybP6.LL) == null) {
            str = "";
        }
        ITakoContextAbility iTakoContextAbilityKp2 = kp();
        if (iTakoContextAbilityKp2 == null || (c13lcT715 = iTakoContextAbilityKp2.T71()) == null || (c1863850ybP5 = (C1863850ybP) c13lcT715.LIZIZ()) == null || (str2 = c1863850ybP5.LLILLJJLI) == null) {
            str2 = "";
        }
        ITakoContextAbility iTakoContextAbilityKp3 = kp();
        if (iTakoContextAbilityKp3 == null || (c13lcT714 = iTakoContextAbilityKp3.T71()) == null || (c1863850ybP4 = (C1863850ybP) c13lcT714.LIZIZ()) == null || (str3 = c1863850ybP4.LLILZIL) == null) {
            str3 = "";
        }
        ITakoContextAbility iTakoContextAbilityKp4 = kp();
        String str6 = null;
        String str7 = (iTakoContextAbilityKp4 == null || (c13lcT713 = iTakoContextAbilityKp4.T71()) == null || (c1863850ybP3 = (C1863850ybP) c13lcT713.LIZIZ()) == null) ? null : c1863850ybP3.LLJJJJLIIL;
        ITakoContextAbility iTakoContextAbilityKp5 = kp();
        if (iTakoContextAbilityKp5 != null && (c13lcT712 = iTakoContextAbilityKp5.T71()) != null && (c1863850ybP2 = (C1863850ybP) c13lcT712.LIZIZ()) != null && (str4 = c1863850ybP2.LLILZLL) != null) {
            str5 = str4;
        }
        ITakoContextAbility iTakoContextAbilityKp6 = kp();
        if (iTakoContextAbilityKp6 != null && (c13lcT71 = iTakoContextAbilityKp6.T71()) != null && (c1863850ybP = (C1863850ybP) c13lcT71.LIZIZ()) != null) {
            str6 = c1863850ybP.LLIZ;
        }
        C1862330yYx.LJJIJLIJ(c1862330yYx, str, str2, str3, str7, "nine_split_screen", str5, str6);
    }

    public final void mp(String str) {
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
        TakoChatUIAbility takoChatUIAbility = (TakoChatUIAbility) this.LLLFZ.getValue();
        if (takoChatUIAbility != null && takoChatUIAbility.Ve0()) {
            ITakoContextAbility iTakoContextAbilityKp = kp();
            String mobOnboardingStyle = null;
            if (iTakoContextAbilityKp != null && (c13lcAp02 = iTakoContextAbilityKp.Ap0()) != null && (c1864200yby2 = (C1864200yby) c13lcAp02.LIZIZ()) != null) {
                str2 = c1864200yby2.LL;
            } else {
                str2 = null;
            }
            String str4 = "";
            if (str2 == null) {
                str2 = "";
            }
            ITakoContextAbility iTakoContextAbilityKp2 = kp();
            if (iTakoContextAbilityKp2 != null && (c13lcAp0 = iTakoContextAbilityKp2.Ap0()) != null && (c1864200yby = (C1864200yby) c13lcAp0.LIZIZ()) != null) {
                str3 = c1864200yby.LLILLJJLI;
            } else {
                str3 = null;
            }
            ITakoContextAbility iTakoContextAbilityKp3 = kp();
            if (iTakoContextAbilityKp3 != null && (c13lcT71 = iTakoContextAbilityKp3.T71()) != null && (c1863850ybP = (C1863850ybP) c13lcT71.LIZIZ()) != null) {
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
                TakoChatUIAbility takoChatUIAbility2 = (TakoChatUIAbility) this.LLLFZ.getValue();
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
                TakoChatUIAbility takoChatUIAbility3 = (TakoChatUIAbility) this.LLLFZ.getValue();
                if (takoChatUIAbility3 != null && (enumC1863020ya4JS1 = takoChatUIAbility3.jS1()) != null) {
                    mobOnboardingStyle = enumC1863020ya4JS1.getMobOnboardingStyle();
                }
                C1862330yYx.LJJZ(512, c1862330yYx, str5, str6, str7, str2, str8, strUN0, str9, str4, str, mobOnboardingStyle);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0161  */
    @Override // com.bytedance.assem.arch.core.UIAssem
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r7) {
        /*
            Method dump skipped, instruction units count: 386
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tako.otherpage.sheet.SheetTopTitleAssem.onViewCreated(android.view.View):void");
    }

    public final void op(String str) throws JSONException {
        C13LC<C1863850ybP> c13lcT71;
        C1863850ybP c1863850ybP;
        ITakoContextAbility iTakoContextAbilityKp = kp();
        if (iTakoContextAbilityKp != null && (c13lcT71 = iTakoContextAbilityKp.T71()) != null && (c1863850ybP = (C1863850ybP) c13lcT71.LIZIZ()) != null) {
            C1862330yYx c1862330yYx = C1862330yYx.LIZ;
            String str2 = c1863850ybP.LLILZIL;
            String str3 = c1863850ybP.LLILZLL;
            if (str3 == null) {
                str3 = "";
            }
            C1862330yYx.LJLLJ(c1862330yYx, str2, c1863850ybP.LL, c1863850ybP.LLILLJJLI, str3, c1863850ybP.LLIZ, "popup", str);
        }
    }

    public final void sp(boolean z) {
        int i = 0;
        if (this.LLJLLIL) {
            TuxTextView tuxTextView = this.LLJJJJLIIL;
            if (tuxTextView != null) {
                if (!z) {
                    i = 8;
                }
                C786410Ut5.LJLLLLLL(i, tuxTextView);
                return;
            }
            return;
        }
        TuxTextView tuxTextView2 = this.LLJJJJJIL;
        if (tuxTextView2 == null) {
            return;
        }
        if (!z) {
            i = 8;
        }
        C786410Ut5.LJLLLLLL(i, tuxTextView2);
    }
}
