package myl;

import X.AbstractC1651450t4p;
import X.AnonymousClass0951;
import X.C05YD;
import X.C09IC;
import X.C13BV;
import X.C13LP;
import X.C1459900o5s;
import X.C15438062q;
import X.C1651470t4r;
import X.C1651510t4v;
import X.C1651520t4w;
import X.C1BNE;
import X.C1ETD;
import X.C201955140j;
import X.C2188811AlT;
import X.C2252321DDq;
import X.C385670FAf;
import X.C540930LJj;
import X.EnumC1651310t4b;
import X.InterfaceC1651320t4c;
import X.InterfaceC1651340t4e;
import X.InterfaceC1651490t4t;
import X.InterfaceC1651540t4y;
import X.InterfaceC1659130tHD;
import X.InterfaceC577590Ml3;
import Y.AComparatorS522S0100000_25;
import com.bytedance.als.h0;
import defpackage.Config;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes26.dex */
public final class c implements InterfaceC1651490t4t {
    public final InterfaceC1651340t4e LIZ;
    public final C2252321DDq LIZIZ = C1BNE.LIZ(C13BV.INSTANCE);
    public final Map<InterfaceC1651320t4c<?>, C1651520t4w> LIZJ = new LinkedHashMap();
    public final Map<EnumC1651310t4b, List<InterfaceC1651320t4c<?>>> LIZLLL = new LinkedHashMap();
    public final Map<InterfaceC1651320t4c<?>, AbstractC1651450t4p<?, ?>> LJ = new LinkedHashMap();
    public final Map<InterfaceC1651540t4y<?>, h0<?>> LJFF = new LinkedHashMap();
    public final AnonymousClass0951 LJI;
    public boolean LJII;

    @Override // X.InterfaceC1651490t4t
    public final void LJFF() {
        Iterator it2 = ((LinkedHashMap) this.LJ).values().iterator();
        while (it2.hasNext()) {
            ((AbstractC1651450t4p) it2.next()).LJIIJ();
        }
    }

    public final void LJII() {
        if (this.LJII) {
            return;
        }
        this.LIZIZ.setValue(C13LP.LLIIII(((LinkedHashMap) this.LIZJ).values()));
    }

    @Override // X.InterfaceC1651490t4t
    public final C05YD<List<C1651520t4w>> LIZLLL() {
        return this.LJI;
    }

    @Override // X.InterfaceC1651490t4t
    public final void LIZ(Function1<? super InterfaceC577590Ml3, Unit> function1) {
        this.LJII = true;
        C1651510t4v c1651510t4v = new C1651510t4v(this);
        function1.invoke(c1651510t4v);
        for (Map.Entry entry : ((LinkedHashMap) c1651510t4v.LIZ).entrySet()) {
            C1651520t4w c1651520t4w = (C1651520t4w) ((LinkedHashMap) this.LIZJ).get(entry.getKey());
            if (c1651520t4w != null) {
                this.LIZJ.put((InterfaceC1651320t4c<?>) entry.getKey(), C1651520t4w.LIZ(c1651520t4w, entry.getValue()));
            }
        }
        ((LinkedHashMap) c1651510t4v.LIZ).clear();
        this.LJII = false;
        LJII();
    }

