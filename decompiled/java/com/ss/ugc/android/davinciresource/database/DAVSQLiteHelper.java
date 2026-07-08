package com.ss.ugc.android.davinciresource.database;

import X.C2188811AlT;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.ugc.android.davinciresource.jni.PairStringString;
import com.ss.ugc.android.davinciresource.jni.VecPairStringString;
import com.ss.ugc.android.davinciresource.jni.VecString;
import com.ss.ugc.android.davinciresource.jni.VecVecString;
import java.util.Iterator;
import java.util.List;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes35.dex */
public final class DAVSQLiteHelper extends SQLiteOpenHelper {
    public static final Companion Companion = new Companion();
    public final List<String> tableKey;
    public final String tableName;

    public static final class Companion {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final VecVecString getAllData() {
        VecVecString vecVecString = new VecVecString();
        String[] strArr = new String[this.tableKey.size()];
        int size = this.tableKey.size();
        for (int i = 0; i < size; i++) {
            strArr[i] = ListProtector.get(this.tableKey, i);
        }
        Cursor cursorQuery = getReadableDatabase().query(this.tableName, strArr, null, null, null, null, null);
        while (cursorQuery.moveToNext()) {
            VecString vecString = new VecString();
            Iterator<String> it2 = this.tableKey.iterator();
            while (it2.hasNext()) {
                int columnIndex = cursorQuery.getColumnIndex(it2.next());
                if (columnIndex > 0) {
                    String string = cursorQuery.getString(columnIndex);
                    vecString.add(string != null ? string : "");
                } else {
                    vecString.add("");
                }
            }
            vecVecString.add(vecString);
        }
        cursorQuery.close();
        return vecVecString;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final VecString getDatas(String str) {
        String[] strArr = new String[this.tableKey.size()];
        int size = this.tableKey.size();
        for (int i = 0; i < size; i++) {
            strArr[i] = ListProtector.get(this.tableKey, i);
        }
        Cursor cursorQuery = getReadableDatabase().query(this.tableName, strArr, "id=?", new String[]{str}, null, null, null);
        VecString vecString = new VecString();
        if (cursorQuery.moveToNext()) {
            Iterator<String> it2 = this.tableKey.iterator();
            while (it2.hasNext()) {
                int columnIndex = cursorQuery.getColumnIndex(it2.next());
                String str2 = "";
                if (columnIndex > 0) {
                    String string = cursorQuery.getString(columnIndex);
                    if (string != null) {
                        str2 = string;
                    }
                    vecString.add(str2);
                } else {
                    vecString.add("");
                }
            }
        }
        cursorQuery.close();
        return vecString;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        String strLIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CREATE TABLE IF NOT EXISTS `");
        sbLIZ.append(this.tableName);
        sbLIZ.append("` (\n\t`id`\tTEXT NOT NULL PRIMARY KEY UNIQUE,\n");
        String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ);
        int size = this.tableKey.size();
        for (int i = 0; i < size; i++) {
            String str = (String) ListProtector.get(this.tableKey, i);
            if (!a0.LJJJIL(str)) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(strLIZIZ2);
                if (i == this.tableKey.size() - 1) {
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("\t`");
                    sbLIZ3.append(str);
                    sbLIZ3.append("`\tTEXT\n");
                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
                } else {
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append("\t`");
                    sbLIZ4.append(str);
                    sbLIZ4.append("`\tTEXT,\n");
                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ4);
                }
                sbLIZ2.append(strLIZIZ);
                strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
            }
        }
        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
        sbLIZ5.append(strLIZIZ2);
        sbLIZ5.append(");");
        String strLIZIZ3 = C2188811AlT.LIZIZ(sbLIZ5);
        if (sQLiteDatabase != null) {
            sQLiteDatabase.execSQL(strLIZIZ3);
        }
    }

