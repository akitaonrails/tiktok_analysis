package com.ss.android.ugc.aweme.friendstab.db;

import X.AbstractC796510VMj;
import X.C0VKN;
import X.C0VLF;
import X.C0VN2;
import X.C0VN3;
import X.C0VNA;
import X.C0VNF;
import X.C0VNI;
import X.C0VNL;
import X.C0VNO;
import X.C0VRS;
import X.C796520VMk;
import X.C796620VMu;
import X.InterfaceC2275591E5d;
import X.InterfaceC607930Nst;
import X.InterfaceC796190VLd;
import X.InterfaceC797620VQq;
import X.InterfaceC797800VRi;
import X.InterfaceC797850VRn;
import android.database.Cursor;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes14.dex */
public final class AwemeRecordDatabase_Impl extends AwemeRecordDatabase {
    public volatile C0VNL LLILZLL;
    public volatile C0VNO LLIZ;
    public volatile C0VNI LLIZLLLIL;
    public volatile C0VNF LLJ;
    public volatile C0VNA LLJI;

    /* JADX WARN: Type inference failed for: r0v4, types: [X.0VNL] */
    @Override // com.ss.android.ugc.aweme.friendstab.db.AwemeRecordDatabase
    public final InterfaceC797620VQq LIZ() {
        C0VNL c0vnl;
        if (this.LLILZLL != null) {
            return this.LLILZLL;
        }
        synchronized (this) {
            try {
                if (this.LLILZLL == null) {
                    this.LLILZLL = new InterfaceC797620VQq(this) { // from class: X.0VNL
                        public final AbstractC796540VMm LIZ;
                        public final C0VNR LIZIZ;
                        public final C0VNM LIZJ;
                        public final C0VNN LIZLLL;

                        /* JADX WARN: Type inference failed for: r0v0, types: [X.0VNR] */
                        /* JADX WARN: Type inference failed for: r0v1, types: [X.0VNM] */
                        /* JADX WARN: Type inference failed for: r0v2, types: [X.0VNN] */
                        {
                            this.LIZ = this;
                            this.LIZIZ = new AbstractC796330VLr<C0VNS>(this) { // from class: X.0VNR
                                @Override // X.AbstractC795470VIj
                                public final String createQuery() {
                                    return "INSERT OR REPLACE INTO `AWEME_READ_RECORD` (`AWEME_ID`,`READ_TIME`,`PAGE_TYPE`,`REPORTED`,`USER_ID`,`SCENE`,`INSERT_TIME`,`AWEME_TYPE`) VALUES (?,?,?,?,?,?,?,?)";
                                }

                                @Override // X.AbstractC796330VLr
                                public final void bind(InterfaceC796340VLs interfaceC796340VLs, C0VNS c0vns) {
                                    C0VNS c0vns2 = c0vns;
                                    String str = c0vns2.LIZ;
                                    if (str == null) {
                                        interfaceC796340VLs.LLD(1);
                                    } else {
                                        interfaceC796340VLs.LJIILIIL(1, str);
                                    }
                                    interfaceC796340VLs.LJIJ(2, c0vns2.LIZIZ);
                                    interfaceC796340VLs.LJIJ(3, c0vns2.LIZJ);
                                    interfaceC796340VLs.LJIJ(4, c0vns2.LIZLLL ? 1L : 0L);
                                    String str2 = c0vns2.LJ;
                                    if (str2 == null) {
                                        interfaceC796340VLs.LLD(5);
                                    } else {
                                        interfaceC796340VLs.LJIILIIL(5, str2);
                                    }
                                    interfaceC796340VLs.LJIJ(6, c0vns2.LJFF);
                                    interfaceC796340VLs.LJIJ(7, c0vns2.LJI);
                                    interfaceC796340VLs.LJIJ(8, c0vns2.LJII);
                                }
                            };
                            this.LIZJ = new AbstractC795470VIj(this) { // from class: X.0VNM
                                @Override // X.AbstractC795470VIj
                                public final String createQuery() {
                                    return "DELETE FROM AWEME_READ_RECORD WHERE READ_TIME <= ?";
                                }
                            };
                            this.LIZLLL = new AbstractC795470VIj(this) { // from class: X.0VNN
                                @Override // X.AbstractC795470VIj
                                public final String createQuery() {
                                    return "DELETE FROM AWEME_READ_RECORD WHERE (READ_TIME <= ? AND PAGE_TYPE = 31) OR (READ_TIME <= ? AND PAGE_TYPE = 195) OR (READ_TIME <= ? AND PAGE_TYPE NOT IN (31, 195))";
                                }
                            };
                        }

                        @Override // X.InterfaceC797620VQq
                        public final List<C0VNS> LIZJ(String str) {
                            String string;
                            boolean z;
                            C0VN5 c0vn5LIZLLL = C0VN5.LIZLLL(1, "SELECT * FROM AWEME_READ_RECORD WHERE USER_ID = ? ");
                            if (str == null) {
                                c0vn5LIZLLL.LLD(1);
                            } else {
                                c0vn5LIZLLL.LJIILIIL(1, str);
                            }
                            this.LIZ.assertNotSuspendingTransaction();
                            Cursor cursorLIZIZ = C0VN0.LIZIZ(this.LIZ, c0vn5LIZLLL, false);
                            try {
                                int iLIZIZ = C795450VIh.LIZIZ(cursorLIZIZ, "AWEME_ID");
                                int iLIZIZ2 = C795450VIh.LIZIZ(cursorLIZIZ, "READ_TIME");
                                int iLIZIZ3 = C795450VIh.LIZIZ(cursorLIZIZ, "PAGE_TYPE");
                                int iLIZIZ4 = C795450VIh.LIZIZ(cursorLIZIZ, "REPORTED");
                                int iLIZIZ5 = C795450VIh.LIZIZ(cursorLIZIZ, "USER_ID");
                                int iLIZIZ6 = C795450VIh.LIZIZ(cursorLIZIZ, "SCENE");
                                int iLIZIZ7 = C795450VIh.LIZIZ(cursorLIZIZ, "INSERT_TIME");
                                int iLIZIZ8 = C795450VIh.LIZIZ(cursorLIZIZ, "AWEME_TYPE");
                                ArrayList arrayList = new ArrayList(cursorLIZIZ.getCount());
                                while (cursorLIZIZ.moveToNext()) {
                                    String string2 = null;
                                    if (cursorLIZIZ.isNull(iLIZIZ)) {
                                        string = null;
                                    } else {
                                        string = cursorLIZIZ.getString(iLIZIZ);
                                    }
                                    long j = cursorLIZIZ.getLong(iLIZIZ2);
                                    int i = cursorLIZIZ.getInt(iLIZIZ3);
                                    if (cursorLIZIZ.getInt(iLIZIZ4) != 0) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    if (!cursorLIZIZ.isNull(iLIZIZ5)) {
                                        string2 = cursorLIZIZ.getString(iLIZIZ5);
                                    }
                                    arrayList.add(new C0VNS(j, cursorLIZIZ.getLong(iLIZIZ7), i, z, cursorLIZIZ.getInt(iLIZIZ6), string, cursorLIZIZ.getInt(iLIZIZ8), string2));
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

                        @Override // X.InterfaceC797620VQq
                        public final int LIZLLL(long j) {
                            this.LIZ.assertNotSuspendingTransaction();
                            InterfaceC796340VLs interfaceC796340VLsAcquire = acquire();
                            interfaceC796340VLsAcquire.LJIJ(1, j);
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

                        @Override // X.InterfaceC797620VQq
                        public final void LJIIIZ(List<C0VNS> list) {
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

                        @Override // X.InterfaceC797620VQq
                        public final List LIZ(int i, String str) {
                            String string;
                            boolean z;
                            C0VN5 c0vn5LIZLLL = C0VN5.LIZLLL(2, "SELECT * FROM AWEME_READ_RECORD WHERE PAGE_TYPE != ? AND READ_TIME != 0 AND USER_ID = ? ");
                            c0vn5LIZLLL.LJIJ(1, i);
                            if (str == null) {
                                c0vn5LIZLLL.LLD(2);
                            } else {
                                c0vn5LIZLLL.LJIILIIL(2, str);
                            }
                            this.LIZ.assertNotSuspendingTransaction();
                            Cursor cursorLIZIZ = C0VN0.LIZIZ(this.LIZ, c0vn5LIZLLL, false);
                            try {
                                int iLIZIZ = C795450VIh.LIZIZ(cursorLIZIZ, "AWEME_ID");
                                int iLIZIZ2 = C795450VIh.LIZIZ(cursorLIZIZ, "READ_TIME");
                                int iLIZIZ3 = C795450VIh.LIZIZ(cursorLIZIZ, "PAGE_TYPE");
                                int iLIZIZ4 = C795450VIh.LIZIZ(cursorLIZIZ, "REPORTED");
                                int iLIZIZ5 = C795450VIh.LIZIZ(cursorLIZIZ, "USER_ID");
                                int iLIZIZ6 = C795450VIh.LIZIZ(cursorLIZIZ, "SCENE");
                                int iLIZIZ7 = C795450VIh.LIZIZ(cursorLIZIZ, "INSERT_TIME");
                                int iLIZIZ8 = C795450VIh.LIZIZ(cursorLIZIZ, "AWEME_TYPE");
                                ArrayList arrayList = new ArrayList(cursorLIZIZ.getCount());
                                while (cursorLIZIZ.moveToNext()) {
                                    String string2 = null;
                                    if (cursorLIZIZ.isNull(iLIZIZ)) {
                                        string = null;
                                    } else {
                                        string = cursorLIZIZ.getString(iLIZIZ);
                                    }
                                    long j = cursorLIZIZ.getLong(iLIZIZ2);
                                    int i2 = cursorLIZIZ.getInt(iLIZIZ3);
                                    if (cursorLIZIZ.getInt(iLIZIZ4) != 0) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    if (!cursorLIZIZ.isNull(iLIZIZ5)) {
                                        string2 = cursorLIZIZ.getString(iLIZIZ5);
                                    }
                                    arrayList.add(new C0VNS(j, cursorLIZIZ.getLong(iLIZIZ7), i2, z, cursorLIZIZ.getInt(iLIZIZ6), string, cursorLIZIZ.getInt(iLIZIZ8), string2));
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

                        @Override // X.InterfaceC797620VQq
                        public final List<C0VNS> LJ(String str, String str2) {
                            String string;
                            boolean z;
                            C0VN5 c0vn5LIZLLL = C0VN5.LIZLLL(2, "SELECT * FROM AWEME_READ_RECORD WHERE USER_ID = ? AND AWEME_ID = ?");
                            if (str2 == null) {
                                c0vn5LIZLLL.LLD(1);
                            } else {
                                c0vn5LIZLLL.LJIILIIL(1, str2);
                            }
                            if (str == null) {
                                c0vn5LIZLLL.LLD(2);
                            } else {
                                c0vn5LIZLLL.LJIILIIL(2, str);
                            }
                            this.LIZ.assertNotSuspendingTransaction();
                            Cursor cursorLIZIZ = C0VN0.LIZIZ(this.LIZ, c0vn5LIZLLL, false);
                            try {
                                int iLIZIZ = C795450VIh.LIZIZ(cursorLIZIZ, "AWEME_ID");
                                int iLIZIZ2 = C795450VIh.LIZIZ(cursorLIZIZ, "READ_TIME");
                                int iLIZIZ3 = C795450VIh.LIZIZ(cursorLIZIZ, "PAGE_TYPE");
                                int iLIZIZ4 = C795450VIh.LIZIZ(cursorLIZIZ, "REPORTED");
                                int iLIZIZ5 = C795450VIh.LIZIZ(cursorLIZIZ, "USER_ID");
                                int iLIZIZ6 = C795450VIh.LIZIZ(cursorLIZIZ, "SCENE");
                                int iLIZIZ7 = C795450VIh.LIZIZ(cursorLIZIZ, "INSERT_TIME");
                                int iLIZIZ8 = C795450VIh.LIZIZ(cursorLIZIZ, "AWEME_TYPE");
                                ArrayList arrayList = new ArrayList(cursorLIZIZ.getCount());
                                while (cursorLIZIZ.moveToNext()) {
                                    String string2 = null;
                                    if (cursorLIZIZ.isNull(iLIZIZ)) {
                                        string = null;
                                    } else {
                                        string = cursorLIZIZ.getString(iLIZIZ);
                                    }
                                    long j = cursorLIZIZ.getLong(iLIZIZ2);
                                    int i = cursorLIZIZ.getInt(iLIZIZ3);
                                    if (cursorLIZIZ.getInt(iLIZIZ4) != 0) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    if (!cursorLIZIZ.isNull(iLIZIZ5)) {
                                        string2 = cursorLIZIZ.getString(iLIZIZ5);
                                    }
                                    arrayList.add(new C0VNS(j, cursorLIZIZ.getLong(iLIZIZ7), i, z, cursorLIZIZ.getInt(iLIZIZ6), string, cursorLIZIZ.getInt(iLIZIZ8), string2));
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

                        @Override // X.InterfaceC797620VQq
                        public final List<C0VNS> LJFF(long j, String str) {
                            String string;
                            boolean z;
                            C0VN5 c0vn5LIZLLL = C0VN5.LIZLLL(2, "SELECT * FROM AWEME_READ_RECORD WHERE READ_TIME >? AND AWEME_TYPE == 40 AND USER_ID = ? ORDER BY INSERT_TIME ASC");
                            c0vn5LIZLLL.LJIJ(1, j);
                            if (str == null) {
                                c0vn5LIZLLL.LLD(2);
                            } else {
                                c0vn5LIZLLL.LJIILIIL(2, str);
                            }
                            this.LIZ.assertNotSuspendingTransaction();
                            Cursor cursorLIZIZ = C0VN0.LIZIZ(this.LIZ, c0vn5LIZLLL, false);
                            try {
                                int iLIZIZ = C795450VIh.LIZIZ(cursorLIZIZ, "AWEME_ID");
                                int iLIZIZ2 = C795450VIh.LIZIZ(cursorLIZIZ, "READ_TIME");
                                int iLIZIZ3 = C795450VIh.LIZIZ(cursorLIZIZ, "PAGE_TYPE");
                                int iLIZIZ4 = C795450VIh.LIZIZ(cursorLIZIZ, "REPORTED");
                                int iLIZIZ5 = C795450VIh.LIZIZ(cursorLIZIZ, "USER_ID");
                                int iLIZIZ6 = C795450VIh.LIZIZ(cursorLIZIZ, "SCENE");
                                int iLIZIZ7 = C795450VIh.LIZIZ(cursorLIZIZ, "INSERT_TIME");
                                int iLIZIZ8 = C795450VIh.LIZIZ(cursorLIZIZ, "AWEME_TYPE");
                                ArrayList arrayList = new ArrayList(cursorLIZIZ.getCount());
                                while (cursorLIZIZ.moveToNext()) {
                                    String string2 = null;
                                    if (cursorLIZIZ.isNull(iLIZIZ)) {
                                        string = null;
                                    } else {
                                        string = cursorLIZIZ.getString(iLIZIZ);
                                    }
                                    long j2 = cursorLIZIZ.getLong(iLIZIZ2);
                                    int i = cursorLIZIZ.getInt(iLIZIZ3);
                                    if (cursorLIZIZ.getInt(iLIZIZ4) != 0) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    if (!cursorLIZIZ.isNull(iLIZIZ5)) {
                                        string2 = cursorLIZIZ.getString(iLIZIZ5);
                                    }
                                    arrayList.add(new C0VNS(j2, cursorLIZIZ.getLong(iLIZIZ7), i, z, cursorLIZIZ.getInt(iLIZIZ6), string, cursorLIZIZ.getInt(iLIZIZ8), string2));
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

                        @Override // X.InterfaceC797620VQq
                        public final List<C0VNS> LJII(int i, String str) {
                            String string;
                            boolean z;
                            C0VN5 c0vn5LIZLLL = C0VN5.LIZLLL(2, "SELECT * FROM AWEME_READ_RECORD WHERE USER_ID = ? AND SCENE = 0 ORDER BY READ_TIME DESC LIMIT ?");
                            if (str == null) {
                                c0vn5LIZLLL.LLD(1);
                            } else {
                                c0vn5LIZLLL.LJIILIIL(1, str);
                            }
                            c0vn5LIZLLL.LJIJ(2, i);
                            this.LIZ.assertNotSuspendingTransaction();
                            Cursor cursorLIZIZ = C0VN0.LIZIZ(this.LIZ, c0vn5LIZLLL, false);
                            try {
                                int iLIZIZ = C795450VIh.LIZIZ(cursorLIZIZ, "AWEME_ID");
                                int iLIZIZ2 = C795450VIh.LIZIZ(cursorLIZIZ, "READ_TIME");
                                int iLIZIZ3 = C795450VIh.LIZIZ(cursorLIZIZ, "PAGE_TYPE");
                                int iLIZIZ4 = C795450VIh.LIZIZ(cursorLIZIZ, "REPORTED");
                                int iLIZIZ5 = C795450VIh.LIZIZ(cursorLIZIZ, "USER_ID");
                                int iLIZIZ6 = C795450VIh.LIZIZ(cursorLIZIZ, "SCENE");
                                int iLIZIZ7 = C795450VIh.LIZIZ(cursorLIZIZ, "INSERT_TIME");
                                int iLIZIZ8 = C795450VIh.LIZIZ(cursorLIZIZ, "AWEME_TYPE");
                                ArrayList arrayList = new ArrayList(cursorLIZIZ.getCount());
                                while (cursorLIZIZ.moveToNext()) {
                                    String string2 = null;
                                    if (cursorLIZIZ.isNull(iLIZIZ)) {
                                        string = null;
                                    } else {
                                        string = cursorLIZIZ.getString(iLIZIZ);
                                    }
                                    long j = cursorLIZIZ.getLong(iLIZIZ2);
                                    int i2 = cursorLIZIZ.getInt(iLIZIZ3);
                                    if (cursorLIZIZ.getInt(iLIZIZ4) != 0) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    if (!cursorLIZIZ.isNull(iLIZIZ5)) {
                                        string2 = cursorLIZIZ.getString(iLIZIZ5);
                                    }
                                    arrayList.add(new C0VNS(j, cursorLIZIZ.getLong(iLIZIZ7), i2, z, cursorLIZIZ.getInt(iLIZIZ6), string, cursorLIZIZ.getInt(iLIZIZ8), string2));
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

                        @Override // X.InterfaceC797620VQq
                        public final List<C0VNS> LJIIIIZZ(long j, String str) {
                            String string;
                            boolean z;
                            C0VN5 c0vn5LIZLLL = C0VN5.LIZLLL(2, "SELECT * FROM AWEME_READ_RECORD WHERE READ_TIME > ? AND USER_ID = ? ");
                            c0vn5LIZLLL.LJIJ(1, j);
                            if (str == null) {
                                c0vn5LIZLLL.LLD(2);
                            } else {
                                c0vn5LIZLLL.LJIILIIL(2, str);
                            }
                            this.LIZ.assertNotSuspendingTransaction();
                            Cursor cursorLIZIZ = C0VN0.LIZIZ(this.LIZ, c0vn5LIZLLL, false);
                            try {
                                int iLIZIZ = C795450VIh.LIZIZ(cursorLIZIZ, "AWEME_ID");
                                int iLIZIZ2 = C795450VIh.LIZIZ(cursorLIZIZ, "READ_TIME");
                                int iLIZIZ3 = C795450VIh.LIZIZ(cursorLIZIZ, "PAGE_TYPE");
                                int iLIZIZ4 = C795450VIh.LIZIZ(cursorLIZIZ, "REPORTED");
                                int iLIZIZ5 = C795450VIh.LIZIZ(cursorLIZIZ, "USER_ID");
                                int iLIZIZ6 = C795450VIh.LIZIZ(cursorLIZIZ, "SCENE");
                                int iLIZIZ7 = C795450VIh.LIZIZ(cursorLIZIZ, "INSERT_TIME");
                                int iLIZIZ8 = C795450VIh.LIZIZ(cursorLIZIZ, "AWEME_TYPE");
                                ArrayList arrayList = new ArrayList(cursorLIZIZ.getCount());
                                while (cursorLIZIZ.moveToNext()) {
                                    String string2 = null;
                                    if (cursorLIZIZ.isNull(iLIZIZ)) {
                                        string = null;
                                    } else {
                                        string = cursorLIZIZ.getString(iLIZIZ);
                                    }
                                    long j2 = cursorLIZIZ.getLong(iLIZIZ2);
                                    int i = cursorLIZIZ.getInt(iLIZIZ3);
                                    if (cursorLIZIZ.getInt(iLIZIZ4) != 0) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    if (!cursorLIZIZ.isNull(iLIZIZ5)) {
                                        string2 = cursorLIZIZ.getString(iLIZIZ5);
                                    }
                                    arrayList.add(new C0VNS(j2, cursorLIZIZ.getLong(iLIZIZ7), i, z, cursorLIZIZ.getInt(iLIZIZ6), string, cursorLIZIZ.getInt(iLIZIZ8), string2));
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

                        @Override // X.InterfaceC797620VQq
                        public final List LIZIZ(int i, long j, String str) {
                            String string;
                            boolean z;
                            C0VN5 c0vn5LIZLLL = C0VN5.LIZLLL(4, "SELECT * FROM AWEME_READ_RECORD WHERE REPORTED = 0 AND PAGE_TYPE = ? AND scene = ? AND READ_TIME > ? AND USER_ID = ? ORDER BY INSERT_TIME ASC");
                            c0vn5LIZLLL.LJIJ(1, i);
                            c0vn5LIZLLL.LJIJ(2, 0);
                            c0vn5LIZLLL.LJIJ(3, j);
                            if (str == null) {
                                c0vn5LIZLLL.LLD(4);
                            } else {
                                c0vn5LIZLLL.LJIILIIL(4, str);
                            }
                            this.LIZ.assertNotSuspendingTransaction();
                            Cursor cursorLIZIZ = C0VN0.LIZIZ(this.LIZ, c0vn5LIZLLL, false);
                            try {
                                int iLIZIZ = C795450VIh.LIZIZ(cursorLIZIZ, "AWEME_ID");
                                int iLIZIZ2 = C795450VIh.LIZIZ(cursorLIZIZ, "READ_TIME");
                                int iLIZIZ3 = C795450VIh.LIZIZ(cursorLIZIZ, "PAGE_TYPE");
                                int iLIZIZ4 = C795450VIh.LIZIZ(cursorLIZIZ, "REPORTED");
                                int iLIZIZ5 = C795450VIh.LIZIZ(cursorLIZIZ, "USER_ID");
                                int iLIZIZ6 = C795450VIh.LIZIZ(cursorLIZIZ, "SCENE");
                                int iLIZIZ7 = C795450VIh.LIZIZ(cursorLIZIZ, "INSERT_TIME");
                                int iLIZIZ8 = C795450VIh.LIZIZ(cursorLIZIZ, "AWEME_TYPE");
                                ArrayList arrayList = new ArrayList(cursorLIZIZ.getCount());
                                while (cursorLIZIZ.moveToNext()) {
                                    String string2 = null;
                                    if (cursorLIZIZ.isNull(iLIZIZ)) {
                                        string = null;
                                    } else {
                                        string = cursorLIZIZ.getString(iLIZIZ);
                                    }
                                    long j2 = cursorLIZIZ.getLong(iLIZIZ2);
                                    int i2 = cursorLIZIZ.getInt(iLIZIZ3);
                                    if (cursorLIZIZ.getInt(iLIZIZ4) != 0) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    if (!cursorLIZIZ.isNull(iLIZIZ5)) {
                                        string2 = cursorLIZIZ.getString(iLIZIZ5);
                                    }
                                    arrayList.add(new C0VNS(j2, cursorLIZIZ.getLong(iLIZIZ7), i2, z, cursorLIZIZ.getInt(iLIZIZ6), string, cursorLIZIZ.getInt(iLIZIZ8), string2));
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

                        @Override // X.InterfaceC797620VQq
                        public final int LJI(long j, long j2, long j3) {
                            this.LIZ.assertNotSuspendingTransaction();
                            InterfaceC796340VLs interfaceC796340VLsAcquire = acquire();
                            interfaceC796340VLsAcquire.LJIJ(1, j);
                            interfaceC796340VLsAcquire.LJIJ(2, j2);
                            interfaceC796340VLsAcquire.LJIJ(3, j3);
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
                c0vnl = this.LLILZLL;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return c0vnl;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.0VNA] */
    @Override // com.ss.android.ugc.aweme.friendstab.db.AwemeRecordDatabase
    public final InterfaceC607930Nst LIZIZ() {
        C0VNA c0vna;
        if (this.LLJI != null) {
            return this.LLJI;
        }
        synchronized (this) {
            try {
                if (this.LLJI == null) {
                    this.LLJI = new InterfaceC607930Nst(this) { // from class: X.0VNA
                        public final AbstractC796540VMm LIZ;
                        public final C0VNB LIZIZ;
                        public final C0VND LIZJ;

                        /* JADX WARN: Type inference failed for: r0v0, types: [X.0VNB] */
                        /* JADX WARN: Type inference failed for: r0v1, types: [X.0VND] */
                        {
                            this.LIZ = this;
                            this.LIZIZ = new AbstractC796330VLr<C0VNC>(this) { // from class: X.0VNB
                                @Override // X.AbstractC795470VIj
                                public final String createQuery() {
                                    return "INSERT OR REPLACE INTO `FOLLOWING_READ_RECORD` (`AWEME_ID`,`REPORTED`,`AWEME_TYPE`,`USER_ID`,`INSERT_TIME`) VALUES (?,?,?,?,?)";
                                }

                                @Override // X.AbstractC796330VLr
                                public final void bind(InterfaceC796340VLs interfaceC796340VLs, C0VNC c0vnc) {
                                    C0VNC c0vnc2 = c0vnc;
                                    String str = c0vnc2.LIZ;
                                    if (str == null) {
                                        interfaceC796340VLs.LLD(1);
                                    } else {
                                        interfaceC796340VLs.LJIILIIL(1, str);
                                    }
                                    interfaceC796340VLs.LJIJ(2, c0vnc2.LIZIZ);
                                    interfaceC796340VLs.LJIJ(3, c0vnc2.LIZJ);
                                    String str2 = c0vnc2.LIZLLL;
                                    if (str2 == null) {
                                        interfaceC796340VLs.LLD(4);
                                    } else {
                                        interfaceC796340VLs.LJIILIIL(4, str2);
                                    }
                                    interfaceC796340VLs.LJIJ(5, c0vnc2.LJ);
                                }
                            };
                            this.LIZJ = new AbstractC795470VIj(this) { // from class: X.0VND
                                @Override // X.AbstractC795470VIj
                                public final String createQuery() {
                                    return "DELETE FROM FOLLOWING_READ_RECORD WHERE INSERT_TIME <= ?";
                                }
                            };
                        }

                        @Override // X.InterfaceC607930Nst
                        public final int LIZ(String str) {
                            C0VN5 c0vn5LIZLLL = C0VN5.LIZLLL(1, "SELECT COUNT(*) FROM FOLLOWING_READ_RECORD WHERE USER_ID = ?");
                            if (str == null) {
                                c0vn5LIZLLL.LLD(1);
                            } else {
                                c0vn5LIZLLL.LJIILIIL(1, str);
                            }
                            this.LIZ.assertNotSuspendingTransaction();
                            int i = 0;
                            Cursor cursorLIZIZ = C0VN0.LIZIZ(this.LIZ, c0vn5LIZLLL, false);
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

                        @Override // X.InterfaceC607930Nst
                        public final void LIZIZ(List<C0VNC> list) {
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

                        @Override // X.InterfaceC607930Nst
                        public final int LIZLLL(long j) {
                            this.LIZ.assertNotSuspendingTransaction();
                            InterfaceC796340VLs interfaceC796340VLsAcquire = acquire();
                            interfaceC796340VLsAcquire.LJIJ(1, j);
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

                        @Override // X.InterfaceC607930Nst
                        public final List LIZJ(int i, long j, String str) {
                            String string;
                            C0VN5 c0vn5LIZLLL = C0VN5.LIZLLL(3, "SELECT * FROM FOLLOWING_READ_RECORD WHERE REPORTED = 0 AND USER_ID = ? AND INSERT_TIME > ? ORDER BY INSERT_TIME DESC LIMIT ?");
                            if (str == null) {
                                c0vn5LIZLLL.LLD(1);
                            } else {
                                c0vn5LIZLLL.LJIILIIL(1, str);
                            }
                            c0vn5LIZLLL.LJIJ(2, j);
                            c0vn5LIZLLL.LJIJ(3, i);
                            this.LIZ.assertNotSuspendingTransaction();
                            Cursor cursorLIZIZ = C0VN0.LIZIZ(this.LIZ, c0vn5LIZLLL, false);
                            try {
                                int iLIZIZ = C795450VIh.LIZIZ(cursorLIZIZ, "AWEME_ID");
                                int iLIZIZ2 = C795450VIh.LIZIZ(cursorLIZIZ, "REPORTED");
                                int iLIZIZ3 = C795450VIh.LIZIZ(cursorLIZIZ, "AWEME_TYPE");
                                int iLIZIZ4 = C795450VIh.LIZIZ(cursorLIZIZ, "USER_ID");
                                int iLIZIZ5 = C795450VIh.LIZIZ(cursorLIZIZ, "INSERT_TIME");
                                ArrayList arrayList = new ArrayList(cursorLIZIZ.getCount());
                                while (cursorLIZIZ.moveToNext()) {
                                    String string2 = null;
                                    if (cursorLIZIZ.isNull(iLIZIZ)) {
                                        string = null;
                                    } else {
                                        string = cursorLIZIZ.getString(iLIZIZ);
                                    }
                                    int i2 = cursorLIZIZ.getInt(iLIZIZ2);
                                    int i3 = cursorLIZIZ.getInt(iLIZIZ3);
                                    if (!cursorLIZIZ.isNull(iLIZIZ4)) {
                                        string2 = cursorLIZIZ.getString(iLIZIZ4);
                                    }
                                    arrayList.add(new C0VNC(i2, cursorLIZIZ.getLong(iLIZIZ5), i3, string, string2));
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
                c0vna = this.LLJI;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return c0vna;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.0VNI] */
    @Override // com.ss.android.ugc.aweme.friendstab.db.AwemeRecordDatabase
    public final InterfaceC797800VRi LIZJ() {
        C0VNI c0vni;
        if (this.LLIZLLLIL != null) {
            return this.LLIZLLLIL;
        }
        synchronized (this) {
            try {
                if (this.LLIZLLLIL == null) {
                    this.LLIZLLLIL = new InterfaceC797800VRi(this) { // from class: X.0VNI
                        public final AbstractC796540VMm LIZ;
                        public final C854570Xfj LIZIZ;
                        public final C854550Xfh LIZJ;

                        {
                            this.LIZ = this;
                            this.LIZIZ = new C854570Xfj(this, 9);
                            this.LIZJ = new C854550Xfh(this, 41);
                        }

                        @Override // X.InterfaceC797800VRi
                        public final void LIZ(List<C0VNJ> list) {
                            this.LIZ.assertNotSuspendingTransaction();
                            this.LIZ.beginTransaction();
                            try {
                                this.LIZIZ.insert((Iterable) list);
                                this.LIZ.setTransactionSuccessful();
                                this.LIZ.endTransaction();
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                this.LIZ.endTransaction();
                                throw th;
                            }
                        }

                        @Override // X.InterfaceC797800VRi
                        public final List<C0VNJ> LIZJ(String str) {
                            String string;
                            boolean z;
                            C0VN5 c0vn5LIZLLL = C0VN5.LIZLLL(1, "SELECT * FROM FRIENDS_RED_DOT_RECORD WHERE REPORTED = 0 AND USER_ID = ? ORDER BY INSERT_TIME ASC");
                            if (str == null) {
                                c0vn5LIZLLL.LLD(1);
                            } else {
                                c0vn5LIZLLL.LJIILIIL(1, str);
                            }
                            this.LIZ.assertNotSuspendingTransaction();
                            Cursor cursorLIZIZ = C0VN0.LIZIZ(this.LIZ, c0vn5LIZLLL, false);
                            try {
                                int iLIZIZ = C795450VIh.LIZIZ(cursorLIZIZ, "AWEME_ID");
                                int iLIZIZ2 = C795450VIh.LIZIZ(cursorLIZIZ, "READ_TIME");
                                int iLIZIZ3 = C795450VIh.LIZIZ(cursorLIZIZ, "REPORTED");
                                int iLIZIZ4 = C795450VIh.LIZIZ(cursorLIZIZ, "USER_ID");
                                int iLIZIZ5 = C795450VIh.LIZIZ(cursorLIZIZ, "INSERT_TIME");
                                int iLIZIZ6 = C795450VIh.LIZIZ(cursorLIZIZ, "AWEME_TYPE");
                                ArrayList arrayList = new ArrayList(cursorLIZIZ.getCount());
                                while (cursorLIZIZ.moveToNext()) {
                                    String string2 = null;
                                    if (cursorLIZIZ.isNull(iLIZIZ)) {
                                        string = null;
                                    } else {
                                        string = cursorLIZIZ.getString(iLIZIZ);
                                    }
                                    long j = cursorLIZIZ.getLong(iLIZIZ2);
                                    if (cursorLIZIZ.getInt(iLIZIZ3) != 0) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    if (!cursorLIZIZ.isNull(iLIZIZ4)) {
                                        string2 = cursorLIZIZ.getString(iLIZIZ4);
                                    }
                                    arrayList.add(new C0VNJ(cursorLIZIZ.getInt(iLIZIZ6), string, z, string2, j, cursorLIZIZ.getLong(iLIZIZ5)));
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

                        @Override // X.InterfaceC797800VRi
                        public final int LIZIZ(long j, String str) {
                            this.LIZ.assertNotSuspendingTransaction();
                            InterfaceC796340VLs interfaceC796340VLsAcquire = this.LIZJ.acquire();
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
                                this.LIZJ.release(interfaceC796340VLsAcquire);
                                return iLJIIL;
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                this.LIZ.endTransaction();
                                this.LIZJ.release(interfaceC796340VLsAcquire);
                                throw th;
                            }
                        }
                    };
                }
                c0vni = this.LLIZLLLIL;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return c0vni;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.0VNO] */
    @Override // com.ss.android.ugc.aweme.friendstab.db.AwemeRecordDatabase
    public final InterfaceC797850VRn LJFF() {
        C0VNO c0vno;
        if (this.LLIZ != null) {
            return this.LLIZ;
        }
        synchronized (this) {
            try {
                if (this.LLIZ == null) {
                    this.LLIZ = new InterfaceC797850VRn(this) { // from class: X.0VNO
                        public final AbstractC796540VMm LIZ;
                        public final C854570Xfj LIZIZ;
                        public final C854550Xfh LIZJ;

                        @Override // X.InterfaceC797850VRn
                        public final void clear() {
                            this.LIZ.assertNotSuspendingTransaction();
                            InterfaceC796340VLs interfaceC796340VLsAcquire = this.LIZJ.acquire();
                            this.LIZ.beginTransaction();
                            try {
                                interfaceC796340VLsAcquire.LJIIL();
                                this.LIZ.setTransactionSuccessful();
                                this.LIZ.endTransaction();
                                this.LIZJ.release(interfaceC796340VLsAcquire);
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                this.LIZ.endTransaction();
                                this.LIZJ.release(interfaceC796340VLsAcquire);
                                throw th;
                            }
                        }

                        {
                            this.LIZ = this;
                            this.LIZIZ = new C854570Xfj(this, 10);
                            this.LIZJ = new C854550Xfh(this, 42);
                        }

                        @Override // X.InterfaceC797850VRn
                        public final void LIZ(List<C0VNP> list) {
                            this.LIZ.assertNotSuspendingTransaction();
                            this.LIZ.beginTransaction();
                            try {
                                this.LIZIZ.insert((Iterable) list);
                                this.LIZ.setTransactionSuccessful();
                                this.LIZ.endTransaction();
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                this.LIZ.endTransaction();
                                throw th;
                            }
                        }

                        @Override // X.InterfaceC797850VRn
                        public final List<C0VNP> LIZIZ(String str) {
                            String string;
                            boolean z;
                            C0VN5 c0vn5LIZLLL = C0VN5.LIZLLL(1, "SELECT * FROM FRIENDS_UNREAD_RECORD WHERE REPORTED = 0 AND USER_ID = ? ORDER BY INSERT_TIME ASC");
                            if (str == null) {
                                c0vn5LIZLLL.LLD(1);
                            } else {
                                c0vn5LIZLLL.LJIILIIL(1, str);
                            }
                            this.LIZ.assertNotSuspendingTransaction();
                            Cursor cursorLIZIZ = C0VN0.LIZIZ(this.LIZ, c0vn5LIZLLL, false);
                            try {
                                int iLIZIZ = C795450VIh.LIZIZ(cursorLIZIZ, "AWEME_ID");
                                int iLIZIZ2 = C795450VIh.LIZIZ(cursorLIZIZ, "READ_TIME");
                                int iLIZIZ3 = C795450VIh.LIZIZ(cursorLIZIZ, "REPORTED");
                                int iLIZIZ4 = C795450VIh.LIZIZ(cursorLIZIZ, "USER_ID");
                                int iLIZIZ5 = C795450VIh.LIZIZ(cursorLIZIZ, "INSERT_TIME");
                                int iLIZIZ6 = C795450VIh.LIZIZ(cursorLIZIZ, "AWEME_TYPE");
                                ArrayList arrayList = new ArrayList(cursorLIZIZ.getCount());
                                while (cursorLIZIZ.moveToNext()) {
                                    String string2 = null;
                                    if (cursorLIZIZ.isNull(iLIZIZ)) {
                                        string = null;
                                    } else {
                                        string = cursorLIZIZ.getString(iLIZIZ);
                                    }
                                    long j = cursorLIZIZ.getLong(iLIZIZ2);
                                    if (cursorLIZIZ.getInt(iLIZIZ3) != 0) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    if (!cursorLIZIZ.isNull(iLIZIZ4)) {
                                        string2 = cursorLIZIZ.getString(iLIZIZ4);
                                    }
                                    arrayList.add(new C0VNP(cursorLIZIZ.getInt(iLIZIZ6), string, z, string2, j, cursorLIZIZ.getLong(iLIZIZ5)));
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
                c0vno = this.LLIZ;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return c0vno;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.0VNF] */
    @Override // com.ss.android.ugc.aweme.friendstab.db.AwemeRecordDatabase
    public final C0VRS LJI() {
        C0VNF c0vnf;
        if (this.LLJ != null) {
            return this.LLJ;
        }
        synchronized (this) {
            try {
                if (this.LLJ == null) {
                    this.LLJ = new C0VRS(this) { // from class: X.0VNF
                        public final AbstractC796540VMm LIZ;
                        public final C854570Xfj LIZIZ;
                        public final C854550Xfh LIZJ;

                        {
                            this.LIZ = this;
                            this.LIZIZ = new C854570Xfj(this, 11);
                            this.LIZJ = new C854550Xfh(this, 43);
                        }

                        @Override // X.C0VRS
                        public final void LIZ(List<C0VNG> list) {
                            this.LIZ.assertNotSuspendingTransaction();
                            this.LIZ.beginTransaction();
                            try {
                                this.LIZIZ.insert((Iterable) list);
                                this.LIZ.setTransactionSuccessful();
                                this.LIZ.endTransaction();
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                this.LIZ.endTransaction();
                                throw th;
                            }
                        }

                        @Override // X.C0VRS
                        public final int LIZIZ(long j, String str) {
                            this.LIZ.assertNotSuspendingTransaction();
                            InterfaceC796340VLs interfaceC796340VLsAcquire = this.LIZJ.acquire();
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
                                this.LIZJ.release(interfaceC796340VLsAcquire);
                                return iLJIIL;
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                this.LIZ.endTransaction();
                                this.LIZJ.release(interfaceC796340VLsAcquire);
                                throw th;
                            }
                        }

                        @Override // X.C0VRS
                        public final List LIZJ(long j, String str) {
                            String string;
                            boolean z;
                            C0VN5 c0vn5LIZLLL = C0VN5.LIZLLL(2, "SELECT * FROM REPOST_DISLIKE_RECORD WHERE REPORTED = 0 AND DISLIKE_TIME > ? AND USER_ID = ? ORDER BY INSERT_TIME ASC");
                            c0vn5LIZLLL.LJIJ(1, j);
                            if (str == null) {
                                c0vn5LIZLLL.LLD(2);
                            } else {
                                c0vn5LIZLLL.LJIILIIL(2, str);
                            }
                            this.LIZ.assertNotSuspendingTransaction();
                            Cursor cursorLIZIZ = C0VN0.LIZIZ(this.LIZ, c0vn5LIZLLL, false);
                            try {
                                int iLIZIZ = C795450VIh.LIZIZ(cursorLIZIZ, "AWEME_ID");
                                int iLIZIZ2 = C795450VIh.LIZIZ(cursorLIZIZ, "DISLIKE_TIME");
                                int iLIZIZ3 = C795450VIh.LIZIZ(cursorLIZIZ, "REPORTED");
                                int iLIZIZ4 = C795450VIh.LIZIZ(cursorLIZIZ, "USER_ID");
                                int iLIZIZ5 = C795450VIh.LIZIZ(cursorLIZIZ, "INSERT_TIME");
                                int iLIZIZ6 = C795450VIh.LIZIZ(cursorLIZIZ, "AWEME_TYPE");
                                ArrayList arrayList = new ArrayList(cursorLIZIZ.getCount());
                                while (cursorLIZIZ.moveToNext()) {
                                    String string2 = null;
                                    if (cursorLIZIZ.isNull(iLIZIZ)) {
                                        string = null;
                                    } else {
                                        string = cursorLIZIZ.getString(iLIZIZ);
                                    }
                                    long j2 = cursorLIZIZ.getLong(iLIZIZ2);
                                    if (cursorLIZIZ.getInt(iLIZIZ3) != 0) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    if (!cursorLIZIZ.isNull(iLIZIZ4)) {
                                        string2 = cursorLIZIZ.getString(iLIZIZ4);
                                    }
                                    arrayList.add(new C0VNG(cursorLIZIZ.getInt(iLIZIZ6), string, z, string2, j2, cursorLIZIZ.getLong(iLIZIZ5)));
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
                c0vnf = this.LLJ;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return c0vnf;
    }

    @Override // X.AbstractC796540VMm
    public final void clearAllTables() {
        super.assertNotMainThread();
        C0VLF c0vlfLJLJJI = this.mOpenHelper.LJLJJI();
        try {
            super.beginTransaction();
            c0vlfLJLJJI.LJIILJJIL("DELETE FROM `AWEME_READ_RECORD`");
            c0vlfLJLJJI.LJIILJJIL("DELETE FROM `FRIENDS_RED_DOT_RECORD`");
            c0vlfLJLJJI.LJIILJJIL("DELETE FROM `FRIENDS_UNREAD_RECORD`");
            c0vlfLJLJJI.LJIILJJIL("DELETE FROM `REPOST_DISLIKE_RECORD`");
            c0vlfLJLJJI.LJIILJJIL("DELETE FROM `FOLLOWING_READ_RECORD`");
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
        return new C796620VMu(this, new HashMap(0), new HashMap(0), "AWEME_READ_RECORD", "FRIENDS_RED_DOT_RECORD", "FRIENDS_UNREAD_RECORD", "REPOST_DISLIKE_RECORD", "FOLLOWING_READ_RECORD");
    }

    @Override // X.AbstractC796540VMm
    public final Set<Class<? extends InterfaceC2275591E5d>> getRequiredAutoMigrationSpecs() {
        return new HashSet();
    }

    @Override // X.AbstractC796540VMm
    public final Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
        HashMap map = new HashMap();
        map.put(InterfaceC797620VQq.class, Collections.emptyList());
        map.put(InterfaceC797850VRn.class, Collections.emptyList());
        map.put(InterfaceC797800VRi.class, Collections.emptyList());
        map.put(C0VRS.class, Collections.emptyList());
        map.put(InterfaceC607930Nst.class, Collections.emptyList());
        return map;
    }

    @Override // X.AbstractC796540VMm
    public final InterfaceC796190VLd createOpenHelper(C796520VMk c796520VMk) {
        C0VN2 c0vn2 = new C0VN2(c796520VMk, new C0VN3() { // from class: X.0VN9
            @Override // X.C0VN3
            public final void onPostMigrate(C0VLF c0vlf) {
            }

            {
                super(5);
            }

            @Override // X.C0VN3
            public final void createAllTables(C0VLF c0vlf) {
                c0vlf.LJIILJJIL("CREATE TABLE IF NOT EXISTS `AWEME_READ_RECORD` (`AWEME_ID` TEXT NOT NULL, `READ_TIME` INTEGER NOT NULL, `PAGE_TYPE` INTEGER NOT NULL, `REPORTED` INTEGER NOT NULL, `USER_ID` TEXT NOT NULL, `SCENE` INTEGER NOT NULL, `INSERT_TIME` INTEGER NOT NULL, `AWEME_TYPE` INTEGER NOT NULL, PRIMARY KEY(`AWEME_ID`, `SCENE`))");
                c0vlf.LJIILJJIL("CREATE TABLE IF NOT EXISTS `FRIENDS_RED_DOT_RECORD` (`AWEME_ID` TEXT NOT NULL, `READ_TIME` INTEGER NOT NULL, `REPORTED` INTEGER NOT NULL, `USER_ID` TEXT NOT NULL, `INSERT_TIME` INTEGER NOT NULL, `AWEME_TYPE` INTEGER NOT NULL, PRIMARY KEY(`AWEME_ID`))");
                c0vlf.LJIILJJIL("CREATE TABLE IF NOT EXISTS `FRIENDS_UNREAD_RECORD` (`AWEME_ID` TEXT NOT NULL, `READ_TIME` INTEGER NOT NULL, `REPORTED` INTEGER NOT NULL, `USER_ID` TEXT NOT NULL, `INSERT_TIME` INTEGER NOT NULL, `AWEME_TYPE` INTEGER NOT NULL, PRIMARY KEY(`AWEME_ID`))");
                c0vlf.LJIILJJIL("CREATE TABLE IF NOT EXISTS `REPOST_DISLIKE_RECORD` (`AWEME_ID` TEXT NOT NULL, `DISLIKE_TIME` INTEGER NOT NULL, `REPORTED` INTEGER NOT NULL, `USER_ID` TEXT NOT NULL, `INSERT_TIME` INTEGER NOT NULL, `AWEME_TYPE` INTEGER NOT NULL, PRIMARY KEY(`AWEME_ID`))");
                c0vlf.LJIILJJIL("CREATE TABLE IF NOT EXISTS `FOLLOWING_READ_RECORD` (`AWEME_ID` TEXT NOT NULL, `REPORTED` INTEGER NOT NULL, `AWEME_TYPE` INTEGER NOT NULL, `USER_ID` TEXT NOT NULL, `INSERT_TIME` INTEGER NOT NULL, PRIMARY KEY(`AWEME_ID`))");
                c0vlf.LJIILJJIL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                c0vlf.LJIILJJIL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '75b601d57ae3cd14283b78fa814d32de')");
            }

            @Override // X.C0VN3
            public final void dropAllTables(C0VLF c0vlf) {
                c0vlf.LJIILJJIL("DROP TABLE IF EXISTS `AWEME_READ_RECORD`");
                c0vlf.LJIILJJIL("DROP TABLE IF EXISTS `FRIENDS_RED_DOT_RECORD`");
                c0vlf.LJIILJJIL("DROP TABLE IF EXISTS `FRIENDS_UNREAD_RECORD`");
                c0vlf.LJIILJJIL("DROP TABLE IF EXISTS `REPOST_DISLIKE_RECORD`");
                c0vlf.LJIILJJIL("DROP TABLE IF EXISTS `FOLLOWING_READ_RECORD`");
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
                HashMap map = new HashMap(8);
                map.put("AWEME_ID", new C795990VKj(1, 1, "AWEME_ID", "TEXT", null, true));
                map.put("READ_TIME", new C795990VKj(0, 1, "READ_TIME", "INTEGER", null, true));
                map.put("PAGE_TYPE", new C795990VKj(0, 1, "PAGE_TYPE", "INTEGER", null, true));
                map.put("REPORTED", new C795990VKj(0, 1, "REPORTED", "INTEGER", null, true));
                map.put("USER_ID", new C795990VKj(0, 1, "USER_ID", "TEXT", null, true));
                map.put("SCENE", new C795990VKj(2, 1, "SCENE", "INTEGER", null, true));
                map.put("INSERT_TIME", new C795990VKj(0, 1, "INSERT_TIME", "INTEGER", null, true));
                map.put("AWEME_TYPE", new C795990VKj(0, 1, "AWEME_TYPE", "INTEGER", null, true));
                C0VN6 c0vn6 = new C0VN6("AWEME_READ_RECORD", map, new HashSet(0), new HashSet(0));
                C0VN6 c0vn6LIZ = C0VN6.LIZ(c0vlf, "AWEME_READ_RECORD");
                if (!c0vn6.equals(c0vn6LIZ)) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("AWEME_READ_RECORD(com.ss.android.ugc.aweme.friendstab.db.AwemeReadRecordEntity).\n Expected:\n");
                    sbLIZ.append(c0vn6);
                    sbLIZ.append("\n Found:\n");
                    sbLIZ.append(c0vn6LIZ);
                    return new C0VN4(false, C2188811AlT.LIZIZ(sbLIZ));
                }
                HashMap map2 = new HashMap(6);
                map2.put("AWEME_ID", new C795990VKj(1, 1, "AWEME_ID", "TEXT", null, true));
                map2.put("READ_TIME", new C795990VKj(0, 1, "READ_TIME", "INTEGER", null, true));
                map2.put("REPORTED", new C795990VKj(0, 1, "REPORTED", "INTEGER", null, true));
                map2.put("USER_ID", new C795990VKj(0, 1, "USER_ID", "TEXT", null, true));
                map2.put("INSERT_TIME", new C795990VKj(0, 1, "INSERT_TIME", "INTEGER", null, true));
                map2.put("AWEME_TYPE", new C795990VKj(0, 1, "AWEME_TYPE", "INTEGER", null, true));
                C0VN6 c0vn62 = new C0VN6("FRIENDS_RED_DOT_RECORD", map2, new HashSet(0), new HashSet(0));
                C0VN6 c0vn6LIZ2 = C0VN6.LIZ(c0vlf, "FRIENDS_RED_DOT_RECORD");
                if (!c0vn62.equals(c0vn6LIZ2)) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("FRIENDS_RED_DOT_RECORD(com.ss.android.ugc.aweme.friendstab.db.FriendsRedDotRecordEntity).\n Expected:\n");
                    sbLIZ2.append(c0vn62);
                    sbLIZ2.append("\n Found:\n");
                    sbLIZ2.append(c0vn6LIZ2);
                    return new C0VN4(false, C2188811AlT.LIZIZ(sbLIZ2));
                }
                HashMap map3 = new HashMap(6);
                map3.put("AWEME_ID", new C795990VKj(1, 1, "AWEME_ID", "TEXT", null, true));
                map3.put("READ_TIME", new C795990VKj(0, 1, "READ_TIME", "INTEGER", null, true));
                map3.put("REPORTED", new C795990VKj(0, 1, "REPORTED", "INTEGER", null, true));
                map3.put("USER_ID", new C795990VKj(0, 1, "USER_ID", "TEXT", null, true));
                map3.put("INSERT_TIME", new C795990VKj(0, 1, "INSERT_TIME", "INTEGER", null, true));
                map3.put("AWEME_TYPE", new C795990VKj(0, 1, "AWEME_TYPE", "INTEGER", null, true));
                C0VN6 c0vn63 = new C0VN6("FRIENDS_UNREAD_RECORD", map3, new HashSet(0), new HashSet(0));
                C0VN6 c0vn6LIZ3 = C0VN6.LIZ(c0vlf, "FRIENDS_UNREAD_RECORD");
                if (!c0vn63.equals(c0vn6LIZ3)) {
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("FRIENDS_UNREAD_RECORD(com.ss.android.ugc.aweme.friendstab.db.FriendsUnreadRecordEntity).\n Expected:\n");
                    sbLIZ3.append(c0vn63);
                    sbLIZ3.append("\n Found:\n");
                    sbLIZ3.append(c0vn6LIZ3);
                    return new C0VN4(false, C2188811AlT.LIZIZ(sbLIZ3));
                }
                HashMap map4 = new HashMap(6);
                map4.put("AWEME_ID", new C795990VKj(1, 1, "AWEME_ID", "TEXT", null, true));
                map4.put("DISLIKE_TIME", new C795990VKj(0, 1, "DISLIKE_TIME", "INTEGER", null, true));
                map4.put("REPORTED", new C795990VKj(0, 1, "REPORTED", "INTEGER", null, true));
                map4.put("USER_ID", new C795990VKj(0, 1, "USER_ID", "TEXT", null, true));
                map4.put("INSERT_TIME", new C795990VKj(0, 1, "INSERT_TIME", "INTEGER", null, true));
                map4.put("AWEME_TYPE", new C795990VKj(0, 1, "AWEME_TYPE", "INTEGER", null, true));
                C0VN6 c0vn64 = new C0VN6("REPOST_DISLIKE_RECORD", map4, new HashSet(0), new HashSet(0));
                C0VN6 c0vn6LIZ4 = C0VN6.LIZ(c0vlf, "REPOST_DISLIKE_RECORD");
                if (!c0vn64.equals(c0vn6LIZ4)) {
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append("REPOST_DISLIKE_RECORD(com.ss.android.ugc.aweme.friendstab.db.RepostDislikeRecordEntity).\n Expected:\n");
                    sbLIZ4.append(c0vn64);
                    sbLIZ4.append("\n Found:\n");
                    sbLIZ4.append(c0vn6LIZ4);
                    return new C0VN4(false, C2188811AlT.LIZIZ(sbLIZ4));
                }
                HashMap map5 = new HashMap(5);
                map5.put("AWEME_ID", new C795990VKj(1, 1, "AWEME_ID", "TEXT", null, true));
                map5.put("REPORTED", new C795990VKj(0, 1, "REPORTED", "INTEGER", null, true));
                map5.put("AWEME_TYPE", new C795990VKj(0, 1, "AWEME_TYPE", "INTEGER", null, true));
                map5.put("USER_ID", new C795990VKj(0, 1, "USER_ID", "TEXT", null, true));
                map5.put("INSERT_TIME", new C795990VKj(0, 1, "INSERT_TIME", "INTEGER", null, true));
                C0VN6 c0vn65 = new C0VN6("FOLLOWING_READ_RECORD", map5, new HashSet(0), new HashSet(0));
                C0VN6 c0vn6LIZ5 = C0VN6.LIZ(c0vlf, "FOLLOWING_READ_RECORD");
                if (!c0vn65.equals(c0vn6LIZ5)) {
                    StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                    sbLIZ5.append("FOLLOWING_READ_RECORD(com.ss.android.ugc.aweme.friendstab.db.FollowingReadRecordEntity).\n Expected:\n");
                    sbLIZ5.append(c0vn65);
                    sbLIZ5.append("\n Found:\n");
                    sbLIZ5.append(c0vn6LIZ5);
                    return new C0VN4(false, C2188811AlT.LIZIZ(sbLIZ5));
                }
                return new C0VN4(true, null);
            }
        }, "75b601d57ae3cd14283b78fa814d32de", "a2bca45b0acd44cc816ab960a437bcc9");
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
