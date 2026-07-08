package com.ss.android.ugc.aweme.poi.creator;

import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.tiktok.sdk.powerviewpager.item.PowerViewPagerFragmentItem;
import com.ss.android.ugc.aweme.poi.creator.PoiCreatorSearchData;
import com.ss.android.ugc.aweme.poi.search.PoiSearchFragment;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiCreatorSearchData extends PowerViewPagerFragmentItem<PoiSearchFragment> {
    public static final Parcelable.Creator<PoiCreatorSearchData> CREATOR = new Parcelable.Creator<PoiCreatorSearchData>() { // from class: X.0hGb
        @Override // android.os.Parcelable.Creator
        public final PoiCreatorSearchData createFromParcel(Parcel parcel) {
            return new PoiCreatorSearchData(parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final PoiCreatorSearchData[] newArray(int i) {
            return new PoiCreatorSearchData[i];
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
        return (obj instanceof PoiCreatorSearchData) && this.itemId == ((PoiCreatorSearchData) obj).itemId;
    }

    public final int hashCode() {
        return this.itemId;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PoiCreatorSearchData(itemId=");
        sbLIZ.append(this.itemId);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.itemId);
    }

    public PoiCreatorSearchData(int i) {
        this.itemId = i;
    }
}
