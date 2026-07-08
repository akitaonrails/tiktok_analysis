package com.bytedance.mt.protector.impl;

import X.C08FG;
import X.C08FV;
import X.C09CU;
import X.C09DL;
import X.C09EU;
import X.C2337809Ea;
import com.bytedance.mt.protector.SelfDataManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.k;
import com.google.gson.m;
import com.google.gson.n;
import com.google.gson.p;
import java.io.Reader;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes4.dex */
public class GsonProtectorUtils {
    public static Gson createGson() {
        if (!C09EU.LIZIZ()) {
            return new Gson();
        }
        try {
            return new Gson();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C08FV c08fvLIZ = C09EU.LIZ(C08FG.JSON, th);
            if (c08fvLIZ == null) {
                addSelfData("createGson", th, "Gson<init>");
                throw th;
            }
            if (c08fvLIZ.LIZ instanceof k) {
                return new Gson();
            }
            return null;
        }
    }

    public static k parse(p pVar, String str) {
        if (C09EU.LIZIZ()) {
            try {
                pVar.getClass();
                return p.LIZJ(str);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C08FV c08fvLIZ = C09EU.LIZ(C08FG.JSON, th);
                if (c08fvLIZ != null) {
                    Object obj = c08fvLIZ.LIZ;
                    if (obj instanceof String) {
                        pVar.getClass();
                        return p.LIZJ((String) obj);
                    }
                    return null;
                }
                addSelfData("parse", th, str);
                throw th;
            }
        }
        pVar.getClass();
        return p.LIZJ(str);
    }

    public static String toJson(Gson gson, k kVar) {
        if (C09EU.LIZIZ()) {
            try {
                return gson.LJIILJJIL(kVar);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C08FV c08fvLIZ = C09EU.LIZ(C08FG.JSON, th);
                if (c08fvLIZ != null) {
                    return (String) c08fvLIZ.LIZ;
                }
                throw th;
            }
        }
        return gson.LJIILJJIL(kVar);
    }

    public static k toJsonTree(Gson gson, Object obj) {
        if (C09EU.LIZIZ()) {
            try {
                return gson.LJIJJLI(obj);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                if (C09EU.LIZ(C08FG.JSON, th) != null) {
                    return null;
                }
                throw th;
            }
        }
        return gson.LJIJJLI(obj);
    }

    public static String toJson(Gson gson, Object obj) {
        if (C09EU.LIZIZ()) {
            try {
                return gson.LJIILL(obj);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C08FV c08fvLIZ = C09EU.LIZ(C08FG.JSON, th);
                if (c08fvLIZ != null) {
                    return (String) c08fvLIZ.LIZ;
                }
                throw th;
            }
        }
        return gson.LJIILL(obj);
    }

    public static void addSelfData(String str, Throwable th, String str2) {
        try {
            String strLIZ = C2337809Ea.LIZ(th);
            n nVar = new n();
            nVar.LJJIIJ("stackTrace", strLIZ);
            nVar.LJJIIJ("inputData", str2);
            SelfDataManager.LJ.LIZ(str, th, nVar);
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            C09EU.LIZJ.LIZ();
        }
    }

    public static <T> T fromJson(Gson gson, C09CU c09cu, Type type) {
        if (C09EU.LIZIZ()) {
            try {
                return (T) gson.LJ(c09cu, type);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C08FV c08fvLIZ = C09EU.LIZ(C08FG.JSON, th);
                if (c08fvLIZ != null) {
                    Object obj = c08fvLIZ.LIZ;
                    if (obj instanceof k) {
                        return (T) gson.LIZLLL((k) obj, type);
                    }
                    return null;
                }
                addSelfData("fromJson", th, "unsupport JsonReader");
                throw th;
            }
        }
        return (T) gson.LJ(c09cu, type);
    }

