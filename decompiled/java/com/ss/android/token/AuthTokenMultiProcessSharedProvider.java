package com.ss.android.token;

import X.C08TN;
import X.C0WFU;
import X.C0XMV;
import X.C0XMZ;
import X.C2104208Me;
import X.C2188811AlT;
import X.C2362209Nk;
import X.C786410Ut5;
import X.C810670Vr7;
import X.C847400XMc;
import Y.ARunnableS7S2100000_13;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.UriMatcher;
import android.content.pm.ProviderInfo;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public class AuthTokenMultiProcessSharedProvider extends ContentProvider {
    public static String LLILZIL = null;
    public static Uri LLILZLL = null;
    public static UriMatcher LLIZ = null;
    public static C0WFU LLIZLLLIL = null;
    public static String LLJ = "token_shared_preference";
    public SharedPreferences LL;
    public final Map<String, Object> LLILLJJLI = new ConcurrentHashMap();
    public volatile boolean LLILLL = false;
    public final Object LLILZ = new Object();

    public final synchronized SharedPreferences LIZJ() {
        SharedPreferences sharedPreferences = this.LL;
        if (sharedPreferences != null) {
            return sharedPreferences;
        }
        SharedPreferences sharedPreferencesLIZJ = C810670Vr7.LIZJ(C786410Ut5.N3(getContext()), 4, LLJ);
        this.LL = sharedPreferencesLIZJ;
        return sharedPreferencesLIZJ;
    }

    public static boolean LJ() {
        return TextUtils.isEmpty(LLILZIL) || LLIZ == null;
    }

    public final void LIZ() {
        if (this.LLILLL) {
            return;
        }
        synchronized (this.LLILZ) {
            try {
                if (!this.LLILLL) {
                    LJFF();
                    this.LLILLL = true;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void LJFF() {
        SharedPreferences sharedPreferencesLIZJ = LIZJ();
        if (sharedPreferencesLIZJ == null) {
            return;
        }
        for (Map.Entry<String, ?> entry : sharedPreferencesLIZJ.getAll().entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (value == null || key == null) {
                try {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("MultiProcessShareProvider loadValues key_ = ");
                    sbLIZ.append(key);
                    sbLIZ.append(" value_ = ");
                    sbLIZ.append(value);
                    C847400XMc.LJIIIZ("AuthTokenMultiProcessShared", C2188811AlT.LIZIZ(sbLIZ));
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("key_", key);
                    jSONObject.put("value_", value);
                    C0XMZ.LJIIL("token_sp_error", jSONObject);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    C0XMZ.LIZJ(e);
                }
            } else {
                ((ConcurrentHashMap) this.LLILLJJLI).put(key, value);
            }
        }
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        boolean z = false;
        C08TN.LIZ().LJ("AuthTokenMultiProcessSharedProvider", false);
        if (C847400XMc.LJ && !C2104208Me.LIZ(getContext())) {
            throw new IllegalAccessError("should be create in main process");
        }
        if (LLIZ == null) {
            try {
                C847400XMc.LJIIIZ("AuthTokenMultiProcessSharedProvider", "init form onCreate");
                LIZLLL(getContext());
                z = true;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C0XMZ.LIZJ(e);
            }
        } else {
            z = true;
        }
        C08TN.LIZ().LJI("AuthTokenMultiProcessSharedProvider");
        return z;
    }

    public static void LIZLLL(Context context) {
        String strLIZIZ;
        int i;
        if (TextUtils.isEmpty(LLILZIL)) {
            String name = AuthTokenMultiProcessSharedProvider.class.getName();
            if (context != null && !TextUtils.isEmpty(name)) {
                try {
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    C0XMZ.LIZJ(e);
                }
                for (ProviderInfo providerInfo : C786410Ut5.Y3(context.getPackageManager(), context.getPackageName(), 8).providers) {
                    if (name.equals(providerInfo.name)) {
                        strLIZIZ = providerInfo.authority;
                        break;
                    }
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(context.getPackageName());
                    sbLIZ.append(".auth_token.SHARE_PROVIDER_AUTHORITY");
                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                }
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(context.getPackageName());
                sbLIZ2.append(".auth_token.SHARE_PROVIDER_AUTHORITY");
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
            } else {
                strLIZIZ = null;
            }
            LLILZIL = strLIZIZ;
        }
        if (!TextUtils.isEmpty(LLILZIL)) {
            C847400XMc.LJIIIZ("AuthTokenMultiProcessSharedProvider", LLILZIL);
            UriMatcher uriMatcher = new UriMatcher(-1);
            LLIZ = uriMatcher;
            uriMatcher.addURI(LLILZIL, "*/*", 65536);
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("content://");
            sbLIZ3.append(LLILZIL);
            LLILZLL = UriProtector.parse(C2188811AlT.LIZIZ(sbLIZ3));
            return;
        }
        throw new IllegalStateException("Must Set AuthTokenMultiProcessSharedProvider Authority");
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        LIZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("vnd.android.cursor.item/vnd.");
        sbLIZ.append(LLILZIL);
        sbLIZ.append(".item");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.content.ContentProvider
    public final void attachInfo(Context context, ProviderInfo providerInfo) {
        if (providerInfo != null) {
            LLILZIL = providerInfo.authority;
        }
        super.attachInfo(context, providerInfo);
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        ARunnableS7S2100000_13 aRunnableS7S2100000_13;
        C2362209Nk.LIZ(uri, "insert");
        LIZ();
        if (!LJ()) {
            if (LLIZ.match(uri) == 65536) {
                try {
                    ArrayList arrayList = new ArrayList();
                    SharedPreferences.Editor editorEdit = null;
                    for (Map.Entry<String, Object> entry : contentValues.valueSet()) {
                        Object value = entry.getValue();
                        String key = entry.getKey();
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("MultiProcessShareProvider reallly insert key = ");
                        sbLIZ.append(key);
                        sbLIZ.append(" value = ");
                        sbLIZ.append(C0XMV.LIZJ(value));
                        C847400XMc.LJIIIZ("AuthTokenMultiProcessShared", C2188811AlT.LIZIZ(sbLIZ));
                        if (key != null) {
                            if (value == null) {
                                ((ConcurrentHashMap) this.LLILLJJLI).remove(key);
                            } else {
                                Object obj = ((ConcurrentHashMap) this.LLILLJJLI).get(key);
                                if (obj == null || !obj.equals(value)) {
                                    ((ConcurrentHashMap) this.LLILLJJLI).put(key, value);
                                }
                            }
                            C847400XMc.LJIIIZ("AuthTokenMultiProcessShared", "MultiProcessShareProvider reallly insert key = " + key + " value = " + C0XMV.LIZJ(value));
                            if (editorEdit == null) {
                                editorEdit = LIZJ().edit();
                            }
                            if (value == null) {
                                editorEdit.remove(key);
                            } else {
                                if (value instanceof String) {
                                    editorEdit.putString(key, (String) value);
                                    aRunnableS7S2100000_13 = new ARunnableS7S2100000_13(this, key, "string", 3);
                                } else if (value instanceof Boolean) {
                                    editorEdit.putBoolean(key, ((Boolean) value).booleanValue());
                                    aRunnableS7S2100000_13 = new ARunnableS7S2100000_13(this, key, "boolean", 3);
                                } else if (value instanceof Long) {
                                    editorEdit.putLong(key, ((Long) value).longValue());
                                    aRunnableS7S2100000_13 = new ARunnableS7S2100000_13(this, key, "long", 3);
                                } else if (value instanceof Integer) {
                                    editorEdit.putInt(key, ((Integer) value).intValue());
                                    aRunnableS7S2100000_13 = new ARunnableS7S2100000_13(this, key, "integer", 3);
                                } else if (value instanceof Float) {
                                    editorEdit.putFloat(key, ((Float) value).floatValue());
                                    aRunnableS7S2100000_13 = new ARunnableS7S2100000_13(this, key, "float", 3);
                                } else {
                                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                    sbLIZ2.append("Unsupported type ");
                                    sbLIZ2.append(uri);
                                    throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ2));
                                }
                                arrayList.add(aRunnableS7S2100000_13);
                            }
                        }
                    }
                    if (editorEdit != null) {
                        editorEdit.apply();
                        Iterator it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            ((Runnable) it2.next()).run();
                        }
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    C0XMZ.LIZJ(e);
                    return null;
                }
            } else {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("Unsupported uri ");
                sbLIZ3.append(uri);
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ3));
            }
        }
        return null;
    }

    public static final synchronized Uri LIZIZ(Context context, String str, String str2) {
        if (LLILZLL == null) {
            try {
                C847400XMc.LJIIIZ("MultiProcessSharedProvider", "init form getContentUri");
                LIZLLL(context);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C0XMZ.LIZJ(e);
                return null;
            }
        }
        return LLILZLL.buildUpon().appendPath(str).appendPath(str2).build();
    }

    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        C2362209Nk.LIZ(uri, "delete");
        LIZ();
        if (!LJ()) {
            if (LLIZ.match(uri) == 65536) {
                try {
                    ((ConcurrentHashMap) this.LLILLJJLI).clear();
                    LIZJ().edit().clear().commit();
                    getContext().getContentResolver().notifyChange(LIZIZ(getContext(), "key", "type"), null);
                    return 0;
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    C0XMZ.LIZJ(e);
                    return 0;
                }
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Unsupported uri ");
            sbLIZ.append(uri);
            throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
        }
        return 0;
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        C2362209Nk.LIZ(uri, "update");
        throw new UnsupportedOperationException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e8  */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r3v2 */
    @Override // android.content.ContentProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.database.Cursor query(android.net.Uri r18, java.lang.String[] r19, java.lang.String r20, java.lang.String[] r21, java.lang.String r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 396
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.token.AuthTokenMultiProcessSharedProvider.query(android.net.Uri, java.lang.String[], java.lang.String, java.lang.String[], java.lang.String):android.database.Cursor");
    }
}
