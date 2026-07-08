package kotlin.jvm.internal;

import X.AbstractC316870CbV;
import X.C09AY;
import X.C1863240yaQ;
import X.InterfaceC1364105Vn;
import android.view.View;
import com.bytedance.assem.arch.core.Assembler;
import com.ss.android.ugc.aweme.tako.arch.protocol.TakoBaseAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes28.dex */
public class AwS10S0220000_27 extends C09AY implements Function1 {
    public final int $t;
    public Object l0;
    public Object l1;
    public boolean z2;
    public boolean z3;

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

    public static final Object invoke$0(AwS10S0220000_27 awS10S0220000_27, Object obj) {
        Assembler assembler = (Assembler) obj;
        if (((TakoBaseAssem) awS10S0220000_27.l0).Bp() != null) {
            assembler.LQ2((TakoBaseAssem) awS10S0220000_27.l0, new AwS116S0110000_30((View) awS10S0220000_27.l1, awS10S0220000_27.z3, 0));
        }
        if (awS10S0220000_27.z2) {
            assembler.LQ2((TakoBaseAssem) awS10S0220000_27.l0, new AwS609S0100000_30((View) awS10S0220000_27.l1, 89));
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:75:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01b0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$1(kotlin.jvm.internal.AwS10S0220000_27 r7, java.lang.Object r8) {
        /*
            Method dump skipped, instruction units count: 446
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS10S0220000_27.invoke$1(kotlin.jvm.internal.AwS10S0220000_27, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS10S0220000_27(C1863240yaQ c1863240yaQ, C1863240yaQ c1863240yaQ2, boolean z, InterfaceC1364105Vn<? super AbstractC316870CbV<Boolean>> interfaceC1364105Vn, boolean z2) {
        super(1);
        this.$t = z2 ? 1 : 0;
        this.l0 = c1863240yaQ;
        this.z2 = c1863240yaQ2;
        this.l1 = z;
        this.z3 = interfaceC1364105Vn;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS10S0220000_27(TakoBaseAssem takoBaseAssem, TakoBaseAssem<ITEM> takoBaseAssem2, boolean z, View view, boolean z2) {
        super(1);
        this.$t = z2 ? 1 : 0;
        this.l0 = takoBaseAssem;
        this.z2 = takoBaseAssem2;
        this.l1 = z;
        this.z3 = view;
    }
}
