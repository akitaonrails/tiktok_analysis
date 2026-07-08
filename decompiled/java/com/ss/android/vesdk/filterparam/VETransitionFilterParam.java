package com.ss.android.vesdk.filterparam;

import X.C08FF;
import X.C2188811AlT;
import X.C2325341G0m;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes36.dex */
public class VETransitionFilterParam extends VEBaseFilterParam {
    public static final Parcelable.Creator<VETransitionFilterParam> CREATOR = new C2325341G0m(51);
    public int tranDuration;
    public int tranType;
    public String transName;

    @Override // com.ss.android.vesdk.filterparam.VEBaseFilterParam, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public VETransitionFilterParam() {
        this.filterName = "tran filter";
        this.filterType = 14;
        this.transName = "";
        this.tranType = TransitionType.TransitionType_DEFAULT.ordinal();
        this.tranDuration = 500;
    }

    @Override // com.ss.android.vesdk.filterparam.VEBaseFilterParam
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VETransitionFilterParam{transName='");
        sbLIZ.append(this.transName);
        sbLIZ.append('\'');
        sbLIZ.append(", tranType=");
        sbLIZ.append(this.tranType);
        sbLIZ.append(", tranDuration=");
        sbLIZ.append(this.tranDuration);
        sbLIZ.append(", filterType=");
        sbLIZ.append(this.filterType);
        sbLIZ.append(", filterName='");
        sbLIZ.append(this.filterName);
        sbLIZ.append('\'');
        sbLIZ.append(", filterDurationType=");
        sbLIZ.append(this.filterDurationType);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX INFO: loaded from: classes17.dex */
    public enum TransitionType {
        TransitionType_DEFAULT,
        TransitionType_VARIABLE_TIME,
        TransitionType_SINGLE;

        public static TransitionType valueOf(String str) {
            return (TransitionType) C08FF.LIZ(TransitionType.class, str);
        }
    }

    public VETransitionFilterParam(Parcel parcel) {
        super(parcel);
        this.transName = parcel.readString();
        this.tranType = parcel.readInt();
        this.tranDuration = parcel.readInt();
    }

    @Override // com.ss.android.vesdk.filterparam.VEBaseFilterParam, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.transName);
        parcel.writeInt(this.tranType);
        parcel.writeInt(this.tranDuration);
    }
}
