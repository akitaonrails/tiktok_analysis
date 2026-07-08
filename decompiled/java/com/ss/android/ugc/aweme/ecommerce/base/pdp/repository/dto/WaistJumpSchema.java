package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C09CT;
import X.C2188811AlT;
import X.C684702lp;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.WaistJumpSchema;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class WaistJumpSchema implements Parcelable {

    @C09CT("schema")
    public String schema;

    @C09CT("schema_type")
    public int schemaType;
    public static final C684702lp Companion = new Object() { // from class: X.02lp
    };
    public static final Parcelable.Creator<WaistJumpSchema> CREATOR = new Parcelable.Creator<WaistJumpSchema>() { // from class: X.02lo
        @Override // android.os.Parcelable.Creator
        public final WaistJumpSchema createFromParcel(Parcel parcel) {
            return new WaistJumpSchema(parcel.readInt(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final WaistJumpSchema[] newArray(int i) {
            return new WaistJumpSchema[i];
        }
    };
    public static final int $stable = 8;

    public WaistJumpSchema() {
        this(0, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WaistJumpSchema)) {
            return false;
        }
        WaistJumpSchema waistJumpSchema = (WaistJumpSchema) obj;
        return this.schemaType == waistJumpSchema.schemaType && Intrinsics.LJFF(this.schema, waistJumpSchema.schema);
    }

    public final int hashCode() {
        int i = this.schemaType * 31;
        String str = this.schema;
        return i + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("WaistJumpSchema(schemaType=");
        sbLIZ.append(this.schemaType);
        sbLIZ.append(", schema=");
        sbLIZ.append(this.schema);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.schemaType);
        parcel.writeString(this.schema);
    }

    public WaistJumpSchema(int i, String str) {
        this.schemaType = i;
        this.schema = str;
    }
}
