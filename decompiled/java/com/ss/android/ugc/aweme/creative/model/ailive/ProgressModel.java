package com.ss.android.ugc.aweme.creative.model.ailive;

import X.C09CT;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.creative.model.ailive.MixEditingMaterialModel;
import com.ss.android.ugc.aweme.creative.model.ailive.ProgressModel;
import com.ss.android.ugc.aweme.creative.model.ailive.PromptModel;
import com.ss.android.ugc.aweme.creative.model.ailive.UsageStatus;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class ProgressModel implements Parcelable {
    public static final Parcelable.Creator<ProgressModel> CREATOR = new Parcelable.Creator<ProgressModel>() { // from class: X.0Lw4
        @Override // android.os.Parcelable.Creator
        public final ProgressModel createFromParcel(Parcel parcel) {
            PromptModel promptModelCreateFromParcel;
            UsageStatus usageStatusCreateFromParcel = UsageStatus.CREATOR.createFromParcel(parcel);
            MixEditingMaterialModel mixEditingMaterialModelCreateFromParcel = null;
            if (parcel.readInt() == 0) {
                promptModelCreateFromParcel = null;
            } else {
                promptModelCreateFromParcel = PromptModel.CREATOR.createFromParcel(parcel);
            }
            PromptModel promptModel = promptModelCreateFromParcel;
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            int i = parcel.readInt();
            int i2 = parcel.readInt();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            long j = parcel.readLong();
            if (parcel.readInt() != 0) {
                mixEditingMaterialModelCreateFromParcel = MixEditingMaterialModel.CREATOR.createFromParcel(parcel);
            }
            return new ProgressModel(usageStatusCreateFromParcel, promptModel, string, string2, string3, string4, i, i2, string5, string6, j, mixEditingMaterialModelCreateFromParcel, parcel.readLong(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final ProgressModel[] newArray(int i) {
            return new ProgressModel[i];
        }
    };

    @C09CT("bind_mix_material")
    public MixEditingMaterialModel bindMixMaterial;

    @C09CT("creation_at")
    public final long createdAt;

    @C09CT("error_code")
    public final int errorCode;

    @C09CT("fail_reason_msg")
    public final String failReasonMsg;

    @C09CT("progress")
    public final int progress;

    @C09CT("prompt")
    public PromptModel prompt;

    @C09CT("remain_time")
    public final long remainTime;

    @C09CT("remain_time_from_server")
    public final int remainTimeStage;

    @C09CT("server_task_id")
    public final String serverTaskId;

    @C09CT("state_msg")
    public final String stateMsg;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public final UsageStatus status;

    @C09CT("step")
    public final String step;

    @C09CT("task_id")
    public final String taskId;

    @C09CT("task_state")
    public final String taskState;

    public ProgressModel() {
        this(UsageStatus.NOT_APPLY, null, null, null, "", "", 0, 0, null, "", 0L, null, -1L, 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProgressModel)) {
            return false;
        }
        ProgressModel progressModel = (ProgressModel) obj;
        return this.status == progressModel.status && Intrinsics.LJFF(this.prompt, progressModel.prompt) && Intrinsics.LJFF(this.taskId, progressModel.taskId) && Intrinsics.LJFF(this.serverTaskId, progressModel.serverTaskId) && Intrinsics.LJFF(this.taskState, progressModel.taskState) && Intrinsics.LJFF(this.step, progressModel.step) && this.progress == progressModel.progress && this.errorCode == progressModel.errorCode && Intrinsics.LJFF(this.failReasonMsg, progressModel.failReasonMsg) && Intrinsics.LJFF(this.stateMsg, progressModel.stateMsg) && this.remainTime == progressModel.remainTime && Intrinsics.LJFF(this.bindMixMaterial, progressModel.bindMixMaterial) && this.createdAt == progressModel.createdAt && this.remainTimeStage == progressModel.remainTimeStage;
    }

    public final int hashCode() {
        int iHashCode = this.status.hashCode() * 31;
        PromptModel promptModel = this.prompt;
        int iHashCode2 = (iHashCode + (promptModel == null ? 0 : promptModel.hashCode())) * 31;
        String str = this.taskId;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.serverTaskId;
        int iHashCode4 = (((((((((iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.taskState.hashCode()) * 31) + this.step.hashCode()) * 31) + this.progress) * 31) + this.errorCode) * 31;
        String str3 = this.failReasonMsg;
        int iHashCode5 = (((((iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.stateMsg.hashCode()) * 31) + C786410Ut5.Y2(this.remainTime)) * 31;
        MixEditingMaterialModel mixEditingMaterialModel = this.bindMixMaterial;
        return ((((iHashCode5 + (mixEditingMaterialModel != null ? mixEditingMaterialModel.hashCode() : 0)) * 31) + C786410Ut5.Y2(this.createdAt)) * 31) + this.remainTimeStage;
    }

    public final String toString() {
        return "ProgressModel(status=" + this.status + ", prompt=" + this.prompt + ", taskId=" + this.taskId + ", serverTaskId=" + this.serverTaskId + ", taskState=" + this.taskState + ", step=" + this.step + ", progress=" + this.progress + ", errorCode=" + this.errorCode + ", failReasonMsg=" + this.failReasonMsg + ", stateMsg=" + this.stateMsg + ", remainTime=" + this.remainTime + ", bindMixMaterial=" + this.bindMixMaterial + ", createdAt=" + this.createdAt + ", remainTimeStage=" + this.remainTimeStage + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.status.writeToParcel(parcel, i);
        PromptModel promptModel = this.prompt;
        if (promptModel == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            promptModel.writeToParcel(parcel, i);
        }
        parcel.writeString(this.taskId);
        parcel.writeString(this.serverTaskId);
        parcel.writeString(this.taskState);
        parcel.writeString(this.step);
        parcel.writeInt(this.progress);
        parcel.writeInt(this.errorCode);
        parcel.writeString(this.failReasonMsg);
        parcel.writeString(this.stateMsg);
        parcel.writeLong(this.remainTime);
        MixEditingMaterialModel mixEditingMaterialModel = this.bindMixMaterial;
        if (mixEditingMaterialModel == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            mixEditingMaterialModel.writeToParcel(parcel, i);
        }
        parcel.writeLong(this.createdAt);
        parcel.writeInt(this.remainTimeStage);
    }

    public static ProgressModel LIZ(ProgressModel progressModel, UsageStatus usageStatus, int i, long j, int i2) {
        PromptModel promptModel;
        String str;
        String str2;
        String str3;
        String str4;
        int i3;
        String str5;
        String str6;
        MixEditingMaterialModel mixEditingMaterialModel;
        long j2;
        int i4;
        long j3 = j;
        int i5 = i;
        UsageStatus usageStatus2 = usageStatus;
        if ((i2 & 1) != 0) {
            usageStatus2 = progressModel.status;
        }
        if ((i2 & 2) != 0) {
            promptModel = progressModel.prompt;
        } else {
            promptModel = null;
        }
        if ((i2 & 4) != 0) {
            str = progressModel.taskId;
        } else {
            str = null;
        }
        if ((i2 & 8) != 0) {
            str2 = progressModel.serverTaskId;
        } else {
            str2 = null;
        }
        if ((i2 & 16) != 0) {
            str3 = progressModel.taskState;
        } else {
            str3 = null;
        }
        if ((i2 & 32) != 0) {
            str4 = progressModel.step;
        } else {
            str4 = null;
        }
        if ((i2 & 64) != 0) {
            i5 = progressModel.progress;
        }
        if ((i2 & 128) != 0) {
            i3 = progressModel.errorCode;
        } else {
            i3 = 0;
        }
        if ((i2 & 256) != 0) {
            str5 = progressModel.failReasonMsg;
        } else {
            str5 = null;
        }
        if ((i2 & 512) != 0) {
            str6 = progressModel.stateMsg;
        } else {
            str6 = null;
        }
        if ((i2 & 1024) != 0) {
            j3 = progressModel.remainTime;
        }
        if ((i2 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            mixEditingMaterialModel = progressModel.bindMixMaterial;
        } else {
            mixEditingMaterialModel = null;
        }
        if ((i2 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            j2 = progressModel.createdAt;
        } else {
            j2 = 0;
        }
        if ((i2 & 8192) != 0) {
            i4 = progressModel.remainTimeStage;
        } else {
            i4 = 0;
        }
        return new ProgressModel(usageStatus2, promptModel, str, str2, str3, str4, i5, i3, str5, str6, j3, mixEditingMaterialModel, j2, i4);
    }

    public ProgressModel(UsageStatus usageStatus, PromptModel promptModel, String str, String str2, String str3, String str4, int i, int i2, String str5, String str6, long j, MixEditingMaterialModel mixEditingMaterialModel, long j2, int i3) {
        this.status = usageStatus;
        this.prompt = promptModel;
        this.taskId = str;
        this.serverTaskId = str2;
        this.taskState = str3;
        this.step = str4;
        this.progress = i;
        this.errorCode = i2;
        this.failReasonMsg = str5;
        this.stateMsg = str6;
        this.remainTime = j;
        this.bindMixMaterial = mixEditingMaterialModel;
        this.createdAt = j2;
        this.remainTimeStage = i3;
    }
}
