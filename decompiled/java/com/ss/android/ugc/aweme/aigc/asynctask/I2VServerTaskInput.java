package com.ss.android.ugc.aweme.aigc.asynctask;

import X.C09CT;
import X.C09JG;
import X.C13BV;
import X.C786410Ut5;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.aigc.asynctask.models.CommonParentTaskInput;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class I2VServerTaskInput extends C09JG {

    @C09CT("ai_creation_id")
    public String aiCreationId;

    @C09CT("algo_param")
    public final String algoParam;

    @C09CT("business_scene")
    public final String businessScene;

    @C09CT("commonParentTaskInput")
    public final CommonParentTaskInput commonParentTaskInput;

    @C09CT("creation_id")
    public final String creationId;

    @C09CT("effect_id")
    public final String effectId;

    @C09CT("extra")
    public String extra;

    @C09CT("image_url_list")
    public final List<String> imageUrlList;

    @C09CT("image_urls")
    public final List<String> imageUrls;

    @C09CT("prompt_text")
    public final String promptText;

    @C09CT("req_json")
    public final String reqJson;

    @C09CT("req_key")
    public final String reqKey;

    @C09CT("rewrite_type")
    public final String rewriteType;

    @C09CT("should_persist_image")
    public final boolean shouldPersistImage;

    @C09CT("source")
    public final Source source;

    @C09CT("task_type")
    public final String taskType;

    @C09CT("template_id")
    public final String templateId;

    @C09CT("time_out_second")
    public Long timeOutSecond;

    public I2VServerTaskInput() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, 262143, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof I2VServerTaskInput)) {
            return false;
        }
        I2VServerTaskInput i2VServerTaskInput = (I2VServerTaskInput) obj;
        return this.source == i2VServerTaskInput.source && Intrinsics.LJFF(this.creationId, i2VServerTaskInput.creationId) && Intrinsics.LJFF(this.effectId, i2VServerTaskInput.effectId) && Intrinsics.LJFF(this.templateId, i2VServerTaskInput.templateId) && Intrinsics.LJFF(this.reqKey, i2VServerTaskInput.reqKey) && Intrinsics.LJFF(this.reqJson, i2VServerTaskInput.reqJson) && Intrinsics.LJFF(this.algoParam, i2VServerTaskInput.algoParam) && Intrinsics.LJFF(this.imageUrlList, i2VServerTaskInput.imageUrlList) && Intrinsics.LJFF(this.businessScene, i2VServerTaskInput.businessScene) && Intrinsics.LJFF(this.taskType, i2VServerTaskInput.taskType) && Intrinsics.LJFF(this.promptText, i2VServerTaskInput.promptText) && Intrinsics.LJFF(this.extra, i2VServerTaskInput.extra) && Intrinsics.LJFF(this.timeOutSecond, i2VServerTaskInput.timeOutSecond) && Intrinsics.LJFF(this.commonParentTaskInput, i2VServerTaskInput.commonParentTaskInput) && Intrinsics.LJFF(this.aiCreationId, i2VServerTaskInput.aiCreationId) && Intrinsics.LJFF(this.imageUrls, i2VServerTaskInput.imageUrls) && this.shouldPersistImage == i2VServerTaskInput.shouldPersistImage && Intrinsics.LJFF(this.rewriteType, i2VServerTaskInput.rewriteType);
    }

    public final int hashCode() {
        Source source = this.source;
        int iHashCode = (((((((((((((((((((((((source == null ? 0 : source.hashCode()) * 31) + this.creationId.hashCode()) * 31) + this.effectId.hashCode()) * 31) + this.templateId.hashCode()) * 31) + this.reqKey.hashCode()) * 31) + this.reqJson.hashCode()) * 31) + this.algoParam.hashCode()) * 31) + this.imageUrlList.hashCode()) * 31) + this.businessScene.hashCode()) * 31) + this.taskType.hashCode()) * 31) + this.promptText.hashCode()) * 31) + this.extra.hashCode()) * 31;
        Long l = this.timeOutSecond;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        CommonParentTaskInput commonParentTaskInput = this.commonParentTaskInput;
        return ((((((((iHashCode2 + (commonParentTaskInput != null ? commonParentTaskInput.hashCode() : 0)) * 31) + this.aiCreationId.hashCode()) * 31) + this.imageUrls.hashCode()) * 31) + C786410Ut5.Z2(this.shouldPersistImage)) * 31) + this.rewriteType.hashCode();
    }

    public final String toString() {
        return "I2VServerTaskInput(source=" + this.source + ", creationId=" + this.creationId + ", effectId=" + this.effectId + ", templateId=" + this.templateId + ", reqKey=" + this.reqKey + ", reqJson=" + this.reqJson + ", algoParam=" + this.algoParam + ", imageUrlList=" + this.imageUrlList + ", businessScene=" + this.businessScene + ", taskType=" + this.taskType + ", promptText=" + this.promptText + ", extra=" + this.extra + ", timeOutSecond=" + this.timeOutSecond + ", commonParentTaskInput=" + this.commonParentTaskInput + ", aiCreationId=" + this.aiCreationId + ", imageUrls=" + this.imageUrls + ", shouldPersistImage=" + this.shouldPersistImage + ", rewriteType=" + this.rewriteType + ')';
    }

    public I2VServerTaskInput(Source source, String str, String str2, String str3, String str4, String str5, String str6, List<String> list, String str7, String str8, String str9, String str10, Long l, CommonParentTaskInput commonParentTaskInput, String str11, List<String> list2, boolean z, String str12) {
        this.source = source;
        this.creationId = str;
        this.effectId = str2;
        this.templateId = str3;
        this.reqKey = str4;
        this.reqJson = str5;
        this.algoParam = str6;
        this.imageUrlList = list;
        this.businessScene = str7;
        this.taskType = str8;
        this.promptText = str9;
        this.extra = str10;
        this.timeOutSecond = l;
        this.commonParentTaskInput = commonParentTaskInput;
        this.aiCreationId = str11;
        this.imageUrls = list2;
        this.shouldPersistImage = z;
        this.rewriteType = str12;
    }

    public I2VServerTaskInput(Source source, String str, String str2, String str3, String str4, String str5, String str6, List list, String str7, String str8, String str9, String str10, Long l, CommonParentTaskInput commonParentTaskInput, String str11, List list2, boolean z, String str12, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : source, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? "" : str4, (i & 32) != 0 ? "" : str5, (i & 64) != 0 ? "" : str6, (i & 128) != 0 ? C13BV.INSTANCE : list, (i & 256) != 0 ? "" : str7, (i & 512) != 0 ? "" : str8, (i & 1024) != 0 ? "" : str9, (i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? "" : str10, (i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? null : l, (i & 8192) != 0 ? null : commonParentTaskInput, (i & 16384) != 0 ? "" : str11, (32768 & i) != 0 ? C13BV.INSTANCE : list2, (65536 & i) != 0 ? false : z, (i & 131072) == 0 ? str12 : "");
    }
}
