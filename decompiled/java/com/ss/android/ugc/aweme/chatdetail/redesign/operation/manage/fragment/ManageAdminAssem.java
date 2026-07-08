package com.ss.android.ugc.aweme.chatdetail.redesign.operation.manage.fragment;

import X.C019F;
import X.C01GW;
import X.C11G4;
import X.C127K;
import X.C13LE;
import X.C1509305vX;
import X.C1559260qg8;
import X.C1584506Ih;
import X.C1637806bA;
import X.C1717506o1;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C723590SZx;
import X.C724750Sbp;
import X.C736680Sv4;
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
import kotlin.jvm.internal.AwS438S0200000_2;
import kotlin.jvm.internal.AwS546S0100000_2;
import wh6.AbS496S0200000_2;

/* JADX INFO: loaded from: classes3.dex */
public final class ManageAdminAssem extends UIContentAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJIJIL;
    public final AssemVMLazy LLIZLLLIL;
    public final C1559260qg8 LLJ;
    public final C01GW LLJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(ManageAdminAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/chatdetail/redesign/operation/manage/viewmodel/ManageGroupViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJIJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public ManageAdminAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(ManageGroupViewModel.class);
        this.LLIZLLLIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS546S0100000_2(c19719912DlLIZ, 74), AFwS229S0000000_2.get$arr$(87), null, true);
        this.LLJ = new C1559260qg8(new C723590SZx(this, C1717506o1.class, null), checkSupervisorPrepared());
        this.LLJI = C1509305vX.LIZ(new AwS546S0100000_2(this, 73));
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        TuxIconView tuxIconView;
        super.onViewCreated(view);
        C127K c127k = (C127K) this.LLJI.getValue();
        C1584506Ih.LIZIZ(c127k);
        AssemVMLazy assemVMLazy = this.LLIZLLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJIJIL;
        C736680Sv4.LJIIIIZZ(this, assemVMLazy.getValue(), new C2217381BqS() { // from class: X.06nz
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((C1651206dK) obj).LLJI);
            }
        }, null, new AwS438S0200000_2(c127k, this, 3), 6);
        c127k.setInset(EnumC1216650hlX.PADDING_16);
        C11G4 c11g4 = new C11G4(c127k.getContext(), null);
        C786410Ut5.I7(new AbS496S0200000_2(this, c127k, 1), c11g4.LIZIZ);
        c127k.setAccessory(c11g4);
        View viewFindViewById = c127k.findViewById(R.id.z1d);
        if (viewFindViewById != null && (tuxIconView = (TuxIconView) viewFindViewById.findViewById(R.id.k1_)) != null) {
            tuxIconView.setTintColorRes(R.attr.a1k);
        }
    }
}
