package com.ss.android.ugc.aweme.im.sdk.chat.inline;

import X.C123100dR;
import X.C1672306gj;
import X.C1679106hp;
import X.C869590Y9l;
import android.view.View;
import com.bytedance.router.SmartRouter;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.message.content.SystemContent;
import com.ss.android.ugc.aweme.im.messagelist.api.notice.protocol.ISystemNoticeActionClickProtocol;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class CommonRouterInlineAction implements ISystemNoticeActionClickProtocol {
    @Override // com.ss.android.ugc.aweme.im.messagelist.api.notice.protocol.ISystemNoticeActionClickProtocol
    public final boolean J90(SystemContent.Key key) {
        if (key.getAction() == 37) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.notice.protocol.ISystemNoticeActionClickProtocol
    public final void gt1(View view, C869590Y9l c869590Y9l, SystemContent.Key key, IMUser iMUser, SessionInfo sessionInfo) {
        int chatType;
        String str;
        if (C123100dR.LIZ(key.getLink())) {
            SmartRouter.buildRoute(view.getContext(), key.getLink()).open();
            C1672306gj.LIZJ(sessionInfo, c869590Y9l, null, null, 60);
            if (sessionInfo != null) {
                chatType = sessionInfo.getChatType();
            } else {
                chatType = -1;
            }
            Map<String, String> extra = key.getExtra();
            if (extra == null || (str = extra.get(Scene.SCENE_SERVICE)) == null) {
                str = "";
            }
            C1679106hp.LIZ(chatType, str, "chat", null, null, 56);
        }
    }
}
