package com.ss.android.ugc.aweme.im.sdk.ecommerce;

import X.AbstractC1711506n3;
import X.C0I0B;
import X.C0YC9;
import X.C0YNP;
import X.C0ZCW;
import X.C1400340mXo;
import X.C1529905yr;
import X.C20684815ws;
import X.C869590Y9l;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMConversation;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.message.content.ShareProductContent;
import com.ss.android.ugc.aweme.im.sdk.common.controller.utils.report.SendMsgReportUtil;
import com.ss.android.ugc.aweme.im.service.service.IEcommerceLogUtil;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes22.dex */
public final class EcommerceLogUtil implements IEcommerceLogUtil {
    public static final EcommerceLogUtil LIZIZ = new EcommerceLogUtil();

    public static final class Service implements IEcommerceLogUtil {
        public final /* synthetic */ EcommerceLogUtil LIZIZ = EcommerceLogUtil.LIZIZ;

        @Override // com.ss.android.ugc.aweme.im.service.service.IEcommerceLogUtil
        public final void LIZ(C869590Y9l c869590Y9l, ShareProductContent shareProductContent) {
            this.LIZIZ.LIZ(c869590Y9l, shareProductContent);
        }

        @Override // com.ss.android.ugc.aweme.im.service.service.IEcommerceLogUtil
        public final void LIZIZ(SharePackage sharePackage, IMContact iMContact, boolean z, String str) {
            this.LIZIZ.LIZIZ(sharePackage, iMContact, z, str);
        }

        @Override // com.ss.android.ugc.aweme.im.service.service.IEcommerceLogUtil
        public final void LIZJ(SharePackage sharePackage) {
            this.LIZIZ.LIZJ(sharePackage);
        }

        @Override // com.ss.android.ugc.aweme.im.service.service.IEcommerceLogUtil
        public final void LIZLLL(SharePackage sharePackage, String str, List list) {
            this.LIZIZ.LIZLLL(sharePackage, str, list);
        }

        @Override // com.ss.android.ugc.aweme.im.service.service.IEcommerceLogUtil
        public final void LJ(int i, IMContact iMContact, SharePackage sharePackage) {
            this.LIZIZ.LJ(i, iMContact, sharePackage);
        }

        @Override // com.ss.android.ugc.aweme.im.service.service.IEcommerceLogUtil
        public final void LJFF(C869590Y9l c869590Y9l, ShareProductContent shareProductContent, C0YC9 c0yc9) {
            this.LIZIZ.LJFF(c869590Y9l, shareProductContent, c0yc9);
        }

        @Override // com.ss.android.ugc.aweme.im.service.service.IEcommerceLogUtil
        public final void LJI(View view, C869590Y9l c869590Y9l, ShareProductContent shareProductContent) {
            this.LIZIZ.LJI(view, c869590Y9l, shareProductContent);
        }
    }

    public static String LJII(IMContact iMContact) {
        if (iMContact instanceof IMUser) {
            return "private";
        }
        if (iMContact instanceof IMConversation) {
            return "group";
        }
        return "";
    }

    public static String LJIIIIZZ(C869590Y9l c869590Y9l) {
        if (c869590Y9l.getConversationType() == AbstractC1711506n3.LIZIZ) {
            return "group";
        }
        return "private";
    }

    public static String LJIIIZ(IMContact iMContact) {
        if (iMContact instanceof IMUser) {
            String uid = iMContact.getUid();
            if (uid != null) {
                return uid;
            }
        } else if (iMContact instanceof IMConversation) {
            return "-1";
        }
        return "";
    }

    public static String LJIIJ(C869590Y9l c869590Y9l) {
        return String.valueOf(C0YNP.LJII(c869590Y9l.getConversationId()));
    }

    public static String LJIIJJI(String str) {
        if (!TextUtils.isEmpty(str)) {
            if (TextUtils.equals(String.valueOf(str), ((C1400340mXo) C0I0B.LJFF.LIZ()).getCurUserId())) {
                return "author";
            }
            return "user";
        }
        return "";
    }

