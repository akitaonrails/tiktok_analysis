package defpackage;

import X.C2188811AlT;
import com.ss.android.ugc.aweme.search.model.SearchSugEntity;
import java.util.Map;
import java.util.SortedMap;
import java.util.concurrent.ConcurrentSkipListMap;

/* JADX INFO: loaded from: classes11.dex */
public final class y8 {
    public ConcurrentSkipListMap<Character, y8> LIZ;
    public boolean LIZIZ;
    public int LIZJ = -1;
    public SearchSugEntity LIZLLL;
    public Character LJ;
    public y8 LJFF;

    public final y8 LIZIZ(char c) {
        ConcurrentSkipListMap<Character, y8> concurrentSkipListMap = this.LIZ;
        if (concurrentSkipListMap != null) {
            return concurrentSkipListMap.get(Character.valueOf(c));
        }
        Character ch = this.LJ;
        if (ch == null || ch.charValue() != c) {
            return null;
        }
        return this.LJFF;
    }

    public final void LIZ(String str, SortedMap<Integer, y8> sortedMap) {
        y8 y8Var;
        if (this.LIZIZ) {
            sortedMap.put(Integer.valueOf(this.LIZJ), this);
        }
        ConcurrentSkipListMap<Character, y8> concurrentSkipListMap = this.LIZ;
        if (concurrentSkipListMap != null) {
            for (Map.Entry<Character, y8> entry : concurrentSkipListMap.entrySet()) {
                char cCharValue = entry.getKey().charValue();
                y8 value = entry.getValue();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(str);
                sbLIZ.append(cCharValue);
                value.LIZ(C2188811AlT.LIZIZ(sbLIZ), sortedMap);
            }
            return;
        }
        if (this.LJ != null && (y8Var = this.LJFF) != null) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(str);
            sbLIZ2.append(this.LJ);
            y8Var.LIZ(C2188811AlT.LIZIZ(sbLIZ2), sortedMap);
        }
    }
}
