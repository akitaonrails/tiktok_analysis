package com.ss.android.ttvecamera;

import X.C2188811AlT;
import X.C2325341G0m;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes36.dex */
public class TEFocusParameters implements Parcelable {
    public static final Parcelable.Creator<TEFocusParameters> CREATOR = new C2325341G0m(10);
    public Rect mActiveSize;
    public Rect mCropSize;
    public int mMaxRegionsAE;
    public int mMaxRegionsAF;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("active size is:");
        sbLIZ.append(this.mActiveSize.toString());
        sbLIZ.append(" crop size is: ");
        sbLIZ.append(this.mCropSize.toString());
        sbLIZ.append("  max AF regions is: ");
        sbLIZ.append(this.mMaxRegionsAF);
        sbLIZ.append("  max AE regions is: ");
        sbLIZ.append(this.mMaxRegionsAE);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public TEFocusParameters() {
    }

    public TEFocusParameters(Parcel parcel) {
        this.mActiveSize = (Rect) parcel.readParcelable(Rect.class.getClassLoader());
        this.mMaxRegionsAF = parcel.readInt();
        this.mMaxRegionsAE = parcel.readInt();
        this.mCropSize = (Rect) parcel.readParcelable(Rect.class.getClassLoader());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.mActiveSize, i);
        parcel.writeInt(this.mMaxRegionsAF);
        parcel.writeInt(this.mMaxRegionsAE);
        parcel.writeParcelable(this.mCropSize, i);
    }
}
