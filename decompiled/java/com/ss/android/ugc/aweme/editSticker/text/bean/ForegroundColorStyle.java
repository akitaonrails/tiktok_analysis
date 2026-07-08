package com.ss.android.ugc.aweme.editSticker.text.bean;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.editSticker.text.bean.ForegroundColorStyle;

/* JADX INFO: loaded from: classes30.dex */
public final class ForegroundColorStyle extends InlineRichTextStyle {
    public static final Parcelable.Creator<ForegroundColorStyle> CREATOR = new Parcelable.Creator<ForegroundColorStyle>() { // from class: X.125u
        @Override // android.os.Parcelable.Creator
        public final ForegroundColorStyle createFromParcel(Parcel parcel) {
            return new ForegroundColorStyle(parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final ForegroundColorStyle[] newArray(int i) {
            return new ForegroundColorStyle[i];
        }
    };

    @C09CT("color")
    public final int color;

    @Override // com.ss.android.ugc.aweme.editSticker.text.bean.InlineRichTextStyle, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.editSticker.text.bean.InlineRichTextStyle, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.color);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ForegroundColorStyle(color=");
        sbLIZ.append(this.color);
        sbLIZ.append(", type='");
        sbLIZ.append(this.type);
        sbLIZ.append("')");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public ForegroundColorStyle(int i) {
        super("ForegroundColorStyle");
        this.color = i;
    }
}
