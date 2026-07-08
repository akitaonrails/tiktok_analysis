package com.ss.android.ugc.aweme.chatdetail.redesign.detailpage.assem;

import X.C019F;
import X.C01GW;
import X.C13LE;
import X.C1509305vX;
import X.C1559260qg8;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C723590SZx;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C893980Z5g;
import X.InterfaceC2217461Bqa;
import android.view.View;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.chatdetail.redesign.detailpage.viewmodel.group.GroupDetailViewModel;
import com.ss.android.ugc.aweme.im.sdk.chatdetail.redesign.detailpage.assem.common.ChatDetailNameAssem;
import kotlin.jvm.internal.AFwS248S0000000_14;
import kotlin.jvm.internal.AwS558S0100000_14;
import kotlin.jvm.internal.AwS628S0100000_14;
import kotlin.jvm.internal.AwS663S0100000_14;

/* JADX INFO: loaded from: classes15.dex */
public final class GroupDetailNameAndDescAssem extends ChatDetailNameAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJ;
    public final C1559260qg8 LLJJIJI = new C1559260qg8(new C723590SZx(this, C893980Z5g.class, null), checkSupervisorPrepared());
    public final AssemVMLazy LLJJIJIIJIL;
    public final C01GW LLJJIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(GroupDetailNameAndDescAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/chatdetail/redesign/detailpage/viewmodel/group/GroupDetailViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJJ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public GroupDetailNameAndDescAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(GroupDetailViewModel.class);
        this.LLJJIJIIJIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS558S0100000_14(c19719912DlLIZ, 57), AFwS248S0000000_14.get$arr$(26), null, true);
        this.LLJJIJIL = C1509305vX.LIZ(new AwS558S0100000_14(this, 56));
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chatdetail.redesign.detailpage.assem.common.ChatDetailNameAssem
    public final void kp() {
        C736680Sv4.LJIIIIZZ(this, mp(), new C2217381BqS() { // from class: X.0ZC6
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1729206pu) obj).LLJILJILJ;
            }
        }, null, new AwS628S0100000_14(this, 4), 6);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chatdetail.redesign.detailpage.assem.common.ChatDetailNameAssem
    public final void lp() {
        C736680Sv4.LJIIIZ(this, mp(), new C2217381BqS() { // from class: X.0ZC4
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((C1729206pu) obj).LLJ);
            }
        }, new C2217381BqS() { // from class: X.0ZC5
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1729206pu) obj).LLIZLLLIL;
            }
        }, null, new AwS663S0100000_14(this, 0), 12);
    }

    public final GroupDetailViewModel mp() {
        AssemVMLazy assemVMLazy = this.LLJJIJIIJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJ;
        return (GroupDetailViewModel) assemVMLazy.getValue();
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chatdetail.redesign.detailpage.assem.common.ChatDetailNameAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        C736680Sv4.LJIIIIZZ(this, mp(), new C2217381BqS() { // from class: X.06px
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1729206pu) obj).LLJILJIL;
            }
        }, null, new AwS628S0100000_14(this, 65), 6);
    }
}
