package com.ss.android.ugc.tiktok.im.contact.selector.impl.vm;

import X.AbstractC1223800hx4;
import X.C01GW;
import X.C08QL;
import X.C08QP;
import X.C09RB;
import X.C1158980gGW;
import X.C1223620hwm;
import X.C1224280hxq;
import X.C1224840hyk;
import X.C13BV;
import X.C13LP;
import X.C15438062q;
import X.C1554610qYd;
import X.C1697810uHb;
import X.C1939607ik;
import X.C2097908Jt;
import X.C2188811AlT;
import X.C291001Au;
import X.EnumC1224390hy1;
import X.InterfaceC0148002o;
import X.InterfaceC1224160hxe;
import X.InterfaceC1224320hxu;
import X.InterfaceC1224370hxz;
import X.InterfaceC665370Q7z;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.tiktok.im.contact.selector.impl.protocol.SelectorTabFragmentAbilityProtocol;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.AwS33S0010000_19;
import kotlin.jvm.internal.AwS598S0100000_19;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class SelectorContentPageContainerVM extends AssemViewModel<C1158980gGW> implements InterfaceC1224160hxe {
    public final InterfaceC1224370hxz LL;
    public final InterfaceC1224320hxu LLILLJJLI;
    public boolean LLILZLL;
    public Function0<? extends Map<String, ? extends SelectorTabFragmentAbilityProtocol>> LLJ;
    public InterfaceC665370Q7z LLJI;
    public final C01GW LLILLL = C1223620hwm.LJ(this);
    public final Map<String, List<AbstractC1223800hx4>> LLILZ = new LinkedHashMap();
    public final Map<String, List<C1224840hyk>> LLILZIL = new LinkedHashMap();
    public final Map<String, Boolean> LLIZ = new LinkedHashMap();
    public String LLIZLLLIL = "";

    @Override // X.InterfaceC1224160hxe
    public final void hg0() {
    }

    @Override // X.InterfaceC1224160hxe
    public final Set<C1224840hyk> Ft() {
        return this.LLILLJJLI.Ft();
    }

    @Override // X.InterfaceC1224160hxe
    public final void Jj2() {
        this.LL.LJJIL();
    }

    @Override // X.InterfaceC1224160hxe
    public final Set<String> LO() {
        Set<C1224840hyk> setHA1 = this.LLILLJJLI.hA1();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<T> it2 = setHA1.iterator();
        while (it2.hasNext()) {
            linkedHashSet.add(((C1224840hyk) it2.next()).LLILZ);
        }
        return linkedHashSet;
    }

    @Override // X.InterfaceC1224160hxe
    public final int Vb() {
        return this.LLILLJJLI.Vb();
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        Unit unit = Unit.LIZ;
        return new C1158980gGW(new C291001Au(unit), new C291001Au(unit), false);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final void onPrepared() {
        this.LLILLL.getValue();
    }

    public final void vQ2() {
        ((LinkedHashMap) this.LLILZ).clear();
        ((LinkedHashMap) this.LLILZIL).clear();
        this.LLILZLL = false;
        ((LinkedHashMap) this.LLIZ).clear();
        this.LLIZLLLIL = "";
        setState(new AwS598S0100000_19(this, 507));
    }

    @Override // X.InterfaceC1224160hxe
    public final Map<String, List<C1224840hyk>> Ty2() {
        return this.LLILZIL;
    }

    @Override // X.InterfaceC1224160hxe
    public final Map<String, List<AbstractC1223800hx4>> p60() {
        return this.LLILZ;
    }

    @Override // X.InterfaceC1224160hxe
    public final void GI0(String str) {
        this.LLIZLLLIL = str;
        if (Intrinsics.LJFF(((LinkedHashMap) this.LLIZ).get(str), Boolean.TRUE) && !this.LLILZLL) {
            setState(AFwS257S0000000_19.get$arr$(676));
            this.LLILZLL = true;
        }
    }

    @Override // X.InterfaceC1224160hxe
    public final void j21(boolean z) {
        setState(new AwS33S0010000_19(z, 10));
    }

    @Override // X.InterfaceC1224160hxe
    public final List<AbstractC1223800hx4> j30(String str) {
        List<AbstractC1223800hx4> list = (List) ((LinkedHashMap) this.LLILZ).get(str);
        if (list == null) {
            return C13BV.INSTANCE;
        }
        return list;
    }

    @Override // X.InterfaceC1224160hxe
    public final void lz2(String str) {
        this.LLIZ.put(str, Boolean.TRUE);
        if (Intrinsics.LJFF(this.LLIZLLLIL, str) && !this.LLILZLL) {
            setState(AFwS257S0000000_19.get$arr$(676));
            this.LLILZLL = true;
        }
    }

    public SelectorContentPageContainerVM(InterfaceC1224370hxz interfaceC1224370hxz, InterfaceC1224320hxu interfaceC1224320hxu) {
        this.LL = interfaceC1224370hxz;
        this.LLILLJJLI = interfaceC1224320hxu;
    }

    @Override // X.InterfaceC1224160hxe
    public final void BL1(String str, List<? extends AbstractC1223800hx4> list) {
        ArrayList arrayList;
        Object next;
        if (list != null) {
            arrayList = new ArrayList();
            for (AbstractC1223800hx4 abstractC1223800hx4 : list) {
                if (abstractC1223800hx4 instanceof C1224840hyk) {
                    arrayList.add(abstractC1223800hx4);
                }
            }
        } else {
            arrayList = null;
        }
        Objects.toString(arrayList);
        if (list == null) {
            return;
        }
        C08QP c08qp = new C08QP(C09RB.LJIIIZ(C09RB.LJIIIZ(new C1939607ik(list), new Function1<Object, Boolean>() { // from class: X.0hyC
            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(Object obj) {
                return Boolean.valueOf(obj instanceof C1224840hyk);
            }
        }), AFwS257S0000000_19.get$arr$(530)), AFwS257S0000000_19.get$arr$(531));
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it2 = c08qp.iterator();
        while (true) {
            C08QL c08ql = (C08QL) it2;
            if (!c08ql.hasNext()) {
                break;
            } else {
                linkedHashSet.add(c08ql.next());
            }
        }
        Set set = linkedHashSet;
        if (!this.LLILLJJLI.Ft().isEmpty()) {
            Set setLLIIIZ = C13LP.LLIIIZ(this.LLILLJJLI.Ft());
            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(setLLIIIZ, 10));
            Iterator it3 = setLLIIIZ.iterator();
            while (it3.hasNext()) {
                arrayList2.add(((C1224840hyk) it3.next()).LLILZ);
            }
            ArrayList arrayList3 = new ArrayList();
            for (Object obj : linkedHashSet) {
                if (!arrayList2.contains(((C1224840hyk) obj).LLILZ)) {
                    arrayList3.add(obj);
                }
            }
            setLLIIIZ.addAll(arrayList3);
            set = setLLIIIZ;
        }
        oq1(true, set);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ArrayList arrayList4 = new ArrayList();
        for (AbstractC1223800hx4 abstractC1223800hx42 : list) {
            if (abstractC1223800hx42 instanceof C1224840hyk) {
                arrayList4.add(abstractC1223800hx42);
            }
        }
        for (Map.Entry entry : ((LinkedHashMap) this.LLILZ).entrySet()) {
            ArrayList arrayList5 = new ArrayList();
            if (!Intrinsics.LJFF(entry.getKey(), str)) {
                for (AbstractC1223800hx4 abstractC1223800hx43 : (List) entry.getValue()) {
                    if (abstractC1223800hx43 instanceof C1224840hyk) {
                        Iterator it4 = arrayList4.iterator();
                        while (true) {
                            if (it4.hasNext()) {
                                next = it4.next();
                                if (Intrinsics.LJFF(((C1224840hyk) next).LLILZ, ((C1224840hyk) abstractC1223800hx43).LLILZ)) {
                                    break;
                                }
                            } else {
                                next = null;
                                break;
                            }
                        }
                        C1224840hyk c1224840hyk = (C1224840hyk) next;
                        if (c1224840hyk != null) {
                            arrayList5.add(C1224840hyk.LIZ((C1224840hyk) abstractC1223800hx43, null, null, c1224840hyk.LLJ, null, null, c1224840hyk.LLJILJIL, c1224840hyk.LLJILJILJ, c1224840hyk.LLJILLL, c1224840hyk.LLJJ, false, 34559));
                        } else {
                            if (((C1224280hxq) this.LLILLL.getValue()).LJ().LJJIZ().LIZJ() == EnumC1224390hy1.MULTIPLE && ((C1224280hxq) this.LLILLL.getValue()).LJ().LJJIZ().LIZIZ() <= this.LLILLJJLI.Vb()) {
                                C1224840hyk c1224840hyk2 = (C1224840hyk) abstractC1223800hx43;
                                if (!c1224840hyk2.LLJILJILJ && !c1224840hyk2.LLJILJIL) {
                                    if (((C1224280hxq) this.LLILLL.getValue()).LJ().LJJIZ().LIZ()) {
                                        arrayList5.add(C1224840hyk.LIZ(c1224840hyk2, null, null, false, null, null, false, true, false, false, false, 61183));
                                    } else {
                                        arrayList5.add(C1224840hyk.LIZ(c1224840hyk2, null, null, false, null, null, false, true, false, false, false, 61439));
                                    }
                                }
                            }
                            arrayList5.add(abstractC1223800hx43);
                        }
                    } else {
                        arrayList5.add(abstractC1223800hx43);
                    }
                }
                linkedHashMap.put(entry.getKey(), arrayList5);
            } else {
                linkedHashMap.put(str, list);
            }
            this.LLILLJJLI.Vb();
            entry.getKey();
            ArrayList arrayList6 = new ArrayList();
            for (Object obj2 : arrayList5) {
                if (obj2 instanceof C1224840hyk) {
                    arrayList6.add(obj2);
                }
            }
        }
        if (!linkedHashMap.containsKey(str)) {
            linkedHashMap.put(str, list);
        }
        hs0(Collections.singletonList(str), linkedHashMap);
        setState(AFwS257S0000000_19.get$arr$(529));
    }

    @Override // X.InterfaceC1224160hxe
    public final void dV1(final SelectorTabFragmentAbilityProtocol selectorTabFragmentAbilityProtocol, LifecycleOwner lifecycleOwner) {
        final InterfaceC665370Q7z interfaceC665370Q7z = this.LLJI;
        if (interfaceC665370Q7z != null) {
            C1554610qYd.LIZJ(interfaceC665370Q7z, SelectorTabFragmentAbilityProtocol.class, C1697810uHb.LJIILJJIL(selectorTabFragmentAbilityProtocol));
            Lifecycle lifecycle = lifecycleOwner.getLifecycle();
            if (lifecycle != null) {
                lifecycle.addObserver(new LifecycleEventObserver() { // from class: com.ss.android.ugc.tiktok.im.contact.selector.impl.vm.SelectorContentPageContainerVM$registerProtocolImpl$$inlined$registerProtocol$1
                    @Override // androidx.lifecycle.LifecycleEventObserver
                    public final void onStateChanged(LifecycleOwner lifecycleOwner2, Lifecycle.Event event) {
                        if (event == Lifecycle.Event.ON_DESTROY) {
                            C1554610qYd.LIZLLL(interfaceC665370Q7z, SelectorTabFragmentAbilityProtocol.class, selectorTabFragmentAbilityProtocol);
                        }
                    }
                });
            }
        }
    }

    @Override // X.InterfaceC1224160hxe
    public final void hs0(List list, Map map) {
        Map<String, ? extends SelectorTabFragmentAbilityProtocol> mapInvoke;
        ((LinkedHashMap) this.LLILZ).clear();
        ((LinkedHashMap) this.LLILZIL).clear();
        this.LLILZ.putAll(map);
        Map<String, List<C1224840hyk>> map2 = this.LLILZIL;
        Map<String, List<AbstractC1223800hx4>> map3 = this.LLILZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap(C2097908Jt.LIZIZ(map3.size()));
        for (Map.Entry entry : ((LinkedHashMap) map3).entrySet()) {
            Object key = entry.getKey();
            Iterable iterable = (Iterable) entry.getValue();
            ArrayList arrayList = new ArrayList();
            for (Object obj : iterable) {
                if (obj instanceof C1224840hyk) {
                    arrayList.add(obj);
                }
            }
            linkedHashMap.put(key, arrayList);
        }
        map2.putAll(linkedHashMap);
        Map<String, List<C1224840hyk>> map4 = this.LLILZIL;
        ArrayList arrayList2 = new ArrayList(map4.size());
        for (Map.Entry entry2 : ((LinkedHashMap) map4).entrySet()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("tab: ");
            sbLIZ.append((String) entry2.getKey());
            sbLIZ.append(", list: ");
            sbLIZ.append(((List) entry2.getValue()).size());
            arrayList2.add(C2188811AlT.LIZIZ(sbLIZ));
        }
        Function0<? extends Map<String, ? extends SelectorTabFragmentAbilityProtocol>> function0 = this.LLJ;
        if (function0 != null && (mapInvoke = function0.invoke()) != null) {
            for (Map.Entry<String, ? extends SelectorTabFragmentAbilityProtocol> entry3 : mapInvoke.entrySet()) {
                if (list == null || !list.contains(entry3.getKey())) {
                    List<? extends AbstractC1223800hx4> list2 = (List) ((LinkedHashMap) this.LLILZ).get(entry3.getKey());
                    if (list2 != null) {
                        entry3.getValue().Fn2(list2);
                    }
                }
            }
        }
    }

    public final void oq1(boolean z, Set set) {
        this.LLILLJJLI.oq1(z, set);
    }

    @Override // X.InterfaceC1224160hxe
    public final void ne0(int i, String str, boolean z) {
        Map<String, ? extends SelectorTabFragmentAbilityProtocol> mapInvoke;
        SelectorTabFragmentAbilityProtocol selectorTabFragmentAbilityProtocol;
        Function0<? extends Map<String, ? extends SelectorTabFragmentAbilityProtocol>> function0 = this.LLJ;
        if (function0 != null && (mapInvoke = function0.invoke()) != null && (selectorTabFragmentAbilityProtocol = mapInvoke.get(str)) != null) {
            selectorTabFragmentAbilityProtocol.gt2(i, z);
        }
    }

    public final void wQ2(String str, boolean z, List list) {
        Map<String, ? extends SelectorTabFragmentAbilityProtocol> mapInvoke;
        SelectorTabFragmentAbilityProtocol selectorTabFragmentAbilityProtocol;
        Function0<? extends Map<String, ? extends SelectorTabFragmentAbilityProtocol>> function0 = this.LLJ;
        if (function0 != null && (mapInvoke = function0.invoke()) != null && (selectorTabFragmentAbilityProtocol = mapInvoke.get(str)) != null) {
            selectorTabFragmentAbilityProtocol.MZ1(list, z);
        }
    }
}
