package com.bytedance.common.wschannel;

import X.C08TN;
import X.C0WFS;
import X.C2093608Ic;
import X.C2103808Ma;
import X.C2188811AlT;
import X.C2362209Nk;
import X.C786410Ut5;
import X.C810670Vr7;
import X.C820090WFb;
import X.InterfaceC820110WFd;
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
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes14.dex */
public class WsChannelMultiProcessSharedProvider extends ContentProvider {
    public static String LLILZ;
    public static Uri LLILZIL;
    public static UriMatcher LLILZLL;
    public static boolean LLIZ;
    public static volatile boolean LLIZLLLIL;
    public static C0WFS LLJ;
    public SharedPreferences LL;
    public final Map<String, Object> LLILLJJLI = new ConcurrentHashMap();
    public final Object LLILLL = new Object();

    public final synchronized SharedPreferences LIZIZ() {
        SharedPreferences sharedPreferences = this.LL;
        if (sharedPreferences != null) {
            return sharedPreferences;
        }
        SharedPreferences sharedPreferencesLIZJ = C810670Vr7.LIZJ(C786410Ut5.N3(getContext()), 4, "wschannel_multi_process_config");
        this.LL = sharedPreferencesLIZJ;
        return sharedPreferencesLIZJ;
    }

    public final void LIZLLL() {
        if (LLIZLLLIL) {
            return;
        }
        synchronized (this.LLILLL) {
            try {
                if (!LLIZLLLIL) {
                    SharedPreferences sharedPreferencesLIZIZ = LIZIZ();
                    if (sharedPreferencesLIZIZ == null) {
                        LLIZLLLIL = true;
                        return;
                    }
                    for (Map.Entry<String, ?> entry : sharedPreferencesLIZIZ.getAll().entrySet()) {
                        ((ConcurrentHashMap) this.LLILLJJLI).put(entry.getKey(), entry.getValue());
                    }
                    LLIZLLLIL = true;
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
        C08TN.LIZ().LJ("WsChannelMultiProcessSharedProvider", false);
        if (C2103808Ma.LIZJ(getContext())) {
            LLIZ = true;
        }
        final Application application = (Application) C786410Ut5.N3(getContext());
        C820090WFb c820090WFb = new C820090WFb();
        c820090WFb.LLILLJJLI = new InterfaceC820110WFd(application) { // from class: X.0WFZ
            public final Application LIZ;

            @Override // X.InterfaceC820110WFd
            public final void LIZ() {
                C821310WJt.LIZLLL = false;
                if (C821310WJt.LIZJ.get()) {
                    C0WJW.LJ(1, this.LIZ);
                }
            }

            @Override // X.InterfaceC820110WFd
            public final void LIZIZ() {
                C821310WJt.LIZLLL = true;
                if (C821310WJt.LIZJ.get()) {
                    C0WJW.LJ(2, this.LIZ);
                }
            }

            {
                this.LIZ = application;
            }
        };
        application.registerActivityLifecycleCallbacks(c820090WFb);
        if (LLILZLL == null) {
            try {
                Logger.debug();
                LIZJ(getContext());
                z = true;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        } else {
            z = true;
        }
        C08TN.LIZ().LJI("WsChannelMultiProcessSharedProvider");
        return z;
    }

    public static void LIZJ(Context context) {
        String str;
        int i;
        if (TextUtils.isEmpty(LLILZ)) {
            String name = WsChannelMultiProcessSharedProvider.class.getName();
            if (context != null && !C2093608Ic.LJ(name)) {
                try {
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                for (ProviderInfo providerInfo : C786410Ut5.Y3(context.getPackageManager(), context.getPackageName(), 8).providers) {
                    if (name.equals(providerInfo.name)) {
                        str = providerInfo.authority;
                        break;
                    }
                    str = null;
                }
                str = null;
                LLILZ = str;
            } else {
                str = null;
                LLILZ = str;
            }
        }
        if (!TextUtils.isEmpty(LLILZ)) {
            Logger.debug();
            UriMatcher uriMatcher = new UriMatcher(-1);
            LLILZLL = uriMatcher;
            uriMatcher.addURI(LLILZ, "*/*", 65536);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("content://");
            sbLIZ.append(LLILZ);
            LLILZIL = UriProtector.parse(C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        throw new IllegalStateException("Must Set MultiProcessSharedProvider Authority");
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("vnd.android.cursor.item/vnd.");
        sbLIZ.append(LLILZ);
        sbLIZ.append(".item");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.content.ContentProvider
    public final void attachInfo(Context context, ProviderInfo providerInfo) {
        if (providerInfo != null) {
            LLILZ = providerInfo.authority;
        }
        super.attachInfo(context, providerInfo);
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        ARunnableS7S2100000_13 aRunnableS7S2100000_13;
        String string;
        C2362209Nk.LIZ(uri, "insert");
        if (LLILZLL.match(uri) == 65536) {
            try {
                LIZLLL();
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
                        Logger.v("PushService", string);
                    }
                    if (editorEdit == null) {
                        editorEdit = LIZIZ().edit();
                    }
                    if (value == null) {
                        editorEdit.remove(key);
                    } else {
                        if (value instanceof String) {
                            editorEdit.putString(key, (String) value);
                            aRunnableS7S2100000_13 = new ARunnableS7S2100000_13(this, key, "string", 0);
                        } else if (value instanceof Boolean) {
                            editorEdit.putBoolean(key, ((Boolean) value).booleanValue());
                            aRunnableS7S2100000_13 = new ARunnableS7S2100000_13(this, key, "boolean", 0);
                        } else if (value instanceof Long) {
                            editorEdit.putLong(key, ((Long) value).longValue());
                            aRunnableS7S2100000_13 = new ARunnableS7S2100000_13(this, key, "long", 0);
                        } else if (value instanceof Integer) {
                            editorEdit.putInt(key, ((Integer) value).intValue());
                            aRunnableS7S2100000_13 = new ARunnableS7S2100000_13(this, key, "integer", 0);
                        } else if (value instanceof Float) {
                            editorEdit.putFloat(key, ((Float) value).floatValue());
                            aRunnableS7S2100000_13 = new ARunnableS7S2100000_13(this, key, "float", 0);
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
            }
            return null;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("Unsupported uri ");
        sbLIZ2.append(uri);
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ2));
    }

    public static final synchronized Uri LIZ(Context context, String str, String str2) {
        if (LLILZIL == null) {
            try {
                Logger.debug();
                LIZJ(context);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return null;
            }
        }
        return LLILZIL.buildUpon().appendPath(str).appendPath(str2).build();
    }

    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        C2362209Nk.LIZ(uri, "delete");
        if (LLILZLL.match(uri) == 65536) {
            try {
                LIZIZ().edit().clear().commit();
                ((ConcurrentHashMap) this.LLILLJJLI).clear();
                getContext().getContentResolver().notifyChange(LIZ(getContext(), "key", "type"), null);
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
    /* JADX WARN: Removed duplicated region for block: B:40:0x00df  */
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
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.common.wschannel.WsChannelMultiProcessSharedProvider.query(android.net.Uri, java.lang.String[], java.lang.String, java.lang.String[], java.lang.String):android.database.Cursor");
    }
}
