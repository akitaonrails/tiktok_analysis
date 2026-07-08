package com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.messagelist;

import X.C019F;
import X.C01GW;
import X.C06M6;
import X.C09R3;
import X.C0QCK;
import X.C127G;
import X.C13LE;
import X.C1509305vX;
import X.C1559260qg8;
import X.C1637806bA;
import X.C1637906bB;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C452501pT;
import X.C457780HxI;
import X.C687700QyG;
import X.C723580SZw;
import X.C723590SZx;
import X.C724750Sbp;
import X.InterfaceC1146704e9;
import X.InterfaceC2217461Bqa;
import Y.AObjectS67S0000000_14;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.common.scope.ChatRoomScope;
import com.ss.android.ugc.aweme.im.lightinteract.api.vm.AbsChatPageLightInteractionViewModel;
import com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListHasRenderedProvider;
import com.ss.android.ugc.aweme.im.messagelist.api.viewmodel.IIMessageListViewModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS248S0000000_14;
import kotlin.jvm.internal.AwS558S0100000_14;

/* JADX INFO: loaded from: classes15.dex */
public final class MessageListAndRelatedUIContentAssem extends UIContentAssem implements InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJI;
    public final C01GW LLIZLLLIL = C1509305vX.LIZ(new AwS558S0100000_14(this, 765));
    public final C1559260qg8 LLJ = new C1559260qg8(new C723590SZx(this, C457780HxI.class, null), checkSupervisorPrepared());
    public final C01GW LLJI = C452501pT.LIZIZ(new AwS558S0100000_14(this, 766));
    public final AssemVMLazy LLJIJIL;
    public final C1559260qg8 LLJILJIL;
    public final C0QCK LLJILJILJ;
    public final AssemVMLazy LLJILLL;
    public C127G LLJJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(MessageListAndRelatedUIContentAssem.class, "messageListViewModel", "getMessageListViewModel()Lcom/ss/android/ugc/aweme/im/messagelist/api/viewmodel/IIMessageListViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(MessageListAndRelatedUIContentAssem.class, "lazyMessageListHasRendered", "getLazyMessageListHasRendered()Ltiktok/communication/LazyAbility;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(MessageListAndRelatedUIContentAssem.class, "chatPageLightInteractionViewModel", "getChatPageLightInteractionViewModel()Lcom/ss/android/ugc/aweme/im/lightinteract/api/vm/AbsChatPageLightInteractionViewModel;", 0);
        c09r3.getClass();
        LLJJI = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3};
    }

    public MessageListAndRelatedUIContentAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(IIMessageListViewModel.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLJIJIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, c1637906bB, new AwS558S0100000_14(c19719912DlLIZ, 767), AFwS248S0000000_14.get$arr$(218), null, true);
        this.LLJILJIL = new C1559260qg8(new C723580SZw(this, C06M6.class, null), checkSupervisorPrepared());
        this.LLJILJILJ = new C0QCK(MessageListHasRenderedProvider.class);
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(AbsChatPageLightInteractionViewModel.class);
        this.LLJILLL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c019f, c1637906bB, new AwS558S0100000_14(c19719912DlLIZ2, 768), AFwS248S0000000_14.get$arr$(219), null, true);
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{ChatRoomScope.class});
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(ChatRoomScope.class);
        return arrayList;
    }

    public final Fragment Go() {
        return (Fragment) this.LLIZLLLIL.getValue();
    }

    public final SessionInfo Ho() {
        return (SessionInfo) this.LLJI.getValue();
    }

    @Override // X.AbstractC738140SxQ, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        ViewModelProvider.Factory defaultViewModelProviderFactory = super.getDefaultViewModelProviderFactory();
        C127G c127g = this.LLJJ;
        if (c127g == null) {
            synchronized (this) {
                c127g = this.LLJJ;
                if (c127g == null) {
                    C127G c127g2 = new C127G(new Object[]{IIMessageListViewModel.class, new AObjectS67S0000000_14(this, 7), AbsChatPageLightInteractionViewModel.class, new AObjectS67S0000000_14(this, 8)}, defaultViewModelProviderFactory);
                    this.LLJJ = c127g2;
                    return c127g2;
                }
            }
        }
        return c127g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x057b  */
    /* JADX WARN: Type inference failed for: r4v29, types: [X.0Zbq] */
    /* JADX WARN: Type inference failed for: r5v31, types: [X.0Zbf] */
    /* JADX WARN: Type inference failed for: r5v35 */
    /* JADX WARN: Type inference failed for: r5v36, types: [kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function2] */
    /* JADX WARN: Type inference failed for: r5v52 */
    @Override // com.bytedance.assem.arch.core.UIAssem
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r28) {
        /*
            Method dump skipped, instruction units count: 3242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.messagelist.MessageListAndRelatedUIContentAssem.onViewCreated(android.view.View):void");
    }
}
