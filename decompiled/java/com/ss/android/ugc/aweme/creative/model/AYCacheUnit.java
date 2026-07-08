package com.ss.android.ugc.aweme.creative.model;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.AYCacheUnit;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class AYCacheUnit implements Parcelable, Serializable {
    public static final Parcelable.Creator<AYCacheUnit> CREATOR = new Parcelable.Creator<AYCacheUnit>() { // from class: X.0mdr
        @Override // android.os.Parcelable.Creator
        public final AYCacheUnit createFromParcel(Parcel parcel) {
            return new AYCacheUnit(parcel.readString(), parcel.readLong(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AYCacheUnit[] newArray(int i) {
            return new AYCacheUnit[i];
        }
    };

    @C09CT("ay_text")
    public final String ayText;

    @C09CT("effect_id")
    public final String effectId;

    @C09CT("topic_id")
    public final long topicId;

    public final AYCacheUnit copy(String str, long j, String str2) {
        return new AYCacheUnit(str, j, str2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AYCacheUnit)) {
            return false;
        }
        AYCacheUnit aYCacheUnit = (AYCacheUnit) obj;
        return Intrinsics.LJFF(this.effectId, aYCacheUnit.effectId) && this.topicId == aYCacheUnit.topicId && Intrinsics.LJFF(this.ayText, aYCacheUnit.ayText);
    }

    public int hashCode() {
        return (((this.effectId.hashCode() * 31) + C786410Ut5.Y2(this.topicId)) * 31) + this.ayText.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AYCacheUnit(effectId=");
        sbLIZ.append(this.effectId);
        sbLIZ.append(", topicId=");
        sbLIZ.append(this.topicId);
        sbLIZ.append(", ayText=");
        sbLIZ.append(this.ayText);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.effectId);
        parcel.writeLong(this.topicId);
        parcel.writeString(this.ayText);
    }

    public final String getAyText() {
        return this.ayText;
    }

    public final String getEffectId() {
        return this.effectId;
    }

    public final long getTopicId() {
        return this.topicId;
    }

    public AYCacheUnit(String str, long j, String str2) {
        this.effectId = str;
        this.topicId = j;
        this.ayText = str2;
    }
}
