package com.ss.android.ugc.aweme.creative.model;

import X.C09CT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.MinisAnchorInfo;
import com.ss.android.ugc.aweme.creative.model.MinisGameModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes22.dex */
public final class MinisGameModel implements Parcelable {
    public static final Parcelable.Creator<MinisGameModel> CREATOR = new Parcelable.Creator<MinisGameModel>() { // from class: X.0mKm
        @Override // android.os.Parcelable.Creator
        public final MinisGameModel createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            LinkedHashMap linkedHashMap = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(MinisAnchorInfo.CREATOR.createFromParcel(parcel));
                }
            }
            if (parcel.readInt() != 0) {
                int i3 = parcel.readInt();
                linkedHashMap = new LinkedHashMap(i3);
                for (int i4 = 0; i4 != i3; i4++) {
                    linkedHashMap.put(parcel.readString(), parcel.readString());
                }
            }
            return new MinisGameModel(arrayList, linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        public final MinisGameModel[] newArray(int i) {
            return new MinisGameModel[i];
        }
    };

    @C09CT("anchors")
    public final List<MinisAnchorInfo> anchorData;

    @C09CT("et_params")
    public final Map<String, String> etParams;

    public MinisGameModel() {
        this(null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List<MinisAnchorInfo> list = this.anchorData;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<MinisAnchorInfo> it2 = list.iterator();
            while (it2.hasNext()) {
                it2.next().writeToParcel(parcel, i);
            }
        }
        Map<String, String> map = this.etParams;
        if (map == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            parcel.writeString(entry.getKey());
            parcel.writeString(entry.getValue());
        }
    }

    public MinisGameModel(List<MinisAnchorInfo> list, Map<String, String> map) {
        this.anchorData = list;
        this.etParams = map;
    }
}
