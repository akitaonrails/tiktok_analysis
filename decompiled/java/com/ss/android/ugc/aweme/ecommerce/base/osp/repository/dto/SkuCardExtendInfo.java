package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.MemberShipInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.SkuCardExtendInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.VasBadgeModule;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.VirtualInfoModule;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class SkuCardExtendInfo implements Parcelable {

    @C09CT("membership_info")
    public MemberShipInfo membershipInfo;

    @C09CT("vas_badge")
    public VasBadgeModule vasBadge;

    @C09CT("virtual_info")
    public VirtualInfoModule virtualInfo;
    public static final Parcelable.Creator<SkuCardExtendInfo> CREATOR = new Parcelable.Creator<SkuCardExtendInfo>() { // from class: X.02iL
        @Override // android.os.Parcelable.Creator
        public final SkuCardExtendInfo createFromParcel(Parcel parcel) {
            VasBadgeModule vasBadgeModuleCreateFromParcel;
            VirtualInfoModule virtualInfoModuleCreateFromParcel;
            MemberShipInfo memberShipInfoCreateFromParcel = null;
            if (parcel.readInt() == 0) {
                vasBadgeModuleCreateFromParcel = null;
            } else {
                vasBadgeModuleCreateFromParcel = VasBadgeModule.CREATOR.createFromParcel(parcel);
            }
            VasBadgeModule vasBadgeModule = vasBadgeModuleCreateFromParcel;
            if (parcel.readInt() == 0) {
                virtualInfoModuleCreateFromParcel = null;
            } else {
                virtualInfoModuleCreateFromParcel = VirtualInfoModule.CREATOR.createFromParcel(parcel);
            }
            VirtualInfoModule virtualInfoModule = virtualInfoModuleCreateFromParcel;
            if (parcel.readInt() != 0) {
                memberShipInfoCreateFromParcel = MemberShipInfo.CREATOR.createFromParcel(parcel);
            }
            return new SkuCardExtendInfo(vasBadgeModule, virtualInfoModule, memberShipInfoCreateFromParcel);
        }

        @Override // android.os.Parcelable.Creator
        public final SkuCardExtendInfo[] newArray(int i) {
            return new SkuCardExtendInfo[i];
        }
    };
    public static final int $stable = 8;

    public SkuCardExtendInfo() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SkuCardExtendInfo)) {
            return false;
        }
        SkuCardExtendInfo skuCardExtendInfo = (SkuCardExtendInfo) obj;
        return Intrinsics.LJFF(this.vasBadge, skuCardExtendInfo.vasBadge) && Intrinsics.LJFF(this.virtualInfo, skuCardExtendInfo.virtualInfo) && Intrinsics.LJFF(this.membershipInfo, skuCardExtendInfo.membershipInfo);
    }

    public final int hashCode() {
        VasBadgeModule vasBadgeModule = this.vasBadge;
        int iHashCode = (vasBadgeModule == null ? 0 : vasBadgeModule.hashCode()) * 31;
        VirtualInfoModule virtualInfoModule = this.virtualInfo;
        int iHashCode2 = (iHashCode + (virtualInfoModule == null ? 0 : virtualInfoModule.hashCode())) * 31;
        MemberShipInfo memberShipInfo = this.membershipInfo;
        return iHashCode2 + (memberShipInfo != null ? memberShipInfo.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SkuCardExtendInfo(vasBadge=");
        sbLIZ.append(this.vasBadge);
        sbLIZ.append(", virtualInfo=");
        sbLIZ.append(this.virtualInfo);
        sbLIZ.append(", membershipInfo=");
        sbLIZ.append(this.membershipInfo);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        VasBadgeModule vasBadgeModule = this.vasBadge;
        if (vasBadgeModule == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            vasBadgeModule.writeToParcel(parcel, i);
        }
        VirtualInfoModule virtualInfoModule = this.virtualInfo;
        if (virtualInfoModule == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            virtualInfoModule.writeToParcel(parcel, i);
        }
        MemberShipInfo memberShipInfo = this.membershipInfo;
        if (memberShipInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            memberShipInfo.writeToParcel(parcel, i);
        }
    }

    public SkuCardExtendInfo(VasBadgeModule vasBadgeModule, VirtualInfoModule virtualInfoModule, MemberShipInfo memberShipInfo) {
        this.vasBadge = vasBadgeModule;
        this.virtualInfo = virtualInfoModule;
        this.membershipInfo = memberShipInfo;
    }
}
