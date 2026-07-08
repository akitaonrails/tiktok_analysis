package com.ss.android.ugc.aweme.journey.step.trending;

import X.AnonymousClass0951;
import X.C01GW;
import X.C09IC;
import X.C09IR;
import X.C10H5;
import X.C10SV;
import X.C1393430mMf;
import X.C13BV;
import X.C13LP;
import X.C1459005nQ;
import X.C15438062q;
import X.C1673800tes;
import X.C1673830tev;
import X.C1673930tf5;
import X.C1673960tf8;
import X.C19241910Pp;
import X.C1BNE;
import X.C2252321DDq;
import X.C2252331DDr;
import X.C23250099c;
import X.C2344009Gk;
import X.C452501pT;
import X.C512401z8;
import X.C786410Ut5;
import X.EnumC1673820teu;
import X.EnumC992200bvW;
import Y.AComparatorS43S0000000_24;
import android.os.SystemClock;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.lang.ref.WeakReference;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes26.dex */
public final class FollowCreatorsViewModel extends ViewModel {
    public final C2252321DDq LL;
    public final AnonymousClass0951 LLILLJJLI;
    public final C2252331DDr LLILLL;
    public final Set<String> LLILZ;
    public final Map<String, Set<String>> LLILZIL;
    public final Map<String, String> LLILZLL;
    public final C01GW LLIZ;
    public int LLIZLLLIL;
    public long LLJ;
    public boolean LLJI;
    public WeakReference<Fragment> LLJIJIL;

