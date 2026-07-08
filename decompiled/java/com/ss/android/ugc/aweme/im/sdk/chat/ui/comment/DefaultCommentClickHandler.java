package com.ss.android.ugc.aweme.im.sdk.chat.ui.comment;

import X.C0Z92;
import X.C1720706oX;
import X.C869590Y9l;
import X.EnumC899970ZSh;
import android.content.Context;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListCommentClickAbility;
import com.ss.android.ugc.aweme.im.service.aweme.IAwemeOpenHelper;

/* JADX INFO: loaded from: classes15.dex */
public final class DefaultCommentClickHandler implements MessageListCommentClickAbility {
    public final SessionInfo LL;

    public DefaultCommentClickHandler(SessionInfo sessionInfo) {
        this.LL = sessionInfo;
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListCommentClickAbility
    public final void Sa1(Context context, C869590Y9l c869590Y9l, String str, String str2) {
        C1720706oX.LIZIZ(IAwemeOpenHelper.LIZ, context, null, C0Z92.NORMAL, null, EnumC899970ZSh.VIDEO_COVER, str, c869590Y9l, this.LL, str2, true, "click_shared_comment", null, null, null, 14338);
    }
}
