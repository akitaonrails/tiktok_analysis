package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.RecommendationContext;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class RecommendationContext implements Parcelable {

    @C09CT("passthrough_map")
    public final Map<String, String> passThroughMap;

    @C09CT("scenes")
    public final List<String> scenes;
    public static final Parcelable.Creator<RecommendationContext> CREATOR = new Parcelable.Creator<RecommendationContext>() { // from class: X.03zI
        @Override // android.os.Parcelable.Creator
        public final RecommendationContext createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int i = parcel.readInt();
                linkedHashMap = new LinkedHashMap(i);
                for (int i2 = 0; i2 != i; i2++) {
                    linkedHashMap.put(parcel.readString(), parcel.readString());
                }
            }
            return new RecommendationContext(arrayListCreateStringArrayList, linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        public final RecommendationContext[] newArray(int i) {
            return new RecommendationContext[i];
        }
    };
    public static final int $stable = 8;

    public RecommendationContext() {
        this(null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecommendationContext)) {
            return false;
        }
        RecommendationContext recommendationContext = (RecommendationContext) obj;
        return Intrinsics.LJFF(this.scenes, recommendationContext.scenes) && Intrinsics.LJFF(this.passThroughMap, recommendationContext.passThroughMap);
    }

    public final int hashCode() {
        List<String> list = this.scenes;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        Map<String, String> map = this.passThroughMap;
        return iHashCode + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RecommendationContext(scenes=");
        sbLIZ.append(this.scenes);
        sbLIZ.append(", passThroughMap=");
        sbLIZ.append(this.passThroughMap);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.scenes);
        Map<String, String> map = this.passThroughMap;
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

    public RecommendationContext(List<String> list, Map<String, String> map) {
        this.scenes = list;
        this.passThroughMap = map;
    }
}
