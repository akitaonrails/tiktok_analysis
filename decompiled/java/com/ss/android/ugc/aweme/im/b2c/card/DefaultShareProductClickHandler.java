package com.ss.android.ugc.aweme.im.b2c.card;

import X.C06QO;
import X.C0I0B;
import X.C1400340mXo;
import X.C20684815ws;
import X.C2188811AlT;
import X.C869590Y9l;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.im.message.content.ShareProductContent;
import com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListShareProductClickAbility;
import com.ss.android.ugc.aweme.im.saas.host.api.feature.ecommerce.EcommerceFeature;
import com.ss.android.ugc.aweme.im.sdk.ecommerce.EcommerceLogUtil;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AwS159S1100000_10;

/* JADX INFO: loaded from: classes22.dex */
public final class DefaultShareProductClickHandler implements MessageListShareProductClickAbility {
    @Override // com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListShareProductClickAbility
    public final void eX0(View view, C869590Y9l c869590Y9l, ShareProductContent shareProductContent) {
        if (!TextUtils.isEmpty(shareProductContent.getQueryParams())) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("aweme://ec/pdp");
            sbLIZ.append(shareProductContent.getQueryParams());
            String string = UriProtector.parse(C2188811AlT.LIZIZ(sbLIZ)).buildUpon().appendQueryParameter("isIMShare", "true").appendQueryParameter("source_btm_token", BtmSDK.INSTANCE.createJumpSourceBtmToken("c70785.d33188", PageFinder.via(view), null)).toString();
            AwS159S1100000_10 awS159S1100000_10 = new AwS159S1100000_10(view, string, 0);
            C06QO c06qo = EcommerceFeature.LIZ;
            c06qo.getClass();
            EcommerceFeature value = C06QO.LIZJ.getValue(c06qo, C06QO.LIZIZ[0]);
            if (value != null) {
                value.LIZ(c869590Y9l.getConversationId(), awS159S1100000_10, String.valueOf(c869590Y9l.getSender()), string);
            } else {
                awS159S1100000_10.invoke();
            }
        }
        EcommerceLogUtil.LIZIZ.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(EcommerceLogUtil.LJIILIIL(shareProductContent.getQueryParams()));
        linkedHashMap.put("page_name", "chat_im");
        linkedHashMap.put("source_page_type", "");
        linkedHashMap.put("entrance_form", "product_share_card");
        linkedHashMap.put("enter_from_info", "product_share_im");
        linkedHashMap.put("chat_type", EcommerceLogUtil.LJIIIIZZ(c869590Y9l));
        linkedHashMap.put("conversation_id", c869590Y9l.getConversationId());
        linkedHashMap.put("from_user_id", Long.valueOf(c869590Y9l.getSender()));
        linkedHashMap.put("to_user_id", EcommerceLogUtil.LJIIJ(c869590Y9l));
        linkedHashMap.put("is_receptor", Integer.valueOf(!TextUtils.equals(String.valueOf(c869590Y9l.getSender()), ((C1400340mXo) C0I0B.LJFF.LIZ()).getCurUserId()) ? 1 : 0));
        if (linkedHashMap.containsKey("entrance_info")) {
            linkedHashMap.remove("entrance_info");
        }
        for (Map.Entry entry : BtmSDK.createReportParams$default(BtmSDK.INSTANCE, "c70785.d33188", PageFinder.via(view), null, 4, null).entrySet()) {
            Object value2 = entry.getValue();
            if (value2 != null) {
                linkedHashMap.put(entry.getKey(), value2);
            }
        }
        C0I0B.LJFF.LIZIZ();
        C20684815ws.LJIJ("tiktokec_product_click", EcommerceLogUtil.LJIIL(linkedHashMap));
    }
}
