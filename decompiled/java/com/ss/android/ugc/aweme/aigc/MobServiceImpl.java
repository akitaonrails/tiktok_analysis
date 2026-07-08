package com.ss.android.ugc.aweme.aigc;

import X.C0LAB;
import X.C13LP;
import X.C1403560md0;
import X.C2344009Gk;
import X.C546230LbZ;
import X.C546300Lbg;
import X.C547860LeC;
import X.C549440Lgk;
import com.ss.android.ugc.aweme.aikit.api.camera.ability.MobService;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes9.dex */
public final class MobServiceImpl implements MobService {
    @Override // com.ss.android.ugc.aweme.aikit.api.camera.ability.MobService
    public final String LIZIZ(CreativeModel creativeModel) {
        Function1<CreativeModel, String> function1;
        String strInvoke;
        Iterator<C546230LbZ> it2 = C546300Lbg.LIZIZ(creativeModel, false).iterator();
        while (it2.hasNext()) {
            C549440Lgk c549440LgkLJ = it2.next().LJ();
            if (c549440LgkLJ != null && (function1 = c549440LgkLJ.LJIIJJI) != null && (strInvoke = function1.invoke(creativeModel)) != null && strInvoke.length() != 0) {
                return strInvoke;
            }
        }
        return "";
    }

