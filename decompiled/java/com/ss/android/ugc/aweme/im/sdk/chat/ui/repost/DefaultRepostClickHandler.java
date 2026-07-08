package com.ss.android.ugc.aweme.im.sdk.chat.ui.repost;

import X.C0Z92;
import X.C1720706oX;
import X.C869590Y9l;
import X.EnumC899970ZSh;
import android.content.Context;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListRepostClickAbility;
import com.ss.android.ugc.aweme.im.service.aweme.IAwemeOpenHelper;

/* JADX INFO: loaded from: classes15.dex */
public final class DefaultRepostClickHandler implements MessageListRepostClickAbility {
    public final SessionInfo LL;

    public DefaultRepostClickHandler(SessionInfo sessionInfo) {
        this.LL = sessionInfo;
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListRepostClickAbility
    public final void eI2(Context context, C869590Y9l c869590Y9l, String str, String str2) {
        C1720706oX.LIZIZ(IAwemeOpenHelper.LIZ, context, null, C0Z92.NORMAL, null, EnumC899970ZSh.REPOST, str, c869590Y9l, this.LL, null, true, "click", str2, null, null, 12290);
    }
}
