package kotlin.jvm.internal;

import X.C09AY;
import X.C1661930tLj;
import X.C1666810tTb;
import X.C1675730thz;
import X.C1688970u3L;
import X.C2016007v4;
import X.C341440Da2;
import X.InterfaceC1461640o8g;
import X.InterfaceC1660090tIl;
import X.InterfaceC1660190tIv;
import X.InterfaceC1680500tpg;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.content.cell.LanguageVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes26.dex */
public class AwS2S0221000_25 extends C09AY implements Function2 {
    public final int $t;
    public int i4;
    public Object l0;
    public Object l1;
    public boolean z2;
    public boolean z3;

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

    public static final Object invoke$0(AwS2S0221000_25 awS2S0221000_25, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        C1688970u3L.LIZ((C2016007v4) awS2S0221000_25.l0, awS2S0221000_25.z2, awS2S0221000_25.z3, (LanguageVM) awS2S0221000_25.l1, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(awS2S0221000_25.i4 | 1));
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS2S0221000_25 awS2S0221000_25, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        C1666810tTb.LJFF(awS2S0221000_25.z2, (C1661930tLj) awS2S0221000_25.l0, awS2S0221000_25.z3, (Function2) awS2S0221000_25.l1, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(awS2S0221000_25.i4 | 1));
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS2S0221000_25 awS2S0221000_25, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        C1675730thz.LJIIIIZZ(awS2S0221000_25.z2, awS2S0221000_25.z3, (Function0) awS2S0221000_25.l0, (Function0) awS2S0221000_25.l1, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(awS2S0221000_25.i4 | 1));
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS2S0221000_25(C2016007v4 c2016007v4, boolean z, boolean z2, LanguageVM languageVM, int i, int i2) {
        super(2);
        this.$t = i2;
        this.l0 = c2016007v4;
        this.z2 = z;
        this.z3 = z2;
        this.l1 = languageVM;
        this.i4 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS2S0221000_25(boolean z, boolean z2, C1661930tLj<InterfaceC1660190tIv, InterfaceC1461640o8g<? extends InterfaceC1660190tIv>> c1661930tLj, boolean z3, Function2<? super InterfaceC1660190tIv, ? super InterfaceC1660090tIl, Unit> function2, int i) {
        super(2);
        this.$t = i;
        this.z2 = z;
        this.l0 = z2;
        this.z3 = c1661930tLj;
        this.l1 = z3;
        this.i4 = function2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS2S0221000_25(boolean z, boolean z2, boolean z3, Function0<Unit> function0, Function0<Unit> function02, int i) {
        super(2);
        this.$t = i;
        this.z2 = z;
        this.z3 = z2;
        this.l0 = z3;
        this.l1 = function0;
        this.i4 = function02;
    }
}