    @Override // com.ss.android.ugc.aweme.aikit.api.camera.ability.MobService
    public final List<String> LJFF(CreativeModel creativeModel) {
        Function1<CreativeModel, String> function1;
        String strInvoke;
        ArrayList arrayList = new ArrayList();
        Iterator<C546230LbZ> it2 = C546300Lbg.LIZIZ(creativeModel, false).iterator();
        while (it2.hasNext()) {
            C549440Lgk c549440LgkLJ = it2.next().LJ();
            if (c549440LgkLJ != null && (function1 = c549440LgkLJ.LIZ) != null && (strInvoke = function1.invoke(creativeModel)) != null) {
                arrayList.add(strInvoke);
            }
        }
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.aikit.api.camera.ability.MobService
    public final C0LAB LIZ(CreativeModel creativeModel, C0LAB c0lab) {
        Function2<C0LAB, CreativeModel, Unit> function2;
        Iterator it2 = C546300Lbg.LIZJ(creativeModel).iterator();
        while (it2.hasNext()) {
            C549440Lgk c549440LgkLJ = ((C546230LbZ) it2.next()).LJ();
            if (c549440LgkLJ != null && (function2 = c549440LgkLJ.LJI) != null) {
                function2.invoke(c0lab, creativeModel);
            }
        }
        LJIILJJIL(creativeModel, c0lab);
        return c0lab;
    }

    @Override // com.ss.android.ugc.aweme.aikit.api.camera.ability.MobService
    public final C0LAB LIZJ(CreativeModel creativeModel, C1403560md0 c1403560md0) {
        Function2<C0LAB, CreativeModel, Unit> function2;
        Iterator<C546230LbZ> it2 = C546300Lbg.LIZIZ(creativeModel, false).iterator();
        while (it2.hasNext()) {
            C549440Lgk c549440LgkLJ = it2.next().LJ();
            if (c549440LgkLJ != null && (function2 = c549440LgkLJ.LJII) != null) {
                function2.invoke(c1403560md0, creativeModel);
            }
        }
        LJIILJJIL(creativeModel, c1403560md0);
        return c1403560md0;
    }

    @Override // com.ss.android.ugc.aweme.aikit.api.camera.ability.MobService
    public final C0LAB LIZLLL(CreativeModel creativeModel, C1403560md0 c1403560md0) {
        Function2<C0LAB, CreativeModel, Unit> function2;
        Iterator<C546230LbZ> it2 = C546300Lbg.LIZIZ(creativeModel, false).iterator();
        while (it2.hasNext()) {
            C549440Lgk c549440LgkLJ = it2.next().LJ();
            if (c549440LgkLJ != null && (function2 = c549440LgkLJ.LIZJ) != null) {
                function2.invoke(c1403560md0, creativeModel);
            }
        }
        LJIILJJIL(creativeModel, c1403560md0);
        return c1403560md0;
    }

    @Override // com.ss.android.ugc.aweme.aikit.api.camera.ability.MobService
    public final C0LAB LJ(CreativeModel creativeModel, C1403560md0 c1403560md0) {
        Function2<C0LAB, CreativeModel, Unit> function2;
        Iterator<C546230LbZ> it2 = C546300Lbg.LIZIZ(creativeModel, false).iterator();
        while (it2.hasNext()) {
            C549440Lgk c549440LgkLJ = it2.next().LJ();
            if (c549440LgkLJ != null && (function2 = c549440LgkLJ.LJIIIIZZ) != null) {
                function2.invoke(c1403560md0, creativeModel);
            }
        }
        LJIILJJIL(creativeModel, c1403560md0);
        return c1403560md0;
    }

    @Override // com.ss.android.ugc.aweme.aikit.api.camera.ability.MobService
    public final C0LAB LJI(CreativeModel creativeModel, C0LAB c0lab) {
        Function2<C0LAB, CreativeModel, Unit> function2;
        Iterator<C546230LbZ> it2 = C546300Lbg.LIZIZ(creativeModel, false).iterator();
        while (it2.hasNext()) {
            C549440Lgk c549440LgkLJ = it2.next().LJ();
            if (c549440LgkLJ != null && (function2 = c549440LgkLJ.LIZLLL) != null) {
                function2.invoke(c0lab, creativeModel);
            }
        }
        LJIILJJIL(creativeModel, c0lab);
        return c0lab;
    }

    @Override // com.ss.android.ugc.aweme.aikit.api.camera.ability.MobService
    public final void LJII(C2344009Gk c2344009Gk, Aweme aweme) {
        Function2<C2344009Gk, Aweme, Unit> function2;
        C547860LeC.LIZ.getClass();
        Iterator<C546230LbZ> it2 = C547860LeC.LIZIZ().LJFF(false).iterator();
        while (it2.hasNext()) {
            C549440Lgk c549440LgkLJ = it2.next().LJ();
            if (c549440LgkLJ != null && (function2 = c549440LgkLJ.LJIILIIL) != null) {
                function2.invoke(c2344009Gk, aweme);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.aikit.api.camera.ability.MobService
    public final C0LAB LJIIIIZZ(CreativeModel creativeModel, C1403560md0 c1403560md0) {
        Function2<C0LAB, CreativeModel, Unit> function2;
        Iterator it2 = C546300Lbg.LIZJ(creativeModel).iterator();
        while (it2.hasNext()) {
            C549440Lgk c549440LgkLJ = ((C546230LbZ) it2.next()).LJ();
            if (c549440LgkLJ != null && (function2 = c549440LgkLJ.LJFF) != null) {
                function2.invoke(c1403560md0, creativeModel);
            }
        }
        LJIILJJIL(creativeModel, c1403560md0);
        return c1403560md0;
    }

    @Override // com.ss.android.ugc.aweme.aikit.api.camera.ability.MobService
    public final C0LAB LJIIIZ(CreativeModel creativeModel, C0LAB c0lab) {
        Function2<C0LAB, CreativeModel, Unit> function2;
        Iterator<C546230LbZ> it2 = C546300Lbg.LIZIZ(creativeModel, false).iterator();
        while (it2.hasNext()) {
            C549440Lgk c549440LgkLJ = it2.next().LJ();
            if (c549440LgkLJ != null && (function2 = c549440LgkLJ.LIZIZ) != null) {
                function2.invoke(c0lab, creativeModel);
            }
        }
        LJIILJJIL(creativeModel, c0lab);
        return c0lab;
    }

    @Override // com.ss.android.ugc.aweme.aikit.api.camera.ability.MobService
    public final void LJIIJ(CreativeModel creativeModel, C0LAB c0lab) {
        Function2<C0LAB, CreativeModel, Unit> function2;
        LJIILJJIL(creativeModel, c0lab);
        C547860LeC.LIZ.getClass();
        List<C546230LbZ> listLJFF = C547860LeC.LIZIZ().LJFF(false);
        if (listLJFF != null) {
            Iterator<C546230LbZ> it2 = listLJFF.iterator();
            while (it2.hasNext()) {
                C549440Lgk c549440LgkLJ = it2.next().LJ();
                if (c549440LgkLJ != null && (function2 = c549440LgkLJ.LJIIL) != null) {
                    function2.invoke(c0lab, creativeModel);
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.aikit.api.camera.ability.MobService
    public final C0LAB LJIIJJI(CreativeModel creativeModel, C0LAB c0lab) {
        Function2<C0LAB, CreativeModel, Unit> function2;
        Iterator<C546230LbZ> it2 = C546300Lbg.LIZIZ(creativeModel, false).iterator();
        while (it2.hasNext()) {
            C549440Lgk c549440LgkLJ = it2.next().LJ();
            if (c549440LgkLJ != null && (function2 = c549440LgkLJ.LJIIIZ) != null) {
                function2.invoke(c0lab, creativeModel);
            }
        }
        return c0lab;
    }

    @Override // com.ss.android.ugc.aweme.aikit.api.camera.ability.MobService
    public final C0LAB LJIIL(CreativeModel creativeModel, C0LAB c0lab) {
        Function2<C0LAB, CreativeModel, Unit> function2;
        Iterator<C546230LbZ> it2 = C546300Lbg.LIZIZ(creativeModel, false).iterator();
        while (it2.hasNext()) {
            C549440Lgk c549440LgkLJ = it2.next().LJ();
            if (c549440LgkLJ != null && (function2 = c549440LgkLJ.LJ) != null) {
                function2.invoke(c0lab, creativeModel);
            }
        }
        LJIILJJIL(creativeModel, c0lab);
        return c0lab;
    }

    @Override // com.ss.android.ugc.aweme.aikit.api.camera.ability.MobService
    public final C0LAB LJIILIIL(CreativeModel creativeModel, C0LAB c0lab) {
        Function2<C0LAB, CreativeModel, Unit> function2;
        Iterator<C546230LbZ> it2 = C546300Lbg.LIZIZ(creativeModel, false).iterator();
        while (it2.hasNext()) {
            C549440Lgk c549440LgkLJ = it2.next().LJ();
            if (c549440LgkLJ != null && (function2 = c549440LgkLJ.LJIIJ) != null) {
                function2.invoke(c0lab, creativeModel);
            }
        }
        return c0lab;
    }

    public final void LJIILJJIL(CreativeModel creativeModel, C0LAB c0lab) {
        c0lab.LJ("ai_content_source", C13LP.LJJLIIIJ(LJFF(creativeModel), ",", null, null, 0, null, null, 62));
    }
}
