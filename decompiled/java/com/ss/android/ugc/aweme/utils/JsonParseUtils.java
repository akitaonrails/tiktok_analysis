package com.ss.android.ugc.aweme.utils;

import X.C09C3;
import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C2188811AlT;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.e;
import com.google.gson.internal.b;
import com.google.gson.s;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class JsonParseUtils {
    public static volatile Gson LIZ;
    public static boolean LIZIZ;
    public static final TypeAdapter<Boolean> LIZJ = new TypeAdapter<Boolean>() { // from class: com.ss.android.ugc.aweme.utils.JsonParseUtils.1
        @Override // com.google.gson.TypeAdapter
        public final Boolean read(C09CU c09cu) {
            C09D6 c09d6LJJLIIIJ = c09cu.LJJLIIIJ();
            int i = C09C3.LIZ[c09d6LJJLIIIJ.ordinal()];
            boolean z = true;
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i == 4) {
                            return Boolean.valueOf(Boolean.parseBoolean(c09cu.LJJJZ()));
                        }
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("Expected BOOLEAN or NUMBER but was ");
                        sbLIZ.append(c09d6LJJLIIIJ);
                        throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
                    }
                    try {
                        if (c09cu.LJJIZ() == 0) {
                            z = false;
                        }
                    } catch (NumberFormatException e) {
                        e = e;
                    }
                    try {
                        return Boolean.valueOf(z);
                    } catch (NumberFormatException e2) {
                        e = e2;
                        TryCatchGuardChecker.doCheck(e);
                        throw new s(e);
                    }
                }
                c09cu.LJJJJJL();
                return null;
            }
            return Boolean.valueOf(c09cu.LJJ());
        }

        @Override // com.google.gson.TypeAdapter
        public final void write(C09DL c09dl, Boolean bool) {
            Boolean bool2 = bool;
            if (bool2 == null) {
                c09dl.LJIJJ();
            } else {
                c09dl.LJJJ(bool2);
            }
        }
    };
    public static final TypeAdapter<Integer> LIZLLL = new TypeAdapter<Integer>() { // from class: com.ss.android.ugc.aweme.utils.JsonParseUtils.2
        @Override // com.google.gson.TypeAdapter
        public final Integer read(C09CU c09cu) {
            C09D6 c09d6LJJLIIIJ = c09cu.LJJLIIIJ();
            int i = C09C3.LIZ[c09d6LJJLIIIJ.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i == 4) {
                            return Integer.valueOf(Boolean.parseBoolean(c09cu.LJJJZ()) ? 1 : 0);
                        }
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("Expected BOOLEAN or NUMBER but was ");
                        sbLIZ.append(c09d6LJJLIIIJ);
                        throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
                    }
                    try {
                        try {
                            return Integer.valueOf(c09cu.LJJIZ());
                        } catch (NumberFormatException e) {
                            e = e;
                            TryCatchGuardChecker.doCheck(e);
                            throw new s(e);
                        }
                    } catch (NumberFormatException e2) {
                        e = e2;
                    }
                } else {
                    c09cu.LJJJJJL();
                    return null;
                }
            } else {
                return Integer.valueOf(c09cu.LJJ() ? 1 : 0);
            }
        }

        @Override // com.google.gson.TypeAdapter
        public final void write(C09DL c09dl, Integer num) {
            Integer num2 = num;
            if (num2 == null) {
                c09dl.LJIJJ();
            } else {
                c09dl.LJJJJ(num2);
            }
        }
    };

    public static Gson LIZ() {
        if (!LIZIZ) {
            return LIZIZ().LIZ();
        }
        if (LIZ == null) {
            LIZ = LIZIZ().LIZ();
        }
        return LIZ;
    }

    public static e LIZIZ() {
        e eVar = new e();
        TypeAdapter<Boolean> typeAdapter = LIZJ;
        eVar.LIZJ(typeAdapter, Boolean.class);
        eVar.LIZJ(typeAdapter, Boolean.TYPE);
        TypeAdapter<Integer> typeAdapter2 = LIZLLL;
        eVar.LIZJ(typeAdapter2, Integer.class);
        eVar.LIZJ(typeAdapter2, Integer.TYPE);
        eVar.LJIILL = true;
        return eVar;
    }

    public static String LJ(Object obj) {
        return GsonProtectorUtils.toJson(LIZ(), obj);
    }

    public static List LIZJ(Class cls, String str) {
        try {
            return (List) GsonProtectorUtils.fromJson(LIZ(), str, new b.C0011b(null, ArrayList.class, cls));
        } catch (NullPointerException e) {
            TryCatchGuardChecker.doCheck(e);
            return new ArrayList();
        }
    }

    public static Object LIZLLL(Class cls, String str) {
        return GsonProtectorUtils.fromJson(LIZ(), str, cls);
    }
}
