package com.ss.android.ugc.aweme.search.common.plugin;

import X.C01SR;
import X.C0BQ6;
import X.C0PEM;
import X.C0QG8;
import X.C0QG9;
import X.C1248104uV;
import X.C1BLD;
import X.C2296808zG;
import X.C23250099c;
import X.C271160Ajy;
import X.C445301oJ;
import X.C673070Qaf;
import X.C682480Qpq;
import androidx.fragment.app.Fragment;
import com.bytedance.ies.ugc.aweme.plugin.service.IPluginService;
import com.ss.android.ugc.aweme.search.df.api.core.plugin.ISearchPluginService;
import com.ss.android.ugc.aweme.search.df.api.survey.ISearchSurvey;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import jv6.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchPluginServiceImpl implements ISearchPluginService {
    @Override // com.ss.android.ugc.aweme.search.df.api.core.plugin.ISearchPluginService
    public final void LIZ() {
        C673070Qaf.LIZ.getClass();
        if (C1248104uV.LIZ()) {
            if (!C673070Qaf.LIZLLL.compareAndSet(false, true)) {
                return;
            }
        } else if (C673070Qaf.LIZJ) {
            return;
        } else {
            C673070Qaf.LIZJ = true;
        }
        ((IPluginService) C673070Qaf.LJ.getValue()).LJJIJ(new C1BLD() { // from class: X.0QFz
            @Override // X.C1BLD
            public final void LIZ() {
            }

            @Override // X.C1BLD
            public final void LIZIZ(String str, boolean z) {
            }

            @Override // X.C1BLD
            public final void LIZLLL() {
            }

            @Override // X.C1BLD
            public final void LJFF(long j, long j2, String str, boolean z) {
            }

            @Override // X.C1BLD
            public final void LJI(String str, boolean z) {
            }

            @Override // X.C1BLD
            public final void LJ(String str, boolean z) {
                if (!Intrinsics.LJFF(str, "com.ss.android.ugc.aweme.df_search_biz")) {
                    return;
                }
                if (C1248104uV.LIZ()) {
                    C673070Qaf c673070Qaf = C673070Qaf.LIZ;
                    C673070Qaf.LIZIZ = C0QG9.LLILLL;
                }
                C673070Qaf.LIZ.getClass();
                if (((IPluginService) C673070Qaf.LJ.getValue()).LIZLLL() != null) {
                    C844470XAv.LIZ.getClass();
                    a.install(C844470XAv.LIZ());
                }
                C682480Qpq.LIZ().LIZJ();
                C0QG1.LIZ.getClass();
                C0QG1.LIZIZ.LIZIZ();
                C1255704vj.LIZ().LIZIZ();
                C0QF4.LIZ.getClass();
                C0QF4.LIZIZ.LIZIZ();
                if (C1111804Wm.LIZ()) {
                    C0PKD.LIZIZ.getClass();
                    if (!(!C0PKD.LJ.isEmpty())) {
                        List list = (List) C0PKD.LIZLLL.getValue();
                        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
                        Iterator it2 = list.iterator();
                        while (it2.hasNext()) {
                            arrayList.add(C13LE.LIZ(it2.next().getClass()));
                        }
                        HashSet hashSetLLIFFJFJJ = C13LP.LLIFFJFJJ(arrayList);
                        List listLIZIZ = C0PKD.LIZIZ();
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj : (ArrayList) listLIZIZ) {
                            if (!hashSetLLIFFJFJJ.contains(C13LE.LIZ(obj.getClass()))) {
                                arrayList2.add(obj);
                            }
                        }
                        C0PKD.LJ = arrayList2;
                        C0PHG.LIZIZ.getClass();
                        if (!(!C0PHG.LJ.isEmpty())) {
                            List list2 = (List) C0PHG.LIZLLL.getValue();
                            ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(list2, 10));
                            Iterator it3 = list2.iterator();
                            while (it3.hasNext()) {
                                arrayList3.add(C13LE.LIZ(it3.next().getClass()));
                            }
                            HashSet hashSetLLIFFJFJJ2 = C13LP.LLIFFJFJJ(arrayList3);
                            List listLIZIZ2 = C0PHG.LIZIZ();
                            ArrayList arrayList4 = new ArrayList();
                            for (Object obj2 : (ArrayList) listLIZIZ2) {
                                if (!hashSetLLIFFJFJJ2.contains(C13LE.LIZ(obj2.getClass()))) {
                                    arrayList4.add(obj2);
                                }
                            }
                            C0PHG.LJ = arrayList4;
                        }
                    }
                }
            }

            @Override // X.C1BLD
            public final void LIZJ(String str, boolean z, int i, Function0<Unit> function0) {
                if (!Intrinsics.LJFF(str, "com.ss.android.ugc.aweme.df_search_biz")) {
                    return;
                }
                C0QG1.LIZ.getClass();
                C0QG1.LIZIZ.LIZJ();
                C1255704vj.LIZ().LIZJ();
                Class<ISearchSurvey> cls = C0QF5.LIZ;
                C0QF5.LIZIZ = false;
            }
        });
    }

    @Override // com.ss.android.ugc.aweme.search.df.api.core.plugin.ISearchPluginService
    public final boolean LIZIZ() {
        C673070Qaf.LIZ.getClass();
        return C673070Qaf.LIZIZ == C0QG9.LLILLL;
    }

    @Override // com.ss.android.ugc.aweme.search.df.api.core.plugin.ISearchPluginService
    public final void LJ() {
        C673070Qaf.LIZ.getClass();
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C445301oJ("visualsearch", null), 3);
    }

    @Override // com.ss.android.ugc.aweme.search.df.api.core.plugin.ISearchPluginService
    public final void LIZLLL() {
        if (C0BQ6.LIZ() && ((Boolean) C271160Ajy.LIZ.getValue()).booleanValue() && !C0QG8.LIZ) {
            C0QG8.LIZ = true;
            if (C682480Qpq.LIZ().LIZ()) {
                return;
            }
            C673070Qaf.LIZ.getClass();
            C673070Qaf.LIZ(null, false);
        }
    }

    @Override // com.ss.android.ugc.aweme.search.df.api.core.plugin.ISearchPluginService
    public final boolean checkPluginInstalled(String str) {
        C673070Qaf.LIZ.getClass();
        return C673070Qaf.LIZIZ(null, false);
    }

    @Override // com.ss.android.ugc.aweme.search.df.api.core.plugin.ISearchPluginService
    public final void LIZJ(Boolean bool, String str, String str2) {
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C01SR(str, str2, bool, null), 3);
    }

    @Override // com.ss.android.ugc.aweme.search.df.api.core.plugin.ISearchPluginService
    public final boolean LJFF(Fragment fragment, String str, boolean z) {
        C673070Qaf.LIZ.getClass();
        return C673070Qaf.LIZ(fragment, z);
    }
}
