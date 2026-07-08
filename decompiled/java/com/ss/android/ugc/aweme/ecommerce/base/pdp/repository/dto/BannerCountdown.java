package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.CommonColor;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BannerCountdown;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.CountdownUiTypeConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class BannerCountdown implements Parcelable {

    @C09CT("color")
    public final CommonColor countdownColor;

    @C09CT("is_bold")
    public final boolean countdownIsBold;

    @C09CT("countdown_configs")
    public final List<CountdownUiTypeConfig> countdownUIType;

    @C09CT("end_time")
    public final long endTime;

    @C09CT("end_time_ms")
    public final Long endTimeMs;

    @C09CT("launch_status")
    public final int launchStatus;

    @C09CT("start_time")
    public final long startTime;

    @C09CT("start_time_ms")
    public final Long startTimeMs;
    public static final Parcelable.Creator<BannerCountdown> CREATOR = new Parcelable.Creator<BannerCountdown>() { // from class: X.02s3
        @Override // android.os.Parcelable.Creator
        public final BannerCountdown createFromParcel(Parcel parcel) {
            CommonColor commonColorCreateFromParcel;
            boolean z;
            ArrayList arrayList;
            Long lValueOf;
            int i = parcel.readInt();
            long j = parcel.readLong();
            long j2 = parcel.readLong();
            Long lValueOf2 = null;
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
                arrayList = null;
            } else {
                int i2 = parcel.readInt();
                arrayList = new ArrayList(i2);
                for (int i3 = 0; i3 != i2; i3++) {
                    arrayList.add(CountdownUiTypeConfig.CREATOR.createFromParcel(parcel));
                }
            }
            if (parcel.readInt() == 0) {
                lValueOf = null;
            } else {
                lValueOf = Long.valueOf(parcel.readLong());
            }
            if (parcel.readInt() != 0) {
                lValueOf2 = Long.valueOf(parcel.readLong());
            }
            return new BannerCountdown(i, j, j2, commonColor, z, arrayList, lValueOf, lValueOf2);
        }

        @Override // android.os.Parcelable.Creator
        public final BannerCountdown[] newArray(int i) {
            return new BannerCountdown[i];
        }
    };
    public static final int $stable = 8;

    public BannerCountdown() {
        this(0, 0L, 0L, null, false, null, null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BannerCountdown)) {
            return false;
        }
        BannerCountdown bannerCountdown = (BannerCountdown) obj;
        return this.launchStatus == bannerCountdown.launchStatus && this.startTime == bannerCountdown.startTime && this.endTime == bannerCountdown.endTime && Intrinsics.LJFF(this.countdownColor, bannerCountdown.countdownColor) && this.countdownIsBold == bannerCountdown.countdownIsBold && Intrinsics.LJFF(this.countdownUIType, bannerCountdown.countdownUIType) && Intrinsics.LJFF(this.startTimeMs, bannerCountdown.startTimeMs) && Intrinsics.LJFF(this.endTimeMs, bannerCountdown.endTimeMs);
    }

    public final int hashCode() {
        int iY2 = ((((this.launchStatus * 31) + C786410Ut5.Y2(this.startTime)) * 31) + C786410Ut5.Y2(this.endTime)) * 31;
        CommonColor commonColor = this.countdownColor;
        int iHashCode = (((iY2 + (commonColor == null ? 0 : commonColor.hashCode())) * 31) + C786410Ut5.Z2(this.countdownIsBold)) * 31;
        List<CountdownUiTypeConfig> list = this.countdownUIType;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        Long l = this.startTimeMs;
        int iHashCode3 = (iHashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.endTimeMs;
        return iHashCode3 + (l2 != null ? l2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BannerCountdown(launchStatus=");
        sbLIZ.append(this.launchStatus);
        sbLIZ.append(", startTime=");
        sbLIZ.append(this.startTime);
        sbLIZ.append(", endTime=");
        sbLIZ.append(this.endTime);
        sbLIZ.append(", countdownColor=");
        sbLIZ.append(this.countdownColor);
        sbLIZ.append(", countdownIsBold=");
        sbLIZ.append(this.countdownIsBold);
        sbLIZ.append(", countdownUIType=");
        sbLIZ.append(this.countdownUIType);
        sbLIZ.append(", startTimeMs=");
        sbLIZ.append(this.startTimeMs);
        sbLIZ.append(", endTimeMs=");
        sbLIZ.append(this.endTimeMs);
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
        List<CountdownUiTypeConfig> list = this.countdownUIType;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<CountdownUiTypeConfig> it2 = list.iterator();
            while (it2.hasNext()) {
                it2.next().writeToParcel(parcel, i);
            }
        }
        Long l = this.startTimeMs;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        Long l2 = this.endTimeMs;
        if (l2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l2.longValue());
        }
    }

    public BannerCountdown(int i, long j, long j2, CommonColor commonColor, boolean z, List<CountdownUiTypeConfig> list, Long l, Long l2) {
        this.launchStatus = i;
        this.startTime = j;
        this.endTime = j2;
        this.countdownColor = commonColor;
        this.countdownIsBold = z;
        this.countdownUIType = list;
        this.startTimeMs = l;
        this.endTimeMs = l2;
    }
}
