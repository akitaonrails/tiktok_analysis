package com.bytedance.effectcreatormobile.infrastructure.define.model.router.routerdata;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.effectcreatormobile.infrastructure.define.model.router.routerdata.BaseAMERouterData;
import java.io.Serializable;

/* JADX INFO: loaded from: classes27.dex */
public class BaseAMERouterData implements Serializable, Parcelable {
    public static final Parcelable.Creator<BaseAMERouterData> CREATOR = new Parcelable.Creator<BaseAMERouterData>() { // from class: X.0vL1
        @Override // android.os.Parcelable.Creator
        public final BaseAMERouterData createFromParcel(Parcel parcel) {
            parcel.readInt();
            return new BaseAMERouterData();
        }

        @Override // android.os.Parcelable.Creator
        public final BaseAMERouterData[] newArray(int i) {
            return new BaseAMERouterData[i];
        }
    };
    public static final int $stable = 8;

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
