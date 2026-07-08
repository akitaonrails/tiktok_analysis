package kotlin.jvm.internal;

import X.C09AY;
import X.C1023640ckE;
import X.C1486605rs;
import X.C1D2K;
import X.InterfaceC2277271EBp;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes36.dex */
public class AwS61S0100100_35 extends C09AY implements Function1 {
    public final int $t;
    public long j1;
    public Object l0;

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

    public static final Object invoke$0(AwS61S0100100_35 awS61S0100100_35, Object obj) {
        C1023640ckE c1023640ckE = (C1023640ckE) obj;
        C1D2K.LIZ.getClass();
        c1023640ckE.withParam(C1D2K.LIZLLL, Long.valueOf(awS61S0100100_35.j1));
        c1023640ckE.withParam(C1D2K.LIZJ, ((C1486605rs) awS61S0100100_35.l0).LIZIZ);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS61S0100100_35 awS61S0100100_35, Object obj) {
        InterfaceC2277271EBp interfaceC2277271EBp = (InterfaceC2277271EBp) obj;
        String str = (String) ((Object[]) awS61S0100100_35.l0)[0];
        if (str == null) {
            str = "";
        }
        interfaceC2277271EBp.LJII(awS61S0100100_35.j1, str);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS61S0100100_35(long j, C1486605rs c1486605rs, int i) {
        super(1);
        this.$t = i;
        this.j1 = j;
        this.l0 = c1486605rs;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS61S0100100_35(Object[] objArr, long j, int i) {
        super(1);
        this.$t = i;
        this.l0 = objArr;
        this.j1 = j;
    }
}
