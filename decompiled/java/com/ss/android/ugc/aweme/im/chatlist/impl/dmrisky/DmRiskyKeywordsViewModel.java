package com.ss.android.ugc.aweme.im.chatlist.impl.dmrisky;

import X.AbstractC894510Z7h;
import X.C01GW;
import X.C054G;
import X.C09A1;
import X.C0I0B;
import X.C0PEM;
import X.C13BV;
import X.C13LP;
import X.C15438062q;
import X.C1954807lC;
import X.C1BNE;
import X.C1DFB;
import X.C20684815ws;
import X.C2252321DDq;
import X.C2296808zG;
import X.C2296908zH;
import X.C23250099c;
import X.C452501pT;
import X.C894480Z7e;
import X.C894490Z7f;
import X.C894500Z7g;
import X.C894520Z7i;
import X.C894540Z7k;
import X.EnumC894560Z7m;
import androidx.lifecycle.ViewModel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.im.service.risky.IDMRiskyKeywordsService;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS201S0000000_14;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes15.dex */
public class DmRiskyKeywordsViewModel extends ViewModel {
    public final C2252321DDq LL;
    public final C2252321DDq LLILLJJLI;
    public boolean LLILLL;
    public boolean LLILZ;
    public EnumC894560Z7m LLILZIL;
    public final C01GW LLILZLL;

    public DmRiskyKeywordsViewModel() {
        this(0);
    }

    public DmRiskyKeywordsViewModel(int i) {
        C1DFB c1dfb = C0PEM.LIZJ;
        C2252321DDq c2252321DDqLIZ = C1BNE.LIZ(C894520Z7i.LIZ);
        this.LL = c2252321DDqLIZ;
        this.LLILLJJLI = c2252321DDqLIZ;
        C054G c054gLIZ = C2296808zG.LIZ(C09A1.LIZLLL(C2296908zH.LIZ(), c1dfb));
        this.LLILZLL = C452501pT.LIZIZ(AFwS201S0000000_14.get$arr$(537));
        C23250099c.LIZLLL(c054gLIZ, null, null, new C894480Z7e(this, null), 3);
    }

    public final boolean wQ2(String str) {
        C894500Z7g c894500Z7g;
        List<String> list;
        Object value = this.LL.getValue();
        if ((value instanceof C894500Z7g) && (c894500Z7g = (C894500Z7g) value) != null && (list = c894500Z7g.LIZ) != null && list.contains(str)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v23, types: [com.ss.android.ugc.aweme.im.service.risky.IDMRiskyKeywordsService] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v5, types: [X.13BV] */
    public final void yQ2(EnumC894560Z7m enumC894560Z7m) {
        ?? arrayList;
        if (this.LLILZ && this.LLILLL) {
            AbstractC894510Z7h abstractC894510Z7h = (AbstractC894510Z7h) this.LL.getValue();
            if (abstractC894510Z7h instanceof C894520Z7i) {
                arrayList = C13BV.INSTANCE;
            } else if (abstractC894510Z7h instanceof C894500Z7g) {
                List<String> list = ((C894500Z7g) abstractC894510Z7h).LIZ;
                ArrayList arrayList2 = new ArrayList();
                for (String str : list) {
                    if (!a0.LJJJIL(a0.LJLJJL(str).toString())) {
                        arrayList2.add(str);
                    }
                }
                arrayList = new ArrayList(C15438062q.LJIJJ(arrayList2, 10));
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    arrayList.add(a0.LJLIIIL((String) it2.next()).toString());
                }
            } else {
                throw new C1954807lC();
            }
            ((IDMRiskyKeywordsService) this.LLILZLL.getValue()).LJFF(arrayList);
            int size = arrayList.size();
            C0I0B.LJFF.LIZIZ();
            C20684815ws.LJIILLIIL("save_dm_filtered_keywords", C894490Z7f.LIZ(new Pair("enter_method", C894540Z7k.LIZIZ(enumC894560Z7m)), new Pair("saved_filtered_keywords_cnt", String.valueOf(size))));
            this.LLILLL = false;
        }
    }

    public final void vQ2(String str, EnumC894560Z7m enumC894560Z7m) {
        Iterable iterable;
        this.LLILLL = true;
        this.LLILZIL = enumC894560Z7m;
        C0I0B.LJFF.LIZIZ();
        C20684815ws.LJIILLIIL("add_dm_filtered_keyword", C894490Z7f.LIZ(new Pair("enter_method", C894540Z7k.LIZIZ(enumC894560Z7m))));
        AbstractC894510Z7h abstractC894510Z7h = (AbstractC894510Z7h) this.LL.getValue();
        if (abstractC894510Z7h instanceof C894520Z7i) {
            iterable = C13BV.INSTANCE;
        } else if (abstractC894510Z7h instanceof C894500Z7g) {
            iterable = ((C894500Z7g) abstractC894510Z7h).LIZ;
        } else {
            throw new C1954807lC();
        }
        C2252321DDq c2252321DDq = this.LL;
        while (!c2252321DDq.compareAndSet(c2252321DDq.getValue(), new C894500Z7g(C13LP.LJLIL(iterable, Collections.singletonList(str))))) {
        }
    }

    public final void xQ2(int i, EnumC894560Z7m enumC894560Z7m) {
        Object value;
        ArrayList arrayList;
        this.LLILLL = true;
        this.LLILZIL = enumC894560Z7m;
        C0I0B.LJFF.LIZIZ();
        C20684815ws.LJIILLIIL("remove_dm_filtered_keyword", C894490Z7f.LIZ(new Pair("enter_method", C894540Z7k.LIZIZ(enumC894560Z7m))));
        AbstractC894510Z7h abstractC894510Z7h = (AbstractC894510Z7h) this.LL.getValue();
        if (!(abstractC894510Z7h instanceof C894520Z7i)) {
            if (abstractC894510Z7h instanceof C894500Z7g) {
                C2252321DDq c2252321DDq = this.LL;
                do {
                    value = c2252321DDq.getValue();
                    arrayList = new ArrayList(((C894500Z7g) abstractC894510Z7h).LIZ);
                    ListProtector.remove(arrayList, i);
                } while (!c2252321DDq.compareAndSet(value, new C894500Z7g(arrayList)));
                return;
            }
            throw new C1954807lC();
        }
    }
}
