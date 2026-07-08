package com.google.gson.internal.bind;

import X.C0VSJ;
import X.C0VSV;
import X.C2188811AlT;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class GsonBoundFieldsPreloader {
    public static volatile boolean LIZ;
    public static volatile boolean LIZIZ;
    public static volatile boolean LIZJ;
    public static C0VSJ LIZLLL;
    public static final Map<String, List<FieldModel>> LJ = new ConcurrentHashMap();
    public static final ThreadLocal<String> LJFF = new ThreadLocal<>();
    public static final ThreadLocal<List<FieldModel>> LJI = new ThreadLocal<>();

    public static class FieldModel {
        public boolean deserialize;
        public String fieldName;
        public String jsonName;
        public boolean serialize;

        public String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("fieldName=");
            sbLIZ.append(this.fieldName);
            sbLIZ.append(",jsonName=");
            sbLIZ.append(this.jsonName);
            sbLIZ.append(",serialize=");
            sbLIZ.append(this.serialize);
            sbLIZ.append(",deserialize=");
            sbLIZ.append(this.deserialize);
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public FieldModel(String str, String str2, boolean z, boolean z2) {
            this.fieldName = str;
            this.jsonName = str2;
            this.serialize = z;
            this.deserialize = z2;
        }
    }

    public static void LIZIZ() {
        if (LIZ) {
            if (LIZIZ) {
                String str = LJFF.get();
                List<FieldModel> list = LJI.get();
                if (str != null && list != null && !list.isEmpty()) {
                    ((ConcurrentHashMap) LJ).put(str, list);
                }
            }
            LJFF.remove();
            LJI.remove();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v11, types: [int] */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.io.FilterOutputStream] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.io.FilterOutputStream] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.io.DataOutputStream, java.io.FilterOutputStream] */
    public static void LIZLLL() {
        HashMap map;
        ?? r3;
        ?? r32;
        C0VSJ c0vsj;
        ?? dataOutputStream;
        if (LIZIZ) {
            LIZIZ = false;
            try {
                File[] fileArrListFiles = LIZLLL.getParentFile().listFiles();
                if (fileArrListFiles != null) {
                    for (File file : fileArrListFiles) {
                        file.delete();
                    }
                }
                try {
                    map = new HashMap(LJ);
                    r3 = 0;
                    r32 = 0;
                    try {
                        try {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append(LIZLLL.getAbsolutePath());
                            sbLIZ.append("_tmp");
                            c0vsj = new C0VSJ(C2188811AlT.LIZIZ(sbLIZ));
                            dataOutputStream = new DataOutputStream(new BufferedOutputStream(new C0VSV(c0vsj)));
                        } catch (Throwable th) {
                            th = th;
                        }
                    } catch (Exception e) {
                        e = e;
                    }
                } catch (IOException e2) {
                    TryCatchGuardChecker.doCheck(e2);
                }
            } catch (Exception e3) {
                TryCatchGuardChecker.doCheck(e3);
            }
            try {
                ArrayList arrayList = new ArrayList();
                HashMap map2 = new HashMap();
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (!map2.containsKey(str)) {
                        map2.put(str, Integer.valueOf(arrayList.size()));
                        arrayList.add(str);
                    }
                    for (FieldModel fieldModel : (List) entry.getValue()) {
                        if (!map2.containsKey(fieldModel.fieldName)) {
                            map2.put(fieldModel.fieldName, Integer.valueOf(arrayList.size()));
                            arrayList.add(fieldModel.fieldName);
                        }
                        if (!map2.containsKey(fieldModel.jsonName)) {
                            map2.put(fieldModel.jsonName, Integer.valueOf(arrayList.size()));
                            arrayList.add(fieldModel.jsonName);
                        }
                    }
                }
                dataOutputStream.writeInt(arrayList.size());
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    dataOutputStream.writeUTF((String) it2.next());
                }
                dataOutputStream.writeInt(map.size());
                for (Map.Entry entry2 : map.entrySet()) {
                    dataOutputStream.writeInt(((Integer) map2.get(entry2.getKey())).intValue());
                    List<FieldModel> list = (List) entry2.getValue();
                    dataOutputStream.writeInt(list.size());
                    for (FieldModel fieldModel2 : list) {
                        dataOutputStream.writeInt(((Integer) map2.get(fieldModel2.fieldName)).intValue());
                        dataOutputStream.writeInt(((Integer) map2.get(fieldModel2.jsonName)).intValue());
                        ?? r1 = fieldModel2.serialize;
                        if (fieldModel2.deserialize) {
                            r1 = (r1 == true ? 1 : 0) | 2;
                        }
                        dataOutputStream.writeByte(r1);
                    }
                }
                dataOutputStream.flush();
                c0vsj.renameTo(LIZLLL);
                dataOutputStream.close();
            } catch (Exception e4) {
                e = e4;
                r32 = dataOutputStream;
                TryCatchGuardChecker.doCheck(e);
                if (r32 != 0) {
                    r32.close();
                }
                ((ConcurrentHashMap) LJ).clear();
            } catch (Throwable th2) {
                th = th2;
                r3 = dataOutputStream;
                TryCatchGuardChecker.doCheck(th);
                if (r3 != 0) {
                    try {
                        r3.close();
                    } catch (IOException e5) {
                        TryCatchGuardChecker.doCheck(e5);
                    }
                }
                throw th;
            }
            ((ConcurrentHashMap) LJ).clear();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x00e4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZ(android.content.pm.ApplicationInfo r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.bind.GsonBoundFieldsPreloader.LIZ(android.content.pm.ApplicationInfo):void");
    }

    public static void LIZJ(Field field, String str, boolean z, boolean z2) {
        List<FieldModel> list;
        if (LIZIZ && (list = LJI.get()) != null) {
            for (FieldModel fieldModel : list) {
                if (fieldModel.fieldName.equals(field.getName()) && fieldModel.jsonName.equals(str)) {
                    return;
                }
            }
            list.add(new FieldModel(field.getName(), str, z, z2));
        }
    }
}
