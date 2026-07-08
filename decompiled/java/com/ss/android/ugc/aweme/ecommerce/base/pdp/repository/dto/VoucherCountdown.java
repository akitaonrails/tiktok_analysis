package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.CommonColor;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.CountdownUiTypeConfig;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.VoucherCountdown;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class VoucherCountdown implements Parcelable {

    @C09CT("color")
    public CommonColor countdownColor;

    @C09CT("is_bold")
    public boolean countdownIsBold;

    @C09CT("countdown_configs")
    public List<CountdownUiTypeConfig> countdownUIType;

    @C09CT("end_time")
    public long endTime;

    @C09CT("launch_status")
    public int launchStatus;

    @C09CT("start_time")
    public long startTime;

    @C09CT("text_size")
    public Integer textSize;
    public static final Parcelable.Creator<VoucherCountdown> CREATOR = new Parcelable.Creator<VoucherCountdown>() { // from class: X.02lk
        @Override // android.os.Parcelable.Creator
        public final VoucherCountdown createFromParcel(Parcel parcel) {
            CommonColor commonColorCreateFromParcel;
            boolean z;
            Integer numValueOf;
            int i = parcel.readInt();
            long j = parcel.readLong();
            long j2 = parcel.readLong();
            ArrayList arrayList = null;
            if (parcel.readInt() == 0) {
                commonColorCreateFromParcel = null;
            } else {
                commonColorCreateFromParcel = CommonColor.CREATOR.createFromParcel(parcel);
            }
            CommonColor commonColor = commonColorCreateFromParcel;
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() != 0) {
                int i2 = parcel.readInt();
                arrayList = new ArrayList(i2);
                for (int i3 = 0; i3 != i2; i3++) {
                    arrayList.add(CountdownUiTypeConfig.CREATOR.createFromParcel(parcel));
                }
            }
            return new VoucherCountdown(i, j, j2, commonColor, z, numValueOf, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final VoucherCountdown[] newArray(int i) {
            return new VoucherCountdown[i];
        }
    };
    public static final int $stable = 8;

    public VoucherCountdown() {
        this(0, 0L, 0L, null, false, null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VoucherCountdown)) {
            return false;
        }
        VoucherCountdown voucherCountdown = (VoucherCountdown) obj;
        return this.launchStatus == voucherCountdown.launchStatus && this.startTime == voucherCountdown.startTime && this.endTime == voucherCountdown.endTime && Intrinsics.LJFF(this.countdownColor, voucherCountdown.countdownColor) && this.countdownIsBold == voucherCountdown.countdownIsBold && Intrinsics.LJFF(this.textSize, voucherCountdown.textSize) && Intrinsics.LJFF(this.countdownUIType, voucherCountdown.countdownUIType);
    }

    public final int hashCode() {
        int iY2 = ((((this.launchStatus * 31) + C786410Ut5.Y2(this.startTime)) * 31) + C786410Ut5.Y2(this.endTime)) * 31;
        CommonColor commonColor = this.countdownColor;
        int iHashCode = (((iY2 + (commonColor == null ? 0 : commonColor.hashCode())) * 31) + C786410Ut5.Z2(this.countdownIsBold)) * 31;
        Integer num = this.textSize;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        List<CountdownUiTypeConfig> list = this.countdownUIType;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VoucherCountdown(launchStatus=");
        sbLIZ.append(this.launchStatus);
        sbLIZ.append(", startTime=");
        sbLIZ.append(this.startTime);
        sbLIZ.append(", endTime=");
        sbLIZ.append(this.endTime);
        sbLIZ.append(", countdownColor=");
        sbLIZ.append(this.countdownColor);
        sbLIZ.append(", countdownIsBold=");
        sbLIZ.append(this.countdownIsBold);
        sbLIZ.append(", textSize=");
        sbLIZ.append(this.textSize);
        sbLIZ.append(", countdownUIType=");
        sbLIZ.append(this.countdownUIType);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.launchStatus);
        parcel.writeLong(this.startTime);
        parcel.writeLong(this.endTime);
        CommonColor commonColor = this.countdownColor;
        if (commonColor == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            commonColor.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.countdownIsBold ? 1 : 0);
        Integer num = this.textSize;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        List<CountdownUiTypeConfig> list = this.countdownUIType;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(list.size());
        Iterator<CountdownUiTypeConfig> it2 = list.iterator();
        while (it2.hasNext()) {
            it2.next().writeToParcel(parcel, i);
        }
    }

    public VoucherCountdown(int i, long j, long j2, CommonColor commonColor, boolean z, Integer num, List<CountdownUiTypeConfig> list) {
        this.launchStatus = i;
        this.startTime = j;
        this.endTime = j2;
        this.countdownColor = commonColor;
        this.countdownIsBold = z;
        this.textSize = num;
        this.countdownUIType = list;
    }
}
