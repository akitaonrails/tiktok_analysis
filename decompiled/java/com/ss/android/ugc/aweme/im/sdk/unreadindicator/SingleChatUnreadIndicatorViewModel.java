package com.ss.android.ugc.aweme.im.sdk.unreadindicator;

import X.C0PEM;
import X.C23250099c;
import X.C910570Znr;
import X.C910630Znx;
import X.InterfaceC0148002o;
import com.ss.android.ugc.aweme.im.chatroom.api.viewmodel.ChatCommonViewModel;
import com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListScrollAbility;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes15.dex */
public final class SingleChatUnreadIndicatorViewModel extends UnreadIndicatorVM {
    public final MessageListScrollAbility LLILLL;
    public final ChatCommonViewModel LLILZ;

    @Override // com.ss.android.ugc.aweme.im.sdk.unreadindicator.UnreadIndicatorVM
    /* JADX INFO: renamed from: vQ2 */
    public final C910570Znr defaultState() {
        return new C910570Znr(0);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.unreadindicator.UnreadIndicatorVM, com.bytedance.assem.arch.viewModel.AssemViewModel
    public final /* bridge */ /* synthetic */ InterfaceC0148002o defaultState() {
        return defaultState();
    }

    public SingleChatUnreadIndicatorViewModel(MessageListScrollAbility messageListScrollAbility, ChatCommonViewModel chatCommonViewModel) {
        this.LLILLL = messageListScrollAbility;
        this.LLILZ = chatCommonViewModel;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.unreadindicator.UnreadIndicatorVM
    public final void xQ2(int i, long j) {
        C23250099c.LIZLLL(getAssemVMScope(), C0PEM.LIZJ, null, new C910630Znx(this, i, j, new ArrayList(), null), 2);
    }
}
