package com.ss.android.ugc.airemix.api.model;

import X.AbstractC548720Lfa;
import X.C09CT;
import X.C1697810uHb;
import X.C2188811AlT;
import X.InterfaceC548750Lfd;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.airemix.api.model.AIRemixAwemeEntranceModel;
import com.ss.android.ugc.airemix.model.AIRemixAwemeVideoData;
import com.ss.android.ugc.airemix.model.AIRemixUserData;
import com.ss.android.ugc.airemix.model.mob.datasource.AIRemixAwemeEntranceInfo;
import com.ss.android.ugc.airemix.model.mob.datasource.AIRemixOriginInfo;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class AIRemixAwemeEntranceModel extends AbstractC548720Lfa implements Parcelable {
    public static final Parcelable.Creator<AIRemixAwemeEntranceModel> CREATOR = new Parcelable.Creator<AIRemixAwemeEntranceModel>() { // from class: X.0Lfx
        @Override // android.os.Parcelable.Creator
        public final AIRemixAwemeEntranceModel createFromParcel(Parcel parcel) {
            return new AIRemixAwemeEntranceModel((AIRemixAwemeEntranceInfo) parcel.readParcelable(AIRemixAwemeEntranceModel.class.getClassLoader()), (AIRemixOriginInfo) parcel.readParcelable(AIRemixAwemeEntranceModel.class.getClassLoader()), (AIRemixUserData) parcel.readParcelable(AIRemixAwemeEntranceModel.class.getClassLoader()), (AIRemixAwemeVideoData) parcel.readParcelable(AIRemixAwemeEntranceModel.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final AIRemixAwemeEntranceModel[] newArray(int i) {
            return new AIRemixAwemeEntranceModel[i];
        }
    };

    @C09CT("airemix_aweme_entrance_info")
    public AIRemixAwemeEntranceInfo aiRemixAwemeEntranceInfo;

    @C09CT("aigc_origin_info")
    public AIRemixOriginInfo aiRemixOriginInfo;

    @C09CT("author")
    public AIRemixUserData author;
    public final String name;

    @C09CT("video_data")
    public AIRemixAwemeVideoData videoData;

    public AIRemixAwemeEntranceModel() {
        this(new AIRemixAwemeEntranceInfo(null, null, null, null), new AIRemixOriginInfo(null, null, null, null, null, null, null, null, null), null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AIRemixAwemeEntranceModel)) {
            return false;
        }
        AIRemixAwemeEntranceModel aIRemixAwemeEntranceModel = (AIRemixAwemeEntranceModel) obj;
        return Intrinsics.LJFF(this.aiRemixAwemeEntranceInfo, aIRemixAwemeEntranceModel.aiRemixAwemeEntranceInfo) && Intrinsics.LJFF(this.aiRemixOriginInfo, aIRemixAwemeEntranceModel.aiRemixOriginInfo) && Intrinsics.LJFF(this.author, aIRemixAwemeEntranceModel.author) && Intrinsics.LJFF(this.videoData, aIRemixAwemeEntranceModel.videoData);
    }

    public final int hashCode() {
        int iHashCode = ((this.aiRemixAwemeEntranceInfo.hashCode() * 31) + this.aiRemixOriginInfo.hashCode()) * 31;
        AIRemixUserData aIRemixUserData = this.author;
        int iHashCode2 = (iHashCode + (aIRemixUserData == null ? 0 : aIRemixUserData.hashCode())) * 31;
        AIRemixAwemeVideoData aIRemixAwemeVideoData = this.videoData;
        return iHashCode2 + (aIRemixAwemeVideoData != null ? aIRemixAwemeVideoData.hashCode() : 0);
    }

    @Override // X.AbstractC548720Lfa
    public final List<InterfaceC548750Lfd> provideDataSources() {
        return C1697810uHb.LJIIJJI(this.aiRemixAwemeEntranceInfo, this.aiRemixOriginInfo);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AIRemixAwemeEntranceModel(aiRemixAwemeEntranceInfo=");
        sbLIZ.append(this.aiRemixAwemeEntranceInfo);
        sbLIZ.append(", aiRemixOriginInfo=");
        sbLIZ.append(this.aiRemixOriginInfo);
        sbLIZ.append(", author=");
        sbLIZ.append(this.author);
        sbLIZ.append(", videoData=");
        sbLIZ.append(this.videoData);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.aiRemixAwemeEntranceInfo, i);
        parcel.writeParcelable(this.aiRemixOriginInfo, i);
        parcel.writeParcelable(this.author, i);
        parcel.writeParcelable(this.videoData, i);
    }

    @Override // X.InterfaceC548750Lfd
    public final String getName() {
        return this.name;
    }

    public AIRemixAwemeEntranceModel(AIRemixAwemeEntranceInfo aIRemixAwemeEntranceInfo, AIRemixOriginInfo aIRemixOriginInfo, AIRemixUserData aIRemixUserData, AIRemixAwemeVideoData aIRemixAwemeVideoData) {
        this.aiRemixAwemeEntranceInfo = aIRemixAwemeEntranceInfo;
        this.aiRemixOriginInfo = aIRemixOriginInfo;
        this.author = aIRemixUserData;
        this.videoData = aIRemixAwemeVideoData;
        this.name = "AIRemixContextModel";
    }
}
