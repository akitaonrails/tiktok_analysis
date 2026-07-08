package com.ss.android.ugc.aweme.creative.model.aigc;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.airemix.model.AIRemixModel;
import com.ss.android.ugc.aweme.creative.model.aigc.AIGCBusinessModelSet;
import com.ss.android.ugc.aweme.portrait.model.AIPortraitModel;
import com.ss.android.ugc.aweme.theater.model.AITheaterModel;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class AIGCBusinessModelSet implements Parcelable {
    public static final Parcelable.Creator<AIGCBusinessModelSet> CREATOR = new Parcelable.Creator<AIGCBusinessModelSet>() { // from class: X.0LgA
        @Override // android.os.Parcelable.Creator
        public final AIGCBusinessModelSet createFromParcel(Parcel parcel) {
            return new AIGCBusinessModelSet((AITheaterModel) parcel.readParcelable(AIGCBusinessModelSet.class.getClassLoader()), (AIRemixModel) parcel.readParcelable(AIGCBusinessModelSet.class.getClassLoader()), (AIPortraitModel) parcel.readParcelable(AIGCBusinessModelSet.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final AIGCBusinessModelSet[] newArray(int i) {
            return new AIGCBusinessModelSet[i];
        }
    };

    @C09CT("ai_portrait_model")
    public AIPortraitModel aiPortraitModel;

    @C09CT("ai_remix_model")
    public AIRemixModel aiRemixModel;

    @C09CT(alternate = {"chat_room_model"}, value = "ai_theater_model")
    public AITheaterModel aiTheaterModel;

    /* JADX WARN: Multi-variable type inference failed */
    public AIGCBusinessModelSet() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AIGCBusinessModelSet)) {
            return false;
        }
        AIGCBusinessModelSet aIGCBusinessModelSet = (AIGCBusinessModelSet) obj;
        return Intrinsics.LJFF(this.aiTheaterModel, aIGCBusinessModelSet.aiTheaterModel) && Intrinsics.LJFF(this.aiRemixModel, aIGCBusinessModelSet.aiRemixModel) && Intrinsics.LJFF(this.aiPortraitModel, aIGCBusinessModelSet.aiPortraitModel);
    }

    public final int hashCode() {
        AITheaterModel aITheaterModel = this.aiTheaterModel;
        int iHashCode = (aITheaterModel == null ? 0 : aITheaterModel.hashCode()) * 31;
        AIRemixModel aIRemixModel = this.aiRemixModel;
        int iHashCode2 = (iHashCode + (aIRemixModel == null ? 0 : aIRemixModel.hashCode())) * 31;
        AIPortraitModel aIPortraitModel = this.aiPortraitModel;
        return iHashCode2 + (aIPortraitModel != null ? aIPortraitModel.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AIGCBusinessModelSet(aiTheaterModel=");
        sbLIZ.append(this.aiTheaterModel);
        sbLIZ.append(", aiRemixModel=");
        sbLIZ.append(this.aiRemixModel);
        sbLIZ.append(", aiPortraitModel=");
        sbLIZ.append(this.aiPortraitModel);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.aiTheaterModel, i);
        parcel.writeParcelable(this.aiRemixModel, i);
        parcel.writeParcelable(this.aiPortraitModel, i);
    }

    public AIGCBusinessModelSet(AITheaterModel aITheaterModel, AIRemixModel aIRemixModel, AIPortraitModel aIPortraitModel) {
        this.aiTheaterModel = aITheaterModel;
        this.aiRemixModel = aIRemixModel;
        this.aiPortraitModel = aIPortraitModel;
    }

    public /* synthetic */ AIGCBusinessModelSet(AITheaterModel aITheaterModel, AIRemixModel aIRemixModel, AIPortraitModel aIPortraitModel, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : aITheaterModel, (i & 2) != 0 ? null : aIRemixModel, (i & 4) != 0 ? null : aIPortraitModel);
    }
}
