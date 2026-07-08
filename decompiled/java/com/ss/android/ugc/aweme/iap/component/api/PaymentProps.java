package com.ss.android.ugc.aweme.iap.component.api;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class PaymentProps {

    @C09CT("footer")
    public final Footer footer;

    @C09CT("highlight")
    public final Highlight highlight;

    @C09CT("navigator")
    public final Navigator navigator;

    @C09CT("package_info")
    public final PackageInfo packageInfo;

    @C09CT("pay_on_info")
    public final PayOnInfo payOnInfo;

    @C09CT("strategies")
    public final Strategies strategies;

    @C09CT("subscription_detail")
    public final PGCSubscriptionDetail subscriptionDetail;

    public PaymentProps() {
        this(null, null, null, null, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaymentProps)) {
            return false;
        }
        PaymentProps paymentProps = (PaymentProps) obj;
        return Intrinsics.LJFF(this.navigator, paymentProps.navigator) && Intrinsics.LJFF(this.highlight, paymentProps.highlight) && Intrinsics.LJFF(this.packageInfo, paymentProps.packageInfo) && Intrinsics.LJFF(this.subscriptionDetail, paymentProps.subscriptionDetail) && Intrinsics.LJFF(this.payOnInfo, paymentProps.payOnInfo) && Intrinsics.LJFF(this.footer, paymentProps.footer) && Intrinsics.LJFF(this.strategies, paymentProps.strategies);
    }

    public final int hashCode() {
        Navigator navigator = this.navigator;
        int iHashCode = (navigator == null ? 0 : navigator.hashCode()) * 31;
        Highlight highlight = this.highlight;
        int iHashCode2 = (iHashCode + (highlight == null ? 0 : highlight.hashCode())) * 31;
        PackageInfo packageInfo = this.packageInfo;
        int iHashCode3 = (iHashCode2 + (packageInfo == null ? 0 : packageInfo.hashCode())) * 31;
        PGCSubscriptionDetail pGCSubscriptionDetail = this.subscriptionDetail;
        int iHashCode4 = (iHashCode3 + (pGCSubscriptionDetail == null ? 0 : pGCSubscriptionDetail.hashCode())) * 31;
        PayOnInfo payOnInfo = this.payOnInfo;
        int iHashCode5 = (iHashCode4 + (payOnInfo == null ? 0 : payOnInfo.hashCode())) * 31;
        Footer footer = this.footer;
        int iHashCode6 = (iHashCode5 + (footer == null ? 0 : footer.hashCode())) * 31;
        Strategies strategies = this.strategies;
        return iHashCode6 + (strategies != null ? strategies.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PaymentProps(navigator=");
        sbLIZ.append(this.navigator);
        sbLIZ.append(", highlight=");
        sbLIZ.append(this.highlight);
        sbLIZ.append(", packageInfo=");
        sbLIZ.append(this.packageInfo);
        sbLIZ.append(", subscriptionDetail=");
        sbLIZ.append(this.subscriptionDetail);
        sbLIZ.append(", payOnInfo=");
        sbLIZ.append(this.payOnInfo);
        sbLIZ.append(", footer=");
        sbLIZ.append(this.footer);
        sbLIZ.append(", strategies=");
        sbLIZ.append(this.strategies);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public PaymentProps(Navigator navigator, Highlight highlight, PackageInfo packageInfo, PGCSubscriptionDetail pGCSubscriptionDetail, PayOnInfo payOnInfo, Footer footer, Strategies strategies) {
        this.navigator = navigator;
        this.highlight = highlight;
        this.packageInfo = packageInfo;
        this.subscriptionDetail = pGCSubscriptionDetail;
        this.payOnInfo = payOnInfo;
        this.footer = footer;
        this.strategies = strategies;
    }
}
