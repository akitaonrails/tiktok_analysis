package com.ss.android.ugc.aweme.utils;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C2343109Gb;
import X.C2343409Ge;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.v;

/* JADX INFO: loaded from: classes4.dex */
public final class StringJsonWithOriginAdapterFactory implements v {

    public static final class Adapter<T> extends TypeAdapter<T> {
        public final Gson LIZ;
        public final TypeToken<T> LIZIZ;

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.gson.TypeAdapter
        public final T read(C09CU c09cu) {
            int i;
            C09D6 c09d6LJJLIIIJ = c09cu.LJJLIIIJ();
            if (c09d6LJJLIIIJ == null) {
                i = -1;
            } else {
                i = C2343109Gb.LIZ[c09d6LJJLIIIJ.ordinal()];
            }
            if (i != 1) {
                if (i == 2) {
                    try {
                        String strLJJJZ = c09cu.LJJJZ();
                        try {
                            try {
                                try {
                                    try {
                                        T t = (T) this.LIZ.LJIIIIZZ(strLJJJZ, this.LIZIZ.getType());
                                        try {
                                            if (t instanceof C2343409Ge) {
                                                try {
                                                } catch (Exception e) {
                                                    e = e;
                                                }
                                                try {
                                                    ((C2343409Ge) t).origin = strLJJJZ;
                                                    return t;
                                                } catch (Exception e2) {
                                                    e = e2;
                                                    TryCatchGuardChecker.doCheck(e);
                                                    return null;
                                                }
                                            }
                                            return t;
                                        } catch (Exception e3) {
                                            e = e3;
                                        }
                                    } catch (Exception e4) {
                                        e = e4;
                                    }
                                } catch (Exception e5) {
                                    e = e5;
                                }
                            } catch (Exception e6) {
                                e = e6;
                            }
                        } catch (Exception e7) {
                            e = e7;
                        }
                    } catch (Exception e8) {
                        e = e8;
                    }
                }
                return null;
            }
            c09cu.LJJJJJL();
            return null;
        }

        public Adapter(Gson gson, TypeToken<T> typeToken) {
            this.LIZ = gson;
            this.LIZIZ = typeToken;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.gson.TypeAdapter
        public final void write(C09DL c09dl, T t) {
            try {
                if (t instanceof C2343409Ge) {
                    c09dl.LJJJJJ(((C2343409Ge) t).origin);
                } else {
                    c09dl.LJJJJJ(this.LIZ.LJIILL(t));
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    @Override // com.google.gson.v
    public final <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
        return new Adapter(gson, typeToken);
    }
}
