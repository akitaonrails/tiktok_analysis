package com.ss.android.ugc.aweme.creative.model.edit;

import X.C09CT;
import X.C0MY0;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C786410Ut5;
import X.InterfaceC2270808v4;
import X.InterfaceC2270908v5;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.edit.FeatureExtraction;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class FeatureExtraction implements Parcelable {
    public static final Parcelable.Creator<FeatureExtraction> CREATOR = new Parcelable.Creator<FeatureExtraction>() { // from class: X.08v3
        @Override // android.os.Parcelable.Creator
        public final FeatureExtraction createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            String string = parcel.readString();
            int i = parcel.readInt();
            int i2 = parcel.readInt();
            long j = parcel.readLong();
            int i3 = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i3);
            boolean z = false;
            for (int i4 = 0; i4 != i3; i4++) {
                linkedHashMap.put(parcel.readString(), parcel.createStringArrayList());
            }
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                if (parcel.readInt() != 0) {
                    z = true;
                }
                boolValueOf = Boolean.valueOf(z);
            }
            return new FeatureExtraction(string, i, i2, j, linkedHashMap, string2, string3, boolValueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final FeatureExtraction[] newArray(int i) {
            return new FeatureExtraction[i];
        }
    };

    @C09CT("algorithms")
    public Map<String, ? extends List<String>> algorithm;

    @C09CT("duration")
    public final long duration;

    @C09CT("height")
    public final int height;

    @C09CT("is_video_type")
    public final Boolean isVideoType;

    @C09CT("media_system_id")
    public final String mediaSystemId;

    @InterfaceC2270908v5
    @InterfaceC2270808v4
    @C09CT("path")
    @C0MY0
    public final String path;

    @C09CT("uri")
    public final String uri;

    @C09CT("width")
    public final int width;

    public FeatureExtraction() {
        this("", -1, -1, -1L, C2097608Jq.LJ(), "", "", null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FeatureExtraction)) {
            return false;
        }
        FeatureExtraction featureExtraction = (FeatureExtraction) obj;
        return Intrinsics.LJFF(this.path, featureExtraction.path) && this.width == featureExtraction.width && this.height == featureExtraction.height && this.duration == featureExtraction.duration && Intrinsics.LJFF(this.algorithm, featureExtraction.algorithm) && Intrinsics.LJFF(this.uri, featureExtraction.uri) && Intrinsics.LJFF(this.mediaSystemId, featureExtraction.mediaSystemId) && Intrinsics.LJFF(this.isVideoType, featureExtraction.isVideoType);
    }

    public final int hashCode() {
        int iHashCode = ((((((((((((this.path.hashCode() * 31) + this.width) * 31) + this.height) * 31) + C786410Ut5.Y2(this.duration)) * 31) + this.algorithm.hashCode()) * 31) + this.uri.hashCode()) * 31) + this.mediaSystemId.hashCode()) * 31;
        Boolean bool = this.isVideoType;
        return iHashCode + (bool == null ? 0 : bool.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FeatureExtraction(path=");
        sbLIZ.append(this.path);
        sbLIZ.append(", width=");
        sbLIZ.append(this.width);
        sbLIZ.append(", height=");
        sbLIZ.append(this.height);
        sbLIZ.append(", duration=");
        sbLIZ.append(this.duration);
        sbLIZ.append(", algorithm=");
        sbLIZ.append(this.algorithm);
        sbLIZ.append(", uri=");
        sbLIZ.append(this.uri);
        sbLIZ.append(", mediaSystemId=");
        sbLIZ.append(this.mediaSystemId);
        sbLIZ.append(", isVideoType=");
        sbLIZ.append(this.isVideoType);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [int] */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r4v0, types: [android.os.Parcel] */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        ?? BooleanValue;
        parcel.writeString(this.path);
        parcel.writeInt(this.width);
        parcel.writeInt(this.height);
        parcel.writeLong(this.duration);
        Map<String, ? extends List<String>> map = this.algorithm;
        parcel.writeInt(map.size());
        for (Map.Entry<String, ? extends List<String>> entry : map.entrySet()) {
            parcel.writeString(entry.getKey());
            parcel.writeStringList(entry.getValue());
        }
        parcel.writeString(this.uri);
        parcel.writeString(this.mediaSystemId);
        Boolean bool = this.isVideoType;
        if (bool == null) {
            BooleanValue = 0;
        } else {
            parcel.writeInt(1);
            BooleanValue = bool.booleanValue();
        }
        parcel.writeInt(BooleanValue);
    }

    public FeatureExtraction(String str, int i, int i2, long j, Map<String, ? extends List<String>> map, String str2, String str3, Boolean bool) {
        this.path = str;
        this.width = i;
        this.height = i2;
        this.duration = j;
        this.algorithm = map;
        this.uri = str2;
        this.mediaSystemId = str3;
        this.isVideoType = bool;
    }
}