    @Override // X.InterfaceC1651490t4t
    public final <T> C385670FAf<T> LIZIZ(InterfaceC1651540t4y<T> interfaceC1651540t4y) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJFF;
        Object h0Var = linkedHashMap.get(interfaceC1651540t4y);
        if (h0Var == null) {
            h0Var = new h0(interfaceC1651540t4y.getDefaultValue());
            linkedHashMap.put(interfaceC1651540t4y, h0Var);
        }
        return (C385670FAf) h0Var;
    }

    @Override // X.InterfaceC1651490t4t
    public final <STATE extends C1ETD, TYPE extends InterfaceC1651320t4c<? extends STATE>> STATE LIZJ(TYPE type) {
        Object obj;
        C1651520t4w c1651520t4w = (C1651520t4w) ((LinkedHashMap) this.LIZJ).get(type);
        if (c1651520t4w != null) {
            obj = c1651520t4w.LIZJ;
        } else {
            obj = null;
        }
        if (!(obj instanceof C1ETD)) {
            return null;
        }
        return (STATE) obj;
    }

    public c(List<C1651470t4r> list, InterfaceC1651340t4e interfaceC1651340t4e) {
        this.LIZ = interfaceC1651340t4e;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        for (C1651470t4r c1651470t4r : (ArrayList) list) {
            AbstractC1651450t4p<C1ETD, InterfaceC1659130tHD<Object>> abstractC1651450t4pInvoke = c1651470t4r.LIZJ.invoke();
            if (linkedHashSet.add(abstractC1651450t4pInvoke.LJIIIZ())) {
                this.LJ.put(abstractC1651450t4pInvoke.LJIIIZ(), abstractC1651450t4pInvoke);
                arrayList.add(new C1651520t4w(abstractC1651450t4pInvoke.LJIIIZ(), abstractC1651450t4pInvoke.LJII(), abstractC1651450t4pInvoke.LJI().invoke(), c1651470t4r.LIZ, abstractC1651450t4pInvoke.LJ(), c1651470t4r.LIZIZ));
            } else {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Duplicated toolbar item type(key=");
                sbLIZ.append(abstractC1651450t4pInvoke.LJIIIZ().getKey());
                sbLIZ.append(')');
                throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (((C1651520t4w) obj).LIZIZ == EnumC1651310t4b.FIXED) {
                arrayList2.add(obj);
            }
        }
        List<C1651520t4w> listLJLLLL = C13LP.LJLLLL(new AComparatorS522S0100000_25(this, 4), arrayList2);
        Map<EnumC1651310t4b, List<InterfaceC1651320t4c<?>>> map = this.LIZLLL;
        EnumC1651310t4b enumC1651310t4b = EnumC1651310t4b.FIXED;
        ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(listLJLLLL, 10));
        Iterator it2 = listLJLLLL.iterator();
        while (it2.hasNext()) {
            arrayList3.add(((C1651520t4w) it2.next()).LIZ);
        }
        map.put(enumC1651310t4b, arrayList3);
        for (C1651520t4w c1651520t4w : listLJLLLL) {
            this.LIZJ.put(c1651520t4w.LIZ, c1651520t4w);
        }
        ArrayList arrayList4 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (((C1651520t4w) obj2).LIZIZ == EnumC1651310t4b.SLIDE) {
                arrayList4.add(obj2);
            }
        }
        List<C1651520t4w> listLJLLLL2 = C13LP.LJLLLL(new AComparatorS522S0100000_25(this, 5), arrayList4);
        Map<EnumC1651310t4b, List<InterfaceC1651320t4c<?>>> map2 = this.LIZLLL;
        EnumC1651310t4b enumC1651310t4b2 = EnumC1651310t4b.SLIDE;
        ArrayList arrayList5 = new ArrayList(C15438062q.LJIJJ(listLJLLLL2, 10));
        Iterator it3 = listLJLLLL2.iterator();
        while (it3.hasNext()) {
            arrayList5.add(((C1651520t4w) it3.next()).LIZ);
        }
        map2.put(enumC1651310t4b2, arrayList5);
        for (C1651520t4w c1651520t4w2 : listLJLLLL2) {
            this.LIZJ.put(c1651520t4w2.LIZ, c1651520t4w2);
        }
        LJII();
        this.LJI = C09IC.LIZIZ(this.LIZIZ);
    }

    @Override // X.InterfaceC1651490t4t
    public final <STATE extends C1ETD, TYPE extends InterfaceC1651320t4c<? extends STATE>> void LJ(TYPE type, Function1<? super STATE, ? extends STATE> function1) {
        C1651520t4w c1651520t4w = (C1651520t4w) ((LinkedHashMap) this.LIZJ).get(type);
        if (c1651520t4w != null) {
            Config config = (Object) c1651520t4w.LIZJ;
            STATE stateInvoke = function1.invoke(config);
            if (!Intrinsics.LJFF(stateInvoke, config)) {
                this.LIZJ.put(type, C1651520t4w.LIZ(c1651520t4w, stateInvoke));
                LJII();
                return;
            }
            return;
        }
        C1459900o5s c1459900o5s = C1459900o5s.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("update an unregistered ToolbarItem(type=");
        sbLIZ.append(type.getKey());
        C201955140j.LJIJI(c1459900o5s, C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.InterfaceC1651490t4t
    public final <T> void LJI(InterfaceC1651540t4y<T> interfaceC1651540t4y, T t) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJFF;
        Object h0Var = linkedHashMap.get(interfaceC1651540t4y);
        if (h0Var == null) {
            h0Var = new h0(interfaceC1651540t4y.getDefaultValue());
            linkedHashMap.put(interfaceC1651540t4y, h0Var);
        }
        ((C540930LJj) h0Var).LJII(t);
    }
}
