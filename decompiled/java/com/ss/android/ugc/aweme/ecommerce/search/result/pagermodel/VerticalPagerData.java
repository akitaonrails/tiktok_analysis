package com.ss.android.ugc.aweme.ecommerce.search.result.pagermodel;

import X.C2188811AlT;
import X.EnumC669620QOi;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.tiktok.sdk.powerviewpager.item.PowerViewPagerFragmentItem;
import com.ss.android.ugc.aweme.ecommerce.search.result.pagermodel.VerticalPagerData;
import com.ss.android.ugc.aweme.ecommerce.search.result.vertical.EcSearchPagerItem;

/* JADX INFO: loaded from: classes11.dex */
public final class VerticalPagerData extends PowerViewPagerFragmentItem<EcSearchPagerItem> {
    public final int pageIndex;
    public final EnumC669620QOi pageName;
    public static final Parcelable.Creator<VerticalPagerData> CREATOR = new Parcelable.Creator<VerticalPagerData>() { // from class: X.0QOd
        @Override // android.os.Parcelable.Creator
        public final VerticalPagerData createFromParcel(Parcel parcel) {
            return new VerticalPagerData(EnumC669620QOi.valueOf(parcel.readString()), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final VerticalPagerData[] newArray(int i) {
            return new VerticalPagerData[i];
        }
    };
    public static final int $stable = 8;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VerticalPagerData)) {
            return false;
        }
        VerticalPagerData verticalPagerData = (VerticalPagerData) obj;
        return this.pageName == verticalPagerData.pageName && this.pageIndex == verticalPagerData.pageIndex;
    }

    public final int hashCode() {
        return (this.pageName.hashCode() * 31) + this.pageIndex;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VerticalPagerData(pageName=");
        sbLIZ.append(this.pageName);
        sbLIZ.append(", pageIndex=");
        sbLIZ.append(this.pageIndex);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.pageName.name());
        parcel.writeInt(this.pageIndex);
    }

    public VerticalPagerData(EnumC669620QOi enumC669620QOi, int i) {
        this.pageName = enumC669620QOi;
        this.pageIndex = i;
    }
}