    public static JSONObject LJIIL(Map map) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry entry : ((LinkedHashMap) map).entrySet()) {
            jSONObject.put((String) entry.getKey(), entry.getValue());
        }
        return jSONObject;
    }

    public static Map LJIILIIL(String str) {
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
        HashMap map = new HashMap();
        if (str != null && (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(UriProtector.parse(str), "trackParams")) != null) {
            map.putAll((Map) GsonProtectorUtils.fromJson(new Gson(), strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter, new TypeToken<HashMap<String, Object>>() { // from class: X.0m3a
            }.getType()));
        }
        if (map.containsKey("entrance_info")) {
            map.remove("entrance_info");
        }
        map.put("entrance_info", GsonProtectorUtils.toJson(new Gson(), map));
        return map;
    }

    @Override // com.ss.android.ugc.aweme.im.service.service.IEcommerceLogUtil
    public final void LIZJ(SharePackage sharePackage) {
        String str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(LJIILIIL(sharePackage.extras.getString("product_query_params")));
        Object obj = linkedHashMap.get("author_id");
        if (obj instanceof String) {
            str = (String) obj;
        } else {
            str = null;
        }
        linkedHashMap.put("user_type", LJIIJJI(str));
        C0I0B.LJFF.LIZIZ();
        C20684815ws.LJIJ("tiktokec_im_share_head_show", LJIIL(linkedHashMap));
    }

    @Override // com.ss.android.ugc.aweme.im.service.service.IEcommerceLogUtil
    public final void LIZ(C869590Y9l c869590Y9l, ShareProductContent shareProductContent) {
        String str;
        String str2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(LJIILIIL(shareProductContent.getQueryParams()));
        Object obj = linkedHashMap.get("author_id");
        if (obj instanceof String) {
            str = (String) obj;
        } else {
            str = null;
        }
        linkedHashMap.put("user_type", LJIIJJI(str));
        linkedHashMap.put("chat_type", LJIIIIZZ(c869590Y9l));
        linkedHashMap.put("message_type", "product_share");
        if (c869590Y9l.getLocalExt() != null && c869590Y9l.getLocalExt().containsKey("key_resend")) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        linkedHashMap.put("is_resend", str2);
        linkedHashMap.put("conversation_id", c869590Y9l.getConversationId());
        linkedHashMap.put("from_user_id", Long.valueOf(c869590Y9l.getSender()));
        linkedHashMap.put("to_user_id", LJIIJ(c869590Y9l));
        linkedHashMap.put("chat_cnt", 1);
        C0I0B.LJFF.LIZIZ();
        C20684815ws.LJIJ("tiktokec_send_message", LJIIL(linkedHashMap));
    }

    @Override // com.ss.android.ugc.aweme.im.service.service.IEcommerceLogUtil
    public final void LIZLLL(SharePackage sharePackage, String str, List list) {
        String str2;
        String str3;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(LJIILIIL(sharePackage.extras.getString("product_query_params")));
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        Iterator it2 = list.iterator();
        while (true) {
            str2 = "";
            if (!it2.hasNext()) {
                break;
            }
            IMContact iMContact = (IMContact) it2.next();
            LIZIZ.getClass();
            arrayList.add(LJII(iMContact));
            String strLIZIZ = C1529905yr.LIZIZ(iMContact);
            if (strLIZIZ != null) {
                str2 = strLIZIZ;
            }
            arrayList2.add(str2);
            arrayList3.add(LJIIIZ(iMContact));
            arrayList4.add(Integer.valueOf(iMContact.isRecentTop5Contact()));
            arrayList5.add(Integer.valueOf(iMContact.isRecentContact()));
        }
        Object obj = linkedHashMap.get("author_id");
        if (obj instanceof String) {
            str3 = (String) obj;
        } else {
            str3 = null;
        }
        linkedHashMap.put("user_type", LJIIJJI(str3));
        linkedHashMap.put("chat_type", arrayList.toString());
        linkedHashMap.put("conversation_id", arrayList2.toString());
        C0I0B c0i0b = C0I0B.LJFF;
        String curUserId = ((C1400340mXo) c0i0b.LIZ()).getCurUserId();
        if (curUserId != null) {
            str2 = curUserId;
        }
        linkedHashMap.put("from_user_id", str2);
        linkedHashMap.put("to_user_id", arrayList3.toString());
        linkedHashMap.put("is_chat_list_top5", arrayList4.toString());
        linkedHashMap.put("is_recent_contact", arrayList5.toString());
        linkedHashMap.put("is_with_text", Integer.valueOf(!TextUtils.isEmpty(str) ? 1 : 0));
        linkedHashMap.put("chat_cnt", Integer.valueOf(list.size()));
        c0i0b.LIZIZ();
        C20684815ws.LJIJ("tiktokec_share_product_to_chat", LJIIL(linkedHashMap));
    }

    @Override // com.ss.android.ugc.aweme.im.service.service.IEcommerceLogUtil
    public final void LJ(int i, IMContact iMContact, SharePackage sharePackage) {
        String str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(LJIILIIL(sharePackage.extras.getString("product_query_params")));
        Object obj = linkedHashMap.get("author_id");
        if (obj instanceof String) {
            str = (String) obj;
        } else {
            str = null;
        }
        linkedHashMap.put("user_type", LJIIJJI(str));
        linkedHashMap.put("chat_type", LJII(iMContact));
        linkedHashMap.put("is_recent_contact", Integer.valueOf(iMContact.isRecentContact()));
        linkedHashMap.put("is_chat_list_top5", Integer.valueOf(iMContact.isRecentTop5Contact()));
        linkedHashMap.put("rank_index", Integer.valueOf(i));
        C0I0B c0i0b = C0I0B.LJFF;
        String curUserId = ((C1400340mXo) c0i0b.LIZ()).getCurUserId();
        if (curUserId == null) {
            curUserId = "";
        }
        linkedHashMap.put("from_user_id", curUserId);
        linkedHashMap.put("to_user_id", LJIIIZ(iMContact));
        c0i0b.LIZIZ();
        C20684815ws.LJIJ("tiktokec_share_head_show", LJIIL(linkedHashMap));
    }

    @Override // com.ss.android.ugc.aweme.im.service.service.IEcommerceLogUtil
    public final void LJFF(C869590Y9l c869590Y9l, ShareProductContent shareProductContent, C0YC9 c0yc9) {
        String str;
        int i;
        String str2;
        String str3;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(LJIILIIL(shareProductContent.getQueryParams()));
        Object obj = linkedHashMap.get("author_id");
        if (obj instanceof String) {
            str = (String) obj;
        } else {
            str = null;
        }
        linkedHashMap.put("user_type", LJIIJJI(str));
        linkedHashMap.put("chat_type", LJIIIIZZ(c869590Y9l));
        linkedHashMap.put("message_type", "product_share");
        if (c869590Y9l.getLocalExt() != null && c869590Y9l.getLocalExt().containsKey("key_resend")) {
            i = 1;
        } else {
            i = 0;
        }
        linkedHashMap.put("is_resend", Integer.valueOf(i));
        linkedHashMap.put("conversation_id", c869590Y9l.getConversationId());
        linkedHashMap.put("from_user_id", Long.valueOf(c869590Y9l.getSender()));
        linkedHashMap.put("to_user_id", LJIIJ(c869590Y9l));
        C0ZCW.LIZ.getClass();
        if (C0ZCW.LJ(c869590Y9l)) {
            str2 = "success";
        } else {
            str2 = "failure";
        }
        linkedHashMap.put("send_status", str2);
        SendMsgReportUtil.LIZIZ.getClass();
        linkedHashMap.put("status_code", Integer.valueOf(SendMsgReportUtil.LIZIZ(c0yc9)));
        if (c0yc9 != null) {
            if (c0yc9.LJJ) {
                str3 = "ws";
            } else {
                str3 = "http";
            }
            linkedHashMap.put("last_method", str3);
        }
        C0I0B.LJFF.LIZIZ();
        C20684815ws.LJIJ("tiktokec_send_message_response", LJIIL(linkedHashMap));
    }

    @Override // com.ss.android.ugc.aweme.im.service.service.IEcommerceLogUtil
    public final void LJI(View view, C869590Y9l c869590Y9l, ShareProductContent shareProductContent) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(LJIILIIL(shareProductContent.getQueryParams()));
        linkedHashMap.put("page_name", "chat_im");
        linkedHashMap.put("source_page_type", "");
        linkedHashMap.put("entrance_form", "product_share_card");
        linkedHashMap.put("enter_from_info", "product_share_im");
        linkedHashMap.put("chat_type", LJIIIIZZ(c869590Y9l));
        linkedHashMap.put("conversation_id", c869590Y9l.getConversationId());
        linkedHashMap.put("from_user_id", Long.valueOf(c869590Y9l.getSender()));
        linkedHashMap.put("to_user_id", LJIIJ(c869590Y9l));
        linkedHashMap.put("is_receptor", Integer.valueOf(!TextUtils.equals(String.valueOf(c869590Y9l.getSender()), ((C1400340mXo) C0I0B.LJFF.LIZ()).getCurUserId()) ? 1 : 0));
        if (linkedHashMap.containsKey("entrance_info")) {
            linkedHashMap.remove("entrance_info");
        }
        for (Map.Entry entry : BtmSDK.createReportParams$default(BtmSDK.INSTANCE, "c70785.d33188", PageFinder.via(view), null, 4, null).entrySet()) {
            Object value = entry.getValue();
            if (value != null) {
                linkedHashMap.put(entry.getKey(), value);
            }
        }
        C0I0B.LJFF.LIZIZ();
        C20684815ws.LJIJ("tiktokec_product_show", LJIIL(linkedHashMap));
    }

    @Override // com.ss.android.ugc.aweme.im.service.service.IEcommerceLogUtil
    public final void LIZIZ(SharePackage sharePackage, IMContact iMContact, boolean z, String str) {
        String str2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(LJIILIIL(sharePackage.extras.getString("product_query_params")));
        Object obj = linkedHashMap.get("author_id");
        if (obj instanceof String) {
            str2 = (String) obj;
        } else {
            str2 = null;
        }
        linkedHashMap.put("user_type", LJIIJJI(str2));
        linkedHashMap.put("chat_type", LJII(iMContact));
        String strLIZIZ = C1529905yr.LIZIZ(iMContact);
        String str3 = "";
        if (strLIZIZ == null) {
            strLIZIZ = "";
        }
        linkedHashMap.put("conversation_id", strLIZIZ);
        if (z) {
            str = "chat_merge";
        } else if (TextUtils.isEmpty(str)) {
            str = "chat_head";
        }
        linkedHashMap.put("platform", str);
        C0I0B c0i0b = C0I0B.LJFF;
        String curUserId = ((C1400340mXo) c0i0b.LIZ()).getCurUserId();
        if (curUserId != null) {
            str3 = curUserId;
        }
        linkedHashMap.put("from_user_id", str3);
        linkedHashMap.put("to_user_id", LJIIIZ(iMContact));
        if (iMContact != null) {
            linkedHashMap.put("is_chat_list_top5", Integer.valueOf(iMContact.isRecentTop5Contact()));
            linkedHashMap.put("is_recent_contact", Integer.valueOf(iMContact.isRecentContact()));
        }
        linkedHashMap.put("rank_index", Integer.valueOf(sharePackage.extras.getInt("rank_num")));
        c0i0b.LIZIZ();
        C20684815ws.LJIJ("tiktokec_share_product", LJIIL(linkedHashMap));
    }
}
