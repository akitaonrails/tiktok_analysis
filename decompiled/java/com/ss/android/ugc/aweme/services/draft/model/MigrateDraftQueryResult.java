package com.ss.android.ugc.aweme.services.draft.model;

import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public final class MigrateDraftQueryResult {
    public final int errorCode;
    public final String from;
    public final List<MigrateDraftStateInfo> migrateDraftStateInfoList;
    public final long totalFreeSpace;

    public final int getErrorCode() {
        return this.errorCode;
    }

    public final String getFrom() {
        return this.from;
    }

    public final List<MigrateDraftStateInfo> getMigrateDraftStateInfoList() {
        return this.migrateDraftStateInfoList;
    }

    public final long getTotalFreeSpace() {
        return this.totalFreeSpace;
    }

    public MigrateDraftQueryResult(List<MigrateDraftStateInfo> list, long j, String str, int i) {
        this.migrateDraftStateInfoList = list;
        this.totalFreeSpace = j;
        this.from = str;
        this.errorCode = i;
    }
}
