package com.ss.android.ugc.aweme.fangroup.joinpanel.scheme;

import X.AbstractC1711506n3;
import X.C0YSQ;
import X.C1231150i8v;
import X.C1231160i8w;
import X.EnumC1231170i8x;
import X.InterfaceC876950Yaj;
import android.content.Context;
import com.ss.android.ugc.aweme.fangroup.model.GroupJoinResponse;

/* JADX INFO: loaded from: classes20.dex */
public final class JoinFanGroupPanelOpenChatAction implements IJoinFanGroupPanelActionProtocol {
    @Override // com.ss.android.ugc.aweme.fangroup.joinpanel.scheme.IJoinFanGroupPanelActionProtocol
    public final int getAction() {
        return EnumC1231170i8x.ACTION_OPEN_CHAT_ROOM.getAction();
    }

    @Override // com.ss.android.ugc.aweme.fangroup.joinpanel.scheme.IJoinFanGroupPanelActionProtocol
    public final void CR1(Context context, C1231150i8v c1231150i8v, GroupJoinResponse groupJoinResponse) {
        C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LJJI(c1231150i8v.getConversationId(), c1231150i8v.getConvShortId(), AbstractC1711506n3.LIZIZ, new C1231160i8w(context, c1231150i8v));
    }
}
