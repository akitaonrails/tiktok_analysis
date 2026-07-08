package com.ss.android.ugc.aweme.draft.model;

import X.C13BV;
import X.C13LP;
import X.C2188811AlT;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes9.dex */
public final class DraftFileCheckResults {
    public final List<DraftFileCheckResult> blockCreativeList;
    public final List<DraftFileCheckResult> notBlockCreativeList;

    public DraftFileCheckResults() {
        this(null, null, 3, null);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DraftFileCheckResults(blockCreativeList=");
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
        return ((DraftFileCheckResult) C13LP.LJJJJZI(this.blockCreativeList)).errorCode;
    }

    public final String getFileName() {
        DraftFileCheckResult draftFileCheckResult;
        if (isSuc() || (draftFileCheckResult = (DraftFileCheckResult) C13LP.LJJJLL(this.blockCreativeList)) == null) {
            return null;
        }
        return draftFileCheckResult.fileName;
    }

    public final String getRelativeDir() {
        DraftFileCheckResult draftFileCheckResult;
        if (isSuc() || (draftFileCheckResult = (DraftFileCheckResult) C13LP.LJJJLL(this.blockCreativeList)) == null) {
            return null;
        }
        return draftFileCheckResult.relativeDir;
    }

    public DraftFileCheckResults(List<DraftFileCheckResult> list, List<DraftFileCheckResult> list2) {
        this.blockCreativeList = list;
        this.notBlockCreativeList = list2;
    }

    public DraftFileCheckResults(List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13BV.INSTANCE : list, (i & 2) != 0 ? C13BV.INSTANCE : list2);
    }
}
