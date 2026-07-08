package com.ss.android.ugc.aweme.draft.model;

import X.C2188811AlT;

/* JADX INFO: loaded from: classes9.dex */
public final class DraftFileCheckResult {
    public final int errorCode;
    public final String existPath;
    public final String fieldInfo;
    public String fieldPath;
    public Boolean fileCompensation;
    public final String fileName;
    public final String originPath;
    public final String relativeDir;

    public DraftFileCheckResult() {
        this(0, null, null, null, null, null, Boolean.FALSE, null);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DraftFileCheckResult(errorCode=");
        sbLIZ.append(this.errorCode);
        sbLIZ.append(", existPath=");
        sbLIZ.append(this.existPath);
        sbLIZ.append(", originPath=");
        sbLIZ.append(this.originPath);
        sbLIZ.append(", fieldInfo=");
        sbLIZ.append(this.fieldInfo);
        sbLIZ.append(", relativeDir=");
        sbLIZ.append(this.relativeDir);
        sbLIZ.append(", fileName=");
        sbLIZ.append(this.fileName);
        sbLIZ.append(", fileCompensation=");
        sbLIZ.append(this.fileCompensation);
        sbLIZ.append(", fieldPath=");
        sbLIZ.append(this.fieldPath);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean isSuc() {
        return this.errorCode == 0;
    }

    public final void setFieldPath(String str) {
        this.fieldPath = str;
    }

    public final void setFileCompensation(Boolean bool) {
        this.fileCompensation = bool;
    }

    public DraftFileCheckResult(int i, String str, String str2, String str3, String str4, String str5, Boolean bool, String str6) {
        this.errorCode = i;
        this.existPath = str;
        this.originPath = str2;
        this.fieldInfo = str3;
        this.relativeDir = str4;
        this.fileName = str5;
        this.fileCompensation = bool;
        this.fieldPath = str6;
    }
}
