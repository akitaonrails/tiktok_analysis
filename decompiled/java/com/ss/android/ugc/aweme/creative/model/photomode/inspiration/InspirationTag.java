package com.ss.android.ugc.aweme.creative.model.photomode.inspiration;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.photomode.inspiration.InspirationTag;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class InspirationTag implements Parcelable, Serializable {
    public static final Parcelable.Creator<InspirationTag> CREATOR = new Parcelable.Creator<InspirationTag>() { // from class: X.0nfy
        @Override // android.os.Parcelable.Creator
        public final InspirationTag createFromParcel(Parcel parcel) {
            return new InspirationTag(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final InspirationTag[] newArray(int i) {
            return new InspirationTag[i];
        }
    };

    @C09CT("description")
    public final String description;

    @C09CT("title")
    public final String title;

    public InspirationTag() {
        this(null, null);
    }

    public final InspirationTag copy(String str, String str2) {
        return new InspirationTag(str, str2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("InspirationTag(title=");
        sbLIZ.append(this.title);
        sbLIZ.append(", description=");
        sbLIZ.append(this.description);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.title);
        parcel.writeString(this.description);
    }

    public int hashCode() {
        String str = this.title;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.description;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getTitle() {
        return this.title;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        Class<?> cls = null;
        if (obj != null) {
            cls = obj.getClass();
        }
        if (!Intrinsics.LJFF(InspirationTag.class, cls) || !(obj instanceof InspirationTag) || obj == null) {
            return false;
        }
        InspirationTag inspirationTag = (InspirationTag) obj;
        if (Intrinsics.LJFF(this.title, inspirationTag.title) && Intrinsics.LJFF(this.description, inspirationTag.description)) {
            return true;
        }
        return false;
    }

    public InspirationTag(String str, String str2) {
        this.title = str;
        this.description = str2;
    }
}
