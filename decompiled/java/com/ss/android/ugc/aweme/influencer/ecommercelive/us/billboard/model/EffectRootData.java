package com.ss.android.ugc.aweme.influencer.ecommercelive.us.billboard.model;

import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.influencer.ecommercelive.us.billboard.model.EffectRootData;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class EffectRootData implements Parcelable {
    public String authorId;
    public Map<String, String> daInfo;
    public String roomId;
    public String scene;
    public String source;
    public String userId;
    public static final Parcelable.Creator<EffectRootData> CREATOR = new Parcelable.Creator<EffectRootData>() { // from class: X.0ule
        @Override // android.os.Parcelable.Creator
        public final EffectRootData createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int i = parcel.readInt();
                linkedHashMap = new LinkedHashMap(i);
                for (int i2 = 0; i2 != i; i2++) {
                    linkedHashMap.put(parcel.readString(), parcel.readString());
                }
            }
            return new EffectRootData(string, string2, string3, string4, string5, linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        public final EffectRootData[] newArray(int i) {
            return new EffectRootData[i];
        }
    };
    public static final int $stable = 8;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EffectRootData)) {
            return false;
        }
        EffectRootData effectRootData = (EffectRootData) obj;
        return Intrinsics.LJFF(this.authorId, effectRootData.authorId) && Intrinsics.LJFF(this.roomId, effectRootData.roomId) && Intrinsics.LJFF(this.userId, effectRootData.userId) && Intrinsics.LJFF(this.scene, effectRootData.scene) && Intrinsics.LJFF(this.source, effectRootData.source) && Intrinsics.LJFF(this.daInfo, effectRootData.daInfo);
    }

    public final int hashCode() {
        int iHashCode = ((((((((this.authorId.hashCode() * 31) + this.roomId.hashCode()) * 31) + this.userId.hashCode()) * 31) + this.scene.hashCode()) * 31) + this.source.hashCode()) * 31;
        Map<String, String> map = this.daInfo;
        return iHashCode + (map == null ? 0 : map.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EffectRootData(authorId=");
        sbLIZ.append(this.authorId);
        sbLIZ.append(", roomId=");
        sbLIZ.append(this.roomId);
        sbLIZ.append(", userId=");
        sbLIZ.append(this.userId);
        sbLIZ.append(", scene=");
        sbLIZ.append(this.scene);
        sbLIZ.append(", source=");
        sbLIZ.append(this.source);
        sbLIZ.append(", daInfo=");
        sbLIZ.append(this.daInfo);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.authorId);
        parcel.writeString(this.roomId);
        parcel.writeString(this.userId);
        parcel.writeString(this.scene);
        parcel.writeString(this.source);
        Map<String, String> map = this.daInfo;
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

    public /* synthetic */ EffectRootData(String str, String str2, Map map, String str3, String str4, int i) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) == 0 ? null : "", str3, str4, (Map<String, String>) ((i & 32) == 0 ? map : null));
    }

    public EffectRootData(String str, String str2, String str3, String str4, String str5, Map<String, String> map) {
        this.authorId = str;
        this.roomId = str2;
        this.userId = str3;
        this.scene = str4;
        this.source = str5;
        this.daInfo = map;
    }
}
