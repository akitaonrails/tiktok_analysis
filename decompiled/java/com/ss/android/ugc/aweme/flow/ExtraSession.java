package com.ss.android.ugc.aweme.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.flow.ExtraSession;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes23.dex */
public final class ExtraSession implements Parcelable {
    public static final Parcelable.Creator<ExtraSession> CREATOR = new Parcelable.Creator<ExtraSession>() { // from class: X.0mfv
        @Override // android.os.Parcelable.Creator
        public final ExtraSession createFromParcel(Parcel parcel) {
            int i = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i);
            for (int i2 = 0; i2 != i; i2++) {
                linkedHashMap.put(parcel.readString(), parcel.readParcelable(ExtraSession.class.getClassLoader()));
            }
            return new ExtraSession(linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        public final ExtraSession[] newArray(int i) {
            return new ExtraSession[i];
        }
    };
    public final Map<String, Parcelable> map;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Map<String, Parcelable> map = this.map;
        parcel.writeInt(map.size());
        for (Map.Entry<String, Parcelable> entry : map.entrySet()) {
            parcel.writeString(entry.getKey());
            parcel.writeParcelable(entry.getValue(), i);
        }
    }

    public ExtraSession() {
        this(new HashMap());
    }

    public ExtraSession(Map<String, Parcelable> map) {
        this.map = map;
    }
}
