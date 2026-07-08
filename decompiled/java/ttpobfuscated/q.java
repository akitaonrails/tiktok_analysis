package ttpobfuscated;

import X.C13IQ;
import X.C13LE;
import X.C1507240pKE;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import ttpobfuscated.ed;

/* JADX INFO: loaded from: classes24.dex */
public final class q extends o7 {
    public final s m;

    public final ed.b d(xc xcVar) {
        return new ed.b(b(xcVar, ((C1507240pKE) ListProtector.get(this.b, 3)).LL));
    }

    public final ed.c e(xc xcVar) {
        return new ed.c(c(xcVar, ((C1507240pKE) ListProtector.get(this.b, 3)).LL));
    }

    public final ed.d f(xc xcVar) {
        return new ed.d(TimeUnit.SECONDS.toMillis(c(xcVar, ((C1507240pKE) ListProtector.get(this.b, 3)).LL)));
    }

    public final ed.g g(xc xcVar) {
        return new ed.g(b(xcVar, ((C1507240pKE) ListProtector.get(this.b, 3)).LL));
    }

    public final ed.h h(xc xcVar) {
        float fB = b(xcVar, ((C1507240pKE) ListProtector.get(this.b, 3)).LL);
        int iC = c(xcVar, ((C1507240pKE) ListProtector.get(this.b, 4)).LL);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        return new ed.h(timeUnit.toMillis(iC >> 16), timeUnit.toMillis((short) iC), fB, c(xcVar, ((C1507240pKE) ListProtector.get(this.b, 5)).LL));
    }

    public q(List<C1507240pKE> list, s sVar) {
        super(ha.BucketConfig, list);
        this.m = sVar;
    }

    @Override // ttpobfuscated.o7
    public tc a(xc xcVar, cc ccVar) {
        ed edVarD;
        String string = kotlin.text.a0.LJLIIIL(c(xcVar).toLowerCase(Locale.ROOT)).toString();
        if (!new Regex("(\\w+\\.)*(\\w+)").matches(string)) {
            return tc.Undefined;
        }
        C13IQ<? extends ed> c13iqA = ed.b.a(c(xcVar, ((C1507240pKE) ListProtector.get(this.b, 2)).LL));
        if (c13iqA == null) {
            return tc.Undefined;
        }
        if (Intrinsics.LJFF(c13iqA, C13LE.LIZ(ed.f.class))) {
            edVarD = ed.f.c;
        } else if (Intrinsics.LJFF(c13iqA, C13LE.LIZ(ed.a.class))) {
            edVarD = ed.a.c;
        } else if (Intrinsics.LJFF(c13iqA, C13LE.LIZ(ed.g.class))) {
            edVarD = g(xcVar);
        } else if (Intrinsics.LJFF(c13iqA, C13LE.LIZ(ed.h.class))) {
            edVarD = h(xcVar);
        } else if (Intrinsics.LJFF(c13iqA, C13LE.LIZ(ed.c.class))) {
            edVarD = e(xcVar);
        } else if (Intrinsics.LJFF(c13iqA, C13LE.LIZ(ed.d.class))) {
            edVarD = f(xcVar);
        } else if (Intrinsics.LJFF(c13iqA, C13LE.LIZ(ed.b.class))) {
            edVarD = d(xcVar);
        } else {
            return tc.Undefined;
        }
        this.m.a(new p(string, edVarD));
        return tc.True;
    }
}
