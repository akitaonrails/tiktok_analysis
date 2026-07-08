package com.google.android.material.datepicker;

import X.C21565019aS;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.format.DateUtils;
import com.google.android.material.datepicker.Month;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes34.dex */
public final class Month implements Comparable<Month>, Parcelable {
    public static final Parcelable.Creator<Month> CREATOR = new Parcelable.Creator<Month>() { // from class: X.19aE
        @Override // android.os.Parcelable.Creator
        public final Month createFromParcel(Parcel parcel) {
            return Month.LJFF(parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final Month[] newArray(int i) {
            return new Month[i];
        }
    };
    public final int LL;
    public final int LLILLJJLI;
    public final int LLILLL;
    public final int LLILZ;
    public final long LLILZIL;
    public final Calendar firstOfMonth;
    public String longName;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.LL), Integer.valueOf(this.LLILLJJLI)});
    }

    public final int LJII() {
        int firstDayOfWeek = this.firstOfMonth.get(7) - this.firstOfMonth.getFirstDayOfWeek();
        return firstDayOfWeek < 0 ? firstDayOfWeek + this.LLILLL : firstDayOfWeek;
    }

    public final long LJIIL() {
        return this.firstOfMonth.getTimeInMillis();
    }

    public Month(Calendar calendar) {
        calendar.set(5, 1);
        Calendar calendarLIZLLL = C21565019aS.LIZLLL(calendar);
        this.firstOfMonth = calendarLIZLLL;
        this.LL = calendarLIZLLL.get(2);
        this.LLILLJJLI = calendarLIZLLL.get(1);
        this.LLILLL = calendarLIZLLL.getMaximum(7);
        this.LLILZ = calendarLIZLLL.getActualMaximum(5);
        this.LLILZIL = calendarLIZLLL.getTimeInMillis();
    }

    public static Month LJI(long j) {
        Calendar calendarLJIIIIZZ = C21565019aS.LJIIIIZZ(null);
        calendarLJIIIIZZ.setTimeInMillis(j);
        return new Month(calendarLJIIIIZZ);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: LIZJ, reason: merged with bridge method [inline-methods] */
    public final int compareTo(Month month) {
        return this.firstOfMonth.compareTo(month.firstOfMonth);
    }

    public final long LJIIIZ(int i) {
        Calendar calendarLIZLLL = C21565019aS.LIZLLL(this.firstOfMonth);
        calendarLIZLLL.set(5, i);
        return calendarLIZLLL.getTimeInMillis();
    }

    public final int LJIIJ(long j) {
        Calendar calendarLIZLLL = C21565019aS.LIZLLL(this.firstOfMonth);
        calendarLIZLLL.setTimeInMillis(j);
        return calendarLIZLLL.get(5);
    }

    public final String LJIIJJI(Context context) {
        if (this.longName == null) {
            long timeInMillis = this.firstOfMonth.getTimeInMillis();
            this.longName = DateUtils.formatDateTime(context, timeInMillis - ((long) TimeZone.getDefault().getOffset(timeInMillis)), 36);
        }
        return this.longName;
    }

    public final Month LJIILJJIL(int i) {
        Calendar calendarLIZLLL = C21565019aS.LIZLLL(this.firstOfMonth);
        calendarLIZLLL.add(2, i);
        return new Month(calendarLIZLLL);
    }

    public final int LJIILL(Month month) {
        if (this.firstOfMonth instanceof GregorianCalendar) {
            return ((month.LLILLJJLI - this.LLILLJJLI) * 12) + (month.LL - this.LL);
        }
        throw new IllegalArgumentException("Only Gregorian calendars are supported.");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Month)) {
            return false;
        }
        Month month = (Month) obj;
        if (this.LL == month.LL && this.LLILLJJLI == month.LLILLJJLI) {
            return true;
        }
        return false;
    }

    public static Month LJFF(int i, int i2) {
        Calendar calendarLJIIIIZZ = C21565019aS.LJIIIIZZ(null);
        calendarLJIIIIZZ.set(1, i);
        calendarLJIIIIZZ.set(2, i2);
        return new Month(calendarLJIIIIZZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.LLILLJJLI);
        parcel.writeInt(this.LL);
    }
}
