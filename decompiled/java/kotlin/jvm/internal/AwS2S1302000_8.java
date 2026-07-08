package kotlin.jvm.internal;

import X.C09AY;
import X.C1667500tUi;
import X.C1668720tWg;
import X.C341440Da2;
import X.EnumC1668730tWh;
import X.InterfaceC1680500tpg;
import X.InterfaceC1685750ty9;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes9.dex */
public class AwS2S1302000_8 extends C09AY implements Function2 {
    public final int $t;
    public int i4;
    public int i5;
    public Object l1;
    public Object l2;
    public Object l3;
    public String s0;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS2S1302000_8 awS2S1302000_8, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        C1668720tWg.LIZJ((EnumC1668730tWh) awS2S1302000_8.l1, awS2S1302000_8.i4, awS2S1302000_8.s0, (Function0) awS2S1302000_8.l2, (Function0) awS2S1302000_8.l3, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(awS2S1302000_8.i5 | 1));
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS2S1302000_8 awS2S1302000_8, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        ((C1667500tUi) awS2S1302000_8.l1).LIZIZ(awS2S1302000_8.s0, (Function1) awS2S1302000_8.l2, (InterfaceC1685750ty9) awS2S1302000_8.l3, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(awS2S1302000_8.i4 | 1), awS2S1302000_8.i5);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS2S1302000_8(C1667500tUi c1667500tUi, C1667500tUi c1667500tUi2, String str, Function1<? super String, AwemeDraft> function1, InterfaceC1685750ty9 interfaceC1685750ty9, int i, int i2) {
        super(2);
        this.$t = i2;
        this.l1 = c1667500tUi;
        this.s0 = c1667500tUi2;
        this.l2 = str;
        this.l3 = function1;
        this.i4 = interfaceC1685750ty9;
        this.i5 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS2S1302000_8(EnumC1668730tWh enumC1668730tWh, EnumC1668730tWh enumC1668730tWh2, int i, String str, Function0<Unit> function0, Function0<Unit> function02, int i2) {
        super(2);
        this.$t = i2;
        this.l1 = enumC1668730tWh;
        this.i4 = enumC1668730tWh2;
        this.s0 = i;
        this.l2 = str;
        this.l3 = function0;
        this.i5 = function02;
    }
}
