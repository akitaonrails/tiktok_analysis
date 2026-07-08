package com.bytedance.ies.safemode.SmartProtected.state;

import X.C08RN;
import X.C0VSJ;
import X.C1BN5;
import X.C2188811AlT;
import X.C2200381B9w;
import X.C2200391B9x;
import X.C2203541BMa;
import X.C2203571BMd;
import X.C2203601BMg;
import X.C2203771BMx;
import X.C2203781BMy;
import X.C2203791BMz;
import X.C786410Ut5;
import X.C786450Ut9;
import X.C805560Vis;
import X.C810410Vqh;
import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.ies.safemode.SafeModeReporter;
import com.bytedance.ies.safemode.SmartProtected.state.ExceptionManager;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.e;
import com.google.gson.k;
import com.google.gson.n;
import com.google.gson.p;
import java.io.File;
import java.io.PrintStream;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.apache.commons.io.FileUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes35.dex */
public final class ExceptionManager {
    public static volatile ExceptionManager LJIILL;
    public final C2203771BMx LIZ = new C810410Vqh<List<ExceptionRecord>>() { // from class: X.1BMx
        @Override // X.C810410Vqh
        public final List<ExceptionManager.ExceptionRecord> LIZIZ() {
            ExceptionManager exceptionManager = this.LIZLLL;
            return exceptionManager.LJ(exceptionManager.LJII);
        }
    };
    public final C2203781BMy LIZIZ = new C810410Vqh<List<ExceptionRecord>>() { // from class: X.1BMy
        @Override // X.C810410Vqh
        public final List<ExceptionManager.ExceptionRecord> LIZIZ() {
            ExceptionManager exceptionManager = this.LIZLLL;
            return exceptionManager.LJ(exceptionManager.LJIIIIZZ);
        }
    };
    public final C2203791BMz LIZJ = new C810410Vqh<List<ExceptionRecord>>() { // from class: X.1BMz
        @Override // X.C810410Vqh
        public final List<ExceptionManager.ExceptionRecord> LIZIZ() {
            ExceptionManager exceptionManager = this.LIZLLL;
            return exceptionManager.LJ(exceptionManager.LJIIIZ);
        }
    };
    public final C2203601BMg LIZLLL = new C810410Vqh<List<String>>() { // from class: X.1BMg
        @Override // X.C810410Vqh
        public final List<String> LIZIZ() throws Throwable {
            ExceptionManager exceptionManager = this.LIZLLL;
            C0VSJ c0vsj = exceptionManager.LJIILIIL;
            if (c0vsj != null && c0vsj.exists()) {
                try {
                    return (List) exceptionManager.LJIILJJIL.LJII(FileUtils.readFileToString(c0vsj, Charset.forName("UTF-8")), ArrayList.class);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    C2200381B9w.LIZJ(14, e);
                }
            }
            return new ArrayList();
        }
    };
    public final List<CloudException> LJ = new ArrayList();
    public final List<CloudException> LJFF = new ArrayList();
    public final List<CloudException> LJI = new ArrayList();
    public final C0VSJ LJII;
    public final C0VSJ LJIIIIZZ;
    public final C0VSJ LJIIIZ;
    public final C0VSJ LJIIJ;
    public boolean LJIIJJI;
    public final C0VSJ LJIIL;
    public final C0VSJ LJIILIIL;
    public final Gson LJIILJJIL;

    public static class CloudException implements C1BN5 {
        public int configType;
        public String[] crashFeatures;
        public String crashType;

        public int getCrashCode() {
            return this.crashType.equals("java") ? 1 : 2;
        }

        public String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("CloudException{crashType='");
            sbLIZ.append(this.crashType);
            sbLIZ.append('\'');
            sbLIZ.append(", crashFeatures=");
            sbLIZ.append(Arrays.toString(this.crashFeatures));
            sbLIZ.append('}');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public String getCrashType() {
            return this.crashType;
        }

