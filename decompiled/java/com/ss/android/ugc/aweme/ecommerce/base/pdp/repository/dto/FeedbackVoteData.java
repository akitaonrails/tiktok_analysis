package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.FeedbackVoteData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class FeedbackVoteData implements Parcelable {

    @C09CT("da_info")
    public final String daInfo;

    @C09CT("has_info_icon")
    public final Boolean hasInfoIcon;

    @C09CT("schema")
    public final String schema;

    @C09CT("show_sale_prop_id")
    public final String showSalePropId;

    @C09CT("text")
    public final String text;
    public static final Parcelable.Creator<FeedbackVoteData> CREATOR = new Parcelable.Creator<FeedbackVoteData>() { // from class: X.04Ha
        @Override // android.os.Parcelable.Creator
        public final FeedbackVoteData createFromParcel(Parcel parcel) {
            boolean z;
            Boolean boolValueOf;
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                if (parcel.readInt() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                boolValueOf = Boolean.valueOf(z);
            }
            return new FeedbackVoteData(string, boolValueOf, parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final FeedbackVoteData[] newArray(int i) {
            return new FeedbackVoteData[i];
        }
    };
    public static final int $stable = 8;

    public FeedbackVoteData() {
        this(null, null, null, null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FeedbackVoteData)) {
            return false;
        }
        FeedbackVoteData feedbackVoteData = (FeedbackVoteData) obj;
        return Intrinsics.LJFF(this.text, feedbackVoteData.text) && Intrinsics.LJFF(this.hasInfoIcon, feedbackVoteData.hasInfoIcon) && Intrinsics.LJFF(this.showSalePropId, feedbackVoteData.showSalePropId) && Intrinsics.LJFF(this.schema, feedbackVoteData.schema) && Intrinsics.LJFF(this.daInfo, feedbackVoteData.daInfo);
    }

    public final int hashCode() {
        String str = this.text;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.hasInfoIcon;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.showSalePropId;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.schema;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.daInfo;
        return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FeedbackVoteData(text=");
        sbLIZ.append(this.text);
        sbLIZ.append(", hasInfoIcon=");
        sbLIZ.append(this.hasInfoIcon);
        sbLIZ.append(", showSalePropId=");
        sbLIZ.append(this.showSalePropId);
        sbLIZ.append(", schema=");
        sbLIZ.append(this.schema);
        sbLIZ.append(", daInfo=");
        sbLIZ.append(this.daInfo);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r3v0, types: [android.os.Parcel] */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        ?? BooleanValue;
        parcel.writeString(this.text);
        Boolean bool = this.hasInfoIcon;
        if (bool == null) {
            BooleanValue = 0;
        } else {
            parcel.writeInt(1);
            BooleanValue = bool.booleanValue();
        }
        parcel.writeInt(BooleanValue);
        parcel.writeString(this.showSalePropId);
        parcel.writeString(this.schema);
        parcel.writeString(this.daInfo);
    }

    public FeedbackVoteData(String str, Boolean bool, String str2, String str3, String str4) {
        this.text = str;
        this.hasInfoIcon = bool;
        this.showSalePropId = str2;
        this.schema = str3;
        this.daInfo = str4;
    }
}
