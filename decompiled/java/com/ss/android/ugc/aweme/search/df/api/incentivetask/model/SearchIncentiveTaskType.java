package com.ss.android.ugc.aweme.search.df.api.incentivetask.model;

import X.C08FF;
import X.C2254308sP;
import X.InterfaceC2044707zh;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes11.dex */
public final class SearchIncentiveTaskType {
    public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
    public static final /* synthetic */ SearchIncentiveTaskType[] $VALUES;
    public static final SearchIncentiveTaskType COUPON = new SearchIncentiveTaskType("COUPON", 0, "coupon");
    public static final SearchIncentiveTaskType COUPON_V2 = new SearchIncentiveTaskType("COUPON_V2", 1, "coupon_V2");
    public final String type;

    public static final /* synthetic */ SearchIncentiveTaskType[] $values() {
        return new SearchIncentiveTaskType[]{COUPON, COUPON_V2};
    }

    public static InterfaceC2044707zh<SearchIncentiveTaskType> getEntries() {
        return $ENTRIES;
    }

    static {
        SearchIncentiveTaskType[] searchIncentiveTaskTypeArr$values = $values();
        $VALUES = searchIncentiveTaskTypeArr$values;
        $ENTRIES = new C2254308sP(searchIncentiveTaskTypeArr$values);
    }

    public static SearchIncentiveTaskType[] values() {
        return (SearchIncentiveTaskType[]) $VALUES.clone();
    }

    public final String getType() {
        return this.type;
    }

    public static SearchIncentiveTaskType valueOf(String str) {
        return (SearchIncentiveTaskType) C08FF.LIZ(SearchIncentiveTaskType.class, str);
    }

    public SearchIncentiveTaskType(String str, int i, String str2) {
        this.type = str2;
    }
}
