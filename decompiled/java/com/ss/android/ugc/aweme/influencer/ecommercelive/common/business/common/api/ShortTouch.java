package com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.common.api;

import X.C09CT;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.android.livesdk.model.ShortTouchPreviewSetting;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.common.api.ShortTouch;

/* JADX INFO: loaded from: classes27.dex */
public final class ShortTouch implements Parcelable {

    @C09CT("name")
    public final String name;

    @C09CT("preview_setting")
    public final ShortTouchPreviewSetting previewSetting;

    @C09CT("schema")
    public final String uri;
    public static final Parcelable.Creator<ShortTouch> CREATOR = new Parcelable.Creator<ShortTouch>() { // from class: X.0vQH
        @Override // android.os.Parcelable.Creator
        public final ShortTouch createFromParcel(Parcel parcel) {
            parcel.readInt();
            return new ShortTouch();
        }

        @Override // android.os.Parcelable.Creator
        public final ShortTouch[] newArray(int i) {
            return new ShortTouch[i];
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
