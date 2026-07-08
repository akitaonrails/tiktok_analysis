package com.ss.android.ugc.aweme.aigc.asynctask;

import X.C09CT;
import X.C09JG;
import X.C13BV;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.aigc.asynctask.models.CommonParentTaskInput;
import com.ss.android.ugc.aweme.creative.model.aigc.AIGCResultType;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class CreationDownloadTaskInput extends C09JG {

    @C09CT("commonParentTaskInput")
    public final CommonParentTaskInput commonParentTaskInput;

    @C09CT("creation_id")
    public final String creationId;

    @C09CT("creation_version")
    public final int creationVersion;

    @C09CT("download_file_dir")
    public final String downloadFileDir;

    @C09CT("file_url")
    public final String fileUrl;

    @C09CT("fileUrlList")
    public final List<AIGCServerTaskOutput> fileUrlList;

    @C09CT("file_url_type")
    public final AIGCResultType fileUrlType;

    @C09CT("source")
    public final Source source;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CreationDownloadTaskInput)) {
            return false;
        }
        CreationDownloadTaskInput creationDownloadTaskInput = (CreationDownloadTaskInput) obj;
        return this.source == creationDownloadTaskInput.source && Intrinsics.LJFF(this.fileUrl, creationDownloadTaskInput.fileUrl) && Intrinsics.LJFF(this.downloadFileDir, creationDownloadTaskInput.downloadFileDir) && Intrinsics.LJFF(this.creationId, creationDownloadTaskInput.creationId) && this.creationVersion == creationDownloadTaskInput.creationVersion && Intrinsics.LJFF(this.fileUrlList, creationDownloadTaskInput.fileUrlList) && Intrinsics.LJFF(this.commonParentTaskInput, creationDownloadTaskInput.commonParentTaskInput) && this.fileUrlType == creationDownloadTaskInput.fileUrlType;
    }

    public final int hashCode() {
        Source source = this.source;
        int iHashCode = (((((((((((source == null ? 0 : source.hashCode()) * 31) + this.fileUrl.hashCode()) * 31) + this.downloadFileDir.hashCode()) * 31) + this.creationId.hashCode()) * 31) + this.creationVersion) * 31) + this.fileUrlList.hashCode()) * 31;
        CommonParentTaskInput commonParentTaskInput = this.commonParentTaskInput;
        return ((iHashCode + (commonParentTaskInput != null ? commonParentTaskInput.hashCode() : 0)) * 31) + this.fileUrlType.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CreationDownloadTaskInput(source=");
        sbLIZ.append(this.source);
        sbLIZ.append(", fileUrl=");
        sbLIZ.append(this.fileUrl);
        sbLIZ.append(", downloadFileDir=");
        sbLIZ.append(this.downloadFileDir);
        sbLIZ.append(", creationId=");
        sbLIZ.append(this.creationId);
        sbLIZ.append(", creationVersion=");
        sbLIZ.append(this.creationVersion);
        sbLIZ.append(", fileUrlList=");
        sbLIZ.append(this.fileUrlList);
        sbLIZ.append(", commonParentTaskInput=");
        sbLIZ.append(this.commonParentTaskInput);
        sbLIZ.append(", fileUrlType=");
        sbLIZ.append(this.fileUrlType);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public CreationDownloadTaskInput(Source source, String str, String str2, String str3, int i, List<AIGCServerTaskOutput> list, CommonParentTaskInput commonParentTaskInput, AIGCResultType aIGCResultType) {
        this.source = source;
        this.fileUrl = str;
        this.downloadFileDir = str2;
        this.creationId = str3;
        this.creationVersion = i;
        this.fileUrlList = list;
        this.commonParentTaskInput = commonParentTaskInput;
        this.fileUrlType = aIGCResultType;
    }

    public CreationDownloadTaskInput(Source source, String str, String str2, String str3, int i, List list, CommonParentTaskInput commonParentTaskInput, AIGCResultType aIGCResultType, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : source, (i2 & 2) != 0 ? "" : str, str2, (i2 & 8) == 0 ? str3 : "", (i2 & 16) != 0 ? 0 : i, (i2 & 32) != 0 ? C13BV.INSTANCE : list, (i2 & 64) == 0 ? commonParentTaskInput : null, (i2 & 128) != 0 ? AIGCResultType.VIDEO : aIGCResultType);
    }
}
