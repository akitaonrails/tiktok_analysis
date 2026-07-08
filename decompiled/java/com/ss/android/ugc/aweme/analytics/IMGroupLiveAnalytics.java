package com.ss.android.ugc.aweme.analytics;

import X.C0Y8T;
import X.C2344009Gk;
import X.C830490Whz;
import X.C866950Xzh;
import X.InterfaceC1493105sv;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.im.sdk.chatdetail.analytics.IMGroupChatDetailAnalytics;
import com.ss.android.ugc.aweme.im.service.analytics.IIMGroupLiveAnalytics;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes33.dex */
public final class IMGroupLiveAnalytics implements IIMGroupLiveAnalytics {
    public static final IMGroupLiveAnalytics LIZ = new IMGroupLiveAnalytics();

    public static final class Service implements IIMGroupLiveAnalytics {
        public final /* synthetic */ IMGroupLiveAnalytics LIZ = IMGroupLiveAnalytics.LIZ;

        @Override // com.ss.android.ugc.aweme.im.service.analytics.IIMGroupLiveAnalytics
        public final void LIZ(InterfaceC1493105sv interfaceC1493105sv, Integer num, String str, String str2) {
            this.LIZ.LIZ(interfaceC1493105sv, num, str, str2);
        }

        @Override // com.ss.android.ugc.aweme.im.service.analytics.IIMGroupLiveAnalytics
        public final void LIZIZ(String str, String str2, String str3, InterfaceC1493105sv interfaceC1493105sv) {
            this.LIZ.LIZIZ(str, str2, str3, interfaceC1493105sv);
        }

        @Override // com.ss.android.ugc.aweme.im.service.analytics.IIMGroupLiveAnalytics
        public final void LIZJ(InterfaceC1493105sv interfaceC1493105sv, Integer num, String str, String str2, String str3) {
            this.LIZ.LIZJ(interfaceC1493105sv, num, str, str2, str3);
        }

        @Override // com.ss.android.ugc.aweme.im.service.analytics.IIMGroupLiveAnalytics
        public final void LIZLLL(InterfaceC1493105sv interfaceC1493105sv, Integer num, String str, String str2, String str3) {
            this.LIZ.LIZLLL(interfaceC1493105sv, num, str, str2, str3);
        }

        @Override // com.ss.android.ugc.aweme.im.service.analytics.IIMGroupLiveAnalytics
        public final void LJ(String str, String str2, String str3, String str4, HashMap map, InterfaceC1493105sv interfaceC1493105sv) {
            this.LIZ.LJ(str, str2, str3, str4, map, interfaceC1493105sv);
        }

        @Override // com.ss.android.ugc.aweme.im.service.analytics.IIMGroupLiveAnalytics
        public final void LJFF(String str, String str2, boolean z, Integer num, boolean z2, String str3, InterfaceC1493105sv interfaceC1493105sv) {
            this.LIZ.LJFF(str, str2, z, num, z2, str3, interfaceC1493105sv);
        }

        @Override // com.ss.android.ugc.aweme.im.service.analytics.IIMGroupLiveAnalytics
        public final void LJI(InterfaceC1493105sv interfaceC1493105sv, Integer num, String str, String str2) {
            this.LIZ.LJI(interfaceC1493105sv, num, str, str2);
        }

        @Override // com.ss.android.ugc.aweme.im.service.analytics.IIMGroupLiveAnalytics
        public final void LJII(String str, String str2, Integer num, InterfaceC1493105sv interfaceC1493105sv) {
            this.LIZ.LJII(str, str2, num, interfaceC1493105sv);
        }

        @Override // com.ss.android.ugc.aweme.im.service.analytics.IIMGroupLiveAnalytics
        public final void LJIIIIZZ(C0Y8T c0y8t, List list, String str, String str2, HashMap map, InterfaceC1493105sv interfaceC1493105sv) {
            this.LIZ.LJIIIIZZ(c0y8t, list, str, str2, map, interfaceC1493105sv);
        }

        @Override // com.ss.android.ugc.aweme.im.service.analytics.IIMGroupLiveAnalytics
        public final void LJIIIZ(String str, String str2, Integer num, String str3, String str4, InterfaceC1493105sv interfaceC1493105sv) {
            this.LIZ.LJIIIZ(str, str2, num, str3, str4, interfaceC1493105sv);
        }

