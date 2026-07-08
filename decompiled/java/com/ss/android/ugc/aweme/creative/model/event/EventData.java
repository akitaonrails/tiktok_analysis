package com.ss.android.ugc.aweme.creative.model.event;

import X.C040H;
import X.C09CT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.event.EventData;
import com.ss.android.ugc.aweme.shortvideo.model.BeautyMobParam;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public final class EventData implements Parcelable {
    public static final Parcelable.Creator<EventData> CREATOR = new Parcelable.Creator<EventData>() { // from class: X.0MpK
        @Override // android.os.Parcelable.Creator
        public final EventData createFromParcel(Parcel parcel) {
            HashMap map;
            BeautyMobParam beautyMobParamCreateFromParcel = null;
            if (parcel.readInt() == 0) {
                map = null;
            } else {
                int i = parcel.readInt();
                map = new HashMap(i);
                for (int i2 = 0; i2 != i; i2++) {
                    String string = parcel.readString();
                    int i3 = parcel.readInt();
                    HashMap map2 = new HashMap(i3);
                    for (int i4 = 0; i4 != i3; i4++) {
                        map2.put(parcel.readString(), parcel.readString());
                    }
                    map.put(string, map2);
                }
            }
            if (parcel.readInt() != 0) {
                beautyMobParamCreateFromParcel = BeautyMobParam.CREATOR.createFromParcel(parcel);
            }
            return new EventData(map, beautyMobParamCreateFromParcel, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final EventData[] newArray(int i) {
            return new EventData[i];
        }
    };

    @C040H
    public BeautyMobParam beautyMobParam;

    @C040H
    public String enterFrom;

    @C040H
    public HashMap<String, HashMap<String, String>> extraEventParams;

    @C040H
    public String fromAlbumBottomBtn;

    @C040H
    public String pic2VideoSource;

    @C09CT("shoot_enter_method")
    public String shootEnterMethod;

    public EventData() {
        this(null, null, "", null, "", "");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        HashMap<String, HashMap<String, String>> map = this.extraEventParams;
        if (map == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(map.size());
            for (Map.Entry<String, HashMap<String, String>> entry : map.entrySet()) {
                parcel.writeString(entry.getKey());
                HashMap<String, String> value = entry.getValue();
                parcel.writeInt(value.size());
                for (Map.Entry<String, String> entry2 : value.entrySet()) {
                    parcel.writeString(entry2.getKey());
                    parcel.writeString(entry2.getValue());
                }
            }
        }
        BeautyMobParam beautyMobParam = this.beautyMobParam;
        if (beautyMobParam == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            beautyMobParam.writeToParcel(parcel, i);
        }
        parcel.writeString(this.shootEnterMethod);
        parcel.writeString(this.enterFrom);
        parcel.writeString(this.fromAlbumBottomBtn);
        parcel.writeString(this.pic2VideoSource);
    }

    public EventData(HashMap<String, HashMap<String, String>> map, BeautyMobParam beautyMobParam, String str, String str2, String str3, String str4) {
        this.extraEventParams = map;
        this.beautyMobParam = beautyMobParam;
        this.shootEnterMethod = str;
        this.enterFrom = str2;
        this.fromAlbumBottomBtn = str3;
        this.pic2VideoSource = str4;
    }
}