    public final boolean removeData(String str) {
        getWritableDatabase().delete(this.tableName, "id=?", new String[]{str});
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final VecVecString getData(VecPairStringString vecPairStringString, boolean z) {
        String strLIZIZ;
        VecVecString vecVecString = new VecVecString();
        if (vecPairStringString == null) {
            return vecVecString;
        }
        String[] strArr = new String[this.tableKey.size()];
        int size = this.tableKey.size();
        for (int i = 0; i < size; i++) {
            strArr[i] = ListProtector.get(this.tableKey, i);
        }
        String[] strArr2 = new String[vecPairStringString.size()];
        int size2 = vecPairStringString.size();
        String strLIZIZ2 = "";
        for (int i2 = 0; i2 < size2; i2++) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(strLIZIZ2);
            if (i2 == vecPairStringString.size() - 1) {
                if (z) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(vecPairStringString.get(i2).getFirst());
                    sbLIZ2.append(" LIKE ?");
                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                } else {
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append(vecPairStringString.get(i2).getFirst());
                    sbLIZ3.append("=?");
                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
                }
            } else if (z) {
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append(vecPairStringString.get(i2).getFirst());
                sbLIZ4.append(" LIKE ? AND ");
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ4);
            } else {
                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                sbLIZ5.append(vecPairStringString.get(i2).getFirst());
                sbLIZ5.append("=? AND ");
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ5);
            }
            sbLIZ.append(strLIZIZ);
            strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ);
            strArr2[i2] = vecPairStringString.get(i2).getSecond();
        }
        Cursor cursorQuery = getReadableDatabase().query(this.tableName, strArr, strLIZIZ2, strArr2, null, null, null);
        while (cursorQuery.moveToNext()) {
            VecString vecString = new VecString();
            Iterator<String> it2 = this.tableKey.iterator();
            while (it2.hasNext()) {
                int columnIndex = cursorQuery.getColumnIndex(it2.next());
                if (columnIndex > 0) {
                    String string = cursorQuery.getString(columnIndex);
                    if (string == null) {
                        string = "";
                    }
                    vecString.add(string);
                } else {
                    vecString.add("");
                }
            }
            vecVecString.add(vecString);
        }
        cursorQuery.close();
        return vecVecString;
    }

    public final boolean insertData(String str, VecPairStringString vecPairStringString) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(FollowStatusChangeMethod.PARAM_UID, str);
        if (vecPairStringString != null) {
            int size = vecPairStringString.size();
            for (int i = 0; i < size; i++) {
                contentValues.put(vecPairStringString.get(i).getFirst(), vecPairStringString.get(i).getSecond());
            }
        }
        getWritableDatabase().insert(this.tableName, null, contentValues);
        return true;
    }

    public final boolean updateData(String str, VecPairStringString vecPairStringString) {
        if (vecPairStringString == null) {
            return true;
        }
        if (getDatas(str).isEmpty()) {
            return insertData(str, vecPairStringString);
        }
        ContentValues contentValues = new ContentValues();
        int size = vecPairStringString.size();
        for (int i = 0; i < size; i++) {
            contentValues.put(vecPairStringString.get(i).getFirst(), vecPairStringString.get(i).getSecond());
        }
        getWritableDatabase().update(this.tableName, contentValues, "id=?", new String[]{str});
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final VecVecString getData(PairStringString pairStringString, boolean z) {
        String first;
        String str;
        String[] strArr;
        String first2;
        String[] strArr2 = new String[this.tableKey.size()];
        int size = this.tableKey.size();
        for (int i = 0; i < size; i++) {
            strArr2[i] = ListProtector.get(this.tableKey, i);
        }
        SQLiteDatabase readableDatabase = getReadableDatabase();
        String str2 = this.tableName;
        String second = null;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        if (z) {
            if (pairStringString != null) {
                first2 = pairStringString.getFirst();
            } else {
                first2 = null;
            }
            sbLIZ.append(first2);
            str = " LIKE ?";
        } else {
            if (pairStringString != null) {
                first = pairStringString.getFirst();
            } else {
                first = null;
            }
            sbLIZ.append(first);
            str = "=?";
        }
        sbLIZ.append(str);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        if (z) {
            strArr = new String[1];
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append('%');
            if (pairStringString != null) {
                second = pairStringString.getSecond();
            }
            sbLIZ2.append(second);
            sbLIZ2.append('%');
            strArr[0] = C2188811AlT.LIZIZ(sbLIZ2);
        } else {
            strArr = new String[1];
            if (pairStringString != null) {
                second = pairStringString.getSecond();
            }
            strArr[0] = second;
        }
        Cursor cursorQuery = readableDatabase.query(str2, strArr2, strLIZIZ, strArr, null, null, null);
        VecVecString vecVecString = new VecVecString();
        while (cursorQuery.moveToNext()) {
            VecString vecString = new VecString();
            Iterator<String> it2 = this.tableKey.iterator();
            while (it2.hasNext()) {
                int columnIndex = cursorQuery.getColumnIndex(it2.next());
                String str3 = "";
                if (columnIndex > 0) {
                    String string = cursorQuery.getString(columnIndex);
                    if (string != null) {
                        str3 = string;
                    }
                    vecString.add(str3);
                } else {
                    vecString.add("");
                }
            }
            vecVecString.add(vecString);
        }
        cursorQuery.close();
        return vecVecString;
    }

    public final boolean insertData(String str, VecString vecString) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(FollowStatusChangeMethod.PARAM_UID, str);
        if (vecString != null) {
            int size = vecString.size();
            for (int i = 0; i < size; i++) {
                contentValues.put((String) ListProtector.get(this.tableKey, i), vecString.get(i));
            }
        }
        getWritableDatabase().insert(this.tableName, null, contentValues);
        return true;
    }

    public final boolean updateData(String str, VecString vecString) {
        if (getDatas(str).isEmpty()) {
            return insertData(str, vecString);
        }
        ContentValues contentValues = new ContentValues();
        if (vecString != null) {
            int size = vecString.size();
            for (int i = 0; i < size; i++) {
                contentValues.put((String) ListProtector.get(this.tableKey, i), vecString.get(i));
            }
        }
        getWritableDatabase().update(this.tableName, contentValues, "id=?", new String[]{str});
        return true;
    }

    public final VecString getData(PairStringString pairStringString, String str) {
        String first;
        SQLiteDatabase readableDatabase = getReadableDatabase();
        String str2 = this.tableName;
        String[] strArr = {str};
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        String second = null;
        if (pairStringString != null) {
            first = pairStringString.getFirst();
        } else {
            first = null;
        }
        sbLIZ.append(first);
        sbLIZ.append("=?");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        String[] strArr2 = new String[1];
        if (pairStringString != null) {
            second = pairStringString.getSecond();
        }
        strArr2[0] = second;
        Cursor cursorQuery = readableDatabase.query(str2, strArr, strLIZIZ, strArr2, null, null, null);
        VecString vecString = new VecString();
        while (cursorQuery.moveToNext()) {
            if (cursorQuery.getColumnIndex(str) >= 0) {
                String string = cursorQuery.getString(cursorQuery.getColumnIndex(str));
                if (string == null) {
                    string = "";
                }
                vecString.add(string);
            }
        }
        cursorQuery.close();
        return vecString;
    }

    public final String getData(String str, String str2) {
        Cursor cursorQuery = getReadableDatabase().query(this.tableName, new String[]{str2}, "id=?", new String[]{str}, null, null, null);
        String string = "";
        while (cursorQuery.moveToNext()) {
            int columnIndex = cursorQuery.getColumnIndex(str2);
            if (columnIndex >= 0 && (string = cursorQuery.getString(columnIndex)) == null) {
                string = "";
            }
            if (!a0.LJJJIL(string)) {
                cursorQuery.close();
                return string;
            }
        }
        cursorQuery.close();
        return string;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        if (sQLiteDatabase != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("DROP TABLE IF EXISTS ");
            sbLIZ.append(this.tableName);
            sQLiteDatabase.execSQL(C2188811AlT.LIZIZ(sbLIZ));
        }
        onCreate(sQLiteDatabase);
    }

    public DAVSQLiteHelper(Context context, String str, String str2, List<String> list, int i) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, i);
        this.tableName = str2;
        this.tableKey = list;
    }

    public final VecVecString getDataByRange(String str, String str2, String str3, VecPairStringString vecPairStringString, boolean z, String str4) {
        return new VecVecString();
    }
}
