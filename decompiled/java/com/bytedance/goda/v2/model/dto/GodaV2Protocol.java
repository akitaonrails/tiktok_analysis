package com.bytedance.goda.v2.model.dto;

import X.C04EU;
import X.C04FW;
import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.goda.v2.model.dto.GodaV2Protocol;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class GodaV2Protocol<T> implements Parcelable {
    public static final C04FW CREATOR = new Parcelable.Creator<GodaV2Protocol<?>>() { // from class: X.04FW
        @Override // android.os.Parcelable.Creator
        public final GodaV2Protocol<?> createFromParcel(Parcel parcel) {
            return new GodaV2Protocol<>(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final GodaV2Protocol<?>[] newArray(int i) {
            return new GodaV2Protocol[i];
        }
    };

    @C09CT("container")
    public final Map<String, GodaV2Container> container;

    @C09CT("data")
    public final Map<String, GodaV2Data> data;

    @C09CT("extension")
    public final GodaV2Extension extension;

    @C09CT("facade")
    public final GodaV2Facade facade;

    @C09CT("global")
    public final GlobalStruct<T> global;
    public C04EU localExtra;

    @C09CT("update_type")
    public final Integer updateType;

    public GodaV2Protocol() {
        this(null, null, null, null, null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GodaV2Protocol)) {
            return false;
        }
        GodaV2Protocol godaV2Protocol = (GodaV2Protocol) obj;
        return Intrinsics.LJFF(this.global, godaV2Protocol.global) && Intrinsics.LJFF(this.facade, godaV2Protocol.facade) && Intrinsics.LJFF(this.container, godaV2Protocol.container) && Intrinsics.LJFF(this.data, godaV2Protocol.data) && Intrinsics.LJFF(this.updateType, godaV2Protocol.updateType) && Intrinsics.LJFF(this.extension, godaV2Protocol.extension);
    }

    public final int hashCode() {
        GlobalStruct<T> globalStruct = this.global;
        int iHashCode = (globalStruct == null ? 0 : globalStruct.hashCode()) * 31;
        GodaV2Facade godaV2Facade = this.facade;
        int iHashCode2 = (iHashCode + (godaV2Facade == null ? 0 : godaV2Facade.hashCode())) * 31;
        Map<String, GodaV2Container> map = this.container;
        int iHashCode3 = (iHashCode2 + (map == null ? 0 : map.hashCode())) * 31;
        Map<String, GodaV2Data> map2 = this.data;
        int iHashCode4 = (iHashCode3 + (map2 == null ? 0 : map2.hashCode())) * 31;
        Integer num = this.updateType;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        GodaV2Extension godaV2Extension = this.extension;
        return iHashCode5 + (godaV2Extension != null ? godaV2Extension.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GodaV2Protocol(global=");
        sbLIZ.append(this.global);
        sbLIZ.append(", facade=");
        sbLIZ.append(this.facade);
        sbLIZ.append(", container=");
        sbLIZ.append(this.container);
        sbLIZ.append(", data=");
        sbLIZ.append(this.data);
        sbLIZ.append(", updateType=");
        sbLIZ.append(this.updateType);
        sbLIZ.append(", extension=");
        sbLIZ.append(this.extension);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
    }

    public GodaV2Protocol(Parcel parcel) {
        this(null, null, null, null, null, null);
    }

    public GodaV2Protocol(GlobalStruct<T> globalStruct, GodaV2Facade godaV2Facade, Map<String, GodaV2Container> map, Map<String, GodaV2Data> map2, Integer num, GodaV2Extension godaV2Extension) {
        this.global = globalStruct;
        this.facade = godaV2Facade;
        this.container = map;
        this.data = map2;
        this.updateType = num;
        this.extension = godaV2Extension;
    }

    public static GodaV2Protocol LIZ(GodaV2Protocol godaV2Protocol, GlobalStruct globalStruct, Map map, Map map2, GodaV2Extension godaV2Extension, int i) {
        GodaV2Facade godaV2Facade;
        GodaV2Extension godaV2Extension2 = godaV2Extension;
        Map map3 = map2;
        Map map4 = map;
        GlobalStruct globalStruct2 = globalStruct;
        if ((i & 1) != 0) {
            globalStruct2 = godaV2Protocol.global;
        }
        Integer num = null;
        if ((i & 2) != 0) {
            godaV2Facade = godaV2Protocol.facade;
        } else {
            godaV2Facade = null;
        }
        if ((i & 4) != 0) {
            map4 = godaV2Protocol.container;
        }
        if ((i & 8) != 0) {
            map3 = godaV2Protocol.data;
        }
        if ((i & 16) != 0) {
            num = godaV2Protocol.updateType;
        }
        if ((i & 32) != 0) {
            godaV2Extension2 = godaV2Protocol.extension;
        }
        godaV2Protocol.getClass();
        return new GodaV2Protocol(globalStruct2, godaV2Facade, map4, map3, num, godaV2Extension2);
    }
}
