package com.bytedance.bdinstall;

import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C0XCJ;
import X.C2123908Tt;
import X.C2188811AlT;
import X.C2362209Nk;
import X.C786410Ut5;
import android.app.Application;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.UriMatcher;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes14.dex */
public class BDInstallProvider extends ContentProvider {
    public static String LL;
    public static UriMatcher LLILLJJLI;
    public static Uri LLILLL;
    public static Context LLILZ;

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        if (LLILLJJLI == null) {
            try {
                LIZIZ(getContext());
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return false;
            }
        }
        try {
            Context context = getContext();
            if (!(context instanceof Application) && context != null) {
                context = C786410Ut5.N3(context);
            }
            ((Application) context).registerActivityLifecycleCallbacks(C0XCJ.LIZ);
            return true;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return true;
        }
    }

    public BDInstallProvider() {
        try {
            C2123908Tt.LIZIZ = Boolean.TRUE;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public static synchronized Uri LIZ(Context context) {
        if (LLILLL == null) {
            try {
                LIZIZ(context);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return null;
            }
        }
        return LLILLL.buildUpon().appendPath("install_info_change").build();
    }

    public static void LIZIZ(Context context) {
        String str;
        if (TextUtils.isEmpty(LL)) {
            String name = BDInstallProvider.class.getName();
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
                        str = context.getPackageName() + ".bdinstall.provider";
                    }
                    str = context.getPackageName() + ".bdinstall.provider";
                } else {
                    str = context.getPackageName() + ".bdinstall.provider";
                }
            }
            LL = str;
        }
        if (!TextUtils.isEmpty(LL)) {
            UriMatcher uriMatcher = new UriMatcher(-1);
            LLILLJJLI = uriMatcher;
            uriMatcher.addURI(LL, "*/*", 65536);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("content://");
            sbLIZ.append(LL);
            LLILLL = UriProtector.parse(C2188811AlT.LIZIZ(sbLIZ));
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

    @Override // android.content.ContentProvider
    public final void attachInfo(Context context, ProviderInfo providerInfo) {
        LLILZ = context;
        if (providerInfo != null) {
            LL = providerInfo.authority;
        }
        C2123908Tt.LIZIZ = Boolean.TRUE;
        super.attachInfo(context, providerInfo);
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        C2362209Nk.LIZ(uri, "insert");
        return null;
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

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) throws Throwable {
        Uri uri2;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(11068, "com/bytedance/bdinstall/BDInstallProvider", "query", this, new Object[]{uri, strArr, str, strArr2, str2}, "android.database.Cursor", new C0WZW(false, "(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;", new C0WZX("dzBzEgAjS8/YVFkiQFyGYmPHmplJNuk8ohiqEbGiYYCXQkEplXzx/pQ=", null)));
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
        return null;
    }
}
