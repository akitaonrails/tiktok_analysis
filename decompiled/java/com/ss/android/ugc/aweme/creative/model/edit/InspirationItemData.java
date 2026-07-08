package com.ss.android.ugc.aweme.creative.model.edit;

import X.C040H;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.edit.InspirationItemData;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class InspirationItemData implements Parcelable, Serializable {
    public static final Parcelable.Creator<InspirationItemData> CREATOR = new Parcelable.Creator<InspirationItemData>() { // from class: X.0mck
        @Override // android.os.Parcelable.Creator
        public final InspirationItemData createFromParcel(Parcel parcel) {
            return new InspirationItemData(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final InspirationItemData[] newArray(int i) {
            return new InspirationItemData[i];
        }
    };

    @C040H
    public final String content;

    @C040H
    public final String effectId;

    @C040H
    public final String title;

    public final InspirationItemData copy(String str, String str2, String str3) {
        return new InspirationItemData(str, str2, str3);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InspirationItemData)) {
            return false;
        }
        InspirationItemData inspirationItemData = (InspirationItemData) obj;
        return Intrinsics.LJFF(this.title, inspirationItemData.title) && Intrinsics.LJFF(this.content, inspirationItemData.content) && Intrinsics.LJFF(this.effectId, inspirationItemData.effectId);
    }

    public int hashCode() {
        return (((this.title.hashCode() * 31) + this.content.hashCode()) * 31) + this.effectId.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("InspirationItemData(title=");
        sbLIZ.append(this.title);
        sbLIZ.append(", content=");
        sbLIZ.append(this.content);
        sbLIZ.append(", effectId=");
        sbLIZ.append(this.effectId);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.title);
        parcel.writeString(this.content);
        parcel.writeString(this.effectId);
    }

    public final String getContent() {
        return this.content;
    }

    public final String getEffectId() {
        return this.effectId;
    }

    public final String getTitle() {
        return this.title;
    }

    public InspirationItemData(String str, String str2, String str3) {
        this.title = str;
        this.content = str2;
        this.effectId = str3;
    }
}
