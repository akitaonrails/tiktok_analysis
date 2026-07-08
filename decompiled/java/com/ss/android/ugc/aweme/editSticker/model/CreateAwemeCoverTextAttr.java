package com.ss.android.ugc.aweme.editSticker.model;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.editSticker.model.CreateAwemeCoverTextAttr;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class CreateAwemeCoverTextAttr implements Parcelable, Serializable {
    public static final Parcelable.Creator<CreateAwemeCoverTextAttr> CREATOR = new Parcelable.Creator<CreateAwemeCoverTextAttr>() { // from class: X.0nJk
        @Override // android.os.Parcelable.Creator
        public final CreateAwemeCoverTextAttr createFromParcel(Parcel parcel) {
            return new CreateAwemeCoverTextAttr(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CreateAwemeCoverTextAttr[] newArray(int i) {
            return new CreateAwemeCoverTextAttr[i];
        }
    };

    @C09CT("cover_text_font")
    public final String coverTextFont;

    @C09CT("cover_text_id")
    public final String coverTextId;

    @C09CT("cover_text_color")
    public final String covertTextColor;

    public final CreateAwemeCoverTextAttr copy(String str, String str2, String str3) {
        return new CreateAwemeCoverTextAttr(str, str2, str3);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CreateAwemeCoverTextAttr)) {
            return false;
        }
        CreateAwemeCoverTextAttr createAwemeCoverTextAttr = (CreateAwemeCoverTextAttr) obj;
        return Intrinsics.LJFF(this.coverTextId, createAwemeCoverTextAttr.coverTextId) && Intrinsics.LJFF(this.coverTextFont, createAwemeCoverTextAttr.coverTextFont) && Intrinsics.LJFF(this.covertTextColor, createAwemeCoverTextAttr.covertTextColor);
    }

    public int hashCode() {
        return (((this.coverTextId.hashCode() * 31) + this.coverTextFont.hashCode()) * 31) + this.covertTextColor.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CreateAwemeCoverTextAttr(coverTextId=");
        sbLIZ.append(this.coverTextId);
        sbLIZ.append(", coverTextFont=");
        sbLIZ.append(this.coverTextFont);
        sbLIZ.append(", covertTextColor=");
        sbLIZ.append(this.covertTextColor);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.coverTextId);
        parcel.writeString(this.coverTextFont);
        parcel.writeString(this.covertTextColor);
    }

    public final String getCoverTextFont() {
        return this.coverTextFont;
    }

    public final String getCoverTextId() {
        return this.coverTextId;
    }

    public final String getCovertTextColor() {
        return this.covertTextColor;
    }

    public CreateAwemeCoverTextAttr(String str, String str2, String str3) {
        this.coverTextId = str;
        this.coverTextFont = str2;
        this.covertTextColor = str3;
    }
}
