package com.ss.android.ugc.aweme.tako.botpage.bottombox.inputv2.voice;

import X.C019F;
import X.C01GW;
import X.C07I1;
import X.C07IF;
import X.C09R3;
import X.C1163410gNf;
import X.C1355270lN7;
import X.C1355280lN8;
import X.C1360910lWD;
import X.C1389890mGx;
import X.C13LC;
import X.C13LE;
import X.C13LQ;
import X.C1558520qew;
import X.C1637806bA;
import X.C1637906bB;
import X.C1852420yIy;
import X.C1854150yLl;
import X.C1855370yNj;
import X.C1862330yYx;
import X.C1863850ybP;
import X.C1864200yby;
import X.C19719912Dl;
import X.C19EG;
import X.C2097608Jq;
import X.C2217381BqS;
import X.C23250099c;
import X.C319980CgW;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C452501pT;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C786410Ut5;
import X.C814420VxA;
import X.ChoreographerFrameCallbackC1855380yNk;
import X.EnumC1355290lN9;
import X.EnumC1355300lNA;
import X.EnumC1863020ya4;
import X.InterfaceC1360930lWF;
import X.InterfaceC1554640qYg;
import X.InterfaceC2217461Bqa;
import X.InterfaceC494301wD;
import Y.ACListenerS161S0100000_27;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tux.badge.TuxAlertBadgeLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.im.business.capability.api.conflicts.BusinessCapabilityService;
import com.ss.android.ugc.aweme.tako.botpage.bottombox.inputv2.IBottomInputHostAbility;
import com.ss.android.ugc.aweme.tako.botpage.bottombox.vm.BottomInputViewModel;
import com.ss.android.ugc.aweme.tako.botpage.bottombox.vm.TakoSpeechViewModel;
import com.ss.android.ugc.aweme.tako.botpage.components.autoplay.TakoListAutoPlayAbility;
import com.ss.android.ugc.aweme.tako.botpage.vm.ability.IMessageAbility;
import com.ss.android.ugc.aweme.tako.signal.ITakoContextAbility;
import com.ss.android.ugc.aweme.tako.ui.TakoChatUIAbility;
import com.ss.android.ugc.aweme.tako.vm.TakoFragmentViewModel;
import com.zhiliaoapp.musically.R;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AFwS216S0000000_27;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.AFwS269S0000000_27;
import kotlin.jvm.internal.AwS393S0200000_27;
import kotlin.jvm.internal.AwS462S0200000_27;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS571S0100000_27;
import kotlin.jvm.internal.AwS606S0100000_27;
import kotlin.jvm.internal.AwS641S0100000_27;

