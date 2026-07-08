package com.ss.android.ugc.aweme.creative.model.publish;

import X.C09CT;
import X.C0MY0;
import X.C2097608Jq;
import X.InterfaceC2270808v4;
import X.InterfaceC2270908v5;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.publish.MainTrackMediaInfo;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes23.dex */
public final class MainTrackMediaInfo implements Parcelable {
    public static final Parcelable.Creator<MainTrackMediaInfo> CREATOR = new Parcelable.Creator<MainTrackMediaInfo>() { // from class: X.0mfD
        @Override // android.os.Parcelable.Creator
        public final MainTrackMediaInfo createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            int i = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i);
            for (int i2 = 0; i2 != i; i2++) {
                linkedHashMap.put(parcel.readString(), parcel.readString());
            }
            return new MainTrackMediaInfo(string, linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        public final MainTrackMediaInfo[] newArray(int i) {
            return new MainTrackMediaInfo[i];
        }
    };

    @InterfaceC2270908v5
    @InterfaceC2270808v4
    @C09CT("filePath")
    @C0MY0
    public String filePath;

    @C09CT("metadata")
    public Map<String, String> metaData;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.filePath);
        Map<String, String> map = this.metaData;
        parcel.writeInt(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            parcel.writeString(entry.getKey());
            parcel.writeString(entry.getValue());
        }
    }

    public MainTrackMediaInfo() {
        this("", C2097608Jq.LJ());
    }

    public MainTrackMediaInfo(String str, Map<String, String> map) {
        this.filePath = str;
        this.metaData = map;
    }
}
