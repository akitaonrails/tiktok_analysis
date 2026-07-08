package com.ss.android.ugc.aweme.editSticker.model;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.editSticker.model.CreateAwemeCoverInfo;
import com.ss.android.ugc.aweme.editSticker.model.CreateAwemeCoverTextAttr;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class CreateAwemeCoverInfo implements Parcelable, Serializable {
    public static final Parcelable.Creator<CreateAwemeCoverInfo> CREATOR = new Parcelable.Creator<CreateAwemeCoverInfo>() { // from class: X.0nJj
        @Override // android.os.Parcelable.Creator
        public final CreateAwemeCoverInfo createFromParcel(Parcel parcel) {
            return new CreateAwemeCoverInfo(parcel.readInt(), parcel.readInt(), CreateAwemeCoverTextAttr.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final CreateAwemeCoverInfo[] newArray(int i) {
            return new CreateAwemeCoverInfo[i];
        }
    };

    @C09CT("cover_text_attr")
    public final CreateAwemeCoverTextAttr coverTextAttr;

    @C09CT("is_cover_positioned")
    public final int isCoverPositioned;

    @C09CT("is_cover_text")
    public final int isCoverText;

    public final CreateAwemeCoverInfo copy(int i, int i2, CreateAwemeCoverTextAttr createAwemeCoverTextAttr) {
        return new CreateAwemeCoverInfo(i, i2, createAwemeCoverTextAttr);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CreateAwemeCoverInfo)) {
            return false;
        }
        CreateAwemeCoverInfo createAwemeCoverInfo = (CreateAwemeCoverInfo) obj;
        return this.isCoverText == createAwemeCoverInfo.isCoverText && this.isCoverPositioned == createAwemeCoverInfo.isCoverPositioned && Intrinsics.LJFF(this.coverTextAttr, createAwemeCoverInfo.coverTextAttr);
    }

    public int hashCode() {
        return (((this.isCoverText * 31) + this.isCoverPositioned) * 31) + this.coverTextAttr.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CreateAwemeCoverInfo(isCoverText=");
        sbLIZ.append(this.isCoverText);
        sbLIZ.append(", isCoverPositioned=");
        sbLIZ.append(this.isCoverPositioned);
        sbLIZ.append(", coverTextAttr=");
        sbLIZ.append(this.coverTextAttr);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.isCoverText);
        parcel.writeInt(this.isCoverPositioned);
        this.coverTextAttr.writeToParcel(parcel, i);
    }

    public final CreateAwemeCoverTextAttr getCoverTextAttr() {
        return this.coverTextAttr;
    }

    public final int isCoverPositioned() {
        return this.isCoverPositioned;
    }

    public final int isCoverText() {
        return this.isCoverText;
    }

    public CreateAwemeCoverInfo(int i, int i2, CreateAwemeCoverTextAttr createAwemeCoverTextAttr) {
        this.isCoverText = i;
        this.isCoverPositioned = i2;
        this.coverTextAttr = createAwemeCoverTextAttr;
    }
}
