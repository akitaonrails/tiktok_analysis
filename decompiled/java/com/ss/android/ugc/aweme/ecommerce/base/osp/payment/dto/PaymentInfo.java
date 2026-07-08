package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto;

import X.C03XU;
import X.C09CT;
import X.C13LP;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class PaymentInfo {
    public PaymentMethod LIZ;
    public final PaymentMethod LIZIZ;
    public final PaymentMethodInfo LIZJ;
    public final Map<String, String> LIZLLL;
    public PaymentInfo LJ;
    public boolean LJFF;
    public boolean LJI;
    public boolean LJII;

    @C09CT("is_valid")
    public Boolean isValid;

    @C09CT("payment_method")
    public PaymentMethod paymentMethod;

    @C09CT("payment_method_info")
    public final PaymentMethodInfo paymentMethodInfo;

    @C09CT("region_geo_id")
    public String regionGeoId;

    @C09CT("region_string")
    public String regionName;

    @C09CT("use_shipping_address")
    public final Boolean useShippingAddress;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaymentInfo)) {
            return false;
        }
        PaymentInfo paymentInfo = (PaymentInfo) obj;
        return Intrinsics.LJFF(this.paymentMethodInfo, paymentInfo.paymentMethodInfo) && Intrinsics.LJFF(this.paymentMethod, paymentInfo.paymentMethod) && Intrinsics.LJFF(this.useShippingAddress, paymentInfo.useShippingAddress) && Intrinsics.LJFF(this.isValid, paymentInfo.isValid) && Intrinsics.LJFF(this.regionName, paymentInfo.regionName) && Intrinsics.LJFF(this.regionGeoId, paymentInfo.regionGeoId) && Intrinsics.LJFF(this.LIZ, paymentInfo.LIZ) && Intrinsics.LJFF(this.LIZIZ, paymentInfo.LIZIZ) && Intrinsics.LJFF(this.LIZJ, paymentInfo.LIZJ) && Intrinsics.LJFF(this.LIZLLL, paymentInfo.LIZLLL) && Intrinsics.LJFF(this.LJ, paymentInfo.LJ);
    }

    public final int hashCode() {
        PaymentMethodInfo paymentMethodInfo = this.paymentMethodInfo;
        int iHashCode = (paymentMethodInfo == null ? 0 : paymentMethodInfo.hashCode()) * 31;
        PaymentMethod paymentMethod = this.paymentMethod;
        int iHashCode2 = (iHashCode + (paymentMethod == null ? 0 : paymentMethod.hashCode())) * 31;
        Boolean bool = this.useShippingAddress;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isValid;
        int iHashCode4 = (iHashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str = this.regionName;
        int iHashCode5 = (iHashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.regionGeoId;
        int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        PaymentMethod paymentMethod2 = this.LIZ;
        int iHashCode7 = (iHashCode6 + (paymentMethod2 == null ? 0 : paymentMethod2.hashCode())) * 31;
        PaymentMethod paymentMethod3 = this.LIZIZ;
        int iHashCode8 = (iHashCode7 + (paymentMethod3 == null ? 0 : paymentMethod3.hashCode())) * 31;
        PaymentMethodInfo paymentMethodInfo2 = this.LIZJ;
        int iHashCode9 = (((iHashCode8 + (paymentMethodInfo2 == null ? 0 : paymentMethodInfo2.hashCode())) * 31) + this.LIZLLL.hashCode()) * 31;
        PaymentInfo paymentInfo = this.LJ;
        return iHashCode9 + (paymentInfo != null ? paymentInfo.hashCode() : 0);
    }

    public final String toString() {
        return "PaymentInfo(paymentMethodInfo=" + this.paymentMethodInfo + ", paymentMethod=" + this.paymentMethod + ", useShippingAddress=" + this.useShippingAddress + ", isValid=" + this.isValid + ", regionName=" + this.regionName + ", regionGeoId=" + this.regionGeoId + ", creditMethodInfo=" + this.LIZ + ", anchorPaymentMethod=" + this.LIZIZ + ", anchorPaymentMethodInfo=" + this.LIZJ + ", selectedBindAndPayPM=" + this.LIZLLL + ", extraPaymentInfo=" + this.LJ + ')';
    }

    public final boolean LIZLLL() {
        return this.paymentMethodInfo != null;
    }

    public final Boolean LJ() {
        InstallmentInfo installmentInfo;
        List<InstallmentPlan> list;
        List<InstallmentInfo> list2;
        PaymentMethod paymentMethod = this.paymentMethod;
        InstallmentPlan installmentPlan = null;
        if (paymentMethod == null || ((installmentInfo = paymentMethod.installmentInfo) == null && ((list2 = paymentMethod.installmentInfoList) == null || (installmentInfo = (InstallmentInfo) C13LP.LJJJLL(list2)) == null))) {
            return null;
        }
        PaymentMethodInfo paymentMethodInfo = this.paymentMethodInfo;
        boolean z = false;
        if ((paymentMethodInfo != null ? paymentMethodInfo.tenure : null) != null && paymentMethodInfo.installmentPlanId != null && (list = installmentInfo.installmentPlans) != null) {
            Iterator<InstallmentPlan> it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                InstallmentPlan next = it2.next();
                InstallmentPlan installmentPlan2 = next;
                if (Intrinsics.LJFF(installmentPlan2.tenure, this.paymentMethodInfo.tenure) && Intrinsics.LJFF(installmentPlan2.id, this.paymentMethodInfo.installmentPlanId)) {
                    installmentPlan = next;
                    break;
                }
            }
            InstallmentPlan installmentPlan3 = installmentPlan;
            if (installmentPlan3 != null && Intrinsics.LJFF(installmentPlan3.isRecommend, Boolean.TRUE)) {
                z = true;
            }
        }
        return Boolean.valueOf(z);
    }

    public final boolean LJFF() {
        PaymentMethod paymentMethod = this.paymentMethod;
        if (paymentMethod != null) {
            return Intrinsics.LJFF(paymentMethod.supportDonation, Boolean.TRUE);
        }
        return false;
    }

    public final boolean LJI() {
        return this.LIZ != null;
    }

    public final PaymentInfo LJII() {
        return new PaymentInfo(this.LIZJ, this.LIZIZ, this.useShippingAddress, this.isValid, this.regionName, this.regionGeoId, null, null, null, new LinkedHashMap(), null);
    }

    public final boolean LIZIZ() {
        return (!C03XU.LIZIZ().enable || this.LIZIZ == null || this.LIZJ == null) ? false : true;
    }

    public final boolean LIZJ() {
        if (LJI()) {
            return true;
        }
        PaymentMethod paymentMethod = this.paymentMethod;
        return (paymentMethod == null || paymentMethod.LJFF == null) ? false : true;
    }

    public static PaymentInfo LIZ(PaymentInfo paymentInfo, PaymentMethodInfo paymentMethodInfo, PaymentMethod paymentMethod, Boolean bool, PaymentMethod paymentMethod2, PaymentMethod paymentMethod3, PaymentMethodInfo paymentMethodInfo2, Map map, int i) {
        Boolean bool2;
        String str;
        String str2;
        Map map2 = map;
        PaymentMethodInfo paymentMethodInfo3 = paymentMethodInfo;
        PaymentMethod paymentMethod4 = paymentMethod3;
        PaymentMethod paymentMethod5 = paymentMethod2;
        PaymentMethodInfo paymentMethodInfo4 = paymentMethodInfo2;
        PaymentMethod paymentMethod6 = paymentMethod;
        Boolean bool3 = bool;
        if ((i & 1) != 0) {
            paymentMethodInfo3 = paymentInfo.paymentMethodInfo;
        }
        if ((i & 2) != 0) {
            paymentMethod6 = paymentInfo.paymentMethod;
        }
        PaymentInfo paymentInfo2 = null;
        if ((i & 4) != 0) {
            bool2 = paymentInfo.useShippingAddress;
        } else {
            bool2 = null;
        }
        if ((i & 8) != 0) {
            bool3 = paymentInfo.isValid;
        }
        if ((i & 16) != 0) {
            str = paymentInfo.regionName;
        } else {
            str = null;
        }
        if ((i & 32) != 0) {
            str2 = paymentInfo.regionGeoId;
        } else {
            str2 = null;
        }
        if ((i & 64) != 0) {
            paymentMethod5 = paymentInfo.LIZ;
        }
        if ((i & 128) != 0) {
            paymentMethod4 = paymentInfo.LIZIZ;
        }
        if ((i & 256) != 0) {
            paymentMethodInfo4 = paymentInfo.LIZJ;
        }
        if ((i & 512) != 0) {
            map2 = paymentInfo.LIZLLL;
        }
        if ((i & 1024) != 0) {
            paymentInfo2 = paymentInfo.LJ;
        }
        paymentInfo.getClass();
        return new PaymentInfo(paymentMethodInfo3, paymentMethod6, bool2, bool3, str, str2, paymentMethod5, paymentMethod4, paymentMethodInfo4, map2, paymentInfo2);
    }

    public PaymentInfo(PaymentMethodInfo paymentMethodInfo, PaymentMethod paymentMethod, Boolean bool, Boolean bool2, String str, String str2, PaymentMethod paymentMethod2, PaymentMethod paymentMethod3, PaymentMethodInfo paymentMethodInfo2, Map<String, String> map, PaymentInfo paymentInfo) {
        this.paymentMethodInfo = paymentMethodInfo;
        this.paymentMethod = paymentMethod;
        this.useShippingAddress = bool;
        this.isValid = bool2;
        this.regionName = str;
        this.regionGeoId = str2;
        this.LIZ = paymentMethod2;
        this.LIZIZ = paymentMethod3;
        this.LIZJ = paymentMethodInfo2;
        this.LIZLLL = map;
        this.LJ = paymentInfo;
    }
}
