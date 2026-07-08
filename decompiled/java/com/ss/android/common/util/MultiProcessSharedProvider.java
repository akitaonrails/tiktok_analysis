package com.ss.android.common.util;

import X.C08TN;
import X.C0VJ3;
import X.C2188811AlT;
import X.C2362209Nk;
import X.C786410Ut5;
import X.C810670Vr7;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.UriMatcher;
import android.content.pm.ProviderInfo;
import android.net.Uri;
import com.bytedance.common.utility.Logger;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes14.dex */
public class MultiProcessSharedProvider extends ContentProvider {
    public static String LLILLL;
    public static Uri LLILZ;
    public static UriMatcher LLILZIL;
    public static C0VJ3 LLILZLL;
    public SharedPreferences LL;
    public Map<String, Object> LLILLJJLI;

    public final synchronized SharedPreferences LIZIZ() {
        SharedPreferences sharedPreferences = this.LL;
        if (sharedPreferences != null) {
            return sharedPreferences;
        }
        SharedPreferences sharedPreferencesLIZJ = C810670Vr7.LIZJ(C786410Ut5.N3(getContext()), 4, "multi_process_config");
        this.LL = sharedPreferencesLIZJ;
        return sharedPreferencesLIZJ;
    }

    public final synchronized void LJ() {
        if (this.LLILLJJLI == null) {
            this.LLILLJJLI = new ConcurrentHashMap();
            SharedPreferences sharedPreferencesLIZIZ = LIZIZ();
            if (sharedPreferencesLIZIZ != null) {
                for (Map.Entry<String, ?> entry : sharedPreferencesLIZIZ.getAll().entrySet()) {
                    this.LLILLJJLI.put(entry.getKey(), entry.getValue());
                }
            }
        }
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        boolean z = false;
        C08TN.LIZ().LJ("MultiProcessSharedProvider", false);
        if (LLILZIL == null) {
            try {
                Logger.debug();
                LIZLLL(getContext());
                try {
                    C786410Ut5.s3(getContext(), new Intent(getContext(), Class.forName("com.ss.android.newmedia.message.MessageHandler")));
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
                z = true;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        } else {
            C786410Ut5.s3(getContext(), new Intent(getContext(), Class.forName("com.ss.android.newmedia.message.MessageHandler")));
            z = true;
        }
        C08TN.LIZ().LJI("MultiProcessSharedProvider");
        return z;
    }

    public static synchronized C0VJ3 LIZJ(Context context) {
        if (LLILZLL == null) {
            LLILZLL = new C0VJ3(context);
        }
        return LLILZLL;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZLLL(android.content.Context r6) {
        /*
            java.lang.String r0 = com.ss.android.common.util.MultiProcessSharedProvider.LLILLL
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L4a
            java.lang.Class<com.ss.android.common.util.MultiProcessSharedProvider> r0 = com.ss.android.common.util.MultiProcessSharedProvider.class
            java.lang.String r5 = r0.getName()
            if (r6 == 0) goto L3e
            boolean r0 = X.C2093608Ic.LJ(r5)
            if (r0 != 0) goto L3e
            android.content.pm.PackageManager r2 = r6.getPackageManager()     // Catch: java.lang.Exception -> L3a
            java.lang.String r1 = r6.getPackageName()     // Catch: java.lang.Exception -> L3a
            r0 = 8
            android.content.pm.PackageInfo r0 = X.C786410Ut5.Y3(r2, r1, r0)     // Catch: java.lang.Exception -> L3a
            android.content.pm.ProviderInfo[] r4 = r0.providers     // Catch: java.lang.Exception -> L3a
            int r3 = r4.length     // Catch: java.lang.Exception -> L3a
            r2 = 0
        L28:
            if (r2 >= r3) goto L3e
            r1 = r4[r2]     // Catch: java.lang.Exception -> L3a
            java.lang.String r0 = r1.name     // Catch: java.lang.Exception -> L3a
            boolean r0 = r5.equals(r0)     // Catch: java.lang.Exception -> L3a
            if (r0 == 0) goto L37
            java.lang.String r0 = r1.authority     // Catch: java.lang.Exception -> L3a
            goto L3f
        L37:
            int r2 = r2 + 1
            goto L28
        L3a:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L3e:
            r0 = 0
        L3f:
            com.ss.android.common.util.MultiProcessSharedProvider.LLILLL = r0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L74
            com.bytedance.common.utility.Logger.debug()
        L4a:
            android.content.UriMatcher r3 = new android.content.UriMatcher
            r0 = -1
            r3.<init>(r0)
            com.ss.android.common.util.MultiProcessSharedProvider.LLILZIL = r3
            java.lang.String r2 = com.ss.android.common.util.MultiProcessSharedProvider.LLILLL
        */
        //  java.lang.String r1 = "*/*"
        /*
            r0 = 65536(0x10000, float:9.1835E-41)
            r3.addURI(r2, r1, r0)
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "content://"
            r1.append(r0)
            java.lang.String r0 = com.ss.android.common.util.MultiProcessSharedProvider.LLILLL
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            android.net.Uri r0 = com.bytedance.mt.protector.impl.UriProtector.parse(r0)
            com.ss.android.common.util.MultiProcessSharedProvider.LLILZ = r0
            return
        L74:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "Must Set MultiProcessSharedProvider Authority"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.common.util.MultiProcessSharedProvider.LIZLLL(android.content.Context):void");
    }

    public final void LJFF(Uri uri) {
        getContext().getContentResolver().notifyChange(uri, null);
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("vnd.android.cursor.item/vnd.");
        sbLIZ.append(LLILLL);
        sbLIZ.append(".item");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.content.ContentProvider
    public final void attachInfo(Context context, ProviderInfo providerInfo) {
        LLILLL = providerInfo.authority;
        super.attachInfo(context, providerInfo);
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        C2362209Nk.LIZ(uri, "insert");
        if (LLILZIL.match(uri) == 65536) {
            try {
                LJ();
                SharedPreferences.Editor editorEdit = null;
                for (Map.Entry<String, Object> entry : contentValues.valueSet()) {
                    Object value = entry.getValue();
                    String key = entry.getKey();
                    Logger.debug();
                    if (value == null) {
                        ((ConcurrentHashMap) this.LLILLJJLI).remove(key);
                    } else {
                        Object obj = ((ConcurrentHashMap) this.LLILLJJLI).get(key);
                        if (obj == null || !obj.equals(value)) {
                            ((ConcurrentHashMap) this.LLILLJJLI).put(key, value);
                        }
                    }
                    Logger.debug();
                    if (editorEdit == null) {
                        editorEdit = LIZIZ().edit();
                    }
                    if (value == null) {
                        editorEdit.remove(key);
                    } else if (value instanceof String) {
                        editorEdit.putString(key, (String) value);
                        LJFF(LIZ(getContext(), key, "string"));
                    } else if (value instanceof Boolean) {
                        editorEdit.putBoolean(key, ((Boolean) value).booleanValue());
                        LJFF(LIZ(getContext(), key, "boolean"));
                    } else if (value instanceof Long) {
                        editorEdit.putLong(key, ((Long) value).longValue());
                        LJFF(LIZ(getContext(), key, "long"));
                    } else if (value instanceof Integer) {
                        editorEdit.putInt(key, ((Integer) value).intValue());
                        LJFF(LIZ(getContext(), key, "integer"));
                    } else if (value instanceof Float) {
                        editorEdit.putFloat(key, ((Float) value).floatValue());
                        LJFF(LIZ(getContext(), key, "float"));
                    } else {
                        throw new IllegalArgumentException("Unsupported type " + uri);
                    }
                }
                if (editorEdit != null) {
                    editorEdit.apply();
                    return null;
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            return null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Unsupported uri ");
        sbLIZ.append(uri);
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static final synchronized Uri LIZ(Context context, String str, String str2) {
        if (LLILZ == null) {
            try {
                Logger.debug();
                LIZLLL(context);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return null;
            }
        }
        return LLILZ.buildUpon().appendPath(str).appendPath(str2).build();
    }

    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        C2362209Nk.LIZ(uri, "delete");
        if (LLILZIL.match(uri) == 65536) {
            try {
                LJ();
                LIZIZ().edit().clear().commit();
                ((ConcurrentHashMap) this.LLILLJJLI).clear();
                LJFF(LIZ(getContext(), "key", "type"));
                return 0;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return 0;
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Unsupported uri ");
        sbLIZ.append(uri);
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        C2362209Nk.LIZ(uri, "update");
        throw new UnsupportedOperationException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e2  */
    /* JADX WARN: Type inference failed for: r4v2, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    @Override // android.content.ContentProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.database.Cursor query(android.net.Uri r18, java.lang.String[] r19, java.lang.String r20, java.lang.String[] r21, java.lang.String r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 339
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.common.util.MultiProcessSharedProvider.query(android.net.Uri, java.lang.String[], java.lang.String, java.lang.String[], java.lang.String):android.database.Cursor");
    }
}
