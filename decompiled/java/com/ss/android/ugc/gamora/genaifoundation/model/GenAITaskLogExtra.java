package com.ss.android.ugc.gamora.genaifoundation.model;

import X.C09CT;
import X.C2097608Jq;
import X.C786410Ut5;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class GenAITaskLogExtra {

    @C09CT("aigc_workflow_status")
    public String aigcWorkflowStatus;

    @C09CT("biz_extras")
    public Map<String, String> bizExtras;

    @C09CT("creation_id")
    public String creationId;

    @C09CT("end_time")
    public long endTime;

    @C09CT("entranceScene")
    public String entranceScene;

    @C09CT("error_source")
    public String errorSource;

    @C09CT("generate_log_id")
    public String generateLogId;

    @C09CT("has_mob_result")
    public boolean hasMobResult;

    @C09CT("has_mob_start")
    public boolean hasMobStart;

    @C09CT("input_file_size")
    public long inputFileSize;

    @C09CT("input_file_type")
    public String inputFileType;

    @C09CT("is_from_downgrade")
    public boolean isFromDowngrade;

    @C09CT("server_task_status")
    public int serverTaskStatus;

    @C09CT("task_type")
    public final String serverTaskType;

    @C09CT("generate_task_id")
    public String taskLogId;

    @C09CT("template_img_path")
    public String templateImgPath;

    @C09CT("template_resource_id")
    public String templateResourceId;

    @C09CT("template_type")
    public int templateType;

    @C09CT("trigger_type")
    public String triggerType;

    @C09CT("upload_uris")
    public List<String> uploadUris;

    public GenAITaskLogExtra() {
        this(0L, "", null, null, false, false, "", 0, "", "", "", "", 0, "", "", "", 0L, null, false, C2097608Jq.LJ());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GenAITaskLogExtra)) {
            return false;
        }
        GenAITaskLogExtra genAITaskLogExtra = (GenAITaskLogExtra) obj;
        return this.inputFileSize == genAITaskLogExtra.inputFileSize && Intrinsics.LJFF(this.inputFileType, genAITaskLogExtra.inputFileType) && Intrinsics.LJFF(this.generateLogId, genAITaskLogExtra.generateLogId) && Intrinsics.LJFF(this.taskLogId, genAITaskLogExtra.taskLogId) && this.hasMobStart == genAITaskLogExtra.hasMobStart && this.hasMobResult == genAITaskLogExtra.hasMobResult && Intrinsics.LJFF(this.triggerType, genAITaskLogExtra.triggerType) && this.templateType == genAITaskLogExtra.templateType && Intrinsics.LJFF(this.templateResourceId, genAITaskLogExtra.templateResourceId) && Intrinsics.LJFF(this.templateImgPath, genAITaskLogExtra.templateImgPath) && Intrinsics.LJFF(this.creationId, genAITaskLogExtra.creationId) && Intrinsics.LJFF(this.aigcWorkflowStatus, genAITaskLogExtra.aigcWorkflowStatus) && this.serverTaskStatus == genAITaskLogExtra.serverTaskStatus && Intrinsics.LJFF(this.serverTaskType, genAITaskLogExtra.serverTaskType) && Intrinsics.LJFF(this.entranceScene, genAITaskLogExtra.entranceScene) && Intrinsics.LJFF(this.errorSource, genAITaskLogExtra.errorSource) && this.endTime == genAITaskLogExtra.endTime && Intrinsics.LJFF(this.uploadUris, genAITaskLogExtra.uploadUris) && this.isFromDowngrade == genAITaskLogExtra.isFromDowngrade && Intrinsics.LJFF(this.bizExtras, genAITaskLogExtra.bizExtras);
    }

    public final int hashCode() {
        int iY2 = ((C786410Ut5.Y2(this.inputFileSize) * 31) + this.inputFileType.hashCode()) * 31;
        String str = this.generateLogId;
        int iHashCode = (iY2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.taskLogId;
        int iHashCode2 = (((((((((((((((((((((((((((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + C786410Ut5.Z2(this.hasMobStart)) * 31) + C786410Ut5.Z2(this.hasMobResult)) * 31) + this.triggerType.hashCode()) * 31) + this.templateType) * 31) + this.templateResourceId.hashCode()) * 31) + this.templateImgPath.hashCode()) * 31) + this.creationId.hashCode()) * 31) + this.aigcWorkflowStatus.hashCode()) * 31) + this.serverTaskStatus) * 31) + this.serverTaskType.hashCode()) * 31) + this.entranceScene.hashCode()) * 31) + this.errorSource.hashCode()) * 31) + C786410Ut5.Y2(this.endTime)) * 31;
        List<String> list = this.uploadUris;
        return ((((iHashCode2 + (list != null ? list.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.isFromDowngrade)) * 31) + this.bizExtras.hashCode();
    }

    public final String toString() {
        return "GenAITaskLogExtra(inputFileSize=" + this.inputFileSize + ", inputFileType=" + this.inputFileType + ", generateLogId=" + this.generateLogId + ", taskLogId=" + this.taskLogId + ", hasMobStart=" + this.hasMobStart + ", hasMobResult=" + this.hasMobResult + ", triggerType=" + this.triggerType + ", templateType=" + this.templateType + ", templateResourceId=" + this.templateResourceId + ", templateImgPath=" + this.templateImgPath + ", creationId=" + this.creationId + ", aigcWorkflowStatus=" + this.aigcWorkflowStatus + ", serverTaskStatus=" + this.serverTaskStatus + ", serverTaskType=" + this.serverTaskType + ", entranceScene=" + this.entranceScene + ", errorSource=" + this.errorSource + ", endTime=" + this.endTime + ", uploadUris=" + this.uploadUris + ", isFromDowngrade=" + this.isFromDowngrade + ", bizExtras=" + this.bizExtras + ')';
    }

    public GenAITaskLogExtra(long j, String str, String str2, String str3, boolean z, boolean z2, String str4, int i, String str5, String str6, String str7, String str8, int i2, String str9, String str10, String str11, long j2, List<String> list, boolean z3, Map<String, String> map) {
        this.inputFileSize = j;
        this.inputFileType = str;
        this.generateLogId = str2;
        this.taskLogId = str3;
        this.hasMobStart = z;
        this.hasMobResult = z2;
        this.triggerType = str4;
        this.templateType = i;
        this.templateResourceId = str5;
        this.templateImgPath = str6;
        this.creationId = str7;
        this.aigcWorkflowStatus = str8;
        this.serverTaskStatus = i2;
        this.serverTaskType = str9;
        this.entranceScene = str10;
        this.errorSource = str11;
        this.endTime = j2;
        this.uploadUris = list;
        this.isFromDowngrade = z3;
        this.bizExtras = map;
    }
}
