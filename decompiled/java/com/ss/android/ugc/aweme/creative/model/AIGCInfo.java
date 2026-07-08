package com.ss.android.ugc.aweme.creative.model;

import X.C040H;
import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.AIGCInfo;

/* JADX INFO: loaded from: classes23.dex */
public final class AIGCInfo implements Parcelable {
    public static final Parcelable.Creator<AIGCInfo> CREATOR = new Parcelable.Creator<AIGCInfo>() { // from class: X.0nWi
        @Override // android.os.Parcelable.Creator
        public final AIGCInfo createFromParcel(Parcel parcel) {
            boolean z;
            int i = parcel.readInt();
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            return new AIGCInfo(i, z, parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final AIGCInfo[] newArray(int i) {
            return new AIGCInfo[i];
        }
    };

    @C09CT("aigc_label_type")
    public int AIGCLabelType;

    @C040H
    public int AIGCSwitchStatusWhenCompile;

    @C09CT("manual_change_switch")
    public boolean manualChangeSwitch;

    public AIGCInfo() {
        this(0, false, 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AIGCInfo)) {
            return false;
        }
        AIGCInfo aIGCInfo = (AIGCInfo) obj;
        return this.AIGCLabelType == aIGCInfo.AIGCLabelType && this.manualChangeSwitch == aIGCInfo.manualChangeSwitch && this.AIGCSwitchStatusWhenCompile == aIGCInfo.AIGCSwitchStatusWhenCompile;
    }

    public final int hashCode() {
        return (((this.AIGCLabelType * 31) + C786410Ut5.Z2(this.manualChangeSwitch)) * 31) + this.AIGCSwitchStatusWhenCompile;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AIGCInfo(AIGCLabelType=");
        sbLIZ.append(this.AIGCLabelType);
        sbLIZ.append(", manualChangeSwitch=");
        sbLIZ.append(this.manualChangeSwitch);
        sbLIZ.append(", AIGCSwitchStatusWhenCompile=");
        sbLIZ.append(this.AIGCSwitchStatusWhenCompile);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.AIGCLabelType);
        parcel.writeInt(this.manualChangeSwitch ? 1 : 0);
        parcel.writeInt(this.AIGCSwitchStatusWhenCompile);
    }

    public AIGCInfo(int i, boolean z, int i2) {
        this.AIGCLabelType = i;
        this.manualChangeSwitch = z;
        this.AIGCSwitchStatusWhenCompile = i2;
    }
}
