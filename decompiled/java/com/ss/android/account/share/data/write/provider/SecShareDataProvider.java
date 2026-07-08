package com.ss.android.account.share.data.write.provider;

import X.C08TN;
import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C2362209Nk;
import X.C810670Vr7;
import X.C820130WFf;
import X.C820140WFg;
import X.C820820WHw;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes14.dex */
public final class SecShareDataProvider extends ContentProvider {
    public static final UriMatcher LLILLJJLI = new UriMatcher(-1);
    public C820140WFg LL;

    @Override // android.content.ContentProvider
    public final synchronized Uri insert(Uri uri, ContentValues contentValues) {
        LIZ(this, uri);
        return uri;
    }

    @Override // android.content.ContentProvider
    public final synchronized Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        Uri uri2 = uri;
        synchronized (this) {
            C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(11068, "com/ss/android/account/share/data/write/provider/SecShareDataProvider", "query", this, new Object[]{uri2, strArr, str, strArr2, str2}, "android.database.Cursor", new C0WZW(false, "(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;", new C0WZX("dzBzEhEpEcvSUUUuTBbKZylIDzO5MvA7/D1DaU//QncYdlp6oA48VDJEO5JBK44Hhl24WE2boN/C2Qk0uSqDl91h5Son", null)));
            if (c0wsuLIZIZ.LIZ) {
                return (Cursor) c0wsuLIZIZ.LIZIZ;
            }
            Object[] objArr = c0wsuLIZIZ.LIZJ;
            if (objArr != null) {
                Object obj = objArr[0];
                if (obj != null) {
                    uri2 = (Uri) obj;
                }
                Object obj2 = objArr[1];
                if (obj2 != null) {
                }
                Object obj3 = objArr[2];
                if (obj3 != null) {
                }
                Object obj4 = objArr[3];
                if (obj4 != null) {
                }
                Object obj5 = objArr[4];
                if (obj5 != null) {
                }
            }
            return LIZIZ(this, uri2);
        }
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        boolean z = false;
        C08TN.LIZ().LJ("SecShareDataProvider", false);
        Context context = getContext();
        if (context != null) {
            this.LL = C820130WFf.LIZ(context);
            String packageName = context.getPackageName();
            if (!TextUtils.isEmpty(packageName)) {
                LLILLJJLI.addURI(Intrinsics.LJIIJJI(".SecShareProviderAuthority", packageName), "sec_share/*", 2);
                z = true;
            }
        }
        C08TN.LIZ().LJI("SecShareDataProvider");
        return z;
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        Context context = getContext();
        if (context == null) {
            return null;
        }
        String packageName = context.getPackageName();
        if (TextUtils.isEmpty(packageName) || LLILLJJLI.match(uri) != 2) {
            return null;
        }
        return Intrinsics.LJIIJJI(".SecShareProviderAuthority", packageName);
    }

    public static void LIZ(SecShareDataProvider secShareDataProvider, Uri uri) {
        C2362209Nk.LIZ(uri, "insert");
        synchronized (secShareDataProvider) {
        }
    }

    public static Cursor LIZIZ(SecShareDataProvider secShareDataProvider, Uri uri) {
        String string;
        MatrixCursor matrixCursor;
        C2362209Nk.LIZ(uri, "query");
        synchronized (secShareDataProvider) {
            C820820WHw c820820WHw = C820820WHw.LIZ;
            String callingPackage = secShareDataProvider.getCallingPackage();
            c820820WHw.getClass();
            MatrixCursor matrixCursor2 = null;
            if (!C820820WHw.LIZ(callingPackage)) {
                return null;
            }
            if (LLILLJJLI.match(uri) != 2) {
                return null;
            }
            List<String> pathSegments = uri.getPathSegments();
            int size = pathSegments.size();
            if (size <= 0) {
                return null;
            }
            String str = (String) ListProtector.get(pathSegments, size - 1);
            try {
                string = C810670Vr7.LIZJ(secShareDataProvider.LL.LIZ, 0, "account_sec_share_data").getString(str, "");
                matrixCursor = new MatrixCursor(new String[]{str});
            } catch (Exception e) {
                e = e;
            }
            try {
                matrixCursor.newRow().add(str, string);
                return matrixCursor;
            } catch (Exception e2) {
                e = e2;
                matrixCursor2 = matrixCursor;
                TryCatchGuardChecker.doCheck(e);
                return matrixCursor2;
            }
        }
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
}
