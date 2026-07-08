package com.ss.android.ugc.aweme.invitation.newdesign.assem;

import X.C019F;
import X.C01GW;
import X.C13LE;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C452501pT;
import X.C724750Sbp;
import X.C736680Sv4;
import X.InterfaceC2217461Bqa;
import android.view.View;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.invitation.newdesign.vm.GroupInvitationVM;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS633S0100000_19;

/* JADX INFO: loaded from: classes20.dex */
public final class GroupInvitationGroupInfoAssem extends UISlotAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJJJIL;
    public final AssemVMLazy LLJJI;
    public final C01GW LLJJIII;
    public final C01GW LLJJIJI;
    public final C01GW LLJJIJIIJIL;
    public final C01GW LLJJIJIL;
    public final C01GW LLJJJ;
    public final C01GW LLJJJIL;
    public final C01GW LLJJJJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(GroupInvitationGroupInfoAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/invitation/newdesign/vm/GroupInvitationVM;", 0);
        C13LE.LIZ.getClass();
        LLJJJJJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public GroupInvitationGroupInfoAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(GroupInvitationVM.class);
        this.LLJJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS563S0100000_19(c19719912DlLIZ, 1584), AFwS257S0000000_19.get$arr$(218), null, true);
        this.LLJJIII = C452501pT.LIZIZ(new AwS563S0100000_19(this, 1578));
        this.LLJJIJI = C452501pT.LIZIZ(new AwS563S0100000_19(this, 1580));
        this.LLJJIJIIJIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 1579));
        this.LLJJIJIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 1582));
        this.LLJJJ = C452501pT.LIZIZ(new AwS563S0100000_19(this, 1581));
        this.LLJJJIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 1583));
        this.LLJJJJ = C452501pT.LIZIZ(new AwS563S0100000_19(this, 1577));
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.cin;
    }

    public final GroupInvitationVM hp() {
        AssemVMLazy assemVMLazy = this.LLJJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJJJIL;
        return (GroupInvitationVM) assemVMLazy.getValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        C736680Sv4.LJIIIIZZ(this, hp(), new C2217381BqS() { // from class: X.0i74
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1230460i7o) obj).LL;
            }
        }, null, new AwS633S0100000_19(this, 229), 6);
    }
}
