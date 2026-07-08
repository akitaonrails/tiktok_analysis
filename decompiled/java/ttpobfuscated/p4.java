package ttpobfuscated;

import X.C13BV;
import X.C13LP;
import X.C15438062q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class p4 {
    public final List<String> a(String str) {
        List listLJJLIIIJILLIZJL;
        if (str.length() > 0 && (listLJJLIIIJILLIZJL = kotlin.text.a0.LJJLIIIJILLIZJL(str, new String[]{","}, 0, 6)) != null) {
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLJJLIIIJILLIZJL, 10));
            Iterator it2 = listLJJLIIIJILLIZJL.iterator();
            while (it2.hasNext()) {
                arrayList.add(it2.next());
            }
            return arrayList;
        }
        return C13BV.INSTANCE;
    }

    public final String a(List<String> list) {
        String strLJJLIIIJ;
        if (!(!list.isEmpty()) || (strLJJLIIIJ = C13LP.LJJLIIIJ(list, ",", null, null, 0, null, null, 62)) == null) {
            return "";
        }
        return strLJJLIIIJ;
    }
}
