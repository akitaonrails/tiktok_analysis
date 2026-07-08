package ttpobfuscated;

import X.C098200Yq;
import X.C09AY;
import X.C13LP;
import X.C1507240pKE;
import X.C15438062q;
import X.C189200o6;
import X.C786410Ut5;
import X.EnumC688760Qzy;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastFloatProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.Regex;
import ttpobfuscated.g3;

/* JADX INFO: loaded from: classes24.dex */
public final class y0 {
    public static final b e = new b();
    public EnumSet<ja> a;
    public g3 b;
    public zf c;
    public g3 d;

    public final class a extends C09AY implements Function0<Unit> {
        public final /* synthetic */ int a;
        public final /* synthetic */ y0 b;

        public final void a() throws pa {
            int i = (this.a & (-16777216)) >>> 24;
            y0 y0Var = this.b;
            g3.a aVar = g3.b;
            g3 g3VarA = aVar.a(i);
            if (g3VarA == null) {
                throw new pa("Unexpected DataType value [" + ((Object) C1507240pKE.LIZJ(i)) + "] for left type");
            }
            y0Var.getClass();
            y0Var.b = g3VarA;
            int i2 = (this.a & 16711680) >>> 16;
            y0 y0Var2 = this.b;
            zf zfVarA = zf.b.a(i2);
            if (zfVarA == null) {
                throw new pa("Unexpected TestType value [" + ((Object) C1507240pKE.LIZJ(i2)) + ']');
            }
            y0Var2.getClass();
            y0Var2.c = zfVarA;
            int i3 = (this.a & 65280) >>> 8;
            y0 y0Var3 = this.b;
            g3 g3VarA2 = aVar.a(i3);
            if (g3VarA2 == null) {
                throw new pa("Unexpected DataType value [" + ((Object) C1507240pKE.LIZJ(i3)) + "] for right type");
            }
            y0Var3.getClass();
            y0Var3.d = g3VarA2;
            this.b.a = ja.b.a(this.a & 255);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() throws pa {
            a();
            return Unit.LIZ;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i, y0 y0Var) {
            super(0);
            this.a = i;
            this.b = y0Var;
        }
    }

    public final class d extends C09AY implements Function0<tc> {
        public final /* synthetic */ Object b;
        public final /* synthetic */ Object c;

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final tc invoke() {
            Object objA = y0.this.a(this.b);
            Object objA2 = y0.this.a(this.c);
            try {
                g3 g3Var = g3.Null;
                if (objA == g3Var || objA2 == g3Var) {
                    return y0.this.c(objA, objA2);
                }
                if ((objA instanceof Boolean) && (objA2 instanceof Boolean)) {
                    return y0.this.b(objA, objA2);
                }
                if ((objA instanceof Integer) && (objA2 instanceof Integer)) {
                    return y0.this.a((Number) objA, (Number) objA2);
                }
                if ((objA instanceof Integer) && (objA2 instanceof String)) {
                    return y0.this.a((Integer) objA, Integer.valueOf(CastIntegerProtector.parseInt((String) objA2)));
                }
                if ((objA instanceof String) && (objA2 instanceof Integer)) {
                    return y0.this.a((Number) Integer.valueOf(CastIntegerProtector.parseInt((String) objA)), (Number) objA2);
                }
                if ((objA instanceof Float) && (objA2 instanceof Float)) {
                    return y0.this.a((Number) objA, (Number) objA2);
                }
                if ((objA instanceof Float) && (objA2 instanceof String)) {
                    return y0.this.a((Float) objA, Float.valueOf(CastFloatProtector.parseFloat((String) objA2)));
                }
                if ((objA instanceof String) && (objA2 instanceof Float)) {
                    return y0.this.a((Number) Float.valueOf(CastFloatProtector.parseFloat((String) objA)), (Number) objA2);
                }
                if ((objA instanceof String) && (objA2 instanceof String)) {
                    return y0.this.a((String) objA, (String) objA2);
                }
                if (!(objA instanceof List) || !(objA2 instanceof List)) {
                    return objA2 instanceof List ? y0.this.a(objA, (List) objA2) : tc.Undefined;
                }
                List<?> listA = y0.this.a((List) objA);
                y0 y0Var = y0.this;
                return y0.this.a(y0Var.a(y0Var.a(), listA), listA, (List) objA2);
            } catch (NumberFormatException e) {
                TryCatchGuardChecker.doCheck(e);
                return tc.Undefined;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Object obj, Object obj2) {
            super(0);
            this.b = obj;
            this.c = obj2;
        }
    }

