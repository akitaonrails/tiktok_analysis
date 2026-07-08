package com.ss.android.pushmanager.setting;

import X.C08TN;
import X.C0V4R;
import X.C1519870peb;
import X.C2093608Ic;
import X.C2188811AlT;
import X.C2362209Nk;
import X.C786410Ut5;
import X.C809320Vow;
import X.C809360Vp0;
import X.C810670Vr7;
import X.C844470XAv;
import Y.ARunnableS7S2100000_13;
import android.app.Application;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.UriMatcher;
import android.content.pm.ProviderInfo;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.common.utility.Logger;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes14.dex */
public class PushMultiProcessSharedProvider extends ContentProvider {
    public static String LLILZIL;
    public static Uri LLILZLL;
    public static UriMatcher LLIZ;
    public static C809320Vow LLIZLLLIL;
    public SharedPreferences LL;
    public final Map<String, Object> LLILLJJLI = new ConcurrentHashMap();
    public volatile boolean LLILLL = false;
    public final Object LLILZ = new Object();

    public static synchronized C809320Vow LJ(Context context) {
        return LIZ(context);
    }

    public final synchronized SharedPreferences LIZLLL() {
        SharedPreferences sharedPreferences = this.LL;
        if (sharedPreferences != null) {
            return sharedPreferences;
        }
        SharedPreferences sharedPreferencesLIZJ = C810670Vr7.LIZJ(C786410Ut5.N3(getContext()), 4, "push_multi_process_config");
        this.LL = sharedPreferencesLIZJ;
        return sharedPreferencesLIZJ;
    }

    public static boolean LJI() {
        return TextUtils.isEmpty(LLILZIL) || LLIZ == null;
    }

