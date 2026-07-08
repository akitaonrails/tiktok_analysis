package com.ss.android.ugc.aweme.im.sdk.chat.ui.user;

import X.AnonymousClass0548;
import X.C869590Y9l;
import android.view.View;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.chatroom.api.IFollowTaskService;
import com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListContentFollowClickAbility;

/* JADX INFO: loaded from: classes3.dex */
public final class DefaultContentFollowClickHandler implements MessageListContentFollowClickAbility {
    public final AnonymousClass0548 LL = new AnonymousClass0548();

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListContentFollowClickAbility
    public final void sp0(View view, C869590Y9l c869590Y9l) {
        IFollowTaskService iFollowTaskService = (IFollowTaskService) PluggableExtentionKt.pluggableSpiForReal(IFollowTaskService.class);
        if (iFollowTaskService != null) {
            iFollowTaskService.LIZ(this.LL, view, c869590Y9l);
        }
    }
}
