package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.RecipientInfo;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class RecipientInfo implements Parcelable, Serializable {

    @C09CT("is_valid")
    public final Boolean isValid;

    @C09CT("node_id")
    public final String nodeId;

    @C09CT("data")
    public final String recipientData;

    @C09CT("schema")
    public final String schema;
    public static final Parcelable.Creator<RecipientInfo> CREATOR = new Parcelable.Creator<RecipientInfo>() { // from class: X.043V
        @Override // android.os.Parcelable.Creator
        public final RecipientInfo createFromParcel(Parcel parcel) {
            boolean z;
            Boolean boolValueOf;
            String string = parcel.readString();
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                if (parcel.readInt() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                boolValueOf = Boolean.valueOf(z);
            }
            return new RecipientInfo(string, string2, boolValueOf, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final RecipientInfo[] newArray(int i) {
            return new RecipientInfo[i];
        }
    };
    public static final int $stable = 8;

    public final RecipientInfo copy(String str, String str2, Boolean bool, String str3) {
        return new RecipientInfo(str, str2, bool, str3);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecipientInfo)) {
            return false;
        }
        RecipientInfo recipientInfo = (RecipientInfo) obj;
        return Intrinsics.LJFF(this.schema, recipientInfo.schema) && Intrinsics.LJFF(this.recipientData, recipientInfo.recipientData) && Intrinsics.LJFF(this.isValid, recipientInfo.isValid) && Intrinsics.LJFF(this.nodeId, recipientInfo.nodeId);
    }

    public int hashCode() {
        String str = this.schema;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.recipientData;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.isValid;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str3 = this.nodeId;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RecipientInfo(schema=");
        sbLIZ.append(this.schema);
        sbLIZ.append(", recipientData=");
        sbLIZ.append(this.recipientData);
        sbLIZ.append(", isValid=");
        sbLIZ.append(this.isValid);
        sbLIZ.append(", nodeId=");
        sbLIZ.append(this.nodeId);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r3v0, types: [android.os.Parcel] */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        ?? BooleanValue;
        parcel.writeString(this.schema);
        parcel.writeString(this.recipientData);
        Boolean bool = this.isValid;
        if (bool == null) {
            BooleanValue = 0;
        } else {
            parcel.writeInt(1);
            BooleanValue = bool.booleanValue();
        }
        parcel.writeInt(BooleanValue);
        parcel.writeString(this.nodeId);
    }

    public final String getNodeId() {
        return this.nodeId;
    }

    public final String getRecipientData() {
        return this.recipientData;
    }

    public final String getSchema() {
        return this.schema;
    }

    public final Boolean isValid() {
        return this.isValid;
    }

    public RecipientInfo(String str, String str2, Boolean bool, String str3) {
        this.schema = str;
        this.recipientData = str2;
        this.isValid = bool;
        this.nodeId = str3;
    }
}
