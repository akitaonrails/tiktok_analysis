package com.bytedance.push.settings.storage;

import X.C08TN;
import X.C0WFG;
import X.C0WFL;
import X.C0WFP;
import X.C0WFR;
import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C2188811AlT;
import X.C2362209Nk;
import X.C786410Ut5;
import X.InterfaceC810050Vq7;
import Y.ARunnableS0S3100000_13;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.UriMatcher;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastFloatProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes14.dex */
public class PushProvider extends ContentProvider {
    public static String LL;
    public static Uri LLILLJJLI;
    public static UriMatcher LLILLL;
    public static volatile boolean LLILZ;

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        boolean z = false;
        C08TN.LIZ().LJ("PushProvider", false);
        LLILZ = true;
        if (LLILLL == null) {
            try {
                LIZIZ(getContext());
                z = true;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        } else {
            z = true;
        }
        C08TN.LIZ().LJI("PushProvider");
        return z;
    }

    public static void LIZIZ(Context context) {
        String str;
        if (TextUtils.isEmpty(LL)) {
            String name = PushProvider.class.getName();
            if (context == null) {
                str = null;
            } else {
                try {
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (!TextUtils.isEmpty(name)) {
                    for (ProviderInfo providerInfo : C786410Ut5.Y3(context.getPackageManager(), context.getPackageName(), 8).providers) {
                        if (name.equals(providerInfo.name)) {
                            str = providerInfo.authority;
                            break;
                        }
                        str = context.getPackageName() + ".push.settings";
                    }
                    str = context.getPackageName() + ".push.settings";
                } else {
                    str = context.getPackageName() + ".push.settings";
                }
            }
            LL = str;
        }
        if (!TextUtils.isEmpty(LL)) {
            UriMatcher uriMatcher = new UriMatcher(-1);
            LLILLL = uriMatcher;
            uriMatcher.addURI(LL, "*/*/*/*", 65536);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("content://");
            sbLIZ.append(LL);
            LLILLJJLI = UriProtector.parse(C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        throw new IllegalStateException("Must Set MultiProcessSharedProvider Authority");
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("vnd.android.cursor.item/vnd.");
        sbLIZ.append(LL);
        sbLIZ.append(".item");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static synchronized Uri LIZ(Context context, C0WFR c0wfr) {
        if (LLILLJJLI == null) {
            try {
                LIZIZ(context);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return null;
            }
        }
        if (c0wfr == null) {
            return LLILLJJLI;
        }
        return c0wfr.LIZ(LLILLJJLI);
    }

    @Override // android.content.ContentProvider
    public final void attachInfo(Context context, ProviderInfo providerInfo) {
        if (providerInfo != null) {
            LL = providerInfo.authority;
        }
        super.attachInfo(context, providerInfo);
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        boolean z;
        String str;
        C2362209Nk.LIZ(uri, "insert");
        if (!TextUtils.isEmpty(LL) && LLILLL != null) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            if (LLILLL.match(uri) == 65536) {
                List<String> pathSegments = uri.getPathSegments();
                if (pathSegments != null) {
                    String str2 = (String) ListProtector.get(pathSegments, 0);
                    try {
                        InterfaceC810050Vq7 interfaceC810050Vq7LIZ = C0WFG.LIZ(getContext(), str2, true);
                        SharedPreferences.Editor editorEdit = interfaceC810050Vq7LIZ.edit();
                        ArrayList arrayList = new ArrayList();
                        for (Map.Entry<String, Object> entry : contentValues.valueSet()) {
                            Object value = entry.getValue();
                            String key = entry.getKey();
                            if (value == null) {
                                editorEdit.remove(key);
                            } else if (value instanceof String) {
                                if (!TextUtils.equals(interfaceC810050Vq7LIZ.getString(key), (String) value)) {
                                    editorEdit.putString(key, (String) value);
                                    str = "string";
                                    arrayList.add(new ARunnableS0S3100000_13(getContext(), str2, key, str, 1));
                                }
                            } else if (value instanceof Boolean) {
                                if (interfaceC810050Vq7LIZ.getBoolean(key) != ((Boolean) value).booleanValue()) {
                                    editorEdit.putBoolean(key, ((Boolean) value).booleanValue());
                                    str = "boolean";
                                    arrayList.add(new ARunnableS0S3100000_13(getContext(), str2, key, str, 1));
                                }
                            } else if (value instanceof Long) {
                                if (interfaceC810050Vq7LIZ.getLong(key) != ((Long) value).longValue()) {
                                    editorEdit.putLong(key, ((Long) value).longValue());
                                    str = "long";
                                    arrayList.add(new ARunnableS0S3100000_13(getContext(), str2, key, str, 1));
                                }
                            } else if (value instanceof Integer) {
                                if (interfaceC810050Vq7LIZ.getInt(key) != ((Integer) value).intValue()) {
                                    editorEdit.putInt(key, ((Integer) value).intValue());
                                    str = "integer";
                                    arrayList.add(new ARunnableS0S3100000_13(getContext(), str2, key, str, 1));
                                }
                            } else if (value instanceof Float) {
                                if (interfaceC810050Vq7LIZ.LIZJ(key) != ((Float) value).floatValue()) {
                                    editorEdit.putFloat(key, ((Float) value).floatValue());
                                    str = "float";
                                    arrayList.add(new ARunnableS0S3100000_13(getContext(), str2, key, str, 1));
                                }
                            } else {
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("Unsupported type ");
                                sbLIZ.append(uri);
                                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
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

    @Override // android.content.ContentProvider
    public final Bundle call(String str, String str2, Bundle bundle) throws Throwable {
        Object obj = str;
        Bundle bundle2 = bundle;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(11067, "com/bytedance/push/settings/storage/PushProvider", "call", this, new Object[]{obj, str2, bundle2}, "android.os.Bundle", new C0WZW(false, "(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)Landroid/os/Bundle;", new C0WZX("dzBzEgAjS8/YVFkiQFyUc9fIAzpl9tGA0FyVag9sVCmi6+HeLSorl0IyycyeJqrJ", null)));
        if (c0wsuLIZIZ.LIZ) {
            return (Bundle) c0wsuLIZIZ.LIZIZ;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null) {
            Object obj2 = objArr[0];
            if (obj2 != null) {
                obj = obj2;
            }
            Object obj3 = objArr[1];
            Object obj4 = objArr[2];
            if (obj4 != null) {
                bundle2 = (Bundle) obj4;
            }
        }
        C0WFP c0wfp = (C0WFP) ((ConcurrentHashMap) C0WFL.LIZ).get(obj);
        if (c0wfp == null) {
            return null;
        }
        return c0wfp.LIZ(getContext(), bundle2);
    }

    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        C2362209Nk.LIZ(uri, "delete");
        return 0;
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        C2362209Nk.LIZ(uri, "update");
        return 0;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) throws Throwable {
        Uri uri2;
        List<String> pathSegments;
        Object objValueOf;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(11068, "com/bytedance/push/settings/storage/PushProvider", "query", this, new Object[]{uri, strArr, str, strArr2, str2}, "android.database.Cursor", new C0WZW(false, "(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;", new C0WZX("dzBzEgAjS8/YVFkiQFyUc9fIAzpl9tGA0FyVag9sVCmi6+HeLSorl0IyycyeJqrJ", null)));
        if (c0wsuLIZIZ.LIZ) {
            return (Cursor) c0wsuLIZIZ.LIZIZ;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null) {
            Object obj = objArr[0];
            if (obj != null) {
                uri2 = (Uri) obj;
            } else {
                uri2 = uri;
            }
            Object obj2 = objArr[1];
            Object obj3 = objArr[2];
            Object obj4 = objArr[3];
            Object obj5 = objArr[4];
        } else {
            uri2 = uri;
        }
        C2362209Nk.LIZ(uri2, "query");
        if (!TextUtils.isEmpty(LL) && LLILLL != null && LLILLL.match(uri2) == 65536 && uri2 != null && (pathSegments = uri2.getPathSegments()) != null && pathSegments.size() >= 4) {
            C0WFR c0wfr = new C0WFR((String) ListProtector.get(pathSegments, 0), (String) ListProtector.get(pathSegments, 1), (String) ListProtector.get(pathSegments, 2), (String) ListProtector.get(pathSegments, 3));
            if (!TextUtils.isEmpty(c0wfr.LIZ) && !TextUtils.isEmpty(c0wfr.LIZIZ) && !TextUtils.isEmpty(c0wfr.LIZLLL)) {
                InterfaceC810050Vq7 interfaceC810050Vq7LIZ = C0WFG.LIZ(getContext(), c0wfr.LIZ, true);
                String str3 = c0wfr.LIZLLL;
                str3.getClass();
                switch (str3.hashCode()) {
                    case -891985903:
                        if (str3.equals("string")) {
                            objValueOf = interfaceC810050Vq7LIZ.getString(c0wfr.LIZIZ, c0wfr.LIZJ);
                            MatrixCursor matrixCursor = new MatrixCursor(new String[]{c0wfr.LIZIZ});
                            matrixCursor.newRow().add(objValueOf);
                            return matrixCursor;
                        }
                        throw new IllegalArgumentException("unknown type");
                    case 3327612:
                        if (str3.equals("long")) {
                            objValueOf = Long.valueOf(interfaceC810050Vq7LIZ.getLong(c0wfr.LIZIZ, CastLongProtector.parseLong(c0wfr.LIZJ)));
                            MatrixCursor matrixCursor2 = new MatrixCursor(new String[]{c0wfr.LIZIZ});
                            matrixCursor2.newRow().add(objValueOf);
                            return matrixCursor2;
                        }
                        throw new IllegalArgumentException("unknown type");
                    case 64711720:
                        if (str3.equals("boolean")) {
                            objValueOf = Integer.valueOf(interfaceC810050Vq7LIZ.getBoolean(c0wfr.LIZIZ, Boolean.parseBoolean(c0wfr.LIZJ)) ? 1 : 0);
                            MatrixCursor matrixCursor22 = new MatrixCursor(new String[]{c0wfr.LIZIZ});
                            matrixCursor22.newRow().add(objValueOf);
                            return matrixCursor22;
                        }
                        throw new IllegalArgumentException("unknown type");
                    case 97526364:
                        if (str3.equals("float")) {
                            objValueOf = Float.valueOf(interfaceC810050Vq7LIZ.getFloat(c0wfr.LIZIZ, CastFloatProtector.parseFloat(c0wfr.LIZJ)));
                            MatrixCursor matrixCursor222 = new MatrixCursor(new String[]{c0wfr.LIZIZ});
                            matrixCursor222.newRow().add(objValueOf);
                            return matrixCursor222;
                        }
                        throw new IllegalArgumentException("unknown type");
                    case 1958052158:
                        if (str3.equals("integer")) {
                            objValueOf = Integer.valueOf(interfaceC810050Vq7LIZ.getInt(c0wfr.LIZIZ, CastIntegerProtector.parseInt(c0wfr.LIZJ)));
                            MatrixCursor matrixCursor2222 = new MatrixCursor(new String[]{c0wfr.LIZIZ});
                            matrixCursor2222.newRow().add(objValueOf);
                            return matrixCursor2222;
                        }
                        throw new IllegalArgumentException("unknown type");
                    default:
                        throw new IllegalArgumentException("unknown type");
                }
            }
        }
        return null;
    }
}
