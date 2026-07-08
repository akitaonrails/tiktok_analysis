package com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.model;

import X.C09CT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.model.AddressBase;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class AddressBase implements Parcelable, Serializable {

    @C09CT("extra")
    public String extra;

    @C09CT("gen_id_l0")
    public Long genIdL0;

    @C09CT("gen_id_l1")
    public Long genIdL1;

    @C09CT("gen_id_l2")
    public Long genIdL2;

    @C09CT("gen_id_l3")
    public Long genIdL3;

    @C09CT("gen_id_l4")
    public Long genIdL4;

    @C09CT("gen_name_l0")
    public String genNameL0;

    @C09CT("gen_name_l1")
    public String genNameL1;

    @C09CT("gen_name_l2")
    public String genNameL2;

    @C09CT("gen_name_l3")
    public String genNameL3;

    @C09CT("gen_name_l4")
    public String genNameL4;

    @C09CT("postcode")
    public String postCode;

    @C09CT("postcode_id")
    public Long postCodeId;

    @C09CT("post_town")
    public String postTown;

    @C09CT("post_town_id")
    public Long postTownId;
    public static final Parcelable.Creator<AddressBase> CREATOR = new Parcelable.Creator<AddressBase>() { // from class: X.02Ho
        @Override // android.os.Parcelable.Creator
        public final AddressBase createFromParcel(Parcel parcel) {
            Long lValueOf;
            Long lValueOf2;
            Long lValueOf3;
            Long lValueOf4;
            Long lValueOf5;
            Long lValueOf6;
            Long lValueOf7 = null;
            if (parcel.readInt() == 0) {
                lValueOf = null;
            } else {
                lValueOf = Long.valueOf(parcel.readLong());
            }
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                lValueOf2 = null;
            } else {
                lValueOf2 = Long.valueOf(parcel.readLong());
            }
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                lValueOf3 = null;
            } else {
                lValueOf3 = Long.valueOf(parcel.readLong());
            }
            String string3 = parcel.readString();
            if (parcel.readInt() == 0) {
                lValueOf4 = null;
            } else {
                lValueOf4 = Long.valueOf(parcel.readLong());
            }
            String string4 = parcel.readString();
            if (parcel.readInt() == 0) {
                lValueOf5 = null;
            } else {
                lValueOf5 = Long.valueOf(parcel.readLong());
            }
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            if (parcel.readInt() == 0) {
                lValueOf6 = null;
            } else {
                lValueOf6 = Long.valueOf(parcel.readLong());
            }
            String string7 = parcel.readString();
            if (parcel.readInt() != 0) {
                lValueOf7 = Long.valueOf(parcel.readLong());
            }
            return new AddressBase(lValueOf, string, lValueOf2, string2, lValueOf3, string3, lValueOf4, string4, lValueOf5, string5, string6, lValueOf6, string7, lValueOf7, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AddressBase[] newArray(int i) {
            return new AddressBase[i];
        }
    };
    public static final int $stable = 8;

    public AddressBase() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
    }

    public final AddressBase copy(Long l, String str, Long l2, String str2, Long l3, String str3, Long l4, String str4, Long l5, String str5, String str6, Long l6, String str7, Long l7, String str8) {
        return new AddressBase(l, str, l2, str2, l3, str3, l4, str4, l5, str5, str6, l6, str7, l7, str8);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AddressBase)) {
            return false;
        }
        AddressBase addressBase = (AddressBase) obj;
        return Intrinsics.LJFF(this.genIdL0, addressBase.genIdL0) && Intrinsics.LJFF(this.genNameL0, addressBase.genNameL0) && Intrinsics.LJFF(this.genIdL1, addressBase.genIdL1) && Intrinsics.LJFF(this.genNameL1, addressBase.genNameL1) && Intrinsics.LJFF(this.genIdL2, addressBase.genIdL2) && Intrinsics.LJFF(this.genNameL2, addressBase.genNameL2) && Intrinsics.LJFF(this.genIdL3, addressBase.genIdL3) && Intrinsics.LJFF(this.genNameL3, addressBase.genNameL3) && Intrinsics.LJFF(this.genIdL4, addressBase.genIdL4) && Intrinsics.LJFF(this.genNameL4, addressBase.genNameL4) && Intrinsics.LJFF(this.postCode, addressBase.postCode) && Intrinsics.LJFF(this.postCodeId, addressBase.postCodeId) && Intrinsics.LJFF(this.postTown, addressBase.postTown) && Intrinsics.LJFF(this.postTownId, addressBase.postTownId) && Intrinsics.LJFF(this.extra, addressBase.extra);
    }

    public int hashCode() {
        Long l = this.genIdL0;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.genNameL0;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Long l2 = this.genIdL1;
        int iHashCode3 = (iHashCode2 + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str2 = this.genNameL1;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l3 = this.genIdL2;
        int iHashCode5 = (iHashCode4 + (l3 == null ? 0 : l3.hashCode())) * 31;
        String str3 = this.genNameL2;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l4 = this.genIdL3;
        int iHashCode7 = (iHashCode6 + (l4 == null ? 0 : l4.hashCode())) * 31;
        String str4 = this.genNameL3;
        int iHashCode8 = (iHashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Long l5 = this.genIdL4;
        int iHashCode9 = (iHashCode8 + (l5 == null ? 0 : l5.hashCode())) * 31;
        String str5 = this.genNameL4;
        int iHashCode10 = (iHashCode9 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.postCode;
        int iHashCode11 = (iHashCode10 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Long l6 = this.postCodeId;
        int iHashCode12 = (iHashCode11 + (l6 == null ? 0 : l6.hashCode())) * 31;
        String str7 = this.postTown;
        int iHashCode13 = (iHashCode12 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Long l7 = this.postTownId;
        int iHashCode14 = (iHashCode13 + (l7 == null ? 0 : l7.hashCode())) * 31;
        String str8 = this.extra;
        return iHashCode14 + (str8 != null ? str8.hashCode() : 0);
    }

    public String toString() {
        return "AddressBase(genIdL0=" + this.genIdL0 + ", genNameL0=" + this.genNameL0 + ", genIdL1=" + this.genIdL1 + ", genNameL1=" + this.genNameL1 + ", genIdL2=" + this.genIdL2 + ", genNameL2=" + this.genNameL2 + ", genIdL3=" + this.genIdL3 + ", genNameL3=" + this.genNameL3 + ", genIdL4=" + this.genIdL4 + ", genNameL4=" + this.genNameL4 + ", postCode=" + this.postCode + ", postCodeId=" + this.postCodeId + ", postTown=" + this.postTown + ", postTownId=" + this.postTownId + ", extra=" + this.extra + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Long l = this.genIdL0;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        parcel.writeString(this.genNameL0);
        Long l2 = this.genIdL1;
        if (l2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l2.longValue());
        }
        parcel.writeString(this.genNameL1);
        Long l3 = this.genIdL2;
        if (l3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l3.longValue());
        }
        parcel.writeString(this.genNameL2);
        Long l4 = this.genIdL3;
        if (l4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l4.longValue());
        }
        parcel.writeString(this.genNameL3);
        Long l5 = this.genIdL4;
        if (l5 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l5.longValue());
        }
        parcel.writeString(this.genNameL4);
        parcel.writeString(this.postCode);
        Long l6 = this.postCodeId;
        if (l6 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l6.longValue());
        }
        parcel.writeString(this.postTown);
        Long l7 = this.postTownId;
        if (l7 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l7.longValue());
        }
        parcel.writeString(this.extra);
    }

    public final String getExtra() {
        return this.extra;
    }

    public final Long getGenIdL0() {
        return this.genIdL0;
    }

    public final Long getGenIdL1() {
        return this.genIdL1;
    }

    public final Long getGenIdL2() {
        return this.genIdL2;
    }

    public final Long getGenIdL3() {
        return this.genIdL3;
    }

    public final Long getGenIdL4() {
        return this.genIdL4;
    }

    public final String getGenNameL0() {
        return this.genNameL0;
    }

    public final String getGenNameL1() {
        return this.genNameL1;
    }

    public final String getGenNameL2() {
        return this.genNameL2;
    }

    public final String getGenNameL3() {
        return this.genNameL3;
    }

    public final String getGenNameL4() {
        return this.genNameL4;
    }

    public final String getPostCode() {
        return this.postCode;
    }

    public final Long getPostCodeId() {
        return this.postCodeId;
    }

    public final String getPostTown() {
        return this.postTown;
    }

    public final Long getPostTownId() {
        return this.postTownId;
    }

    public AddressBase(Long l, String str, Long l2, String str2, Long l3, String str3, Long l4, String str4, Long l5, String str5, String str6, Long l6, String str7, Long l7, String str8) {
        this.genIdL0 = l;
        this.genNameL0 = str;
        this.genIdL1 = l2;
        this.genNameL1 = str2;
        this.genIdL2 = l3;
        this.genNameL2 = str3;
        this.genIdL3 = l4;
        this.genNameL3 = str4;
        this.genIdL4 = l5;
        this.genNameL4 = str5;
        this.postCode = str6;
        this.postCodeId = l6;
        this.postTown = str7;
        this.postTownId = l7;
        this.extra = str8;
    }
}
