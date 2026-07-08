package com.ss.android.ugc.aweme.search.pages.result.verticalsearch.poitab.model;

import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.tiktok.sdk.powerviewpager.item.PowerViewPagerFragmentItem;
import com.ss.android.ugc.aweme.search.pages.result.verticalsearch.poitab.fragment.SearchPlaceSubTabFragment;
import com.ss.android.ugc.aweme.search.pages.result.verticalsearch.poitab.model.SearchPlaceSubTabItem;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchPlaceSubTabItem extends PowerViewPagerFragmentItem<SearchPlaceSubTabFragment> {
    public final String pageSchema;
    public final String tabKey;
    public final String tabTitle;
    public static final Parcelable.Creator<SearchPlaceSubTabItem> CREATOR = new Parcelable.Creator<SearchPlaceSubTabItem>() { // from class: X.0QC7
        @Override // android.os.Parcelable.Creator
        public final SearchPlaceSubTabItem createFromParcel(Parcel parcel) {
            return new SearchPlaceSubTabItem(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final SearchPlaceSubTabItem[] newArray(int i) {
            return new SearchPlaceSubTabItem[i];
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
        if (!(obj instanceof SearchPlaceSubTabItem)) {
            return false;
        }
        SearchPlaceSubTabItem searchPlaceSubTabItem = (SearchPlaceSubTabItem) obj;
        return Intrinsics.LJFF(this.tabKey, searchPlaceSubTabItem.tabKey) && Intrinsics.LJFF(this.tabTitle, searchPlaceSubTabItem.tabTitle) && Intrinsics.LJFF(this.pageSchema, searchPlaceSubTabItem.pageSchema);
    }

    public final int hashCode() {
        int iHashCode = ((this.tabKey.hashCode() * 31) + this.tabTitle.hashCode()) * 31;
        String str = this.pageSchema;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SearchPlaceSubTabItem(tabKey=");
        sbLIZ.append(this.tabKey);
        sbLIZ.append(", tabTitle=");
        sbLIZ.append(this.tabTitle);
        sbLIZ.append(", pageSchema=");
        sbLIZ.append(this.pageSchema);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.tabKey);
        parcel.writeString(this.tabTitle);
        parcel.writeString(this.pageSchema);
    }

    @Override // com.bytedance.tiktok.sdk.powerviewpager.item.PowerViewPagerFragmentItem
    public final int getId() {
        return this.tabKey.hashCode();
    }

    public SearchPlaceSubTabItem(String str, String str2, String str3) {
        this.tabKey = str;
        this.tabTitle = str2;
        this.pageSchema = str3;
    }
}
