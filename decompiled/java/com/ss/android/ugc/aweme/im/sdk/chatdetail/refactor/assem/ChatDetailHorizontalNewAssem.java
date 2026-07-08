package com.ss.android.ugc.aweme.im.sdk.chatdetail.refactor.assem;

import X.AbstractC894380Z6u;
import X.C01GW;
import X.C03IJ;
import X.C13LE;
import X.C1509305vX;
import X.C1637806bA;
import X.C19719912Dl;
import X.C1A20;
import X.C2217381BqS;
import X.C452501pT;
import X.C723850SaN;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.C893950Z5d;
import X.C894370Z6t;
import X.InterfaceC2172761A1q;
import X.InterfaceC2217461Bqa;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.im.sdk.chatdetail.refactor.assem.ChatDetailHorizontalNewAssem;
import com.ss.android.ugc.aweme.im.sdk.chatdetail.refactor.viewmodel.ActionGroupViewModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS279S0000000_33;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS577S0100000_33;
import kotlin.jvm.internal.AwS612S0100000_33;
import kotlin.jvm.internal.AwS638S0100000_24;

/* JADX INFO: loaded from: classes34.dex */
public final class ChatDetailHorizontalNewAssem extends UISlotAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJIL;
    public final C01GW LLJJI = C452501pT.LIZIZ(new AwS577S0100000_33(this, 2415));
    public final C01GW LLJJIII = C1509305vX.LIZ(new AwS577S0100000_33(this, 2414));
    public final AssemVMLazy LLJJIJI;
    public final C1A20 LLJJIJIIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(ChatDetailHorizontalNewAssem.class, "groupVm", "getGroupVm()Lcom/ss/android/ugc/aweme/im/sdk/chatdetail/refactor/viewmodel/ActionGroupViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJIJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [X.1A20] */
    public ChatDetailHorizontalNewAssem() {
        C03IJ c03ij = C03IJ.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(ActionGroupViewModel.class);
        this.LLJJIJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c03ij, C1637806bA.LIZ, new AwS568S0100000_24(c19719912DlLIZ, 636), AFwS279S0000000_33.get$arr$(172), null, true);
        this.LLJJIJIIJIL = new InterfaceC2172761A1q() { // from class: X.1A20
            @Override // X.InterfaceC2172761A1q
            public final void LIZ(AbstractC894380Z6u<?> abstractC894380Z6u, boolean z) {
                AssemVMLazy assemVMLazy = this.LIZ.LLJJIJI;
                InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = ChatDetailHorizontalNewAssem.LLJJIJIL;
                ((ActionGroupViewModel) assemVMLazy.getValue()).wQ2(abstractC894380Z6u, z);
            }
        };
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.cfy;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        List<AbstractC894380Z6u<?>> list = ((C893950Z5d) this.LLJJI.getValue()).LLILLJJLI;
        ArrayList arrayList = new ArrayList();
        for (AbstractC894380Z6u<?> abstractC894380Z6u : list) {
            if (abstractC894380Z6u.LJ() instanceof C894370Z6t) {
                arrayList.add(abstractC894380Z6u);
            }
        }
        AssemVMLazy assemVMLazy = this.LLJJIJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJIL;
        ((ActionGroupViewModel) assemVMLazy.getValue()).vQ2(arrayList);
        C786410Ut5.LJJJJJL((LinearLayout) this.LLJJIII.getValue());
        C723850SaN.LIZLLL(this, new AwS612S0100000_33(this, 140));
        C736680Sv4.LJIIIIZZ(this, this.LLJJIJI.getValue(), new C2217381BqS() { // from class: X.1A26
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C995890c1T) obj).LL);
            }
        }, null, new AwS638S0100000_24(this, 46), 6);
    }
}
