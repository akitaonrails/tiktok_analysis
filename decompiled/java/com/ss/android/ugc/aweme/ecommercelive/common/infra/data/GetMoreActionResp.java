package com.ss.android.ugc.aweme.ecommercelive.common.infra.data;

import X.C09C2;
import X.C09CT;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.reflect.TypeToken;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes33.dex */
public final class GetMoreActionResp {
    public final String LIZ;
    public final Long LIZIZ;

    @C09CT("auto_add_to_cart")
    public final Boolean autoAddToCart;

    @C09CT("card_info")
    public final ActionCardInfo cardInfo;

    @C09CT("da_info")
    public final String daInfo;

    @C09CT("products")
    public final List<Product> product;

    @C09CT("product_num")
    public final Integer productNum;

    @C09CT("support")
    public final Boolean support;

    @C09CT("title")
    public final TextDisplay title;

    public GetMoreActionResp() {
        this(null, null, null, null, new ArrayList(), null, null, null, null);
    }

    public final Map<String, String> LIZ() {
        HashMap map;
        String str = this.daInfo;
        if (str != null) {
            try {
                map = (HashMap) C09C2.LIZ().LJIIIIZZ(str, new TypeToken<HashMap<String, String>>() { // from class: X.10w7
                }.getType());
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                map = null;
            }
            if (map != null) {
                return map;
            }
        }
        return new HashMap();
    }

    public GetMoreActionResp(Boolean bool, Boolean bool2, TextDisplay textDisplay, Integer num, List<Product> list, ActionCardInfo actionCardInfo, String str, String str2, Long l) {
        this.support = bool;
        this.autoAddToCart = bool2;
        this.title = textDisplay;
        this.productNum = num;
        this.product = list;
        this.cardInfo = actionCardInfo;
        this.daInfo = str;
        this.LIZ = str2;
        this.LIZIZ = l;
    }
}
