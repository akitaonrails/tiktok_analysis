package com.google.android.material.datepicker;

import X.InterfaceC2259811Dch;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.datepicker.CalendarConstraints;
import com.google.android.material.datepicker.CompositeDateValidator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes36.dex */
public final class CompositeDateValidator implements CalendarConstraints.DateValidator {
    public final InterfaceC2259811Dch operator;
    public final List<CalendarConstraints.DateValidator> validators;
    public static final InterfaceC2259811Dch ANY_OPERATOR = new InterfaceC2259811Dch() { // from class: X.1Dcf
        @Override // X.InterfaceC2259811Dch
        public final int getId() {
            return 1;
        }

        @Override // X.InterfaceC2259811Dch
        public final boolean LIZ(long j, List list) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                CalendarConstraints.DateValidator dateValidator = (CalendarConstraints.DateValidator) it2.next();
                if (dateValidator != null && dateValidator.ZH(j)) {
                    return true;
                }
            }
            return false;
        }
    };
    public static final InterfaceC2259811Dch ALL_OPERATOR = new InterfaceC2259811Dch() { // from class: X.1Dcg
        @Override // X.InterfaceC2259811Dch
        public final int getId() {
            return 2;
        }

        @Override // X.InterfaceC2259811Dch
        public final boolean LIZ(long j, List list) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                CalendarConstraints.DateValidator dateValidator = (CalendarConstraints.DateValidator) it2.next();
                if (dateValidator != null && !dateValidator.ZH(j)) {
                    return false;
                }
            }
            return true;
        }
    };
    public static final Parcelable.Creator<CompositeDateValidator> CREATOR = new Parcelable.Creator<CompositeDateValidator>() { // from class: X.1Dce
        @Override // android.os.Parcelable.Creator
        public final CompositeDateValidator createFromParcel(Parcel parcel) {
            InterfaceC2259811Dch interfaceC2259811Dch;
            ArrayList arrayList = parcel.readArrayList(CalendarConstraints.DateValidator.class.getClassLoader());
            int i = parcel.readInt();
            if (i != 2 && i == 1) {
                interfaceC2259811Dch = CompositeDateValidator.ANY_OPERATOR;
            } else {
                interfaceC2259811Dch = CompositeDateValidator.ALL_OPERATOR;
            }
            arrayList.getClass();
            return new CompositeDateValidator(arrayList, interfaceC2259811Dch);
        }

        @Override // android.os.Parcelable.Creator
        public final CompositeDateValidator[] newArray(int i) {
            return new CompositeDateValidator[i];
        }
    };

    public CompositeDateValidator() {
        throw null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int hashCode() {
        return this.validators.hashCode();
    }

    @Override // com.google.android.material.datepicker.CalendarConstraints.DateValidator
    public final boolean ZH(long j) {
        return this.operator.LIZ(j, this.validators);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CompositeDateValidator)) {
            return false;
        }
        CompositeDateValidator compositeDateValidator = (CompositeDateValidator) obj;
        if (this.validators.equals(compositeDateValidator.validators) && this.operator.getId() == compositeDateValidator.operator.getId()) {
            return true;
        }
        return false;
    }

    public CompositeDateValidator(List list, InterfaceC2259811Dch interfaceC2259811Dch) {
        this.validators = list;
        this.operator = interfaceC2259811Dch;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeList(this.validators);
        parcel.writeInt(this.operator.getId());
    }
}
