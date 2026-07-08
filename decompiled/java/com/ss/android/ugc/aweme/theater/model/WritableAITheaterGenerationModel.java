package com.ss.android.ugc.aweme.theater.model;

import X.C040H;
import X.C09CT;
import X.C0MY0;
import X.C13BV;
import X.C786410Ut5;
import X.EnumC547830Le9;
import X.InterfaceC2270808v4;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.creative.model.aigc.WritableAIGCGenerationModel;
import com.ss.android.ugc.aweme.creative.model.common.InputBlock;
import com.ss.android.ugc.aweme.creative.model.common.MentionDataItem;
import com.ss.android.ugc.aweme.creative.model.common.UsageStatus;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.theater.model.WritableAITheaterGenerationModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class WritableAITheaterGenerationModel implements WritableAIGCGenerationModel, AITheaterGenerationModel, Parcelable {
    public static final Parcelable.Creator<WritableAITheaterGenerationModel> CREATOR = new Parcelable.Creator<WritableAITheaterGenerationModel>() { // from class: X.0Led
        @Override // android.os.Parcelable.Creator
        public final WritableAITheaterGenerationModel createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(parcel.readParcelable(WritableAITheaterGenerationModel.class.getClassLoader()));
            }
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int i3 = parcel.readInt();
                linkedHashMap = new LinkedHashMap(i3);
                for (int i4 = 0; i4 != i3; i4++) {
                    linkedHashMap.put(parcel.readParcelable(WritableAITheaterGenerationModel.class.getClassLoader()), parcel.readParcelable(WritableAITheaterGenerationModel.class.getClassLoader()));
                }
            }
            return new WritableAITheaterGenerationModel(arrayList, linkedHashMap, parcel.createStringArrayList(), parcel.readString(), parcel.readString(), EnumC547830Le9.valueOf(parcel.readString()), (UsageStatus) parcel.readParcelable(WritableAITheaterGenerationModel.class.getClassLoader()), (UsageStatus) parcel.readParcelable(WritableAITheaterGenerationModel.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readLong(), parcel.readLong(), parcel.createStringArrayList(), parcel.createStringArrayList(), parcel.readLong(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final WritableAITheaterGenerationModel[] newArray(int i) {
            return new WritableAITheaterGenerationModel[i];
        }
    };

    @C09CT("client_task_id")
    public String clientTaskId;

    @C09CT("duration")
    public long durationMs;

    @C09CT("entrance_scene")
    public EnumC547830Le9 entranceScene;

    @C09CT("error_code")
    public int errorCode;

    @C09CT("error_msg")
    public String errorMsg;

    @C09CT("error_source")
    public String errorSource;

    @C09CT("fail_reason_msg")
    public String failReasonMsg;

    @C09CT(alternate = {"initRemainTime"}, value = "init_remain_time")
    public long initRemainTime;

    @C09CT("media_path_list")
    @C0MY0
    @InterfaceC2270808v4
    public List<String> mediaPathList;

    @C09CT("music_id")
    public String musicId;

    @C09CT("progress")
    public int progress;

    @C09CT("prompt_blocks")
    public List<InputBlock> promptBlocks;
    public String promptId;

    @C09CT("prompt_text")
    public String promptText;

    @C09CT(alternate = {"remainTime"}, value = "remain_time")
    public long remainTime;

    @C09CT("replace_cameo_id")
    public Map<MentionDataItem, MentionDataItem> replaceMentionItemMap;

    @C09CT("results")
    @InterfaceC2270808v4
    public List<String> results;

    @C09CT("server_task_id")
    public String serverTaskId;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public UsageStatus status;

    @C040H
    public UsageStatus statusFromDraft;

    @C09CT("step")
    public String step;

    @C09CT("upload_uris")
    public List<String> uploadUris;

    public WritableAITheaterGenerationModel() {
        this(null, null, null, null, null, null, null, null, null, null, null, 0, 0L, 0L, null, null, 0L, 0, null, null, null, null, 4194303, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WritableAITheaterGenerationModel)) {
            return false;
        }
        WritableAITheaterGenerationModel writableAITheaterGenerationModel = (WritableAITheaterGenerationModel) obj;
        return Intrinsics.LJFF(this.promptBlocks, writableAITheaterGenerationModel.promptBlocks) && Intrinsics.LJFF(this.replaceMentionItemMap, writableAITheaterGenerationModel.replaceMentionItemMap) && Intrinsics.LJFF(this.mediaPathList, writableAITheaterGenerationModel.mediaPathList) && Intrinsics.LJFF(this.promptText, writableAITheaterGenerationModel.promptText) && Intrinsics.LJFF(this.promptId, writableAITheaterGenerationModel.promptId) && this.entranceScene == writableAITheaterGenerationModel.entranceScene && this.status == writableAITheaterGenerationModel.status && this.statusFromDraft == writableAITheaterGenerationModel.statusFromDraft && Intrinsics.LJFF(this.clientTaskId, writableAITheaterGenerationModel.clientTaskId) && Intrinsics.LJFF(this.serverTaskId, writableAITheaterGenerationModel.serverTaskId) && Intrinsics.LJFF(this.step, writableAITheaterGenerationModel.step) && this.progress == writableAITheaterGenerationModel.progress && this.remainTime == writableAITheaterGenerationModel.remainTime && this.initRemainTime == writableAITheaterGenerationModel.initRemainTime && Intrinsics.LJFF(this.results, writableAITheaterGenerationModel.results) && Intrinsics.LJFF(this.uploadUris, writableAITheaterGenerationModel.uploadUris) && this.durationMs == writableAITheaterGenerationModel.durationMs && this.errorCode == writableAITheaterGenerationModel.errorCode && Intrinsics.LJFF(this.errorMsg, writableAITheaterGenerationModel.errorMsg) && Intrinsics.LJFF(this.errorSource, writableAITheaterGenerationModel.errorSource) && Intrinsics.LJFF(this.failReasonMsg, writableAITheaterGenerationModel.failReasonMsg) && Intrinsics.LJFF(this.musicId, writableAITheaterGenerationModel.musicId);
    }

    public final int hashCode() {
        int iHashCode = this.promptBlocks.hashCode() * 31;
        Map<MentionDataItem, MentionDataItem> map = this.replaceMentionItemMap;
        int iHashCode2 = (((((((((((iHashCode + (map == null ? 0 : map.hashCode())) * 31) + this.mediaPathList.hashCode()) * 31) + this.promptText.hashCode()) * 31) + this.promptId.hashCode()) * 31) + this.entranceScene.hashCode()) * 31) + this.status.hashCode()) * 31;
        UsageStatus usageStatus = this.statusFromDraft;
        int iHashCode3 = (iHashCode2 + (usageStatus == null ? 0 : usageStatus.hashCode())) * 31;
        String str = this.clientTaskId;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.serverTaskId;
        int iHashCode5 = (((((((((((iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.step.hashCode()) * 31) + this.progress) * 31) + C786410Ut5.Y2(this.remainTime)) * 31) + C786410Ut5.Y2(this.initRemainTime)) * 31) + this.results.hashCode()) * 31;
        List<String> list = this.uploadUris;
        int iHashCode6 = (((((((iHashCode5 + (list == null ? 0 : list.hashCode())) * 31) + C786410Ut5.Y2(this.durationMs)) * 31) + this.errorCode) * 31) + this.errorMsg.hashCode()) * 31;
        String str3 = this.errorSource;
        int iHashCode7 = (((iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.failReasonMsg.hashCode()) * 31;
        String str4 = this.musicId;
        return iHashCode7 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        return "WritableAITheaterGenerationModel(promptBlocks=" + this.promptBlocks + ", replaceMentionItemMap=" + this.replaceMentionItemMap + ", mediaPathList=" + this.mediaPathList + ", promptText=" + this.promptText + ", promptId=" + this.promptId + ", entranceScene=" + this.entranceScene + ", status=" + this.status + ", statusFromDraft=" + this.statusFromDraft + ", clientTaskId=" + this.clientTaskId + ", serverTaskId=" + this.serverTaskId + ", step=" + this.step + ", progress=" + this.progress + ", remainTime=" + this.remainTime + ", initRemainTime=" + this.initRemainTime + ", results=" + this.results + ", uploadUris=" + this.uploadUris + ", durationMs=" + this.durationMs + ", errorCode=" + this.errorCode + ", errorMsg=" + this.errorMsg + ", errorSource=" + this.errorSource + ", failReasonMsg=" + this.failReasonMsg + ", musicId=" + this.musicId + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List<InputBlock> list = this.promptBlocks;
        parcel.writeInt(list.size());
        Iterator<InputBlock> it2 = list.iterator();
        while (it2.hasNext()) {
            parcel.writeParcelable(it2.next(), i);
        }
        Map<MentionDataItem, MentionDataItem> map = this.replaceMentionItemMap;
        if (map == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(map.size());
            for (Map.Entry<MentionDataItem, MentionDataItem> entry : map.entrySet()) {
                parcel.writeParcelable(entry.getKey(), i);
                parcel.writeParcelable(entry.getValue(), i);
            }
        }
        parcel.writeStringList(this.mediaPathList);
        parcel.writeString(this.promptText);
        parcel.writeString(this.promptId);
        parcel.writeString(this.entranceScene.name());
        parcel.writeParcelable(this.status, i);
        parcel.writeParcelable(this.statusFromDraft, i);
        parcel.writeString(this.clientTaskId);
        parcel.writeString(this.serverTaskId);
        parcel.writeString(this.step);
        parcel.writeInt(this.progress);
        parcel.writeLong(this.remainTime);
        parcel.writeLong(this.initRemainTime);
        parcel.writeStringList(this.results);
        parcel.writeStringList(this.uploadUris);
        parcel.writeLong(this.durationMs);
        parcel.writeInt(this.errorCode);
        parcel.writeString(this.errorMsg);
        parcel.writeString(this.errorSource);
        parcel.writeString(this.failReasonMsg);
        parcel.writeString(this.musicId);
    }

    @Override // com.ss.android.ugc.aweme.creative.model.aigc.AIGCGenerationModel
    public final UsageStatus GO() {
        return this.statusFromDraft;
    }

    @Override // com.ss.android.ugc.aweme.theater.model.AITheaterGenerationModel
    public final List<InputBlock> H1() {
        return this.promptBlocks;
    }

    @Override // com.ss.android.ugc.aweme.theater.model.AITheaterGenerationModel
    public final Map<MentionDataItem, MentionDataItem> KN() {
        return this.replaceMentionItemMap;
    }

    @Override // com.ss.android.ugc.aweme.creative.model.aigc.WritableAIGCGenerationModel, com.ss.android.ugc.aweme.creative.model.aigc.AIGCGenerationModel
    public final long T1() {
        return this.initRemainTime;
    }

    @Override // com.ss.android.ugc.aweme.creative.model.aigc.AIGCGenerationModel
    public final List<String> bH() {
        return this.mediaPathList;
    }

    @Override // com.ss.android.ugc.aweme.creative.model.aigc.WritableAIGCGenerationModel, com.ss.android.ugc.aweme.creative.model.aigc.AIGCGenerationModel
    public final String getClientTaskId() {
        return this.clientTaskId;
    }

    @Override // com.ss.android.ugc.aweme.creative.model.aigc.AIGCGenerationModel
    public final long getDurationMs() {
        return this.durationMs;
    }

    @Override // com.ss.android.ugc.aweme.creative.model.aigc.WritableAIGCGenerationModel, com.ss.android.ugc.aweme.creative.model.aigc.AIGCGenerationModel
    public final int getErrorCode() {
        return this.errorCode;
    }

    @Override // com.ss.android.ugc.aweme.creative.model.aigc.WritableAIGCGenerationModel, com.ss.android.ugc.aweme.creative.model.aigc.AIGCGenerationModel
    public final String getErrorMsg() {
        return this.errorMsg;
    }

    @Override // com.ss.android.ugc.aweme.creative.model.aigc.WritableAIGCGenerationModel, com.ss.android.ugc.aweme.creative.model.aigc.AIGCGenerationModel
    public final String getErrorSource() {
        return this.errorSource;
    }

    @Override // com.ss.android.ugc.aweme.creative.model.aigc.WritableAIGCGenerationModel, com.ss.android.ugc.aweme.creative.model.aigc.AIGCGenerationModel
    public final String getFailReasonMsg() {
        return this.failReasonMsg;
    }

    @Override // com.ss.android.ugc.aweme.creative.model.aigc.AIGCGenerationModel
    public final int getProgress() {
        return this.progress;
    }

    @Override // com.ss.android.ugc.aweme.creative.model.aigc.AIGCGenerationModel
    public final String getPromptText() {
        return this.promptText;
    }

    @Override // com.ss.android.ugc.aweme.creative.model.aigc.WritableAIGCGenerationModel, com.ss.android.ugc.aweme.creative.model.aigc.AIGCGenerationModel
    public final List<String> getResults() {
        return this.results;
    }

    @Override // com.ss.android.ugc.aweme.creative.model.aigc.AIGCGenerationModel
    public final String getServerTaskId() {
        return this.serverTaskId;
    }

    @Override // com.ss.android.ugc.aweme.creative.model.aigc.WritableAIGCGenerationModel, com.ss.android.ugc.aweme.creative.model.aigc.AIGCGenerationModel
    public final UsageStatus getStatus() {
        return this.status;
    }

    @Override // com.ss.android.ugc.aweme.creative.model.aigc.AIGCGenerationModel
    public final String getStep() {
        return this.step;
    }

    @Override // com.ss.android.ugc.aweme.creative.model.aigc.AIGCGenerationModel
    public final long us() {
        return this.remainTime;
    }

    @Override // com.ss.android.ugc.aweme.creative.model.aigc.AIGCGenerationModel
    public final EnumC547830Le9 v7() {
        return this.entranceScene;
    }

    @Override // com.ss.android.ugc.aweme.creative.model.aigc.AIGCGenerationModel
    public final List<String> xr() {
        return this.uploadUris;
    }

    @Override // com.ss.android.ugc.aweme.creative.model.aigc.WritableAIGCGenerationModel
    public final void Gi(EnumC547830Le9 enumC547830Le9) {
        this.entranceScene = enumC547830Le9;
    }

    @Override // com.ss.android.ugc.aweme.creative.model.aigc.WritableAIGCGenerationModel
    public final void Jq(String str) {
        this.serverTaskId = str;
    }

    @Override // com.ss.android.ugc.aweme.creative.model.aigc.WritableAIGCGenerationModel, com.ss.android.ugc.aweme.creative.model.aigc.AIGCGenerationModel
    public final void LLLZIL(UsageStatus usageStatus) {
        this.statusFromDraft = usageStatus;
    }

    @Override // com.ss.android.ugc.aweme.creative.model.aigc.WritableAIGCGenerationModel
    public final void P3(UsageStatus usageStatus) {
        this.status = usageStatus;
    }

    @Override // com.ss.android.ugc.aweme.creative.model.aigc.WritableAIGCGenerationModel
    public final void Qd(String str) {
        this.step = str;
    }

    @Override // com.ss.android.ugc.aweme.creative.model.aigc.WritableAIGCGenerationModel
    public final void RH(long j) {
        this.durationMs = j;
    }

    @Override // com.ss.android.ugc.aweme.creative.model.aigc.WritableAIGCGenerationModel
    public final void S5(String str) {
        this.clientTaskId = str;
    }

    @Override // com.ss.android.ugc.aweme.creative.model.aigc.WritableAIGCGenerationModel
    public final void Wn(long j) {
        this.initRemainTime = j;
    }

    @Override // com.ss.android.ugc.aweme.creative.model.aigc.WritableAIGCGenerationModel
    public final void aO(String str) {
        this.failReasonMsg = str;
    }

    @Override // com.ss.android.ugc.aweme.creative.model.aigc.WritableAIGCGenerationModel
    public final void ex(List<String> list) {
        this.mediaPathList = list;
    }

    @Override // com.ss.android.ugc.aweme.creative.model.aigc.WritableAIGCGenerationModel
    public final void hz(List<String> list) {
        this.uploadUris = list;
    }

    @Override // com.ss.android.ugc.aweme.creative.model.aigc.WritableAIGCGenerationModel
    public final void pA(long j) {
        this.remainTime = j;
    }

    @Override // com.ss.android.ugc.aweme.creative.model.aigc.WritableAIGCGenerationModel
    public final void setErrorCode(int i) {
        this.errorCode = i;
    }

    @Override // com.ss.android.ugc.aweme.creative.model.aigc.WritableAIGCGenerationModel
    public final void setErrorMsg(String str) {
        this.errorMsg = str;
    }

    @Override // com.ss.android.ugc.aweme.creative.model.aigc.WritableAIGCGenerationModel
    public final void setProgress(int i) {
        this.progress = i;
    }

    @Override // com.ss.android.ugc.aweme.creative.model.aigc.WritableAIGCGenerationModel
    public final void setResults(List<String> list) {
        this.results = list;
    }

    @Override // com.ss.android.ugc.aweme.creative.model.aigc.WritableAIGCGenerationModel
    public final void ud(String str) {
        this.errorSource = str;
    }

    public WritableAITheaterGenerationModel(List<InputBlock> list, Map<MentionDataItem, MentionDataItem> map, List<String> list2, String str, String str2, EnumC547830Le9 enumC547830Le9, UsageStatus usageStatus, UsageStatus usageStatus2, String str3, String str4, String str5, int i, long j, long j2, List<String> list3, List<String> list4, long j3, int i2, String str6, String str7, String str8, String str9) {
        this.promptBlocks = list;
        this.replaceMentionItemMap = map;
        this.mediaPathList = list2;
        this.promptText = str;
        this.promptId = str2;
        this.entranceScene = enumC547830Le9;
        this.status = usageStatus;
        this.statusFromDraft = usageStatus2;
        this.clientTaskId = str3;
        this.serverTaskId = str4;
        this.step = str5;
        this.progress = i;
        this.remainTime = j;
        this.initRemainTime = j2;
        this.results = list3;
        this.uploadUris = list4;
        this.durationMs = j3;
        this.errorCode = i2;
        this.errorMsg = str6;
        this.errorSource = str7;
        this.failReasonMsg = str8;
        this.musicId = str9;
    }

    public WritableAITheaterGenerationModel(List list, Map map, List list2, String str, String str2, EnumC547830Le9 enumC547830Le9, UsageStatus usageStatus, UsageStatus usageStatus2, String str3, String str4, String str5, int i, long j, long j2, List list3, List list4, long j3, int i2, String str6, String str7, String str8, String str9, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? C13BV.INSTANCE : list, (i3 & 2) != 0 ? null : map, (i3 & 4) != 0 ? C13BV.INSTANCE : list2, (i3 & 8) != 0 ? "" : str, (i3 & 16) != 0 ? "" : str2, (i3 & 32) != 0 ? EnumC547830Le9.MAIN_CREATE : enumC547830Le9, (i3 & 64) != 0 ? UsageStatus.NOT_APPLY : usageStatus, (i3 & 128) != 0 ? null : usageStatus2, (i3 & 256) != 0 ? null : str3, (i3 & 512) != 0 ? null : str4, (i3 & 1024) != 0 ? "" : str5, (i3 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? 0 : i, (i3 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? -1L : j, (i3 & 8192) == 0 ? j2 : -1L, (i3 & 16384) != 0 ? C13BV.INSTANCE : list3, (32768 & i3) != 0 ? null : list4, (65536 & i3) != 0 ? 0L : j3, (131072 & i3) == 0 ? i2 : 0, (262144 & i3) != 0 ? "" : str6, (524288 & i3) != 0 ? null : str7, (1048576 & i3) == 0 ? str8 : "", (i3 & 2097152) != 0 ? null : str9);
    }
}
