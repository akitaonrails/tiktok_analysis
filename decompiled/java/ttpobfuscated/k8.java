package ttpobfuscated;

import X.C1954807lC;
import X.C786410Ut5;
import java.util.Arrays;
import ttpobfuscated.m8;

/* JADX INFO: loaded from: classes24.dex */
public final class k8 extends r4 {
    public final m8 a;

    public k8() {
        this(m8.b.b);
    }

    public final m8 a() {
        return this.a;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public k8(m8 m8Var) {
        String strJ4;
        if (m8Var instanceof m8.b) {
            strJ4 = "An error occurred on framework app";
        } else if (m8Var instanceof m8.c) {
            m8.c cVar = (m8.c) m8Var;
            strJ4 = C786410Ut5.j4("Parse error. An \"%s\" was expected but a \"%s\" was received for key \"%s\"", Arrays.copyOf(new Object[]{cVar.e().b(), cVar.f().b(), cVar.a()}, 3));
        } else if (m8Var instanceof m8.a) {
            m8.a aVar = (m8.a) m8Var;
            strJ4 = C786410Ut5.j4("Encoding error. Invalid key \"%s\" value \"%s\"", Arrays.copyOf(new Object[]{aVar.a(), aVar.d()}, 2));
        } else if (m8Var instanceof m8.d) {
            strJ4 = C786410Ut5.j4("Parse error. No \"%s\" key found", Arrays.copyOf(new Object[]{m8Var.a()}, 1));
        } else {
            throw new C1954807lC();
        }
        super(strJ4);
        this.a = m8Var;
    }
}
