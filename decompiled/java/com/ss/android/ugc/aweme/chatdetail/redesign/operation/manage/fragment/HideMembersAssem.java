package com.ss.android.ugc.aweme.chatdetail.redesign.operation.manage.fragment;

import X.C019F;
import X.C01GW;
import X.C127A;
import X.C127K;
import X.C13LE;
import X.C1509305vX;
import X.C1584506Ih;
import X.C1637806bA;
import X.C1767606w6;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C724750Sbp;
import X.C736680Sv4;
import X.EnumC1216650hlX;
import X.InterfaceC2217461Bqa;
import android.view.View;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.chatdetail.redesign.operation.manage.viewmodel.ManageGroupViewModel;
import kotlin.jvm.internal.AFwS229S0000000_2;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS616S0100000_2;

/* JADX INFO: loaded from: classes3.dex */
public final class HideMembersAssem extends UIContentAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJI;
    public final AssemVMLazy LLIZLLLIL;
    public final C01GW LLJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(HideMembersAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/chatdetail/redesign/operation/manage/viewmodel/ManageGroupViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJI = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public HideMembersAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(ManageGroupViewModel.class);
        this.LLIZLLLIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS546S0100000_2(c19719912DlLIZ, 70), AFwS229S0000000_2.get$arr$(85), null, true);
        this.LLJ = C1509305vX.LIZ(new AwS546S0100000_2(this, 69));
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        C127K c127k = (C127K) this.LLJ.getValue();
        C1584506Ih.LIZIZ(c127k);
        c127k.setTitle(c127k.getContext().getString(2131846497));
        c127k.setSubtitle(c127k.getContext().getString(2131846498));
        c127k.setInset(EnumC1216650hlX.PADDING_16);
        C127A c127a = new C127A(c127k.getContext());
        c127a.LJIILLIIL(new C1767606w6(this, 1));
        c127k.setAccessory(c127a);
        AssemVMLazy assemVMLazy = this.LLIZLLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJI;
        C736680Sv4.LJIIIIZZ(this, assemVMLazy.getValue(), new C2217381BqS() { // from class: X.06Xt
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C1651206dK) obj).LLJJ);
            }
        }, null, new AwS616S0100000_2(c127k, 7), 6);
        C736680Sv4.LJIIIIZZ(this, this.LLIZLLLIL.getValue(), new C2217381BqS() { // from class: X.06Xu
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C1651206dK) obj).LLJILLL);
            }
        }, null, new AwS616S0100000_2(c127k, 8), 6);
    }
}
