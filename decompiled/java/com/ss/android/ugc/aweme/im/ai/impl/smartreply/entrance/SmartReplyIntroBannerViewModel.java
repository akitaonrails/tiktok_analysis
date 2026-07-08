package com.ss.android.ugc.aweme.im.ai.impl.smartreply.entrance;

import X.C0155002v;
import X.C11NJ;
import X.C1500205u4;
import X.C1559260qg8;
import X.C2188811AlT;
import X.C457780HxI;
import X.C723600SZy;
import X.C869590Y9l;
import X.C909290Zln;
import X.InterfaceC0148002o;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.messagelist.api.ability.ChatroomEventAbility;

/* JADX INFO: loaded from: classes3.dex */
public final class SmartReplyIntroBannerViewModel extends AssemViewModel<C0155002v> {
    public final ChatroomEventAbility LL;
    public final C1559260qg8 LLILLJJLI = new C1559260qg8(new C723600SZy(this, C457780HxI.class, null), true);
    public final C11NJ LLILLL = new C11NJ();

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C0155002v(0);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        String strVQ2;
        C1500205u4 c1500205u4 = C1500205u4.LLILLJJLI;
        c1500205u4.getClass();
        if (C1500205u4.LLILZLL != null) {
            C869590Y9l c869590Y9l = C1500205u4.LLILZLL;
            if (c869590Y9l == null || (strVQ2 = c869590Y9l.getConversationId()) == null) {
                strVQ2 = vQ2();
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("report ignore when onCleared convId = ");
            sbLIZ.append(vQ2());
            sbLIZ.append(' ');
            sbLIZ.append(strVQ2);
            C2188811AlT.LIZIZ(sbLIZ);
            C1500205u4.LIZIZ(1, "smart_reply_chatroom_creator", strVQ2);
        }
        synchronized (c1500205u4) {
            C1500205u4.LLILZLL = null;
        }
    }

    public final String vQ2() {
        C457780HxI c457780HxI = (C457780HxI) this.LLILLJJLI.getValue();
        SessionInfo sessionInfo = c457780HxI != null ? c457780HxI.LL : null;
        if (!(sessionInfo instanceof C909290Zln) || sessionInfo == null) {
            return null;
        }
        return sessionInfo.getConversationId();
    }

    public SmartReplyIntroBannerViewModel(ChatroomEventAbility chatroomEventAbility) {
        this.LL = chatroomEventAbility;
    }
}
