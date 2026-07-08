package com.ss.android.ugc.aweme.services.draft.model;

/* JADX INFO: loaded from: classes14.dex */
public final class MigrateRequireDraftResult extends MigrateDraftCommonResult {
    public final String targetPath;

    public final String getTargetPath() {
        return this.targetPath;
    }

    public MigrateRequireDraftResult(String str, int i, String str2, String str3) {
        super(str, i, str2);
        this.targetPath = str3;
    }
}
