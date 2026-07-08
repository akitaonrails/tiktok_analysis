package com.ss.android.ugc.profile.business.ur.following.ui.managefollow;

import X.C019F;
import X.C01GW;
import X.C13LE;
import X.C1637806bA;
import X.C197039127h;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C452501pT;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.InterfaceC2217461Bqa;
import Y.ACListenerS108S0200000_4;
import android.view.View;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import kotlin.jvm.internal.AFwS190S0000000_4;
import kotlin.jvm.internal.AFwS232S0000000_4;
import kotlin.jvm.internal.AwS440S0200000_4;
import kotlin.jvm.internal.AwS548S0100000_4;

/* JADX INFO: loaded from: classes5.dex */
public final class ManageFollowBottomAssem extends UIContentAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJIJIL;
    public final AssemVMLazy LLIZLLLIL;
    public boolean LLJ;
    public final C01GW LLJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(ManageFollowBottomAssem.class, "vm", "getVm()Lcom/ss/android/ugc/profile/business/ur/following/ui/managefollow/ManageFollowVM;", 0);
        C13LE.LIZ.getClass();
        LLJIJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public ManageFollowBottomAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(ManageFollowVM.class);
        this.LLIZLLLIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS548S0100000_4(c19719912DlLIZ, 321), AFwS232S0000000_4.get$arr$(107), null, true);
        this.LLJI = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(2195));
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        C197039127h c197039127h;
        super.onViewCreated(view);
        if ((view instanceof C197039127h) && (c197039127h = (C197039127h) view) != null) {
            AssemVMLazy assemVMLazy = this.LLIZLLLIL;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJIJIL;
            C736680Sv4.LJIIIIZZ(this, assemVMLazy.getValue(), new C2217381BqS() { // from class: X.0Dac
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C339250DRr) obj).LL;
                }
            }, null, new AwS440S0200000_4(view, c197039127h, 8), 6);
            C786410Ut5.U8(c197039127h, new ACListenerS108S0200000_4(view, this, 4));
        }
    }
}
