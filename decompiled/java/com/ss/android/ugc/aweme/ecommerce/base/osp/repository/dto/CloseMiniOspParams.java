package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.api.model.ExceptionInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.CloseMiniOspParams;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class CloseMiniOspParams implements Parcelable {

    @C09CT("exception_msg")
    public final ExceptionInfo exceptionMsg;

    @C09CT("is_success")
    public final Boolean isSuccess;

    @C09CT("main_order_id")
    public final List<String> mainOrderId;

    @C09CT("order_fail")
    public final Boolean orderFail;

    @C09CT("osp_scene")
    public final Integer ospScene;

    @C09CT("product_id")
    public final String productId;

    @C09CT("sku_id")
    public final String skuId;
    public static final Parcelable.Creator<CloseMiniOspParams> CREATOR = new Parcelable.Creator<CloseMiniOspParams>() { // from class: X.02qc
        @Override // android.os.Parcelable.Creator
        public final CloseMiniOspParams createFromParcel(Parcel parcel) {
            boolean z;
            Boolean boolValueOf;
            Integer numValueOf;
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            String string = parcel.readString();
            String string2 = parcel.readString();
            boolean z2 = true;
            Boolean boolValueOf2 = null;
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                if (parcel.readInt() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                boolValueOf = Boolean.valueOf(z);
            }
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() != 0) {
                if (parcel.readInt() == 0) {
                    z2 = false;
                }
                boolValueOf2 = Boolean.valueOf(z2);
            }
            return new CloseMiniOspParams(arrayListCreateStringArrayList, string, string2, boolValueOf, numValueOf, boolValueOf2, (ExceptionInfo) parcel.readParcelable(CloseMiniOspParams.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final CloseMiniOspParams[] newArray(int i) {
            return new CloseMiniOspParams[i];
        }
    };
    public static final int $stable = 8;

    public CloseMiniOspParams() {
        this(null, null, null, null, null, null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CloseMiniOspParams)) {
            return false;
        }
        CloseMiniOspParams closeMiniOspParams = (CloseMiniOspParams) obj;
        return Intrinsics.LJFF(this.mainOrderId, closeMiniOspParams.mainOrderId) && Intrinsics.LJFF(this.productId, closeMiniOspParams.productId) && Intrinsics.LJFF(this.skuId, closeMiniOspParams.skuId) && Intrinsics.LJFF(this.isSuccess, closeMiniOspParams.isSuccess) && Intrinsics.LJFF(this.ospScene, closeMiniOspParams.ospScene) && Intrinsics.LJFF(this.orderFail, closeMiniOspParams.orderFail) && Intrinsics.LJFF(this.exceptionMsg, closeMiniOspParams.exceptionMsg);
    }

    public final int hashCode() {
        List<String> list = this.mainOrderId;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.productId;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.skuId;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.isSuccess;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num = this.ospScene;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool2 = this.orderFail;
        int iHashCode6 = (iHashCode5 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        ExceptionInfo exceptionInfo = this.exceptionMsg;
        return iHashCode6 + (exceptionInfo != null ? exceptionInfo.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CloseMiniOspParams(mainOrderId=");
        sbLIZ.append(this.mainOrderId);
        sbLIZ.append(", productId=");
        sbLIZ.append(this.productId);
        sbLIZ.append(", skuId=");
        sbLIZ.append(this.skuId);
        sbLIZ.append(", isSuccess=");
        sbLIZ.append(this.isSuccess);
        sbLIZ.append(", ospScene=");
        sbLIZ.append(this.ospScene);
        sbLIZ.append(", orderFail=");
        sbLIZ.append(this.orderFail);
        sbLIZ.append(", exceptionMsg=");
        sbLIZ.append(this.exceptionMsg);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.mainOrderId);
        parcel.writeString(this.productId);
        parcel.writeString(this.skuId);
        Boolean bool = this.isSuccess;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Integer num = this.ospScene;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Boolean bool2 = this.orderFail;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        parcel.writeParcelable(this.exceptionMsg, i);
    }

    public CloseMiniOspParams(List<String> list, String str, String str2, Boolean bool, Integer num, Boolean bool2, ExceptionInfo exceptionInfo) {
        this.mainOrderId = list;
        this.productId = str;
        this.skuId = str2;
        this.isSuccess = bool;
        this.ospScene = num;
        this.orderFail = bool2;
        this.exceptionMsg = exceptionInfo;
    }
}
