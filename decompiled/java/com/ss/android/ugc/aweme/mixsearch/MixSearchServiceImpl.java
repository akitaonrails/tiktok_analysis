package com.ss.android.ugc.aweme.mixsearch;

import X.C01GW;
import X.C0PEM;
import X.C1240850iOZ;
import X.C1336105Kt;
import X.C1697810uHb;
import X.C2097608Jq;
import X.C2232408os;
import X.C2296808zG;
import X.C2296908zH;
import X.C23250099c;
import X.C316810CbP;
import X.C452501pT;
import X.C786410Ut5;
import X.EnumC1240860iOa;
import X.InterfaceC1364105Vn;
import Y.AComparatorS516S0100000_19;
import com.ss.android.ugc.aweme.affinity.model.SocialAffinityItem;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS207S0000000_19;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.text.u;

/* JADX INFO: loaded from: classes20.dex */
public final class MixSearchServiceImpl implements IMixSearchService {
    public final List<IMUser> LIZ = new ArrayList();
    public final Map<String, SocialAffinityItem> LIZIZ = new LinkedHashMap();
    public final C2232408os LIZJ = new C2232408os(C786410Ut5.h4());
    public final C01GW LIZLLL = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(260));
    public final C01GW LJ = C452501pT.LIZIZ(new AwS563S0100000_19(this, 1615));

    @Override // com.ss.android.ugc.aweme.mixsearch.IMixSearchService
    public final void LIZIZ() {
    }

    @Override // com.ss.android.ugc.aweme.mixsearch.IMixSearchService
    public final void LIZ() {
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ.plus(C2296908zH.LIZ())), null, null, new C1336105Kt(this, null), 3);
    }

    public static AComparatorS516S0100000_19 LIZLLL(List list) {
        int i = 0;
        Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair(EnumC1240860iOa.PREFIX, 2), new Pair(EnumC1240860iOa.POST_DELIMITER, 2), new Pair(EnumC1240860iOa.SUBSTRING, 2));
        for (Object obj : list) {
            int i2 = i + 1;
            if (i >= 0) {
                List<String> list2 = (List) ((Map) obj).get("match_type");
                if (list2 != null) {
                    for (String str : list2) {
                        EnumC1240860iOa.Companion.getClass();
                        Iterator<EnumC1240860iOa> it2 = EnumC1240860iOa.getEntries().iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                EnumC1240860iOa next = it2.next();
                                if (u.LJIJI(next.name(), str, true)) {
                                    if (next != null) {
                                        mapLJIIJ.put(next, Integer.valueOf(i));
                                    }
                                }
                            }
                        }
                    }
                }
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        return new AComparatorS516S0100000_19(new AComparatorS516S0100000_19(mapLJIIJ, 9), 10);
    }

    @Override // com.ss.android.ugc.aweme.mixsearch.IMixSearchService
    public final Object LIZJ(String str, List<? extends Map<String, ? extends List<String>>> list, InterfaceC1364105Vn<? super C316810CbP> interfaceC1364105Vn) {
        Comparator comparatorLIZLLL;
        if (str.length() == 0) {
            return new C316810CbP(0);
        }
        if (list.isEmpty()) {
            comparatorLIZLLL = (Comparator) this.LJ.getValue();
        } else {
            comparatorLIZLLL = LIZLLL(list);
        }
        return C23250099c.LJI(interfaceC1364105Vn, this.LIZJ, new C1240850iOZ(this, System.nanoTime(), comparatorLIZLLL, str, null));
    }
}
