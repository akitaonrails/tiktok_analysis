package com.ss.android.ugc.aweme.im.messagelist;

import X.C0ZUL;
import X.C0ZUM;
import X.C0ZUN;
import X.C1606640ruY;
import X.C2095008Iq;
import X.C2188811AlT;
import X.C327340CsO;
import X.C869590Y9l;
import X.EnumC461080I6g;
import android.content.Context;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListRecentActivityAbility;
import com.ss.android.ugc.aweme.im.service.IAwemeImManager;
import java.util.Collections;

/* JADX INFO: loaded from: classes15.dex */
public final class DefaultRecentActivityHandler implements MessageListRecentActivityAbility {
    public final SessionInfo LL;

    public DefaultRecentActivityHandler(SessionInfo sessionInfo) {
        this.LL = sessionInfo;
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListRecentActivityAbility
    public final void GY0(Context context, String str, EnumC461080I6g enumC461080I6g, Aweme aweme, String str2, String str3) {
        long jLongValue;
        IAwemeImManager iAwemeImManager;
        C0ZUN proxy;
        String str4;
        Aweme awemeLIZ = aweme;
        C869590Y9l c869590Y9l = new C869590Y9l();
        c869590Y9l.setConversationId(this.LL.getConversationId());
        Long lLJIILIIL = C2095008Iq.LJIILIIL(str2);
        if (lLJIILIIL != null) {
            jLongValue = lLJIILIIL.longValue();
        } else {
            jLongValue = 0;
        }
        c869590Y9l.setSender(jLongValue);
        if ((awemeLIZ != null || (awemeLIZ = C327340CsO.LIZ(str)) != null) && (iAwemeImManager = (IAwemeImManager) PluggableExtentionKt.pluggableSpi$default(IAwemeImManager.class, false, false, false, 14, null)) != null && (proxy = iAwemeImManager.getProxy()) != null) {
            C0ZUM.LIZ(proxy, this.LL.getConversationId(), c869590Y9l, awemeLIZ, Boolean.FALSE, Collections.singletonList(c869590Y9l));
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("aweme://aweme/detail/");
        sbLIZ.append(str);
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, C2188811AlT.LIZIZ(sbLIZ));
        if (C1606640ruY.LIZIZ(C0ZUL.SMART_ROUTER)) {
            if (C1606640ruY.LIZLLL()) {
                smartRouteBuildRoute.withParam("use_saf", 1);
                smartRouteBuildRoute.withParam("im_chat_to_detail_saf", true);
            } else if (C1606640ruY.LJ()) {
                smartRouteBuildRoute.withParam("use_saf", 2);
                smartRouteBuildRoute.withParam("im_chat_to_detail_saf", true);
            }
        }
        smartRouteBuildRoute.withParam("refer", "chat");
        smartRouteBuildRoute.withParam("video_from", "from_chat");
        if (enumC461080I6g == EnumC461080I6g.RECENT_ACTIVITY_POST) {
            str4 = "activity_post_card";
        } else {
            str4 = "activity_repost_card";
        }
        smartRouteBuildRoute.withParam("enter_method", str4);
        smartRouteBuildRoute.withParam("to_uid", str2);
        smartRouteBuildRoute.withParam("key_from_chat_room_playing", true);
        smartRouteBuildRoute.withParam("key_from_chat_room_real_aid", str);
        smartRouteBuildRoute.withParam("conversation_id", this.LL.getConversationId());
        smartRouteBuildRoute.withParam("chatroom_session_uuid", this.LL.getUuid());
        smartRouteBuildRoute.open();
    }
}
