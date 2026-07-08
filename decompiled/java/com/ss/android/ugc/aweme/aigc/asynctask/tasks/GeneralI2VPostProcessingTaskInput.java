package com.ss.android.ugc.aweme.aigc.asynctask.tasks;

import X.C09CT;
import X.C09JG;
import X.C2188811AlT;
import X.C786410Ut5;
import com.ss.android.ugc.aweme.aigc.asynctask.Source;
import com.ss.android.ugc.aweme.aigc.asynctask.models.CommonParentTaskInput;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class GeneralI2VPostProcessingTaskInput extends C09JG {

    @C09CT("commonParentTaskInput")
    public final CommonParentTaskInput commonParentTaskInput;

    @C09CT("ignore_failure")
    public final boolean ignorePostProcessingFailure;

    @C09CT("outputPath")
    public final String outputPath;

    @C09CT("photoFileLocalPath")
    public final String photoFileLocalPath;

    @C09CT("resourceId")
    public final String resourceId;

    @C09CT("source")
    public final Source source;

    @C09CT("template_type")
    public final int templateType;

    @C09CT("videoFileLocalPath")
    public final String videoFileLocalPath;

    public GeneralI2VPostProcessingTaskInput() {
        this("", "", "", 0, "", null, null, true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GeneralI2VPostProcessingTaskInput)) {
            return false;
        }
        GeneralI2VPostProcessingTaskInput generalI2VPostProcessingTaskInput = (GeneralI2VPostProcessingTaskInput) obj;
        return Intrinsics.LJFF(this.videoFileLocalPath, generalI2VPostProcessingTaskInput.videoFileLocalPath) && Intrinsics.LJFF(this.photoFileLocalPath, generalI2VPostProcessingTaskInput.photoFileLocalPath) && Intrinsics.LJFF(this.resourceId, generalI2VPostProcessingTaskInput.resourceId) && this.templateType == generalI2VPostProcessingTaskInput.templateType && Intrinsics.LJFF(this.outputPath, generalI2VPostProcessingTaskInput.outputPath) && this.source == generalI2VPostProcessingTaskInput.source && Intrinsics.LJFF(this.commonParentTaskInput, generalI2VPostProcessingTaskInput.commonParentTaskInput) && this.ignorePostProcessingFailure == generalI2VPostProcessingTaskInput.ignorePostProcessingFailure;
    }

    public final int hashCode() {
        int iHashCode = ((((((((this.videoFileLocalPath.hashCode() * 31) + this.photoFileLocalPath.hashCode()) * 31) + this.resourceId.hashCode()) * 31) + this.templateType) * 31) + this.outputPath.hashCode()) * 31;
        Source source = this.source;
        int iHashCode2 = (iHashCode + (source == null ? 0 : source.hashCode())) * 31;
        CommonParentTaskInput commonParentTaskInput = this.commonParentTaskInput;
        return ((iHashCode2 + (commonParentTaskInput != null ? commonParentTaskInput.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.ignorePostProcessingFailure);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GeneralI2VPostProcessingTaskInput(videoFileLocalPath=");
        sbLIZ.append(this.videoFileLocalPath);
        sbLIZ.append(", photoFileLocalPath=");
        sbLIZ.append(this.photoFileLocalPath);
        sbLIZ.append(", resourceId=");
        sbLIZ.append(this.resourceId);
        sbLIZ.append(", templateType=");
        sbLIZ.append(this.templateType);
        sbLIZ.append(", outputPath=");
        sbLIZ.append(this.outputPath);
        sbLIZ.append(", source=");
        sbLIZ.append(this.source);
        sbLIZ.append(", commonParentTaskInput=");
        sbLIZ.append(this.commonParentTaskInput);
        sbLIZ.append(", ignorePostProcessingFailure=");
        sbLIZ.append(this.ignorePostProcessingFailure);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public GeneralI2VPostProcessingTaskInput(String str, String str2, String str3, int i, String str4, Source source, CommonParentTaskInput commonParentTaskInput, boolean z) {
        this.videoFileLocalPath = str;
        this.photoFileLocalPath = str2;
        this.resourceId = str3;
        this.templateType = i;
        this.outputPath = str4;
        this.source = source;
        this.commonParentTaskInput = commonParentTaskInput;
        this.ignorePostProcessingFailure = z;
    }
}
