package com.ss.android.ugc.aweme.draft.model;

import X.C13LP;
import X.C2188811AlT;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class DraftCheckResult {
    public final transient long checkDuration;
    public final int checkStage;
    public final DraftFileCheckResults fileCheckResults;
    public final List<DraftVECheckResult> invalidVEFileList;

    public DraftCheckResult() {
        this(0L, new DraftFileCheckResults(null, null, 3, null), null, 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DraftCheckResult(checkDuration=");
        sbLIZ.append(this.checkDuration);
        sbLIZ.append(", fileCheckResults=");
        sbLIZ.append(this.fileCheckResults);
        sbLIZ.append(", invalidVEFileList=");
        sbLIZ.append(this.invalidVEFileList);
        sbLIZ.append(", checkStage=");
        sbLIZ.append(this.checkStage);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final String getFileName() {
        return this.fileCheckResults.getFileName();
    }

    public final String getRelativeDir() {
        return this.fileCheckResults.getRelativeDir();
    }

    public final boolean isSuc() {
        if (!this.fileCheckResults.isSuc()) {
            return false;
        }
        List<DraftVECheckResult> list = this.invalidVEFileList;
        return list == null || list.isEmpty();
    }

    public final int getErrorCode() {
        if (isSuc()) {
            return 0;
        }
        if (!this.fileCheckResults.isSuc()) {
            return this.fileCheckResults.getErrorCode();
        }
        List<DraftVECheckResult> list = this.invalidVEFileList;
        if (list == null || list.isEmpty()) {
            return -1;
        }
        return ((DraftVECheckResult) C13LP.LJJJJZI(this.invalidVEFileList)).errorCode;
    }

    public DraftCheckResult(long j) {
        this(j, new DraftFileCheckResults(null, null, 3, null), null, 0);
    }

    public DraftCheckResult(long j, DraftFileCheckResults draftFileCheckResults) {
        this(j, draftFileCheckResults, null, 0);
    }

    public DraftCheckResult(long j, DraftFileCheckResults draftFileCheckResults, List<DraftVECheckResult> list) {
        this(j, draftFileCheckResults, list, 0);
    }

    public DraftCheckResult(long j, DraftFileCheckResults draftFileCheckResults, List<DraftVECheckResult> list, int i) {
        this.checkDuration = j;
        this.fileCheckResults = draftFileCheckResults;
        this.invalidVEFileList = list;
        this.checkStage = i;
    }
}
