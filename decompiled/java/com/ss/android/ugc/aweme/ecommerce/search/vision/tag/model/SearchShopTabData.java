package com.ss.android.ugc.aweme.ecommerce.search.vision.tag.model;

import X.InterfaceC679590QlB;
import X.InterfaceC679610QlD;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.tiktok.sdk.powerviewpager.item.PowerViewPagerFragmentItem;
import com.ss.android.ugc.aweme.ecommerce.search.vision.tag.PhotoSearchShopResultFragment;
import com.ss.android.ugc.aweme.ecommerce.search.vision.tag.model.SearchShopTabData;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchShopTabData extends PowerViewPagerFragmentItem<PhotoSearchShopResultFragment> implements InterfaceC679610QlD {
    public static final Parcelable.Creator<SearchShopTabData> CREATOR = new Parcelable.Creator<SearchShopTabData>() { // from class: X.0Ql9
        @Override // android.os.Parcelable.Creator
        public final SearchShopTabData createFromParcel(Parcel parcel) {
            parcel.readInt();
            return new SearchShopTabData();
        }

        @Override // android.os.Parcelable.Creator
        public final SearchShopTabData[] newArray(int i) {
            return new SearchShopTabData[i];
        }
    };
    public static final int $stable = 8;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }

    @Override // X.InterfaceC679610QlD
    public final InterfaceC679590QlB LIZIZ() {
        return new InterfaceC679590QlB() { // from class: X.0QlA
            @Override // X.InterfaceC679590QlB
            public final String getValue() {
                return "shop";
            }
        };
    }

    @Override // X.InterfaceC679610QlD
    public final String LIZ(Context context) {
        return context.getString(2131848105);
    }
}
