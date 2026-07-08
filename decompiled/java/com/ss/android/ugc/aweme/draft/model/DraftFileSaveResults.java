package com.ss.android.ugc.aweme.draft.model;

import X.C13BV;
import X.C13LP;
import X.C2188811AlT;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes9.dex */
public final class DraftFileSaveResults {
    public final List<DraftFileSaveResult> blockCreativeList;
    public final transient long fileSaveDuration;
    public final List<DraftFileSaveResult> notBlockCreativeList;

    public DraftFileSaveResults() {
        this(0L, null, null, 7, null);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DraftFileSaveResults(fileSaveDuration=");
        sbLIZ.append(this.fileSaveDuration);
        sbLIZ.append(", blockCreativeList=");
        sbLIZ.append(this.blockCreativeList);
        sbLIZ.append(", notBlockCreativeList=");
        sbLIZ.append(this.notBlockCreativeList);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean isSuc() {
        return this.blockCreativeList.isEmpty();
    }

    public final int getErrorCode() {
        if (isSuc()) {
            return 0;
        }
        return ((DraftFileSaveResult) C13LP.LJJJJZI(this.blockCreativeList)).saveException.errorCode;
    }

    public DraftFileSaveResults(long j, List<DraftFileSaveResult> list, List<DraftFileSaveResult> list2) {
        this.fileSaveDuration = j;
        this.blockCreativeList = list;
        this.notBlockCreativeList = list2;
    }

    public DraftFileSaveResults(long j, List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? C13BV.INSTANCE : list, (i & 4) != 0 ? C13BV.INSTANCE : list2);
    }
}
