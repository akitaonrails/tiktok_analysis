package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.datepicker.CalendarConstraints;
import com.google.android.material.datepicker.DateValidatorPointForward;
import java.util.Arrays;

/* JADX INFO: loaded from: classes34.dex */
public class DateValidatorPointForward implements CalendarConstraints.DateValidator {
    public static final Parcelable.Creator<DateValidatorPointForward> CREATOR = new Parcelable.Creator<DateValidatorPointForward>() { // from class: X.19aR
        @Override // android.os.Parcelable.Creator
        public final DateValidatorPointForward createFromParcel(Parcel parcel) {
            return new DateValidatorPointForward(parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        public final DateValidatorPointForward[] newArray(int i) {
            return new DateValidatorPointForward[i];
        }
    };
    public final long point;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.point)});
    }

    public DateValidatorPointForward(long j) {
        this.point = j;
    }

    @Override // com.google.android.material.datepicker.CalendarConstraints.DateValidator
    public final boolean ZH(long j) {
        if (j >= this.point) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof DateValidatorPointForward) && this.point == ((DateValidatorPointForward) obj).point) {
            return true;
        }
        return false;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.point);
    }
}
