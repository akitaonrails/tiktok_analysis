package kotlin.jvm.internal;

import X.C09AY;
import X.C0XQ7;
import X.C1235080iFG;
import X.C1397620mTQ;
import X.EnumC1235130iFL;
import X.EnumC1235240iFW;
import X.EnumC1237810iJf;
import android.os.Bundle;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes20.dex */
public class AwS3S0320000_19 extends C09AY implements Function1 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public boolean z3;
    public boolean z4;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS3S0320000_19 awS3S0320000_19, Object obj) {
        if (!awS3S0320000_19.z3) {
            C1235080iFG c1235080iFG = (C1235080iFG) awS3S0320000_19.l0;
            boolean z = awS3S0320000_19.z4;
            c1235080iFG.LJIIL((Bundle) awS3S0320000_19.l2, (List) awS3S0320000_19.l1, z);
        } else if (awS3S0320000_19.z4) {
            ((C1235080iFG) awS3S0320000_19.l0).LIZJ((Bundle) awS3S0320000_19.l2);
        } else {
            C1235080iFG c1235080iFG2 = (C1235080iFG) awS3S0320000_19.l0;
            Bundle bundle = (Bundle) awS3S0320000_19.l2;
            c1235080iFG2.getClass();
            bundle.putInt("email_source", EnumC1237810iJf.DYA_BIND_EMAIL_SOURCE_TYPE_ACCOUNT_MANAGEMENT_EMAIL.getValue());
            C0XQ7.LIZ().changeUnverifiedEmail(c1235080iFG2.LIZ, "security_checkup_page", null, bundle, true, null);
        }
        C1235080iFG c1235080iFG3 = (C1235080iFG) awS3S0320000_19.l0;
        boolean z2 = awS3S0320000_19.z4;
        boolean z3 = awS3S0320000_19.z3;
        EnumC1235130iFL enumC1235130iFL = EnumC1235130iFL.CHANGE;
        EnumC1235240iFW enumC1235240iFW = EnumC1235240iFW.CLICK_CONTINUE;
        c1235080iFG3.getClass();
        C1235080iFG.LJI(z2, z3, enumC1235130iFL, enumC1235240iFW);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS3S0320000_19 awS3S0320000_19, Object obj) {
        C1397620mTQ c1397620mTQ = (C1397620mTQ) obj;
        String string = ((C1235080iFG) awS3S0320000_19.l0).LIZ.getString(2131827400);
        boolean z = awS3S0320000_19.z3;
        C1235080iFG c1235080iFG = (C1235080iFG) awS3S0320000_19.l0;
        boolean z2 = awS3S0320000_19.z4;
        c1397620mTQ.LIZJ(0, string, new AwS3S0320000_19((Bundle) awS3S0320000_19.l2, c1235080iFG, (List) awS3S0320000_19.l1, z, z2, 0));
        c1397620mTQ.LIZJ(1, ((C1235080iFG) awS3S0320000_19.l0).LIZ.getString(2131827399), null);
        return Unit.LIZ;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AwS3S0320000_19(android.os.Bundle r3, X.C1235080iFG r4, java.util.List r5, boolean r6, boolean r7, int r8) {
        /*
            r2 = this;
            r2.$t = r8
            if (r8 == 0) goto L14
            r1 = r2
            r1.l0 = r4
            r1.z3 = r6
            r1.z4 = r7
            r1.l1 = r5
            r1.l2 = r3
            r0 = 1
        L10:
            r1.<init>(r0)
            return
        L14:
            r1 = r2
            r1.z3 = r6
            r1.l0 = r4
            r1.z4 = r7
            r1.l1 = r5
            r1.l2 = r3
            r0 = 1
            goto L10
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS3S0320000_19.<init>(android.os.Bundle, X.0iFG, java.util.List, boolean, boolean, int):void");
    }
}
