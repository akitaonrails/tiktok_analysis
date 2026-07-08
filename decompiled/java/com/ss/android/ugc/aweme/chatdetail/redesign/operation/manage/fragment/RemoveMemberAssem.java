package com.ss.android.ugc.aweme.chatdetail.redesign.operation.manage.fragment;

import X.C019F;
import X.C01GW;
import X.C11G4;
import X.C127K;
import X.C1383370m6R;
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
import X.C786410Ut5;
import X.EnumC1216650hlX;
import X.InterfaceC2217461Bqa;
import android.view.View;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.chatdetail.redesign.operation.manage.viewmodel.ManageGroupViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.AwS563S0100000_19;
import wh6.AbS509S0200000_19;

/* JADX INFO: loaded from: classes20.dex */
public final class RemoveMemberAssem extends UIContentAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJI;
    public final C1559260qg8 LLIZLLLIL;
    public final C01GW LLJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(RemoveMemberAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/chatdetail/redesign/operation/manage/viewmodel/ManageGroupViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJI = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public RemoveMemberAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(ManageGroupViewModel.class);
        C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS563S0100000_19(c19719912DlLIZ, 500), AFwS257S0000000_19.get$arr$(84), null, true);
        this.LLIZLLLIL = new C1559260qg8(new C723590SZx(this, C1717506o1.class, null), checkSupervisorPrepared());
        this.LLJ = C1509305vX.LIZ(new AwS563S0100000_19(this, 499));
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        C127K c127k = (C127K) this.LLJ.getValue();
        C1584506Ih.LIZIZ(c127k);
        c127k.setTitle(C1383370m6R.LJIIJ(2131831430));
        c127k.setInset(EnumC1216650hlX.PADDING_16);
        C11G4 c11g4 = new C11G4(c127k.getContext(), null);
        C786410Ut5.I7(new AbS509S0200000_19(this, c127k, 1), c11g4.LIZIZ);
        c127k.setAccessory(c11g4);
        ((TuxIconView) c127k.findViewById(R.id.z1d).findViewById(R.id.k1_)).setTintColorRes(R.attr.a1k);
    }
}