    public final void LIZIZ() {
        if (this.LLILLL) {
            return;
        }
        synchronized (this.LLILZ) {
            try {
                if (!this.LLILLL) {
                    SharedPreferences sharedPreferencesLIZLLL = LIZLLL();
                    if (sharedPreferencesLIZLLL != null) {
                        for (Map.Entry<String, ?> entry : sharedPreferencesLIZLLL.getAll().entrySet()) {
                            String key = entry.getKey();
                            Object value = entry.getValue();
                            if (key != null && value != null) {
                                ((ConcurrentHashMap) this.LLILLJJLI).put(key, value);
                            }
                        }
                    }
                    this.LLILLL = true;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        boolean z = false;
        C08TN.LIZ().LJ("PushMultiProcessSharedProvider", false);
        if (Logger.debug() && !C0V4R.LJII(getContext())) {
            throw new IllegalAccessError("should be create in main process");
        }
        C809360Vp0.LIZ((Application) C786410Ut5.N3(getContext()));
        if (LLIZ == null) {
            try {
                Logger.debug();
                LJFF(getContext());
                z = true;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        } else {
            z = true;
        }
        C08TN.LIZ().LJI("PushMultiProcessSharedProvider");
        return z;
    }

    public static C809320Vow LIZ(Context context) {
        C809320Vow c809320Vow;
        if (context == null) {
            System.err.println("PushMultiProcessSharedProvider.getMultiprocessShared_context_null");
            C844470XAv.LIZ.getClass();
            context = C844470XAv.LIZ();
            if (context == null) {
                System.err.println("PushMultiProcessSharedProvider.getMultiprocessShared_context_null_AppContextManager.getApplicationContext()");
                context = C1519870peb.LIZIZ;
                PrintStream printStream = System.err;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("PushMultiProcessSharedProvider.getMultiprocessShared_context_null_AwemeKeva.getAppContext()");
                sbLIZ.append(context);
                printStream.println(C2188811AlT.LIZIZ(sbLIZ));
            }
        }
        synchronized (PushMultiProcessSharedProvider.class) {
            if (LLIZLLLIL == null) {
                LLIZLLLIL = new C809320Vow(context);
            }
            c809320Vow = LLIZLLLIL;
        }
        return c809320Vow;
    }

    public static void LJFF(Context context) {
        String strLIZIZ;
        int i;
        if (TextUtils.isEmpty(LLILZIL)) {
            String name = PushMultiProcessSharedProvider.class.getName();
            if (context != null && !C2093608Ic.LJ(name)) {
                try {
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                for (ProviderInfo providerInfo : C786410Ut5.Y3(context.getPackageManager(), context.getPackageName(), 8).providers) {
                    if (name.equals(providerInfo.name)) {
                        strLIZIZ = providerInfo.authority;
                        break;
                    }
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(context.getPackageName());
                    sbLIZ.append(".push.SHARE_PROVIDER_AUTHORITY");
                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                }
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(context.getPackageName());
                sbLIZ2.append(".push.SHARE_PROVIDER_AUTHORITY");
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
            } else {
                strLIZIZ = null;
            }
            LLILZIL = strLIZIZ;
        }
        if (!TextUtils.isEmpty(LLILZIL)) {
            Logger.debug();
            UriMatcher uriMatcher = new UriMatcher(-1);
            LLIZ = uriMatcher;
            uriMatcher.addURI(LLILZIL, "*/*", 65536);
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("content://");
            sbLIZ3.append(LLILZIL);
            LLILZLL = UriProtector.parse(C2188811AlT.LIZIZ(sbLIZ3));
            return;
        }
        throw new IllegalStateException("Must Set MultiProcessSharedProvider Authority");
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        LIZIZ();
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
        String string;
        C2362209Nk.LIZ(uri, "insert");
        LIZIZ();
        if (!LJI()) {
            if (LLIZ.match(uri) == 65536) {
                try {
                    ArrayList arrayList = new ArrayList();
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
                        if (Logger.debug()) {
                            if (("MultiProcessShareProvider reallly insert key = " + key + " value = " + value) != null) {
                                string = value.toString();
                            } else {
                                string = "null";
                            }
                            Logger.d("PushService", string);
                        }
                        if (editorEdit == null) {
                            editorEdit = LIZLLL().edit();
                        }
                        if (value == null) {
                            editorEdit.remove(key);
                        } else {
                            if (value instanceof String) {
                                editorEdit.putString(key, (String) value);
                                aRunnableS7S2100000_13 = new ARunnableS7S2100000_13(this, key, "string", 6);
                            } else if (value instanceof Boolean) {
                                editorEdit.putBoolean(key, ((Boolean) value).booleanValue());
                                aRunnableS7S2100000_13 = new ARunnableS7S2100000_13(this, key, "boolean", 6);
                            } else if (value instanceof Long) {
                                editorEdit.putLong(key, ((Long) value).longValue());
                                aRunnableS7S2100000_13 = new ARunnableS7S2100000_13(this, key, "long", 6);
                            } else if (value instanceof Integer) {
                                editorEdit.putInt(key, ((Integer) value).intValue());
                                aRunnableS7S2100000_13 = new ARunnableS7S2100000_13(this, key, "integer", 6);
                            } else if (value instanceof Float) {
                                editorEdit.putFloat(key, ((Float) value).floatValue());
                                aRunnableS7S2100000_13 = new ARunnableS7S2100000_13(this, key, "float", 6);
                            } else {
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("Unsupported type ");
                                sbLIZ.append(uri);
                                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
                            }
                            arrayList.add(aRunnableS7S2100000_13);
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
                    return null;
                }
            } else {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("Unsupported uri ");
                sbLIZ2.append(uri);
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ2));
            }
        }
        return null;
    }

    public static final synchronized Uri LIZJ(Context context, String str, String str2) {
        if (LLILZLL == null) {
            try {
                Logger.debug();
                LJFF(context);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return null;
            }
        }
        return LLILZLL.buildUpon().appendPath(str).appendPath(str2).build();
    }

    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        C2362209Nk.LIZ(uri, "delete");
        LIZIZ();
        if (!LJI() && LLIZ.match(uri) != 65536) {
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

    /* JADX WARN: Removed duplicated region for block: B:42:0x00e8  */
    @Override // android.content.ContentProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.database.Cursor query(android.net.Uri r18, java.lang.String[] r19, java.lang.String r20, java.lang.String[] r21, java.lang.String r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 402
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.pushmanager.setting.PushMultiProcessSharedProvider.query(android.net.Uri, java.lang.String[], java.lang.String, java.lang.String[], java.lang.String):android.database.Cursor");
    }
}
