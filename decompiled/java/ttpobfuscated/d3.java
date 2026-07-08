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
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import ttp.orbu.sdk.repository.model.DBUser;

/* JADX INFO: loaded from: classes14.dex */
public final class d3 implements c3 {
    public final AbstractC796540VMm a;
    public final AbstractC796330VLr<DBUser> b;
    public final p4 c = new p4();
    public final AbstractC796320VLq<DBUser> d;
    public final AbstractC795470VIj e;

    @Override // ttpobfuscated.c3
    public List<DBUser> a() {
        C0VN5 c0vn5LIZLLL = C0VN5.LIZLLL(0, "SELECT * FROM users");
        this.a.assertNotSuspendingTransaction();
        Cursor cursorLIZIZ = C0VN0.LIZIZ(this.a, c0vn5LIZLLL, false);
        try {
            int iLIZIZ = C795450VIh.LIZIZ(cursorLIZIZ, "userId");
            int iLIZIZ2 = C795450VIh.LIZIZ(cursorLIZIZ, "deviceId");
            int iLIZIZ3 = C795450VIh.LIZIZ(cursorLIZIZ, "region");
            int iLIZIZ4 = C795450VIh.LIZIZ(cursorLIZIZ, "lastUpdateTime");
            int iLIZIZ5 = C795450VIh.LIZIZ(cursorLIZIZ, "clientIdentifier");
            int iLIZIZ6 = C795450VIh.LIZIZ(cursorLIZIZ, "regionStatus");
            int iLIZIZ7 = C795450VIh.LIZIZ(cursorLIZIZ, "exRegions");
            int iLIZIZ8 = C795450VIh.LIZIZ(cursorLIZIZ, "activated");
            ArrayList arrayList = new ArrayList(cursorLIZIZ.getCount());
            while (cursorLIZIZ.moveToNext()) {
                arrayList.add(new DBUser(cursorLIZIZ.isNull(iLIZIZ) ? null : cursorLIZIZ.getString(iLIZIZ), cursorLIZIZ.isNull(iLIZIZ2) ? null : cursorLIZIZ.getString(iLIZIZ2), cursorLIZIZ.isNull(iLIZIZ3) ? null : cursorLIZIZ.getString(iLIZIZ3), cursorLIZIZ.getLong(iLIZIZ4), cursorLIZIZ.isNull(iLIZIZ5) ? null : cursorLIZIZ.getString(iLIZIZ5), cursorLIZIZ.isNull(iLIZIZ6) ? null : cursorLIZIZ.getString(iLIZIZ6), this.c.a(cursorLIZIZ.isNull(iLIZIZ7) ? null : cursorLIZIZ.getString(iLIZIZ7)), cursorLIZIZ.getInt(iLIZIZ8) != 0));
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

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // ttpobfuscated.c3
    public DBUser c() {
        C0VN5 c0vn5LIZLLL = C0VN5.LIZLLL(0, "SELECT * FROM users ORDER BY `lastUpdateTime` DESC LIMIT 1");
        this.a.assertNotSuspendingTransaction();
        Cursor cursorLIZIZ = C0VN0.LIZIZ(this.a, c0vn5LIZLLL, false);
        try {
            int iLIZIZ = C795450VIh.LIZIZ(cursorLIZIZ, "userId");
            int iLIZIZ2 = C795450VIh.LIZIZ(cursorLIZIZ, "deviceId");
            int iLIZIZ3 = C795450VIh.LIZIZ(cursorLIZIZ, "region");
            int iLIZIZ4 = C795450VIh.LIZIZ(cursorLIZIZ, "lastUpdateTime");
            int iLIZIZ5 = C795450VIh.LIZIZ(cursorLIZIZ, "clientIdentifier");
            int iLIZIZ6 = C795450VIh.LIZIZ(cursorLIZIZ, "regionStatus");
            int iLIZIZ7 = C795450VIh.LIZIZ(cursorLIZIZ, "exRegions");
            int iLIZIZ8 = C795450VIh.LIZIZ(cursorLIZIZ, "activated");
            DBUser dBUser = null;
            if (cursorLIZIZ.moveToFirst()) {
                dBUser = new DBUser(cursorLIZIZ.isNull(iLIZIZ) ? null : cursorLIZIZ.getString(iLIZIZ), cursorLIZIZ.isNull(iLIZIZ2) ? null : cursorLIZIZ.getString(iLIZIZ2), cursorLIZIZ.isNull(iLIZIZ3) ? null : cursorLIZIZ.getString(iLIZIZ3), cursorLIZIZ.getLong(iLIZIZ4), cursorLIZIZ.isNull(iLIZIZ5) ? null : cursorLIZIZ.getString(iLIZIZ5), cursorLIZIZ.isNull(iLIZIZ6) ? null : cursorLIZIZ.getString(iLIZIZ6), this.c.a(cursorLIZIZ.isNull(iLIZIZ7) ? null : cursorLIZIZ.getString(iLIZIZ7)), cursorLIZIZ.getInt(iLIZIZ8) != 0);
            }
            cursorLIZIZ.close();
            c0vn5LIZLLL.release();
            return dBUser;
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

    public d3(AbstractC796540VMm abstractC796540VMm) {
        this.a = abstractC796540VMm;
        this.b = new a(abstractC796540VMm);
        this.d = new b(abstractC796540VMm);
        this.e = new c(abstractC796540VMm);
    }

    @Override // ttpobfuscated.c3
    public int a(String str) {
        this.a.assertNotSuspendingTransaction();
        InterfaceC796340VLs interfaceC796340VLsAcquire = this.e.acquire();
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
            this.e.release(interfaceC796340VLsAcquire);
            return iLJIIL;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.a.endTransaction();
            this.e.release(interfaceC796340VLsAcquire);
            throw th;
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // ttpobfuscated.c3
    public DBUser b(String str) {
        String string;
        String string2;
        String string3;
        String string4;
        String string5;
        boolean z;
        C0VN5 c0vn5LIZLLL = C0VN5.LIZLLL(1, "SELECT * FROM users WHERE `userId` = ?");
        if (str == null) {
            c0vn5LIZLLL.LLD(1);
        } else {
            c0vn5LIZLLL.LJIILIIL(1, str);
        }
        this.a.assertNotSuspendingTransaction();
        Cursor cursorLIZIZ = C0VN0.LIZIZ(this.a, c0vn5LIZLLL, false);
        try {
            int iLIZIZ = C795450VIh.LIZIZ(cursorLIZIZ, "userId");
            int iLIZIZ2 = C795450VIh.LIZIZ(cursorLIZIZ, "deviceId");
            int iLIZIZ3 = C795450VIh.LIZIZ(cursorLIZIZ, "region");
            int iLIZIZ4 = C795450VIh.LIZIZ(cursorLIZIZ, "lastUpdateTime");
            int iLIZIZ5 = C795450VIh.LIZIZ(cursorLIZIZ, "clientIdentifier");
            int iLIZIZ6 = C795450VIh.LIZIZ(cursorLIZIZ, "regionStatus");
            int iLIZIZ7 = C795450VIh.LIZIZ(cursorLIZIZ, "exRegions");
            int iLIZIZ8 = C795450VIh.LIZIZ(cursorLIZIZ, "activated");
            DBUser dBUser = null;
            String string6 = null;
            if (cursorLIZIZ.moveToFirst()) {
                if (cursorLIZIZ.isNull(iLIZIZ)) {
                    string = null;
                } else {
                    string = cursorLIZIZ.getString(iLIZIZ);
                }
                if (cursorLIZIZ.isNull(iLIZIZ2)) {
                    string2 = null;
                } else {
                    string2 = cursorLIZIZ.getString(iLIZIZ2);
                }
                if (cursorLIZIZ.isNull(iLIZIZ3)) {
                    string3 = null;
                } else {
                    string3 = cursorLIZIZ.getString(iLIZIZ3);
                }
                long j = cursorLIZIZ.getLong(iLIZIZ4);
                if (cursorLIZIZ.isNull(iLIZIZ5)) {
                    string4 = null;
                } else {
                    string4 = cursorLIZIZ.getString(iLIZIZ5);
                }
                if (cursorLIZIZ.isNull(iLIZIZ6)) {
                    string5 = null;
                } else {
                    string5 = cursorLIZIZ.getString(iLIZIZ6);
                }
                if (!cursorLIZIZ.isNull(iLIZIZ7)) {
                    string6 = cursorLIZIZ.getString(iLIZIZ7);
                }
                List<String> listA = this.c.a(string6);
                if (cursorLIZIZ.getInt(iLIZIZ8) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                dBUser = new DBUser(string, string2, string3, j, string4, string5, listA, z);
            }
            cursorLIZIZ.close();
            c0vn5LIZLLL.release();
            return dBUser;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            cursorLIZIZ.close();
            c0vn5LIZLLL.release();
            throw th;
        }
    }

    @Override // ttpobfuscated.c3
    public long a(DBUser dBUser) {
        this.a.assertNotSuspendingTransaction();
        this.a.beginTransaction();
        try {
            long jInsertAndReturnId = this.b.insertAndReturnId(dBUser);
            this.a.setTransactionSuccessful();
            this.a.endTransaction();
            return jInsertAndReturnId;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.a.endTransaction();
            throw th;
        }
    }

    @Override // ttpobfuscated.c3
    public int b(DBUser dBUser) {
        this.a.assertNotSuspendingTransaction();
        this.a.beginTransaction();
        try {
            int iHandle = this.d.handle(dBUser);
            this.a.setTransactionSuccessful();
            this.a.endTransaction();
            return iHandle;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.a.endTransaction();
            throw th;
        }
    }

    public class a extends AbstractC796330VLr<DBUser> {
        @Override // X.AbstractC795470VIj
        public String createQuery() {
            return "INSERT OR REPLACE INTO `users` (`userId`,`deviceId`,`region`,`lastUpdateTime`,`clientIdentifier`,`regionStatus`,`exRegions`,`activated`) VALUES (?,?,?,?,?,?,?,?)";
        }

        public a(AbstractC796540VMm abstractC796540VMm) {
            super(abstractC796540VMm);
        }

        @Override // X.AbstractC796330VLr
        public void bind(InterfaceC796340VLs interfaceC796340VLs, DBUser dBUser) {
            String str = dBUser.a;
            if (str == null) {
                interfaceC796340VLs.LLD(1);
            } else {
                interfaceC796340VLs.LJIILIIL(1, str);
            }
            String str2 = dBUser.b;
            if (str2 == null) {
                interfaceC796340VLs.LLD(2);
            } else {
                interfaceC796340VLs.LJIILIIL(2, str2);
            }
            String str3 = dBUser.c;
            if (str3 == null) {
                interfaceC796340VLs.LLD(3);
            } else {
                interfaceC796340VLs.LJIILIIL(3, str3);
            }
            interfaceC796340VLs.LJIJ(4, dBUser.d);
            String str4 = dBUser.e;
            if (str4 == null) {
                interfaceC796340VLs.LLD(5);
            } else {
                interfaceC796340VLs.LJIILIIL(5, str4);
            }
            String str5 = dBUser.f;
            if (str5 == null) {
                interfaceC796340VLs.LLD(6);
            } else {
                interfaceC796340VLs.LJIILIIL(6, str5);
            }
            String strA = d3.this.c.a(dBUser.g);
            if (strA == null) {
                interfaceC796340VLs.LLD(7);
            } else {
                interfaceC796340VLs.LJIILIIL(7, strA);
            }
            interfaceC796340VLs.LJIJ(8, dBUser.h ? 1L : 0L);
        }
    }

    public class b extends AbstractC796320VLq<DBUser> {
        @Override // X.AbstractC796320VLq, X.AbstractC795470VIj
        public String createQuery() {
            return "UPDATE OR ABORT `users` SET `userId` = ?,`deviceId` = ?,`region` = ?,`lastUpdateTime` = ?,`clientIdentifier` = ?,`regionStatus` = ?,`exRegions` = ?,`activated` = ? WHERE `userId` = ?";
        }

        public b(AbstractC796540VMm abstractC796540VMm) {
            super(abstractC796540VMm);
        }

        @Override // X.AbstractC796320VLq
        public void bind(InterfaceC796340VLs interfaceC796340VLs, DBUser dBUser) {
            String str = dBUser.a;
            if (str == null) {
                interfaceC796340VLs.LLD(1);
            } else {
                interfaceC796340VLs.LJIILIIL(1, str);
            }
            String str2 = dBUser.b;
            if (str2 == null) {
                interfaceC796340VLs.LLD(2);
            } else {
                interfaceC796340VLs.LJIILIIL(2, str2);
            }
            String str3 = dBUser.c;
            if (str3 == null) {
                interfaceC796340VLs.LLD(3);
            } else {
                interfaceC796340VLs.LJIILIIL(3, str3);
            }
            interfaceC796340VLs.LJIJ(4, dBUser.d);
            String str4 = dBUser.e;
            if (str4 == null) {
                interfaceC796340VLs.LLD(5);
            } else {
                interfaceC796340VLs.LJIILIIL(5, str4);
            }
            String str5 = dBUser.f;
            if (str5 == null) {
                interfaceC796340VLs.LLD(6);
            } else {
                interfaceC796340VLs.LJIILIIL(6, str5);
            }
            String strA = d3.this.c.a(dBUser.g);
            if (strA == null) {
                interfaceC796340VLs.LLD(7);
            } else {
                interfaceC796340VLs.LJIILIIL(7, strA);
            }
            interfaceC796340VLs.LJIJ(8, dBUser.h ? 1L : 0L);
            String str6 = dBUser.a;
            if (str6 == null) {
                interfaceC796340VLs.LLD(9);
            } else {
                interfaceC796340VLs.LJIILIIL(9, str6);
            }
        }
    }

    public class c extends AbstractC795470VIj {
        @Override // X.AbstractC795470VIj
        public String createQuery() {
            return "DELETE FROM users WHERE `userId` = ?";
        }

        public c(AbstractC796540VMm abstractC796540VMm) {
            super(abstractC796540VMm);
        }
    }
}
