package com.bytedance.tiktok.sdk.powerviewpager.adapter;

import X.C01GW;
import X.C11PQ;
import X.C13BV;
import X.C1558530qex;
import X.C1697810uHb;
import X.C1891380zJo;
import X.C1891440zJu;
import X.C20600815jK;
import X.C20600915jL;
import X.C20603715jn;
import X.C20606115kB;
import X.C2188811AlT;
import X.C452501pT;
import X.C622840Obq;
import X.C786410Ut5;
import X.EnumC622850Obr;
import X.EnumC995420c0i;
import X.InterfaceC1206390hUz;
import X.InterfaceC1891350zJl;
import X.InterfaceC1891370zJn;
import X.ViewOnAttachStateChangeListenerC20631115oD;
import android.os.Bundle;
import android.view.ViewTreeObserver;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tiktok.sdk.powerviewpager.FragmentPageSelectedManager;
import com.bytedance.tiktok.sdk.powerviewpager.adapter.PowerViewPagerFragmentAdapter;
import com.bytedance.tiktok.sdk.powerviewpager.item.PowerViewPagerFragmentItem;
import java.lang.ref.WeakReference;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS221S0000000_31;
import kotlin.jvm.internal.AwS575S0100000_31;

/* JADX INFO: loaded from: classes32.dex */
public final class PowerViewPagerFragmentAdapter extends FragmentStateAdapter implements InterfaceC1891370zJn, Observer<C20600915jL<InterfaceC1891350zJl>> {
    public final ViewOnAttachStateChangeListenerC20631115oD LLJI;
    public final RecyclerView LLJIJIL;
    public final LifecycleOwner LLJILJIL;
    public final FragmentManager LLJILJILJ;
    public final FragmentPageSelectedManager LLJILLL;
    public final LifecycleEventObserver LLJJ;
    public C20603715jn LLJJI;
    public C622840Obq LLJJIII;
    public EnumC995420c0i LLJJIJI;
    public int LLJJIJIIJIL;
    public final List<PowerViewPagerFragmentItem<?>> LLJJIJIL;
    public final List<Integer> LLJJJ;
    public final List<PowerViewPagerFragmentItem<?>> LLJJJIL;
    public boolean LLJJJJ;
    public final C20600815jK<InterfaceC1891350zJl> LLJJJJJIL;
    public final C01GW LLJJJJLIIL;
    public final C01GW LLJJL;
    public final C01GW LLJJLIIIJLLLLLLLZ;
    public final C01GW LLJL;
    public final C11PQ<C20603715jn> LLJLIL;
    public final C1891380zJo LLJLILLLLZIIL;

