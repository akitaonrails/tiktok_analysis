package m4p;

import X.C1ETH;
import X.C2188811AlT;
import X.C908040Zjm;
import android.content.ContentResolver;
import android.database.CharArrayBuffer;
import android.database.ContentObservable;
import android.database.ContentObserver;
import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.net.Uri;
import android.os.Bundle;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.tencent.wcdb.support.Log;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import m4p.a;

/* JADX INFO: loaded from: classes15.dex */
public abstract class a implements C1ETH {
    public boolean LLILLL;
    public ContentResolver LLILZ;
    public Uri LLILZIL;
    public C908040Zjm LLIZ;
    public boolean LLIZLLLIL;
    public final Object LLILZLL = new Object();
    public final DataSetObservable LLJ = new DataSetObservable();
    public final ContentObservable LLJI = new ContentObservable();
    public Bundle LLJIJIL = Bundle.EMPTY;
    public int LL = -1;
    public int LLILLJJLI = -1;

    public void LIZIZ(int i) {
    }

    @Override // X.C1ETH, android.database.Cursor, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.LLILLL = true;
        this.LLJI.unregisterAll();
        LIZ();
    }

    @Override // android.database.Cursor
    public abstract String[] getColumnNames();

    @Override // X.C1ETH, android.database.Cursor
    public abstract int getCount();

    @Override // X.C1ETH, android.database.Cursor
    public abstract long getLong(int i);

    @Override // X.C1ETH, android.database.Cursor
    public abstract String getString(int i);

    @Override // X.C1ETH, android.database.Cursor
    public int getType(int i) {
        return 3;
    }

    @Override // android.database.Cursor
    public final boolean getWantsAllOnMoveCalls() {
        return false;
    }

    @Override // X.C1ETH, android.database.Cursor
    public final boolean moveToFirst() {
        return moveToPosition(0);
    }

    public void LIZ() {
        C908040Zjm c908040Zjm = this.LLIZ;
        if (c908040Zjm != null) {
            this.LLILZ.unregisterContentObserver(c908040Zjm);
            this.LLIZLLLIL = false;
        }
        this.LLJ.notifyInvalidated();
    }

    public void finalize() {
        C908040Zjm c908040Zjm = this.LLIZ;
        if (c908040Zjm != null && this.LLIZLLLIL) {
            this.LLILZ.unregisterContentObserver(c908040Zjm);
        }
        try {
            if (this.LLILLL) {
                return;
            }
            close();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    @Override // android.database.Cursor
    public final boolean isFirst() {
        return this.LL == 0 && getCount() != 0;
    }

    @Override // X.C1ETH, android.database.Cursor
    public final boolean moveToNext() {
        return moveToPosition(this.LL + 1);
    }

    @Override // android.database.Cursor
    public final boolean moveToPrevious() {
        return moveToPosition(this.LL - 1);
    }

    @Override // android.database.Cursor
    public boolean requery() {
        C908040Zjm c908040Zjm = this.LLIZ;
        if (c908040Zjm != null && !this.LLIZLLLIL) {
            this.LLILZ.registerContentObserver(this.LLILZIL, true, c908040Zjm);
            this.LLIZLLLIL = true;
        }
        this.LLJ.notifyChanged();
        return true;
    }

    public a() {
        new HashMap();
    }

    @Override // android.database.Cursor
    public int getColumnCount() {
        return getColumnNames().length;
    }

    @Override // android.database.Cursor
    public final boolean isAfterLast() {
        return getCount() == 0 || this.LL == getCount();
    }

    @Override // android.database.Cursor
    public final boolean isBeforeFirst() {
        return getCount() == 0 || this.LL == -1;
    }

    @Override // android.database.Cursor
    public final boolean isLast() {
        int count = getCount();
        return this.LL == count + (-1) && count != 0;
    }

    @Override // android.database.Cursor
    public final boolean moveToLast() {
        return moveToPosition(getCount() - 1);
    }

    @Override // android.database.Cursor
    public void deactivate() {
        LIZ();
    }

    @Override // android.database.Cursor
    public final Bundle getExtras() {
        return this.LLJIJIL;
    }

    @Override // android.database.Cursor
    public final Uri getNotificationUri() {
        return this.LLILZIL;
    }

    @Override // android.database.Cursor
    public final int getPosition() {
        return this.LL;
    }

    @Override // android.database.Cursor
    public final boolean isClosed() {
        return this.LLILLL;
    }

    @Override // X.C1ETH, android.database.Cursor
    public byte[] getBlob(int i) {
        throw new UnsupportedOperationException("getBlob is not supported");
    }

    @Override // X.C1ETH, android.database.Cursor
    public int getColumnIndex(String str) {
        int iLastIndexOf = str.lastIndexOf(46);
        if (iLastIndexOf != -1) {
            Exception exc = new Exception();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("requesting column name with table name -- ");
            sbLIZ.append(str);
            Log.LIZIZ("Cursor", C2188811AlT.LIZIZ(sbLIZ), exc);
            str = str.substring(iLastIndexOf + 1);
        }
        String[] columnNames = getColumnNames();
        int length = columnNames.length;
        for (int i = 0; i < length; i++) {
            if (columnNames[i].equalsIgnoreCase(str)) {
                return i;
            }
        }
        return -1;
    }

    @Override // X.C1ETH, android.database.Cursor
    public final int getColumnIndexOrThrow(String str) {
        int columnIndex = getColumnIndex(str);
        if (columnIndex >= 0) {
            return columnIndex;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("column '");
        sbLIZ.append(str);
        sbLIZ.append("' does not exist");
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // android.database.Cursor
    public final String getColumnName(int i) {
        return getColumnNames()[i];
    }

    @Override // android.database.Cursor
    public final boolean move(int i) {
        return moveToPosition(this.LL + i);
    }

    @Override // android.database.Cursor
    public final boolean moveToPosition(int i) {
        int count = getCount();
        if (i >= count) {
            this.LL = count;
            return false;
        }
        if (i < 0) {
            this.LL = -1;
            return false;
        }
        if (i == this.LL) {
            return true;
        }
        LIZIZ(i);
        this.LL = i;
        int i2 = this.LLILLJJLI;
        if (i2 != -1) {
            getLong(i2);
        }
        return true;
    }

    @Override // android.database.Cursor
    public final void registerContentObserver(ContentObserver contentObserver) {
        this.LLJI.registerObserver(contentObserver);
    }

    @Override // android.database.Cursor
    public final void registerDataSetObserver(DataSetObserver dataSetObserver) {
        this.LLJ.registerObserver(dataSetObserver);
    }

    @Override // android.database.Cursor
    public final Bundle respond(Bundle bundle) {
        return Bundle.EMPTY;
    }

    @Override // android.database.Cursor
    public final void setExtras(Bundle bundle) {
        if (bundle == null) {
            bundle = Bundle.EMPTY;
        }
        this.LLJIJIL = bundle;
    }

    @Override // android.database.Cursor
    public final void unregisterContentObserver(ContentObserver contentObserver) {
        if (!this.LLILLL) {
            this.LLJI.unregisterObserver(contentObserver);
        }
    }

    @Override // android.database.Cursor
    public final void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
        this.LLJ.unregisterObserver(dataSetObserver);
    }

    @Override // android.database.Cursor
    public void copyStringToBuffer(int i, CharArrayBuffer charArrayBuffer) {
        String string = getString(i);
        if (string != null) {
            char[] cArr = charArrayBuffer.data;
            if (cArr != null && cArr.length >= string.length()) {
                string.getChars(0, string.length(), cArr, 0);
            } else {
                charArrayBuffer.data = string.toCharArray();
            }
            charArrayBuffer.sizeCopied = string.length();
            return;
        }
        charArrayBuffer.sizeCopied = 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.0Zjm, android.database.ContentObserver] */
    @Override // android.database.Cursor
    public final void setNotificationUri(ContentResolver contentResolver, Uri uri) {
        synchronized (this.LLILZLL) {
            try {
                this.LLILZIL = uri;
                this.LLILZ = contentResolver;
                C908040Zjm c908040Zjm = this.LLIZ;
                if (c908040Zjm != null) {
                    contentResolver.unregisterContentObserver(c908040Zjm);
                }
                ?? r3 = new ContentObserver(this) { // from class: X.0Zjm
                    public final WeakReference<a> LIZ;

                    @Override // android.database.ContentObserver
                    public final boolean deliverSelfNotifications() {
                        return false;
                    }

                    {
                        super(null);
                        this.LIZ = new WeakReference<>(this);
                    }

                    @Override // android.database.ContentObserver
                    public final void onChange(boolean z) {
                        a aVar = this.LIZ.get();
                        if (aVar != null) {
                            synchronized (aVar.LLILZLL) {
                                try {
                                    aVar.LLJI.dispatchChange(false);
                                } catch (Throwable th) {
                                    TryCatchGuardChecker.doCheck(th);
                                    throw th;
                                }
                            }
                        }
                    }
                };
                this.LLIZ = r3;
                this.LLILZ.registerContentObserver(this.LLILZIL, true, r3);
                this.LLIZLLLIL = true;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}
