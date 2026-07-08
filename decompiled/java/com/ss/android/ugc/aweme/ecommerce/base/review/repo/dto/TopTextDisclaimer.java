package com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.TopTextDisclaimer;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class TopTextDisclaimer implements Parcelable {

    @C09CT("confirm_button_text")
    public final String confirmButtonText;

    @C09CT("explain_text")
    public final String explainText;

    @C09CT("panel_schema")
    public final String panelSchema;
    public static final Parcelable.Creator<TopTextDisclaimer> CREATOR = new Parcelable.Creator<TopTextDisclaimer>() { // from class: X.04IR
        @Override // android.os.Parcelable.Creator
        public final TopTextDisclaimer createFromParcel(Parcel parcel) {
            return new TopTextDisclaimer(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final TopTextDisclaimer[] newArray(int i) {
            return new TopTextDisclaimer[i];
        }
    };
    public static final int $stable = 8;

    public TopTextDisclaimer() {
        this(null, null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TopTextDisclaimer)) {
            return false;
        }
        TopTextDisclaimer topTextDisclaimer = (TopTextDisclaimer) obj;
        return Intrinsics.LJFF(this.explainText, topTextDisclaimer.explainText) && Intrinsics.LJFF(this.confirmButtonText, topTextDisclaimer.confirmButtonText) && Intrinsics.LJFF(this.panelSchema, topTextDisclaimer.panelSchema);
    }

    public final int hashCode() {
        String str = this.explainText;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.confirmButtonText;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.panelSchema;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TopTextDisclaimer(explainText=");
        sbLIZ.append(this.explainText);
        sbLIZ.append(", confirmButtonText=");
        sbLIZ.append(this.confirmButtonText);
        sbLIZ.append(", panelSchema=");
        sbLIZ.append(this.panelSchema);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.explainText);
        parcel.writeString(this.confirmButtonText);
        parcel.writeString(this.panelSchema);
    }

    public TopTextDisclaimer(String str, String str2, String str3) {
        this.explainText = str;
        this.confirmButtonText = str2;
        this.panelSchema = str3;
    }
}
