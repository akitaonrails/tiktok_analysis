package kotlin.jvm.internal;

import X.C013C;
import X.C09AE;
import X.C09AY;
import X.C0CUZ;
import X.C0PEM;
import X.C1862330yYx;
import X.C1863760ybG;
import X.C1DFH;
import X.C2107308Nj;
import X.C2188811AlT;
import X.C23250099c;
import X.C259800zU;
import X.C324930CoV;
import X.EnumC314460CUi;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import com.ss.android.ugc.aweme.tako.model.TakoEnterParams;
import com.ss.android.ugc.aweme.tako.ui.TakoChatActivity;
import com.ss.android.ugc.aweme.tako.ui.TakoChatRootFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
public class AwS36S0200100_4 extends C09AY implements Function0 {
    public final int $t;
    public long j2;
    public Object l0;
    public Object l1;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS36S0200100_4 awS36S0200100_4) {
        String str;
        C09AE c09ae = (C09AE) ((C259800zU) awS36S0200100_4.l0).element;
        String str2 = null;
        if (c09ae != null) {
            c09ae.LIZIZ(null);
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - awS36S0200100_4.j2;
        C1862330yYx c1862330yYx = C1862330yYx.LIZ;
        TakoEnterParams takoEnterParamsDN1 = ((TakoChatActivity) awS36S0200100_4.l1).DN1();
        if (takoEnterParamsDN1 != null) {
            str2 = takoEnterParamsDN1.enterFrom;
        }
        String str3 = "";
        if (str2 == null) {
            str2 = "";
        }
        TakoEnterParams takoEnterParamsDN12 = ((TakoChatActivity) awS36S0200100_4.l1).DN1();
        if (takoEnterParamsDN12 != null && (str = takoEnterParamsDN12.enterMethod) != null) {
            str3 = str;
        }
        C1862330yYx.LJJLIIIJLLLLLLLZ(c1862330yYx, str2, str3, jCurrentTimeMillis);
        ((TakoChatActivity) awS36S0200100_4.l1).finish();
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS36S0200100_4 awS36S0200100_4) {
        String str;
        TakoEnterParams takoEnterParamsDN1 = ((TakoChatActivity) awS36S0200100_4.l0).DN1();
        if (takoEnterParamsDN1 != null) {
            str = takoEnterParamsDN1.processId;
        } else {
            str = null;
        }
        C1863760ybG.LJ(str);
        LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope((TakoChatActivity) awS36S0200100_4.l0);
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(lifecycleScope, C2107308Nj.LIZ, null, new C324930CoV((TakoChatActivity) awS36S0200100_4.l0, awS36S0200100_4.j2, (C013C) awS36S0200100_4.l1, null), 2);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS36S0200100_4 awS36S0200100_4) {
        String str;
        C09AE c09ae = (C09AE) ((C259800zU) awS36S0200100_4.l0).element;
        String str2 = null;
        if (c09ae != null) {
            c09ae.LIZIZ(null);
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - awS36S0200100_4.j2;
        C1862330yYx c1862330yYx = C1862330yYx.LIZ;
        TakoEnterParams takoEnterParams = ((TakoChatRootFragment) awS36S0200100_4.l1).LLJJ;
        if (takoEnterParams != null) {
            str2 = takoEnterParams.enterFrom;
        }
        String str3 = "";
        if (str2 == null) {
            str2 = "";
        }
        if (takoEnterParams != null && (str = takoEnterParams.enterMethod) != null) {
            str3 = str;
        }
        C1862330yYx.LJJLIIIJLLLLLLLZ(c1862330yYx, str2, str3, jCurrentTimeMillis);
        ((TakoChatRootFragment) awS36S0200100_4.l1).finish();
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS36S0200100_4 awS36S0200100_4) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("forceShowShopTab_process: stage[");
        sbLIZ.append(((C0CUZ) awS36S0200100_4.l0).getValue());
        sbLIZ.append("], step[");
        sbLIZ.append(((EnumC314460CUi) awS36S0200100_4.l1).getValue());
        sbLIZ.append("], duration[");
        sbLIZ.append(awS36S0200100_4.j2);
        sbLIZ.append(']');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 6, insn: 0x0007: IPUT (r6 I:java.lang.Object), (r1 I:kotlin.jvm.internal.AwS36S0200100_4) (LINE:67108871) kotlin.jvm.internal.AwS36S0200100_4.l1 java.lang.Object, block:B:2:0x0000 */
    public AwS36S0200100_4(C259800zU c259800zU, C259800zU<C09AE> c259800zU2, long j, TakoChatActivity takoChatActivity) {
        Object obj;
        super(0);
        this.$t = takoChatActivity;
        this.l0 = c259800zU;
        this.j2 = c259800zU2;
        this.l1 = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 6, insn: 0x0007: IPUT (r6 I:java.lang.Object), (r1 I:kotlin.jvm.internal.AwS36S0200100_4) (LINE:67174407) kotlin.jvm.internal.AwS36S0200100_4.l1 java.lang.Object, block:B:2:0x0000 */
    public AwS36S0200100_4(C259800zU c259800zU, C259800zU<C09AE> c259800zU2, long j, TakoChatRootFragment takoChatRootFragment) {
        Object obj;
        super(0);
        this.$t = takoChatRootFragment;
        this.l0 = c259800zU;
        this.j2 = c259800zU2;
        this.l1 = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS36S0200100_4(C0CUZ c0cuz, EnumC314460CUi enumC314460CUi, long j, int i) {
        super(0);
        this.$t = i;
        this.l0 = c0cuz;
        this.l1 = enumC314460CUi;
        this.j2 = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS36S0200100_4(TakoChatActivity takoChatActivity, long j, C013C c013c, int i) {
        super(0);
        this.$t = i;
        this.l0 = takoChatActivity;
        this.j2 = j;
        this.l1 = c013c;
    }
}
