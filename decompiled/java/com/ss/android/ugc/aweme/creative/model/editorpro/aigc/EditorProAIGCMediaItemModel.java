package com.ss.android.ugc.aweme.creative.model.editorpro.aigc;

import X.C09CT;
import X.C0MY0;
import X.C13BV;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C377190Eqb;
import X.C786410Ut5;
import X.InterfaceC2270808v4;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.AIGCBusinessType;
import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.AIGCGenerationParam;
import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.AIGCGenerationParamType;
import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.EditorProAIGCMediaItemModel;
import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.EditorProAIGCMediaItemModelStatus;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class EditorProAIGCMediaItemModel implements Parcelable {

    @C09CT("algoRequestKey")
    public String algoRequestKey;

    @C09CT("businessType")
    public AIGCBusinessType businessType;

    @C09CT("creationTime")
    public long creationTime;

    @C09CT("epAIGCAsyncTaskId")
    public String epAIGCAsyncTaskId;

    @C09CT("epAIGCId")
    public String epAIGCId;

    @C09CT("face_count_list")
    public List<Integer> faceCountList;

    @C09CT("failedWatermarkPath")
    @C0MY0
    public String failedWatermarkPath;

    @C09CT("holder_picture_path")
    public String holderPicturePath;

    @C09CT("is_selected")
    public boolean isSelected;

    @C09CT("itemID")
    public String itemID;

    @C09CT("maskCoverPath")
    @C0MY0
    public String maskCoverPath;

    @C09CT("media_file_path")
    @InterfaceC2270808v4
    public String mediaFilePath;

    @C09CT("generation_param")
    public AIGCGenerationParam param;

    @C09CT("prev_status")
    public EditorProAIGCMediaItemModelStatus previousStatus;

    @C09CT("last_progress")
    public float progress;

    @C09CT("reference_image_path")
    public String referenceImagePath;

    @C09CT("reference_image_path_list")
    public List<String> referenceImagePathList;

    @C09CT("server_download_url")
    public String serverDownloadUrl;

    @C09CT("serverTaskId")
    public String serverTaskId;

    @C09CT("slotId")
    public String slotId;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public EditorProAIGCMediaItemModelStatus status;

    @C09CT("t2iBgFilePath")
    @C0MY0
    @InterfaceC2270808v4
    public String t2iBgFilePath;

    @C09CT("type")
    public AIGCGenerationParamType type;

    @C09CT("uri_migration_map")
    public Map<String, String> uriMigrationMap;
    public static final C377190Eqb Companion = new Object() { // from class: X.0Eqb
    };
    public static final Parcelable.Creator<EditorProAIGCMediaItemModel> CREATOR = new Parcelable.Creator<EditorProAIGCMediaItemModel>() { // from class: X.0EqZ
        @Override // android.os.Parcelable.Creator
        public final EditorProAIGCMediaItemModel createFromParcel(Parcel parcel) {
            boolean z;
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            float f = parcel.readFloat();
            AIGCGenerationParamType aIGCGenerationParamTypeCreateFromParcel = AIGCGenerationParamType.CREATOR.createFromParcel(parcel);
            Parcelable.Creator<EditorProAIGCMediaItemModelStatus> creator = EditorProAIGCMediaItemModelStatus.CREATOR;
            EditorProAIGCMediaItemModelStatus editorProAIGCMediaItemModelStatusCreateFromParcel = creator.createFromParcel(parcel);
            EditorProAIGCMediaItemModelStatus editorProAIGCMediaItemModelStatusCreateFromParcel2 = creator.createFromParcel(parcel);
            AIGCGenerationParam aIGCGenerationParamCreateFromParcel = AIGCGenerationParam.CREATOR.createFromParcel(parcel);
            long j = parcel.readLong();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            int i = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i);
            for (int i2 = 0; i2 != i; i2++) {
                linkedHashMap.put(parcel.readString(), parcel.readString());
            }
            String string9 = parcel.readString();
            String string10 = parcel.readString();
            int i3 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i3);
            for (int i4 = 0; i4 != i3; i4++) {
                arrayList.add(Integer.valueOf(parcel.readInt()));
            }
            return new EditorProAIGCMediaItemModel(string, string2, string3, string4, f, aIGCGenerationParamTypeCreateFromParcel, editorProAIGCMediaItemModelStatusCreateFromParcel, editorProAIGCMediaItemModelStatusCreateFromParcel2, aIGCGenerationParamCreateFromParcel, j, string5, string6, z, string7, string8, arrayListCreateStringArrayList, linkedHashMap, string9, string10, arrayList, parcel.readString(), parcel.readString(), parcel.readString(), AIGCBusinessType.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final EditorProAIGCMediaItemModel[] newArray(int i) {
            return new EditorProAIGCMediaItemModel[i];
        }
    };

    public EditorProAIGCMediaItemModel() {
        this(null, null, null, null, 0.0f, null, null, null, null, 0L, null, null, false, null, null, null, null, null, null, null, null, null, null, null, 16777215, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EditorProAIGCMediaItemModel)) {
            return false;
        }
        EditorProAIGCMediaItemModel editorProAIGCMediaItemModel = (EditorProAIGCMediaItemModel) obj;
        return Intrinsics.LJFF(this.itemID, editorProAIGCMediaItemModel.itemID) && Intrinsics.LJFF(this.slotId, editorProAIGCMediaItemModel.slotId) && Intrinsics.LJFF(this.epAIGCId, editorProAIGCMediaItemModel.epAIGCId) && Intrinsics.LJFF(this.epAIGCAsyncTaskId, editorProAIGCMediaItemModel.epAIGCAsyncTaskId) && Float.compare(this.progress, editorProAIGCMediaItemModel.progress) == 0 && this.type == editorProAIGCMediaItemModel.type && this.previousStatus == editorProAIGCMediaItemModel.previousStatus && this.status == editorProAIGCMediaItemModel.status && Intrinsics.LJFF(this.param, editorProAIGCMediaItemModel.param) && this.creationTime == editorProAIGCMediaItemModel.creationTime && Intrinsics.LJFF(this.mediaFilePath, editorProAIGCMediaItemModel.mediaFilePath) && Intrinsics.LJFF(this.holderPicturePath, editorProAIGCMediaItemModel.holderPicturePath) && this.isSelected == editorProAIGCMediaItemModel.isSelected && Intrinsics.LJFF(this.serverDownloadUrl, editorProAIGCMediaItemModel.serverDownloadUrl) && Intrinsics.LJFF(this.referenceImagePath, editorProAIGCMediaItemModel.referenceImagePath) && Intrinsics.LJFF(this.referenceImagePathList, editorProAIGCMediaItemModel.referenceImagePathList) && Intrinsics.LJFF(this.uriMigrationMap, editorProAIGCMediaItemModel.uriMigrationMap) && Intrinsics.LJFF(this.t2iBgFilePath, editorProAIGCMediaItemModel.t2iBgFilePath) && Intrinsics.LJFF(this.serverTaskId, editorProAIGCMediaItemModel.serverTaskId) && Intrinsics.LJFF(this.faceCountList, editorProAIGCMediaItemModel.faceCountList) && Intrinsics.LJFF(this.algoRequestKey, editorProAIGCMediaItemModel.algoRequestKey) && Intrinsics.LJFF(this.maskCoverPath, editorProAIGCMediaItemModel.maskCoverPath) && Intrinsics.LJFF(this.failedWatermarkPath, editorProAIGCMediaItemModel.failedWatermarkPath) && this.businessType == editorProAIGCMediaItemModel.businessType;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.itemID);
        parcel.writeString(this.slotId);
        parcel.writeString(this.epAIGCId);
        parcel.writeString(this.epAIGCAsyncTaskId);
        parcel.writeFloat(this.progress);
        this.type.writeToParcel(parcel, i);
        this.previousStatus.writeToParcel(parcel, i);
        this.status.writeToParcel(parcel, i);
        this.param.writeToParcel(parcel, i);
        parcel.writeLong(this.creationTime);
        parcel.writeString(this.mediaFilePath);
        parcel.writeString(this.holderPicturePath);
        parcel.writeInt(this.isSelected ? 1 : 0);
        parcel.writeString(this.serverDownloadUrl);
        parcel.writeString(this.referenceImagePath);
        parcel.writeStringList(this.referenceImagePathList);
        Map<String, String> map = this.uriMigrationMap;
        parcel.writeInt(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            parcel.writeString(entry.getKey());
            parcel.writeString(entry.getValue());
        }
        parcel.writeString(this.t2iBgFilePath);
        parcel.writeString(this.serverTaskId);
        List<Integer> list = this.faceCountList;
        parcel.writeInt(list.size());
        Iterator<Integer> it2 = list.iterator();
        while (it2.hasNext()) {
            parcel.writeInt(it2.next().intValue());
        }
        parcel.writeString(this.algoRequestKey);
        parcel.writeString(this.maskCoverPath);
        parcel.writeString(this.failedWatermarkPath);
        this.businessType.writeToParcel(parcel, i);
    }

    public final int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((((((((this.itemID.hashCode() * 31) + this.slotId.hashCode()) * 31) + this.epAIGCId.hashCode()) * 31) + this.epAIGCAsyncTaskId.hashCode()) * 31) + Float.floatToIntBits(this.progress)) * 31) + this.type.hashCode()) * 31) + this.previousStatus.hashCode()) * 31) + this.status.hashCode()) * 31) + this.param.hashCode()) * 31) + C786410Ut5.Y2(this.creationTime)) * 31) + this.mediaFilePath.hashCode()) * 31) + this.holderPicturePath.hashCode()) * 31) + C786410Ut5.Z2(this.isSelected)) * 31) + this.serverDownloadUrl.hashCode()) * 31) + this.referenceImagePath.hashCode()) * 31) + this.referenceImagePathList.hashCode()) * 31) + this.uriMigrationMap.hashCode()) * 31) + this.t2iBgFilePath.hashCode()) * 31) + this.serverTaskId.hashCode()) * 31) + this.faceCountList.hashCode()) * 31) + this.algoRequestKey.hashCode()) * 31) + this.maskCoverPath.hashCode()) * 31) + this.failedWatermarkPath.hashCode()) * 31) + this.businessType.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EditorProAIGCMediaItemModel(itemID=");
        sbLIZ.append(this.itemID);
        sbLIZ.append(", \nstatus=");
        sbLIZ.append(this.status);
        sbLIZ.append(", \nmediaFilePath=");
        sbLIZ.append(this.mediaFilePath);
        sbLIZ.append(", \nserverDownloadUrl=");
        sbLIZ.append(this.serverDownloadUrl);
        sbLIZ.append(", \nreferenceImagePath=");
        sbLIZ.append(this.referenceImagePath);
        sbLIZ.append(", \nisSelected=");
        sbLIZ.append(this.isSelected);
        sbLIZ.append(", \nholderPicturePath=");
        sbLIZ.append(this.holderPicturePath);
        sbLIZ.append(", \nserverTaskId=");
        sbLIZ.append(this.serverTaskId);
        sbLIZ.append(", \n");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public EditorProAIGCMediaItemModel(String str, String str2, String str3, String str4, float f, AIGCGenerationParamType aIGCGenerationParamType, EditorProAIGCMediaItemModelStatus editorProAIGCMediaItemModelStatus, EditorProAIGCMediaItemModelStatus editorProAIGCMediaItemModelStatus2, AIGCGenerationParam aIGCGenerationParam, long j, String str5, String str6, boolean z, String str7, String str8, List<String> list, Map<String, String> map, String str9, String str10, List<Integer> list2, String str11, String str12, String str13, AIGCBusinessType aIGCBusinessType) {
        this.itemID = str;
        this.slotId = str2;
        this.epAIGCId = str3;
        this.epAIGCAsyncTaskId = str4;
        this.progress = f;
        this.type = aIGCGenerationParamType;
        this.previousStatus = editorProAIGCMediaItemModelStatus;
        this.status = editorProAIGCMediaItemModelStatus2;
        this.param = aIGCGenerationParam;
        this.creationTime = j;
        this.mediaFilePath = str5;
        this.holderPicturePath = str6;
        this.isSelected = z;
        this.serverDownloadUrl = str7;
        this.referenceImagePath = str8;
        this.referenceImagePathList = list;
        this.uriMigrationMap = map;
        this.t2iBgFilePath = str9;
        this.serverTaskId = str10;
        this.faceCountList = list2;
        this.algoRequestKey = str11;
        this.maskCoverPath = str12;
        this.failedWatermarkPath = str13;
        this.businessType = aIGCBusinessType;
    }

    public EditorProAIGCMediaItemModel(String str, String str2, String str3, String str4, float f, AIGCGenerationParamType aIGCGenerationParamType, EditorProAIGCMediaItemModelStatus editorProAIGCMediaItemModelStatus, EditorProAIGCMediaItemModelStatus editorProAIGCMediaItemModelStatus2, AIGCGenerationParam aIGCGenerationParam, long j, String str5, String str6, boolean z, String str7, String str8, List list, Map map, String str9, String str10, List list2, String str11, String str12, String str13, AIGCBusinessType aIGCBusinessType, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? 0.0f : f, (i & 32) != 0 ? AIGCGenerationParamType.NONE : aIGCGenerationParamType, (i & 64) != 0 ? EditorProAIGCMediaItemModelStatus.NONE : editorProAIGCMediaItemModelStatus, (i & 128) != 0 ? EditorProAIGCMediaItemModelStatus.NONE : editorProAIGCMediaItemModelStatus2, (i & 256) != 0 ? new AIGCGenerationParam(null, null, null, null, false, false, null, null, null, null, 0, 0, null, null, null, false, false, 0, false, null, null, null, null, null, null, false, false, false, null, null, 0, 0, null, null, null, -1, 7, null) : aIGCGenerationParam, (i & 512) != 0 ? 0L : j, (i & 1024) != 0 ? "" : str5, (i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? "" : str6, (i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? false : z, (i & 8192) != 0 ? "" : str7, (i & 16384) != 0 ? "" : str8, (32768 & i) != 0 ? C13BV.INSTANCE : list, (65536 & i) != 0 ? C2097608Jq.LJ() : map, (131072 & i) != 0 ? "" : str9, (262144 & i) != 0 ? "" : str10, (524288 & i) != 0 ? C13BV.INSTANCE : list2, (1048576 & i) != 0 ? "" : str11, (2097152 & i) != 0 ? "" : str12, (4194304 & i) == 0 ? str13 : "", (i & 8388608) != 0 ? AIGCBusinessType.AI_CREATE : aIGCBusinessType);
    }
}
