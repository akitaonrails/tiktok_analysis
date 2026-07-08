package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.GenPageLinkChainKeyData;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class GenPageLinkChainKeyData implements Parcelable, Serializable {

    @C09CT("affiliate_schema")
    public final String affiliateSchema;

    @C09CT("chain_key")
    public final String chainKey;

    @C09CT("needs_show_preview_card")
    public final Boolean needCards;

    @C09CT("schema")
    public final String schema;
    public static final Parcelable.Creator<GenPageLinkChainKeyData> CREATOR = new Parcelable.Creator<GenPageLinkChainKeyData>() { // from class: X.0ve4
        @Override // android.os.Parcelable.Creator
        public final GenPageLinkChainKeyData createFromParcel(Parcel parcel) {
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
            return new GenPageLinkChainKeyData(string, string2, boolValueOf, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final GenPageLinkChainKeyData[] newArray(int i) {
            return new GenPageLinkChainKeyData[i];
        }
    };
    public static final int $stable = 8;

    public final GenPageLinkChainKeyData copy(String str, String str2, Boolean bool, String str3) {
        return new GenPageLinkChainKeyData(str, str2, bool, str3);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GenPageLinkChainKeyData)) {
            return false;
        }
        GenPageLinkChainKeyData genPageLinkChainKeyData = (GenPageLinkChainKeyData) obj;
        return Intrinsics.LJFF(this.chainKey, genPageLinkChainKeyData.chainKey) && Intrinsics.LJFF(this.schema, genPageLinkChainKeyData.schema) && Intrinsics.LJFF(this.needCards, genPageLinkChainKeyData.needCards) && Intrinsics.LJFF(this.affiliateSchema, genPageLinkChainKeyData.affiliateSchema);
    }

    public int hashCode() {
        String str = this.chainKey;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.schema;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.needCards;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str3 = this.affiliateSchema;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GenPageLinkChainKeyData(chainKey=");
        sbLIZ.append(this.chainKey);
        sbLIZ.append(", schema=");
        sbLIZ.append(this.schema);
        sbLIZ.append(", needCards=");
        sbLIZ.append(this.needCards);
        sbLIZ.append(", affiliateSchema=");
        sbLIZ.append(this.affiliateSchema);
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
        parcel.writeString(this.chainKey);
        parcel.writeString(this.schema);
        Boolean bool = this.needCards;
        if (bool == null) {
            BooleanValue = 0;
        } else {
            parcel.writeInt(1);
            BooleanValue = bool.booleanValue();
        }
        parcel.writeInt(BooleanValue);
        parcel.writeString(this.affiliateSchema);
    }

    public final String getAffiliateSchema() {
        return this.affiliateSchema;
    }

    public final String getChainKey() {
        return this.chainKey;
    }

    public final Boolean getNeedCards() {
        return this.needCards;
    }

    public final String getSchema() {
        return this.schema;
    }

    public GenPageLinkChainKeyData(String str, String str2, Boolean bool, String str3) {
        this.chainKey = str;
        this.schema = str2;
        this.needCards = bool;
        this.affiliateSchema = str3;
    }
}
