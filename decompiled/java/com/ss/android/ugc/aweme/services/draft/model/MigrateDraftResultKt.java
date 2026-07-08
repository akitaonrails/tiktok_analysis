package com.ss.android.ugc.aweme.services.draft.model;

/* JADX INFO: loaded from: classes14.dex */
public final class MigrateDraftResultKt {
    public static final boolean isEmpty(MigrateDraftQueryResult migrateDraftQueryResult) {
        if (migrateDraftQueryResult.getMigrateDraftStateInfoList().isEmpty() && migrateDraftQueryResult.getTotalFreeSpace() == 0) {
            return true;
        }
        return false;
    }
}
