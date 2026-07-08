package com.bytedance.vmsdk.icu;

import X.C20129013pQ;
import X.C2260061Dd6;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.vmsdk.jsbridge.utils.JavaOnlyArray;
import com.bytedance.vmsdk.jsbridge.utils.JavaOnlyMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes35.dex */
public final class VMDateTimeFormat {
    public C2260061Dd6 mDateTimeFormat;

    public JavaOnlyMap resolvedOptions() {
        try {
            return JavaOnlyMap.from(this.mDateTimeFormat.LIZJ());
        } catch (C20129013pQ e) {
            TryCatchGuardChecker.doCheck(e);
            return new JavaOnlyMap();
        }
    }

    public String format(double d) {
        try {
            return this.mDateTimeFormat.LIZ.LIZIZ(d);
        } catch (C20129013pQ e) {
            TryCatchGuardChecker.doCheck(e);
            return "";
        }
    }

    public JavaOnlyArray formatToParts(double d) {
        try {
            List<Map<String, String>> listLIZ = this.mDateTimeFormat.LIZ(d);
            JavaOnlyArray javaOnlyArray = new JavaOnlyArray();
            Iterator it2 = ((ArrayList) listLIZ).iterator();
            while (it2.hasNext()) {
                javaOnlyArray.pushMap(JavaOnlyMap.from((Map) it2.next()));
            }
            return javaOnlyArray;
        } catch (C20129013pQ e) {
            TryCatchGuardChecker.doCheck(e);
            return JavaOnlyArray.from(new ArrayList());
        }
    }

    public VMDateTimeFormat(JavaOnlyArray javaOnlyArray, JavaOnlyMap javaOnlyMap) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < javaOnlyArray.size(); i++) {
            arrayList.add(javaOnlyArray.getString(i));
        }
        this.mDateTimeFormat = new C2260061Dd6(arrayList, javaOnlyMap.toHashMap());
    }

    public static VMDateTimeFormat create(JavaOnlyArray javaOnlyArray, JavaOnlyMap javaOnlyMap) {
        return new VMDateTimeFormat(javaOnlyArray, javaOnlyMap);
    }

    public static String[] supportedLocalesOf(JavaOnlyArray javaOnlyArray, JavaOnlyMap javaOnlyMap) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < javaOnlyArray.size(); i++) {
            arrayList.add(javaOnlyArray.getString(i));
        }
        try {
            List<String> listLIZLLL = C2260061Dd6.LIZLLL(arrayList, javaOnlyMap.toHashMap());
            return (String[]) listLIZLLL.toArray(new String[listLIZLLL.size()]);
        } catch (C20129013pQ e) {
            TryCatchGuardChecker.doCheck(e);
            return new String[0];
        }
    }
}
