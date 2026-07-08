package com.ss.android.ugc.aweme.chatdetail.redesign.operation.manage.fragment;

import X.C019F;
import X.C01GW;
import X.C11G4;
import X.C127K;
import X.C1383370m6R;
import X.C13LE;
import X.C1509305vX;
import X.C1584506Ih;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C452501pT;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C786410Ut5;
import X.EnumC1216650hlX;
import X.InterfaceC2217461Bqa;
import android.view.View;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.chatdetail.redesign.operation.manage.viewmodel.ManageGroupViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS229S0000000_2;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS558S0100000_14;
import kotlin.jvm.internal.AwS616S0100000_2;
import wh6.AbS496S0200000_2;

/* JADX INFO: loaded from: classes3.dex */
public final class JoinRequestAssem extends UIContentAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJIJIL;
    public final AssemVMLazy LLIZLLLIL;
    public final C01GW LLJ;
    public final C01GW LLJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(JoinRequestAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/chatdetail/redesign/operation/manage/viewmodel/ManageGroupViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJIJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public JoinRequestAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(ManageGroupViewModel.class);
        this.LLIZLLLIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS546S0100000_2(c19719912DlLIZ, 72), AFwS229S0000000_2.get$arr$(86), null, true);
        this.LLJ = C452501pT.LIZIZ(new AwS558S0100000_14(this, 143));
        this.LLJI = C1509305vX.LIZ(new AwS546S0100000_2(this, 71));
    }

    public final ManageGroupViewModel Go() {
        AssemVMLazy assemVMLazy = this.LLIZLLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJIJIL;
        return (ManageGroupViewModel) assemVMLazy.getValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        C127K c127k = (C127K) this.LLJI.getValue();
        C1584506Ih.LIZ(c127k);
        c127k.setTitle(C1383370m6R.LJIIJ(2131831428));
        c127k.setInset(EnumC1216650hlX.PADDING_16);
        C11G4 c11g4 = new C11G4(c127k.getContext(), null);
        C786410Ut5.I7(new AbS496S0200000_2(this, c127k, 0), c11g4.LIZIZ);
        c11g4.LJIILIIL((View) this.LLJ.getValue());
        c127k.setAccessory(c11g4);
        ((TuxIconView) c127k.findViewById(R.id.z1d).findViewById(R.id.k1_)).setTintColorRes(R.attr.a1k);
        C736680Sv4.LJIIIIZZ(this, Go(), new C2217381BqS() { // from class: X.06dE
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C1651206dK) obj).LLILZIL);
            }
        }, null, new AwS616S0100000_2(this, 15), 6);
        C736680Sv4.LJIIIIZZ(this, Go(), new C2217381BqS() { // from class: X.06dF
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C1651206dK) obj).LLILZIL);
            }
        }, null, new AwS616S0100000_2(this, 16), 6);
        C736680Sv4.LJIIIIZZ(this, Go(), new C2217381BqS() { // from class: X.06dJ
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((C1651206dK) obj).LLIZ);
            }
        }, C736820SvI.LIZLLL(), new AwS616S0100000_2(this, 17), 4);
    }
}
