package com.ss.android.ugc.aweme.im.sdk.chat.ui.user;

import X.C879350Yeb;
import com.ss.android.ugc.aweme.im.message.content.ShareUserContent;
import com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListShareUserClickAbility;

/* JADX INFO: loaded from: classes15.dex */
public final class DefaultShareUserClickHandler implements MessageListShareUserClickAbility {
    @Override // com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListShareUserClickAbility
    public final void kw1(ShareUserContent shareUserContent) {
        C879350Yeb c879350Yeb = C879350Yeb.LIZ;
        String uid = shareUserContent.getUid();
        String secUid = shareUserContent.getSecUid();
        c879350Yeb.getClass();
        C879350Yeb.LIZ(uid, secUid, null);
    }
}
