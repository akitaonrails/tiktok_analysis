package ms.bd.o;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class b0 {
    public static String LIBNAME;

    public static synchronized void a(Context context, int i, Map<String, String> map) {
        h2.LIZIZ(context, LIBNAME);
        ArrayList arrayList = new ArrayList();
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                if (!TextUtils.isEmpty(key) && !TextUtils.isEmpty(value)) {
                    arrayList.add(key);
                    arrayList.add(value);
                }
            }
            k.a(83886081, i, 0L, null, (String[]) arrayList.toArray(new String[0]));
        }
    }
}
