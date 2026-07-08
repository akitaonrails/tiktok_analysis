package com.ss.android.ugc.aweme.im.messagelist.api.notice.protocol;

import X.C06KX;
import X.C869590Y9l;
import android.view.View;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.message.content.SystemContent;

/* JADX INFO: loaded from: classes3.dex */
public interface ISystemNoticeActionClickProtocol extends C06KX {
    boolean J90(SystemContent.Key key);

    void gt1(View view, C869590Y9l c869590Y9l, SystemContent.Key key, IMUser iMUser, SessionInfo sessionInfo);
}
