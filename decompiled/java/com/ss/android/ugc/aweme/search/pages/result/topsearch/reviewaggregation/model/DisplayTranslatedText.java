package com.ss.android.ugc.aweme.search.pages.result.topsearch.reviewaggregation.model;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.reviewaggregation.model.DisplayTranslatedText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class DisplayTranslatedText implements Parcelable {

    @C09CT("all")
    public final String all;

    @C09CT("cons")
    public final String cons;

    @C09CT("pros")
    public final String pros;
    public static final Parcelable.Creator<DisplayTranslatedText> CREATOR = new Parcelable.Creator<DisplayTranslatedText>() { // from class: X.0Oy7
        @Override // android.os.Parcelable.Creator
        public final DisplayTranslatedText createFromParcel(Parcel parcel) {
            return new DisplayTranslatedText(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final DisplayTranslatedText[] newArray(int i) {
            return new DisplayTranslatedText[i];
        }
    };
    public static final int $stable = 8;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DisplayTranslatedText)) {
            return false;
        }
        DisplayTranslatedText displayTranslatedText = (DisplayTranslatedText) obj;
        return Intrinsics.LJFF(this.all, displayTranslatedText.all) && Intrinsics.LJFF(this.pros, displayTranslatedText.pros) && Intrinsics.LJFF(this.cons, displayTranslatedText.cons);
    }

    public final int hashCode() {
        return (((this.all.hashCode() * 31) + this.pros.hashCode()) * 31) + this.cons.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DisplayTranslatedText(all=");
        sbLIZ.append(this.all);
        sbLIZ.append(", pros=");
        sbLIZ.append(this.pros);
        sbLIZ.append(", cons=");
        sbLIZ.append(this.cons);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.all);
        parcel.writeString(this.pros);
        parcel.writeString(this.cons);
    }

    public DisplayTranslatedText() {
        this("", "", "");
    }

    public DisplayTranslatedText(String str, String str2, String str3) {
        this.all = str;
        this.pros = str2;
        this.cons = str3;
    }
}
