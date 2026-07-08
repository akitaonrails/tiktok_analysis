package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.AiAssistant;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class AiAssistant implements Parcelable {

    @C09CT("da_info")
    public final String daInfo;

    @C09CT("icon")
    public final Icon icon;

    @C09CT("schema")
    public final String schema;
    public static final Parcelable.Creator<AiAssistant> CREATOR = new Parcelable.Creator<AiAssistant>() { // from class: X.03yw
        @Override // android.os.Parcelable.Creator
        public final AiAssistant createFromParcel(Parcel parcel) {
            return new AiAssistant(parcel.readString(), (Icon) parcel.readParcelable(AiAssistant.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AiAssistant[] newArray(int i) {
            return new AiAssistant[i];
        }
    };
    public static final int $stable = 8;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AiAssistant)) {
            return false;
        }
        AiAssistant aiAssistant = (AiAssistant) obj;
        return Intrinsics.LJFF(this.schema, aiAssistant.schema) && Intrinsics.LJFF(this.icon, aiAssistant.icon) && Intrinsics.LJFF(this.daInfo, aiAssistant.daInfo);
    }

    public final int hashCode() {
        String str = this.schema;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Icon icon = this.icon;
        int iHashCode2 = (iHashCode + (icon == null ? 0 : icon.hashCode())) * 31;
        String str2 = this.daInfo;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AiAssistant(schema=");
        sbLIZ.append(this.schema);
        sbLIZ.append(", icon=");
        sbLIZ.append(this.icon);
        sbLIZ.append(", daInfo=");
        sbLIZ.append(this.daInfo);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.schema);
        parcel.writeParcelable(this.icon, i);
        parcel.writeString(this.daInfo);
    }

    public AiAssistant(String str, Icon icon, String str2) {
        this.schema = str;
        this.icon = icon;
        this.daInfo = str2;
    }
}
