package com.ss.android.ugc.aweme.chatdetail.redesign.detailpage.assem;

import X.C019F;
import X.C13LE;
import X.C1637806bA;
import X.C1688906jP;
import X.C1703106lh;
import X.C19719912Dl;
import X.C19EG;
import X.C1A62;
import X.C2217381BqS;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736680Sv4;
import X.InterfaceC2217461Bqa;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.chatdetail.redesign.detailpage.viewmodel.group.GroupDetailViewModel;
import com.ss.android.ugc.aweme.im.report.api.IReportUtils;
import com.ss.android.ugc.aweme.im.sdk.chatdetail.analytics.IMGroupChatDetailAnalytics;
import com.ss.android.ugc.aweme.im.sdk.chatdetail.redesign.detailpage.assem.common.ChatDetailNavAssem;
import kotlin.jvm.internal.AFwS229S0000000_2;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS616S0100000_2;

/* JADX INFO: loaded from: classes3.dex */
public final class GroupDetailNavAssem extends ChatDetailNavAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJIJIL;
    public final AssemVMLazy LLJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(GroupDetailNavAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/chatdetail/redesign/detailpage/viewmodel/group/GroupDetailViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJIJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public GroupDetailNavAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(GroupDetailViewModel.class);
        this.LLJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS546S0100000_2(c19719912DlLIZ, 64), AFwS229S0000000_2.get$arr$(80), null, true);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chatdetail.redesign.detailpage.assem.common.ChatDetailNavAssem
    public final C1A62 Lo() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chatdetail.redesign.detailpage.assem.common.ChatDetailNavAssem
    public final void No() {
        AssemVMLazy assemVMLazy = this.LLJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJIJIL;
        C736680Sv4.LJIIIIZZ(this, assemVMLazy.getValue(), new C2217381BqS() { // from class: X.06jM
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1729206pu) obj).LLJILJILJ;
            }
        }, null, new AwS616S0100000_2(this, 14), 6);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chatdetail.redesign.detailpage.assem.common.ChatDetailNavAssem
    public final void Ho() {
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ != null) {
            AssemVMLazy assemVMLazy = this.LLJI;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJIJIL;
            String strWQ2 = ((GroupDetailViewModel) assemVMLazy.getValue()).wQ2();
            IReportUtils.LIZ.getClass();
            IReportUtils iReportUtilsLIZ = C1703106lh.LIZ();
            if (iReportUtilsLIZ != null) {
                iReportUtilsLIZ.LIZ(new C1688906jP(strWQ2, "button", "group_setting", "im_details_page", 8), c19egLIZ, "5", null, false);
            }
            IMGroupChatDetailAnalytics.LJIIL("group_setting", "", "im", "button", null, null, 112);
        }
    }
}
