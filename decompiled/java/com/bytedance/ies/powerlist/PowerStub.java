package com.bytedance.ies.powerlist;

import X.AbstractC1906720ziY;
import X.C01GW;
import X.C1169720gXq;
import X.C13LP;
import X.C15438062q;
import X.C15WN;
import X.C15WO;
import X.C1891440zJu;
import X.C19EG;
import X.C20600915jL;
import X.C20601515jR;
import X.C20604715jx;
import X.C20604815jy;
import X.C20605015k0;
import X.C20673215v0;
import X.C2157908cr;
import X.C2188811AlT;
import X.C2238831Cjx;
import X.C423460Gj2;
import X.C452501pT;
import X.InterfaceC1891350zJl;
import X.InterfaceC1906710ziX;
import X.InterfaceC20603815jo;
import X.InterfaceC336510DHd;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.ies.powerlist.header.HeaderAndFooterViewCell;
import com.bytedance.ies.powerlist.optimize.preload.RegisterCellScene;
import com.ss.android.agilelogger.ALog;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes32.dex */
public final class PowerStub implements LifecycleEventObserver, Observer<C20600915jL<InterfaceC1891350zJl>>, InterfaceC1906710ziX {
    public static final /* synthetic */ int LLJJJ = 0;
    public final InterfaceC20603815jo LL;
    public final AbstractC1906720ziY LLILLJJLI;
    public final Function2<Integer, Integer, Unit> LLILLL;
    public final Function1<C1891440zJu, Unit> LLILZ;
    public PowerStub LLILZIL;
    public int LLILZLL;
    public int LLIZ;
    public final Map<Integer, Class<? extends PowerCell<?>>> LLIZLLLIL;
    public final Map<Type, Integer> LLJ;
    public final C01GW LLJI;
    public volatile int LLJIJIL;
    public final List<InterfaceC1891350zJl> LLJILJIL;
    public final CopyOnWriteArrayList<C423460Gj2> LLJILJILJ;
    public final CopyOnWriteArrayList<C423460Gj2> LLJILLL;
    public boolean LLJJ;
    public LifecycleOwner LLJJI;
    public boolean LLJJIII;
    public final List<InterfaceC1891350zJl> LLJJIJI;
    public RegisterCellScene LLJJIJIIJIL;
    public final C01GW LLJJIJIL;

    public PowerStub() {
        throw null;
    }

    @Override // X.InterfaceC1906710ziX
    public final int LIZJ() {
        return this.LLJILJILJ.size();
    }

