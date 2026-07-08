package com.ss.android.ugc.aweme.theater.model;

import X.AbstractC548720Lfa;
import X.C040H;
import X.C09CT;
import X.C0LQY;
import X.C1697810uHb;
import X.C2188811AlT;
import X.EnumC547660Lds;
import X.InterfaceC548750Lfd;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.aigc.quality.mob.business.AIGCCreationInputInfo;
import com.ss.android.ugc.aweme.aigc.quality.mob.business.AIGCCreationResultInfo;
import com.ss.android.ugc.aweme.aigc.quality.mob.business.AIGCEntranceInfo;
import com.ss.android.ugc.aweme.aigc.quality.mob.business.AIGCOriginInfo;
import com.ss.android.ugc.aweme.aigc.quality.mob.definitions.AIGC;
import com.ss.android.ugc.aweme.theater.model.AITheaterContextModel;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class AITheaterContextModel extends AbstractC548720Lfa implements Parcelable {
    public static final Parcelable.Creator<AITheaterContextModel> CREATOR = new Parcelable.Creator<AITheaterContextModel>() { // from class: X.0LfY
        @Override // android.os.Parcelable.Creator
        public final AITheaterContextModel createFromParcel(Parcel parcel) {
            return new AITheaterContextModel((AIGCEntranceInfo) parcel.readParcelable(AITheaterContextModel.class.getClassLoader()), (AIGCCreationInputInfo) parcel.readParcelable(AITheaterContextModel.class.getClassLoader()), (AIGCCreationResultInfo) parcel.readParcelable(AITheaterContextModel.class.getClassLoader()), (AIGCOriginInfo) parcel.readParcelable(AITheaterContextModel.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final AITheaterContextModel[] newArray(int i) {
            return new AITheaterContextModel[i];
        }
    };

    @C09CT("aigc_creation_input_info")
    public AIGCCreationInputInfo aigcCreationInputInfo;

    @C09CT("aigc_creation_result_info")
    public AIGCCreationResultInfo aigcCreationResultInfo;

    @C09CT("aigc_entrance_info")
    public AIGCEntranceInfo aigcEntranceInfo;

    @C09CT("aigc_origin_info")
    public AIGCOriginInfo aigcOriginInfo;

    @C040H
    public final String name;

    public AITheaterContextModel() {
        this(new AIGCEntranceInfo(C0LQY.AI_THEATER, null, 0, null, null, null, false, false, false, AIGC.AICreationSceneName.PROACTIVE_CRT_POST.INSTANCE, AIGC.RefPageName.NoNeed.INSTANCE, null, null, null, null, false, false, null, null, null), new AIGCCreationInputInfo(false, null, null, 0, null, null, null, null, false, 0, null, 0, Boolean.FALSE, null, null), new AIGCCreationResultInfo(null, null, 0L, null, EnumC547660Lds.UNKNOWN.getValue()), new AIGCOriginInfo(null, null, null, null, null, null, null, null, null, null));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AITheaterContextModel)) {
            return false;
        }
        AITheaterContextModel aITheaterContextModel = (AITheaterContextModel) obj;
        return Intrinsics.LJFF(this.aigcEntranceInfo, aITheaterContextModel.aigcEntranceInfo) && Intrinsics.LJFF(this.aigcCreationInputInfo, aITheaterContextModel.aigcCreationInputInfo) && Intrinsics.LJFF(this.aigcCreationResultInfo, aITheaterContextModel.aigcCreationResultInfo) && Intrinsics.LJFF(this.aigcOriginInfo, aITheaterContextModel.aigcOriginInfo);
    }

    public final int hashCode() {
        return (((((this.aigcEntranceInfo.hashCode() * 31) + this.aigcCreationInputInfo.hashCode()) * 31) + this.aigcCreationResultInfo.hashCode()) * 31) + this.aigcOriginInfo.hashCode();
    }

    @Override // X.AbstractC548720Lfa
    public final List<InterfaceC548750Lfd> provideDataSources() {
        return C1697810uHb.LJIIJJI(this.aigcEntranceInfo, this.aigcCreationInputInfo, this.aigcCreationResultInfo, this.aigcOriginInfo);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AITheaterContextModel(aigcEntranceInfo=");
        sbLIZ.append(this.aigcEntranceInfo);
        sbLIZ.append(", aigcCreationInputInfo=");
        sbLIZ.append(this.aigcCreationInputInfo);
        sbLIZ.append(", aigcCreationResultInfo=");
        sbLIZ.append(this.aigcCreationResultInfo);
        sbLIZ.append(", aigcOriginInfo=");
        sbLIZ.append(this.aigcOriginInfo);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.aigcEntranceInfo, i);
        parcel.writeParcelable(this.aigcCreationInputInfo, i);
        parcel.writeParcelable(this.aigcCreationResultInfo, i);
        parcel.writeParcelable(this.aigcOriginInfo, i);
    }

    @Override // X.InterfaceC548750Lfd
    public final String getName() {
        return this.name;
    }

    public AITheaterContextModel(AIGCEntranceInfo aIGCEntranceInfo, AIGCCreationInputInfo aIGCCreationInputInfo, AIGCCreationResultInfo aIGCCreationResultInfo, AIGCOriginInfo aIGCOriginInfo) {
        this.aigcEntranceInfo = aIGCEntranceInfo;
        this.aigcCreationInputInfo = aIGCCreationInputInfo;
        this.aigcCreationResultInfo = aIGCCreationResultInfo;
        this.aigcOriginInfo = aIGCOriginInfo;
        this.name = "AITheaterContextModel";
    }
}
