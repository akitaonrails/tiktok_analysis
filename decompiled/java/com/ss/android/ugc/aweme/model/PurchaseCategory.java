package com.ss.android.ugc.aweme.model;

import X.C08FF;
import X.C09CT;
import X.C1614370s71;
import X.C2097908Jt;
import X.C2254308sP;
import X.InterfaceC2044707zh;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes25.dex */
public final class PurchaseCategory implements Serializable {
    public static final C1614370s71 Companion;
    public static final /* synthetic */ PurchaseCategory[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;

    @C09CT("1")
    public static final PurchaseCategory PURCHASE_CATEGORY_DEFAULT_OPTION;

    @C09CT("3")
    public static final PurchaseCategory PURCHASE_CATEGORY_ENTIRE_COLLECTION;

    @C09CT("2")
    public static final PurchaseCategory PURCHASE_CATEGORY_REMAINING_VIDEOS;
    public static final PurchaseCategory UNKNOWN;
    public static final Map<Integer, PurchaseCategory> map;
    public final int LL;

    public static InterfaceC2044707zh<PurchaseCategory> getEntries() {
        return LLILLL;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [X.0s71] */
    static {
        PurchaseCategory purchaseCategory = new PurchaseCategory("UNKNOWN", 0, 0);
        UNKNOWN = purchaseCategory;
        PurchaseCategory purchaseCategory2 = new PurchaseCategory("PURCHASE_CATEGORY_DEFAULT_OPTION", 1, 1);
        PURCHASE_CATEGORY_DEFAULT_OPTION = purchaseCategory2;
        PurchaseCategory purchaseCategory3 = new PurchaseCategory("PURCHASE_CATEGORY_REMAINING_VIDEOS", 2, 2);
        PURCHASE_CATEGORY_REMAINING_VIDEOS = purchaseCategory3;
        PurchaseCategory purchaseCategory4 = new PurchaseCategory("PURCHASE_CATEGORY_ENTIRE_COLLECTION", 3, 3);
        PURCHASE_CATEGORY_ENTIRE_COLLECTION = purchaseCategory4;
        PurchaseCategory[] purchaseCategoryArr = {purchaseCategory, purchaseCategory2, purchaseCategory3, purchaseCategory4};
        LLILLJJLI = purchaseCategoryArr;
        LLILLL = new C2254308sP(purchaseCategoryArr);
        Companion = new Object() { // from class: X.0s71
        };
        PurchaseCategory[] purchaseCategoryArrValues = values();
        int iLIZIZ = C2097908Jt.LIZIZ(purchaseCategoryArrValues.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ < 16 ? 16 : iLIZIZ);
        for (PurchaseCategory purchaseCategory5 : purchaseCategoryArrValues) {
            linkedHashMap.put(Integer.valueOf(purchaseCategory5.LL), purchaseCategory5);
        }
        map = linkedHashMap;
    }

    public static PurchaseCategory[] values() {
        return (PurchaseCategory[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static PurchaseCategory valueOf(String str) {
        return (PurchaseCategory) C08FF.LIZ(PurchaseCategory.class, str);
    }

    public PurchaseCategory(String str, int i, int i2) {
        this.LL = i2;
    }
}
