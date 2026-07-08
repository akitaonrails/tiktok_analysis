package com.bytedance.apm.agent.instrumentation;

import X.C2188811AlT;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.CancellationSignal;
import com.bytedance.apm.agent.tracing.TraceMachine;
import java.util.Arrays;

/* JADX INFO: loaded from: classes14.dex */
public class SQLiteInstrumentation {
    public static Cursor rawQuery(SQLiteDatabase sQLiteDatabase, String str, String[] strArr) {
        TraceMachine.enterMethod("sqlite", "rawQuery", "db_trace");
        Cursor cursorRawQuery = sQLiteDatabase.rawQuery(str, strArr);
        TraceMachine.exitMethod(str);
        return cursorRawQuery;
    }

    public static Cursor rawQuery(SQLiteDatabase sQLiteDatabase, String str, String[] strArr, CancellationSignal cancellationSignal) {
        TraceMachine.enterMethod("sqlite", "rawQuery", "db_trace");
        Cursor cursorRawQuery = sQLiteDatabase.rawQuery(str, strArr);
        TraceMachine.exitMethod(str);
        return cursorRawQuery;
    }

    public static Cursor rawQueryWithFactory(SQLiteDatabase sQLiteDatabase, SQLiteDatabase.CursorFactory cursorFactory, String str, String[] strArr, String str2) {
        TraceMachine.enterMethod("sqlite", "rawQueryWithFactory", "db_trace");
        Cursor cursorRawQueryWithFactory = sQLiteDatabase.rawQueryWithFactory(cursorFactory, str, strArr, str2);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append(Arrays.toString(strArr));
        TraceMachine.exitMethod(C2188811AlT.LIZIZ(sbLIZ));
        return cursorRawQueryWithFactory;
    }

    public static Cursor rawQueryWithFactory(SQLiteDatabase sQLiteDatabase, SQLiteDatabase.CursorFactory cursorFactory, String str, String[] strArr, String str2, CancellationSignal cancellationSignal) {
        TraceMachine.enterMethod("sqlite", "rawQueryWithFactory", "db_trace");
        Cursor cursorRawQueryWithFactory = sQLiteDatabase.rawQueryWithFactory(cursorFactory, str, strArr, str2, cancellationSignal);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append(Arrays.toString(strArr));
        TraceMachine.exitMethod(C2188811AlT.LIZIZ(sbLIZ));
        return cursorRawQueryWithFactory;
    }

    public static Cursor query(SQLiteDatabase sQLiteDatabase, String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5) {
        TraceMachine.enterMethod("sqlite", "query", "db_trace");
        Cursor cursorQuery = sQLiteDatabase.query(str, strArr, str2, strArr2, str3, str4, str5);
        TraceMachine.exitMethod(combineQuery(false, str, strArr, str2, strArr2, str3, str4, str5, null));
        return cursorQuery;
    }

    public static String combineQuery(boolean z, String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5, String str6) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("distinct: ");
        sbLIZ.append(z);
        sbLIZ.append(" table: ");
        sbLIZ.append(str);
        sbLIZ.append(" columns: ");
        sbLIZ.append(Arrays.toString(strArr));
        sbLIZ.append(" selection: ");
        sbLIZ.append(str2);
        sbLIZ.append(" selectionArgs: ");
        sbLIZ.append(Arrays.toString(strArr2));
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static Cursor query(SQLiteDatabase sQLiteDatabase, String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5, String str6) {
        TraceMachine.enterMethod("sqlite", "query", "db_trace");
        Cursor cursorQuery = sQLiteDatabase.query(str, strArr, str2, strArr2, str3, str4, str5, str6);
        TraceMachine.exitMethod(combineQuery(false, str, strArr, str2, strArr2, str3, str4, str5, str6));
        return cursorQuery;
    }

    public static Cursor query(SQLiteDatabase sQLiteDatabase, boolean z, String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5, String str6) {
        TraceMachine.enterMethod("sqlite", "query", "db_trace");
        Cursor cursorQuery = sQLiteDatabase.query(z, str, strArr, str2, strArr2, str3, str4, str5, str6);
        TraceMachine.exitMethod(combineQuery(z, str, strArr, str2, strArr2, str3, str4, str5, str6));
        return cursorQuery;
    }

    public static Cursor queryWithFactory(SQLiteDatabase sQLiteDatabase, SQLiteDatabase.CursorFactory cursorFactory, boolean z, String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5, String str6, CancellationSignal cancellationSignal) {
        TraceMachine.enterMethod("sqlite", "queryWithFactory", "db_trace");
        Cursor cursorQueryWithFactory = sQLiteDatabase.queryWithFactory(cursorFactory, z, str, strArr, str2, strArr2, str3, str4, str5, str6, cancellationSignal);
        TraceMachine.exitMethod(combineQuery(false, str, strArr, str2, strArr2, str3, str4, str5, str6));
        return cursorQueryWithFactory;
    }
}
