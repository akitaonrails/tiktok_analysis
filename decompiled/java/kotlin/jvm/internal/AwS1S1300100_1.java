package kotlin.jvm.internal;

import X.C03N1;
import X.C09AY;
import X.C1018703yb;
import X.C1054004Ag;
import X.C1054104Ah;
import X.C259800zU;
import X.C897703f5;
import X.C907803gi;
import X.InterfaceC911103hF;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentSwitchPollManager;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.SeaPdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public class AwS1S1300100_1 extends C09AY implements Function1 {
    public final int $t;
    public long j4;
    public Object l1;
    public Object l2;
    public Object l3;
    public String s0;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS1S1300100_1 awS1S1300100_1, Object obj) {
        if (((Boolean) obj).booleanValue()) {
            C1018703yb.LIZLLL("rd_tiktokec_ecommerce_envoke_app", new AwS18S1100100_1((C897703f5) awS1S1300100_1.l2, awS1S1300100_1.s0, awS1S1300100_1.j4, 2));
            Function0 function0 = (Function0) awS1S1300100_1.l1;
            if (function0 != null) {
                function0.invoke();
            }
        } else {
            C897703f5 c897703f5 = (C897703f5) awS1S1300100_1.l2;
            if (!c897703f5.LJJIIZ) {
                PaymentSwitchPollManager.LIZIZ(AFwS185S0000000_1.get$arr$(95));
            } else {
                C907803gi.LIZ.getClass();
                InterfaceC911103hF interfaceC911103hF = c897703f5.LJIILJJIL;
                if (interfaceC911103hF != null) {
                    interfaceC911103hF.LJI(C03N1.COMPLETE, null, "app_foreground_3");
                }
            }
            Function0 function02 = (Function0) awS1S1300100_1.l3;
            if (function02 != null) {
                function02.invoke();
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$1(kotlin.jvm.internal.AwS1S1300100_1 r5, java.lang.Object r6) {
        /*
            Method dump skipped, instruction units count: 233
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS1S1300100_1.invoke$1(kotlin.jvm.internal.AwS1S1300100_1, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$2(kotlin.jvm.internal.AwS1S1300100_1 r5, java.lang.Object r6) {
        /*
            Method dump skipped, instruction units count: 233
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS1S1300100_1.invoke$2(kotlin.jvm.internal.AwS1S1300100_1, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 8, insn: 0x000b: IPUT (r8 I:java.lang.String), (r1 I:kotlin.jvm.internal.AwS1S1300100_1) (LINE:100663307) kotlin.jvm.internal.AwS1S1300100_1.s0 java.lang.String, block:B:2:0x0000 */
    public AwS1S1300100_1(C1054004Ag c1054004Ag, C1054004Ag c1054004Ag2, C259800zU<String> c259800zU, PdpViewModel pdpViewModel, long j, String str) {
        String str2;
        super(1);
        this.$t = str;
        this.l1 = c1054004Ag;
        this.l2 = c1054004Ag2;
        this.l3 = c259800zU;
        this.j4 = pdpViewModel;
        this.s0 = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 8, insn: 0x000b: IPUT (r8 I:java.lang.String), (r1 I:kotlin.jvm.internal.AwS1S1300100_1) (LINE:100728843) kotlin.jvm.internal.AwS1S1300100_1.s0 java.lang.String, block:B:2:0x0000 */
    public AwS1S1300100_1(C1054104Ah c1054104Ah, C1054104Ah c1054104Ah2, C259800zU<String> c259800zU, SeaPdpViewModel seaPdpViewModel, long j, String str) {
        String str2;
        super(1);
        this.$t = str;
        this.l1 = c1054104Ah;
        this.l2 = c1054104Ah2;
        this.l3 = c259800zU;
        this.j4 = seaPdpViewModel;
        this.s0 = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 9, insn: 0x0000: IPUT (r9 I:int), (r2 I:kotlin.jvm.internal.AwS1S1300100_1) (LINE:100794368) kotlin.jvm.internal.AwS1S1300100_1.$t int, block:B:2:0x0000 */
    public AwS1S1300100_1(Function0 function0, Function0<Unit> function02, C897703f5 c897703f5, Function0<Unit> function03, String str, long j) {
        int i;
        super(1);
        this.$t = i;
        this.l1 = function0;
        this.l2 = function02;
        this.l3 = c897703f5;
        this.s0 = function03;
        this.j4 = str;
    }
}
