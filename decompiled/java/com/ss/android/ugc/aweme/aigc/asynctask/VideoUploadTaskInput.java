package com.ss.android.ugc.aweme.aigc.asynctask;

import X.C09CT;
import X.C09JG;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.aigc.asynctask.models.CommonParentTaskInput;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class VideoUploadTaskInput extends C09JG {

    @C09CT("commonParentTaskInput")
    public final CommonParentTaskInput commonParentTaskInput;

    @C09CT("creation_id")
    public final String creationId;

    @C09CT("source")
    public final Source source;

    @C09CT("file_path")
    public final String uploadFilePath;

    public VideoUploadTaskInput() {
        this(null, "", "", null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoUploadTaskInput)) {
            return false;
        }
        VideoUploadTaskInput videoUploadTaskInput = (VideoUploadTaskInput) obj;
        return this.source == videoUploadTaskInput.source && Intrinsics.LJFF(this.uploadFilePath, videoUploadTaskInput.uploadFilePath) && Intrinsics.LJFF(this.creationId, videoUploadTaskInput.creationId) && Intrinsics.LJFF(this.commonParentTaskInput, videoUploadTaskInput.commonParentTaskInput);
    }

    public final int hashCode() {
        Source source = this.source;
        int iHashCode = (((((source == null ? 0 : source.hashCode()) * 31) + this.uploadFilePath.hashCode()) * 31) + this.creationId.hashCode()) * 31;
        CommonParentTaskInput commonParentTaskInput = this.commonParentTaskInput;
        return iHashCode + (commonParentTaskInput != null ? commonParentTaskInput.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VideoUploadTaskInput(source=");
        sbLIZ.append(this.source);
        sbLIZ.append(", uploadFilePath=");
        sbLIZ.append(this.uploadFilePath);
        sbLIZ.append(", creationId=");
        sbLIZ.append(this.creationId);
        sbLIZ.append(", commonParentTaskInput=");
        sbLIZ.append(this.commonParentTaskInput);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public VideoUploadTaskInput(Source source, String str, String str2, CommonParentTaskInput commonParentTaskInput) {
        this.source = source;
        this.uploadFilePath = str;
        this.creationId = str2;
        this.commonParentTaskInput = commonParentTaskInput;
    }
}
