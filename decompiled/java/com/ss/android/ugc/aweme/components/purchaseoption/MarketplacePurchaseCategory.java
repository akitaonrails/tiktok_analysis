package com.ss.android.ugc.aweme.components.purchaseoption;

import X.C08FF;
import X.C09CT;
import X.C1614360s70;
import X.C2097908Jt;
import X.C2254308sP;
import X.InterfaceC2044707zh;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.model.PurchaseCategory;
import java.util.LinkedHashMap;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes25.dex */
public final class MarketplacePurchaseCategory {
    public static final C1614360s70 Companion;
    public static final /* synthetic */ MarketplacePurchaseCategory[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;

    @C09CT("3")
    public static final MarketplacePurchaseCategory MARKETPLACE_PURCHASE_CATEGORY_ALL;

    @C09CT("1")
    public static final MarketplacePurchaseCategory MARKETPLACE_PURCHASE_CATEGORY_DEFAULT;

    @C09CT("2")
    public static final MarketplacePurchaseCategory MARKETPLACE_PURCHASE_CATEGORY_REMAINING;

    @C09CT(CardStruct.IStatusCode.DEFAULT)
    public static final MarketplacePurchaseCategory UNKNOWN;
    public final int LL;

    public static InterfaceC2044707zh<MarketplacePurchaseCategory> getEntries() {
        return LLILLL;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [X.0s70] */
    static {
        MarketplacePurchaseCategory marketplacePurchaseCategory = new MarketplacePurchaseCategory("UNKNOWN", 0, 0);
        UNKNOWN = marketplacePurchaseCategory;
        MarketplacePurchaseCategory marketplacePurchaseCategory2 = new MarketplacePurchaseCategory("MARKETPLACE_PURCHASE_CATEGORY_DEFAULT", 1, 1);
        MARKETPLACE_PURCHASE_CATEGORY_DEFAULT = marketplacePurchaseCategory2;
        MarketplacePurchaseCategory marketplacePurchaseCategory3 = new MarketplacePurchaseCategory("MARKETPLACE_PURCHASE_CATEGORY_REMAINING", 2, 2);
        MARKETPLACE_PURCHASE_CATEGORY_REMAINING = marketplacePurchaseCategory3;
        MarketplacePurchaseCategory marketplacePurchaseCategory4 = new MarketplacePurchaseCategory("MARKETPLACE_PURCHASE_CATEGORY_ALL", 3, 3);
        MARKETPLACE_PURCHASE_CATEGORY_ALL = marketplacePurchaseCategory4;
        MarketplacePurchaseCategory[] marketplacePurchaseCategoryArr = {marketplacePurchaseCategory, marketplacePurchaseCategory2, marketplacePurchaseCategory3, marketplacePurchaseCategory4};
        LLILLJJLI = marketplacePurchaseCategoryArr;
        LLILLL = new C2254308sP(marketplacePurchaseCategoryArr);
        Companion = new Object() { // from class: X.0s70
        };
        PurchaseCategory[] purchaseCategoryArrValues = PurchaseCategory.values();
        int iLIZIZ = C2097908Jt.LIZIZ(purchaseCategoryArrValues.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ < 16 ? 16 : iLIZIZ);
        for (PurchaseCategory purchaseCategory : purchaseCategoryArrValues) {
            linkedHashMap.put(Integer.valueOf(purchaseCategory.getValue()), purchaseCategory);
        }
    }

    public static MarketplacePurchaseCategory[] values() {
        return (MarketplacePurchaseCategory[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static MarketplacePurchaseCategory valueOf(String str) {
        return (MarketplacePurchaseCategory) C08FF.LIZ(MarketplacePurchaseCategory.class, str);
    }

    public MarketplacePurchaseCategory(String str, int i, int i2) {
        this.LL = i2;
    }
}
