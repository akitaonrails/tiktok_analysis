package com.ss.android.ugc.aweme.creative.model.extra;

import X.C040H;
import X.C1438820nXs;
import X.C178100mJ;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.extra.CustomParcelableExtraInfo;
import java.util.Map;

/* JADX INFO: loaded from: classes23.dex */
public final class CustomParcelableExtraInfo implements Parcelable {

    @C040H
    public Map<String, Object> metadataMap;
    public static final C1438820nXs Companion = new Object() { // from class: X.0nXs
    };
    public static final Parcelable.Creator<CustomParcelableExtraInfo> CREATOR = new Parcelable.Creator<CustomParcelableExtraInfo>() { // from class: X.0nXr
        @Override // android.os.Parcelable.Creator
        public final CustomParcelableExtraInfo createFromParcel(Parcel parcel) {
            CustomParcelableExtraInfo.Companion.getClass();
            return new CustomParcelableExtraInfo(C178100mJ.LIZIZ(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final CustomParcelableExtraInfo[] newArray(int i) {
            return new CustomParcelableExtraInfo[i];
        }
    };

    public CustomParcelableExtraInfo() {
        this(null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public CustomParcelableExtraInfo(Map<String, Object> map) {
        this.metadataMap = map;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String strLIZJ;
        Companion.getClass();
        Map<String, Object> map = this.metadataMap;
        if (map != null) {
            strLIZJ = C178100mJ.LIZJ(map);
        } else {
            strLIZJ = null;
        }
        parcel.writeString(strLIZJ);
    }
}
