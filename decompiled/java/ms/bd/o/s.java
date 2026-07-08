package ms.bd.o;

import X.C09NU;
import X.C0VSJ;
import X.C2188811AlT;
import X.C786410Ut5;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import com.bytedance.mt.protector.impl.PatternProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import ms.bd.o.u;

/* JADX INFO: loaded from: classes4.dex */
public class s implements u.a {

    public static class a {
        public final ZipFile LIZ;
        public final ZipEntry LIZIZ;

        public a(C09NU c09nu, ZipEntry zipEntry) {
            this.LIZ = c09nu;
            this.LIZIZ = zipEntry;
        }
    }

    public static void LIZIZ(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    public static String[] LIZJ(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        String[] strArr = applicationInfo.splitSourceDirs;
        if (strArr == null || strArr.length == 0) {
            return new String[]{applicationInfo.sourceDir};
        }
        String[] strArr2 = new String[strArr.length + 1];
        strArr2[0] = applicationInfo.sourceDir;
        System.arraycopy(strArr, 0, strArr2, 1, strArr.length);
        return strArr2;
    }

    public static String[] LIZLLL(Context context, String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("lib");
        sbLIZ.append(File.separatorChar);
        sbLIZ.append("([^\\");
        sbLIZ.append(File.separatorChar);
        sbLIZ.append("]*)");
        sbLIZ.append(File.separatorChar);
        sbLIZ.append(str);
        Pattern patternCompile = PatternProtector.compile(C2188811AlT.LIZIZ(sbLIZ));
        HashSet hashSet = new HashSet();
        C09NU c09nu = null;
        for (String str2 : LIZJ(context)) {
            try {
                C09NU c09nu2 = new C09NU(new C0VSJ(str2));
                Enumeration<? extends ZipEntry> enumerationEntries = c09nu2.entries();
                while (enumerationEntries.hasMoreElements()) {
                    Matcher matcher = patternCompile.matcher(enumerationEntries.nextElement().getName());
                    if (matcher.matches()) {
                        hashSet.add(matcher.group(1));
                    }
                }
                c09nu = c09nu2;
            } catch (IOException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        if (c09nu != null) {
            try {
                c09nu.close();
            } catch (IOException e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
        }
        return (String[]) hashSet.toArray(new String[hashSet.size()]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    public static a LIZ(Context context, String[] strArr, String str, v vVar) {
        String[] strArrLIZJ = LIZJ(context);
        int length = strArrLIZJ.length;
        int i = 0;
        while (i < length) {
            String str2 = strArrLIZJ[i];
            ?? r0 = 0;
            while (true) {
                ?? r1 = r0 + 1;
                if (r0 < 5) {
                    try {
                        C09NU c09nu = new C09NU(new C0VSJ(str2));
                        int i2 = 0;
                        r1 = r1;
                        while (true) {
                            int i3 = i2 + 1;
                            if (i2 < 5) {
                                int length2 = strArr.length;
                                int i4 = 0;
                                ?? r12 = r1;
                                while (i4 < length2) {
                                    String str3 = strArr[i4];
                                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                                    sbLIZ.append("lib");
                                    sbLIZ.append(File.separatorChar);
                                    sbLIZ.append(str3);
                                    sbLIZ.append(File.separatorChar);
                                    sbLIZ.append(str);
                                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                                    vVar.getClass();
                                    C786410Ut5.k4(Locale.US, "Looking for %s in APK %s...", new Object[]{strLIZIZ, str2});
                                    ZipEntry entry = c09nu.getEntry(strLIZIZ);
                                    if (entry != null) {
                                        return new a(c09nu, entry);
                                    }
                                    i4++;
                                    r12 = entry;
                                }
                                i2 = i3;
                                r1 = r12;
                            } else {
                                try {
                                    c09nu.close();
                                    break;
                                } catch (IOException e) {
                                    TryCatchGuardChecker.doCheck(e);
                                }
                            }
                        }
                    } catch (IOException e2) {
                        TryCatchGuardChecker.doCheck(e2);
                        r0 = r1;
                    }
                }
            }
        }
        return null;
        i++;
    }
}
