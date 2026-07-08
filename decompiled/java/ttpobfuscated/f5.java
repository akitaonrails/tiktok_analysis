package ttpobfuscated;

import X.C08LY;
import X.C08QB;
import X.C098200Yq;
import X.C09AY;
import X.C09RB;
import X.C0VSJ;
import X.C13BV;
import X.C13LE;
import X.C13LP;
import X.C189200o6;
import X.InterfaceC1364105Vn;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.util.HashSet;
import java.util.List;
import kotlin.jvm.functions.Function1;
import ttpobfuscated.e5;
import ttpobfuscated.q3;

/* JADX INFO: loaded from: classes4.dex */
public final class f5 implements e5 {
    public final String a = C13LE.LIZ(f5.class).LJI();

    public final class a extends C09AY implements Function1<File, Boolean> {
        public final /* synthetic */ List<String> a;
        public final /* synthetic */ HashSet<String> b;

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(File file) {
            boolean z;
            if (file.isFile() && (this.a.isEmpty() || this.b.contains(file.getName()))) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(List<String> list, HashSet<String> hashSet) {
            super(1);
            this.a = list;
            this.b = hashSet;
        }
    }

    public final class b extends C09AY implements Function1<File, String> {
        public static final b a = new b();

        public b() {
            super(1);
        }

        public final String a(File file) {
            return file.getPath();
        }

        @Override // kotlin.jvm.functions.Function1
        public String invoke(File file) {
            return file.getPath();
        }
    }

    @Override // ttpobfuscated.e5
    public Object a(String str, List<String> list, InterfaceC1364105Vn<? super List<String>> interfaceC1364105Vn) throws e5.b.a {
        Object c098200Yq;
        try {
            C0VSJ c0vsj = new C0VSJ(str);
            if (c0vsj.exists() && c0vsj.isDirectory()) {
                c098200Yq = C09RB.LJJII(new C08LY(C09RB.LJIIIZ(C08QB.LJIILIIL(c0vsj), new a(list, C13LP.LLIFFJFJJ(list))), b.a));
            } else {
                c098200Yq = C13BV.INSTANCE;
            }
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl == null) {
            return c098200Yq;
        }
        q3.a aVar = q3.a;
        String str2 = this.a;
        aVar.getClass();
        q3.a.c.b("Error while listing the files under the folder path: " + str, str2, thM5exceptionOrNullimpl);
        throw new e5.b.a(str, thM5exceptionOrNullimpl);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0072 A[Catch: all -> 0x0075, TRY_LEAVE, TryCatch #0 {all -> 0x0075, blocks: (B:2:0x0000, B:4:0x000b, B:6:0x0011, B:8:0x001b, B:10:0x0024, B:12:0x002c, B:14:0x0032, B:16:0x003c, B:17:0x003f, B:18:0x0042, B:19:0x0051, B:21:0x0057, B:23:0x0068, B:25:0x006e, B:26:0x0072, B:22:0x0065), top: B:34:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0087 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0088  */
    @Override // ttpobfuscated.e5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(java.lang.String r8, java.util.List<java.lang.String> r9, X.InterfaceC1364105Vn<? super java.util.List<java.lang.String>> r10) throws ttpobfuscated.e5.b.C0052b {
        /*
            r7 = this;
            X.0VSJ r1 = new X.0VSJ     // Catch: java.lang.Throwable -> L75
            r1.<init>(r8)     // Catch: java.lang.Throwable -> L75
            boolean r0 = r1.exists()     // Catch: java.lang.Throwable -> L75
            if (r0 == 0) goto L65
            boolean r0 = r1.isDirectory()     // Catch: java.lang.Throwable -> L75
            if (r0 == 0) goto L65
            java.util.HashSet r6 = X.C13LP.LLIFFJFJJ(r9)     // Catch: java.lang.Throwable -> L75
            java.io.File[] r5 = r1.listFiles()     // Catch: java.lang.Throwable -> L75
            if (r5 == 0) goto L72
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L75
            r4.<init>()     // Catch: java.lang.Throwable -> L75
            int r3 = r5.length     // Catch: java.lang.Throwable -> L75
            r2 = 0
        L22:
            if (r2 >= r3) goto L42
            r1 = r5[r2]     // Catch: java.lang.Throwable -> L75
            boolean r0 = r1.isDirectory()     // Catch: java.lang.Throwable -> L75
            if (r0 == 0) goto L3f
            boolean r0 = r9.isEmpty()     // Catch: java.lang.Throwable -> L75
            if (r0 != 0) goto L3c
            java.lang.String r0 = r1.getName()     // Catch: java.lang.Throwable -> L75
            boolean r0 = r6.contains(r0)     // Catch: java.lang.Throwable -> L75
            if (r0 == 0) goto L3f
        L3c:
            r4.add(r1)     // Catch: java.lang.Throwable -> L75
        L3f:
            int r2 = r2 + 1
            goto L22
        L42:
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L75
            r0 = 10
            int r0 = X.C15438062q.LJIJJ(r4, r0)     // Catch: java.lang.Throwable -> L75
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L75
            java.util.Iterator r1 = r4.iterator()     // Catch: java.lang.Throwable -> L75
        L51:
            boolean r0 = r1.hasNext()     // Catch: java.lang.Throwable -> L75
            if (r0 == 0) goto L68
            java.lang.Object r0 = r1.next()     // Catch: java.lang.Throwable -> L75
            java.io.File r0 = (java.io.File) r0     // Catch: java.lang.Throwable -> L75
            java.lang.String r0 = r0.getPath()     // Catch: java.lang.Throwable -> L75
            r2.add(r0)     // Catch: java.lang.Throwable -> L75
            goto L51
        L65:
            X.13BV r0 = X.C13BV.INSTANCE     // Catch: java.lang.Throwable -> L75
            goto L6e
        L68:
            java.util.List r0 = X.C13LP.LLIIII(r2)     // Catch: java.lang.Throwable -> L75
            if (r0 == 0) goto L72
        L6e:
            X.C189200o6.m2constructorimpl(r0)     // Catch: java.lang.Throwable -> L75
            goto L81
        L72:
            X.13BV r0 = X.C13BV.INSTANCE     // Catch: java.lang.Throwable -> L75
            goto L6e
        L75:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            X.00Yq r0 = new X.00Yq
            r0.<init>(r1)
            X.C189200o6.m2constructorimpl(r0)
        L81:
            java.lang.Throwable r4 = X.C189200o6.m5exceptionOrNullimpl(r0)
            if (r4 != 0) goto L88
            return r0
        L88:
            ttpobfuscated.q3$a r3 = ttpobfuscated.q3.a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r0 = "Error while listing the folders under the path: "
            r1.<init>(r0)
            r1.append(r8)
            java.lang.String r2 = r1.toString()
            java.lang.String r1 = r7.a
            r3.getClass()
            ttpobfuscated.q3 r0 = ttpobfuscated.q3.a.c
            r0.b(r2, r1, r4)
            ttpobfuscated.e5$b$b r0 = new ttpobfuscated.e5$b$b
            r0.<init>(r8, r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ttpobfuscated.f5.b(java.lang.String, java.util.List, X.05Vn):java.lang.Object");
    }
}
