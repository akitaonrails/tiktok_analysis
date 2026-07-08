package com.ss.android.ugc.aweme.analytics;

import X.AbstractC1711506n3;
import X.C0I0B;
import X.C0YSQ;
import X.C0ZDX;
import X.C1530005ys;
import X.C2097608Jq;
import X.C23250099c;
import X.C453750Hqn;
import X.C817503Hh;
import X.C830490Whz;
import X.C869590Y9l;
import X.C892250YzP;
import X.C893510Z3l;
import X.C893520Z3m;
import X.C893530Z3n;
import X.C893580Z3s;
import X.C909290Zln;
import X.InterfaceC1493105sv;
import X.InterfaceC876950Yaj;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.messagelist.api.IIMMessageAdapterAnalytics;
import com.ss.android.ugc.aweme.im.service.analytics.IIMAnalyticsUtil;
import com.ss.android.ugc.aweme.im.service.analytics.IIMMessageAnalytics;
import com.ss.android.ugc.aweme.im.service.analytics.IMessageAnalyticsUtils;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
public final class IMMessageAdapterAnalytics implements IIMMessageAdapterAnalytics {
    public static String LJIILLIIL(C869590Y9l c869590Y9l) {
        String strLJIIIIZZ;
        IIMMessageAnalytics.LIZ.getClass();
        IIMMessageAnalytics iIMMessageAnalyticsLIZ = C893510Z3l.LIZ();
        if (iIMMessageAnalyticsLIZ != null) {
            strLJIIIIZZ = iIMMessageAnalyticsLIZ.LJIIIIZZ(c869590Y9l);
        } else {
            strLJIIIIZZ = null;
        }
        if (strLJIIIIZZ == null) {
            strLJIIIIZZ = "";
        }
        if (strLJIIIIZZ.length() == 0) {
            int conversationType = c869590Y9l.getConversationType();
            if (conversationType == AbstractC1711506n3.LIZIZ) {
                return "group";
            }
            if (conversationType != AbstractC1711506n3.LIZ) {
                return "";
            }
            return "private";
        }
        return strLJIIIIZZ;
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.IIMMessageAdapterAnalytics
    public final void LJIILJJIL(C869590Y9l c869590Y9l) {
        LJIILIIL(c869590Y9l, C0I0B.LJFF.LIZIZ(), null);
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.IIMMessageAdapterAnalytics
    public final void LIZIZ(C869590Y9l c869590Y9l, InterfaceC1493105sv interfaceC1493105sv) {
        String strLJ;
        if (c869590Y9l == null) {
            return;
        }
        C830490Whz c830490Whz = new C830490Whz();
        c830490Whz.put("enter_from", "chat");
        c830490Whz.put("enter_method", "swipe_to_reply");
        c830490Whz.put("chat_type", LJIILLIIL(c869590Y9l));
        String strLIZJ = C453750Hqn.LIZJ(c869590Y9l);
        if (strLIZJ != null) {
            c830490Whz.put("sticker_type", strLIZJ);
        }
        String strLIZIZ = C453750Hqn.LIZIZ(c869590Y9l);
        if (strLIZIZ != null) {
            c830490Whz.put("sticker_id", strLIZIZ);
        }
        String conversationId = c869590Y9l.getConversationId();
        conversationId.toString();
        c830490Whz.put("conversation_id", conversationId);
        IMessageAnalyticsUtils.LIZ.getClass();
        IMessageAnalyticsUtils iMessageAnalyticsUtilsLIZ = C892250YzP.LIZ();
        if (iMessageAnalyticsUtilsLIZ == null || (strLJ = iMessageAnalyticsUtilsLIZ.LJ(c869590Y9l)) == null) {
            strLJ = "";
        }
        c830490Whz.put("message_type", strLJ);
        interfaceC1493105sv.sendEvent("click_reply_button", c830490Whz);
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.IIMMessageAdapterAnalytics
    public final void LJ(String str, InterfaceC1493105sv interfaceC1493105sv) {
        C830490Whz c830490Whz = new C830490Whz();
        c830490Whz.put("enter_from", "chat");
        c830490Whz.put("prop_id", str);
        interfaceC1493105sv.sendEvent("enter_prop_detail", c830490Whz);
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.IIMMessageAdapterAnalytics
    public final void LJIIIZ(C869590Y9l c869590Y9l, InterfaceC1493105sv interfaceC1493105sv) {
        C23250099c.LIZLLL(C817503Hh.LL, null, null, new C893530Z3n(c869590Y9l, interfaceC1493105sv, "click", null), 3);
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.IIMMessageAdapterAnalytics
    public final void LJIIJ(int i, InterfaceC1493105sv interfaceC1493105sv) {
        C830490Whz c830490Whz = new C830490Whz();
        c830490Whz.put("current_size", String.valueOf(i));
        interfaceC1493105sv.sendEvent("message_list_load_more", c830490Whz);
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.IIMMessageAdapterAnalytics
    public final void LJIIL(C869590Y9l c869590Y9l, InterfaceC1493105sv interfaceC1493105sv) {
        String strLIZ;
        String strLJ;
        if (c869590Y9l == null) {
            return;
        }
        C830490Whz c830490Whz = new C830490Whz();
        c830490Whz.put("enter_from", "chat");
        IIMAnalyticsUtil.LIZ.getClass();
        IIMAnalyticsUtil iIMAnalyticsUtilLIZ = C893580Z3s.LIZ();
        if (iIMAnalyticsUtilLIZ != null) {
            strLIZ = iIMAnalyticsUtilLIZ.LIZ(c869590Y9l.getConversationId());
        } else {
            strLIZ = null;
        }
        String str = "";
        if (strLIZ == null) {
            strLIZ = "";
        }
        c830490Whz.put("chat_type", strLIZ);
        String conversationId = c869590Y9l.getConversationId();
        conversationId.toString();
        c830490Whz.put("conversation_id", conversationId);
        IMessageAnalyticsUtils.LIZ.getClass();
        IMessageAnalyticsUtils iMessageAnalyticsUtilsLIZ = C892250YzP.LIZ();
        if (iMessageAnalyticsUtilsLIZ != null && (strLJ = iMessageAnalyticsUtilsLIZ.LJ(c869590Y9l)) != null) {
            str = strLJ;
        }
        c830490Whz.put("message_type", str);
        interfaceC1493105sv.sendEvent("show_reply_button", c830490Whz);
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.IIMMessageAdapterAnalytics
    public final void LJIILL(C869590Y9l c869590Y9l, InterfaceC1493105sv interfaceC1493105sv) {
        String strLJ;
        if (c869590Y9l == null) {
            return;
        }
        C830490Whz c830490Whz = new C830490Whz();
        c830490Whz.put("enter_from", "chat");
        c830490Whz.put("enter_method", "reply");
        c830490Whz.put("chat_type", LJIILLIIL(c869590Y9l));
        String conversationId = c869590Y9l.getConversationId();
        conversationId.toString();
        c830490Whz.put("conversation_id", conversationId);
        IMessageAnalyticsUtils.LIZ.getClass();
        IMessageAnalyticsUtils iMessageAnalyticsUtilsLIZ = C892250YzP.LIZ();
        if (iMessageAnalyticsUtilsLIZ == null || (strLJ = iMessageAnalyticsUtilsLIZ.LJ(c869590Y9l)) == null) {
            strLJ = "";
        }
        c830490Whz.put("message_type", strLJ);
        interfaceC1493105sv.sendEvent("click_reply_button", c830490Whz);
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.IIMMessageAdapterAnalytics
    public final void LIZJ(IMUser iMUser, InterfaceC1493105sv interfaceC1493105sv, String str) {
        LJIIZILJ(iMUser, "click_head", "private", str, null, null, interfaceC1493105sv);
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.IIMMessageAdapterAnalytics
    public final void LJIIJJI(String str, String str2, InterfaceC1493105sv interfaceC1493105sv) {
        C830490Whz c830490Whz = new C830490Whz();
        c830490Whz.put("author_id", str);
        c830490Whz.put("message_id", str2);
        c830490Whz.put("message_type", "picture");
        interfaceC1493105sv.sendEvent("click_in_message", c830490Whz);
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.IIMMessageAdapterAnalytics
    public final void LJIILIIL(C869590Y9l c869590Y9l, InterfaceC1493105sv interfaceC1493105sv, String str) {
        if (c869590Y9l == null) {
            return;
        }
        C23250099c.LIZLLL(C817503Hh.LL, null, null, new C893520Z3m(c869590Y9l, interfaceC1493105sv, str, null), 3);
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.IIMMessageAdapterAnalytics
    public final void LIZ(IMUser iMUser, C909290Zln c909290Zln, String str, InterfaceC1493105sv interfaceC1493105sv) {
        String str2;
        int chatType = c909290Zln.getChatType();
        if (chatType != 1) {
            if (chatType != 3) {
                str2 = "private";
            } else {
                str2 = "group_chat";
            }
        } else {
            str2 = "stranger";
        }
        LJIIZILJ(iMUser, "button", str2, str, c909290Zln.getUuid(), c909290Zln.getConversationId(), interfaceC1493105sv);
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.IIMMessageAdapterAnalytics
    public final void LJI(boolean z, boolean z2, int i, boolean z3, InterfaceC1493105sv interfaceC1493105sv) {
        Object obj;
        Object obj2;
        C830490Whz c830490Whz = new C830490Whz();
        c830490Whz.put("enter_from", "chat");
        String str = "1";
        if (z) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        c830490Whz.put("is_video_cache", obj);
        if (z2) {
            obj2 = "1";
        } else {
            obj2 = CardStruct.IStatusCode.DEFAULT;
        }
        c830490Whz.put("has_aweme", obj2);
        c830490Whz.put("tag_type", String.valueOf(i));
        if (!z3) {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        c830490Whz.put("is_requesting", str);
        interfaceC1493105sv.sendEvent("im_open_aweme_video", c830490Whz);
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.IIMMessageAdapterAnalytics
    public final void LJII(String str, String str2, String str3, String str4, InterfaceC1493105sv interfaceC1493105sv) {
        C830490Whz c830490Whz = new C830490Whz();
        c830490Whz.put("to_user_id", str2);
        c830490Whz.put("conversation_id", str3);
        c830490Whz.put("enter_from", "chat");
        c830490Whz.put("tag_id", str);
        c830490Whz.put("process_id", str4);
        interfaceC1493105sv.sendEvent("enter_tag_detail", c830490Whz);
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.IIMMessageAdapterAnalytics
    public final void LJIIIIZZ(String str, String str2, String str3, String str4, InterfaceC1493105sv interfaceC1493105sv) {
        C830490Whz c830490Whz = new C830490Whz();
        c830490Whz.put("to_user_id", str2);
        c830490Whz.put("conversation_id", str3);
        c830490Whz.put("enter_method", "chat_click");
        c830490Whz.put("enter_from", "chat");
        c830490Whz.put("music_id", str);
        c830490Whz.put("process_id", str4);
        interfaceC1493105sv.sendEvent("enter_music_detail", c830490Whz);
    }

    public static void LJIIZILJ(IMUser iMUser, String str, String str2, String str3, String str4, String str5, InterfaceC1493105sv interfaceC1493105sv) {
        C830490Whz c830490Whz = new C830490Whz();
        if (iMUser != null) {
            c830490Whz.put("author_id", iMUser.getUid());
            c830490Whz.put("rec_type", iMUser.getRecType());
            c830490Whz.put("relation_tag", String.valueOf(iMUser.getFollowStatus()));
        }
        c830490Whz.put("object_type", "im");
        c830490Whz.put("enter_method", str);
        c830490Whz.put("enter_from", str3);
        c830490Whz.put("chat_type", str2);
        if (str4 != null && str4.length() > 0) {
            c830490Whz.put("process_id", str4);
        }
        if (str5 != null && str5.length() > 0) {
            c830490Whz.put("conversation_id", str5);
            c830490Whz.putAll(C1530005ys.LIZ(C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LIZ(str5)));
        }
        interfaceC1493105sv.sendEvent("click_report", c830490Whz);
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.IIMMessageAdapterAnalytics
    public final void LJFF(String str, String str2, String str3, String str4, C869590Y9l c869590Y9l, InterfaceC1493105sv interfaceC1493105sv, String str5) {
        String string;
        Map<String, String> mapLJ;
        List<Pair<String, String>> listLJIIIZ;
        C830490Whz c830490Whz = new C830490Whz();
        c830490Whz.put("author_id", str);
        c830490Whz.put("object_type", "im");
        c830490Whz.put("enter_method", str2);
        c830490Whz.put("enter_from", str3);
        if (c869590Y9l == null || (string = Long.valueOf(c869590Y9l.getMsgId()).toString()) == null) {
            string = "";
        }
        c830490Whz.put("server_message_id", string);
        String strLJ = null;
        if (str5 != null && str5.length() > 0) {
            c830490Whz.put("process_id", str5);
        }
        if (c869590Y9l != null) {
            String strLJIILJJIL = C0ZDX.LJIILJJIL(c869590Y9l);
            if (strLJIILJJIL != null) {
                c830490Whz.put("sticker_id", strLJIILJJIL);
            }
            c830490Whz.put("conversation_id", c869590Y9l.getConversationId());
            c830490Whz.putAll(C1530005ys.LIZ(C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LIZ(c869590Y9l.getConversationId())));
            IMessageAnalyticsUtils.LIZ.getClass();
            IMessageAnalyticsUtils iMessageAnalyticsUtilsLIZ = C892250YzP.LIZ();
            if (iMessageAnalyticsUtilsLIZ == null || (mapLJ = iMessageAnalyticsUtilsLIZ.LIZ(c869590Y9l)) == null) {
                mapLJ = C2097608Jq.LJ();
            }
            c830490Whz.putAll(mapLJ);
            String str6 = mapLJ.get("business_scenario");
            if (str6 != null && str6.length() > 0) {
                c830490Whz.put("dm_business_scenario", str6);
            }
            String str7 = mapLJ.get("business_source");
            if (str7 != null && str7.length() > 0) {
                c830490Whz.put("dm_business_source", str7);
            }
            IMessageAnalyticsUtils iMessageAnalyticsUtilsLIZ2 = C892250YzP.LIZ();
            if (iMessageAnalyticsUtilsLIZ2 != null) {
                strLJ = iMessageAnalyticsUtilsLIZ2.LJ(c869590Y9l);
            }
            if (Intrinsics.LJFF(c869590Y9l.getScene(), "aimoji_sticker")) {
                strLJ = "aimoji";
            }
            c830490Whz.put("message_type", strLJ);
            IMessageAnalyticsUtils iMessageAnalyticsUtilsLIZ3 = C892250YzP.LIZ();
            if (iMessageAnalyticsUtilsLIZ3 != null && (listLJIIIZ = iMessageAnalyticsUtilsLIZ3.LJIIIZ(c869590Y9l)) != null) {
                for (Pair<String, String> pair : listLJIIIZ) {
                    c830490Whz.put(pair.getFirst(), pair.getSecond());
                }
            }
        }
        if (str4 != null && str4.length() != 0) {
            c830490Whz.put("chat_type", str4);
        }
        interfaceC1493105sv.sendEvent("click_report", c830490Whz);
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.IIMMessageAdapterAnalytics
    public final void LIZLLL(String str, String str2, boolean z, String str3, String str4, String str5, String str6, String str7, InterfaceC1493105sv interfaceC1493105sv) {
        String str8;
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        C830490Whz c830490Whz = new C830490Whz();
        c830490Whz.put("enter_from", "chat");
        c830490Whz.put("live_event_id", str2);
        if (z) {
            str8 = CardStruct.IStatusCode.DEFAULT;
        } else {
            str8 = "1";
        }
        c830490Whz.put("is_free_event", str8);
        c830490Whz.put("live_event_cnt", String.valueOf(1));
        c830490Whz.put("action_type", "click");
        c830490Whz.put("event_page", str5);
        c830490Whz.put("conversation_id", str6);
        c830490Whz.put("is_multi_event", CardStruct.IStatusCode.DEFAULT);
        c830490Whz.put("live_event_type", str4);
        c830490Whz.put("main_live_event_id", str3);
        c830490Whz.put("anchor_id", str7);
        interfaceC1493105sv.sendEvent(str, c830490Whz);
    }
}
