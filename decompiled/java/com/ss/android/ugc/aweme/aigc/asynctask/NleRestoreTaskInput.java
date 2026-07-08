package com.ss.android.ugc.aweme.aigc.asynctask;

import X.C09CT;
import X.C09JG;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.aigc.asynctask.models.CommonParentTaskInput;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class NleRestoreTaskInput extends C09JG {

    @C09CT("commonParentTaskInput")
    public final CommonParentTaskInput commonParentTaskInput;

    @C09CT("creation_id")
    public final String creationId;

    @C09CT("creation_version")
    public final int creationVersion;

    @C09CT("file_url")
    public final String fileUrl;

    @C09CT("nle_draft")
    public final String nleDraft;

    @C09CT("source")
    public final Source source;

    public NleRestoreTaskInput() {
        this(null, "", "", "", 0, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NleRestoreTaskInput)) {
            return false;
        }
        NleRestoreTaskInput nleRestoreTaskInput = (NleRestoreTaskInput) obj;
        return this.source == nleRestoreTaskInput.source && Intrinsics.LJFF(this.fileUrl, nleRestoreTaskInput.fileUrl) && Intrinsics.LJFF(this.nleDraft, nleRestoreTaskInput.nleDraft) && Intrinsics.LJFF(this.creationId, nleRestoreTaskInput.creationId) && this.creationVersion == nleRestoreTaskInput.creationVersion && Intrinsics.LJFF(this.commonParentTaskInput, nleRestoreTaskInput.commonParentTaskInput);
    }

    public final int hashCode() {
        Source source = this.source;
        int iHashCode = (((((((((source == null ? 0 : source.hashCode()) * 31) + this.fileUrl.hashCode()) * 31) + this.nleDraft.hashCode()) * 31) + this.creationId.hashCode()) * 31) + this.creationVersion) * 31;
        CommonParentTaskInput commonParentTaskInput = this.commonParentTaskInput;
        return iHashCode + (commonParentTaskInput != null ? commonParentTaskInput.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("NleRestoreTaskInput(source=");
        sbLIZ.append(this.source);
        sbLIZ.append(", fileUrl=");
        sbLIZ.append(this.fileUrl);
        sbLIZ.append(", nleDraft=");
        sbLIZ.append(this.nleDraft);
        sbLIZ.append(", creationId=");
        sbLIZ.append(this.creationId);
        sbLIZ.append(", creationVersion=");
        sbLIZ.append(this.creationVersion);
        sbLIZ.append(", commonParentTaskInput=");
        sbLIZ.append(this.commonParentTaskInput);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public NleRestoreTaskInput(Source source, String str, String str2, String str3, int i, CommonParentTaskInput commonParentTaskInput) {
        this.source = source;
        this.fileUrl = str;
        this.nleDraft = str2;
        this.creationId = str3;
        this.creationVersion = i;
        this.commonParentTaskInput = commonParentTaskInput;
    }
}
