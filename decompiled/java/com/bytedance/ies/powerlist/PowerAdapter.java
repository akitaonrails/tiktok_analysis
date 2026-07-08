package com.bytedance.ies.powerlist;

import X.AbstractC1563340qmi;
import X.AbstractC1585810rMx;
import X.AbstractC1906720ziY;
import X.AbstractC19994813Le;
import X.AbstractC20603615jm;
import X.AbstractC20607715kR;
import X.AbstractC21686119tz;
import X.AbstractC329610Cw3;
import X.C01GW;
import X.C08X0;
import X.C09JN;
import X.C0Q9R;
import X.C0SZT;
import X.C1160490gIx;
import X.C11JF;
import X.C11PQ;
import X.C13EQ;
import X.C13LE;
import X.C13LP;
import X.C13LQ;
import X.C13LZ;
import X.C14NM;
import X.C15438062q;
import X.C1558530qex;
import X.C1562000qkY;
import X.C1562010qkZ;
import X.C1564290qoF;
import X.C1565730qqZ;
import X.C1697810uHb;
import X.C1723500ux2;
import X.C1891380zJo;
import X.C1891440zJu;
import X.C19719512Dh;
import X.C19719612Di;
import X.C199Y;
import X.C19EG;
import X.C19FO;
import X.C1AF0;
import X.C20532815Wc;
import X.C20600815jK;
import X.C20602815je;
import X.C20603015jg;
import X.C20603215ji;
import X.C20603315jj;
import X.C20603415jk;
import X.C20603715jn;
import X.C20604615jw;
import X.C20604715jx;
import X.C20604815jy;
import X.C20605015k0;
import X.C20605115k1;
import X.C20605215k2;
import X.C20605415k4;
import X.C20605615k6;
import X.C20605915k9;
import X.C20606115kB;
import X.C20607615kQ;
import X.C20607915kT;
import X.C20608215kW;
import X.C20612085q;
import X.C2081408Dk;
import X.C21685719tv;
import X.C2188811AlT;
import X.C2238831Cjx;
import X.C2238881Ck2;
import X.C2296808zG;
import X.C2344809Gs;
import X.C344380Dem;
import X.C452501pT;
import X.C725170ScV;
import X.C725180ScW;
import X.C786410Ut5;
import X.C946803n0;
import X.C991830buv;
import X.EnumC323450Cm7;
import X.EnumC682280QpW;
import X.EnumC725160ScU;
import X.EnumC995420c0i;
import X.InterfaceC1587906Jp;
import X.InterfaceC1891350zJl;
import X.InterfaceC1891370zJn;
import X.InterfaceC1906710ziX;
import X.InterfaceC20603815jo;
import X.InterfaceC20605515k5;
import X.InterfaceC20605715k7;
import X.InterfaceC20605815k8;
import X.InterfaceC336510DHd;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import Y.ARunnableS12S0102000_31;
import Y.AfS200S0100000_31;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.OnLifecycleEvent;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.powerlist.footer.PowerLoadingCell;
import com.bytedance.ies.powerlist.layout.core.PowerLayoutManager;
import com.bytedance.ies.powerlist.page.PowerPageLoader;
import com.bytedance.ies.powerlist.page.config.OptimizeAbility;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.agilelogger.ALog;
import com.zhiliaoapp.musically.R;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS12S1000100_24;
import kotlin.jvm.internal.AwS432S0200000_31;
import kotlin.jvm.internal.AwS610S0100000_31;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* JADX INFO: loaded from: classes32.dex */
public class PowerAdapter extends AbstractC20603615jm implements InterfaceC20603815jo, InterfaceC1891370zJn, LifecycleOwner, GenericLifecycleObserver {
    public static final List<Object> LLL = new ArrayList();
    public final RecyclerView LL;
    public PowerStub LLILLJJLI;
    public PowerPageLoader<?> LLIZLLLIL;
    public Fragment LLJILJIL;
    public final C01GW LLJJI;
    public final C01GW LLJJIII;
    public final C11PQ<C20603715jn> LLJJIJI;
    public final C1891380zJo LLJJIJIIJIL;
    public int LLJJIJIL;
    public C20603715jn LLJJJ;
    public EnumC995420c0i LLJJJIL;
    public Class<? extends PowerLoadingCell> LLJJJJ;
    public final Map<C20605615k6, PowerStub> LLJJJJJIL;
    public final List<InterfaceC1891350zJl> LLJJJJLIIL;
    public final List<Integer> LLJJL;
    public final Field LLJJLIIIJLLLLLLLZ;
    public final Map<Class<?>, List<PowerCell<?>>> LLJL;
    public final List<PowerCell<?>> LLJLIL;
    public LifecycleOwner LLJLILLLLZIIL;
    public boolean LLJLL;
    public final LifecycleEventObserver LLJLLIL;
    public final LifecycleRegistry LLJLLL;
    public boolean LLJZ;
    public final C01GW LLJZIJLIL;
    public final List<PowerStub> LLILLL = new ArrayList();
    public boolean LLILZ = true;
    public final Map<Integer, Class<? extends PowerCell<?>>> LLILZIL = new HashMap();
    public final Map<Type, Integer> LLILZLL = new HashMap();
    public final Map<PowerStub, Integer> LLIZ = new HashMap();
    public final C01GW LLJ = C452501pT.LIZIZ(new C20603315jj(this));
    public final C20605115k1 LLJI = new C20605115k1(null);
    public final C01GW LLJIJIL = C452501pT.LIZIZ(new C725170ScV(this));
    public final C01GW LLJILJILJ = C452501pT.LIZIZ(new C20603215ji(this));
    public final C01GW LLJILLL = C452501pT.LIZIZ(new C725180ScW());
    public final C01GW LLJJ = C452501pT.LIZIZ(new C20602815je());

