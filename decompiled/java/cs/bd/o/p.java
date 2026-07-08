package cs.bd.o;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class p {
    public static String LIBNAME;
    public static String SensorLibName;

    public static synchronized void a(Context context, int i, Map<String, String> map) {
        f1.LIZJ(context, LIBNAME, SensorLibName);
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
        }
    }
}
