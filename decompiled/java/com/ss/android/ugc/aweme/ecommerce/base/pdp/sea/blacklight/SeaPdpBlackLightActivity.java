package com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.blacklight;

import X.AbstractActivityC1743740vTg;
import X.AbstractC1764660w1Q;
import X.C034S;
import X.C098200Yq;
import X.C1018703yb;
import X.C1120604Zw;
import X.C1308910kAL;
import X.C13LP;
import X.C1685300txQ;
import X.C1697810uHb;
import X.C1744710vVF;
import X.C1751600vgM;
import X.C1764520w1C;
import X.C1764600w1K;
import X.C1764780w1c;
import X.C1764900w1o;
import X.C1766600w4Y;
import X.C1878350yyn;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C1AQS;
import X.C2097608Jq;
import X.C21594419fC;
import X.C299020Bno;
import X.C335910DEv;
import X.C717610SCx;
import X.C717620SCy;
import X.C786410Ut5;
import X.EnumC335920DEw;
import X.InterfaceC1399350mWD;
import X.InterfaceC1760590vur;
import X.InterfaceC583370MuN;
import X.InterfaceC655270Pn3;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.biz.card.head.pendant.tab.DetailPageDaInfo;
import com.ss.android.ugc.aweme.ecommerce.galleryviewer.GalleryFragment;
import com.ss.android.ugc.aweme.ecommerce.galleryviewer.core.PhotoViewerFragment;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.IndexedValue;
import org.greenrobot.eventbus.EventBus;

/* JADX INFO: loaded from: classes27.dex */
public final class SeaPdpBlackLightActivity extends AbstractActivityC1743740vTg implements InterfaceC655270Pn3, InterfaceC583370MuN {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiAvJiI+LTcvLGExKTYpZz83HELIOSOGs/LC59KiktKiQ/ISIkPWEALSQcLT8RJCQvIgM6Ly04CCwnITMlPTY=";
    public C21594419fC LLILZIL;
    public C1764600w1K LLILZLL;
    public C1744710vVF LLIZ;
    public boolean LLJI;
    public int LLJIJIL;
    public long LLJILJIL;
    public long LLJILJILJ;
    public boolean LLJILLL;
    public boolean LLJJIII;
    public int LLIZLLLIL = -1;
    public int LLJ = -1;
    public String LLJJ = "";
    public String LLJJI = "";

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.blacklight.SeaPdpBlackLightActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // X.InterfaceC655270Pn3
    public final void registerActivityOnKeyDownListener(InterfaceC1399350mWD interfaceC1399350mWD) {
    }

    @Override // X.InterfaceC655270Pn3
    public final void unRegisterActivityOnKeyDownListener(InterfaceC1399350mWD interfaceC1399350mWD) {
    }

    @Override // X.InterfaceC583370MuN
    public final Fragment getCurrentFragment() {
        List<C1764900w1o> list;
        C1764900w1o c1764900w1o;
        C21594419fC c21594419fC = this.LLILZIL;
        if (c21594419fC != null) {
            int currentItem = c21594419fC.getCurrentItem();
            C1764600w1K c1764600w1K = this.LLILZLL;
            if (c1764600w1K != null && (list = c1764600w1K.LIZIZ) != null && (c1764900w1o = (C1764900w1o) C13LP.LJJJLZIJ(currentItem, list)) != null) {
                return c1764900w1o.LJIIIZ;
            }
        }
        return null;
    }

