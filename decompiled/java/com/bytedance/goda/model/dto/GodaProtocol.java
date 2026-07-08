package com.bytedance.goda.model.dto;

import X.C04CQ;
import X.C09CS;
import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.goda.model.adapter.MapAdapter;
import com.bytedance.goda.model.dto.GodaProtocol;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class GodaProtocol implements Parcelable {
    public static final C04CQ CREATOR = new Parcelable.Creator<GodaProtocol>() { // from class: X.04CQ
        @Override // android.os.Parcelable.Creator
        public final GodaProtocol createFromParcel(Parcel parcel) {
            return new GodaProtocol(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final GodaProtocol[] newArray(int i) {
            return new GodaProtocol[i];
        }
    };

    @C09CT("global")
    @C09CS(MapAdapter.class)
    public final Map<String, Object> global;

    public GodaProtocol() {
        this((Map<String, ? extends Object>) null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GodaProtocol) && Intrinsics.LJFF(this.global, ((GodaProtocol) obj).global);
    }

    public final int hashCode() {
        Map<String, Object> map = this.global;
        if (map == null) {
            return 0;
        }
        return map.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GodaProtocol(global=");
        sbLIZ.append(this.global);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
    }

    public GodaProtocol(Map<String, ? extends Object> map) {
        this.global = map;
    }

    public GodaProtocol(Parcel parcel) {
        this((Map<String, ? extends Object>) null);
    }
}
