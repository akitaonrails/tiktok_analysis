package com.ss.android.ugc.aweme.im.sdk.chat.ui.text.content;

import X.C2097608Jq;
import android.view.View;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListTextClickAbility;
import com.ss.android.ugc.aweme.socialgame.api.model.EmojiGameInfo;
import com.ss.android.ugc.aweme.socialgame.api.service.ISocialGameService;
import kotlin.Pair;
import kotlin.jvm.internal.AwS223S0300000_14;
import kotlin.jvm.internal.AwS47S1300000_6;

/* JADX INFO: loaded from: classes7.dex */
public final class DefaultTextClickHandler implements MessageListTextClickAbility {
    public final SessionInfo LL;

    public DefaultTextClickHandler(SessionInfo sessionInfo) {
        this.LL = sessionInfo;
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListTextClickAbility
    public final void uZ1(View view, String str) {
        ISocialGameService iSocialGameService;
        if (str != null && (iSocialGameService = (ISocialGameService) PluggableExtentionKt.pluggableSpiForReal(ISocialGameService.class)) != null) {
            iSocialGameService.LJIIIZ(view.getContext(), new EmojiGameInfo(0, str, null), this.LL, C2097608Jq.LJIIIIZZ(new Pair("enter_from", "chat"), new Pair("enter_method", "emoji")));
        }
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListTextClickAbility
    public final void xN1(SessionInfo sessionInfo, String str, AwS223S0300000_14 awS223S0300000_14) {
        ISocialGameService iSocialGameService = (ISocialGameService) PluggableExtentionKt.pluggableSpiForReal(ISocialGameService.class);
        if (iSocialGameService == null) {
            return;
        }
        iSocialGameService.LJIIJ(sessionInfo, new AwS47S1300000_6(iSocialGameService, str, sessionInfo, awS223S0300000_14, 1));
    }
}
