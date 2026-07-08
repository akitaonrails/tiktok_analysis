package com.ss.android.ugc.aweme.aigc.asynctask.models;

import X.C09CT;
import X.C0LMJ;
import X.C13BV;
import X.C2097608Jq;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.aigc.asynctask.CompositionMediaItem;
import com.ss.android.ugc.aweme.creative.model.aigc.AIGCInputItem;
import com.ss.android.ugc.aweme.creative.model.editorpro.EditorProAIGCStylizedAiStage;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes9.dex */
public final class CommonParentTaskInput {

    @C09CT("ai_create_stylized_type")
    public final int aiCreateStylizedType;

    @C09CT("algoReq")
    public final String algoReq;

    @C09CT("aspectRatio")
    public final String aspectRatio;

    @C09CT("biz_extras")
    public final Map<String, String> bizExtras;

    @C09CT("businessScene")
    public final String businessScene;

    @C09CT("composition_media_items")
    public final List<CompositionMediaItem> compositionMediaItems;

    @C09CT("creation_id")
    public final String creationId;

    @C09CT("duration")
    public final int duration;

    @C09CT("effectId")
    public final String effectId;

    @C09CT("entrance_scene")
    public final String entranceScene;

    @C09CT("generate_extra")
    public Map<String, String> generateExtra;

    @C09CT("grade_down_server_task_id")
    public final String gradeDownServerTaskId;

    @C09CT("ignore_postprocessing_failure")
    public final boolean ignorePostProcessingFailure;

    @C09CT("input_items")
    public final List<AIGCInputItem> inputItems;

    @C09CT("is_from_grade_down")
    public final boolean isFromGradeDown;

    @C09CT("jobType")
    public final String jobType;

    @C09CT("output_count")
    public final int outputCount;

    @C09CT("prompt_text")
    public final String promptText;

    @C09CT("reqJson")
    public final String reqJson;

    @C09CT("resource_id")
    public final String resourceId;

    @C09CT("resource_key")
    public final String resourceKey;

    @C09CT("server_task_id")
    public final String serverTaskId;

    @C09CT("should_skip_to_polling")
    public boolean shouldSkipToPolling;

    @C09CT("style")
    public final int style;

    @C09CT("stylized_ai_stages")
    public final List<EditorProAIGCStylizedAiStage> stylizedAiStages;

    @C09CT("taskType")
    public final String taskType;

    @C09CT("template_id")
    public final String templateId;

    @C09CT("template_type")
    public final int templateType;

    @C09CT("trigger_type")
    public final String triggerType;

    @C09CT("videoSlotId")
    public final String videoSlotId;

    public CommonParentTaskInput() {
        this(null, null, null, null, 0, 0, null, null, null, null, null, null, null, null, null, 0, null, null, null, null, false, 0, null, null, null, false, false, null, 0, null, 1073741823, null);
    }

    public final String toString() {
        return "CommonParentTaskInput(algoReq=" + this.algoReq + ", inputItems=" + this.inputItems + ", videoSlotId=" + this.videoSlotId + ", promptText=" + this.promptText + ", style=" + this.style + ", duration=" + this.duration + ", aspectRatio=" + this.aspectRatio + ", effectId=" + this.effectId + ", businessScene=" + this.businessScene + ", jobType=" + this.jobType + ", entranceScene=" + this.entranceScene + ", resourceId=" + this.resourceId + ", serverTaskId=" + this.serverTaskId + ", creationId=" + this.creationId + ", reqJson=" + this.reqJson + ", templateType=" + this.templateType + ", templateId=" + this.templateId + ", triggerType=" + this.triggerType + ", taskType=" + this.taskType + ", bizExtras=" + this.bizExtras + ", ignorePostProcessingFailure=" + this.ignorePostProcessingFailure + ", outputCount=" + this.outputCount + ", generateExtra=" + this.generateExtra + ", compositionMediaItems=" + this.compositionMediaItems + ", resourceKey=" + this.resourceKey + ", isFromGradeDown=" + this.isFromGradeDown + ", shouldSkipToPolling=" + this.shouldSkipToPolling + ", gradeDownServerTaskId=" + this.gradeDownServerTaskId + ", aiCreateStylizedType=" + this.aiCreateStylizedType + ", stylizedAiStages=" + this.stylizedAiStages + ')';
    }

