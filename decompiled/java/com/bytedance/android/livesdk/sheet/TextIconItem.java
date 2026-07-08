package com.bytedance.android.livesdk.sheet;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.android.livesdk.sheet.TextIconItem;

/* JADX INFO: loaded from: classes14.dex */
public final class TextIconItem implements Parcelable {
    public static final Parcelable.Creator<TextIconItem> CREATOR = new Parcelable.Creator<TextIconItem>() { // from class: X.0W8p
        @Override // android.os.Parcelable.Creator
        public final TextIconItem createFromParcel(Parcel parcel) {
            parcel.readInt();
            return new TextIconItem();
        }

        @Override // android.os.Parcelable.Creator
        public final TextIconItem[] newArray(int i) {
            return new TextIconItem[i];
        }
    };
    public String iconName;
    public Integer id;
    public String text;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
