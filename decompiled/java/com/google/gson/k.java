package com.google.gson;

import X.C09DL;
import X.C2188811AlT;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.internal.w;
import java.io.IOException;
import java.io.StringWriter;

/* JADX INFO: loaded from: classes4.dex */
public abstract class k {
    public abstract k LIZJ();

    public boolean LJ() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public byte LJFF() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public char LJIIIIZZ() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public double LJIIIZ() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public float LJIIJ() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public int LJIIJJI() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public final h LJIIL() {
        if (this instanceof h) {
            return (h) this;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Not a JSON Array: ");
        sbLIZ.append(this);
        throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public final n LJIILIIL() {
        if (this instanceof n) {
            return (n) this;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Not a JSON Object: ");
        sbLIZ.append(this);
        throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public final q LJIILJJIL() {
        if (this instanceof q) {
            return (q) this;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Not a JSON Primitive: ");
        sbLIZ.append(this);
        throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public long LJIIZILJ() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public Number LJIJ() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public short LJIJI() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public String LJIL() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public final String toString() {
        try {
            StringWriter stringWriter = new StringWriter();
            C09DL c09dl = new C09DL(stringWriter);
            c09dl.LLILZLL = true;
            w.LIZIZ(this, c09dl);
            return stringWriter.toString();
        } catch (IOException e) {
            TryCatchGuardChecker.doCheck(e);
            throw new AssertionError(e);
        }
    }

    public final boolean LJJ() {
        return this instanceof n;
    }

    public final boolean LJJI() {
        return this instanceof q;
    }
}
