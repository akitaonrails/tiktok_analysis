package com.bytedance.effectcreatormobile.ckeapi.api.objectselect;

import X.C2188811AlT;
import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.effectcreatormobile.ckeapi.api.objectselect.PrefabData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class PrefabData implements Parcelable {
    public static final Parcelable.Creator<PrefabData> CREATOR = new Parcelable.Creator<PrefabData>() { // from class: X.0vL2
        @Override // android.os.Parcelable.Creator
        public final PrefabData createFromParcel(Parcel parcel) {
            return new PrefabData(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString(), (Point) parcel.readParcelable(PrefabData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final PrefabData[] newArray(int i) {
            return new PrefabData[i];
        }
    };
    public final String capabilites;
    public final String category;
    public final int ckeFeatureType;
    public final Point defaultSelectedIndex;
    public final String effectFilePath;
    public final String effectId;
    public final String lokiPanelKey;
    public final String resourceId;
    public final String typeName;

    /* JADX WARN: Illegal instructions before constructor call */
    public PrefabData() {
        String str = null;
        this(str, str, str, str, str, str, 0, str, 511);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PrefabData)) {
            return false;
        }
        PrefabData prefabData = (PrefabData) obj;
        return Intrinsics.LJFF(this.lokiPanelKey, prefabData.lokiPanelKey) && Intrinsics.LJFF(this.category, prefabData.category) && Intrinsics.LJFF(this.typeName, prefabData.typeName) && Intrinsics.LJFF(this.effectFilePath, prefabData.effectFilePath) && Intrinsics.LJFF(this.effectId, prefabData.effectId) && Intrinsics.LJFF(this.resourceId, prefabData.resourceId) && this.ckeFeatureType == prefabData.ckeFeatureType && Intrinsics.LJFF(this.capabilites, prefabData.capabilites) && Intrinsics.LJFF(this.defaultSelectedIndex, prefabData.defaultSelectedIndex);
    }

    public final int hashCode() {
        int iHashCode = ((((((((((((((this.lokiPanelKey.hashCode() * 31) + this.category.hashCode()) * 31) + this.typeName.hashCode()) * 31) + this.effectFilePath.hashCode()) * 31) + this.effectId.hashCode()) * 31) + this.resourceId.hashCode()) * 31) + this.ckeFeatureType) * 31) + this.capabilites.hashCode()) * 31;
        Point point = this.defaultSelectedIndex;
        return iHashCode + (point == null ? 0 : point.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PrefabData(lokiPanelKey=");
        sbLIZ.append(this.lokiPanelKey);
        sbLIZ.append(", category=");
        sbLIZ.append(this.category);
        sbLIZ.append(", typeName=");
        sbLIZ.append(this.typeName);
        sbLIZ.append(", effectFilePath=");
        sbLIZ.append(this.effectFilePath);
        sbLIZ.append(", effectId=");
        sbLIZ.append(this.effectId);
        sbLIZ.append(", resourceId=");
        sbLIZ.append(this.resourceId);
        sbLIZ.append(", ckeFeatureType=");
        sbLIZ.append(this.ckeFeatureType);
        sbLIZ.append(", capabilites=");
        sbLIZ.append(this.capabilites);
        sbLIZ.append(", defaultSelectedIndex=");
        sbLIZ.append(this.defaultSelectedIndex);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.lokiPanelKey);
        parcel.writeString(this.category);
        parcel.writeString(this.typeName);
        parcel.writeString(this.effectFilePath);
        parcel.writeString(this.effectId);
        parcel.writeString(this.resourceId);
        parcel.writeInt(this.ckeFeatureType);
        parcel.writeString(this.capabilites);
        parcel.writeParcelable(this.defaultSelectedIndex, i);
    }

    public static PrefabData LIZ(PrefabData prefabData, String str, String str2, String str3, String str4, String str5, int i) {
        String str6;
        String str7;
        int i2;
        String str8 = str4;
        String str9 = str3;
        String str10 = str2;
        String str11 = str5;
        String str12 = str;
        Point point = null;
        if ((i & 1) != 0) {
            str6 = prefabData.lokiPanelKey;
        } else {
            str6 = null;
        }
        if ((i & 2) != 0) {
            str7 = prefabData.category;
        } else {
            str7 = null;
        }
        if ((i & 4) != 0) {
            str12 = prefabData.typeName;
        }
        if ((i & 8) != 0) {
            str10 = prefabData.effectFilePath;
        }
        if ((i & 16) != 0) {
            str9 = prefabData.effectId;
        }
        if ((i & 32) != 0) {
            str8 = prefabData.resourceId;
        }
        if ((i & 64) != 0) {
            i2 = prefabData.ckeFeatureType;
        } else {
            i2 = 0;
        }
        if ((i & 128) != 0) {
            str11 = prefabData.capabilites;
        }
        if ((i & 256) != 0) {
            point = prefabData.defaultSelectedIndex;
        }
        prefabData.getClass();
        return new PrefabData(str6, str7, str12, str10, str9, str8, i2, str11, point);
    }

    public /* synthetic */ PrefabData(String str, String str2, String str3, String str4, String str5, String str6, int i, String str7, int i2) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? "" : str3, (i2 & 8) != 0 ? "" : str4, (i2 & 16) != 0 ? "" : str5, (i2 & 32) != 0 ? "" : str6, (i2 & 64) != 0 ? 0 : i, (i2 & 128) == 0 ? str7 : "", (Point) null);
    }

    public PrefabData(String str, String str2, String str3, String str4, String str5, String str6, int i, String str7, Point point) {
        this.lokiPanelKey = str;
        this.category = str2;
        this.typeName = str3;
        this.effectFilePath = str4;
        this.effectId = str5;
        this.resourceId = str6;
        this.ckeFeatureType = i;
        this.capabilites = str7;
        this.defaultSelectedIndex = point;
    }
}
