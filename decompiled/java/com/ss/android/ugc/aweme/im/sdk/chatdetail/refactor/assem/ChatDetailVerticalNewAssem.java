package com.ss.android.ugc.aweme.im.sdk.chatdetail.refactor.assem;

import X.AbstractC894380Z6u;
import X.C01GW;
import X.C03IJ;
import X.C13LE;
import X.C1509305vX;
import X.C1637806bA;
import X.C19719912Dl;
import X.C1A22;
import X.C2172711A1l;
import X.C2172771A1r;
import X.C2217381BqS;
import X.C452501pT;
import X.C723850SaN;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.C893950Z5d;
import X.InterfaceC2172761A1q;
import X.InterfaceC2217461Bqa;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.im.sdk.chatdetail.refactor.assem.ChatDetailVerticalNewAssem;
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
public final class ChatDetailVerticalNewAssem extends UISlotAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJIL;
    public final C01GW LLJJI = C452501pT.LIZIZ(new AwS577S0100000_33(this, 2419));
    public final C01GW LLJJIII = C1509305vX.LIZ(new AwS577S0100000_33(this, 2418));
    public final AssemVMLazy LLJJIJI;
    public final C1A22 LLJJIJIIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(ChatDetailVerticalNewAssem.class, "groupVm", "getGroupVm()Lcom/ss/android/ugc/aweme/im/sdk/chatdetail/refactor/viewmodel/ActionGroupViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJIJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [X.1A22] */
    public ChatDetailVerticalNewAssem() {
        C03IJ c03ij = C03IJ.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(ActionGroupViewModel.class);
        this.LLJJIJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c03ij, C1637806bA.LIZ, new AwS568S0100000_24(c19719912DlLIZ, 638), AFwS279S0000000_33.get$arr$(174), null, true);
        this.LLJJIJIIJIL = new InterfaceC2172761A1q() { // from class: X.1A22
            @Override // X.InterfaceC2172761A1q
            public final void LIZ(AbstractC894380Z6u<?> abstractC894380Z6u, boolean z) {
                AssemVMLazy assemVMLazy = this.LIZ.LLJJIJI;
                InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = ChatDetailVerticalNewAssem.LLJJIJIL;
                ((ActionGroupViewModel) assemVMLazy.getValue()).wQ2(abstractC894380Z6u, z);
            }
        };
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.cg0;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        List<AbstractC894380Z6u<?>> list = ((C893950Z5d) this.LLJJI.getValue()).LLILLJJLI;
        ArrayList arrayList = new ArrayList();
        for (AbstractC894380Z6u<?> abstractC894380Z6u : list) {
            AbstractC894380Z6u<?> abstractC894380Z6u2 = abstractC894380Z6u;
            if ((abstractC894380Z6u2.LJ() instanceof C2172771A1r) || (abstractC894380Z6u2.LJ() instanceof C2172711A1l)) {
                arrayList.add(abstractC894380Z6u);
            }
        }
        AssemVMLazy assemVMLazy = this.LLJJIJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJIL;
        ((ActionGroupViewModel) assemVMLazy.getValue()).vQ2(arrayList);
        C786410Ut5.LJJJJJL((LinearLayout) this.LLJJIII.getValue());
        C723850SaN.LIZLLL(this, new AwS612S0100000_33(this, 142));
        C736680Sv4.LJIIIIZZ(this, this.LLJJIJI.getValue(), new C2217381BqS() { // from class: X.1A28
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C995890c1T) obj).LL);
            }
        }, null, new AwS638S0100000_24(this, 48), 6);
    }
}
