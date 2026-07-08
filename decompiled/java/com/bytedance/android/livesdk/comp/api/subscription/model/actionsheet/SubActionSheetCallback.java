package com.bytedance.android.livesdk.comp.api.subscription.model.actionsheet;

import X.C500680JkI;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.android.livesdk.comp.api.subscription.model.actionsheet.SubActionSheetCallback;

/* JADX INFO: loaded from: classes8.dex */
public class SubActionSheetCallback implements Parcelable {
    public static final C500680JkI Companion = new Object() { // from class: X.0JkI
    };
    public static final Parcelable.Creator<SubActionSheetCallback> CREATOR = new Parcelable.Creator<SubActionSheetCallback>() { // from class: X.0JkH
        @Override // android.os.Parcelable.Creator
        public final SubActionSheetCallback createFromParcel(Parcel parcel) {
            parcel.readInt();
            return new SubActionSheetCallback();
        }

        @Override // android.os.Parcelable.Creator
        public final SubActionSheetCallback[] newArray(int i) {
            return new SubActionSheetCallback[i];
        }
    };

    public void LIZ(SubActionSheetAction subActionSheetAction) {
    }

    public void LIZIZ() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
