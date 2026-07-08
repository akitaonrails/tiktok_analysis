package com.ss.android.ugc.aweme.aigc.asynctask;

import X.C09CT;
import X.C2097608Jq;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class TaskLogExtra {

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

    public TaskLogExtra() {
        this(0L, "", null, null, false, false, "", 0, "", "", "", "", 0, "", "", "", 0L, null, false, C2097608Jq.LJ());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TaskLogExtra)) {
            return false;
        }
        TaskLogExtra taskLogExtra = (TaskLogExtra) obj;
        return this.inputFileSize == taskLogExtra.inputFileSize && Intrinsics.LJFF(this.inputFileType, taskLogExtra.inputFileType) && Intrinsics.LJFF(this.generateLogId, taskLogExtra.generateLogId) && Intrinsics.LJFF(this.taskLogId, taskLogExtra.taskLogId) && this.hasMobStart == taskLogExtra.hasMobStart && this.hasMobResult == taskLogExtra.hasMobResult && Intrinsics.LJFF(this.triggerType, taskLogExtra.triggerType) && this.templateType == taskLogExtra.templateType && Intrinsics.LJFF(this.templateResourceId, taskLogExtra.templateResourceId) && Intrinsics.LJFF(this.templateImgPath, taskLogExtra.templateImgPath) && Intrinsics.LJFF(this.creationId, taskLogExtra.creationId) && Intrinsics.LJFF(this.aigcWorkflowStatus, taskLogExtra.aigcWorkflowStatus) && this.serverTaskStatus == taskLogExtra.serverTaskStatus && Intrinsics.LJFF(this.serverTaskType, taskLogExtra.serverTaskType) && Intrinsics.LJFF(this.entranceScene, taskLogExtra.entranceScene) && Intrinsics.LJFF(this.errorSource, taskLogExtra.errorSource) && this.endTime == taskLogExtra.endTime && Intrinsics.LJFF(this.uploadUris, taskLogExtra.uploadUris) && this.isFromDowngrade == taskLogExtra.isFromDowngrade && Intrinsics.LJFF(this.bizExtras, taskLogExtra.bizExtras);
    }

    public final String toString() {
        return "TaskLogExtra(inputFileSize=" + this.inputFileSize + ", inputFileType=" + this.inputFileType + ", generateLogId=" + this.generateLogId + ", taskLogId=" + this.taskLogId + ", hasMobStart=" + this.hasMobStart + ", hasMobResult=" + this.hasMobResult + ", triggerType=" + this.triggerType + ", templateType=" + this.templateType + ", templateResourceId=" + this.templateResourceId + ", templateImgPath=" + this.templateImgPath + ", creationId=" + this.creationId + ", aigcWorkflowStatus=" + this.aigcWorkflowStatus + ", serverTaskStatus=" + this.serverTaskStatus + ", serverTaskType=" + this.serverTaskType + ", entranceScene=" + this.entranceScene + ", errorSource=" + this.errorSource + ", endTime=" + this.endTime + ", uploadUris=" + this.uploadUris + ", isFromDowngrade=" + this.isFromDowngrade + ", bizExtras=" + this.bizExtras + ')';
    }

    public static TaskLogExtra LIZ(TaskLogExtra taskLogExtra, String str, String str2, String str3, String str4, int i, String str5, String str6, String str7, List list, boolean z, Map map, int i2) {
        long j;
        String str8;
        String str9;
        boolean z2;
        boolean z3;
        int i3;
        String str10;
        Map map2 = map;
        String str11 = str5;
        String str12 = str4;
        boolean z4 = z;
        String str13 = str7;
        String str14 = str6;
        String str15 = str;
        List list2 = list;
        String str16 = str3;
        String str17 = str2;
        int i4 = i;
        long j2 = 0;
        if ((i2 & 1) != 0) {
            j = taskLogExtra.inputFileSize;
        } else {
            j = 0;
        }
        String str18 = null;
        if ((i2 & 2) != 0) {
            str8 = taskLogExtra.inputFileType;
        } else {
            str8 = null;
        }
        if ((i2 & 4) != 0) {
            str15 = taskLogExtra.generateLogId;
        }
        if ((i2 & 8) != 0) {
            str9 = taskLogExtra.taskLogId;
        } else {
            str9 = null;
        }
        if ((i2 & 16) != 0) {
            z2 = taskLogExtra.hasMobStart;
        } else {
            z2 = false;
        }
        if ((i2 & 32) != 0) {
            z3 = taskLogExtra.hasMobResult;
        } else {
            z3 = false;
        }
        if ((i2 & 64) != 0) {
            str17 = taskLogExtra.triggerType;
        }
        if ((i2 & 128) != 0) {
            i3 = taskLogExtra.templateType;
        } else {
            i3 = 0;
        }
        if ((i2 & 256) != 0) {
            str10 = taskLogExtra.templateResourceId;
        } else {
            str10 = null;
        }
        if ((i2 & 512) != 0) {
            str18 = taskLogExtra.templateImgPath;
        }
        if ((i2 & 1024) != 0) {
            str16 = taskLogExtra.creationId;
        }
        if ((i2 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            str12 = taskLogExtra.aigcWorkflowStatus;
        }
        if ((i2 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            i4 = taskLogExtra.serverTaskStatus;
        }
        if ((i2 & 8192) != 0) {
            str11 = taskLogExtra.serverTaskType;
        }
        if ((i2 & 16384) != 0) {
            str14 = taskLogExtra.entranceScene;
        }
        if ((32768 & i2) != 0) {
            str13 = taskLogExtra.errorSource;
        }
        if ((65536 & i2) != 0) {
            j2 = taskLogExtra.endTime;
        }
        if ((131072 & i2) != 0) {
            list2 = taskLogExtra.uploadUris;
        }
        if ((262144 & i2) != 0) {
            z4 = taskLogExtra.isFromDowngrade;
        }
        if ((i2 & 524288) != 0) {
            map2 = taskLogExtra.bizExtras;
        }
        taskLogExtra.getClass();
        return new TaskLogExtra(j, str8, str15, str9, z2, z3, str17, i3, str10, str18, str16, str12, i4, str11, str14, str13, j2, list2, z4, map2);
    }

    public TaskLogExtra(long j, String str, String str2, String str3, boolean z, boolean z2, String str4, int i, String str5, String str6, String str7, String str8, int i2, String str9, String str10, String str11, long j2, List<String> list, boolean z3, Map<String, String> map) {
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
