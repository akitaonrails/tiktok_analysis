package com.facebook;

import X.C08TN;
import X.C0W7Q;
import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C2362209Nk;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Pair;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.FileNotFoundException;
import java.util.UUID;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes4.dex */
public final class FacebookContentProvider extends ContentProvider {
    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        C08TN.LIZ().LJ("FacebookContentProvider", false);
        C08TN.LIZ().LJI("FacebookContentProvider");
        return true;
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        C2362209Nk.LIZ(uri, "insert");
        return null;
    }

    @Override // android.content.ContentProvider
    public final ParcelFileDescriptor openFile(Uri uri, String str) throws FileNotFoundException {
        try {
            String path = uri.getPath();
            if (path != null) {
                Object[] array = a0.LJJLIIIJILLIZJL(path.substring(1), new String[]{"/"}, 0, 6).toArray(new String[0]);
                if (array != null) {
                    String[] strArr = (String[]) array;
                    String str2 = strArr[0];
                    String str3 = strArr[1];
                    if (!"..".contentEquals(str2) && !"..".contentEquals(str3)) {
                        Pair pair = new Pair(UUID.fromString(str2), str3);
                        try {
                            Object obj = pair.first;
                            if (!C0W7Q.LJIILL((String) pair.second) && obj != null) {
                                throw new FileNotFoundException();
                            }
                            throw new FileNotFoundException();
                        } catch (FileNotFoundException e) {
                            TryCatchGuardChecker.doCheck(e);
                            throw e;
                        }
                    }
                    throw new Exception();
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            "Required value was null.".toString();
            throw new IllegalStateException("Required value was null.");
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            throw new FileNotFoundException();
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

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) throws Throwable {
        Uri uri2 = uri;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(11068, "com/facebook/FacebookContentProvider", "query", this, new Object[]{uri2, strArr, str, strArr2, str2}, "android.database.Cursor", new C0WZW(false, "(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;", new C0WZX("dzBzEgQ7XM/eWlgqCzSFZSuxKYtIYZ36BddFAT1Ye+95NO+8", new String[]{"019e5"})));
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
            Object obj3 = objArr[2];
            Object obj4 = objArr[3];
            Object obj5 = objArr[4];
        }
        C2362209Nk.LIZ(uri2, "query");
        return null;
    }
}
