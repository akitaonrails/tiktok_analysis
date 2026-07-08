package com.ss.android.ugc.aweme.reddot;

import X.AbstractC2248601Czi;
import X.C0CP9;
import X.C11JF;
import X.C1255560imI;
import X.C1255570imJ;
import X.C13LP;
import X.C15438062q;
import X.C1585070rLl;
import X.C1906580ziK;
import X.C1954807lC;
import X.C19EG;
import X.C2188811AlT;
import X.C2248531Czb;
import X.C2248541Czc;
import X.C2248571Czf;
import X.C2248581Czg;
import X.C2248611Czj;
import X.C799900VZk;
import X.EnumC1250000idK;
import X.EnumC1584360rKc;
import X.EnumC592410NLj;
import Y.AfS181S0100000_12;
import android.os.Bundle;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.performanceopt.api.IDowngradeApi;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AwS425S0200000_24;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes35.dex */
public final class RedDotServiceImpl implements RedDotService {
    @Override // com.ss.android.ugc.aweme.reddot.RedDotService
    public final void LIZ() {
        C2248541Czc.LIZ.getClass();
        C2248531Czb c2248531CzbLIZ = C2248541Czc.LIZ();
        c2248531CzbLIZ.LIZJ = null;
        C11JF c11jf = c2248531CzbLIZ.LJI;
        if (c11jf != null) {
            c11jf.dispose();
        }
        ((ArrayList) c2248531CzbLIZ.LIZLLL).clear();
        C2248571Czf c2248571CzfLIZIZ = C2248541Czc.LIZIZ();
        c2248571CzfLIZIZ.LIZ.clear();
        c2248571CzfLIZIZ.LIZIZ.clear();
        c2248571CzfLIZIZ.LIZJ.clear();
    }

