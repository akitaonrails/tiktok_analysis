package com.ss.android.ugc.aweme.image.switchmode.payload;

import X.C2188811AlT;
import X.C786410Ut5;
import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.image.switchmode.payload.AutoCutReturn;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class AutoCutReturn extends SwitchModePayload {
    public static final Parcelable.Creator<AutoCutReturn> CREATOR = new Parcelable.Creator<AutoCutReturn>() { // from class: X.0mha
        @Override // android.os.Parcelable.Creator
        public final AutoCutReturn createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            boolean z3;
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            if (parcel.readInt() != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            Bitmap bitmap = (Bitmap) parcel.readParcelable(AutoCutReturn.class.getClassLoader());
            if (parcel.readInt() != 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            return new AutoCutReturn(z, z2, bitmap, z3, parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final AutoCutReturn[] newArray(int i) {
            return new AutoCutReturn[i];
        }
    };
    public Bitmap captureBitmap;
    public final boolean clickNext;
    public final boolean clickStory;
    public final boolean hideIntermediateUI;
    public int livePicCut;

    /* JADX WARN: Illegal instructions before constructor call */
    public AutoCutReturn() {
        boolean z = false;
        this(z, z, 31);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AutoCutReturn)) {
            return false;
        }
        AutoCutReturn autoCutReturn = (AutoCutReturn) obj;
        return this.clickNext == autoCutReturn.clickNext && this.clickStory == autoCutReturn.clickStory && Intrinsics.LJFF(this.captureBitmap, autoCutReturn.captureBitmap) && this.hideIntermediateUI == autoCutReturn.hideIntermediateUI && this.livePicCut == autoCutReturn.livePicCut;
    }

    public final int hashCode() {
        int iZ2 = ((C786410Ut5.Z2(this.clickNext) * 31) + C786410Ut5.Z2(this.clickStory)) * 31;
        Bitmap bitmap = this.captureBitmap;
        return ((((iZ2 + (bitmap == null ? 0 : bitmap.hashCode())) * 31) + C786410Ut5.Z2(this.hideIntermediateUI)) * 31) + this.livePicCut;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AutoCutReturn(clickNext=");
        sbLIZ.append(this.clickNext);
        sbLIZ.append(", clickStory=");
        sbLIZ.append(this.clickStory);
        sbLIZ.append(", captureBitmap=");
        sbLIZ.append(this.captureBitmap);
        sbLIZ.append(", hideIntermediateUI=");
        sbLIZ.append(this.hideIntermediateUI);
        sbLIZ.append(", livePicCut=");
        sbLIZ.append(this.livePicCut);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.clickNext ? 1 : 0);
        parcel.writeInt(this.clickStory ? 1 : 0);
        parcel.writeParcelable(this.captureBitmap, i);
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

    public /* synthetic */ AutoCutReturn(boolean z, boolean z2, int i) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, null, false, 0);
    }

    public AutoCutReturn(boolean z, boolean z2, Bitmap bitmap, boolean z3, int i) {
        super(SwitchModePayloadType.AUTO_CUT_RETURN, z3, i);
        this.clickNext = z;
        this.clickStory = z2;
        this.captureBitmap = bitmap;
        this.hideIntermediateUI = z3;
        this.livePicCut = i;
    }
}