    @Override // X.AbstractC20603615jm
    public final void LLLII() {
        this.LLJLL = false;
        if (C20606115kB.LIZJ) {
            this.LL.removeOnScrollListener((AbstractC1585810rMx) this.LLJ.getValue());
        } else {
            LLLLJ().getLifecycle().removeObserver(this);
        }
        Iterator it2 = ((ArrayList) LLLLLJIL()).iterator();
        while (it2.hasNext()) {
            ((PowerStub) it2.next()).LJII();
        }
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            onLifecycleOwnerDestroy();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    private final void onLifecycleOwnerDestroy() {
        this.LLJLLL.handleLifecycleEvent(Lifecycle.Event.ON_DESTROY);
    }

    @Override // X.InterfaceC20603815jo
    public final C20603715jn LLILZLL() {
        C20603715jn c20603715jnLJLZ = this.LLJJIJI.LJLZ();
        return c20603715jnLJLZ == null ? C20603715jn.LJJ : c20603715jnLJLZ;
    }

    @Override // X.AbstractC20603615jm
    public final void LLLI() {
        if (this.LLJLL) {
            return;
        }
        this.LLJLL = true;
        if (C20606115kB.LIZJ) {
            this.LL.addOnScrollListener((AbstractC1585810rMx) this.LLJ.getValue());
            if (!this.LLJZ) {
                LLLLIIIILLL(LLLLJ());
            }
            Iterator it2 = ((ArrayList) LLLLLJIL()).iterator();
            while (it2.hasNext()) {
                ((PowerStub) it2.next()).LJIILL(LLLLJ());
            }
            return;
        }
        LLLLIIIILLL(LLLLJ());
        Iterator it3 = ((ArrayList) LLLLLJIL()).iterator();
        while (it3.hasNext()) {
            ((PowerStub) it3.next()).LJIILL(LLLLJ());
        }
        if (getLifecycle().getCurrentState().compareTo(Lifecycle.State.CREATED) < 0) {
            this.LLJLLL.handleLifecycleEvent(Lifecycle.Event.ON_CREATE);
        }
    }

    @Override // X.AbstractC20603615jm
    public final C20600815jK<InterfaceC1891350zJl> LLLIILIL() {
        if (this.LLILZ) {
            return (C20600815jK) LLLLJI().LLJI.getValue();
        }
        return null;
    }

    public final int LLLLIILLL() {
        RecyclerView.LayoutManager layoutManager = this.LL.getLayoutManager();
        if (layoutManager instanceof GridLayoutManager) {
            return ((LinearLayoutManager) layoutManager).findFirstVisibleItemPosition();
        }
        if (layoutManager instanceof LinearLayoutManager) {
            return ((LinearLayoutManager) layoutManager).findFirstVisibleItemPosition();
        }
        return -1;
    }

    public final int LLLLIL() {
        RecyclerView.LayoutManager layoutManager = this.LL.getLayoutManager();
        if (layoutManager instanceof GridLayoutManager) {
            return ((LinearLayoutManager) layoutManager).findLastVisibleItemPosition();
        }
        if (layoutManager instanceof LinearLayoutManager) {
            return ((LinearLayoutManager) layoutManager).findLastVisibleItemPosition();
        }
        return -1;
    }

    public final List<InterfaceC1891350zJl> LLLLILI() {
        ArrayList arrayList = new ArrayList();
        Iterator<PowerStub> it2 = LLLLLJIL().iterator();
        while (it2.hasNext()) {
            arrayList.addAll(it2.next().LLJJIJI);
        }
        if (this.LLJJJJ != null) {
            AbstractC20607715kR abstractC20607715kR = this.LLJI.LLILLL.LIZIZ;
            if (abstractC20607715kR.LIZIZ == EnumC323450Cm7.Refresh ? abstractC20607715kR instanceof C20607915kT : !(abstractC20607715kR instanceof C20608215kW)) {
                arrayList.add(this.LLJI);
            }
        }
        return arrayList;
    }

    public final LifecycleOwner LLLLJ() {
        LifecycleOwner lifecycleOwner = this.LLJLILLLLZIIL;
        if (lifecycleOwner != null) {
            return lifecycleOwner;
        }
        Fragment fragment = this.LLJILJIL;
        if (fragment != null) {
            return fragment;
        }
        Fragment fragmentLIZ = C946803n0.LIZ(this.LL);
        this.LLJILJIL = fragmentLIZ;
        if (fragmentLIZ != null) {
            return fragmentLIZ;
        }
        C19FO c19fo = (C19FO) this.LLJILJILJ.getValue();
        if (c19fo != null) {
            return c19fo;
        }
        if (this.LL.isInEditMode()) {
            return new LifecycleOwner() { // from class: X.14fV
                public static final LifecycleRegistry LLILLJJLI = new LifecycleRegistry(;

                @Override // androidx.lifecycle.LifecycleOwner
                public final Lifecycle getLifecycle() {
                    return LLILLJJLI;
                }
            };
        }
        throw new RuntimeException("Can not find lifecycleOwner !");
    }

    public final PowerStub LLLLJI() {
        PowerStub powerStub = this.LLILLJJLI;
        if (powerStub != null) {
            return powerStub;
        }
        return null;
    }

    public final C1558530qex LLLLLJLJLL() {
        return (C1558530qex) this.LLJJIII.getValue();
    }

    public final List<Integer> LLLLLL() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (PowerStub powerStub : (ArrayList) C13LP.LJLIL(this.LLILLL, Collections.singletonList(LLLLJI()))) {
            Iterator it2 = ((HashMap) powerStub.LLJ).entrySet().iterator();
            while (it2.hasNext()) {
                int iIntValue = ((Number) ((Map.Entry) it2.next()).getValue()).intValue();
                Integer num = (Integer) ((HashMap) this.LLIZ).get(powerStub);
                linkedHashSet.add(Integer.valueOf(iIntValue + (num != null ? num.intValue() : 0)));
            }
        }
        return C13LP.LLIIII(linkedHashSet);
    }

    public final void LLLLLLLLLL() {
        RecyclerView recyclerView = this.LL;
        if (!(recyclerView instanceof ViewOnAttachStateChangeListenerC20604515jv) || ((ViewOnAttachStateChangeListenerC20604515jv) recyclerView).getLayoutHandlerRegistry() == null) {
            return;
        }
        C1160490gIx layoutHandlerRegistry = ((ViewOnAttachStateChangeListenerC20604515jv) this.LL).getLayoutHandlerRegistry();
        if (!((ArrayList) layoutHandlerRegistry.LIZJ).isEmpty()) {
            return;
        }
        ((ArrayList) layoutHandlerRegistry.LIZLLL).clear();
        ArrayList arrayList = new ArrayList();
        for (PowerStub powerStub : (ArrayList) C13LP.LJLIL(this.LLILLL, Collections.singletonList(LLLLJI()))) {
            AbstractC1906720ziY abstractC1906720ziY = powerStub.LLILLJJLI;
            int iLJIIIIZZ = ((C20600815jK) powerStub.LLJI.getValue()).LJIIIIZZ();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Processing chunk: ");
            sbLIZ.append(abstractC1906720ziY.getClass().getSimpleName());
            sbLIZ.append(", size: ");
            sbLIZ.append(iLJIIIIZZ);
            C2188811AlT.LIZIZ(sbLIZ);
            if (iLJIIIIZZ > 0) {
                List<AbstractC21686119tz> listLLIIII = C13LP.LLIIII(abstractC1906720ziY.LLIZ);
                if (!listLLIIII.isEmpty()) {
                    for (AbstractC21686119tz abstractC21686119tz : listLLIIII) {
                        if (iLJIIIIZZ > 0) {
                            int iMin = Math.min(abstractC21686119tz.LJI(), iLJIIIIZZ);
                            abstractC21686119tz.LJIILL(iMin);
                            arrayList.add(abstractC21686119tz);
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("Added handler: ");
                            sbLIZ2.append(abstractC21686119tz.getClass().getSimpleName());
                            sbLIZ2.append(", items: ");
                            sbLIZ2.append(iMin);
                            C2188811AlT.LIZIZ(sbLIZ2);
                            iLJIIIIZZ -= iMin;
                        }
                    }
                }
            }
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("Updating with ");
        sbLIZ3.append(arrayList.size());
        sbLIZ3.append(" chunk handlers");
        C2188811AlT.LIZIZ(sbLIZ3);
        ((ArrayList) layoutHandlerRegistry.LIZLLL).clear();
        ((ArrayList) layoutHandlerRegistry.LIZLLL).addAll(arrayList);
        PowerLayoutManager powerLayoutManager = layoutHandlerRegistry.LIZIZ;
        if (powerLayoutManager != null) {
            powerLayoutManager.LJJII(layoutHandlerRegistry.LIZLLL);
        }
        if (arrayList.isEmpty()) {
            return;
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            it2.next().getClass();
            if (!(!(r0 instanceof C21685719tv))) {
                layoutHandlerRegistry.LIZ.setItemAnimator(null);
                return;
            }
        }
    }

    @Override // X.InterfaceC20603815jo
    public final Context getContext() {
        return this.LL.getContext();
    }

    @Override // X.InterfaceC20603815jo
    public final C19EG getCurrentActivity() {
        return (C19EG) this.LLJILJILJ.getValue();
    }

    @Override // X.InterfaceC20603815jo
    public final Fragment getCurrentFragment() {
        Fragment fragment = this.LLJILJIL;
        if (fragment != null) {
            return fragment;
        }
        Fragment fragmentLIZ = C946803n0.LIZ(this.LL);
        this.LLJILJIL = fragmentLIZ;
        return fragmentLIZ;
    }

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        C20603715jn c20603715jn = this.LLJJJ;
        return (c20603715jn == null || !c20603715jn.LJ) ? ((ArrayList) LLLLILI()).size() : this.LLJJIJIIJIL.LJII.size();
    }

    @Override // X.InterfaceC20603815jo
    public final void preload() {
        C344380Dem c344380Dem = ((C1564290qoF) this.LLJZIJLIL.getValue()).LJFF;
        if (c344380Dem != null) {
            c344380Dem.LJJIL();
        }
    }

    public final List<PowerStub> LLLLLJIL() {
        return C13LP.LJLIL(this.LLILLL, Collections.singletonList(LLLLJI()));
    }

    @Override // X.InterfaceC20603815jo
    public final LifecycleOwner getLifecycleOwner() {
        return LLLLJ();
    }

    @Override // X.AbstractC20603615jm
    public final List<InterfaceC1891350zJl> LLLIIIIL() {
        return this.LLJJJJLIIL;
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        return this.LLJLLL;
    }

    public PowerAdapter(RecyclerView recyclerView) {
        this.LL = recyclerView;
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(new C20532815Wc());
        this.LLJJI = c01gwLIZIZ;
        this.LLJJIII = C452501pT.LIZIZ(new C20603015jg(this));
        C11PQ<C20603715jn> c11pqLJLLLLLL = C11PQ.LJLLLLLL(new C20603715jn());
        this.LLJJIJI = c11pqLJLLLLLL;
        this.LLJJIJIIJIL = new C1891380zJo(recyclerView, this, (CopyOnWriteArrayList) c01gwLIZIZ.getValue(), LLLLLJLJLL(), c11pqLJLLLLLL, new C20603415jk(this));
        this.LLJJIJIL = 30000;
        this.LLJJJIL = EnumC995420c0i.Default;
        this.LLJJJJJIL = new ConcurrentHashMap();
        this.LLJJJJLIIL = new ArrayList();
        this.LLJJL = new ArrayList();
        this.LLJL = new LinkedHashMap();
        this.LLJLIL = new ArrayList();
        this.LLJLLIL = new LifecycleEventObserver() { // from class: com.bytedance.ies.powerlist.PowerAdapter$lifecycleEventObserver$1
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                if (event == Lifecycle.Event.ON_DESTROY) {
                    PowerAdapter powerAdapter = this.LL;
                    C11JF c11jf = ((C1564290qoF) powerAdapter.LLJZIJLIL.getValue()).LJI;
                    if (c11jf != null) {
                        c11jf.dispose();
                    }
                    PowerPageLoader<?> powerPageLoader = powerAdapter.LLIZLLLIL;
                    if (powerPageLoader != null) {
                        powerPageLoader.onDestroy();
                    }
                }
            }
        };
        this.LLJLLL = new LifecycleRegistry(this);
        this.LLJZIJLIL = C452501pT.LIZIZ(new C20605215k2(this));
        try {
            Field declaredField = RecyclerView.ViewHolder.class.getDeclaredField("itemView");
            if (declaredField != null) {
                this.LLJJLIIIJLLLLLLLZ = declaredField;
                declaredField.setAccessible(true);
            }
        } catch (NoSuchFieldException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        LLLFZ(this.LLJI);
        LLLL(null, new AbstractC1906720ziY() { // from class: X.15k9
        });
        final C1564290qoF c1564290qoF = (C1564290qoF) this.LLJZIJLIL.getValue();
        final C1558530qex c1558530qexLLLLLJLJLL = LLLLLJLJLL();
        c1564290qoF.getClass();
        if (!C20606115kB.LIZJ) {
            final C08X0 c08x0 = new C08X0(c1564290qoF);
            if (Looper.getMainLooper().getThread() == C786410Ut5.u3()) {
                c08x0.invoke();
            } else {
                C786410Ut5.LJJZZIII((Handler) c1564290qoF.LJII.getValue(), new Runnable() { // from class: X.07yu
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("Optimizer@a015.init$1");
                        try {
                            c08x0.invoke();
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("Optimizer@a015.init$1");
                    }
                });
            }
        }
        c1564290qoF.LIZ.getContext();
        c1564290qoF.LJI = (C11JF) c1564290qoF.LIZIZ.LJJLJLI(new C09JN() { // from class: X.0qns
            @Override // X.C09JN
            public final void accept(Object obj) {
                C308940C9c c308940C9c;
                Function1<C1564080qnu, Unit> function1;
                C1C7U.LIZ("Optimizer@a015.init$2");
                C20603715jn c20603715jn = (C20603715jn) obj;
                C1563030qmD c1563030qmD = new C1563030qmD(c20603715jn, c1564290qoF.LIZ, c1558530qexLLLLLJLJLL);
                C1564290qoF c1564290qoF2 = c1564290qoF;
                C1563030qmD c1563030qmD2 = c1564290qoF2.LJ;
                if (c1563030qmD2 != null) {
                    if (c1563030qmD2.LLILZIL) {
                        c1563030qmD2.LLILZIL = false;
                        InterfaceC1563050qmF interfaceC1563050qmF = (InterfaceC1563050qmF) c1563030qmD2.LLILZ.getValue();
                        if (interfaceC1563050qmF != null) {
                            interfaceC1563050qmF.stop();
                        }
                    }
                    c1563030qmD2.LLILLJJLI.removeOnScrollListener(c1563030qmD2);
                }
                c1564290qoF2.LJ = c1563030qmD;
                String strLJJIJIIJIL = c1563030qmD.LJJIJIIJIL();
                if (strLJJIJIIJIL != null && strLJJIJIIJIL.length() > 0 && (c308940C9c = C1564070qnt.LIZ) != null && (function1 = c308940C9c.LIZ) != null) {
                    function1.invoke(new C1564080qnu(c1563030qmD.LLILLJJLI, strLJJIJIIJIL));
                }
                c1563030qmD.LLILLJJLI.addOnScrollListener(c1563030qmD);
                InterfaceC1563050qmF interfaceC1563050qmF2 = (InterfaceC1563050qmF) c1563030qmD.LLILZ.getValue();
                if (interfaceC1563050qmF2 != null) {
                    interfaceC1563050qmF2.LIZ(c1563030qmD);
                }
                InterfaceC1563050qmF interfaceC1563050qmF3 = (InterfaceC1563050qmF) c1563030qmD.LLILZ.getValue();
                if (interfaceC1563050qmF3 != null) {
                    interfaceC1563050qmF3.LIZIZ(c1563030qmD);
                }
                OptimizeAbility optimizeAbility = c20603715jn.LJIIIIZZ;
                if (optimizeAbility != null && optimizeAbility.enable) {
                    C1564290qoF c1564290qoF3 = c1564290qoF;
                    C344380Dem c344380Dem = new C344380Dem(optimizeAbility, c1564290qoF3.LIZ, c1564290qoF3.LIZLLL);
                    C344380Dem c344380Dem2 = c1564290qoF3.LJFF;
                    if (c344380Dem2 != null) {
                        c344380Dem2.LLILLL.clear();
                        c344380Dem2.LLILZ.LIZIZ(null);
                        c344380Dem2.LLILLJJLI.removeOnScrollListener(c344380Dem2);
                        c344380Dem2.LLILLJJLI.setViewCacheExtension(null);
                    }
                    c1564290qoF3.LJFF = c344380Dem;
                    c344380Dem.LJJIL();
                    c344380Dem.LLILLJJLI.addOnScrollListener(c344380Dem);
                    RecyclerView recyclerView2 = c344380Dem.LLILLJJLI;
                    recyclerView2.setViewCacheExtension(new AbstractC1343480l46(c344380Dem.LLILLL, recyclerView2) { // from class: X.0DUX
                        public final ConcurrentHashMap<Integer, CopyOnWriteArrayList<RecyclerView.ViewHolder>> LIZ;
                        public final RecyclerView LIZIZ;

                        {
                            this.LIZ = concurrentHashMap;
                            this.LIZIZ = recyclerView2;
                        }

                        @Override // X.AbstractC1343480l46
                        public final View LIZ(int i, int i2) {
                            RecyclerView.ViewHolder next;
                            CopyOnWriteArrayList<RecyclerView.ViewHolder> copyOnWriteArrayList = this.LIZ.get(Integer.valueOf(i2));
                            if (copyOnWriteArrayList != null && !copyOnWriteArrayList.isEmpty()) {
                                next = copyOnWriteArrayList.iterator().next();
                                copyOnWriteArrayList.remove(next);
                            } else {
                                next = null;
                            }
                            if (next != null && next.getItemViewType() == i2) {
                                View view = next.itemView;
                                try {
                                    if (this.LIZIZ.getChildViewHolder(view) != null) {
                                        return view;
                                    }
                                    C189200o6.m2constructorimpl(Unit.LIZ);
                                    return null;
                                } catch (Throwable th) {
                                    TryCatchGuardChecker.doCheck(th);
                                    C189200o6.m2constructorimpl(new C098200Yq(th));
                                }
                            }
                            return null;
                        }
                    });
                }
                C1C7U.LIZIZ("Optimizer@a015.init$2");
            }
        });
    }

    public static void LLLLLLIL(PowerAdapter powerAdapter) {
        C1891440zJu c1891440zJu = new C1891440zJu(false, false, false, (List) null, 31);
        C20603715jn c20603715jn = powerAdapter.LLJJJ;
        if (c20603715jn != null && c20603715jn.LJIILL) {
            C991830buv.LIZ(powerAdapter.LL, new AwS432S0200000_31(c1891440zJu, powerAdapter, 36));
        } else {
            powerAdapter.LLLLLLLLL(new C20604615jw(c1891440zJu, powerAdapter));
        }
    }

    @Override // X.InterfaceC20603815jo
    public final int LLIL(InterfaceC1906710ziX interfaceC1906710ziX) {
        boolean z;
        int iIntValue;
        int iIntValue2;
        int i;
        int iIntValue3;
        if (this.LL.getLayoutManager() == null) {
            return -1;
        }
        Integer numValueOf = Integer.valueOf(LLLLIILLL());
        if (numValueOf.intValue() >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            iIntValue = numValueOf.intValue();
        } else {
            iIntValue = -1;
        }
        Integer numValueOf2 = Integer.valueOf(LLLLIL());
        if (numValueOf2.intValue() >= 0) {
            iIntValue2 = numValueOf2.intValue();
        } else {
            iIntValue2 = -1;
        }
        Map<C20605615k6, PowerStub> map = this.LLJJJJJIL;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : ((ConcurrentHashMap) map).entrySet()) {
            if (Intrinsics.LJFF(entry.getValue(), interfaceC1906710ziX)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        C20605615k6 c20605615k6 = (C20605615k6) C13LP.LJJJLIIL(linkedHashMap.keySet());
        if (c20605615k6 != null) {
            Integer num = (Integer) C13LP.LJJLIIIJJIZ(C13EQ.LJJIJLIJ(C13LP.LJJL(new IntRange(iIntValue, iIntValue2), C13LZ.LJIILJJIL(c20605615k6.LIZ, c20605615k6.LIZIZ))));
            if (num != null) {
                iIntValue3 = num.intValue();
            } else {
                iIntValue3 = Integer.MIN_VALUE;
            }
            i = iIntValue3 - c20605615k6.LIZ;
        } else {
            i = -1;
        }
        Integer numValueOf3 = Integer.valueOf(i);
        if (numValueOf3.intValue() < 0) {
            return -1;
        }
        return numValueOf3.intValue();
    }

    @Override // X.InterfaceC20603815jo
    public final int LLIZ(InterfaceC1906710ziX interfaceC1906710ziX) {
        boolean z;
        int iIntValue;
        int iIntValue2;
        int i;
        int iIntValue3;
        if (this.LL.getLayoutManager() == null) {
            return -1;
        }
        Integer numValueOf = Integer.valueOf(LLLLIILLL());
        if (numValueOf.intValue() >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            iIntValue = numValueOf.intValue();
        } else {
            iIntValue = -1;
        }
        Integer numValueOf2 = Integer.valueOf(LLLLIL());
        if (numValueOf2.intValue() >= 0) {
            iIntValue2 = numValueOf2.intValue();
        } else {
            iIntValue2 = -1;
        }
        Map<C20605615k6, PowerStub> map = this.LLJJJJJIL;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : ((ConcurrentHashMap) map).entrySet()) {
            if (Intrinsics.LJFF(entry.getValue(), interfaceC1906710ziX)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        C20605615k6 c20605615k6 = (C20605615k6) C13LP.LJJJLIIL(linkedHashMap.keySet());
        if (c20605615k6 != null) {
            Integer num = (Integer) C13LP.LJJJLIIL(C13EQ.LJJIJLIJ(C13LP.LJJL(new IntRange(iIntValue, iIntValue2), C13LZ.LJIILJJIL(c20605615k6.LIZ, c20605615k6.LIZIZ))));
            if (num != null) {
                iIntValue3 = num.intValue();
            } else {
                iIntValue3 = Integer.MIN_VALUE;
            }
            i = iIntValue3 - c20605615k6.LIZ;
        } else {
            i = -1;
        }
        Integer numValueOf3 = Integer.valueOf(i);
        if (numValueOf3.intValue() < 0) {
            return -1;
        }
        return numValueOf3.intValue();
    }

    @Override // X.AbstractC20603615jm
    public final void LLLFZ(InterfaceC20605815k8 interfaceC20605815k8) {
        ((CopyOnWriteArrayList) this.LLJJ.getValue()).add(interfaceC20605815k8);
    }

    @Override // X.AbstractC20603615jm
    public final void LLLILZ(Class<? extends PowerCell<?>>... clsArr) {
        PowerStub powerStubLLLLJI = LLLLJI();
        if (powerStubLLLLJI != null) {
            powerStubLLLLJI.LIZIZ(this.LL, C13LQ.LJJLL(clsArr));
        }
    }

    @Override // X.AbstractC20603615jm
    public final void LLLILZLLLI(C1723500ux2... c1723500ux2Arr) {
        PowerStub powerStubLLLLJI = LLLLJI();
        if (powerStubLLLLJI != null) {
            List<C1723500ux2> listLJJLL = C13LQ.LJJLL(c1723500ux2Arr);
            HashMap map = new HashMap();
            HashMap map2 = new HashMap();
            for (C1723500ux2 c1723500ux2 : listLJJLL) {
                int i = c1723500ux2.LL;
                map2.put(Integer.valueOf(i), c1723500ux2.LLILLJJLI);
                map.put(c1723500ux2, Integer.valueOf(i));
            }
            ((HashMap) powerStubLLLLJI.LLJ).putAll(map);
            ((HashMap) powerStubLLLLJI.LLIZLLLIL).putAll(map2);
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLJJLL, 10));
            Iterator it2 = listLJJLL.iterator();
            while (it2.hasNext()) {
                arrayList.add(((C1723500ux2) it2.next()).LLILLJJLI);
            }
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                powerStubLLLLJI.LJIIZILJ((Class) it3.next());
            }
            powerStubLLLLJI.LL.preload();
        }
    }

