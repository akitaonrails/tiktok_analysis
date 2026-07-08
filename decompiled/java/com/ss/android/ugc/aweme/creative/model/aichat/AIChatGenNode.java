package com.ss.android.ugc.aweme.creative.model.aichat;

import X.C040H;
import X.C09CT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.aichat.AIChatGenAlgoModel;
import com.ss.android.ugc.aweme.creative.model.aichat.AIChatGenNode;
import com.ss.android.ugc.aweme.creative.model.aichat.AIChatGenNodeSrcInfo;
import com.ss.android.ugc.aweme.creative.model.aichat.AIChatGenPerfModel;
import com.ss.android.ugc.aweme.creative.model.aichat.AIChatGenPrompt;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes33.dex */
public final class AIChatGenNode implements Parcelable, Serializable {
    public static final Parcelable.Creator<AIChatGenNode> CREATOR = new Parcelable.Creator<AIChatGenNode>() { // from class: X.0nNg
        @Override // android.os.Parcelable.Creator
        public final AIChatGenNode createFromParcel(Parcel parcel) {
            AIChatGenNodeSrcInfo aIChatGenNodeSrcInfoCreateFromParcel;
            AIChatGenPrompt aIChatGenPromptCreateFromParcel;
            ArrayList arrayList;
            Integer numValueOf;
            AIChatGenAlgoModel aIChatGenAlgoModelCreateFromParcel;
            AIChatGenPerfModel aIChatGenPerfModelCreateFromParcel;
            Boolean boolValueOf;
            Integer numValueOf2;
            Integer numValueOf3;
            Integer numValueOf4;
            String string = parcel.readString();
            Integer numValueOf5 = null;
            if (parcel.readInt() == 0) {
                aIChatGenNodeSrcInfoCreateFromParcel = null;
            } else {
                aIChatGenNodeSrcInfoCreateFromParcel = AIChatGenNodeSrcInfo.CREATOR.createFromParcel(parcel);
            }
            AIChatGenNodeSrcInfo aIChatGenNodeSrcInfo = aIChatGenNodeSrcInfoCreateFromParcel;
            if (parcel.readInt() == 0) {
                aIChatGenPromptCreateFromParcel = null;
            } else {
                aIChatGenPromptCreateFromParcel = AIChatGenPrompt.CREATOR.createFromParcel(parcel);
            }
            AIChatGenPrompt aIChatGenPrompt = aIChatGenPromptCreateFromParcel;
            boolean z = false;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(AIChatGenNodeSrcInfo.CREATOR.createFromParcel(parcel));
                }
            }
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() == 0) {
                aIChatGenAlgoModelCreateFromParcel = null;
            } else {
                aIChatGenAlgoModelCreateFromParcel = AIChatGenAlgoModel.CREATOR.createFromParcel(parcel);
            }
            AIChatGenAlgoModel aIChatGenAlgoModel = aIChatGenAlgoModelCreateFromParcel;
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            if (parcel.readInt() == 0) {
                aIChatGenPerfModelCreateFromParcel = null;
            } else {
                aIChatGenPerfModelCreateFromParcel = AIChatGenPerfModel.CREATOR.createFromParcel(parcel);
            }
            AIChatGenPerfModel aIChatGenPerfModel = aIChatGenPerfModelCreateFromParcel;
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                if (parcel.readInt() != 0) {
                    z = true;
                }
                boolValueOf = Boolean.valueOf(z);
            }
            int i3 = parcel.readInt();
            if (parcel.readInt() == 0) {
                numValueOf2 = null;
            } else {
                numValueOf2 = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() == 0) {
                numValueOf3 = null;
            } else {
                numValueOf3 = Integer.valueOf(parcel.readInt());
            }
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            if (parcel.readInt() == 0) {
                numValueOf4 = null;
            } else {
                numValueOf4 = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() != 0) {
                numValueOf5 = Integer.valueOf(parcel.readInt());
            }
            return new AIChatGenNode(string, aIChatGenNodeSrcInfo, aIChatGenPrompt, arrayList, numValueOf, aIChatGenAlgoModel, string2, string3, string4, aIChatGenPerfModel, boolValueOf, i3, numValueOf2, numValueOf3, string5, string6, numValueOf4, numValueOf5, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AIChatGenNode[] newArray(int i) {
            return new AIChatGenNode[i];
        }
    };

    @C09CT("client_message_id")
    public final String clientMessageId;

    @C09CT("client_task_id")
    public final String clientTaskId;

    @C09CT("context_media_list")
    public final List<AIChatGenNodeSrcInfo> contextMediaList;

    @C09CT("context_origin_image_count")
    public final Integer contextOriginImageCount;

    @C040H
    public final Integer contextPreloadImageCount;

    @C040H
    public final String contextPreloadImageSource;

    @C040H
    public final Integer contextUserUploadImageCount;

    @C09CT("is_history_photo")
    public final Integer isHistoryPhoto;

    @C040H
    public final Boolean isVPNewUser;

    @C09CT("is_vp_generate_result_show")
    public final Integer isVpGenerateResultShow;

    @C09CT("model_info")
    public final AIChatGenAlgoModel modelInfo;

    @C09CT("perf_info")
    public final AIChatGenPerfModel perfInfo;

    @C09CT("progress")
    public int progress;

    @C09CT("prompt")
    public final AIChatGenPrompt prompt;

    @C09CT("src_info")
    public final AIChatGenNodeSrcInfo srcInfo;

    @C09CT("task_id")
    public final String taskId;

    @C09CT("task_type")
    public final String taskType;

    @C09CT("uuid")
    public final String uuid;

    @C09CT("vp_creation_id")
    public final String vpCreationId;

    public AIChatGenNode() {
        this(UUID.randomUUID().toString(), null, null, null, null, null, null, null, null, null, null, 0, null, null, null, null, null, null, null);
    }

    public final AIChatGenNode copy(String str, AIChatGenNodeSrcInfo aIChatGenNodeSrcInfo, AIChatGenPrompt aIChatGenPrompt, List<AIChatGenNodeSrcInfo> list, Integer num, AIChatGenAlgoModel aIChatGenAlgoModel, String str2, String str3, String str4, AIChatGenPerfModel aIChatGenPerfModel, Boolean bool, int i, Integer num2, Integer num3, String str5, String str6, Integer num4, Integer num5, String str7) {
        return new AIChatGenNode(str, aIChatGenNodeSrcInfo, aIChatGenPrompt, list, num, aIChatGenAlgoModel, str2, str3, str4, aIChatGenPerfModel, bool, i, num2, num3, str5, str6, num4, num5, str7);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AIChatGenNode)) {
            return false;
        }
        AIChatGenNode aIChatGenNode = (AIChatGenNode) obj;
        return Intrinsics.LJFF(this.uuid, aIChatGenNode.uuid) && Intrinsics.LJFF(this.srcInfo, aIChatGenNode.srcInfo) && Intrinsics.LJFF(this.prompt, aIChatGenNode.prompt) && Intrinsics.LJFF(this.contextMediaList, aIChatGenNode.contextMediaList) && Intrinsics.LJFF(this.contextOriginImageCount, aIChatGenNode.contextOriginImageCount) && Intrinsics.LJFF(this.modelInfo, aIChatGenNode.modelInfo) && Intrinsics.LJFF(this.taskId, aIChatGenNode.taskId) && Intrinsics.LJFF(this.clientTaskId, aIChatGenNode.clientTaskId) && Intrinsics.LJFF(this.taskType, aIChatGenNode.taskType) && Intrinsics.LJFF(this.perfInfo, aIChatGenNode.perfInfo) && Intrinsics.LJFF(this.isVPNewUser, aIChatGenNode.isVPNewUser) && this.progress == aIChatGenNode.progress && Intrinsics.LJFF(this.contextPreloadImageCount, aIChatGenNode.contextPreloadImageCount) && Intrinsics.LJFF(this.contextUserUploadImageCount, aIChatGenNode.contextUserUploadImageCount) && Intrinsics.LJFF(this.contextPreloadImageSource, aIChatGenNode.contextPreloadImageSource) && Intrinsics.LJFF(this.vpCreationId, aIChatGenNode.vpCreationId) && Intrinsics.LJFF(this.isHistoryPhoto, aIChatGenNode.isHistoryPhoto) && Intrinsics.LJFF(this.isVpGenerateResultShow, aIChatGenNode.isVpGenerateResultShow) && Intrinsics.LJFF(this.clientMessageId, aIChatGenNode.clientMessageId);
    }

    public int hashCode() {
        int iHashCode = this.uuid.hashCode() * 31;
        AIChatGenNodeSrcInfo aIChatGenNodeSrcInfo = this.srcInfo;
        int iHashCode2 = (iHashCode + (aIChatGenNodeSrcInfo == null ? 0 : aIChatGenNodeSrcInfo.hashCode())) * 31;
        AIChatGenPrompt aIChatGenPrompt = this.prompt;
        int iHashCode3 = (iHashCode2 + (aIChatGenPrompt == null ? 0 : aIChatGenPrompt.hashCode())) * 31;
        List<AIChatGenNodeSrcInfo> list = this.contextMediaList;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        Integer num = this.contextOriginImageCount;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        AIChatGenAlgoModel aIChatGenAlgoModel = this.modelInfo;
        int iHashCode6 = (iHashCode5 + (aIChatGenAlgoModel == null ? 0 : aIChatGenAlgoModel.hashCode())) * 31;
        String str = this.taskId;
        int iHashCode7 = (iHashCode6 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.clientTaskId;
        int iHashCode8 = (iHashCode7 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.taskType;
        int iHashCode9 = (iHashCode8 + (str3 == null ? 0 : str3.hashCode())) * 31;
        AIChatGenPerfModel aIChatGenPerfModel = this.perfInfo;
        int iHashCode10 = (iHashCode9 + (aIChatGenPerfModel == null ? 0 : aIChatGenPerfModel.hashCode())) * 31;
        Boolean bool = this.isVPNewUser;
        int iHashCode11 = (((iHashCode10 + (bool == null ? 0 : bool.hashCode())) * 31) + this.progress) * 31;
        Integer num2 = this.contextPreloadImageCount;
        int iHashCode12 = (iHashCode11 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.contextUserUploadImageCount;
        int iHashCode13 = (iHashCode12 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str4 = this.contextPreloadImageSource;
        int iHashCode14 = (iHashCode13 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.vpCreationId;
        int iHashCode15 = (iHashCode14 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num4 = this.isHistoryPhoto;
        int iHashCode16 = (iHashCode15 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.isVpGenerateResultShow;
        int iHashCode17 = (iHashCode16 + (num5 == null ? 0 : num5.hashCode())) * 31;
        String str6 = this.clientMessageId;
        return iHashCode17 + (str6 != null ? str6.hashCode() : 0);
    }

    public String toString() {
        return "AIChatGenNode(uuid=" + this.uuid + ", srcInfo=" + this.srcInfo + ", prompt=" + this.prompt + ", contextMediaList=" + this.contextMediaList + ", contextOriginImageCount=" + this.contextOriginImageCount + ", modelInfo=" + this.modelInfo + ", taskId=" + this.taskId + ", clientTaskId=" + this.clientTaskId + ", taskType=" + this.taskType + ", perfInfo=" + this.perfInfo + ", isVPNewUser=" + this.isVPNewUser + ", progress=" + this.progress + ", contextPreloadImageCount=" + this.contextPreloadImageCount + ", contextUserUploadImageCount=" + this.contextUserUploadImageCount + ", contextPreloadImageSource=" + this.contextPreloadImageSource + ", vpCreationId=" + this.vpCreationId + ", isHistoryPhoto=" + this.isHistoryPhoto + ", isVpGenerateResultShow=" + this.isVpGenerateResultShow + ", clientMessageId=" + this.clientMessageId + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.uuid);
        AIChatGenNodeSrcInfo aIChatGenNodeSrcInfo = this.srcInfo;
        if (aIChatGenNodeSrcInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            aIChatGenNodeSrcInfo.writeToParcel(parcel, i);
        }
        AIChatGenPrompt aIChatGenPrompt = this.prompt;
        if (aIChatGenPrompt == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            aIChatGenPrompt.writeToParcel(parcel, i);
        }
        List<AIChatGenNodeSrcInfo> list = this.contextMediaList;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<AIChatGenNodeSrcInfo> it2 = list.iterator();
            while (it2.hasNext()) {
                it2.next().writeToParcel(parcel, i);
            }
        }
        Integer num = this.contextOriginImageCount;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        AIChatGenAlgoModel aIChatGenAlgoModel = this.modelInfo;
        if (aIChatGenAlgoModel == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            aIChatGenAlgoModel.writeToParcel(parcel, i);
        }
        parcel.writeString(this.taskId);
        parcel.writeString(this.clientTaskId);
        parcel.writeString(this.taskType);
        AIChatGenPerfModel aIChatGenPerfModel = this.perfInfo;
        if (aIChatGenPerfModel == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            aIChatGenPerfModel.writeToParcel(parcel, i);
        }
        Boolean bool = this.isVPNewUser;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        parcel.writeInt(this.progress);
        Integer num2 = this.contextPreloadImageCount;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        Integer num3 = this.contextUserUploadImageCount;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num3.intValue());
        }
        parcel.writeString(this.contextPreloadImageSource);
        parcel.writeString(this.vpCreationId);
        Integer num4 = this.isHistoryPhoto;
        if (num4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num4.intValue());
        }
        Integer num5 = this.isVpGenerateResultShow;
        if (num5 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num5.intValue());
        }
        parcel.writeString(this.clientMessageId);
    }

    public final String getClientMessageId() {
        return this.clientMessageId;
    }

    public final String getClientTaskId() {
        return this.clientTaskId;
    }

    public final List<AIChatGenNodeSrcInfo> getContextMediaList() {
        return this.contextMediaList;
    }

    public final Integer getContextOriginImageCount() {
        return this.contextOriginImageCount;
    }

    public final Integer getContextPreloadImageCount() {
        return this.contextPreloadImageCount;
    }

    public final String getContextPreloadImageSource() {
        return this.contextPreloadImageSource;
    }

    public final Integer getContextUserUploadImageCount() {
        return this.contextUserUploadImageCount;
    }

    public final AIChatGenAlgoModel getModelInfo() {
        return this.modelInfo;
    }

    public final AIChatGenPerfModel getPerfInfo() {
        return this.perfInfo;
    }

    public final int getProgress() {
        return this.progress;
    }

    public final AIChatGenPrompt getPrompt() {
        return this.prompt;
    }

    public final AIChatGenNodeSrcInfo getSrcInfo() {
        return this.srcInfo;
    }

    public final String getTaskId() {
        return this.taskId;
    }

    public final String getTaskType() {
        return this.taskType;
    }

    public final String getUuid() {
        return this.uuid;
    }

    public final String getVpCreationId() {
        return this.vpCreationId;
    }

    public final Integer isHistoryPhoto() {
        return this.isHistoryPhoto;
    }

    public final Boolean isVPNewUser() {
        return this.isVPNewUser;
    }

    public final Integer isVpGenerateResultShow() {
        return this.isVpGenerateResultShow;
    }

    public final void setProgress(int i) {
        this.progress = i;
    }

    public AIChatGenNode(String str, AIChatGenNodeSrcInfo aIChatGenNodeSrcInfo, AIChatGenPrompt aIChatGenPrompt, List<AIChatGenNodeSrcInfo> list, Integer num, AIChatGenAlgoModel aIChatGenAlgoModel, String str2, String str3, String str4, AIChatGenPerfModel aIChatGenPerfModel, Boolean bool, int i, Integer num2, Integer num3, String str5, String str6, Integer num4, Integer num5, String str7) {
        this.uuid = str;
        this.srcInfo = aIChatGenNodeSrcInfo;
        this.prompt = aIChatGenPrompt;
        this.contextMediaList = list;
        this.contextOriginImageCount = num;
        this.modelInfo = aIChatGenAlgoModel;
        this.taskId = str2;
        this.clientTaskId = str3;
        this.taskType = str4;
        this.perfInfo = aIChatGenPerfModel;
        this.isVPNewUser = bool;
        this.progress = i;
        this.contextPreloadImageCount = num2;
        this.contextUserUploadImageCount = num3;
        this.contextPreloadImageSource = str5;
        this.vpCreationId = str6;
        this.isHistoryPhoto = num4;
        this.isVpGenerateResultShow = num5;
        this.clientMessageId = str7;
    }
}
