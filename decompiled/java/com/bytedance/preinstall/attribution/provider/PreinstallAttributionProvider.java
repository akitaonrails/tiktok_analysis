package com.bytedance.preinstall.attribution.provider;

import X.C0WFW;
import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C2188811AlT;
import X.C2362209Nk;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;

/* JADX INFO: loaded from: classes14.dex */
public final class PreinstallAttributionProvider extends ContentProvider {
    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        return false;
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
        String[] strArr3;
        String str3;
        String[] strArr4;
        String str4;
        String packageName;
        String str5;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(11068, "com/bytedance/preinstall/attribution/provider/PreinstallAttributionProvider", "query", this, new Object[]{uri, strArr, str, strArr2, str2}, "android.database.Cursor", new C0WZW(false, "(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;", new C0WZX("dzBzEgAjS8/YVFkiQFyUdBINYxK7h46izHq1l627x8nUzjPESs0PInRQ8SUwiupaAy6yqpA7osTLN/Kp886M/DP92Z39yfC9XYEt", null)));
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
            if (obj2 != null) {
                strArr3 = (String[]) obj2;
            } else {
                strArr3 = strArr;
            }
            Object obj3 = objArr[2];
            if (obj3 != null) {
                str3 = (String) obj3;
            } else {
                str3 = str;
            }
            Object obj4 = objArr[3];
            if (obj4 != null) {
                strArr4 = (String[]) obj4;
            } else {
                strArr4 = strArr2;
            }
            Object obj5 = objArr[4];
            if (obj5 != null) {
                str4 = (String) obj5;
            } else {
                str4 = str2;
            }
        } else {
            uri2 = uri;
            strArr3 = strArr;
            str3 = str;
            strArr4 = strArr2;
            str4 = str2;
        }
        C2362209Nk.LIZ(uri2, "query");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        Context context = getContext();
        if (context != null) {
            packageName = context.getPackageName();
        } else {
            packageName = null;
        }
        sbLIZ.append(packageName);
        sbLIZ.append(".preinstall.attribution");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        UriMatcher uriMatcher = new UriMatcher(-1);
        uriMatcher.addURI(strLIZIZ, "preload_info", 1);
        if (uriMatcher.match(uri2) == 1) {
            str5 = "preinstall_tb";
        } else {
            str5 = null;
        }
        SQLiteDatabase writableDatabase = new C0WFW(getContext()).getWritableDatabase();
        if (writableDatabase == null) {
            return null;
        }
        return writableDatabase.query(str5, strArr3, str3, strArr4, null, null, str4, null);
    }
}
