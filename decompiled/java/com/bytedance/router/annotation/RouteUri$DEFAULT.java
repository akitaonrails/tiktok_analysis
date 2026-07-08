package com.bytedance.router.annotation;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes36.dex */
public final class RouteUri$DEFAULT implements IRouteArg {
    public static final Parcelable.Creator<RouteUri$DEFAULT> CREATOR = new Parcelable.Creator<RouteUri$DEFAULT>() { // from class: com.bytedance.router.annotation.RouteUri$DEFAULT.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public RouteUri$DEFAULT createFromParcel(Parcel parcel) {
            return new RouteUri$DEFAULT();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public RouteUri$DEFAULT[] newArray(int i) {
            return new RouteUri$DEFAULT[i];
        }
    };

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
    }
}
