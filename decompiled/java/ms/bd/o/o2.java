package ms.bd.o;

import X.C0WFY;
import X.InterfaceC2110008Ok;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes4.dex */
public class o2 extends m2 {
    public long LIZ;

    public final void finalize() throws Throwable {
        k.a(100663298, 0, this.LIZ, null, null);
        this.LIZ = -1L;
        super.finalize();
    }

    public class a implements InterfaceC2110008Ok {
        public a() {
        }

        @Override // X.InterfaceC2110008Ok
        public final Map<String, String> LIZIZ(Map<String, String> map) {
            HashMap map2 = new HashMap();
            ArrayList arrayList = new ArrayList();
            for (Map.Entry entry : ((LinkedHashMap) map).entrySet()) {
                Object key = entry.getKey();
                String lowerCase = ((String) entry.getValue()).toLowerCase();
                if (key != null && !lowerCase.equals("")) {
                    arrayList.add(key);
                    arrayList.add(lowerCase);
                }
            }
            String[] strArr = (String[]) k.a(100663297, 0, o2.this.LIZ, "", arrayList.toArray(new String[0]));
            if (strArr != null) {
                map2 = new HashMap();
                for (int i = 0; i < strArr.length; i += 2) {
                    map2.put(strArr[i], strArr[i + 1]);
                }
            }
            return map2;
        }

        @Override // X.InterfaceC2110008Ok
        public final Map<String, String> LIZ(String str, Map<String, List<String>> map) {
            int i;
            String lowerCase;
            HashMap map2 = new HashMap();
            if (str != null && !str.isEmpty()) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(k.a(16777217, 0, 0L, "c4429c", new byte[]{71, 4, 107}));
                arrayList.add(str);
                Iterator it2 = ((TreeMap) map).entrySet().iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    Map.Entry entry = (Map.Entry) it2.next();
                    Object key = entry.getKey();
                    if (entry.getValue() != null && ((List) entry.getValue()).size() > 0) {
                        lowerCase = ((String) ListProtector.get((List) entry.getValue(), 0)).toLowerCase();
                    } else {
                        lowerCase = null;
                    }
                    if (key != null && lowerCase != null && !lowerCase.equals("")) {
                        arrayList.add(key);
                        arrayList.add(lowerCase);
                    }
                }
                String[] strArr = (String[]) k.a(100663297, 0, o2.this.LIZ, str, arrayList.toArray(new String[0]));
                if (strArr != null) {
                    HashMap map3 = new HashMap();
                    for (i = 0; i < strArr.length; i += 2) {
                        map3.put(strArr[i], strArr[i + 1]);
                    }
                    return map3;
                }
            }
            return map2;
        }
    }

    @Override // ms.bd.o.m2
    public final Object LIZJ(long j) {
        this.LIZ = j;
        C0WFY.LIZJ = new a();
        return null;
    }
}
