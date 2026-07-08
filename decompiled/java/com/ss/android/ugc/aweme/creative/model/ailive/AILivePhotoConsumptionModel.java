package com.ss.android.ugc.aweme.creative.model.ailive;

import X.C040H;
import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.ailive.AILivePhotoConsumptionModel;
import com.ss.android.ugc.aweme.feed.model.AIAliveInfo;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class AILivePhotoConsumptionModel implements Parcelable, Serializable {
    public static final Parcelable.Creator<AILivePhotoConsumptionModel> CREATOR = new Parcelable.Creator<AILivePhotoConsumptionModel>() { // from class: X.0MC0
        @Override // android.os.Parcelable.Creator
        public final AILivePhotoConsumptionModel createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            boolean z3;
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            AIAliveInfo aIAliveInfo = (AIAliveInfo) parcel.readParcelable(AILivePhotoConsumptionModel.class.getClassLoader());
            if (parcel.readInt() != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            AIAliveInfo aIAliveInfo2 = (AIAliveInfo) parcel.readParcelable(AILivePhotoConsumptionModel.class.getClassLoader());
            MusicModel musicModel = (MusicModel) parcel.readSerializable();
            if (parcel.readInt() != 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            return new AILivePhotoConsumptionModel(z, aIAliveInfo, z2, aIAliveInfo2, musicModel, z3);
        }

        @Override // android.os.Parcelable.Creator
        public final AILivePhotoConsumptionModel[] newArray(int i) {
            return new AILivePhotoConsumptionModel[i];
        }
    };

    @C09CT("ai_alive_info")
    public final AIAliveInfo aiAliveInfo;

    @C040H
    public final boolean delayGuideShow;

    @C09CT("enter_to_post")
    public final boolean enterToPost;

    @C09CT("has_auto_apply")
    public boolean hasAutoApply;

    @C040H
    public final MusicModel musicModel;

    @C09CT("origin_ai_alive_info")
    public final AIAliveInfo originAIAliveInfo;

    public AILivePhotoConsumptionModel() {
        this(false, null, false, null, null, false);
    }

    public final AILivePhotoConsumptionModel copy(boolean z, AIAliveInfo aIAliveInfo, boolean z2, AIAliveInfo aIAliveInfo2, MusicModel musicModel, boolean z3) {
        return new AILivePhotoConsumptionModel(z, aIAliveInfo, z2, aIAliveInfo2, musicModel, z3);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AILivePhotoConsumptionModel)) {
            return false;
        }
        AILivePhotoConsumptionModel aILivePhotoConsumptionModel = (AILivePhotoConsumptionModel) obj;
        return this.enterToPost == aILivePhotoConsumptionModel.enterToPost && Intrinsics.LJFF(this.aiAliveInfo, aILivePhotoConsumptionModel.aiAliveInfo) && this.delayGuideShow == aILivePhotoConsumptionModel.delayGuideShow && Intrinsics.LJFF(this.originAIAliveInfo, aILivePhotoConsumptionModel.originAIAliveInfo) && Intrinsics.LJFF(this.musicModel, aILivePhotoConsumptionModel.musicModel) && this.hasAutoApply == aILivePhotoConsumptionModel.hasAutoApply;
    }

    public int hashCode() {
        int iZ2 = C786410Ut5.Z2(this.enterToPost) * 31;
        AIAliveInfo aIAliveInfo = this.aiAliveInfo;
        int iHashCode = (((iZ2 + (aIAliveInfo == null ? 0 : aIAliveInfo.hashCode())) * 31) + C786410Ut5.Z2(this.delayGuideShow)) * 31;
        AIAliveInfo aIAliveInfo2 = this.originAIAliveInfo;
        int iHashCode2 = (iHashCode + (aIAliveInfo2 == null ? 0 : aIAliveInfo2.hashCode())) * 31;
        MusicModel musicModel = this.musicModel;
        return ((iHashCode2 + (musicModel != null ? musicModel.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.hasAutoApply);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AILivePhotoConsumptionModel(enterToPost=");
        sbLIZ.append(this.enterToPost);
        sbLIZ.append(", aiAliveInfo=");
        sbLIZ.append(this.aiAliveInfo);
        sbLIZ.append(", delayGuideShow=");
        sbLIZ.append(this.delayGuideShow);
        sbLIZ.append(", originAIAliveInfo=");
        sbLIZ.append(this.originAIAliveInfo);
        sbLIZ.append(", musicModel=");
        sbLIZ.append(this.musicModel);
        sbLIZ.append(", hasAutoApply=");
        sbLIZ.append(this.hasAutoApply);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.enterToPost ? 1 : 0);
        parcel.writeParcelable(this.aiAliveInfo, i);
        parcel.writeInt(this.delayGuideShow ? 1 : 0);
        parcel.writeParcelable(this.originAIAliveInfo, i);
        parcel.writeSerializable(this.musicModel);
        parcel.writeInt(this.hasAutoApply ? 1 : 0);
    }

    public final String getFollowPromptTypeSafelyBeforeEdit() {
        AIAliveInfo aIAliveInfo = this.aiAliveInfo;
        if (aIAliveInfo == null) {
            return null;
        }
        String modelPrompt = aIAliveInfo.getModelPrompt();
        AIAliveInfo aIAliveInfo2 = this.originAIAliveInfo;
        if (Intrinsics.LJFF(modelPrompt, aIAliveInfo2 != null ? aIAliveInfo2.getModelPrompt() : null)) {
            return PromptType.DEFAULT.getMobTag();
        }
        AIAliveInfo aIAliveInfo3 = this.aiAliveInfo;
        if (aIAliveInfo3 != null) {
            return aIAliveInfo3.getPromptType();
        }
        return null;
    }

    public final AIAliveInfo getAiAliveInfo() {
        return this.aiAliveInfo;
    }

    public final boolean getDelayGuideShow() {
        return this.delayGuideShow;
    }

    public final boolean getEnterToPost() {
        return this.enterToPost;
    }

    public final boolean getHasAutoApply() {
        return this.hasAutoApply;
    }

    public final MusicModel getMusicModel() {
        return this.musicModel;
    }

    public final AIAliveInfo getOriginAIAliveInfo() {
        return this.originAIAliveInfo;
    }

    public final void setHasAutoApply(boolean z) {
        this.hasAutoApply = z;
    }

    public AILivePhotoConsumptionModel(boolean z, AIAliveInfo aIAliveInfo, boolean z2, AIAliveInfo aIAliveInfo2, MusicModel musicModel, boolean z3) {
        this.enterToPost = z;
        this.aiAliveInfo = aIAliveInfo;
        this.delayGuideShow = z2;
        this.originAIAliveInfo = aIAliveInfo2;
        this.musicModel = musicModel;
        this.hasAutoApply = z3;
    }
}
