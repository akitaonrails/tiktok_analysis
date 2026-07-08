package com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewTranslation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class ReviewTranslation implements Parcelable {

    @C09CT("language")
    public final String language;

    @C09CT("show_icon")
    public final boolean showIcon;

    @C09CT("translation_label")
    public final String translationLabel;

    @C09CT("translation_type")
    public final Integer translationType;
    public static final Parcelable.Creator<ReviewTranslation> CREATOR = new Parcelable.Creator<ReviewTranslation>() { // from class: X.0mhh
        @Override // android.os.Parcelable.Creator
        public final ReviewTranslation createFromParcel(Parcel parcel) {
            boolean z;
            Integer numValueOf;
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            return new ReviewTranslation(z, string, numValueOf, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ReviewTranslation[] newArray(int i) {
            return new ReviewTranslation[i];
        }
    };
    public static final int $stable = 8;

    public ReviewTranslation() {
        this(false, null, null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReviewTranslation)) {
            return false;
        }
        ReviewTranslation reviewTranslation = (ReviewTranslation) obj;
        return this.showIcon == reviewTranslation.showIcon && Intrinsics.LJFF(this.language, reviewTranslation.language) && Intrinsics.LJFF(this.translationType, reviewTranslation.translationType) && Intrinsics.LJFF(this.translationLabel, reviewTranslation.translationLabel);
    }

    public final int hashCode() {
        int iZ2 = C786410Ut5.Z2(this.showIcon) * 31;
        String str = this.language;
        int iHashCode = (iZ2 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.translationType;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.translationLabel;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ReviewTranslation(showIcon=");
        sbLIZ.append(this.showIcon);
        sbLIZ.append(", language=");
        sbLIZ.append(this.language);
        sbLIZ.append(", translationType=");
        sbLIZ.append(this.translationType);
        sbLIZ.append(", translationLabel=");
        sbLIZ.append(this.translationLabel);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iIntValue;
        parcel.writeInt(this.showIcon ? 1 : 0);
        parcel.writeString(this.language);
        Integer num = this.translationType;
        if (num == null) {
            iIntValue = 0;
        } else {
            parcel.writeInt(1);
            iIntValue = num.intValue();
        }
        parcel.writeInt(iIntValue);
        parcel.writeString(this.translationLabel);
    }

    public ReviewTranslation(boolean z, String str, Integer num, String str2) {
        this.showIcon = z;
        this.language = str;
        this.translationType = num;
        this.translationLabel = str2;
    }
}
