package com.ss.android.ugc.aweme.ecommerce.showcase.service.vo;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.showcase.service.vo.StoreRegVisitorTag;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class StoreRegVisitorTag implements Parcelable {
    public static final Parcelable.Creator<StoreRegVisitorTag> CREATOR = new Parcelable.Creator<StoreRegVisitorTag>() { // from class: X.02UI
        @Override // android.os.Parcelable.Creator
        public final StoreRegVisitorTag createFromParcel(Parcel parcel) {
            Integer numValueOf;
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            return new StoreRegVisitorTag(numValueOf, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final StoreRegVisitorTag[] newArray(int i) {
            return new StoreRegVisitorTag[i];
        }
    };

    @C09CT("fmt_visitor_count")
    public String fmt_visitor_count;

    @C09CT("visitor_count")
    public Integer visitor_count;

    public StoreRegVisitorTag() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoreRegVisitorTag)) {
            return false;
        }
        StoreRegVisitorTag storeRegVisitorTag = (StoreRegVisitorTag) obj;
        return Intrinsics.LJFF(this.visitor_count, storeRegVisitorTag.visitor_count) && Intrinsics.LJFF(this.fmt_visitor_count, storeRegVisitorTag.fmt_visitor_count);
    }

    public final int hashCode() {
        Integer num = this.visitor_count;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.fmt_visitor_count;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StoreRegVisitorTag(visitor_count=");
        sbLIZ.append(this.visitor_count);
        sbLIZ.append(", fmt_visitor_count=");
        sbLIZ.append(this.fmt_visitor_count);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iIntValue;
        Integer num = this.visitor_count;
        if (num == null) {
            iIntValue = 0;
        } else {
            parcel.writeInt(1);
            iIntValue = num.intValue();
        }
        parcel.writeInt(iIntValue);
        parcel.writeString(this.fmt_visitor_count);
    }

    public StoreRegVisitorTag(Integer num, String str) {
        this.visitor_count = num;
        this.fmt_visitor_count = str;
    }
}
