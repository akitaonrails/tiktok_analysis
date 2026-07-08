package com.bytedance.android.livesdk.comp.api.subscription.model.actionsheet;

import X.C500660JkG;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.android.livesdk.comp.api.subscription.model.actionsheet.SubActionSheetAction;

/* JADX INFO: loaded from: classes8.dex */
public final class SubActionSheetAction implements Parcelable {
    public final int index;
    public final String text;
    public final String variant;
    public static final C500660JkG Companion = new Object() { // from class: X.0JkG
    };
    public static final Parcelable.Creator<SubActionSheetAction> CREATOR = new Parcelable.Creator<SubActionSheetAction>() { // from class: X.0JkF
        @Override // android.os.Parcelable.Creator
        public final SubActionSheetAction createFromParcel(Parcel parcel) {
            return new SubActionSheetAction(parcel.readString(), parcel.readInt(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final SubActionSheetAction[] newArray(int i) {
            return new SubActionSheetAction[i];
        }
    };

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.variant);
        parcel.writeInt(this.index);
        parcel.writeString(this.text);
    }

    public SubActionSheetAction(String str, int i, String str2) {
        this.variant = str;
        this.index = i;
        this.text = str2;
    }
}
