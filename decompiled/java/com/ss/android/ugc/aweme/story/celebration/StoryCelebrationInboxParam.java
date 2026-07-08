package com.ss.android.ugc.aweme.story.celebration;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.story.celebration.StoryCelebrationInboxParam;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class StoryCelebrationInboxParam implements Parcelable {

    @C09CT("celebration_type")
    public final Integer celebrationType;

    @C09CT("cover_type")
    public final Integer coverType;

    @C09CT("story_theme")
    public final String storyTheme;

    @C09CT("unique_id")
    public final String uniqueId;
    public static final Parcelable.Creator<StoryCelebrationInboxParam> CREATOR = new Parcelable.Creator<StoryCelebrationInboxParam>() { // from class: X.0MTK
        @Override // android.os.Parcelable.Creator
        public final StoryCelebrationInboxParam createFromParcel(Parcel parcel) {
            Integer numValueOf;
            Integer numValueOf2 = null;
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            String string = parcel.readString();
            if (parcel.readInt() != 0) {
                numValueOf2 = Integer.valueOf(parcel.readInt());
            }
            return new StoryCelebrationInboxParam(numValueOf, string, numValueOf2, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final StoryCelebrationInboxParam[] newArray(int i) {
            return new StoryCelebrationInboxParam[i];
        }
    };
    public static final int $stable = 8;

    public StoryCelebrationInboxParam() {
        this(null, null, null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoryCelebrationInboxParam)) {
            return false;
        }
        StoryCelebrationInboxParam storyCelebrationInboxParam = (StoryCelebrationInboxParam) obj;
        return Intrinsics.LJFF(this.celebrationType, storyCelebrationInboxParam.celebrationType) && Intrinsics.LJFF(this.uniqueId, storyCelebrationInboxParam.uniqueId) && Intrinsics.LJFF(this.coverType, storyCelebrationInboxParam.coverType) && Intrinsics.LJFF(this.storyTheme, storyCelebrationInboxParam.storyTheme);
    }

    public final int hashCode() {
        Integer num = this.celebrationType;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.uniqueId;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num2 = this.coverType;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str2 = this.storyTheme;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StoryCelebrationInboxParam(celebrationType=");
        sbLIZ.append(this.celebrationType);
        sbLIZ.append(", uniqueId=");
        sbLIZ.append(this.uniqueId);
        sbLIZ.append(", coverType=");
        sbLIZ.append(this.coverType);
        sbLIZ.append(", storyTheme=");
        sbLIZ.append(this.storyTheme);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Integer num = this.celebrationType;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeString(this.uniqueId);
        Integer num2 = this.coverType;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        parcel.writeString(this.storyTheme);
    }

    public StoryCelebrationInboxParam(Integer num, String str, Integer num2, String str2) {
        this.celebrationType = num;
        this.uniqueId = str;
        this.coverType = num2;
        this.storyTheme = str2;
    }
}
