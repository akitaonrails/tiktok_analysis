package com.ss.android.ugc.aweme.tools.sticker.core.text.model;

import X.C09CT;
import X.C2188811AlT;
import X.InterfaceC2270908v5;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.AtomAnimation;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TimeRange;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class AtomAnimation implements Parcelable, Serializable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<AtomAnimation> CREATOR = new Parcelable.Creator<AtomAnimation>() { // from class: X.0EMh
        @Override // android.os.Parcelable.Creator
        public final AtomAnimation createFromParcel(Parcel parcel) {
            TimeRange timeRangeCreateFromParcel;
            String string = parcel.readString();
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                timeRangeCreateFromParcel = null;
            } else {
                timeRangeCreateFromParcel = TimeRange.CREATOR.createFromParcel(parcel);
            }
            return new AtomAnimation(string, string2, timeRangeCreateFromParcel, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AtomAnimation[] newArray(int i) {
            return new AtomAnimation[i];
        }
    };

    @InterfaceC2270908v5
    @C09CT("path")
    public final String path;

    @C09CT("properties")
    public final String property;

    @C09CT("timerange")
    public final TimeRange timerange;

    @C09CT("urs")
    public final String urs;

    public final AtomAnimation copy(String str, String str2, TimeRange timeRange, String str3) {
        return new AtomAnimation(str, str2, timeRange, str3);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AtomAnimation)) {
            return false;
        }
        AtomAnimation atomAnimation = (AtomAnimation) obj;
        return Intrinsics.LJFF(this.urs, atomAnimation.urs) && Intrinsics.LJFF(this.path, atomAnimation.path) && Intrinsics.LJFF(this.timerange, atomAnimation.timerange) && Intrinsics.LJFF(this.property, atomAnimation.property);
    }

    public int hashCode() {
        String str = this.urs;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.path;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        TimeRange timeRange = this.timerange;
        int iHashCode3 = (iHashCode2 + (timeRange == null ? 0 : timeRange.hashCode())) * 31;
        String str3 = this.property;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AtomAnimation(urs=");
        sbLIZ.append(this.urs);
        sbLIZ.append(", path=");
        sbLIZ.append(this.path);
        sbLIZ.append(", timerange=");
        sbLIZ.append(this.timerange);
        sbLIZ.append(", property=");
        sbLIZ.append(this.property);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.urs);
        parcel.writeString(this.path);
        TimeRange timeRange = this.timerange;
        if (timeRange == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            timeRange.writeToParcel(parcel, i);
        }
        parcel.writeString(this.property);
    }

    public final String getPath() {
        return this.path;
    }

    public final String getProperty() {
        return this.property;
    }

    public final TimeRange getTimerange() {
        return this.timerange;
    }

    public final String getUrs() {
        return this.urs;
    }

    public AtomAnimation(String str, String str2, TimeRange timeRange, String str3) {
        this.urs = str;
        this.path = str2;
        this.timerange = timeRange;
        this.property = str3;
    }
}
