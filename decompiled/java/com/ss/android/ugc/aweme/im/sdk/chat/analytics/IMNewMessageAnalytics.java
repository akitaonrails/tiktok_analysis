package com.ss.android.ugc.aweme.im.sdk.chat.analytics;

import X.AbstractC1711506n3;
import X.AnonymousClass0629;
import X.C01GW;
import X.C05RV;
import X.C06QI;
import X.C0Y8T;
import X.C0YC9;
import X.C0YSQ;
import X.C0Z61;
import X.C0ZCG;
import X.C0ZE8;
import X.C1336205Ku;
import X.C13LQ;
import X.C23250099c;
import X.C452501pT;
import X.C869590Y9l;
import X.C896370ZEl;
import X.C897370ZIh;
import X.InterfaceC1364105Vn;
import X.InterfaceC1493105sv;
import X.InterfaceC497601wk;
import X.InterfaceC876950Yaj;
import X.InterfaceC897380ZIi;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.im.ai.api.IMAIServiceAPI;
import com.ss.android.ugc.aweme.im.saas.host.api.feature.notice.NoticeFeature;
import com.ss.android.ugc.aweme.im.service.analytics.IIMNewMessageAnalytics;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS195S0000000_9;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
public final class IMNewMessageAnalytics implements IIMNewMessageAnalytics {
    public static final IMNewMessageAnalytics LIZIZ = new IMNewMessageAnalytics();
    public static final Set<String> LIZJ = C13LQ.LJLIIL(new String[]{"share_video_system", "share_image_system", "photo_swap_ping", "photo_swap_pong", "fortune_cookie"});
    public static final C01GW LIZLLL = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(130));

    public static final class Service implements IIMNewMessageAnalytics {
        public final /* synthetic */ IMNewMessageAnalytics LIZIZ = IMNewMessageAnalytics.LIZIZ;

        @Override // com.ss.android.ugc.aweme.im.service.analytics.IIMNewMessageAnalytics
        public final void LIZ(String str, Map map, Map map2) {
            this.LIZIZ.LIZ(str, map, map2);
        }

        @Override // com.ss.android.ugc.aweme.im.service.analytics.IIMNewMessageAnalytics
        public final Object LIZIZ(String str, Map<String, String> map, C0ZCG c0zcg, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
            return this.LIZIZ.LIZIZ(str, map, c0zcg, interfaceC1364105Vn);
        }

        @Override // com.ss.android.ugc.aweme.im.service.analytics.IIMNewMessageAnalytics
        public final void LIZJ(C869590Y9l c869590Y9l, C0YC9 c0yc9, InterfaceC1493105sv interfaceC1493105sv) {
            this.LIZIZ.LIZJ(c869590Y9l, c0yc9, interfaceC1493105sv);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.service.analytics.IIMNewMessageAnalytics
    public final void LIZ(String str, Map map, Map map2) {
        String mobValue;
        C05RV c05rvLIZJ;
        C06QI c06qi;
        NoticeFeature noticeFeatureLIZ;
        String str2;
        Object obj = map2.get("enter_from");
        if (obj != null) {
            map.put("enter_from", obj);
            if (Intrinsics.LJFF(obj, "notification_page") && (noticeFeatureLIZ = (c06qi = NoticeFeature.LIZ).LIZ()) != null && noticeFeatureLIZ.LJII()) {
                NoticeFeature noticeFeatureLIZ2 = c06qi.LIZ();
                if (noticeFeatureLIZ2 != null && noticeFeatureLIZ2.LJIIJ()) {
                    str2 = "1";
                } else {
                    str2 = CardStruct.IStatusCode.DEFAULT;
                }
                map.put("is_default_landing_inbox", str2);
            }
        }
        Object obj2 = map2.get("enter_method");
        if (obj2 != null) {
            map.put("enter_method", obj2);
        }
        Object obj3 = map2.get("enter_chat_time");
        if (obj3 != null) {
            map.put("enter_chat_time", obj3);
        }
        Object obj4 = map2.get("is_message_unread");
        if (obj4 != null) {
            map.put("is_message_unread", obj4);
        }
        Object obj5 = map2.get("unread_message_cnt");
        if (obj5 != null) {
            map.put("unread_message_cnt", obj5);
        }
        Object obj6 = map2.get("push_label");
        Object obj7 = "";
        if (obj6 == null) {
            obj6 = "";
        }
        map.put("push_label", obj6);
        map.put("is_recommended_chat", map2.get("is_recommended_chat"));
        Object obj8 = map2.get("online_order");
        if (obj8 == null) {
            obj8 = "";
        }
        map.put("online_order", obj8);
        Object obj9 = map2.get("search_id");
        if (obj9 == null) {
            obj9 = "";
        }
        map.put("search_id", obj9);
        Object obj10 = map2.get("inbox_search_position");
        if (obj10 != null) {
            map.put("inbox_search_position", obj10);
        }
        Object obj11 = map2.get("inbox_search_cell_type");
        if (obj11 != null) {
            map.put("inbox_search_cell_type", obj11);
        }
        Object obj12 = map2.get("inbox_search_tab_name");
        if (obj12 != null) {
            map.put("inbox_search_tab_name", obj12);
        }
        Object obj13 = map2.get("process_id");
        if (obj13 != null) {
            obj7 = obj13;
        }
        map.put("process_id", obj7);
        Object obj14 = map2.get("traffic_type");
        if (obj14 != null) {
            map.put("traffic_type", obj14);
        }
        Object obj15 = map2.get("extra_info");
        if (obj15 != null) {
            map.put("extra_info", obj15);
        }
        Object obj16 = map2.get("panel_source");
        if (obj16 != null) {
            map.put("panel_source", obj16);
        }
        Object obj17 = map2.get("position");
        if (obj17 != null) {
            map.put("position", obj17);
        }
        Object obj18 = map2.get("social_info_site_id");
        if (obj18 != null) {
            map.put("social_info_site_id", obj18);
        }
        Object obj19 = map2.get("is_from_new_follow");
        if (obj19 != null) {
            map.put("is_from_new_follow", obj19);
        }
        Object obj20 = map2.get("is_from_external_url");
        if (obj20 != null) {
            map.put("is_from_external_url", obj20);
        }
        Object obj21 = map2.get("tab_name");
        if (obj21 != null) {
            map.put("tab_name", obj21);
        }
        Object obj22 = map2.get("chat_label");
        if (obj22 != null) {
            map.put("chat_label", obj22);
        }
        NoticeFeature noticeFeatureLIZ3 = NoticeFeature.LIZ.LIZ();
        if (noticeFeatureLIZ3 != null && (c05rvLIZJ = noticeFeatureLIZ3.LIZJ()) != null) {
            mobValue = c05rvLIZJ.getMobValue();
        } else {
            mobValue = null;
        }
        map.put("inbox_mode", mobValue);
        Object fromGroupId = map2.get("from_group_id");
        if (fromGroupId == null) {
            fromGroupId = C1336205Ku.LIZ(false).getImVideoService().getFromGroupId();
        }
        map.put("from_group_id", fromGroupId);
        if (C896370ZEl.LIZ()) {
            InterfaceC897380ZIi.LIZIZ.getClass();
            C0ZE8 c0ze8LJIIJJI = C897370ZIh.LIZ().LJIIJJI();
            if (str != null) {
                C0Y8T c0y8tLIZ = C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LIZ(str);
                if (c0y8tLIZ != null && c0y8tLIZ.getConversationType() == AbstractC1711506n3.LIZIZ) {
                    return;
                }
                map.put("active_status", String.valueOf(C0ZE8.LIZJ(str)));
                map.put("is_active", String.valueOf(c0ze8LJIIJJI.LIZLLL(str)));
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.im.service.analytics.IIMNewMessageAnalytics
    public final void LIZJ(C869590Y9l c869590Y9l, C0YC9 c0yc9, InterfaceC1493105sv interfaceC1493105sv) {
        IMAIServiceAPI.LIZ.getClass();
        if (AnonymousClass0629.LIZ().LIZ().LJIL(c869590Y9l.getConversationId())) {
            return;
        }
        C23250099c.LIZLLL((InterfaceC497601wk) LIZLLL.getValue(), null, null, new C0Z61(c869590Y9l, interfaceC1493105sv, c0yc9, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0249 A[RETURN] */
    @Override // com.ss.android.ugc.aweme.im.service.analytics.IIMNewMessageAnalytics
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(java.lang.String r20, java.util.Map<java.lang.String, java.lang.String> r21, X.C0ZCG r22, X.InterfaceC1364105Vn<? super kotlin.Unit> r23) {
        /*
            Method dump skipped, instruction units count: 740
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.chat.analytics.IMNewMessageAnalytics.LIZIZ(java.lang.String, java.util.Map, X.0ZCG, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x048c  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x04ab  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x04c5  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0514  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x0531  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x0592  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x05bc  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x05cb  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x05e4  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x05fe  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x0606  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:362:0x06dc  */
    /* JADX WARN: Removed duplicated region for block: B:365:0x06e7  */
    /* JADX WARN: Removed duplicated region for block: B:391:0x07c4  */
    /* JADX WARN: Removed duplicated region for block: B:392:0x07c7  */
    /* JADX WARN: Removed duplicated region for block: B:395:0x07d2  */
    /* JADX WARN: Removed duplicated region for block: B:396:0x07d6  */
    /* JADX WARN: Removed duplicated region for block: B:399:0x07e1  */
    /* JADX WARN: Removed duplicated region for block: B:400:0x07e5  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:415:0x0856 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:444:0x0900  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:516:0x0a41  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01d1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(X.C869590Y9l r28, X.C0ZCG r29, X.C0YC9 r30, X.InterfaceC1364105Vn<? super java.util.Map<java.lang.String, java.lang.String>> r31) {
        /*
            Method dump skipped, instruction units count: 2641
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.chat.analytics.IMNewMessageAnalytics.LIZLLL(X.0Y9l, X.0ZCG, X.0YC9, X.05Vn):java.lang.Object");
    }
}