        @Override // com.ss.android.ugc.aweme.im.service.analytics.IIMGroupLiveAnalytics
        public final void LJIIJ(String str, String str2, boolean z, String str3, String str4, boolean z2, Integer num, Integer num2, Integer num3, InterfaceC1493105sv interfaceC1493105sv) {
            this.LIZ.LJIIJ(str, str2, z, str3, str4, z2, num, num2, num3, interfaceC1493105sv);
        }

        @Override // com.ss.android.ugc.aweme.im.service.analytics.IIMGroupLiveAnalytics
        public final void LJIIJJI(String str, String str2, boolean z, Integer num, Integer num2, Integer num3, String str3, String str4, String str5, InterfaceC1493105sv interfaceC1493105sv) {
            this.LIZ.LJIIJJI(str, str2, z, num, num2, num3, str3, str4, str5, interfaceC1493105sv);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.service.analytics.IIMGroupLiveAnalytics
    public final void LIZ(InterfaceC1493105sv interfaceC1493105sv, Integer num, String str, String str2) {
        String string;
        C830490Whz c830490Whz = new C830490Whz();
        c830490Whz.put("from_uid", str);
        if (num != null) {
            string = num.toString();
        } else {
            string = null;
        }
        c830490Whz.put("follow_status", string);
        c830490Whz.put("result", null);
        c830490Whz.put("chat_group_id", str2);
        interfaceC1493105sv.sendEvent("livesdk_chat_group_click_share_pop", c830490Whz);
    }

    @Override // com.ss.android.ugc.aweme.im.service.analytics.IIMGroupLiveAnalytics
    public final void LIZIZ(String str, String str2, String str3, InterfaceC1493105sv interfaceC1493105sv) {
        C830490Whz c830490Whz = new C830490Whz();
        c830490Whz.put("action_type", str);
        c830490Whz.put("chat_group_id", str2);
        c830490Whz.put("anchor_id", str3);
        interfaceC1493105sv.sendEvent("livesdk_chat_multi_live_card", c830490Whz);
    }

    @Override // com.ss.android.ugc.aweme.im.service.analytics.IIMGroupLiveAnalytics
    public final void LJI(InterfaceC1493105sv interfaceC1493105sv, Integer num, String str, String str2) {
        String string;
        C830490Whz c830490Whz = new C830490Whz();
        c830490Whz.put("from_uid", str);
        if (num != null) {
            string = num.toString();
        } else {
            string = null;
        }
        c830490Whz.put("follow_status", string);
        c830490Whz.put("chat_group_id", str2);
        interfaceC1493105sv.sendEvent("livesdk_chat_group_click_share_card", c830490Whz);
    }

    @Override // com.ss.android.ugc.aweme.im.service.analytics.IIMGroupLiveAnalytics
    public final void LJII(String str, String str2, Integer num, InterfaceC1493105sv interfaceC1493105sv) {
        String string;
        C830490Whz c830490Whz = new C830490Whz();
        c830490Whz.put("room_id", str);
        c830490Whz.put("is_chat_live", "1");
        c830490Whz.put("chat_group_id", str2);
        if (num != null) {
            string = num.toString();
        } else {
            string = null;
        }
        c830490Whz.put("choose_user_num", string);
        interfaceC1493105sv.sendEvent("livesdk_invite_guest_chat_user_num_limit_toast", c830490Whz);
    }

    @Override // com.ss.android.ugc.aweme.im.service.analytics.IIMGroupLiveAnalytics
    public final void LIZJ(InterfaceC1493105sv interfaceC1493105sv, Integer num, String str, String str2, String str3) {
        String string;
        C830490Whz c830490Whz = new C830490Whz();
        c830490Whz.put("enter_from_merge", "chat");
        c830490Whz.put("enter_method", "action_bar");
        c830490Whz.put("chat_group_id", str);
        c830490Whz.put("chat_group_owner_uid", str2);
        if (num != null) {
            string = num.toString();
        } else {
            string = null;
        }
        c830490Whz.put("chat_group_user_num", string);
        if (str3 != null) {
            c830490Whz.put("room_id", str3);
        }
        interfaceC1493105sv.sendEvent("livesdk_live_show", c830490Whz);
    }

    @Override // com.ss.android.ugc.aweme.im.service.analytics.IIMGroupLiveAnalytics
    public final void LIZLLL(InterfaceC1493105sv interfaceC1493105sv, Integer num, String str, String str2, String str3) {
        String string;
        C830490Whz c830490Whz = new C830490Whz();
        c830490Whz.put("action_type", str);
        c830490Whz.put("button_type", str2);
        c830490Whz.put("chat_group_id", str3);
        if (num != null) {
            string = num.toString();
        } else {
            string = null;
        }
        c830490Whz.put("click_cnt", string);
        interfaceC1493105sv.sendEvent("livesdk_chat_multi_live_confirm_pop", c830490Whz);
    }

    @Override // com.ss.android.ugc.aweme.im.service.analytics.IIMGroupLiveAnalytics
    public final void LJ(String str, String str2, String str3, String str4, HashMap map, InterfaceC1493105sv interfaceC1493105sv) {
        C830490Whz c830490Whz = new C830490Whz();
        c830490Whz.put("enter_from", "live_endpage");
        Object obj = str;
        if (str == null) {
            if (map != null) {
                obj = map.get("room_id");
            } else {
                obj = null;
            }
        }
        c830490Whz.put("room_id", obj);
        c830490Whz.put("chat_group_id", str2);
        c830490Whz.put("enter_user_id", str4);
        c830490Whz.put("anchor_id", str3);
        interfaceC1493105sv.sendEvent("livesdk_join_group_chat", c830490Whz);
    }

    @Override // com.ss.android.ugc.aweme.im.service.analytics.IIMGroupLiveAnalytics
    public final void LJIIIIZZ(C0Y8T c0y8t, List list, String str, String str2, HashMap map, InterfaceC1493105sv interfaceC1493105sv) {
        int memberCount;
        String conversationId;
        String str3;
        String str4;
        if (c0y8t != null) {
            memberCount = c0y8t.getMemberCount();
        } else {
            memberCount = 0;
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", "live_endpage");
        c2344009Gk.LIZJ(memberCount, "chat_num");
        c2344009Gk.LJIIIIZZ("type", "group");
        String str5 = null;
        if (c0y8t != null) {
            conversationId = c0y8t.getConversationId();
        } else {
            conversationId = null;
        }
        c2344009Gk.LJIIIIZZ("chat_group_id", conversationId);
        c2344009Gk.LIZJ(0, "error_code");
        c2344009Gk.LJIIIIZZ("chat_type", "group");
        c2344009Gk.LJIIIIZZ("version", str);
        c2344009Gk.LJIIIIZZ("enter_method", str2);
        if (map != null) {
            str3 = (String) map.get("room_id");
        } else {
            str3 = null;
        }
        c2344009Gk.LJIIIIZZ("room_id", str3);
        if (map != null) {
            str4 = (String) map.get("invitation_wait_num");
        } else {
            str4 = null;
        }
        c2344009Gk.LJIIIIZZ("invitation_wait_num", str4);
        if (map != null) {
            str5 = (String) map.get("invitation_wait_to_user_id_set");
        }
        c2344009Gk.LJIIIIZZ("invitation_wait_to_user_id_set", str5);
        if (C866950Xzh.LIZIZ(list) && list != null) {
            c2344009Gk.LJFF("to_user_id_set", IMGroupChatDetailAnalytics.LJIIJ(list));
        }
        interfaceC1493105sv.sendEvent("livesdk_create_chat", c2344009Gk.LIZ);
    }

    @Override // com.ss.android.ugc.aweme.im.service.analytics.IIMGroupLiveAnalytics
    public final void LJIIIZ(String str, String str2, Integer num, String str3, String str4, InterfaceC1493105sv interfaceC1493105sv) {
        String string;
        C830490Whz c830490Whz = new C830490Whz();
        c830490Whz.put("action_type", str);
        c830490Whz.put("chat_group_id", str2);
        c830490Whz.put("is_first_page", "1");
        if (num != null) {
            string = num.toString();
        } else {
            string = null;
        }
        c830490Whz.put("action_bar_order", string);
        c830490Whz.put("anchor_id", str3);
        c830490Whz.put("room_id", str4);
        interfaceC1493105sv.sendEvent("livesdk_chat_multi_action_bar_join", c830490Whz);
    }

    @Override // com.ss.android.ugc.aweme.im.service.analytics.IIMGroupLiveAnalytics
    public final void LJFF(String str, String str2, boolean z, Integer num, boolean z2, String str3, InterfaceC1493105sv interfaceC1493105sv) {
        Object obj;
        String string;
        C830490Whz c830490Whz = new C830490Whz();
        c830490Whz.put("action_type", str);
        c830490Whz.put("chat_group_id", str2);
        String str4 = "1";
        if (z) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        c830490Whz.put("is_first_page", obj);
        if (num != null) {
            string = num.toString();
        } else {
            string = null;
        }
        c830490Whz.put("action_bar_order", string);
        if (Intrinsics.LJFF(str, "click")) {
            if (!z2) {
                str4 = CardStruct.IStatusCode.DEFAULT;
            }
            c830490Whz.put("is_confirm_pop", str4);
        }
        c830490Whz.put("group_user_type", str3);
        interfaceC1493105sv.sendEvent("livesdk_chat_multi_action_bar_live", c830490Whz);
    }

    @Override // com.ss.android.ugc.aweme.im.service.analytics.IIMGroupLiveAnalytics
    public final void LJIIJ(String str, String str2, boolean z, String str3, String str4, boolean z2, Integer num, Integer num2, Integer num3, InterfaceC1493105sv interfaceC1493105sv) {
        Object obj;
        String string;
        String string2;
        C830490Whz c830490Whz = new C830490Whz();
        c830490Whz.put("room_id", str);
        c830490Whz.put("button_type", str2);
        String str5 = "1";
        if (z) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        c830490Whz.put("is_chat_live", obj);
        c830490Whz.put("chat_group_id", str3);
        c830490Whz.put("to_uid", str4);
        if (!z2) {
            str5 = CardStruct.IStatusCode.DEFAULT;
        }
        c830490Whz.put("is_friend", str5);
        String string3 = null;
        if (num != null) {
            string = num.toString();
        } else {
            string = null;
        }
        c830490Whz.put("rank", string);
        if (num2 != null) {
            string2 = num2.toString();
        } else {
            string2 = null;
        }
        c830490Whz.put("list_num", string2);
        if (num3 != null) {
            string3 = num3.toString();
        }
        c830490Whz.put("link_duration", string3);
        interfaceC1493105sv.sendEvent("livesdk_invite_guest_chat_select_guest_click", c830490Whz);
    }

    @Override // com.ss.android.ugc.aweme.im.service.analytics.IIMGroupLiveAnalytics
    public final void LJIIJJI(String str, String str2, boolean z, Integer num, Integer num2, Integer num3, String str3, String str4, String str5, InterfaceC1493105sv interfaceC1493105sv) {
        String str6;
        String string;
        String string2;
        C830490Whz c830490Whz = new C830490Whz();
        c830490Whz.put("action_type", "click");
        c830490Whz.put("room_id", str);
        c830490Whz.put("button_type", str2);
        if (z) {
            str6 = "1";
        } else {
            str6 = CardStruct.IStatusCode.DEFAULT;
        }
        c830490Whz.put("is_chat_live", str6);
        c830490Whz.put("chat_group_id", str5);
        String string3 = null;
        if (num != null) {
            string = num.toString();
        } else {
            string = null;
        }
        c830490Whz.put("list_num", string);
        if (num2 != null) {
            string2 = num2.toString();
        } else {
            string2 = null;
        }
        c830490Whz.put("to_uid_num", string2);
        if (num3 != null) {
            string3 = num3.toString();
        }
        c830490Whz.put("to_uid_friend_num", string3);
        c830490Whz.put("to_uid_list", str3);
        c830490Whz.put("to_uid_friend_list", str4);
        interfaceC1493105sv.sendEvent("livesdk_invite_guest_chat_select_guest_page", c830490Whz);
    }
}
