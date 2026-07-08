package kotlin.jvm.internal;

import X.AbstractC2270071DtF;
import X.C09AY;
import X.C1502700pCu;
import X.C2270001Dt8;
import X.InterfaceC2270081DtG;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes36.dex */
public class AwS1S2100200_35 extends C09AY implements Function1 {
    public final int $t;
    public long j3;
    public long j4;
    public Object l2;
    public String s0;
    public String s1;

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

    public static final Object invoke$0(AwS1S2100200_35 awS1S2100200_35, Object obj) {
        InterfaceC2270081DtG interfaceC2270081DtGLJJIFFI = AbstractC2270071DtF.LJJIFFI();
        InterfaceC2270081DtG interfaceC2270081DtGLJJIFFI2 = AbstractC2270071DtF.LJJIFFI();
        C2270001Dt8 c2270001Dt8 = (C2270001Dt8) awS1S2100200_35.l2;
        String str = awS1S2100200_35.s0;
        String str2 = awS1S2100200_35.s1;
        c2270001Dt8.getClass();
        ((ArrayList) ((C1502700pCu) obj).LIZ).add(interfaceC2270081DtGLJJIFFI.LIZIZ(interfaceC2270081DtGLJJIFFI2.LIZ(C2270001Dt8.LJJII(str, str2)), Long.valueOf(awS1S2100200_35.j3 - awS1S2100200_35.j4), Long.valueOf(awS1S2100200_35.j3)));
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS1S2100200_35 awS1S2100200_35, Object obj) {
        InterfaceC2270081DtG interfaceC2270081DtGLJJIFFI = AbstractC2270071DtF.LJJIFFI();
        InterfaceC2270081DtG interfaceC2270081DtGLJJIFFI2 = AbstractC2270071DtF.LJJIFFI();
        C2270001Dt8 c2270001Dt8 = (C2270001Dt8) awS1S2100200_35.l2;
        String str = awS1S2100200_35.s0;
        String str2 = awS1S2100200_35.s1;
        c2270001Dt8.getClass();
        ((ArrayList) ((C1502700pCu) obj).LIZ).add(interfaceC2270081DtGLJJIFFI.LIZIZ(interfaceC2270081DtGLJJIFFI2.LIZ(C2270001Dt8.LJJII(str, str2)), Long.valueOf(awS1S2100200_35.j3), Long.valueOf(awS1S2100200_35.j4)));
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS1S2100200_35(C2270001Dt8 c2270001Dt8, String str, String str2, long j, long j2, int i) {
        super(1);
        this.$t = i;
        this.l2 = c2270001Dt8;
        this.s0 = str;
        this.s1 = str2;
        this.j3 = j;
        this.j4 = j2;
    }
}
