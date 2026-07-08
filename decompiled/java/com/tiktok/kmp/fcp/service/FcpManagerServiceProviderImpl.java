package com.tiktok.kmp.fcp.service;

import X.C1446705lR;
import X.InterfaceC1448705ll;
import Y.AObjectS378S0100000_2;
import Y.AObjectS55S0000000_2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class FcpManagerServiceProviderImpl implements IFcpManagerServiceProvider {
    public final C1446705lR LIZ = new InterfaceC1448705ll() { // from class: X.05lR
        public final C01GW LIZ = C452501pT.LIZIZ(new AObjectS55S0000000_2(26));
        public final C01GW LIZIZ = C452501pT.LIZIZ(new AObjectS55S0000000_2(27));

        @Override // X.InterfaceC1448705ll
        public final InterfaceC700270RdR LIZ() {
            return (InterfaceC700270RdR) this.LIZ.getValue();
        }

        @Override // X.InterfaceC1448705ll
        public final InterfaceC700280RdS LIZIZ() {
            return (InterfaceC700280RdS) this.LIZIZ.getValue();
        }

        /* JADX WARN: Type inference failed for: r3v0, types: [X.05ku] */
        /* JADX WARN: Type inference failed for: r4v0, types: [X.05lC] */
        @Override // X.InterfaceC1448705ll
        public final C1446505lP LIZJ(C1447305lX c1447305lX, InterfaceC699620RcO interfaceC699620RcO, InterfaceC1448505lj interfaceC1448505lj, boolean z) {
            C054G c054gLIZ = C2296808zG.LIZ(C0PEM.LIZ);
            ?? r4 = new InterfaceC1445605lG() { // from class: X.05lC
                /* JADX WARN: Type inference failed for: r0v0, types: [X.05l0] */
                @Override // X.InterfaceC1445605lG
                public final C1444005l0 LIZ(C1445305lD c1445305lD) {
                    return new InterfaceC1444205l2(c1445305lD.LIZ, c1445305lD.LJIIJ, c1445305lD.LIZJ, c1445305lD.LIZLLL, c1445305lD.LJ, c1445305lD.LJFF, c1445305lD.LIZIZ, c1445305lD.LJIIIIZZ, c1445305lD.LJI, c1445305lD.LJII, c1445305lD.LJIIIZ, c1445305lD.LJIIJJI, c1445305lD.LJIIL) { // from class: X.05l0
                        public final String LIZ;
                        public final Map<String, ? extends Object> LIZIZ;
                        public EnumC1450305m1 LIZJ;
                        public Integer LIZLLL;
                        public List<String> LJ;
                        public boolean LJFF;
                        public String LJI;
                        public final List<InterfaceC1444205l2> LJII;
                        public InterfaceC12836050o LJIIIIZZ;
                        public InterfaceC1443505kv LJIIIZ;
                        public final boolean LJIIJ;
                        public Function1<? super InterfaceC1444205l2, ? extends Map<String, ? extends Object>> LJIIJJI;
                        public InterfaceC1443605kw LJIIL;
                        public Function1<? super Boolean, Unit> LJIILIIL;
                        public Function0<Unit> LJIILJJIL;

                        @Override // X.InterfaceC1445405lE
                        public final List<InterfaceC1444205l2> LIZ() {
                            return C13LP.LLIIII(this.LJII);
                        }

                        @Override // X.InterfaceC1444605l6
                        public final void LJIIJJI() {
                            Function0<Unit> function0 = this.LJIILJJIL;
                            if (function0 != null) {
                                function0.invoke();
                            }
                        }

                        public final String toString() {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("FcpDecisionNodeImpl(id=");
                            sbLIZ.append(this.LIZ);
                            sbLIZ.append(", type=");
                            sbLIZ.append(this.LIZJ);
                            sbLIZ.append(", priority=");
                            sbLIZ.append(this.LIZLLL);
                            sbLIZ.append(", children=");
                            sbLIZ.append(LIZ().size());
                            sbLIZ.append(", hasResult=");
                            sbLIZ.append(this.LJIIL != null);
                            sbLIZ.append(')');
                            return C2188811AlT.LIZIZ(sbLIZ);
                        }

                        @Override // X.InterfaceC1443105kr
                        public final InterfaceC1443505kv LIZIZ() {
                            return this.LJIIIZ;
                        }

                        @Override // X.InterfaceC1444305l3
                        public final InterfaceC12836050o LJ() {
                            return this.LJIIIIZZ;
                        }

                        @Override // X.InterfaceC1443105kr
                        public final boolean LJFF() {
                            return this.LJFF;
                        }

                        @Override // X.InterfaceC1443105kr
                        public final Function1<InterfaceC1444205l2, Map<String, Object>> LJIILIIL() {
                            return this.LJIIJJI;
                        }

                        @Override // X.InterfaceC1443105kr
                        public final Integer LJIILJJIL() {
                            return this.LIZLLL;
                        }

                        @Override // X.InterfaceC1443105kr
                        public final boolean LJIILL() {
                            return this.LJIIJ;
                        }

                        @Override // X.InterfaceC1444105l1
                        public final Map<String, Object> getExtraInfo() {
                            return this.LIZIZ;
                        }

                        @Override // X.InterfaceC1444105l1
                        public final String getIdentifier() {
                            return this.LIZ;
                        }

                        @Override // X.InterfaceC1443105kr
                        public final EnumC1450305m1 getNodeType() {
                            return this.LIZJ;
                        }

                        @Override // X.InterfaceC1445405lE
                        public final String getParentKey() {
                            return this.LJI;
                        }

                        @Override // X.InterfaceC1443105kr
                        public final InterfaceC1443605kw getResult() {
                            return this.LJIIL;
                        }

                        @Override // X.InterfaceC1443105kr
                        public final void LIZJ(EnumC1450305m1 enumC1450305m1) {
                            this.LIZJ = enumC1450305m1;
                        }

                        @Override // X.InterfaceC1445405lE
                        public final void LIZLLL(InterfaceC1444205l2 interfaceC1444205l2) {
                            this.LJII.remove(interfaceC1444205l2);
                        }

                        @Override // X.InterfaceC1443105kr
                        public final void LJI(Function1<? super InterfaceC1444205l2, ? extends Map<String, ? extends Object>> function1) {
                            this.LJIIJJI = function1;
                        }

                        @Override // X.InterfaceC1444605l6
                        public final void LJII(boolean z2) {
                            Function1<? super Boolean, Unit> function1 = this.LJIILIIL;
                            if (function1 != null) {
                                function1.invoke(Boolean.valueOf(z2));
                            }
                        }

                        @Override // X.InterfaceC1443105kr
                        public final void LJIIIIZZ(List<String> list) {
                            this.LJ = list;
                        }

                        @Override // X.InterfaceC1445405lE
                        public final void LJIIIZ(InterfaceC1444205l2 interfaceC1444205l2) {
                            if (!this.LJII.contains(interfaceC1444205l2)) {
                                this.LJII.add(interfaceC1444205l2);
                            }
                        }

                        @Override // X.InterfaceC1443105kr
                        public final void LJIIJ(InterfaceC1443505kv interfaceC1443505kv) {
                            this.LJIIIZ = interfaceC1443505kv;
                        }

                        @Override // X.InterfaceC1444605l6
                        public final void LJIIL(Function0<Unit> function0) {
                            this.LJIILJJIL = function0;
                        }

                        @Override // X.InterfaceC1443105kr
                        public final void LJIILLIIL(Integer num) {
                            this.LIZLLL = num;
                        }

                        @Override // X.InterfaceC1444605l6
                        public final void LJIIZILJ(Function1<? super Boolean, Unit> function1) {
                            this.LJIILIIL = function1;
                        }

                        @Override // X.InterfaceC1443105kr
                        public final void LJIJ(C1177304j5 c1177304j5) {
                            this.LJIIL = c1177304j5;
                        }

                        @Override // X.InterfaceC1444305l3
                        public final void LJIJI(InterfaceC12836050o interfaceC12836050o) {
                            this.LJIIIIZZ = interfaceC12836050o;
                        }

                        @Override // X.InterfaceC1443105kr
                        public final void LJIJJ(boolean z2) {
                            this.LJFF = z2;
                        }

                        @Override // X.InterfaceC1445405lE
                        public final void setParentKey(String str) {
                            this.LJI = str;
                        }

                        {
                            ArrayList arrayList = new ArrayList();
                            this.LIZ = str;
                            this.LIZIZ = map;
                            this.LIZJ = enumC1450305m1;
                            this.LIZLLL = num;
                            this.LJ = list;
                            this.LJFF = z;
                            this.LJI = str;
                            this.LJII = arrayList;
                            this.LJIIIIZZ = interfaceC12836050o;
                            this.LJIIIZ = interfaceC1443505kv;
                            this.LJIIJ = z;
                            this.LJIIJJI = function1;
                            this.LJIIL = null;
                            this.LJIILIIL = function1;
                            this.LJIILJJIL = function0;
                        }
                    };
                }
            };
            ?? r3 = new InterfaceC1443305kt() { // from class: X.05ku
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r6v0, types: [X.13BV] */
                /* JADX WARN: Type inference failed for: r6v1, types: [java.util.List] */
                /* JADX WARN: Type inference failed for: r6v2 */
                /* JADX WARN: Type inference failed for: r6v3, types: [java.util.ArrayList] */
                @Override // X.InterfaceC1443305kt
                public final C1177404j6 LIZ(InterfaceC1443505kv interfaceC1443505kv, List<? extends InterfaceC1444205l2> list) {
                    ?? arrayList;
                    ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list, 10));
                    Iterator<? extends InterfaceC1444205l2> it2 = list.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(it2.next().getIdentifier());
                    }
                    int iLIZJ = interfaceC1443505kv.LIZJ();
                    if (iLIZJ != -1) {
                        if (iLIZJ != 0) {
                            arrayList = new ArrayList();
                            int iLIZJ2 = interfaceC1443505kv.LIZJ();
                            for (InterfaceC1444205l2 interfaceC1444205l2 : list) {
                                boolean zContains = interfaceC1443505kv.LIZ().contains(interfaceC1444205l2.getNodeType());
                                boolean zContains2 = interfaceC1443505kv.LIZIZ().contains(interfaceC1444205l2.getNodeType());
                                if (!zContains || iLIZJ2 > 0) {
                                    arrayList.add(interfaceC1444205l2.getIdentifier());
                                    if (zContains2) {
                                        iLIZJ2--;
                                    }
                                }
                            }
                        } else {
                            arrayList = arrayList2;
                        }
                    } else {
                        arrayList = C13BV.INSTANCE;
                    }
                    return new C1177404j6(arrayList2, arrayList);
                }
            };
            C1447605la c1447605la = new C1447605la(c1447305lX);
            return new C1446505lP(new C1446305lN(r4, new C1443005kq(r3, new AObjectS378S0100000_2(c1447605la, 11), c054gLIZ), c054gLIZ), c1447605la, c1447305lX, interfaceC699620RcO, interfaceC1448505lj, z);
        }
    };

    @Override // com.tiktok.kmp.fcp.service.IFcpManagerServiceProvider
    public final C1446705lR LIZ() {
        return this.LIZ;
    }
}
