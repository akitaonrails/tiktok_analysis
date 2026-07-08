package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.datepicker.CalendarConstraints;
import com.google.android.material.datepicker.DateValidatorPointBackward;
import java.util.Arrays;

/* JADX INFO: loaded from: classes34.dex */
public class DateValidatorPointBackward implements CalendarConstraints.DateValidator {
    public static final Parcelable.Creator<DateValidatorPointBackward> CREATOR = new Parcelable.Creator<DateValidatorPointBackward>() { // from class: X.19ac
        @Override // android.os.Parcelable.Creator
        public final DateValidatorPointBackward createFromParcel(Parcel parcel) {
            return new DateValidatorPointBackward(parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        public final DateValidatorPointBackward[] newArray(int i) {
            return new DateValidatorPointBackward[i];
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

    public DateValidatorPointBackward(long j) {
        this.point = j;
    }

    @Override // com.google.android.material.datepicker.CalendarConstraints.DateValidator
    public final boolean ZH(long j) {
        if (j <= this.point) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof DateValidatorPointBackward) && this.point == ((DateValidatorPointBackward) obj).point) {
            return true;
        }
        return false;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.point);
    }
}
