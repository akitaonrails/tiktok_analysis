package cs.bd.o;

import X.C080U;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class f extends d {
    public static String LJFF(List list) {
        if (list == null || list.size() <= 0) {
            return null;
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            C080U c080u = (C080U) it2.next();
            if (c080u != null && "x-tt-logid".equalsIgnoreCase(c080u.LIZ)) {
                return c080u.LIZIZ;
            }
        }
        return null;
    }

    @Override // cs.bd.o.d
    public final Object[] LIZJ(String str, String str2, String str3) {
        return LJI(str, null, str3, str2, false, null);
    }

    @Override // cs.bd.o.d
    public final Object[] LIZLLL(String str, String str2, String str3, byte[] bArr) {
        return LJI(str, str2, str3, null, true, bArr);
    }

    @Override // cs.bd.o.d
    public final Object[] LJ(String str, String str2, String str3) {
        return LJI(str, str2, str3, null, false, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0100 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x010b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object[] LJI(java.lang.String r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, boolean r24, byte[] r25) {
        /*
            Method dump skipped, instruction units count: 338
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: cs.bd.o.f.LJI(java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, byte[]):java.lang.Object[]");
    }
}
