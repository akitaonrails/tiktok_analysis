package kotlin.jvm.internal;

import X.C09AY;
import X.C0XFZ;
import X.C845590XFd;
import X.EnumC845610XFf;
import X.EnumC845640XFi;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes14.dex */
public class AwS9S0110100_13 extends C09AY implements Function1 {
    public final int $t;
    public long j2;
    public Object l0;
    public boolean z1;

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

    public static final Object invoke$0(AwS9S0110100_13 awS9S0110100_13, Object obj) {
        C845590XFd c845590XFd = C845590XFd.LIZ;
        EnumC845640XFi enumC845640XFi = EnumC845640XFi.PROVIDER;
        long j = awS9S0110100_13.j2;
        boolean z = awS9S0110100_13.z1;
        EnumC845610XFf enumC845610XFf = (EnumC845610XFf) awS9S0110100_13.l0;
        c845590XFd.getClass();
        C845590XFd.LIZIZ((C0XFZ) obj, enumC845640XFi, j, z, enumC845610XFf);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS9S0110100_13 awS9S0110100_13, Object obj) {
        C845590XFd c845590XFd = C845590XFd.LIZ;
        EnumC845640XFi enumC845640XFi = EnumC845640XFi.BLOB;
        long j = awS9S0110100_13.j2;
        boolean z = awS9S0110100_13.z1;
        EnumC845610XFf enumC845610XFf = (EnumC845610XFf) awS9S0110100_13.l0;
        c845590XFd.getClass();
        C845590XFd.LIZIZ((C0XFZ) obj, enumC845640XFi, j, z, enumC845610XFf);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS9S0110100_13(long j, EnumC845610XFf enumC845610XFf, boolean z, int i) {
        super(1);
        this.$t = i;
        this.j2 = j;
        this.z1 = z;
        this.l0 = enumC845610XFf;
    }
}
