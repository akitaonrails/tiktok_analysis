package com.ss.android.ugc.aweme.creative.model.edit;

import X.C09CT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.edit.ImageUiBusinessData;
import java.io.Serializable;

/* JADX INFO: loaded from: classes23.dex */
public final class ImageUiBusinessData implements Parcelable, Serializable {
    public static final Parcelable.Creator<ImageUiBusinessData> CREATOR = new Parcelable.Creator<ImageUiBusinessData>() { // from class: X.0ncx
        @Override // android.os.Parcelable.Creator
        public final ImageUiBusinessData createFromParcel(Parcel parcel) {
            boolean z;
            Boolean boolValueOf;
            boolean z2 = true;
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                if (parcel.readInt() == 0) {
                    z2 = false;
                }
                boolValueOf = Boolean.valueOf(z2);
            }
            return new ImageUiBusinessData(z, boolValueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final ImageUiBusinessData[] newArray(int i) {
            return new ImageUiBusinessData[i];
        }
    };

    @C09CT("has_nle_edit")
    public Boolean hasNLEEdit;

    @C09CT("has_showed_title")
    public boolean hasShowedTitle;

    public ImageUiBusinessData() {
        this(false, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r3v0, types: [android.os.Parcel] */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        ?? BooleanValue;
        parcel.writeInt(this.hasShowedTitle ? 1 : 0);
        Boolean bool = this.hasNLEEdit;
        if (bool == null) {
            BooleanValue = 0;
        } else {
            parcel.writeInt(1);
            BooleanValue = bool.booleanValue();
        }
        parcel.writeInt(BooleanValue);
    }

    public final Boolean getHasNLEEdit() {
        return this.hasNLEEdit;
    }

    public final boolean getHasShowedTitle() {
        return this.hasShowedTitle;
    }

    public final void setHasNLEEdit(Boolean bool) {
        this.hasNLEEdit = bool;
    }

    public final void setHasShowedTitle(boolean z) {
        this.hasShowedTitle = z;
    }

    public ImageUiBusinessData(boolean z, Boolean bool) {
        this.hasShowedTitle = z;
        this.hasNLEEdit = bool;
    }
}
