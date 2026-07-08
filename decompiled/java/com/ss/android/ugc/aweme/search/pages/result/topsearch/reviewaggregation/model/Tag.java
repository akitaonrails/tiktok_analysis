package com.ss.android.ugc.aweme.search.pages.result.topsearch.reviewaggregation.model;

import X.C09CT;
import X.C2188811AlT;
import X.C636680OyA;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.reviewaggregation.model.Tag;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class Tag implements Parcelable {
    public String categoryName;

    @C09CT("text")
    public final String text;

    @C09CT("trailing_text")
    public final String trailingTextGray;

    @C09CT("unique_id")
    public final String uniqueId;

    @C09CT("video_count")
    public final int videoCount;
    public static final C636680OyA Companion = new Object() { // from class: X.0OyA
    };
    public static final Parcelable.Creator<Tag> CREATOR = new Parcelable.Creator<Tag>() { // from class: X.0OyB
        @Override // android.os.Parcelable.Creator
        public final Tag createFromParcel(Parcel parcel) {
            return new Tag(parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Tag[] newArray(int i) {
            return new Tag[i];
        }
    };
    public static final int $stable = 8;

    public Tag() {
        this("", 0, null, "");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Tag)) {
            return false;
        }
        Tag tag = (Tag) obj;
        return Intrinsics.LJFF(this.text, tag.text) && this.videoCount == tag.videoCount && Intrinsics.LJFF(this.trailingTextGray, tag.trailingTextGray) && Intrinsics.LJFF(this.uniqueId, tag.uniqueId);
    }

    public final int hashCode() {
        int iHashCode = ((this.text.hashCode() * 31) + this.videoCount) * 31;
        String str = this.trailingTextGray;
        return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.uniqueId.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Tag(text=");
        sbLIZ.append(this.text);
        sbLIZ.append(", videoCount=");
        sbLIZ.append(this.videoCount);
        sbLIZ.append(", trailingTextGray=");
        sbLIZ.append(this.trailingTextGray);
        sbLIZ.append(", uniqueId=");
        sbLIZ.append(this.uniqueId);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.text);
        parcel.writeInt(this.videoCount);
        parcel.writeString(this.trailingTextGray);
        parcel.writeString(this.uniqueId);
    }

    public Tag(String str, int i, String str2, String str3) {
        this.text = str;
        this.videoCount = i;
        this.trailingTextGray = str2;
        this.uniqueId = str3;
    }
}
