package com.ss.android.ugc.aweme.im.sdk.chat.ui.text.content;

import X.C2097608Jq;
import android.view.View;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListTextBigEmojiClickAbility;
import com.ss.android.ugc.aweme.socialgame.api.model.EmojiGameInfo;
import com.ss.android.ugc.aweme.socialgame.api.service.ISocialGameService;
import kotlin.Pair;
import kotlin.jvm.internal.AwS215S0300000_6;
import kotlin.jvm.internal.AwS47S1300000_6;

/* JADX INFO: loaded from: classes7.dex */
public final class DefaultTextBigEmojiClickHandler implements MessageListTextBigEmojiClickAbility {
    public final SessionInfo LL;

    public DefaultTextBigEmojiClickHandler(SessionInfo sessionInfo) {
        this.LL = sessionInfo;
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListTextBigEmojiClickAbility
    public final void B21(View view, String str) {
        ISocialGameService iSocialGameService;
        if (str != null && (iSocialGameService = (ISocialGameService) PluggableExtentionKt.pluggableSpi$default(ISocialGameService.class, false, false, false, 14, null)) != null) {
            iSocialGameService.LJIIIZ(view.getContext(), new EmojiGameInfo(0, str, null), this.LL, C2097608Jq.LJIIIIZZ(new Pair("enter_from", "chat"), new Pair("enter_method", "emoji")));
        }
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListTextBigEmojiClickAbility
    public final void qI2(SessionInfo sessionInfo, String str, AwS215S0300000_6 awS215S0300000_6) {
        ISocialGameService iSocialGameService = (ISocialGameService) PluggableExtentionKt.pluggableSpi$default(ISocialGameService.class, false, false, false, 14, null);
        if (iSocialGameService == null) {
            return;
        }
        iSocialGameService.LJIIJ(sessionInfo, new AwS47S1300000_6(iSocialGameService, str, sessionInfo, awS215S0300000_6, 0));
    }
}
