package com.ss.android.ugc.aweme.ecommerce.base.sku.sea.view.bannerlayout;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.CountdownUiTypeConfig;
import com.ss.android.ugc.aweme.ecommerce.base.sku.sea.view.bannerlayout.SeaBannerCountDown;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.CustomColor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class SeaBannerCountDown implements Parcelable {

    @C09CT("color")
    public CustomColor color;

    @C09CT("countdown_configs")
    public List<CountdownUiTypeConfig> countdownConfigs;

    @C09CT("end_toast")
    public String endToast;

    @C09CT("target_time")
    public Long targetTime;
    public static final Parcelable.Creator<SeaBannerCountDown> CREATOR = new Parcelable.Creator<SeaBannerCountDown>() { // from class: X.02lj
        @Override // android.os.Parcelable.Creator
        public final SeaBannerCountDown createFromParcel(Parcel parcel) {
            Long lValueOf;
            ArrayList arrayList = null;
            if (parcel.readInt() == 0) {
                lValueOf = null;
            } else {
                lValueOf = Long.valueOf(parcel.readLong());
            }
            CustomColor customColor = (CustomColor) parcel.readParcelable(SeaBannerCountDown.class.getClassLoader());
            if (parcel.readInt() != 0) {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(CountdownUiTypeConfig.CREATOR.createFromParcel(parcel));
                }
            }
            return new SeaBannerCountDown(lValueOf, customColor, arrayList, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final SeaBannerCountDown[] newArray(int i) {
            return new SeaBannerCountDown[i];
        }
    };
    public static final int $stable = 8;

    public SeaBannerCountDown() {
        this(null, null, null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SeaBannerCountDown)) {
            return false;
        }
        SeaBannerCountDown seaBannerCountDown = (SeaBannerCountDown) obj;
        return Intrinsics.LJFF(this.targetTime, seaBannerCountDown.targetTime) && Intrinsics.LJFF(this.color, seaBannerCountDown.color) && Intrinsics.LJFF(this.countdownConfigs, seaBannerCountDown.countdownConfigs) && Intrinsics.LJFF(this.endToast, seaBannerCountDown.endToast);
    }

    public final int hashCode() {
        Long l = this.targetTime;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        CustomColor customColor = this.color;
        int iHashCode2 = (iHashCode + (customColor == null ? 0 : customColor.hashCode())) * 31;
        List<CountdownUiTypeConfig> list = this.countdownConfigs;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.endToast;
        return iHashCode3 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SeaBannerCountDown(targetTime=");
        sbLIZ.append(this.targetTime);
        sbLIZ.append(", color=");
        sbLIZ.append(this.color);
        sbLIZ.append(", countdownConfigs=");
        sbLIZ.append(this.countdownConfigs);
        sbLIZ.append(", endToast=");
        sbLIZ.append(this.endToast);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Long l = this.targetTime;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        parcel.writeParcelable(this.color, i);
        List<CountdownUiTypeConfig> list = this.countdownConfigs;
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
        parcel.writeString(this.endToast);
    }

    public SeaBannerCountDown(Long l, CustomColor customColor, List<CountdownUiTypeConfig> list, String str) {
        this.targetTime = l;
        this.color = customColor;
        this.countdownConfigs = list;
        this.endToast = str;
    }
}
