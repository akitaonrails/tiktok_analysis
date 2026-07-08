package com.bytedance.android.livesdk.comp.api.subscription.model.actionsheet;

import X.C500640JkE;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.android.livesdk.comp.api.subscription.model.actionsheet.SubActionSheetDescription;

/* JADX INFO: loaded from: classes8.dex */
public final class SubActionSheetDescription implements Parcelable {
    public final String type;
    public final String value;
    public static final C500640JkE Companion = new Object() { // from class: X.0JkE
    };
    public static final Parcelable.Creator<SubActionSheetDescription> CREATOR = new Parcelable.Creator<SubActionSheetDescription>() { // from class: X.0JkD
        @Override // android.os.Parcelable.Creator
        public final SubActionSheetDescription createFromParcel(Parcel parcel) {
            return new SubActionSheetDescription(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final SubActionSheetDescription[] newArray(int i) {
            return new SubActionSheetDescription[i];
        }
    };

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.type);
        parcel.writeString(this.value);
    }

    public SubActionSheetDescription(String str, String str2) {
        this.type = str;
        this.value = str2;
    }
}
