package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ab;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class PipoTtsSnsBoundCcdcCvvUpdatePaymentMethodConfig {

    @C09CT("enable")
    public final Boolean enable;

    @C09CT("enable_choose_save_override")
    public final Boolean enableChooseSaveOverride;

    @C09CT("enable_order_create")
    public final Boolean enableOrderCreate;

    @C09CT("enable_osp_order_pay")
    public final Boolean enableOspOrderPay;

    @C09CT("enable_pipo_sdk_pay")
    public final Boolean enablePipoSdkPay;

    @C09CT("enable_retry_cashier_order_pay")
    public final Boolean enableRetryCashierOrderPay;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PipoTtsSnsBoundCcdcCvvUpdatePaymentMethodConfig)) {
            return false;
        }
        PipoTtsSnsBoundCcdcCvvUpdatePaymentMethodConfig pipoTtsSnsBoundCcdcCvvUpdatePaymentMethodConfig = (PipoTtsSnsBoundCcdcCvvUpdatePaymentMethodConfig) obj;
        return Intrinsics.LJFF(this.enable, pipoTtsSnsBoundCcdcCvvUpdatePaymentMethodConfig.enable) && Intrinsics.LJFF(this.enableOrderCreate, pipoTtsSnsBoundCcdcCvvUpdatePaymentMethodConfig.enableOrderCreate) && Intrinsics.LJFF(this.enableOspOrderPay, pipoTtsSnsBoundCcdcCvvUpdatePaymentMethodConfig.enableOspOrderPay) && Intrinsics.LJFF(this.enableRetryCashierOrderPay, pipoTtsSnsBoundCcdcCvvUpdatePaymentMethodConfig.enableRetryCashierOrderPay) && Intrinsics.LJFF(this.enablePipoSdkPay, pipoTtsSnsBoundCcdcCvvUpdatePaymentMethodConfig.enablePipoSdkPay) && Intrinsics.LJFF(this.enableChooseSaveOverride, pipoTtsSnsBoundCcdcCvvUpdatePaymentMethodConfig.enableChooseSaveOverride);
    }

    public final int hashCode() {
        Boolean bool = this.enable;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.enableOrderCreate;
        int iHashCode2 = (iHashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.enableOspOrderPay;
        int iHashCode3 = (iHashCode2 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.enableRetryCashierOrderPay;
        int iHashCode4 = (iHashCode3 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.enablePipoSdkPay;
        int iHashCode5 = (iHashCode4 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Boolean bool6 = this.enableChooseSaveOverride;
        return iHashCode5 + (bool6 != null ? bool6.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PipoTtsSnsBoundCcdcCvvUpdatePaymentMethodConfig(enable=");
        sbLIZ.append(this.enable);
        sbLIZ.append(", enableOrderCreate=");
        sbLIZ.append(this.enableOrderCreate);
        sbLIZ.append(", enableOspOrderPay=");
        sbLIZ.append(this.enableOspOrderPay);
        sbLIZ.append(", enableRetryCashierOrderPay=");
        sbLIZ.append(this.enableRetryCashierOrderPay);
        sbLIZ.append(", enablePipoSdkPay=");
        sbLIZ.append(this.enablePipoSdkPay);
        sbLIZ.append(", enableChooseSaveOverride=");
        sbLIZ.append(this.enableChooseSaveOverride);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public PipoTtsSnsBoundCcdcCvvUpdatePaymentMethodConfig() {
        this(Boolean.TRUE, Boolean.TRUE, Boolean.TRUE, Boolean.TRUE, Boolean.TRUE, Boolean.FALSE);
    }

    public PipoTtsSnsBoundCcdcCvvUpdatePaymentMethodConfig(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6) {
        this.enable = bool;
        this.enableOrderCreate = bool2;
        this.enableOspOrderPay = bool3;
        this.enableRetryCashierOrderPay = bool4;
        this.enablePipoSdkPay = bool5;
        this.enableChooseSaveOverride = bool6;
    }
}
