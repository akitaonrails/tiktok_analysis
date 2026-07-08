package kotlin.jvm.internal;

import X.C05YF;
import X.C09AY;
import X.InterfaceC1630630sXF;
import X.InterfaceC1649820t2C;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes9.dex */
public class AwS238S0000000_8 extends C09AY implements Function1 {
    public final int $t;

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS238S0000000_8(int i) {
        super(1);
        this.$t = i;
    }

    public static /* bridge */ /* synthetic */ Object invoke$0(AwS238S0000000_8 awS238S0000000_8, Object obj) {
        ((InterfaceC1630630sXF) ((C05YF) obj)).aD(8);
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$1(AwS238S0000000_8 awS238S0000000_8, Object obj) {
        ((InterfaceC1649820t2C) ((C05YF) obj)).V2(false);
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$2(AwS238S0000000_8 awS238S0000000_8, Object obj) {
        ((InterfaceC1649820t2C) ((C05YF) obj)).V2(true);
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$3(AwS238S0000000_8 awS238S0000000_8, Object obj) {
        ((InterfaceC1649820t2C) ((C05YF) obj)).V2(true);
        return Unit.LIZ;
    }
}
