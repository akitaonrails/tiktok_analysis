package com.bytedance.sync.v4.presistence;

import X.AbstractC796510VMj;
import X.C0VKN;
import X.C0VLF;
import X.C0VN2;
import X.C0VN3;
import X.C0WYS;
import X.C0WYT;
import X.C796520VMk;
import X.C796620VMu;
import X.C801430VcD;
import X.C801500VcK;
import X.InterfaceC1526220poq;
import X.InterfaceC1527640pr8;
import X.InterfaceC1527700prE;
import X.InterfaceC1527720prG;
import X.InterfaceC2275591E5d;
import X.InterfaceC796190VLd;
import android.database.Cursor;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public final class AppDatabaseV4_Impl extends AppDatabaseV4 {
    public volatile C801430VcD LL;
    public volatile C0WYS LLILLJJLI;
    public volatile C801500VcK LLILLL;
    public volatile C0WYT LLILZ;

    /* JADX WARN: Type inference failed for: r0v4, types: [X.0VcD] */
    @Override // com.bytedance.sync.v4.presistence.AppDatabaseV4
    public final InterfaceC1527700prE LIZ() {
        C801430VcD c801430VcD;
        if (this.LL != null) {
            return this.LL;
        }
        synchronized (this) {
            try {
                if (this.LL == null) {
                    this.LL = new InterfaceC1527700prE(this) { // from class: X.0VcD
                        public final AbstractC796540VMm LIZ;
                        public final C801540VcO LIZIZ;
                        public final C801440VcE LIZJ;
                        public final C801460VcG LIZLLL;
                        public final C801470VcH LJ;
                        public final C801480VcI LJFF;

                        @Override // X.InterfaceC1527700prE
                        public final void LIZLLL() {
                            this.LIZ.assertNotSuspendingTransaction();
                            InterfaceC796340VLs interfaceC796340VLsAcquire = acquire();
                            this.LIZ.beginTransaction();
                            try {
                                interfaceC796340VLsAcquire.LJIIL();
                                this.LIZ.setTransactionSuccessful();
                                this.LIZ.endTransaction();
                                release(interfaceC796340VLsAcquire);
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                this.LIZ.endTransaction();
                                release(interfaceC796340VLsAcquire);
                                throw th;
                            }
                        }

                        /* JADX WARN: Type inference failed for: r0v0, types: [X.0VcO] */
                        /* JADX WARN: Type inference failed for: r0v1, types: [X.0VcE] */
                        /* JADX WARN: Type inference failed for: r0v3, types: [X.0VcG] */
                        /* JADX WARN: Type inference failed for: r0v4, types: [X.0VcH] */
                        /* JADX WARN: Type inference failed for: r0v5, types: [X.0VcI] */
                        {
                            this.LIZ = this;
                            this.LIZIZ = new AbstractC796330VLr<C801550VcP>(this) { // from class: X.0VcO
                                @Override // X.AbstractC795470VIj
                                public final String createQuery() {
                                    return "INSERT OR REPLACE INTO `t_business` (`id`,`consume_type`,`bucket`) VALUES (?,?,?)";
                                }

                                @Override // X.AbstractC796330VLr
                                public final void bind(InterfaceC796340VLs interfaceC796340VLs, C801550VcP c801550VcP) {
                                    C801550VcP c801550VcP2 = c801550VcP;
                                    interfaceC796340VLs.LJIJ(1, c801550VcP2.LIZ);
                                    interfaceC796340VLs.LJIJ(2, c801550VcP2.LIZIZ.getValue());
                                    interfaceC796340VLs.LJIJ(3, C825030WYb.LIZ(c801550VcP2.LIZJ));
                                }
                            };
                            this.LIZJ = new AbstractC796330VLr<C801490VcJ>(this) { // from class: X.0VcE
                                @Override // X.AbstractC795470VIj
                                public final String createQuery() {
                                    return "INSERT OR REPLACE INTO `t_sync_cursor` (`sync_id`,`did`,`uid`,`topic_type`,`bucket`,`recv_cursor`,`report_cursor`) VALUES (?,?,?,?,?,?,?)";
                                }

                                @Override // X.AbstractC796330VLr
                                public final void bind(InterfaceC796340VLs interfaceC796340VLs, C801490VcJ c801490VcJ) {
                                    C801490VcJ c801490VcJ2 = c801490VcJ;
                                    String str = c801490VcJ2.LIZ;
                                    if (str == null) {
                                        interfaceC796340VLs.LLD(1);
                                    } else {
                                        interfaceC796340VLs.LJIILIIL(1, str);
                                    }
                                    String str2 = c801490VcJ2.LIZIZ;
                                    if (str2 == null) {
                                        interfaceC796340VLs.LLD(2);
                                    } else {
                                        interfaceC796340VLs.LJIILIIL(2, str2);
                                    }
                                    String str3 = c801490VcJ2.LIZJ;
                                    if (str3 == null) {
                                        interfaceC796340VLs.LLD(3);
                                    } else {
                                        interfaceC796340VLs.LJIILIIL(3, str3);
                                    }
                                    interfaceC796340VLs.LJIJ(4, C825040WYc.LIZ(c801490VcJ2.LIZLLL));
                                    interfaceC796340VLs.LJIJ(5, C825030WYb.LIZ(c801490VcJ2.LJ));
                                    interfaceC796340VLs.LJIJ(6, c801490VcJ2.LJFF);
                                    interfaceC796340VLs.LJIJ(7, c801490VcJ2.LJI);
                                }
                            };
                            new AbstractC795470VIj(this) { // from class: X.0VcF
                                @Override // X.AbstractC795470VIj
                                public final String createQuery() {
                                    return "UPDATE t_sync_cursor SET report_cursor = ?,did=?,uid=?,bucket=? WHERE sync_id = ? ";
                                }
                            };
                            this.LIZLLL = new AbstractC795470VIj(this) { // from class: X.0VcG
                                @Override // X.AbstractC795470VIj
                                public final String createQuery() {
                                    return "UPDATE t_sync_cursor SET report_cursor = ? WHERE sync_id = ? ";
                                }
                            };
                            this.LJ = new AbstractC795470VIj(this) { // from class: X.0VcH
                                @Override // X.AbstractC795470VIj
                                public final String createQuery() {
                                    return "UPDATE t_sync_cursor SET recv_cursor = 0 WHERE sync_id=?";
                                }
                            };
                            this.LJFF = new AbstractC795470VIj(this) { // from class: X.0VcI
                                @Override // X.AbstractC795470VIj
                                public final String createQuery() {
                                    return "UPDATE t_sync_cursor set recv_cursor = 0";
                                }
                            };
                        }

                        @Override // X.InterfaceC1527700prE
                        public final List<C801490VcJ> LIZIZ(String str) {
                            C0VN5 c0vn5LIZLLL = C0VN5.LIZLLL(1, "SELECT * FROM t_sync_cursor WHERE did = ?");
                            if (str == null) {
                                c0vn5LIZLLL.LLD(1);
                            } else {
                                c0vn5LIZLLL.LJIILIIL(1, str);
                            }
                            this.LIZ.assertNotSuspendingTransaction();
                            Cursor cursorLIZIZ = C0VN0.LIZIZ(this.LIZ, c0vn5LIZLLL, false);
                            try {
                                int iLIZIZ = C795450VIh.LIZIZ(cursorLIZIZ, "sync_id");
                                int iLIZIZ2 = C795450VIh.LIZIZ(cursorLIZIZ, "did");
                                int iLIZIZ3 = C795450VIh.LIZIZ(cursorLIZIZ, "uid");
                                int iLIZIZ4 = C795450VIh.LIZIZ(cursorLIZIZ, "topic_type");
                                int iLIZIZ5 = C795450VIh.LIZIZ(cursorLIZIZ, "bucket");
                                int iLIZIZ6 = C795450VIh.LIZIZ(cursorLIZIZ, "recv_cursor");
                                int iLIZIZ7 = C795450VIh.LIZIZ(cursorLIZIZ, "report_cursor");
                                ArrayList arrayList = new ArrayList(cursorLIZIZ.getCount());
                                while (cursorLIZIZ.moveToNext()) {
                                    C801490VcJ c801490VcJ = new C801490VcJ();
                                    if (cursorLIZIZ.isNull(iLIZIZ)) {
                                        c801490VcJ.LIZ = null;
                                    } else {
                                        c801490VcJ.LIZ = cursorLIZIZ.getString(iLIZIZ);
                                    }
                                    if (cursorLIZIZ.isNull(iLIZIZ2)) {
                                        c801490VcJ.LIZIZ = null;
                                    } else {
                                        c801490VcJ.LIZIZ = cursorLIZIZ.getString(iLIZIZ2);
                                    }
                                    if (cursorLIZIZ.isNull(iLIZIZ3)) {
                                        c801490VcJ.LIZJ = null;
                                    } else {
                                        c801490VcJ.LIZJ = cursorLIZIZ.getString(iLIZIZ3);
                                    }
                                    c801490VcJ.LIZLLL = C825040WYc.LIZIZ(cursorLIZIZ.getInt(iLIZIZ4));
                                    c801490VcJ.LJ = C825030WYb.LIZIZ(cursorLIZIZ.getInt(iLIZIZ5));
                                    c801490VcJ.LJFF = cursorLIZIZ.getLong(iLIZIZ6);
                                    c801490VcJ.LJI = cursorLIZIZ.getLong(iLIZIZ7);
                                    arrayList.add(c801490VcJ);
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

                        @Override // X.InterfaceC1527700prE
                        public final C801490VcJ LIZJ(long j) {
                            C0VN5 c0vn5LIZLLL = C0VN5.LIZLLL(1, "SELECT * FROM t_sync_cursor WHERE sync_id = ?");
                            c0vn5LIZLLL.LJIJ(1, j);
                            this.LIZ.assertNotSuspendingTransaction();
                            Cursor cursorLIZIZ = C0VN0.LIZIZ(this.LIZ, c0vn5LIZLLL, false);
                            try {
                                int iLIZIZ = C795450VIh.LIZIZ(cursorLIZIZ, "sync_id");
                                int iLIZIZ2 = C795450VIh.LIZIZ(cursorLIZIZ, "did");
                                int iLIZIZ3 = C795450VIh.LIZIZ(cursorLIZIZ, "uid");
                                int iLIZIZ4 = C795450VIh.LIZIZ(cursorLIZIZ, "topic_type");
                                int iLIZIZ5 = C795450VIh.LIZIZ(cursorLIZIZ, "bucket");
                                int iLIZIZ6 = C795450VIh.LIZIZ(cursorLIZIZ, "recv_cursor");
                                int iLIZIZ7 = C795450VIh.LIZIZ(cursorLIZIZ, "report_cursor");
                                C801490VcJ c801490VcJ = null;
                                if (cursorLIZIZ.moveToFirst()) {
                                    C801490VcJ c801490VcJ2 = new C801490VcJ();
                                    if (cursorLIZIZ.isNull(iLIZIZ)) {
                                        c801490VcJ2.LIZ = null;
                                    } else {
                                        c801490VcJ2.LIZ = cursorLIZIZ.getString(iLIZIZ);
                                    }
                                    if (cursorLIZIZ.isNull(iLIZIZ2)) {
                                        c801490VcJ2.LIZIZ = null;
                                    } else {
                                        c801490VcJ2.LIZIZ = cursorLIZIZ.getString(iLIZIZ2);
                                    }
                                    if (cursorLIZIZ.isNull(iLIZIZ3)) {
                                        c801490VcJ2.LIZJ = null;
                                    } else {
                                        c801490VcJ2.LIZJ = cursorLIZIZ.getString(iLIZIZ3);
                                    }
                                    c801490VcJ2.LIZLLL = C825040WYc.LIZIZ(cursorLIZIZ.getInt(iLIZIZ4));
                                    c801490VcJ2.LJ = C825030WYb.LIZIZ(cursorLIZIZ.getInt(iLIZIZ5));
                                    c801490VcJ2.LJFF = cursorLIZIZ.getLong(iLIZIZ6);
                                    c801490VcJ2.LJI = cursorLIZIZ.getLong(iLIZIZ7);
                                    c801490VcJ = c801490VcJ2;
                                }
                                cursorLIZIZ.close();
                                c0vn5LIZLLL.release();
                                return c801490VcJ;
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                cursorLIZIZ.close();
                                c0vn5LIZLLL.release();
                                throw th;
                            }
                        }

                        @Override // X.InterfaceC1527700prE
                        public final void LJ(List<? extends C801490VcJ> list) {
                            this.LIZ.assertNotSuspendingTransaction();
                            this.LIZ.beginTransaction();
                            try {
                                insert((Iterable) list);
                                this.LIZ.setTransactionSuccessful();
                                this.LIZ.endTransaction();
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                this.LIZ.endTransaction();
                                throw th;
                            }
                        }

                        @Override // X.InterfaceC1527700prE
                        public final void LJFF(List<String> list) {
                            this.LIZ.assertNotSuspendingTransaction();
                            StringBuilder sb = new StringBuilder();
                            sb.append("DELETE from t_sync_cursor where sync_id in (");
                            C0VIY.LIZ(sb, list.size());
                            sb.append(")");
                            InterfaceC796340VLs interfaceC796340VLsCompileStatement = this.LIZ.compileStatement(sb.toString());
                            int i = 1;
                            for (String str : list) {
                                if (str == null) {
                                    interfaceC796340VLsCompileStatement.LLD(i);
                                } else {
                                    interfaceC796340VLsCompileStatement.LJIILIIL(i, str);
                                }
                                i++;
                            }
                            this.LIZ.beginTransaction();
                            try {
                                interfaceC796340VLsCompileStatement.LJIIL();
                                this.LIZ.setTransactionSuccessful();
                                this.LIZ.endTransaction();
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                this.LIZ.endTransaction();
                                throw th;
                            }
                        }

                        @Override // X.InterfaceC1527700prE
                        public final List<C801490VcJ> LJI(List<String> list) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("SELECT * FROM t_sync_cursor WHERE sync_id IN (");
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
                            this.LIZ.assertNotSuspendingTransaction();
                            Cursor cursorLIZIZ = C0VN0.LIZIZ(this.LIZ, c0vn5LIZLLL, false);
                            try {
                                int iLIZIZ = C795450VIh.LIZIZ(cursorLIZIZ, "sync_id");
                                int iLIZIZ2 = C795450VIh.LIZIZ(cursorLIZIZ, "did");
                                int iLIZIZ3 = C795450VIh.LIZIZ(cursorLIZIZ, "uid");
                                int iLIZIZ4 = C795450VIh.LIZIZ(cursorLIZIZ, "topic_type");
                                int iLIZIZ5 = C795450VIh.LIZIZ(cursorLIZIZ, "bucket");
                                int iLIZIZ6 = C795450VIh.LIZIZ(cursorLIZIZ, "recv_cursor");
                                int iLIZIZ7 = C795450VIh.LIZIZ(cursorLIZIZ, "report_cursor");
                                ArrayList arrayList = new ArrayList(cursorLIZIZ.getCount());
                                while (cursorLIZIZ.moveToNext()) {
                                    C801490VcJ c801490VcJ = new C801490VcJ();
                                    if (cursorLIZIZ.isNull(iLIZIZ)) {
                                        c801490VcJ.LIZ = null;
                                    } else {
                                        c801490VcJ.LIZ = cursorLIZIZ.getString(iLIZIZ);
                                    }
                                    if (cursorLIZIZ.isNull(iLIZIZ2)) {
                                        c801490VcJ.LIZIZ = null;
                                    } else {
                                        c801490VcJ.LIZIZ = cursorLIZIZ.getString(iLIZIZ2);
                                    }
                                    if (cursorLIZIZ.isNull(iLIZIZ3)) {
                                        c801490VcJ.LIZJ = null;
                                    } else {
                                        c801490VcJ.LIZJ = cursorLIZIZ.getString(iLIZIZ3);
                                    }
                                    c801490VcJ.LIZLLL = C825040WYc.LIZIZ(cursorLIZIZ.getInt(iLIZIZ4));
                                    c801490VcJ.LJ = C825030WYb.LIZIZ(cursorLIZIZ.getInt(iLIZIZ5));
                                    c801490VcJ.LJFF = cursorLIZIZ.getLong(iLIZIZ6);
                                    c801490VcJ.LJI = cursorLIZIZ.getLong(iLIZIZ7);
                                    arrayList.add(c801490VcJ);
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

                        @Override // X.InterfaceC1527700prE
                        public final void LJII(List<? extends C801550VcP> list) {
                            this.LIZ.assertNotSuspendingTransaction();
                            this.LIZ.beginTransaction();
                            try {
                                insert((Iterable) list);
                                this.LIZ.setTransactionSuccessful();
                                this.LIZ.endTransaction();
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                this.LIZ.endTransaction();
                                throw th;
                            }
                        }

                        @Override // X.InterfaceC1527700prE
                        public final void LJIIIIZZ(String str) {
                            this.LIZ.assertNotSuspendingTransaction();
                            InterfaceC796340VLs interfaceC796340VLsAcquire = acquire();
                            if (str == null) {
                                interfaceC796340VLsAcquire.LLD(1);
                            } else {
                                interfaceC796340VLsAcquire.LJIILIIL(1, str);
                            }
                            this.LIZ.beginTransaction();
                            try {
                                interfaceC796340VLsAcquire.LJIIL();
                                this.LIZ.setTransactionSuccessful();
                                this.LIZ.endTransaction();
                                release(interfaceC796340VLsAcquire);
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                this.LIZ.endTransaction();
                                release(interfaceC796340VLsAcquire);
                                throw th;
                            }
                        }

                        @Override // X.InterfaceC1527700prE
                        public final int LIZ(long j, String str) {
                            this.LIZ.assertNotSuspendingTransaction();
                            InterfaceC796340VLs interfaceC796340VLsAcquire = acquire();
                            interfaceC796340VLsAcquire.LJIJ(1, j);
                            if (str == null) {
                                interfaceC796340VLsAcquire.LLD(2);
                            } else {
                                interfaceC796340VLsAcquire.LJIILIIL(2, str);
                            }
                            this.LIZ.beginTransaction();
                            try {
                                int iLJIIL = interfaceC796340VLsAcquire.LJIIL();
                                this.LIZ.setTransactionSuccessful();
                                this.LIZ.endTransaction();
                                release(interfaceC796340VLsAcquire);
                                return iLJIIL;
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                this.LIZ.endTransaction();
                                release(interfaceC796340VLsAcquire);
                                throw th;
                            }
                        }
                    };
                }
                c801430VcD = this.LL;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return c801430VcD;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.0WYT] */
    @Override // com.bytedance.sync.v4.presistence.AppDatabaseV4
    public final InterfaceC1526220poq LIZIZ() {
        C0WYT c0wyt;
        if (this.LLILZ != null) {
            return this.LLILZ;
        }
        synchronized (this) {
            try {
                if (this.LLILZ == null) {
                    this.LLILZ = new InterfaceC1526220poq(this) { // from class: X.0WYT
                        public final AbstractC796540VMm LIZ;
                        public final C854570Xfj LIZIZ;
                        public final C0WYZ LIZJ;

                        /* JADX WARN: Type inference failed for: r0v1, types: [X.0WYZ] */
                        {
                            this.LIZ = this;
                            this.LIZIZ = new C854570Xfj(this, 7);
                            this.LIZJ = new AbstractC796320VLq<C0WYV>(this) { // from class: X.0WYZ
                                @Override // X.AbstractC796320VLq, X.AbstractC795470VIj
                                public final String createQuery() {
                                    return "DELETE FROM `t_history_synclog` WHERE `sync_id` = ? AND `sync_cursor` = ?";
                                }

                                @Override // X.AbstractC796320VLq
                                public final void bind(InterfaceC796340VLs interfaceC796340VLs, C0WYV c0wyv) {
                                    C0WYV c0wyv2 = c0wyv;
                                    String str = c0wyv2.LIZ;
                                    if (str == null) {
                                        interfaceC796340VLs.LLD(1);
                                    } else {
                                        interfaceC796340VLs.LJIILIIL(1, str);
                                    }
                                    interfaceC796340VLs.LJIJ(2, c0wyv2.LIZLLL);
                                }
                            };
                        }

                        @Override // X.InterfaceC1526220poq
                        public final void LIZ(List<? extends C0WYV> list) {
                            this.LIZ.assertNotSuspendingTransaction();
                            this.LIZ.beginTransaction();
                            try {
                                handleMultiple(list);
                                this.LIZ.setTransactionSuccessful();
                                this.LIZ.endTransaction();
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                this.LIZ.endTransaction();
                                throw th;
                            }
                        }

                        @Override // X.InterfaceC1526220poq
                        public final void LIZJ(ArrayList<C0WYV> arrayList) {
                            this.LIZ.assertNotSuspendingTransaction();
                            this.LIZ.beginTransaction();
                            try {
                                this.LIZIZ.insert((Iterable) arrayList);
                                this.LIZ.setTransactionSuccessful();
                                this.LIZ.endTransaction();
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                this.LIZ.endTransaction();
                                throw th;
                            }
                        }

                        @Override // X.InterfaceC1526220poq
                        public final List<C0WYV> LIZIZ(String str, String str2, long j, EnumC1525890poJ enumC1525890poJ, int i) throws Throwable {
                            int iLIZIZ;
                            int iLIZIZ2;
                            int iLIZIZ3;
                            int iLIZIZ4;
                            int iLIZIZ5;
                            int iLIZIZ6;
                            int iLIZIZ7;
                            int iLIZIZ8;
                            int iLIZIZ9;
                            int iLIZIZ10;
                            int iLIZIZ11;
                            int iLIZIZ12;
                            int iLIZIZ13;
                            int iLIZIZ14;
                            String string;
                            C0VN5 c0vn5LIZLLL = C0VN5.LIZLLL(5, "SELECT * FROM t_history_synclog  WHERE did=? AND uid in (0, ?) AND business =?  AND topic_type = ? ORDER BY sync_cursor DESC  LIMIT ?");
                            if (str == null) {
                                c0vn5LIZLLL.LLD(1);
                            } else {
                                c0vn5LIZLLL.LJIILIIL(1, str);
                            }
                            if (str2 == null) {
                                c0vn5LIZLLL.LLD(2);
                            } else {
                                c0vn5LIZLLL.LJIILIIL(2, str2);
                            }
                            c0vn5LIZLLL.LJIJ(3, j);
                            c0vn5LIZLLL.LJIJ(4, C825040WYc.LIZ(enumC1525890poJ));
                            c0vn5LIZLLL.LJIJ(5, i);
                            this.LIZ.assertNotSuspendingTransaction();
                            Cursor cursorLIZIZ = C0VN0.LIZIZ(this.LIZ, c0vn5LIZLLL, false);
                            try {
                                iLIZIZ = C795450VIh.LIZIZ(cursorLIZIZ, "sync_id");
                                iLIZIZ2 = C795450VIh.LIZIZ(cursorLIZIZ, "did");
                                iLIZIZ3 = C795450VIh.LIZIZ(cursorLIZIZ, "uid");
                                iLIZIZ4 = C795450VIh.LIZIZ(cursorLIZIZ, "sync_cursor");
                                iLIZIZ5 = C795450VIh.LIZIZ(cursorLIZIZ, "data");
                                iLIZIZ6 = C795450VIh.LIZIZ(cursorLIZIZ, "md5");
                                iLIZIZ7 = C795450VIh.LIZIZ(cursorLIZIZ, "business");
                                iLIZIZ8 = C795450VIh.LIZIZ(cursorLIZIZ, "consume_type");
                                iLIZIZ9 = C795450VIh.LIZIZ(cursorLIZIZ, "data_type");
                                iLIZIZ10 = C795450VIh.LIZIZ(cursorLIZIZ, "publish_ts");
                                iLIZIZ11 = C795450VIh.LIZIZ(cursorLIZIZ, "receive_ts");
                                iLIZIZ12 = C795450VIh.LIZIZ(cursorLIZIZ, "bucket");
                                iLIZIZ13 = C795450VIh.LIZIZ(cursorLIZIZ, "req_id");
                                iLIZIZ14 = C795450VIh.LIZIZ(cursorLIZIZ, "topic_type");
                            } catch (Throwable th) {
                                th = th;
                            }
                            try {
                                int iLIZIZ15 = C795450VIh.LIZIZ(cursorLIZIZ, "packet_status");
                                int iLIZIZ16 = C795450VIh.LIZIZ(cursorLIZIZ, "expire_ts");
                                int iLIZIZ17 = C795450VIh.LIZIZ(cursorLIZIZ, "packet_ctrl");
                                int iLIZIZ18 = C795450VIh.LIZIZ(cursorLIZIZ, "extra");
                                ArrayList arrayList = new ArrayList(cursorLIZIZ.getCount());
                                while (cursorLIZIZ.moveToNext()) {
                                    C0WYV c0wyv = new C0WYV();
                                    if (cursorLIZIZ.isNull(iLIZIZ)) {
                                        c0wyv.LIZ = null;
                                    } else {
                                        c0wyv.LIZ = cursorLIZIZ.getString(iLIZIZ);
                                    }
                                    if (cursorLIZIZ.isNull(iLIZIZ2)) {
                                        c0wyv.LIZIZ = null;
                                    } else {
                                        c0wyv.LIZIZ = cursorLIZIZ.getString(iLIZIZ2);
                                    }
                                    if (cursorLIZIZ.isNull(iLIZIZ3)) {
                                        c0wyv.LIZJ = null;
                                    } else {
                                        c0wyv.LIZJ = cursorLIZIZ.getString(iLIZIZ3);
                                    }
                                    c0wyv.LIZLLL = cursorLIZIZ.getLong(iLIZIZ4);
                                    if (cursorLIZIZ.isNull(iLIZIZ5)) {
                                        c0wyv.LJ = null;
                                    } else {
                                        c0wyv.LJ = cursorLIZIZ.getBlob(iLIZIZ5);
                                    }
                                    if (cursorLIZIZ.isNull(iLIZIZ6)) {
                                        c0wyv.LJFF = null;
                                    } else {
                                        c0wyv.LJFF = cursorLIZIZ.getString(iLIZIZ6);
                                    }
                                    c0wyv.LJI = cursorLIZIZ.getLong(iLIZIZ7);
                                    c0wyv.LJII = C825060WYe.LIZ(cursorLIZIZ.getInt(iLIZIZ8));
                                    c0wyv.LJIIIIZZ = C825050WYd.LIZ(cursorLIZIZ.getInt(iLIZIZ9));
                                    c0wyv.LJIIIZ = cursorLIZIZ.getLong(iLIZIZ10);
                                    c0wyv.LJIIJ = cursorLIZIZ.getLong(iLIZIZ11);
                                    c0wyv.LJIIJJI = C825030WYb.LIZIZ(cursorLIZIZ.getInt(iLIZIZ12));
                                    if (cursorLIZIZ.isNull(iLIZIZ13)) {
                                        c0wyv.LJIIL = null;
                                    } else {
                                        c0wyv.LJIIL = cursorLIZIZ.getString(iLIZIZ13);
                                    }
                                    c0wyv.LJIILIIL = C825040WYc.LIZIZ(cursorLIZIZ.getInt(iLIZIZ14));
                                    EnumC1527270pqX enumC1527270pqXFromValue = EnumC1527270pqX.fromValue(cursorLIZIZ.getInt(iLIZIZ15));
                                    if (enumC1527270pqXFromValue == null) {
                                        enumC1527270pqXFromValue = EnumC1527270pqX.Full;
                                    }
                                    c0wyv.LJIILJJIL = enumC1527270pqXFromValue;
                                    c0wyv.LJIILL = cursorLIZIZ.getLong(iLIZIZ16);
                                    EnumC1527260pqW enumC1527260pqWFromValue = EnumC1527260pqW.fromValue(cursorLIZIZ.getInt(iLIZIZ17));
                                    if (enumC1527260pqWFromValue == null) {
                                        enumC1527260pqWFromValue = EnumC1527260pqW.Noop;
                                    }
                                    c0wyv.LJIILLIIL = enumC1527260pqWFromValue;
                                    if (cursorLIZIZ.isNull(iLIZIZ18)) {
                                        string = null;
                                    } else {
                                        string = cursorLIZIZ.getString(iLIZIZ18);
                                    }
                                    c0wyv.LJIIZILJ = C092400Wk.LIZ(string);
                                    arrayList.add(c0wyv);
                                }
                                cursorLIZIZ.close();
                                c0vn5LIZLLL.release();
                                return arrayList;
                            } catch (Throwable th2) {
                                th = th2;
                                while (true) {
                                    try {
                                        TryCatchGuardChecker.doCheck(th);
                                        cursorLIZIZ.close();
                                        c0vn5LIZLLL.release();
                                        throw th;
                                    } catch (Throwable th3) {
                                        th = th3;
                                    }
                                }
                            }
                        }

                        @Override // X.InterfaceC1526220poq
                        public final List<C0WYV> LIZLLL(String str, String str2, long j, EnumC1525890poJ enumC1525890poJ, int i) throws Throwable {
                            int iLIZIZ;
                            int iLIZIZ2;
                            int iLIZIZ3;
                            int iLIZIZ4;
                            int iLIZIZ5;
                            int iLIZIZ6;
                            int iLIZIZ7;
                            int iLIZIZ8;
                            int iLIZIZ9;
                            int iLIZIZ10;
                            int iLIZIZ11;
                            int iLIZIZ12;
                            int iLIZIZ13;
                            int iLIZIZ14;
                            String string;
                            C0VN5 c0vn5LIZLLL = C0VN5.LIZLLL(5, "SELECT * FROM t_history_synclog  WHERE did=? AND uid in (0, ?) AND business =?  AND topic_type = ? ORDER BY publish_ts DESC  LIMIT ?");
                            if (str == null) {
                                c0vn5LIZLLL.LLD(1);
                            } else {
                                c0vn5LIZLLL.LJIILIIL(1, str);
                            }
                            if (str2 == null) {
                                c0vn5LIZLLL.LLD(2);
                            } else {
                                c0vn5LIZLLL.LJIILIIL(2, str2);
                            }
                            c0vn5LIZLLL.LJIJ(3, j);
                            c0vn5LIZLLL.LJIJ(4, C825040WYc.LIZ(enumC1525890poJ));
                            c0vn5LIZLLL.LJIJ(5, i);
                            this.LIZ.assertNotSuspendingTransaction();
                            Cursor cursorLIZIZ = C0VN0.LIZIZ(this.LIZ, c0vn5LIZLLL, false);
                            try {
                                iLIZIZ = C795450VIh.LIZIZ(cursorLIZIZ, "sync_id");
                                iLIZIZ2 = C795450VIh.LIZIZ(cursorLIZIZ, "did");
                                iLIZIZ3 = C795450VIh.LIZIZ(cursorLIZIZ, "uid");
                                iLIZIZ4 = C795450VIh.LIZIZ(cursorLIZIZ, "sync_cursor");
                                iLIZIZ5 = C795450VIh.LIZIZ(cursorLIZIZ, "data");
                                iLIZIZ6 = C795450VIh.LIZIZ(cursorLIZIZ, "md5");
                                iLIZIZ7 = C795450VIh.LIZIZ(cursorLIZIZ, "business");
                                iLIZIZ8 = C795450VIh.LIZIZ(cursorLIZIZ, "consume_type");
                                iLIZIZ9 = C795450VIh.LIZIZ(cursorLIZIZ, "data_type");
                                iLIZIZ10 = C795450VIh.LIZIZ(cursorLIZIZ, "publish_ts");
                                iLIZIZ11 = C795450VIh.LIZIZ(cursorLIZIZ, "receive_ts");
                                iLIZIZ12 = C795450VIh.LIZIZ(cursorLIZIZ, "bucket");
                                iLIZIZ13 = C795450VIh.LIZIZ(cursorLIZIZ, "req_id");
                                iLIZIZ14 = C795450VIh.LIZIZ(cursorLIZIZ, "topic_type");
                            } catch (Throwable th) {
                                th = th;
                            }
                            try {
                                int iLIZIZ15 = C795450VIh.LIZIZ(cursorLIZIZ, "packet_status");
                                int iLIZIZ16 = C795450VIh.LIZIZ(cursorLIZIZ, "expire_ts");
                                int iLIZIZ17 = C795450VIh.LIZIZ(cursorLIZIZ, "packet_ctrl");
                                int iLIZIZ18 = C795450VIh.LIZIZ(cursorLIZIZ, "extra");
                                ArrayList arrayList = new ArrayList(cursorLIZIZ.getCount());
                                while (cursorLIZIZ.moveToNext()) {
                                    C0WYV c0wyv = new C0WYV();
                                    if (cursorLIZIZ.isNull(iLIZIZ)) {
                                        c0wyv.LIZ = null;
                                    } else {
                                        c0wyv.LIZ = cursorLIZIZ.getString(iLIZIZ);
                                    }
                                    if (cursorLIZIZ.isNull(iLIZIZ2)) {
                                        c0wyv.LIZIZ = null;
                                    } else {
                                        c0wyv.LIZIZ = cursorLIZIZ.getString(iLIZIZ2);
                                    }
                                    if (cursorLIZIZ.isNull(iLIZIZ3)) {
                                        c0wyv.LIZJ = null;
                                    } else {
                                        c0wyv.LIZJ = cursorLIZIZ.getString(iLIZIZ3);
                                    }
                                    c0wyv.LIZLLL = cursorLIZIZ.getLong(iLIZIZ4);
                                    if (cursorLIZIZ.isNull(iLIZIZ5)) {
                                        c0wyv.LJ = null;
                                    } else {
                                        c0wyv.LJ = cursorLIZIZ.getBlob(iLIZIZ5);
                                    }
                                    if (cursorLIZIZ.isNull(iLIZIZ6)) {
                                        c0wyv.LJFF = null;
                                    } else {
                                        c0wyv.LJFF = cursorLIZIZ.getString(iLIZIZ6);
                                    }
                                    c0wyv.LJI = cursorLIZIZ.getLong(iLIZIZ7);
                                    c0wyv.LJII = C825060WYe.LIZ(cursorLIZIZ.getInt(iLIZIZ8));
                                    c0wyv.LJIIIIZZ = C825050WYd.LIZ(cursorLIZIZ.getInt(iLIZIZ9));
                                    c0wyv.LJIIIZ = cursorLIZIZ.getLong(iLIZIZ10);
                                    c0wyv.LJIIJ = cursorLIZIZ.getLong(iLIZIZ11);
                                    c0wyv.LJIIJJI = C825030WYb.LIZIZ(cursorLIZIZ.getInt(iLIZIZ12));
                                    if (cursorLIZIZ.isNull(iLIZIZ13)) {
                                        c0wyv.LJIIL = null;
                                    } else {
                                        c0wyv.LJIIL = cursorLIZIZ.getString(iLIZIZ13);
                                    }
                                    c0wyv.LJIILIIL = C825040WYc.LIZIZ(cursorLIZIZ.getInt(iLIZIZ14));
                                    EnumC1527270pqX enumC1527270pqXFromValue = EnumC1527270pqX.fromValue(cursorLIZIZ.getInt(iLIZIZ15));
                                    if (enumC1527270pqXFromValue == null) {
                                        enumC1527270pqXFromValue = EnumC1527270pqX.Full;
                                    }
                                    c0wyv.LJIILJJIL = enumC1527270pqXFromValue;
                                    c0wyv.LJIILL = cursorLIZIZ.getLong(iLIZIZ16);
                                    EnumC1527260pqW enumC1527260pqWFromValue = EnumC1527260pqW.fromValue(cursorLIZIZ.getInt(iLIZIZ17));
                                    if (enumC1527260pqWFromValue == null) {
                                        enumC1527260pqWFromValue = EnumC1527260pqW.Noop;
                                    }
                                    c0wyv.LJIILLIIL = enumC1527260pqWFromValue;
                                    if (cursorLIZIZ.isNull(iLIZIZ18)) {
                                        string = null;
                                    } else {
                                        string = cursorLIZIZ.getString(iLIZIZ18);
                                    }
                                    c0wyv.LJIIZILJ = C092400Wk.LIZ(string);
                                    arrayList.add(c0wyv);
                                }
                                cursorLIZIZ.close();
                                c0vn5LIZLLL.release();
                                return arrayList;
                            } catch (Throwable th2) {
                                th = th2;
                                while (true) {
                                    try {
                                        TryCatchGuardChecker.doCheck(th);
                                        cursorLIZIZ.close();
                                        c0vn5LIZLLL.release();
                                        throw th;
                                    } catch (Throwable th3) {
                                        th = th3;
                                    }
                                }
                            }
                        }

                        @Override // X.InterfaceC1526220poq
                        public final List<C0WYV> LJ(String str, String str2, long j, EnumC1525890poJ enumC1525890poJ, String str3, int i) throws Throwable {
                            String string;
                            C0VN5 c0vn5LIZLLL = C0VN5.LIZLLL(6, "SELECT * FROM t_history_synclog  WHERE did=? AND uid in (0, ?) AND business =?  AND topic_type = ? AND req_id = ? ORDER BY sync_cursor DESC LIMIT ?");
                            if (str == null) {
                                c0vn5LIZLLL.LLD(1);
                            } else {
                                c0vn5LIZLLL.LJIILIIL(1, str);
                            }
                            if (str2 == null) {
                                c0vn5LIZLLL.LLD(2);
                            } else {
                                c0vn5LIZLLL.LJIILIIL(2, str2);
                            }
                            c0vn5LIZLLL.LJIJ(3, j);
                            c0vn5LIZLLL.LJIJ(4, C825040WYc.LIZ(enumC1525890poJ));
                            if (str3 == null) {
                                c0vn5LIZLLL.LLD(5);
                            } else {
                                c0vn5LIZLLL.LJIILIIL(5, str3);
                            }
                            c0vn5LIZLLL.LJIJ(6, i);
                            this.LIZ.assertNotSuspendingTransaction();
                            Cursor cursorLIZIZ = C0VN0.LIZIZ(this.LIZ, c0vn5LIZLLL, false);
                            try {
                                int iLIZIZ = C795450VIh.LIZIZ(cursorLIZIZ, "sync_id");
                                int iLIZIZ2 = C795450VIh.LIZIZ(cursorLIZIZ, "did");
                                int iLIZIZ3 = C795450VIh.LIZIZ(cursorLIZIZ, "uid");
                                int iLIZIZ4 = C795450VIh.LIZIZ(cursorLIZIZ, "sync_cursor");
                                int iLIZIZ5 = C795450VIh.LIZIZ(cursorLIZIZ, "data");
                                int iLIZIZ6 = C795450VIh.LIZIZ(cursorLIZIZ, "md5");
                                int iLIZIZ7 = C795450VIh.LIZIZ(cursorLIZIZ, "business");
                                int iLIZIZ8 = C795450VIh.LIZIZ(cursorLIZIZ, "consume_type");
                                int iLIZIZ9 = C795450VIh.LIZIZ(cursorLIZIZ, "data_type");
                                int iLIZIZ10 = C795450VIh.LIZIZ(cursorLIZIZ, "publish_ts");
                                int iLIZIZ11 = C795450VIh.LIZIZ(cursorLIZIZ, "receive_ts");
                                int iLIZIZ12 = C795450VIh.LIZIZ(cursorLIZIZ, "bucket");
                                int iLIZIZ13 = C795450VIh.LIZIZ(cursorLIZIZ, "req_id");
                                int iLIZIZ14 = C795450VIh.LIZIZ(cursorLIZIZ, "topic_type");
                                try {
                                    int iLIZIZ15 = C795450VIh.LIZIZ(cursorLIZIZ, "packet_status");
                                    int iLIZIZ16 = C795450VIh.LIZIZ(cursorLIZIZ, "expire_ts");
                                    int iLIZIZ17 = C795450VIh.LIZIZ(cursorLIZIZ, "packet_ctrl");
                                    int iLIZIZ18 = C795450VIh.LIZIZ(cursorLIZIZ, "extra");
                                    ArrayList arrayList = new ArrayList(cursorLIZIZ.getCount());
                                    while (cursorLIZIZ.moveToNext()) {
                                        C0WYV c0wyv = new C0WYV();
                                        if (cursorLIZIZ.isNull(iLIZIZ)) {
                                            c0wyv.LIZ = null;
                                        } else {
                                            c0wyv.LIZ = cursorLIZIZ.getString(iLIZIZ);
                                        }
                                        if (cursorLIZIZ.isNull(iLIZIZ2)) {
                                            c0wyv.LIZIZ = null;
                                        } else {
                                            c0wyv.LIZIZ = cursorLIZIZ.getString(iLIZIZ2);
                                        }
                                        if (cursorLIZIZ.isNull(iLIZIZ3)) {
                                            c0wyv.LIZJ = null;
                                        } else {
                                            c0wyv.LIZJ = cursorLIZIZ.getString(iLIZIZ3);
                                        }
                                        c0wyv.LIZLLL = cursorLIZIZ.getLong(iLIZIZ4);
                                        if (cursorLIZIZ.isNull(iLIZIZ5)) {
                                            c0wyv.LJ = null;
                                        } else {
                                            c0wyv.LJ = cursorLIZIZ.getBlob(iLIZIZ5);
                                        }
                                        if (cursorLIZIZ.isNull(iLIZIZ6)) {
                                            c0wyv.LJFF = null;
                                        } else {
                                            c0wyv.LJFF = cursorLIZIZ.getString(iLIZIZ6);
                                        }
                                        c0wyv.LJI = cursorLIZIZ.getLong(iLIZIZ7);
                                        c0wyv.LJII = C825060WYe.LIZ(cursorLIZIZ.getInt(iLIZIZ8));
                                        c0wyv.LJIIIIZZ = C825050WYd.LIZ(cursorLIZIZ.getInt(iLIZIZ9));
                                        c0wyv.LJIIIZ = cursorLIZIZ.getLong(iLIZIZ10);
                                        c0wyv.LJIIJ = cursorLIZIZ.getLong(iLIZIZ11);
                                        c0wyv.LJIIJJI = C825030WYb.LIZIZ(cursorLIZIZ.getInt(iLIZIZ12));
                                        if (cursorLIZIZ.isNull(iLIZIZ13)) {
                                            c0wyv.LJIIL = null;
                                        } else {
                                            c0wyv.LJIIL = cursorLIZIZ.getString(iLIZIZ13);
                                        }
                                        c0wyv.LJIILIIL = C825040WYc.LIZIZ(cursorLIZIZ.getInt(iLIZIZ14));
                                        EnumC1527270pqX enumC1527270pqXFromValue = EnumC1527270pqX.fromValue(cursorLIZIZ.getInt(iLIZIZ15));
                                        if (enumC1527270pqXFromValue == null) {
                                            enumC1527270pqXFromValue = EnumC1527270pqX.Full;
                                        }
                                        c0wyv.LJIILJJIL = enumC1527270pqXFromValue;
                                        c0wyv.LJIILL = cursorLIZIZ.getLong(iLIZIZ16);
                                        EnumC1527260pqW enumC1527260pqWFromValue = EnumC1527260pqW.fromValue(cursorLIZIZ.getInt(iLIZIZ17));
                                        if (enumC1527260pqWFromValue == null) {
                                            enumC1527260pqWFromValue = EnumC1527260pqW.Noop;
                                        }
                                        c0wyv.LJIILLIIL = enumC1527260pqWFromValue;
                                        if (cursorLIZIZ.isNull(iLIZIZ18)) {
                                            string = null;
                                        } else {
                                            string = cursorLIZIZ.getString(iLIZIZ18);
                                        }
                                        c0wyv.LJIIZILJ = C092400Wk.LIZ(string);
                                        arrayList.add(c0wyv);
                                    }
                                    cursorLIZIZ.close();
                                    c0vn5LIZLLL.release();
                                    return arrayList;
                                } catch (Throwable th) {
                                    th = th;
                                    while (true) {
                                        try {
                                            TryCatchGuardChecker.doCheck(th);
                                            cursorLIZIZ.close();
                                            c0vn5LIZLLL.release();
                                            throw th;
                                        } catch (Throwable th2) {
                                            th = th2;
                                        }
                                    }
                                }
                            } catch (Throwable th3) {
                                th = th3;
                            }
                        }
                    };
                }
                c0wyt = this.LLILZ;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return c0wyt;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.0WYS] */
    @Override // com.bytedance.sync.v4.presistence.AppDatabaseV4
    public final InterfaceC1527640pr8 LIZJ() {
        C0WYS c0wys;
        if (this.LLILLJJLI != null) {
            return this.LLILLJJLI;
        }
        synchronized (this) {
            try {
                if (this.LLILLJJLI == null) {
                    this.LLILLJJLI = new InterfaceC1527640pr8(this) { // from class: X.0WYS
                        public final AbstractC796540VMm LIZ;
                        public final C0WYU LIZIZ;
                        public final C0WYX LIZJ;
                        public final C825020WYa LIZLLL;
                        public final C0W35 LJ;
                        public final C0W36 LJFF;
                        public final C0W37 LJI;

                        /* JADX WARN: Type inference failed for: r0v0, types: [X.0WYU] */
                        /* JADX WARN: Type inference failed for: r0v1, types: [X.0WYX] */
                        /* JADX WARN: Type inference failed for: r0v2, types: [X.0WYa] */
                        /* JADX WARN: Type inference failed for: r0v3, types: [X.0W35] */
                        /* JADX WARN: Type inference failed for: r0v4, types: [X.0W36] */
                        /* JADX WARN: Type inference failed for: r0v5, types: [X.0W37] */
                        {
                            this.LIZ = this;
                            this.LIZIZ = new AbstractC796330VLr<C0WYW>(this) { // from class: X.0WYU
                                @Override // X.AbstractC795470VIj
                                public final String createQuery() {
                                    return "INSERT OR REPLACE INTO `t_synclog` (`sync_id`,`did`,`uid`,`sync_cursor`,`data`,`md5`,`business`,`consume_type`,`data_type`,`publish_ts`,`receive_ts`,`bucket`,`req_id`,`topic_type`,`packet_status`,`expire_ts`,`packet_ctrl`,`extra`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
                                }

                                @Override // X.AbstractC796330VLr
                                public final void bind(InterfaceC796340VLs interfaceC796340VLs, C0WYW c0wyw) {
                                    int value;
                                    int value2;
                                    int value3;
                                    C0WYW c0wyw2 = c0wyw;
                                    String str = c0wyw2.LIZ;
                                    if (str == null) {
                                        interfaceC796340VLs.LLD(1);
                                    } else {
                                        interfaceC796340VLs.LJIILIIL(1, str);
                                    }
                                    String str2 = c0wyw2.LIZIZ;
                                    if (str2 == null) {
                                        interfaceC796340VLs.LLD(2);
                                    } else {
                                        interfaceC796340VLs.LJIILIIL(2, str2);
                                    }
                                    String str3 = c0wyw2.LIZJ;
                                    if (str3 == null) {
                                        interfaceC796340VLs.LLD(3);
                                    } else {
                                        interfaceC796340VLs.LJIILIIL(3, str3);
                                    }
                                    interfaceC796340VLs.LJIJ(4, c0wyw2.LIZLLL);
                                    byte[] bArr = c0wyw2.LJ;
                                    if (bArr == null) {
                                        interfaceC796340VLs.LLD(5);
                                    } else {
                                        interfaceC796340VLs.LJJIIJZLJL(5, bArr);
                                    }
                                    String str4 = c0wyw2.LJFF;
                                    if (str4 == null) {
                                        interfaceC796340VLs.LLD(6);
                                    } else {
                                        interfaceC796340VLs.LJIILIIL(6, str4);
                                    }
                                    interfaceC796340VLs.LJIJ(7, c0wyw2.LJI);
                                    interfaceC796340VLs.LJIJ(8, c0wyw2.LJII.getValue());
                                    EnumC825070WYf enumC825070WYf = c0wyw2.LJIIIIZZ;
                                    if (enumC825070WYf == null) {
                                        value = EnumC825070WYf.ORIGIN.getValue();
                                    } else {
                                        value = enumC825070WYf.getValue();
                                    }
                                    interfaceC796340VLs.LJIJ(9, value);
                                    interfaceC796340VLs.LJIJ(10, c0wyw2.LJIIIZ);
                                    interfaceC796340VLs.LJIJ(11, c0wyw2.LJIIJ);
                                    interfaceC796340VLs.LJIJ(12, C825030WYb.LIZ(c0wyw2.LJIIJJI));
                                    String str5 = c0wyw2.LJIIL;
                                    if (str5 == null) {
                                        interfaceC796340VLs.LLD(13);
                                    } else {
                                        interfaceC796340VLs.LJIILIIL(13, str5);
                                    }
                                    interfaceC796340VLs.LJIJ(14, C825040WYc.LIZ(c0wyw2.LJIILIIL));
                                    EnumC1527270pqX enumC1527270pqX = c0wyw2.LJIILJJIL;
                                    if (enumC1527270pqX == null) {
                                        value2 = EnumC1527270pqX.Full.getValue();
                                    } else {
                                        value2 = enumC1527270pqX.getValue();
                                    }
                                    interfaceC796340VLs.LJIJ(15, value2);
                                    interfaceC796340VLs.LJIJ(16, c0wyw2.LJIILL);
                                    EnumC1527260pqW enumC1527260pqW = c0wyw2.LJIILLIIL;
                                    if (enumC1527260pqW == null) {
                                        value3 = EnumC1527260pqW.Noop.getValue();
                                    } else {
                                        value3 = enumC1527260pqW.getValue();
                                    }
                                    interfaceC796340VLs.LJIJ(17, value3);
                                    Map<String, String> map = c0wyw2.LJIIZILJ;
                                    String strJ3 = "";
                                    if (map != null) {
                                        try {
                                            strJ3 = C786410Ut5.J3(new JSONObject(map));
                                        } catch (Exception e) {
                                            TryCatchGuardChecker.doCheck(e);
                                        }
                                    }
                                    if (strJ3 == null) {
                                        interfaceC796340VLs.LLD(18);
                                    } else {
                                        interfaceC796340VLs.LJIILIIL(18, strJ3);
                                    }
                                }
                            };
                            this.LIZJ = new AbstractC796330VLr<C0WYY>(this) { // from class: X.0WYX
                                @Override // X.AbstractC795470VIj
                                public final String createQuery() {
                                    return "INSERT OR REPLACE INTO `t_snapshot` (`sync_id`,`business`,`uid`,`did`,`cursor`,`data`,`notified`,`bucket`,`data_type`,`publish_ts`,`receive_ts`,`consume_type`,`patch_cnt`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)";
                                }

                                @Override // X.AbstractC796330VLr
                                public final void bind(InterfaceC796340VLs interfaceC796340VLs, C0WYY c0wyy) {
                                    int value;
                                    C0WYY c0wyy2 = c0wyy;
                                    String str = c0wyy2.LIZ;
                                    if (str == null) {
                                        interfaceC796340VLs.LLD(1);
                                    } else {
                                        interfaceC796340VLs.LJIILIIL(1, str);
                                    }
                                    interfaceC796340VLs.LJIJ(2, c0wyy2.LIZIZ);
                                    String str2 = c0wyy2.LIZJ;
                                    if (str2 == null) {
                                        interfaceC796340VLs.LLD(3);
                                    } else {
                                        interfaceC796340VLs.LJIILIIL(3, str2);
                                    }
                                    String str3 = c0wyy2.LIZLLL;
                                    if (str3 == null) {
                                        interfaceC796340VLs.LLD(4);
                                    } else {
                                        interfaceC796340VLs.LJIILIIL(4, str3);
                                    }
                                    interfaceC796340VLs.LJIJ(5, c0wyy2.LJ);
                                    byte[] bArr = c0wyy2.LJFF;
                                    if (bArr == null) {
                                        interfaceC796340VLs.LLD(6);
                                    } else {
                                        interfaceC796340VLs.LJJIIJZLJL(6, bArr);
                                    }
                                    interfaceC796340VLs.LJIJ(7, c0wyy2.LJI);
                                    interfaceC796340VLs.LJIJ(8, C825030WYb.LIZ(c0wyy2.LJII));
                                    EnumC825070WYf enumC825070WYf = c0wyy2.LJIIIIZZ;
                                    if (enumC825070WYf == null) {
                                        value = EnumC825070WYf.ORIGIN.getValue();
                                    } else {
                                        value = enumC825070WYf.getValue();
                                    }
                                    interfaceC796340VLs.LJIJ(9, value);
                                    interfaceC796340VLs.LJIJ(10, c0wyy2.LJIIIZ);
                                    interfaceC796340VLs.LJIJ(11, c0wyy2.LJIIJ);
                                    interfaceC796340VLs.LJIJ(12, c0wyy2.LJIIJJI.getValue());
                                    interfaceC796340VLs.LJIJ(13, c0wyy2.LJIIL);
                                }
                            };
                            this.LIZLLL = new AbstractC796320VLq<C0WYW>(this) { // from class: X.0WYa
                                @Override // X.AbstractC796320VLq, X.AbstractC795470VIj
                                public final String createQuery() {
                                    return "DELETE FROM `t_synclog` WHERE `sync_id` = ? AND `sync_cursor` = ?";
                                }

                                @Override // X.AbstractC796320VLq
                                public final void bind(InterfaceC796340VLs interfaceC796340VLs, C0WYW c0wyw) {
                                    C0WYW c0wyw2 = c0wyw;
                                    String str = c0wyw2.LIZ;
                                    if (str == null) {
                                        interfaceC796340VLs.LLD(1);
                                    } else {
                                        interfaceC796340VLs.LJIILIIL(1, str);
                                    }
                                    interfaceC796340VLs.LJIJ(2, c0wyw2.LIZLLL);
                                }
                            };
                            this.LJ = new AbstractC795470VIj(this) { // from class: X.0W35
                                @Override // X.AbstractC795470VIj
                                public final String createQuery() {
                                    return "DELETE FROM t_synclog WHERE sync_id = ?";
                                }
                            };
                            this.LJFF = new AbstractC795470VIj(this) { // from class: X.0W36
                                @Override // X.AbstractC795470VIj
                                public final String createQuery() {
                                    return "DELETE FROM t_snapshot WHERE sync_id = ?";
                                }
                            };
                            this.LJI = new AbstractC795470VIj(this) { // from class: X.0W37
                                @Override // X.AbstractC795470VIj
                                public final String createQuery() {
                                    return "DELETE FROM t_synclog WHERE expire_ts < ?";
                                }
                            };
                        }

                        @Override // X.InterfaceC1527640pr8
                        public final long LIZJ(C0WYY c0wyy) {
                            this.LIZ.assertNotSuspendingTransaction();
                            this.LIZ.beginTransaction();
                            try {
                                long jInsertAndReturnId = insertAndReturnId(c0wyy);
                                this.LIZ.setTransactionSuccessful();
                                this.LIZ.endTransaction();
                                return jInsertAndReturnId;
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                this.LIZ.endTransaction();
                                throw th;
                            }
                        }

                        @Override // X.InterfaceC1527640pr8
                        public final void LIZLLL(ArrayList<C0WYW> arrayList) {
                            this.LIZ.assertNotSuspendingTransaction();
                            this.LIZ.beginTransaction();
                            try {
                                insert((Iterable) arrayList);
                                this.LIZ.setTransactionSuccessful();
                                this.LIZ.endTransaction();
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                this.LIZ.endTransaction();
                                throw th;
                            }
                        }

                        @Override // X.InterfaceC1527640pr8
                        public final void LJFF(String str) {
                            this.LIZ.assertNotSuspendingTransaction();
                            InterfaceC796340VLs interfaceC796340VLsAcquire = acquire();
                            if (str == null) {
                                interfaceC796340VLsAcquire.LLD(1);
                            } else {
                                interfaceC796340VLsAcquire.LJIILIIL(1, str);
                            }
                            this.LIZ.beginTransaction();
                            try {
                                interfaceC796340VLsAcquire.LJIIL();
                                this.LIZ.setTransactionSuccessful();
                                this.LIZ.endTransaction();
                                release(interfaceC796340VLsAcquire);
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                this.LIZ.endTransaction();
                                release(interfaceC796340VLsAcquire);
                                throw th;
                            }
                        }

                        @Override // X.InterfaceC1527640pr8
                        public final int LJI(List<? extends C0WYW> list) {
                            this.LIZ.assertNotSuspendingTransaction();
                            this.LIZ.beginTransaction();
                            try {
                                int iHandleMultiple = handleMultiple(list);
                                this.LIZ.setTransactionSuccessful();
                                this.LIZ.endTransaction();
                                return iHandleMultiple;
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                this.LIZ.endTransaction();
                                throw th;
                            }
                        }

                        @Override // X.InterfaceC1527640pr8
                        public final void LJII(String str) {
                            this.LIZ.assertNotSuspendingTransaction();
                            InterfaceC796340VLs interfaceC796340VLsAcquire = acquire();
                            if (str == null) {
                                interfaceC796340VLsAcquire.LLD(1);
                            } else {
                                interfaceC796340VLsAcquire.LJIILIIL(1, str);
                            }
                            this.LIZ.beginTransaction();
                            try {
                                interfaceC796340VLsAcquire.LJIIL();
                                this.LIZ.setTransactionSuccessful();
                                this.LIZ.endTransaction();
                                release(interfaceC796340VLsAcquire);
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                this.LIZ.endTransaction();
                                release(interfaceC796340VLsAcquire);
                                throw th;
                            }
                        }

                        @Override // X.InterfaceC1527640pr8
                        public final void LJIIJJI(C0WYY c0wyy) {
                            this.LIZ.assertNotSuspendingTransaction();
                            this.LIZ.beginTransaction();
                            try {
                                insert(c0wyy);
                                this.LIZ.setTransactionSuccessful();
                                this.LIZ.endTransaction();
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                this.LIZ.endTransaction();
                                throw th;
                            }
                        }

                        @Override // X.InterfaceC1527640pr8
                        public final void LJIILIIL(long j) {
                            this.LIZ.assertNotSuspendingTransaction();
                            InterfaceC796340VLs interfaceC796340VLsAcquire = acquire();
                            interfaceC796340VLsAcquire.LJIJ(1, j);
                            this.LIZ.beginTransaction();
                            try {
                                interfaceC796340VLsAcquire.LJIIL();
                                this.LIZ.setTransactionSuccessful();
                                this.LIZ.endTransaction();
                                release(interfaceC796340VLsAcquire);
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                this.LIZ.endTransaction();
                                release(interfaceC796340VLsAcquire);
                                throw th;
                            }
                        }

                        @Override // X.InterfaceC1527640pr8
                        public final List<C0WYY> LIZIZ(int i, int i2) throws Throwable {
                            C0VN5 c0vn5LIZLLL = C0VN5.LIZLLL(2, "SELECT * FROM t_snapshot WHERE notified < cursor ORDER BY sync_id,business LIMIT ? offset ?");
                            c0vn5LIZLLL.LJIJ(1, i);
                            c0vn5LIZLLL.LJIJ(2, i2);
                            this.LIZ.assertNotSuspendingTransaction();
                            Cursor cursorLIZIZ = C0VN0.LIZIZ(this.LIZ, c0vn5LIZLLL, false);
                            try {
                                int iLIZIZ = C795450VIh.LIZIZ(cursorLIZIZ, "sync_id");
                                int iLIZIZ2 = C795450VIh.LIZIZ(cursorLIZIZ, "business");
                                int iLIZIZ3 = C795450VIh.LIZIZ(cursorLIZIZ, "uid");
                                int iLIZIZ4 = C795450VIh.LIZIZ(cursorLIZIZ, "did");
                                int iLIZIZ5 = C795450VIh.LIZIZ(cursorLIZIZ, "cursor");
                                int iLIZIZ6 = C795450VIh.LIZIZ(cursorLIZIZ, "data");
                                int iLIZIZ7 = C795450VIh.LIZIZ(cursorLIZIZ, "notified");
                                int iLIZIZ8 = C795450VIh.LIZIZ(cursorLIZIZ, "bucket");
                                int iLIZIZ9 = C795450VIh.LIZIZ(cursorLIZIZ, "data_type");
                                int iLIZIZ10 = C795450VIh.LIZIZ(cursorLIZIZ, "publish_ts");
                                int iLIZIZ11 = C795450VIh.LIZIZ(cursorLIZIZ, "receive_ts");
                                int iLIZIZ12 = C795450VIh.LIZIZ(cursorLIZIZ, "consume_type");
                                int iLIZIZ13 = C795450VIh.LIZIZ(cursorLIZIZ, "patch_cnt");
                                try {
                                    ArrayList arrayList = new ArrayList(cursorLIZIZ.getCount());
                                    while (cursorLIZIZ.moveToNext()) {
                                        C0WYY c0wyy = new C0WYY();
                                        if (cursorLIZIZ.isNull(iLIZIZ)) {
                                            c0wyy.LIZ = null;
                                        } else {
                                            c0wyy.LIZ = cursorLIZIZ.getString(iLIZIZ);
                                        }
                                        c0wyy.LIZIZ = cursorLIZIZ.getLong(iLIZIZ2);
                                        if (cursorLIZIZ.isNull(iLIZIZ3)) {
                                            c0wyy.LIZJ = null;
                                        } else {
                                            c0wyy.LIZJ = cursorLIZIZ.getString(iLIZIZ3);
                                        }
                                        if (cursorLIZIZ.isNull(iLIZIZ4)) {
                                            c0wyy.LIZLLL = null;
                                        } else {
                                            c0wyy.LIZLLL = cursorLIZIZ.getString(iLIZIZ4);
                                        }
                                        c0wyy.LJ = cursorLIZIZ.getLong(iLIZIZ5);
                                        if (cursorLIZIZ.isNull(iLIZIZ6)) {
                                            c0wyy.LJFF = null;
                                        } else {
                                            c0wyy.LJFF = cursorLIZIZ.getBlob(iLIZIZ6);
                                        }
                                        c0wyy.LJI = cursorLIZIZ.getLong(iLIZIZ7);
                                        c0wyy.LJII = C825030WYb.LIZIZ(cursorLIZIZ.getInt(iLIZIZ8));
                                        c0wyy.LJIIIIZZ = C825050WYd.LIZ(cursorLIZIZ.getInt(iLIZIZ9));
                                        c0wyy.LJIIIZ = cursorLIZIZ.getLong(iLIZIZ10);
                                        c0wyy.LJIIJ = cursorLIZIZ.getLong(iLIZIZ11);
                                        c0wyy.LJIIJJI = C825060WYe.LIZ(cursorLIZIZ.getInt(iLIZIZ12));
                                        c0wyy.LJIIL = cursorLIZIZ.getInt(iLIZIZ13);
                                        arrayList.add(c0wyy);
                                    }
                                    cursorLIZIZ.close();
                                    c0vn5LIZLLL.release();
                                    return arrayList;
                                } catch (Throwable th) {
                                    th = th;
                                    while (true) {
                                        try {
                                            TryCatchGuardChecker.doCheck(th);
                                            cursorLIZIZ.close();
                                            c0vn5LIZLLL.release();
                                            throw th;
                                        } catch (Throwable th2) {
                                            th = th2;
                                        }
                                    }
                                }
                            } catch (Throwable th3) {
                                th = th3;
                            }
                        }

                        @Override // X.InterfaceC1527640pr8
                        public final C0WYY LJIIIZ(long j, String str) {
                            C0WYY c0wyy;
                            C0VN5 c0vn5LIZLLL = C0VN5.LIZLLL(2, "SELECT * FROM t_snapshot WHERE sync_id = ? AND business = ? ");
                            if (str == null) {
                                c0vn5LIZLLL.LLD(1);
                            } else {
                                c0vn5LIZLLL.LJIILIIL(1, str);
                            }
                            c0vn5LIZLLL.LJIJ(2, j);
                            this.LIZ.assertNotSuspendingTransaction();
                            Cursor cursorLIZIZ = C0VN0.LIZIZ(this.LIZ, c0vn5LIZLLL, false);
                            try {
                                int iLIZIZ = C795450VIh.LIZIZ(cursorLIZIZ, "sync_id");
                                int iLIZIZ2 = C795450VIh.LIZIZ(cursorLIZIZ, "business");
                                int iLIZIZ3 = C795450VIh.LIZIZ(cursorLIZIZ, "uid");
                                int iLIZIZ4 = C795450VIh.LIZIZ(cursorLIZIZ, "did");
                                int iLIZIZ5 = C795450VIh.LIZIZ(cursorLIZIZ, "cursor");
                                int iLIZIZ6 = C795450VIh.LIZIZ(cursorLIZIZ, "data");
                                int iLIZIZ7 = C795450VIh.LIZIZ(cursorLIZIZ, "notified");
                                int iLIZIZ8 = C795450VIh.LIZIZ(cursorLIZIZ, "bucket");
                                int iLIZIZ9 = C795450VIh.LIZIZ(cursorLIZIZ, "data_type");
                                int iLIZIZ10 = C795450VIh.LIZIZ(cursorLIZIZ, "publish_ts");
                                int iLIZIZ11 = C795450VIh.LIZIZ(cursorLIZIZ, "receive_ts");
                                int iLIZIZ12 = C795450VIh.LIZIZ(cursorLIZIZ, "consume_type");
                                int iLIZIZ13 = C795450VIh.LIZIZ(cursorLIZIZ, "patch_cnt");
                                if (cursorLIZIZ.moveToFirst()) {
                                    c0wyy = new C0WYY();
                                    if (cursorLIZIZ.isNull(iLIZIZ)) {
                                        c0wyy.LIZ = null;
                                    } else {
                                        c0wyy.LIZ = cursorLIZIZ.getString(iLIZIZ);
                                    }
                                    c0wyy.LIZIZ = cursorLIZIZ.getLong(iLIZIZ2);
                                    if (cursorLIZIZ.isNull(iLIZIZ3)) {
                                        c0wyy.LIZJ = null;
                                    } else {
                                        c0wyy.LIZJ = cursorLIZIZ.getString(iLIZIZ3);
                                    }
                                    if (cursorLIZIZ.isNull(iLIZIZ4)) {
                                        c0wyy.LIZLLL = null;
                                    } else {
                                        c0wyy.LIZLLL = cursorLIZIZ.getString(iLIZIZ4);
                                    }
                                    c0wyy.LJ = cursorLIZIZ.getLong(iLIZIZ5);
                                    if (cursorLIZIZ.isNull(iLIZIZ6)) {
                                        c0wyy.LJFF = null;
                                    } else {
                                        c0wyy.LJFF = cursorLIZIZ.getBlob(iLIZIZ6);
                                    }
                                    c0wyy.LJI = cursorLIZIZ.getLong(iLIZIZ7);
                                    c0wyy.LJII = C825030WYb.LIZIZ(cursorLIZIZ.getInt(iLIZIZ8));
                                    c0wyy.LJIIIIZZ = C825050WYd.LIZ(cursorLIZIZ.getInt(iLIZIZ9));
                                    c0wyy.LJIIIZ = cursorLIZIZ.getLong(iLIZIZ10);
                                    c0wyy.LJIIJ = cursorLIZIZ.getLong(iLIZIZ11);
                                    c0wyy.LJIIJJI = C825060WYe.LIZ(cursorLIZIZ.getInt(iLIZIZ12));
                                    c0wyy.LJIIL = cursorLIZIZ.getInt(iLIZIZ13);
                                } else {
                                    c0wyy = null;
                                }
                                cursorLIZIZ.close();
                                c0vn5LIZLLL.release();
                                return c0wyy;
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                cursorLIZIZ.close();
                                c0vn5LIZLLL.release();
                                throw th;
                            }
                        }

                        @Override // X.InterfaceC1527640pr8
                        public final List<C0WYW> LIZ(long j, int i, EnumC1527610pr5 enumC1527610pr5, int i2, long j2) throws Throwable {
                            String string;
                            C0VN5 c0vn5LIZLLL = C0VN5.LIZLLL(5, "SELECT * FROM t_synclog WHERE business = ? AND consume_type = ? AND expire_ts >= ? ORDER BY sync_cursor ASC limit ? offset ?");
                            c0vn5LIZLLL.LJIJ(1, j);
                            c0vn5LIZLLL.LJIJ(2, enumC1527610pr5.getValue());
                            c0vn5LIZLLL.LJIJ(3, j2);
                            c0vn5LIZLLL.LJIJ(4, i);
                            c0vn5LIZLLL.LJIJ(5, i2);
                            this.LIZ.assertNotSuspendingTransaction();
                            Cursor cursorLIZIZ = C0VN0.LIZIZ(this.LIZ, c0vn5LIZLLL, false);
                            try {
                                int iLIZIZ = C795450VIh.LIZIZ(cursorLIZIZ, "sync_id");
                                int iLIZIZ2 = C795450VIh.LIZIZ(cursorLIZIZ, "did");
                                int iLIZIZ3 = C795450VIh.LIZIZ(cursorLIZIZ, "uid");
                                int iLIZIZ4 = C795450VIh.LIZIZ(cursorLIZIZ, "sync_cursor");
                                int iLIZIZ5 = C795450VIh.LIZIZ(cursorLIZIZ, "data");
                                int iLIZIZ6 = C795450VIh.LIZIZ(cursorLIZIZ, "md5");
                                int iLIZIZ7 = C795450VIh.LIZIZ(cursorLIZIZ, "business");
                                int iLIZIZ8 = C795450VIh.LIZIZ(cursorLIZIZ, "consume_type");
                                int iLIZIZ9 = C795450VIh.LIZIZ(cursorLIZIZ, "data_type");
                                int iLIZIZ10 = C795450VIh.LIZIZ(cursorLIZIZ, "publish_ts");
                                int iLIZIZ11 = C795450VIh.LIZIZ(cursorLIZIZ, "receive_ts");
                                int iLIZIZ12 = C795450VIh.LIZIZ(cursorLIZIZ, "bucket");
                                int iLIZIZ13 = C795450VIh.LIZIZ(cursorLIZIZ, "req_id");
                                int iLIZIZ14 = C795450VIh.LIZIZ(cursorLIZIZ, "topic_type");
                                try {
                                    int iLIZIZ15 = C795450VIh.LIZIZ(cursorLIZIZ, "packet_status");
                                    int iLIZIZ16 = C795450VIh.LIZIZ(cursorLIZIZ, "expire_ts");
                                    int iLIZIZ17 = C795450VIh.LIZIZ(cursorLIZIZ, "packet_ctrl");
                                    int iLIZIZ18 = C795450VIh.LIZIZ(cursorLIZIZ, "extra");
                                    ArrayList arrayList = new ArrayList(cursorLIZIZ.getCount());
                                    while (cursorLIZIZ.moveToNext()) {
                                        C0WYW c0wyw = new C0WYW();
                                        if (cursorLIZIZ.isNull(iLIZIZ)) {
                                            c0wyw.LIZ = null;
                                        } else {
                                            c0wyw.LIZ = cursorLIZIZ.getString(iLIZIZ);
                                        }
                                        if (cursorLIZIZ.isNull(iLIZIZ2)) {
                                            c0wyw.LIZIZ = null;
                                        } else {
                                            c0wyw.LIZIZ = cursorLIZIZ.getString(iLIZIZ2);
                                        }
                                        if (cursorLIZIZ.isNull(iLIZIZ3)) {
                                            c0wyw.LIZJ = null;
                                        } else {
                                            c0wyw.LIZJ = cursorLIZIZ.getString(iLIZIZ3);
                                        }
                                        c0wyw.LIZLLL = cursorLIZIZ.getLong(iLIZIZ4);
                                        if (cursorLIZIZ.isNull(iLIZIZ5)) {
                                            c0wyw.LJ = null;
                                        } else {
                                            c0wyw.LJ = cursorLIZIZ.getBlob(iLIZIZ5);
                                        }
                                        if (cursorLIZIZ.isNull(iLIZIZ6)) {
                                            c0wyw.LJFF = null;
                                        } else {
                                            c0wyw.LJFF = cursorLIZIZ.getString(iLIZIZ6);
                                        }
                                        c0wyw.LJI = cursorLIZIZ.getLong(iLIZIZ7);
                                        c0wyw.LJII = C825060WYe.LIZ(cursorLIZIZ.getInt(iLIZIZ8));
                                        c0wyw.LJIIIIZZ = C825050WYd.LIZ(cursorLIZIZ.getInt(iLIZIZ9));
                                        c0wyw.LJIIIZ = cursorLIZIZ.getLong(iLIZIZ10);
                                        c0wyw.LJIIJ = cursorLIZIZ.getLong(iLIZIZ11);
                                        c0wyw.LJIIJJI = C825030WYb.LIZIZ(cursorLIZIZ.getInt(iLIZIZ12));
                                        if (cursorLIZIZ.isNull(iLIZIZ13)) {
                                            c0wyw.LJIIL = null;
                                        } else {
                                            c0wyw.LJIIL = cursorLIZIZ.getString(iLIZIZ13);
                                        }
                                        c0wyw.LJIILIIL = C825040WYc.LIZIZ(cursorLIZIZ.getInt(iLIZIZ14));
                                        EnumC1527270pqX enumC1527270pqXFromValue = EnumC1527270pqX.fromValue(cursorLIZIZ.getInt(iLIZIZ15));
                                        if (enumC1527270pqXFromValue == null) {
                                            enumC1527270pqXFromValue = EnumC1527270pqX.Full;
                                        }
                                        c0wyw.LJIILJJIL = enumC1527270pqXFromValue;
                                        c0wyw.LJIILL = cursorLIZIZ.getLong(iLIZIZ16);
                                        EnumC1527260pqW enumC1527260pqWFromValue = EnumC1527260pqW.fromValue(cursorLIZIZ.getInt(iLIZIZ17));
                                        if (enumC1527260pqWFromValue == null) {
                                            enumC1527260pqWFromValue = EnumC1527260pqW.Noop;
                                        }
                                        c0wyw.LJIILLIIL = enumC1527260pqWFromValue;
                                        if (cursorLIZIZ.isNull(iLIZIZ18)) {
                                            string = null;
                                        } else {
                                            string = cursorLIZIZ.getString(iLIZIZ18);
                                        }
                                        c0wyw.LJIIZILJ = C092400Wk.LIZ(string);
                                        arrayList.add(c0wyw);
                                    }
                                    cursorLIZIZ.close();
                                    c0vn5LIZLLL.release();
                                    return arrayList;
                                } catch (Throwable th) {
                                    th = th;
                                    while (true) {
                                        try {
                                            TryCatchGuardChecker.doCheck(th);
                                            cursorLIZIZ.close();
                                            c0vn5LIZLLL.release();
                                            throw th;
                                        } catch (Throwable th2) {
                                            th = th2;
                                        }
                                    }
                                }
                            } catch (Throwable th3) {
                                th = th3;
                            }
                        }

                        @Override // X.InterfaceC1527640pr8
                        public final List<C0WYW> LJ(Set<Long> set, EnumC1527270pqX enumC1527270pqX, int i, int i2, long j) throws Throwable {
                            int value;
                            String string;
                            StringBuilder sb = new StringBuilder();
                            sb.append("SELECT * FROM t_synclog WHERE sync_id in (");
                            int size = set.size();
                            C0VIY.LIZ(sb, size);
                            sb.append(") AND packet_status =? AND expire_ts >= (?) ORDER BY sync_id, business, sync_cursor ASC LIMIT ? offset ?");
                            int i3 = size + 4;
                            C0VN5 c0vn5LIZLLL = C0VN5.LIZLLL(i3, sb.toString());
                            int i4 = 1;
                            for (Long l : set) {
                                if (l == null) {
                                    c0vn5LIZLLL.LLD(i4);
                                } else {
                                    c0vn5LIZLLL.LJIJ(i4, l.longValue());
                                }
                                i4++;
                            }
                            int i5 = size + 1;
                            if (enumC1527270pqX == null) {
                                value = EnumC1527270pqX.Full.getValue();
                            } else {
                                value = enumC1527270pqX.getValue();
                            }
                            c0vn5LIZLLL.LJIJ(i5, value);
                            c0vn5LIZLLL.LJIJ(size + 2, j);
                            c0vn5LIZLLL.LJIJ(size + 3, i);
                            c0vn5LIZLLL.LJIJ(i3, i2);
                            this.LIZ.assertNotSuspendingTransaction();
                            Cursor cursorLIZIZ = C0VN0.LIZIZ(this.LIZ, c0vn5LIZLLL, false);
                            try {
                                int iLIZIZ = C795450VIh.LIZIZ(cursorLIZIZ, "sync_id");
                                int iLIZIZ2 = C795450VIh.LIZIZ(cursorLIZIZ, "did");
                                int iLIZIZ3 = C795450VIh.LIZIZ(cursorLIZIZ, "uid");
                                int iLIZIZ4 = C795450VIh.LIZIZ(cursorLIZIZ, "sync_cursor");
                                int iLIZIZ5 = C795450VIh.LIZIZ(cursorLIZIZ, "data");
                                int iLIZIZ6 = C795450VIh.LIZIZ(cursorLIZIZ, "md5");
                                int iLIZIZ7 = C795450VIh.LIZIZ(cursorLIZIZ, "business");
                                int iLIZIZ8 = C795450VIh.LIZIZ(cursorLIZIZ, "consume_type");
                                int iLIZIZ9 = C795450VIh.LIZIZ(cursorLIZIZ, "data_type");
                                int iLIZIZ10 = C795450VIh.LIZIZ(cursorLIZIZ, "publish_ts");
                                int iLIZIZ11 = C795450VIh.LIZIZ(cursorLIZIZ, "receive_ts");
                                int iLIZIZ12 = C795450VIh.LIZIZ(cursorLIZIZ, "bucket");
                                int iLIZIZ13 = C795450VIh.LIZIZ(cursorLIZIZ, "req_id");
                                int iLIZIZ14 = C795450VIh.LIZIZ(cursorLIZIZ, "topic_type");
                                try {
                                    int iLIZIZ15 = C795450VIh.LIZIZ(cursorLIZIZ, "packet_status");
                                    int iLIZIZ16 = C795450VIh.LIZIZ(cursorLIZIZ, "expire_ts");
                                    int iLIZIZ17 = C795450VIh.LIZIZ(cursorLIZIZ, "packet_ctrl");
                                    int iLIZIZ18 = C795450VIh.LIZIZ(cursorLIZIZ, "extra");
                                    ArrayList arrayList = new ArrayList(cursorLIZIZ.getCount());
                                    while (cursorLIZIZ.moveToNext()) {
                                        C0WYW c0wyw = new C0WYW();
                                        if (cursorLIZIZ.isNull(iLIZIZ)) {
                                            c0wyw.LIZ = null;
                                        } else {
                                            c0wyw.LIZ = cursorLIZIZ.getString(iLIZIZ);
                                        }
                                        if (cursorLIZIZ.isNull(iLIZIZ2)) {
                                            c0wyw.LIZIZ = null;
                                        } else {
                                            c0wyw.LIZIZ = cursorLIZIZ.getString(iLIZIZ2);
                                        }
                                        if (cursorLIZIZ.isNull(iLIZIZ3)) {
                                            c0wyw.LIZJ = null;
                                        } else {
                                            c0wyw.LIZJ = cursorLIZIZ.getString(iLIZIZ3);
                                        }
                                        c0wyw.LIZLLL = cursorLIZIZ.getLong(iLIZIZ4);
                                        if (cursorLIZIZ.isNull(iLIZIZ5)) {
                                            c0wyw.LJ = null;
                                        } else {
                                            c0wyw.LJ = cursorLIZIZ.getBlob(iLIZIZ5);
                                        }
                                        if (cursorLIZIZ.isNull(iLIZIZ6)) {
                                            c0wyw.LJFF = null;
                                        } else {
                                            c0wyw.LJFF = cursorLIZIZ.getString(iLIZIZ6);
                                        }
                                        c0wyw.LJI = cursorLIZIZ.getLong(iLIZIZ7);
                                        c0wyw.LJII = C825060WYe.LIZ(cursorLIZIZ.getInt(iLIZIZ8));
                                        c0wyw.LJIIIIZZ = C825050WYd.LIZ(cursorLIZIZ.getInt(iLIZIZ9));
                                        c0wyw.LJIIIZ = cursorLIZIZ.getLong(iLIZIZ10);
                                        c0wyw.LJIIJ = cursorLIZIZ.getLong(iLIZIZ11);
                                        c0wyw.LJIIJJI = C825030WYb.LIZIZ(cursorLIZIZ.getInt(iLIZIZ12));
                                        if (cursorLIZIZ.isNull(iLIZIZ13)) {
                                            c0wyw.LJIIL = null;
                                        } else {
                                            c0wyw.LJIIL = cursorLIZIZ.getString(iLIZIZ13);
                                        }
                                        c0wyw.LJIILIIL = C825040WYc.LIZIZ(cursorLIZIZ.getInt(iLIZIZ14));
                                        EnumC1527270pqX enumC1527270pqXFromValue = EnumC1527270pqX.fromValue(cursorLIZIZ.getInt(iLIZIZ15));
                                        if (enumC1527270pqXFromValue == null) {
                                            enumC1527270pqXFromValue = EnumC1527270pqX.Full;
                                        }
                                        c0wyw.LJIILJJIL = enumC1527270pqXFromValue;
                                        c0wyw.LJIILL = cursorLIZIZ.getLong(iLIZIZ16);
                                        EnumC1527260pqW enumC1527260pqWFromValue = EnumC1527260pqW.fromValue(cursorLIZIZ.getInt(iLIZIZ17));
                                        if (enumC1527260pqWFromValue == null) {
                                            enumC1527260pqWFromValue = EnumC1527260pqW.Noop;
                                        }
                                        c0wyw.LJIILLIIL = enumC1527260pqWFromValue;
                                        if (cursorLIZIZ.isNull(iLIZIZ18)) {
                                            string = null;
                                        } else {
                                            string = cursorLIZIZ.getString(iLIZIZ18);
                                        }
                                        c0wyw.LJIIZILJ = C092400Wk.LIZ(string);
                                        arrayList.add(c0wyw);
                                    }
                                    cursorLIZIZ.close();
                                    c0vn5LIZLLL.release();
                                    return arrayList;
                                } catch (Throwable th) {
                                    th = th;
                                    while (true) {
                                        try {
                                            TryCatchGuardChecker.doCheck(th);
                                            cursorLIZIZ.close();
                                            c0vn5LIZLLL.release();
                                            throw th;
                                        } catch (Throwable th2) {
                                            th = th2;
                                        }
                                    }
                                }
                            } catch (Throwable th3) {
                                th = th3;
                            }
                        }
                    };
                }
                c0wys = this.LLILLJJLI;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return c0wys;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.0VcK] */
    @Override // com.bytedance.sync.v4.presistence.AppDatabaseV4
    public final InterfaceC1527720prG LJFF() {
        C801500VcK c801500VcK;
        if (this.LLILLL != null) {
            return this.LLILLL;
        }
        synchronized (this) {
            try {
                if (this.LLILLL == null) {
                    this.LLILLL = new InterfaceC1527720prG(this) { // from class: X.0VcK
                        public final AbstractC796540VMm LIZ;
                        public final C854570Xfj LIZIZ;
                        public final C854570Xfj LIZJ;
                        public final C801530VcN LIZLLL;
                        public final C801510VcL LJ;
                        public final C854550Xfh LJFF;
                        public final C854550Xfh LJI;

                        @Override // X.InterfaceC1527720prG
                        public final void LJ() {
                            this.LIZ.assertNotSuspendingTransaction();
                            InterfaceC796340VLs interfaceC796340VLsAcquire = this.LJFF.acquire();
                            this.LIZ.beginTransaction();
                            try {
                                interfaceC796340VLsAcquire.LJIIL();
                                this.LIZ.setTransactionSuccessful();
                                this.LIZ.endTransaction();
                                this.LJFF.release(interfaceC796340VLsAcquire);
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                this.LIZ.endTransaction();
                                this.LJFF.release(interfaceC796340VLsAcquire);
                                throw th;
                            }
                        }

                        /* JADX WARN: Type inference failed for: r0v2, types: [X.0VcN] */
                        /* JADX WARN: Type inference failed for: r0v3, types: [X.0VcL] */
                        {
                            this.LIZ = this;
                            this.LIZIZ = new C854570Xfj(this, 31);
                            this.LIZJ = new C854570Xfj(this, 32);
                            this.LIZLLL = new AbstractC796320VLq<C801520VcM>(this) { // from class: X.0VcN
                                @Override // X.AbstractC796320VLq, X.AbstractC795470VIj
                                public final String createQuery() {
                                    return "DELETE FROM `t_report_synclog` WHERE `id` = ?";
                                }

                                @Override // X.AbstractC796320VLq
                                public final void bind(InterfaceC796340VLs interfaceC796340VLs, C801520VcM c801520VcM) {
                                    interfaceC796340VLs.LJIJ(1, c801520VcM.LIZ);
                                }
                            };
                            this.LJ = new AbstractC796320VLq<C801520VcM>(this) { // from class: X.0VcL
                                @Override // X.AbstractC796320VLq, X.AbstractC795470VIj
                                public final String createQuery() {
                                    return "UPDATE OR REPLACE `t_report_synclog` SET `id` = ?,`sync_id` = ?,`business` = ?,`did` = ?,`uid` = ?,`bucket` = ?,`cursor` = ?,`data` = ?,`md5` = ?,`msg_id` = ? WHERE `id` = ?";
                                }

                                @Override // X.AbstractC796320VLq
                                public final void bind(InterfaceC796340VLs interfaceC796340VLs, C801520VcM c801520VcM) {
                                    C801520VcM c801520VcM2 = c801520VcM;
                                    interfaceC796340VLs.LJIJ(1, c801520VcM2.LIZ);
                                    String str = c801520VcM2.LIZIZ;
                                    if (str == null) {
                                        interfaceC796340VLs.LLD(2);
                                    } else {
                                        interfaceC796340VLs.LJIILIIL(2, str);
                                    }
                                    interfaceC796340VLs.LJIJ(3, c801520VcM2.LIZJ);
                                    String str2 = c801520VcM2.LIZLLL;
                                    if (str2 == null) {
                                        interfaceC796340VLs.LLD(4);
                                    } else {
                                        interfaceC796340VLs.LJIILIIL(4, str2);
                                    }
                                    String str3 = c801520VcM2.LJ;
                                    if (str3 == null) {
                                        interfaceC796340VLs.LLD(5);
                                    } else {
                                        interfaceC796340VLs.LJIILIIL(5, str3);
                                    }
                                    interfaceC796340VLs.LJIJ(6, C825030WYb.LIZ(c801520VcM2.LJFF));
                                    interfaceC796340VLs.LJIJ(7, c801520VcM2.LJI);
                                    byte[] bArr = c801520VcM2.LJII;
                                    if (bArr == null) {
                                        interfaceC796340VLs.LLD(8);
                                    } else {
                                        interfaceC796340VLs.LJJIIJZLJL(8, bArr);
                                    }
                                    String str4 = c801520VcM2.LJIIIIZZ;
                                    if (str4 == null) {
                                        interfaceC796340VLs.LLD(9);
                                    } else {
                                        interfaceC796340VLs.LJIILIIL(9, str4);
                                    }
                                    String str5 = c801520VcM2.LJIIIZ;
                                    if (str5 == null) {
                                        interfaceC796340VLs.LLD(10);
                                    } else {
                                        interfaceC796340VLs.LJIILIIL(10, str5);
                                    }
                                    interfaceC796340VLs.LJIJ(11, c801520VcM2.LIZ);
                                }
                            };
                            this.LJFF = new C854550Xfh(this, 73);
                            this.LJI = new C854550Xfh(this, 74);
                        }

                        @Override // X.InterfaceC1527720prG
                        public final void LIZ(List<? extends C801520VcM> list) {
                            this.LIZ.assertNotSuspendingTransaction();
                            this.LIZ.beginTransaction();
                            try {
                                this.LIZJ.insert((Iterable) list);
                                this.LIZ.setTransactionSuccessful();
                                this.LIZ.endTransaction();
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                this.LIZ.endTransaction();
                                throw th;
                            }
                        }

                        @Override // X.InterfaceC1527720prG
                        public final int LIZIZ(List<? extends C801520VcM> list) {
                            this.LIZ.assertNotSuspendingTransaction();
                            this.LIZ.beginTransaction();
                            try {
                                int iHandleMultiple = handleMultiple(list);
                                this.LIZ.setTransactionSuccessful();
                                this.LIZ.endTransaction();
                                return iHandleMultiple;
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                this.LIZ.endTransaction();
                                throw th;
                            }
                        }

                        @Override // X.InterfaceC1527720prG
                        public final int LJI(List<? extends C801520VcM> list) {
                            this.LIZ.assertNotSuspendingTransaction();
                            this.LIZ.beginTransaction();
                            try {
                                int iHandleMultiple = handleMultiple(list);
                                this.LIZ.setTransactionSuccessful();
                                this.LIZ.endTransaction();
                                return iHandleMultiple;
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                this.LIZ.endTransaction();
                                throw th;
                            }
                        }

                        @Override // X.InterfaceC1527720prG
                        public final long LJIIIIZZ(C801520VcM c801520VcM) {
                            this.LIZ.assertNotSuspendingTransaction();
                            this.LIZ.beginTransaction();
                            try {
                                long jInsertAndReturnId = this.LIZIZ.insertAndReturnId(c801520VcM);
                                this.LIZ.setTransactionSuccessful();
                                this.LIZ.endTransaction();
                                return jInsertAndReturnId;
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                this.LIZ.endTransaction();
                                throw th;
                            }
                        }

                        @Override // X.InterfaceC1527720prG
                        public final void LIZJ(long j, long j2) {
                            this.LIZ.assertNotSuspendingTransaction();
                            InterfaceC796340VLs interfaceC796340VLsAcquire = this.LJI.acquire();
                            interfaceC796340VLsAcquire.LJIJ(1, j);
                            interfaceC796340VLsAcquire.LJIJ(2, j2);
                            this.LIZ.beginTransaction();
                            try {
                                interfaceC796340VLsAcquire.LJIIL();
                                this.LIZ.setTransactionSuccessful();
                                this.LIZ.endTransaction();
                                this.LJI.release(interfaceC796340VLsAcquire);
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                this.LIZ.endTransaction();
                                this.LJI.release(interfaceC796340VLsAcquire);
                                throw th;
                            }
                        }

                        @Override // X.InterfaceC1527720prG
                        public final List LIZLLL(int i, String str) throws Throwable {
                            C0VN5 c0vn5LIZLLL = C0VN5.LIZLLL(2, "SELECT * FROM t_report_synclog WHERE cursor > 0 and sync_id=? ORDER BY cursor ASC LIMIT ?");
                            if (str == null) {
                                c0vn5LIZLLL.LLD(1);
                            } else {
                                c0vn5LIZLLL.LJIILIIL(1, str);
                            }
                            c0vn5LIZLLL.LJIJ(2, i);
                            this.LIZ.assertNotSuspendingTransaction();
                            Cursor cursorLIZIZ = C0VN0.LIZIZ(this.LIZ, c0vn5LIZLLL, false);
                            try {
                                try {
                                    int iLIZIZ = C795450VIh.LIZIZ(cursorLIZIZ, FollowStatusChangeMethod.PARAM_UID);
                                    int iLIZIZ2 = C795450VIh.LIZIZ(cursorLIZIZ, "sync_id");
                                    int iLIZIZ3 = C795450VIh.LIZIZ(cursorLIZIZ, "business");
                                    int iLIZIZ4 = C795450VIh.LIZIZ(cursorLIZIZ, "did");
                                    int iLIZIZ5 = C795450VIh.LIZIZ(cursorLIZIZ, "uid");
                                    int iLIZIZ6 = C795450VIh.LIZIZ(cursorLIZIZ, "bucket");
                                    int iLIZIZ7 = C795450VIh.LIZIZ(cursorLIZIZ, "cursor");
                                    int iLIZIZ8 = C795450VIh.LIZIZ(cursorLIZIZ, "data");
                                    int iLIZIZ9 = C795450VIh.LIZIZ(cursorLIZIZ, "md5");
                                    int iLIZIZ10 = C795450VIh.LIZIZ(cursorLIZIZ, "msg_id");
                                    ArrayList arrayList = new ArrayList(cursorLIZIZ.getCount());
                                    while (cursorLIZIZ.moveToNext()) {
                                        C801520VcM c801520VcM = new C801520VcM();
                                        c801520VcM.LIZ = cursorLIZIZ.getLong(iLIZIZ);
                                        if (cursorLIZIZ.isNull(iLIZIZ2)) {
                                            c801520VcM.LIZIZ = null;
                                        } else {
                                            c801520VcM.LIZIZ = cursorLIZIZ.getString(iLIZIZ2);
                                        }
                                        c801520VcM.LIZJ = cursorLIZIZ.getLong(iLIZIZ3);
                                        if (cursorLIZIZ.isNull(iLIZIZ4)) {
                                            c801520VcM.LIZLLL = null;
                                        } else {
                                            c801520VcM.LIZLLL = cursorLIZIZ.getString(iLIZIZ4);
                                        }
                                        if (cursorLIZIZ.isNull(iLIZIZ5)) {
                                            c801520VcM.LJ = null;
                                        } else {
                                            c801520VcM.LJ = cursorLIZIZ.getString(iLIZIZ5);
                                        }
                                        c801520VcM.LJFF = C825030WYb.LIZIZ(cursorLIZIZ.getInt(iLIZIZ6));
                                        c801520VcM.LJI = cursorLIZIZ.getLong(iLIZIZ7);
                                        if (cursorLIZIZ.isNull(iLIZIZ8)) {
                                            c801520VcM.LJII = null;
                                        } else {
                                            c801520VcM.LJII = cursorLIZIZ.getBlob(iLIZIZ8);
                                        }
                                        if (cursorLIZIZ.isNull(iLIZIZ9)) {
                                            c801520VcM.LJIIIIZZ = null;
                                        } else {
                                            c801520VcM.LJIIIIZZ = cursorLIZIZ.getString(iLIZIZ9);
                                        }
                                        if (cursorLIZIZ.isNull(iLIZIZ10)) {
                                            c801520VcM.LJIIIZ = null;
                                        } else {
                                            c801520VcM.LJIIIZ = cursorLIZIZ.getString(iLIZIZ10);
                                        }
                                        arrayList.add(c801520VcM);
                                    }
                                    cursorLIZIZ.close();
                                    c0vn5LIZLLL.release();
                                    return arrayList;
                                } catch (Throwable th) {
                                    th = th;
                                    TryCatchGuardChecker.doCheck(th);
                                    cursorLIZIZ.close();
                                    c0vn5LIZLLL.release();
                                    throw th;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                TryCatchGuardChecker.doCheck(th);
                                cursorLIZIZ.close();
                                c0vn5LIZLLL.release();
                                throw th;
                            }
                        }

                        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:? -> B:40:0x010c). Please report as a decompilation issue!!! */
                        @Override // X.InterfaceC1527720prG
                        public final List<C801520VcM> LJFF(EnumC1527250pqV enumC1527250pqV, String str, int i) throws Throwable {
                            C0VN5 c0vn5LIZLLL = C0VN5.LIZLLL(3, "SELECT * FROM t_report_synclog WHERE cursor <= 0 and did = ? and business in (SELECT distinct id from t_business where bucket=?) ORDER BY id ASC LIMIT ?");
                            if (str == null) {
                                c0vn5LIZLLL.LLD(1);
                            } else {
                                c0vn5LIZLLL.LJIILIIL(1, str);
                            }
                            c0vn5LIZLLL.LJIJ(2, C825030WYb.LIZ(enumC1527250pqV));
                            c0vn5LIZLLL.LJIJ(3, i);
                            this.LIZ.assertNotSuspendingTransaction();
                            Cursor cursorLIZIZ = C0VN0.LIZIZ(this.LIZ, c0vn5LIZLLL, false);
                            try {
                                int iLIZIZ = C795450VIh.LIZIZ(cursorLIZIZ, FollowStatusChangeMethod.PARAM_UID);
                                int iLIZIZ2 = C795450VIh.LIZIZ(cursorLIZIZ, "sync_id");
                                int iLIZIZ3 = C795450VIh.LIZIZ(cursorLIZIZ, "business");
                                int iLIZIZ4 = C795450VIh.LIZIZ(cursorLIZIZ, "did");
                                int iLIZIZ5 = C795450VIh.LIZIZ(cursorLIZIZ, "uid");
                                int iLIZIZ6 = C795450VIh.LIZIZ(cursorLIZIZ, "bucket");
                                int iLIZIZ7 = C795450VIh.LIZIZ(cursorLIZIZ, "cursor");
                                int iLIZIZ8 = C795450VIh.LIZIZ(cursorLIZIZ, "data");
                                int iLIZIZ9 = C795450VIh.LIZIZ(cursorLIZIZ, "md5");
                                int iLIZIZ10 = C795450VIh.LIZIZ(cursorLIZIZ, "msg_id");
                                ArrayList arrayList = new ArrayList(cursorLIZIZ.getCount());
                                while (cursorLIZIZ.moveToNext()) {
                                    C801520VcM c801520VcM = new C801520VcM();
                                    try {
                                        c801520VcM.LIZ = cursorLIZIZ.getLong(iLIZIZ);
                                        if (cursorLIZIZ.isNull(iLIZIZ2)) {
                                            c801520VcM.LIZIZ = null;
                                        } else {
                                            c801520VcM.LIZIZ = cursorLIZIZ.getString(iLIZIZ2);
                                        }
                                        c801520VcM.LIZJ = cursorLIZIZ.getLong(iLIZIZ3);
                                        if (cursorLIZIZ.isNull(iLIZIZ4)) {
                                            c801520VcM.LIZLLL = null;
                                        } else {
                                            c801520VcM.LIZLLL = cursorLIZIZ.getString(iLIZIZ4);
                                        }
                                        if (cursorLIZIZ.isNull(iLIZIZ5)) {
                                            c801520VcM.LJ = null;
                                        } else {
                                            c801520VcM.LJ = cursorLIZIZ.getString(iLIZIZ5);
                                        }
                                        c801520VcM.LJFF = C825030WYb.LIZIZ(cursorLIZIZ.getInt(iLIZIZ6));
                                        c801520VcM.LJI = cursorLIZIZ.getLong(iLIZIZ7);
                                        if (cursorLIZIZ.isNull(iLIZIZ8)) {
                                            c801520VcM.LJII = null;
                                        } else {
                                            c801520VcM.LJII = cursorLIZIZ.getBlob(iLIZIZ8);
                                        }
                                        if (cursorLIZIZ.isNull(iLIZIZ9)) {
                                            c801520VcM.LJIIIIZZ = null;
                                        } else {
                                            c801520VcM.LJIIIIZZ = cursorLIZIZ.getString(iLIZIZ9);
                                        }
                                        if (cursorLIZIZ.isNull(iLIZIZ10)) {
                                            c801520VcM.LJIIIZ = null;
                                        } else {
                                            c801520VcM.LJIIIZ = cursorLIZIZ.getString(iLIZIZ10);
                                        }
                                        arrayList.add(c801520VcM);
                                    } catch (Throwable th) {
                                        th = th;
                                        TryCatchGuardChecker.doCheck(th);
                                        cursorLIZIZ.close();
                                        c0vn5LIZLLL.release();
                                        throw th;
                                    }
                                }
                                cursorLIZIZ.close();
                                c0vn5LIZLLL.release();
                                return arrayList;
                            } catch (Throwable th2) {
                                th = th2;
                                TryCatchGuardChecker.doCheck(th);
                                cursorLIZIZ.close();
                                c0vn5LIZLLL.release();
                                throw th;
                            }
                        }

                        @Override // X.InterfaceC1527720prG
                        public final List<C801520VcM> LJII(EnumC1527250pqV enumC1527250pqV, String str, String str2, int i) {
                            C0VN5 c0vn5LIZLLL = C0VN5.LIZLLL(4, "SELECT * FROM t_report_synclog WHERE cursor <= 0 and did = ? and uid = ? and business in (SELECT distinct id from t_business where bucket=?) ORDER BY id ASC LIMIT ?");
                            if (str == null) {
                                c0vn5LIZLLL.LLD(1);
                            } else {
                                c0vn5LIZLLL.LJIILIIL(1, str);
                            }
                            if (str2 == null) {
                                c0vn5LIZLLL.LLD(2);
                            } else {
                                c0vn5LIZLLL.LJIILIIL(2, str2);
                            }
                            c0vn5LIZLLL.LJIJ(3, C825030WYb.LIZ(enumC1527250pqV));
                            c0vn5LIZLLL.LJIJ(4, i);
                            this.LIZ.assertNotSuspendingTransaction();
                            Cursor cursorLIZIZ = C0VN0.LIZIZ(this.LIZ, c0vn5LIZLLL, false);
                            try {
                                int iLIZIZ = C795450VIh.LIZIZ(cursorLIZIZ, FollowStatusChangeMethod.PARAM_UID);
                                int iLIZIZ2 = C795450VIh.LIZIZ(cursorLIZIZ, "sync_id");
                                int iLIZIZ3 = C795450VIh.LIZIZ(cursorLIZIZ, "business");
                                int iLIZIZ4 = C795450VIh.LIZIZ(cursorLIZIZ, "did");
                                int iLIZIZ5 = C795450VIh.LIZIZ(cursorLIZIZ, "uid");
                                int iLIZIZ6 = C795450VIh.LIZIZ(cursorLIZIZ, "bucket");
                                int iLIZIZ7 = C795450VIh.LIZIZ(cursorLIZIZ, "cursor");
                                int iLIZIZ8 = C795450VIh.LIZIZ(cursorLIZIZ, "data");
                                int iLIZIZ9 = C795450VIh.LIZIZ(cursorLIZIZ, "md5");
                                int iLIZIZ10 = C795450VIh.LIZIZ(cursorLIZIZ, "msg_id");
                                ArrayList arrayList = new ArrayList(cursorLIZIZ.getCount());
                                while (cursorLIZIZ.moveToNext()) {
                                    C801520VcM c801520VcM = new C801520VcM();
                                    c801520VcM.LIZ = cursorLIZIZ.getLong(iLIZIZ);
                                    if (cursorLIZIZ.isNull(iLIZIZ2)) {
                                        c801520VcM.LIZIZ = null;
                                    } else {
                                        c801520VcM.LIZIZ = cursorLIZIZ.getString(iLIZIZ2);
                                    }
                                    c801520VcM.LIZJ = cursorLIZIZ.getLong(iLIZIZ3);
                                    if (cursorLIZIZ.isNull(iLIZIZ4)) {
                                        c801520VcM.LIZLLL = null;
                                    } else {
                                        c801520VcM.LIZLLL = cursorLIZIZ.getString(iLIZIZ4);
                                    }
                                    if (cursorLIZIZ.isNull(iLIZIZ5)) {
                                        c801520VcM.LJ = null;
                                    } else {
                                        c801520VcM.LJ = cursorLIZIZ.getString(iLIZIZ5);
                                    }
                                    c801520VcM.LJFF = C825030WYb.LIZIZ(cursorLIZIZ.getInt(iLIZIZ6));
                                    c801520VcM.LJI = cursorLIZIZ.getLong(iLIZIZ7);
                                    if (cursorLIZIZ.isNull(iLIZIZ8)) {
                                        c801520VcM.LJII = null;
                                    } else {
                                        c801520VcM.LJII = cursorLIZIZ.getBlob(iLIZIZ8);
                                    }
                                    if (cursorLIZIZ.isNull(iLIZIZ9)) {
                                        c801520VcM.LJIIIIZZ = null;
                                    } else {
                                        c801520VcM.LJIIIIZZ = cursorLIZIZ.getString(iLIZIZ9);
                                    }
                                    if (cursorLIZIZ.isNull(iLIZIZ10)) {
                                        c801520VcM.LJIIIZ = null;
                                    } else {
                                        c801520VcM.LJIIIZ = cursorLIZIZ.getString(iLIZIZ10);
                                    }
                                    arrayList.add(c801520VcM);
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
                    };
                }
                c801500VcK = this.LLILLL;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return c801500VcK;
    }

    @Override // X.AbstractC796540VMm
    public final void clearAllTables() {
        super.assertNotMainThread();
        C0VLF c0vlfLJLJJI = this.mOpenHelper.LJLJJI();
        try {
            super.beginTransaction();
            c0vlfLJLJJI.LJIILJJIL("DELETE FROM `t_business`");
            c0vlfLJLJJI.LJIILJJIL("DELETE FROM `t_report_synclog`");
            c0vlfLJLJJI.LJIILJJIL("DELETE FROM `t_sync_cursor`");
            c0vlfLJLJJI.LJIILJJIL("DELETE FROM `t_synclog`");
            c0vlfLJLJJI.LJIILJJIL("DELETE FROM `t_snapshot`");
            c0vlfLJLJJI.LJIILJJIL("DELETE FROM `t_history_synclog`");
            super.setTransactionSuccessful();
            super.endTransaction();
            c0vlfLJLJJI.query("PRAGMA wal_checkpoint(FULL)").close();
            if (c0vlfLJLJJI.LJJIJIIJI()) {
                return;
            }
            c0vlfLJLJJI.LJIILJJIL("VACUUM");
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            super.endTransaction();
            c0vlfLJLJJI.query("PRAGMA wal_checkpoint(FULL)").close();
            if (!c0vlfLJLJJI.LJJIJIIJI()) {
                c0vlfLJLJJI.LJIILJJIL("VACUUM");
            }
            throw th;
        }
    }

    @Override // X.AbstractC796540VMm
    public final C796620VMu createInvalidationTracker() {
        return new C796620VMu(this, new HashMap(0), new HashMap(0), "t_business", "t_report_synclog", "t_sync_cursor", "t_synclog", "t_snapshot", "t_history_synclog");
    }

    @Override // X.AbstractC796540VMm
    public final Set<Class<? extends InterfaceC2275591E5d>> getRequiredAutoMigrationSpecs() {
        return new HashSet();
    }

    @Override // X.AbstractC796540VMm
    public final Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
        HashMap map = new HashMap();
        map.put(InterfaceC1527700prE.class, Collections.emptyList());
        map.put(InterfaceC1527640pr8.class, Collections.emptyList());
        map.put(InterfaceC1527720prG.class, Collections.emptyList());
        map.put(InterfaceC1526220poq.class, Collections.emptyList());
        return map;
    }

    @Override // X.AbstractC796540VMm
    public final InterfaceC796190VLd createOpenHelper(C796520VMk c796520VMk) {
        C0VN2 c0vn2 = new C0VN2(c796520VMk, new C0VN3() { // from class: X.0VN8
            @Override // X.C0VN3
            public final void onPostMigrate(C0VLF c0vlf) {
            }

            {
                super(1);
            }

            @Override // X.C0VN3
            public final void createAllTables(C0VLF c0vlf) {
                c0vlf.LJIILJJIL("CREATE TABLE IF NOT EXISTS `t_business` (`id` INTEGER NOT NULL, `consume_type` INTEGER, `bucket` INTEGER, PRIMARY KEY(`id`))");
                c0vlf.LJIILJJIL("CREATE TABLE IF NOT EXISTS `t_report_synclog` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `sync_id` TEXT, `business` INTEGER NOT NULL, `did` TEXT, `uid` TEXT, `bucket` INTEGER, `cursor` INTEGER NOT NULL, `data` BLOB, `md5` TEXT, `msg_id` TEXT)");
                c0vlf.LJIILJJIL("CREATE TABLE IF NOT EXISTS `t_sync_cursor` (`sync_id` TEXT NOT NULL, `did` TEXT, `uid` TEXT, `topic_type` INTEGER, `bucket` INTEGER, `recv_cursor` INTEGER NOT NULL, `report_cursor` INTEGER NOT NULL, PRIMARY KEY(`sync_id`))");
                c0vlf.LJIILJJIL("CREATE TABLE IF NOT EXISTS `t_synclog` (`sync_id` TEXT NOT NULL, `did` TEXT, `uid` TEXT, `sync_cursor` INTEGER NOT NULL, `data` BLOB, `md5` TEXT, `business` INTEGER NOT NULL, `consume_type` INTEGER, `data_type` INTEGER, `publish_ts` INTEGER NOT NULL, `receive_ts` INTEGER NOT NULL, `bucket` INTEGER, `req_id` TEXT, `topic_type` INTEGER NOT NULL, `packet_status` INTEGER NOT NULL, `expire_ts` INTEGER NOT NULL, `packet_ctrl` INTEGER NOT NULL, `extra` TEXT, PRIMARY KEY(`sync_id`, `sync_cursor`))");
                c0vlf.LJIILJJIL("CREATE TABLE IF NOT EXISTS `t_snapshot` (`sync_id` TEXT NOT NULL, `business` INTEGER NOT NULL, `uid` TEXT, `did` TEXT, `cursor` INTEGER NOT NULL, `data` BLOB, `notified` INTEGER NOT NULL, `bucket` INTEGER, `data_type` INTEGER, `publish_ts` INTEGER NOT NULL, `receive_ts` INTEGER NOT NULL, `consume_type` INTEGER, `patch_cnt` INTEGER NOT NULL, PRIMARY KEY(`sync_id`, `business`))");
                c0vlf.LJIILJJIL("CREATE TABLE IF NOT EXISTS `t_history_synclog` (`sync_id` TEXT NOT NULL, `did` TEXT, `uid` TEXT, `sync_cursor` INTEGER NOT NULL, `data` BLOB, `md5` TEXT, `business` INTEGER NOT NULL, `consume_type` INTEGER, `data_type` INTEGER, `publish_ts` INTEGER NOT NULL, `receive_ts` INTEGER NOT NULL, `bucket` INTEGER, `req_id` TEXT, `topic_type` INTEGER, `packet_status` INTEGER, `expire_ts` INTEGER NOT NULL, `packet_ctrl` INTEGER NOT NULL, `extra` TEXT, PRIMARY KEY(`sync_id`, `sync_cursor`))");
                c0vlf.LJIILJJIL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                c0vlf.LJIILJJIL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '6d03e4e34642405367b0801527728f44')");
            }

            @Override // X.C0VN3
            public final void dropAllTables(C0VLF c0vlf) {
                c0vlf.LJIILJJIL("DROP TABLE IF EXISTS `t_business`");
                c0vlf.LJIILJJIL("DROP TABLE IF EXISTS `t_report_synclog`");
                c0vlf.LJIILJJIL("DROP TABLE IF EXISTS `t_sync_cursor`");
                c0vlf.LJIILJJIL("DROP TABLE IF EXISTS `t_synclog`");
                c0vlf.LJIILJJIL("DROP TABLE IF EXISTS `t_snapshot`");
                c0vlf.LJIILJJIL("DROP TABLE IF EXISTS `t_history_synclog`");
                List<C0VK6> list = this.LIZ.mCallbacks;
                if (list != null) {
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        ListProtector.get(this.LIZ.mCallbacks, i).getClass();
                    }
                }
            }

            @Override // X.C0VN3
            public final void onCreate(C0VLF c0vlf) {
                List<C0VK6> list = this.LIZ.mCallbacks;
                if (list != null) {
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        ListProtector.get(this.LIZ.mCallbacks, i).getClass();
                    }
                }
            }

            @Override // X.C0VN3
            public final void onOpen(C0VLF c0vlf) {
                this.LIZ.mDatabase = c0vlf;
                this.LIZ.internalInitInvalidationTracker(c0vlf);
                List<C0VK6> list = this.LIZ.mCallbacks;
                if (list != null) {
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        ((C0VK6) ListProtector.get(this.LIZ.mCallbacks, i)).LIZ(c0vlf);
                    }
                }
            }

            @Override // X.C0VN3
            public final void onPreMigrate(C0VLF c0vlf) {
                C0VN0.LIZ(c0vlf);
            }

            @Override // X.C0VN3
            public final C0VN4 onValidateSchema(C0VLF c0vlf) {
                HashMap map = new HashMap(3);
                map.put(FollowStatusChangeMethod.PARAM_UID, new C795990VKj(1, 1, FollowStatusChangeMethod.PARAM_UID, "INTEGER", null, true));
                map.put("consume_type", new C795990VKj(0, 1, "consume_type", "INTEGER", null, false));
                map.put("bucket", new C795990VKj(0, 1, "bucket", "INTEGER", null, false));
                C0VN6 c0vn6 = new C0VN6("t_business", map, new HashSet(0), new HashSet(0));
                C0VN6 c0vn6LIZ = C0VN6.LIZ(c0vlf, "t_business");
                if (!c0vn6.equals(c0vn6LIZ)) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("t_business(com.bytedance.sync.v4.presistence.table.Business).\n Expected:\n");
                    sbLIZ.append(c0vn6);
                    sbLIZ.append("\n Found:\n");
                    sbLIZ.append(c0vn6LIZ);
                    return new C0VN4(false, C2188811AlT.LIZIZ(sbLIZ));
                }
                HashMap map2 = new HashMap(10);
                map2.put(FollowStatusChangeMethod.PARAM_UID, new C795990VKj(1, 1, FollowStatusChangeMethod.PARAM_UID, "INTEGER", null, true));
                map2.put("sync_id", new C795990VKj(0, 1, "sync_id", "TEXT", null, false));
                map2.put("business", new C795990VKj(0, 1, "business", "INTEGER", null, true));
                map2.put("did", new C795990VKj(0, 1, "did", "TEXT", null, false));
                map2.put("uid", new C795990VKj(0, 1, "uid", "TEXT", null, false));
                map2.put("bucket", new C795990VKj(0, 1, "bucket", "INTEGER", null, false));
                map2.put("cursor", new C795990VKj(0, 1, "cursor", "INTEGER", null, true));
                map2.put("data", new C795990VKj(0, 1, "data", "BLOB", null, false));
                map2.put("md5", new C795990VKj(0, 1, "md5", "TEXT", null, false));
                map2.put("msg_id", new C795990VKj(0, 1, "msg_id", "TEXT", null, false));
                C0VN6 c0vn62 = new C0VN6("t_report_synclog", map2, new HashSet(0), new HashSet(0));
                C0VN6 c0vn6LIZ2 = C0VN6.LIZ(c0vlf, "t_report_synclog");
                if (!c0vn62.equals(c0vn6LIZ2)) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("t_report_synclog(com.bytedance.sync.v4.presistence.table.UploadItemV4).\n Expected:\n");
                    sbLIZ2.append(c0vn62);
                    sbLIZ2.append("\n Found:\n");
                    sbLIZ2.append(c0vn6LIZ2);
                    return new C0VN4(false, C2188811AlT.LIZIZ(sbLIZ2));
                }
                HashMap map3 = new HashMap(7);
                map3.put("sync_id", new C795990VKj(1, 1, "sync_id", "TEXT", null, true));
                map3.put("did", new C795990VKj(0, 1, "did", "TEXT", null, false));
                map3.put("uid", new C795990VKj(0, 1, "uid", "TEXT", null, false));
                map3.put("topic_type", new C795990VKj(0, 1, "topic_type", "INTEGER", null, false));
                map3.put("bucket", new C795990VKj(0, 1, "bucket", "INTEGER", null, false));
                map3.put("recv_cursor", new C795990VKj(0, 1, "recv_cursor", "INTEGER", null, true));
                map3.put("report_cursor", new C795990VKj(0, 1, "report_cursor", "INTEGER", null, true));
                C0VN6 c0vn63 = new C0VN6("t_sync_cursor", map3, new HashSet(0), new HashSet(0));
                C0VN6 c0vn6LIZ3 = C0VN6.LIZ(c0vlf, "t_sync_cursor");
                if (!c0vn63.equals(c0vn6LIZ3)) {
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("t_sync_cursor(com.bytedance.sync.v4.presistence.table.SyncCursor).\n Expected:\n");
                    sbLIZ3.append(c0vn63);
                    sbLIZ3.append("\n Found:\n");
                    sbLIZ3.append(c0vn6LIZ3);
                    return new C0VN4(false, C2188811AlT.LIZIZ(sbLIZ3));
                }
                HashMap map4 = new HashMap(18);
                map4.put("sync_id", new C795990VKj(1, 1, "sync_id", "TEXT", null, true));
                map4.put("did", new C795990VKj(0, 1, "did", "TEXT", null, false));
                map4.put("uid", new C795990VKj(0, 1, "uid", "TEXT", null, false));
                map4.put("sync_cursor", new C795990VKj(2, 1, "sync_cursor", "INTEGER", null, true));
                map4.put("data", new C795990VKj(0, 1, "data", "BLOB", null, false));
                map4.put("md5", new C795990VKj(0, 1, "md5", "TEXT", null, false));
                map4.put("business", new C795990VKj(0, 1, "business", "INTEGER", null, true));
                map4.put("consume_type", new C795990VKj(0, 1, "consume_type", "INTEGER", null, false));
                map4.put("data_type", new C795990VKj(0, 1, "data_type", "INTEGER", null, false));
                map4.put("publish_ts", new C795990VKj(0, 1, "publish_ts", "INTEGER", null, true));
                map4.put("receive_ts", new C795990VKj(0, 1, "receive_ts", "INTEGER", null, true));
                map4.put("bucket", new C795990VKj(0, 1, "bucket", "INTEGER", null, false));
                map4.put("req_id", new C795990VKj(0, 1, "req_id", "TEXT", null, false));
                map4.put("topic_type", new C795990VKj(0, 1, "topic_type", "INTEGER", null, true));
                map4.put("packet_status", new C795990VKj(0, 1, "packet_status", "INTEGER", null, true));
                map4.put("expire_ts", new C795990VKj(0, 1, "expire_ts", "INTEGER", null, true));
                map4.put("packet_ctrl", new C795990VKj(0, 1, "packet_ctrl", "INTEGER", null, true));
                map4.put("extra", new C795990VKj(0, 1, "extra", "TEXT", null, false));
                C0VN6 c0vn64 = new C0VN6("t_synclog", map4, new HashSet(0), new HashSet(0));
                C0VN6 c0vn6LIZ4 = C0VN6.LIZ(c0vlf, "t_synclog");
                if (!c0vn64.equals(c0vn6LIZ4)) {
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append("t_synclog(com.bytedance.sync.v4.presistence.table.SyncLogV4).\n Expected:\n");
                    sbLIZ4.append(c0vn64);
                    sbLIZ4.append("\n Found:\n");
                    sbLIZ4.append(c0vn6LIZ4);
                    return new C0VN4(false, C2188811AlT.LIZIZ(sbLIZ4));
                }
                HashMap map5 = new HashMap(13);
                map5.put("sync_id", new C795990VKj(1, 1, "sync_id", "TEXT", null, true));
                map5.put("business", new C795990VKj(2, 1, "business", "INTEGER", null, true));
                map5.put("uid", new C795990VKj(0, 1, "uid", "TEXT", null, false));
                map5.put("did", new C795990VKj(0, 1, "did", "TEXT", null, false));
                map5.put("cursor", new C795990VKj(0, 1, "cursor", "INTEGER", null, true));
                map5.put("data", new C795990VKj(0, 1, "data", "BLOB", null, false));
                map5.put("notified", new C795990VKj(0, 1, "notified", "INTEGER", null, true));
                map5.put("bucket", new C795990VKj(0, 1, "bucket", "INTEGER", null, false));
                map5.put("data_type", new C795990VKj(0, 1, "data_type", "INTEGER", null, false));
                map5.put("publish_ts", new C795990VKj(0, 1, "publish_ts", "INTEGER", null, true));
                map5.put("receive_ts", new C795990VKj(0, 1, "receive_ts", "INTEGER", null, true));
                map5.put("consume_type", new C795990VKj(0, 1, "consume_type", "INTEGER", null, false));
                map5.put("patch_cnt", new C795990VKj(0, 1, "patch_cnt", "INTEGER", null, true));
                C0VN6 c0vn65 = new C0VN6("t_snapshot", map5, new HashSet(0), new HashSet(0));
                C0VN6 c0vn6LIZ5 = C0VN6.LIZ(c0vlf, "t_snapshot");
                if (!c0vn65.equals(c0vn6LIZ5)) {
                    StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                    sbLIZ5.append("t_snapshot(com.bytedance.sync.v4.presistence.table.Snapshot).\n Expected:\n");
                    sbLIZ5.append(c0vn65);
                    sbLIZ5.append("\n Found:\n");
                    sbLIZ5.append(c0vn6LIZ5);
                    return new C0VN4(false, C2188811AlT.LIZIZ(sbLIZ5));
                }
                HashMap map6 = new HashMap(18);
                map6.put("sync_id", new C795990VKj(1, 1, "sync_id", "TEXT", null, true));
                map6.put("did", new C795990VKj(0, 1, "did", "TEXT", null, false));
                map6.put("uid", new C795990VKj(0, 1, "uid", "TEXT", null, false));
                map6.put("sync_cursor", new C795990VKj(2, 1, "sync_cursor", "INTEGER", null, true));
                map6.put("data", new C795990VKj(0, 1, "data", "BLOB", null, false));
                map6.put("md5", new C795990VKj(0, 1, "md5", "TEXT", null, false));
                map6.put("business", new C795990VKj(0, 1, "business", "INTEGER", null, true));
                map6.put("consume_type", new C795990VKj(0, 1, "consume_type", "INTEGER", null, false));
                map6.put("data_type", new C795990VKj(0, 1, "data_type", "INTEGER", null, false));
                map6.put("publish_ts", new C795990VKj(0, 1, "publish_ts", "INTEGER", null, true));
                map6.put("receive_ts", new C795990VKj(0, 1, "receive_ts", "INTEGER", null, true));
                map6.put("bucket", new C795990VKj(0, 1, "bucket", "INTEGER", null, false));
                map6.put("req_id", new C795990VKj(0, 1, "req_id", "TEXT", null, false));
                map6.put("topic_type", new C795990VKj(0, 1, "topic_type", "INTEGER", null, false));
                map6.put("packet_status", new C795990VKj(0, 1, "packet_status", "INTEGER", null, false));
                map6.put("expire_ts", new C795990VKj(0, 1, "expire_ts", "INTEGER", null, true));
                map6.put("packet_ctrl", new C795990VKj(0, 1, "packet_ctrl", "INTEGER", null, true));
                map6.put("extra", new C795990VKj(0, 1, "extra", "TEXT", null, false));
                C0VN6 c0vn66 = new C0VN6("t_history_synclog", map6, new HashSet(0), new HashSet(0));
                C0VN6 c0vn6LIZ6 = C0VN6.LIZ(c0vlf, "t_history_synclog");
                if (!c0vn66.equals(c0vn6LIZ6)) {
                    StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                    sbLIZ6.append("t_history_synclog(com.bytedance.sync.v4.presistence.table.SyncHistoryLogV4).\n Expected:\n");
                    sbLIZ6.append(c0vn66);
                    sbLIZ6.append("\n Found:\n");
                    sbLIZ6.append(c0vn6LIZ6);
                    return new C0VN4(false, C2188811AlT.LIZIZ(sbLIZ6));
                }
                return new C0VN4(true, null);
            }
        }, "6d03e4e34642405367b0801527728f44", "3d169a4e9b45d6f96877cb9348070b8e");
        C0VKN c0vkn = new C0VKN(c796520VMk.LIZIZ);
        c0vkn.LIZIZ = c796520VMk.LIZJ;
        c0vkn.LIZJ = c0vn2;
        return c796520VMk.LIZ.LIZ(c0vkn.LIZ());
    }

    @Override // X.AbstractC796540VMm
    public final List<AbstractC796510VMj> getAutoMigrations(Map<Class<? extends InterfaceC2275591E5d>, InterfaceC2275591E5d> map) {
        return Arrays.asList(new AbstractC796510VMj[0]);
    }
}
