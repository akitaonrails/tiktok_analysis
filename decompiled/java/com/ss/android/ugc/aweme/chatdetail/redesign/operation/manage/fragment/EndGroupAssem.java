package com.ss.android.ugc.aweme.chatdetail.redesign.operation.manage.fragment;

import X.C019F;
import X.C01GW;
import X.C11G4;
import X.C127K;
import X.C1383370m6R;
import X.C13LE;
import X.C1509305vX;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C724750Sbp;
import X.C736680Sv4;
import X.EnumC1216650hlX;
import X.EnumC1216700hlc;
import X.InterfaceC2217461Bqa;
import Y.ACListenerS117S0200000_14;
import android.view.View;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.chatdetail.redesign.operation.manage.viewmodel.ManageGroupViewModel;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS628S0100000_14;

/* JADX INFO: loaded from: classes20.dex */
public final class EndGroupAssem extends UIContentAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJI;
    public final AssemVMLazy LLIZLLLIL;
    public final C01GW LLJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(EndGroupAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/chatdetail/redesign/operation/manage/viewmodel/ManageGroupViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJI = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public EndGroupAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(ManageGroupViewModel.class);
        this.LLIZLLLIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS563S0100000_19(c19719912DlLIZ, 493), AFwS257S0000000_19.get$arr$(81), null, true);
        this.LLJ = C1509305vX.LIZ(new AwS563S0100000_19(this, 492));
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        C127K c127k = (C127K) this.LLJ.getValue();
        c127k.setTitle(C1383370m6R.LJIIJ(2131831426));
        c127k.setInset(EnumC1216650hlX.PADDING_16);
        c127k.setVariant(EnumC1216700hlc.DESTRUCTIVE);
        C11G4 c11g4 = new C11G4(c127k.getContext(), null);
        c11g4.LJIILLIIL(false);
        c11g4.LJIILL(new ACListenerS117S0200000_14(this, c127k, 6));
        c127k.setAccessory(c11g4);
        AssemVMLazy assemVMLazy = this.LLIZLLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJI;
        C736680Sv4.LJIIIIZZ(this, assemVMLazy.getValue(), new C2217381BqS() { // from class: X.0hib
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C1651206dK) obj).LLJJIII);
            }
        }, null, new AwS628S0100000_14(c127k, 11), 6);
    }
}
