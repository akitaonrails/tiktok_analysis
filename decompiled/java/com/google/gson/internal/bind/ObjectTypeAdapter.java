package com.google.gson.internal.bind;

import X.C09CQ;
import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.s;
import com.google.gson.reflect.TypeToken;
import com.google.gson.v;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class ObjectTypeAdapter extends TypeAdapter<Object> {
    public static final v LIZIZ = new v() { // from class: com.google.gson.internal.bind.ObjectTypeAdapter.1
        @Override // com.google.gson.v
        public final <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
            if (typeToken.getRawType() == Object.class) {
                return new ObjectTypeAdapter(gson);
            }
            return null;
        }
    };
    public final Gson LIZ;

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
                iArr[C09D6.BEGIN_ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError e3) {
                e = e3;
                TryCatchGuardChecker.doCheck(e);
            }
            try {
                try {
                    try {
                    } catch (NoSuchFieldError e4) {
                        e = e4;
                    }
                } catch (NoSuchFieldError e5) {
                    e = e5;
                }
            } catch (NoSuchFieldError e6) {
                e = e6;
            }
            try {
                LIZ[C09D6.BEGIN_OBJECT.ordinal()] = 2;
            } catch (NoSuchFieldError e7) {
                e = e7;
                TryCatchGuardChecker.doCheck(e);
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
                            LIZ[C09D6.NUMBER.ordinal()] = 4;
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
                        LIZ[C09D6.BOOLEAN.ordinal()] = 5;
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
                            LIZ[C09D6.NULL.ordinal()] = 6;
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
        }
    }

    public ObjectTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    public final Object LIZ(C09CU c09cu) {
        switch (a.LIZ[c09cu.LJJLIIIJ().ordinal()]) {
            case 1:
                ArrayList arrayList = new ArrayList();
                c09cu.LIZ();
                while (c09cu.LJIIZILJ()) {
                    arrayList.add(read(c09cu));
                }
                c09cu.LJI();
                return arrayList;
            case 2:
                s sVar = new s();
                c09cu.LIZIZ();
                while (c09cu.LJIIZILJ()) {
                    sVar.put(c09cu.LJJJJ(), read(c09cu));
                }
                c09cu.LJII();
                return sVar;
            case 3:
                return c09cu.LJJJZ();
            case 4:
                return Double.valueOf(c09cu.LJJIL());
            case 5:
                return Boolean.valueOf(c09cu.LJJ());
            case 6:
                c09cu.LJJJJJL();
                return null;
            default:
                throw new IllegalStateException();
        }
    }

    @Override // com.google.gson.TypeAdapter
    public final Object read(C09CU c09cu) {
        String strLJJJJ;
        boolean z;
        if (C09CQ.LIZIZ) {
            return LIZ(c09cu);
        }
        C09D6 c09d6LJJLIIIJ = c09cu.LJJLIIIJ();
        Object objLJFF = C09CQ.LJFF(c09cu, c09d6LJJLIIIJ);
        if (objLJFF == null) {
            return C09CQ.LJ(c09cu, c09d6LJJLIIIJ);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (c09cu.LJIIZILJ()) {
                if (objLJFF instanceof Map) {
                    strLJJJJ = c09cu.LJJJJ();
                } else {
                    strLJJJJ = null;
                }
                C09D6 c09d6LJJLIIIJ2 = c09cu.LJJLIIIJ();
                Object objLJFF2 = C09CQ.LJFF(c09cu, c09d6LJJLIIIJ2);
                if (objLJFF2 != null) {
                    z = true;
                } else {
                    z = false;
                    objLJFF2 = C09CQ.LJ(c09cu, c09d6LJJLIIIJ2);
                }
                if (objLJFF instanceof List) {
                    ((List) objLJFF).add(objLJFF2);
                } else {
                    ((Map) objLJFF).put(strLJJJJ, objLJFF2);
                }
                if (z) {
                    arrayDeque.addLast(objLJFF);
                    objLJFF = objLJFF2;
                }
            } else {
                if (objLJFF instanceof List) {
                    c09cu.LJI();
                } else {
                    c09cu.LJII();
                }
                if (arrayDeque.isEmpty()) {
                    return objLJFF;
                }
                objLJFF = arrayDeque.removeLast();
            }
        }
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, Object obj) {
        if (obj == null) {
            c09dl.LJIJJ();
            return;
        }
        TypeAdapter typeAdapterLJIIJ = this.LIZ.LJIIJ(obj.getClass());
        if (typeAdapterLJIIJ instanceof ObjectTypeAdapter) {
            c09dl.LIZLLL();
            c09dl.LJII();
        } else {
            typeAdapterLJIIJ.write(c09dl, obj);
        }
    }
}
