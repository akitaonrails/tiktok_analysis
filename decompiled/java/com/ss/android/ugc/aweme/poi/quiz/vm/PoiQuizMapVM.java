package com.ss.android.ugc.aweme.poi.quiz.vm;

import X.C1177080gji;
import X.C1177960gl8;
import X.C1178130glP;
import X.C1178200glW;
import X.C1178490glz;
import X.C1182890gt5;
import X.C1205490hTX;
import X.C123100dR;
import X.C13LP;
import X.C2002107sp;
import X.EnumC1182880gt4;
import X.EnumC1205570hTf;
import X.InterfaceC0148002o;
import X.InterfaceC1177110gjl;
import X.InterfaceC1177120gjm;
import X.InterfaceC1177250gjz;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Pair;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiQuizMapVM extends AssemViewModel<C2002107sp> {
    public InterfaceC1177250gjz LL;
    public InterfaceC1177110gjl<C1178200glW> LLILLJJLI;
    public PoiQuizPageVM LLILLL;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C2002107sp(0);
    }

    public static void vQ2(PoiQuizMapVM poiQuizMapVM, float f, float f2) {
        Collection<InterfaceC1177120gjm> collectionLIZLLL;
        Collection items;
        C1178200glW c1178200glW;
        int i;
        C1178200glW c1178200glW2;
        C1177080gji c1177080gjiLJIIJ;
        int i2;
        Float fValueOf;
        try {
            InterfaceC1177110gjl<C1178200glW> interfaceC1177110gjl = poiQuizMapVM.LLILLJJLI;
            if (interfaceC1177110gjl != null && (collectionLIZLLL = interfaceC1177110gjl.LIZLLL()) != null) {
                ArrayList arrayList = new ArrayList();
                for (InterfaceC1177120gjm interfaceC1177120gjm : collectionLIZLLL) {
                    if (!interfaceC1177120gjm.getItems().isEmpty()) {
                        if (interfaceC1177120gjm.getItems().size() == 1) {
                            C1178200glW c1178200glW3 = (C1178200glW) interfaceC1177120gjm.getItems().iterator().next();
                            if (c1178200glW3.LJFF) {
                                i = C1178130glP.LIZ / 2;
                            } else {
                                i = C1178130glP.LIZIZ / 2;
                            }
                            InterfaceC1177250gjz interfaceC1177250gjz = poiQuizMapVM.LL;
                            if (interfaceC1177250gjz != null) {
                                C1178490glz c1178490glz = c1178200glW3.LJIIIIZZ;
                                C1177080gji c1177080gjiLJIIJ2 = interfaceC1177250gjz.LJIIJ(new C1177960gl8(c1178490glz.latitude, c1178490glz.longitude));
                                if (c1177080gjiLJIIJ2 != null) {
                                    double d = c1177080gjiLJIIJ2.LIZ;
                                    double d2 = i;
                                    double d3 = c1177080gjiLJIIJ2.LIZIZ - d2;
                                    double d4 = ((double) f) - d;
                                    double d5 = 2;
                                    if (Math.pow(d4, d5) + Math.pow(((double) f2) - d3, d5) < Math.pow(d2, d5)) {
                                        arrayList.add(new Pair(c1178200glW3.LIZ(), interfaceC1177120gjm));
                                    }
                                }
                            }
                        } else if (interfaceC1177120gjm.getItems().size() > 1) {
                            Iterator it2 = interfaceC1177120gjm.getItems().iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    c1178200glW2 = (C1178200glW) it2.next();
                                    if (c1178200glW2.LJFF) {
                                        break;
                                    }
                                } else {
                                    c1178200glW2 = null;
                                    break;
                                }
                            }
                            InterfaceC1177250gjz interfaceC1177250gjz2 = poiQuizMapVM.LL;
                            if (interfaceC1177250gjz2 != null && (c1177080gjiLJIIJ = interfaceC1177250gjz2.LJIIJ(new C1177960gl8(interfaceC1177120gjm.getPosition().latitude, interfaceC1177120gjm.getPosition().longitude))) != null) {
                                if (c1178200glW2 != null) {
                                    i2 = C1178130glP.LIZ / 2;
                                } else {
                                    i2 = C1178130glP.LIZIZ / 2;
                                }
                                double d6 = i2;
                                double d7 = 2;
                                if (Math.pow(((double) f) - c1177080gjiLJIIJ.LIZ, d7) + Math.pow(((double) f2) - (c1177080gjiLJIIJ.LIZIZ - d6), d7) < Math.pow(d6, d7)) {
                                    if (c1178200glW2 != null) {
                                        fValueOf = Float.valueOf(c1178200glW2.LIZ().floatValue());
                                    } else {
                                        C1178200glW c1178200glW4 = (C1178200glW) C13LP.LJJJLIIL(interfaceC1177120gjm.getItems());
                                        if (c1178200glW4 != null) {
                                            fValueOf = c1178200glW4.LIZ();
                                        }
                                    }
                                    if (fValueOf != null) {
                                        fValueOf.floatValue();
                                        arrayList.add(new Pair(fValueOf, interfaceC1177120gjm));
                                    }
                                }
                            }
                        }
                    }
                }
                if (!arrayList.isEmpty()) {
                    Iterator it3 = arrayList.iterator();
                    if (it3.hasNext()) {
                        Object next = it3.next();
                        if (it3.hasNext()) {
                            float fFloatValue = ((Number) ((Pair) next).getFirst()).floatValue();
                            do {
                                Object next2 = it3.next();
                                float fFloatValue2 = ((Number) ((Pair) next2).getFirst()).floatValue();
                                if (Float.compare(fFloatValue, fFloatValue2) < 0) {
                                    next = next2;
                                    fFloatValue = fFloatValue2;
                                }
                            } while (it3.hasNext());
                        }
                        Pair pair = (Pair) next;
                        if (pair != null) {
                            if (((InterfaceC1177120gjm) pair.getSecond()).getSize() > 1) {
                                InterfaceC1177120gjm interfaceC1177120gjm2 = (InterfaceC1177120gjm) pair.getSecond();
                                if (interfaceC1177120gjm2 != null && (items = interfaceC1177120gjm2.getItems()) != null && (c1178200glW = (C1178200glW) C13LP.LJJJLIIL(items)) != null) {
                                    String str = c1178200glW.LIZ;
                                    if (C123100dR.LIZ(str) && str != null && !c1178200glW.LJFF) {
                                        C1182890gt5 c1182890gt5 = C1182890gt5.LIZ;
                                        EnumC1182880gt4 enumC1182880gt4 = EnumC1182880gt4.MAP;
                                        c1182890gt5.getClass();
                                        C1182890gt5.LIZIZ(enumC1182880gt4, true);
                                        PoiQuizPageVM poiQuizPageVM = poiQuizMapVM.LLILLL;
                                        if (poiQuizPageVM != null) {
                                            poiQuizPageVM.wQ2(str, true);
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            C1178200glW c1178200glW5 = (C1178200glW) C13LP.LJJJLIIL(((InterfaceC1177120gjm) pair.getSecond()).getItems());
                            if (c1178200glW5 != null && !c1178200glW5.LJFF) {
                                C1182890gt5 c1182890gt52 = C1182890gt5.LIZ;
                                EnumC1182880gt4 enumC1182880gt42 = EnumC1182880gt4.MAP;
                                c1182890gt52.getClass();
                                C1182890gt5.LIZIZ(enumC1182880gt42, true);
                                PoiQuizPageVM poiQuizPageVM2 = poiQuizMapVM.LLILLL;
                                if (poiQuizPageVM2 != null) {
                                    poiQuizPageVM2.wQ2(c1178200glW5.LIZ, true);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    throw new NoSuchElementException();
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1205490hTX c1205490hTX = C1205490hTX.LIZ;
            EnumC1205570hTf enumC1205570hTf = EnumC1205570hTf.POI_QUIZ_MAP_ERROR;
            c1205490hTX.getClass();
            C1205490hTX.LIZLLL(enumC1205570hTf, "click", null, e);
        }
    }
}
