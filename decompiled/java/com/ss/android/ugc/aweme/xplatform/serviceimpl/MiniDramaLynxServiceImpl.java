package com.ss.android.ugc.aweme.xplatform.serviceimpl;

import X.AbstractC1581540rG4;
import X.C0W8I;
import X.C13LP;
import X.C1548440qOg;
import X.C1581010rFD;
import X.C2188811AlT;
import X.C786410Ut5;
import X.C844470XAv;
import X.EnumC1548460qOi;
import X.InterfaceC1059280dfi;
import X.SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
import Y.ARunnableS8S1100000_2;
import android.content.Context;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.hybrid.spark.SparkContext;
import com.ss.android.ugc.aweme.xplatform.service.IMiniDramaLynxService;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes25.dex */
public final class MiniDramaLynxServiceImpl implements IMiniDramaLynxService {
    public final CopyOnWriteArrayList<AbstractC1581540rG4> LIZ = new CopyOnWriteArrayList<>();

    @Override // com.ss.android.ugc.aweme.xplatform.service.IMiniDramaLynxService
    public final void LJ() {
        C1548440qOg c1548440qOgLIZJ;
        if (this.LIZ.isEmpty()) {
            return;
        }
        for (AbstractC1581540rG4 abstractC1581540rG4 : this.LIZ) {
            if (abstractC1581540rG4.LJFF() != EnumC1548460qOi.DEFAULT_DISABLE) {
                abstractC1581540rG4.LIZIZ();
                if (!abstractC1581540rG4.LIZLLL) {
                    SparkContext sparkContextLIZLLL = abstractC1581540rG4.LIZLLL();
                    if (sparkContextLIZLLL != null && (c1548440qOgLIZJ = abstractC1581540rG4.LIZJ()) != null) {
                        C1581010rFD.LIZIZ.LIZLLL(sparkContextLIZLLL, abstractC1581540rG4.LIZ(), c1548440qOgLIZJ);
                    }
                    abstractC1581540rG4.LIZLLL = true;
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.xplatform.service.IMiniDramaLynxService
    public final void clearAll() {
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
        ViewGroup viewGroup;
        for (AbstractC1581540rG4 abstractC1581540rG4 : this.LIZ) {
            abstractC1581540rG4.LIZIZ();
            WeakReference<SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB> weakReference = abstractC1581540rG4.LJ;
            if (weakReference != null && (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = weakReference.get()) != null) {
                ViewParent parent = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getParent();
                if (parent instanceof ViewGroup) {
                    viewGroup = (ViewGroup) parent;
                    if (viewGroup != null) {
                        C786410Ut5.LJJJLZIJ(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB, viewGroup);
                    }
                } else {
                    viewGroup = null;
                }
                boolean z = SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LLLILZJ;
                sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LJJ(true);
                if (viewGroup != null) {
                    C786410Ut5.LJLZ(8, viewGroup);
                }
            }
            C1581010rFD.LIZIZ.N5(abstractC1581540rG4.LIZ());
            abstractC1581540rG4.LJ = null;
            abstractC1581540rG4.LIZLLL = false;
        }
        this.LIZ.clear();
    }

    @Override // com.ss.android.ugc.aweme.xplatform.service.IMiniDramaLynxService
    public final void LIZJ(AbstractC1581540rG4 abstractC1581540rG4) {
        if (LJFF(abstractC1581540rG4.LIZ()) != null) {
            return;
        }
        this.LIZ.add(abstractC1581540rG4);
    }

    @Override // com.ss.android.ugc.aweme.xplatform.service.IMiniDramaLynxService
    public final void LIZLLL(List<? extends AbstractC1581540rG4> list) {
        if (list.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (AbstractC1581540rG4 abstractC1581540rG4 : list) {
            String strLIZ = abstractC1581540rG4.LIZ();
            if (LJFF(strLIZ) != null) {
                if (!arrayList.contains(strLIZ)) {
                    arrayList.add(strLIZ);
                }
            } else {
                this.LIZ.add(abstractC1581540rG4);
            }
        }
        if (!arrayList.isEmpty()) {
            C0W8I.LIZ.getClass();
            if (C0W8I.LIZIZ() || C0W8I.LIZJ()) {
                C844470XAv.LIZ.getClass();
                Context contextLIZ = C844470XAv.LIZ();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Duplicate bizIds found:\n");
                sbLIZ.append(C13LP.LJJLIIIJ(arrayList, "\n", null, null, 0, null, null, 62));
                C786410Ut5.LJJZZIII(new BPEAHandler(Looper.getMainLooper()), new ARunnableS8S1100000_2(contextLIZ, C2188811AlT.LIZIZ(sbLIZ), 4));
            }
        }
    }

    public final AbstractC1581540rG4 LJFF(String str) {
        AbstractC1581540rG4 next;
        Iterator<AbstractC1581540rG4> it2 = this.LIZ.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (Intrinsics.LJFF(next.LIZ(), str)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        return next;
    }

    @Override // com.ss.android.ugc.aweme.xplatform.service.IMiniDramaLynxService
    public final void LIZIZ(JSONObject jSONObject, String str, Map map) {
        AbstractC1581540rG4 abstractC1581540rG4LJFF;
        WeakReference<SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB> weakReference;
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
        AbstractC1581540rG4 abstractC1581540rG4LJFF2;
        if (jSONObject != null && (abstractC1581540rG4LJFF2 = LJFF(str)) != null) {
            abstractC1581540rG4LJFF2.LJII(jSONObject);
        }
        if (map != null && (abstractC1581540rG4LJFF = LJFF(str)) != null && (weakReference = abstractC1581540rG4LJFF.LJ) != null && (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = weakReference.get()) != null) {
            sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.U0(map);
        }
    }

    @Override // com.ss.android.ugc.aweme.xplatform.service.IMiniDramaLynxService
    public final void LIZ(String str, final ViewGroup viewGroup, Map map, Context context, Function0 function0, final Function0 function02) {
        AbstractC1581540rG4 abstractC1581540rG4LJFF;
        View viewLIZ;
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
        SparkContext sparkContextLIZLLL;
        ViewGroup viewGroup2;
        if (viewGroup != null && (abstractC1581540rG4LJFF = LJFF(str)) != null) {
            abstractC1581540rG4LJFF.LIZIZ();
            WeakReference<SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB> weakReference = abstractC1581540rG4LJFF.LJ;
            if (weakReference == null || (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = weakReference.get()) == null) {
                C1548440qOg c1548440qOgLIZJ = abstractC1581540rG4LJFF.LIZJ();
                if (c1548440qOgLIZJ != null && !abstractC1581540rG4LJFF.LIZLLL && (sparkContextLIZLLL = abstractC1581540rG4LJFF.LIZLLL()) != null) {
                    C1581010rFD.LIZIZ.LIZLLL(sparkContextLIZLLL, abstractC1581540rG4LJFF.LIZ(), c1548440qOgLIZJ);
                    abstractC1581540rG4LJFF.LIZLLL = true;
                }
                SparkContext sparkContextLIZLLL2 = abstractC1581540rG4LJFF.LIZLLL();
                if (sparkContextLIZLLL2 != null) {
                    viewLIZ = C1581010rFD.LIZIZ.LIZ(context, sparkContextLIZLLL2, abstractC1581540rG4LJFF.LIZ(), abstractC1581540rG4LJFF.LIZ);
                } else {
                    viewLIZ = null;
                }
                if (!(viewLIZ instanceof SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB) || (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = (SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB) viewLIZ) == null) {
                    return;
                } else {
                    abstractC1581540rG4LJFF.LJ = new WeakReference<>(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB);
                }
            }
            SparkContext sparkContext = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getSparkContext();
            if (sparkContext != null) {
                sparkContext.LJJJJJ(new InterfaceC1059280dfi() { // from class: X.0Ii3
                    @Override // X.InterfaceC1059280dfi
                    public final void m3(boolean z) {
                    }

                    @Override // X.InterfaceC1051240dSk
                    public final void refresh() {
                    }

                    @Override // X.InterfaceC1059280dfi
                    public final void close() {
                        ViewGroup viewGroup3 = viewGroup;
                        if (viewGroup3 != null) {
                            C786410Ut5.LJJJJI(viewGroup3);
                        }
                        ViewGroup viewGroup4 = viewGroup;
                        if (viewGroup4 != null) {
                            C786410Ut5.LJLZ(8, viewGroup4);
                        }
                        function02.invoke();
                    }
                });
            }
            C786410Ut5.LJJJJI(viewGroup);
            ViewParent parent = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getParent();
            if ((parent instanceof ViewGroup) && (viewGroup2 = (ViewGroup) parent) != null) {
                C786410Ut5.LJJJLZIJ(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB, viewGroup2);
            }
            viewGroup.addView(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB);
            C786410Ut5.LLLLIIIILLL(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB, 0);
            C786410Ut5.LJLZ(0, viewGroup);
            sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.U0(map);
            sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LJIIIIZZ();
            function0.invoke();
        }
    }
}
