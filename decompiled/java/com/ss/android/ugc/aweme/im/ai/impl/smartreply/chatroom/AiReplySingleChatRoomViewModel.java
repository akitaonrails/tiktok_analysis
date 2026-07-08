package com.ss.android.ugc.aweme.im.ai.impl.smartreply.chatroom;

import X.AnonymousClass0956;
import X.C0Y8T;
import X.C0YSQ;
import X.C15395060z;
import X.C1559260qg8;
import X.C1604706Qb;
import X.C457780HxI;
import X.C723600SZy;
import X.C882340YjQ;
import X.C909290Zln;
import X.InterfaceC0148002o;
import X.InterfaceC876950Yaj;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;

/* JADX INFO: loaded from: classes3.dex */
public final class AiReplySingleChatRoomViewModel extends AssemViewModel<C1604706Qb> {
    public final C1559260qg8 LL = new C1559260qg8(new C723600SZy(this, C457780HxI.class, null), true);
    public AnonymousClass0956 LLILLJJLI;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        String strVQ2 = vQ2();
        C0Y8T c0y8tLIZ = strVQ2 != null ? C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LIZ(strVQ2) : null;
        boolean z = false;
        if (c0y8tLIZ != null && C882340YjQ.LJI(c0y8tLIZ) && C15395060z.LIZ(c0y8tLIZ)) {
            z = true;
        }
        return new C1604706Qb(z);
    }

    public final String vQ2() {
        C457780HxI c457780HxI = (C457780HxI) this.LL.getValue();
        SessionInfo sessionInfo = c457780HxI != null ? c457780HxI.LL : null;
        if (!(sessionInfo instanceof C909290Zln) || sessionInfo == null) {
            return null;
        }
        return sessionInfo.getConversationId();
    }
}
