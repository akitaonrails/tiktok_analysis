package com.ss.android.ugc.aweme.creative.model.publish;

import X.C040H;
import X.C2188811AlT;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.publish.SmartCodecMobDataModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class SmartCodecMobDataModel implements Parcelable {
    public static final Parcelable.Creator<SmartCodecMobDataModel> CREATOR = new Parcelable.Creator<SmartCodecMobDataModel>() { // from class: X.0mby
        @Override // android.os.Parcelable.Creator
        public final SmartCodecMobDataModel createFromParcel(Parcel parcel) {
            boolean z;
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            return new SmartCodecMobDataModel(z, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final SmartCodecMobDataModel[] newArray(int i) {
            return new SmartCodecMobDataModel[i];
        }
    };

    @C040H
    public boolean isUseSmartCodec;

    @C040H
    public String notUseSmartCodecReason;

    public SmartCodecMobDataModel() {
        this(0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SmartCodecMobDataModel)) {
            return false;
        }
        SmartCodecMobDataModel smartCodecMobDataModel = (SmartCodecMobDataModel) obj;
        return this.isUseSmartCodec == smartCodecMobDataModel.isUseSmartCodec && Intrinsics.LJFF(this.notUseSmartCodecReason, smartCodecMobDataModel.notUseSmartCodecReason);
    }

    public final int hashCode() {
        return (C786410Ut5.Z2(this.isUseSmartCodec) * 31) + this.notUseSmartCodecReason.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SmartCodecMobDataModel(isUseSmartCodec=");
        sbLIZ.append(this.isUseSmartCodec);
        sbLIZ.append(", notUseSmartCodecReason=");
        sbLIZ.append(this.notUseSmartCodecReason);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.isUseSmartCodec ? 1 : 0);
        parcel.writeString(this.notUseSmartCodecReason);
    }

    public /* synthetic */ SmartCodecMobDataModel(int i) {
        this(false, "");
    }

    public SmartCodecMobDataModel(boolean z, String str) {
        this.isUseSmartCodec = z;
        this.notUseSmartCodecReason = str;
    }
}
