package com.bytedance.common.wschannel.model;

import X.C2325341G0m;
import android.content.ComponentName;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: classes36.dex */
public class WsComponent implements Parcelable {
    public static final Parcelable.Creator<WsComponent> CREATOR = new C2325341G0m(4);
    public List<WsApi> acceptApis;
    public ComponentName componentName;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.componentName, i);
        parcel.writeTypedList(this.acceptApis);
    }
}
