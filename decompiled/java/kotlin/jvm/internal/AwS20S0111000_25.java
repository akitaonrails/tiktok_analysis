package kotlin.jvm.internal;

import X.C09AY;
import X.C11IR;
import X.C11NZ;
import X.C1670840ta6;
import X.C1670870ta9;
import X.C1683170ttz;
import X.C1691920u86;
import X.C1692140u8S;
import X.C2219091BtD;
import X.C341440Da2;
import X.InterfaceC1680500tpg;
import Y.AfS13S0111000_25;
import Y.AkS10S0010000_25;
import com.ss.android.ugc.aweme.filter.repository.internal.main.a;
import com.ss.android.ugc.aweme.tako.aivideo.detail.assem.TakoAIVideoInputAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import y5o.n0;

/* JADX INFO: loaded from: classes26.dex */
public class AwS20S0111000_25 extends C09AY implements Function2 {
    public final int $t;
    public int i2;
    public Object l0;
    public boolean z1;

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
            case 4:
                return invoke$4(this, obj, obj2);
            case 5:
                return invoke$5(this, obj, obj2);
            case 6:
                return invoke$6(this, obj, obj2);
            case 7:
                return invoke$7(this, obj, obj2);
            case 8:
                return invoke$8(this, obj, obj2);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS20S0111000_25 awS20S0111000_25, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        ((TakoAIVideoInputAssem) awS20S0111000_25.l0).Jo(awS20S0111000_25.z1, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(awS20S0111000_25.i2 | 1));
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS20S0111000_25 awS20S0111000_25, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        ((TakoAIVideoInputAssem) awS20S0111000_25.l0).No(awS20S0111000_25.z1, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(awS20S0111000_25.i2 | 1));
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS20S0111000_25 awS20S0111000_25, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        ((TakoAIVideoInputAssem) awS20S0111000_25.l0).No(awS20S0111000_25.z1, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(awS20S0111000_25.i2 | 1));
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS20S0111000_25 awS20S0111000_25, Object obj, Object obj2) {
        C11NZ c11nz = (C11NZ) obj;
        C11NZ c11nz2 = (C11NZ) obj2;
        if (awS20S0111000_25.z1) {
            C2219091BtD.LIZLLL().d("viki filter, DefaultFilterRepository#fetchDataWithReturn -> withCache");
        }
        return c11nz2.LJJJ(new AkS10S0010000_25(awS20S0111000_25.z1, 1), false).LJJLIIIJ(C11IR.LL).LJLI(c11nz.LJJIJIIJIL(new AfS13S0111000_25(awS20S0111000_25.z1, (a) awS20S0111000_25.l0, awS20S0111000_25.i2, 1)));
    }

    public static final Object invoke$4(AwS20S0111000_25 awS20S0111000_25, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        C1683170ttz.LIZ(awS20S0111000_25.z1, (Function0) awS20S0111000_25.l0, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(awS20S0111000_25.i2 | 1));
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS20S0111000_25 awS20S0111000_25, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        C1670840ta6.LIZIZ(awS20S0111000_25.z1, (Function0) awS20S0111000_25.l0, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(awS20S0111000_25.i2 | 1));
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS20S0111000_25 awS20S0111000_25, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        C1691920u86.LIZLLL((C1692140u8S) awS20S0111000_25.l0, awS20S0111000_25.z1, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(awS20S0111000_25.i2 | 1));
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS20S0111000_25 awS20S0111000_25, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        ((n0) awS20S0111000_25.l0).LLLLLLZ(awS20S0111000_25.z1, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(awS20S0111000_25.i2 | 1));
        return Unit.LIZ;
    }

    public static final Object invoke$8(AwS20S0111000_25 awS20S0111000_25, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        C1670870ta9.LIZLLL(awS20S0111000_25.z1, (Function0) awS20S0111000_25.l0, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(awS20S0111000_25.i2 | 1));
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS20S0111000_25(int i, boolean z, Function0 function0, int i2) {
        super(2);
        this.$t = i2;
        this.z1 = z;
        this.l0 = function0;
        this.i2 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS20S0111000_25(C1692140u8S c1692140u8S, boolean z, int i, int i2) {
        super(2);
        this.$t = i2;
        this.l0 = c1692140u8S;
        this.z1 = z;
        this.i2 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS20S0111000_25(TakoAIVideoInputAssem takoAIVideoInputAssem, boolean z, int i, int i2) {
        super(2);
        this.$t = i2;
        this.l0 = takoAIVideoInputAssem;
        this.z1 = z;
        this.i2 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS20S0111000_25(n0 n0Var, boolean z, int i, int i2) {
        super(2);
        this.$t = i2;
        this.l0 = n0Var;
        this.z1 = z;
        this.i2 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS20S0111000_25(boolean z, a aVar, int i, int i2) {
        super(2);
        this.$t = i2;
        this.z1 = z;
        this.l0 = aVar;
        this.i2 = i;
    }
}
