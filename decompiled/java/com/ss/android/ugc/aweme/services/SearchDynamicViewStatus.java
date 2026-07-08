package com.ss.android.ugc.aweme.services;

import X.C08FF;
import X.C2254308sP;
import X.InterfaceC2044707zh;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes11.dex */
public final class SearchDynamicViewStatus {
    public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
    public static final /* synthetic */ SearchDynamicViewStatus[] $VALUES;
    public final int status;
    public static final SearchDynamicViewStatus SERVER_ERROR = new SearchDynamicViewStatus("SERVER_ERROR", 0, 0);
    public static final SearchDynamicViewStatus NOT_AVAILABLE = new SearchDynamicViewStatus("NOT_AVAILABLE", 1, 1);
    public static final SearchDynamicViewStatus FAKE = new SearchDynamicViewStatus("FAKE", 2, 2);
    public static final SearchDynamicViewStatus WEAK = new SearchDynamicViewStatus("WEAK", 3, 3);

    public static final /* synthetic */ SearchDynamicViewStatus[] $values() {
        return new SearchDynamicViewStatus[]{SERVER_ERROR, NOT_AVAILABLE, FAKE, WEAK};
    }

    public static InterfaceC2044707zh<SearchDynamicViewStatus> getEntries() {
        return $ENTRIES;
    }

    static {
        SearchDynamicViewStatus[] searchDynamicViewStatusArr$values = $values();
        $VALUES = searchDynamicViewStatusArr$values;
        $ENTRIES = new C2254308sP(searchDynamicViewStatusArr$values);
    }

    public static SearchDynamicViewStatus[] values() {
        return (SearchDynamicViewStatus[]) $VALUES.clone();
    }

    public final int getStatus() {
        return this.status;
    }

    public static SearchDynamicViewStatus valueOf(String str) {
        return (SearchDynamicViewStatus) C08FF.LIZ(SearchDynamicViewStatus.class, str);
    }

    public SearchDynamicViewStatus(String str, int i, int i2) {
        this.status = i2;
    }
}
