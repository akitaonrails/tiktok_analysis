package kotlin.jvm.internal;

import X.C09AY;
import X.C13MP;
import X.C20165313vH;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes31.dex */
public class AwS2S0300200_30 extends C09AY implements Function0 {
    public final int $t;
    public long j3;
    public long j4;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS2S0300200_30 awS2S0300200_30) {
        C20165313vH.LIZJ(awS2S0300200_30.j3, awS2S0300200_30.j4, (C13MP) awS2S0300200_30.l0, (byte[]) awS2S0300200_30.l1, (byte[]) awS2S0300200_30.l2);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS2S0300200_30 awS2S0300200_30) {
        C20165313vH.LJ(awS2S0300200_30.j3, awS2S0300200_30.j4, (C13MP) awS2S0300200_30.l0, (byte[]) awS2S0300200_30.l1, (byte[]) awS2S0300200_30.l2);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS2S0300200_30(long j, long j2, C13MP c13mp, byte[] bArr, byte[] bArr2, int i) {
        super(0);
        this.$t = i;
        this.l0 = c13mp;
        this.l1 = bArr;
        this.l2 = bArr2;
        this.j3 = j;
        this.j4 = j2;
    }
}
