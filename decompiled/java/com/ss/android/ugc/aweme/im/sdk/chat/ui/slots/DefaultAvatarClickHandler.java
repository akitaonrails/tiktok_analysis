package com.ss.android.ugc.aweme.im.sdk.chat.ui.slots;

import X.AbstractC1387200mCc;
import X.C069P;
import X.C0I0B;
import X.C1388190mED;
import X.C1705506m5;
import X.C1906580ziK;
import X.C876890Yad;
import android.app.Activity;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.chatroom.api.IIMChatAnalytics;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.contacts.api.IMContactApi;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListAvatarClickAbility;
import com.ss.android.ugc.aweme.im.service.IAuthorSupporterHelper;
import com.ss.android.ugc.aweme.im.service.IDmHelper;
import com.ss.android.ugc.aweme.im.service.service.IIMAnonymousService;

/* JADX INFO: loaded from: classes15.dex */
public final class DefaultAvatarClickHandler implements MessageListAvatarClickAbility {
    public final SessionInfo LL;

    public DefaultAvatarClickHandler(SessionInfo sessionInfo) {
        this.LL = sessionInfo;
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListAvatarClickAbility
    public final void NW0(String str) {
        Activity activityLIZIZ;
        Activity activityLIZ;
        IIMAnonymousService iIMAnonymousService;
        IAuthorSupporterHelper iAuthorSupporterHelper;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (!this.LL.isAuthorSupporterChat() || ((iAuthorSupporterHelper = (IAuthorSupporterHelper) PluggableExtentionKt.pluggableSpi$default(IAuthorSupporterHelper.class, false, false, false, 14, null)) != null && iAuthorSupporterHelper.LIZJ())) {
            IMContactApi.LIZ.getClass();
            IMUser iMUserLJ = C069P.LIZ().LJ().LJ(str, null);
            if (iMUserLJ == null) {
                iMUserLJ = new IMUser();
                iMUserLJ.setUid(str);
                iMUserLJ.setFake(true);
            }
            IIMAnonymousService iIMAnonymousService2 = (IIMAnonymousService) PluggableExtentionKt.pluggableSpi$default(IIMAnonymousService.class, false, false, false, 14, null);
            if (iIMAnonymousService2 != null) {
                String conversationId = this.LL.getConversationId();
                String uid = iMUserLJ.getUid();
                if (uid == null) {
                    uid = "";
                }
                if (iIMAnonymousService2.LIZLLL(conversationId, uid, false)) {
                    AbstractC1387200mCc abstractC1387200mCcLIZIZ = C1906580ziK.LIZIZ();
                    if (abstractC1387200mCcLIZIZ != null && (activityLIZIZ = abstractC1387200mCcLIZIZ.LIZIZ()) != null && (activityLIZ = C1388190mED.LIZ(activityLIZIZ)) != null && (iIMAnonymousService = (IIMAnonymousService) PluggableExtentionKt.pluggableSpi$default(IIMAnonymousService.class, false, false, false, 14, null)) != null) {
                        iIMAnonymousService.LIZIZ(activityLIZ, "message_user_head", this.LL.getConversationId(), str);
                        return;
                    }
                    return;
                }
            }
            String str2 = "group_chat";
            if (this.LL.getChatType() == 3) {
                IDmHelper.LIZ.getClass();
                IDmHelper iDmHelperLIZ = C876890Yad.LIZ();
                if (iDmHelperLIZ != null) {
                    iDmHelperLIZ.LJIIIZ(str, "group_chat", null, null);
                }
            } else {
                IDmHelper.LIZ.getClass();
                IDmHelper iDmHelperLIZ2 = C876890Yad.LIZ();
                if (iDmHelperLIZ2 != null) {
                    iDmHelperLIZ2.LJIIIZ(str, null, this.LL.getEnterMethod(), this.LL.getConversationId());
                }
            }
            if (!this.LL.isGroupChat()) {
                str2 = "chat";
            }
            IIMChatAnalytics.LIZ.getClass();
            IIMChatAnalytics iIMChatAnalyticsLIZ = C1705506m5.LIZ();
            if (iIMChatAnalyticsLIZ != null) {
                iIMChatAnalyticsLIZ.LJ(C0I0B.LJFF.LIZIZ(), null, str, str2, "click_head", String.valueOf(System.currentTimeMillis()));
            }
        }
    }
}
