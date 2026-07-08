package com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.edit.fullycustomized.edititem.bottom.font;

import X.C019F;
import X.C01GW;
import X.C056H;
import X.C056I;
import X.C056J;
import X.C09R3;
import X.C13LE;
import X.C1637806bA;
import X.C1637906bB;
import X.C1817900xPI;
import X.C1817930xPL;
import X.C1817950xPN;
import X.C1817970xPP;
import X.C196990125k;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C452501pT;
import X.C500260Jjc;
import X.C724750Sbp;
import X.InterfaceC2217461Bqa;
import X.InterfaceC971680bOQ;
import android.content.Context;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.edit.fullycustomized.edititem.vm.FullyCustomizedBoardEditFontViewModel;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.edit.fullycustomized.edititem.vm.FullyCustomizedBoardTextColorViewModel;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes28.dex */
public final class CustomizedBoardTextFontSelectAreaAssem extends UIContentAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJIJIL;
    public View LLIZLLLIL;
    public final C01GW LLJ = C452501pT.LIZIZ(new C056J(this));
    public final AssemVMLazy LLJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(CustomizedBoardTextFontSelectAreaAssem.class, "textColorViewModel", "getTextColorViewModel()Lcom/bytedance/android/livesdk/comp/impl/pcs/business/growth/decoration/edit/fullycustomized/edititem/vm/FullyCustomizedBoardTextColorViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(CustomizedBoardTextFontSelectAreaAssem.class, "fontViewModel", "getFontViewModel()Lcom/bytedance/android/livesdk/comp/impl/pcs/business/growth/decoration/edit/fullycustomized/edititem/vm/FullyCustomizedBoardEditFontViewModel;", 0);
        c09r3.getClass();
        LLJIJIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    public CustomizedBoardTextFontSelectAreaAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(FullyCustomizedBoardTextColorViewModel.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, c1637906bB, new C056H(c19719912DlLIZ), new C1817970xPP(), null, true);
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(FullyCustomizedBoardEditFontViewModel.class);
        this.LLJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c019f, c1637906bB, new C056I(c19719912DlLIZ2), new C1817950xPN(), null, true);
    }

    public final FullyCustomizedBoardEditFontViewModel Go() {
        AssemVMLazy assemVMLazy = this.LLJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJIJIL;
        return (FullyCustomizedBoardEditFontViewModel) assemVMLazy.getValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        C196990125k c196990125kLJII;
        super.onViewCreated(view);
        C500260Jjc.LLFFF(LJJIJL());
        Context context = getContext();
        if (context != null) {
            InterfaceC971680bOQ interfaceC971680bOQ = Go().LL;
            if (interfaceC971680bOQ != null) {
                c196990125kLJII = interfaceC971680bOQ.LJII(new ContextThemeWrapper(context, R.style.z4), new C1817900xPI(this), new C1817930xPL(this));
            } else {
                c196990125kLJII = null;
            }
            this.LLIZLLLIL = c196990125kLJII;
            if (c196990125kLJII != null) {
                ((ViewGroup) this.LLJ.getValue()).addView(c196990125kLJII);
            }
        }
    }
}
