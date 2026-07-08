package com.ss.android.ugc.aweme.image.switchmode.payload;

import X.C2188811AlT;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.image.switchmode.payload.AutoCutImageLoadResult;

/* JADX INFO: loaded from: classes23.dex */
public final class AutoCutImageLoadResult extends SwitchModePayload {
    public static final Parcelable.Creator<AutoCutImageLoadResult> CREATOR = new Parcelable.Creator<AutoCutImageLoadResult>() { // from class: X.0mhX
        @Override // android.os.Parcelable.Creator
        public final AutoCutImageLoadResult createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2 = true;
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            if (parcel.readInt() == 0) {
                z2 = false;
            }
            return new AutoCutImageLoadResult(z, z2, parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final AutoCutImageLoadResult[] newArray(int i) {
            return new AutoCutImageLoadResult[i];
        }
    };
    public final boolean hideIntermediateUI;
    public final boolean isSuccess;
    public int livePicCut;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AutoCutImageLoadResult)) {
            return false;
        }
        AutoCutImageLoadResult autoCutImageLoadResult = (AutoCutImageLoadResult) obj;
        return this.isSuccess == autoCutImageLoadResult.isSuccess && this.hideIntermediateUI == autoCutImageLoadResult.hideIntermediateUI && this.livePicCut == autoCutImageLoadResult.livePicCut;
    }

    public final int hashCode() {
        return (((C786410Ut5.Z2(this.isSuccess) * 31) + C786410Ut5.Z2(this.hideIntermediateUI)) * 31) + this.livePicCut;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AutoCutImageLoadResult(isSuccess=");
        sbLIZ.append(this.isSuccess);
        sbLIZ.append(", hideIntermediateUI=");
        sbLIZ.append(this.hideIntermediateUI);
        sbLIZ.append(", livePicCut=");
        sbLIZ.append(this.livePicCut);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.isSuccess ? 1 : 0);
        parcel.writeInt(this.hideIntermediateUI ? 1 : 0);
        parcel.writeInt(this.livePicCut);
    }

    @Override // com.ss.android.ugc.aweme.image.switchmode.payload.SwitchModePayload
    public final boolean LIZ() {
        return this.hideIntermediateUI;
    }

    @Override // com.ss.android.ugc.aweme.image.switchmode.payload.SwitchModePayload
    public final int LIZIZ() {
        return this.livePicCut;
    }

    @Override // com.ss.android.ugc.aweme.image.switchmode.payload.SwitchModePayload
    public final void LIZJ(int i) {
        this.livePicCut = i;
    }

    public AutoCutImageLoadResult(boolean z, boolean z2, int i) {
        super(SwitchModePayloadType.AUTO_CUT_IMAGE_LOAD_RESULT, z2, i);
        this.isSuccess = z;
        this.hideIntermediateUI = z2;
        this.livePicCut = i;
    }
}
