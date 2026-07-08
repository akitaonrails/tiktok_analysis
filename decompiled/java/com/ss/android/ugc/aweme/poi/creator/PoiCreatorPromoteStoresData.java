package com.ss.android.ugc.aweme.poi.creator;

import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.tiktok.sdk.powerviewpager.item.PowerViewPagerFragmentItem;
import com.ss.android.ugc.aweme.poi.creator.PoiCreatorPromoteStoresData;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiCreatorPromoteStoresData extends PowerViewPagerFragmentItem<PoiCreatorPromoteStoresFragment> {
    public static final Parcelable.Creator<PoiCreatorPromoteStoresData> CREATOR = new Parcelable.Creator<PoiCreatorPromoteStoresData>() { // from class: X.0hGa
        @Override // android.os.Parcelable.Creator
        public final PoiCreatorPromoteStoresData createFromParcel(Parcel parcel) {
            return new PoiCreatorPromoteStoresData(parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final PoiCreatorPromoteStoresData[] newArray(int i) {
            return new PoiCreatorPromoteStoresData[i];
        }
    };
    public final int itemId;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PoiCreatorPromoteStoresData) && this.itemId == ((PoiCreatorPromoteStoresData) obj).itemId;
    }

    public final int hashCode() {
        return this.itemId;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PoiCreatorPromoteStoresData(itemId=");
        sbLIZ.append(this.itemId);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.itemId);
    }

    public PoiCreatorPromoteStoresData(int i) {
        this.itemId = i;
    }
}
