package com.bytedance.android.livesdkapi.subscribe.subonlyvideo;

import X.C2188811AlT;
import X.EnumC492500JTc;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.android.livesdkapi.subscribe.subonlyvideo.SubOnlyVideoOpenParams;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class SubOnlyVideoOpenParams implements Parcelable {
    public static final Parcelable.Creator<SubOnlyVideoOpenParams> CREATOR = new Parcelable.Creator<SubOnlyVideoOpenParams>() { // from class: X.0JTg
        @Override // android.os.Parcelable.Creator
        public final SubOnlyVideoOpenParams createFromParcel(Parcel parcel) {
            return new SubOnlyVideoOpenParams(parcel.readString(), EnumC492500JTc.valueOf(parcel.readString()), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final SubOnlyVideoOpenParams[] newArray(int i) {
            return new SubOnlyVideoOpenParams[i];
        }
    };
    public final EnumC492500JTc contentPageType;
    public final String enterMethod;
    public final int videoCount;

    /* JADX WARN: Multi-variable type inference failed */
    public SubOnlyVideoOpenParams() {
        this(null, 0 == true ? 1 : 0, 7, 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SubOnlyVideoOpenParams)) {
            return false;
        }
        SubOnlyVideoOpenParams subOnlyVideoOpenParams = (SubOnlyVideoOpenParams) obj;
        return Intrinsics.LJFF(this.enterMethod, subOnlyVideoOpenParams.enterMethod) && this.contentPageType == subOnlyVideoOpenParams.contentPageType && this.videoCount == subOnlyVideoOpenParams.videoCount;
    }

    public final int hashCode() {
        return (((this.enterMethod.hashCode() * 31) + this.contentPageType.hashCode()) * 31) + this.videoCount;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SubOnlyVideoOpenParams(enterMethod=");
        sbLIZ.append(this.enterMethod);
        sbLIZ.append(", contentPageType=");
        sbLIZ.append(this.contentPageType);
        sbLIZ.append(", videoCount=");
        sbLIZ.append(this.videoCount);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.enterMethod);
        parcel.writeString(this.contentPageType.name());
        parcel.writeInt(this.videoCount);
    }

    public SubOnlyVideoOpenParams(String str, EnumC492500JTc enumC492500JTc, int i) {
        this.enterMethod = str;
        this.contentPageType = enumC492500JTc;
        this.videoCount = i;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ SubOnlyVideoOpenParams(String str, EnumC492500JTc enumC492500JTc, int i, int i2) {
        int i3;
        str = (i & 1) != 0 ? "" : str;
        enumC492500JTc = (i & 2) != 0 ? EnumC492500JTc.PRIVILEGE_PAGE : enumC492500JTc;
        if ((i & 4) != 0) {
            i3 = -1;
        } else {
            i3 = 0;
        }
        this(str, enumC492500JTc, i3);
    }
}
