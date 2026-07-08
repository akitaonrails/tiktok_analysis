package kotlin.jvm.internal;

import X.C00H3;
import X.C09AY;
import X.C1019503yj;
import X.C953503o5;
import X.C957403oi;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Price;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuPrice;
import com.ss.android.ugc.aweme.ecommerce.base.sku.sea.vm.SkuState;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public class AwS1S3200000_1 extends C09AY implements Function1 {
    public final int $t;
    public Object l3;
    public Object l4;
    public String s0;
    public String s1;
    public String s2;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS1S3200000_1 awS1S3200000_1, Object obj) {
        String str;
        long jLongValue;
        C957403oi c957403oi = (C957403oi) obj;
        c957403oi.LIZLLL("EVENT_ORIGIN_FEATURE", "TEMAI");
        c957403oi.LIZLLL("page_name", "payment_method");
        if (Intrinsics.LJFF((Boolean) awS1S3200000_1.l3, Boolean.TRUE)) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        c957403oi.LIZLLL("is_success", str);
        Long l = (Long) awS1S3200000_1.l4;
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        c957403oi.LIZLLL("duration", Long.valueOf(jLongValue));
        String str2 = awS1S3200000_1.s0;
        if (str2 == null) {
            str2 = "";
        }
        c957403oi.LIZLLL("payment_method_id", str2);
        String str3 = awS1S3200000_1.s1;
        if (str3 != null) {
            c957403oi.LIZLLL("error_msg", str3);
        }
        String str4 = awS1S3200000_1.s2;
        if (str4 != null) {
            c957403oi.LIZLLL("type", str4);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS1S3200000_1 awS1S3200000_1, Object obj) {
        String priceStr;
        SkuState skuState = (SkuState) obj;
        String str = awS1S3200000_1.s0;
        String str2 = awS1S3200000_1.s1;
        Price price = ((SkuPrice) awS1S3200000_1.l3).realPrice;
        if (price == null || (priceStr = price.getPriceStr()) == null) {
            priceStr = "";
        }
        return skuState.copy(skuState.checkedSkuArray, skuState.showToast, skuState.currentImage, skuState.buyButton, skuState.buyButtonInterestId, skuState.buttonDynamicData, skuState.preOrderInfo, new C953503o5(str, str2, priceStr, ((SkuPrice) awS1S3200000_1.l3).realPriceDecimal, Intrinsics.LJFF((Boolean) awS1S3200000_1.l4, Boolean.TRUE), awS1S3200000_1.s2), skuState.hidePriceTip, skuState.purchaseNotice, skuState.promotionDealVO, skuState.specifications, skuState.currentQuantityLimit, skuState.currentQuantity, skuState.currentImagePosition, skuState.currentInstallmentPlan, skuState.keyBoardVisibility, skuState.skuFragmentClosed, skuState.skuDataState, skuState.addToCartButton, skuState.paymentModule, skuState.showLoadingView, skuState.skuStockInfo, skuState.forceRefresh, skuState.originalProductPackStruct, skuState.localSizeSalePropList, skuState.isQuantityEditable, skuState.slideToBnpl, skuState.exceptionUX, skuState.counterDescription, skuState.topOutsideWidgetVisibleHeight, skuState.cutPriceSkuPanel, skuState.skuPanelWaistBanner, skuState.skuPanelSellingPoints, skuState.skuHeaderTopLabels);
    }

    public static final Object invoke$2(AwS1S3200000_1 awS1S3200000_1, Object obj) {
        C957403oi c957403oi = (C957403oi) obj;
        LinkedHashMap<String, Object> linkedHashMap = ((C1019503yj) awS1S3200000_1.l3).LIZ;
        c957403oi.getClass();
        ((HashMap) c957403oi.LIZ).putAll(linkedHashMap);
        String str = awS1S3200000_1.s0;
        if (str != null) {
            c957403oi.LIZLLL("sale_price", str);
        }
        String str2 = awS1S3200000_1.s1;
        if (str2 != null) {
            c957403oi.LIZLLL("original_price", str2);
        }
        String str3 = awS1S3200000_1.s2;
        if (str3 != null) {
            c957403oi.LIZLLL("discount_percentage", str3);
        }
        Map map = (Map) awS1S3200000_1.l4;
        if (map != null) {
            c957403oi.LJ(C00H3.LIZ(map));
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS1S3200000_1(C1019503yj c1019503yj, C1019503yj c1019503yj2, String str, String str2, String str3, Map<String, ? extends Object> map) {
        super(1);
        this.$t = map;
        this.l3 = c1019503yj;
        this.s0 = c1019503yj2;
        this.s1 = str;
        this.s2 = str2;
        this.l4 = str3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS1S3200000_1(Long l, String str, String str2, String str3, Boolean bool, int i) {
        super(1);
        this.$t = i;
        this.l3 = bool;
        this.l4 = l;
        this.s0 = str;
        this.s1 = str2;
        this.s2 = str3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS1S3200000_1(String str, String str2, SkuPrice skuPrice, Boolean bool, String str3, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.s1 = str2;
        this.l3 = skuPrice;
        this.l4 = bool;
        this.s2 = str3;
    }
}
