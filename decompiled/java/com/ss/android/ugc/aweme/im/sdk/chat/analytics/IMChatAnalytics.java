package com.ss.android.ugc.aweme.im.sdk.chat.analytics;

import X.AnonymousClass0629;
import X.C05RV;
import X.C0C64;
import X.C0Y8T;
import X.C0YNP;
import X.C0YSQ;
import X.C0ZCD;
import X.C1229100i5c;
import X.C1528505yd;
import X.C300850Bql;
import X.C461720I8s;
import X.C612090Nzb;
import X.C830490Whz;
import X.C890330YwJ;
import X.C909290Zln;
import X.InterfaceC1364105Vn;
import X.InterfaceC1493105sv;
import X.InterfaceC876950Yaj;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.im.ai.api.IMAIServiceAPI;
import com.ss.android.ugc.aweme.im.chatlist.api.IMChatListApi;
import com.ss.android.ugc.aweme.im.chatroom.api.IIMChatAnalytics;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.saas.host.api.im.inbox.IIMInboxService;
import com.ss.android.ugc.aweme.im.sdk.chat.utils.ChatRoomEventTrackingStore;
import com.ss.android.ugc.aweme.im.sdk.common.controller.analytics.IMAnalyticsUtil;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes15.dex */
public final class IMChatAnalytics implements IIMChatAnalytics {
    public static final IMChatAnalytics LIZIZ = new IMChatAnalytics();

    public static final class Service implements IIMChatAnalytics {
        public final /* synthetic */ IMChatAnalytics LIZIZ = IMChatAnalytics.LIZIZ;

        @Override // com.ss.android.ugc.aweme.im.chatroom.api.IIMChatAnalytics
        public final void LIZ(SessionInfo sessionInfo, InterfaceC1493105sv interfaceC1493105sv) {
            this.LIZIZ.LIZ(sessionInfo, interfaceC1493105sv);
        }

        @Override // com.ss.android.ugc.aweme.im.chatroom.api.IIMChatAnalytics
        public final void LIZIZ(String str, String str2, InterfaceC1493105sv interfaceC1493105sv) {
            this.LIZIZ.LIZIZ(str, str2, interfaceC1493105sv);
        }

        @Override // com.ss.android.ugc.aweme.im.chatroom.api.IIMChatAnalytics
        public final void LIZJ(String str, String str2, InterfaceC1493105sv interfaceC1493105sv) {
            this.LIZIZ.LIZJ(str, str2, interfaceC1493105sv);
        }

        @Override // com.ss.android.ugc.aweme.im.chatroom.api.IIMChatAnalytics
        public final void LIZLLL(C909290Zln c909290Zln, InterfaceC1493105sv interfaceC1493105sv) {
            this.LIZIZ.LIZLLL(c909290Zln, interfaceC1493105sv);
        }

        @Override // com.ss.android.ugc.aweme.im.chatroom.api.IIMChatAnalytics
        public final void LJ(InterfaceC1493105sv interfaceC1493105sv, Integer num, String str, String str2, String str3, String str4) {
            this.LIZIZ.LJ(interfaceC1493105sv, num, str, str2, str3, str4);
        }

        @Override // com.ss.android.ugc.aweme.im.chatroom.api.IIMChatAnalytics
        public final void LJFF(SessionInfo sessionInfo, InterfaceC1493105sv interfaceC1493105sv) {
            this.LIZIZ.LJFF(sessionInfo, interfaceC1493105sv);
        }

        @Override // com.ss.android.ugc.aweme.im.chatroom.api.IIMChatAnalytics
        public final Object LJI(String str, Map map, InterfaceC1364105Vn interfaceC1364105Vn) {
            return this.LIZIZ.LJI(str, map, interfaceC1364105Vn);
        }

        @Override // com.ss.android.ugc.aweme.im.chatroom.api.IIMChatAnalytics
        public final void LJII(String str, InterfaceC1493105sv interfaceC1493105sv) {
            this.LIZIZ.LJII(str, interfaceC1493105sv);
        }

        @Override // com.ss.android.ugc.aweme.im.chatroom.api.IIMChatAnalytics
        public final void LJIIIIZZ(InterfaceC1493105sv interfaceC1493105sv, Integer num, String str, String str2, String str3) {
            this.LIZIZ.LJIIIIZZ(interfaceC1493105sv, num, str, str2, str3);
        }
    }