    public static void toJson(Gson gson, Object obj, Appendable appendable) {
        if (C09EU.LIZIZ()) {
            try {
                gson.getClass();
                if (obj != null) {
                    gson.LJIJJ(obj, obj.getClass(), appendable);
                    return;
                } else {
                    gson.LJIJ(m.LL, appendable);
                    return;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                if (C09EU.LIZ(C08FG.JSON, th) != null) {
                    return;
                } else {
                    throw th;
                }
            }
        }
        gson.getClass();
        if (obj != null) {
            gson.LJIJJ(obj, obj.getClass(), appendable);
        } else {
            gson.LJIJ(m.LL, appendable);
        }
    }

    public static k toJsonTree(Gson gson, Object obj, Type type) {
        if (C09EU.LIZIZ()) {
            try {
                return gson.LJIL(obj, type);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                if (C09EU.LIZ(C08FG.JSON, th) != null) {
                    return null;
                }
                throw th;
            }
        }
        return gson.LJIL(obj, type);
    }

    public static void addSelfData(String str, Throwable th, k kVar) {
        String string;
        if (kVar != null) {
            string = kVar.toString();
        } else {
            string = "null-param";
        }
        addSelfData(str, th, string);
    }

    public static <T> T fromJson(Gson gson, Reader reader, Class<T> cls) {
        if (C09EU.LIZIZ()) {
            try {
                return (T) gson.LJFF(reader, cls);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C08FV c08fvLIZ = C09EU.LIZ(C08FG.JSON, th);
                if (c08fvLIZ != null) {
                    Object obj = c08fvLIZ.LIZ;
                    if (obj instanceof k) {
                        return (T) gson.LIZJ((k) obj, cls);
                    }
                    return null;
                }
                addSelfData("fromJson", th, "unsupport Reader");
                throw th;
            }
        }
        return (T) gson.LJFF(reader, cls);
    }

    public static String toJson(Gson gson, Object obj, Type type) {
        if (C09EU.LIZIZ()) {
            try {
                return gson.LJIILLIIL(obj, type);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C08FV c08fvLIZ = C09EU.LIZ(C08FG.JSON, th);
                if (c08fvLIZ != null) {
                    return (String) c08fvLIZ.LIZ;
                }
                throw th;
            }
        }
        return gson.LJIILLIIL(obj, type);
    }

    public static <T> T fromJson(Gson gson, Reader reader, Type type) {
        if (C09EU.LIZIZ()) {
            try {
                return (T) gson.LJI(reader, type);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C08FV c08fvLIZ = C09EU.LIZ(C08FG.JSON, th);
                if (c08fvLIZ != null) {
                    Object obj = c08fvLIZ.LIZ;
                    if (obj instanceof k) {
                        return (T) gson.LIZLLL((k) obj, type);
                    }
                    return null;
                }
                addSelfData("fromJson", th, "unsupport Reader");
                throw th;
            }
        }
        return (T) gson.LJI(reader, type);
    }

    public static void toJson(Gson gson, k kVar, Appendable appendable) {
        if (C09EU.LIZIZ()) {
            try {
                gson.LJIJ(kVar, appendable);
                return;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                if (C09EU.LIZ(C08FG.JSON, th) != null) {
                    return;
                } else {
                    throw th;
                }
            }
        }
        gson.LJIJ(kVar, appendable);
    }

    public static <T> T fromJson(Gson gson, k kVar, Class<T> cls) {
        if (C09EU.LIZIZ()) {
            try {
                return (T) gson.LIZJ(kVar, cls);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C08FV c08fvLIZ = C09EU.LIZ(C08FG.JSON, th);
                if (c08fvLIZ != null) {
                    Object obj = c08fvLIZ.LIZ;
                    if (obj instanceof k) {
                        return (T) gson.LIZJ((k) obj, cls);
                    }
                    return null;
                }
                addSelfData("fromJson", th, kVar);
                throw th;
            }
        }
        return (T) gson.LIZJ(kVar, cls);
    }

    public static <T> T fromJson(Gson gson, k kVar, Type type) {
        if (C09EU.LIZIZ()) {
            try {
                return (T) gson.LIZLLL(kVar, type);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C08FV c08fvLIZ = C09EU.LIZ(C08FG.JSON, th);
                if (c08fvLIZ != null) {
                    Object obj = c08fvLIZ.LIZ;
                    if (obj instanceof k) {
                        return (T) gson.LIZLLL((k) obj, type);
                    }
                    return null;
                }
                addSelfData("fromJson", th, kVar);
                throw th;
            }
        }
        return (T) gson.LIZLLL(kVar, type);
    }

    public static <T> T fromJson(Gson gson, String str, Class<T> cls) {
        if (C09EU.LIZIZ()) {
            try {
                return (T) gson.LJII(str, cls);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C08FV c08fvLIZ = C09EU.LIZ(C08FG.JSON, th);
                if (c08fvLIZ != null) {
                    Object obj = c08fvLIZ.LIZ;
                    if (obj instanceof k) {
                        return (T) gson.LIZJ((k) obj, cls);
                    }
                    return null;
                }
                addSelfData("fromJson", th, str);
                throw th;
            }
        }
        return (T) gson.LJII(str, cls);
    }

    public static <T> T fromJson(Gson gson, String str, Type type) {
        if (C09EU.LIZIZ()) {
            try {
                return (T) gson.LJIIIIZZ(str, type);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C08FV c08fvLIZ = C09EU.LIZ(C08FG.JSON, th);
                if (c08fvLIZ != null) {
                    Object obj = c08fvLIZ.LIZ;
                    if (obj instanceof k) {
                        return (T) gson.LIZLLL((k) obj, type);
                    }
                    return null;
                }
                addSelfData("fromJson", th, str);
                throw th;
            }
        }
        return (T) gson.LJIIIIZZ(str, type);
    }

    public static void toJson(Gson gson, Object obj, Type type, C09DL c09dl) {
        if (C09EU.LIZIZ()) {
            try {
                gson.LJIJI(obj, type, c09dl);
                return;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                if (C09EU.LIZ(C08FG.JSON, th) != null) {
                    return;
                } else {
                    throw th;
                }
            }
        }
        gson.LJIJI(obj, type, c09dl);
    }

    public static void toJson(Gson gson, Object obj, Type type, Appendable appendable) {
        if (C09EU.LIZIZ()) {
            try {
                gson.LJIJJ(obj, type, appendable);
                return;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                if (C09EU.LIZ(C08FG.JSON, th) != null) {
                    return;
                } else {
                    throw th;
                }
            }
        }
        gson.LJIJJ(obj, type, appendable);
    }
}