        @Override // X.C1BN5
        public boolean isSameException(ExceptionRecord exceptionRecord) {
            if (exceptionRecord == null) {
                return false;
            }
            return isSameException(exceptionRecord.crashType, exceptionRecord.crashReason);
        }

        @Override // X.C1BN5
        public boolean isSameException(String str, String str2) {
            if (!TextUtils.equals(this.crashType, str)) {
                return false;
            }
            String[] strArrSplit = str2.split("\n");
            if (this.crashFeatures == null) {
                return false;
            }
            int i = 0;
            int i2 = 0;
            while (i < strArrSplit.length && i2 < this.crashFeatures.length) {
                if (TextUtils.isEmpty(strArrSplit[i])) {
                    i++;
                } else {
                    int i3 = i + 1;
                    if (strArrSplit[i].trim().contains(this.crashFeatures[i2].trim())) {
                        i2++;
                    }
                    i = i3;
                }
            }
            if (i2 != this.crashFeatures.length) {
                return false;
            }
            return true;
        }

        public CloudException(int i, String str, String str2) {
            this.configType = i;
            this.crashType = str;
            this.crashFeatures = str2.split("\n");
        }
    }

    public static class ExceptionRecord implements C1BN5 {
        public String crashReason;
        public long crashTimeStamp;
        public String crashType;
        public String uuid;
        public boolean white;

        public int getCrashCode() {
            return this.crashType.equals("java") ? 1 : 2;
        }

        public String getCrashReason() {
            return this.crashReason;
        }

        public String getCrashType() {
            return this.crashType;
        }

        public String getUUID() {
            return this.uuid;
        }

        public static String disposeJavaExceptionStack(String str) {
            if (TextUtils.isEmpty(str)) {
                return "";
            }
            StringBuilder sb = new StringBuilder(str.length());
            String[] strArrSplit = str.split("\n");
            int length = strArrSplit.length;
            if (length > 0) {
                String[] strArrSplit2 = strArrSplit[0].split(":");
                if (strArrSplit2.length > 0) {
                    sb.append(strArrSplit2[0]);
                    sb.append("\n");
                }
                for (int i = 1; i < length; i++) {
                    sb.append(strArrSplit[i]);
                    sb.append("\n");
                }
            }
            return sb.toString();
        }

        public static String disposeNativeExceptionStack(String str) {
            if (TextUtils.isEmpty(str)) {
                return "";
            }
            int iIndexOf = str.indexOf("#00");
            if (iIndexOf != -1) {
                return formatNativeCrashReason(str.substring(iIndexOf));
            }
            return formatNativeCrashReason(str);
        }

        public static String formatNativeCrashReason(String str) {
            return str.replaceAll("#\\d*\\spc\\s\\S{16}\\s{2}", "").replaceAll("#\\d*\\spc\\s\\S{8}\\s{2}", "");
        }

        @Override // X.C1BN5
        public boolean isSameException(ExceptionRecord exceptionRecord) {
            if (exceptionRecord == null) {
                return false;
            }
            if (exceptionRecord == this) {
                return true;
            }
            return isSameException(exceptionRecord.crashType, exceptionRecord.crashReason);
        }

        private float calculateSimilarity(List list, List list2) {
            int size = list.size();
            int size2 = list2.size();
            LinkedList linkedList = new LinkedList(list);
            LinkedList linkedList2 = new LinkedList(list2);
            int[] iArrFindLongestSublist = findLongestSublist(linkedList, linkedList2);
            int i = iArrFindLongestSublist[0];
            int i2 = iArrFindLongestSublist[1];
            int i3 = iArrFindLongestSublist[2];
            int i4 = 0;
            while (i > 0) {
                i4 += i;
                int i5 = 0;
                do {
                    linkedList.remove(i2);
                    i5++;
                } while (i5 < i);
                int i6 = 0;
                do {
                    linkedList2.remove(i3);
                    i6++;
                } while (i6 < i);
                int[] iArrFindLongestSublist2 = findLongestSublist(linkedList, linkedList2);
                i = iArrFindLongestSublist2[0];
                i2 = iArrFindLongestSublist2[1];
                i3 = iArrFindLongestSublist2[2];
            }
            float f = (float) ((((double) i4) * 2.0d) / ((double) (size + size2)));
            C2200391B9x.LIZLLL("ExceptionManager", C786410Ut5.j4("score %f same_length %d,a_length %d b_length %d", new Object[]{Float.valueOf(f), Integer.valueOf(i4), Integer.valueOf(size), Integer.valueOf(size2)}));
            return f;
        }

