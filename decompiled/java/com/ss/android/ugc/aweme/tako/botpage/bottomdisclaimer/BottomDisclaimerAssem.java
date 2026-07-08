package com.ss.android.ugc.aweme.tako.botpage.bottomdisclaimer;

import X.AnonymousClass0956;
import X.C019F;
import X.C01GW;
import X.C09R3;
import X.C13LE;
import X.C1637806bA;
import X.C1637906bB;
import X.C1857750yRZ;
import X.C19719912Dl;
import X.C20243414Iu;
import X.C2217381BqS;
import X.C452501pT;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.InterfaceC2217461Bqa;
import android.view.View;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.tako.botpage.bottombox.vm.TakoPhotoPickerPanelViewModel;
import com.ss.android.ugc.aweme.tako.botpage.components.action.multiple.TakoMultipleSelectVM;
import com.ss.android.ugc.aweme.tako.botpage.vm.ability.IMessageAbility;
import com.ss.android.ugc.aweme.tako.vm.TakoFragmentViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS219S0000000_30;
import kotlin.jvm.internal.AFwS274S0000000_30;
import kotlin.jvm.internal.AwS36S0010000_24;
import kotlin.jvm.internal.AwS574S0100000_30;
import kotlin.jvm.internal.AwS609S0100000_30;
import kotlin.jvm.internal.AwS644S0100000_30;

/* JADX INFO: loaded from: classes31.dex */
public final class BottomDisclaimerAssem extends UISlotAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJL;
    public TuxTextView LLJJI;
    public final C20243414Iu LLJJIII = new C20243414Iu(0);
    public boolean LLJJIJI;
    public boolean LLJJIJIIJIL;
    public final AssemVMLazy LLJJIJIL;
    public boolean LLJJJ;
    public final AssemVMLazy LLJJJIL;
    public boolean LLJJJJ;
    public AnonymousClass0956 LLJJJJJIL;
    public final C01GW LLJJJJLIIL;
    public final C01GW LLJJL;
    public final AssemVMLazy LLJJLIIIJLLLLLLLZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(BottomDisclaimerAssem.class, "photoPickerPanelViewModel", "getPhotoPickerPanelViewModel()Lcom/ss/android/ugc/aweme/tako/botpage/bottombox/vm/TakoPhotoPickerPanelViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(BottomDisclaimerAssem.class, "multipleSelectVM", "getMultipleSelectVM()Lcom/ss/android/ugc/aweme/tako/botpage/components/action/multiple/TakoMultipleSelectVM;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(BottomDisclaimerAssem.class, "fragmentVM", "getFragmentVM()Lcom/ss/android/ugc/aweme/tako/vm/TakoFragmentViewModel;", 0);
        c09r3.getClass();
        LLJL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3};
    }

    public BottomDisclaimerAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(TakoPhotoPickerPanelViewModel.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLJJIJIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, c1637906bB, new AwS574S0100000_30(c19719912DlLIZ, 208), AFwS274S0000000_30.get$arr$(131), null, true);
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(TakoMultipleSelectVM.class);
        this.LLJJJIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c019f, c1637906bB, new AwS574S0100000_30(c19719912DlLIZ2, 209), AFwS274S0000000_30.get$arr$(132), null, true);
        this.LLJJJJLIIL = C452501pT.LIZIZ(AFwS219S0000000_30.get$arr$(108));
        this.LLJJL = C452501pT.LIZIZ(new AwS574S0100000_30(this, 207));
        C19719912Dl c19719912DlLIZ3 = C13LE.LIZ(TakoFragmentViewModel.class);
        this.LLJJLIIIJLLLLLLLZ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ3), c019f, c1637906bB, new AwS574S0100000_30(c19719912DlLIZ3, 210), AFwS274S0000000_30.get$arr$(133), null, true);
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.fk9;
    }

    public final void kp() {
        if (this.LLJJIJIIJIL || this.LLJJJ || this.LLJJJJ) {
            ip(false);
            return;
        }
        if (this.LLJJIJI) {
            hp(true);
            ip(true);
        } else if (!((Boolean) this.LLJJJJLIIL.getValue()).booleanValue()) {
            ip(false);
        } else {
            hp(false);
            ip(true);
        }
    }

    public final void hp(boolean z) {
        String strLJII;
        TuxTextView tuxTextView = this.LLJJI;
        if (tuxTextView != null) {
            if (z) {
                strLJII = C1857750yRZ.LJII(2131849803);
            } else {
                strLJII = C1857750yRZ.LJII(2131849774);
            }
            tuxTextView.setText(strLJII);
        }
        TuxTextView tuxTextView2 = this.LLJJI;
        if (tuxTextView2 != null) {
            this.LLJJIII.LJ.invoke(tuxTextView2, Boolean.TRUE);
        }
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
        AssemVMLazy assemVMLazy = this.LLJJLIIIJLLLLLLLZ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJL;
        assemVMLazy.getValue().setState(new AwS36S0010000_24(z, 33));
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        this.LLJJI = (TuxTextView) view.findViewById(R.id.cct);
        AssemVMLazy assemVMLazy = this.LLJJLIIIJLLLLLLLZ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJL;
        ((TakoFragmentViewModel) assemVMLazy.getValue()).wQ2(new AwS609S0100000_30(this, 144));
        C736680Sv4.LJIIIIZZ(this, this.LLJJIJIL.getValue(), new C2217381BqS() { // from class: X.0yIe
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C1852180yIa) obj).LLILLJJLI);
            }
        }, null, new AwS644S0100000_30(this, 31), 6);
        IMessageAbility iMessageAbility = (IMessageAbility) this.LLJJL.getValue();
        if (iMessageAbility != null) {
            iMessageAbility.B82(new AwS609S0100000_30(this, 143));
        }
        ((TakoMultipleSelectVM) this.LLJJJIL.getValue()).GQ2(new AwS609S0100000_30(this, 145));
    }
}
