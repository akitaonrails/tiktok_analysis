package com.ss.android.ugc.tiktok.pns.kidsmode;

import X.C098200Yq;
import X.C0WSU;
import X.C0WSV;
import X.C0WZW;
import X.C13LQ;
import X.C189200o6;
import X.C2188811AlT;
import X.C826540Wbc;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Field;
import java.util.Set;
import kotlin.text.u;

/* JADX INFO: loaded from: classes14.dex */
public final class KShieldNetworkActionInvoker implements C0WSV {
    public static Field argsField;
    public static volatile boolean isInitReflection;
    public static Field requestFactoryField;
    public static Field requestFactoryRelativeUrl1Field;
    public static Field requestFactoryRelativeUrlField;
    public static Field requestFactoryServerField;
    public static final C826540Wbc Companion = new Object() { // from class: X.0Wbc
    };
    public static final C0WSU PASS = new C0WSU(false, null);
    public static final C0WSU INTERCEPT = new C0WSU(true, null);
    public static final Set<Integer> MONITORED_API_IDS = C13LQ.LJLIIL(new Integer[]{400000, 400102, 400103, 400204, 400205});

    @Override // X.C0WSV
    public String name() {
        return "KShieldNetwork";
    }

    @Override // X.C0WSV
    public void postInvoke(int i, String str, String str2, Object obj, Object[] objArr, Object obj2, C0WZW c0wzw, boolean z) {
    }

    private final void initReflectionFields(Object obj) {
        Object obj2;
        Object obj3;
        if (isInitReflection) {
            return;
        }
        isInitReflection = true;
        try {
            Class<?> cls = obj.getClass();
            Field declaredField = cls.getDeclaredField("args");
            declaredField.setAccessible(true);
            argsField = declaredField;
            Field declaredField2 = cls.getDeclaredField("requestFactory");
            declaredField2.setAccessible(true);
            requestFactoryField = declaredField2;
            Class<?> cls2 = Class.forName("com.bytedance.retrofit2.RequestFactory");
            Field declaredField3 = cls2.getDeclaredField("server");
            declaredField3.setAccessible(true);
            requestFactoryServerField = declaredField3;
            try {
                Field declaredField4 = cls2.getDeclaredField("relativeUrl");
                declaredField4.setAccessible(true);
                C189200o6.m2constructorimpl(declaredField4);
                obj2 = declaredField4;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C098200Yq c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
                obj2 = c098200Yq;
            }
            boolean zM7isFailureimpl = C189200o6.m7isFailureimpl(obj2);
            Object obj4 = null;
            Object obj5 = obj2;
            if (zM7isFailureimpl) {
                obj5 = null;
            }
            requestFactoryRelativeUrlField = (Field) obj5;
            try {
                Field declaredField5 = cls2.getDeclaredField("relativeUrl1");
                declaredField5.setAccessible(true);
                C189200o6.m2constructorimpl(declaredField5);
                obj3 = declaredField5;
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                C098200Yq c098200Yq2 = new C098200Yq(th2);
                C189200o6.m2constructorimpl(c098200Yq2);
                obj3 = c098200Yq2;
            }
            if (!C189200o6.m7isFailureimpl(obj3)) {
                obj4 = obj3;
            }
            requestFactoryRelativeUrl1Field = (Field) obj4;
        } catch (Throwable th3) {
            TryCatchGuardChecker.doCheck(th3);
        }
    }

