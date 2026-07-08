package com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.promotion.pcc.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.promotion.pcc.dto.PdpComponent;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.promotion.pcc.dto.PdpComponentAction;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class PdpComponent implements Parcelable {

    @C09CT("action")
    public final PdpComponentAction action;

    @C09CT("biz_type")
    public final Integer bizType;

    @C09CT("component_type")
    public final Integer componentType;

    @C09CT("da_info")
    public final String daInfo;

    @C09CT("data")
    public final String data;
    public static final Parcelable.Creator<PdpComponent> CREATOR = new Parcelable.Creator<PdpComponent>() { // from class: X.0vtW
        @Override // android.os.Parcelable.Creator
        public final PdpComponent createFromParcel(Parcel parcel) {
            Integer numValueOf;
            Integer numValueOf2;
            PdpComponentAction pdpComponentActionCreateFromParcel = null;
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                numValueOf2 = null;
            } else {
                numValueOf2 = Integer.valueOf(parcel.readInt());
            }
            String string2 = parcel.readString();
            if (parcel.readInt() != 0) {
                pdpComponentActionCreateFromParcel = PdpComponentAction.CREATOR.createFromParcel(parcel);
            }
            return new PdpComponent(numValueOf, string, numValueOf2, string2, pdpComponentActionCreateFromParcel);
        }

        @Override // android.os.Parcelable.Creator
        public final PdpComponent[] newArray(int i) {
            return new PdpComponent[i];
        }
    };
    public static final int $stable = 8;

    public PdpComponent() {
        this(null, null, null, null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PdpComponent)) {
            return false;
        }
        PdpComponent pdpComponent = (PdpComponent) obj;
        return Intrinsics.LJFF(this.componentType, pdpComponent.componentType) && Intrinsics.LJFF(this.data, pdpComponent.data) && Intrinsics.LJFF(this.bizType, pdpComponent.bizType) && Intrinsics.LJFF(this.daInfo, pdpComponent.daInfo) && Intrinsics.LJFF(this.action, pdpComponent.action);
    }

    public final int hashCode() {
        Integer num = this.componentType;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.data;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num2 = this.bizType;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str2 = this.daInfo;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        PdpComponentAction pdpComponentAction = this.action;
        return iHashCode4 + (pdpComponentAction != null ? pdpComponentAction.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PdpComponent(componentType=");
        sbLIZ.append(this.componentType);
        sbLIZ.append(", data=");
        sbLIZ.append(this.data);
        sbLIZ.append(", bizType=");
        sbLIZ.append(this.bizType);
        sbLIZ.append(", daInfo=");
        sbLIZ.append(this.daInfo);
        sbLIZ.append(", action=");
        sbLIZ.append(this.action);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Integer num = this.componentType;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeString(this.data);
        Integer num2 = this.bizType;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        parcel.writeString(this.daInfo);
        PdpComponentAction pdpComponentAction = this.action;
        if (pdpComponentAction == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            pdpComponentAction.writeToParcel(parcel, i);
        }
    }

    public PdpComponent(Integer num, String str, Integer num2, String str2, PdpComponentAction pdpComponentAction) {
        this.componentType = num;
        this.data = str;
        this.bizType = num2;
        this.daInfo = str2;
        this.action = pdpComponentAction;
    }
}
