package com.ss.android.ugc.aweme.app.crash.cp;

import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C2362209Nk;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes4.dex */
public class DynamicProviderTester extends ContentProvider {
    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        return "vnd.android.cursor.item/vnd.example.dynamic";
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        return true;
    }

    static {
        UriProtector.parse("content://com.dynamic.provider/test");
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
        Uri uri2 = uri;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(11068, "com/ss/android/ugc/aweme/app/crash/cp/DynamicProviderTester", "query", this, new Object[]{uri2, strArr, str, strArr2, str2}, "android.database.Cursor", new C0WZW(false, "(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;", new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOu4c9HNzjOQPCVbhPQ5mS4PCXu8jjTW3NZEMr3SuFzb3A4=", null)));
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
        MatrixCursor matrixCursor = new MatrixCursor(new String[]{FollowStatusChangeMethod.PARAM_UID, "name"});
        matrixCursor.addRow(new Object[]{1, "Dynamic Provider Data"});
        return matrixCursor;
    }
}
