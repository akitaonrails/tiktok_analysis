package com.ss.android.ugc.aweme.chatdetail.redesign.operation.manage.fragment;

import X.C019F;
import X.C01GW;
import X.C0PEM;
import X.C1165530gR5;
import X.C13LE;
import X.C1509305vX;
import X.C1637806bA;
import X.C1717506o1;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C2296808zG;
import X.C23250099c;
import X.C723590SZx;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.InterfaceC2217461Bqa;
import Y.ACListenerS154S0100000_19;
import android.view.View;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.chatdetail.redesign.operation.manage.viewmodel.ManageGroupViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS668S0100000_19;

/* JADX INFO: loaded from: classes20.dex */
public final class WhoCanJoinAssem extends UISlotAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJI;
    public final AssemVMLazy LLJJI;
    public final C01GW LLJJIII;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(WhoCanJoinAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/chatdetail/redesign/operation/manage/viewmodel/ManageGroupViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJIJI = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public WhoCanJoinAssem() {
        checkSupervisorPrepared();
        new C723590SZx(this, C1717506o1.class, null);
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(ManageGroupViewModel.class);
        this.LLJJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS563S0100000_19(c19719912DlLIZ, 504), AFwS257S0000000_19.get$arr$(86), null, true);
        this.LLJJIII = C1509305vX.LIZ(new AwS563S0100000_19(this, 503));
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.ci5;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        AssemVMLazy assemVMLazy = this.LLJJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJI;
        C736680Sv4.LJIIIZ(this, assemVMLazy.getValue(), new C2217381BqS() { // from class: X.0hlR
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C1651206dK) obj).LL);
            }
        }, new C2217381BqS() { // from class: X.0hlT
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1651206dK) obj).LLILLL;
            }
        }, null, new AwS668S0100000_19(this, 1), 12);
        C786410Ut5.I7(new ACListenerS154S0100000_19(this, 91), getContentView());
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1165530gR5((ManageGroupViewModel) this.LLJJI.getValue(), LJJIJL().getContext(), null), 3);
    }
}
