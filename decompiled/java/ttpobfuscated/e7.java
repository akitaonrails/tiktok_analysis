package ttpobfuscated;

import X.C0X0W;
import X.C0X33;
import X.C0XLY;
import X.C13LP;
import X.C2097908Jt;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import okhttp3.Request;

/* JADX INFO: loaded from: classes14.dex */
public final class e7 extends gg {
    public final ConcurrentHashMap<String, String> a = new ConcurrentHashMap<>();

    public static /* synthetic */ void b() {
    }

    public final ConcurrentHashMap<String, String> a() {
        return this.a;
    }

    @Override // ttpobfuscated.gg
    public C0XLY a(C0X0W c0x0w) {
        Object objLJJJLL;
        Request request = c0x0w.request();
        C0X33 c0x33NewBuilder = request.newBuilder();
        String string = request.url().LJJ().toString();
        String str = this.a.get(string);
        if (str != null) {
            c0x33NewBuilder.LIZ("If-None-Match", str);
        }
        C0XLY c0xlyLIZ = c0x0w.LIZ(c0x33NewBuilder.LIZIZ());
        if (c0xlyLIZ.LIZIZ()) {
            TreeMap treeMap = (TreeMap) c0xlyLIZ.LLILZLL.LJIIIZ();
            LinkedHashMap linkedHashMap = new LinkedHashMap(C2097908Jt.LIZIZ(treeMap.size()));
            for (Map.Entry entry : treeMap.entrySet()) {
                linkedHashMap.put(((String) entry.getKey()).toLowerCase(Locale.ROOT), entry.getValue());
            }
            List list = (List) linkedHashMap.get("etag");
            if (list != null && (objLJJJLL = C13LP.LJJJLL(list)) != null) {
                this.a.put(string, (String) objLJJJLL);
            }
        }
        return c0xlyLIZ;
    }
}
