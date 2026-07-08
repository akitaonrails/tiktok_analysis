package com.ss.android.ugc.aweme.im.sdk.chat.feature.replytosticker.analytics;

import X.C0I0B;
import X.C0Z2Z;
import X.C0ZDX;
import X.C13LP;
import X.C2095008Iq;
import X.C2097608Jq;
import X.C453520HqQ;
import X.C823170WQx;
import X.C869590Y9l;
import X.InterfaceC1493105sv;
import com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate;
import com.ss.android.ugc.aweme.im.message.template.component.BaseRequestComponent;
import com.ss.android.ugc.aweme.im.message.template.component.QueryDataComponent;
import com.ss.android.ugc.aweme.im.service.analytics.IIMEmojiAnalytics;
import com.ss.android.ugc.aweme.im.service.analytics.IReplyToStickerAnalytics;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes7.dex */
public final class ReplyToStickerAnalytics implements IReplyToStickerAnalytics {
    public static final ReplyToStickerAnalytics LIZIZ = new ReplyToStickerAnalytics();
    public static final C823170WQx<String> LIZJ = new C823170WQx<>();
    public static Map<String, String> LIZLLL;

    public static final class Service implements IReplyToStickerAnalytics {
        public final /* synthetic */ ReplyToStickerAnalytics LIZIZ = ReplyToStickerAnalytics.LIZIZ;

        @Override // com.ss.android.ugc.aweme.im.service.analytics.IReplyToStickerAnalytics
        public final void LIZ(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, InterfaceC1493105sv interfaceC1493105sv) {
            this.LIZIZ.LIZ(str, str2, str3, str4, str5, str6, str7, str8, interfaceC1493105sv);
        }

        @Override // com.ss.android.ugc.aweme.im.service.analytics.IReplyToStickerAnalytics
        public final void LIZIZ(InterfaceC1493105sv interfaceC1493105sv) {
            this.LIZIZ.LIZIZ(interfaceC1493105sv);
        }

        @Override // com.ss.android.ugc.aweme.im.service.analytics.IReplyToStickerAnalytics
        public final void LIZJ(String str) {
            this.LIZIZ.LIZJ(str);
        }
    }

    public static String LIZLLL(C869590Y9l c869590Y9l) {
        String strLIZ;
        BaseRequestComponent baseRequestComponentRj;
        QueryDataComponent queryDataComponent;
        Map<String, String> map;
        String str;
        if (c869590Y9l.getMsgType() == 5) {
            int i = C0ZDX.LIZJ;
            if (c869590Y9l.getMsgType() != 5) {
                return "";
            }
            String str2 = c869590Y9l.getExt().get("a:src");
            if (str2 != null) {
                return str2;
            }
            return "giphy";
        }
        BaseTemplate baseTemplateLIZ = C0Z2Z.LIZ(c869590Y9l, BaseTemplate.class);
        Integer numLJIIJJI = null;
        if (baseTemplateLIZ != null && (baseRequestComponentRj = baseTemplateLIZ.rj()) != null && (queryDataComponent = baseRequestComponentRj.queryData) != null && (map = queryDataComponent.extras) != null && (str = map.get("a:sticker_type")) != null) {
            numLJIIJJI = C2095008Iq.LJIIJJI(str);
        }
        IIMEmojiAnalytics.LIZ.getClass();
        IIMEmojiAnalytics iIMEmojiAnalyticsLIZ = C453520HqQ.LIZ();
        if (iIMEmojiAnalyticsLIZ != null && (strLIZ = iIMEmojiAnalyticsLIZ.LIZ(numLJIIJJI)) != null && strLIZ.length() > 0) {
            return strLIZ;
        }
        return "sticker";
    }

    @Override // com.ss.android.ugc.aweme.im.service.analytics.IReplyToStickerAnalytics
    public final void LIZIZ(InterfaceC1493105sv interfaceC1493105sv) {
        Map<String, String> map;
        C823170WQx<String> c823170WQx = LIZJ;
        if ((!c823170WQx.isEmpty()) && (map = LIZLLL) != null) {
            map.put("sticker_id_list", C13LP.LJJLIIIJ(c823170WQx, ",", null, null, 0, null, null, 62));
            interfaceC1493105sv.sendEvent("show_sticker_reply_suggestions_panel", map);
        }
        c823170WQx.clear();
        LIZLLL = null;
    }

    @Override // com.ss.android.ugc.aweme.im.service.analytics.IReplyToStickerAnalytics
    public final void LIZJ(String str) {
        LIZJ.add(str);
    }

    public final void LJ(String str, String str2, String str3, String str4, String str5, String str6) {
        Map<String, String> map;
        if (str3 == null) {
            return;
        }
        LIZIZ(C0I0B.LJFF.LIZIZ());
        Map<String, String> mapLJIIJ = C2097608Jq.LJIIJ(new Pair("enter_from", "chat"), new Pair("enter_method", str), new Pair("conversation_id", str2), new Pair("chat_type", str4), new Pair("panel_type", str3));
        LIZLLL = mapLJIIJ;
        if (str5 != null) {
            mapLJIIJ.put("received_message_type", str5);
        }
        if (str6 != null && (map = LIZLLL) != null) {
            map.put("group_id", str6);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.service.analytics.IReplyToStickerAnalytics
    public final void LIZ(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, InterfaceC1493105sv interfaceC1493105sv) {
        if (str3 == null) {
            return;
        }
        C823170WQx<String> c823170WQx = LIZJ;
        c823170WQx.add(str5);
        interfaceC1493105sv.sendEvent("click_sticker_reply_suggestions_panel", C2097608Jq.LJIIJ(new Pair("enter_from", "chat"), new Pair("enter_method", str), new Pair("conversation_id", str2), new Pair("chat_type", str4), new Pair("panel_type", str3), new Pair("sticker_id_list", C13LP.LJJLIIIJ(c823170WQx, ",", null, null, 0, null, null, 62)), new Pair("sticker_id", str5), new Pair("message_type", str6), new Pair("received_message_type", str7), new Pair("group_id", str8)));
    }
}