        private int[] findLongestSublist(List<String> list, List<String> list2) {
            int i;
            int[] iArr = {-1, -1, -1};
            int size = list.size();
            int size2 = list2.size();
            int[][] iArr2 = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, size + 1, size2 + 1);
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            for (int i5 = size - 1; i5 >= 0; i5--) {
                for (int i6 = size2 - 1; i6 >= 0; i6--) {
                    int[] iArr3 = iArr2[i5];
                    if (TextUtils.equals((CharSequence) ListProtector.get(list, i5), (CharSequence) ListProtector.get(list2, i6))) {
                        i = iArr2[i5 + 1][i6 + 1] + 1;
                    } else {
                        i = 0;
                    }
                    iArr3[i6] = i;
                    int i7 = iArr2[i5][i6];
                    if (i7 >= i2) {
                        i3 = i5;
                        i4 = i6;
                        i2 = i7;
                    }
                }
            }
            iArr[0] = i2;
            iArr[1] = i3;
            iArr[2] = i4;
            return iArr;
        }

        private boolean isSameStack(String str, String str2) {
            boolean zEquals;
            try {
                long jCurrentTimeMillis = System.currentTimeMillis();
                float fFloatValue = C2203571BMd.LJIILLIIL.LJIILL.LIZ().floatValue();
                if (fFloatValue < 0.0f) {
                    zEquals = TextUtils.equals(str, str2);
                    try {
                        C786410Ut5.j4("same equals threshold %f use time %dms", new Object[]{Float.valueOf(fFloatValue), Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis)});
                        return zEquals;
                    } catch (Exception e) {
                        e = e;
                    }
                } else {
                    ArrayList arrayList = new ArrayList();
                    for (String str3 : str.split("[\\s\\n./():#.+~#$-]")) {
                        if (str3.matches("[a-zA-Z_]+[a-zA-Z_0-9]+")) {
                            arrayList.add(str3);
                        }
                    }
                    ArrayList arrayList2 = new ArrayList();
                    for (String str4 : str2.split("[\\s\\n./():#.+~#$-]")) {
                        if (str4.matches("[a-zA-Z_]+[a-zA-Z_0-9]+")) {
                            arrayList2.add(str4);
                        }
                    }
                    try {
                        float fCalculateSimilarity = calculateSimilarity(arrayList, arrayList2);
                        if (fCalculateSimilarity > fFloatValue) {
                            zEquals = true;
                        } else {
                            zEquals = false;
                        }
                        try {
                            C2200391B9x.LIZLLL("ExceptionManager", C786410Ut5.j4("calculateSimilarity score %f threshold %f use time %dms", new Object[]{Float.valueOf(fCalculateSimilarity), Float.valueOf(fFloatValue), Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis)}));
                            return zEquals;
                        } catch (Exception e2) {
                            e = e2;
                        }
                    } catch (Exception e3) {
                        e = e3;
                        zEquals = false;
                    }
                }
            } catch (Exception e4) {
                e = e4;
            }
            TryCatchGuardChecker.doCheck(e);
            C2200391B9x.LIZ("isSameStack", e);
            String string = e.toString();
            Gson gson = SafeModeReporter.LIZ;
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("exception", string);
                jSONObject.put("stack1", str);
                jSONObject.put("stack2", str2);
            } catch (JSONException e5) {
                TryCatchGuardChecker.doCheck(e5);
            }
            SafeModeReporter.LIZLLL("safemode_stack_calc_exception", jSONObject);
            C786410Ut5.j4("reportStackCalcException exception:%s", new Object[]{string});
            return zEquals;
        }

        @Override // X.C1BN5
        public boolean isSameException(String str, String str2) {
            if (TextUtils.equals(this.crashType, str)) {
                if ("java".equals(str)) {
                    return isSameStack(disposeJavaExceptionStack(this.crashReason), disposeJavaExceptionStack(str2));
                }
                return isSameStack(disposeNativeExceptionStack(this.crashReason), disposeNativeExceptionStack(str2));
            }
            return false;
        }

        public ExceptionRecord(String str, String str2, long j, String str3) {
            this.crashType = str;
            this.crashReason = str2;
            this.crashTimeStamp = j;
            this.uuid = str3;
        }
    }

    public final void LIZIZ() throws Throwable {
        boolean z;
        C805560Vis c805560Vis = C2203541BMa.LIZ;
        synchronized (C2203541BMa.class) {
            z = C2203541BMa.LIZ.LIZ.getBoolean("last_operator_is_clean", false);
        }
        if (z) {
            C2200391B9x.LIZLLL("ExceptionManager", "last operator is clear,now clear history crash data");
            LIZ().clear();
            LJII(this.LJII, LIZ());
            C2203541BMa.LIZIZ(false);
        }
    }

    public final ExceptionRecord LIZLLL() {
        if (!this.LJIIL.exists()) {
            return null;
        }
        try {
            return (ExceptionRecord) this.LJIILJJIL.LJII(FileUtils.readFileToString(this.LJIIL, Charset.forName("UTF-8")), ExceptionRecord.class);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C2200381B9w.LIZJ(12, e);
            return null;
        }
    }

    public final void LJFF() {
        for (ExceptionRecord exceptionRecord : LIZ()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(exceptionRecord.crashType);
            sbLIZ.append(exceptionRecord.crashReason);
            C786410Ut5.j4("exception in checking crash type: %s %s", new Object[]{exceptionRecord.crashType, C2200381B9w.LIZIZ(C2188811AlT.LIZIZ(sbLIZ))});
        }
        for (ExceptionRecord exceptionRecord2 : LIZ()) {
            Object[] objArr = new Object[3];
            objArr[0] = this.LJIIJJI ? "smart" : "boot";
            objArr[1] = exceptionRecord2.crashType;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(exceptionRecord2.crashType);
            sbLIZ2.append(exceptionRecord2.crashReason);
            objArr[2] = C2200381B9w.LIZIZ(C2188811AlT.LIZIZ(sbLIZ2));
            C786410Ut5.j4("exception in %s quiet type: %s %s", objArr);
        }
        for (ExceptionRecord exceptionRecord3 : LIZ()) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append(exceptionRecord3.crashType);
            sbLIZ3.append(exceptionRecord3.crashReason);
            C786410Ut5.j4("exception in type: %s %s white", new Object[]{exceptionRecord3.crashType, C2200381B9w.LIZIZ(C2188811AlT.LIZIZ(sbLIZ3))});
        }
        Iterator<String> it2 = LIZ().iterator();
        while (it2.hasNext()) {
            C786410Ut5.j4("uuid record: %s", new Object[]{it2.next()});
        }
    }

    public final int LJIIIIZZ() {
        synchronized (ExceptionManager.class) {
            try {
                C2203571BMd c2203571BMd = C2203571BMd.LJIILLIIL;
                long jLongValue = c2203571BMd.LJIILIIL.LIZ().longValue();
                long jLongValue2 = c2203571BMd.LJIIL.LIZ().longValue();
                if (!this.LJIIJJI) {
                    jLongValue = c2203571BMd.LJIIJ.LIZ().longValue();
                    jLongValue2 = c2203571BMd.LJIIIZ.LIZ().longValue();
                }
                if (LIZ().size() == jLongValue) {
                    return 2;
                }
                int size = LIZ().size();
                for (int i = 0; i < size; i++) {
                    ExceptionRecord exceptionRecord = LIZ().get(i);
                    int i2 = 0;
                    for (int i3 = i; i3 < size; i3++) {
                        if (LIZ().get(i3).isSameException(exceptionRecord)) {
                            i2++;
                        }
                    }
                    if (i2 == jLongValue2) {
                        return 1;
                    }
                }
                return 0;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.1BMx] */
    /* JADX WARN: Type inference failed for: r0v1, types: [X.1BMy] */
    /* JADX WARN: Type inference failed for: r0v2, types: [X.1BMz] */
    /* JADX WARN: Type inference failed for: r0v3, types: [X.1BMg] */
    public ExceptionManager(Context context) throws Throwable {
        Object obj;
        File file = C786450Ut9.LIZJ;
        if (file == null || !C786450Ut9.LJ) {
            try {
                C786450Ut9.LIZJ = context.getFilesDir();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                Context applicationContext = null;
                try {
                    Class<?> cls = Class.forName("android.app.ActivityThread");
                    Object objInvoke = cls.getDeclaredMethod("currentActivityThread", new Class[0]).invoke(null, new Object[0]);
                    Field declaredField = cls.getDeclaredField("mInitialApplication");
                    declaredField.setAccessible(true);
                    obj = declaredField.get(objInvoke);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    PrintStream printStream = System.out;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Error: ");
                    sbLIZ.append(e.getMessage());
                    printStream.println(C2188811AlT.LIZIZ(sbLIZ));
                }
                if (obj instanceof Application) {
                    applicationContext = ((Application) obj).getApplicationContext();
                    PrintStream printStream2 = System.out;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("Application context obtained through ActivityThread: ");
                    sbLIZ2.append(applicationContext);
                    printStream2.println(C2188811AlT.LIZIZ(sbLIZ2));
                    if (applicationContext != null) {
                        C786450Ut9.LIZJ = applicationContext.getFilesDir();
                        C08RN.LIZ(applicationContext);
                    }
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append(th.getMessage());
                    sbLIZ3.append(":");
                    sbLIZ3.append(C08RN.LIZJ());
                    sbLIZ3.append(" applicationContext is null");
                    throw new Throwable(C2188811AlT.LIZIZ(sbLIZ3));
                }
                System.out.println("Error: mInitialApplication is not an instance of Application");
                StringBuilder sbLIZ32 = C2188811AlT.LIZ();
                sbLIZ32.append(th.getMessage());
                sbLIZ32.append(":");
                sbLIZ32.append(C08RN.LIZJ());
                sbLIZ32.append(" applicationContext is null");
                throw new Throwable(C2188811AlT.LIZIZ(sbLIZ32));
            }
            file = C786450Ut9.LIZJ;
        }
        C0VSJ c0vsj = new C0VSJ(file.getAbsolutePath(), "ExceptionManager");
        this.LJII = new C0VSJ(c0vsj, "record.json");
        this.LJIIIIZZ = new C0VSJ(c0vsj, "whitelist.json");
        this.LJIIIZ = new C0VSJ(c0vsj, "quiet.json");
        this.LJIIJ = new C0VSJ(c0vsj, "bootQuiet.json");
        this.LJIIL = new C0VSJ(c0vsj, "last.json");
        new C0VSJ(c0vsj, "rollbackResult.json");
        this.LJIILIIL = new C0VSJ(c0vsj, "nativeUUIDs.json");
        e eVar = new e();
        eVar.LJIILL = true;
        this.LJIILJJIL = eVar.LIZ();
    }

    public static ExceptionManager LIZJ(Context context) {
        if (LJIILL == null) {
            synchronized (ExceptionManager.class) {
                try {
                    if (LJIILL == null) {
                        LJIILL = new ExceptionManager(context);
                        LJIILL.LJIIJJI = true;
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LJIILL;
    }

    public final void LIZ(String str) {
        if (TextUtils.isEmpty(str)) {
            C2200391B9x.LIZIZ("ExceptionManager", "buildCloudList conf is empty");
            return;
        }
        C2200391B9x.LIZLLL("ExceptionManager", C786410Ut5.j4("buildCloudList conf is %s", new Object[]{str}));
        for (k kVar : GsonProtectorUtils.parse(new p(), str).LJIIL()) {
            if (kVar != null) {
                try {
                    n nVarLJIILIIL = kVar.LJIILIIL();
                    int iLJIIJJI = nVarLJIILIIL.LJJIIZ("type").LJIIJJI();
                    if (iLJIIJJI != 1 && iLJIIJJI != 2 && iLJIIJJI != 4 && iLJIIJJI != 6) {
                        C2200391B9x.LIZIZ("ExceptionManager", C786410Ut5.j4("invalid type %d", new Object[]{Integer.valueOf(iLJIIJJI)}));
                    } else {
                        String strLJIL = nVarLJIILIIL.LJJIIZ("crashType").LJIL();
                        String strLJIL2 = nVarLJIILIIL.LJJIIZ("stack").LJIL();
                        if (TextUtils.isEmpty(strLJIL2)) {
                            C2200391B9x.LIZIZ("ExceptionManager", "createCloudConfItem stack is null");
                        } else {
                            C786410Ut5.j4("cloudExceptionConf type %d", new Object[]{Integer.valueOf(iLJIIJJI)});
                            C786410Ut5.j4("cloudExceptionConf crashType %s", new Object[]{strLJIL});
                            C786410Ut5.j4("cloudExceptionConf stack %s", new Object[]{strLJIL2});
                            CloudException cloudException = new CloudException(iLJIIJJI, strLJIL, strLJIL2);
                            int i = cloudException.configType;
                            if ((i & 1) == 1) {
                                ((ArrayList) this.LJ).add(cloudException);
                                C786410Ut5.j4("add conf %s to immediatelyRollBackList", new Object[]{cloudException.toString()});
                            }
                            if ((i & 2) == 2) {
                                ((ArrayList) this.LJFF).add(cloudException);
                                C786410Ut5.j4("add conf %s to whiteSmartP", new Object[]{cloudException.toString()});
                            }
                            if ((i & 4) == 4) {
                                ((ArrayList) this.LJI).add(cloudException);
                                C786410Ut5.j4("add conf %s to whiteBootP", new Object[]{cloudException.toString()});
                            }
                        }
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    C2200391B9x.LIZIZ("ExceptionManager", C786410Ut5.j4("gen cloudConf failed error %s", new Object[]{e.toString()}));
                }
            }
        }
    }

    public final List LJ(C0VSJ c0vsj) throws Throwable {
        if (c0vsj != null && c0vsj.exists()) {
            try {
                ExceptionRecord[] exceptionRecordArr = (ExceptionRecord[]) this.LJIILJJIL.LJII(FileUtils.readFileToString(c0vsj, Charset.forName("UTF-8")), ExceptionRecord[].class);
                if (exceptionRecordArr != null) {
                    return new ArrayList(Arrays.asList(exceptionRecordArr));
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C2200381B9w.LIZJ(10, e);
            }
        }
        return new ArrayList();
    }

    public final void LJII(C0VSJ c0vsj, Object obj) throws Throwable {
        try {
            FileUtils.writeStringToFile(c0vsj, GsonProtectorUtils.toJson(this.LJIILJJIL, obj), Charset.forName("UTF-8"));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C2200381B9w.LIZJ(11, e);
        }
    }

    public final ExceptionRecord LJI(String str, String str2, long j, List list, C0VSJ c0vsj, long j2) throws Throwable {
        ExceptionRecord exceptionRecord = new ExceptionRecord(str, str2, j, "");
        list.add(exceptionRecord);
        while (list.size() > j2) {
            ListProtector.remove(list, 0);
        }
        LJII(c0vsj, list);
        return exceptionRecord;
    }
}