    private final String resolveTTNetUrl(Object obj) {
        Object obj2;
        Object[] objArr;
        Object obj3;
        String str;
        Object obj4;
        Field field;
        Object obj5;
        String str2;
        Object obj6;
        String str3;
        boolean z;
        initReflectionFields(obj);
        try {
            Field field2 = argsField;
            if (field2 != null) {
                obj2 = field2.get(obj);
            } else {
                obj2 = null;
            }
            if (obj2 instanceof Object[]) {
                objArr = (Object[]) obj2;
            } else {
                objArr = null;
            }
            boolean z2 = true;
            if (objArr != null) {
                int length = objArr.length;
                for (int i = 0; i < length; i++) {
                    obj3 = objArr[i];
                    if (!(obj3 instanceof String) || (!u.LJJIIJZLJL((String) obj3, "https://", false) && !u.LJJIIJZLJL((String) obj3, "http://", false))) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (z) {
                        break;
                    }
                }
                obj3 = null;
            } else {
                obj3 = null;
            }
            if (obj3 instanceof String) {
                str = (String) obj3;
            } else {
                str = null;
            }
            if (str != null && str.length() != 0) {
                z2 = false;
            }
            if (!z2) {
                return str;
            }
            Field field3 = requestFactoryField;
            if (field3 == null || (obj4 = field3.get(obj)) == null || (field = requestFactoryServerField) == null || (obj5 = field.get(obj4)) == null) {
                return null;
            }
            Object objInvoke = obj5.getClass().getMethod("getUrl", new Class[0]).invoke(obj5, new Object[0]);
            if (objInvoke instanceof String) {
                str2 = (String) objInvoke;
            } else {
                str2 = null;
            }
            if (str2 == null) {
                return null;
            }
            Field field4 = requestFactoryRelativeUrlField;
            String str4 = "";
            if (field4 == null || (obj6 = field4.get(obj4)) == null) {
                Field field5 = requestFactoryRelativeUrl1Field;
                if (field5 != null) {
                    obj6 = field5.get(obj4);
                } else {
                    obj6 = null;
                }
                if (obj6 == null) {
                    obj6 = "";
                }
            }
            if (obj6 instanceof String) {
                str3 = (String) obj6;
            } else {
                str3 = null;
            }
            if (str3 != null) {
                str4 = str3;
            }
            if (!u.LJJIIJZLJL(str4, "https://", false) && !u.LJJIIJZLJL(str4, "http://", false)) {
                if (!u.LJIIZILJ(str2, "/", false) && !u.LJJIIJZLJL(str4, "/", false)) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(str2);
                    sbLIZ.append('/');
                    sbLIZ.append(str4);
                    return C2188811AlT.LIZIZ(sbLIZ);
                }
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(str2);
                sbLIZ2.append(str4);
                return C2188811AlT.LIZIZ(sbLIZ2);
            }
            return str4;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x00d4 A[Catch: all -> 0x0134, TryCatch #1 {all -> 0x0134, blocks: (B:24:0x0056, B:26:0x0059, B:28:0x0060, B:30:0x0064, B:32:0x0070, B:34:0x007c, B:36:0x007f, B:39:0x0086, B:64:0x00ce, B:66:0x00d4, B:68:0x00dd, B:70:0x00e0, B:71:0x00e4, B:73:0x00ea, B:75:0x00f6, B:77:0x00fe, B:79:0x012f, B:42:0x008d, B:44:0x0090, B:46:0x0096, B:48:0x009a, B:49:0x00a9, B:53:0x00b1, B:55:0x00b4, B:57:0x00ba, B:59:0x00bd, B:62:0x00c8), top: B:88:0x0053 }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00ea A[Catch: all -> 0x0134, TryCatch #1 {all -> 0x0134, blocks: (B:24:0x0056, B:26:0x0059, B:28:0x0060, B:30:0x0064, B:32:0x0070, B:34:0x007c, B:36:0x007f, B:39:0x0086, B:64:0x00ce, B:66:0x00d4, B:68:0x00dd, B:70:0x00e0, B:71:0x00e4, B:73:0x00ea, B:75:0x00f6, B:77:0x00fe, B:79:0x012f, B:42:0x008d, B:44:0x0090, B:46:0x0096, B:48:0x009a, B:49:0x00a9, B:53:0x00b1, B:55:0x00b4, B:57:0x00ba, B:59:0x00bd, B:62:0x00c8), top: B:88:0x0053 }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0132 A[PHI: r0 r5 r7
      0x0132: PHI (r0v21 java.lang.String) = (r0v14 java.lang.String), (r0v45 java.lang.String) binds: [B:63:0x00cc, B:40:0x008a] A[DONT_GENERATE, DONT_INLINE]
      0x0132: PHI (r5v2 java.lang.String) = (r5v0 java.lang.String), (r5v4 java.lang.String) binds: [B:63:0x00cc, B:40:0x008a] A[DONT_GENERATE, DONT_INLINE]
      0x0132: PHI (r7v4 java.lang.String) = (r7v1 java.lang.String), (r7v7 java.lang.String) binds: [B:63:0x00cc, B:40:0x008a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00dd A[SYNTHETIC] */
    @Override // X.C0WSV
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public X.C0WSU preInvoke(int r9, java.lang.String r10, java.lang.String r11, java.lang.Object r12, java.lang.Object[] r13, java.lang.String r14, X.C0WZW r15) {
        /*
            Method dump skipped, instruction units count: 338
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.tiktok.pns.kidsmode.KShieldNetworkActionInvoker.preInvoke(int, java.lang.String, java.lang.String, java.lang.Object, java.lang.Object[], java.lang.String, X.0WZW):X.0WSU");
    }
}
