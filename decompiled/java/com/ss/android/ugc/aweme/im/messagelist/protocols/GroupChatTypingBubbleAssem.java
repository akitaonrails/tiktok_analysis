package com.ss.android.ugc.aweme.im.messagelist.protocols;

import X.AbstractC738140SxQ;
import X.C019F;
import X.C01GW;
import X.C0PEM;
import X.C127G;
import X.C13LE;
import X.C1518205wy;
import X.C1559260qg8;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C23250099c;
import X.C452501pT;
import X.C457780HxI;
import X.C723590SZx;
import X.C724750Sbp;
import X.EnumC452301pR;
import X.InterfaceC2217461Bqa;
import Y.AObjectS378S0100000_2;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.messagelist.impl.GroupChatTypingIndicatorBubbleVM;
import kotlin.jvm.internal.AFwS229S0000000_2;
import kotlin.jvm.internal.AwS546S0100000_2;

/* JADX INFO: loaded from: classes3.dex */
public final class GroupChatTypingBubbleAssem extends AbstractC738140SxQ {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZLL;
    public final C1559260qg8 LL = new C1559260qg8(new C723590SZx(this, C457780HxI.class, null), checkSupervisorPrepared());
    public final C01GW LLILLJJLI;
    public final C01GW LLILLL;
    public final AssemVMLazy LLILZ;
    public C127G LLILZIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(GroupChatTypingBubbleAssem.class, "gcTypingBubbleIndicatorBubbleVM", "getGcTypingBubbleIndicatorBubbleVM()Lcom/ss/android/ugc/aweme/im/messagelist/impl/GroupChatTypingIndicatorBubbleVM;", 0);
        C13LE.LIZ.getClass();
        LLILZLL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public GroupChatTypingBubbleAssem() {
        EnumC452301pR enumC452301pR = EnumC452301pR.NONE;
        this.LLILLJJLI = C452501pT.LIZ(enumC452301pR, new AwS546S0100000_2(this, 362));
        this.LLILLL = C452501pT.LIZ(enumC452301pR, new AwS546S0100000_2(this, 361));
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(GroupChatTypingIndicatorBubbleVM.class);
        this.LLILZ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS546S0100000_2(c19719912DlLIZ, 363), AFwS229S0000000_2.get$arr$(259), null, true);
    }

    @Override // X.AbstractC738140SxQ, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        ViewModelProvider.Factory defaultViewModelProviderFactory = super.getDefaultViewModelProviderFactory();
        C127G c127g = this.LLILZIL;
        if (c127g == null) {
            synchronized (this) {
                c127g = this.LLILZIL;
                if (c127g == null) {
                    C127G c127g2 = new C127G(new Object[]{GroupChatTypingIndicatorBubbleVM.class, new AObjectS378S0100000_2(this, 5)}, defaultViewModelProviderFactory);
                    this.LLILZIL = c127g2;
                    return c127g2;
                }
            }
        }
        return c127g;
    }

    @Override // X.AbstractC738140SxQ
    public final void onAssemPostCreate() {
        super.onAssemPostCreate();
        if (((SessionInfo) this.LLILLJJLI.getValue()).isReportPage() || ((SessionInfo) this.LLILLJJLI.getValue()).isMessageRequest()) {
            return;
        }
        AssemVMLazy assemVMLazy = this.LLILZ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLILZLL;
        GroupChatTypingIndicatorBubbleVM groupChatTypingIndicatorBubbleVM = (GroupChatTypingIndicatorBubbleVM) assemVMLazy.getValue();
        C23250099c.LIZLLL(groupChatTypingIndicatorBubbleVM.getAssemVMScope(), C0PEM.LIZJ, null, new C1518205wy(groupChatTypingIndicatorBubbleVM, null), 2);
    }
}