    public static Map LJIIIZ(String str) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("conversation_id", str);
        linkedHashMap.put("chat_type", C1229100i5c.LIZLLL(str));
        linkedHashMap.put(Scene.SCENE_SERVICE, "go_live_reminder_guide");
        linkedHashMap.put("group_type", C1229100i5c.LJI(str));
        linkedHashMap.put("group_owner_account_type", C1528505yd.LIZ(C461720I8s.LIZIZ()));
        return linkedHashMap;
    }

    @Override // com.ss.android.ugc.aweme.im.chatroom.api.IIMChatAnalytics
    public final void LIZ(SessionInfo sessionInfo, InterfaceC1493105sv interfaceC1493105sv) {
        C830490Whz c830490Whz = new C830490Whz();
        c830490Whz.put("enter_from", IMAnalyticsUtil.LIZIZ.LIZLLL(sessionInfo));
        c830490Whz.put("action", "change_setting");
        IMChatListApi.LJJIII.getClass();
        c830490Whz.put("chat_type", C890330YwJ.LIZ().LIZIZ().LIZ(sessionInfo, false));
        interfaceC1493105sv.sendEvent("change_setting_toast_response", c830490Whz);
    }

    @Override // com.ss.android.ugc.aweme.im.chatroom.api.IIMChatAnalytics
    public final void LIZLLL(C909290Zln c909290Zln, InterfaceC1493105sv interfaceC1493105sv) {
        Object obj;
        String strValueOf;
        C05RV c05rvLIZJ;
        String str;
        String str2;
        C830490Whz c830490Whz = new C830490Whz();
        c830490Whz.put("enter_from", c909290Zln.getEnterFromForMob());
        IMChatListApi.LJJIII.getClass();
        c830490Whz.put("chat_type", C890330YwJ.LIZ().LIZIZ().LIZ(c909290Zln, true));
        String str3 = "1";
        if (c909290Zln.isRisky()) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        c830490Whz.put("is_filtered", obj);
        c830490Whz.putAll(ChatRoomEventTrackingStore.LIZIZ.LIZIZ(c909290Zln.getUuid()));
        c830490Whz.put("conversation_id", c909290Zln.getConversationId());
        C0Y8T c0y8tLIZ = C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LIZ(c909290Zln.getConversationId());
        if (c0y8tLIZ != null) {
            IMAIServiceAPI.LIZ.getClass();
            if (!AnonymousClass0629.LIZ().LIZ().LJIIIZ(c0y8tLIZ)) {
                str3 = CardStruct.IStatusCode.DEFAULT;
            }
            c830490Whz.put("is_ai_involve", str3);
        }
        IMUser fromUser = c909290Zln.getFromUser();
        if (fromUser == null || (strValueOf = fromUser.getUid()) == null) {
            strValueOf = String.valueOf(C0YNP.LJII(c909290Zln.getConversationId()));
        }
        c830490Whz.put("to_user_id", strValueOf);
        if (C0C64.LJIILLIIL().LJIJ(31744, 0, "im_message_request_on_device_prioritization", false) == 2) {
            IIMInboxService.LIZ.getClass();
            IIMInboxService value = C0ZCD.LIZIZ.getValue();
            if (value != null && (c05rvLIZJ = value.LIZJ()) != null && c05rvLIZJ == C05RV.PRO_CREATOR_INBOX) {
                if (C300850Bql.LIZ() && !C612090Nzb.LIZ()) {
                    str = "client";
                } else {
                    str = "server";
                }
                c830490Whz.put("score_source", str);
                Map<String, String> extraMobParams = c909290Zln.getExtraMobParams();
                if (extraMobParams == null || (str2 = extraMobParams.get("chat_section")) == null) {
                    str2 = "";
                }
                c830490Whz.put("chat_section", str2);
            }
        }
        interfaceC1493105sv.sendEvent("receive_message_request_show", c830490Whz);
    }

    @Override // com.ss.android.ugc.aweme.im.chatroom.api.IIMChatAnalytics
    public final void LJFF(SessionInfo sessionInfo, InterfaceC1493105sv interfaceC1493105sv) {
        C830490Whz c830490Whz = new C830490Whz();
        c830490Whz.put("enter_from", IMAnalyticsUtil.LIZIZ.LIZLLL(sessionInfo));
        IMChatListApi.LJJIII.getClass();
        c830490Whz.put("chat_type", C890330YwJ.LIZ().LIZIZ().LIZ(sessionInfo, false));
        interfaceC1493105sv.sendEvent("change_setting_toast_show", c830490Whz);
    }

    @Override // com.ss.android.ugc.aweme.im.chatroom.api.IIMChatAnalytics
    public final void LJII(String str, InterfaceC1493105sv interfaceC1493105sv) {
        if (str == null) {
            str = "";
        }
        interfaceC1493105sv.sendEvent("ttsocial_chat_guide_card_show", LJIIIZ(str));
    }

    @Override // com.ss.android.ugc.aweme.im.chatroom.api.IIMChatAnalytics
    public final void LIZIZ(String str, String str2, InterfaceC1493105sv interfaceC1493105sv) {
        C830490Whz c830490Whz = new C830490Whz();
        c830490Whz.put("conversation_id", str);
        c830490Whz.put("to_user_id", str2);
        c830490Whz.put("chat_type", "private");
        interfaceC1493105sv.sendEvent("chat_setting_click", c830490Whz);
    }

    @Override // com.ss.android.ugc.aweme.im.chatroom.api.IIMChatAnalytics
    public final void LIZJ(String str, String str2, InterfaceC1493105sv interfaceC1493105sv) {
        if (str == null) {
            str = "";
        }
        Map<String, String> mapLJIIIZ = LJIIIZ(str);
        if (str2 == null) {
            str2 = "";
        }
        mapLJIIIZ.put("button_name", str2);
        interfaceC1493105sv.sendEvent("ttsocial_chat_guide_card_click", mapLJIIIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0153  */
    @Override // com.ss.android.ugc.aweme.im.chatroom.api.IIMChatAnalytics
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJI(java.lang.String r10, java.util.Map r11, X.InterfaceC1364105Vn r12) {
        /*
            Method dump skipped, instruction units count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.chat.analytics.IMChatAnalytics.LJI(java.lang.String, java.util.Map, X.05Vn):java.lang.Object");
    }

    @Override // com.ss.android.ugc.aweme.im.chatroom.api.IIMChatAnalytics
    public final void LJIIIIZZ(InterfaceC1493105sv interfaceC1493105sv, Integer num, String str, String str2, String str3) {
        String str4;
        String string;
        if (str3 == null) {
            str3 = String.valueOf(System.currentTimeMillis());
        }
        C830490Whz c830490Whz = new C830490Whz();
        c830490Whz.put("to_user_id", str);
        c830490Whz.put("enter_from", "chat_settings");
        c830490Whz.put("enter_method", str2);
        c830490Whz.put("profile_entrance_id", str3);
        if (num != null && (string = num.toString()) != null) {
            c830490Whz.put("relation_tag", string);
        }
        if (C461720I8s.LJI(str)) {
            str4 = "1";
        } else {
            str4 = CardStruct.IStatusCode.DEFAULT;
        }
        c830490Whz.put("is_self", str4);
        interfaceC1493105sv.sendEvent("enter_personal_detail", c830490Whz);
    }

    @Override // com.ss.android.ugc.aweme.im.chatroom.api.IIMChatAnalytics
    public final void LJ(InterfaceC1493105sv interfaceC1493105sv, Integer num, String str, String str2, String str3, String str4) {
        String str5;
        String string;
        if (str4 == null) {
            str4 = String.valueOf(System.currentTimeMillis());
        }
        C830490Whz c830490Whz = new C830490Whz();
        c830490Whz.put("to_user_id", str);
        c830490Whz.put("enter_from", str2);
        c830490Whz.put("enter_method", str3);
        c830490Whz.put("profile_entrance_id", str4);
        if (num != null && (string = num.toString()) != null) {
            c830490Whz.put("follow_status", string);
        }
        if (C461720I8s.LJI(str)) {
            str5 = "1";
        } else {
            str5 = CardStruct.IStatusCode.DEFAULT;
        }
        c830490Whz.put("is_self", str5);
        interfaceC1493105sv.sendEvent("enter_personal_detail", c830490Whz);
    }
}
