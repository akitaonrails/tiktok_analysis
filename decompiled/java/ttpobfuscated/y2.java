package ttpobfuscated;

import X.AbstractC795470VIj;
import X.AbstractC796320VLq;
import X.AbstractC796330VLr;
import X.AbstractC796540VMm;
import X.C0VIY;
import X.C0VN0;
import X.C0VN5;
import X.C2294708yv;
import X.C795450VIh;
import X.InterfaceC796340VLs;
import android.database.Cursor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.UUID;
import ttp.orbu.sdk.repository.model.DBEvent;

/* JADX INFO: loaded from: classes14.dex */
public final class y2 implements x2 {
    public final AbstractC796540VMm a;
    public final AbstractC796330VLr<DBEvent> b;
    public final n3 c = new n3();
    public final AbstractC796320VLq<DBEvent> d;
    public final AbstractC795470VIj e;

    @Override // ttpobfuscated.x2
    public List<String> b() {
        C0VN5 c0vn5LIZLLL = C0VN5.LIZLLL(0, "SELECT DISTINCT(`kind`) FROM events");
        this.a.assertNotSuspendingTransaction();
        Cursor cursorLIZIZ = C0VN0.LIZIZ(this.a, c0vn5LIZLLL, false);
        try {
            ArrayList arrayList = new ArrayList(cursorLIZIZ.getCount());
            while (cursorLIZIZ.moveToNext()) {
                arrayList.add(cursorLIZIZ.isNull(0) ? null : cursorLIZIZ.getString(0));
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

    public static List<Class<?>> a() {
        return Collections.emptyList();
    }

    public y2(AbstractC796540VMm abstractC796540VMm) {
        this.a = abstractC796540VMm;
        this.b = new a(abstractC796540VMm);
        this.d = new b(abstractC796540VMm);
        this.e = new c(abstractC796540VMm);
    }

    @Override // ttpobfuscated.x2
    public int a(List<String> list) {
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT COUNT (`id`) FROM events WHERE `kind` NOT IN (");
        int size = list.size();
        C0VIY.LIZ(sb, size);
        sb.append(")");
        C0VN5 c0vn5LIZLLL = C0VN5.LIZLLL(size, sb.toString());
        int i = 1;
        for (String str : list) {
            if (str == null) {
                c0vn5LIZLLL.LLD(i);
            } else {
                c0vn5LIZLLL.LJIILIIL(i, str);
            }
            i++;
        }
        this.a.assertNotSuspendingTransaction();
        int i2 = 0;
        Cursor cursorLIZIZ = C0VN0.LIZIZ(this.a, c0vn5LIZLLL, false);
        try {
            if (cursorLIZIZ.moveToFirst()) {
                i2 = cursorLIZIZ.getInt(0);
            }
            cursorLIZIZ.close();
            c0vn5LIZLLL.release();
            return i2;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            cursorLIZIZ.close();
            c0vn5LIZLLL.release();
            throw th;
        }
    }

    @Override // ttpobfuscated.x2
    public DBEvent b(UUID uuid) {
        UUID uuidLIZ;
        Long lValueOf;
        String string;
        C0VN5 c0vn5LIZLLL = C0VN5.LIZLLL(1, "SELECT * FROM events WHERE `id` = ?");
        if (uuid == null) {
            c0vn5LIZLLL.LLD(1);
        } else {
            c0vn5LIZLLL.LJJIIJZLJL(1, C2294708yv.LIZIZ(uuid));
        }
        this.a.assertNotSuspendingTransaction();
        Cursor cursorLIZIZ = C0VN0.LIZIZ(this.a, c0vn5LIZLLL, false);
        try {
            int iLIZIZ = C795450VIh.LIZIZ(cursorLIZIZ, FollowStatusChangeMethod.PARAM_UID);
            int iLIZIZ2 = C795450VIh.LIZIZ(cursorLIZIZ, "timestamp");
            int iLIZIZ3 = C795450VIh.LIZIZ(cursorLIZIZ, "kind");
            int iLIZIZ4 = C795450VIh.LIZIZ(cursorLIZIZ, "metadata");
            DBEvent dBEvent = null;
            String string2 = null;
            if (cursorLIZIZ.moveToFirst()) {
                if (cursorLIZIZ.isNull(iLIZIZ)) {
                    uuidLIZ = null;
                } else {
                    uuidLIZ = C2294708yv.LIZ(cursorLIZIZ.getBlob(iLIZIZ));
                }
                if (cursorLIZIZ.isNull(iLIZIZ2)) {
                    lValueOf = null;
                } else {
                    lValueOf = Long.valueOf(cursorLIZIZ.getLong(iLIZIZ2));
                }
                Date dateA = this.c.a(lValueOf);
                if (cursorLIZIZ.isNull(iLIZIZ3)) {
                    string = null;
                } else {
                    string = cursorLIZIZ.getString(iLIZIZ3);
                }
                if (!cursorLIZIZ.isNull(iLIZIZ4)) {
                    string2 = cursorLIZIZ.getString(iLIZIZ4);
                }
                dBEvent = new DBEvent(uuidLIZ, dateA, string, string2);
            }
            cursorLIZIZ.close();
            c0vn5LIZLLL.release();
            return dBEvent;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            cursorLIZIZ.close();
            c0vn5LIZLLL.release();
            throw th;
        }
    }

    @Override // ttpobfuscated.x2
    public int a(UUID uuid) {
        this.a.assertNotSuspendingTransaction();
        InterfaceC796340VLs interfaceC796340VLsAcquire = this.e.acquire();
        if (uuid == null) {
            interfaceC796340VLsAcquire.LLD(1);
        } else {
            interfaceC796340VLsAcquire.LJJIIJZLJL(1, C2294708yv.LIZIZ(uuid));
        }
        this.a.beginTransaction();
        try {
            int iLJIIL = interfaceC796340VLsAcquire.LJIIL();
            this.a.setTransactionSuccessful();
            this.a.endTransaction();
            this.e.release(interfaceC796340VLsAcquire);
            return iLJIIL;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.a.endTransaction();
            this.e.release(interfaceC796340VLsAcquire);
            throw th;
        }
    }

    @Override // ttpobfuscated.x2
    public long b(DBEvent dBEvent) {
        this.a.assertNotSuspendingTransaction();
        this.a.beginTransaction();
        try {
            long jInsertAndReturnId = this.b.insertAndReturnId(dBEvent);
            this.a.setTransactionSuccessful();
            this.a.endTransaction();
            return jInsertAndReturnId;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.a.endTransaction();
            throw th;
        }
    }

    @Override // ttpobfuscated.x2
    public int a(String str) {
        C0VN5 c0vn5LIZLLL = C0VN5.LIZLLL(1, "SELECT COUNT (`id`) FROM events WHERE `kind` = ?");
        if (str == null) {
            c0vn5LIZLLL.LLD(1);
        } else {
            c0vn5LIZLLL.LJIILIIL(1, str);
        }
        this.a.assertNotSuspendingTransaction();
        int i = 0;
        Cursor cursorLIZIZ = C0VN0.LIZIZ(this.a, c0vn5LIZLLL, false);
        try {
            if (cursorLIZIZ.moveToFirst()) {
                i = cursorLIZIZ.getInt(0);
            }
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

    @Override // ttpobfuscated.x2
    public int a(DBEvent dBEvent) {
        this.a.assertNotSuspendingTransaction();
        this.a.beginTransaction();
        try {
            int iHandle = this.d.handle(dBEvent);
            this.a.setTransactionSuccessful();
            this.a.endTransaction();
            return iHandle;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.a.endTransaction();
            throw th;
        }
    }

    public class a extends AbstractC796330VLr<DBEvent> {
        @Override // X.AbstractC795470VIj
        public String createQuery() {
            return "INSERT OR REPLACE INTO `events` (`id`,`timestamp`,`kind`,`metadata`) VALUES (?,?,?,?)";
        }

        public a(AbstractC796540VMm abstractC796540VMm) {
            super(abstractC796540VMm);
        }

        @Override // X.AbstractC796330VLr
        public void bind(InterfaceC796340VLs interfaceC796340VLs, DBEvent dBEvent) {
            UUID uuid = dBEvent.a;
            if (uuid == null) {
                interfaceC796340VLs.LLD(1);
            } else {
                interfaceC796340VLs.LJJIIJZLJL(1, C2294708yv.LIZIZ(uuid));
            }
            Long lA = y2.this.c.a(dBEvent.b);
            if (lA == null) {
                interfaceC796340VLs.LLD(2);
            } else {
                interfaceC796340VLs.LJIJ(2, lA.longValue());
            }
            String str = dBEvent.c;
            if (str == null) {
                interfaceC796340VLs.LLD(3);
            } else {
                interfaceC796340VLs.LJIILIIL(3, str);
            }
            String str2 = dBEvent.d;
            if (str2 == null) {
                interfaceC796340VLs.LLD(4);
            } else {
                interfaceC796340VLs.LJIILIIL(4, str2);
            }
        }
    }

    public class b extends AbstractC796320VLq<DBEvent> {
        @Override // X.AbstractC796320VLq, X.AbstractC795470VIj
        public String createQuery() {
            return "UPDATE OR ABORT `events` SET `id` = ?,`timestamp` = ?,`kind` = ?,`metadata` = ? WHERE `id` = ?";
        }

        public b(AbstractC796540VMm abstractC796540VMm) {
            super(abstractC796540VMm);
        }

        @Override // X.AbstractC796320VLq
        public void bind(InterfaceC796340VLs interfaceC796340VLs, DBEvent dBEvent) {
            UUID uuid = dBEvent.a;
            if (uuid == null) {
                interfaceC796340VLs.LLD(1);
            } else {
                interfaceC796340VLs.LJJIIJZLJL(1, C2294708yv.LIZIZ(uuid));
            }
            Long lA = y2.this.c.a(dBEvent.b);
            if (lA == null) {
                interfaceC796340VLs.LLD(2);
            } else {
                interfaceC796340VLs.LJIJ(2, lA.longValue());
            }
            String str = dBEvent.c;
            if (str == null) {
                interfaceC796340VLs.LLD(3);
            } else {
                interfaceC796340VLs.LJIILIIL(3, str);
            }
            String str2 = dBEvent.d;
            if (str2 == null) {
                interfaceC796340VLs.LLD(4);
            } else {
                interfaceC796340VLs.LJIILIIL(4, str2);
            }
            UUID uuid2 = dBEvent.a;
            if (uuid2 == null) {
                interfaceC796340VLs.LLD(5);
            } else {
                interfaceC796340VLs.LJJIIJZLJL(5, C2294708yv.LIZIZ(uuid2));
            }
        }
    }

    public class c extends AbstractC795470VIj {
        @Override // X.AbstractC795470VIj
        public String createQuery() {
            return "DELETE FROM events WHERE `id` = ?";
        }

        public c(AbstractC796540VMm abstractC796540VMm) {
            super(abstractC796540VMm);
        }
    }

    @Override // ttpobfuscated.x2
    public List<DBEvent> a(List<String> list, int i) {
        UUID uuidLIZ;
        Long lValueOf;
        String string;
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT * FROM events WHERE `kind` NOT IN (");
        int size = list.size();
        C0VIY.LIZ(sb, size);
        sb.append(") ORDER BY `kind`, `timestamp` LIMIT ?");
        String string2 = sb.toString();
        int i2 = 1;
        int i3 = size + 1;
        C0VN5 c0vn5LIZLLL = C0VN5.LIZLLL(i3, string2);
        for (String str : list) {
            if (str == null) {
                c0vn5LIZLLL.LLD(i2);
            } else {
                c0vn5LIZLLL.LJIILIIL(i2, str);
            }
            i2++;
        }
        c0vn5LIZLLL.LJIJ(i3, i);
        this.a.assertNotSuspendingTransaction();
        Cursor cursorLIZIZ = C0VN0.LIZIZ(this.a, c0vn5LIZLLL, false);
        try {
            int iLIZIZ = C795450VIh.LIZIZ(cursorLIZIZ, FollowStatusChangeMethod.PARAM_UID);
            int iLIZIZ2 = C795450VIh.LIZIZ(cursorLIZIZ, "timestamp");
            int iLIZIZ3 = C795450VIh.LIZIZ(cursorLIZIZ, "kind");
            int iLIZIZ4 = C795450VIh.LIZIZ(cursorLIZIZ, "metadata");
            ArrayList arrayList = new ArrayList(cursorLIZIZ.getCount());
            while (cursorLIZIZ.moveToNext()) {
                String string3 = null;
                if (cursorLIZIZ.isNull(iLIZIZ)) {
                    uuidLIZ = null;
                } else {
                    uuidLIZ = C2294708yv.LIZ(cursorLIZIZ.getBlob(iLIZIZ));
                }
                if (cursorLIZIZ.isNull(iLIZIZ2)) {
                    lValueOf = null;
                } else {
                    lValueOf = Long.valueOf(cursorLIZIZ.getLong(iLIZIZ2));
                }
                Date dateA = this.c.a(lValueOf);
                if (cursorLIZIZ.isNull(iLIZIZ3)) {
                    string = null;
                } else {
                    string = cursorLIZIZ.getString(iLIZIZ3);
                }
                if (!cursorLIZIZ.isNull(iLIZIZ4)) {
                    string3 = cursorLIZIZ.getString(iLIZIZ4);
                }
                arrayList.add(new DBEvent(uuidLIZ, dateA, string, string3));
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

    @Override // ttpobfuscated.x2
    public List<DBEvent> a(String str, int i) {
        UUID uuidLIZ;
        Long lValueOf;
        String string;
        C0VN5 c0vn5LIZLLL = C0VN5.LIZLLL(2, "SELECT * FROM events WHERE `kind` = ? ORDER BY `timestamp` ASC LIMIT ?");
        if (str == null) {
            c0vn5LIZLLL.LLD(1);
        } else {
            c0vn5LIZLLL.LJIILIIL(1, str);
        }
        c0vn5LIZLLL.LJIJ(2, i);
        this.a.assertNotSuspendingTransaction();
        Cursor cursorLIZIZ = C0VN0.LIZIZ(this.a, c0vn5LIZLLL, false);
        try {
            int iLIZIZ = C795450VIh.LIZIZ(cursorLIZIZ, FollowStatusChangeMethod.PARAM_UID);
            int iLIZIZ2 = C795450VIh.LIZIZ(cursorLIZIZ, "timestamp");
            int iLIZIZ3 = C795450VIh.LIZIZ(cursorLIZIZ, "kind");
            int iLIZIZ4 = C795450VIh.LIZIZ(cursorLIZIZ, "metadata");
            ArrayList arrayList = new ArrayList(cursorLIZIZ.getCount());
            while (cursorLIZIZ.moveToNext()) {
                String string2 = null;
                if (cursorLIZIZ.isNull(iLIZIZ)) {
                    uuidLIZ = null;
                } else {
                    uuidLIZ = C2294708yv.LIZ(cursorLIZIZ.getBlob(iLIZIZ));
                }
                if (cursorLIZIZ.isNull(iLIZIZ2)) {
                    lValueOf = null;
                } else {
                    lValueOf = Long.valueOf(cursorLIZIZ.getLong(iLIZIZ2));
                }
                Date dateA = this.c.a(lValueOf);
                if (cursorLIZIZ.isNull(iLIZIZ3)) {
                    string = null;
                } else {
                    string = cursorLIZIZ.getString(iLIZIZ3);
                }
                if (!cursorLIZIZ.isNull(iLIZIZ4)) {
                    string2 = cursorLIZIZ.getString(iLIZIZ4);
                }
                arrayList.add(new DBEvent(uuidLIZ, dateA, string, string2));
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
}