    @Override // X.AbstractC20603615jm
    public final void LLLJ(C0Q9R c0q9r) {
        ((CopyOnWriteArrayList) this.LLJJI.getValue()).add(c0q9r);
        registerAdapterDataObserver(c0q9r);
    }

    @Override // X.AbstractC20603615jm
    public final void LLLJL(LifecycleOwner lifecycleOwner) {
        Lifecycle lifecycle;
        Lifecycle lifecycle2;
        LifecycleOwner lifecycleOwnerLLLLJ = LLLLJ();
        this.LLJLILLLLZIIL = lifecycleOwner;
        if (C20606115kB.LIZJ) {
            if (!Intrinsics.LJFF(LLLLJ(), lifecycleOwnerLLLLJ)) {
                if (this.LLJZ) {
                    lifecycleOwnerLLLLJ.getLifecycle().removeObserver(this.LLJLLIL);
                }
                LLLLIIIILLL(LLLLJ());
                for (PowerStub powerStub : (ArrayList) LLLLLJIL()) {
                    LifecycleOwner lifecycleOwnerLLLLJ2 = LLLLJ();
                    LifecycleOwner lifecycleOwner2 = powerStub.LLJJI;
                    if (lifecycleOwner2 != null && (lifecycle2 = lifecycleOwner2.getLifecycle()) != null) {
                        lifecycle2.removeObserver(powerStub);
                    }
                    lifecycleOwnerLLLLJ2.getLifecycle().addObserver(powerStub);
                }
                return;
            }
            return;
        }
        if (this.LLJLL && !Intrinsics.LJFF(LLLLJ(), lifecycleOwnerLLLLJ)) {
            Lifecycle lifecycle3 = lifecycleOwnerLLLLJ.getLifecycle();
            if (lifecycle3 != null) {
                lifecycle3.removeObserver(this);
            }
            LLLLIIIILLL(LLLLJ());
            for (PowerStub powerStub2 : (ArrayList) LLLLLJIL()) {
                LifecycleOwner lifecycleOwnerLLLLJ3 = LLLLJ();
                LifecycleOwner lifecycleOwner3 = powerStub2.LLJJI;
                if (lifecycleOwner3 != null && (lifecycle = lifecycleOwner3.getLifecycle()) != null) {
                    lifecycle.removeObserver(powerStub2);
                }
                lifecycleOwnerLLLLJ3.getLifecycle().addObserver(powerStub2);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LLLLIIIILLL(LifecycleOwner lifecycleOwner) {
        Context context;
        Integer numLIZ;
        if (lifecycleOwner instanceof C199Y) {
            AbstractC1563340qmi abstractC1563340qmi = (AbstractC1563340qmi) lifecycleOwner.getLifecycle();
            EnumC682280QpW enumC682280QpW = EnumC682280QpW.ADD_OBSERVER;
            if (abstractC1563340qmi.LJI(enumC682280QpW) && (numLIZ = C1565730qqZ.LIZ(enumC682280QpW.getValue(), (context = (Context) lifecycleOwner))) != null) {
                if (C20606115kB.LIZJ) {
                    lifecycleOwner.getLifecycle().addObserver(this.LLJLLIL);
                    this.LLJZ = true;
                } else {
                    lifecycleOwner.getLifecycle().addObserver(this);
                }
                C1565730qqZ.LIZIZ(numLIZ.intValue(), context);
                return;
            }
        }
        if (C20606115kB.LIZJ) {
            lifecycleOwner.getLifecycle().addObserver(this.LLJLLIL);
            this.LLJZ = true;
        } else {
            lifecycleOwner.getLifecycle().addObserver(this);
        }
    }

    public final void LLLLIILL(int i) {
        PowerStub powerStub;
        if (this.LLIZLLLIL != null && (powerStub = (PowerStub) C13LP.LJJLIIIJL(LLLLLJIL())) != null) {
            int iLIZJ = powerStub.LIZJ();
            int size = powerStub.LLJILLL.size();
            PowerPageLoader<?> powerPageLoader = this.LLIZLLLIL;
            if (powerPageLoader != null) {
                C786410Ut5.LJJZZIII((Handler) powerPageLoader.LLJI.getValue(), new ARunnableS12S0102000_31(powerPageLoader, i - iLIZJ, (getItemCount() - iLIZJ) - size, 0));
            }
        }
    }

    public final PowerStub LLLLLIL(int i) {
        for (Map.Entry entry : ((ConcurrentHashMap) this.LLJJJJJIL).entrySet()) {
            if (((C20605615k6) entry.getKey()).LIZ <= i && i < ((C20605615k6) entry.getKey()).LIZIZ) {
                return (PowerStub) entry.getValue();
            }
        }
        return null;
    }

    public final synchronized void LLLLLLLLL(InterfaceC20605515k5 interfaceC20605515k5) {
        Iterator it2 = ((ArrayList) LLLLLJIL()).iterator();
        while (it2.hasNext()) {
            ((PowerStub) it2.next()).LJIJI();
        }
        List<InterfaceC1891350zJl> listLLLLILI = LLLLILI();
        interfaceC20605515k5.LIZ(listLLLLILI);
        ((ArrayList) this.LLJJJJLIIL).clear();
        ((ArrayList) this.LLJJJJLIIL).addAll(listLLLLILI);
        ((ArrayList) this.LLJJL).clear();
        int size = ((ArrayList) this.LLJJJJLIIL).size();
        for (int i = 0; i < size; i++) {
            if (ListProtector.get(this.LLJJJJLIIL, i) != null) {
                ((ArrayList) this.LLJJL).add(Integer.valueOf(ListProtector.get(this.LLJJJJLIIL, i).hashCode()));
            } else {
                ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogE("powerList_lastExtendItems", "add random hashcode");
                ((ArrayList) this.LLJJL).add(Integer.valueOf(AbstractC19994813Le.Default.nextInt(0, Integer.MAX_VALUE)));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC21673619ry
    public final int getItemViewType(int i) {
        List listLLLLILI;
        Object objLJJJLIIL;
        Map<Type, Integer> map;
        Set setKeySet;
        C14NM c14nm;
        Integer numLLLLL;
        Integer numLLLLL2;
        C20603715jn c20603715jn = this.LLJJJ;
        if (c20603715jn != null && c20603715jn.LJ) {
            listLLLLILI = this.LLJJIJIIJIL.LJII;
        } else {
            listLLLLILI = LLLLILI();
        }
        InterfaceC1891350zJl interfaceC1891350zJl = (InterfaceC1891350zJl) ListProtector.get(listLLLLILI, i);
        Object objValueOf = null;
        try {
            Class<?> cls = interfaceC1891350zJl.getClass();
            PowerStub powerStubLLLLLIL = LLLLLIL(i);
            if (powerStubLLLLLIL != null && (numLLLLL2 = LLLLL(powerStubLLLLLIL, cls, interfaceC1891350zJl)) != null && numLLLLL2.intValue() != -1) {
                return numLLLLL2.intValue();
            }
            PowerStub powerStubLLLLJI = LLLLJI();
            if (powerStubLLLLJI != null && (numLLLLL = LLLLL(powerStubLLLLJI, cls, interfaceC1891350zJl)) != null && numLLLLL.intValue() != -1) {
                return numLLLLL.intValue();
            }
            Integer num = (Integer) ((HashMap) this.LLILZLL).get(cls);
            if (num != null) {
                return num.intValue();
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("not registerCells for: ");
            sbLIZ.append(interfaceC1891350zJl.getClass());
            sbLIZ.append(", dynamicItemType : ");
            if ((interfaceC1891350zJl instanceof C14NM) && (c14nm = (C14NM) interfaceC1891350zJl) != null) {
                objValueOf = Integer.valueOf(c14nm.getContentType());
            }
            sbLIZ.append(objValueOf);
            sbLIZ.append(", ");
            throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ));
        } catch (NullPointerException e) {
            TryCatchGuardChecker.doCheck(e);
            PowerStub powerStub = (PowerStub) C13LP.LJJJLL(LLLLLJIL());
            if (powerStub != null && (map = powerStub.LLJ) != null && (setKeySet = ((HashMap) map).keySet()) != null) {
                objLJJJLIIL = C13LP.LJJJLIIL(setKeySet);
            } else {
                objLJJJLIIL = null;
            }
            InterfaceC20605715k7 interfaceC20605715k7 = C20605015k0.LJFF;
            if (interfaceC20605715k7 != null) {
                StringBuilder sb = new StringBuilder("getItemViewType crash, asyncDiff: ");
                C20603715jn c20603715jn2 = this.LLJJJ;
                if (c20603715jn2 != null) {
                    objValueOf = Boolean.valueOf(c20603715jn2.LJ);
                }
                sb.append(objValueOf);
                sb.append(", firstItemType: ");
                sb.append(objLJJJLIIL);
                sb.append(" position: ");
                sb.append(i);
                sb.append(", total size: ");
                sb.append(listLLLLILI.size());
                sb.append(", chunk: ");
                List<PowerStub> list = this.LLILLL;
                ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
                Iterator it2 = ((ArrayList) list).iterator();
                while (it2.hasNext()) {
                    arrayList.add(((PowerStub) it2.next()).LLILLJJLI);
                }
                sb.append(arrayList);
                sb.append(", chunkSize: ");
                List<PowerStub> list2 = this.LLILLL;
                ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list2, 10));
                Iterator it3 = ((ArrayList) list2).iterator();
                while (it3.hasNext()) {
                    arrayList2.add(Integer.valueOf(((ArrayList) ((PowerStub) it3.next()).LLJJIJI).size()));
                }
                sb.append(arrayList2);
                interfaceC20605715k7.log(sb.toString());
            }
            throw e;
        }
    }

    @Override // X.AbstractC21673619ry
    public final void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        PowerCell powerCell = (PowerCell) viewHolder;
        super.onViewAttachedToWindow(powerCell);
        powerCell.onViewAttachedToWindow();
        if (!C20606115kB.LIZJ) {
            this.LL.addOnScrollListener((AbstractC1585810rMx) this.LLJ.getValue());
        }
    }

    @Override // X.AbstractC21673619ry
    public final void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
        PowerCell powerCell = (PowerCell) viewHolder;
        super.onViewDetachedFromWindow(powerCell);
        powerCell.onViewDetachedFromWindow();
        if (!C20606115kB.LIZJ) {
            this.LL.removeOnScrollListener((AbstractC1585810rMx) this.LLJ.getValue());
        }
    }

    @Override // X.AbstractC21673619ry
    public final void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
        PowerCell powerCell = (PowerCell) viewHolder;
        super.onViewRecycled(powerCell);
        if (C20606115kB.LIZ) {
            powerCell.unBindViewHolder$powerlist_release();
        } else {
            powerCell.unBind();
        }
        C20603715jn c20603715jn = this.LLJJJ;
        if (c20603715jn != null && c20603715jn.LJIJI) {
            powerCell.detachFromHost$powerlist_release();
            powerCell.itemView.setTag(R.id.en4, null);
        }
    }

