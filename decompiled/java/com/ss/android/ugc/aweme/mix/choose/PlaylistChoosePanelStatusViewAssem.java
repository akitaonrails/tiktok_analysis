package com.ss.android.ugc.aweme.mix.choose;

import X.C019F;
import X.C01GW;
import X.C1158260gFM;
import X.C1308910kAL;
import X.C13LE;
import X.C1559260qg8;
import X.C1637806bA;
import X.C1749280vcc;
import X.C19719912Dl;
import X.C20509915Nh;
import X.C2217381BqS;
import X.C452501pT;
import X.C723590SZx;
import X.C724750Sbp;
import X.C736680Sv4;
import X.InterfaceC2217461Bqa;
import android.view.View;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS454S0200000_18;
import kotlin.jvm.internal.AwS562S0100000_18;

/* JADX INFO: loaded from: classes19.dex */
public final class PlaylistChoosePanelStatusViewAssem extends UIContentAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILLL;
    public final C1559260qg8 LLIZLLLIL = new C1559260qg8(new C723590SZx(this, C1158260gFM.class, null), checkSupervisorPrepared());
    public boolean LLJ;
    public C1749280vcc LLJI;
    public C20509915Nh LLJIJIL;
    public final AssemVMLazy LLJILJIL;
    public final C01GW LLJILJILJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PlaylistChoosePanelStatusViewAssem.class, "viewModel", "getViewModel()Lcom/ss/android/ugc/aweme/mix/choose/PlaylistChoosePanelViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJILLL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public PlaylistChoosePanelStatusViewAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PlaylistChoosePanelViewModel.class);
        this.LLJILJIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS562S0100000_18(c19719912DlLIZ, 442), AFwS256S0000000_18.get$arr$(137), null, true);
        this.LLJILJILJ = C452501pT.LIZIZ(new AwS562S0100000_18(this, 440));
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        C1749280vcc c1749280vcc = (C1749280vcc) view;
        this.LLJI = c1749280vcc;
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.c3, c1749280vcc.getContext());
        if (numLIZJ != null) {
            int iIntValue = numLIZJ.intValue();
            C1749280vcc c1749280vcc2 = this.LLJI;
            if (c1749280vcc2 != null) {
                c1749280vcc2.setBackgroundColor(iIntValue);
            }
        }
        AssemVMLazy assemVMLazy = this.LLJILJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILLL;
        C736680Sv4.LJIIIIZZ(this, assemVMLazy.getValue(), new C2217381BqS() { // from class: X.0gVr
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1168510gVt) obj).LLILZ;
            }
        }, null, new AwS454S0200000_18(this, view, 5), 6);
    }
}
