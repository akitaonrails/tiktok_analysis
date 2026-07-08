package ttpobfuscated;

import X.C09AY;
import X.C13IQ;
import X.C13LE;
import X.C13LP;
import X.C1507240pKE;
import X.C1507270pKH;
import X.C1697810uHb;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.nio.ByteOrder;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ttp.orbu.sdk.requestvalidator.OrbuResult;
import ttpobfuscated.ed;
import ttpobfuscated.p7;

/* JADX INFO: loaded from: classes24.dex */
public final class sa implements ib {
    public StringBuilder a;
    public Throwable b;

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;
        public static final /* synthetic */ int[] c;

        static {
            int[] iArr = new int[uc.values().length];
            try {
                iArr[uc.NotEqual.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
                TryCatchGuardChecker.doCheck(e);
            }
            a = iArr;
            int[] iArr2 = new int[y1.values().length];
            try {
                iArr2[y1.Continue.ordinal()] = 1;
            } catch (NoSuchFieldError e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
            b = iArr2;
            int[] iArr3 = new int[g3.values().length];
            try {
                iArr3[g3.Int32.ordinal()] = 1;
            } catch (NoSuchFieldError e3) {
                TryCatchGuardChecker.doCheck(e3);
            }
            try {
                iArr3[g3.String.ordinal()] = 2;
            } catch (NoSuchFieldError e4) {
                TryCatchGuardChecker.doCheck(e4);
            }
            try {
                iArr3[g3.Float.ordinal()] = 3;
            } catch (NoSuchFieldError e5) {
                TryCatchGuardChecker.doCheck(e5);
            }
            try {
                iArr3[g3.ArrayOfInt32s.ordinal()] = 4;
            } catch (NoSuchFieldError e6) {
                TryCatchGuardChecker.doCheck(e6);
            }
            try {
                iArr3[g3.ArrayOfFloats.ordinal()] = 5;
            } catch (NoSuchFieldError e7) {
                TryCatchGuardChecker.doCheck(e7);
            }
            try {
                iArr3[g3.ArrayOfStrings.ordinal()] = 6;
            } catch (NoSuchFieldError e8) {
                TryCatchGuardChecker.doCheck(e8);
            }
            c = iArr3;
        }
    }

    @Override // ttpobfuscated.ib
    public String a() {
        String string;
        StringBuilder sb = this.a;
        return (sb == null || (string = sb.toString()) == null) ? "" : string;
    }

    @Override // ttpobfuscated.ib
    public Throwable b() {
        return this.b;
    }

    public final class b extends C09AY implements Function1<Object, CharSequence> {
        public static final b a = new b();

        public b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(Object obj) {
            return "\"" + obj + '\"';
        }
    }

    @Override // ttpobfuscated.ib
    public String a(ra raVar) {
        if (raVar instanceof df) {
            df dfVar = (df) raVar;
            qa qaVar = new qa(dfVar.m.duplicate().order(ByteOrder.LITTLE_ENDIAN));
            StringBuilder sb = new StringBuilder();
            sb.append("API LEVEL: " + dfVar.i + ", FILE: " + dfVar.j);
            sb.append("\n");
            StringBuilder sb2 = new StringBuilder("DATA FLOWS: ");
            sb2.append(dfVar.l);
            sb.append(sb2.toString());
            sb.append("\n");
            sb.append("DATA TABLE COUNT: " + ((int) qaVar.b));
            sb.append("\nINSTRUCTIONS:\n");
            p7 p7Var = dfVar.k;
            p7Var.a(0);
            while (p7Var.a()) {
                int iC = p7Var.c();
                o7 o7VarA = p7.a.a(p7Var, null, 1, null);
                sb.append(iC);
                sb.append(" -> ");
                sb.append(a(o7VarA, qaVar));
                sb.append("\n");
            }
            return sb.toString();
        }
        if (raVar instanceof ef) {
            ef efVar = (ef) raVar;
            xc xcVar = efVar.m;
            StringBuilder sb3 = new StringBuilder();
            sb3.append("API LEVEL: " + efVar.i + ", FILE: " + efVar.j);
            sb3.append("\n");
            StringBuilder sb4 = new StringBuilder("DATA FLOWS: ");
            sb4.append(efVar.l);
            sb3.append(sb4.toString());
            sb3.append("\n");
            sb3.append("DATA TABLE COUNT: " + ((int) xcVar.a()));
            sb3.append("\nINSTRUCTIONS:\n");
            p7 p7Var2 = efVar.k;
            p7Var2.a(0);
            while (p7Var2.a()) {
                int iC2 = p7Var2.c();
                o7 o7VarA2 = p7.a.a(p7Var2, null, 1, null);
                sb3.append(iC2);
                sb3.append(" -> ");
                sb3.append(a(o7VarA2, xcVar));
                sb3.append("\n");
            }
            return sb3.toString();
        }
        return raVar.getClass().getSimpleName().concat(" is not printable");
    }

    public final String a(o7 o7Var) {
        StringBuilder sb = new StringBuilder();
        sb.append(o7Var.d);
        int i = o7Var.d.a;
        if (i == y1.JumpIf.a || i == y1.ReturnCodeIf.a) {
            sb.append(e3.h);
            sb.append(Byte.valueOf(o7Var.k));
            sb.append(")");
        }
        return sb.toString();
    }

    @Override // ttpobfuscated.ib
    public void a(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        this.a = sb;
    }

    @Override // ttpobfuscated.ib
    public String a(o7 o7Var, xc xcVar) {
        String strName = o7Var.a.name();
        if (o7Var instanceof o) {
            return e3.e + strName + ": instructions: " + ((o) o7Var).n + ", API: " + o7Var.c() + ']';
        }
        if (o7Var instanceof a0) {
            return e3.e + strName + " offset: " + ((a0) o7Var).m + ']';
        }
        if (o7Var instanceof x0) {
            StringBuilder sb = new StringBuilder();
            sb.append(a(o7Var));
            sb.append('(');
            sb.append(strName);
            sb.append('(');
            sb.append(a((x0) o7Var, xcVar));
            sb.append(") = ");
            return n0.a(sb, a(this, o7Var, (String) null, 1, (Object) null), ')');
        }
        if (o7Var instanceof v9) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(a(o7Var));
            sb2.append('(');
            sb2.append(strName);
            sb2.append('(');
            sb2.append(a((v9) o7Var, xcVar));
            sb2.append(") = ");
            return n0.a(sb2, a(this, o7Var, (String) null, 1, (Object) null), ')');
        }
        if (o7Var instanceof q) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(a(o7Var));
            sb3.append(" (");
            sb3.append(strName);
            sb3.append('(');
            sb3.append(a((q) o7Var, xcVar));
            sb3.append(") = ");
            return n0.a(sb3, a(this, o7Var, (String) null, 1, (Object) null), ')');
        }
        if (o7Var instanceof d9) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(a(o7Var));
            sb4.append(" (");
            sb4.append(strName);
            sb4.append('(');
            sb4.append(a((d9) o7Var, xcVar));
            sb4.append(") = ");
            return n0.a(sb4, a(this, o7Var, (String) null, 1, (Object) null), ')');
        }
        if (o7Var instanceof p6) {
            StringBuilder sb5 = new StringBuilder();
            sb5.append(a(o7Var));
            sb5.append(" (");
            sb5.append(strName);
            sb5.append('(');
            sb5.append(((p6) o7Var).d(xcVar));
            sb5.append(") = ");
            return n0.a(sb5, a(this, o7Var, (String) null, 1, (Object) null), ')');
        }
        if (o7Var instanceof u6) {
            StringBuilder sb6 = new StringBuilder();
            sb6.append(a(o7Var));
            sb6.append(" (");
            sb6.append(strName);
            sb6.append('(');
            sb6.append(((u6) o7Var).d(xcVar));
            sb6.append(") = ");
            return n0.a(sb6, a(this, o7Var, (String) null, 1, (Object) null), ')');
        }
        if (o7Var instanceof gd) {
            StringBuilder sb7 = new StringBuilder();
            sb7.append(a(o7Var));
            sb7.append(" (");
            sb7.append(strName);
            sb7.append('(');
            sb7.append(((gd) o7Var).d(xcVar));
            sb7.append(") = ");
            return n0.a(sb7, a(this, o7Var, (String) null, 1, (Object) null), ')');
        }
        if (o7Var instanceof hd) {
            StringBuilder sb8 = new StringBuilder();
            sb8.append(a(o7Var));
            sb8.append(" (");
            sb8.append(strName);
            sb8.append('(');
            sb8.append(o7Var.a(xcVar));
            sb8.append(") = ");
            return n0.a(sb8, a(this, o7Var, (String) null, 1, (Object) null), ')');
        }
        return e3.e + strName + ']';
    }

    public final String a(q qVar, xc xcVar) {
        Object objF;
        String string = kotlin.text.a0.LJLIIIL(qVar.c(xcVar).toLowerCase(Locale.ROOT)).toString();
        C13IQ<? extends ed> c13iqA = ed.b.a(qVar.c(xcVar, ((C1507240pKE) ListProtector.get(qVar.b, 2)).LL));
        if (Intrinsics.LJFF(c13iqA, C13LE.LIZ(ed.f.class))) {
            objF = ed.f.c;
        } else if (Intrinsics.LJFF(c13iqA, C13LE.LIZ(ed.a.class))) {
            objF = ed.a.c;
        } else if (Intrinsics.LJFF(c13iqA, C13LE.LIZ(ed.g.class))) {
            objF = qVar.g(xcVar);
        } else if (Intrinsics.LJFF(c13iqA, C13LE.LIZ(ed.h.class))) {
            objF = qVar.h(xcVar);
        } else if (Intrinsics.LJFF(c13iqA, C13LE.LIZ(ed.c.class))) {
            objF = qVar.e(xcVar);
        } else if (Intrinsics.LJFF(c13iqA, C13LE.LIZ(ed.d.class))) {
            objF = qVar.f(xcVar);
        } else {
            objF = null;
        }
        return "bucketId: " + string + "; frequencyType: " + c13iqA + "; frequency: " + objF;
    }

    public final String a(d9 d9Var, xc xcVar) {
        String string = kotlin.text.a0.LJLIIIL(d9Var.c(xcVar).toLowerCase(Locale.ROOT)).toString();
        int iC = d9Var.c(xcVar, ((C1507240pKE) ListProtector.get(d9Var.b, 2)).LL);
        int iC2 = d9Var.c(xcVar, ((C1507240pKE) ListProtector.get(d9Var.b, 3)).LL);
        int iC3 = d9Var.c(xcVar, ((C1507240pKE) ListProtector.get(d9Var.b, 4)).LL);
        return "bucketId: " + string + "; reasonCode: " + iC + "; genericPayloadItems: " + c9.b.a(iC2) + "; specificPayloadItems: " + f9.b.a(iC3);
    }

    public final String a(x0 x0Var, xc xcVar) {
        StringBuilder sb = new StringBuilder();
        String strA = a(xcVar, x0Var.i, x0Var.m.a(), x0Var.n());
        if (strA.length() > 0) {
            sb.append(" ");
            sb.append(strA);
        }
        sb.append(" ");
        sb.append(x0Var.m.c());
        sb.append(" ");
        sb.append(a(xcVar, x0Var.i, x0Var.m.b(), x0Var.o()));
        return sb.toString();
    }

    public final String a(o7 o7Var, String str) {
        if (a.b[o7Var.d.ordinal()] == 1) {
            return "";
        }
        if (a.a[o7Var.f.ordinal()] == 1) {
            return "!" + o7Var.g + str;
        }
        return o7Var.g + str;
    }

    public final String a(v9 v9Var, xc xcVar) {
        if (!(v9Var instanceof l6) && !(v9Var instanceof o6) && !(v9Var instanceof w6)) {
            return "";
        }
        return " \"" + v9Var.c(xcVar) + '\"';
    }

    @Override // ttpobfuscated.ib
    public void a(int i, int i2) {
        this.b = null;
        this.a = new StringBuilder("DataFlowID " + i + " -> " + i2 + '\n');
    }

    @Override // ttpobfuscated.ib
    public void a(OrbuResult orbuResult, Throwable th) {
        StringBuilder sb = this.a;
        if (sb != null) {
            sb.append(orbuResult.getClass().getSimpleName());
            sb.append("\n");
        }
        this.b = th;
    }

    public final StringBuilder a(StringBuilder sb, int i) {
        sb.append(kotlin.text.a0.LJJJJJL('0', 2, String.valueOf(i)));
        return sb;
    }

    public final void a(StringBuilder sb, int i, Map<String, Boolean> map) {
        String str;
        int i2 = 0;
        for (Map.Entry<String, Boolean> entry : map.entrySet()) {
            String key = entry.getKey();
            boolean zBooleanValue = entry.getValue().booleanValue();
            sb.append("\n");
            sb.append(kotlin.text.u.LJJ(i + 1, "  "));
            i2++;
            sb.append(i2);
            sb.append(" ");
            if (zBooleanValue) {
                str = "Passed";
            } else {
                str = "Failed";
            }
            sb.append(str);
            sb.append(e3.h);
            sb.append(key);
            sb.append(")");
        }
    }

    public final String a(xc xcVar, byte b2, g3 g3Var, int i) {
        Iterable iterable;
        String strLJJLIIIJ;
        Iterable iterable2;
        String strLJJLIIIJ2;
        switch (a.c[g3Var.ordinal()]) {
            case 1:
                return Long.toString(((long) i) & 4294967295L, 10);
            case 2:
                return "\"" + xcVar.a(i, b2, g3.String) + '\"';
            case 3:
                return String.valueOf((float) (((double) (Integer.MAX_VALUE & i)) + (((double) ((i >>> 31) << 30)) * ((double) 2))));
            case 4:
            case 5:
                Object objA = xcVar.a(i, b2, g3Var);
                if (!(objA instanceof List) || (iterable2 = (Iterable) objA) == null || (strLJJLIIIJ2 = C13LP.LJJLIIIJ(iterable2, ", ", e3.e, e3.f, 0, null, null, 56)) == null) {
                    return "";
                }
                return strLJJLIIIJ2;
            case 6:
                Object objA2 = xcVar.a(i, b2, g3.ArrayOfStrings);
                if (!(objA2 instanceof List) || (iterable = (Iterable) objA2) == null || (strLJJLIIIJ = C13LP.LJJLIIIJ(iterable, ", ", e3.e, e3.f, 0, null, b.a, 24)) == null) {
                    return "";
                }
                return strLJJLIIIJ;
            default:
                return "";
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ttpobfuscated.ib
    public void a(int i, int i2, o7 o7Var, xc xcVar, tc tcVar) {
        cb cbVar;
        Map<String, Boolean> map;
        StringBuilder sb = this.a;
        if (sb != null) {
            sb.append(kotlin.text.u.LJJ(i2, "  "));
            a(sb, i);
            sb.append(" ");
            sb.append(a(o7Var));
            sb.append(" ");
            sb.append(a(o7Var, " "));
            sb.append(o7Var.a.name());
            StringBuilder sb2 = new StringBuilder();
            if (o7Var instanceof o) {
                sb2.append(C13LP.LJJLIIIJ(C1697810uHb.LJIIJJI(new C1507270pKH(o7Var.c().a), Integer.valueOf(((o) o7Var).n)), ", ", null, null, 0, null, null, 62));
            } else if (o7Var instanceof a0) {
                sb2.append(((a0) o7Var).m);
            } else if (o7Var instanceof x0) {
                sb2.append(((x0) o7Var).m.c());
            }
            sb.append(e3.h);
            sb.append((CharSequence) sb2);
            sb.append(")");
            sb.append(" -> ");
            sb.append(tcVar);
            if ((o7Var instanceof cb) && (cbVar = (cb) o7Var) != null && cbVar.b() != null && cbVar.a() != null && (map = new p3().a(cbVar.a(), cbVar.b()).a) != null) {
                a(sb, i2, map);
            }
            sb.append("\n");
        }
    }

    public static /* synthetic */ String a(sa saVar, o7 o7Var, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        return saVar.a(o7Var, str);
    }
}
