package com.tencent.wcdb.database;

import X.C2188811AlT;
import X.C908000Zji;
import X.C908080Zjq;
import X.C908190Zk1;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Arrays;

/* JADX INFO: loaded from: classes15.dex */
public abstract class h extends a {
    public static final String[] LLIZ = new String[0];
    public final SQLiteDatabase LL;
    public final String LLILLJJLI;
    public final boolean LLILLL;
    public final String[] LLILZ;
    public final int LLILZIL;
    public final Object[] LLILZLL;

    @Override // com.tencent.wcdb.database.a
    public void LIZIZ() {
        synchronized (this) {
        }
        Object[] objArr = this.LLILZLL;
        if (objArr != null) {
            Arrays.fill(objArr, (Object) null);
        }
    }

    public final void finalize() throws Throwable {
        synchronized (this) {
            try {
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        super.finalize();
    }

    public final void LJI(SQLiteException sQLiteException) {
        if ((sQLiteException instanceof SQLiteDatabaseCorruptException) || ((sQLiteException instanceof SQLiteFullException) && this.LLILLL)) {
            SQLiteDebug.LIZIZ(this.LL);
            this.LL.LJJLIIIJ();
        }
    }

    public final void LJFF(int i, Object obj) {
        if (i >= 1 && i <= this.LLILZIL) {
            this.LLILZLL[i - 1] = obj;
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Cannot bind argument at index ");
        sbLIZ.append(i);
        sbLIZ.append(" because the index is out of range.  The statement has ");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(" parameters.");
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public final void LJIILIIL(int i, String str) {
        if (str != null) {
            LJFF(i, str);
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("the bind value at index ");
        sbLIZ.append(i);
        sbLIZ.append(" is null");
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public h(SQLiteDatabase sQLiteDatabase, String str, Object[] objArr) {
        this.LL = sQLiteDatabase;
        String strTrim = str.trim();
        this.LLILLJJLI = strTrim;
        int iLIZ = C908000Zji.LIZ(strTrim);
        if (iLIZ != 4 && iLIZ != 5 && iLIZ != 6) {
            boolean z = iLIZ == 1;
            C908080Zjq c908080Zjq = new C908080Zjq();
            C908190Zk1 c908190Zk1LJJJJJ = sQLiteDatabase.LJJJJJ();
            String str2 = this.LLILLJJLI;
            int iLJJJJ = SQLiteDatabase.LJJJJ(z);
            if (str2 != null) {
                c908190Zk1LJJJJJ.LIZ(str2, iLJJJJ);
                try {
                    c908190Zk1LJJJJJ.LIZIZ.LJIILL(str2, c908080Zjq);
                    c908190Zk1LJJJJJ.LJIIIIZZ();
                    this.LLILLL = c908080Zjq.LIZJ;
                    this.LLILZ = c908080Zjq.LIZIZ;
                    this.LLILZIL = c908080Zjq.LIZ;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c908190Zk1LJJJJJ.LJIIIIZZ();
                    throw th;
                }
            } else {
                c908190Zk1LJJJJJ.getClass();
                throw new IllegalArgumentException("sql must not be null.");
            }
        } else {
            this.LLILLL = false;
            this.LLILZ = LLIZ;
            this.LLILZIL = 0;
        }
        if (objArr != null && objArr.length > this.LLILZIL) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Too many bind arguments.  ");
            sbLIZ.append(objArr.length);
            sbLIZ.append(" arguments were provided but the statement needs ");
            sbLIZ.append(this.LLILZIL);
            sbLIZ.append(" arguments.");
            throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
        }
        int i = this.LLILZIL;
        if (i != 0) {
            Object[] objArr2 = new Object[i];
            this.LLILZLL = objArr2;
            if (objArr != null) {
                System.arraycopy(objArr, 0, objArr2, 0, objArr.length);
                return;
            }
            return;
        }
        this.LLILZLL = null;
    }
}
