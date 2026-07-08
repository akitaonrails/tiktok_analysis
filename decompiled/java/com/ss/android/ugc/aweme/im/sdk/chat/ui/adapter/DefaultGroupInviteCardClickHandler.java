package com.ss.android.ugc.aweme.im.sdk.chat.ui.adapter;

import X.AbstractC1387200mCc;
import X.C0I0B;
import X.C0PEM;
import X.C0Y8T;
import X.C0YSQ;
import X.C0ZFW;
import X.C1231270i97;
import X.C1388190mED;
import X.C1618506Vj;
import X.C1906580ziK;
import X.C19EG;
import X.C2188811AlT;
import X.C23250099c;
import X.C259800zU;
import X.C869590Y9l;
import X.C897470ZIr;
import X.C900560ZUo;
import X.InterfaceC876950Yaj;
import X.InterfaceC900570ZUp;
import android.app.Activity;
import androidx.lifecycle.LifecycleOwnerKt;
import com.ss.android.ugc.aweme.IMGroupChatApi;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.message.content.GroupInfo;
import com.ss.android.ugc.aweme.im.message.content.GroupInviteCardContent;
import com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListGroupInviteCardClickAbility;
import java.util.Map;

/* JADX INFO: loaded from: classes15.dex */
public final class DefaultGroupInviteCardClickHandler implements MessageListGroupInviteCardClickAbility {
    public final SessionInfo LL;

    public DefaultGroupInviteCardClickHandler(SessionInfo sessionInfo) {
        this.LL = sessionInfo;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [T, com.ss.android.ugc.aweme.im.message.content.GroupInfo] */
    /* JADX WARN: Type inference failed for: r13v1, types: [T, com.ss.android.ugc.aweme.im.message.content.GroupInfo] */
    @Override // com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListGroupInviteCardClickAbility
    public final void lB1(C869590Y9l c869590Y9l, GroupInviteCardContent groupInviteCardContent) {
        Activity activityLIZ;
        C19EG c19eg;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        InterfaceC900570ZUp interfaceC900570ZUpLJJIIZI;
        Activity activityLIZIZ;
        C0Y8T c0y8tLIZ;
        C259800zU c259800zU = new C259800zU();
        ?? group = groupInviteCardContent.getGroup();
        c259800zU.element = group;
        if (group == 0 && (c0y8tLIZ = C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LIZ(this.LL.getConversationId())) != null) {
            ?? groupInfo = new GroupInfo(null, null, null, null, null, null, null, "");
            c259800zU.element = groupInfo;
            groupInfo.setConversationId(c0y8tLIZ.getConversationId());
            GroupInfo groupInfo2 = (GroupInfo) c259800zU.element;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("");
            sbLIZ.append(c0y8tLIZ.getConversationShortId());
            groupInfo2.setConversationShortId(C2188811AlT.LIZIZ(sbLIZ));
            if (c0y8tLIZ.getCoreInfo() != null) {
                ((GroupInfo) c259800zU.element).setAvatarUrl(c0y8tLIZ.getCoreInfo().getIcon());
            }
            ((GroupInfo) c259800zU.element).setGroupSize(Integer.valueOf(c0y8tLIZ.getMemberCount()));
            ((GroupInfo) c259800zU.element).setName(C0ZFW.LIZ.LJIIJ(c0y8tLIZ));
        }
        AbstractC1387200mCc abstractC1387200mCcLIZIZ = C1906580ziK.LIZIZ();
        if (abstractC1387200mCcLIZIZ != null && (activityLIZIZ = abstractC1387200mCcLIZIZ.LIZIZ()) != null) {
            activityLIZ = C1388190mED.LIZ(activityLIZIZ);
        } else {
            activityLIZ = null;
        }
        if ((activityLIZ instanceof C19EG) && (c19eg = (C19EG) activityLIZ) != null) {
            C1618506Vj c1618506Vj = IMGroupChatApi.LIZIZ;
            c1618506Vj.getClass();
            C1231270i97 value = C1618506Vj.LJ.getValue();
            String inviteId = groupInviteCardContent.getInviteId();
            long sender = c869590Y9l.getSender();
            GroupInfo groupInfo3 = (GroupInfo) c259800zU.element;
            String groupType = groupInviteCardContent.getGroupType();
            Map<String, String> eventExtra = groupInviteCardContent.getEventExtra();
            if (eventExtra != null) {
                str = eventExtra.get("a:et_group_type");
            } else {
                str = null;
            }
            String conversationId = this.LL.getConversationId();
            Map<String, String> eventExtra2 = groupInviteCardContent.getEventExtra();
            if (eventExtra2 == null || (str2 = eventExtra2.get("invite_event")) == null) {
                str2 = "send_group_inv";
            }
            Map<String, String> eventExtra3 = groupInviteCardContent.getEventExtra();
            if (eventExtra3 != null) {
                str3 = eventExtra3.get("invite_enter_from");
            } else {
                str3 = null;
            }
            Map<String, String> eventExtra4 = groupInviteCardContent.getEventExtra();
            if (eventExtra4 != null) {
                str4 = eventExtra4.get("invite_enter_method");
            } else {
                str4 = null;
            }
            Map<String, String> eventExtra5 = groupInviteCardContent.getEventExtra();
            if (eventExtra5 != null) {
                str5 = eventExtra5.get("join_member_label");
            } else {
                str5 = null;
            }
            Map<String, String> eventExtra6 = groupInviteCardContent.getEventExtra();
            if (eventExtra6 != null) {
                str6 = eventExtra6.get("join_member_type");
            } else {
                str6 = null;
            }
            value.LJ(c19eg, inviteId, sender, groupInfo3, groupType, str, conversationId, new C900560ZUo(str2, str3, str4, str5, str6));
            IMGroupChatApi iMGroupChatApiLIZ = c1618506Vj.LIZ();
            if (iMGroupChatApiLIZ != null && (interfaceC900570ZUpLJJIIZI = iMGroupChatApiLIZ.LJJIIZI()) != null) {
                interfaceC900570ZUpLJJIIZI.LIZ(this.LL, groupInviteCardContent, C0I0B.LJFF.LIZIZ());
            }
            C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(c19eg), C0PEM.LIZJ, null, new C897470ZIr(c869590Y9l, c259800zU, null), 2);
        }
    }
}
