package com.ss.android.ugc.aweme.im.ai.impl.smartreply.chatroom;

import X.AnonymousClass0956;
import X.C0YSQ;
import X.C0ZPD;
import X.C1559260qg8;
import X.C1605606Qk;
import X.C457780HxI;
import X.C723600SZy;
import X.C909290Zln;
import X.InterfaceC0148002o;
import X.InterfaceC876950Yaj;
import android.content.Intent;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.im.ai.api.smartreply.SmartReplyChatRoomAbility;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import kotlin.jvm.internal.AFwS229S0000000_2;

/* JADX INFO: loaded from: classes3.dex */
public final class BotChatRoomViewModel extends AssemViewModel<C1605606Qk> implements SmartReplyChatRoomAbility {
    public final C1559260qg8 LL = new C1559260qg8(new C723600SZy(this, C457780HxI.class, null), true);
    public AnonymousClass0956 LLILLJJLI;

    @Override // com.ss.android.ugc.aweme.im.ai.api.smartreply.SmartReplyChatRoomAbility
    public final boolean m42(C0ZPD c0zpd) {
        return false;
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        String strVQ2 = vQ2();
        if (strVQ2 != null) {
            C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LIZ(strVQ2);
        }
        return new C1605606Qk(5, true);
    }

    public final String vQ2() {
        C457780HxI c457780HxI = (C457780HxI) this.LL.getValue();
        SessionInfo sessionInfo = c457780HxI != null ? c457780HxI.LL : null;
        if (!(sessionInfo instanceof C909290Zln) || sessionInfo == null) {
            return null;
        }
        return sessionInfo.getConversationId();
    }

    @Override // com.ss.android.ugc.aweme.im.ai.api.smartreply.SmartReplyChatRoomAbility
    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i == 32 && i2 == 3001) {
            setState(AFwS229S0000000_2.get$arr$(205));
        }
    }
}