    public FollowCreatorsViewModel() {
        C2252321DDq c2252321DDqLIZ = C1BNE.LIZ(new C1673830tev(C13BV.INSTANCE, 0, false, null, EnumC992200bvW.ONLY_SKIP_ENABLED));
        this.LL = c2252321DDqLIZ;
        this.LLILLJJLI = C09IC.LIZIZ(c2252321DDqLIZ);
        this.LLILLL = C09IR.LIZIZ(0, 0, null, 7);
        this.LLILZ = new LinkedHashSet();
        this.LLILZIL = new LinkedHashMap();
        this.LLILZLL = new LinkedHashMap();
        this.LLIZ = C452501pT.LIZIZ(AFwS214S0000000_25.get$arr$(116));
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), null, null, new C1459005nQ(this, null), 3);
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), null, null, new C1673960tf8(this, null), 3);
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), null, null, new C1673930tf5(this, null), 3);
    }

    public final void wQ2(String str) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("ui_type", "page");
        C10SV.LIZ(c2344009Gk);
        c2344009Gk.LIZLLL(SystemClock.uptimeMillis() - this.LLJ, "stay_time");
        c2344009Gk.LJIIIIZZ("exit_method", str);
        c2344009Gk.LIZJ(this.LLIZLLLIL, "scroll_activity_cnt");
        c2344009Gk.LIZJ(this.LLILZ.size(), "show_creator_cnt");
        c2344009Gk.LIZJ(this.LLILZIL.size(), "select_creator_cnt");
        c2344009Gk.LJIIIIZZ("creators_show_list", C13LP.LJJLIIIJ(this.LLILZ, ",", null, null, 0, null, null, 62));
        c2344009Gk.LJIIIIZZ("creators_list", C13LP.LJJLIIIJ(((LinkedHashMap) this.LLILZIL).keySet(), ",", null, null, 0, null, null, 62));
        C10SV.LIZIZ(C10H5.EXIT_TRENDING_CREATORS, c2344009Gk.LIZ);
    }

    public static List yQ2(List list, Map map) {
        boolean z;
        Integer num;
        List<Pair<String, String>> listLLIIII;
        C19241910Pp.LIZ.getClass();
        if (C19241910Pp.LIZIZ()) {
            ArrayList arrayList = new ArrayList();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator it2 = map.entrySet().iterator();
            while (it2.hasNext()) {
                for (C1673800tes c1673800tes : (List) ((Map.Entry) it2.next()).getValue()) {
                    String str = c1673800tes.LIZ;
                    Object linkedHashSet2 = linkedHashMap.get(str);
                    if (linkedHashSet2 == null) {
                        linkedHashSet2 = new LinkedHashSet();
                        linkedHashMap.put(str, linkedHashSet2);
                    }
                    ((AbstractCollection) linkedHashSet2).addAll(c1673800tes.LIZJ);
                }
            }
            Iterator it3 = map.entrySet().iterator();
            while (it3.hasNext()) {
                for (C1673800tes c1673800tes2 : (List) ((Map.Entry) it3.next()).getValue()) {
                    if (linkedHashSet.add(c1673800tes2.LIZ)) {
                        LinkedHashSet linkedHashSet3 = (LinkedHashSet) linkedHashMap.get(c1673800tes2.LIZ);
                        if (linkedHashSet3 == null || (listLLIIII = C13LP.LLIIII(linkedHashSet3)) == null) {
                            listLLIIII = c1673800tes2.LIZJ;
                        }
                        arrayList.add(C1673800tes.LIZ(c1673800tes2, listLLIIII, 0, 251));
                    }
                }
            }
            return arrayList;
        }
        if (list != null && !list.isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        Set setLLIIJI = null;
        if (!z) {
            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator it4 = list.iterator();
            while (it4.hasNext()) {
                arrayList2.add(a0.LJLIIIL((String) it4.next()).toString().toLowerCase(Locale.ROOT));
            }
            setLLIIJI = C13LP.LLIIJI(arrayList2);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        ArrayList arrayList3 = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            Pair pair = (Pair) entry.getKey();
            List<C1673800tes> list2 = (List) entry.getValue();
            String lowerCase = a0.LJLIIIL((String) pair.getFirst()).toString().toLowerCase(Locale.ROOT);
            if (setLLIIJI != null && !setLLIIJI.contains(lowerCase)) {
                arrayList3.addAll(list2);
            } else {
                for (C1673800tes c1673800tes3 : list2) {
                    String str2 = c1673800tes3.LIZ;
                    Object pair2 = linkedHashMap2.get(str2);
                    if (pair2 == null) {
                        pair2 = new Pair(c1673800tes3, new LinkedHashSet());
                        linkedHashMap2.put(str2, pair2);
                    }
                    Pair pair3 = (Pair) pair2;
                    Object first = pair3.getFirst();
                    Set set = (Set) pair3.getSecond();
                    set.add(pair);
                    linkedHashMap2.put(c1673800tes3.LIZ, new Pair(first, set));
                }
            }
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
            Object key = entry2.getKey();
            Pair pair4 = (Pair) entry2.getValue();
            C1673800tes c1673800tes4 = (C1673800tes) pair4.getFirst();
            Set set2 = (Set) pair4.getSecond();
            if (!set2.isEmpty()) {
                linkedHashMap3.put(key, C1673800tes.LIZ(c1673800tes4, C13LP.LJLLLL(new C512401z8(10), C13LP.LLIIII(set2)), 0, 251));
            }
        }
        linkedHashMap3.isEmpty();
        LinkedHashMap linkedHashMap4 = new LinkedHashMap();
        for (C1673800tes c1673800tes5 : linkedHashMap3.values()) {
            Iterator<Pair<String, String>> it5 = c1673800tes5.LIZJ.iterator();
            while (it5.hasNext()) {
                String first2 = it5.next().getFirst();
                Object arrayList4 = linkedHashMap4.get(first2);
                if (arrayList4 == null) {
                    arrayList4 = new ArrayList();
                    linkedHashMap4.put(first2, arrayList4);
                }
                ((List) arrayList4).add(c1673800tes5);
            }
        }
        linkedHashMap4.isEmpty();
        List listLJLLLL = C13LP.LJLLLL(new C512401z8(9), linkedHashMap4.entrySet());
        ArrayList<List> arrayList5 = new ArrayList(C15438062q.LJIJJ(listLJLLLL, 10));
        Iterator it6 = listLJLLLL.iterator();
        while (it6.hasNext()) {
            arrayList5.add(((Map.Entry) it6.next()).getValue());
        }
        ArrayList arrayList6 = new ArrayList();
        LinkedHashSet linkedHashSet4 = new LinkedHashSet();
        Iterator it7 = arrayList5.iterator();
        if (it7.hasNext()) {
            Integer numValueOf = Integer.valueOf(((List) it7.next()).size());
            loop11: while (true) {
                num = numValueOf;
                while (it7.hasNext()) {
                    numValueOf = Integer.valueOf(((List) it7.next()).size());
                    if (num.compareTo(numValueOf) < 0) {
                        break;
                    }
                }
            }
            if (num != null) {
                int iIntValue = num.intValue();
                for (int i = 0; i < iIntValue; i++) {
                    for (List list3 : arrayList5) {
                        if (i < list3.size()) {
                            C1673800tes c1673800tes6 = (C1673800tes) ListProtector.get(list3, i);
                            if (linkedHashSet4.add(c1673800tes6.LIZ)) {
                                arrayList6.add(c1673800tes6);
                            }
                        }
                    }
                }
            }
        }
        arrayList6.addAll(C13LP.LJLLLL(new AComparatorS43S0000000_24(1), arrayList3));
        return arrayList6;
    }

    public final void xQ2(Function0 function0, boolean z) {
        String str;
        if (z) {
            C1393430mMf c1393430mMf = C1393430mMf.LIZ;
            Map<String, Set<String>> map = this.LLILZIL;
            c1393430mMf.getClass();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : ((LinkedHashMap) map).entrySet()) {
                Object key = entry.getKey();
                for (Object obj : (Set) entry.getValue()) {
                    Object linkedHashSet = linkedHashMap.get(obj);
                    if (linkedHashSet == null) {
                        linkedHashSet = new LinkedHashSet();
                        linkedHashMap.put(obj, linkedHashSet);
                    }
                    ((Set) linkedHashSet).add(key);
                }
            }
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                Object key2 = entry2.getKey();
                Set set = (Set) entry2.getValue();
                ((ArrayList) C1393430mMf.LIZIZ).add(new Pair(C786410Ut5.j4("selected_creators_{%s}", Arrays.copyOf(new Object[]{key2}, 1)), C13LP.LJJLIIIJ(set, ",", null, null, 0, null, null, 62)));
            }
            str = "done";
        } else {
            str = "skip";
        }
        this.LLJI = true;
        wQ2(str);
        function0.invoke();
    }

    public final void zQ2(C1673800tes c1673800tes, EnumC1673820teu enumC1673820teu) {
        if (enumC1673820teu == EnumC1673820teu.TO_FOLLOW) {
            this.LLILZIL.remove(c1673800tes.LIZ);
            return;
        }
        Map<String, Set<String>> map = this.LLILZIL;
        String str = c1673800tes.LIZ;
        LinkedHashMap linkedHashMap = (LinkedHashMap) map;
        if (linkedHashMap.get(str) != null) {
            return;
        }
        List<Pair<String, String>> list = c1673800tes.LIZJ;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator<Pair<String, String>> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next().getFirst());
        }
        linkedHashMap.put(str, C13LP.LLIIJI(arrayList));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.CharSequence, java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object] */
    public final List vQ2(int i, List list, List list2) {
        int i2;
        ArrayList<C1673800tes> arrayList = new ArrayList();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        C19241910Pp.LIZ.getClass();
        if (C19241910Pp.LIZIZ()) {
            i2 = Integer.MAX_VALUE;
        } else {
            i2 = 50;
        }
        if (i >= 0) {
            for (int i3 = 0; i3 < list.size() && arrayList.size() < i2; i3++) {
                C1673800tes c1673800tes = (C1673800tes) ListProtector.get(list, i3);
                if (linkedHashSet.add(c1673800tes.LIZ)) {
                    arrayList.add(c1673800tes);
                }
                if (i3 == i) {
                    break;
                }
            }
        }
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            C1673800tes c1673800tes2 = (C1673800tes) it2.next();
            if (arrayList.size() >= i2) {
                break;
            }
            if (linkedHashSet.add(c1673800tes2.LIZ)) {
                arrayList.add(c1673800tes2);
            }
        }
        if (arrayList.size() < i2) {
            int size = list.size();
            for (int i4 = i + 1; i4 < size && arrayList.size() < i2; i4++) {
                C1673800tes c1673800tes3 = (C1673800tes) ListProtector.get(list, i4);
                if (linkedHashSet.add(c1673800tes3.LIZ)) {
                    arrayList.add(c1673800tes3);
                }
            }
        }
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
        for (C1673800tes c1673800tes4 : arrayList) {
            ArrayList arrayList3 = new ArrayList();
            for (Pair<String, String> pair : c1673800tes4.LIZJ) {
                String second = pair.getSecond();
                if (a0.LJJJIL(second)) {
                    second = ((LinkedHashMap) this.LLILZLL).get(pair.getFirst());
                    if (second == 0) {
                        second = pair.getFirst();
                    }
                }
                arrayList3.add(new Pair(pair.getFirst(), second));
            }
            arrayList2.add(C1673800tes.LIZ(c1673800tes4, arrayList3, 0, 251));
        }
        return arrayList2;
    }
}