    @Override // X.InterfaceC1906710ziX
    public final void LIZLLL() {
        CopyOnWriteArrayList<C423460Gj2> copyOnWriteArrayList = this.LLJILJILJ;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(copyOnWriteArrayList, 10));
        Iterator<C423460Gj2> it2 = copyOnWriteArrayList.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next().LL);
        }
        LJIJ(copyOnWriteArrayList, arrayList);
    }

    @Override // X.InterfaceC1906710ziX
    public final void LJI() {
        CopyOnWriteArrayList<C423460Gj2> copyOnWriteArrayList = this.LLJILLL;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(copyOnWriteArrayList, 10));
        Iterator<C423460Gj2> it2 = copyOnWriteArrayList.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next().LL);
        }
        LJIJ(copyOnWriteArrayList, arrayList);
    }

    @Override // X.InterfaceC1906710ziX
    public final void LJII() {
        ((ListState) this.LLJI.getValue()).LIZIZ.removeObserver(this);
        RegisterCellScene registerCellScene = this.LLJJIJIIJIL;
        if (registerCellScene != null) {
            C2238831Cjx.LIZJ(registerCellScene, C13LP.LLIIII(((HashMap) this.LLIZLLLIL).values()));
        }
    }

    @Override // X.InterfaceC1906710ziX
    public final int LJIIIZ() {
        return this.LL.LLIL(this);
    }

    @Override // X.InterfaceC1906710ziX
    public final int LJIILIIL() {
        return this.LL.LLIZ(this);
    }

    @Override // X.InterfaceC1906710ziX
    public final List<InterfaceC1891350zJl> LJIILJJIL() {
        return new ArrayList(this.LLJJIJI);
    }

    public final void LJIILLIIL() {
        this.LLILZ.invoke(new C1891440zJu(false, true, false, (List) null, 29));
    }

    public final void LJIJI() {
        ((ArrayList) this.LLJJIJI).clear();
        ((ArrayList) this.LLJJIJI).addAll(this.LLJILJILJ);
        ((ArrayList) this.LLJJIJI).addAll(this.LLJILJIL);
        ((ArrayList) this.LLJJIJI).addAll(this.LLJILLL);
    }

    @Override // X.InterfaceC1906710ziX
    public final Context getContext() {
        return this.LL.getContext();
    }

    @Override // X.InterfaceC1906710ziX
    public final LifecycleOwner getLifecycleOwner() {
        return this.LL.getLifecycleOwner();
    }

    @Override // X.InterfaceC1906710ziX
    public final AbstractC1906720ziY LJIIJJI() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC1906710ziX
    public final <T extends InterfaceC336510DHd> T LJ(Class<T> cls) {
        C15WN c15wn;
        T t = (T) ((C15WN) this.LLJJIJIL.getValue()).LIZ(cls);
        if (t == null) {
            PowerStub powerStub = this.LLILZIL;
            if (powerStub != null && (c15wn = (C15WN) powerStub.LLJJIJIL.getValue()) != null) {
                return (T) c15wn.LIZ(cls);
            }
            return null;
        }
        return t;
    }

    @Override // X.InterfaceC1906710ziX
    public final void LJIIIIZZ(List<? extends View> list) {
        LJIJ(this.LLJILJILJ, list);
    }

    @Override // X.InterfaceC1906710ziX
    public final void LJIIJ(View view) {
        if (view == null) {
            return;
        }
        int i = this.LLIZ;
        this.LLIZ = i + 1;
        this.LLJILLL.add(this.LLJILLL.size(), new C423460Gj2(i, view));
        ((HashMap) this.LLIZLLLIL).put(Integer.valueOf(i), HeaderAndFooterViewCell.class);
        LJIILLIIL();
    }

    @Override // X.InterfaceC1906710ziX
    public final void LJIIL(List<? extends View> list) {
        LJIJ(this.LLJILLL, list);
    }

    public final void LJIILL(LifecycleOwner lifecycleOwner) {
        ((ListState) this.LLJI.getValue()).LIZIZ.observe(lifecycleOwner, this);
        if (!this.LLJJIII) {
            lifecycleOwner.getLifecycle().addObserver(this);
            this.LLJJIII = true;
        }
        this.LLJJI = lifecycleOwner;
    }

    public final void LJIIZILJ(Class<? extends PowerCell<?>> cls) {
        C01GW c01gw = C20605015k0.LJ;
        Integer num = ((C1169720gXq) c01gw.getValue()).LIZ.get(cls);
        if (num == null) {
            num = 0;
        }
        int iIntValue = num.intValue();
        if (iIntValue != 0) {
            Integer num2 = ((C1169720gXq) c01gw.getValue()).LIZIZ.get(cls);
            if (num2 == null) {
                num2 = 1;
            }
            int iIntValue2 = num2.intValue();
            for (int i = 0; i < iIntValue2; i++) {
                C20673215v0.LJI(iIntValue, getContext());
            }
        }
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(C20600915jL<InterfaceC1891350zJl> c20600915jL) {
        C20600915jL<InterfaceC1891350zJl> c20600915jL2 = c20600915jL;
        if (this.LL.LLILZLL().LJIILLIIL) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("PowerStub.onChanged: old=");
            sbLIZ.append(((ArrayList) this.LLJILJIL).size());
            sbLIZ.append(" new:");
            sbLIZ.append(c20600915jL2.LIZ.size());
            sbLIZ.append(" hash:");
            sbLIZ.append(hashCode());
            sbLIZ.append(" timestamp:");
            sbLIZ.append(jCurrentTimeMillis);
            ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogD("power_item_classCastException", C2188811AlT.LIZIZ(sbLIZ));
        }
        ((ArrayList) this.LLJILJIL).clear();
        ((ArrayList) this.LLJILJIL).addAll(c20600915jL2.LIZ);
        this.LLILZ.invoke(new C1891440zJu(c20600915jL2.LIZIZ, false, c20600915jL2.LIZJ, (List) c20600915jL2.LIZLLL, 10));
    }

    @Override // X.InterfaceC1906710ziX
    public final <T extends InterfaceC336510DHd> void LIZ(T t, Class<T> cls) {
        C15WN c15wn = (C15WN) this.LLJJIJIL.getValue();
        if (!((Map) c15wn.LIZ.getValue()).containsKey(cls)) {
            ((Map) c15wn.LIZ.getValue()).put(cls, t);
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("already contains control type :");
        sbLIZ.append(cls);
        throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ));
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005b  */
    @Override // X.InterfaceC1906710ziX
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(androidx.recyclerview.widget.RecyclerView r11, java.util.List<? extends java.lang.Class<? extends com.bytedance.ies.powerlist.PowerCell<?>>> r12) {
        /*
            r10 = this;
            java.util.HashMap r6 = new java.util.HashMap
            r6.<init>()
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
            java.util.Iterator r9 = r12.iterator()
        Le:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L7a
            java.lang.Object r7 = r9.next()
            java.lang.Class r7 = (java.lang.Class) r7
            java.lang.reflect.Type r0 = r7.getGenericSuperclass()
            java.lang.reflect.ParameterizedType r0 = (java.lang.reflect.ParameterizedType) r0
            java.lang.reflect.Type[] r4 = r0.getActualTypeArguments()
            int r3 = r4.length
            r2 = 0
        L26:
            if (r2 >= r3) goto Le
            r8 = r4[r2]
            X.15jo r0 = r10.LL
            X.15jn r0 = r0.LLILZLL()
            boolean r1 = r0.LJIJ
            r0 = 1
            if (r1 != r0) goto L5b
            boolean r0 = r8 instanceof java.lang.Class
            if (r0 == 0) goto L49
            r1 = r8
            java.lang.Class r1 = (java.lang.Class) r1
        L3c:
            if (r1 == 0) goto L46
            java.lang.Class<X.0zJl> r0 = X.InterfaceC1891350zJl.class
            boolean r0 = r0.isAssignableFrom(r1)
            if (r0 != 0) goto L5b
        L46:
            int r2 = r2 + 1
            goto L26
        L49:
            boolean r0 = r8 instanceof java.lang.reflect.ParameterizedType
            if (r0 == 0) goto L46
            r0 = r8
            java.lang.reflect.ParameterizedType r0 = (java.lang.reflect.ParameterizedType) r0
            java.lang.reflect.Type r1 = r0.getRawType()
            boolean r0 = r1 instanceof java.lang.Class
            if (r0 == 0) goto L46
            java.lang.Class r1 = (java.lang.Class) r1
            goto L3c
        L5b:
            java.util.Map<java.lang.reflect.Type, java.lang.Integer> r0 = r10.LLJ
            java.util.HashMap r0 = (java.util.HashMap) r0
            java.lang.Object r0 = r0.get(r8)
            if (r0 != 0) goto L46
            int r1 = r10.LLJIJIL
            int r0 = r1 + 1
            r10.LLJIJIL = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            r6.put(r8, r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            r5.put(r0, r7)
            goto L46
        L7a:
            java.util.Map<java.lang.reflect.Type, java.lang.Integer> r0 = r10.LLJ
            java.util.HashMap r0 = (java.util.HashMap) r0
            r0.putAll(r6)
            java.util.Map<java.lang.Integer, java.lang.Class<? extends com.bytedance.ies.powerlist.PowerCell<?>>> r0 = r10.LLIZLLLIL
            java.util.HashMap r0 = (java.util.HashMap) r0
            r0.putAll(r5)
            java.util.Iterator r1 = r12.iterator()
        L8c:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L9c
            java.lang.Object r0 = r1.next()
            java.lang.Class r0 = (java.lang.Class) r0
            r10.LJIIZILJ(r0)
            goto L8c
        L9c:
            X.15jo r0 = r10.LL
            r0.preload()
            com.bytedance.ies.powerlist.optimize.preload.RegisterCellScene r3 = r10.LLJJIJIIJIL
            if (r3 != 0) goto Lae
            if (r11 == 0) goto Lc0
            com.bytedance.ies.powerlist.optimize.preload.RegisterCellScene r3 = new com.bytedance.ies.powerlist.optimize.preload.RegisterCellScene
            r3.<init>(r11)
            r10.LLJJIJIIJIL = r3
        Lae:
            X.01GW r0 = X.C2238821Cjw.LIZLLL
            java.lang.Object r2 = r0.getValue()
            X.1BWg r2 = (X.C2206201BWg) r2
            Y.ARunnableS93S0200000_24 r1 = new Y.ARunnableS93S0200000_24
            r0 = 46
            r1.<init>(r3, r12, r0)
            r2.LIZ(r1)
        Lc0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.powerlist.PowerStub.LIZIZ(androidx.recyclerview.widget.RecyclerView, java.util.List):void");
    }

    @Override // X.InterfaceC1906710ziX
    public final void LJFF(int i, View view) {
        if (view == null) {
            return;
        }
        int i2 = this.LLILZLL;
        this.LLILZLL = i2 + 1;
        this.LLJILJILJ.add(i, new C423460Gj2(i2, view));
        ((HashMap) this.LLIZLLLIL).put(Integer.valueOf(i2), HeaderAndFooterViewCell.class);
        this.LLILLL.invoke(0, 1);
        LJIILLIIL();
    }

    public final void LJIJ(CopyOnWriteArrayList<C423460Gj2> copyOnWriteArrayList, List<? extends View> list) {
        boolean z = false;
        for (C423460Gj2 c423460Gj2 : copyOnWriteArrayList) {
            Iterator<? extends View> it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                View next = it2.next();
                if (c423460Gj2.LL == next) {
                    if (next != null) {
                        copyOnWriteArrayList.remove(c423460Gj2);
                        z = true;
                    }
                }
            }
        }
        if (z) {
            LJIILLIIL();
        }
    }

    @Override // X.InterfaceC1906710ziX
    public final <T extends ViewModel> T getActivityViewModel(Class<T> cls, ViewModelProvider.Factory factory) {
        C19EG currentActivity = this.LL.getCurrentActivity();
        if (currentActivity != null) {
            return (T) ViewModelProviders.of(currentActivity, factory).get(cls);
        }
        return null;
    }

    @Override // X.InterfaceC1906710ziX
    public final <T extends ViewModel> T getFragmentViewModel(Class<T> cls, ViewModelProvider.Factory factory) {
        Fragment currentFragment = this.LL.getCurrentFragment();
        if (currentFragment != null) {
            return (T) ViewModelProviders.of(currentFragment, factory).get(cls);
        }
        return null;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        switch (C2157908cr.LIZ[event.ordinal()]) {
            case 1:
                Boolean boolValueOf = Boolean.valueOf(this.LLJJ);
                if (!boolValueOf.booleanValue()) {
                    boolValueOf.booleanValue();
                    AbstractC1906720ziY abstractC1906720ziY = this.LLILLJJLI;
                    abstractC1906720ziY.getClass();
                    abstractC1906720ziY.getLifecycleRegistry().handleLifecycleEvent(Lifecycle.Event.ON_CREATE);
                    abstractC1906720ziY.onCreate();
                    this.LLJJ = true;
                }
                break;
            case 2:
                AbstractC1906720ziY abstractC1906720ziY2 = this.LLILLJJLI;
                abstractC1906720ziY2.getClass();
                abstractC1906720ziY2.getLifecycleRegistry().handleLifecycleEvent(Lifecycle.Event.ON_START);
                abstractC1906720ziY2.onStart();
                break;
            case 3:
                AbstractC1906720ziY abstractC1906720ziY3 = this.LLILLJJLI;
                abstractC1906720ziY3.getClass();
                abstractC1906720ziY3.getLifecycleRegistry().handleLifecycleEvent(Lifecycle.Event.ON_RESUME);
                abstractC1906720ziY3.onResume(true);
                break;
            case 4:
                AbstractC1906720ziY abstractC1906720ziY4 = this.LLILLJJLI;
                abstractC1906720ziY4.getClass();
                abstractC1906720ziY4.getLifecycleRegistry().handleLifecycleEvent(Lifecycle.Event.ON_PAUSE);
                abstractC1906720ziY4.onPause();
                break;
            case 5:
                AbstractC1906720ziY abstractC1906720ziY5 = this.LLILLJJLI;
                abstractC1906720ziY5.getClass();
                abstractC1906720ziY5.getLifecycleRegistry().handleLifecycleEvent(Lifecycle.Event.ON_STOP);
                abstractC1906720ziY5.onStop();
                break;
            case 6:
                AbstractC1906720ziY abstractC1906720ziY6 = this.LLILLJJLI;
                abstractC1906720ziY6.getLifecycleRegistry().handleLifecycleEvent(Lifecycle.Event.ON_DESTROY);
                abstractC1906720ziY6.onDestroy();
                this.LLJJI = null;
                break;
        }
    }

    public PowerStub(InterfaceC20603815jo interfaceC20603815jo, AbstractC1906720ziY abstractC1906720ziY, C20604715jx c20604715jx, C20604815jy c20604815jy) {
        this.LL = interfaceC20603815jo;
        this.LLILLJJLI = abstractC1906720ziY;
        this.LLILLL = c20604715jx;
        this.LLILZ = c20604815jy;
        this.LLILZLL = 10000;
        this.LLIZ = 20000;
        this.LLIZLLLIL = new HashMap();
        this.LLJ = new HashMap();
        this.LLJI = C452501pT.LIZIZ(new C20601515jR(this));
        this.LLJILJIL = new ArrayList();
        this.LLJILJILJ = new CopyOnWriteArrayList<>();
        this.LLJILLL = new CopyOnWriteArrayList<>();
        this.LLJJIJI = new ArrayList();
        this.LLJJIJIL = C452501pT.LIZIZ(new C15WO());
    }
}
