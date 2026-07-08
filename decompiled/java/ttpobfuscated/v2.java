package ttpobfuscated;

import X.AbstractC795470VIj;
import X.AbstractC796320VLq;
import X.AbstractC796330VLr;
import X.AbstractC796540VMm;
import X.C0VN0;
import X.C0VN5;
import X.C795450VIh;
import X.InterfaceC796340VLs;
import android.database.Cursor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import ttp.orbu.sdk.repository.model.DBEventSent;

/* JADX INFO: loaded from: classes14.dex */
public final class v2 implements u2 {
    public final AbstractC796540VMm a;
    public final AbstractC796330VLr<DBEventSent> b;
    public final AbstractC796320VLq<DBEventSent> c;
    public final AbstractC795470VIj d;

    @Override // ttpobfuscated.u2
    public int a() {
        C0VN5 c0vn5LIZLLL = C0VN5.LIZLLL(0, "SELECT COUNT (`id`) FROM sent_event");
        this.a.assertNotSuspendingTransaction();
        Cursor cursorLIZIZ = C0VN0.LIZIZ(this.a, c0vn5LIZLLL, false);
        try {
            int i = cursorLIZIZ.moveToFirst() ? cursorLIZIZ.getInt(0) : 0;
            cursorLIZIZ.close();
            c0vn5LIZLLL.release();
            return i;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            cursorLIZIZ.close();
            c0vn5LIZLLL.release();
            throw th;
        }
    }

    public static List<Class<?>> b() {
        return Collections.emptyList();
    }

    public v2(AbstractC796540VMm abstractC796540VMm) {
        this.a = abstractC796540VMm;
        this.b = new a(abstractC796540VMm);
        this.c = new b(abstractC796540VMm);
        this.d = new c(abstractC796540VMm);
    }

    @Override // ttpobfuscated.u2
    public List<DBEventSent> a(int i) {
        String string;
        C0VN5 c0vn5LIZLLL = C0VN5.LIZLLL(1, "SELECT * FROM sent_event ORDER BY `last_sent_event` LIMIT ?");
        c0vn5LIZLLL.LJIJ(1, i);
        this.a.assertNotSuspendingTransaction();
        Cursor cursorLIZIZ = C0VN0.LIZIZ(this.a, c0vn5LIZLLL, false);
        try {
            int iLIZIZ = C795450VIh.LIZIZ(cursorLIZIZ, FollowStatusChangeMethod.PARAM_UID);
            int iLIZIZ2 = C795450VIh.LIZIZ(cursorLIZIZ, "last_sent_event");
            ArrayList arrayList = new ArrayList(cursorLIZIZ.getCount());
            while (cursorLIZIZ.moveToNext()) {
                if (cursorLIZIZ.isNull(iLIZIZ)) {
                    string = null;
                } else {
                    string = cursorLIZIZ.getString(iLIZIZ);
                }
                arrayList.add(new DBEventSent(string, cursorLIZIZ.getLong(iLIZIZ2)));
            }
            cursorLIZIZ.close();
            c0vn5LIZLLL.release();
            return arrayList;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            cursorLIZIZ.close();
            c0vn5LIZLLL.release();
            throw th;
        }
    }

    @Override // ttpobfuscated.u2
    public DBEventSent b(String str) {
        C0VN5 c0vn5LIZLLL = C0VN5.LIZLLL(1, "SELECT * FROM sent_event WHERE `id` = ?");
        if (str == null) {
            c0vn5LIZLLL.LLD(1);
        } else {
            c0vn5LIZLLL.LJIILIIL(1, str);
        }
        this.a.assertNotSuspendingTransaction();
        Cursor cursorLIZIZ = C0VN0.LIZIZ(this.a, c0vn5LIZLLL, false);
        try {
            int iLIZIZ = C795450VIh.LIZIZ(cursorLIZIZ, FollowStatusChangeMethod.PARAM_UID);
            int iLIZIZ2 = C795450VIh.LIZIZ(cursorLIZIZ, "last_sent_event");
            DBEventSent dBEventSent = null;
            String string = null;
            if (cursorLIZIZ.moveToFirst()) {
                if (!cursorLIZIZ.isNull(iLIZIZ)) {
                    string = cursorLIZIZ.getString(iLIZIZ);
                }
                dBEventSent = new DBEventSent(string, cursorLIZIZ.getLong(iLIZIZ2));
            }
            cursorLIZIZ.close();
            c0vn5LIZLLL.release();
            return dBEventSent;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            cursorLIZIZ.close();
            c0vn5LIZLLL.release();
            throw th;
        }
    }

