package com.ss.android.ugc.aweme.favorites.base;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.tiktok.sdk.powerviewpager.item.PowerViewPagerFragmentItem;
import com.ss.android.ugc.aweme.favorites.base.FavoriteTabItemV2;

/* JADX INFO: loaded from: classes19.dex */
public class FavoriteTabItemV2 implements Parcelable {
    public static final Parcelable.Creator<FavoriteTabItemV2> CREATOR = new Parcelable.Creator<FavoriteTabItemV2>() { // from class: X.0hUk
        @Override // android.os.Parcelable.Creator
        public final FavoriteTabItemV2 createFromParcel(Parcel parcel) {
            return new FavoriteTabItemV2((PowerViewPagerFragmentItem) parcel.readParcelable(FavoriteTabItemV2.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final FavoriteTabItemV2[] newArray(int i) {
            return new FavoriteTabItemV2[i];
        }
    };
    public final PowerViewPagerFragmentItem<?> fragmentPowerItem;
    public final String mobKey;
    public final String pageTitle;
    public final String standalonePageTitle;
    public final String tabCountKey;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.fragmentPowerItem, i);
        parcel.writeString(this.pageTitle);
        parcel.writeString(this.mobKey);
        parcel.writeString(this.tabCountKey);
        parcel.writeString(this.standalonePageTitle);
    }

    public /* synthetic */ FavoriteTabItemV2(PowerViewPagerFragmentItem powerViewPagerFragmentItem, String str, String str2, String str3) {
        this(powerViewPagerFragmentItem, str, str2, str3, null);
    }

    public FavoriteTabItemV2(PowerViewPagerFragmentItem<?> powerViewPagerFragmentItem, String str, String str2, String str3, String str4) {
        this.fragmentPowerItem = powerViewPagerFragmentItem;
        this.pageTitle = str;
        this.mobKey = str2;
        this.tabCountKey = str3;
        this.standalonePageTitle = str4;
    }
}
