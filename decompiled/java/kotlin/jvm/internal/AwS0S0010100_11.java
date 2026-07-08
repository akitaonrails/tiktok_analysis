package kotlin.jvm.internal;

import X.C09AY;
import X.C0SYL;
import X.C618720OOo;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes12.dex */
public class AwS0S0010100_11 extends C09AY implements Function1 {
    public final int $t;
    public long j1;
    public boolean z0;

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

    public static final Object invoke$0(AwS0S0010100_11 awS0S0010100_11, Object obj) {
        String strLIZ = C618720OOo.LIZ(awS0S0010100_11.j1);
        boolean z = awS0S0010100_11.z0;
        obj.getClass();
        return new C0SYL(strLIZ, z);
    }

    public static final Object invoke$1(AwS0S0010100_11 awS0S0010100_11, Object obj) {
        String strLIZ = C618720OOo.LIZ(awS0S0010100_11.j1);
        boolean z = awS0S0010100_11.z0;
        obj.getClass();
        return new C0SYL(strLIZ, z);
    }

    public static final Object invoke$2(AwS0S0010100_11 awS0S0010100_11, Object obj) {
        String strLIZ = C618720OOo.LIZ(awS0S0010100_11.j1);
        boolean z = awS0S0010100_11.z0;
        obj.getClass();
        return new C0SYL(strLIZ, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS0S0010100_11(long j, boolean z, int i) {
        super(1);
        this.$t = i;
        this.j1 = j;
        this.z0 = z;
    }
}
