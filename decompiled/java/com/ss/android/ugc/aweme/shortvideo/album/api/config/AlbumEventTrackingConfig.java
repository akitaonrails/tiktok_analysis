package com.ss.android.ugc.aweme.shortvideo.album.api.config;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.shortvideo.album.api.config.AlbumEventTrackingConfig;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public final class AlbumEventTrackingConfig implements Parcelable {
    public String enterFrom;
    public String enterMethod;
    public String fromPage;
    public Map<String, String> passThroughCommonParams;
    public Map<String, ? extends Map<String, String>> passThroughParams;
    public String shootWay;
    public static final Parcelable.Creator<AlbumEventTrackingConfig> CREATOR = new Parcelable.Creator<AlbumEventTrackingConfig>() { // from class: X.0Kgz
        @Override // android.os.Parcelable.Creator
        public final AlbumEventTrackingConfig createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            LinkedHashMap linkedHashMap2 = null;
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int i = parcel.readInt();
                linkedHashMap = new LinkedHashMap(i);
                for (int i2 = 0; i2 != i; i2++) {
                    linkedHashMap.put(parcel.readString(), parcel.readString());
                }
            }
            if (parcel.readInt() != 0) {
                int i3 = parcel.readInt();
                linkedHashMap2 = new LinkedHashMap(i3);
                for (int i4 = 0; i4 != i3; i4++) {
                    String string5 = parcel.readString();
                    int i5 = parcel.readInt();
                    LinkedHashMap linkedHashMap3 = new LinkedHashMap(i5);
                    for (int i6 = 0; i6 != i5; i6++) {
                        linkedHashMap3.put(parcel.readString(), parcel.readString());
                    }
                    linkedHashMap2.put(string5, linkedHashMap3);
                }
            }
            return new AlbumEventTrackingConfig(string, string2, string3, string4, linkedHashMap, linkedHashMap2);
        }

        @Override // android.os.Parcelable.Creator
        public final AlbumEventTrackingConfig[] newArray(int i) {
            return new AlbumEventTrackingConfig[i];
        }
    };
    public static final int $stable = 8;

    public AlbumEventTrackingConfig() {
        this(0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.shootWay);
        parcel.writeString(this.enterFrom);
        parcel.writeString(this.enterMethod);
        parcel.writeString(this.fromPage);
        Map<String, String> map = this.passThroughCommonParams;
        if (map == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(map.size());
            for (Map.Entry<String, String> entry : map.entrySet()) {
                parcel.writeString(entry.getKey());
                parcel.writeString(entry.getValue());
            }
        }
        Map<String, ? extends Map<String, String>> map2 = this.passThroughParams;
        if (map2 == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(map2.size());
        for (Map.Entry<String, ? extends Map<String, String>> entry2 : map2.entrySet()) {
            parcel.writeString(entry2.getKey());
            Map<String, String> value = entry2.getValue();
            parcel.writeInt(value.size());
            for (Map.Entry<String, String> entry3 : value.entrySet()) {
                parcel.writeString(entry3.getKey());
                parcel.writeString(entry3.getValue());
            }
        }
    }

    public /* synthetic */ AlbumEventTrackingConfig(int i) {
        this("", "", "", "", null, null);
    }

    public AlbumEventTrackingConfig(String str, String str2, String str3, String str4, Map<String, String> map, Map<String, ? extends Map<String, String>> map2) {
        this.shootWay = str;
        this.enterFrom = str2;
        this.enterMethod = str3;
        this.fromPage = str4;
        this.passThroughCommonParams = map;
        this.passThroughParams = map2;
    }
}