    @Override // ttpobfuscated.u2
    public DBEventSent c(String str) {
        C0VN5 c0vn5LIZLLL = C0VN5.LIZLLL(1, "SELECT * FROM sent_event WHERE `id` = ?");
        if (str == null) {
            c0vn5LIZLLL.LLD(1);
        } else {
            c0vn5LIZLLL.LJIILIIL(1, str);
        }
        this.a.assertNotSuspendingTransaction();
        Cursor cursorLIZIZ = C0VN0.LIZIZ(this.a, c0vn5LIZLLL, false);
        try {
            int iLIZIZ = C795450VIh.LIZIZ(cursorLIZIZ, FollowStatusChangeMethod.PARAM_UID);
            int iLIZIZ2 = C795450VIh.LIZIZ(cursorLIZIZ, "last_sent_event");
            DBEventSent dBEventSent = null;
            String string = null;
            if (cursorLIZIZ.moveToFirst()) {
                if (!cursorLIZIZ.isNull(iLIZIZ)) {
                    string = cursorLIZIZ.getString(iLIZIZ);
                }
                dBEventSent = new DBEventSent(string, cursorLIZIZ.getLong(iLIZIZ2));
            }
            cursorLIZIZ.close();
            c0vn5LIZLLL.release();
            return dBEventSent;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            cursorLIZIZ.close();
            c0vn5LIZLLL.release();
            throw th;
        }
    }

    @Override // ttpobfuscated.u2
    public int a(String str) {
        this.a.assertNotSuspendingTransaction();
        InterfaceC796340VLs interfaceC796340VLsAcquire = this.d.acquire();
        if (str == null) {
            interfaceC796340VLsAcquire.LLD(1);
        } else {
            interfaceC796340VLsAcquire.LJIILIIL(1, str);
        }
        this.a.beginTransaction();
        try {
            int iLJIIL = interfaceC796340VLsAcquire.LJIIL();
            this.a.setTransactionSuccessful();
            this.a.endTransaction();
            this.d.release(interfaceC796340VLsAcquire);
            return iLJIIL;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.a.endTransaction();
            this.d.release(interfaceC796340VLsAcquire);
            throw th;
        }
    }

    @Override // ttpobfuscated.u2
    public long b(DBEventSent dBEventSent) {
        this.a.assertNotSuspendingTransaction();
        this.a.beginTransaction();
        try {
            long jInsertAndReturnId = this.b.insertAndReturnId(dBEventSent);
            this.a.setTransactionSuccessful();
            this.a.endTransaction();
            return jInsertAndReturnId;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.a.endTransaction();
            throw th;
        }
    }

    @Override // ttpobfuscated.u2
    public int a(DBEventSent dBEventSent) {
        this.a.assertNotSuspendingTransaction();
        this.a.beginTransaction();
        try {
            int iHandle = this.c.handle(dBEventSent);
            this.a.setTransactionSuccessful();
            this.a.endTransaction();
            return iHandle;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.a.endTransaction();
            throw th;
        }
    }

    public class a extends AbstractC796330VLr<DBEventSent> {
        @Override // X.AbstractC795470VIj
        public String createQuery() {
            return "INSERT OR REPLACE INTO `sent_event` (`id`,`last_sent_event`) VALUES (?,?)";
        }

        public a(AbstractC796540VMm abstractC796540VMm) {
            super(abstractC796540VMm);
        }

        @Override // X.AbstractC796330VLr
        public void bind(InterfaceC796340VLs interfaceC796340VLs, DBEventSent dBEventSent) {
            String str = dBEventSent.a;
            if (str == null) {
                interfaceC796340VLs.LLD(1);
            } else {
                interfaceC796340VLs.LJIILIIL(1, str);
            }
            interfaceC796340VLs.LJIJ(2, dBEventSent.b);
        }
    }

    public class b extends AbstractC796320VLq<DBEventSent> {
        @Override // X.AbstractC796320VLq, X.AbstractC795470VIj
        public String createQuery() {
            return "UPDATE OR ABORT `sent_event` SET `id` = ?,`last_sent_event` = ? WHERE `id` = ?";
        }

        public b(AbstractC796540VMm abstractC796540VMm) {
            super(abstractC796540VMm);
        }

        @Override // X.AbstractC796320VLq
        public void bind(InterfaceC796340VLs interfaceC796340VLs, DBEventSent dBEventSent) {
            String str = dBEventSent.a;
            if (str == null) {
                interfaceC796340VLs.LLD(1);
            } else {
                interfaceC796340VLs.LJIILIIL(1, str);
            }
            interfaceC796340VLs.LJIJ(2, dBEventSent.b);
            String str2 = dBEventSent.a;
            if (str2 == null) {
                interfaceC796340VLs.LLD(3);
            } else {
                interfaceC796340VLs.LJIILIIL(3, str2);
            }
        }
    }

    public class c extends AbstractC795470VIj {
        @Override // X.AbstractC795470VIj
        public String createQuery() {
            return "DELETE FROM sent_event WHERE `id` = ?";
        }

        public c(AbstractC796540VMm abstractC796540VMm) {
            super(abstractC796540VMm);
        }
    }
}
