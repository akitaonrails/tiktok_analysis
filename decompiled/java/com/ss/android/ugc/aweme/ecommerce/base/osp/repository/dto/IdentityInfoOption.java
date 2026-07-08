package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.IdentityInfoOption;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class IdentityInfoOption implements Serializable, Parcelable {

    @C09CT("encrypt_cpf_info")
    public String encryptCpfInfo;

    @C09CT("hint")
    public String hint;

    @C09CT("name")
    public String name;

    @C09CT("type")
    public Integer type;

    @C09CT("value")
    public String value;
    public static final Parcelable.Creator<IdentityInfoOption> CREATOR = new Parcelable.Creator<IdentityInfoOption>() { // from class: X.02wL
        @Override // android.os.Parcelable.Creator
        public final IdentityInfoOption createFromParcel(Parcel parcel) {
            Integer numValueOf;
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            return new IdentityInfoOption(numValueOf, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final IdentityInfoOption[] newArray(int i) {
            return new IdentityInfoOption[i];
        }
    };
    public static final int $stable = 8;

    public IdentityInfoOption() {
    }

    public final IdentityInfoOption copy(Integer num, String str, String str2, String str3, String str4) {
        return new IdentityInfoOption(num, str, str2, str3, str4);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IdentityInfoOption)) {
            return false;
        }
        IdentityInfoOption identityInfoOption = (IdentityInfoOption) obj;
        return Intrinsics.LJFF(this.type, identityInfoOption.type) && Intrinsics.LJFF(this.name, identityInfoOption.name) && Intrinsics.LJFF(this.value, identityInfoOption.value) && Intrinsics.LJFF(this.hint, identityInfoOption.hint) && Intrinsics.LJFF(this.encryptCpfInfo, identityInfoOption.encryptCpfInfo);
    }

    public int hashCode() {
        Integer num = this.type;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.name;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.value;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.hint;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.encryptCpfInfo;
        return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("IdentityInfoOption(type=");
        sbLIZ.append(this.type);
        sbLIZ.append(", name=");
        sbLIZ.append(this.name);
        sbLIZ.append(", value=");
        sbLIZ.append(this.value);
        sbLIZ.append(", hint=");
        sbLIZ.append(this.hint);
        sbLIZ.append(", encryptCpfInfo=");
        sbLIZ.append(this.encryptCpfInfo);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iIntValue;
        Integer num = this.type;
        if (num == null) {
            iIntValue = 0;
        } else {
            parcel.writeInt(1);
            iIntValue = num.intValue();
        }
        parcel.writeInt(iIntValue);
        parcel.writeString(this.name);
        parcel.writeString(this.value);
        parcel.writeString(this.hint);
        parcel.writeString(this.encryptCpfInfo);
    }

    public final String getEncryptCpfInfo() {
        return this.encryptCpfInfo;
    }

    public final String getHint() {
        return this.hint;
    }

    public final String getName() {
        return this.name;
    }

    public final Integer getType() {
        return this.type;
    }

    public final String getValue() {
        return this.value;
    }

    public IdentityInfoOption(Integer num, String str, String str2, String str3, String str4) {
        this.type = num;
        this.name = str;
        this.value = str2;
        this.hint = str3;
        this.encryptCpfInfo = str4;
    }
}
