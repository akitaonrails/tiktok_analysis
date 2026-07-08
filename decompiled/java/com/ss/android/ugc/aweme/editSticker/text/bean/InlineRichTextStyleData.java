package com.ss.android.ugc.aweme.editSticker.text.bean;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.editSticker.text.bean.InlineRichTextStyle;
import com.ss.android.ugc.aweme.editSticker.text.bean.InlineRichTextStyleData;

/* JADX INFO: loaded from: classes6.dex */
public class InlineRichTextStyleData implements Parcelable {
    public static final Parcelable.Creator<InlineRichTextStyleData> CREATOR = new Parcelable.Creator<InlineRichTextStyleData>() { // from class: X.0FNe
        @Override // android.os.Parcelable.Creator
        public final InlineRichTextStyleData createFromParcel(Parcel parcel) {
            return new InlineRichTextStyleData(parcel.readInt(), parcel.readInt(), (InlineRichTextStyle) parcel.readParcelable(InlineRichTextStyleData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final InlineRichTextStyleData[] newArray(int i) {
            return new InlineRichTextStyleData[i];
        }
    };

    @C09CT("end")
    public final int end;

    @C09CT("inline_style")
    public final InlineRichTextStyle inlineStyle;

    @C09CT("start")
    public final int start;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.start);
        parcel.writeInt(this.end);
        parcel.writeParcelable(this.inlineStyle, i);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("InlineTextStyleData(start=");
        sbLIZ.append(this.start);
        sbLIZ.append(", end=");
        sbLIZ.append(this.end);
        sbLIZ.append(", inlineStyle=");
        sbLIZ.append(this.inlineStyle);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public InlineRichTextStyleData(int i, int i2, InlineRichTextStyle inlineRichTextStyle) {
        this.start = i;
        this.end = i2;
        this.inlineStyle = inlineRichTextStyle;
    }
}
