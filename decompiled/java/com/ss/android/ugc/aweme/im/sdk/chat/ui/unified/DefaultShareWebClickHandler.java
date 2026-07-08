package com.ss.android.ugc.aweme.im.sdk.chat.ui.unified;

import X.C0I0B;
import X.C824410WVr;
import X.C824430WVt;
import X.C844450XAt;
import X.C869590Y9l;
import X.C904500Ze4;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.message.content.ShareSearchContent;
import com.ss.android.ugc.aweme.im.message.content.ShareSubscribeInviteContent;
import com.ss.android.ugc.aweme.im.message.content.ShareWebContent;
import com.ss.android.ugc.aweme.im.messagelist.api.IIMMessageAdapterAnalytics;
import com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListShareWebClickAbility;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
public final class DefaultShareWebClickHandler implements MessageListShareWebClickAbility {
    @Override // com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListShareWebClickAbility
    public final void W00(View view, ShareSubscribeInviteContent shareSubscribeInviteContent) {
        if (!TextUtils.isEmpty(shareSubscribeInviteContent.getUrl())) {
            SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(view.getContext(), shareSubscribeInviteContent.getUrl());
            smartRouteBuildRoute.withParam("show_entrance", "message");
            smartRouteBuildRoute.withParam("enter_from", "message");
            smartRouteBuildRoute.open();
        }
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListShareWebClickAbility
    public final void ux0(View view, ShareSearchContent shareSearchContent) {
        String[] strArr = C844450XAt.LIZ;
        if (!C844450XAt.LIZJ(shareSearchContent.getImage(), C844450XAt.LIZIZ()) && !C844450XAt.LIZJ(shareSearchContent.getUrl(), C844450XAt.LIZIZ()) && !C824430WVt.LIZIZ(shareSearchContent.getSchema()) && !TextUtils.isEmpty(shareSearchContent.getSchema())) {
            C824410WVr.LIZ(view.getContext(), shareSearchContent.getSchema(), false);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListShareWebClickAbility
    public final void nP1(View view, C869590Y9l c869590Y9l, ShareWebContent shareWebContent) {
        IIMMessageAdapterAnalytics iIMMessageAdapterAnalytics;
        String[] strArr = C844450XAt.LIZ;
        if (!C844450XAt.LIZJ(shareWebContent.getUrl(), C844450XAt.LIZIZ()) && !C844450XAt.LIZJ(shareWebContent.getImage(), C844450XAt.LIZIZ()) && !TextUtils.isEmpty(shareWebContent.getUrl())) {
            C904500Ze4.LIZ(view.getContext(), shareWebContent.getUrl());
            if (c869590Y9l != null && c869590Y9l.getExt() != null && TextUtils.equals(c869590Y9l.getExt().get("awe:from:commerce"), "1") && c869590Y9l.getMsgType() == 26 && Intrinsics.LJFF(shareWebContent.isCard(), Boolean.TRUE) && (iIMMessageAdapterAnalytics = (IIMMessageAdapterAnalytics) PluggableExtentionKt.pluggableSpi$default(IIMMessageAdapterAnalytics.class, false, false, false, 14, null)) != null) {
                iIMMessageAdapterAnalytics.LJIIJJI(String.valueOf(c869590Y9l.getSender()), String.valueOf(c869590Y9l.getMsgId()), C0I0B.LJFF.LIZIZ());
            }
        }
    }
}
