package kotlin.jvm.internal;

import X.C09AY;
import X.C1665460tRQ;
import X.C1666390tSv;
import X.C1669520tXy;
import X.C1689210u3j;
import X.C341440Da2;
import X.InterfaceC1680500tpg;
import X.InterfaceC1685750ty9;
import X.InterfaceC1686920u02;
import com.ss.android.ugc.aweme.account.login.auth.SignupViewModel;
import com.ss.android.ugc.aweme.account.login.auth.ui.login.SmsInputViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes20.dex */
public class AwS20S0202000_19 extends C09AY implements Function2 {
    public final int $t;
    public int i2;
    public int i3;
    public Object l0;
    public Object l1;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            case 2:
                return invoke$2(this, obj, obj2);
            case 3:
                return invoke$3(this, obj, obj2);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS20S0202000_19 awS20S0202000_19, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        C1689210u3j.LIZIZ((InterfaceC1686920u02) awS20S0202000_19.l0, (Function0) awS20S0202000_19.l1, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(awS20S0202000_19.i2 | 1), awS20S0202000_19.i3);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS20S0202000_19 awS20S0202000_19, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        Function0 function0 = (Function0) awS20S0202000_19.l0;
        InterfaceC1685750ty9 interfaceC1685750ty9 = (InterfaceC1685750ty9) awS20S0202000_19.l1;
        C1665460tRQ.LIZ(C341440Da2.LIZ(awS20S0202000_19.i2 | 1), awS20S0202000_19.i3, (InterfaceC1680500tpg) obj, interfaceC1685750ty9, function0);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS20S0202000_19 awS20S0202000_19, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        InterfaceC1685750ty9 interfaceC1685750ty9 = (InterfaceC1685750ty9) awS20S0202000_19.l0;
        Function0 function0 = (Function0) awS20S0202000_19.l1;
        C1666390tSv.LIZIZ(C341440Da2.LIZ(awS20S0202000_19.i2 | 1), awS20S0202000_19.i3, (InterfaceC1680500tpg) obj, interfaceC1685750ty9, function0);
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS20S0202000_19 awS20S0202000_19, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        C1669520tXy.LIZIZ((SignupViewModel) awS20S0202000_19.l0, (SmsInputViewModel) awS20S0202000_19.l1, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(awS20S0202000_19.i2 | 1), awS20S0202000_19.i3);
        return Unit.LIZ;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AwS20S0202000_19(int r3, int r4, X.InterfaceC1685750ty9 r5, kotlin.jvm.functions.Function0 r6, int r7) {
        /*
            r2 = this;
            r2.$t = r7
            int r7 = 1 - r7
            if (r7 == 0) goto L14
            r1 = r2
            r1.l0 = r5
            r1.l1 = r6
            r1.i2 = r3
            r1.i3 = r4
            r0 = 2
        L10:
            r1.<init>(r0)
            return
        L14:
            r1 = r2
            r1.l0 = r6
            r1.l1 = r5
            r1.i2 = r3
            r1.i3 = r4
            r0 = 2
            goto L10
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS20S0202000_19.<init>(int, int, X.0ty9, kotlin.jvm.functions.Function0, int):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS20S0202000_19(InterfaceC1686920u02 interfaceC1686920u02, InterfaceC1686920u02 interfaceC1686920u022, Function0<Unit> function0, int i, int i2) {
        super(2);
        this.$t = i2;
        this.l0 = interfaceC1686920u02;
        this.l1 = interfaceC1686920u022;
        this.i2 = function0;
        this.i3 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS20S0202000_19(SignupViewModel signupViewModel, SmsInputViewModel smsInputViewModel, int i, int i2, int i3) {
        super(2);
        this.$t = i3;
        this.l0 = signupViewModel;
        this.l1 = smsInputViewModel;
        this.i2 = i;
        this.i3 = i2;
    }
}
