package com.ss.android.ugc.aweme.chatdetail.redesign.detailpage.assem;

import X.AbstractC879060Ye8;
import X.AnonymousClass0208;
import X.C019F;
import X.C0I0B;
import X.C0Z6Q;
import X.C0Z6Z;
import X.C0Z9N;
import X.C13LE;
import X.C1479605qk;
import X.C14EU;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2097608Jq;
import X.C2217381BqS;
import X.C724750Sbp;
import X.C736680Sv4;
import X.InterfaceC2217461Bqa;
import android.view.View;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.chatdetail.redesign.detailpage.viewmodel.group.GroupDetailViewModel;
import com.ss.android.ugc.aweme.im.sdk.chatdetail.analytics.IMGroupChatDetailAnalytics;
import com.ss.android.ugc.aweme.im.sdk.chatdetail.redesign.detailpage.assem.common.ChatDetailLogicAssem;
import com.ss.android.ugc.aweme.im.service.service.IBlockUserController;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS248S0000000_14;
import kotlin.jvm.internal.AFwS289S0000000_6;
import kotlin.jvm.internal.AwS163S1100000_14;
import kotlin.jvm.internal.AwS558S0100000_14;
import org.greenrobot.eventbus.EventBus;

/* JADX INFO: loaded from: classes15.dex */
public final class GroupDetailLogicAssem extends ChatDetailLogicAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJ;
    public final AssemVMLazy LLJILLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(GroupDetailLogicAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/chatdetail/redesign/detailpage/viewmodel/group/GroupDetailViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public GroupDetailLogicAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(GroupDetailViewModel.class);
        this.LLJILLL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS558S0100000_14(c19719912DlLIZ, 55), AFwS248S0000000_14.get$arr$(25), null, true);
    }

    public final GroupDetailViewModel Ho() {
        AssemVMLazy assemVMLazy = this.LLJILLL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJ;
        return (GroupDetailViewModel) assemVMLazy.getValue();
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chatdetail.redesign.detailpage.assem.common.ChatDetailLogicAssem, com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        EventBus.LIZLLL().LJJI(this);
    }

    @C14EU
    public final void onBlockUserInReportPage(C1479605qk c1479605qk) {
        IBlockUserController iBlockUserController = Ho().LLJILJILJ;
        if (iBlockUserController != null) {
            iBlockUserController.LIZIZ();
        }
    }

    @C14EU
    public final void onSelectContactComponentDismiss(C0Z6Z c0z6z) {
        GroupDetailViewModel groupDetailViewModelHo = Ho();
        String str = c0z6z.LIZ;
        int value = C0Z9N.OWNER.getValue();
        AwS163S1100000_14 awS163S1100000_14 = new AwS163S1100000_14(groupDetailViewModelHo, str, 5);
        AbstractC879060Ye8 abstractC879060Ye8XQ2 = groupDetailViewModelHo.xQ2();
        if (abstractC879060Ye8XQ2 != null) {
            abstractC879060Ye8XQ2.LJIIZILJ(str, value, C2097608Jq.LJ(), new C0Z6Q(groupDetailViewModelHo, awS163S1100000_14));
        }
        IMGroupChatDetailAnalytics.LIZ.LJFF("click_leave_admin", new Pair[0], C0I0B.LJFF.LIZIZ());
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chatdetail.redesign.detailpage.assem.common.ChatDetailLogicAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        C736680Sv4.LJIIIIZZ(this, Ho(), new C2217381BqS() { // from class: X.06pv
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1729206pu) obj).LLILZ;
            }
        }, null, AFwS289S0000000_6.get$arr$(49), 6);
        C736680Sv4.LJIIIIZZ(this, Ho(), new C2217381BqS() { // from class: X.06pw
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1729206pu) obj).LLILZLL;
            }
        }, null, AnonymousClass0208.get$arr$(44), 6);
        C736680Sv4.LJIIIIZZ(this, Ho(), new C2217381BqS() { // from class: X.06kT
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1729206pu) obj).LLILZIL;
            }
        }, null, AnonymousClass0208.get$arr$(45), 6);
        EventBus.LIZLLL().LJIJJ(this);
    }
}
