package com.ss.android.ugc.aweme.tako.botpage.toptitle;

import X.AbstractC738140SxQ;
import X.C019F;
import X.C01GW;
import X.C09R3;
import X.C0AXK;
import X.C1220000hqw;
import X.C1295960jpS;
import X.C13LC;
import X.C13LE;
import X.C14FV;
import X.C14TF;
import X.C1558520qew;
import X.C1637806bA;
import X.C1637906bB;
import X.C1852740yJU;
import X.C1855770yON;
import X.C1860520yW2;
import X.C1862330yYx;
import X.C1862750yZd;
import X.C1863130yaF;
import X.C1863850ybP;
import X.C1864200yby;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C326630CrF;
import X.C426770GoN;
import X.C451610HnL;
import X.C452070Ho5;
import X.C452501pT;
import X.C723700Sa8;
import X.C724750Sbp;
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
import com.ss.android.ugc.aweme.tako.botpage.vm.MessageViewModel;
import com.ss.android.ugc.aweme.tako.botpage.vm.ability.ITakoScreenTypeAbility;
import com.ss.android.ugc.aweme.tako.otherpage.botcenter.TakoBotCenterViewModel;
import com.ss.android.ugc.aweme.tako.signal.ITakoContextAbility;
import com.ss.android.ugc.aweme.tako.startup.onboarding.vm.TakoOnboardingViewModel;
import com.ss.android.ugc.aweme.tako.ui.TakoChatUIAbility;
import com.ss.android.ugc.aweme.tako.vm.TakoFragmentViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS269S0000000_27;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS571S0100000_27;
import kotlin.jvm.internal.AwS641S0100000_27;
import org.json.JSONException;

