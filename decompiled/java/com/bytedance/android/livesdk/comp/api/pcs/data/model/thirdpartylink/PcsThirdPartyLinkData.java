package com.bytedance.android.livesdk.comp.api.pcs.data.model.thirdpartylink;

import X.C2188811AlT;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.android.livesdk.comp.api.pcs.data.model.thirdpartylink.PcsThirdPartyLinkData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes28.dex */
public final class PcsThirdPartyLinkData implements Parcelable {
    public static final Parcelable.Creator<PcsThirdPartyLinkData> CREATOR = new Parcelable.Creator<PcsThirdPartyLinkData>() { // from class: X.0wSh
        @Override // android.os.Parcelable.Creator
        public final PcsThirdPartyLinkData createFromParcel(Parcel parcel) {
            Long lValueOf;
            boolean z;
            long j = parcel.readLong();
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            if (parcel.readInt() == 0) {
                lValueOf = null;
            } else {
                lValueOf = Long.valueOf(parcel.readLong());
            }
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            return new PcsThirdPartyLinkData(j, string, string2, string3, lValueOf, z);
        }

        @Override // android.os.Parcelable.Creator
        public final PcsThirdPartyLinkData[] newArray(int i) {
            return new PcsThirdPartyLinkData[i];
        }
    };
    public final String anchorId;
    public final boolean isSingleSku;
    public final Long roomId;
    public final String secAnchorId;
    public final String showEntrance;
    public final long skuId;

    /* JADX WARN: Multi-variable type inference failed */
    public PcsThirdPartyLinkData() {
        this(0L, (String) null, (String) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (Long) (0 == true ? 1 : 0), 63);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PcsThirdPartyLinkData)) {
            return false;
        }
        PcsThirdPartyLinkData pcsThirdPartyLinkData = (PcsThirdPartyLinkData) obj;
        return this.skuId == pcsThirdPartyLinkData.skuId && Intrinsics.LJFF(this.showEntrance, pcsThirdPartyLinkData.showEntrance) && Intrinsics.LJFF(this.anchorId, pcsThirdPartyLinkData.anchorId) && Intrinsics.LJFF(this.secAnchorId, pcsThirdPartyLinkData.secAnchorId) && Intrinsics.LJFF(this.roomId, pcsThirdPartyLinkData.roomId) && this.isSingleSku == pcsThirdPartyLinkData.isSingleSku;
    }

    public final int hashCode() {
        int iY2 = ((((((C786410Ut5.Y2(this.skuId) * 31) + this.showEntrance.hashCode()) * 31) + this.anchorId.hashCode()) * 31) + this.secAnchorId.hashCode()) * 31;
        Long l = this.roomId;
        return ((iY2 + (l == null ? 0 : l.hashCode())) * 31) + C786410Ut5.Z2(this.isSingleSku);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PcsThirdPartyLinkData(skuId=");
        sbLIZ.append(this.skuId);
        sbLIZ.append(", showEntrance=");
        sbLIZ.append(this.showEntrance);
        sbLIZ.append(", anchorId=");
        sbLIZ.append(this.anchorId);
        sbLIZ.append(", secAnchorId=");
        sbLIZ.append(this.secAnchorId);
        sbLIZ.append(", roomId=");
        sbLIZ.append(this.roomId);
        sbLIZ.append(", isSingleSku=");
        sbLIZ.append(this.isSingleSku);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.skuId);
        parcel.writeString(this.showEntrance);
        parcel.writeString(this.anchorId);
        parcel.writeString(this.secAnchorId);
        Long l = this.roomId;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        parcel.writeInt(this.isSingleSku ? 1 : 0);
    }

    public /* synthetic */ PcsThirdPartyLinkData(long j, String str, String str2, String str3, Long l, int i) {
        this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2, (i & 8) == 0 ? str3 : "", (i & 16) != 0 ? null : l, false);
    }

    public PcsThirdPartyLinkData(long j, String str, String str2, String str3, Long l, boolean z) {
        this.skuId = j;
        this.showEntrance = str;
        this.anchorId = str2;
        this.secAnchorId = str3;
        this.roomId = l;
        this.isSingleSku = z;
    }
}
