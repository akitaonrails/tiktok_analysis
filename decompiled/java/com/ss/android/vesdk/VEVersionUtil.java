package com.ss.android.vesdk;

import X.AnonymousClass0826;
import X.C2188811AlT;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Field;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public class VEVersionUtil {
    public static String[] getAllVersionInfos() {
        String vESDKVersion = getVESDKVersion();
        ArrayList arrayList = new ArrayList();
        arrayList.add("VESDK-VERSION");
        arrayList.add(vESDKVersion);
        for (Field field : AnonymousClass0826.class.getDeclaredFields()) {
            if (field.getName().contains("VERSION")) {
                try {
                    Object obj = field.get(AnonymousClass0826.class);
                    if (obj != null && obj.getClass() == String.class) {
                        arrayList.add(field.getName());
                        arrayList.add(obj);
                    }
                } catch (IllegalAccessException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public static String getVESDKVersion() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("-");
        sbLIZ.append("mt");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("21.8.0.128");
        sbLIZ2.append(strLIZIZ);
        return C2188811AlT.LIZIZ(sbLIZ2);
    }
}
