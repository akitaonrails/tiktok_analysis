package com.ss.android.ugc.aweme.creative.model.edit.aicover;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.edit.aicover.AICoverMobModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class AICoverMobModel implements Parcelable {
    public static final Parcelable.Creator<AICoverMobModel> CREATOR = new Parcelable.Creator<AICoverMobModel>() { // from class: X.0nWU
        @Override // android.os.Parcelable.Creator
        public final AICoverMobModel createFromParcel(Parcel parcel) {
            boolean z;
            Integer numValueOf;
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            return new AICoverMobModel(z, numValueOf, parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AICoverMobModel[] newArray(int i) {
            return new AICoverMobModel[i];
        }
    };

    @C09CT("current_action_type")
    public String currentActionType;

    @C09CT("has_entered_ai_cover")
    public boolean hasEnteredAiCover;

    @C09CT("used_pic_cnt")
    public Integer usedPicCnt;

    @C09CT("used_pic_uri")
    public String usedPicUri;

    public AICoverMobModel() {
        this(false, null, null, "");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AICoverMobModel)) {
            return false;
        }
        AICoverMobModel aICoverMobModel = (AICoverMobModel) obj;
        return this.hasEnteredAiCover == aICoverMobModel.hasEnteredAiCover && Intrinsics.LJFF(this.usedPicCnt, aICoverMobModel.usedPicCnt) && Intrinsics.LJFF(this.usedPicUri, aICoverMobModel.usedPicUri) && Intrinsics.LJFF(this.currentActionType, aICoverMobModel.currentActionType);
    }

    public final int hashCode() {
        int iZ2 = C786410Ut5.Z2(this.hasEnteredAiCover) * 31;
        Integer num = this.usedPicCnt;
        int iHashCode = (iZ2 + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.usedPicUri;
        return ((iHashCode + (str != null ? str.hashCode() : 0)) * 31) + this.currentActionType.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AICoverMobModel(hasEnteredAiCover=");
        sbLIZ.append(this.hasEnteredAiCover);
        sbLIZ.append(", usedPicCnt=");
        sbLIZ.append(this.usedPicCnt);
        sbLIZ.append(", usedPicUri=");
        sbLIZ.append(this.usedPicUri);
        sbLIZ.append(", currentActionType=");
        sbLIZ.append(this.currentActionType);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iIntValue;
        parcel.writeInt(this.hasEnteredAiCover ? 1 : 0);
        Integer num = this.usedPicCnt;
        if (num == null) {
            iIntValue = 0;
        } else {
            parcel.writeInt(1);
            iIntValue = num.intValue();
        }
        parcel.writeInt(iIntValue);
        parcel.writeString(this.usedPicUri);
        parcel.writeString(this.currentActionType);
    }

    public AICoverMobModel(boolean z, Integer num, String str, String str2) {
        this.hasEnteredAiCover = z;
        this.usedPicCnt = num;
        this.usedPicUri = str;
        this.currentActionType = str2;
    }
}
