package kotlin.jvm.internal;

import X.C09AY;
import X.C865340Xx6;
import X.C866340Xyi;
import X.InterfaceC863600XuI;
import X.InterfaceC867020Xzo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes15.dex */
public class AwS33S1110000_14 extends C09AY implements Function1 {
    public final int $t;
    public Object l1;
    public String s0;
    public boolean z2;

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

    public static final Object invoke$0(AwS33S1110000_14 awS33S1110000_14, Object obj) {
        ((C865340Xx6) awS33S1110000_14.l1).LIZIZ.invoke(awS33S1110000_14.s0).LJLLL(awS33S1110000_14.z2, (InterfaceC863600XuI) obj);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS33S1110000_14 awS33S1110000_14, Object obj) {
        ((C866340Xyi) awS33S1110000_14.l1).LJJ(awS33S1110000_14.s0).LJLJJI(awS33S1110000_14.z2, (InterfaceC867020Xzo) obj);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS33S1110000_14 awS33S1110000_14, Object obj) {
        ((C865340Xx6) awS33S1110000_14.l1).LIZIZ.invoke(awS33S1110000_14.s0).LJL(awS33S1110000_14.z2, (InterfaceC863600XuI) obj);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS33S1110000_14(C865340Xx6 c865340Xx6, String str, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l1 = c865340Xx6;
        this.s0 = str;
        this.z2 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS33S1110000_14(C866340Xyi c866340Xyi, String str, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l1 = c866340Xyi;
        this.s0 = str;
        this.z2 = z;
    }
}