    public final List<String> LIZIZ() {
        List<String> listLIZ = C0LMJ.LIZ(this.inputItems);
        return listLIZ == null ? C13BV.INSTANCE : listLIZ;
    }

    public static CommonParentTaskInput LIZ(CommonParentTaskInput commonParentTaskInput, String str, String str2, String str3, boolean z, boolean z2, String str4, int i) {
        String str5;
        List<AIGCInputItem> list;
        String str6;
        String str7;
        int i2;
        int i3;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        int i4;
        String str14;
        String str15;
        String str16;
        Map<String, String> map;
        boolean z3;
        int i5;
        Map<String, String> map2;
        List<CompositionMediaItem> list2;
        String str17;
        int i6;
        boolean z4 = z2;
        String str18 = str4;
        String str19 = str3;
        boolean z5 = z;
        String str20 = str2;
        String str21 = str;
        List<EditorProAIGCStylizedAiStage> list3 = null;
        if ((i & 1) != 0) {
            str5 = commonParentTaskInput.algoReq;
        } else {
            str5 = null;
        }
        if ((i & 2) != 0) {
            list = commonParentTaskInput.inputItems;
        } else {
            list = null;
        }
        if ((i & 4) != 0) {
            str6 = commonParentTaskInput.videoSlotId;
        } else {
            str6 = null;
        }
        if ((i & 8) != 0) {
            str7 = commonParentTaskInput.promptText;
        } else {
            str7 = null;
        }
        if ((i & 16) != 0) {
            i2 = commonParentTaskInput.style;
        } else {
            i2 = 0;
        }
        if ((i & 32) != 0) {
            i3 = commonParentTaskInput.duration;
        } else {
            i3 = 0;
        }
        if ((i & 64) != 0) {
            str8 = commonParentTaskInput.aspectRatio;
        } else {
            str8 = null;
        }
        if ((i & 128) != 0) {
            str9 = commonParentTaskInput.effectId;
        } else {
            str9 = null;
        }
        if ((i & 256) != 0) {
            str10 = commonParentTaskInput.businessScene;
        } else {
            str10 = null;
        }
        if ((i & 512) != 0) {
            str11 = commonParentTaskInput.jobType;
        } else {
            str11 = null;
        }
        if ((i & 1024) != 0) {
            str12 = commonParentTaskInput.entranceScene;
        } else {
            str12 = null;
        }
        if ((i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            str21 = commonParentTaskInput.resourceId;
        }
        if ((i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            str20 = commonParentTaskInput.serverTaskId;
        }
        if ((i & 8192) != 0) {
            str19 = commonParentTaskInput.creationId;
        }
        if ((i & 16384) != 0) {
            str13 = commonParentTaskInput.reqJson;
        } else {
            str13 = null;
        }
        if ((32768 & i) != 0) {
            i4 = commonParentTaskInput.templateType;
        } else {
            i4 = 0;
        }
        if ((65536 & i) != 0) {
            str14 = commonParentTaskInput.templateId;
        } else {
            str14 = null;
        }
        if ((131072 & i) != 0) {
            str15 = commonParentTaskInput.triggerType;
        } else {
            str15 = null;
        }
        if ((262144 & i) != 0) {
            str16 = commonParentTaskInput.taskType;
        } else {
            str16 = null;
        }
        if ((524288 & i) != 0) {
            map = commonParentTaskInput.bizExtras;
        } else {
            map = null;
        }
        if ((1048576 & i) != 0) {
            z3 = commonParentTaskInput.ignorePostProcessingFailure;
        } else {
            z3 = false;
        }
        if ((2097152 & i) != 0) {
            i5 = commonParentTaskInput.outputCount;
        } else {
            i5 = 0;
        }
        if ((4194304 & i) != 0) {
            map2 = commonParentTaskInput.generateExtra;
        } else {
            map2 = null;
        }
        if ((8388608 & i) != 0) {
            list2 = commonParentTaskInput.compositionMediaItems;
        } else {
            list2 = null;
        }
        if ((16777216 & i) != 0) {
            str17 = commonParentTaskInput.resourceKey;
        } else {
            str17 = null;
        }
        if ((33554432 & i) != 0) {
            z5 = commonParentTaskInput.isFromGradeDown;
        }
        if ((67108864 & i) != 0) {
            z4 = commonParentTaskInput.shouldSkipToPolling;
        }
        if ((134217728 & i) != 0) {
            str18 = commonParentTaskInput.gradeDownServerTaskId;
        }
        if ((268435456 & i) != 0) {
            i6 = commonParentTaskInput.aiCreateStylizedType;
        } else {
            i6 = 0;
        }
        if ((i & 536870912) != 0) {
            list3 = commonParentTaskInput.stylizedAiStages;
        }
        return new CommonParentTaskInput(str5, list, str6, str7, i2, i3, str8, str9, str10, str11, str12, str21, str20, str19, str13, i4, str14, str15, str16, map, z3, i5, map2, list2, str17, z5, z4, str18, i6, list3);
    }

    public CommonParentTaskInput(String str, List<AIGCInputItem> list, String str2, String str3, int i, int i2, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, int i3, String str13, String str14, String str15, Map<String, String> map, boolean z, int i4, Map<String, String> map2, List<CompositionMediaItem> list2, String str16, boolean z2, boolean z3, String str17, int i5, List<EditorProAIGCStylizedAiStage> list3) {
        this.algoReq = str;
        this.inputItems = list;
        this.videoSlotId = str2;
        this.promptText = str3;
        this.style = i;
        this.duration = i2;
        this.aspectRatio = str4;
        this.effectId = str5;
        this.businessScene = str6;
        this.jobType = str7;
        this.entranceScene = str8;
        this.resourceId = str9;
        this.serverTaskId = str10;
        this.creationId = str11;
        this.reqJson = str12;
        this.templateType = i3;
        this.templateId = str13;
        this.triggerType = str14;
        this.taskType = str15;
        this.bizExtras = map;
        this.ignorePostProcessingFailure = z;
        this.outputCount = i4;
        this.generateExtra = map2;
        this.compositionMediaItems = list2;
        this.resourceKey = str16;
        this.isFromGradeDown = z2;
        this.shouldSkipToPolling = z3;
        this.gradeDownServerTaskId = str17;
        this.aiCreateStylizedType = i5;
        this.stylizedAiStages = list3;
    }

    public CommonParentTaskInput(String str, List list, String str2, String str3, int i, int i2, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, int i3, String str13, String str14, String str15, Map map, boolean z, int i4, Map map2, List list2, String str16, boolean z2, boolean z3, String str17, int i5, List list3, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this((i6 & 1) != 0 ? "" : str, (i6 & 2) != 0 ? null : list, (i6 & 4) != 0 ? "" : str2, (i6 & 8) != 0 ? "" : str3, (i6 & 16) != 0 ? 0 : i, (i6 & 32) != 0 ? 0 : i2, (i6 & 64) != 0 ? "" : str4, (i6 & 128) != 0 ? "" : str5, (i6 & 256) != 0 ? "" : str6, (i6 & 512) != 0 ? "" : str7, (i6 & 1024) != 0 ? "" : str8, (i6 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? "" : str9, (i6 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? "" : str10, (i6 & 8192) != 0 ? "" : str11, (i6 & 16384) != 0 ? "" : str12, (32768 & i6) != 0 ? 0 : i3, (65536 & i6) != 0 ? "" : str13, (131072 & i6) != 0 ? "" : str14, (262144 & i6) != 0 ? "" : str15, (524288 & i6) != 0 ? C2097608Jq.LJ() : map, (1048576 & i6) != 0 ? true : z, (2097152 & i6) != 0 ? 0 : i4, (4194304 & i6) != 0 ? null : map2, (8388608 & i6) != 0 ? null : list2, (16777216 & i6) != 0 ? "" : str16, (33554432 & i6) != 0 ? false : z2, (67108864 & i6) != 0 ? false : z3, (134217728 & i6) == 0 ? str17 : "", (268435456 & i6) != 0 ? 0 : i5, (i6 & 536870912) != 0 ? C13BV.INSTANCE : list3);
    }
}
