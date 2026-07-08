package com.ss.android.ugc.aweme.im.sdk.common.report;

import X.C0YAE;
import X.C13LP;
import X.C1559260qg8;
import X.C2002907sx;
import X.C457780HxI;
import X.C869590Y9l;
import X.C903470ZcP;
import X.InterfaceC0148002o;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.im.chat.IReportChatMsgManager;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.chatroom.api.report.ChatReportPageViewModel;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AFwS248S0000000_14;
import kotlin.jvm.internal.AwS127S1200000_11;
import kotlin.jvm.internal.AwS593S0100000_14;

/* JADX INFO: loaded from: classes15.dex */
public final class ChatReportPageViewModelImpl extends ChatReportPageViewModel {
    public final C1559260qg8 LL = new C1559260qg8(new AwS127S1200000_11((AssemViewModel) this, (AssemViewModel<Object>) C457780HxI.class, (Class<Object>) null, (String) 13), true);

    @Override // com.ss.android.ugc.aweme.im.chatroom.api.report.ChatReportPageViewModel
    public final void vQ2() {
        setState(AFwS248S0000000_14.get$arr$(280));
    }

    @Override // com.ss.android.ugc.aweme.im.chatroom.api.report.ChatReportPageViewModel
    /* JADX INFO: renamed from: wQ2 */
    public final C2002907sx defaultState() {
        return new C2002907sx(0);
    }

    @Override // com.ss.android.ugc.aweme.im.chatroom.api.report.ChatReportPageViewModel, com.bytedance.assem.arch.viewModel.AssemViewModel
    public final /* bridge */ /* synthetic */ InterfaceC0148002o defaultState() {
        return defaultState();
    }

    @Override // com.ss.android.ugc.aweme.im.chatroom.api.report.ChatReportPageViewModel
    public final List<C869590Y9l> xQ2() {
        return C13LP.LLIIII(getState().LL);
    }

    @Override // com.ss.android.ugc.aweme.im.chatroom.api.report.ChatReportPageViewModel
    public final void yQ2(List<? extends C869590Y9l> list) {
        List listLIZIZ;
        SessionInfo sessionInfo = ((C457780HxI) this.LL.getValue()).LL;
        IReportChatMsgManager.LIZ.getClass();
        IReportChatMsgManager iReportChatMsgManagerLIZ = C903470ZcP.LIZ();
        if (iReportChatMsgManagerLIZ == null || (listLIZIZ = iReportChatMsgManagerLIZ.LIZ(sessionInfo.getConversationId())) == null || !(!listLIZIZ.isEmpty())) {
            IReportChatMsgManager iReportChatMsgManagerLIZ2 = C903470ZcP.LIZ();
            if (iReportChatMsgManagerLIZ2 != null) {
                listLIZIZ = iReportChatMsgManagerLIZ2.LIZIZ(sessionInfo.getDefaultMsgSelectedNum(), list);
            } else {
                throw new IllegalArgumentException("null preSelectedMessages");
            }
        }
        setState(new AwS593S0100000_14(listLIZIZ, (List<C0YAE>) 129));
    }

    @Override // com.ss.android.ugc.aweme.im.chatroom.api.report.ChatReportPageViewModel
    public final void zQ2(C869590Y9l c869590Y9l, boolean z) {
        Set setLLIIIZ = C13LP.LLIIIZ(getState().LL);
        boolean zContains = setLLIIIZ.contains(c869590Y9l);
        if (z) {
            if (!zContains) {
                setLLIIIZ.add(c869590Y9l);
                setState(new AwS593S0100000_14(setLLIIIZ, (Set<C869590Y9l>) 326));
                return;
            }
            return;
        }
        if (!zContains) {
            return;
        }
        setLLIIIZ.remove(c869590Y9l);
        setState(new AwS593S0100000_14(setLLIIIZ, (Set<C869590Y9l>) 327));
    }
}
