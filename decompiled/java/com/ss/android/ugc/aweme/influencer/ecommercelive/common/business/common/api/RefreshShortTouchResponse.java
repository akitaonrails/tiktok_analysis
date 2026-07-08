package com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.common.api;

import X.C09CT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.common.api.RefreshShortTouchResponse;
import java.util.List;

/* JADX INFO: loaded from: classes27.dex */
public final class RefreshShortTouchResponse implements Parcelable {

    @C09CT("short_touch_items")
    public final List<ShortTouch> shortTouchItems;
    public static final Parcelable.Creator<RefreshShortTouchResponse> CREATOR = new Parcelable.Creator<RefreshShortTouchResponse>() { // from class: X.0vQI
        @Override // android.os.Parcelable.Creator
        public final RefreshShortTouchResponse createFromParcel(Parcel parcel) {
            parcel.readInt();
            return new RefreshShortTouchResponse();
        }

        @Override // android.os.Parcelable.Creator
        public final RefreshShortTouchResponse[] newArray(int i) {
            return new RefreshShortTouchResponse[i];
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
}
