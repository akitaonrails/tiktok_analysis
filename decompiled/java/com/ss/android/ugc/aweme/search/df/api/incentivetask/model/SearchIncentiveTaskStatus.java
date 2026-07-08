package com.ss.android.ugc.aweme.search.df.api.incentivetask.model;

import X.C08FF;
import X.C2254308sP;
import X.InterfaceC2044707zh;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes27.dex */
public final class SearchIncentiveTaskStatus {
    public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
    public static final /* synthetic */ SearchIncentiveTaskStatus[] $VALUES;
    public final String status;
    public static final SearchIncentiveTaskStatus TASK_STATUS_UNAUTHORIZED = new SearchIncentiveTaskStatus("TASK_STATUS_UNAUTHORIZED", 0, "unauthorized");
    public static final SearchIncentiveTaskStatus TASK_STATUS_BEGINNING = new SearchIncentiveTaskStatus("TASK_STATUS_BEGINNING", 1, "beginning");
    public static final SearchIncentiveTaskStatus TASK_STATUS_IN_PROGRESS = new SearchIncentiveTaskStatus("TASK_STATUS_IN_PROGRESS", 2, "in_progress");
    public static final SearchIncentiveTaskStatus TASK_STATUS_COMPLETE = new SearchIncentiveTaskStatus("TASK_STATUS_COMPLETE", 3, "complete");
    public static final SearchIncentiveTaskStatus TASK_STATUS_INVALID = new SearchIncentiveTaskStatus("TASK_STATUS_INVALID", 4, "invalid");

    public static final /* synthetic */ SearchIncentiveTaskStatus[] $values() {
        return new SearchIncentiveTaskStatus[]{TASK_STATUS_UNAUTHORIZED, TASK_STATUS_BEGINNING, TASK_STATUS_IN_PROGRESS, TASK_STATUS_COMPLETE, TASK_STATUS_INVALID};
    }

    public static InterfaceC2044707zh<SearchIncentiveTaskStatus> getEntries() {
        return $ENTRIES;
    }

    static {
        SearchIncentiveTaskStatus[] searchIncentiveTaskStatusArr$values = $values();
        $VALUES = searchIncentiveTaskStatusArr$values;
        $ENTRIES = new C2254308sP(searchIncentiveTaskStatusArr$values);
    }

    public static SearchIncentiveTaskStatus[] values() {
        return (SearchIncentiveTaskStatus[]) $VALUES.clone();
    }

    public final String getStatus() {
        return this.status;
    }

    public static SearchIncentiveTaskStatus valueOf(String str) {
        return (SearchIncentiveTaskStatus) C08FF.LIZ(SearchIncentiveTaskStatus.class, str);
    }

    public SearchIncentiveTaskStatus(String str, int i, String str2) {
        this.status = str2;
    }
}
