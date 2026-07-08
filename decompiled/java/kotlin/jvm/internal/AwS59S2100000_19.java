package kotlin.jvm.internal;

import X.C09AY;
import X.InterfaceC1631620sYq;
import com.ss.android.ugc.aweme.account.model.LoginMethodName;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes20.dex */
public class AwS59S2100000_19 extends C09AY implements Function0 {
    public final int $t;
    public Object l2;
    public String s0;
    public String s1;

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            default:
                return null;
        }
    }

    public static /* bridge */ /* synthetic */ Object invoke$0(AwS59S2100000_19 awS59S2100000_19) {
        ((InterfaceC1631620sYq) awS59S2100000_19.l2).invoke(awS59S2100000_19.s1, awS59S2100000_19.s0, LoginMethodName.PHONE_NUMBER_PASS);
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$1(AwS59S2100000_19 awS59S2100000_19) {
        ((InterfaceC1631620sYq) awS59S2100000_19.l2).invoke(awS59S2100000_19.s1, awS59S2100000_19.s0, LoginMethodName.PHONE_SMS);
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$2(AwS59S2100000_19 awS59S2100000_19) {
        ((Function2) awS59S2100000_19.l2).invoke(awS59S2100000_19.s0, awS59S2100000_19.s1);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS59S2100000_19(InterfaceC1631620sYq interfaceC1631620sYq, InterfaceC1631620sYq<? super String, ? super String, ? super LoginMethodName, Unit> interfaceC1631620sYq2, String str, String str2) {
        super(0);
        this.$t = str2;
        this.l2 = interfaceC1631620sYq;
        this.s1 = interfaceC1631620sYq2;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS59S2100000_19(Function2 function2, Function2<? super String, ? super String, Unit> function22, String str, String str2) {
        super(0);
        this.$t = str2;
        this.l2 = function2;
        this.s0 = function22;
        this.s1 = str;
    }
}