    public final int LLLILZLLLI() {
        return this.LLJI.getCurrentItem();
    }

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return ((ArrayList) this.LLJJIJIL).size();
    }

    @Override // androidx.viewpager2.adapter.FragmentStateAdapter
    public final boolean LLLI(long j) {
        List<PowerViewPagerFragmentItem<?>> list = this.LLJJIJIL;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<PowerViewPagerFragmentItem<?>> it2 = list.iterator();
            while (it2.hasNext()) {
                if (it2.next().getId() == j) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // androidx.viewpager2.adapter.FragmentStateAdapter
    public final Fragment LLLII(int i) {
        Type genericSuperclass;
        PowerViewPagerFragmentItem<?> powerViewPagerFragmentItemLLLJ = LLLJ(i);
        if (powerViewPagerFragmentItemLLLJ == null || (genericSuperclass = powerViewPagerFragmentItemLLLJ.getClass().getGenericSuperclass()) == null || !(genericSuperclass instanceof ParameterizedType)) {
            genericSuperclass = null;
        }
        Fragment fragment = (Fragment) ((Class) ((ParameterizedType) genericSuperclass).getActualTypeArguments()[0]).newInstance();
        Bundle bundle = new Bundle();
        C786410Ut5.LJJIJL(bundle, "power_viewpager_default_key", powerViewPagerFragmentItemLLLJ);
        fragment.setArguments(bundle);
        FragmentPageSelectedManager fragmentPageSelectedManager = this.LLJILLL;
        fragmentPageSelectedManager.getClass();
        fragment.getLifecycle().addObserver(fragmentPageSelectedManager);
        fragmentPageSelectedManager.LLILLJJLI.put(powerViewPagerFragmentItemLLLJ, new WeakReference<>(fragment));
        return fragment;
    }

    public final PowerViewPagerFragmentItem<?> LLLJ(int i) {
        if (i >= 0 && i < getItemCount()) {
            return (PowerViewPagerFragmentItem) ListProtector.get(this.LLJJIJIL, i);
        }
        return null;
    }

    public final synchronized void LLLJIL(C20600915jL<InterfaceC1891350zJl> c20600915jL) {
        boolean z;
        boolean z2;
        if (LLLILZLLLI() >= 0 && LLLILZLLLI() < ((ArrayList) this.LLJJJIL).size() && LLLILZLLLI() < ((ArrayList) this.LLJJIJIL).size()) {
            List<PowerViewPagerFragmentItem<?>> list = this.LLJJJIL;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator<PowerViewPagerFragmentItem<?>> it2 = list.iterator();
                while (it2.hasNext()) {
                    if (it2.next().getId() == ((PowerViewPagerFragmentItem) ListProtector.get(this.LLJJIJIL, LLLILZLLLI())).getId()) {
                        z = true;
                        break;
                    }
                }
            }
            z = false;
            List<PowerViewPagerFragmentItem<?>> list2 = this.LLJJIJIL;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                Iterator<PowerViewPagerFragmentItem<?>> it3 = list2.iterator();
                while (it3.hasNext()) {
                    if (it3.next().getId() == ((PowerViewPagerFragmentItem) ListProtector.get(this.LLJJJIL, LLLILZLLLI())).getId()) {
                        z2 = true;
                        break;
                    }
                }
            }
            z2 = false;
            if (((PowerViewPagerFragmentItem) ListProtector.get(this.LLJJJIL, LLLILZLLLI())).getId() != ((PowerViewPagerFragmentItem) ListProtector.get(this.LLJJIJIL, LLLILZLLLI())).getId() && !z2 && !z) {
                ListProtector.set(this.LLJJJIL, LLLILZLLLI(), ListProtector.get(this.LLJJIJIL, LLLILZLLLI()));
                notifyItemChanged(LLLILZLLLI());
            }
        }
        if (LLLILZLLLI() >= 0 && LLLILZLLLI() < ((ArrayList) this.LLJJJIL).size()) {
            Iterator it4 = ((ArrayList) this.LLJJIJIL).iterator();
            int i = 0;
            while (true) {
                if (!it4.hasNext()) {
                    break;
                }
                if (((PowerViewPagerFragmentItem) it4.next()).getId() != ((PowerViewPagerFragmentItem) ListProtector.get(this.LLJJJIL, LLLILZLLLI())).getId()) {
                    i++;
                } else if (i != -1 && i != LLLILZLLLI() && !this.LLJI.isFakeDragging()) {
                    this.LLJI.setCurrentItem(i, false);
                }
            }
        }
        LLLJL(c20600915jL);
    }

    public final void LLLJL(C20600915jL<InterfaceC1891350zJl> c20600915jL) {
        EnumC622850Obr enumC622850Obr;
        List<PowerViewPagerFragmentItem<?>> list = this.LLJJIJIL;
        C1891380zJo c1891380zJo = this.LLJLILLLLZIIL;
        List<Integer> list2 = this.LLJJJ;
        List<PowerViewPagerFragmentItem<?>> list3 = this.LLJJJIL;
        c1891380zJo.getClass();
        c1891380zJo.LJ(list2, list3, list, new C1891440zJu(c20600915jL.LIZIZ, false, c20600915jL.LIZJ, (List) c20600915jL.LIZLLL, 10));
        ((ArrayList) this.LLJJJIL).clear();
        ((ArrayList) this.LLJJJIL).addAll(list);
        ((ArrayList) this.LLJJJ).clear();
        int size = ((ArrayList) this.LLJJJIL).size();
        for (int i = 0; i < size; i++) {
            ((ArrayList) this.LLJJJ).add(Integer.valueOf(ListProtector.get(this.LLJJJIL, i).hashCode()));
        }
        C622840Obq c622840Obq = this.LLJJIII;
        if (c622840Obq != null) {
            enumC622850Obr = c622840Obq.LJII;
        } else {
            enumC622850Obr = null;
        }
        if (enumC622850Obr == EnumC622850Obr.FRAGMENTS_NO_DESTROY) {
            int i2 = this.LLJJIJIIJIL;
            int size2 = ((ArrayList) this.LLJJIJIL).size();
            if (i2 < size2) {
                i2 = size2;
            }
            this.LLJJIJIIJIL = i2;
            this.LLJIJIL.setItemViewCacheSize(i2);
        }
    }

    @Override // androidx.viewpager2.adapter.FragmentStateAdapter, X.AbstractC21673619ry
    public final long getItemId(int i) {
        return ((PowerViewPagerFragmentItem) ListProtector.get(this.LLJJIJIL, i)).getId();
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(C20600915jL<InterfaceC1891350zJl> c20600915jL) {
        int i;
        final C20600915jL<InterfaceC1891350zJl> c20600915jL2 = c20600915jL;
        ((ArrayList) this.LLJJIJIL).clear();
        for (InterfaceC1891350zJl interfaceC1891350zJl : c20600915jL2.LIZ) {
            if (interfaceC1891350zJl instanceof PowerViewPagerFragmentItem) {
                ((ArrayList) this.LLJJIJIL).add(interfaceC1891350zJl);
            }
        }
        if (!this.LLJJJJ) {
            C622840Obq c622840Obq = this.LLJJIII;
            int i2 = 0;
            if (c622840Obq != null && (i = c622840Obq.LJIIIZ) > 0 && i < ((ArrayList) this.LLJJIJIL).size()) {
                C622840Obq c622840Obq2 = this.LLJJIII;
                if (c622840Obq2 != null && c622840Obq2.LJIIJ) {
                    this.LLJI.setCurrentItem(i, false);
                    LLLJIL(c20600915jL2);
                } else {
                    final ArrayList arrayList = new ArrayList(this.LLJJIJIL);
                    ((ArrayList) this.LLJJIJIL).clear();
                    for (Object obj : arrayList) {
                        int i3 = i2 + 1;
                        if (i2 >= 0) {
                            if (i2 >= i) {
                                ((ArrayList) this.LLJJIJIL).add(obj);
                            }
                            i2 = i3;
                        } else {
                            C1697810uHb.LJIJI();
                            throw null;
                        }
                    }
                    LLLJIL(c20600915jL2);
                    final RecyclerView recyclerView = this.LLJIJIL;
                    C786410Ut5.x3(recyclerView.getViewTreeObserver(), new ViewTreeObserver.OnGlobalLayoutListener() { // from class: X.15jc
                        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                        public final void onGlobalLayout() {
                            C786410Ut5.C3(recyclerView.getViewTreeObserver(), this);
                            ((ArrayList) this.LLJJIJIL).clear();
                            List<PowerViewPagerFragmentItem<?>> list = arrayList;
                            PowerViewPagerFragmentAdapter powerViewPagerFragmentAdapter = this;
                            Iterator<PowerViewPagerFragmentItem<?>> it2 = list.iterator();
                            while (it2.hasNext()) {
                                ((ArrayList) powerViewPagerFragmentAdapter.LLJJIJIL).add(it2.next());
                            }
                            PowerViewPagerFragmentAdapter powerViewPagerFragmentAdapter2 = this;
                            C20600915jL<InterfaceC1891350zJl> c20600915jL3 = c20600915jL2;
                            c20600915jL3.LIZJ = false;
                            powerViewPagerFragmentAdapter2.LLLJIL(c20600915jL3);
                        }
                    });
                }
            } else {
                LLLJIL(c20600915jL2);
            }
            this.LLJJJJ = true;
            return;
        }
        LLLJIL(c20600915jL2);
    }

    @Override // X.InterfaceC1891370zJn
    public final void LJZL(int i, int i2) {
        notifyItemRangeInserted(i, i2);
    }

    @Override // X.InterfaceC1891370zJn
    public final void LLI(int i, int i2) {
        notifyItemMoved(i, i2);
    }

    @Override // X.InterfaceC1891370zJn
    public final void LLIZLLLIL(int i, int i2) {
        notifyItemRangeRemoved(i, i2);
    }

    @Override // X.InterfaceC1891370zJn
    public final void LLJJJJJIL(int i, int i2, Object obj) {
        notifyItemRangeChanged(i, i2, obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i, List list) {
        if (!list.isEmpty()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append('f');
            sbLIZ.append(viewHolder.getItemId());
            Fragment fragmentLJJJJZI = this.LLJILJILJ.LJJJJZI(C2188811AlT.LIZIZ(sbLIZ));
            if (fragmentLJJJJZI != 0) {
                FragmentPageSelectedManager fragmentPageSelectedManager = this.LLJILLL;
                Object obj = ListProtector.get(this.LLJJIJIL, i);
                fragmentPageSelectedManager.getClass();
                fragmentLJJJJZI.getLifecycle().addObserver(fragmentPageSelectedManager);
                fragmentPageSelectedManager.LLILLJJLI.put((PowerViewPagerFragmentItem<?>) obj, new WeakReference<>(fragmentLJJJJZI));
                if (fragmentLJJJJZI.getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.RESUMED)) {
                    ListProtector.get(this.LLJJIJIL, i);
                    ((InterfaceC1206390hUz) fragmentLJJJJZI).V6();
                    return;
                } else if (fragmentLJJJJZI.getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.STARTED)) {
                    ListProtector.get(this.LLJJIJIL, i);
                    ((InterfaceC1206390hUz) fragmentLJJJJZI).V6();
                    return;
                } else if (fragmentLJJJJZI.getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.INITIALIZED)) {
                    Bundle bundle = new Bundle();
                    C786410Ut5.LJJIJL(bundle, "power_viewpager_default_key", LLLJ(i));
                    fragmentLJJJJZI.setArguments(bundle);
                    return;
                }
            }
            super.onBindViewHolder(viewHolder, i, list);
            return;
        }
        super.onBindViewHolder(viewHolder, i, list);
    }

    public PowerViewPagerFragmentAdapter(ViewOnAttachStateChangeListenerC20631115oD viewOnAttachStateChangeListenerC20631115oD, RecyclerView recyclerView, LifecycleOwner lifecycleOwner, FragmentManager fragmentManager) {
        super(fragmentManager, lifecycleOwner.getLifecycle());
        this.LLJI = viewOnAttachStateChangeListenerC20631115oD;
        this.LLJIJIL = recyclerView;
        this.LLJILJIL = lifecycleOwner;
        this.LLJILJILJ = fragmentManager;
        this.LLJILLL = new FragmentPageSelectedManager(this);
        LifecycleEventObserver lifecycleEventObserver = new LifecycleEventObserver() { // from class: com.bytedance.tiktok.sdk.powerviewpager.adapter.PowerViewPagerFragmentAdapter$lifecycleEventObserver$1
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner2, Lifecycle.Event event) {
                if (event == Lifecycle.Event.ON_DESTROY) {
                    this.LL.getClass();
                }
            }
        };
        this.LLJJ = lifecycleEventObserver;
        if (C20606115kB.LIZJ) {
            lifecycleOwner.getLifecycle().addObserver(lifecycleEventObserver);
        }
        this.LLJJIJI = EnumC995420c0i.Default;
        this.LLJJIJIL = new ArrayList();
        this.LLJJJ = new ArrayList();
        this.LLJJJIL = new ArrayList();
        this.LLJJJJJIL = new C20600815jK<>();
        this.LLJJJJLIIL = C452501pT.LIZIZ(AFwS221S0000000_31.get$arr$(93));
        this.LLJJL = C452501pT.LIZIZ(new AwS575S0100000_31(this, 215));
        this.LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS575S0100000_31(this, 213));
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS575S0100000_31(this, 216));
        this.LLJL = c01gwLIZIZ;
        C11PQ<C20603715jn> c11pqLJLLLLLL = C11PQ.LJLLLLLL(new C20603715jn());
        this.LLJLIL = c11pqLJLLLLLL;
        this.LLJLILLLLZIIL = new C1891380zJo(recyclerView, this, C13BV.INSTANCE, (C1558530qex) c01gwLIZIZ.getValue(), c11pqLJLLLLLL, new AwS575S0100000_31(this, 214));
    }
}
