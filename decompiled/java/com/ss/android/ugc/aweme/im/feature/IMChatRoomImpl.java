package com.ss.android.ugc.aweme.im.feature;

import X.C0PEM;
import X.C0WZX;
import X.C13LP;
import X.C1518105wx;
import X.C2204961BRm;
import X.C23250099c;
import X.C786410Ut5;
import X.C912620ZrA;
import androidx.lifecycle.LifecycleOwnerKt;
import com.ss.android.ugc.aweme.im.chatroom.api.IMChatRoomApi;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.chatroom.input.container.BaseChatInputAssem;
import com.ss.android.ugc.aweme.im.util.CommonParamInterceptor;
import java.util.ArrayList;
import java.util.List;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: loaded from: classes7.dex */
public final class IMChatRoomImpl implements IMChatRoomApi {
    public final CommonParamInterceptor LIZIZ = CommonParamInterceptor.LL;
    public final C912620ZrA LIZJ = C912620ZrA.LIZ.getValue();

    @Override // com.ss.android.ugc.aweme.im.chatroom.api.IMChatRoomApi
    public final C912620ZrA LIZ() {
        return this.LIZJ;
    }

    @Override // com.ss.android.ugc.aweme.im.chatroom.api.IMChatRoomApi
    public final CommonParamInterceptor LIZIZ() {
        return this.LIZIZ;
    }

    @Override // com.ss.android.ugc.aweme.im.chatroom.api.IMChatRoomApi
    public final String LIZLLL(String str) {
        List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(C2204961BRm.LLIZ(C786410Ut5.A2(), str, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOOlLZnL3SaeCeZhk0A+pjfmY097VnsJ6ts=", null)), new String[]{"; "}, 0, 6);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listLJJLIIIJILLIZJL) {
            String str2 = (String) obj;
            if (u.LJJIIJZLJL(str2, "store-country-code=", false) || u.LJJIIJZLJL(str2, "store-country-code-src=", false) || u.LJJIIJZLJL(str2, "store-idc", false) || u.LJJIIJZLJL(str2, "tt-target-idc", false)) {
                arrayList.add(obj);
            }
        }
        return C13LP.LJJLIIIJ(arrayList, "; ", null, null, 0, null, null, 62);
    }

    @Override // com.ss.android.ugc.aweme.im.chatroom.api.IMChatRoomApi
    public final void LIZJ(BaseChatInputAssem baseChatInputAssem, SessionInfo sessionInfo) {
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(baseChatInputAssem), C0PEM.LIZJ, null, new C1518105wx(baseChatInputAssem, sessionInfo, null), 2);
    }
}
