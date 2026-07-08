package com.bytedance.vmsdk.icu;

import X.C20129013pQ;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.vmsdk.jsbridge.utils.JavaOnlyArray;
import com.bytedance.vmsdk.jsbridge.utils.JavaOnlyMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes35.dex */
public final class VMNumberFormat {
    public NumberFormat mNumberFormat;

    public JavaOnlyMap resolvedOptions() {
        try {
            return JavaOnlyMap.from(this.mNumberFormat.resolvedOptions());
        } catch (C20129013pQ e) {
            TryCatchGuardChecker.doCheck(e);
            return new JavaOnlyMap();
        }
    }

    public String format(double d) {
        try {
            return this.mNumberFormat.format(d);
        } catch (C20129013pQ e) {
            TryCatchGuardChecker.doCheck(e);
            return "";
        }
    }

    public JavaOnlyArray formatToParts(double d) {
        try {
            List<Map<String, String>> toParts = this.mNumberFormat.formatToParts(d);
            JavaOnlyArray javaOnlyArray = new JavaOnlyArray();
            Iterator<Map<String, String>> it2 = toParts.iterator();
            while (it2.hasNext()) {
                javaOnlyArray.pushMap(JavaOnlyMap.from(it2.next()));
            }
            return javaOnlyArray;
        } catch (C20129013pQ e) {
            TryCatchGuardChecker.doCheck(e);
            return JavaOnlyArray.from(new ArrayList());
        }
    }

    public VMNumberFormat(JavaOnlyArray javaOnlyArray, JavaOnlyMap javaOnlyMap) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < javaOnlyArray.size(); i++) {
            arrayList.add(javaOnlyArray.getString(i));
        }
        this.mNumberFormat = new NumberFormat(arrayList, javaOnlyMap.toHashMap());
    }

    public static VMNumberFormat create(JavaOnlyArray javaOnlyArray, JavaOnlyMap javaOnlyMap) {
        return new VMNumberFormat(javaOnlyArray, javaOnlyMap);
    }

    public static String[] supportedLocalesOf(JavaOnlyArray javaOnlyArray, JavaOnlyMap javaOnlyMap) {
        try {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < javaOnlyArray.size(); i++) {
                arrayList.add(javaOnlyArray.getString(i));
            }
            List<String> listSupportedLocalesOf = NumberFormat.supportedLocalesOf(arrayList, javaOnlyMap.toHashMap());
            return (String[]) listSupportedLocalesOf.toArray(new String[listSupportedLocalesOf.size()]);
        } catch (C20129013pQ e) {
            TryCatchGuardChecker.doCheck(e);
            return new String[0];
        }
    }
}
