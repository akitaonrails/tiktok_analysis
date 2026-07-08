package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PickTag;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class PickTag implements Parcelable {

    @C09CT("activity_id")
    public String activityId;

    @C09CT("icon")
    public Image icon;

    @C09CT("log_extra")
    public String logExtra;

    @C09CT("name")
    public String name;
    public static final Parcelable.Creator<PickTag> CREATOR = new Parcelable.Creator<PickTag>() { // from class: X.02fn
        @Override // android.os.Parcelable.Creator
        public final PickTag createFromParcel(Parcel parcel) {
            return new PickTag(parcel.readString(), parcel.readString(), (Image) parcel.readParcelable(PickTag.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final PickTag[] newArray(int i) {
            return new PickTag[i];
        }
    };
    public static final int $stable = 8;

    public PickTag() {
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
        if (!(obj instanceof PickTag)) {
            return false;
        }
        PickTag pickTag = (PickTag) obj;
        return Intrinsics.LJFF(this.activityId, pickTag.activityId) && Intrinsics.LJFF(this.name, pickTag.name) && Intrinsics.LJFF(this.icon, pickTag.icon) && Intrinsics.LJFF(this.logExtra, pickTag.logExtra);
    }

    public final int hashCode() {
        String str = this.activityId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.name;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Image image = this.icon;
        int iHashCode3 = (iHashCode2 + (image == null ? 0 : image.hashCode())) * 31;
        String str3 = this.logExtra;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PickTag(activityId=");
        sbLIZ.append(this.activityId);
        sbLIZ.append(", name=");
        sbLIZ.append(this.name);
        sbLIZ.append(", icon=");
        sbLIZ.append(this.icon);
        sbLIZ.append(", logExtra=");
        sbLIZ.append(this.logExtra);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.activityId);
        parcel.writeString(this.name);
        parcel.writeParcelable(this.icon, i);
        parcel.writeString(this.logExtra);
    }

    public PickTag(String str, String str2, Image image, String str3) {
        this.activityId = str;
        this.name = str2;
        this.icon = image;
        this.logExtra = str3;
    }
}
