package com.ss.android.ugc.aweme.ecommerce.base.pdp.view.price;

import X.C2188811AlT;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.RangePrice;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SinglePriceItem;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.view.price.PriceType;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public abstract class PriceType implements Parcelable {
    public static final int $stable = 0;

    public static final class Range extends PriceType {
        public final RangePrice data;
        public final boolean hideOriginPrice;
        public final boolean showDiscountInfo;
        public static final Parcelable.Creator<Range> CREATOR = new Parcelable.Creator<Range>() { // from class: X.03zP
            @Override // android.os.Parcelable.Creator
            public final PriceType.Range createFromParcel(Parcel parcel) {
                boolean z;
                RangePrice rangePriceCreateFromParcel = RangePrice.CREATOR.createFromParcel(parcel);
                boolean z2 = true;
                if (parcel.readInt() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (parcel.readInt() == 0) {
                    z2 = false;
                }
                return new PriceType.Range(rangePriceCreateFromParcel, z, z2);
            }

            @Override // android.os.Parcelable.Creator
            public final PriceType.Range[] newArray(int i) {
                return new PriceType.Range[i];
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
            if (!(obj instanceof Range)) {
                return false;
            }
            Range range = (Range) obj;
            return Intrinsics.LJFF(this.data, range.data) && this.showDiscountInfo == range.showDiscountInfo && this.hideOriginPrice == range.hideOriginPrice;
        }

        public final int hashCode() {
            return (((this.data.hashCode() * 31) + C786410Ut5.Z2(this.showDiscountInfo)) * 31) + C786410Ut5.Z2(this.hideOriginPrice);
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Range(data=");
            sbLIZ.append(this.data);
            sbLIZ.append(", showDiscountInfo=");
            sbLIZ.append(this.showDiscountInfo);
            sbLIZ.append(", hideOriginPrice=");
            sbLIZ.append(this.hideOriginPrice);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.data.writeToParcel(parcel, i);
            parcel.writeInt(this.showDiscountInfo ? 1 : 0);
            parcel.writeInt(this.hideOriginPrice ? 1 : 0);
        }

        public Range(RangePrice rangePrice, boolean z, boolean z2) {
            this.data = rangePrice;
            this.showDiscountInfo = z;
            this.hideOriginPrice = z2;
        }
    }

    public static final class Single extends PriceType {
        public final SinglePriceItem data;
        public final boolean hideOriginPrice;
        public final boolean showDiscountInfo;
        public static final Parcelable.Creator<Single> CREATOR = new Parcelable.Creator<Single>() { // from class: X.03zS
            @Override // android.os.Parcelable.Creator
            public final PriceType.Single createFromParcel(Parcel parcel) {
                boolean z;
                SinglePriceItem singlePriceItemCreateFromParcel = SinglePriceItem.CREATOR.createFromParcel(parcel);
                boolean z2 = true;
                if (parcel.readInt() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (parcel.readInt() == 0) {
                    z2 = false;
                }
                return new PriceType.Single(singlePriceItemCreateFromParcel, z, z2);
            }

            @Override // android.os.Parcelable.Creator
            public final PriceType.Single[] newArray(int i) {
                return new PriceType.Single[i];
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
            if (!(obj instanceof Single)) {
                return false;
            }
            Single single = (Single) obj;
            return Intrinsics.LJFF(this.data, single.data) && this.showDiscountInfo == single.showDiscountInfo && this.hideOriginPrice == single.hideOriginPrice;
        }

        public final int hashCode() {
            return (((this.data.hashCode() * 31) + C786410Ut5.Z2(this.showDiscountInfo)) * 31) + C786410Ut5.Z2(this.hideOriginPrice);
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Single(data=");
            sbLIZ.append(this.data);
            sbLIZ.append(", showDiscountInfo=");
            sbLIZ.append(this.showDiscountInfo);
            sbLIZ.append(", hideOriginPrice=");
            sbLIZ.append(this.hideOriginPrice);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.data.writeToParcel(parcel, i);
            parcel.writeInt(this.showDiscountInfo ? 1 : 0);
            parcel.writeInt(this.hideOriginPrice ? 1 : 0);
        }

        public Single(SinglePriceItem singlePriceItem, boolean z, boolean z2) {
            this.data = singlePriceItem;
            this.showDiscountInfo = z;
            this.hideOriginPrice = z2;
        }
    }
}
