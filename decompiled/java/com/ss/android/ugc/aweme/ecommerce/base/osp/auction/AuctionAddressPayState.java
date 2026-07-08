package com.ss.android.ugc.aweme.ecommerce.base.osp.auction;

import X.AnonymousClass0376;
import X.AnonymousClass0404;
import X.C004I;
import X.C13BV;
import X.C2188811AlT;
import X.C786410Ut5;
import X.InterfaceC0148002o;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class AuctionAddressPayState implements C004I, InterfaceC0148002o {
    public final int abnormalStatus;
    public final List<Object> adapterList;
    public final AnonymousClass0376 address;
    public final boolean loadSuccess;
    public final String otpString;
    public final int pageLoadStatus;
    public PaymentInfo payment;
    public final boolean showDialogState;
    public static final AnonymousClass0404 Companion = new Object() { // from class: X.0404
    };
    public static final int $stable = 8;

    public AuctionAddressPayState() {
        this(0, null, null, null, 0, false, false, null, 255, null);
    }

    public final AuctionAddressPayState copy(int i, List<? extends Object> list, AnonymousClass0376 anonymousClass0376, PaymentInfo paymentInfo, int i2, boolean z, boolean z2, String str) {
        return new AuctionAddressPayState(i, list, anonymousClass0376, paymentInfo, i2, z, z2, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuctionAddressPayState)) {
            return false;
        }
        AuctionAddressPayState auctionAddressPayState = (AuctionAddressPayState) obj;
        return this.pageLoadStatus == auctionAddressPayState.pageLoadStatus && Intrinsics.LJFF(this.adapterList, auctionAddressPayState.adapterList) && Intrinsics.LJFF(this.address, auctionAddressPayState.address) && Intrinsics.LJFF(this.payment, auctionAddressPayState.payment) && this.abnormalStatus == auctionAddressPayState.abnormalStatus && this.showDialogState == auctionAddressPayState.showDialogState && this.loadSuccess == auctionAddressPayState.loadSuccess && Intrinsics.LJFF(this.otpString, auctionAddressPayState.otpString);
    }

    public int hashCode() {
        int iHashCode = ((this.pageLoadStatus * 31) + this.adapterList.hashCode()) * 31;
        AnonymousClass0376 anonymousClass0376 = this.address;
        int iHashCode2 = (iHashCode + (anonymousClass0376 == null ? 0 : anonymousClass0376.hashCode())) * 31;
        PaymentInfo paymentInfo = this.payment;
        int iHashCode3 = (((((((iHashCode2 + (paymentInfo == null ? 0 : paymentInfo.hashCode())) * 31) + this.abnormalStatus) * 31) + C786410Ut5.Z2(this.showDialogState)) * 31) + C786410Ut5.Z2(this.loadSuccess)) * 31;
        String str = this.otpString;
        return iHashCode3 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AuctionAddressPayState(pageLoadStatus=");
        sbLIZ.append(this.pageLoadStatus);
        sbLIZ.append(", adapterList=");
        sbLIZ.append(this.adapterList);
        sbLIZ.append(", address=");
        sbLIZ.append(this.address);
        sbLIZ.append(", payment=");
        sbLIZ.append(this.payment);
        sbLIZ.append(", abnormalStatus=");
        sbLIZ.append(this.abnormalStatus);
        sbLIZ.append(", showDialogState=");
        sbLIZ.append(this.showDialogState);
        sbLIZ.append(", loadSuccess=");
        sbLIZ.append(this.loadSuccess);
        sbLIZ.append(", otpString=");
        sbLIZ.append(this.otpString);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int getAbnormalStatus() {
        return this.abnormalStatus;
    }

    public final List<Object> getAdapterList() {
        return this.adapterList;
    }

    public final AnonymousClass0376 getAddress() {
        return this.address;
    }

    public final boolean getLoadSuccess() {
        return this.loadSuccess;
    }

    public final String getOtpString() {
        return this.otpString;
    }

    public final int getPageLoadStatus() {
        return this.pageLoadStatus;
    }

    public final PaymentInfo getPayment() {
        return this.payment;
    }

    public final boolean getShowDialogState() {
        return this.showDialogState;
    }

    public final void setPayment(PaymentInfo paymentInfo) {
        this.payment = paymentInfo;
    }

    public AuctionAddressPayState(int i, List<? extends Object> list, AnonymousClass0376 anonymousClass0376, PaymentInfo paymentInfo, int i2, boolean z, boolean z2, String str) {
        this.pageLoadStatus = i;
        this.adapterList = list;
        this.address = anonymousClass0376;
        this.payment = paymentInfo;
        this.abnormalStatus = i2;
        this.showDialogState = z;
        this.loadSuccess = z2;
        this.otpString = str;
    }

    public AuctionAddressPayState(int i, List list, AnonymousClass0376 anonymousClass0376, PaymentInfo paymentInfo, int i2, boolean z, boolean z2, String str, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? -1 : i, (i3 & 2) != 0 ? C13BV.INSTANCE : list, (i3 & 4) != 0 ? null : anonymousClass0376, (i3 & 8) != 0 ? null : paymentInfo, (i3 & 16) != 0 ? 0 : i2, (i3 & 32) != 0 ? false : z, (i3 & 64) == 0 ? z2 : false, (i3 & 128) == 0 ? str : null);
    }
}
