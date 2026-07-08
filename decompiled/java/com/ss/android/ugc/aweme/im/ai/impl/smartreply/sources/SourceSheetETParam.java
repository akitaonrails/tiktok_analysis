package com.ss.android.ugc.aweme.im.ai.impl.smartreply.sources;

import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.im.ai.impl.smartreply.sources.SourceSheetETParam;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes28.dex */
public final class SourceSheetETParam implements Parcelable {
    public static final Parcelable.Creator<SourceSheetETParam> CREATOR = new Parcelable.Creator<SourceSheetETParam>() { // from class: X.0wSq
        @Override // android.os.Parcelable.Creator
        public final SourceSheetETParam createFromParcel(Parcel parcel) {
            return new SourceSheetETParam(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final SourceSheetETParam[] newArray(int i) {
            return new SourceSheetETParam[i];
        }
    };
    public final String enterFrom;

    public SourceSheetETParam() {
        this(null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SourceSheetETParam) && Intrinsics.LJFF(this.enterFrom, ((SourceSheetETParam) obj).enterFrom);
    }

    public final int hashCode() {
        String str = this.enterFrom;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SourceSheetETParam(enterFrom=");
        sbLIZ.append(this.enterFrom);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.enterFrom);
    }

    public SourceSheetETParam(String str) {
        this.enterFrom = str;
    }
}
