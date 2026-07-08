package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto;

import X.C098200Yq;
import X.C09CT;
import X.C189200o6;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.DiscountInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InterestFeePromotion;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class InterestFeePromotion implements Parcelable {

    @C09CT("da_info")
    public String daInfo;

    @C09CT("interest_fee_promotion_desc")
    public String desc;

    @C09CT("discount_info_list")
    public List<DiscountInfo> discountInfoList;

    @C09CT("interest_fee_promotion_link")
    public String link;

    @C09CT("interest_fee_promotion_desc_selected")
    public String selectedDesc;
    public static final Parcelable.Creator<InterestFeePromotion> CREATOR = new Parcelable.Creator<InterestFeePromotion>() { // from class: X.02pe
        @Override // android.os.Parcelable.Creator
        public final InterestFeePromotion createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(DiscountInfo.CREATOR.createFromParcel(parcel));
                }
            }
            return new InterestFeePromotion(string, string2, string3, arrayList, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final InterestFeePromotion[] newArray(int i) {
            return new InterestFeePromotion[i];
        }
    };
    public static final int $stable = 8;

    public InterestFeePromotion() {
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
        if (!(obj instanceof InterestFeePromotion)) {
            return false;
        }
        InterestFeePromotion interestFeePromotion = (InterestFeePromotion) obj;
        return Intrinsics.LJFF(this.desc, interestFeePromotion.desc) && Intrinsics.LJFF(this.link, interestFeePromotion.link) && Intrinsics.LJFF(this.selectedDesc, interestFeePromotion.selectedDesc) && Intrinsics.LJFF(this.discountInfoList, interestFeePromotion.discountInfoList) && Intrinsics.LJFF(this.daInfo, interestFeePromotion.daInfo);
    }

    public final int hashCode() {
        String str = this.desc;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.link;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.selectedDesc;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<DiscountInfo> list = this.discountInfoList;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        String str4 = this.daInfo;
        return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("InterestFeePromotion(desc=");
        sbLIZ.append(this.desc);
        sbLIZ.append(", link=");
        sbLIZ.append(this.link);
        sbLIZ.append(", selectedDesc=");
        sbLIZ.append(this.selectedDesc);
        sbLIZ.append(", discountInfoList=");
        sbLIZ.append(this.discountInfoList);
        sbLIZ.append(", daInfo=");
        sbLIZ.append(this.daInfo);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.desc);
        parcel.writeString(this.link);
        parcel.writeString(this.selectedDesc);
        List<DiscountInfo> list = this.discountInfoList;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<DiscountInfo> it2 = list.iterator();
            while (it2.hasNext()) {
                it2.next().writeToParcel(parcel, i);
            }
        }
        parcel.writeString(this.daInfo);
    }

    public final Map<String, Object> LIZ() {
        Object obj;
        String str = this.daInfo;
        if (str == null || str.length() == 0) {
            return null;
        }
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            JSONObject jSONObject = new JSONObject(this.daInfo);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                Object objOpt = jSONObject.opt(next);
                if (objOpt != null && !Intrinsics.LJFF(objOpt, JSONObject.NULL)) {
                    linkedHashMap.put(next, objOpt);
                }
            }
            C189200o6.m2constructorimpl(linkedHashMap);
            obj = linkedHashMap;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C098200Yq c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
            obj = c098200Yq;
        }
        return (Map) (C189200o6.m7isFailureimpl(obj) ? null : obj);
    }

    public InterestFeePromotion(String str, String str2, String str3, List<DiscountInfo> list, String str4) {
        this.desc = str;
        this.link = str2;
        this.selectedDesc = str3;
        this.discountInfoList = list;
        this.daInfo = str4;
    }
}
