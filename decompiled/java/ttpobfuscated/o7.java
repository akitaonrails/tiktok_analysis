package ttpobfuscated;

import X.C13LP;
import X.C1507240pKE;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes24.dex */
public abstract class o7 {
    public static final a l = new a();
    public final ha a;
    public final List<C1507240pKE> b;
    public final int c;
    public final y1 d;
    public final boolean e;
    public final uc f;
    public final tc g;
    public final g h;
    public final byte i;
    public final byte j;
    public final byte k;

    public String a(xc xcVar) {
        return "";
    }

    public abstract tc a(xc xcVar, cc ccVar);

    public g c() {
        return this.h;
    }

    public final y1 d() {
        return this.d;
    }

    public final byte e() {
        return this.i;
    }

    public final byte f() {
        return this.k;
    }

    public final ha g() {
        return this.a;
    }

    public final List<C1507240pKE> h() {
        return this.b;
    }

    public final byte i() {
        return this.j;
    }

    public final tc j() {
        return this.g;
    }

    public final uc k() {
        return this.f;
    }

    public final boolean l() {
        return this.e;
    }

    public final tc a(Object obj) {
        boolean z;
        if (obj != null) {
            z = true;
        } else {
            z = false;
        }
        return a(z);
    }

    public final List<String> b(xc xcVar) {
        return a(xcVar, ((C1507240pKE) ListProtector.get(this.b, 1)).LL);
    }

    public final String c(xc xcVar) {
        return d(xcVar, ((C1507240pKE) ListProtector.get(this.b, 1)).LL);
    }

    public final tc a(boolean z) {
        if (z) {
            return tc.True;
        }
        return tc.False;
    }

    public o7(ha haVar, List<C1507240pKE> list) throws pa {
        this.a = haVar;
        this.b = list;
        if (list.size() == 6) {
            int i = ((C1507240pKE) C13LP.LJJJJZI(list)).LL;
            this.c = i;
            int iA = oa.a(i, 67043328, 16);
            if (haVar.b() == iA) {
                int iA2 = oa.a(i, 7, 0);
                y1 y1VarA = y1.b.a(iA2);
                if (y1VarA != null) {
                    this.d = y1VarA;
                    this.e = oa.a(i, 8, 3) == 1;
                    int iA3 = oa.a(i, 1073741824, 30);
                    uc ucVarA = uc.b.a(iA3);
                    if (ucVarA != null) {
                        this.f = ucVarA;
                        int iA4 = oa.a(i, 240, 4);
                        tc tcVarA = tc.b.a(iA4);
                        if (tcVarA != null) {
                            this.g = tcVarA;
                            this.h = g.Base;
                            this.i = (byte) oa.a(i, 1006632960, 26);
                            this.j = (byte) oa.a(i, 65280, 8);
                            this.k = (byte) oa.a(i, 65280, 8);
                            return;
                        }
                        throw new pa("Unexpected ReturnCode value [" + ((Object) C1507240pKE.LIZJ(iA4)) + ']');
                    }
                    throw new pa("Unexpected ReturnCodeComparison value [" + ((Object) C1507240pKE.LIZJ(iA3)) + ']');
                }
                throw new pa("Unexpected ControlFlow value [" + ((Object) C1507240pKE.LIZJ(iA2)) + ']');
            }
            throw new pa("Unexpected OpCode value [" + ((Object) C1507240pKE.LIZJ(iA)) + "], expected [" + ((Object) C1507240pKE.LIZJ(haVar.b())) + ']');
        }
        throw new pa("Number of operands [" + list.size() + "] is wrong. Must be [6]");
    }

    public final List<String> a(xc xcVar, int i) {
        Object objA = xcVar.a(i, this.i, g3.ArrayOfStrings);
        if (objA instanceof List) {
            return (List) objA;
        }
        return null;
    }

    public final float b(xc xcVar, int i) {
        return ((Float) xcVar.a(i, this.i, g3.Float)).floatValue();
    }

    public final int c(xc xcVar, int i) {
        return ((Integer) xcVar.a(i, this.i, g3.Int32)).intValue();
    }

    public final String d(xc xcVar, int i) {
        return (String) xcVar.a(i, this.i, g3.String);
    }

    public static final class a {
        public final List<C1507240pKE> a(ha haVar, byte b, byte b2, y1 y1Var, boolean z, uc ucVar, tc tcVar, List<C1507240pKE> list) throws pa {
            if (b <= 15) {
                return C13LP.LJLIL(list, Collections.singletonList(new C1507240pKE((haVar.a << 16) | (b << 26) | (b2 << 8) | (tcVar.a << 4) | ((z ? 1 : 0) << 3) | y1Var.a | (ucVar.a << 30))));
            }
            throw new pa("Unexpected dataFlowTable value [" + ((int) b) + "]. Must be less than [16]");
        }

        public static /* synthetic */ List a(a aVar, ha haVar, byte b, byte b2, y1 y1Var, boolean z, uc ucVar, tc tcVar, List list, int i, Object obj) {
            if ((i & 32) != 0) {
                ucVar = uc.Equal;
            }
            return aVar.a(haVar, b, b2, y1Var, z, ucVar, tcVar, list);
        }
    }
}
