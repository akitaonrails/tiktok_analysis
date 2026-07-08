package com.ss.android.ugc.aweme.ecommerce.base.common.model;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.FeeTag;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class FeeTag implements Parcelable {

    @C09CT("tag_name")
    public String tagName;
    public static final Parcelable.Creator<FeeTag> CREATOR = new Parcelable.Creator<FeeTag>() { // from class: X.02Qt
        @Override // android.os.Parcelable.Creator
        public final FeeTag createFromParcel(Parcel parcel) {
            return new FeeTag(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final FeeTag[] newArray(int i) {
            return new FeeTag[i];
        }
    };
    public static final int $stable = 8;

    public FeeTag() {
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
        return (obj instanceof FeeTag) && Intrinsics.LJFF(this.tagName, ((FeeTag) obj).tagName);
    }

    public final int hashCode() {
        String str = this.tagName;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FeeTag(tagName=");
        sbLIZ.append(this.tagName);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.tagName);
    }

    public FeeTag(String str) {
        this.tagName = str;
    }
}
