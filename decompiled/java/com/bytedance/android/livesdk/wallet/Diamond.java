package com.bytedance.android.livesdk.wallet;

import X.C09CT;
import X.C1796520wqo;
import X.C2188811AlT;
import X.EnumC586400MzG;
import com.bytedance.android.live.wallet.model.CurrencyPriceItem;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.List;
import kotlin.jvm.functions.Function1;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes28.dex */
public class Diamond {
    public int LIZ;
    public String LIZIZ;
    public long LIZJ;
    public final String LIZLLL;
    public C1796520wqo LJ;
    public double LJFF;
    public String LJI;
    public EnumC586400MzG LJII;
    public int LJIIIIZZ;

    @C09CT("backup_iap_id_list")
    public List<String> backupIapIdList;

    @C09CT("diamond_count")
    public int count;

    @C09CT("coupon_id")
    public String couponId;

    @C09CT("currency_price")
    public List<CurrencyPriceItem> currencyPrice;

    @C09CT("custom_price")
    public String customPrice;

    @C09CT("custom_price_currency")
    public String customPriceCurrency;

    @C09CT("describe")
    public String describe;

    @C09CT("discount_price")
    public Integer discountPrice;

    @C09CT("exchange_price")
    public Integer exchangePrice;

    @C09CT("generic_iap_id")
    public String genericIapId;

    @C09CT("giving_count")
    public int givingCount;

    @C09CT("iap_external_payment_link_type")
    public String iapExternalPaymentLinkType;

    @C09CT("iap_id")
    public String iapId;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public int id;

    @C09CT("is_alternative")
    public boolean isAlternative;

    @C09CT("is_frequent")
    public boolean isFrequent;

    @C09CT("is_last")
    public boolean isLast;

    @C09CT("price")
    public String price;

    @C09CT("price_point_id")
    public String pricePointId;

    @C09CT("product_id")
    public String productId;

    @C09CT("purchase_option_id")
    public String purchaseOptionId;

    @C09CT("stall_type")
    public int stallType;

    @C09CT("type")
    public int type;

    @C09CT("usd_price")
    public CurrencyPriceItem usdPrice;

    public final boolean LIZ() {
        return this.stallType == 1;
    }

    public final boolean LIZIZ() {
        return this.LJII == EnumC586400MzG.TIKTOK;
    }

    public Diamond() {
        this.purchaseOptionId = "";
        this.pricePointId = "";
        this.customPriceCurrency = "";
        this.iapExternalPaymentLinkType = "";
        this.customPrice = "";
        this.LIZIZ = "";
        this.LIZLLL = "";
        this.LJII = EnumC586400MzG.GOOGLE;
        this.LJIIIIZZ = 0;
        this.genericIapId = "";
        this.productId = "";
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Diamond{id=");
        sbLIZ.append(this.id);
        sbLIZ.append(", iapId='");
        sbLIZ.append(this.iapId);
        sbLIZ.append('\'');
        sbLIZ.append(", price='");
        sbLIZ.append(this.price);
        sbLIZ.append('\'');
        sbLIZ.append(", count='");
        sbLIZ.append(this.count);
        sbLIZ.append('\'');
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public Diamond(String str, String str2, String str3, long j, String str4) {
        this.purchaseOptionId = "";
        this.pricePointId = "";
        this.customPriceCurrency = "";
        this.iapExternalPaymentLinkType = "";
        this.customPrice = "";
        this.LIZIZ = "";
        this.LIZLLL = "";
        this.LJII = EnumC586400MzG.GOOGLE;
        this.LJIIIIZZ = 0;
        this.genericIapId = "";
        this.productId = "";
        this.iapId = str;
        this.price = str2;
        this.LIZIZ = str3;
        this.LIZJ = j;
        this.LIZLLL = str4;
    }

    public static JSONObject LIZJ(Diamond diamond, Function1<Diamond, String> function1, String str, String str2, String str3, String str4) {
        String strInvoke;
        Long l;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(FollowStatusChangeMethod.PARAM_UID, diamond.id);
            jSONObject.put("iapId", diamond.iapId);
            if (!diamond.LIZIZ() || function1 == null) {
                strInvoke = diamond.price;
            } else {
                strInvoke = function1.invoke(diamond);
            }
            jSONObject.put("price", strInvoke);
            jSONObject.put("original_price", diamond.LJFF);
            jSONObject.put("count", diamond.count);
            jSONObject.put("giving_count", diamond.givingCount);
            if (!diamond.LIZIZ()) {
                jSONObject.put("currency", diamond.LIZIZ);
            } else {
                List<CurrencyPriceItem> list = diamond.currencyPrice;
                if (list != null && !list.isEmpty()) {
                    jSONObject.put("currency", ((CurrencyPriceItem) ListProtector.get(diamond.currencyPrice, 0)).currency);
                }
            }
            jSONObject.put("stallType", diamond.stallType);
            jSONObject.put("price_local_formatted", str2);
            jSONObject.put("converted_price", str);
            jSONObject.put("custom_converted_price", str3);
            jSONObject.put("custom_converted_price_difference", str4);
            CurrencyPriceItem currencyPriceItem = diamond.usdPrice;
            if (currencyPriceItem != null && (l = currencyPriceItem.price) != null) {
                jSONObject.put("usd_price", l);
                return jSONObject;
            }
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return jSONObject;
    }
}