    @Override // X.InterfaceC1891370zJn
    public final void LJZL(int i, int i2) throws Exception {
        try {
            notifyItemRangeInserted(i, i2);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            Iterator it2 = ((ArrayList) C13LP.LJLIL(this.LLILLL, Collections.singletonList(LLLLJI()))).iterator();
            while (it2.hasNext()) {
                Iterator it3 = ((HashMap) ((PowerStub) it2.next()).LLIZLLLIL).entrySet().iterator();
                while (it3.hasNext()) {
                    ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogE("powerList_stub_itemCell", String.valueOf(((Map.Entry) it3.next()).getValue()));
                }
            }
            throw e;
        }
    }

    @Override // X.InterfaceC1891370zJn
    public final void LLI(int i, int i2) {
        notifyItemMoved(i, i2);
    }

    @Override // X.InterfaceC1891370zJn
    public final void LLIZLLLIL(int i, int i2) throws Exception {
        try {
            notifyItemRangeRemoved(i, i2);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            Iterator it2 = ((ArrayList) C13LP.LJLIL(this.LLILLL, Collections.singletonList(LLLLJI()))).iterator();
            while (it2.hasNext()) {
                Iterator it3 = ((HashMap) ((PowerStub) it2.next()).LLIZLLLIL).entrySet().iterator();
                while (it3.hasNext()) {
                    ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogE("powerList_stub_itemCell", String.valueOf(((Map.Entry) it3.next()).getValue()));
                }
            }
            throw e;
        }
    }

