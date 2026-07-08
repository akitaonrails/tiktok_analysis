package com.ss.android.ugc.aweme.im.message.template.component;

import X.C13BV;
import X.C1516540pZE;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C2241551CoL;
import X.C2241571CoN;
import X.C2241611CoR;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.im.message.template.component.BaseResponseComponent;
import com.ss.android.ugc.aweme.im.message.template.component.TTLComponent;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes35.dex */
public final class BaseResponseComponent implements BaseComponent<C2241571CoN> {
    public static final Parcelable.Creator<BaseResponseComponent> CREATOR = new Parcelable.Creator<BaseResponseComponent>() { // from class: X.1Cnh
        @Override // android.os.Parcelable.Creator
        public final BaseResponseComponent createFromParcel(Parcel parcel) {
            TTLComponent tTLComponentCreateFromParcel = TTLComponent.CREATOR.createFromParcel(parcel);
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            long j = parcel.readLong();
            int i = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i);
            for (int i2 = 0; i2 != i; i2++) {
                linkedHashMap.put(parcel.readString(), parcel.readString());
            }
            return new BaseResponseComponent(tTLComponentCreateFromParcel, arrayListCreateStringArrayList, j, linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        public final BaseResponseComponent[] newArray(int i) {
            return new BaseResponseComponent[i];
        }
    };
    public final List<String> contentMenus;
    public final Map<String, String> extras;
    public final long minVersion;
    public final TTLComponent ttlComponent;

    public BaseResponseComponent() {
        this(0L, 15);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BaseResponseComponent)) {
            return false;
        }
        BaseResponseComponent baseResponseComponent = (BaseResponseComponent) obj;
        return Intrinsics.LJFF(this.ttlComponent, baseResponseComponent.ttlComponent) && Intrinsics.LJFF(this.contentMenus, baseResponseComponent.contentMenus) && this.minVersion == baseResponseComponent.minVersion && Intrinsics.LJFF(this.extras, baseResponseComponent.extras);
    }

    public final int hashCode() {
        return (((((this.ttlComponent.hashCode() * 31) + this.contentMenus.hashCode()) * 31) + C786410Ut5.Y2(this.minVersion)) * 31) + this.extras.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BaseResponseComponent(ttlComponent=");
        sbLIZ.append(this.ttlComponent);
        sbLIZ.append(", contentMenus=");
        sbLIZ.append(this.contentMenus);
        sbLIZ.append(", minVersion=");
        sbLIZ.append(this.minVersion);
        sbLIZ.append(", extras=");
        sbLIZ.append(this.extras);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final C2241571CoN LIZ() {
        C2241551CoL c2241551CoL = new C2241551CoL();
        TTLComponent tTLComponent = this.ttlComponent;
        tTLComponent.getClass();
        C2241611CoR c2241611CoR = new C2241611CoR();
        c2241611CoR.LIZLLL = Long.valueOf(tTLComponent.expiredAt);
        c2241551CoL.LIZLLL = c2241611CoR.build();
        List<String> list = this.contentMenus;
        C1516540pZE.LIZ(list);
        c2241551CoL.LJ = list;
        c2241551CoL.LJFF = Long.valueOf(this.minVersion);
        Map<String, String> map = this.extras;
        C1516540pZE.LIZIZ(map);
        c2241551CoL.LJI = map;
        return c2241551CoL.build();
    }

    public BaseResponseComponent(long j, int i) {
        TTLComponent tTLComponent;
        C13BV c13bv;
        long j2 = j;
        if ((i & 1) != 0) {
            tTLComponent = new TTLComponent(0);
        } else {
            tTLComponent = null;
        }
        if ((i & 2) != 0) {
            c13bv = C13BV.INSTANCE;
        } else {
            c13bv = null;
        }
        this(tTLComponent, c13bv, (i & 4) != 0 ? 0L : j2, (i & 8) != 0 ? C2097608Jq.LJ() : null);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.ttlComponent.expiredAt);
        parcel.writeStringList(this.contentMenus);
        parcel.writeLong(this.minVersion);
        Map<String, String> map = this.extras;
        parcel.writeInt(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            parcel.writeString(entry.getKey());
            parcel.writeString(entry.getValue());
        }
    }

    public BaseResponseComponent(TTLComponent tTLComponent, List<String> list, long j, Map<String, String> map) {
        this.ttlComponent = tTLComponent;
        this.contentMenus = list;
        this.minVersion = j;
        this.extras = map;
    }
}