    @Override // X.AbstractActivityC1743740vTg, com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onResume() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.blacklight.SeaPdpBlackLightActivity", "onResume", true);
        super.onResume();
        this.LLJJIII = true;
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.blacklight.SeaPdpBlackLightActivity", "onResume", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStart() {
        C1764520w1C c1764520w1C;
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.blacklight.SeaPdpBlackLightActivity", "onStart", true);
        super.onStart();
        C1766600w4Y c1766600w4Y = C1766600w4Y.LIZ;
        C1764600w1K c1764600w1K = this.LLILZLL;
        String str = (c1764600w1K == null || (c1764520w1C = c1764600w1K.LIZJ) == null) ? null : c1764520w1C.LJFF;
        c1766600w4Y.getClass();
        C1766600w4Y.LJIIIZ(str, true);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.blacklight.SeaPdpBlackLightActivity", "onStart", false);
    }

    @Override // X.AbstractActivityC1743740vTg, com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onDestroy() {
        IECommerceHostService iECommerceHostService;
        C1764520w1C c1764520w1C;
        C1764520w1C c1764520w1C2;
        Pair<Integer, Integer> pair;
        C1764520w1C c1764520w1C3;
        List<C1764900w1o> list;
        super.onDestroy();
        C1764600w1K c1764600w1K = this.LLILZLL;
        if (c1764600w1K != null && (list = c1764600w1K.LIZIZ) != null) {
            Iterator<C1764900w1o> it2 = list.iterator();
            while (it2.hasNext()) {
                it2.next().LJIIIZ = null;
            }
        }
        Map<String, String> map = C1751600vgM.LIZ;
        String strValueOf = String.valueOf(SystemClock.elapsedRealtime() - this.LLJILJILJ);
        String str = this.LLJJ;
        int i = this.LLJIJIL + 1;
        String str2 = this.LLJJI;
        C1764600w1K c1764600w1K2 = this.LLILZLL;
        C1751600vgM.LIZIZ(i, strValueOf, str, str2, (c1764600w1K2 == null || (c1764520w1C3 = c1764600w1K2.LIZJ) == null) ? null : c1764520w1C3.LJI);
        String strValueOf2 = String.valueOf(SystemClock.elapsedRealtime() - this.LLJILJIL);
        C1764600w1K c1764600w1K3 = this.LLILZLL;
        String strLLLZ = LLLZ((c1764600w1K3 == null || (pair = c1764600w1K3.LIZ) == null) ? 0 : pair.getFirst().intValue());
        C1764600w1K c1764600w1K4 = this.LLILZLL;
        Map<String, Object> map2 = (c1764600w1K4 == null || (c1764520w1C2 = c1764600w1K4.LIZJ) == null) ? null : c1764520w1C2.LJI;
        HashMap map3 = new HashMap();
        if (map2 != null) {
            map3.putAll(map2);
        }
        map3.putAll(C1751600vgM.LIZ);
        map3.putAll(C2097608Jq.LJIIIIZZ(new Pair("source_button", strLLLZ), new Pair("stay_time", strValueOf2)));
        C1018703yb.LJ("tiktokec_stay_page", map3);
        EventBus.LIZLLL().LJIILL(new Object() { // from class: X.0w1h
        });
        C1766600w4Y c1766600w4Y = C1766600w4Y.LIZ;
        C1764600w1K c1764600w1K5 = this.LLILZLL;
        String str3 = (c1764600w1K5 == null || (c1764520w1C = c1764600w1K5.LIZJ) == null) ? null : c1764520w1C.LJFF;
        c1766600w4Y.getClass();
        C1766600w4Y.LJIIIZ(str3, false);
        try {
            if (C034S.LIZ()) {
                C1120604Zw.LIZ.LIZ();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                Object service = ServiceManager.get().getService(IApplicationDependencyService.class);
                IECommerceHostService iECommerceHostService2 = (IECommerceHostService) service;
                C1AQS.LIZJ(jElapsedRealtime, 1, IApplicationDependencyService.class.getName(), iECommerceHostService2 != null ? iECommerceHostService2.getClass().getName() : null, iECommerceHostService2 != null);
                iECommerceHostService = (IECommerceHostService) service;
            } else {
                C1120604Zw.LIZ.LIZ();
                iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
            }
            if (((IApplicationDependencyService) iECommerceHostService).isOffline()) {
                C1878350yyn.LIZ(InterfaceC1760590vur.LIZ, this);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onPause() {
        C1764520w1C c1764520w1C;
        super.onPause();
        this.LLJJIII = false;
        if (isFinishing()) {
            C1766600w4Y c1766600w4Y = C1766600w4Y.LIZ;
            C1764600w1K c1764600w1K = this.LLILZLL;
            String str = (c1764600w1K == null || (c1764520w1C = c1764600w1K.LIZJ) == null) ? null : c1764520w1C.LJFF;
            c1766600w4Y.getClass();
            C1766600w4Y.LJIIIZ(str, false);
        }
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStop() {
        super.onStop();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            try {
                getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        try {
            getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean LLLLZLLIL(int i) {
        List<C1764900w1o> list;
        PhotoViewerFragment photoViewerFragment;
        RecyclerView recyclerView;
        List<C1764900w1o> list2;
        PhotoViewerFragment photoViewerFragment2;
        boolean z = false;
        if (i > this.LLIZLLLIL) {
            C1764600w1K c1764600w1K = this.LLILZLL;
            if (c1764600w1K != null && (list2 = c1764600w1K.LIZIZ) != null) {
                C717620SCy c717620SCyLLIIL = C13LP.LLIIL(list2);
                ArrayList arrayList = new ArrayList();
                Iterator it2 = c717620SCyLLIIL.iterator();
                while (true) {
                    C717610SCx c717610SCx = (C717610SCx) it2;
                    if (!c717610SCx.hasNext()) {
                        break;
                    }
                    Object next = c717610SCx.next();
                    if (((IndexedValue) next).LIZ < i) {
                        arrayList.add(next);
                    }
                }
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    C1764900w1o c1764900w1o = (C1764900w1o) ((IndexedValue) it3.next()).LIZIZ;
                    Fragment fragment = c1764900w1o.LJIIIZ;
                    if ((fragment instanceof GalleryFragment) && (photoViewerFragment2 = (PhotoViewerFragment) fragment) != null) {
                        int size = c1764900w1o.LJ.size() - 1;
                        if (size < 0) {
                            size = 0;
                        }
                        RecyclerView recyclerView2 = photoViewerFragment2.LL;
                        if (recyclerView2 != null) {
                            recyclerView2.scrollToPosition(size);
                        }
                    }
                }
            }
            z = true;
        } else {
            C1764600w1K c1764600w1K2 = this.LLILZLL;
            if (c1764600w1K2 != null && (list = c1764600w1K2.LIZIZ) != null) {
                C717620SCy c717620SCyLLIIL2 = C13LP.LLIIL(list);
                ArrayList arrayList2 = new ArrayList();
                Iterator it4 = c717620SCyLLIIL2.iterator();
                while (true) {
                    C717610SCx c717610SCx2 = (C717610SCx) it4;
                    if (!c717610SCx2.hasNext()) {
                        break;
                    }
                    Object next2 = c717610SCx2.next();
                    if (((IndexedValue) next2).LIZ > i) {
                        arrayList2.add(next2);
                    }
                }
                Iterator it5 = arrayList2.iterator();
                while (it5.hasNext()) {
                    Fragment fragment2 = ((C1764900w1o) ((IndexedValue) it5.next()).LIZIZ).LJIIIZ;
                    if ((fragment2 instanceof GalleryFragment) && (photoViewerFragment = (PhotoViewerFragment) fragment2) != null && (recyclerView = photoViewerFragment.LL) != null) {
                        recyclerView.scrollToPosition(0);
                    }
                }
            }
        }
        this.LLIZLLLIL = i;
        this.LLJILLL = true;
        return z;
    }

    public final String LLLZ(int i) {
        C1764900w1o c1764900w1o;
        DetailPageDaInfo detailPageDaInfo;
        String str;
        C1764600w1K c1764600w1K = this.LLILZLL;
        if (c1764600w1K == null || (c1764900w1o = (C1764900w1o) C13LP.LJJJLZIJ(i, c1764600w1K.LIZIZ)) == null || (detailPageDaInfo = c1764900w1o.LJI) == null || (str = detailPageDaInfo.listName) == null) {
            return "";
        }
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:93:0x01db, code lost:
    
        r3 = r3 + r8.LJ.size();
     */
    @Override // X.AbstractActivityC1743740vTg, com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r16) {
        /*
            Method dump skipped, instruction units count: 703
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.blacklight.SeaPdpBlackLightActivity.onCreate(android.os.Bundle):void");
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i) {
        boolean z;
        super.setTheme(i);
        if (C299020Bno.LIZ() != 0) {
            boolean z2 = false;
            if (!C1697810uHb.LJIIJJI(Integer.valueOf(R.style.a9t), Integer.valueOf(R.style.a9u), Integer.valueOf(R.style.a9v), Integer.valueOf(R.style.a9s)).contains(Integer.valueOf(i))) {
                Integer numLIZ = C1308910kAL.LIZ(R.attr.g0c, this);
                if (numLIZ != null && numLIZ.intValue() == -1) {
                    z = true;
                } else {
                    z = false;
                }
                Integer numLIZ2 = C1308910kAL.LIZ(R.attr.g0d, this);
                if (numLIZ2 == null || numLIZ2.intValue() != 0) {
                    z2 = true;
                }
                if (z) {
                    getTheme().applyStyle(R.style.a9u, true);
                } else {
                    getTheme().applyStyle(R.style.a9t, true);
                }
                if (z2) {
                    getTheme().applyStyle(R.style.a9v, true);
                } else {
                    getTheme().applyStyle(R.style.a9s, true);
                }
            }
        }
        EnumC335920DEw enumC335920DEwLIZ = C335910DEv.LIZ();
        if (enumC335920DEwLIZ == EnumC335920DEw.V1) {
            getTheme().applyStyle(R.style.a9x, true);
        } else {
            if (enumC335920DEwLIZ != EnumC335920DEw.V2) {
                return;
            }
            getTheme().applyStyle(R.style.a9y, true);
        }
    }

    public final void LLLLZLLLI(int i, String str) {
        String str2;
        C1764520w1C c1764520w1C;
        if (this.LLJJIII && this.LLJIJIL != i) {
            EventBus eventBusLIZLLL = EventBus.LIZLLL();
            C1764600w1K c1764600w1K = this.LLILZLL;
            if (c1764600w1K != null && (c1764520w1C = c1764600w1K.LIZJ) != null) {
                str2 = c1764520w1C.LIZJ;
            } else {
                str2 = null;
            }
            eventBusLIZLLL.LJIILL(new C1764780w1c(str, str2));
            this.LLJIJIL = i;
        }
    }

    public final String LLLZIL(int i, int i2) {
        List<C1764900w1o> list;
        C1764900w1o c1764900w1o;
        List<AbstractC1764660w1Q> list2;
        AbstractC1764660w1Q abstractC1764660w1Q;
        C1764600w1K c1764600w1K = this.LLILZLL;
        if (c1764600w1K != null && (list = c1764600w1K.LIZIZ) != null && (c1764900w1o = (C1764900w1o) C13LP.LJJJLZIJ(i, list)) != null && (list2 = c1764900w1o.LJ) != null && (abstractC1764660w1Q = (AbstractC1764660w1Q) C13LP.LJJJLZIJ(i2, list2)) != null) {
            return abstractC1764660w1Q.LIZ();
        }
        return null;
    }

    public final int LLLZLZ(int i, int i2) {
        List<C1764900w1o> list;
        Object c098200Yq;
        C1764600w1K c1764600w1K = this.LLILZLL;
        int i3 = 0;
        if (c1764600w1K != null && (list = c1764600w1K.LIZIZ) != null) {
            try {
                Iterator<C1764900w1o> it2 = list.iterator();
                int size = 0;
                while (true) {
                    try {
                        if (!it2.hasNext()) {
                            break;
                        }
                        C1764900w1o next = it2.next();
                        int i4 = i3 + 1;
                        if (i3 >= 0) {
                            C1764900w1o c1764900w1o = next;
                            if (i3 < i) {
                                size += c1764900w1o.LJ.size();
                            } else if (i3 == i) {
                                size += i2;
                                break;
                            }
                            i3 = i4;
                        } else {
                            C1697810uHb.LJIJI();
                            throw null;
                        }
                    } catch (Throwable th) {
                        th = th;
                        i3 = size;
                        TryCatchGuardChecker.doCheck(th);
                        c098200Yq = new C098200Yq(th);
                        C189200o6.m2constructorimpl(c098200Yq);
                    }
                }
                i3 = size;
                c098200Yq = Unit.LIZ;
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th2) {
                th = th2;
            }
            C189200o6.m1boximpl(c098200Yq);
        }
        return i3;
    }

    /* JADX INFO: loaded from: classes13.dex */
    public static final class EmptyFragment extends Fragment {
        public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiAvJiI+LTcvLGExKTYpZz83OGs/LC59KiHELIOSktKiQ/ISIkPWEALSQcLT8RJCQvIgM6Ly04CCwnITMlPTZ3DSg8PTYVOiQrJCo9PA==";

        @Override // androidx.fragment.app.Fragment
        public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
            C19GS c19gs = null;
            LinearLayoutCompat linearLayoutCompat = new LinearLayoutCompat(requireContext(), null);
            C786410Ut5.i6(linearLayoutCompat, new ViewGroup.LayoutParams(-1, -1));
            linearLayoutCompat.setGravity(17);
            try {
                ViewTreeLifecycleOwner.set(linearLayoutCompat, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(linearLayoutCompat, this);
                linearLayoutCompat.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity = getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                }
                C1685300txQ.LIZ(c19gs);
                C189200o6.m2constructorimpl(Unit.LIZ);
                return linearLayoutCompat;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return linearLayoutCompat;
            }
        }
    }
}
