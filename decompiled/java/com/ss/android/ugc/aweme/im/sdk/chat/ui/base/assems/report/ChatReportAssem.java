package com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.report;

import X.C019F;
import X.C01GW;
import X.C09R3;
import X.C0ZL4;
import X.C11NJ;
import X.C127G;
import X.C13LE;
import X.C1509305vX;
import X.C1559260qg8;
import X.C1637806bA;
import X.C1637906bB;
import X.C197039127h;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C452501pT;
import X.C457780HxI;
import X.C687700QyG;
import X.C723590SZx;
import X.C723850SaN;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.InterfaceC1146704e9;
import X.InterfaceC2217461Bqa;
import Y.ACListenerS149S0100000_14;
import Y.AObjectS67S0000000_14;
import android.view.View;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.chatroom.api.report.ChatReportPageViewModel;
import com.ss.android.ugc.aweme.im.chatroom.api.report.IChatReportPageViewModelProvider;
import com.ss.android.ugc.aweme.im.common.scope.ChatRoomScope;
import com.ss.android.ugc.aweme.im.messagelist.api.viewmodel.IIMessageListViewModel;
import com.ss.android.ugc.aweme.im.sdk.chat.viewmodel.LongPressViewModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS248S0000000_14;
import kotlin.jvm.internal.AwS558S0100000_14;
import kotlin.jvm.internal.AwS581S0100000_2;
import kotlin.jvm.internal.AwS616S0100000_2;

/* JADX INFO: loaded from: classes15.dex */
public final class ChatReportAssem extends UIContentAssem implements InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIII;
    public final C1559260qg8 LLIZLLLIL = new C1559260qg8(new C723590SZx(this, C457780HxI.class, null), checkSupervisorPrepared());
    public final C01GW LLJ = C1509305vX.LIZ(new AwS558S0100000_14(this, 776));
    public final C01GW LLJI = C1509305vX.LIZ(new AwS558S0100000_14(this, 775));
    public final C01GW LLJIJIL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 774));
    public final AssemVMLazy LLJILJIL;
    public final AssemVMLazy LLJILJILJ;
    public final AssemVMLazy LLJILLL;
    public final C11NJ LLJJ;
    public C127G LLJJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(ChatReportAssem.class, "longPressViewModel", "getLongPressViewModel()Lcom/ss/android/ugc/aweme/im/sdk/chat/viewmodel/LongPressViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(ChatReportAssem.class, "messageListViewModel", "getMessageListViewModel()Lcom/ss/android/ugc/aweme/im/messagelist/api/viewmodel/IIMessageListViewModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(ChatReportAssem.class, "chatReportPageViewModel", "getChatReportPageViewModel()Lcom/ss/android/ugc/aweme/im/chatroom/api/report/ChatReportPageViewModel;", 0);
        c09r3.getClass();
        LLJJIII = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3};
    }

    public ChatReportAssem() {
        ViewModelProvider.Factory defaultViewModelProviderFactory;
        AwS558S0100000_14 awS558S0100000_14 = null;
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(LongPressViewModel.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLJILJIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, c1637906bB, new AwS558S0100000_14(c19719912DlLIZ, 777), AFwS248S0000000_14.get$arr$(225), null, true);
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(IIMessageListViewModel.class);
        this.LLJILJILJ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c019f, c1637906bB, new AwS558S0100000_14(c19719912DlLIZ2, 778), AFwS248S0000000_14.get$arr$(226), null, true);
        HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = (HasDefaultViewModelProviderFactory) PluggableExtentionKt.pluggableSpiForReal(IChatReportPageViewModelProvider.class);
        if (hasDefaultViewModelProviderFactory != null && (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) != null) {
            awS558S0100000_14 = new AwS558S0100000_14(defaultViewModelProviderFactory, 773);
        }
        C19719912Dl c19719912DlLIZ3 = C13LE.LIZ(ChatReportPageViewModel.class);
        this.LLJILLL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ3), c019f, c1637906bB, new AwS558S0100000_14(c19719912DlLIZ3, 779), AFwS248S0000000_14.get$arr$(227), awS558S0100000_14, true);
        this.LLJJ = new C11NJ();
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

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        C786410Ut5.LLLLLLJ((C197039127h) this.LLJI.getValue(), 0);
        ((C197039127h) this.LLJI.getValue()).setSupportClickWhenDisable(true);
        C786410Ut5.U8((C197039127h) this.LLJI.getValue(), new ACListenerS149S0100000_14(this, 24));
        C197039127h c197039127h = (C197039127h) this.LLJI.getValue();
        AssemVMLazy assemVMLazy = this.LLJILLL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIII;
        c197039127h.setEnabled(true ^ ((ChatReportPageViewModel) assemVMLazy.getValue()).xQ2().isEmpty());
        C736680Sv4.LJIIIIZZ(this, this.LLJILLL.getValue(), new C2217381BqS() { // from class: X.0ZcQ
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C2002907sx) obj).LL;
            }
        }, null, new AwS616S0100000_2(this, 52), 6);
    }

    @Override // X.AbstractC738140SxQ, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        ViewModelProvider.Factory defaultViewModelProviderFactory = super.getDefaultViewModelProviderFactory();
        C127G c127g = this.LLJJI;
        if (c127g == null) {
            synchronized (this) {
                c127g = this.LLJJI;
                if (c127g == null) {
                    C127G c127g2 = new C127G(new Object[]{IIMessageListViewModel.class, new AObjectS67S0000000_14(this, 12), ChatReportPageViewModel.class, new AObjectS67S0000000_14(this, 11)}, defaultViewModelProviderFactory);
                    this.LLJJI = c127g2;
                    return c127g2;
                }
            }
        }
        return c127g;
    }

    @Override // X.AbstractC738140SxQ
    public final void onAssemPostCreate() {
        super.onAssemPostCreate();
        AssemVMLazy assemVMLazy = this.LLJILJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIII;
        assemVMLazy.getValue().setStateImmediate(new AwS581S0100000_2(C0ZL4.DISABLED, 673));
        ((IIMessageListViewModel) this.LLJILJILJ.getValue()).vQ2("report", false);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        this.LLJJ.LJ();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        C723850SaN.LIZLLL(this, new AwS581S0100000_2(this, 226));
    }
}