/* JADX INFO: loaded from: classes28.dex */
public final class TopTitleAssem extends UISlotAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLII;
    public TuxIconView LLJJI;
    public TuxIconView LLJJIII;
    public TuxTextView LLJJIJI;
    public C1295960jpS LLJJIJIIJIL;
    public final AssemVMLazy LLJJIJIL;
    public final AssemVMLazy LLJJJ;
    public final AssemVMLazy LLJJJIL;
    public final C01GW LLJJJJ;
    public final C01GW LLJJJJJIL;
    public final C01GW LLJJJJLIIL;
    public final C01GW LLJJL;
    public final AssemVMLazy LLJJLIIIJLLLLLLLZ;
    public final C01GW LLJL;
    public View LLJLIL;
    public TuxIconView LLJLILLLLZIIL;
    public boolean LLJLL;
    public boolean LLJLLIL;
    public C426770GoN LLJLLL;
    public TuxIconView LLJZ;
    public SmartImageView LLJZIJLIL;
    public TuxTextView LLL;
    public View LLLF;
    public View LLLFF;
    public View LLLFFI;
    public boolean LLLFZ;
    public final C1862750yZd LLLI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(TopTitleAssem.class, "onboardingVM", "getOnboardingVM()Lcom/ss/android/ugc/aweme/tako/startup/onboarding/vm/TakoOnboardingViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(TopTitleAssem.class, "fragmentVM", "getFragmentVM()Lcom/ss/android/ugc/aweme/tako/vm/TakoFragmentViewModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(TopTitleAssem.class, "multipleSelectVM", "getMultipleSelectVM()Lcom/ss/android/ugc/aweme/tako/botpage/components/action/multiple/TakoMultipleSelectVM;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(TopTitleAssem.class, "messageViewModel", "getMessageViewModel()Lcom/ss/android/ugc/aweme/tako/botpage/vm/MessageViewModel;", 0);
        c09r3.getClass();
        LLLII = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4};
    }

    /* JADX WARN: Type inference failed for: r0v33, types: [X.0yZd] */
    public TopTitleAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(TakoOnboardingViewModel.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLJJIJIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, c1637906bB, new AwS568S0100000_24(c19719912DlLIZ, 1283), AFwS269S0000000_27.get$arr$(230), null, true);
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(TakoFragmentViewModel.class);
        this.LLJJJ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c019f, c1637906bB, new AwS568S0100000_24(c19719912DlLIZ2, 1284), AFwS269S0000000_27.get$arr$(231), null, true);
        C19719912Dl c19719912DlLIZ3 = C13LE.LIZ(TakoMultipleSelectVM.class);
        this.LLJJJIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ3), c019f, c1637906bB, new AwS568S0100000_24(c19719912DlLIZ3, 1285), AFwS269S0000000_27.get$arr$(232), null, true);
        C13LE.LIZ(TakoBotCenterViewModel.class);
        AFwS269S0000000_27.get$arr$(234);
        new AwS568S0100000_24((AbstractC738140SxQ) this, 1287);
        new C451610HnL(this, true, true);
        new C723700Sa8(this);
        new C452070Ho5();
        C724750Sbp.LJII(this);
        C1220000hqw.LIZ(this);
        this.LLJJJJ = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1290));
        this.LLJJJJJIL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1289));
        this.LLJJJJLIIL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1282));
        this.LLJJL = C452501pT.LIZIZ(new AwS571S0100000_27(this, 815));
        C19719912Dl c19719912DlLIZ4 = C13LE.LIZ(MessageViewModel.class);
        this.LLJJLIIIJLLLLLLLZ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ4), c019f, c1637906bB, new AwS568S0100000_24(c19719912DlLIZ4, 1286), AFwS269S0000000_27.get$arr$(233), null, true);
        this.LLJL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1288));
        this.LLLI = new C14FV() { // from class: X.0yZd
            @Override // X.C14FV
            public final void LIZIZ() throws JSONException {
                C13LC<C1863850ybP> c13lcT71;
                C1863850ybP c1863850ybP;
                ITakoContextAbility iTakoContextAbilityOp = this.LIZ.op();
                if (iTakoContextAbilityOp == null || (c13lcT71 = iTakoContextAbilityOp.T71()) == null || (c1863850ybP = (C1863850ybP) c13lcT71.LIZIZ()) == null) {
                    return;
                }
                C1862330yYx c1862330yYx = C1862330yYx.LIZ;
                String str = c1863850ybP.LLILZIL;
                String str2 = c1863850ybP.LLILZLL;
                if (str2 == null) {
                    str2 = "";
                }
                String str3 = c1863850ybP.LLIZ;
                C1862330yYx.LJLLL(c1862330yYx, str, str2, str3 != null ? str3 : "", c1863850ybP.LL, c1863850ybP.LLILLJJLI, "popup");
            }

            @Override // X.C14FV
            public final void onSuccess() {
                this.LIZ.kp();
            }

            @Override // X.C14FV
            public final void LIZ(String str) throws JSONException {
                this.LIZ.zp(str);
                this.LIZ.kp();
            }

            @Override // X.C14FV
            public final void LIZJ(String str) throws JSONException {
                this.LIZ.zp(str);
            }
        };
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.fm0;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onResume_isOnResumeEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    public static boolean hp() {
        if (((Number) C0AXK.LIZ.getValue()).intValue() != 1) {
            return false;
        }
        C1855770yON.LIZ.getClass();
        if (!C1855770yON.LIZIZ()) {
            return false;
        }
        C1852740yJU.LIZ.getClass();
        return C1852740yJU.LIZ();
    }

    /* JADX WARN: Code restructure failed: missing block: B:115:0x020a, code lost:
    
        if (r3 != null) goto L79;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:138:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01c9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void kp() {
        /*
            Method dump skipped, instruction units count: 578
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tako.botpage.toptitle.TopTitleAssem.kp():void");
    }

    public final TuxTextView lp() {
        View viewFindViewById = this.LLJJIJI;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.dat) : null;
            this.LLJJIJI = (TuxTextView) viewFindViewById;
        }
        return (TuxTextView) viewFindViewById;
    }

    public final C1295960jpS mp() {
        View viewFindViewById = this.LLJJIJIIJIL;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.k41) : null;
            this.LLJJIJIIJIL = (C1295960jpS) viewFindViewById;
        }
        return (C1295960jpS) viewFindViewById;
    }

    public final ITakoContextAbility op() {
        return (ITakoContextAbility) this.LLJJJJJIL.getValue();
    }

    public final boolean up() {
        C1863130yaF.LIZ.getClass();
        return C1863130yaF.LIZ() && C14TF.LIZIZ.LJJIJ(getContext());
    }

    public final String ip() {
        C13LC<C1864200yby> c13lcAp0;
        C1864200yby c1864200yby;
        String str;
        ITakoContextAbility iTakoContextAbilityOp = op();
        return (iTakoContextAbilityOp == null || (c13lcAp0 = iTakoContextAbilityOp.Ap0()) == null || (c1864200yby = (C1864200yby) c13lcAp0.LIZIZ()) == null || (str = c1864200yby.LL) == null) ? "" : str;
    }

    public final boolean isTako() {
        C13LC<C1863850ybP> c13lcT71;
        C1863850ybP c1863850ybP;
        ITakoContextAbility iTakoContextAbilityOp;
        C13LC<C1863850ybP> c13lcT712;
        C1863850ybP c1863850ybP2;
        ITakoContextAbility iTakoContextAbilityOp2 = op();
        return (iTakoContextAbilityOp2 == null || (c13lcT71 = iTakoContextAbilityOp2.T71()) == null || (c1863850ybP = (C1863850ybP) c13lcT71.LIZIZ()) == null || c1863850ybP.LLJJ != 1 || (iTakoContextAbilityOp = op()) == null || (c13lcT712 = iTakoContextAbilityOp.T71()) == null || (c1863850ybP2 = (C1863850ybP) c13lcT712.LIZIZ()) == null || c1863850ybP2.LLJJI != 1) ? false : true;
    }

    @Override // X.AbstractC738140SxQ
    public final void onResume() {
        ITakoContextAbility iTakoContextAbilityOp;
        C13LC<C1863850ybP> c13lcT71;
        C1863850ybP c1863850ybP;
        super.onResume();
        if (up()) {
            if (this.LLLFF != null || this.LLLFFI != null) {
                Ap("chat", "on");
                Ap("video", "off");
            }
            C326630CrF.LIZ.LIZJ(getContext());
            return;
        }
        C1863130yaF.LIZ.getClass();
        if (!C1863130yaF.LIZ() || (iTakoContextAbilityOp = op()) == null || (c13lcT71 = iTakoContextAbilityOp.T71()) == null || (c1863850ybP = (C1863850ybP) c13lcT71.LIZIZ()) == null) {
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

    /* JADX WARN: Removed duplicated region for block: B:193:0x0491  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x04b2  */
    @Override // com.bytedance.assem.arch.core.UIAssem
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r23) {
        /*
            Method dump skipped, instruction units count: 1749
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tako.botpage.toptitle.TopTitleAssem.onViewCreated(android.view.View):void");
    }

    public final void yp(String str) {
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
        TakoChatUIAbility takoChatUIAbility = (TakoChatUIAbility) this.LLJL.getValue();
        if (takoChatUIAbility != null && takoChatUIAbility.Ve0()) {
            ITakoContextAbility iTakoContextAbilityOp = op();
            String mobOnboardingStyle = null;
            if (iTakoContextAbilityOp != null && (c13lcAp02 = iTakoContextAbilityOp.Ap0()) != null && (c1864200yby2 = (C1864200yby) c13lcAp02.LIZIZ()) != null) {
                str2 = c1864200yby2.LL;
            } else {
                str2 = null;
            }
            String str4 = "";
            if (str2 == null) {
                str2 = "";
            }
            ITakoContextAbility iTakoContextAbilityOp2 = op();
            if (iTakoContextAbilityOp2 != null && (c13lcAp0 = iTakoContextAbilityOp2.Ap0()) != null && (c1864200yby = (C1864200yby) c13lcAp0.LIZIZ()) != null) {
                str3 = c1864200yby.LLILLJJLI;
            } else {
                str3 = null;
            }
            ITakoContextAbility iTakoContextAbilityOp3 = op();
            if (iTakoContextAbilityOp3 != null && (c13lcT71 = iTakoContextAbilityOp3.T71()) != null && (c1863850ybP = (C1863850ybP) c13lcT71.LIZIZ()) != null) {
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
                TakoChatUIAbility takoChatUIAbility2 = (TakoChatUIAbility) this.LLJL.getValue();
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
                TakoChatUIAbility takoChatUIAbility3 = (TakoChatUIAbility) this.LLJL.getValue();
                if (takoChatUIAbility3 != null && (enumC1863020ya4JS1 = takoChatUIAbility3.jS1()) != null) {
                    mobOnboardingStyle = enumC1863020ya4JS1.getMobOnboardingStyle();
                }
                C1862330yYx.LJJZ(512, c1862330yYx, str5, str6, str7, str2, str8, strUN0, str9, str4, str, mobOnboardingStyle);
            }
        }
    }

    public final void zp(String str) throws JSONException {
        C13LC<C1863850ybP> c13lcT71;
        C1863850ybP c1863850ybP;
        ITakoContextAbility iTakoContextAbilityOp = op();
        if (iTakoContextAbilityOp != null && (c13lcT71 = iTakoContextAbilityOp.T71()) != null && (c1863850ybP = (C1863850ybP) c13lcT71.LIZIZ()) != null) {
            C1862330yYx c1862330yYx = C1862330yYx.LIZ;
            String str2 = c1863850ybP.LLILZIL;
            String str3 = c1863850ybP.LLILZLL;
            String str4 = "";
            if (str3 == null) {
                str3 = "";
            }
            String str5 = c1863850ybP.LLIZ;
            if (str5 != null) {
                str4 = str5;
            }
            C1862330yYx.LJLLJ(c1862330yYx, str2, c1863850ybP.LL, c1863850ybP.LLILLJJLI, str3, str4, "popup", str);
        }
    }

    public final void Ap(String str, String str2) {
        C13LC<C1863850ybP> c13lcT71;
        C1863850ybP c1863850ybP;
        ITakoContextAbility iTakoContextAbilityOp = op();
        if (iTakoContextAbilityOp != null && (c13lcT71 = iTakoContextAbilityOp.T71()) != null && (c1863850ybP = (C1863850ybP) c13lcT71.LIZIZ()) != null) {
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
                C1295960jpS c1295960jpSMp = mp();
                if (c1295960jpSMp != null) {
                    c1295960jpSMp.addAnimatorListener(new ALAdapterS12S0300000_27(bitmap, this, num, 0));
                }
                C1295960jpS c1295960jpSMp2 = mp();
                if (c1295960jpSMp2 != null && (context = c1295960jpSMp2.getContext()) != null && C960203pA.LIZIZ(context)) {
                    C1295960jpS c1295960jpSMp3 = mp();
                    if (c1295960jpSMp3 != null) {
                        C844350XAj.LIZ.LJFF(new AwS641S0100000_27(c1295960jpSMp3, 50), true);
                        return;
                    }
                    return;
                }
                C1295960jpS c1295960jpSMp4 = mp();
                if (c1295960jpSMp4 == null) {
                    return;
                }
                C844350XAj.LIZ.LJFF(new AwS641S0100000_27(c1295960jpSMp4, 51), false);
            }
        }
    }

    public final void tp(Bitmap bitmap, Integer num) {
        C1295960jpS c1295960jpSMp;
        if (bitmap != null && (c1295960jpSMp = mp()) != null) {
            c1295960jpSMp.setImageBitmap(bitmap);
        }
        if (num != null) {
            num.intValue();
            C1295960jpS c1295960jpSMp2 = mp();
            if (c1295960jpSMp2 != null) {
                c1295960jpSMp2.setImageResource(num.intValue());
            }
        }
    }
}
