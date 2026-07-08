package com.ss.android.ugc.aweme.pipo.cashier.common.model;

import X.C09CT;
import X.C1227904rF;
import X.C13LP;
import X.C2188811AlT;
import X.C786410Ut5;
import X.EnumC1710490uc3;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.cbi.CBIInstallmentPlan;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.po.POPayElement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class PaymentOptionLocalInfo {

    @C09CT("added_to_rec_ts")
    public long addedToRecTS;

    @C09CT("async_payment_elements")
    public List<POPayElement> asyncPaymentElements;

    @C09CT("is_preselected")
    public boolean isPreselected;

    @C09CT("local_payment_elements")
    public List<POPayElement> localPaymentElements;

    @C09CT("pm_device_data")
    public String pmDeviceData;

    @C09CT("po_key")
    public final String poKey;

    @C09CT("selected_installment_info")
    public PaymentOptionLocalInstallmentInfo selectedInstallmentInfo;

    @C09CT("show_need_select_other_pm_block")
    public Boolean showNeedSelectOtherPMBlock;

    @C09CT("store_payment_method")
    public Boolean storePaymentMethod;

    @C09CT("verify_request_id")
    public String verifyRequestId;

    public PaymentOptionLocalInfo() {
        this("", false, null, 0L, null, null, null, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaymentOptionLocalInfo)) {
            return false;
        }
        PaymentOptionLocalInfo paymentOptionLocalInfo = (PaymentOptionLocalInfo) obj;
        return Intrinsics.LJFF(this.poKey, paymentOptionLocalInfo.poKey) && this.isPreselected == paymentOptionLocalInfo.isPreselected && Intrinsics.LJFF(this.localPaymentElements, paymentOptionLocalInfo.localPaymentElements) && this.addedToRecTS == paymentOptionLocalInfo.addedToRecTS && Intrinsics.LJFF(this.storePaymentMethod, paymentOptionLocalInfo.storePaymentMethod) && Intrinsics.LJFF(this.showNeedSelectOtherPMBlock, paymentOptionLocalInfo.showNeedSelectOtherPMBlock) && Intrinsics.LJFF(this.asyncPaymentElements, paymentOptionLocalInfo.asyncPaymentElements) && Intrinsics.LJFF(this.verifyRequestId, paymentOptionLocalInfo.verifyRequestId) && Intrinsics.LJFF(this.pmDeviceData, paymentOptionLocalInfo.pmDeviceData) && Intrinsics.LJFF(this.selectedInstallmentInfo, paymentOptionLocalInfo.selectedInstallmentInfo);
    }

    public final int hashCode() {
        int iHashCode = ((this.poKey.hashCode() * 31) + C786410Ut5.Z2(this.isPreselected)) * 31;
        List<POPayElement> list = this.localPaymentElements;
        int iHashCode2 = (((iHashCode + (list == null ? 0 : list.hashCode())) * 31) + C786410Ut5.Y2(this.addedToRecTS)) * 31;
        Boolean bool = this.storePaymentMethod;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.showNeedSelectOtherPMBlock;
        int iHashCode4 = (iHashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        List<POPayElement> list2 = this.asyncPaymentElements;
        int iHashCode5 = (iHashCode4 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str = this.verifyRequestId;
        int iHashCode6 = (iHashCode5 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.pmDeviceData;
        int iHashCode7 = (iHashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
        PaymentOptionLocalInstallmentInfo paymentOptionLocalInstallmentInfo = this.selectedInstallmentInfo;
        return iHashCode7 + (paymentOptionLocalInstallmentInfo != null ? paymentOptionLocalInstallmentInfo.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PaymentOptionLocalInfo(poKey=");
        sbLIZ.append(this.poKey);
        sbLIZ.append(", isPreselected=");
        sbLIZ.append(this.isPreselected);
        sbLIZ.append(", localPaymentElements=");
        sbLIZ.append(this.localPaymentElements);
        sbLIZ.append(", addedToRecTS=");
        sbLIZ.append(this.addedToRecTS);
        sbLIZ.append(", storePaymentMethod=");
        sbLIZ.append(this.storePaymentMethod);
        sbLIZ.append(", showNeedSelectOtherPMBlock=");
        sbLIZ.append(this.showNeedSelectOtherPMBlock);
        sbLIZ.append(", asyncPaymentElements=");
        sbLIZ.append(this.asyncPaymentElements);
        sbLIZ.append(", verifyRequestId=");
        sbLIZ.append(this.verifyRequestId);
        sbLIZ.append(", pmDeviceData=");
        sbLIZ.append(this.pmDeviceData);
        sbLIZ.append(", selectedInstallmentInfo=");
        sbLIZ.append(this.selectedInstallmentInfo);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final PaymentOptionLocalInfo LIZIZ() {
        try {
            C1227904rF.LIZ.getClass();
            return (PaymentOptionLocalInfo) C1227904rF.LIZIZ(C1227904rF.LJI(this), PaymentOptionLocalInfo.class);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            List<POPayElement> list = this.localPaymentElements;
            ArrayList arrayList = list != null ? new ArrayList(list) : null;
            List<POPayElement> list2 = this.asyncPaymentElements;
            return new PaymentOptionLocalInfo(this.poKey, this.isPreselected, arrayList, this.addedToRecTS, this.storePaymentMethod, this.showNeedSelectOtherPMBlock, list2 != null ? C13LP.LLIIII(list2) : null, this.verifyRequestId, this.pmDeviceData, this.selectedInstallmentInfo);
        }
    }

    public final POPayElement LIZJ() {
        List<POPayElement> list = this.localPaymentElements;
        POPayElement pOPayElement = null;
        if (list == null) {
            return null;
        }
        Iterator<POPayElement> it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            POPayElement next = it2.next();
            if (next.LIZ() == EnumC1710490uc3.CVV) {
                pOPayElement = next;
                break;
            }
        }
        return pOPayElement;
    }

    public final boolean LIZ(CBIInstallmentPlan cBIInstallmentPlan) {
        PaymentOptionLocalInstallmentInfo paymentOptionLocalInstallmentInfo;
        if (cBIInstallmentPlan == null) {
            paymentOptionLocalInstallmentInfo = null;
        } else {
            paymentOptionLocalInstallmentInfo = new PaymentOptionLocalInstallmentInfo(cBIInstallmentPlan.tenure, cBIInstallmentPlan.installmentPlanId, cBIInstallmentPlan.installmentOptionId);
        }
        if (Intrinsics.LJFF(this.selectedInstallmentInfo, paymentOptionLocalInstallmentInfo)) {
            return false;
        }
        this.selectedInstallmentInfo = paymentOptionLocalInstallmentInfo;
        return true;
    }

    public PaymentOptionLocalInfo(String str, boolean z, List<POPayElement> list, long j, Boolean bool, Boolean bool2, List<POPayElement> list2, String str2, String str3, PaymentOptionLocalInstallmentInfo paymentOptionLocalInstallmentInfo) {
        this.poKey = str;
        this.isPreselected = z;
        this.localPaymentElements = list;
        this.addedToRecTS = j;
        this.storePaymentMethod = bool;
        this.showNeedSelectOtherPMBlock = bool2;
        this.asyncPaymentElements = list2;
        this.verifyRequestId = str2;
        this.pmDeviceData = str3;
        this.selectedInstallmentInfo = paymentOptionLocalInstallmentInfo;
    }
}
