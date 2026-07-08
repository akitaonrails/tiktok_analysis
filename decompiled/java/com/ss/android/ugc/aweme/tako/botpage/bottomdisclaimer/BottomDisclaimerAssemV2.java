package com.ss.android.ugc.aweme.tako.botpage.bottomdisclaimer;

import X.AnonymousClass0956;
import X.C019F;
import X.C01GW;
import X.C09R3;
import X.C1308910kAL;
import X.C13LE;
import X.C1637806bA;
import X.C1637906bB;
import X.C1857690yRT;
import X.C19719912Dl;
import X.C1AF0;
import X.C20243414Iu;
import X.C20267914Sf;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C431260Gvc;
import X.C452501pT;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC2217461Bqa;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.tako.botpage.bottombox.vm.TakoPhotoPickerPanelViewModel;
import com.ss.android.ugc.aweme.tako.botpage.components.action.multiple.TakoMultipleSelectVM;
import com.ss.android.ugc.aweme.tako.botpage.vm.ability.IMessageAbility;
import com.ss.android.ugc.aweme.tako.experiment.TakoBottomDisclaimerContentConfig;
import com.ss.android.ugc.aweme.tako.vm.TakoFragmentViewModel;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.jvm.internal.AFwS219S0000000_30;
import kotlin.jvm.internal.AFwS274S0000000_30;
import kotlin.jvm.internal.AwS36S0010000_24;
import kotlin.jvm.internal.AwS55S1000000_4;
import kotlin.jvm.internal.AwS574S0100000_30;
import kotlin.jvm.internal.AwS609S0100000_30;
import kotlin.jvm.internal.AwS644S0100000_30;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes31.dex */
public final class BottomDisclaimerAssemV2 extends UISlotAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJLIIIJLLLLLLLZ;
    public TuxTextView LLJJI;
    public boolean LLJJIII;
    public boolean LLJJIJI;
    public final AssemVMLazy LLJJIJIIJIL;
    public boolean LLJJIJIL;
    public final AssemVMLazy LLJJJ;
    public boolean LLJJJIL;
    public AnonymousClass0956 LLJJJJ;
    public final C01GW LLJJJJJIL;
    public final C01GW LLJJJJLIIL;
    public final AssemVMLazy LLJJL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(BottomDisclaimerAssemV2.class, "photoPickerPanelViewModel", "getPhotoPickerPanelViewModel()Lcom/ss/android/ugc/aweme/tako/botpage/bottombox/vm/TakoPhotoPickerPanelViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(BottomDisclaimerAssemV2.class, "multipleSelectVM", "getMultipleSelectVM()Lcom/ss/android/ugc/aweme/tako/botpage/components/action/multiple/TakoMultipleSelectVM;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(BottomDisclaimerAssemV2.class, "fragmentVM", "getFragmentVM()Lcom/ss/android/ugc/aweme/tako/vm/TakoFragmentViewModel;", 0);
        c09r3.getClass();
        LLJJLIIIJLLLLLLLZ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3};
    }

    public BottomDisclaimerAssemV2() {
        new C20243414Iu(0);
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(TakoPhotoPickerPanelViewModel.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLJJIJIIJIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, c1637906bB, new AwS574S0100000_30(c19719912DlLIZ, 212), AFwS274S0000000_30.get$arr$(134), null, true);
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(TakoMultipleSelectVM.class);
        this.LLJJJ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c019f, c1637906bB, new AwS574S0100000_30(c19719912DlLIZ2, 213), AFwS274S0000000_30.get$arr$(135), null, true);
        this.LLJJJJJIL = C452501pT.LIZIZ(AFwS219S0000000_30.get$arr$(109));
        this.LLJJJJLIIL = C452501pT.LIZIZ(new AwS574S0100000_30(this, 211));
        C19719912Dl c19719912DlLIZ3 = C13LE.LIZ(TakoFragmentViewModel.class);
        this.LLJJL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ3), c019f, c1637906bB, new AwS574S0100000_30(c19719912DlLIZ3, 214), AFwS274S0000000_30.get$arr$(136), null, true);
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.fk_;
    }

    public final void kp() {
        if (this.LLJJIJI || this.LLJJIJIL || this.LLJJJIL || TakoBottomDisclaimerContentConfig.LIZ.getValue() == null) {
            ip(false);
            return;
        }
        if (this.LLJJIII) {
            hp(true);
            ip(true);
        } else if (!((Boolean) this.LLJJJJJIL.getValue()).booleanValue()) {
            ip(false);
        } else {
            hp(false);
            ip(true);
        }
    }

    public final void hp(boolean z) {
        Integer numLIZJ;
        TuxTextView tuxTextView;
        Integer numValueOf;
        Integer numLIZJ2;
        TakoBottomDisclaimerContentConfig.BottomDisclaimerContent bottomDisclaimerContent = (TakoBottomDisclaimerContentConfig.BottomDisclaimerContent) TakoBottomDisclaimerContentConfig.LIZ.getValue();
        if (bottomDisclaimerContent != null) {
            Context context = getContext();
            String str = bottomDisclaimerContent.contentLearnMore;
            if (str != null) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
                Map<String, TakoBottomDisclaimerContentConfig.Placeholder> mapLJ = bottomDisclaimerContent.placeholders;
                if (mapLJ == null) {
                    mapLJ = C2097608Jq.LJ();
                }
                for (Map.Entry<String, TakoBottomDisclaimerContentConfig.Placeholder> entry : mapLJ.entrySet()) {
                    String key = entry.getKey();
                    TakoBottomDisclaimerContentConfig.Placeholder value = entry.getValue();
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append('{');
                    sbLIZ.append(key);
                    sbLIZ.append('}');
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    while (a0.LJJIIZI(spannableStringBuilder, strLIZIZ, false)) {
                        int iLJJJ = a0.LJJJ(spannableStringBuilder, strLIZIZ, 0, false, 6);
                        spannableStringBuilder.replace(iLJJJ, strLIZIZ.length() + iLJJJ, (CharSequence) value.transValue);
                        String str2 = value.url;
                        if (str2 != null) {
                            int length = value.transValue.length() + iLJJJ;
                            if (context != null && (numLIZJ2 = C1308910kAL.LIZJ(R.attr.a1j, context)) != null) {
                                numValueOf = Integer.valueOf(C20267914Sf.LIZ(numLIZJ2.intValue(), C814420VxA.LIZ(165.75d)));
                            } else {
                                numValueOf = null;
                            }
                            C1857690yRT.LIZJ(spannableStringBuilder, iLJJJ, length, numValueOf, null, new AwS55S1000000_4(str2, 2));
                        }
                    }
                }
                TuxTextView tuxTextView2 = this.LLJJI;
                if (tuxTextView2 != null) {
                    tuxTextView2.setText(spannableStringBuilder);
                }
                TuxTextView tuxTextView3 = this.LLJJI;
                if (tuxTextView3 != null) {
                    tuxTextView3.setMovementMethod(C431260Gvc.LIZ);
                }
                TuxTextView tuxTextView4 = this.LLJJI;
                if (tuxTextView4 != null) {
                    tuxTextView4.setHighlightColor(0);
                }
                Context context2 = getContext();
                if (context2 != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.a1k, context2)) != null && (tuxTextView = this.LLJJI) != null) {
                    tuxTextView.setTextColor(C20267914Sf.LIZ(numLIZJ.intValue(), C814420VxA.LIZ(122.39999999999999d)));
                    return;
                }
                return;
            }
        }
        C1AF0.LIZJ("only set content when config != null");
    }

    public final void ip(boolean z) {
        int i;
        TuxTextView tuxTextView = this.LLJJI;
        if (tuxTextView != null) {
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            C786410Ut5.LLLLZLL(tuxTextView, i);
        }
        AssemVMLazy assemVMLazy = this.LLJJL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJLIIIJLLLLLLLZ;
        assemVMLazy.getValue().setState(new AwS36S0010000_24(z, 33));
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        this.LLJJI = (TuxTextView) view.findViewById(R.id.cct);
        AssemVMLazy assemVMLazy = this.LLJJL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJLIIIJLLLLLLLZ;
        ((TakoFragmentViewModel) assemVMLazy.getValue()).wQ2(new AwS609S0100000_30(this, 147));
        C736680Sv4.LJIIIIZZ(this, this.LLJJIJIIJIL.getValue(), new C2217381BqS() { // from class: X.0yIf
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C1852180yIa) obj).LLILLJJLI);
            }
        }, null, new AwS644S0100000_30(this, 32), 6);
        IMessageAbility iMessageAbility = (IMessageAbility) this.LLJJJJLIIL.getValue();
        if (iMessageAbility != null) {
            iMessageAbility.B82(new AwS609S0100000_30(this, 146));
        }
        ((TakoMultipleSelectVM) this.LLJJJ.getValue()).GQ2(new AwS609S0100000_30(this, 148));
    }
}
