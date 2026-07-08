package com.ss.android.ugc.aweme.image.switchmode.payload;

import X.C2188811AlT;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.image.switchmode.payload.SidebarActionPayload;

/* JADX INFO: loaded from: classes23.dex */
public final class SidebarActionPayload extends SwitchModePayload {
    public static final Parcelable.Creator<SidebarActionPayload> CREATOR = new Parcelable.Creator<SidebarActionPayload>() { // from class: X.0mhZ
        @Override // android.os.Parcelable.Creator
        public final SidebarActionPayload createFromParcel(Parcel parcel) {
            boolean z;
            int i = parcel.readInt();
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            return new SidebarActionPayload(i, z, parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final SidebarActionPayload[] newArray(int i) {
            return new SidebarActionPayload[i];
        }
    };
    public final int actionType;
    public final boolean hideIntermediateUI;
    public int livePicCut;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SidebarActionPayload)) {
            return false;
        }
        SidebarActionPayload sidebarActionPayload = (SidebarActionPayload) obj;
        return this.actionType == sidebarActionPayload.actionType && this.hideIntermediateUI == sidebarActionPayload.hideIntermediateUI && this.livePicCut == sidebarActionPayload.livePicCut;
    }

    public final int hashCode() {
        return (((this.actionType * 31) + C786410Ut5.Z2(this.hideIntermediateUI)) * 31) + this.livePicCut;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SidebarActionPayload(actionType=");
        sbLIZ.append(this.actionType);
        sbLIZ.append(", hideIntermediateUI=");
        sbLIZ.append(this.hideIntermediateUI);
        sbLIZ.append(", livePicCut=");
        sbLIZ.append(this.livePicCut);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.actionType);
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

    public /* synthetic */ SidebarActionPayload(int i) {
        this(i, true, 0);
    }

    @Override // com.ss.android.ugc.aweme.image.switchmode.payload.SwitchModePayload
    public final void LIZJ(int i) {
        this.livePicCut = i;
    }

    public SidebarActionPayload(int i, boolean z, int i2) {
        super(SwitchModePayloadType.SIDE_BAR_ACTION, z, i2);
        this.actionType = i;
        this.hideIntermediateUI = z;
        this.livePicCut = i2;
    }
}
