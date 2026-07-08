package com.ss.android.ugc.aweme.commercialize.ucp.api.model;

import X.C09CU;
import X.C09DL;
import X.C13LQ;
import X.C2097608Jq;
import X.C2334709Cv;
import X.C2334909Cx;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.l;
import com.google.gson.reflect.TypeToken;
import com.google.gson.v;
import java.io.IOException;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public final class PassThroughGsonAdapterFactory implements v {
    public static final Set<String> LL = C13LQ.LJLIIL(new String[]{"creative_id", "log_extra", "source_aweme_id", "source", "source_aid", "enter_method", "click_from", "ac_ad_type", "group_id", "adv_id", "web_url", "product_platform_id", "pid", "tiktok_shop_id", "tiktok_shop_name", "tiktok_spu_id", "tiktok_spu_name", "tiktok_spu_image", "shopify_variant_id", "pack_item_id", "external_product_id", "external_shop_id", "external_shop_name", "external_shop_logo_url", "shop_domain", "domain_for_display", "open_loop_url", "open_loop_adv_id", "open_loop_cid", "open_loop_pid", "open_loop_product_platform_id", "order_id", "shipping_address", "payment_type", "order_amount", "checkout_type", "protocol_type", "checkout_create_time", "order_complete_pay_time", "open_loop_ucp_params", "user_info"});

    @Override // com.google.gson.v
    public final <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
        final TypeAdapter<T> typeAdapterLJIIIZ = gson.LJIIIZ(typeToken);
        if (!Map.class.isAssignableFrom(typeToken.getRawType())) {
            return typeAdapterLJIIIZ;
        }
        return new TypeAdapter<T>() { // from class: com.ss.android.ugc.aweme.commercialize.ucp.api.model.PassThroughGsonAdapterFactory.create.1
            @Override // com.google.gson.TypeAdapter
            public final T read(C09CU c09cu) {
                try {
                    if (!((Boolean) C2334909Cx.LIZ.getValue()).booleanValue()) {
                        return typeAdapterLJIIIZ.read(c09cu);
                    }
                    return (T) C2334709Cv.LIZ(c09cu);
                } catch (IOException e) {
                    TryCatchGuardChecker.doCheck(e);
                    return (T) C2097608Jq.LJ();
                }
            }

            @Override // com.google.gson.TypeAdapter
            public final void write(C09DL c09dl, T t) {
                Map map;
                try {
                    if (!((Boolean) C2334909Cx.LIZ.getValue()).booleanValue()) {
                        typeAdapterLJIIIZ.write(c09dl, t);
                        return;
                    }
                    if (t instanceof Map) {
                        map = (Map) t;
                    } else {
                        map = null;
                    }
                    C2334709Cv.LIZIZ(c09dl, map);
                } catch (IOException e) {
                    TryCatchGuardChecker.doCheck(e);
                    throw new l(e);
                }
            }
        };
    }
}
