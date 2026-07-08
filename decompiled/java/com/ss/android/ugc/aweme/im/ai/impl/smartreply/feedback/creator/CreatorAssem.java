package com.ss.android.ugc.aweme.im.ai.impl.smartreply.feedback.creator;

import X.C01GW;
import X.C03IJ;
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
import Y.ACListenerS137S0100000_2;
import android.view.View;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS229S0000000_2;
import kotlin.jvm.internal.AwS438S0200000_2;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS616S0100000_2;

/* JADX INFO: loaded from: classes3.dex */
public final class CreatorAssem extends UISlotAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJIL;
    public final AssemVMLazy LLJJI;
    public final C01GW LLJJIII;
    public final C01GW LLJJIJI;
    public final C01GW LLJJIJIIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(CreatorAssem.class, "viewModel", "getViewModel()Lcom/ss/android/ugc/aweme/im/ai/impl/smartreply/feedback/creator/CreatorPanelViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJIJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public CreatorAssem() {
        C03IJ c03ij = C03IJ.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(CreatorPanelViewModel.class);
        this.LLJJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c03ij, C1637806bA.LIZ, new AwS546S0100000_2(c19719912DlLIZ, 260), AFwS229S0000000_2.get$arr$(218), null, true);
        this.LLJJIII = C452501pT.LIZIZ(new AwS546S0100000_2(this, 261));
        this.LLJJIJI = C452501pT.LIZIZ(new AwS546S0100000_2(this, 262));
        this.LLJJIJIIJIL = C452501pT.LIZIZ(new AwS546S0100000_2(this, 259));
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.coi;
    }

    public final CreatorPanelViewModel hp() {
        AssemVMLazy assemVMLazy = this.LLJJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJIL;
        return (CreatorPanelViewModel) assemVMLazy.getValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        C736680Sv4.LJIIIIZZ(this, hp(), new C2217381BqS() { // from class: X.060E
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C060A) obj).LL;
            }
        }, null, new AwS438S0200000_2(this, view, 6), 6);
        C197039127h c197039127h = (C197039127h) this.LLJJIII.getValue();
        if (c197039127h != null) {
            C786410Ut5.U8(c197039127h, new ACListenerS137S0100000_2(this, 20));
        }
        C197039127h c197039127h2 = (C197039127h) this.LLJJIJI.getValue();
        if (c197039127h2 != null) {
            C786410Ut5.U8(c197039127h2, new ACListenerS137S0100000_2(this, 21));
        }
        C736680Sv4.LJIIIIZZ(this, hp(), new C2217381BqS() { // from class: X.060C
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C060A) obj).LLILLJJLI;
            }
        }, null, new AwS616S0100000_2(this, 28), 6);
    }
}
