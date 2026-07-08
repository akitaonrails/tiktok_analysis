package com.ss.android.ugc.aweme.im.sdk.chat.ui.singleactivity;

import X.C1336205Ku;
import android.content.Context;
import android.os.Bundle;
import com.bytedance.router.route.IRouteAction;
import com.ss.android.ugc.aweme.im.chatroom.api.model.EnterChatParams;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class ChatRoomRouter implements IRouteAction {
    @Override // com.bytedance.router.route.IRouteAction
    public Object open(Context context, String str, Bundle bundle) {
        EnterChatParams enterChatParams;
        Serializable serializable = null;
        if (bundle != null) {
            serializable = bundle.getSerializable("key_enter_chat_params");
        }
        if ((serializable instanceof EnterChatParams) && (enterChatParams = (EnterChatParams) serializable) != null) {
            if (context != null) {
                enterChatParams.setContext(context);
            }
            C1336205Ku.LIZ(false).getImChatService().LJIILLIIL(enterChatParams, null);
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }
}
