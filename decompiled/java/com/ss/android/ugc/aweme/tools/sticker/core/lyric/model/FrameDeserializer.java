package com.ss.android.ugc.aweme.tools.sticker.core.lyric.model;

import X.AbstractC1174304ib;
import X.C1174104iZ;
import X.C1174404ic;
import X.C13BV;
import X.C15438062q;
import com.google.gson.h;
import com.google.gson.i;
import com.google.gson.j;
import com.google.gson.k;
import com.google.gson.m;
import com.google.gson.n;
import com.google.gson.q;
import com.ss.android.ugc.aweme.tools.sticker.core.BezierControlPoint;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class FrameDeserializer implements j<Frame> {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.ArrayList] */
    public static AbstractC1174304ib LIZ(int i, k kVar) {
        h<Object> hVar;
        long jLJIIZILJ;
        ?? arrayList;
        Double dValueOf;
        if (kVar != null && !(kVar instanceof m)) {
            if (i == 1) {
                if ((kVar instanceof h) && kVar.LJIIL().size() == 2) {
                    h hVarLJIIL = kVar.LJIIL();
                    k kVarLJJIIJZLJL = hVarLJIIL.LJJIIJZLJL(0);
                    if ((kVarLJJIIJZLJL instanceof q) && kVarLJJIIJZLJL != null) {
                        jLJIIZILJ = kVarLJJIIJZLJL.LJIIZILJ();
                    } else {
                        jLJIIZILJ = 0;
                    }
                    k kVarLJJIIJZLJL2 = hVarLJIIL.LJJIIJZLJL(1);
                    kVarLJJIIJZLJL2.getClass();
                    if (kVarLJJIIJZLJL2 instanceof h) {
                        h hVarLJIIL2 = kVarLJJIIJZLJL2.LJIIL();
                        arrayList = new ArrayList();
                        for (k kVar2 : hVarLJIIL2) {
                            if ((kVar2 instanceof q) && kVar2 != null && (dValueOf = Double.valueOf(kVar2.LJIIIZ())) != null) {
                                arrayList.add(dValueOf);
                            }
                        }
                    } else {
                        arrayList = C13BV.INSTANCE;
                    }
                    return new C1174404ic(new BezierControlPoint(Long.valueOf(jLJIIZILJ), arrayList));
                }
                return new C1174104iZ(null);
            }
            if (kVar instanceof h) {
                hVar = (h) kVar;
            } else {
                h hVar2 = new h();
                hVar2.LJJIFFI(kVar);
                hVar = hVar2;
            }
            final ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(hVar, 10));
            for (Object objLJIL : hVar) {
                if (objLJIL instanceof q) {
                    q qVar = (q) objLJIL;
                    Object obj = qVar.LL;
                    if (obj instanceof Boolean) {
                        objLJIL = Boolean.valueOf(qVar.LJ());
                    } else if (obj instanceof Number) {
                        objLJIL = qVar.LJIJ();
                    } else if (obj instanceof String) {
                        objLJIL = qVar.LJIL();
                    }
                } else if (!(objLJIL instanceof n) && (objLJIL instanceof h)) {
                    h<Object> hVar3 = (h) objLJIL;
                    ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(hVar3, 10));
                    for (Object objLJIL2 : hVar3) {
                        if (objLJIL2 instanceof q) {
                            q qVar2 = (q) objLJIL2;
                            Object obj2 = qVar2.LL;
                            if (obj2 instanceof Boolean) {
                                objLJIL2 = Boolean.valueOf(qVar2.LJ());
                            } else if (obj2 instanceof Number) {
                                objLJIL2 = Double.valueOf(qVar2.LJIIIZ());
                            } else if (obj2 instanceof String) {
                                objLJIL2 = qVar2.LJIL();
                            }
                        }
                        arrayList3.add(objLJIL2);
                    }
                    objLJIL = arrayList3;
                }
                arrayList2.add(objLJIL);
            }
            if (!arrayList2.isEmpty()) {
                return new AbstractC1174304ib(arrayList2) { // from class: X.04ia
                    public final List<Object> LIZ;

                    public final boolean equals(Object obj3) {
                        if (this == obj3) {
                            return true;
                        }
                        return (obj3 instanceof C1174204ia) && Intrinsics.LJFF(this.LIZ, ((C1174204ia) obj3).LIZ);
                    }

                    public final int hashCode() {
                        return this.LIZ.hashCode();
                    }

                    public final String toString() {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("Other(rawValues=");
                        sbLIZ.append(this.LIZ);
                        sbLIZ.append(')');
                        return C2188811AlT.LIZIZ(sbLIZ);
                    }

                    {
                        this.LIZ = arrayList2;
                    }
                };
            }
            return new C1174104iZ(null);
        }
        return new C1174104iZ(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.util.ArrayList] */
    @Override // com.google.gson.j
    public final Frame deserialize(k kVar, Type type, i iVar) {
        long jLJIIZILJ;
        ?? arrayList;
        int iLJIIJJI;
        n nVarLJIILIIL = kVar.LJIILIIL();
        k kVarLJJIIZ = nVarLJIILIIL.LJJIIZ("time");
        if (kVarLJJIIZ != null) {
            jLJIIZILJ = kVarLJJIIZ.LJIIZILJ();
        } else {
            jLJIIZILJ = 0;
        }
        k kVarLJJIIZ2 = nVarLJIILIIL.LJJIIZ("value");
        if (kVarLJJIIZ2 != null && !(kVarLJJIIZ2 instanceof m) && (kVarLJJIIZ2 instanceof h)) {
            h hVarLJIIL = kVarLJJIIZ2.LJIIL();
            arrayList = new ArrayList();
            Iterator<k> it2 = hVarLJIIL.iterator();
            while (it2.hasNext()) {
                Double dValueOf = Double.valueOf(it2.next().LJIILJJIL().LJIIIZ());
                if (dValueOf != null) {
                    arrayList.add(dValueOf);
                }
            }
        } else {
            arrayList = C13BV.INSTANCE;
        }
        k kVarLJJIIZ3 = nVarLJIILIIL.LJJIIZ("graphType");
        if (kVarLJJIIZ3 != null) {
            iLJIIJJI = kVarLJJIIZ3.LJIIJJI();
        } else {
            iLJIIJJI = 0;
        }
        return new Frame(Long.valueOf(jLJIIZILJ), arrayList, Integer.valueOf(iLJIIJJI), LIZ(iLJIIJJI, nVarLJIILIIL.LJJIIZ("left")), LIZ(iLJIIJJI, nVarLJIILIIL.LJJIIZ("right")));
    }
}
