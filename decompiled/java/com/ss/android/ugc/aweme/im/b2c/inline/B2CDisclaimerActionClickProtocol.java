package com.ss.android.ugc.aweme.im.b2c.inline;

import X.C1595706Mp;
import X.C1672306gj;
import X.C869590Y9l;
import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.message.content.SystemContent;
import com.ss.android.ugc.aweme.im.messagelist.api.notice.protocol.ISystemNoticeActionClickProtocol;
import org.json.JSONException;

/* JADX INFO: loaded from: classes3.dex */
public final class B2CDisclaimerActionClickProtocol implements ISystemNoticeActionClickProtocol {
    @Override // com.ss.android.ugc.aweme.im.messagelist.api.notice.protocol.ISystemNoticeActionClickProtocol
    public final boolean J90(SystemContent.Key key) {
        if (key.getAction() == 21) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.notice.protocol.ISystemNoticeActionClickProtocol
    public final void gt1(View view, C869590Y9l c869590Y9l, SystemContent.Key key, IMUser iMUser, SessionInfo sessionInfo) throws JSONException {
        C1595706Mp c1595706Mp = C1595706Mp.LIZ;
        Context context = view.getContext();
        if (c869590Y9l != null) {
            c869590Y9l.getScene();
        }
        String link = key.getLink();
        if (link == null) {
            link = "";
        }
        c1595706Mp.getClass();
        C1595706Mp.LIZ(context, link, sessionInfo, "click_inline_message", null);
        C1672306gj.LIZJ(sessionInfo, c869590Y9l, null, null, 60);
    }
}
