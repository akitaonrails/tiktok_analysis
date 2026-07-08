package com.ss.android.ugc.aweme.aigc.asynctask.net;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.aigc.asynctask.net.QuotaResponItem;
import com.ss.android.ugc.aweme.aigc.asynctask.net.Scope;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class QuotaResponItem implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<QuotaResponItem> CREATOR = new Parcelable.Creator<QuotaResponItem>() { // from class: X.0LuX
        @Override // android.os.Parcelable.Creator
        public final QuotaResponItem createFromParcel(Parcel parcel) {
            Scope scopeCreateFromParcel;
            Integer numValueOf;
            Integer numValueOf2 = null;
            if (parcel.readInt() == 0) {
                scopeCreateFromParcel = null;
            } else {
                scopeCreateFromParcel = Scope.CREATOR.createFromParcel(parcel);
            }
            Scope scope = scopeCreateFromParcel;
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() != 0) {
                numValueOf2 = Integer.valueOf(parcel.readInt());
            }
            return new QuotaResponItem(scope, string, numValueOf, numValueOf2, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final QuotaResponItem[] newArray(int i) {
            return new QuotaResponItem[i];
        }
    };

    @C09CT("extra")
    public final String extra;

    @C09CT("quota_remain")
    public final Integer quotaRemain;

    @C09CT("quota_total")
    public final Integer quotaTotal;

    @C09CT("req_key")
    public final String reqKey;

    @C09CT("scope")
    public final Scope scope;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QuotaResponItem)) {
            return false;
        }
        QuotaResponItem quotaResponItem = (QuotaResponItem) obj;
        return Intrinsics.LJFF(this.scope, quotaResponItem.scope) && Intrinsics.LJFF(this.reqKey, quotaResponItem.reqKey) && Intrinsics.LJFF(this.quotaRemain, quotaResponItem.quotaRemain) && Intrinsics.LJFF(this.quotaTotal, quotaResponItem.quotaTotal) && Intrinsics.LJFF(this.extra, quotaResponItem.extra);
    }

    public final int hashCode() {
        Scope scope = this.scope;
        int iHashCode = (scope == null ? 0 : scope.hashCode()) * 31;
        String str = this.reqKey;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.quotaRemain;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.quotaTotal;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str2 = this.extra;
        return iHashCode4 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("QuotaResponItem(scope=");
        sbLIZ.append(this.scope);
        sbLIZ.append(", reqKey=");
        sbLIZ.append(this.reqKey);
        sbLIZ.append(", quotaRemain=");
        sbLIZ.append(this.quotaRemain);
        sbLIZ.append(", quotaTotal=");
        sbLIZ.append(this.quotaTotal);
        sbLIZ.append(", extra=");
        sbLIZ.append(this.extra);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Scope scope = this.scope;
        if (scope == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            scope.writeToParcel(parcel, i);
        }
        parcel.writeString(this.reqKey);
        Integer num = this.quotaRemain;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Integer num2 = this.quotaTotal;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        parcel.writeString(this.extra);
    }

    public QuotaResponItem(Scope scope, String str, Integer num, Integer num2, String str2) {
        this.scope = scope;
        this.reqKey = str;
        this.quotaRemain = num;
        this.quotaTotal = num2;
        this.extra = str2;
    }
}
