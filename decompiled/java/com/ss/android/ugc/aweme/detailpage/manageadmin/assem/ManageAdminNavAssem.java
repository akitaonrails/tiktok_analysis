package com.ss.android.ugc.aweme.detailpage.manageadmin.assem;

import X.C019F;
import X.C01GW;
import X.C0OM1;
import X.C0ZFW;
import X.C1250250idj;
import X.C1251150ifB;
import X.C1308910kAL;
import X.C13LE;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C452501pT;
import X.C724750Sbp;
import X.InterfaceC2217461Bqa;
import android.content.Context;
import android.view.View;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.detailpage.manageadmin.viewmodel.ManageAdminViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS229S0000000_2;
import kotlin.jvm.internal.AwS546S0100000_2;

/* JADX INFO: loaded from: classes3.dex */
public final class ManageAdminNavAssem extends UIContentAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJI;
    public final AssemVMLazy LLIZLLLIL;
    public final C01GW LLJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(ManageAdminNavAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/detailpage/manageadmin/viewmodel/ManageAdminViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJI = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public ManageAdminNavAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(ManageAdminViewModel.class);
        this.LLIZLLLIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS546S0100000_2(c19719912DlLIZ, 140), AFwS229S0000000_2.get$arr$(147), null, true);
        this.LLJ = C452501pT.LIZIZ(new AwS546S0100000_2(this, 138));
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        String string;
        Integer numLIZJ;
        super.onViewCreated(view);
        Context context = getContext();
        if (context != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.bk, context)) != null) {
            ((TuxNavBar) this.LLJ.getValue()).setNavBackground(numLIZJ.intValue());
        }
        TuxNavBar tuxNavBar = (TuxNavBar) this.LLJ.getValue();
        C0OM1 c0om1 = new C0OM1();
        C1251150ifB c1251150ifB = new C1251150ifB();
        c1251150ifB.LIZLLL();
        c1251150ifB.LIZJ = R.raw.icon_chevron_left_ltr;
        c1251150ifB.LIZLLL = true;
        c1251150ifB.LIZJ(new AwS546S0100000_2(this, 139));
        c0om1.LJ(c1251150ifB);
        C1250250idj c1250250idj = new C1250250idj();
        AssemVMLazy assemVMLazy = this.LLIZLLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJI;
        if (C0ZFW.LJIJ(((ManageAdminViewModel) assemVMLazy.getValue()).vQ2().LL)) {
            string = view.getContext().getString(2131830169);
        } else {
            string = view.getContext().getString(2131830132);
        }
        c1250250idj.LIZJ = string;
        c0om1.LIZJ = c1250250idj;
        tuxNavBar.setNavActions(c0om1);
    }
}
