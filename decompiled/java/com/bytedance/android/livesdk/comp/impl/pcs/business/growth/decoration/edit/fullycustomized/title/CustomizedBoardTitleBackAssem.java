package com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.edit.fullycustomized.title;

import X.C019F;
import X.C01DP;
import X.C01GW;
import X.C13LE;
import X.C1559260qg8;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C452501pT;
import X.C485590J2n;
import X.C485610J2p;
import X.C485620J2q;
import X.C723590SZx;
import X.C724750Sbp;
import X.C786410Ut5;
import X.InterfaceC2217461Bqa;
import android.view.View;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.edit.fullycustomized.edititem.vm.FullyCustomizedBoardEditPageViewModel;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.edit.fullycustomized.title.CustomizedBoardTitleBackAssem;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;

/* JADX INFO: loaded from: classes8.dex */
public final class CustomizedBoardTitleBackAssem extends UIContentAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJIJIL;
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new C485610J2p(this));
    public final AssemVMLazy LLJ;
    public final C1559260qg8 LLJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(CustomizedBoardTitleBackAssem.class, "editPageViewModel", "getEditPageViewModel()Lcom/bytedance/android/livesdk/comp/impl/pcs/business/growth/decoration/edit/fullycustomized/edititem/vm/FullyCustomizedBoardEditPageViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJIJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public CustomizedBoardTitleBackAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(FullyCustomizedBoardEditPageViewModel.class);
        this.LLJ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new C485590J2n(c19719912DlLIZ), new C485620J2q(), null, true);
        this.LLJI = new C1559260qg8(new C723590SZx(this, C01DP.class, "FullCustomizedBoardHierarchyData"), checkSupervisorPrepared());
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        C786410Ut5.g8((LiveIconView) this.LLIZLLLIL.getValue(), new View.OnClickListener() { // from class: X.0J2m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                boolean z;
                boolean z2;
                C01DP c01dp = (C01DP) this.LL.LLJI.getValue();
                if (c01dp.LLIZ == 1) {
                    z = true;
                } else {
                    z = false;
                }
                if (z || c01dp.LLILLL == 8) {
                    if (((C01DP) this.LL.LLJI.getValue()).LLILLL == 8) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    C01DX.LIZIZ("click", ((C01DP) this.LL.LLJI.getValue()).LLILZ, ((C01DP) this.LL.LLJI.getValue()).LLIZLLLIL, ((C01DP) this.LL.LLJI.getValue()).LLJ, "close", z2);
                }
                AssemVMLazy assemVMLazy = this.LL.LLJ;
                InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = CustomizedBoardTitleBackAssem.LLJIJIL;
                ((FullyCustomizedBoardEditPageViewModel) assemVMLazy.getValue()).yQ2(false);
            }
        });
    }
}
