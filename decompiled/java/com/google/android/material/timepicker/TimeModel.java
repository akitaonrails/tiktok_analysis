package com.google.android.material.timepicker;

import X.C0ZE0;
import X.C786410Ut5;
import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.InputFilter;
import android.text.Spanned;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.android.material.timepicker.TimeModel;
import java.util.Arrays;

/* JADX INFO: loaded from: classes34.dex */
public class TimeModel implements Parcelable {
    public static final Parcelable.Creator<TimeModel> CREATOR = new Parcelable.Creator<TimeModel>() { // from class: X.19Xj
        @Override // android.os.Parcelable.Creator
        public final TimeModel createFromParcel(Parcel parcel) {
            return new TimeModel(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final TimeModel[] newArray(int i) {
            return new TimeModel[i];
        }
    };
    public final int LL;
    public int LLILLJJLI;
    public int LLILLL;
    public int LLILZ;
    public int LLILZIL;
    public final C0ZE0 hourInputValidator;
    public final C0ZE0 minuteInputValidator;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.LL), Integer.valueOf(this.LLILLJJLI), Integer.valueOf(this.LLILLL), Integer.valueOf(this.LLILZ)});
    }

    public TimeModel() {
        this(0, 0, 10, 0);
    }

    public final int LIZIZ() {
        if (this.LL == 1) {
            return this.LLILLJJLI % 24;
        }
        int i = this.LLILLJJLI;
        if (i % 12 == 0) {
            return 12;
        }
        return this.LLILZIL == 1 ? i - 12 : i;
    }

    public final void LIZJ(int i) {
        if (this.LL == 1) {
            this.LLILLJJLI = i;
            return;
        }
        int i2 = 12;
        int i3 = i % 12;
        if (this.LLILZIL != 1) {
            i2 = 0;
        }
        this.LLILLJJLI = i3 + i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TimeModel)) {
            return false;
        }
        TimeModel timeModel = (TimeModel) obj;
        if (this.LLILLJJLI == timeModel.LLILLJJLI && this.LLILLL == timeModel.LLILLL && this.LL == timeModel.LL && this.LLILZ == timeModel.LLILZ) {
            return true;
        }
        return false;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.LLILLJJLI);
        parcel.writeInt(this.LLILLL);
        parcel.writeInt(this.LLILZ);
        parcel.writeInt(this.LL);
    }

    public static String LIZ(Resources resources, CharSequence charSequence, String str) {
        return C786410Ut5.k4(resources.getConfiguration().locale, str, new Object[]{Integer.valueOf(CastIntegerProtector.parseInt(String.valueOf(charSequence)))});
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0ZE0] */
    /* JADX WARN: Type inference failed for: r1v0, types: [X.0ZE0] */
    public TimeModel(int i, int i2, int i3, int i4) {
        int i5;
        this.LLILLJJLI = i;
        this.LLILLL = i2;
        this.LLILZ = i3;
        this.LL = i4;
        if (i >= 12) {
            i5 = 1;
        } else {
            i5 = 0;
        }
        this.LLILZIL = i5;
        final int i6 = 59;
        this.minuteInputValidator = new InputFilter(i6) { // from class: X.0ZE0
            public final int LL;

            {
                this.LL = i6;
            }

            @Override // android.text.InputFilter
            public final CharSequence filter(CharSequence charSequence, int i7, int i8, Spanned spanned, int i9, int i10) {
                try {
                    StringBuilder sb = new StringBuilder(spanned);
                    sb.replace(i9, i10, charSequence.subSequence(i7, i8).toString());
                    if (CastIntegerProtector.parseInt(sb.toString()) <= this.LL) {
                        return null;
                    }
                    return "";
                } catch (NumberFormatException e) {
                    TryCatchGuardChecker.doCheck(e);
                    return "";
                }
            }
        };
        final int i7 = i4 == 1 ? 24 : 12;
        this.hourInputValidator = new InputFilter(i7) { // from class: X.0ZE0
            public final int LL;

            {
                this.LL = i7;
            }

            @Override // android.text.InputFilter
            public final CharSequence filter(CharSequence charSequence, int i72, int i8, Spanned spanned, int i9, int i10) {
                try {
                    StringBuilder sb = new StringBuilder(spanned);
                    sb.replace(i9, i10, charSequence.subSequence(i72, i8).toString());
                    if (CastIntegerProtector.parseInt(sb.toString()) <= this.LL) {
                        return null;
                    }
                    return "";
                } catch (NumberFormatException e) {
                    TryCatchGuardChecker.doCheck(e);
                    return "";
                }
            }
        };
    }
}
