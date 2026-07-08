package com.ss.android.ugc.aweme.search.pages.result.topsearch.core.repo;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C09F0;
import X.C2188811AlT;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.n;
import com.google.gson.reflect.TypeToken;
import com.google.gson.v;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import com.ss.android.ugc.aweme.search.performance.chunk.core.model.ChunkPatch;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class ChunkPatchTypeAdapterFactory implements v {
    @Override // com.google.gson.v
    public final <T> TypeAdapter<T> create(final Gson gson, TypeToken<T> typeToken) {
        if (gson == null || typeToken == null || !ChunkPatch.class.isAssignableFrom(typeToken.getRawType())) {
            return null;
        }
        final TypeAdapter<T> typeAdapterLJIIJJI = gson.LJIIJJI(this, typeToken);
        final TypeAdapter<T> typeAdapterLJIIJ = gson.LJIIJ(n.class);
        return new TypeAdapter<T>() { // from class: com.ss.android.ugc.aweme.search.pages.result.topsearch.core.repo.ChunkPatchTypeAdapterFactory.1
            public static boolean LIZ(ChunkPatch chunkPatch) {
                String str;
                if (((Number) C09F0.LIZ.getValue()).intValue() == 2 && "add".equals(chunkPatch.op) && (str = chunkPatch.path) != null) {
                    String[] strArrSplit = str.trim().split("/");
                    if (strArrSplit.length == 3 && "data".equals(strArrSplit[1]) && TextUtils.isDigitsOnly(strArrSplit[2])) {
                        return true;
                    }
                    return false;
                }
                return false;
            }

            /* JADX WARN: Type inference failed for: r3v0, types: [T, com.ss.android.ugc.aweme.search.performance.chunk.core.model.ChunkPatch] */
            @Override // com.google.gson.TypeAdapter
            public final T read(C09CU c09cu) {
                if (c09cu.LJJLIIIJ() == C09D6.NULL) {
                    c09cu.LJJJJJL();
                    return null;
                }
                ?? r3 = (T) new ChunkPatch();
                try {
                    c09cu.LIZIZ();
                    while (c09cu.LJIIZILJ()) {
                        String strLJJJJ = c09cu.LJJJJ();
                        int iHashCode = strLJJJJ.hashCode();
                        if (iHashCode != 3553) {
                            if (iHashCode != 3433509) {
                                if (iHashCode == 111972721 && strLJJJJ.equals("value")) {
                                    C09D6 c09d6LJJLIIIJ = c09cu.LJJLIIIJ();
                                    if (c09d6LJJLIIIJ == C09D6.BEGIN_OBJECT) {
                                        n nVar = (n) typeAdapterLJIIJ.read(c09cu);
                                        try {
                                        } catch (Exception e) {
                                            TryCatchGuardChecker.doCheck(e);
                                        }
                                        if (LIZ(r3)) {
                                            r3.value = (SearchMixFeed) gson.LIZJ(nVar, SearchMixFeed.class);
                                        } else {
                                            r3.value = nVar;
                                        }
                                    } else if (c09d6LJJLIIIJ == C09D6.BEGIN_ARRAY) {
                                        r3.value = gson.LJIIJ(ArrayList.class).read(c09cu);
                                    } else if (c09d6LJJLIIIJ == C09D6.STRING) {
                                        r3.value = c09cu.LJJJZ();
                                    } else if (c09d6LJJLIIIJ == C09D6.NUMBER) {
                                        r3.value = Double.valueOf(c09cu.LJJIL());
                                    } else if (c09d6LJJLIIIJ == C09D6.BOOLEAN) {
                                        r3.value = Boolean.valueOf(c09cu.LJJ());
                                    } else if (c09d6LJJLIIIJ == C09D6.NULL) {
                                        c09cu.LJJJJJL();
                                    } else {
                                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                                        sbLIZ.append("unknown jsonToken=");
                                        sbLIZ.append(c09d6LJJLIIIJ);
                                        r3.LJ = C2188811AlT.LIZIZ(sbLIZ);
                                    }
                                }
                            } else if (strLJJJJ.equals("path")) {
                                r3.path = c09cu.LJJJZ();
                            }
                        } else if (strLJJJJ.equals("op")) {
                            r3.op = c09cu.LJJJZ();
                        }
                    }
                    c09cu.LJII();
                    return r3;
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("parse error. ");
                    sbLIZ2.append(e2.getMessage());
                    r3.LJ = C2188811AlT.LIZIZ(sbLIZ2);
                    return r3;
                }
            }

            @Override // com.google.gson.TypeAdapter
            public final void write(C09DL c09dl, T t) {
                if (t == null) {
                    c09dl.LJIJJ();
                } else {
                    typeAdapterLJIIJJI.write(c09dl, t);
                }
            }
        };
    }
}
