package com.ss.android.ugc.aweme.creative.model.edit;

import X.C09CT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.edit.ImageAdjustInfo;
import com.ss.android.ugc.aweme.creative.model.edit.SingleAdjustInfo;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes23.dex */
public final class ImageAdjustInfo implements Parcelable, Serializable {
    public static final Parcelable.Creator<ImageAdjustInfo> CREATOR = new Parcelable.Creator<ImageAdjustInfo>() { // from class: X.0mdf
        @Override // android.os.Parcelable.Creator
        public final ImageAdjustInfo createFromParcel(Parcel parcel) {
            int i = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i);
            for (int i2 = 0; i2 != i; i2++) {
                linkedHashMap.put(parcel.readString(), SingleAdjustInfo.CREATOR.createFromParcel(parcel));
            }
            return new ImageAdjustInfo(linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        public final ImageAdjustInfo[] newArray(int i) {
            return new ImageAdjustInfo[i];
        }
    };

    @C09CT("adjust_map")
    public Map<String, SingleAdjustInfo> adjustMap;

    /* JADX WARN: Multi-variable type inference failed */
    public ImageAdjustInfo() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Map<String, SingleAdjustInfo> map = this.adjustMap;
        parcel.writeInt(map.size());
        for (Map.Entry<String, SingleAdjustInfo> entry : map.entrySet()) {
            parcel.writeString(entry.getKey());
            entry.getValue().writeToParcel(parcel, i);
        }
    }

    public final Map<String, SingleAdjustInfo> getAdjustMap() {
        return this.adjustMap;
    }

    public ImageAdjustInfo(Map<String, SingleAdjustInfo> map) {
        this.adjustMap = map;
    }

    public final void setAdjustMap(Map<String, SingleAdjustInfo> map) {
        this.adjustMap = map;
    }

    public /* synthetic */ ImageAdjustInfo(Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new LinkedHashMap() : map);
    }
}
