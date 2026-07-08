package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.AgreementConfiguration;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class AgreementConfiguration implements Parcelable {

    @C09CT("locale")
    public final String locale;
    public static final Parcelable.Creator<AgreementConfiguration> CREATOR = new Parcelable.Creator<AgreementConfiguration>() { // from class: X.03jv
        @Override // android.os.Parcelable.Creator
        public final AgreementConfiguration createFromParcel(Parcel parcel) {
            return new AgreementConfiguration(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AgreementConfiguration[] newArray(int i) {
            return new AgreementConfiguration[i];
        }
    };
    public static final int $stable = 8;

    public AgreementConfiguration() {
        this(null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AgreementConfiguration) && Intrinsics.LJFF(this.locale, ((AgreementConfiguration) obj).locale);
    }

    public final int hashCode() {
        String str = this.locale;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AgreementConfiguration(locale=");
        sbLIZ.append(this.locale);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.locale);
    }

    public AgreementConfiguration(String str) {
        this.locale = str;
    }
}
