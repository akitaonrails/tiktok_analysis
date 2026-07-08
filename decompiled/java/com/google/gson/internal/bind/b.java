package com.google.gson.internal.bind;

import X.C09DL;
import X.C2188811AlT;
import com.google.gson.h;
import com.google.gson.k;
import com.google.gson.m;
import com.google.gson.n;
import com.google.gson.q;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends C09DL {
    public static final a LLJJ = new a();
    public static final q LLJJI = new q("closed");
    public final List<k> LLJILJIL;
    public String LLJILJILJ;
    public k LLJILLL;

    public static class a extends Writer {
        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            throw new AssertionError();
        }

        @Override // java.io.Writer, java.io.Flushable
        public final void flush() {
            throw new AssertionError();
        }

        @Override // java.io.Writer
        public final void write(char[] cArr, int i, int i2) {
            throw new AssertionError();
        }
    }

    @Override // X.C09DL, java.io.Flushable
    public final void flush() {
    }

    public b() {
        super(LLJJ);
        this.LLJILJIL = new ArrayList();
        this.LLJILLL = m.LL;
    }

    @Override // X.C09DL
    public final void LIZIZ() {
        h hVar = new h();
        LJJLIIIJ(hVar);
        ((ArrayList) this.LLJILJIL).add(hVar);
    }

    @Override // X.C09DL
    public final void LIZLLL() {
        n nVar = new n();
        LJJLIIIJ(nVar);
        ((ArrayList) this.LLJILJIL).add(nVar);
    }

    @Override // X.C09DL
    public final C09DL LJI() {
        if (((ArrayList) this.LLJILJIL).isEmpty() || this.LLJILJILJ != null) {
            throw new IllegalStateException();
        }
        if (!(LJJL() instanceof h)) {
            throw new IllegalStateException();
        }
        ((ArrayList) this.LLJILJIL).remove(((ArrayList) r1).size() - 1);
        return this;
    }

    @Override // X.C09DL
    public final C09DL LJII() {
        if (((ArrayList) this.LLJILJIL).isEmpty() || this.LLJILJILJ != null) {
            throw new IllegalStateException();
        }
        if (!(LJJL() instanceof n)) {
            throw new IllegalStateException();
        }
        ((ArrayList) this.LLJILJIL).remove(((ArrayList) r1).size() - 1);
        return this;
    }

    @Override // X.C09DL
    public final C09DL LJIJJ() {
        LJJLIIIJ(m.LL);
        return this;
    }

    public final k LJJJZ() {
        if (((ArrayList) this.LLJILJIL).isEmpty()) {
            return this.LLJILLL;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Expected one JSON element but was ");
        sbLIZ.append(this.LLJILJIL);
        throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public final k LJJL() {
        return (k) ((ArrayList) this.LLJILJIL).get(((ArrayList) r1).size() - 1);
    }

    @Override // X.C09DL, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (!((ArrayList) this.LLJILJIL).isEmpty()) {
            throw new IOException("Incomplete document");
        }
        ((ArrayList) this.LLJILJIL).add(LLJJI);
    }

    @Override // X.C09DL
    public final C09DL LJIILLIIL(String str) {
        if (!((ArrayList) this.LLJILJIL).isEmpty() && this.LLJILJILJ == null) {
            if (LJJL() instanceof n) {
                this.LLJILJILJ = str;
                return this;
            }
            throw new IllegalStateException();
        }
        throw new IllegalStateException();
    }

    @Override // X.C09DL
    public final void LJJIL(double d) {
        if (this.LLILZLL || (!Double.isNaN(d) && !Double.isInfinite(d))) {
            LJJLIIIJ(new q((Number) Double.valueOf(d)));
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("JSON forbids NaN and infinities: ");
        sbLIZ.append(d);
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.C09DL
    public final void LJJIZ(long j) {
        LJJLIIIJ(new q((Number) Long.valueOf(j)));
    }

    @Override // X.C09DL
    public final void LJJJ(Boolean bool) {
        if (bool == null) {
            LJJLIIIJ(m.LL);
        } else {
            LJJLIIIJ(new q(bool));
        }
    }

    @Override // X.C09DL
    public final void LJJJJ(Number number) {
        if (number == null) {
            LJJLIIIJ(m.LL);
            return;
        }
        if (!this.LLILZLL) {
            double dDoubleValue = number.doubleValue();
            if (Double.isNaN(dDoubleValue) || Double.isInfinite(dDoubleValue)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("JSON forbids NaN and infinities: ");
                sbLIZ.append(number);
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
        }
        LJJLIIIJ(new q(number));
    }

    @Override // X.C09DL
    public final void LJJJJJ(String str) {
        if (str == null) {
            LJJLIIIJ(m.LL);
        } else {
            LJJLIIIJ(new q(str));
        }
    }

    @Override // X.C09DL
    public final void LJJJJJL(boolean z) {
        LJJLIIIJ(new q(Boolean.valueOf(z)));
    }

    public final void LJJLIIIJ(k kVar) {
        if (this.LLJILJILJ != null) {
            kVar.getClass();
            if (!(kVar instanceof m) || this.LLJ) {
                ((n) LJJL()).LJJIFFI(this.LLJILJILJ, kVar);
            }
            this.LLJILJILJ = null;
            return;
        }
        if (((ArrayList) this.LLJILJIL).isEmpty()) {
            this.LLJILLL = kVar;
            return;
        }
        k kVarLJJL = LJJL();
        if (kVarLJJL instanceof h) {
            ((h) kVarLJJL).LJJIFFI(kVar);
            return;
        }
        throw new IllegalStateException();
    }
}
