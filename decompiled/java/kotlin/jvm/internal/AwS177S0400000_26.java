package kotlin.jvm.internal;

import X.C09AY;
import X.C1708470uYn;
import X.C1708630uZ3;
import X.C1708640uZ4;
import X.C1709570uaZ;
import X.C19EG;
import X.EnumC336190DFx;
import X.InterfaceC1631630sYr;
import android.content.Context;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.pipo.ab.PipoTtlsCheckoutBraintreePaypalConfigModel;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.po.PaymentOption;
import com.ss.android.ugc.aweme.pipo.payments.IPipoExternalPaymentsService;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes27.dex */
public class AwS177S0400000_26 extends C09AY implements Function2 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            case 2:
                return invoke$2(this, obj, obj2);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS177S0400000_26 awS177S0400000_26, Object obj, Object obj2) {
        String str = (String) obj;
        if (obj2 == null && str != null && str.length() != 0) {
            ((PaymentOption) awS177S0400000_26.l0).LJIIJJI((C1709570uaZ) awS177S0400000_26.l1).pmDeviceData = str;
            ((InterfaceC1631630sYr) awS177S0400000_26.l2).invoke(EnumC336190DFx.SUCCESS, null, null, null);
        } else {
            C1708640uZ4 c1708640uZ4 = C1708640uZ4.LIZ;
            Context context = (Context) awS177S0400000_26.l3;
            InterfaceC1631630sYr interfaceC1631630sYr = (InterfaceC1631630sYr) awS177S0400000_26.l2;
            c1708640uZ4.getClass();
            EnumC336190DFx enumC336190DFx = EnumC336190DFx.PAYMENT_ERROR;
            C1708470uYn.LIZ.getClass();
            interfaceC1631630sYr.invoke(enumC336190DFx, null, context.getString(2131857118), "PAYPAL_ERROR_INVALID_PARAM");
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS177S0400000_26 awS177S0400000_26, Object obj, Object obj2) {
        C19EG c19eg = (C19EG) obj;
        IPipoExternalPaymentsService iPipoExternalPaymentsService = (IPipoExternalPaymentsService) obj2;
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        PipoTtlsCheckoutBraintreePaypalConfigModel pipoTtlsCheckoutBraintreePaypalConfigModel = C1708630uZ3.LIZ;
        PipoTtlsCheckoutBraintreePaypalConfigModel pipoTtlsCheckoutBraintreePaypalConfigModel2 = (PipoTtlsCheckoutBraintreePaypalConfigModel) settingsManagerLIZLLL.LJIIIIZZ("pipo_ttls_checkout_braintree_paypal_config", PipoTtlsCheckoutBraintreePaypalConfigModel.class, pipoTtlsCheckoutBraintreePaypalConfigModel);
        if (pipoTtlsCheckoutBraintreePaypalConfigModel2 != null) {
            pipoTtlsCheckoutBraintreePaypalConfigModel = pipoTtlsCheckoutBraintreePaypalConfigModel2;
        }
        String str = pipoTtlsCheckoutBraintreePaypalConfigModel.token;
        PaymentOption paymentOption = (PaymentOption) awS177S0400000_26.l0;
        iPipoExternalPaymentsService.LIZLLL(c19eg, str, new AwS177S0400000_26((Context) awS177S0400000_26.l3, (C1709570uaZ) awS177S0400000_26.l1, paymentOption, (InterfaceC1631630sYr) awS177S0400000_26.l2, 0));
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS177S0400000_26 awS177S0400000_26, Object obj, Object obj2) {
        InterfaceC1631630sYr interfaceC1631630sYr = (InterfaceC1631630sYr) awS177S0400000_26.l0;
        ((IPipoExternalPaymentsService) obj2).LIZ((C19EG) obj, new AwS121S0400000_26((Context) awS177S0400000_26.l1, (C1709570uaZ) awS177S0400000_26.l3, (PaymentOption) awS177S0400000_26.l2, interfaceC1631630sYr, 22));
        return Unit.LIZ;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AwS177S0400000_26(android.content.Context r3, X.C1709570uaZ r4, com.ss.android.ugc.aweme.pipo.cashier.common.model.po.PaymentOption r5, X.InterfaceC1631630sYr r6, int r7) {
        /*
            r2 = this;
            r2.$t = r7
            switch(r7) {
                case 0: goto L13;
                case 1: goto L13;
                default: goto L5;
            }
        L5:
            r1 = r2
            r1.l0 = r6
            r1.l1 = r3
            r1.l2 = r5
            r1.l3 = r4
            r0 = 2
        Lf:
            r1.<init>(r0)
            return
        L13:
            r1 = r2
            r1.l0 = r5
            r1.l1 = r4
            r1.l2 = r6
            r1.l3 = r3
            r0 = 2
            goto Lf
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS177S0400000_26.<init>(android.content.Context, X.0uaZ, com.ss.android.ugc.aweme.pipo.cashier.common.model.po.PaymentOption, X.0sYr, int):void");
    }
}