    @Override // com.ss.android.ugc.aweme.reddot.RedDotService
    public final void LIZJ(AbstractC2248601Czi abstractC2248601Czi) {
        EnumC592410NLj enumC592410NLj;
        C2248541Czc.LIZ.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("notifyRedDotShow: ");
        C799900VZk.LIZ.getClass();
        sbLIZ.append(C0CP9.LIZ());
        sbLIZ.append(", ");
        sbLIZ.append(abstractC2248601Czi.LIZ());
        C2188811AlT.LIZIZ(sbLIZ);
        C1585070rLl c1585070rLl = C1585070rLl.LIZ;
        EnumC1584360rKc enumC1584360rKc = abstractC2248601Czi.LIZ;
        c1585070rLl.getClass();
        boolean zLJIIIIZZ = C1585070rLl.LJIIIIZZ(enumC1584360rKc, null);
        String strLIZ = abstractC2248601Czi.LIZ();
        if (zLJIIIIZZ) {
            enumC592410NLj = EnumC592410NLj.BOTTOM;
        } else {
            enumC592410NLj = EnumC592410NLj.TOP;
        }
        C2248581Czg c2248581Czg = new C2248581Czg(strLIZ, enumC592410NLj, abstractC2248601Czi);
        C2248571Czf c2248571CzfLIZIZ = C2248541Czc.LIZIZ();
        c2248571CzfLIZIZ.getClass();
        EnumC1584360rKc enumC1584360rKc2 = c2248581Czg.LIZLLL;
        ArrayList arrayList = new ArrayList();
        boolean zLIZ = true;
        if (abstractC2248601Czi instanceof C1255560imI) {
            CopyOnWriteArrayList<C2248581Czg> copyOnWriteArrayList = c2248571CzfLIZIZ.LIZIZ.get(enumC1584360rKc2);
            if (copyOnWriteArrayList == null) {
                copyOnWriteArrayList = new CopyOnWriteArrayList<>();
            }
            boolean z = false;
            boolean zLIZ2 = false;
            for (C2248581Czg c2248581Czg2 : C13LP.LLIIII(copyOnWriteArrayList)) {
                if (Intrinsics.LJFF(c2248581Czg2.LIZJ.LIZ(), ((C1255560imI) c2248581Czg.LIZJ).LJIIIIZZ)) {
                    zLIZ2 = C2248571Czf.LIZ(c2248581Czg2, c2248581Czg);
                    if (!zLIZ2) {
                        c2248581Czg.LJII = c2248581Czg2.LJII;
                    } else {
                        arrayList.add(c2248581Czg2);
                    }
                    copyOnWriteArrayList.remove(c2248581Czg2);
                    z = true;
                }
            }
            if (z) {
                zLIZ = zLIZ2;
            }
            copyOnWriteArrayList.add(c2248581Czg);
            c2248571CzfLIZIZ.LIZIZ.put(enumC1584360rKc2, copyOnWriteArrayList);
        } else if (abstractC2248601Czi instanceof C1255570imJ) {
            C2248581Czg c2248581Czg3 = c2248571CzfLIZIZ.LIZ.get(enumC1584360rKc2);
            if (c2248581Czg3 != null) {
                zLIZ = C2248571Czf.LIZ(c2248581Czg3, c2248581Czg);
                if (!zLIZ) {
                    c2248581Czg.LJII = c2248581Czg3.LJII;
                } else {
                    arrayList.add(c2248581Czg3);
                }
            }
            c2248571CzfLIZIZ.LIZ.put(enumC1584360rKc2, c2248581Czg);
        } else {
            throw new C1954807lC();
        }
        c2248571CzfLIZIZ.LIZJ.put(c2248581Czg.LIZJ.LIZ(), c2248581Czg);
        C2248611Czj c2248611Czj = new C2248611Czj(arrayList, zLIZ);
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((C2248581Czg) it2.next()).LIZ);
        }
        arrayList2.toString();
        for (C2248581Czg c2248581Czg4 : c2248611Czj.LIZ) {
            C2248541Czc.LIZ.getClass();
            C2248541Czc.LIZ().LJ(c2248581Czg4);
        }
        if (c2248611Czj.LIZIZ) {
            C2248531Czb c2248531CzbLIZ = C2248541Czc.LIZ();
            boolean zLIZLLL = c2248531CzbLIZ.LIZLLL(c2248531CzbLIZ.LIZJ(), c2248581Czg);
            if (zLIZLLL) {
                c2248531CzbLIZ.LJII(c2248531CzbLIZ.LIZJ(), c2248581Czg);
                return;
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append('[');
            sbLIZ2.append(c2248581Czg.LIZJ.LIZ());
            sbLIZ2.append("] onRedDotShow ");
            sbLIZ2.append(zLIZLLL);
            sbLIZ2.append(", pending");
            C2188811AlT.LIZIZ(sbLIZ2);
            ((ArrayList) c2248531CzbLIZ.LIZLLL).add(c2248581Czg);
        }
    }

    @Override // com.ss.android.ugc.aweme.reddot.RedDotService
    public final void LIZLLL(String str) {
        C2248541Czc.LIZ.getClass();
        C2248541Czc.LIZJ(str);
    }

    @Override // com.ss.android.ugc.aweme.reddot.RedDotService
    public final void LIZIZ(String str, EnumC1250000idK enumC1250000idK) {
        C2248541Czc.LIZ.getClass();
        C2248581Czg c2248581Czg = C2248541Czc.LIZIZ().LIZJ.get(str);
        if (c2248581Czg != null) {
            C2248541Czc.LIZLLL(c2248581Czg, enumC1250000idK);
        }
    }

    @Override // com.ss.android.ugc.aweme.reddot.RedDotService
    public final void LJ(C19EG c19eg, Bundle bundle) {
        boolean z;
        C2248541Czc.LIZ.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        C2248531Czb c2248531CzbLIZ = C2248541Czc.LIZ();
        c2248531CzbLIZ.getClass();
        c2248531CzbLIZ.LIZJ = new WeakReference<>(c19eg);
        c2248531CzbLIZ.LJI = C1906580ziK.LIZJ().LIZLLL().LJLLLLLL(new AfS181S0100000_12(c2248531CzbLIZ, 290));
        IDowngradeApi iDowngradeApi = (IDowngradeApi) PluggableExtentionKt.pluggableSpi$default(IDowngradeApi.class, false, false, false, 14, null);
        if (iDowngradeApi != null) {
            iDowngradeApi.LJI(new AwS425S0200000_24(c2248531CzbLIZ, c19eg, 96));
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onHomePageCreated: ");
        C799900VZk.LIZ.getClass();
        sbLIZ.append(C0CP9.LIZ());
        sbLIZ.append(", ");
        if (bundle == null) {
            z = true;
        } else {
            z = false;
        }
        sbLIZ.append(z);
        sbLIZ.append(", cost: ");
        sbLIZ.append(System.currentTimeMillis() - jCurrentTimeMillis);
        C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // com.ss.android.ugc.aweme.reddot.RedDotService
    public final void LJFF(String str, String str2) {
        C2248541Czc.LIZ.getClass();
        C2248581Czg c2248581Czg = C2248541Czc.LIZIZ().LIZJ.get(str);
        if (c2248581Czg != null) {
            AbstractC2248601Czi abstractC2248601Czi = c2248581Czg.LIZJ;
            if (abstractC2248601Czi instanceof C1255560imI) {
                ((C1255560imI) abstractC2248601Czi).LJI = str2;
            } else if (abstractC2248601Czi instanceof C1255570imJ) {
            } else {
                throw new C1954807lC();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.reddot.RedDotService
    public final void LJI(EnumC1584360rKc enumC1584360rKc, EnumC1250000idK enumC1250000idK) {
        C2248541Czc.LIZ.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("notifyRedDotDisappear ");
        sbLIZ.append(enumC1584360rKc);
        C2188811AlT.LIZIZ(sbLIZ);
        C2248581Czg c2248581Czg = C2248541Czc.LIZIZ().LIZ.get(enumC1584360rKc);
        if (c2248581Czg != null) {
            C2248541Czc.LIZLLL(c2248581Czg, enumC1250000idK);
        }
    }
}
