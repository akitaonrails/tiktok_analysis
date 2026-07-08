package com.ss.android.ugc.aweme.creative.model.live;

import X.C09CT;
import X.C1438420nXE;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.live.GamePoiModel;

/* JADX INFO: loaded from: classes23.dex */
public final class GamePoiModel implements Parcelable {

    @C09CT("open_platform_extra")
    public String openPlatformExtra;

    @C09CT("shoot_enter_method")
    public String shootEnterMethod;
    public static final C1438420nXE Companion = new Object() { // from class: X.0nXE
    };
    public static final Parcelable.Creator<GamePoiModel> CREATOR = new Parcelable.Creator<GamePoiModel>() { // from class: X.0nWs
        @Override // android.os.Parcelable.Creator
        public final GamePoiModel createFromParcel(Parcel parcel) {
            return new GamePoiModel(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final GamePoiModel[] newArray(int i) {
            return new GamePoiModel[i];
        }
    };

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.openPlatformExtra);
        parcel.writeString(this.shootEnterMethod);
    }

    public GamePoiModel() {
        this("", "");
    }

    public GamePoiModel(String str, String str2) {
        this.openPlatformExtra = str;
        this.shootEnterMethod = str2;
    }
}