    public /* synthetic */ class c {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[zf.values().length];
            try {
                iArr[zf.IsEqualTo.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
                TryCatchGuardChecker.doCheck(e);
            }
            try {
                iArr[zf.ContainedIn.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
            try {
                iArr[zf.StartsWith.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
                TryCatchGuardChecker.doCheck(e3);
            }
            try {
                iArr[zf.EndsWith.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
                TryCatchGuardChecker.doCheck(e4);
            }
            try {
                iArr[zf.Contains.ordinal()] = 5;
            } catch (NoSuchFieldError e5) {
                TryCatchGuardChecker.doCheck(e5);
            }
            try {
                iArr[zf.OrderedCompareTo.ordinal()] = 6;
            } catch (NoSuchFieldError e6) {
                TryCatchGuardChecker.doCheck(e6);
            }
            try {
                iArr[zf.Matches.ordinal()] = 7;
            } catch (NoSuchFieldError e7) {
                TryCatchGuardChecker.doCheck(e7);
            }
            a = iArr;
            int[] iArr2 = new int[g3.values().length];
            try {
                iArr2[g3.ArrayOfBooleans.ordinal()] = 1;
            } catch (NoSuchFieldError e8) {
                TryCatchGuardChecker.doCheck(e8);
            }
            try {
                iArr2[g3.ArrayOfInt32s.ordinal()] = 2;
            } catch (NoSuchFieldError e9) {
                TryCatchGuardChecker.doCheck(e9);
            }
            try {
                iArr2[g3.ArrayOfFloats.ordinal()] = 3;
            } catch (NoSuchFieldError e10) {
                TryCatchGuardChecker.doCheck(e10);
            }
            try {
                iArr2[g3.ArrayOfStrings.ordinal()] = 4;
            } catch (NoSuchFieldError e11) {
                TryCatchGuardChecker.doCheck(e11);
            }
            b = iArr2;
        }
    }

    public final g3 a() {
        g3 g3Var = this.b;
        if (g3Var != null) {
            return g3Var;
        }
        return null;
    }

    public final g3 b() {
        g3 g3Var = this.d;
        if (g3Var != null) {
            return g3Var;
        }
        return null;
    }

    public final zf c() {
        zf zfVar = this.c;
        if (zfVar != null) {
            return zfVar;
        }
        return null;
    }

    public y0(int i) {
        mb.a("Comparison.init", false, null, new a(i, this), 6, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0056, code lost:
    
        if (r4 != false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final <T> java.util.List<?> a(java.util.List<? extends T> r6) {
        /*
            r5 = this;
            boolean r4 = r6 instanceof java.util.Collection
            if (r4 == 0) goto L94
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto L94
        La:
            r3 = 10
            if (r4 == 0) goto L1b
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto L1b
        L14:
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto L59
        L1a:
            return r6
        L1b:
            java.util.Iterator r2 = r6.iterator()
        L1f:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L56
            java.lang.Object r1 = r2.next()
            boolean r0 = r1 instanceof java.lang.Double
            if (r0 != 0) goto L31
            boolean r0 = r1 instanceof java.lang.Float
            if (r0 == 0) goto L1f
        L31:
            java.util.ArrayList r2 = new java.util.ArrayList
            int r0 = X.C15438062q.LJIJJ(r6, r3)
            r2.<init>(r0)
            java.util.Iterator r1 = r6.iterator()
        L3e:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto La7
            java.lang.Object r0 = r1.next()
            java.lang.Number r0 = (java.lang.Number) r0
            float r0 = r0.floatValue()
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            r2.add(r0)
            goto L3e
        L56:
            if (r4 == 0) goto L59
            goto L14
        L59:
            java.util.Iterator r2 = r6.iterator()
        L5d:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L1a
            java.lang.Object r1 = r2.next()
            boolean r0 = r1 instanceof java.lang.Short
            if (r0 != 0) goto L6f
            boolean r0 = r1 instanceof java.lang.Byte
            if (r0 == 0) goto L5d
        L6f:
            java.util.ArrayList r2 = new java.util.ArrayList
            int r0 = X.C15438062q.LJIJJ(r6, r3)
            r2.<init>(r0)
            java.util.Iterator r1 = r6.iterator()
        L7c:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto La7
            java.lang.Object r0 = r1.next()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.add(r0)
            goto L7c
        L94:
            java.util.Iterator r1 = r6.iterator()
        L98:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto La
            java.lang.Object r0 = r1.next()
            boolean r0 = r0 instanceof java.lang.Number
            if (r0 != 0) goto L98
            return r6
        La7:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: ttpobfuscated.y0.a(java.util.List):java.util.List");
    }

    public final Pair<List<String>, Boolean> b(List<String> list) {
        EnumSet<ja> enumSet = this.a;
        EnumSet<ja> enumSet2 = null;
        if (enumSet == null) {
            enumSet = null;
        }
        boolean zContains = enumSet.contains(ja.CaseInsensitive);
        EnumSet<ja> enumSet3 = this.a;
        if (enumSet3 != null) {
            enumSet2 = enumSet3;
        }
        if (enumSet2.contains(ja.HashConversion)) {
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator<String> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(a(it2.next()));
            }
            zContains = true;
            list = arrayList;
        }
        return new Pair<>(list, Boolean.valueOf(zContains));
    }

    public final String c(String str) {
        List listA;
        List listLJJLIIIJILLIZJL = kotlin.text.a0.LJJLIIIJILLIZJL(str, new String[]{e3.d}, 0, 6);
        if (listLJJLIIIJILLIZJL.size() <= 3) {
            listA = new ArrayList(ze.a((List<? extends String>) listLJJLIIIJILLIZJL, 5, CardStruct.IStatusCode.DEFAULT));
            ListProtector.set(listA, 3, "1");
        } else {
            listA = ze.a((List<? extends String>) listLJJLIIIJILLIZJL, 5, CardStruct.IStatusCode.DEFAULT);
        }
        return C13LP.LJJLIIIJ(listA, e3.d, null, null, 0, null, null, 62);
    }

    public final Pair<String, Boolean> d(String str) throws NoSuchAlgorithmException {
        EnumSet<ja> enumSet = this.a;
        EnumSet<ja> enumSet2 = null;
        if (enumSet == null) {
            enumSet = null;
        }
        boolean zContains = enumSet.contains(ja.CaseInsensitive);
        EnumSet<ja> enumSet3 = this.a;
        if (enumSet3 != null) {
            enumSet2 = enumSet3;
        }
        if (enumSet2.contains(ja.HashConversion)) {
            str = a(str);
            zContains = true;
        }
        return new Pair<>(str, Boolean.valueOf(zContains));
    }

    public final String a(String str) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        messageDigest.update(str.getBytes(Charsets.UTF_8));
        byte[] bArrDigest = messageDigest.digest();
        String str2 = "";
        for (byte b2 : bArrDigest) {
            str2 = str2 + C786410Ut5.j4("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b2)}, 1));
        }
        return str2;
    }

    public final boolean b(String str) {
        Iterator<String> it2 = z0.g.iterator();
        while (it2.hasNext()) {
            if (kotlin.text.a0.LJJIIZI(str, it2.next(), true) && kotlin.text.a0.LJJLIIIJILLIZJL(str, new String[]{e3.d}, 0, 6).size() < 4) {
                return false;
            }
        }
        return true;
    }

    public final Object a(Object obj) {
        if (obj == null) {
            return g3.Null;
        }
        if (!(obj instanceof Byte) && !(obj instanceof Short)) {
            if (!(obj instanceof Double)) {
                return obj;
            }
            return Float.valueOf((float) ((Number) obj).doubleValue());
        }
        return Integer.valueOf(((Number) obj).intValue());
    }

    public final void b(g3 g3Var) {
        this.d = g3Var;
    }

    public final tc a(int i) {
        if (i < 0) {
            return tc.OrderedAscending;
        }
        if (i > 0) {
            return tc.OrderedDescending;
        }
        return tc.OrderedSame;
    }

    public final tc a(boolean z) {
        if (z) {
            return tc.True;
        }
        return tc.False;
    }

    public final void a(g3 g3Var) {
        this.b = g3Var;
    }

    public final void a(zf zfVar) {
        this.c = zfVar;
    }

    public final <T> tc a(Object obj, List<? extends T> list) {
        if (obj instanceof Boolean) {
            if (c.b[b().ordinal()] == 1) {
                ArrayList arrayList = new ArrayList();
                for (T t : list) {
                    if (t instanceof Boolean) {
                        arrayList.add(t);
                    }
                }
                if (arrayList.size() != list.size()) {
                    return tc.Undefined;
                }
                return a(((Boolean) obj).booleanValue(), arrayList);
            }
            return tc.Undefined;
        }
        if (obj instanceof Integer) {
            if (c.b[b().ordinal()] == 2) {
                ArrayList arrayList2 = new ArrayList();
                for (T t2 : list) {
                    if (t2 instanceof Integer) {
                        arrayList2.add(t2);
                    }
                }
                if (arrayList2.size() != list.size()) {
                    return tc.Undefined;
                }
                return a((Number) obj, (List<? extends Number>) arrayList2);
            }
            return tc.Undefined;
        }
        if (obj instanceof Float) {
            if (c.b[b().ordinal()] == 3) {
                ArrayList arrayList3 = new ArrayList();
                for (T t3 : list) {
                    if (t3 instanceof Float) {
                        arrayList3.add(t3);
                    }
                }
                if (arrayList3.size() != list.size()) {
                    return tc.Undefined;
                }
                return a((Number) obj, (List<? extends Number>) arrayList3);
            }
            return tc.Undefined;
        }
        if (obj instanceof String) {
            if (c.b[b().ordinal()] == 4) {
                ArrayList arrayList4 = new ArrayList();
                for (T t4 : list) {
                    if (t4 instanceof String) {
                        arrayList4.add(t4);
                    }
                }
                if (arrayList4.size() != list.size()) {
                    return tc.Undefined;
                }
                return a((String) obj, (List<String>) arrayList4);
            }
            return tc.Undefined;
        }
        return tc.Undefined;
    }

    public final tc b(String str, String str2) {
        if (b(str) && b(str2)) {
            if (kotlin.text.a0.LJJIIZI(str, "-TC", true) && kotlin.text.a0.LJJIIZI(str2, "-TC", true)) {
                str = kotlin.text.u.LJJIFFI(str, "-TC", ".0", false);
                str2 = kotlin.text.u.LJJIFFI(str2, "-TC", ".0", false);
            } else if (kotlin.text.a0.LJJIIZI(str, "-RC", true) && kotlin.text.a0.LJJIIZI(str2, "-RC", true)) {
                str = kotlin.text.u.LJJIFFI(str, "-RC", ".0", false);
                str2 = kotlin.text.u.LJJIFFI(str2, "-RC", ".0", false);
            } else if (kotlin.text.a0.LJJIIZI(str, "-TC", true) || kotlin.text.a0.LJJIIZI(str2, "-TC", true) || kotlin.text.a0.LJJIIZI(str, "-RC", true) || kotlin.text.a0.LJJIIZI(str2, "-RC", true)) {
                if (!kotlin.text.a0.LJJIIZI(str, "-RC", true) && !kotlin.text.a0.LJJIIZI(str, "-TC", true)) {
                    str = c(str);
                } else if (!kotlin.text.a0.LJJIIZI(str2, "-RC", true) && !kotlin.text.a0.LJJIIZI(str2, "-TC", true)) {
                    str2 = c(str2);
                } else {
                    return tc.Undefined;
                }
                str = kotlin.text.u.LJJIFFI(kotlin.text.u.LJJIFFI(str, "-RC", ".0", false), "-TC", ".0", false);
                str2 = kotlin.text.u.LJJIFFI(kotlin.text.u.LJJIFFI(str2, "-RC", ".0", false), "-TC", ".0", false);
            }
            List<Integer> listC = ze.c(str);
            if (listC == null) {
                return tc.Undefined;
            }
            List<Integer> listC2 = ze.c(str2);
            if (listC2 == null) {
                return tc.Undefined;
            }
            int iMax = Math.max(listC.size(), listC2.size());
            return a(ze.a(ze.a(listC, iMax, 0), ze.a(listC2, iMax, 0)));
        }
        return tc.Undefined;
    }

    public final tc c(List<String> list, List<String> list2) {
        Pair<List<String>, Boolean> pairB = b(list);
        List<String> first = pairB.getFirst();
        boolean zBooleanValue = pairB.getSecond().booleanValue();
        if (c.a[c().ordinal()] == 1) {
            return a(ze.a(first, list2, zBooleanValue));
        }
        return tc.Undefined;
    }

    public final tc a(String str, String str2) throws NoSuchAlgorithmException {
        Object c098200Yq;
        Pair<String, Boolean> pairD = d(str);
        String first = pairD.getFirst();
        boolean zBooleanValue = pairD.getSecond().booleanValue();
        int i = c.a[c().ordinal()];
        if (i != 1) {
            if (i != 3) {
                if (i != 4) {
                    if (i != 5) {
                        if (i != 6) {
                            if (i != 7) {
                                return tc.Undefined;
                            }
                            if (str2.length() == 0) {
                                return tc.Undefined;
                            }
                            try {
                                LinkedHashSet linkedHashSet = new LinkedHashSet();
                                if (zBooleanValue) {
                                    linkedHashSet.add(EnumC688760Qzy.IGNORE_CASE);
                                }
                                c098200Yq = a(new Regex(str2, linkedHashSet).containsMatchIn(first));
                                C189200o6.m2constructorimpl(c098200Yq);
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                c098200Yq = new C098200Yq(th);
                                C189200o6.m2constructorimpl(c098200Yq);
                            }
                            if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
                                c098200Yq = tc.Undefined;
                            }
                            return (tc) c098200Yq;
                        }
                        if (!zBooleanValue && first.length() != 0 && str2.length() != 0) {
                            return b(first, str2);
                        }
                        return tc.Undefined;
                    }
                    if (str2.length() == 0) {
                        return tc.False;
                    }
                    return a(kotlin.text.a0.LJJIIZI(first, str2, zBooleanValue));
                }
                if (str2.length() == 0) {
                    return tc.True;
                }
                return a(kotlin.text.u.LJIIZILJ(first, str2, zBooleanValue));
            }
            if (str2.length() == 0) {
                return tc.True;
            }
            return a(kotlin.text.u.LJJIIJZLJL(first, str2, zBooleanValue));
        }
        return a(kotlin.text.u.LJIJI(first, str2, zBooleanValue));
    }

    public final tc b(Object obj, Object obj2) {
        if (c.a[c().ordinal()] == 1) {
            return a(Intrinsics.LJFF(obj, obj2));
        }
        return tc.Undefined;
    }

    public final tc c(Object obj, Object obj2) {
        if (c.a[c().ordinal()] == 1) {
            g3 g3Var = g3.Null;
            if (obj == g3Var && obj2 == g3Var) {
                return a(true);
            }
            if (obj != g3Var && obj2 != g3Var) {
                return tc.Undefined;
            }
            return a(false);
        }
        return tc.Undefined;
    }

    public final tc a(String str, List<String> list) throws NoSuchAlgorithmException {
        Pair<String, Boolean> pairD = d(str);
        String first = pairD.getFirst();
        boolean zBooleanValue = pairD.getSecond().booleanValue();
        if (c.a[c().ordinal()] == 2) {
            return a(ze.a(list, first, zBooleanValue));
        }
        return tc.Undefined;
    }

    public final <T extends Number> tc b(List<? extends T> list, List<? extends T> list2) {
        if (c.a[c().ordinal()] == 1) {
            return a(Intrinsics.LJFF(list, list2));
        }
        return tc.Undefined;
    }

    public final g3 a(g3 g3Var, List<?> list) {
        Iterator<?> it2 = list.iterator();
        if (it2.hasNext()) {
            Object next = it2.next();
            if (next instanceof Boolean) {
                return g3.ArrayOfBooleans;
            }
            if (next instanceof Integer) {
                return g3.ArrayOfInt32s;
            }
            if (!(next instanceof Double) && !(next instanceof Float)) {
                return g3Var;
            }
            return g3.ArrayOfFloats;
        }
        return g3Var;
    }

    public final tc a(boolean z, List<Boolean> list) {
        if (c.a[c().ordinal()] == 2) {
            return a(list.contains(Boolean.valueOf(z)));
        }
        return tc.Undefined;
    }

    public final <T extends Number> tc a(T t, T t2) {
        if (c.a[c().ordinal()] == 1) {
            return a(Intrinsics.LJFF(t, t2));
        }
        return tc.Undefined;
    }

    public final tc a(Number number, List<? extends Number> list) {
        if (c.a[c().ordinal()] == 2) {
            return a(list.contains(number));
        }
        return tc.Undefined;
    }

    public final tc a(List<Boolean> list, List<Boolean> list2) {
        if (c.a[c().ordinal()] == 1) {
            return a(Intrinsics.LJFF(list, list2));
        }
        return tc.Undefined;
    }

    public final tc a(Object obj, Object obj2) {
        return (tc) mb.a("Comparison.compare", false, null, new d(obj, obj2), 6, null);
    }

    public final <T> tc a(g3 g3Var, List<? extends T> list, List<? extends T> list2) {
        g3 g3Var2 = g3.ArrayOfBooleans;
        if (g3Var == g3Var2 && b() == g3Var2) {
            ArrayList arrayList = new ArrayList();
            for (T t : list) {
                if (t instanceof Boolean) {
                    arrayList.add(t);
                }
            }
            if (arrayList.size() != list.size()) {
                return tc.Undefined;
            }
            ArrayList arrayList2 = new ArrayList();
            for (T t2 : list2) {
                if (t2 instanceof Boolean) {
                    arrayList2.add(t2);
                }
            }
            if (arrayList2.size() != list2.size()) {
                return tc.Undefined;
            }
            return a((List<Boolean>) arrayList, (List<Boolean>) arrayList2);
        }
        g3 g3Var3 = g3.ArrayOfInt32s;
        if (g3Var == g3Var3 && b() == g3Var3) {
            ArrayList arrayList3 = new ArrayList();
            for (T t3 : list) {
                if (t3 instanceof Integer) {
                    arrayList3.add(t3);
                }
            }
            if (arrayList3.size() != list.size()) {
                return tc.Undefined;
            }
            ArrayList arrayList4 = new ArrayList();
            for (T t4 : list2) {
                if (t4 instanceof Integer) {
                    arrayList4.add(t4);
                }
            }
            if (arrayList4.size() != list2.size()) {
                return tc.Undefined;
            }
            return b((List) arrayList3, (List) arrayList4);
        }
        g3 g3Var4 = g3.ArrayOfFloats;
        if (g3Var == g3Var4 && b() == g3Var4) {
            ArrayList arrayList5 = new ArrayList();
            for (T t6 : list) {
                if (t6 instanceof Float) {
                    arrayList5.add(t6);
                }
            }
            if (arrayList5.size() != list.size()) {
                return tc.Undefined;
            }
            ArrayList arrayList6 = new ArrayList();
            for (T t7 : list2) {
                if (t7 instanceof Float) {
                    arrayList6.add(t7);
                }
            }
            if (arrayList6.size() != list2.size()) {
                return tc.Undefined;
            }
            return b((List) arrayList5, (List) arrayList6);
        }
        g3 g3Var5 = g3.ArrayOfStrings;
        if (g3Var == g3Var5 && b() == g3Var5) {
            ArrayList arrayList7 = new ArrayList();
            for (T t8 : list) {
                if (t8 instanceof String) {
                    arrayList7.add(t8);
                }
            }
            if (arrayList7.size() != list.size()) {
                return tc.Undefined;
            }
            ArrayList arrayList8 = new ArrayList();
            for (T t9 : list2) {
                if (t9 instanceof String) {
                    arrayList8.add(t9);
                }
            }
            if (arrayList8.size() != list2.size()) {
                return tc.Undefined;
            }
            return c((List<String>) arrayList7, (List<String>) arrayList8);
        }
        return tc.Undefined;
    }

    public static final class b {
        public final int a(g3 g3Var, zf zfVar, g3 g3Var2, EnumSet<ja> enumSet) {
            return (g3Var.a << 24) | (zfVar.a << 16) | (g3Var2.a << 8) | ka.a(enumSet);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ int a(b bVar, g3 g3Var, zf zfVar, g3 g3Var2, EnumSet enumSet, int i, Object obj) {
            if ((i & 8) != 0) {
                enumSet = EnumSet.noneOf(ja.class);
            }
            return bVar.a(g3Var, zfVar, g3Var2, enumSet);
        }
    }
}