    @Override // X.AbstractC20603615jm
    public final void LLLJIL(C20603715jn c20603715jn, EnumC995420c0i enumC995420c0i) {
        if (enumC995420c0i.ordinal() >= this.LLJJJIL.ordinal()) {
            this.LLJJJIL = enumC995420c0i;
            this.LLJJJ = c20603715jn;
            if (c20603715jn.LIZLLL != null) {
                int i = this.LLJJIJIL;
                this.LLJJIJIL = i + 1;
                this.LLILZLL.put(C20605115k1.class, Integer.valueOf(i));
                this.LLILZIL.put(Integer.valueOf(i), c20603715jn.LIZLLL);
            } else {
                C19719512Dh.LIZJ(this.LLILZIL).remove(this.LLILZLL.remove(C20605115k1.class));
            }
            this.LLJJJJ = c20603715jn.LIZLLL;
            this.LLJJIJI.onNext(c20603715jn);
        }
    }

    public final void LLLL(Integer num, AbstractC1906720ziY abstractC1906720ziY) {
        C20605415k4 c20605415k4;
        Function1<C20607615kQ, Unit> function1;
        this.LLILZ = abstractC1906720ziY instanceof C20605915k9;
        PowerStub powerStub = new PowerStub(this, abstractC1906720ziY, new C20604715jx(this, abstractC1906720ziY), new C20604815jy(this));
        int iIntValue = 0;
        if (this.LLILZ) {
            this.LLILLJJLI = powerStub;
        } else {
            ArrayList arrayList = (ArrayList) LLLLLJIL();
            if (!arrayList.isEmpty()) {
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    if (Intrinsics.LJFF(((PowerStub) it2.next()).LLILLJJLI.getClass(), abstractC1906720ziY.getClass())) {
                        String strConcat = "Registered duplicate PowerChunk class : ".concat(abstractC1906720ziY.getClass().getName());
                        strConcat.toString();
                        throw new IllegalStateException(strConcat);
                    }
                }
            }
            if (num != null) {
                int iIntValue2 = num.intValue();
                if (iIntValue2 >= 0 && iIntValue2 <= ((ArrayList) this.LLILLL).size()) {
                    ListProtector.add(this.LLILLL, iIntValue2, powerStub);
                } else {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Index ");
                    sbLIZ.append(iIntValue2);
                    sbLIZ.append(" out of bounds for size ");
                    sbLIZ.append(((ArrayList) this.LLILLL).size());
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    strLIZIZ.toString();
                    throw new IllegalArgumentException(strLIZIZ);
                }
            } else {
                ((ArrayList) this.LLILLL).add(powerStub);
            }
        }
        powerStub.LLILZIL = LLLLJI();
        abstractC1906720ziY.LLILLL = true;
        abstractC1906720ziY.LL = powerStub;
        abstractC1906720ziY.LLILLJJLI = this.LL;
        Integer num2 = (Integer) C13LP.LJJLIIIJLJLI(((HashMap) this.LLIZ).values());
        if (num2 != null) {
            iIntValue = num2.intValue();
        }
        ((HashMap) this.LLIZ).put(powerStub, Integer.valueOf(iIntValue + 100));
        if (this.LLJLL) {
            powerStub.LJIILL(powerStub.getLifecycleOwner());
        }
        PowerPageLoader<?> powerPageLoader = this.LLIZLLLIL;
        if (powerPageLoader != null) {
            powerPageLoader.onDestroy();
        }
        PowerPageLoader<?> powerPageLoader2 = this.LLIZLLLIL;
        if (powerPageLoader2 != null && (c20605415k4 = powerPageLoader2.LLJILLL) != null && (function1 = c20605415k4.LIZIZ) != null) {
            function1.invoke(C20607615kQ.LIZJ);
        }
        this.LLIZLLLIL = null;
        AbstractC329610Cw3<?> abstractC329610Cw3LJIIJJI = abstractC1906720ziY.LJIIJJI();
        if (abstractC329610Cw3LJIIJJI != null) {
            LLLIL(abstractC329610Cw3LJIIJJI, abstractC1906720ziY, abstractC1906720ziY.LLILZLL);
        }
        LLLLLLLLLL();
    }

    public final <T extends InterfaceC336510DHd> void LLLLII(T t, Class<T> cls) {
        PowerStub powerStubLLLLJI = LLLLJI();
        if (powerStubLLLLJI != null) {
            powerStubLLLLJI.LIZ(t, cls);
        }
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) throws Exception {
        onBindViewHolder((PowerCell) viewHolder, i, LLL);
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) throws IllegalAccessException {
        int iIntValue;
        int iIntValue2;
        C1558530qex c1558530qexLLLLLJLJLL = LLLLLJLJLL();
        c1558530qexLLLLLJLJLL.getClass();
        c1558530qexLLLLLJLJLL.LIZ(C1562010qkZ.LIZ);
        Object value = ((HashMap) this.LLILZIL).get(Integer.valueOf(i));
        if (value == null) {
            if (((ArrayList) this.LLILLL).isEmpty() && LLILZLL().LJIL) {
                iIntValue = i - 100;
                Class cls = (Class) ((HashMap) LLLLJI().LLIZLLLIL).get(Integer.valueOf(iIntValue));
                if (cls != null) {
                    value = cls;
                } else {
                    iIntValue = 0;
                }
            } else {
                loop0: for (PowerStub powerStub : (ArrayList) C13LP.LJLIL(this.LLILLL, Collections.singletonList(LLLLJI()))) {
                    Integer num = (Integer) ((HashMap) this.LLIZ).get(powerStub);
                    if (num != null) {
                        iIntValue2 = num.intValue();
                    } else {
                        iIntValue2 = 0;
                    }
                    for (Map.Entry entry : ((HashMap) powerStub.LLIZLLLIL).entrySet()) {
                        if (((Number) entry.getKey()).intValue() + iIntValue2 == i) {
                            iIntValue = ((Number) entry.getKey()).intValue();
                            value = entry.getValue();
                            break loop0;
                        }
                    }
                }
                iIntValue = 0;
            }
        } else {
            iIntValue = 0;
        }
        Class<?> cls2 = (Class) value;
        if (cls2 != null) {
            Object obj = ((LinkedHashMap) this.LLJL).get(cls2);
            PowerCell powerCell = null;
            if (obj == null) {
                synchronized (this.LLJL) {
                    try {
                        obj = ((LinkedHashMap) this.LLJL).get(cls2);
                        if (obj == null) {
                            C2238881Ck2<?> c2238881Ck2LIZ = C2238831Cjx.LIZ(cls2);
                            if (c2238881Ck2LIZ == null || c2238881Ck2LIZ.LJ != EnumC725160ScU.SUCCESS || (obj = c2238881Ck2LIZ.LIZLLL) == null) {
                                obj = null;
                            }
                            Map<Class<?>, List<PowerCell<?>>> map = this.LLJL;
                            List<PowerCell<?>> list = (List) obj;
                            if (list == null) {
                                list = this.LLJLIL;
                            }
                            map.put(cls2, list);
                        }
                    } finally {
                        TryCatchGuardChecker.doCheck(th);
                    }
                }
            }
            List list2 = (List) obj;
            if (list2 != null) {
                powerCell = (PowerCell) C19719612Di.LJJIIZI(list2);
            }
            if (powerCell == null) {
                powerCell = (PowerCell) cls2.newInstance();
            }
            powerCell.setAttachView$powerlist_release(this.LL);
            powerCell.setParent(LLLLJ());
            powerCell.setAdapterManager$powerlist_release(this);
            long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            View viewLLLLIIL = LLLLIIL(powerCell, viewGroup, iIntValue);
            Field field = this.LLJJLIIIJLLLLLLLZ;
            if (field != null) {
                field.set(powerCell, viewLLLLIIL);
            }
            viewLLLLIIL.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            powerCell.onItemViewCreated();
            Object obj2 = ((Map) this.LLJILLL.getValue()).get(cls2);
            if (obj2 != null) {
                powerCell.onItemViewCreated(obj2);
            }
            long jElapsedRealtimeNanos2 = SystemClock.elapsedRealtimeNanos() - jElapsedRealtimeNanos;
            C1558530qex c1558530qexLLLLLJLJLL2 = LLLLLJLJLL();
            String strLIZLLL = C13LE.LIZ(powerCell.getClass()).LIZLLL();
            c1558530qexLLLLLJLJLL2.getClass();
            c1558530qexLLLLLJLJLL2.LIZIZ(C1562010qkZ.LIZ, new AwS12S1000100_24(strLIZLLL, jElapsedRealtimeNanos2, 1));
            try {
                View view = powerCell.itemView;
                if (view != null) {
                    view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
            powerCell.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
            try {
                if (powerCell.itemView.getParent() != null) {
                    try {
                        SettingsManager.LIZLLL().getClass();
                    } catch (Exception th2) {
                    }
                    if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                        StringBuffer stringBuffer = new StringBuffer();
                        stringBuffer.append("onCreateViewHolder getParent() != null crash hook,");
                        stringBuffer.append(" holder ");
                        stringBuffer.append(powerCell.getClass().getName());
                        stringBuffer.append(" parent ");
                        stringBuffer.append(viewGroup.getClass().getName());
                        stringBuffer.append(" viewType ");
                        stringBuffer.append(i);
                        C1AF0.LIZJ(stringBuffer.toString());
                        ViewGroup viewGroup2 = (ViewGroup) powerCell.itemView.getParent();
                        if (viewGroup2 != null) {
                            C786410Ut5.LJJJLZIJ(powerCell.itemView, viewGroup2);
                        }
                    }
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C2081408Dk.LIZ(e);
                C2344809Gs.LIZ(e);
            }
            C20612085q.LIZ = powerCell.getClass().getName();
            return powerCell;
        }
        throw new RuntimeException("onCreateViewHolder itemToType error!!");
    }

    @Override // X.InterfaceC1891370zJn
    public final void LLJJJJJIL(int i, int i2, Object obj) {
        notifyItemRangeChanged(i, i2, obj);
    }

    @Override // X.AbstractC20603615jm
    public final void LLLIL(AbstractC329610Cw3<?> abstractC329610Cw3, AbstractC1906720ziY abstractC1906720ziY, C20600815jK<InterfaceC1891350zJl> c20600815jK) {
        AbstractC329610Cw3<?> abstractC329610Cw3LJIIJJI;
        PowerPageLoader<?> powerPageLoader;
        InterfaceC1906710ziX interfaceC1906710ziXLLLLJI;
        PowerPageLoader powerPageLoader2;
        PowerPageLoader<?> powerPageLoader3 = this.LLIZLLLIL;
        if (powerPageLoader3 != null) {
            powerPageLoader3.onDestroy();
        }
        if (abstractC1906720ziY == null || (abstractC329610Cw3LJIIJJI = abstractC1906720ziY.LJIIJJI()) == null) {
            abstractC329610Cw3LJIIJJI = abstractC329610Cw3;
        }
        if (abstractC1906720ziY == null || (powerPageLoader2 = (PowerPageLoader) abstractC1906720ziY.LLILZ.getValue()) == null || !C2296808zG.LJI(powerPageLoader2) || (powerPageLoader = (PowerPageLoader) abstractC1906720ziY.LLILZ.getValue()) == null) {
            powerPageLoader = new PowerPageLoader<>(abstractC329610Cw3LJIIJJI, c20600815jK);
        }
        this.LLIZLLLIL = powerPageLoader;
        powerPageLoader.LLILLL = LLLLLJLJLL();
        if (abstractC1906720ziY == null || (interfaceC1906710ziXLLLLJI = abstractC1906720ziY.LJIIJ()) == null) {
            interfaceC1906710ziXLLLLJI = LLLLJI();
        }
        powerPageLoader.LLIZLLLIL = interfaceC1906710ziXLLLLJI;
        C11PQ<C20603715jn> c11pq = this.LLJJIJI;
        AwS610S0100000_31 awS610S0100000_31 = new AwS610S0100000_31(this, 112);
        C20605415k4 c20605415k4 = new C20605415k4(this, c11pq, awS610S0100000_31);
        synchronized (powerPageLoader) {
            try {
                C20607615kQ c20607615kQ = powerPageLoader.LLJILJIL;
                if (c20607615kQ != null) {
                    awS610S0100000_31.invoke(c20607615kQ);
                    powerPageLoader.LLJILJIL = null;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        powerPageLoader.LLJJ = (C11JF) c11pq.LJJLJLI(new AfS200S0100000_31(powerPageLoader, 44));
        powerPageLoader.LLJILLL = c20605415k4;
        if (!C20606115kB.LIZJ) {
            getLifecycle().addObserver(powerPageLoader);
        }
        LLLJIL(abstractC329610Cw3.LIZ, EnumC995420c0i.PageConfig);
        this.LLJI.LL = powerPageLoader;
        if (powerPageLoader.LLILZIL.LIZJ && !powerPageLoader.LLJIJIL) {
            powerPageLoader.LLJIJIL = true;
            powerPageLoader.LJIIIIZZ();
        }
    }

    public View LLLLIIL(PowerCell powerCell, ViewGroup viewGroup, int i) {
        View viewOnCreateItemView = powerCell.onCreateItemView(viewGroup, i);
        if (viewOnCreateItemView != null) {
            viewOnCreateItemView.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
        }
        return viewOnCreateItemView;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Integer LLLLL(com.bytedance.ies.powerlist.PowerStub r3, java.lang.Class<? extends X.InterfaceC1891350zJl> r4, X.InterfaceC1891350zJl r5) {
        /*
            r2 = this;
            boolean r0 = r5 instanceof X.C423460Gj2
            if (r0 == 0) goto L2a
            X.0Gj2 r5 = (X.C423460Gj2) r5
            int r0 = r5.LLILLJJLI
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        Lc:
            if (r0 == 0) goto L5f
        Le:
            int r1 = r0.intValue()
            java.util.Map<com.bytedance.ies.powerlist.PowerStub, java.lang.Integer> r0 = r2.LLIZ
            java.util.HashMap r0 = (java.util.HashMap) r0
            java.lang.Object r0 = r0.get(r3)
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 == 0) goto L28
            int r0 = r0.intValue()
        L22:
            int r1 = r1 + r0
        L23:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            return r0
        L28:
            r0 = 0
            goto L22
        L2a:
            boolean r0 = r5 instanceof X.C14NM
            if (r0 == 0) goto L52
            X.0ux2 r1 = new X.0ux2
            X.14NM r5 = (X.C14NM) r5
            int r0 = r5.getContentType()
            r1.<init>(r0, r4)
            java.util.Map<java.lang.reflect.Type, java.lang.Integer> r0 = r3.LLJ
            java.util.HashMap r0 = (java.util.HashMap) r0
            java.lang.Object r0 = r0.get(r1)
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 != 0) goto Le
            java.util.Map<java.lang.reflect.Type, java.lang.Integer> r0 = r3.LLJ
            if (r0 == 0) goto L5f
            java.util.HashMap r0 = (java.util.HashMap) r0
            java.lang.Object r0 = r0.get(r4)
            java.lang.Integer r0 = (java.lang.Integer) r0
            goto Lc
        L52:
            java.util.Map<java.lang.reflect.Type, java.lang.Integer> r0 = r3.LLJ
            if (r0 == 0) goto L5f
            java.util.HashMap r0 = (java.util.HashMap) r0
            java.lang.Object r0 = r0.get(r4)
            java.lang.Integer r0 = (java.lang.Integer) r0
            goto Lc
        L5f:
            r1 = -1
            goto L23
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.powerlist.PowerAdapter.LLLLL(com.bytedance.ies.powerlist.PowerStub, java.lang.Class, X.0zJl):java.lang.Integer");
    }

    @Override // X.AbstractC21673619ry
    /* JADX INFO: renamed from: LLLLLLL, reason: merged with bridge method [inline-methods] */
    public final void onBindViewHolder(PowerCell<? extends InterfaceC1891350zJl> powerCell, int i, List<Object> list) throws Exception {
        InterfaceC1587906Jp interfaceC1587906Jp;
        Boolean boolValueOf;
        long jCurrentTimeMillis = System.currentTimeMillis();
        powerCell.setAttachView$powerlist_release(this.LL);
        C20603715jn c20603715jn = this.LLJJJ;
        int i2 = 0;
        if (c20603715jn != null && c20603715jn.LJIJI && powerCell.getParent() == null) {
            powerCell.setParent(LLLLJ());
            powerCell.setAdapterManager$powerlist_release(this);
            powerCell.itemView.setTag(R.id.en4, C946803n0.LIZ(this.LL));
        }
        C1558530qex c1558530qexLLLLLJLJLL = LLLLLJLJLL();
        c1558530qexLLLLLJLJLL.getClass();
        C1562000qkY c1562000qkY = C1562000qkY.LIZ;
        c1558530qexLLLLLJLJLL.LIZ(c1562000qkY);
        C20603715jn c20603715jn2 = this.LLJJJ;
        if (c20603715jn2 != null && c20603715jn2.LJ) {
            interfaceC1587906Jp = (InterfaceC1891350zJl) ListProtector.get(this.LLJJIJIIJIL.LJII, i);
        } else if (powerCell instanceof PowerLoadingCell) {
            interfaceC1587906Jp = this.LLJI;
        } else {
            interfaceC1587906Jp = (InterfaceC1891350zJl) ListProtector.get(LLLLILI(), i);
        }
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        powerCell.setStub(LLLLLIL(i));
        powerCell.bindItem$powerlist_release(interfaceC1587906Jp);
        if (powerCell.getStub() == null && Intrinsics.LJFF(interfaceC1587906Jp, this.LLJI)) {
            powerCell.setStub(LLLLJI());
        }
        if (C20606115kB.LIZ && list.isEmpty()) {
            powerCell.unBindViewHolder$powerlist_release();
        }
        ((C0SZT) this.LLJIJIL.getValue()).LIZIZ(interfaceC1587906Jp, powerCell, i, list);
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            powerCell.onBindViewHolder(interfaceC1587906Jp, list);
            long jElapsedRealtimeNanos2 = SystemClock.elapsedRealtimeNanos() - jElapsedRealtimeNanos;
            LLLLIILL(i);
            C1558530qex c1558530qexLLLLLJLJLL2 = LLLLLJLJLL();
            String strLIZLLL = C13LE.LIZ(powerCell.getClass()).LIZLLL();
            c1558530qexLLLLLJLJLL2.getClass();
            c1558530qexLLLLLJLJLL2.LIZIZ(c1562000qkY, new AwS12S1000100_24(strLIZLLL, jElapsedRealtimeNanos2, 0));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onBindViewHolder exception: position=");
            sbLIZ.append(i);
            sbLIZ.append(", cellType=");
            sbLIZ.append(powerCell);
            sbLIZ.append(", itemType=");
            sbLIZ.append(interfaceC1587906Jp);
            sbLIZ.append(" async:");
            C20603715jn c20603715jn3 = this.LLJJJ;
            if (c20603715jn3 != null) {
                boolValueOf = Boolean.valueOf(c20603715jn3.LJ);
            } else {
                boolValueOf = null;
            }
            sbLIZ.append(boolValueOf);
            sbLIZ.append(" bindStartTime:");
            sbLIZ.append(jCurrentTimeMillis);
            sbLIZ.append(" getItemTime:");
            sbLIZ.append(jCurrentTimeMillis2);
            sbLIZ.append(" errorTime:");
            sbLIZ.append(System.currentTimeMillis());
            ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogE("power_item_classCastException", C2188811AlT.LIZIZ(sbLIZ));
            for (Object obj : (ArrayList) LLLLILI()) {
                int i3 = i2 + 1;
                if (i2 >= 0) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("index ---> ");
                    sbLIZ2.append(i2);
                    sbLIZ2.append(", powerItem ---> ");
                    sbLIZ2.append(obj);
                    sbLIZ2.append('}');
                    ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogE("power_item_classCastException", C2188811AlT.LIZIZ(sbLIZ2));
                    i2 = i3;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
            Iterator it2 = ((ArrayList) C13LP.LJLIL(this.LLILLL, Collections.singletonList(LLLLJI()))).iterator();
            while (it2.hasNext()) {
                for (Map.Entry entry : ((HashMap) ((PowerStub) it2.next()).LLIZLLLIL).entrySet()) {
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("viewType ---> ");
                    sbLIZ3.append(((Number) entry.getKey()).intValue());
                    sbLIZ3.append(", cell ---> ");
                    sbLIZ3.append(entry.getValue());
                    ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogE("power_item_classCastException", C2188811AlT.LIZIZ(sbLIZ3));
                }
            }
            throw e;
        }
    }
}