/* JADX INFO: loaded from: classes28.dex */
public final class VoiceInputAssem extends UISlotAssem implements IVoiceInputAbility, InterfaceC1554640qYg {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJZ;
    public final AssemVMLazy LLJJI;
    public final AssemVMLazy LLJJIII;
    public final AssemVMLazy LLJJIJI;
    public final C01GW LLJJIJIIJIL;
    public final C01GW LLJJIJIL;
    public final C01GW LLJJJ;
    public final C01GW LLJJJIL;
    public final C01GW LLJJJJ;
    public final C01GW LLJJJJJIL;
    public final C01GW LLJJJJLIIL;
    public final C01GW LLJJL;
    public ChoreographerFrameCallbackC1855380yNk LLJJLIIIJLLLLLLLZ;
    public View LLJL;
    public TuxIconView LLJLIL;
    public C1855370yNj LLJLILLLLZIIL;
    public int LLJLL;
    public boolean LLJLLIL;
    public boolean LLJLLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(VoiceInputAssem.class, "speechViewModel", "getSpeechViewModel()Lcom/ss/android/ugc/aweme/tako/botpage/bottombox/vm/TakoSpeechViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(VoiceInputAssem.class, "bottomInputViewModel", "getBottomInputViewModel()Lcom/ss/android/ugc/aweme/tako/botpage/bottombox/vm/BottomInputViewModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(VoiceInputAssem.class, "fragmentVM", "getFragmentVM()Lcom/ss/android/ugc/aweme/tako/vm/TakoFragmentViewModel;", 0);
        c09r3.getClass();
        LLJZ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3};
    }

    public VoiceInputAssem() {
        C019F c019f = C019F.LIZ;
        C1637906bB c1637906bBLIZ = C1637806bA.LIZ(AFwS264S0000000_24.get$arr$(429));
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(TakoSpeechViewModel.class);
        this.LLJJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, c1637906bBLIZ, new AwS562S0100000_18(c19719912DlLIZ, 2311), AFwS269S0000000_27.get$arr$(200), null, true);
        C1637906bB c1637906bBLIZ2 = C1637806bA.LIZ(AFwS264S0000000_24.get$arr$(427));
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(BottomInputViewModel.class);
        this.LLJJIII = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c019f, c1637906bBLIZ2, new AwS562S0100000_18(c19719912DlLIZ2, 2312), AFwS269S0000000_27.get$arr$(201), null, true);
        C1637906bB c1637906bBLIZ3 = C1637806bA.LIZ(AFwS264S0000000_24.get$arr$(428));
        C19719912Dl c19719912DlLIZ3 = C13LE.LIZ(TakoFragmentViewModel.class);
        this.LLJJIJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ3), c019f, c1637906bBLIZ3, new AwS562S0100000_18(c19719912DlLIZ3, 2313), AFwS269S0000000_27.get$arr$(202), null, true);
        this.LLJJIJIIJIL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1244));
        this.LLJJIJIL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1245));
        this.LLJJJ = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1242));
        this.LLJJJIL = C452501pT.LIZIZ(new AwS571S0100000_27(this, 688));
        this.LLJJJJ = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1241));
        this.LLJJJJJIL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1246));
        this.LLJJJJLIIL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1243));
        this.LLJJL = C452501pT.LIZIZ(AFwS216S0000000_27.get$arr$(173));
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.fpf;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onPause_isOnPauseEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != -276319316) {
            return null;
        }
        return this;
    }

    public static void op() {
        BusinessCapabilityService.LIZ.getClass();
        BusinessCapabilityService businessCapabilityServiceLIZ = C1355280lN8.LIZ();
        if (businessCapabilityServiceLIZ != null) {
            businessCapabilityServiceLIZ.LIZIZ(EnumC1355300lNA.TAKO_VOICE_MESSAGE);
        }
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.bottombox.inputv2.voice.IVoiceInputAbility
    public final void RR1() {
        View view = this.LLJL;
        if (view != null) {
            view.setEnabled(true);
        }
        TuxIconView tuxIconView = this.LLJLIL;
        if (tuxIconView != null) {
            tuxIconView.setEnabled(true);
        }
        TuxIconView tuxIconView2 = this.LLJLIL;
        if (tuxIconView2 != null) {
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = (C07IF.LIZ() || C07I1.LIZ()) ? R.raw.icon_microphone : R.raw.icon_mic_fill;
            c419910GdJ.LJ = Integer.valueOf(R.attr.a1h);
            tuxIconView2.setTuxIcon(c419910GdJ);
        }
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.bottombox.inputv2.voice.IVoiceInputAbility
    public final void Tc() {
        C1855370yNj c1855370yNj = this.LLJLILLLLZIIL;
        if (c1855370yNj != null) {
            c1855370yNj.LIZIZ();
        }
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.bottombox.inputv2.voice.IVoiceInputAbility
    public final void dA() {
        ChoreographerFrameCallbackC1855380yNk choreographerFrameCallbackC1855380yNk = this.LLJJLIIIJLLLLLLLZ;
        if (choreographerFrameCallbackC1855380yNk != null) {
            choreographerFrameCallbackC1855380yNk.LIZJ();
        }
        C1862330yYx c1862330yYx = C1862330yYx.LIZ;
        Map<String, String> commonParams = getCommonParams();
        c1862330yYx.getClass();
        C1862330yYx.LLFFF("click", "button_click", commonParams);
    }

    public final BottomInputViewModel kp() {
        AssemVMLazy assemVMLazy = this.LLJJIII;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJZ;
        return (BottomInputViewModel) assemVMLazy.getValue();
    }

    public final ITakoContextAbility lp() {
        return (ITakoContextAbility) this.LLJJJ.getValue();
    }

    public final TakoSpeechViewModel mp() {
        AssemVMLazy assemVMLazy = this.LLJJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJZ;
        return (TakoSpeechViewModel) assemVMLazy.getValue();
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.bottombox.inputv2.voice.IVoiceInputAbility
    public final boolean Uz0() {
        if (!kp().getState().LLILZLL || this.LLJLLIL) {
            return false;
        }
        this.LLJLLIL = true;
        ChoreographerFrameCallbackC1855380yNk choreographerFrameCallbackC1855380yNk = this.LLJJLIIIJLLLLLLLZ;
        if (choreographerFrameCallbackC1855380yNk != null) {
            choreographerFrameCallbackC1855380yNk.LIZJ();
        }
        return true;
    }

    public final Map<String, String> getCommonParams() {
        Map<String, String> commonParams;
        ITakoContextAbility iTakoContextAbilityLp = lp();
        return (iTakoContextAbilityLp == null || (commonParams = iTakoContextAbilityLp.getCommonParams()) == null) ? C2097608Jq.LJ() : commonParams;
    }

    public final boolean hp() {
        C1854150yLl c1854150yLl = kp().getState().LLILLJJLI;
        return !(c1854150yLl != null && c1854150yLl.LL == 3);
    }

    public final boolean ip() {
        return kp().getState().LLJILJIL.length() == 0 || kp().getState().LLILZIL;
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.bottombox.inputv2.voice.IVoiceInputAbility
    public final void kd() {
        if (mp().getState().LLILLJJLI) {
            ChoreographerFrameCallbackC1855380yNk choreographerFrameCallbackC1855380yNk = this.LLJJLIIIJLLLLLLLZ;
            if (choreographerFrameCallbackC1855380yNk != null) {
                choreographerFrameCallbackC1855380yNk.LIZJ();
            }
            C1862330yYx c1862330yYx = C1862330yYx.LIZ;
            Map<String, String> commonParams = getCommonParams();
            c1862330yYx.getClass();
            C1862330yYx.LLFFF("passive", "button_click", commonParams);
        }
        op();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        C1855370yNj c1855370yNj = this.LLJLILLLLZIIL;
        if (c1855370yNj != null) {
            c1855370yNj.LIZIZ();
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        super.onParentSet();
        C1558520qew.LIZLLL(this);
    }

    @Override // X.AbstractC738140SxQ
    public final void onPause() {
        kd();
        C1855370yNj c1855370yNj = this.LLJLILLLLZIIL;
        if (c1855370yNj != null) {
            c1855370yNj.LIZIZ();
        }
        super.onPause();
    }

    public static void sp(final VoiceInputAssem voiceInputAssem) {
        String str;
        String str2;
        C13LC<C1863850ybP> c13lcT71;
        C1863850ybP c1863850ybP;
        String strUN0;
        EnumC1863020ya4 enumC1863020ya4JS1;
        C13LC<C1864200yby> c13lcAp0;
        C1864200yby c1864200yby;
        C13LC<C1864200yby> c13lcAp02;
        C1864200yby c1864200yby2;
        voiceInputAssem.getClass();
        C1862330yYx c1862330yYx = C1862330yYx.LIZ;
        Map<String, String> commonParams = voiceInputAssem.getCommonParams();
        c1862330yYx.getClass();
        C1862330yYx.LJJLIIIJLJLI("voice", "button_click", commonParams);
        TakoChatUIAbility takoChatUIAbility = (TakoChatUIAbility) voiceInputAssem.LLJJJJJIL.getValue();
        if (takoChatUIAbility != null && takoChatUIAbility.Ve0()) {
            ITakoContextAbility iTakoContextAbilityLp = voiceInputAssem.lp();
            String mobOnboardingStyle = null;
            if (iTakoContextAbilityLp != null && (c13lcAp02 = iTakoContextAbilityLp.Ap0()) != null && (c1864200yby2 = (C1864200yby) c13lcAp02.LIZIZ()) != null) {
                str = c1864200yby2.LL;
            } else {
                str = null;
            }
            String str3 = "";
            if (str == null) {
                str = "";
            }
            ITakoContextAbility iTakoContextAbilityLp2 = voiceInputAssem.lp();
            if (iTakoContextAbilityLp2 != null && (c13lcAp0 = iTakoContextAbilityLp2.Ap0()) != null && (c1864200yby = (C1864200yby) c13lcAp0.LIZIZ()) != null) {
                str2 = c1864200yby.LLILLJJLI;
            } else {
                str2 = null;
            }
            ITakoContextAbility iTakoContextAbilityLp3 = voiceInputAssem.lp();
            if (iTakoContextAbilityLp3 != null && (c13lcT71 = iTakoContextAbilityLp3.T71()) != null && (c1863850ybP = (C1863850ybP) c13lcT71.LIZIZ()) != null) {
                String str4 = c1863850ybP.LL;
                if (str4 == null) {
                    str4 = "";
                }
                String str5 = c1863850ybP.LLILLJJLI;
                if (str5 == null) {
                    str5 = "";
                }
                String str6 = c1863850ybP.LLILZIL;
                if (str6 == null) {
                    str6 = "";
                }
                TakoChatUIAbility takoChatUIAbility2 = (TakoChatUIAbility) voiceInputAssem.LLJJJJJIL.getValue();
                if (takoChatUIAbility2 != null) {
                    strUN0 = takoChatUIAbility2.uN0();
                } else {
                    strUN0 = null;
                }
                String str7 = c1863850ybP.LLJ;
                if (str7 == null) {
                    str7 = "";
                }
                if (str2 != null) {
                    str3 = str2;
                }
                TakoChatUIAbility takoChatUIAbility3 = (TakoChatUIAbility) voiceInputAssem.LLJJJJJIL.getValue();
                if (takoChatUIAbility3 != null && (enumC1863020ya4JS1 = takoChatUIAbility3.jS1()) != null) {
                    mobOnboardingStyle = enumC1863020ya4JS1.getMobOnboardingStyle();
                }
                C1862330yYx.LJJZ(512, c1862330yYx, str4, str5, str6, str, c1863850ybP.LLIZ, strUN0, str7, str3, "click_voice_button", mobOnboardingStyle);
            }
        }
        BusinessCapabilityService.LIZ.getClass();
        BusinessCapabilityService businessCapabilityServiceLIZ = C1355280lN8.LIZ();
        if (businessCapabilityServiceLIZ != null) {
            EnumC1355300lNA enumC1355300lNA = EnumC1355300lNA.TAKO_VOICE_MESSAGE;
            Set<? extends EnumC1355290lN9> setLJLIIL = C13LQ.LJLIIL(new EnumC1355290lN9[]{EnumC1355290lN9.AUDIO_FOCUS, EnumC1355290lN9.MICROPHONE});
            C1360910lWD c1360910lWD = new C1360910lWD(Collections.singleton(EnumC1355300lNA.VOICE_CALL), new InterfaceC1360930lWF() { // from class: X.0yNR
                @Override // X.InterfaceC1360930lWF
                public final void LIZ(EnumC1355300lNA enumC1355300lNA2, Set set) {
                    this.LIZ.kd();
                }
            });
            businessCapabilityServiceLIZ.LIZ(enumC1355300lNA);
            if (C1355270lN7.LIZIZ(businessCapabilityServiceLIZ.LJFF(enumC1355300lNA, setLJLIIL, c1360910lWD))) {
                C19EG c19egLIZ = C724240Sb0.LIZ(voiceInputAssem);
                if (c19egLIZ != null) {
                    C1389890mGx c1389890mGx = new C1389890mGx(c19egLIZ);
                    c1389890mGx.LJIIIZ(2131832241);
                    c1389890mGx.LJIIJJI();
                    return;
                }
                return;
            }
        }
        ChoreographerFrameCallbackC1855380yNk choreographerFrameCallbackC1855380yNk = voiceInputAssem.LLJJLIIIJLLLLLLLZ;
        if (choreographerFrameCallbackC1855380yNk == null) {
            return;
        }
        choreographerFrameCallbackC1855380yNk.LIZIZ();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        ChoreographerFrameCallbackC1855380yNk choreographerFrameCallbackC1855380yNk;
        View viewC62;
        View viewFindViewById;
        TuxIconView tuxIconView;
        View viewC622;
        View viewFindViewById2;
        ViewGroup.LayoutParams layoutParams;
        int i;
        TuxAlertBadgeLayout tuxAlertBadgeLayout;
        super.onViewCreated(view);
        if (view instanceof ChoreographerFrameCallbackC1855380yNk) {
            choreographerFrameCallbackC1855380yNk = (ChoreographerFrameCallbackC1855380yNk) view;
        } else {
            choreographerFrameCallbackC1855380yNk = null;
        }
        this.LLJJLIIIJLLLLLLLZ = choreographerFrameCallbackC1855380yNk;
        IBottomInputHostAbility iBottomInputHostAbility = (IBottomInputHostAbility) this.LLJJJJLIIL.getValue();
        if (iBottomInputHostAbility != null) {
            viewC62 = iBottomInputHostAbility.C62();
        } else {
            viewC62 = null;
        }
        if (viewC62 != null) {
            viewFindViewById = viewC62.findViewById(R.id.voice_badge_layout);
        } else {
            viewFindViewById = null;
        }
        this.LLJL = viewFindViewById;
        if (viewC62 != null) {
            tuxIconView = (TuxIconView) viewC62.findViewById(R.id.voice_btn);
        } else {
            tuxIconView = null;
        }
        this.LLJLIL = tuxIconView;
        if (viewC62 != null && (tuxAlertBadgeLayout = (TuxAlertBadgeLayout) viewC62.findViewById(R.id.voice_badge)) != null) {
            tuxAlertBadgeLayout.LIZIZ();
        }
        TuxIconView tuxIconView2 = this.LLJLIL;
        if (tuxIconView2 != null) {
            C419910GdJ c419910GdJ = new C419910GdJ();
            if (!C07IF.LIZ() && !C07I1.LIZ()) {
                i = R.raw.icon_mic_fill;
            } else {
                i = R.raw.icon_microphone;
            }
            c419910GdJ.LIZ = i;
            c419910GdJ.LJ = Integer.valueOf(R.attr.a1h);
            tuxIconView2.setTuxIcon(c419910GdJ);
        }
        C1163410gNf.LIZ.getClass();
        if (C1163410gNf.LIZ()) {
            TuxIconView tuxIconView3 = this.LLJLIL;
            if (tuxIconView3 != null) {
                ViewGroup.LayoutParams layoutParams2 = tuxIconView3.getLayoutParams();
                if (layoutParams2 != null) {
                    layoutParams2.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
                    layoutParams2.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
                } else {
                    layoutParams2 = null;
                }
                C786410Ut5.M6(tuxIconView3, layoutParams2);
            }
            IBottomInputHostAbility iBottomInputHostAbility2 = (IBottomInputHostAbility) this.LLJJJJLIIL.getValue();
            if (iBottomInputHostAbility2 != null && (viewC622 = iBottomInputHostAbility2.C62()) != null && (viewFindViewById2 = viewC622.findViewById(R.id.voice_badge_layout)) != null && (layoutParams = viewFindViewById2.getLayoutParams()) != null) {
                layoutParams.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(36));
                layoutParams.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(36));
            }
        }
        View view2 = this.LLJL;
        if (view2 != null) {
            C786410Ut5.I7(new ACListenerS161S0100000_27(this, 193), view2);
        }
        ChoreographerFrameCallbackC1855380yNk choreographerFrameCallbackC1855380yNk2 = this.LLJJLIIIJLLLLLLLZ;
        if (choreographerFrameCallbackC1855380yNk2 != null) {
            choreographerFrameCallbackC1855380yNk2.setVoiceInputStateListener(new AwS393S0200000_27(this, choreographerFrameCallbackC1855380yNk2, 167));
        }
        TakoSpeechViewModel takoSpeechViewModelMp = mp();
        C736680Sv4.LJIIIIZZ(this, takoSpeechViewModelMp, new C2217381BqS() { // from class: X.0yNg
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1855260yNY) obj).LLILLL;
            }
        }, C736820SvI.LIZLLL(), new AwS462S0200000_27(this, takoSpeechViewModelMp, 22), 4);
        C736680Sv4.LJIIIIZZ(this, takoSpeechViewModelMp, new C2217381BqS() { // from class: X.0yNA
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1855260yNY) obj).LLILZ;
            }
        }, C736820SvI.LIZLLL(), new AwS641S0100000_27(this, 160), 4);
        C736680Sv4.LJIIIIZZ(this, takoSpeechViewModelMp, new C2217381BqS() { // from class: X.0yMt
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C1855260yNY) obj).LLILLJJLI);
            }
        }, C736820SvI.LIZLLL(), new AwS641S0100000_27(this, 161), 4);
        C736680Sv4.LJIIIIZZ(this, takoSpeechViewModelMp, new C2217381BqS() { // from class: X.0yN7
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1855260yNY) obj).LLIZ;
            }
        }, C736820SvI.LIZLLL(), new AwS641S0100000_27(this, 162), 4);
        C736680Sv4.LJIIIIZZ(this, kp(), new C2217381BqS() { // from class: X.0yNP
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C1855040yNC) obj).LLILZLL);
            }
        }, C736820SvI.LIZLLL(), new AwS641S0100000_27(this, 163), 4);
        C736680Sv4.LJIIIIZZ(this, kp(), new C2217381BqS() { // from class: X.0yNT
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1855040yNC) obj).LL;
            }
        }, null, new AwS641S0100000_27(this, 159), 6);
        C1852420yIy c1852420yIy = (C1852420yIy) this.LLJJL.getValue();
        if (c1852420yIy != null) {
            TakoListAutoPlayAbility takoListAutoPlayAbility = (TakoListAutoPlayAbility) this.LLJJJJ.getValue();
            if (takoListAutoPlayAbility != null) {
                takoListAutoPlayAbility.sB2(c1852420yIy);
            }
            c1852420yIy.LIZIZ(!mp().getState().LLILLJJLI);
        }
        IMessageAbility iMessageAbility = (IMessageAbility) this.LLJJIJIL.getValue();
        if (iMessageAbility != null) {
            iMessageAbility.tx1(new AwS606S0100000_27(this, 198));
        }
        IMessageAbility iMessageAbility2 = (IMessageAbility) this.LLJJIJIL.getValue();
        if (iMessageAbility2 != null) {
            iMessageAbility2.aC2(new AwS606S0100000_27(this, 199));
        }
        AssemVMLazy assemVMLazy = this.LLJJIJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJZ;
        C736680Sv4.LJIIIIZZ(this, assemVMLazy.getValue(), new C2217381BqS() { // from class: X.0yNI
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1853920yLO) obj).LL;
            }
        }, null, new AwS641S0100000_27(this, 41), 6);
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C319980CgW(this, null), 3);
    }

    public final void tp(boolean z) {
        int i;
        View view = this.LLJL;
        if (view != null) {
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            C786410Ut5.LJLLLLLL(i, view);
        }
    }

    public final void up(boolean z) {
        int i;
        ChoreographerFrameCallbackC1855380yNk choreographerFrameCallbackC1855380yNk = this.LLJJLIIIJLLLLLLLZ;
        if (choreographerFrameCallbackC1855380yNk != null) {
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            C786410Ut5.Y0(choreographerFrameCallbackC1855380yNk, i);
        }
    }
}
