package kotlin.jvm.internal;

import X.C09AY;
import X.C1808590xAH;
import X.C1861040yWs;
import X.C291001Au;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes28.dex */
public class AwS8S1000100_27 extends C09AY implements Function1 {
    public final int $t;
    public long j1;
    public String s0;

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

    public static final Object invoke$0(AwS8S1000100_27 awS8S1000100_27, Object obj) {
        C1861040yWs c1861040yWs = (C1861040yWs) obj;
        long j = c1861040yWs.LLJJJJLIIL;
        long j2 = awS8S1000100_27.j1;
        return C1861040yWs.LIZ(c1861040yWs, null, false, false, null, null, false, false, null, null, false, 0L, false, null, null, null, null, null, null, false, null, false, null, j + j2, new C291001Au(new Pair(awS8S1000100_27.s0, Long.valueOf(j2))), null, null, null, null, 1023410175);
    }

    public static final Object invoke$1(AwS8S1000100_27 awS8S1000100_27, Object obj) {
        boolean z;
        C1808590xAH c1808590xAH = (C1808590xAH) obj;
        if (Intrinsics.LJFF(c1808590xAH.LIZ, awS8S1000100_27.s0) && c1808590xAH.LIZIZ < awS8S1000100_27.j1) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$2(AwS8S1000100_27 awS8S1000100_27, Object obj) {
        boolean z;
        C1808590xAH c1808590xAH = (C1808590xAH) obj;
        if (Intrinsics.LJFF(c1808590xAH.LIZ, awS8S1000100_27.s0) && c1808590xAH.LIZIZ < awS8S1000100_27.j1) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS8S1000100_27(long j, String str, int i) {
        super(1);
        this.$t = i;
        this.j1 = j;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS8S1000100_27(String str, long j, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.j1 = j;
    }
}
