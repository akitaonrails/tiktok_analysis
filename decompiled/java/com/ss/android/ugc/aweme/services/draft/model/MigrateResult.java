package com.ss.android.ugc.aweme.services.draft.model;

import X.C13BV;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes9.dex */
public final class MigrateResult implements Serializable {
    public final Throwable error;
    public final int errorCode;
    public final List<MigrateDraftCommonResult> errorList;
    public final String errorMsg;
    public final int failedCount;
    public final boolean isSuccess;
    public final long resultTime;
    public final int successCount;
    public final String uid;

    public final boolean isSuccess() {
        return this.isSuccess;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MigrateResult(String str, boolean z, int i, int i2, int i3, String str2, List<? extends MigrateDraftCommonResult> list, Throwable th, long j) {
        this.uid = str;
        this.isSuccess = z;
        this.successCount = i;
        this.failedCount = i2;
        this.errorCode = i3;
        this.errorMsg = str2;
        this.errorList = list;
        this.error = th;
        this.resultTime = j;
    }

    public MigrateResult(String str, boolean z, int i, int i2, int i3, String str2, List list, Throwable th, long j, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, z, i, i2, i3, (i4 & 32) != 0 ? null : str2, (i4 & 64) != 0 ? C13BV.INSTANCE : list, (i4 & 128) == 0 ? th : null, (i4 & 256) != 0 ? System.currentTimeMillis() : j);
    }
}
