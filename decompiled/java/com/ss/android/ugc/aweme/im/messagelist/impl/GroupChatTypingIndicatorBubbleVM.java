package com.ss.android.ugc.aweme.im.messagelist.impl;

import X.C13BV;
import X.C1518605x2;
import X.C1684506ih;
import X.C1769806wS;
import X.C1BNE;
import X.C2252321DDq;
import X.InterfaceC0148002o;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.messagelist.api.fake.message.ChatRoomFakeMsgOperatorAbility;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
public final class GroupChatTypingIndicatorBubbleVM extends AssemViewModel<InterfaceC0148002o> {
    public final ChatRoomFakeMsgOperatorAbility LL;
    public final SessionInfo LLILLJJLI;
    public C1684506ih LLILLL;
    public final AtomicBoolean LLILZ = new AtomicBoolean(false);
    public final C2252321DDq LLILZIL;
    public final C2252321DDq LLILZLL;
    public List<C1518605x2> LLIZ;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1769806wS(1);
    }

    public GroupChatTypingIndicatorBubbleVM(ChatRoomFakeMsgOperatorAbility chatRoomFakeMsgOperatorAbility, SessionInfo sessionInfo) {
        this.LL = chatRoomFakeMsgOperatorAbility;
        this.LLILLJJLI = sessionInfo;
        C2252321DDq c2252321DDqLIZ = C1BNE.LIZ(C13BV.INSTANCE);
        this.LLILZIL = c2252321DDqLIZ;
        this.LLILZLL = c2252321DDqLIZ;
    }
}
