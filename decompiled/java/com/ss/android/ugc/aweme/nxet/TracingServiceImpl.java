package com.ss.android.ugc.aweme.nxet;

import X.C0VP2;
import X.C1809310xBR;
import X.C1844740y6a;
import X.C1845200y7K;
import X.C1846620y9c;
import X.C1847610yBD;
import X.C1847660yBI;
import X.C1847720yBO;
import X.C1847740yBQ;
import X.C1847780yBU;
import X.C1847820yBY;
import X.C1847930yBj;
import X.C1848010yBr;
import X.C1848120yC2;
import X.C1848140yC4;
import X.C1848290yCJ;
import X.C1848410yCV;
import X.C1954807lC;
import X.C2097508Jp;
import X.C2188811AlT;
import X.EnumC1847910yBh;
import X.EnumC1847970yBn;
import X.EnumC1848020yBs;
import X.InterfaceC1294060jmO;
import X.InterfaceC1845190y7J;
import X.InterfaceC1846560y9W;
import X.InterfaceC1847507Ll;
import X.InterfaceC1848330yCN;
import X.InterfaceC1848340yCO;
import X.InterfaceC1848550yCj;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import android.app.Activity;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.nxet.event.EventDispatch;
import com.ss.android.ugc.aweme.nxet.info.NxETEventMap;
import com.ss.android.ugc.aweme.nxet.info.NxETUIAutomationManager;
import com.ss.android.ugc.aweme.nxet.vtree.v2.VTreeBuildManager;
import com.zhiliaoapp.musically.R;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes28.dex */
public final class TracingServiceImpl implements ITracingService {
    @Override // com.ss.android.ugc.aweme.nxet.ITracingService
    public final void LJII() {
        if (C1848410yCV.LIZ) {
            VTreeBuildManager.LJIIL(false);
        }
    }

    @Override // com.ss.android.ugc.aweme.nxet.ITracingService
    public final InterfaceC1848550yCj LJIJ() {
        return C1844740y6a.LIZ;
    }

    public static void LJIJI(Object obj) {
        View viewLIZLLL;
        C1847740yBQ c1847740yBQLIZIZ;
        WeakReference<View> weakReference;
        View view;
        List<WeakReference<View>> list;
        if (!C1848410yCV.LIZ || (viewLIZLLL = C1846620y9c.LIZLLL(obj)) == null || (c1847740yBQLIZIZ = C1846620y9c.LIZIZ(viewLIZLLL)) == null || (weakReference = c1847740yBQLIZIZ.LJIILLIIL) == null || (view = weakReference.get()) == null) {
            return;
        }
        C1847740yBQ c1847740yBQLIZJ = C1846620y9c.LIZJ(viewLIZLLL);
        if (c1847740yBQLIZJ != null) {
            c1847740yBQLIZJ.LJIILLIIL = null;
        }
        C1847740yBQ c1847740yBQLIZIZ2 = C1846620y9c.LIZIZ(view);
        if (c1847740yBQLIZIZ2 != null && (list = c1847740yBQLIZIZ2.LJIIZILJ) != null && !list.isEmpty()) {
            for (WeakReference<View> weakReference2 : list) {
                if (Intrinsics.LJFF(weakReference2.get(), viewLIZLLL)) {
                    list.remove(weakReference2);
                }
            }
            VTreeBuildManager.LJIIJ(viewLIZLLL);
        }
    }

