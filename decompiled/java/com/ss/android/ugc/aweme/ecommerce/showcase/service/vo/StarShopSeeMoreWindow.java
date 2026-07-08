package com.ss.android.ugc.aweme.ecommerce.showcase.service.vo;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.showcase.service.vo.StarShopSeeMoreWindow;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class StarShopSeeMoreWindow implements Parcelable {
    public static final Parcelable.Creator<StarShopSeeMoreWindow> CREATOR = new Parcelable.Creator<StarShopSeeMoreWindow>() { // from class: X.02Vc
        @Override // android.os.Parcelable.Creator
        public final StarShopSeeMoreWindow createFromParcel(Parcel parcel) {
            return new StarShopSeeMoreWindow(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final StarShopSeeMoreWindow[] newArray(int i) {
            return new StarShopSeeMoreWindow[i];
        }
    };

    @C09CT("description")
    public String description;

    @C09CT("title")
    public String title;

    public StarShopSeeMoreWindow() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StarShopSeeMoreWindow)) {
            return false;
        }
        StarShopSeeMoreWindow starShopSeeMoreWindow = (StarShopSeeMoreWindow) obj;
        return Intrinsics.LJFF(this.title, starShopSeeMoreWindow.title) && Intrinsics.LJFF(this.description, starShopSeeMoreWindow.description);
    }

    public final int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.description;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StarShopSeeMoreWindow(title=");
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

    public StarShopSeeMoreWindow(String str, String str2) {
        this.title = str;
        this.description = str2;
    }
}
