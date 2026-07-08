package com.ss.android.ugc.aweme.sticker.image;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.sticker.image.ResourceInfo;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes14.dex */
public final class ResourceInfo implements Serializable, Parcelable {
    public boolean resCache;

    @C09CT("resource_map")
    public Map<String, String> resouceMap;

    @C09CT("resource_path")
    public String resourcePath;

    @C09CT("template_model_str")
    public String templateModel;
    public boolean zipCache;
    public static final Parcelable.Creator<ResourceInfo> CREATOR = new Parcelable.Creator<ResourceInfo>() { // from class: X.0WAA
        @Override // android.os.Parcelable.Creator
        public final ResourceInfo createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
            boolean z;
            String string = parcel.readString();
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int i = parcel.readInt();
                linkedHashMap = new LinkedHashMap(i);
                for (int i2 = 0; i2 != i; i2++) {
                    linkedHashMap.put(parcel.readString(), parcel.readString());
                }
            }
            boolean z2 = true;
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            if (parcel.readInt() == 0) {
                z2 = false;
            }
            return new ResourceInfo(string, string2, linkedHashMap, z, z2);
        }

        @Override // android.os.Parcelable.Creator
        public final ResourceInfo[] newArray(int i) {
            return new ResourceInfo[i];
        }
    };
    public static final int $stable = 8;

    public ResourceInfo() {
        this(null, null, null, false, false);
    }

    public final ResourceInfo copy(String str, String str2, Map<String, String> map, boolean z, boolean z2) {
        return new ResourceInfo(str, str2, map, z, z2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResourceInfo)) {
            return false;
        }
        ResourceInfo resourceInfo = (ResourceInfo) obj;
        return Intrinsics.LJFF(this.templateModel, resourceInfo.templateModel) && Intrinsics.LJFF(this.resourcePath, resourceInfo.resourcePath) && Intrinsics.LJFF(this.resouceMap, resourceInfo.resouceMap) && this.zipCache == resourceInfo.zipCache && this.resCache == resourceInfo.resCache;
    }

    public int hashCode() {
        String str = this.templateModel;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.resourcePath;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Map<String, String> map = this.resouceMap;
        return ((((iHashCode2 + (map != null ? map.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.zipCache)) * 31) + C786410Ut5.Z2(this.resCache);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ResourceInfo(templateModel=");
        sbLIZ.append(this.templateModel);
        sbLIZ.append(", resourcePath=");
        sbLIZ.append(this.resourcePath);
        sbLIZ.append(", resouceMap=");
        sbLIZ.append(this.resouceMap);
        sbLIZ.append(", zipCache=");
        sbLIZ.append(this.zipCache);
        sbLIZ.append(", resCache=");
        sbLIZ.append(this.resCache);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.templateModel);
        parcel.writeString(this.resourcePath);
        Map<String, String> map = this.resouceMap;
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
        parcel.writeInt(this.zipCache ? 1 : 0);
        parcel.writeInt(this.resCache ? 1 : 0);
    }

    public final boolean getResCache() {
        return this.resCache;
    }

    public final Map<String, String> getResouceMap() {
        return this.resouceMap;
    }

    public final String getResourcePath() {
        return this.resourcePath;
    }

    public final String getTemplateModel() {
        return this.templateModel;
    }

    public final boolean getZipCache() {
        return this.zipCache;
    }

    public final void setResCache(boolean z) {
        this.resCache = z;
    }

    public final void setResouceMap(Map<String, String> map) {
        this.resouceMap = map;
    }

    public final void setResourcePath(String str) {
        this.resourcePath = str;
    }

    public final void setTemplateModel(String str) {
        this.templateModel = str;
    }

    public final void setZipCache(boolean z) {
        this.zipCache = z;
    }

    public ResourceInfo(String str, String str2, Map<String, String> map, boolean z, boolean z2) {
        this.templateModel = str;
        this.resourcePath = str2;
        this.resouceMap = map;
        this.zipCache = z;
        this.resCache = z2;
    }
}