    @Override // com.ss.android.ugc.aweme.nxet.ITracingService
    public final void LIZIZ(Object obj) {
        View viewLIZLLL;
        List<WeakReference<View>> list;
        if (!C1848410yCV.LIZ || (viewLIZLLL = C1846620y9c.LIZLLL(obj)) == null) {
            return;
        }
        LJIJI(obj);
        C1847740yBQ c1847740yBQLIZIZ = C1846620y9c.LIZIZ(viewLIZLLL);
        if (c1847740yBQLIZIZ != null && (list = c1847740yBQLIZIZ.LJIIZILJ) != null && !list.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(list);
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                Object obj2 = ((Reference) it2.next()).get();
                if (obj2 != null) {
                    LJIJI(obj2);
                }
            }
        }
        View viewLIZLLL2 = C1846620y9c.LIZLLL(obj);
        if (viewLIZLLL2 != null) {
            viewLIZLLL2.setTag(R.id.ph_, null);
        }
        VTreeBuildManager.LJIIJ(obj);
    }

    @Override // com.ss.android.ugc.aweme.nxet.ITracingService
    public final void LIZJ(InterfaceC1848340yCO interfaceC1848340yCO) {
        EventDispatch.ExposureHandler exposureHandler = EventDispatch.LIZ;
        EventDispatch.LIZIZ.add(new WeakReference<>(interfaceC1848340yCO));
    }

    @Override // com.ss.android.ugc.aweme.nxet.ITracingService
    public final void LJFF(Object obj) {
        C1847740yBQ c1847740yBQLIZIZ;
        if (!C1848410yCV.LIZ || (c1847740yBQLIZIZ = C1846620y9c.LIZIZ(obj)) == null || c1847740yBQLIZIZ.LJFF()) {
            return;
        }
        c1847740yBQLIZIZ.LJII = 0L;
    }

    @Override // com.ss.android.ugc.aweme.nxet.ITracingService
    public final void LJI(Fragment fragment) {
        InterfaceC1845190y7J interfaceC1845190y7J = C1845200y7K.LIZ;
        C1845200y7K.LIZIZ.add(fragment.getClass());
    }

    @Override // com.ss.android.ugc.aweme.nxet.ITracingService
    public final void LJIIIIZZ(View view) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(view);
    }

    @Override // com.ss.android.ugc.aweme.nxet.ITracingService
    public final void LJIIJJI(final C1848120yC2 c1848120yC2) {
        if (!C1848410yCV.LIZ) {
            return;
        }
        C1847780yBU.LIZ(new InterfaceC1847507Ll(c1848120yC2) { // from class: X.0yC3
            public final C1848120yC2 LIZ;

            @Override // X.InterfaceC1847507Ll
            public final String getEvent() {
                return this.LIZ.LIZ;
            }

            @Override // X.InterfaceC1847507Ll
            public final Map<String, Object> getParams() {
                return this.LIZ.LIZIZ;
            }

            {
                this.LIZ = c1848120yC2;
            }
        }, null, null);
        if (!c1848120yC2.LIZJ) {
            return;
        }
        String str = c1848120yC2.LIZ;
        String str2 = c1848120yC2.LIZLLL;
        String str3 = c1848120yC2.LJ;
        String str4 = c1848120yC2.LJFF;
        boolean z = c1848120yC2.LJI;
        C1847720yBO c1847720yBO = new C1847720yBO();
        c1847720yBO.LJII((String) C1848140yC4.LIZJ.getValue());
        c1847720yBO.LJIIIZ(str2);
        c1847720yBO.LJFF(String.valueOf(C1847610yBD.LIZ.LIZ()));
        c1847720yBO.LIZLLL(str);
        c1847720yBO.LJIIIIZZ(str3);
        c1847720yBO.LJI(str4);
        c1847720yBO.LJI(str4);
        if (z) {
            c1847720yBO.LJ(11, "er");
        }
        C1847820yBY.LIZ.LIZIZ(new C0VP2(c1847720yBO.LIZ(), EnumC1847970yBn.CUSTOM_EVENT));
    }

    @Override // com.ss.android.ugc.aweme.nxet.ITracingService
    public final void LJIILL(Object obj) {
        C1847740yBQ c1847740yBQLIZIZ;
        C1847740yBQ c1847740yBQLIZIZ2;
        if (C1848410yCV.LIZ && (c1847740yBQLIZIZ = C1846620y9c.LIZIZ(obj)) != null && !c1847740yBQLIZIZ.LJFF() && (c1847740yBQLIZIZ2 = C1846620y9c.LIZIZ(c1847740yBQLIZIZ)) != null) {
            c1847740yBQLIZIZ2.LJI = 0.0f;
        }
    }

    @Override // com.ss.android.ugc.aweme.nxet.ITracingService
    public final void LJIIZILJ(Activity activity) {
        InterfaceC1845190y7J interfaceC1845190y7J = C1845200y7K.LIZ;
        C1845200y7K.LIZIZ.add(activity.getClass());
    }

    @Override // com.ss.android.ugc.aweme.nxet.ITracingService
    public final void LIZLLL(Object obj, InterfaceC1848330yCN interfaceC1848330yCN) {
        C1847740yBQ c1847740yBQLIZIZ;
        if (C1848410yCV.LIZ && (c1847740yBQLIZIZ = C1846620y9c.LIZIZ(obj)) != null) {
            synchronized (c1847740yBQLIZIZ) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(new WeakReference(interfaceC1848330yCN));
                List<WeakReference<InterfaceC1848330yCN>> list = c1847740yBQLIZIZ.LJIILIIL;
                if (list != null) {
                    for (WeakReference<InterfaceC1848330yCN> weakReference : list) {
                        if (weakReference.get() != null && !Intrinsics.LJFF(weakReference.get(), interfaceC1848330yCN)) {
                            arrayList.add(weakReference);
                        }
                    }
                }
                c1847740yBQLIZIZ.LJIILIIL = arrayList;
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.nxet.ITracingService
    public final void LJ(Object obj, EnumC1847910yBh enumC1847910yBh) {
        C1847740yBQ c1847740yBQLIZIZ;
        if (C1848410yCV.LIZ && (c1847740yBQLIZIZ = C1846620y9c.LIZIZ(obj)) != null) {
            c1847740yBQLIZIZ.LJIIL &= ~enumC1847910yBh.getFlag();
            c1847740yBQLIZIZ.LJIIJJI[enumC1847910yBh.getIndex()] = null;
        }
    }

    @Override // com.ss.android.ugc.aweme.nxet.ITracingService
    @InterfaceC1294060jmO
    public final void LJIIIZ(Object obj, String str) {
        C1847740yBQ c1847740yBQLIZJ;
        if (!C1848410yCV.LIZ || (c1847740yBQLIZJ = C1846620y9c.LIZJ(obj)) == null) {
            return;
        }
        c1847740yBQLIZJ.LIZLLL = str;
    }

    @Override // com.ss.android.ugc.aweme.nxet.ITracingService
    public final void LJIIJ(Object obj, String str) {
        C1847740yBQ c1847740yBQLIZIZ;
        if (C1848410yCV.LIZ && (c1847740yBQLIZIZ = C1846620y9c.LIZIZ(obj)) != null) {
            c1847740yBQLIZIZ.LJI(str, true);
        }
    }

    @Override // com.ss.android.ugc.aweme.nxet.ITracingService
    public final void LJIILIIL(int i, Object obj) {
        C1847740yBQ c1847740yBQLIZIZ;
        C1848290yCJ c1848290yCJ;
        if (C1848410yCV.LIZ && (c1847740yBQLIZIZ = C1846620y9c.LIZIZ(obj)) != null && (c1848290yCJ = c1847740yBQLIZIZ.LJ) != null) {
            c1848290yCJ.LIZ = Integer.valueOf(i);
        }
    }

    @Override // com.ss.android.ugc.aweme.nxet.ITracingService
    public final void LJIILJJIL(Object obj, Map<String, ? extends Object> map) {
        C1847740yBQ c1847740yBQLIZIZ;
        C1848290yCJ c1848290yCJ;
        C2097508Jp<String, Object> c2097508Jp;
        if (C1848410yCV.LIZ && (c1847740yBQLIZIZ = C1846620y9c.LIZIZ(obj)) != null && (c1848290yCJ = c1847740yBQLIZIZ.LJ) != null && (c2097508Jp = c1848290yCJ.LIZIZ) != null) {
            c2097508Jp.putAll(map);
        }
    }

    @Override // com.ss.android.ugc.aweme.nxet.ITracingService
    public final void LJIIL(Object obj, EnumC1847910yBh enumC1847910yBh, String str) {
        C1847740yBQ c1847740yBQLIZIZ;
        if (C1848410yCV.LIZ && (c1847740yBQLIZIZ = C1846620y9c.LIZIZ(obj)) != null) {
            c1847740yBQLIZIZ.LJIIL |= enumC1847910yBh.getFlag();
            c1847740yBQLIZIZ.LJIIJJI[enumC1847910yBh.getIndex()] = str;
        }
    }

    @Override // com.ss.android.ugc.aweme.nxet.ITracingService
    public final void LJIILLIIL(Object obj, String str, EnumC1848020yBs enumC1848020yBs) {
        C1847740yBQ c1847740yBQLIZJ;
        if (!C1848410yCV.LIZ) {
            return;
        }
        LIZIZ(obj);
        C1847740yBQ c1847740yBQ = new C1847740yBQ();
        View viewLIZLLL = C1846620y9c.LIZLLL(obj);
        if (viewLIZLLL != null) {
            viewLIZLLL.setTag(R.id.ph_, c1847740yBQ);
        }
        C1847740yBQ c1847740yBQLIZIZ = C1846620y9c.LIZIZ(obj);
        if (c1847740yBQLIZIZ == null) {
            return;
        }
        c1847740yBQLIZIZ.LIZIZ = str;
        c1847740yBQLIZIZ.LIZJ = enumC1848020yBs;
        c1847740yBQLIZIZ.LJI(String.valueOf(obj.hashCode()), false);
        int i = C1848010yBr.LIZ[enumC1848020yBs.ordinal()];
        if (i != 1 && i != 2) {
            if (i != 3 && i != 4) {
                throw new C1954807lC();
            }
        } else {
            EnumC1847910yBh enumC1847910yBh = EnumC1847910yBh.STAY;
            c1847740yBQLIZIZ.LJIIL |= enumC1847910yBh.getFlag();
            c1847740yBQLIZIZ.LJIIJJI[enumC1847910yBh.getIndex()] = null;
            c1847740yBQLIZIZ.LJFF = true;
            c1847740yBQLIZIZ.LJII = 0L;
            c1847740yBQLIZIZ.LJI = 0.0f;
            if ((NxETEventMap.LJ || NxETUIAutomationManager.INSTANCE.isInit()) && (c1847740yBQLIZJ = C1846620y9c.LIZJ(obj)) != null) {
                c1847740yBQLIZJ.LJIJI = C1846620y9c.LIZ(obj);
            }
        }
        InterfaceC1846560y9W interfaceC1846560y9WLIZ = C1847660yBI.LIZ();
        if (interfaceC1846560y9WLIZ != null && interfaceC1846560y9WLIZ.LJFF()) {
            ViewOnAttachStateChangeListenerC1846530y9T viewOnAttachStateChangeListenerC1846530y9T = ViewOnAttachStateChangeListenerC1846530y9T.LL;
            View viewLIZLLL2 = C1846620y9c.LIZLLL(obj);
            if (viewLIZLLL2 != null) {
                viewLIZLLL2.removeOnAttachStateChangeListener(viewOnAttachStateChangeListenerC1846530y9T);
                viewLIZLLL2.addOnAttachStateChangeListener(viewOnAttachStateChangeListenerC1846530y9T);
                if (viewLIZLLL2 instanceof RecyclerView) {
                    RecyclerView recyclerView = (RecyclerView) viewLIZLLL2;
                    C1809310xBR c1809310xBR = ViewOnAttachStateChangeListenerC1846530y9T.LLILZ;
                    recyclerView.removeOnScrollListener(c1809310xBR);
                    recyclerView.addOnScrollListener(c1809310xBR);
                }
            }
        }
        VTreeBuildManager.LJIIJ(obj);
    }

    @Override // com.ss.android.ugc.aweme.nxet.ITracingService
    public final void LIZ(View view, EnumC1847910yBh enumC1847910yBh, String str, Map<String, ? extends Object> map, Boolean bool) {
        C1847740yBQ c1847740yBQLIZIZ;
        if (C1848410yCV.LIZ && (c1847740yBQLIZIZ = C1846620y9c.LIZIZ(view)) != null && c1847740yBQLIZIZ.LIZIZ != null) {
            boolean zLJFF = false;
            if ((str == null || str.length() == 0) && enumC1847910yBh == null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Log on view MUST has valid `event` or `action`, but got event: ");
                sbLIZ.append(str);
                sbLIZ.append(", action: ");
                sbLIZ.append(enumC1847910yBh);
                sbLIZ.append('.');
                C2188811AlT.LIZIZ(sbLIZ);
                return;
            }
            if (enumC1847910yBh == EnumC1847910yBh.CLICK) {
                if (!Intrinsics.LJFF(bool, Boolean.FALSE)) {
                    zLJFF = true;
                }
            } else {
                zLJFF = Intrinsics.LJFF(bool, Boolean.TRUE);
            }
            EventDispatch.LIZJ(view, enumC1847910yBh, str, zLJFF);
            EventDispatch.LIZ(new C1847930yBj(view, enumC1847910yBh, str, map));
        }
    }
}
