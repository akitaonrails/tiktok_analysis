package com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.edit.fullycustomized;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C09R3;
import X.C1001300cAC;
import X.C1001310cAD;
import X.C1001330cAF;
import X.C1001340cAG;
import X.C1001350cAH;
import X.C1001360cAI;
import X.C1001370cAJ;
import X.C13LE;
import X.C1637806bA;
import X.C1637906bB;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C452501pT;
import X.C497740JfY;
import X.C500260Jjc;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.InterfaceC2217461Bqa;
import android.view.View;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.edit.decorationtools.DecorationBottomBarHeightViewModel;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;

/* JADX INFO: loaded from: classes17.dex */
public final class CustomizedBoardKeyboardPlaceHolderAssem extends UIContentAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILJILJ;
    public final AssemVMLazy LLIZLLLIL;
    public final AssemVMLazy LLJ;
    public int LLJI;
    public final C01GW LLJIJIL;
    public int LLJILJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(CustomizedBoardKeyboardPlaceHolderAssem.class, "customizedBoardEditFragmentViewModel", "getCustomizedBoardEditFragmentViewModel()Lcom/bytedance/android/livesdk/comp/impl/pcs/business/growth/decoration/edit/fullycustomized/CustomizedBoardEditFragmentViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(CustomizedBoardKeyboardPlaceHolderAssem.class, "decorationBottomBarHeightViewModel", "getDecorationBottomBarHeightViewModel()Lcom/bytedance/android/livesdk/comp/impl/pcs/business/growth/decoration/edit/decorationtools/DecorationBottomBarHeightViewModel;", 0);
        c09r3.getClass();
        LLJILJILJ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    public CustomizedBoardKeyboardPlaceHolderAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(CustomizedBoardEditFragmentViewModel.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLIZLLLIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, c1637906bB, new C1001330cAF(c19719912DlLIZ), new C1001370cAJ(), null, true);
        C01D1 c01d1 = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(DecorationBottomBarHeightViewModel.class);
        this.LLJ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c01d1, c1637906bB, new C1001340cAG(c19719912DlLIZ2), new C1001360cAI(), null, true);
        this.LLJIJIL = C452501pT.LIZIZ(new C1001350cAH(this));
        this.LLJILJIL = (int) C497740JfY.LIZIZ(250.0f);
    }

    @Override // com.bytedance.assem.arch.view.UIContentAssem, com.bytedance.assem.arch.core.UIAssem
    public final void xo() {
        super.xo();
        C500260Jjc.LJJZ(this.LLJILJIL, (View) this.LLJIJIL.getValue());
        AssemVMLazy assemVMLazy = this.LLJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILJILJ;
        C736680Sv4.LJIIIIZZ(this, assemVMLazy.getValue(), new C2217381BqS() { // from class: X.0cAB
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((C995730c1D) obj).LL);
            }
        }, null, new C1001310cAD(this), 6);
        C736680Sv4.LJIIIIZZ(this, this.LLIZLLLIL.getValue(), new C2217381BqS() { // from class: X.0cAE
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C230600um) obj).LLILLJJLI;
            }
        }, C736820SvI.LIZLLL(), new C1001300cAC(this), 4);
    }
}
