package com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.edit.fullycustomized.edititem.bottom.font;

import X.AnonymousClass0559;
import X.C019F;
import X.C01DP;
import X.C06IX;
import X.C1146004e2;
import X.C13LE;
import X.C1559260qg8;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C723590SZx;
import X.C723850SaN;
import X.C724750Sbp;
import X.InterfaceC2217461Bqa;
import android.view.View;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.edit.fullycustomized.edititem.vm.FullyCustomizedBoardEditPageViewModel;
import com.bytedance.assem.arch.view.UIContentAssem;

/* JADX INFO: loaded from: classes3.dex */
public final class CustomizedBoardTextFontAssem extends UIContentAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJ;
    public final C1559260qg8 LLIZLLLIL = new C1559260qg8(new C723590SZx(this, C01DP.class, "FullCustomizedBoardHierarchyData"), checkSupervisorPrepared());

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(CustomizedBoardTextFontAssem.class, "editPageViewModel", "getEditPageViewModel()Lcom/bytedance/android/livesdk/comp/impl/pcs/business/growth/decoration/edit/fullycustomized/edititem/vm/FullyCustomizedBoardEditPageViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public CustomizedBoardTextFontAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(FullyCustomizedBoardEditPageViewModel.class);
        C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AnonymousClass0559(c19719912DlLIZ), new C06IX(), null, true);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        C723850SaN.LIZLLL(this, new C1146004e2(this));
    }
}
