package com.google.gson.internal.bind;

import X.C09CQ;
import X.C09CT;
import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C0WZX;
import X.C2188811AlT;
import X.C2204961BRm;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.h;
import com.google.gson.internal.r;
import com.google.gson.k;
import com.google.gson.l;
import com.google.gson.m;
import com.google.gson.n;
import com.google.gson.q;
import com.google.gson.reflect.TypeToken;
import com.google.gson.s;
import com.google.gson.v;
import java.io.IOException;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.sql.Timestamp;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Currency;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;
import ttpobfuscated.e3;

/* JADX INFO: loaded from: classes4.dex */
public final class TypeAdapters {
    public static final v LIZ = new AnonymousClass32(Class.class, new TypeAdapter<Class>() { // from class: com.google.gson.internal.bind.TypeAdapters.1
        @Override // com.google.gson.TypeAdapter
        public final Class read(C09CU c09cu) {
            throw new UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?");
        }

        @Override // com.google.gson.TypeAdapter
        public final void write(C09DL c09dl, Class cls) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Attempted to serialize java.lang.Class: ");
            sbLIZ.append(cls.getName());
            sbLIZ.append(". Forgot to register a type adapter?");
            throw new UnsupportedOperationException(C2188811AlT.LIZIZ(sbLIZ));
        }
    }.nullSafe());
    public static final v LIZIZ = new AnonymousClass32(BitSet.class, new TypeAdapter<BitSet>() { // from class: com.google.gson.internal.bind.TypeAdapters.2
        /* JADX WARN: Removed duplicated region for block: B:21:0x0044  */
        @Override // com.google.gson.TypeAdapter
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.util.BitSet read(X.C09CU r7) throws java.io.IOException {
            /*
                r6 = this;
                java.util.BitSet r5 = new java.util.BitSet
                r5.<init>()
                r7.LIZ()
                X.09D6 r3 = r7.LJJLIIIJ()
                r4 = 0
            Ld:
                X.09D6 r0 = X.C09D6.END_ARRAY
                if (r3 == r0) goto L76
                int[] r1 = com.google.gson.internal.bind.TypeAdapters.a.LIZ
                int r0 = r3.ordinal()
                r2 = r1[r0]
                r1 = 1
                if (r2 == r1) goto L32
                r0 = 2
                if (r2 == r0) goto L2d
                r0 = 3
                if (r2 != r0) goto L60
                java.lang.String r3 = r7.LJJJZ()
                int r0 = java.lang.Integer.parseInt(r3)     // Catch: java.lang.NumberFormatException -> L46
                if (r0 == 0) goto L44
                goto L38
            L2d:
                boolean r1 = r7.LJJ()
                goto L38
            L32:
                int r0 = r7.LJJIZ()
                if (r0 == 0) goto L44
            L38:
                if (r1 == 0) goto L3d
                r5.set(r4)
            L3d:
                int r4 = r4 + 1
                X.09D6 r3 = r7.LJJLIIIJ()
                goto Ld
            L44:
                r1 = 0
                goto L38
            L46:
                r0 = move-exception
                com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
                com.google.gson.s r2 = new com.google.gson.s
                java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
                java.lang.String r0 = "Error: Expecting: bitset number value (1, 0), Found: "
                r1.append(r0)
                r1.append(r3)
                java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
                r2.<init>(r0)
                throw r2
            L60:
                com.google.gson.s r2 = new com.google.gson.s
                java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
                java.lang.String r0 = "Invalid bitset value type: "
                r1.append(r0)
                r1.append(r3)
                java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
                r2.<init>(r0)
                throw r2
            L76:
                r7.LJI()
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.bind.TypeAdapters.AnonymousClass2.read(X.09CU):java.lang.Object");
        }

        @Override // com.google.gson.TypeAdapter
        public final void write(C09DL c09dl, BitSet bitSet) throws IOException {
            BitSet bitSet2 = bitSet;
            c09dl.LIZIZ();
            int length = bitSet2.length();
            for (int i = 0; i < length; i++) {
                c09dl.LJJIZ(bitSet2.get(i) ? 1L : 0L);
            }
            c09dl.LJI();
        }
    }.nullSafe());
    public static final TypeAdapter<Boolean> LIZJ;
    public static final v LIZLLL;
    public static final v LJ;
    public static final v LJFF;
    public static final v LJI;
    public static final v LJII;
    public static final v LJIIIIZZ;
    public static final v LJIIIZ;
    public static final TypeAdapter<Number> LJIIJ;
    public static final TypeAdapter<Number> LJIIJJI;
    public static final TypeAdapter<Number> LJIIL;
    public static final v LJIILIIL;
    public static final v LJIILJJIL;
    public static final TypeAdapter<BigDecimal> LJIILL;
    public static final TypeAdapter<BigInteger> LJIILLIIL;
    public static final v LJIIZILJ;
    public static final v LJIJ;
    public static final v LJIJI;
    public static final v LJIJJ;
    public static final v LJIJJLI;
    public static final v LJIL;
    public static final v LJJ;
    public static final v LJJI;
    public static final v LJJIFFI;
    public static final v LJJII;
    public static final v LJJIII;
    public static final TypeAdapter<k> LJJIIJ;
    public static final v LJJIIJZLJL;
    public static final v LJJIIZ;

    /* JADX INFO: renamed from: com.google.gson.internal.bind.TypeAdapters$32, reason: invalid class name */
    public final class AnonymousClass32 implements v {
        public final /* synthetic */ Class LL;
        public final /* synthetic */ TypeAdapter LLILLJJLI;

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Factory[type=");
            sbLIZ.append(this.LL.getName());
            sbLIZ.append(",adapter=");
            sbLIZ.append(this.LLILLJJLI);
            sbLIZ.append(e3.f);
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public AnonymousClass32(Class cls, TypeAdapter typeAdapter) {
            this.LL = cls;
            this.LLILLJJLI = typeAdapter;
        }

        @Override // com.google.gson.v
        public final <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
            if (typeToken.getRawType() == this.LL) {
                return this.LLILLJJLI;
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: com.google.gson.internal.bind.TypeAdapters$33, reason: invalid class name */
    public final class AnonymousClass33 implements v {
        public final /* synthetic */ Class LL;
        public final /* synthetic */ Class LLILLJJLI;
        public final /* synthetic */ TypeAdapter LLILLL;

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Factory[type=");
            sbLIZ.append(this.LLILLJJLI.getName());
            sbLIZ.append("+");
            sbLIZ.append(this.LL.getName());
            sbLIZ.append(",adapter=");
            sbLIZ.append(this.LLILLL);
            sbLIZ.append(e3.f);
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        @Override // com.google.gson.v
        public final <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
            Class<? super T> rawType = typeToken.getRawType();
            if (rawType != this.LL && rawType != this.LLILLJJLI) {
                return null;
            }
            return this.LLILLL;
        }

        public AnonymousClass33(Class cls, Class cls2, TypeAdapter typeAdapter) {
            this.LL = cls;
            this.LLILLJJLI = cls2;
            this.LLILLL = typeAdapter;
        }
    }

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] LIZ;

        static {
            int[] iArr = new int[C09D6.values().length];
            LIZ = iArr;
            try {
                try {
                } catch (NoSuchFieldError e) {
                    e = e;
                }
            } catch (NoSuchFieldError e2) {
                e = e2;
            }
            try {
                iArr[C09D6.NUMBER.ordinal()] = 1;
            } catch (NoSuchFieldError e3) {
                e = e3;
                TryCatchGuardChecker.doCheck(e);
            }
            try {
                try {
                    try {
                        try {
                            LIZ[C09D6.BOOLEAN.ordinal()] = 2;
                        } catch (NoSuchFieldError e4) {
                            e = e4;
                            TryCatchGuardChecker.doCheck(e);
                        }
                    } catch (NoSuchFieldError e5) {
                        e = e5;
                    }
                } catch (NoSuchFieldError e6) {
                    e = e6;
                }
            } catch (NoSuchFieldError e7) {
                e = e7;
            }
            try {
                try {
                    try {
                        try {
                            LIZ[C09D6.STRING.ordinal()] = 3;
                        } catch (NoSuchFieldError e8) {
                            e = e8;
                            TryCatchGuardChecker.doCheck(e);
                        }
                    } catch (NoSuchFieldError e9) {
                        e = e9;
                    }
                } catch (NoSuchFieldError e10) {
                    e = e10;
                }
            } catch (NoSuchFieldError e11) {
                e = e11;
            }
            try {
                try {
                    try {
                        try {
                            LIZ[C09D6.NULL.ordinal()] = 4;
                        } catch (NoSuchFieldError e12) {
                            e = e12;
                            TryCatchGuardChecker.doCheck(e);
                        }
                    } catch (NoSuchFieldError e13) {
                        e = e13;
                    }
                } catch (NoSuchFieldError e14) {
                    e = e14;
                }
            } catch (NoSuchFieldError e15) {
                e = e15;
            }
            try {
                try {
                    try {
                    } catch (NoSuchFieldError e16) {
                        e = e16;
                    }
                    try {
                        LIZ[C09D6.BEGIN_ARRAY.ordinal()] = 5;
                    } catch (NoSuchFieldError e17) {
                        e = e17;
                        TryCatchGuardChecker.doCheck(e);
                    }
                } catch (NoSuchFieldError e18) {
                    e = e18;
                }
            } catch (NoSuchFieldError e19) {
                e = e19;
            }
            try {
                try {
                    try {
                        try {
                            LIZ[C09D6.BEGIN_OBJECT.ordinal()] = 6;
                        } catch (NoSuchFieldError e20) {
                            e = e20;
                            TryCatchGuardChecker.doCheck(e);
                        }
                    } catch (NoSuchFieldError e21) {
                        e = e21;
                    }
                } catch (NoSuchFieldError e22) {
                    e = e22;
                }
            } catch (NoSuchFieldError e23) {
                e = e23;
            }
            try {
                try {
                    try {
                        try {
                            LIZ[C09D6.END_DOCUMENT.ordinal()] = 7;
                        } catch (NoSuchFieldError e24) {
                            e = e24;
                            TryCatchGuardChecker.doCheck(e);
                        }
                    } catch (NoSuchFieldError e25) {
                        e = e25;
                    }
                } catch (NoSuchFieldError e26) {
                    e = e26;
                }
            } catch (NoSuchFieldError e27) {
                e = e27;
            }
            try {
                try {
                    try {
                        try {
                            LIZ[C09D6.NAME.ordinal()] = 8;
                        } catch (NoSuchFieldError e28) {
                            e = e28;
                            TryCatchGuardChecker.doCheck(e);
                        }
                    } catch (NoSuchFieldError e29) {
                        e = e29;
                    }
                } catch (NoSuchFieldError e30) {
                    e = e30;
                }
            } catch (NoSuchFieldError e31) {
                e = e31;
            }
            try {
                try {
                    try {
                    } catch (NoSuchFieldError e32) {
                        e = e32;
                    }
                } catch (NoSuchFieldError e33) {
                    e = e33;
                }
            } catch (NoSuchFieldError e34) {
                e = e34;
            }
            try {
                LIZ[C09D6.END_OBJECT.ordinal()] = 9;
            } catch (NoSuchFieldError e35) {
                e = e35;
                TryCatchGuardChecker.doCheck(e);
            }
            try {
                try {
                    try {
                        try {
                            LIZ[C09D6.END_ARRAY.ordinal()] = 10;
                        } catch (NoSuchFieldError e36) {
                            e = e36;
                            TryCatchGuardChecker.doCheck(e);
                        }
                    } catch (NoSuchFieldError e37) {
                        e = e37;
                    }
                } catch (NoSuchFieldError e38) {
                    e = e38;
                }
            } catch (NoSuchFieldError e39) {
                e = e39;
            }
        }
    }

    static {
        TypeAdapter<Boolean> typeAdapter = new TypeAdapter<Boolean>() { // from class: com.google.gson.internal.bind.TypeAdapters.3
            @Override // com.google.gson.TypeAdapter
            public final Boolean read(C09CU c09cu) {
                C09D6 c09d6LJJLIIIJ = c09cu.LJJLIIIJ();
                if (c09d6LJJLIIIJ == C09D6.NULL) {
                    c09cu.LJJJJJL();
                    return null;
                }
                if (c09d6LJJLIIIJ == C09D6.STRING) {
                    return Boolean.valueOf(Boolean.parseBoolean(c09cu.LJJJZ()));
                }
                return Boolean.valueOf(c09cu.LJJ());
            }

            @Override // com.google.gson.TypeAdapter
            public final void write(C09DL c09dl, Boolean bool) {
                c09dl.LJJJ(bool);
            }
        };
        LIZJ = new TypeAdapter<Boolean>() { // from class: com.google.gson.internal.bind.TypeAdapters.4
            @Override // com.google.gson.TypeAdapter
            public final Boolean read(C09CU c09cu) {
                if (c09cu.LJJLIIIJ() == C09D6.NULL) {
                    c09cu.LJJJJJL();
                    return null;
                }
                return Boolean.valueOf(c09cu.LJJJZ());
            }

            @Override // com.google.gson.TypeAdapter
            public final void write(C09DL c09dl, Boolean bool) {
                String string;
                Boolean bool2 = bool;
                if (bool2 == null) {
                    string = "null";
                } else {
                    string = bool2.toString();
                }
                c09dl.LJJJJJ(string);
            }
        };
        LIZLLL = new AnonymousClass33(Boolean.TYPE, Boolean.class, typeAdapter);
        LJ = new AnonymousClass33(Byte.TYPE, Byte.class, new TypeAdapter<Number>() { // from class: com.google.gson.internal.bind.TypeAdapters.5
            @Override // com.google.gson.TypeAdapter
            public final Number read(C09CU c09cu) {
                if (c09cu.LJJLIIIJ() == C09D6.NULL) {
                    c09cu.LJJJJJL();
                    return null;
                }
                try {
                    return Byte.valueOf((byte) c09cu.LJJIZ());
                } catch (NumberFormatException e) {
                    TryCatchGuardChecker.doCheck(e);
                    throw new s(e);
                }
            }

            @Override // com.google.gson.TypeAdapter
            public final void write(C09DL c09dl, Number number) {
                c09dl.LJJJJ(number);
            }
        });
        LJFF = new AnonymousClass33(Short.TYPE, Short.class, new TypeAdapter<Number>() { // from class: com.google.gson.internal.bind.TypeAdapters.6
            @Override // com.google.gson.TypeAdapter
            public final Number read(C09CU c09cu) {
                if (c09cu.LJJLIIIJ() == C09D6.NULL) {
                    c09cu.LJJJJJL();
                    return null;
                }
                try {
                    return Short.valueOf((short) c09cu.LJJIZ());
                } catch (NumberFormatException e) {
                    TryCatchGuardChecker.doCheck(e);
                    throw new s(e);
                }
            }

            @Override // com.google.gson.TypeAdapter
            public final void write(C09DL c09dl, Number number) {
                c09dl.LJJJJ(number);
            }
        });
        LJI = new AnonymousClass33(Integer.TYPE, Integer.class, new TypeAdapter<Number>() { // from class: com.google.gson.internal.bind.TypeAdapters.7
            @Override // com.google.gson.TypeAdapter
            public final Number read(C09CU c09cu) {
                if (c09cu.LJJLIIIJ() == C09D6.NULL) {
                    c09cu.LJJJJJL();
                    return null;
                }
                try {
                    return Integer.valueOf(c09cu.LJJIZ());
                } catch (NumberFormatException e) {
                    TryCatchGuardChecker.doCheck(e);
                    throw new s(e);
                }
            }

            @Override // com.google.gson.TypeAdapter
            public final void write(C09DL c09dl, Number number) {
                c09dl.LJJJJ(number);
            }
        });
        LJII = new AnonymousClass32(AtomicInteger.class, new TypeAdapter<AtomicInteger>() { // from class: com.google.gson.internal.bind.TypeAdapters.8
            @Override // com.google.gson.TypeAdapter
            public final AtomicInteger read(C09CU c09cu) {
                try {
                    return new AtomicInteger(c09cu.LJJIZ());
                } catch (NumberFormatException e) {
                    TryCatchGuardChecker.doCheck(e);
                    throw new s(e);
                }
            }

            @Override // com.google.gson.TypeAdapter
            public final void write(C09DL c09dl, AtomicInteger atomicInteger) throws IOException {
                c09dl.LJJIZ(atomicInteger.get());
            }
        }.nullSafe());
        LJIIIIZZ = new AnonymousClass32(AtomicBoolean.class, new TypeAdapter<AtomicBoolean>() { // from class: com.google.gson.internal.bind.TypeAdapters.9
            @Override // com.google.gson.TypeAdapter
            public final AtomicBoolean read(C09CU c09cu) {
                return new AtomicBoolean(c09cu.LJJ());
            }

            @Override // com.google.gson.TypeAdapter
            public final void write(C09DL c09dl, AtomicBoolean atomicBoolean) throws IOException {
                c09dl.LJJJJJL(atomicBoolean.get());
            }
        }.nullSafe());
        LJIIIZ = new AnonymousClass32(AtomicIntegerArray.class, new TypeAdapter<AtomicIntegerArray>() { // from class: com.google.gson.internal.bind.TypeAdapters.10
            @Override // com.google.gson.TypeAdapter
            public final AtomicIntegerArray read(C09CU c09cu) {
                ArrayList arrayList = new ArrayList();
                c09cu.LIZ();
                while (c09cu.LJIIZILJ()) {
                    try {
                        arrayList.add(Integer.valueOf(c09cu.LJJIZ()));
                    } catch (NumberFormatException e) {
                        TryCatchGuardChecker.doCheck(e);
                        throw new s(e);
                    }
                }
                c09cu.LJI();
                int size = arrayList.size();
                AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
                for (int i = 0; i < size; i++) {
                    atomicIntegerArray.set(i, ((Integer) arrayList.get(i)).intValue());
                }
                return atomicIntegerArray;
            }

            @Override // com.google.gson.TypeAdapter
            public final void write(C09DL c09dl, AtomicIntegerArray atomicIntegerArray) throws IOException {
                c09dl.LIZIZ();
                int length = atomicIntegerArray.length();
                for (int i = 0; i < length; i++) {
                    c09dl.LJJIZ(r6.get(i));
                }
                c09dl.LJI();
            }
        }.nullSafe());
        LJIIJ = new TypeAdapter<Number>() { // from class: com.google.gson.internal.bind.TypeAdapters.11
            @Override // com.google.gson.TypeAdapter
            public final Number read(C09CU c09cu) {
                if (c09cu.LJJLIIIJ() == C09D6.NULL) {
                    c09cu.LJJJJJL();
                    return null;
                }
                try {
                    return Long.valueOf(c09cu.LJJJ());
                } catch (NumberFormatException e) {
                    TryCatchGuardChecker.doCheck(e);
                    throw new s(e);
                }
            }

            @Override // com.google.gson.TypeAdapter
            public final void write(C09DL c09dl, Number number) {
                c09dl.LJJJJ(number);
            }
        };
        LJIIJJI = new TypeAdapter<Number>() { // from class: com.google.gson.internal.bind.TypeAdapters.12
            @Override // com.google.gson.TypeAdapter
            public final Number read(C09CU c09cu) {
                if (c09cu.LJJLIIIJ() == C09D6.NULL) {
                    c09cu.LJJJJJL();
                    return null;
                }
                return Float.valueOf((float) c09cu.LJJIL());
            }

            @Override // com.google.gson.TypeAdapter
            public final void write(C09DL c09dl, Number number) {
                c09dl.LJJJJ(number);
            }
        };
        LJIIL = new TypeAdapter<Number>() { // from class: com.google.gson.internal.bind.TypeAdapters.13
            @Override // com.google.gson.TypeAdapter
            public final Number read(C09CU c09cu) {
                if (c09cu.LJJLIIIJ() == C09D6.NULL) {
                    c09cu.LJJJJJL();
                    return null;
                }
                return Double.valueOf(c09cu.LJJIL());
            }

            @Override // com.google.gson.TypeAdapter
            public final void write(C09DL c09dl, Number number) {
                c09dl.LJJJJ(number);
            }
        };
        LJIILIIL = new AnonymousClass32(Number.class, new TypeAdapter<Number>() { // from class: com.google.gson.internal.bind.TypeAdapters.14
            @Override // com.google.gson.TypeAdapter
            public final Number read(C09CU c09cu) {
                C09D6 c09d6LJJLIIIJ = c09cu.LJJLIIIJ();
                int i = a.LIZ[c09d6LJJLIIIJ.ordinal()];
                if (i != 1 && i != 3) {
                    if (i == 4) {
                        c09cu.LJJJJJL();
                        return null;
                    }
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Expecting number, got: ");
                    sbLIZ.append(c09d6LJJLIIIJ);
                    throw new s(C2188811AlT.LIZIZ(sbLIZ));
                }
                return new r(c09cu.LJJJZ());
            }

            @Override // com.google.gson.TypeAdapter
            public final void write(C09DL c09dl, Number number) {
                c09dl.LJJJJ(number);
            }
        });
        LJIILJJIL = new AnonymousClass33(Character.TYPE, Character.class, new TypeAdapter<Character>() { // from class: com.google.gson.internal.bind.TypeAdapters.15
            @Override // com.google.gson.TypeAdapter
            public final Character read(C09CU c09cu) {
                if (c09cu.LJJLIIIJ() == C09D6.NULL) {
                    c09cu.LJJJJJL();
                    return null;
                }
                String strLJJJZ = c09cu.LJJJZ();
                if (strLJJJZ.length() == 1) {
                    return Character.valueOf(strLJJJZ.charAt(0));
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Expecting character, got: ");
                sbLIZ.append(strLJJJZ);
                throw new s(C2188811AlT.LIZIZ(sbLIZ));
            }

            @Override // com.google.gson.TypeAdapter
            public final void write(C09DL c09dl, Character ch) {
                String strValueOf;
                if (ch == null) {
                    strValueOf = null;
                } else {
                    strValueOf = String.valueOf(ch);
                }
                c09dl.LJJJJJ(strValueOf);
            }
        });
        TypeAdapter<String> typeAdapter2 = new TypeAdapter<String>() { // from class: com.google.gson.internal.bind.TypeAdapters.16
            @Override // com.google.gson.TypeAdapter
            public final String read(C09CU c09cu) {
                C09D6 c09d6LJJLIIIJ = c09cu.LJJLIIIJ();
                if (c09d6LJJLIIIJ == C09D6.NULL) {
                    c09cu.LJJJJJL();
                    return null;
                }
                if (c09d6LJJLIIIJ == C09D6.BOOLEAN) {
                    return Boolean.toString(c09cu.LJJ());
                }
                return c09cu.LJJJZ();
            }

            @Override // com.google.gson.TypeAdapter
            public final void write(C09DL c09dl, String str) {
                c09dl.LJJJJJ(str);
            }
        };
        LJIILL = new TypeAdapter<BigDecimal>() { // from class: com.google.gson.internal.bind.TypeAdapters.17
            @Override // com.google.gson.TypeAdapter
            public final BigDecimal read(C09CU c09cu) {
                if (c09cu.LJJLIIIJ() == C09D6.NULL) {
                    c09cu.LJJJJJL();
                    return null;
                }
                try {
                    return new BigDecimal(c09cu.LJJJZ());
                } catch (NumberFormatException e) {
                    TryCatchGuardChecker.doCheck(e);
                    throw new s(e);
                }
            }

            @Override // com.google.gson.TypeAdapter
            public final void write(C09DL c09dl, BigDecimal bigDecimal) {
                c09dl.LJJJJ(bigDecimal);
            }
        };
        LJIILLIIL = new TypeAdapter<BigInteger>() { // from class: com.google.gson.internal.bind.TypeAdapters.18
            @Override // com.google.gson.TypeAdapter
            public final BigInteger read(C09CU c09cu) {
                if (c09cu.LJJLIIIJ() == C09D6.NULL) {
                    c09cu.LJJJJJL();
                    return null;
                }
                try {
                    return new BigInteger(c09cu.LJJJZ());
                } catch (NumberFormatException e) {
                    TryCatchGuardChecker.doCheck(e);
                    throw new s(e);
                }
            }

            @Override // com.google.gson.TypeAdapter
            public final void write(C09DL c09dl, BigInteger bigInteger) {
                c09dl.LJJJJ(bigInteger);
            }
        };
        LJIIZILJ = new AnonymousClass32(String.class, typeAdapter2);
        LJIJ = new AnonymousClass32(StringBuilder.class, new TypeAdapter<StringBuilder>() { // from class: com.google.gson.internal.bind.TypeAdapters.19
            @Override // com.google.gson.TypeAdapter
            public final StringBuilder read(C09CU c09cu) {
                if (c09cu.LJJLIIIJ() == C09D6.NULL) {
                    c09cu.LJJJJJL();
                    return null;
                }
                return new StringBuilder(c09cu.LJJJZ());
            }

            @Override // com.google.gson.TypeAdapter
            public final void write(C09DL c09dl, StringBuilder sb) {
                String string;
                StringBuilder sb2 = sb;
                if (sb2 == null) {
                    string = null;
                } else {
                    string = sb2.toString();
                }
                c09dl.LJJJJJ(string);
            }
        });
        LJIJI = new AnonymousClass32(StringBuffer.class, new TypeAdapter<StringBuffer>() { // from class: com.google.gson.internal.bind.TypeAdapters.20
            @Override // com.google.gson.TypeAdapter
            public final StringBuffer read(C09CU c09cu) {
                if (c09cu.LJJLIIIJ() == C09D6.NULL) {
                    c09cu.LJJJJJL();
                    return null;
                }
                return new StringBuffer(c09cu.LJJJZ());
            }

            @Override // com.google.gson.TypeAdapter
            public final void write(C09DL c09dl, StringBuffer stringBuffer) {
                String string;
                StringBuffer stringBuffer2 = stringBuffer;
                if (stringBuffer2 == null) {
                    string = null;
                } else {
                    string = stringBuffer2.toString();
                }
                c09dl.LJJJJJ(string);
            }
        });
        LJIJJ = new AnonymousClass32(URL.class, new TypeAdapter<URL>() { // from class: com.google.gson.internal.bind.TypeAdapters.21
            @Override // com.google.gson.TypeAdapter
            public final URL read(C09CU c09cu) {
                if (c09cu.LJJLIIIJ() == C09D6.NULL) {
                    c09cu.LJJJJJL();
                } else {
                    String strLJJJZ = c09cu.LJJJZ();
                    if (!"null".equals(strLJJJZ)) {
                        return new URL(strLJJJZ);
                    }
                }
                return null;
            }

            @Override // com.google.gson.TypeAdapter
            public final void write(C09DL c09dl, URL url) {
                String externalForm;
                URL url2 = url;
                if (url2 == null) {
                    externalForm = null;
                } else {
                    externalForm = url2.toExternalForm();
                }
                c09dl.LJJJJJ(externalForm);
            }
        });
        LJIJJLI = new AnonymousClass32(URI.class, new TypeAdapter<URI>() { // from class: com.google.gson.internal.bind.TypeAdapters.22
            @Override // com.google.gson.TypeAdapter
            public final URI read(C09CU c09cu) {
                if (c09cu.LJJLIIIJ() == C09D6.NULL) {
                    c09cu.LJJJJJL();
                } else {
                    try {
                        String strLJJJZ = c09cu.LJJJZ();
                        if (!"null".equals(strLJJJZ)) {
                            return new URI(strLJJJZ);
                        }
                    } catch (URISyntaxException e) {
                        TryCatchGuardChecker.doCheck(e);
                        throw new l(e);
                    }
                }
                return null;
            }

            @Override // com.google.gson.TypeAdapter
            public final void write(C09DL c09dl, URI uri) {
                String aSCIIString;
                URI uri2 = uri;
                if (uri2 == null) {
                    aSCIIString = null;
                } else {
                    aSCIIString = uri2.toASCIIString();
                }
                c09dl.LJJJJJ(aSCIIString);
            }
        });
        final TypeAdapter<InetAddress> typeAdapter3 = new TypeAdapter<InetAddress>() { // from class: com.google.gson.internal.bind.TypeAdapters.23
            @Override // com.google.gson.TypeAdapter
            public final InetAddress read(C09CU c09cu) {
                if (c09cu.LJJLIIIJ() == C09D6.NULL) {
                    c09cu.LJJJJJL();
                    return null;
                }
                return InetAddress.getByName(c09cu.LJJJZ());
            }

            @Override // com.google.gson.TypeAdapter
            public final void write(C09DL c09dl, InetAddress inetAddress) throws Throwable {
                InetAddress inetAddress2 = inetAddress;
                String strD0 = null;
                if (inetAddress2 != null) {
                    strD0 = C2204961BRm.d0(inetAddress2, new C0WZX("dzBzEgU1UM3QUBkmVh2KKJr+bnV9X5jU9deLpbWCNHqU3Q4w/PdxBQvs", null));
                }
                c09dl.LJJJJJ(strD0);
            }
        };
        final Class<InetAddress> cls = InetAddress.class;
        LJIL = new v() { // from class: com.google.gson.internal.bind.TypeAdapters.35
            public final String toString() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Factory[typeHierarchy=");
                sbLIZ.append(cls.getName());
                sbLIZ.append(",adapter=");
                sbLIZ.append(typeAdapter3);
                sbLIZ.append(e3.f);
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            @Override // com.google.gson.v
            public final <T2> TypeAdapter<T2> create(Gson gson, TypeToken<T2> typeToken) {
                final Class<? super T2> rawType = typeToken.getRawType();
                if (!cls.isAssignableFrom(rawType)) {
                    return null;
                }
                return (TypeAdapter<T2>) new TypeAdapter<Object>() { // from class: com.google.gson.internal.bind.TypeAdapters.35.1
                    @Override // com.google.gson.TypeAdapter
                    public final Object read(C09CU c09cu) {
                        Object obj = typeAdapter3.read(c09cu);
                        if (obj != null && !rawType.isInstance(obj)) {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("Expected a ");
                            sbLIZ.append(rawType.getName());
                            sbLIZ.append(" but was ");
                            sbLIZ.append(obj.getClass().getName());
                            throw new s(C2188811AlT.LIZIZ(sbLIZ));
                        }
                        return obj;
                    }

                    @Override // com.google.gson.TypeAdapter
                    public final void write(C09DL c09dl, Object obj) {
                        typeAdapter3.write(c09dl, obj);
                    }
                };
            }
        };
        LJJ = new AnonymousClass32(UUID.class, new TypeAdapter<UUID>() { // from class: com.google.gson.internal.bind.TypeAdapters.24
            @Override // com.google.gson.TypeAdapter
            public final UUID read(C09CU c09cu) {
                if (c09cu.LJJLIIIJ() == C09D6.NULL) {
                    c09cu.LJJJJJL();
                    return null;
                }
                return UUID.fromString(c09cu.LJJJZ());
            }

            @Override // com.google.gson.TypeAdapter
            public final void write(C09DL c09dl, UUID uuid) {
                String string;
                UUID uuid2 = uuid;
                if (uuid2 == null) {
                    string = null;
                } else {
                    string = uuid2.toString();
                }
                c09dl.LJJJJJ(string);
            }
        });
        LJJI = new AnonymousClass32(Currency.class, new TypeAdapter<Currency>() { // from class: com.google.gson.internal.bind.TypeAdapters.25
            @Override // com.google.gson.TypeAdapter
            public final Currency read(C09CU c09cu) {
                return Currency.getInstance(c09cu.LJJJZ());
            }

            @Override // com.google.gson.TypeAdapter
            public final void write(C09DL c09dl, Currency currency) {
                c09dl.LJJJJJ(currency.getCurrencyCode());
            }
        }.nullSafe());
        LJJIFFI = new v() { // from class: com.google.gson.internal.bind.TypeAdapters.26
            @Override // com.google.gson.v
            public final <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
                if (typeToken.getRawType() != Timestamp.class) {
                    return null;
                }
                final TypeAdapter<T> typeAdapterLJIIJ = gson.LJIIJ(Date.class);
                return (TypeAdapter<T>) new TypeAdapter<Timestamp>() { // from class: com.google.gson.internal.bind.TypeAdapters.26.1
                    @Override // com.google.gson.TypeAdapter
                    public final Timestamp read(C09CU c09cu) {
                        Date date = (Date) typeAdapterLJIIJ.read(c09cu);
                        if (date != null) {
                            return new Timestamp(date.getTime());
                        }
                        return null;
                    }

                    @Override // com.google.gson.TypeAdapter
                    public final void write(C09DL c09dl, Timestamp timestamp) {
                        typeAdapterLJIIJ.write(c09dl, timestamp);
                    }
                };
            }
        };
        final TypeAdapter<Calendar> typeAdapter4 = new TypeAdapter<Calendar>() { // from class: com.google.gson.internal.bind.TypeAdapters.27
            @Override // com.google.gson.TypeAdapter
            public final Calendar read(C09CU c09cu) throws IOException {
                if (c09cu.LJJLIIIJ() == C09D6.NULL) {
                    c09cu.LJJJJJL();
                    return null;
                }
                c09cu.LIZIZ();
                int i = 0;
                int i2 = 0;
                int i3 = 0;
                int i4 = 0;
                int i5 = 0;
                int i6 = 0;
                while (c09cu.LJJLIIIJ() != C09D6.END_OBJECT) {
                    String strLJJJJ = c09cu.LJJJJ();
                    int iLJJIZ = c09cu.LJJIZ();
                    if ("year".equals(strLJJJJ)) {
                        i = iLJJIZ;
                    } else if ("month".equals(strLJJJJ)) {
                        i2 = iLJJIZ;
                    } else if ("dayOfMonth".equals(strLJJJJ)) {
                        i3 = iLJJIZ;
                    } else if ("hourOfDay".equals(strLJJJJ)) {
                        i4 = iLJJIZ;
                    } else if ("minute".equals(strLJJJJ)) {
                        i5 = iLJJIZ;
                    } else if ("second".equals(strLJJJJ)) {
                        i6 = iLJJIZ;
                    }
                }
                c09cu.LJII();
                return new GregorianCalendar(i, i2, i3, i4, i5, i6);
            }

            @Override // com.google.gson.TypeAdapter
            public final void write(C09DL c09dl, Calendar calendar) throws IOException {
                if (calendar == null) {
                    c09dl.LJIJJ();
                    return;
                }
                c09dl.LIZLLL();
                c09dl.LJIILLIIL("year");
                c09dl.LJJIZ(r4.get(1));
                c09dl.LJIILLIIL("month");
                c09dl.LJJIZ(r4.get(2));
                c09dl.LJIILLIIL("dayOfMonth");
                c09dl.LJJIZ(r4.get(5));
                c09dl.LJIILLIIL("hourOfDay");
                c09dl.LJJIZ(r4.get(11));
                c09dl.LJIILLIIL("minute");
                c09dl.LJJIZ(r4.get(12));
                c09dl.LJIILLIIL("second");
                c09dl.LJJIZ(r4.get(13));
                c09dl.LJII();
            }
        };
        final Class<Calendar> cls2 = Calendar.class;
        final Class<GregorianCalendar> cls3 = GregorianCalendar.class;
        LJJII = new v() { // from class: com.google.gson.internal.bind.TypeAdapters.34
            public final String toString() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Factory[type=");
                sbLIZ.append(cls2.getName());
                sbLIZ.append("+");
                sbLIZ.append(cls3.getName());
                sbLIZ.append(",adapter=");
                sbLIZ.append(typeAdapter4);
                sbLIZ.append(e3.f);
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            @Override // com.google.gson.v
            public final <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
                Class<? super T> rawType = typeToken.getRawType();
                if (rawType != cls2 && rawType != cls3) {
                    return null;
                }
                return typeAdapter4;
            }
        };
        LJJIII = new AnonymousClass32(Locale.class, new TypeAdapter<Locale>() { // from class: com.google.gson.internal.bind.TypeAdapters.28
            @Override // com.google.gson.TypeAdapter
            public final Locale read(C09CU c09cu) {
                String strNextToken;
                String strNextToken2;
                String strNextToken3 = null;
                if (c09cu.LJJLIIIJ() == C09D6.NULL) {
                    c09cu.LJJJJJL();
                    return null;
                }
                StringTokenizer stringTokenizer = new StringTokenizer(c09cu.LJJJZ(), "_");
                if (stringTokenizer.hasMoreElements()) {
                    strNextToken = stringTokenizer.nextToken();
                } else {
                    strNextToken = null;
                }
                if (stringTokenizer.hasMoreElements()) {
                    strNextToken2 = stringTokenizer.nextToken();
                } else {
                    strNextToken2 = null;
                }
                if (stringTokenizer.hasMoreElements()) {
                    strNextToken3 = stringTokenizer.nextToken();
                }
                if (strNextToken2 == null) {
                    if (strNextToken3 == null) {
                        return new Locale(strNextToken);
                    }
                } else if (strNextToken3 == null) {
                    return new Locale(strNextToken, strNextToken2);
                }
                return new Locale(strNextToken, strNextToken2, strNextToken3);
            }

            @Override // com.google.gson.TypeAdapter
            public final void write(C09DL c09dl, Locale locale) {
                String string;
                Locale locale2 = locale;
                if (locale2 == null) {
                    string = null;
                } else {
                    string = locale2.toString();
                }
                c09dl.LJJJJJ(string);
            }
        });
        final TypeAdapter<k> typeAdapter5 = new TypeAdapter<k>() { // from class: com.google.gson.internal.bind.TypeAdapters.29
            public final k LIZ(C09CU c09cu) {
                switch (a.LIZ[c09cu.LJJLIIIJ().ordinal()]) {
                    case 1:
                        return new q((Number) new r(c09cu.LJJJZ()));
                    case 2:
                        return new q(Boolean.valueOf(c09cu.LJJ()));
                    case 3:
                        return new q(c09cu.LJJJZ());
                    case 4:
                        c09cu.LJJJJJL();
                        return m.LL;
                    case 5:
                        h hVar = new h();
                        c09cu.LIZ();
                        while (c09cu.LJIIZILJ()) {
                            hVar.LJJIFFI(read(c09cu));
                        }
                        c09cu.LJI();
                        return hVar;
                    case 6:
                        n nVar = new n();
                        c09cu.LIZIZ();
                        while (c09cu.LJIIZILJ()) {
                            nVar.LJJIFFI(c09cu.LJJJJ(), read(c09cu));
                        }
                        c09cu.LJII();
                        return nVar;
                    default:
                        throw new IllegalArgumentException();
                }
            }

            @Override // com.google.gson.TypeAdapter
            /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
            public final k read(C09CU c09cu) {
                String strLJJJJ;
                boolean z;
                Method method;
                if (C09CQ.LIZIZ) {
                    return LIZ(c09cu);
                }
                if ((c09cu instanceof com.google.gson.internal.bind.a) && (method = C09CQ.LJIIIIZZ) != null) {
                    C09D6 c09d6LJJLIIIJ = c09cu.LJJLIIIJ();
                    if (c09d6LJJLIIIJ != C09D6.NAME && c09d6LJJLIIIJ != C09D6.END_ARRAY && c09d6LJJLIIIJ != C09D6.END_OBJECT && c09d6LJJLIIIJ != C09D6.END_DOCUMENT) {
                        try {
                            try {
                                try {
                                    k kVar = (k) method.invoke(c09cu, new Object[0]);
                                    try {
                                        c09cu.LJJZ();
                                        if (kVar != null) {
                                            return kVar;
                                        }
                                    } catch (Exception e) {
                                        e = e;
                                        TryCatchGuardChecker.doCheck(e);
                                    }
                                } catch (Exception e2) {
                                    e = e2;
                                }
                            } catch (Exception e3) {
                                e = e3;
                            }
                        } catch (Exception e4) {
                            e = e4;
                        }
                    } else {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("Unexpected ");
                        sbLIZ.append(c09d6LJJLIIIJ);
                        sbLIZ.append(" when reading a JsonElement.");
                        throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
                    }
                }
                C09D6 c09d6LJJLIIIJ2 = c09cu.LJJLIIIJ();
                k kVarLIZIZ = C09CQ.LIZIZ(c09cu, c09d6LJJLIIIJ2);
                if (kVarLIZIZ == null) {
                    return C09CQ.LIZ(c09cu, c09d6LJJLIIIJ2);
                }
                ArrayDeque arrayDeque = new ArrayDeque();
                while (true) {
                    if (c09cu.LJIIZILJ()) {
                        if (kVarLIZIZ instanceof n) {
                            strLJJJJ = c09cu.LJJJJ();
                        } else {
                            strLJJJJ = null;
                        }
                        C09D6 c09d6LJJLIIIJ3 = c09cu.LJJLIIIJ();
                        k kVarLIZIZ2 = C09CQ.LIZIZ(c09cu, c09d6LJJLIIIJ3);
                        if (kVarLIZIZ2 != null) {
                            z = true;
                        } else {
                            z = false;
                            kVarLIZIZ2 = C09CQ.LIZ(c09cu, c09d6LJJLIIIJ3);
                        }
                        if (kVarLIZIZ instanceof h) {
                            ((h) kVarLIZIZ).LJJIFFI(kVarLIZIZ2);
                        } else {
                            ((n) kVarLIZIZ).LJJIFFI(strLJJJJ, kVarLIZIZ2);
                        }
                        if (z) {
                            arrayDeque.addLast(kVarLIZIZ);
                            kVarLIZIZ = kVarLIZIZ2;
                        }
                    } else {
                        if (kVarLIZIZ instanceof h) {
                            c09cu.LJI();
                        } else {
                            c09cu.LJII();
                        }
                        if (arrayDeque.isEmpty()) {
                            return kVarLIZIZ;
                        }
                        kVarLIZIZ = (k) arrayDeque.removeLast();
                    }
                }
            }

            @Override // com.google.gson.TypeAdapter
            /* JADX INFO: renamed from: LIZJ, reason: merged with bridge method [inline-methods] */
            public final void write(k kVar, C09DL c09dl) throws IOException {
                if (kVar != null && !(kVar instanceof m)) {
                    if (kVar instanceof q) {
                        q qVarLJIILJJIL = kVar.LJIILJJIL();
                        Object obj = qVarLJIILJJIL.LL;
                        if (obj instanceof Number) {
                            c09dl.LJJJJ(qVarLJIILJJIL.LJIJ());
                            return;
                        } else if (obj instanceof Boolean) {
                            c09dl.LJJJJJL(qVarLJIILJJIL.LJ());
                            return;
                        } else {
                            c09dl.LJJJJJ(qVarLJIILJJIL.LJIL());
                            return;
                        }
                    }
                    if (kVar instanceof h) {
                        c09dl.LIZIZ();
                        Iterator<k> it2 = kVar.LJIIL().iterator();
                        while (it2.hasNext()) {
                            write(it2.next(), c09dl);
                        }
                        c09dl.LJI();
                        return;
                    }
                    if (kVar instanceof n) {
                        c09dl.LIZLLL();
                        for (Map.Entry<String, k> entry : kVar.LJIILIIL().entrySet()) {
                            c09dl.LJIILLIIL(entry.getKey());
                            write(entry.getValue(), c09dl);
                        }
                        c09dl.LJII();
                        return;
                    }
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Couldn't write ");
                    sbLIZ.append(kVar.getClass());
                    throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
                }
                c09dl.LJIJJ();
            }
        };
        LJJIIJ = typeAdapter5;
        final Class<k> cls4 = k.class;
        LJJIIJZLJL = new v() { // from class: com.google.gson.internal.bind.TypeAdapters.35
            public final String toString() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Factory[typeHierarchy=");
                sbLIZ.append(cls4.getName());
                sbLIZ.append(",adapter=");
                sbLIZ.append(typeAdapter5);
                sbLIZ.append(e3.f);
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            @Override // com.google.gson.v
            public final <T2> TypeAdapter<T2> create(Gson gson, TypeToken<T2> typeToken) {
                final Class rawType = typeToken.getRawType();
                if (!cls4.isAssignableFrom(rawType)) {
                    return null;
                }
                return (TypeAdapter<T2>) new TypeAdapter<Object>() { // from class: com.google.gson.internal.bind.TypeAdapters.35.1
                    @Override // com.google.gson.TypeAdapter
                    public final Object read(C09CU c09cu) {
                        Object obj = typeAdapter5.read(c09cu);
                        if (obj != null && !rawType.isInstance(obj)) {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("Expected a ");
                            sbLIZ.append(rawType.getName());
                            sbLIZ.append(" but was ");
                            sbLIZ.append(obj.getClass().getName());
                            throw new s(C2188811AlT.LIZIZ(sbLIZ));
                        }
                        return obj;
                    }

                    @Override // com.google.gson.TypeAdapter
                    public final void write(C09DL c09dl, Object obj) {
                        typeAdapter5.write(c09dl, obj);
                    }
                };
            }
        };
        LJJIIZ = new v() { // from class: com.google.gson.internal.bind.TypeAdapters.30
            @Override // com.google.gson.v
            public final <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
                Class<? super T> rawType = typeToken.getRawType();
                if (Enum.class.isAssignableFrom(rawType) && rawType != Enum.class) {
                    if (!rawType.isEnum()) {
                        rawType = rawType.getSuperclass();
                    }
                    return new EnumTypeAdapter(rawType);
                }
                return null;
            }
        };
    }

    public static final class EnumTypeAdapter<T extends Enum<T>> extends TypeAdapter<T> {
        public final Map<String, T> LIZ = new HashMap();
        public final Map<T, String> LIZIZ = new HashMap();

        public EnumTypeAdapter(Class<T> cls) {
            try {
                for (T t : cls.getEnumConstants()) {
                    String strName = t.name();
                    C09CT c09ct = (C09CT) cls.getField(strName).getAnnotation(C09CT.class);
                    if (c09ct != null) {
                        strName = c09ct.value();
                        for (String str : c09ct.alternate()) {
                            this.LIZ.put(str, t);
                        }
                    }
                    this.LIZ.put(strName, t);
                    this.LIZIZ.put(t, strName);
                }
            } catch (NoSuchFieldException e) {
                TryCatchGuardChecker.doCheck(e);
                throw new AssertionError(e);
            }
        }

        @Override // com.google.gson.TypeAdapter
        public final Object read(C09CU c09cu) {
            if (c09cu.LJJLIIIJ() == C09D6.NULL) {
                c09cu.LJJJJJL();
                return null;
            }
            return ((HashMap) this.LIZ).get(c09cu.LJJJZ());
        }

        @Override // com.google.gson.TypeAdapter
        public final void write(C09DL c09dl, Object obj) {
            String str;
            if (obj == null) {
                str = null;
            } else {
                str = (String) ((HashMap) this.LIZIZ).get(obj);
            }
            c09dl.LJJJJJ(str);
        }
    }

    public static <TT> v LIZ(final TypeToken<TT> typeToken, final TypeAdapter<TT> typeAdapter) {
        return new v() { // from class: com.google.gson.internal.bind.TypeAdapters.31
            @Override // com.google.gson.v
            public final <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken2) {
                if (typeToken2.equals(typeToken)) {
                    return typeAdapter;
                }
                return null;
            }
        };
    }

    public static <TT> v LIZIZ(Class<TT> cls, TypeAdapter<TT> typeAdapter) {
        return new AnonymousClass32(cls, typeAdapter);
    }

    public static <TT> v LIZJ(Class<TT> cls, Class<TT> cls2, TypeAdapter<? super TT> typeAdapter) {
        return new AnonymousClass33(cls, cls2, typeAdapter);
    }
}
