package com.ss.android.ugc.aweme.preload;

import X.C1554390qYH;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: classes24.dex */
public class PreloadExtraInfo implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C1554390qYH(3);
    public String bizTag;
    public final String enterFrom;
    public List<String> keyQueryOrBodyParams;
    public final String previousPage;
    public final int strategyId;
    public final String url;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public PreloadExtraInfo(Parcel parcel) {
        this.enterFrom = parcel.readString();
        this.previousPage = parcel.readString();
        this.url = parcel.readString();
        this.strategyId = parcel.readInt();
        parcel.readStringList(this.keyQueryOrBodyParams);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.enterFrom);
        parcel.writeString(this.previousPage);
        parcel.writeString(this.url);
        parcel.writeInt(this.strategyId);
        parcel.writeStringList(this.keyQueryOrBodyParams);
    }

    public PreloadExtraInfo(int i, String str, String str2, String str3, List list) {
        this.enterFrom = str;
        this.previousPage = str2;
        this.url = str3;
        this.strategyId = i;
        this.keyQueryOrBodyParams = list;
    }
}
