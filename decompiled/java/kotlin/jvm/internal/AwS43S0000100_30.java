package kotlin.jvm.internal;

import X.C09AY;
import X.C13BQ;
import X.C20023913Wj;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes31.dex */
public class AwS43S0000100_30 extends C09AY implements Function1 {
    public final int $t;
    public long j0;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
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
    public AwS43S0000100_30(long j, int i) {
        super(1);
        this.$t = i;
        this.j0 = j;
    }

    public static final Object invoke$0(AwS43S0000100_30 awS43S0000100_30, Object obj) {
        Pair pair = (Pair) obj;
        return new Pair(pair.getFirst(), ((Function1) pair.getSecond()).invoke(Long.valueOf(awS43S0000100_30.j0)));
    }

    public static final Object invoke$1(AwS43S0000100_30 awS43S0000100_30, Object obj) {
        boolean z;
        if (((C13BQ) obj).LIZIZ <= awS43S0000100_30.j0) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$2(AwS43S0000100_30 awS43S0000100_30, Object obj) {
        C20023913Wj c20023913Wj = (C20023913Wj) obj;
        c20023913Wj.LIZJ++;
        c20023913Wj.LJ = awS43S0000100_30.j0;
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS43S0000100_30 awS43S0000100_30, Object obj) {
        C20023913Wj c20023913Wj = (C20023913Wj) obj;
        c20023913Wj.LIZIZ++;
        c20023913Wj.LJ = awS43S0000100_30.j0;
        return Unit.LIZ;
    }
}
