package com.ss.android.ugc.aweme.iap.component.api;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class PaymentComponent {

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public final String id;

    @C09CT("props")
    public final PaymentProps props;

    public PaymentComponent() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaymentComponent)) {
            return false;
        }
        PaymentComponent paymentComponent = (PaymentComponent) obj;
        return Intrinsics.LJFF(this.id, paymentComponent.id) && Intrinsics.LJFF(this.props, paymentComponent.props);
    }

    public final int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        PaymentProps paymentProps = this.props;
        return iHashCode + (paymentProps != null ? paymentProps.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PaymentComponent(id=");
        sbLIZ.append(this.id);
        sbLIZ.append(", props=");
        sbLIZ.append(this.props);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public PaymentComponent(String str, PaymentProps paymentProps) {
        this.id = str;
        this.props = paymentProps;
    }
}
