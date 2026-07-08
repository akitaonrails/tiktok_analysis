package com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.ContentPopupButton;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class ContentPopupButton implements Parcelable {

    @C09CT("name")
    public String name;
    public static final Parcelable.Creator<ContentPopupButton> CREATOR = new Parcelable.Creator<ContentPopupButton>() { // from class: X.02hO
        @Override // android.os.Parcelable.Creator
        public final ContentPopupButton createFromParcel(Parcel parcel) {
            return new ContentPopupButton(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ContentPopupButton[] newArray(int i) {
            return new ContentPopupButton[i];
        }
    };
    public static final int $stable = 8;

    public ContentPopupButton() {
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
        return (obj instanceof ContentPopupButton) && Intrinsics.LJFF(this.name, ((ContentPopupButton) obj).name);
    }

    public final int hashCode() {
        String str = this.name;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ContentPopupButton(name=");
        sbLIZ.append(this.name);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.name);
    }

    public ContentPopupButton(String str) {
        this.name = str;
    }
}
