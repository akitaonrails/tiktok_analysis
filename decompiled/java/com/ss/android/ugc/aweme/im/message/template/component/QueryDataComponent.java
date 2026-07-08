package com.ss.android.ugc.aweme.im.message.template.component;

import X.C2097608Jq;
import X.C2188811AlT;
import X.C2227681CGw;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.im.message.template.component.QueryDataComponent;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class QueryDataComponent implements BaseComponent<C2227681CGw> {
    public static final Parcelable.Creator<QueryDataComponent> CREATOR = new Parcelable.Creator<QueryDataComponent>() { // from class: X.0m1P
        @Override // android.os.Parcelable.Creator
        public final QueryDataComponent createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            int i = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i);
            for (int i2 = 0; i2 != i; i2++) {
                linkedHashMap.put(parcel.readString(), parcel.readString());
            }
            return new QueryDataComponent(string, linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        public final QueryDataComponent[] newArray(int i) {
            return new QueryDataComponent[i];
        }
    };
    public final Map<String, String> extras;
    public final String resourceID;

    /* JADX WARN: Multi-variable type inference failed */
    public QueryDataComponent() {
        this(null, 0 == true ? 1 : 0, 3);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QueryDataComponent)) {
            return false;
        }
        QueryDataComponent queryDataComponent = (QueryDataComponent) obj;
        return Intrinsics.LJFF(this.resourceID, queryDataComponent.resourceID) && Intrinsics.LJFF(this.extras, queryDataComponent.extras);
    }

    public final int hashCode() {
        return (this.resourceID.hashCode() * 31) + this.extras.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("QueryDataComponent(resourceID=");
        sbLIZ.append(this.resourceID);
        sbLIZ.append(", extras=");
        sbLIZ.append(this.extras);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.resourceID);
        Map<String, String> map = this.extras;
        parcel.writeInt(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            parcel.writeString(entry.getKey());
            parcel.writeString(entry.getValue());
        }
    }

    public QueryDataComponent(String str, Map<String, String> map) {
        this.resourceID = str;
        this.extras = map;
    }

    public static QueryDataComponent LIZ(QueryDataComponent queryDataComponent, Map map) {
        String str = queryDataComponent.resourceID;
        queryDataComponent.getClass();
        return new QueryDataComponent(str, map);
    }

    public /* synthetic */ QueryDataComponent(String str, Map map, int i) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? C2097608Jq.LJ() : map);
    }
}
