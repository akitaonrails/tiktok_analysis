package com.ss.android.ugc.aweme.im.contacts.impl.data.base;

import X.AbstractC796510VMj;
import X.C0VKN;
import X.C0VLF;
import X.C0VN2;
import X.C0VN3;
import X.C0VNU;
import X.C0VNX;
import X.C796520VMk;
import X.C796620VMu;
import X.C796690VNb;
import X.C796750VNh;
import X.InterfaceC1581706Hf;
import X.InterfaceC2201871BFp;
import X.InterfaceC2275591E5d;
import X.InterfaceC796190VLd;
import X.InterfaceC808330VnL;
import X.InterfaceC808350VnN;
import android.database.Cursor;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes14.dex */
public final class IMContactDatabase_Impl extends IMContactDatabase {
    public volatile C796750VNh LLIZ;
    public volatile C796690VNb LLIZLLLIL;
    public volatile C0VNX LLJ;
    public volatile C0VNU LLJI;

    /* JADX WARN: Type inference failed for: r0v4, types: [X.0VNh] */
    @Override // com.ss.android.ugc.aweme.im.contacts.impl.data.base.IMContactDatabase
    public final InterfaceC2201871BFp LIZ() {
        C796750VNh c796750VNh;
        if (this.LLIZ != null) {
            return this.LLIZ;
        }
        synchronized (this) {
            try {
                if (this.LLIZ == null) {
                    this.LLIZ = new InterfaceC2201871BFp(this) { // from class: X.0VNh
                        public final AbstractC796540VMm LIZ;
                        public final C2201821BFk LIZIZ;
                        public final C796830VNp LIZJ;
                        public final C796760VNi LIZLLL;
                        public final C796770VNj LJ;
                        public final C796790VNl LJFF;
                        public final C796800VNm LJI;
                        public final C796810VNn LJII;

                        @Override // X.InterfaceC2201871BFp
                        public final int LJ() {
                            C0VN5 c0vn5LIZLLL = C0VN5.LIZLLL(0, "SELECT COUNT(*) FROM IM_USER_BASE_INFO");
                            this.LIZ.assertNotSuspendingTransaction();
                            Cursor cursorLIZIZ = C0VN0.LIZIZ(this.LIZ, c0vn5LIZLLL, false);
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

                        @Override // X.InterfaceC2201871BFp
                        public final int LJFF() {
                            C0VN5 c0vn5LIZLLL = C0VN5.LIZLLL(0, "SELECT COUNT(*) FROM IM_USER_BASE_INFO WHERE FOLLOW_STATUS = 2");
                            this.LIZ.assertNotSuspendingTransaction();
                            Cursor cursorLIZIZ = C0VN0.LIZIZ(this.LIZ, c0vn5LIZLLL, false);
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

                        @Override // X.InterfaceC2201871BFp
                        public final List<C2201831BFl> LJI() throws Throwable {
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
                            C0VN5 c0vn5LIZLLL = C0VN5.LIZLLL(0, "SELECT * FROM IM_USER_BASE_INFO");
                            this.LIZ.assertNotSuspendingTransaction();
                            Cursor cursorLIZIZ = C0VN0.LIZIZ(this.LIZ, c0vn5LIZLLL, false);
                            try {
                                iLIZIZ = C795450VIh.LIZIZ(cursorLIZIZ, "UID");
                                iLIZIZ2 = C795450VIh.LIZIZ(cursorLIZIZ, "AVATAR_THUMB");
                                iLIZIZ3 = C795450VIh.LIZIZ(cursorLIZIZ, "AVATAR_MEDIUM");
                                iLIZIZ4 = C795450VIh.LIZIZ(cursorLIZIZ, "NICK_NAME");
                                iLIZIZ5 = C795450VIh.LIZIZ(cursorLIZIZ, "UNIQUE_ID");
                                iLIZIZ6 = C795450VIh.LIZIZ(cursorLIZIZ, "FOLLOW_STATUS");
                                iLIZIZ7 = C795450VIh.LIZIZ(cursorLIZIZ, "FOLLOWER_COUNT");
                                iLIZIZ8 = C795450VIh.LIZIZ(cursorLIZIZ, "FOLLOWING_COUNT");
                                iLIZIZ9 = C795450VIh.LIZIZ(cursorLIZIZ, "MAF_STATUS");
                                iLIZIZ10 = C795450VIh.LIZIZ(cursorLIZIZ, "REC_TYPE");
                                iLIZIZ11 = C795450VIh.LIZIZ(cursorLIZIZ, "UPDATE_TIME");
                                iLIZIZ12 = C795450VIh.LIZIZ(cursorLIZIZ, "SORT_WEIGHT");
                                iLIZIZ13 = C795450VIh.LIZIZ(cursorLIZIZ, "INITIAL_LETTER");
                                iLIZIZ14 = C795450VIh.LIZIZ(cursorLIZIZ, "EXTRA");
                            } catch (Throwable th) {
                                th = th;
                            }
                            try {
                                int iLIZIZ15 = C795450VIh.LIZIZ(cursorLIZIZ, "FOLLOWER_STATUS");
                                int iLIZIZ16 = C795450VIh.LIZIZ(cursorLIZIZ, "BLOCK");
                                int iLIZIZ17 = C795450VIh.LIZIZ(cursorLIZIZ, "BLOCKED_BY");
                                int iLIZIZ18 = C795450VIh.LIZIZ(cursorLIZIZ, "RECOMMEND_REASON");
                                int iLIZIZ19 = C795450VIh.LIZIZ(cursorLIZIZ, "ENTERPRISE_USER_VERIFY_REASON");
                                int iLIZIZ20 = C795450VIh.LIZIZ(cursorLIZIZ, "USER_VERIFY_REASON");
                                int iLIZIZ21 = C795450VIh.LIZIZ(cursorLIZIZ, "USER_VERIFY_TYPE");
                                int iLIZIZ22 = C795450VIh.LIZIZ(cursorLIZIZ, "DELETED");
                                ArrayList arrayList = new ArrayList(cursorLIZIZ.getCount());
                                while (cursorLIZIZ.moveToNext()) {
                                    long j = cursorLIZIZ.getLong(iLIZIZ);
                                    Integer numValueOf = null;
                                    String string = cursorLIZIZ.isNull(iLIZIZ2) ? null : cursorLIZIZ.getString(iLIZIZ2);
                                    String string2 = cursorLIZIZ.isNull(iLIZIZ3) ? null : cursorLIZIZ.getString(iLIZIZ3);
                                    String string3 = cursorLIZIZ.isNull(iLIZIZ4) ? null : cursorLIZIZ.getString(iLIZIZ4);
                                    String string4 = cursorLIZIZ.isNull(iLIZIZ5) ? null : cursorLIZIZ.getString(iLIZIZ5);
                                    Integer numValueOf2 = cursorLIZIZ.isNull(iLIZIZ6) ? null : Integer.valueOf(cursorLIZIZ.getInt(iLIZIZ6));
                                    Integer numValueOf3 = cursorLIZIZ.isNull(iLIZIZ7) ? null : Integer.valueOf(cursorLIZIZ.getInt(iLIZIZ7));
                                    Integer numValueOf4 = cursorLIZIZ.isNull(iLIZIZ8) ? null : Integer.valueOf(cursorLIZIZ.getInt(iLIZIZ8));
                                    Integer numValueOf5 = cursorLIZIZ.isNull(iLIZIZ9) ? null : Integer.valueOf(cursorLIZIZ.getInt(iLIZIZ9));
                                    String string5 = cursorLIZIZ.isNull(iLIZIZ10) ? null : cursorLIZIZ.getString(iLIZIZ10);
                                    long j2 = cursorLIZIZ.getLong(iLIZIZ11);
                                    String string6 = cursorLIZIZ.isNull(iLIZIZ12) ? null : cursorLIZIZ.getString(iLIZIZ12);
                                    String string7 = cursorLIZIZ.isNull(iLIZIZ13) ? null : cursorLIZIZ.getString(iLIZIZ13);
                                    String string8 = cursorLIZIZ.isNull(iLIZIZ14) ? null : cursorLIZIZ.getString(iLIZIZ14);
                                    Integer numValueOf6 = cursorLIZIZ.isNull(iLIZIZ15) ? null : Integer.valueOf(cursorLIZIZ.getInt(iLIZIZ15));
                                    Integer numValueOf7 = cursorLIZIZ.isNull(iLIZIZ16) ? null : Integer.valueOf(cursorLIZIZ.getInt(iLIZIZ16));
                                    Integer numValueOf8 = cursorLIZIZ.isNull(iLIZIZ17) ? null : Integer.valueOf(cursorLIZIZ.getInt(iLIZIZ17));
                                    String string9 = cursorLIZIZ.isNull(iLIZIZ18) ? null : cursorLIZIZ.getString(iLIZIZ18);
                                    String string10 = cursorLIZIZ.isNull(iLIZIZ19) ? null : cursorLIZIZ.getString(iLIZIZ19);
                                    String string11 = cursorLIZIZ.isNull(iLIZIZ20) ? null : cursorLIZIZ.getString(iLIZIZ20);
                                    Integer numValueOf9 = cursorLIZIZ.isNull(iLIZIZ21) ? null : Integer.valueOf(cursorLIZIZ.getInt(iLIZIZ21));
                                    if (!cursorLIZIZ.isNull(iLIZIZ22)) {
                                        numValueOf = Integer.valueOf(cursorLIZIZ.getInt(iLIZIZ22));
                                    }
                                    arrayList.add(new C2201831BFl(j, string, string2, string3, string4, numValueOf2, numValueOf3, numValueOf4, numValueOf5, string5, j2, string6, string7, string8, numValueOf6, numValueOf7, numValueOf8, string9, string10, string11, numValueOf9, numValueOf));
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

                        @Override // X.InterfaceC2201871BFp
                        public final void LJIILJJIL() {
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

                        @Override // X.InterfaceC2201871BFp
                        public final List<Long> LJIILL() {
                            C0VN5 c0vn5LIZLLL = C0VN5.LIZLLL(0, "SELECT UID FROM IM_USER_BASE_INFO WHERE MAF_STATUS = 1 AND FOLLOW_STATUS != 2");
                            this.LIZ.assertNotSuspendingTransaction();
                            Cursor cursorLIZIZ = C0VN0.LIZIZ(this.LIZ, c0vn5LIZLLL, false);
                            try {
                                ArrayList arrayList = new ArrayList(cursorLIZIZ.getCount());
                                while (cursorLIZIZ.moveToNext()) {
                                    arrayList.add(Long.valueOf(cursorLIZIZ.getLong(0)));
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

                        /* JADX WARN: Type inference failed for: r0v0, types: [X.1BFk] */
                        /* JADX WARN: Type inference failed for: r0v1, types: [X.0VNp] */
                        /* JADX WARN: Type inference failed for: r0v2, types: [X.0VNi] */
                        /* JADX WARN: Type inference failed for: r0v3, types: [X.0VNj] */
                        /* JADX WARN: Type inference failed for: r0v5, types: [X.0VNl] */
                        /* JADX WARN: Type inference failed for: r0v6, types: [X.0VNm] */
                        /* JADX WARN: Type inference failed for: r0v7, types: [X.0VNn] */
                        {
                            this.LIZ = this;
                            this.LIZIZ = new AbstractC796330VLr<C2201831BFl>(this) { // from class: X.1BFk
                                @Override // X.AbstractC795470VIj
                                public final String createQuery() {
                                    return "INSERT OR REPLACE INTO `IM_USER_BASE_INFO` (`UID`,`AVATAR_THUMB`,`AVATAR_MEDIUM`,`NICK_NAME`,`UNIQUE_ID`,`FOLLOW_STATUS`,`FOLLOWER_COUNT`,`FOLLOWING_COUNT`,`MAF_STATUS`,`REC_TYPE`,`UPDATE_TIME`,`SORT_WEIGHT`,`INITIAL_LETTER`,`EXTRA`,`FOLLOWER_STATUS`,`BLOCK`,`BLOCKED_BY`,`RECOMMEND_REASON`,`ENTERPRISE_USER_VERIFY_REASON`,`USER_VERIFY_REASON`,`USER_VERIFY_TYPE`,`DELETED`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
                                }

                                @Override // X.AbstractC796330VLr
                                public final void bind(InterfaceC796340VLs interfaceC796340VLs, C2201831BFl c2201831BFl) {
                                    C2201831BFl c2201831BFl2 = c2201831BFl;
                                    interfaceC796340VLs.LJIJ(1, c2201831BFl2.LIZ);
                                    String str = c2201831BFl2.LIZIZ;
                                    if (str == null) {
                                        interfaceC796340VLs.LLD(2);
                                    } else {
                                        interfaceC796340VLs.LJIILIIL(2, str);
                                    }
                                    String str2 = c2201831BFl2.LIZJ;
                                    if (str2 == null) {
                                        interfaceC796340VLs.LLD(3);
                                    } else {
                                        interfaceC796340VLs.LJIILIIL(3, str2);
                                    }
                                    String str3 = c2201831BFl2.LIZLLL;
                                    if (str3 == null) {
                                        interfaceC796340VLs.LLD(4);
                                    } else {
                                        interfaceC796340VLs.LJIILIIL(4, str3);
                                    }
                                    String str4 = c2201831BFl2.LJ;
                                    if (str4 == null) {
                                        interfaceC796340VLs.LLD(5);
                                    } else {
                                        interfaceC796340VLs.LJIILIIL(5, str4);
                                    }
                                    if (c2201831BFl2.LJFF == null) {
                                        interfaceC796340VLs.LLD(6);
                                    } else {
                                        interfaceC796340VLs.LJIJ(6, r0.intValue());
                                    }
                                    if (c2201831BFl2.LJI == null) {
                                        interfaceC796340VLs.LLD(7);
                                    } else {
                                        interfaceC796340VLs.LJIJ(7, r0.intValue());
                                    }
                                    if (c2201831BFl2.LJII == null) {
                                        interfaceC796340VLs.LLD(8);
                                    } else {
                                        interfaceC796340VLs.LJIJ(8, r0.intValue());
                                    }
                                    if (c2201831BFl2.LJIIIIZZ == null) {
                                        interfaceC796340VLs.LLD(9);
                                    } else {
                                        interfaceC796340VLs.LJIJ(9, r0.intValue());
                                    }
                                    String str5 = c2201831BFl2.LJIIIZ;
                                    if (str5 == null) {
                                        interfaceC796340VLs.LLD(10);
                                    } else {
                                        interfaceC796340VLs.LJIILIIL(10, str5);
                                    }
                                    interfaceC796340VLs.LJIJ(11, c2201831BFl2.LJIIJ);
                                    String str6 = c2201831BFl2.LJIIJJI;
                                    if (str6 == null) {
                                        interfaceC796340VLs.LLD(12);
                                    } else {
                                        interfaceC796340VLs.LJIILIIL(12, str6);
                                    }
                                    String str7 = c2201831BFl2.LJIIL;
                                    if (str7 == null) {
                                        interfaceC796340VLs.LLD(13);
                                    } else {
                                        interfaceC796340VLs.LJIILIIL(13, str7);
                                    }
                                    String str8 = c2201831BFl2.LJIILIIL;
                                    if (str8 == null) {
                                        interfaceC796340VLs.LLD(14);
                                    } else {
                                        interfaceC796340VLs.LJIILIIL(14, str8);
                                    }
                                    if (c2201831BFl2.LJIILJJIL == null) {
                                        interfaceC796340VLs.LLD(15);
                                    } else {
                                        interfaceC796340VLs.LJIJ(15, r0.intValue());
                                    }
                                    if (c2201831BFl2.LJIILL == null) {
                                        interfaceC796340VLs.LLD(16);
                                    } else {
                                        interfaceC796340VLs.LJIJ(16, r0.intValue());
                                    }
                                    if (c2201831BFl2.LJIILLIIL == null) {
                                        interfaceC796340VLs.LLD(17);
                                    } else {
                                        interfaceC796340VLs.LJIJ(17, r0.intValue());
                                    }
                                    String str9 = c2201831BFl2.LJIIZILJ;
                                    if (str9 == null) {
                                        interfaceC796340VLs.LLD(18);
                                    } else {
                                        interfaceC796340VLs.LJIILIIL(18, str9);
                                    }
                                    String str10 = c2201831BFl2.LJIJ;
                                    if (str10 == null) {
                                        interfaceC796340VLs.LLD(19);
                                    } else {
                                        interfaceC796340VLs.LJIILIIL(19, str10);
                                    }
                                    String str11 = c2201831BFl2.LJIJI;
                                    if (str11 == null) {
                                        interfaceC796340VLs.LLD(20);
                                    } else {
                                        interfaceC796340VLs.LJIILIIL(20, str11);
                                    }
                                    if (c2201831BFl2.LJIJJ == null) {
                                        interfaceC796340VLs.LLD(21);
                                    } else {
                                        interfaceC796340VLs.LJIJ(21, r0.intValue());
                                    }
                                    if (c2201831BFl2.LJIJJLI == null) {
                                        interfaceC796340VLs.LLD(22);
                                    } else {
                                        interfaceC796340VLs.LJIJ(22, r0.intValue());
                                    }
                                }
                            };
                            this.LIZJ = new AbstractC796320VLq<C796840VNq>(this) { // from class: X.0VNp
                                @Override // X.AbstractC796320VLq, X.AbstractC795470VIj
                                public final String createQuery() {
                                    return "UPDATE OR REPLACE `IM_USER_BASE_INFO` SET `UID` = ?,`AVATAR_THUMB` = ?,`AVATAR_MEDIUM` = ?,`NICK_NAME` = ?,`UNIQUE_ID` = ?,`FOLLOW_STATUS` = ?,`MAF_STATUS` = ?,`REC_TYPE` = ?,`UPDATE_TIME` = ? WHERE `UID` = ?";
                                }

                                @Override // X.AbstractC796320VLq
                                public final void bind(InterfaceC796340VLs interfaceC796340VLs, C796840VNq c796840VNq) {
                                    C796840VNq c796840VNq2 = c796840VNq;
                                    interfaceC796340VLs.LJIJ(1, c796840VNq2.LIZ);
                                    String str = c796840VNq2.LIZIZ;
                                    if (str == null) {
                                        interfaceC796340VLs.LLD(2);
                                    } else {
                                        interfaceC796340VLs.LJIILIIL(2, str);
                                    }
                                    String str2 = c796840VNq2.LIZJ;
                                    if (str2 == null) {
                                        interfaceC796340VLs.LLD(3);
                                    } else {
                                        interfaceC796340VLs.LJIILIIL(3, str2);
                                    }
                                    String str3 = c796840VNq2.LIZLLL;
                                    if (str3 == null) {
                                        interfaceC796340VLs.LLD(4);
                                    } else {
                                        interfaceC796340VLs.LJIILIIL(4, str3);
                                    }
                                    String str4 = c796840VNq2.LJ;
                                    if (str4 == null) {
                                        interfaceC796340VLs.LLD(5);
                                    } else {
                                        interfaceC796340VLs.LJIILIIL(5, str4);
                                    }
                                    if (c796840VNq2.LJFF == null) {
                                        interfaceC796340VLs.LLD(6);
                                    } else {
                                        interfaceC796340VLs.LJIJ(6, r0.intValue());
                                    }
                                    if (c796840VNq2.LJI == null) {
                                        interfaceC796340VLs.LLD(7);
                                    } else {
                                        interfaceC796340VLs.LJIJ(7, r0.intValue());
                                    }
                                    String str5 = c796840VNq2.LJII;
                                    if (str5 == null) {
                                        interfaceC796340VLs.LLD(8);
                                    } else {
                                        interfaceC796340VLs.LJIILIIL(8, str5);
                                    }
                                    interfaceC796340VLs.LJIJ(9, c796840VNq2.LJIIIIZZ);
                                    interfaceC796340VLs.LJIJ(10, c796840VNq2.LIZ);
                                }
                            };
                            this.LIZLLL = new AbstractC795470VIj(this) { // from class: X.0VNi
                                @Override // X.AbstractC795470VIj
                                public final String createQuery() {
                                    return "DELETE FROM IM_USER_BASE_INFO WHERE MAF_STATUS = 1 AND FOLLOW_STATUS != 2";
                                }
                            };
                            this.LJ = new AbstractC795470VIj(this) { // from class: X.0VNj
                                @Override // X.AbstractC795470VIj
                                public final String createQuery() {
                                    return "DELETE FROM IM_USER_BASE_INFO WHERE UPDATE_TIME < ?";
                                }
                            };
                            new AbstractC795470VIj(this) { // from class: X.0VNk
                                @Override // X.AbstractC795470VIj
                                public final String createQuery() {
                                    return "UPDATE IM_USER_BASE_INFO SET FOLLOW_STATUS = ? WHERE UID = ?";
                                }
                            };
                            this.LJFF = new AbstractC795470VIj(this) { // from class: X.0VNl
                                @Override // X.AbstractC795470VIj
                                public final String createQuery() {
                                    return "UPDATE IM_USER_BASE_INFO SET BLOCK = 1 AND FOLLOW_STATUS = 0 AND FOLLOWER_STATUS = 0 WHERE UID = ?";
                                }
                            };
                            this.LJI = new AbstractC795470VIj(this) { // from class: X.0VNm
                                @Override // X.AbstractC795470VIj
                                public final String createQuery() {
                                    return "UPDATE IM_USER_BASE_INFO SET BLOCK = 0 WHERE UID = ?";
                                }
                            };
                            this.LJII = new AbstractC795470VIj(this) { // from class: X.0VNn
                                @Override // X.AbstractC795470VIj
                                public final String createQuery() {
                                    return "DELETE FROM IM_USER_BASE_INFO WHERE UID = ?";
                                }
                            };
                            new AbstractC795470VIj(this) { // from class: X.0VNo
                                @Override // X.AbstractC795470VIj
                                public final String createQuery() {
                                    return "DELETE FROM IM_USER_BASE_INFO";
                                }
                            };
                        }

                        public static C2201831BFl LJIIZILJ(Cursor cursor) {
                            long j;
                            String string;
                            String string2;
                            String string3;
                            String string4;
                            Integer numValueOf;
                            Integer numValueOf2;
                            Integer numValueOf3;
                            Integer numValueOf4;
                            String string5;
                            String string6;
                            String string7;
                            String string8;
                            Integer numValueOf5;
                            Integer numValueOf6;
                            Integer numValueOf7;
                            String string9;
                            String string10;
                            String string11;
                            Integer numValueOf8;
                            int columnIndex = cursor.getColumnIndex("UID");
                            int columnIndex2 = cursor.getColumnIndex("AVATAR_THUMB");
                            int columnIndex3 = cursor.getColumnIndex("AVATAR_MEDIUM");
                            int columnIndex4 = cursor.getColumnIndex("NICK_NAME");
                            int columnIndex5 = cursor.getColumnIndex("UNIQUE_ID");
                            int columnIndex6 = cursor.getColumnIndex("FOLLOW_STATUS");
                            int columnIndex7 = cursor.getColumnIndex("FOLLOWER_COUNT");
                            int columnIndex8 = cursor.getColumnIndex("FOLLOWING_COUNT");
                            int columnIndex9 = cursor.getColumnIndex("MAF_STATUS");
                            int columnIndex10 = cursor.getColumnIndex("REC_TYPE");
                            int columnIndex11 = cursor.getColumnIndex("UPDATE_TIME");
                            int columnIndex12 = cursor.getColumnIndex("SORT_WEIGHT");
                            int columnIndex13 = cursor.getColumnIndex("INITIAL_LETTER");
                            int columnIndex14 = cursor.getColumnIndex("EXTRA");
                            int columnIndex15 = cursor.getColumnIndex("FOLLOWER_STATUS");
                            int columnIndex16 = cursor.getColumnIndex("BLOCK");
                            int columnIndex17 = cursor.getColumnIndex("BLOCKED_BY");
                            int columnIndex18 = cursor.getColumnIndex("RECOMMEND_REASON");
                            int columnIndex19 = cursor.getColumnIndex("ENTERPRISE_USER_VERIFY_REASON");
                            int columnIndex20 = cursor.getColumnIndex("USER_VERIFY_REASON");
                            int columnIndex21 = cursor.getColumnIndex("USER_VERIFY_TYPE");
                            int columnIndex22 = cursor.getColumnIndex("DELETED");
                            long j2 = 0;
                            if (columnIndex == -1) {
                                j = 0;
                            } else {
                                j = cursor.getLong(columnIndex);
                            }
                            Integer numValueOf9 = null;
                            if (columnIndex2 != -1 && !cursor.isNull(columnIndex2)) {
                                string = cursor.getString(columnIndex2);
                            } else {
                                string = null;
                            }
                            if (columnIndex3 != -1 && !cursor.isNull(columnIndex3)) {
                                string2 = cursor.getString(columnIndex3);
                            } else {
                                string2 = null;
                            }
                            if (columnIndex4 != -1 && !cursor.isNull(columnIndex4)) {
                                string3 = cursor.getString(columnIndex4);
                            } else {
                                string3 = null;
                            }
                            if (columnIndex5 != -1 && !cursor.isNull(columnIndex5)) {
                                string4 = cursor.getString(columnIndex5);
                            } else {
                                string4 = null;
                            }
                            if (columnIndex6 != -1 && !cursor.isNull(columnIndex6)) {
                                numValueOf = Integer.valueOf(cursor.getInt(columnIndex6));
                            } else {
                                numValueOf = null;
                            }
                            if (columnIndex7 != -1 && !cursor.isNull(columnIndex7)) {
                                numValueOf2 = Integer.valueOf(cursor.getInt(columnIndex7));
                            } else {
                                numValueOf2 = null;
                            }
                            if (columnIndex8 != -1 && !cursor.isNull(columnIndex8)) {
                                numValueOf3 = Integer.valueOf(cursor.getInt(columnIndex8));
                            } else {
                                numValueOf3 = null;
                            }
                            if (columnIndex9 != -1 && !cursor.isNull(columnIndex9)) {
                                numValueOf4 = Integer.valueOf(cursor.getInt(columnIndex9));
                            } else {
                                numValueOf4 = null;
                            }
                            if (columnIndex10 != -1 && !cursor.isNull(columnIndex10)) {
                                string5 = cursor.getString(columnIndex10);
                            } else {
                                string5 = null;
                            }
                            if (columnIndex11 != -1) {
                                j2 = cursor.getLong(columnIndex11);
                            }
                            if (columnIndex12 != -1 && !cursor.isNull(columnIndex12)) {
                                string6 = cursor.getString(columnIndex12);
                            } else {
                                string6 = null;
                            }
                            if (columnIndex13 != -1 && !cursor.isNull(columnIndex13)) {
                                string7 = cursor.getString(columnIndex13);
                            } else {
                                string7 = null;
                            }
                            if (columnIndex14 != -1 && !cursor.isNull(columnIndex14)) {
                                string8 = cursor.getString(columnIndex14);
                            } else {
                                string8 = null;
                            }
                            if (columnIndex15 != -1 && !cursor.isNull(columnIndex15)) {
                                numValueOf5 = Integer.valueOf(cursor.getInt(columnIndex15));
                            } else {
                                numValueOf5 = null;
                            }
                            if (columnIndex16 != -1 && !cursor.isNull(columnIndex16)) {
                                numValueOf6 = Integer.valueOf(cursor.getInt(columnIndex16));
                            } else {
                                numValueOf6 = null;
                            }
                            if (columnIndex17 != -1 && !cursor.isNull(columnIndex17)) {
                                numValueOf7 = Integer.valueOf(cursor.getInt(columnIndex17));
                            } else {
                                numValueOf7 = null;
                            }
                            if (columnIndex18 != -1 && !cursor.isNull(columnIndex18)) {
                                string9 = cursor.getString(columnIndex18);
                            } else {
                                string9 = null;
                            }
                            if (columnIndex19 != -1 && !cursor.isNull(columnIndex19)) {
                                string10 = cursor.getString(columnIndex19);
                            } else {
                                string10 = null;
                            }
                            if (columnIndex20 != -1 && !cursor.isNull(columnIndex20)) {
                                string11 = cursor.getString(columnIndex20);
                            } else {
                                string11 = null;
                            }
                            if (columnIndex21 != -1 && !cursor.isNull(columnIndex21)) {
                                numValueOf8 = Integer.valueOf(cursor.getInt(columnIndex21));
                            } else {
                                numValueOf8 = null;
                            }
                            if (columnIndex22 != -1 && !cursor.isNull(columnIndex22)) {
                                numValueOf9 = Integer.valueOf(cursor.getInt(columnIndex22));
                            }
                            return new C2201831BFl(j, string, string2, string3, string4, numValueOf, numValueOf2, numValueOf3, numValueOf4, string5, j2, string6, string7, string8, numValueOf5, numValueOf6, numValueOf7, string9, string10, string11, numValueOf8, numValueOf9);
                        }

                        @Override // X.InterfaceC2201871BFp
                        public final void LIZ(List<C2201831BFl> list) {
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

                        @Override // X.InterfaceC2201871BFp
                        public final void LIZIZ(long j) {
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

                        @Override // X.InterfaceC2201871BFp
                        public final C2201831BFl LIZJ(long j) throws Throwable {
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
                            String string2;
                            String string3;
                            String string4;
                            Integer numValueOf;
                            Integer numValueOf2;
                            Integer numValueOf3;
                            Integer numValueOf4;
                            String string5;
                            String string6;
                            String string7;
                            String string8;
                            Integer numValueOf5;
                            Integer numValueOf6;
                            Integer numValueOf7;
                            String string9;
                            String string10;
                            String string11;
                            Integer numValueOf8;
                            C0VN5 c0vn5LIZLLL = C0VN5.LIZLLL(1, "SELECT * FROM IM_USER_BASE_INFO WHERE UID = ? AND MAF_STATUS = 1 AND FOLLOW_STATUS != 2");
                            c0vn5LIZLLL.LJIJ(1, j);
                            this.LIZ.assertNotSuspendingTransaction();
                            Cursor cursorLIZIZ = C0VN0.LIZIZ(this.LIZ, c0vn5LIZLLL, false);
                            try {
                                iLIZIZ = C795450VIh.LIZIZ(cursorLIZIZ, "UID");
                                iLIZIZ2 = C795450VIh.LIZIZ(cursorLIZIZ, "AVATAR_THUMB");
                                iLIZIZ3 = C795450VIh.LIZIZ(cursorLIZIZ, "AVATAR_MEDIUM");
                                iLIZIZ4 = C795450VIh.LIZIZ(cursorLIZIZ, "NICK_NAME");
                                iLIZIZ5 = C795450VIh.LIZIZ(cursorLIZIZ, "UNIQUE_ID");
                                iLIZIZ6 = C795450VIh.LIZIZ(cursorLIZIZ, "FOLLOW_STATUS");
                                iLIZIZ7 = C795450VIh.LIZIZ(cursorLIZIZ, "FOLLOWER_COUNT");
                                iLIZIZ8 = C795450VIh.LIZIZ(cursorLIZIZ, "FOLLOWING_COUNT");
                                iLIZIZ9 = C795450VIh.LIZIZ(cursorLIZIZ, "MAF_STATUS");
                                iLIZIZ10 = C795450VIh.LIZIZ(cursorLIZIZ, "REC_TYPE");
                                iLIZIZ11 = C795450VIh.LIZIZ(cursorLIZIZ, "UPDATE_TIME");
                                iLIZIZ12 = C795450VIh.LIZIZ(cursorLIZIZ, "SORT_WEIGHT");
                                iLIZIZ13 = C795450VIh.LIZIZ(cursorLIZIZ, "INITIAL_LETTER");
                                iLIZIZ14 = C795450VIh.LIZIZ(cursorLIZIZ, "EXTRA");
                            } catch (Throwable th) {
                                th = th;
                            }
                            try {
                                int iLIZIZ15 = C795450VIh.LIZIZ(cursorLIZIZ, "FOLLOWER_STATUS");
                                int iLIZIZ16 = C795450VIh.LIZIZ(cursorLIZIZ, "BLOCK");
                                int iLIZIZ17 = C795450VIh.LIZIZ(cursorLIZIZ, "BLOCKED_BY");
                                int iLIZIZ18 = C795450VIh.LIZIZ(cursorLIZIZ, "RECOMMEND_REASON");
                                int iLIZIZ19 = C795450VIh.LIZIZ(cursorLIZIZ, "ENTERPRISE_USER_VERIFY_REASON");
                                int iLIZIZ20 = C795450VIh.LIZIZ(cursorLIZIZ, "USER_VERIFY_REASON");
                                int iLIZIZ21 = C795450VIh.LIZIZ(cursorLIZIZ, "USER_VERIFY_TYPE");
                                int iLIZIZ22 = C795450VIh.LIZIZ(cursorLIZIZ, "DELETED");
                                C2201831BFl c2201831BFl = null;
                                Integer numValueOf9 = null;
                                if (cursorLIZIZ.moveToFirst()) {
                                    long j2 = cursorLIZIZ.getLong(iLIZIZ);
                                    if (cursorLIZIZ.isNull(iLIZIZ2)) {
                                        string = null;
                                    } else {
                                        string = cursorLIZIZ.getString(iLIZIZ2);
                                    }
                                    if (cursorLIZIZ.isNull(iLIZIZ3)) {
                                        string2 = null;
                                    } else {
                                        string2 = cursorLIZIZ.getString(iLIZIZ3);
                                    }
                                    if (cursorLIZIZ.isNull(iLIZIZ4)) {
                                        string3 = null;
                                    } else {
                                        string3 = cursorLIZIZ.getString(iLIZIZ4);
                                    }
                                    if (cursorLIZIZ.isNull(iLIZIZ5)) {
                                        string4 = null;
                                    } else {
                                        string4 = cursorLIZIZ.getString(iLIZIZ5);
                                    }
                                    if (cursorLIZIZ.isNull(iLIZIZ6)) {
                                        numValueOf = null;
                                    } else {
                                        numValueOf = Integer.valueOf(cursorLIZIZ.getInt(iLIZIZ6));
                                    }
                                    if (cursorLIZIZ.isNull(iLIZIZ7)) {
                                        numValueOf2 = null;
                                    } else {
                                        numValueOf2 = Integer.valueOf(cursorLIZIZ.getInt(iLIZIZ7));
                                    }
                                    if (cursorLIZIZ.isNull(iLIZIZ8)) {
                                        numValueOf3 = null;
                                    } else {
                                        numValueOf3 = Integer.valueOf(cursorLIZIZ.getInt(iLIZIZ8));
                                    }
                                    if (cursorLIZIZ.isNull(iLIZIZ9)) {
                                        numValueOf4 = null;
                                    } else {
                                        numValueOf4 = Integer.valueOf(cursorLIZIZ.getInt(iLIZIZ9));
                                    }
                                    if (cursorLIZIZ.isNull(iLIZIZ10)) {
                                        string5 = null;
                                    } else {
                                        string5 = cursorLIZIZ.getString(iLIZIZ10);
                                    }
                                    long j3 = cursorLIZIZ.getLong(iLIZIZ11);
                                    if (cursorLIZIZ.isNull(iLIZIZ12)) {
                                        string6 = null;
                                    } else {
                                        string6 = cursorLIZIZ.getString(iLIZIZ12);
                                    }
                                    if (cursorLIZIZ.isNull(iLIZIZ13)) {
                                        string7 = null;
                                    } else {
                                        string7 = cursorLIZIZ.getString(iLIZIZ13);
                                    }
                                    if (cursorLIZIZ.isNull(iLIZIZ14)) {
                                        string8 = null;
                                    } else {
                                        string8 = cursorLIZIZ.getString(iLIZIZ14);
                                    }
                                    if (cursorLIZIZ.isNull(iLIZIZ15)) {
                                        numValueOf5 = null;
                                    } else {
                                        numValueOf5 = Integer.valueOf(cursorLIZIZ.getInt(iLIZIZ15));
                                    }
                                    if (cursorLIZIZ.isNull(iLIZIZ16)) {
                                        numValueOf6 = null;
                                    } else {
                                        numValueOf6 = Integer.valueOf(cursorLIZIZ.getInt(iLIZIZ16));
                                    }
                                    if (cursorLIZIZ.isNull(iLIZIZ17)) {
                                        numValueOf7 = null;
                                    } else {
                                        numValueOf7 = Integer.valueOf(cursorLIZIZ.getInt(iLIZIZ17));
                                    }
                                    if (cursorLIZIZ.isNull(iLIZIZ18)) {
                                        string9 = null;
                                    } else {
                                        string9 = cursorLIZIZ.getString(iLIZIZ18);
                                    }
                                    if (cursorLIZIZ.isNull(iLIZIZ19)) {
                                        string10 = null;
                                    } else {
                                        string10 = cursorLIZIZ.getString(iLIZIZ19);
                                    }
                                    if (cursorLIZIZ.isNull(iLIZIZ20)) {
                                        string11 = null;
                                    } else {
                                        string11 = cursorLIZIZ.getString(iLIZIZ20);
                                    }
                                    if (cursorLIZIZ.isNull(iLIZIZ21)) {
                                        numValueOf8 = null;
                                    } else {
                                        numValueOf8 = Integer.valueOf(cursorLIZIZ.getInt(iLIZIZ21));
                                    }
                                    if (!cursorLIZIZ.isNull(iLIZIZ22)) {
                                        numValueOf9 = Integer.valueOf(cursorLIZIZ.getInt(iLIZIZ22));
                                    }
                                    c2201831BFl = new C2201831BFl(j2, string, string2, string3, string4, numValueOf, numValueOf2, numValueOf3, numValueOf4, string5, j3, string6, string7, string8, numValueOf5, numValueOf6, numValueOf7, string9, string10, string11, numValueOf8, numValueOf9);
                                }
                                cursorLIZIZ.close();
                                c0vn5LIZLLL.release();
                                return c2201831BFl;
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

                        @Override // X.InterfaceC2201871BFp
                        public final void LIZLLL(long j) {
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

                        @Override // X.InterfaceC2201871BFp
                        public final void LJII(C2201831BFl c2201831BFl) {
                            this.LIZ.assertNotSuspendingTransaction();
                            this.LIZ.beginTransaction();
                            try {
                                insert(c2201831BFl);
                                this.LIZ.setTransactionSuccessful();
                                this.LIZ.endTransaction();
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                this.LIZ.endTransaction();
                                throw th;
                            }
                        }

                        @Override // X.InterfaceC2201871BFp
                        public final void LJIIIIZZ(long j) {
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

                        @Override // X.InterfaceC2201871BFp
                        public final List LJIIIZ(C0VN1 c0vn1) {
                            this.LIZ.assertNotSuspendingTransaction();
                            Cursor cursorLIZIZ = C0VN0.LIZIZ(this.LIZ, c0vn1, false);
                            try {
                                ArrayList arrayList = new ArrayList(cursorLIZIZ.getCount());
                                while (cursorLIZIZ.moveToNext()) {
                                    arrayList.add(LJIIZILJ(cursorLIZIZ));
                                }
                                cursorLIZIZ.close();
                                return arrayList;
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                cursorLIZIZ.close();
                                throw th;
                            }
                        }

                        @Override // X.InterfaceC2201871BFp
                        public final void LJIIJ(long j) {
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

                        @Override // X.InterfaceC2201871BFp
                        public final List LJIIJJI(C0VN1 c0vn1) {
                            this.LIZ.assertNotSuspendingTransaction();
                            Cursor cursorLIZIZ = C0VN0.LIZIZ(this.LIZ, c0vn1, false);
                            try {
                                ArrayList arrayList = new ArrayList(cursorLIZIZ.getCount());
                                while (cursorLIZIZ.moveToNext()) {
                                    arrayList.add(LJIIZILJ(cursorLIZIZ));
                                }
                                cursorLIZIZ.close();
                                return arrayList;
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                cursorLIZIZ.close();
                                throw th;
                            }
                        }

                        @Override // X.InterfaceC2201871BFp
                        public final C2201831BFl LJIIL(long j) throws Throwable {
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
                            String string2;
                            String string3;
                            String string4;
                            Integer numValueOf;
                            Integer numValueOf2;
                            Integer numValueOf3;
                            Integer numValueOf4;
                            String string5;
                            String string6;
                            String string7;
                            String string8;
                            Integer numValueOf5;
                            Integer numValueOf6;
                            Integer numValueOf7;
                            String string9;
                            String string10;
                            String string11;
                            Integer numValueOf8;
                            C0VN5 c0vn5LIZLLL = C0VN5.LIZLLL(1, "SELECT * FROM IM_USER_BASE_INFO WHERE UID = ?");
                            c0vn5LIZLLL.LJIJ(1, j);
                            this.LIZ.assertNotSuspendingTransaction();
                            Cursor cursorLIZIZ = C0VN0.LIZIZ(this.LIZ, c0vn5LIZLLL, false);
                            try {
                                iLIZIZ = C795450VIh.LIZIZ(cursorLIZIZ, "UID");
                                iLIZIZ2 = C795450VIh.LIZIZ(cursorLIZIZ, "AVATAR_THUMB");
                                iLIZIZ3 = C795450VIh.LIZIZ(cursorLIZIZ, "AVATAR_MEDIUM");
                                iLIZIZ4 = C795450VIh.LIZIZ(cursorLIZIZ, "NICK_NAME");
                                iLIZIZ5 = C795450VIh.LIZIZ(cursorLIZIZ, "UNIQUE_ID");
                                iLIZIZ6 = C795450VIh.LIZIZ(cursorLIZIZ, "FOLLOW_STATUS");
                                iLIZIZ7 = C795450VIh.LIZIZ(cursorLIZIZ, "FOLLOWER_COUNT");
                                iLIZIZ8 = C795450VIh.LIZIZ(cursorLIZIZ, "FOLLOWING_COUNT");
                                iLIZIZ9 = C795450VIh.LIZIZ(cursorLIZIZ, "MAF_STATUS");
                                iLIZIZ10 = C795450VIh.LIZIZ(cursorLIZIZ, "REC_TYPE");
                                iLIZIZ11 = C795450VIh.LIZIZ(cursorLIZIZ, "UPDATE_TIME");
                                iLIZIZ12 = C795450VIh.LIZIZ(cursorLIZIZ, "SORT_WEIGHT");
                                iLIZIZ13 = C795450VIh.LIZIZ(cursorLIZIZ, "INITIAL_LETTER");
                                iLIZIZ14 = C795450VIh.LIZIZ(cursorLIZIZ, "EXTRA");
                            } catch (Throwable th) {
                                th = th;
                            }
                            try {
                                int iLIZIZ15 = C795450VIh.LIZIZ(cursorLIZIZ, "FOLLOWER_STATUS");
                                int iLIZIZ16 = C795450VIh.LIZIZ(cursorLIZIZ, "BLOCK");
                                int iLIZIZ17 = C795450VIh.LIZIZ(cursorLIZIZ, "BLOCKED_BY");
                                int iLIZIZ18 = C795450VIh.LIZIZ(cursorLIZIZ, "RECOMMEND_REASON");
                                int iLIZIZ19 = C795450VIh.LIZIZ(cursorLIZIZ, "ENTERPRISE_USER_VERIFY_REASON");
                                int iLIZIZ20 = C795450VIh.LIZIZ(cursorLIZIZ, "USER_VERIFY_REASON");
                                int iLIZIZ21 = C795450VIh.LIZIZ(cursorLIZIZ, "USER_VERIFY_TYPE");
                                int iLIZIZ22 = C795450VIh.LIZIZ(cursorLIZIZ, "DELETED");
                                C2201831BFl c2201831BFl = null;
                                Integer numValueOf9 = null;
                                if (cursorLIZIZ.moveToFirst()) {
                                    long j2 = cursorLIZIZ.getLong(iLIZIZ);
                                    if (cursorLIZIZ.isNull(iLIZIZ2)) {
                                        string = null;
                                    } else {
                                        string = cursorLIZIZ.getString(iLIZIZ2);
                                    }
                                    if (cursorLIZIZ.isNull(iLIZIZ3)) {
                                        string2 = null;
                                    } else {
                                        string2 = cursorLIZIZ.getString(iLIZIZ3);
                                    }
                                    if (cursorLIZIZ.isNull(iLIZIZ4)) {
                                        string3 = null;
                                    } else {
                                        string3 = cursorLIZIZ.getString(iLIZIZ4);
                                    }
                                    if (cursorLIZIZ.isNull(iLIZIZ5)) {
                                        string4 = null;
                                    } else {
                                        string4 = cursorLIZIZ.getString(iLIZIZ5);
                                    }
                                    if (cursorLIZIZ.isNull(iLIZIZ6)) {
                                        numValueOf = null;
                                    } else {
                                        numValueOf = Integer.valueOf(cursorLIZIZ.getInt(iLIZIZ6));
                                    }
                                    if (cursorLIZIZ.isNull(iLIZIZ7)) {
                                        numValueOf2 = null;
                                    } else {
                                        numValueOf2 = Integer.valueOf(cursorLIZIZ.getInt(iLIZIZ7));
                                    }
                                    if (cursorLIZIZ.isNull(iLIZIZ8)) {
                                        numValueOf3 = null;
                                    } else {
                                        numValueOf3 = Integer.valueOf(cursorLIZIZ.getInt(iLIZIZ8));
                                    }
                                    if (cursorLIZIZ.isNull(iLIZIZ9)) {
                                        numValueOf4 = null;
                                    } else {
                                        numValueOf4 = Integer.valueOf(cursorLIZIZ.getInt(iLIZIZ9));
                                    }
                                    if (cursorLIZIZ.isNull(iLIZIZ10)) {
                                        string5 = null;
                                    } else {
                                        string5 = cursorLIZIZ.getString(iLIZIZ10);
                                    }
                                    long j3 = cursorLIZIZ.getLong(iLIZIZ11);
                                    if (cursorLIZIZ.isNull(iLIZIZ12)) {
                                        string6 = null;
                                    } else {
                                        string6 = cursorLIZIZ.getString(iLIZIZ12);
                                    }
                                    if (cursorLIZIZ.isNull(iLIZIZ13)) {
                                        string7 = null;
                                    } else {
                                        string7 = cursorLIZIZ.getString(iLIZIZ13);
                                    }
                                    if (cursorLIZIZ.isNull(iLIZIZ14)) {
                                        string8 = null;
                                    } else {
                                        string8 = cursorLIZIZ.getString(iLIZIZ14);
                                    }
                                    if (cursorLIZIZ.isNull(iLIZIZ15)) {
                                        numValueOf5 = null;
                                    } else {
                                        numValueOf5 = Integer.valueOf(cursorLIZIZ.getInt(iLIZIZ15));
                                    }
                                    if (cursorLIZIZ.isNull(iLIZIZ16)) {
                                        numValueOf6 = null;
                                    } else {
                                        numValueOf6 = Integer.valueOf(cursorLIZIZ.getInt(iLIZIZ16));
                                    }
                                    if (cursorLIZIZ.isNull(iLIZIZ17)) {
                                        numValueOf7 = null;
                                    } else {
                                        numValueOf7 = Integer.valueOf(cursorLIZIZ.getInt(iLIZIZ17));
                                    }
                                    if (cursorLIZIZ.isNull(iLIZIZ18)) {
                                        string9 = null;
                                    } else {
                                        string9 = cursorLIZIZ.getString(iLIZIZ18);
                                    }
                                    if (cursorLIZIZ.isNull(iLIZIZ19)) {
                                        string10 = null;
                                    } else {
                                        string10 = cursorLIZIZ.getString(iLIZIZ19);
                                    }
                                    if (cursorLIZIZ.isNull(iLIZIZ20)) {
                                        string11 = null;
                                    } else {
                                        string11 = cursorLIZIZ.getString(iLIZIZ20);
                                    }
                                    if (cursorLIZIZ.isNull(iLIZIZ21)) {
                                        numValueOf8 = null;
                                    } else {
                                        numValueOf8 = Integer.valueOf(cursorLIZIZ.getInt(iLIZIZ21));
                                    }
                                    if (!cursorLIZIZ.isNull(iLIZIZ22)) {
                                        numValueOf9 = Integer.valueOf(cursorLIZIZ.getInt(iLIZIZ22));
                                    }
                                    c2201831BFl = new C2201831BFl(j2, string, string2, string3, string4, numValueOf, numValueOf2, numValueOf3, numValueOf4, string5, j3, string6, string7, string8, numValueOf5, numValueOf6, numValueOf7, string9, string10, string11, numValueOf8, numValueOf9);
                                }
                                cursorLIZIZ.close();
                                c0vn5LIZLLL.release();
                                return c2201831BFl;
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

                        @Override // X.InterfaceC2201871BFp
                        public final List<Long> LJIILIIL(long j) {
                            C0VN5 c0vn5LIZLLL = C0VN5.LIZLLL(1, "SELECT UID FROM IM_USER_BASE_INFO WHERE UPDATE_TIME < ?");
                            c0vn5LIZLLL.LJIJ(1, j);
                            this.LIZ.assertNotSuspendingTransaction();
                            Cursor cursorLIZIZ = C0VN0.LIZIZ(this.LIZ, c0vn5LIZLLL, false);
                            try {
                                ArrayList arrayList = new ArrayList(cursorLIZIZ.getCount());
                                while (cursorLIZIZ.moveToNext()) {
                                    arrayList.add(Long.valueOf(cursorLIZIZ.getLong(0)));
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

                        @Override // X.InterfaceC2201871BFp
                        public final void LJIILLIIL(C796840VNq c796840VNq) {
                            this.LIZ.assertNotSuspendingTransaction();
                            this.LIZ.beginTransaction();
                            try {
                                handle(c796840VNq);
                                this.LIZ.setTransactionSuccessful();
                                this.LIZ.endTransaction();
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                this.LIZ.endTransaction();
                                throw th;
                            }
                        }
                    };
                }
                c796750VNh = this.LLIZ;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return c796750VNh;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.0VNX] */
    @Override // com.ss.android.ugc.aweme.im.contacts.impl.data.base.IMContactDatabase
    public final InterfaceC808330VnL LIZIZ() {
        C0VNX c0vnx;
        if (this.LLJ != null) {
            return this.LLJ;
        }
        synchronized (this) {
            try {
                if (this.LLJ == null) {
                    this.LLJ = new InterfaceC808330VnL(this) { // from class: X.0VNX
                        public final AbstractC796540VMm LIZ;
                        public final C1BG7 LIZIZ;
                        public final C0VNV LIZJ;

                        /* JADX WARN: Type inference failed for: r0v0, types: [X.1BG7] */
                        /* JADX WARN: Type inference failed for: r0v2, types: [X.0VNV] */
                        {
                            this.LIZ = this;
                            this.LIZIZ = new AbstractC796330VLr<C1BGM>(this) { // from class: X.1BG7
                                @Override // X.AbstractC795470VIj
                                public final String createQuery() {
                                    return "INSERT OR REPLACE INTO `IM_USER_BIZ_INFO` (`UID`,`SHARE_FILTER_TYPE`,`AFFINITY_SCORE`,`UPDATE_TIME`,`USER_B2C_ACCOUNT_INFO`,`CHAT_BOT_INFO`,`CAMERA_INFO`,`ALLOW_SINGLE_CHAT_SCREENSHOT`,`GROUP_CHAT_PERMISSION_INFO`,`ACTIVITY_STATUS_SETTING`,`CHAT_BUBBLE_ID`,`UNLOCKED_BUBBLE_IDS`,`VOICE_CALL_INFO`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)";
                                }

                                @Override // X.AbstractC796330VLr
                                public final void bind(InterfaceC796340VLs interfaceC796340VLs, C1BGM c1bgm) {
                                    C1BGM c1bgm2 = c1bgm;
                                    interfaceC796340VLs.LJIJ(1, c1bgm2.LIZ);
                                    if (c1bgm2.LIZIZ == null) {
                                        interfaceC796340VLs.LLD(2);
                                    } else {
                                        interfaceC796340VLs.LJIJ(2, r0.intValue());
                                    }
                                    Double d = c1bgm2.LIZJ;
                                    if (d == null) {
                                        interfaceC796340VLs.LLD(3);
                                    } else {
                                        interfaceC796340VLs.LJJI(d.doubleValue(), 3);
                                    }
                                    Long l = c1bgm2.LIZLLL;
                                    if (l == null) {
                                        interfaceC796340VLs.LLD(4);
                                    } else {
                                        interfaceC796340VLs.LJIJ(4, l.longValue());
                                    }
                                    String str = c1bgm2.LJ;
                                    if (str == null) {
                                        interfaceC796340VLs.LLD(5);
                                    } else {
                                        interfaceC796340VLs.LJIILIIL(5, str);
                                    }
                                    String str2 = c1bgm2.LJFF;
                                    if (str2 == null) {
                                        interfaceC796340VLs.LLD(6);
                                    } else {
                                        interfaceC796340VLs.LJIILIIL(6, str2);
                                    }
                                    String str3 = c1bgm2.LJI;
                                    if (str3 == null) {
                                        interfaceC796340VLs.LLD(7);
                                    } else {
                                        interfaceC796340VLs.LJIILIIL(7, str3);
                                    }
                                    if (c1bgm2.LJII == null) {
                                        interfaceC796340VLs.LLD(8);
                                    } else {
                                        interfaceC796340VLs.LJIJ(8, r0.intValue());
                                    }
                                    String str4 = c1bgm2.LJIIIIZZ;
                                    if (str4 == null) {
                                        interfaceC796340VLs.LLD(9);
                                    } else {
                                        interfaceC796340VLs.LJIILIIL(9, str4);
                                    }
                                    if (c1bgm2.LJIIIZ == null) {
                                        interfaceC796340VLs.LLD(10);
                                    } else {
                                        interfaceC796340VLs.LJIJ(10, r0.intValue());
                                    }
                                    Long l2 = c1bgm2.LJIIJ;
                                    if (l2 == null) {
                                        interfaceC796340VLs.LLD(11);
                                    } else {
                                        interfaceC796340VLs.LJIJ(11, l2.longValue());
                                    }
                                    String str5 = c1bgm2.LJIIJJI;
                                    if (str5 == null) {
                                        interfaceC796340VLs.LLD(12);
                                    } else {
                                        interfaceC796340VLs.LJIILIIL(12, str5);
                                    }
                                    String str6 = c1bgm2.LJIIL;
                                    if (str6 == null) {
                                        interfaceC796340VLs.LLD(13);
                                    } else {
                                        interfaceC796340VLs.LJIILIIL(13, str6);
                                    }
                                }
                            };
                            new AbstractC796320VLq<C1BGM>(this) { // from class: X.1BG8
                                @Override // X.AbstractC796320VLq, X.AbstractC795470VIj
                                public final String createQuery() {
                                    return "UPDATE OR ABORT `IM_USER_BIZ_INFO` SET `UID` = ?,`SHARE_FILTER_TYPE` = ?,`AFFINITY_SCORE` = ?,`UPDATE_TIME` = ?,`USER_B2C_ACCOUNT_INFO` = ?,`CHAT_BOT_INFO` = ?,`CAMERA_INFO` = ?,`ALLOW_SINGLE_CHAT_SCREENSHOT` = ?,`GROUP_CHAT_PERMISSION_INFO` = ?,`ACTIVITY_STATUS_SETTING` = ?,`CHAT_BUBBLE_ID` = ?,`UNLOCKED_BUBBLE_IDS` = ?,`VOICE_CALL_INFO` = ? WHERE `UID` = ?";
                                }

                                @Override // X.AbstractC796320VLq
                                public final void bind(InterfaceC796340VLs interfaceC796340VLs, C1BGM c1bgm) {
                                    C1BGM c1bgm2 = c1bgm;
                                    interfaceC796340VLs.LJIJ(1, c1bgm2.LIZ);
                                    if (c1bgm2.LIZIZ == null) {
                                        interfaceC796340VLs.LLD(2);
                                    } else {
                                        interfaceC796340VLs.LJIJ(2, r0.intValue());
                                    }
                                    Double d = c1bgm2.LIZJ;
                                    if (d == null) {
                                        interfaceC796340VLs.LLD(3);
                                    } else {
                                        interfaceC796340VLs.LJJI(d.doubleValue(), 3);
                                    }
                                    Long l = c1bgm2.LIZLLL;
                                    if (l == null) {
                                        interfaceC796340VLs.LLD(4);
                                    } else {
                                        interfaceC796340VLs.LJIJ(4, l.longValue());
                                    }
                                    String str = c1bgm2.LJ;
                                    if (str == null) {
                                        interfaceC796340VLs.LLD(5);
                                    } else {
                                        interfaceC796340VLs.LJIILIIL(5, str);
                                    }
                                    String str2 = c1bgm2.LJFF;
                                    if (str2 == null) {
                                        interfaceC796340VLs.LLD(6);
                                    } else {
                                        interfaceC796340VLs.LJIILIIL(6, str2);
                                    }
                                    String str3 = c1bgm2.LJI;
                                    if (str3 == null) {
                                        interfaceC796340VLs.LLD(7);
                                    } else {
                                        interfaceC796340VLs.LJIILIIL(7, str3);
                                    }
                                    if (c1bgm2.LJII == null) {
                                        interfaceC796340VLs.LLD(8);
                                    } else {
                                        interfaceC796340VLs.LJIJ(8, r0.intValue());
                                    }
                                    String str4 = c1bgm2.LJIIIIZZ;
                                    if (str4 == null) {
                                        interfaceC796340VLs.LLD(9);
                                    } else {
                                        interfaceC796340VLs.LJIILIIL(9, str4);
                                    }
                                    if (c1bgm2.LJIIIZ == null) {
                                        interfaceC796340VLs.LLD(10);
                                    } else {
                                        interfaceC796340VLs.LJIJ(10, r0.intValue());
                                    }
                                    Long l2 = c1bgm2.LJIIJ;
                                    if (l2 == null) {
                                        interfaceC796340VLs.LLD(11);
                                    } else {
                                        interfaceC796340VLs.LJIJ(11, l2.longValue());
                                    }
                                    String str5 = c1bgm2.LJIIJJI;
                                    if (str5 == null) {
                                        interfaceC796340VLs.LLD(12);
                                    } else {
                                        interfaceC796340VLs.LJIILIIL(12, str5);
                                    }
                                    String str6 = c1bgm2.LJIIL;
                                    if (str6 == null) {
                                        interfaceC796340VLs.LLD(13);
                                    } else {
                                        interfaceC796340VLs.LJIILIIL(13, str6);
                                    }
                                    interfaceC796340VLs.LJIJ(14, c1bgm2.LIZ);
                                }
                            };
                            this.LIZJ = new AbstractC795470VIj(this) { // from class: X.0VNV
                                @Override // X.AbstractC795470VIj
                                public final String createQuery() {
                                    return "DELETE FROM IM_USER_BIZ_INFO WHERE UID = ?";
                                }
                            };
                            new AbstractC795470VIj(this) { // from class: X.0VNW
                                @Override // X.AbstractC795470VIj
                                public final String createQuery() {
                                    return "DELETE FROM IM_USER_BIZ_INFO";
                                }
                            };
                        }

                        @Override // X.InterfaceC808330VnL
                        public final void LIZ(List<C1BGM> list) {
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

                        @Override // X.InterfaceC808330VnL
                        public final void LIZIZ(long j) {
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

                        @Override // X.InterfaceC808330VnL
                        public final void LIZJ(C1BGM c1bgm) {
                            this.LIZ.assertNotSuspendingTransaction();
                            this.LIZ.beginTransaction();
                            try {
                                insert(c1bgm);
                                this.LIZ.setTransactionSuccessful();
                                this.LIZ.endTransaction();
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                this.LIZ.endTransaction();
                                throw th;
                            }
                        }

                        @Override // X.InterfaceC808330VnL
                        public final List<C1BGM> LIZLLL(List<Long> list) throws Throwable {
                            Integer numValueOf;
                            Double dValueOf;
                            Long lValueOf;
                            String string;
                            String string2;
                            String string3;
                            Integer numValueOf2;
                            String string4;
                            Integer numValueOf3;
                            Long lValueOf2;
                            String string5;
                            StringBuilder sb = new StringBuilder();
                            sb.append("SELECT * FROM IM_USER_BIZ_INFO WHERE UID IN (");
                            ArrayList arrayList = (ArrayList) list;
                            int size = arrayList.size();
                            C0VIY.LIZ(sb, size);
                            sb.append(")");
                            C0VN5 c0vn5LIZLLL = C0VN5.LIZLLL(size, sb.toString());
                            Iterator it2 = arrayList.iterator();
                            int i = 1;
                            while (it2.hasNext()) {
                                c0vn5LIZLLL.LJIJ(i, ((Long) it2.next()).longValue());
                                i++;
                            }
                            this.LIZ.assertNotSuspendingTransaction();
                            Cursor cursorLIZIZ = C0VN0.LIZIZ(this.LIZ, c0vn5LIZLLL, false);
                            try {
                                int iLIZIZ = C795450VIh.LIZIZ(cursorLIZIZ, "UID");
                                int iLIZIZ2 = C795450VIh.LIZIZ(cursorLIZIZ, "SHARE_FILTER_TYPE");
                                int iLIZIZ3 = C795450VIh.LIZIZ(cursorLIZIZ, "AFFINITY_SCORE");
                                int iLIZIZ4 = C795450VIh.LIZIZ(cursorLIZIZ, "UPDATE_TIME");
                                int iLIZIZ5 = C795450VIh.LIZIZ(cursorLIZIZ, "USER_B2C_ACCOUNT_INFO");
                                int iLIZIZ6 = C795450VIh.LIZIZ(cursorLIZIZ, "CHAT_BOT_INFO");
                                int iLIZIZ7 = C795450VIh.LIZIZ(cursorLIZIZ, "CAMERA_INFO");
                                int iLIZIZ8 = C795450VIh.LIZIZ(cursorLIZIZ, "ALLOW_SINGLE_CHAT_SCREENSHOT");
                                int iLIZIZ9 = C795450VIh.LIZIZ(cursorLIZIZ, "GROUP_CHAT_PERMISSION_INFO");
                                int iLIZIZ10 = C795450VIh.LIZIZ(cursorLIZIZ, "ACTIVITY_STATUS_SETTING");
                                int iLIZIZ11 = C795450VIh.LIZIZ(cursorLIZIZ, "CHAT_BUBBLE_ID");
                                int iLIZIZ12 = C795450VIh.LIZIZ(cursorLIZIZ, "UNLOCKED_BUBBLE_IDS");
                                int iLIZIZ13 = C795450VIh.LIZIZ(cursorLIZIZ, "VOICE_CALL_INFO");
                                try {
                                    ArrayList arrayList2 = new ArrayList(cursorLIZIZ.getCount());
                                    while (cursorLIZIZ.moveToNext()) {
                                        long j = cursorLIZIZ.getLong(iLIZIZ);
                                        String string6 = null;
                                        if (cursorLIZIZ.isNull(iLIZIZ2)) {
                                            numValueOf = null;
                                        } else {
                                            numValueOf = Integer.valueOf(cursorLIZIZ.getInt(iLIZIZ2));
                                        }
                                        if (cursorLIZIZ.isNull(iLIZIZ3)) {
                                            dValueOf = null;
                                        } else {
                                            dValueOf = Double.valueOf(cursorLIZIZ.getDouble(iLIZIZ3));
                                        }
                                        if (cursorLIZIZ.isNull(iLIZIZ4)) {
                                            lValueOf = null;
                                        } else {
                                            lValueOf = Long.valueOf(cursorLIZIZ.getLong(iLIZIZ4));
                                        }
                                        if (cursorLIZIZ.isNull(iLIZIZ5)) {
                                            string = null;
                                        } else {
                                            string = cursorLIZIZ.getString(iLIZIZ5);
                                        }
                                        if (cursorLIZIZ.isNull(iLIZIZ6)) {
                                            string2 = null;
                                        } else {
                                            string2 = cursorLIZIZ.getString(iLIZIZ6);
                                        }
                                        if (cursorLIZIZ.isNull(iLIZIZ7)) {
                                            string3 = null;
                                        } else {
                                            string3 = cursorLIZIZ.getString(iLIZIZ7);
                                        }
                                        if (cursorLIZIZ.isNull(iLIZIZ8)) {
                                            numValueOf2 = null;
                                        } else {
                                            numValueOf2 = Integer.valueOf(cursorLIZIZ.getInt(iLIZIZ8));
                                        }
                                        if (cursorLIZIZ.isNull(iLIZIZ9)) {
                                            string4 = null;
                                        } else {
                                            string4 = cursorLIZIZ.getString(iLIZIZ9);
                                        }
                                        if (cursorLIZIZ.isNull(iLIZIZ10)) {
                                            numValueOf3 = null;
                                        } else {
                                            numValueOf3 = Integer.valueOf(cursorLIZIZ.getInt(iLIZIZ10));
                                        }
                                        if (cursorLIZIZ.isNull(iLIZIZ11)) {
                                            lValueOf2 = null;
                                        } else {
                                            lValueOf2 = Long.valueOf(cursorLIZIZ.getLong(iLIZIZ11));
                                        }
                                        if (cursorLIZIZ.isNull(iLIZIZ12)) {
                                            string5 = null;
                                        } else {
                                            string5 = cursorLIZIZ.getString(iLIZIZ12);
                                        }
                                        if (!cursorLIZIZ.isNull(iLIZIZ13)) {
                                            string6 = cursorLIZIZ.getString(iLIZIZ13);
                                        }
                                        arrayList2.add(new C1BGM(j, numValueOf, dValueOf, lValueOf, string, string2, string3, numValueOf2, string4, numValueOf3, lValueOf2, string5, string6));
                                    }
                                    cursorLIZIZ.close();
                                    c0vn5LIZLLL.release();
                                    return arrayList2;
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

                        @Override // X.InterfaceC808330VnL
                        public final void LJ(List<Long> list) {
                            this.LIZ.assertNotSuspendingTransaction();
                            StringBuilder sb = new StringBuilder();
                            sb.append("DELETE FROM IM_USER_BIZ_INFO WHERE UID IN (");
                            C0VIY.LIZ(sb, list.size());
                            sb.append(")");
                            InterfaceC796340VLs interfaceC796340VLsCompileStatement = this.LIZ.compileStatement(sb.toString());
                            Iterator<Long> it2 = list.iterator();
                            int i = 1;
                            while (it2.hasNext()) {
                                interfaceC796340VLsCompileStatement.LJIJ(i, it2.next().longValue());
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

                        @Override // X.InterfaceC808330VnL
                        public final C1BGM LJFF(long j) {
                            Integer numValueOf;
                            Double dValueOf;
                            Long lValueOf;
                            String string;
                            String string2;
                            String string3;
                            Integer numValueOf2;
                            String string4;
                            Integer numValueOf3;
                            Long lValueOf2;
                            String string5;
                            C0VN5 c0vn5LIZLLL = C0VN5.LIZLLL(1, "SELECT * FROM IM_USER_BIZ_INFO WHERE UID = ?");
                            c0vn5LIZLLL.LJIJ(1, j);
                            this.LIZ.assertNotSuspendingTransaction();
                            Cursor cursorLIZIZ = C0VN0.LIZIZ(this.LIZ, c0vn5LIZLLL, false);
                            try {
                                int iLIZIZ = C795450VIh.LIZIZ(cursorLIZIZ, "UID");
                                int iLIZIZ2 = C795450VIh.LIZIZ(cursorLIZIZ, "SHARE_FILTER_TYPE");
                                int iLIZIZ3 = C795450VIh.LIZIZ(cursorLIZIZ, "AFFINITY_SCORE");
                                int iLIZIZ4 = C795450VIh.LIZIZ(cursorLIZIZ, "UPDATE_TIME");
                                int iLIZIZ5 = C795450VIh.LIZIZ(cursorLIZIZ, "USER_B2C_ACCOUNT_INFO");
                                int iLIZIZ6 = C795450VIh.LIZIZ(cursorLIZIZ, "CHAT_BOT_INFO");
                                int iLIZIZ7 = C795450VIh.LIZIZ(cursorLIZIZ, "CAMERA_INFO");
                                int iLIZIZ8 = C795450VIh.LIZIZ(cursorLIZIZ, "ALLOW_SINGLE_CHAT_SCREENSHOT");
                                int iLIZIZ9 = C795450VIh.LIZIZ(cursorLIZIZ, "GROUP_CHAT_PERMISSION_INFO");
                                int iLIZIZ10 = C795450VIh.LIZIZ(cursorLIZIZ, "ACTIVITY_STATUS_SETTING");
                                int iLIZIZ11 = C795450VIh.LIZIZ(cursorLIZIZ, "CHAT_BUBBLE_ID");
                                int iLIZIZ12 = C795450VIh.LIZIZ(cursorLIZIZ, "UNLOCKED_BUBBLE_IDS");
                                int iLIZIZ13 = C795450VIh.LIZIZ(cursorLIZIZ, "VOICE_CALL_INFO");
                                C1BGM c1bgm = null;
                                String string6 = null;
                                if (cursorLIZIZ.moveToFirst()) {
                                    long j2 = cursorLIZIZ.getLong(iLIZIZ);
                                    if (cursorLIZIZ.isNull(iLIZIZ2)) {
                                        numValueOf = null;
                                    } else {
                                        numValueOf = Integer.valueOf(cursorLIZIZ.getInt(iLIZIZ2));
                                    }
                                    if (cursorLIZIZ.isNull(iLIZIZ3)) {
                                        dValueOf = null;
                                    } else {
                                        dValueOf = Double.valueOf(cursorLIZIZ.getDouble(iLIZIZ3));
                                    }
                                    if (cursorLIZIZ.isNull(iLIZIZ4)) {
                                        lValueOf = null;
                                    } else {
                                        lValueOf = Long.valueOf(cursorLIZIZ.getLong(iLIZIZ4));
                                    }
                                    if (cursorLIZIZ.isNull(iLIZIZ5)) {
                                        string = null;
                                    } else {
                                        string = cursorLIZIZ.getString(iLIZIZ5);
                                    }
                                    if (cursorLIZIZ.isNull(iLIZIZ6)) {
                                        string2 = null;
                                    } else {
                                        string2 = cursorLIZIZ.getString(iLIZIZ6);
                                    }
                                    if (cursorLIZIZ.isNull(iLIZIZ7)) {
                                        string3 = null;
                                    } else {
                                        string3 = cursorLIZIZ.getString(iLIZIZ7);
                                    }
                                    if (cursorLIZIZ.isNull(iLIZIZ8)) {
                                        numValueOf2 = null;
                                    } else {
                                        numValueOf2 = Integer.valueOf(cursorLIZIZ.getInt(iLIZIZ8));
                                    }
                                    if (cursorLIZIZ.isNull(iLIZIZ9)) {
                                        string4 = null;
                                    } else {
                                        string4 = cursorLIZIZ.getString(iLIZIZ9);
                                    }
                                    if (cursorLIZIZ.isNull(iLIZIZ10)) {
                                        numValueOf3 = null;
                                    } else {
                                        numValueOf3 = Integer.valueOf(cursorLIZIZ.getInt(iLIZIZ10));
                                    }
                                    if (cursorLIZIZ.isNull(iLIZIZ11)) {
                                        lValueOf2 = null;
                                    } else {
                                        lValueOf2 = Long.valueOf(cursorLIZIZ.getLong(iLIZIZ11));
                                    }
                                    if (cursorLIZIZ.isNull(iLIZIZ12)) {
                                        string5 = null;
                                    } else {
                                        string5 = cursorLIZIZ.getString(iLIZIZ12);
                                    }
                                    if (!cursorLIZIZ.isNull(iLIZIZ13)) {
                                        string6 = cursorLIZIZ.getString(iLIZIZ13);
                                    }
                                    c1bgm = new C1BGM(j2, numValueOf, dValueOf, lValueOf, string, string2, string3, numValueOf2, string4, numValueOf3, lValueOf2, string5, string6);
                                }
                                cursorLIZIZ.close();
                                c0vn5LIZLLL.release();
                                return c1bgm;
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                cursorLIZIZ.close();
                                c0vn5LIZLLL.release();
                                throw th;
                            }
                        }

                        @Override // X.InterfaceC808330VnL
                        public final List<C1724806pC> LJI(int i) {
                            C0VN5 c0vn5LIZLLL = C0VN5.LIZLLL(1, "SELECT IM_USER_BASE_INFO.UID, IM_USER_BIZ_INFO.AFFINITY_SCORE FROM IM_USER_BASE_INFO INNER JOIN IM_USER_BIZ_INFO ON IM_USER_BASE_INFO.UID = IM_USER_BIZ_INFO.UID WHERE FOLLOW_STATUS = 2 ORDER BY IM_USER_BIZ_INFO.AFFINITY_SCORE DESC LIMIT ?");
                            c0vn5LIZLLL.LJIJ(1, i);
                            this.LIZ.assertNotSuspendingTransaction();
                            Cursor cursorLIZIZ = C0VN0.LIZIZ(this.LIZ, c0vn5LIZLLL, false);
                            try {
                                ArrayList arrayList = new ArrayList(cursorLIZIZ.getCount());
                                while (cursorLIZIZ.moveToNext()) {
                                    arrayList.add(new C1724806pC(cursorLIZIZ.getDouble(1), cursorLIZIZ.getLong(0)));
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
                c0vnx = this.LLJ;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return c0vnx;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.0VNb] */
    @Override // com.ss.android.ugc.aweme.im.contacts.impl.data.base.IMContactDatabase
    public final InterfaceC808350VnN LIZJ() {
        C796690VNb c796690VNb;
        if (this.LLIZLLLIL != null) {
            return this.LLIZLLLIL;
        }
        synchronized (this) {
            try {
                if (this.LLIZLLLIL == null) {
                    this.LLIZLLLIL = new InterfaceC808350VnN(this) { // from class: X.0VNb
                        public final AbstractC796540VMm LIZ;
                        public final C796720VNe LIZIZ;
                        public final C796730VNf LIZJ;
                        public final C796700VNc LIZLLL;

                        @Override // X.InterfaceC808350VnN
                        public final int LIZLLL() {
                            C0VN5 c0vn5LIZLLL = C0VN5.LIZLLL(0, "\n        SELECT COUNT(*) FROM IM_USER_BASE_INFO\n        INNER JOIN SHARE_PERMISSION ON IM_USER_BASE_INFO.UID = SHARE_PERMISSION.UID\n        WHERE FOLLOW_STATUS != 0\n        AND COLUMN_USER_SHARE_STATUS != 2\n    ");
                            this.LIZ.assertNotSuspendingTransaction();
                            Cursor cursorLIZIZ = C0VN0.LIZIZ(this.LIZ, c0vn5LIZLLL, false);
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

                        @Override // X.InterfaceC808350VnN
                        public final List<C2201931BFv> LJI() {
                            int i = 0;
                            C0VN5 c0vn5LIZLLL = C0VN5.LIZLLL(0, "\n        SELECT IM_USER_BASE_INFO.UID,\n        AVATAR_THUMB, AVATAR_MEDIUM, \n        NICK_NAME, UNIQUE_ID, \n        FOLLOW_STATUS, \n        FOLLOWER_COUNT, FOLLOWING_COUNT,\n        MAF_STATUS, REC_TYPE,\n        IM_USER_BASE_INFO.UPDATE_TIME,\n        SORT_WEIGHT, INITIAL_LETTER,\n        IM_USER_BASE_INFO.EXTRA,\n        FOLLOWER_STATUS, BLOCK, BLOCKED_BY, \n        RECOMMEND_REASON, ENTERPRISE_USER_VERIFY_REASON, \n        USER_VERIFY_REASON, USER_VERIFY_TYPE,\n        COLUMN_USER_SHARE_STATUS FROM IM_USER_BASE_INFO\n        INNER JOIN SHARE_PERMISSION ON IM_USER_BASE_INFO.UID = SHARE_PERMISSION.UID WHERE\n     FOLLOW_STATUS = 2");
                            this.LIZ.assertNotSuspendingTransaction();
                            Cursor cursorLIZIZ = C0VN0.LIZIZ(this.LIZ, c0vn5LIZLLL, false);
                            try {
                                ArrayList arrayList = new ArrayList(cursorLIZIZ.getCount());
                                while (cursorLIZIZ.moveToNext()) {
                                    long j = cursorLIZIZ.getLong(i);
                                    Integer numValueOf = null;
                                    String string = cursorLIZIZ.isNull(1) ? null : cursorLIZIZ.getString(1);
                                    String string2 = cursorLIZIZ.isNull(2) ? null : cursorLIZIZ.getString(2);
                                    String string3 = cursorLIZIZ.isNull(3) ? null : cursorLIZIZ.getString(3);
                                    String string4 = cursorLIZIZ.isNull(4) ? null : cursorLIZIZ.getString(4);
                                    Integer numValueOf2 = cursorLIZIZ.isNull(5) ? null : Integer.valueOf(cursorLIZIZ.getInt(5));
                                    Integer numValueOf3 = cursorLIZIZ.isNull(6) ? null : Integer.valueOf(cursorLIZIZ.getInt(6));
                                    Integer numValueOf4 = cursorLIZIZ.isNull(7) ? null : Integer.valueOf(cursorLIZIZ.getInt(7));
                                    Integer numValueOf5 = cursorLIZIZ.isNull(8) ? null : Integer.valueOf(cursorLIZIZ.getInt(8));
                                    String string5 = cursorLIZIZ.isNull(9) ? null : cursorLIZIZ.getString(9);
                                    long j2 = cursorLIZIZ.getLong(10);
                                    String string6 = cursorLIZIZ.isNull(11) ? null : cursorLIZIZ.getString(11);
                                    String string7 = cursorLIZIZ.isNull(12) ? null : cursorLIZIZ.getString(12);
                                    if (!cursorLIZIZ.isNull(13)) {
                                        cursorLIZIZ.getString(13);
                                    }
                                    Integer numValueOf6 = cursorLIZIZ.isNull(14) ? null : Integer.valueOf(cursorLIZIZ.getInt(14));
                                    Integer numValueOf7 = cursorLIZIZ.isNull(15) ? null : Integer.valueOf(cursorLIZIZ.getInt(15));
                                    Integer numValueOf8 = cursorLIZIZ.isNull(16) ? null : Integer.valueOf(cursorLIZIZ.getInt(16));
                                    String string8 = cursorLIZIZ.isNull(17) ? null : cursorLIZIZ.getString(17);
                                    String string9 = cursorLIZIZ.isNull(18) ? null : cursorLIZIZ.getString(18);
                                    String string10 = cursorLIZIZ.isNull(19) ? null : cursorLIZIZ.getString(19);
                                    Integer numValueOf9 = cursorLIZIZ.isNull(20) ? null : Integer.valueOf(cursorLIZIZ.getInt(20));
                                    if (!cursorLIZIZ.isNull(21)) {
                                        numValueOf = Integer.valueOf(cursorLIZIZ.getInt(21));
                                    }
                                    arrayList.add(new C2201931BFv(j, string, string2, string3, string4, numValueOf2, numValueOf3, numValueOf4, numValueOf5, string5, j2, string6, string7, numValueOf6, numValueOf7, numValueOf8, string8, string9, string10, numValueOf9, numValueOf));
                                    i = 0;
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

                        /* JADX WARN: Type inference failed for: r0v0, types: [X.0VNe] */
                        /* JADX WARN: Type inference failed for: r0v1, types: [X.0VNf] */
                        /* JADX WARN: Type inference failed for: r0v2, types: [X.0VNc] */
                        {
                            this.LIZ = this;
                            this.LIZIZ = new AbstractC796330VLr<C796740VNg>(this) { // from class: X.0VNe
                                @Override // X.AbstractC795470VIj
                                public final String createQuery() {
                                    return "INSERT OR REPLACE INTO `SHARE_PERMISSION` (`UID`,`COLUMN_USER_SHARE_STATUS`,`TTN_SHARE_STATUS`,`UPDATE_TIME`,`EXTRA`) VALUES (?,?,?,?,?)";
                                }

                                @Override // X.AbstractC796330VLr
                                public final void bind(InterfaceC796340VLs interfaceC796340VLs, C796740VNg c796740VNg) {
                                    C796740VNg c796740VNg2 = c796740VNg;
                                    interfaceC796340VLs.LJIJ(1, c796740VNg2.LIZ);
                                    if (c796740VNg2.LIZIZ == null) {
                                        interfaceC796340VLs.LLD(2);
                                    } else {
                                        interfaceC796340VLs.LJIJ(2, r0.intValue());
                                    }
                                    if (c796740VNg2.LIZJ == null) {
                                        interfaceC796340VLs.LLD(3);
                                    } else {
                                        interfaceC796340VLs.LJIJ(3, r0.intValue());
                                    }
                                    interfaceC796340VLs.LJIJ(4, c796740VNg2.LIZLLL);
                                    String str = c796740VNg2.LJ;
                                    if (str == null) {
                                        interfaceC796340VLs.LLD(5);
                                    } else {
                                        interfaceC796340VLs.LJIILIIL(5, str);
                                    }
                                }
                            };
                            this.LIZJ = new AbstractC796320VLq<C796740VNg>(this) { // from class: X.0VNf
                                @Override // X.AbstractC796320VLq, X.AbstractC795470VIj
                                public final String createQuery() {
                                    return "UPDATE OR ABORT `SHARE_PERMISSION` SET `UID` = ?,`COLUMN_USER_SHARE_STATUS` = ?,`TTN_SHARE_STATUS` = ?,`UPDATE_TIME` = ?,`EXTRA` = ? WHERE `UID` = ?";
                                }

                                @Override // X.AbstractC796320VLq
                                public final void bind(InterfaceC796340VLs interfaceC796340VLs, C796740VNg c796740VNg) {
                                    C796740VNg c796740VNg2 = c796740VNg;
                                    interfaceC796340VLs.LJIJ(1, c796740VNg2.LIZ);
                                    if (c796740VNg2.LIZIZ == null) {
                                        interfaceC796340VLs.LLD(2);
                                    } else {
                                        interfaceC796340VLs.LJIJ(2, r0.intValue());
                                    }
                                    if (c796740VNg2.LIZJ == null) {
                                        interfaceC796340VLs.LLD(3);
                                    } else {
                                        interfaceC796340VLs.LJIJ(3, r0.intValue());
                                    }
                                    interfaceC796340VLs.LJIJ(4, c796740VNg2.LIZLLL);
                                    String str = c796740VNg2.LJ;
                                    if (str == null) {
                                        interfaceC796340VLs.LLD(5);
                                    } else {
                                        interfaceC796340VLs.LJIILIIL(5, str);
                                    }
                                    interfaceC796340VLs.LJIJ(6, c796740VNg2.LIZ);
                                }
                            };
                            this.LIZLLL = new AbstractC795470VIj(this) { // from class: X.0VNc
                                @Override // X.AbstractC795470VIj
                                public final String createQuery() {
                                    return "DELETE FROM SHARE_PERMISSION WHERE UID = ?";
                                }
                            };
                            new AbstractC795470VIj(this) { // from class: X.0VNd
                                @Override // X.AbstractC795470VIj
                                public final String createQuery() {
                                    return "DELETE FROM SHARE_PERMISSION";
                                }
                            };
                        }

                        @Override // X.InterfaceC808350VnN
                        public final void LIZ(List<C796740VNg> list) {
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

                        @Override // X.InterfaceC808350VnN
                        public final void LIZIZ(long j) {
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

                        @Override // X.InterfaceC808350VnN
                        public final void LIZJ(List<Long> list) {
                            this.LIZ.assertNotSuspendingTransaction();
                            StringBuilder sb = new StringBuilder();
                            sb.append("DELETE FROM SHARE_PERMISSION WHERE UID IN (");
                            C0VIY.LIZ(sb, list.size());
                            sb.append(")");
                            InterfaceC796340VLs interfaceC796340VLsCompileStatement = this.LIZ.compileStatement(sb.toString());
                            Iterator<Long> it2 = list.iterator();
                            int i = 1;
                            while (it2.hasNext()) {
                                interfaceC796340VLsCompileStatement.LJIJ(i, it2.next().longValue());
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

                        @Override // X.InterfaceC808350VnN
                        public final C2201931BFv LJ(long j) {
                            String string;
                            String string2;
                            String string3;
                            String string4;
                            Integer numValueOf;
                            Integer numValueOf2;
                            Integer numValueOf3;
                            Integer numValueOf4;
                            String string5;
                            String string6;
                            String string7;
                            Integer numValueOf5;
                            Integer numValueOf6;
                            Integer numValueOf7;
                            String string8;
                            String string9;
                            String string10;
                            Integer numValueOf8;
                            C0VN5 c0vn5LIZLLL = C0VN5.LIZLLL(1, "\n        SELECT IM_USER_BASE_INFO.UID,\n        AVATAR_THUMB, AVATAR_MEDIUM, \n        NICK_NAME, UNIQUE_ID, \n        FOLLOW_STATUS, \n        FOLLOWER_COUNT, FOLLOWING_COUNT,\n        MAF_STATUS, REC_TYPE,\n        IM_USER_BASE_INFO.UPDATE_TIME,\n        SORT_WEIGHT, INITIAL_LETTER,\n        IM_USER_BASE_INFO.EXTRA,\n        FOLLOWER_STATUS, BLOCK, BLOCKED_BY, \n        RECOMMEND_REASON, ENTERPRISE_USER_VERIFY_REASON, \n        USER_VERIFY_REASON, USER_VERIFY_TYPE,\n        COLUMN_USER_SHARE_STATUS FROM IM_USER_BASE_INFO\n        INNER JOIN SHARE_PERMISSION ON IM_USER_BASE_INFO.UID = SHARE_PERMISSION.UID WHERE\n     SHARE_PERMISSION.UID = ? AND MAF_STATUS = 1 AND FOLLOW_STATUS != 2");
                            c0vn5LIZLLL.LJIJ(1, j);
                            this.LIZ.assertNotSuspendingTransaction();
                            Cursor cursorLIZIZ = C0VN0.LIZIZ(this.LIZ, c0vn5LIZLLL, false);
                            try {
                                C2201931BFv c2201931BFv = null;
                                Integer numValueOf9 = null;
                                if (cursorLIZIZ.moveToFirst()) {
                                    long j2 = cursorLIZIZ.getLong(0);
                                    if (cursorLIZIZ.isNull(1)) {
                                        string = null;
                                    } else {
                                        string = cursorLIZIZ.getString(1);
                                    }
                                    if (cursorLIZIZ.isNull(2)) {
                                        string2 = null;
                                    } else {
                                        string2 = cursorLIZIZ.getString(2);
                                    }
                                    if (cursorLIZIZ.isNull(3)) {
                                        string3 = null;
                                    } else {
                                        string3 = cursorLIZIZ.getString(3);
                                    }
                                    if (cursorLIZIZ.isNull(4)) {
                                        string4 = null;
                                    } else {
                                        string4 = cursorLIZIZ.getString(4);
                                    }
                                    if (cursorLIZIZ.isNull(5)) {
                                        numValueOf = null;
                                    } else {
                                        numValueOf = Integer.valueOf(cursorLIZIZ.getInt(5));
                                    }
                                    if (cursorLIZIZ.isNull(6)) {
                                        numValueOf2 = null;
                                    } else {
                                        numValueOf2 = Integer.valueOf(cursorLIZIZ.getInt(6));
                                    }
                                    if (cursorLIZIZ.isNull(7)) {
                                        numValueOf3 = null;
                                    } else {
                                        numValueOf3 = Integer.valueOf(cursorLIZIZ.getInt(7));
                                    }
                                    if (cursorLIZIZ.isNull(8)) {
                                        numValueOf4 = null;
                                    } else {
                                        numValueOf4 = Integer.valueOf(cursorLIZIZ.getInt(8));
                                    }
                                    if (cursorLIZIZ.isNull(9)) {
                                        string5 = null;
                                    } else {
                                        string5 = cursorLIZIZ.getString(9);
                                    }
                                    long j3 = cursorLIZIZ.getLong(10);
                                    if (cursorLIZIZ.isNull(11)) {
                                        string6 = null;
                                    } else {
                                        string6 = cursorLIZIZ.getString(11);
                                    }
                                    if (cursorLIZIZ.isNull(12)) {
                                        string7 = null;
                                    } else {
                                        string7 = cursorLIZIZ.getString(12);
                                    }
                                    if (!cursorLIZIZ.isNull(13)) {
                                        cursorLIZIZ.getString(13);
                                    }
                                    if (cursorLIZIZ.isNull(14)) {
                                        numValueOf5 = null;
                                    } else {
                                        numValueOf5 = Integer.valueOf(cursorLIZIZ.getInt(14));
                                    }
                                    if (cursorLIZIZ.isNull(15)) {
                                        numValueOf6 = null;
                                    } else {
                                        numValueOf6 = Integer.valueOf(cursorLIZIZ.getInt(15));
                                    }
                                    if (cursorLIZIZ.isNull(16)) {
                                        numValueOf7 = null;
                                    } else {
                                        numValueOf7 = Integer.valueOf(cursorLIZIZ.getInt(16));
                                    }
                                    if (cursorLIZIZ.isNull(17)) {
                                        string8 = null;
                                    } else {
                                        string8 = cursorLIZIZ.getString(17);
                                    }
                                    if (cursorLIZIZ.isNull(18)) {
                                        string9 = null;
                                    } else {
                                        string9 = cursorLIZIZ.getString(18);
                                    }
                                    if (cursorLIZIZ.isNull(19)) {
                                        string10 = null;
                                    } else {
                                        string10 = cursorLIZIZ.getString(19);
                                    }
                                    if (cursorLIZIZ.isNull(20)) {
                                        numValueOf8 = null;
                                    } else {
                                        numValueOf8 = Integer.valueOf(cursorLIZIZ.getInt(20));
                                    }
                                    if (!cursorLIZIZ.isNull(21)) {
                                        numValueOf9 = Integer.valueOf(cursorLIZIZ.getInt(21));
                                    }
                                    c2201931BFv = new C2201931BFv(j2, string, string2, string3, string4, numValueOf, numValueOf2, numValueOf3, numValueOf4, string5, j3, string6, string7, numValueOf5, numValueOf6, numValueOf7, string8, string9, string10, numValueOf8, numValueOf9);
                                }
                                cursorLIZIZ.close();
                                c0vn5LIZLLL.release();
                                return c2201931BFv;
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                cursorLIZIZ.close();
                                c0vn5LIZLLL.release();
                                throw th;
                            }
                        }

                        @Override // X.InterfaceC808350VnN
                        public final List<C2201931BFv> LJFF(int i) {
                            String string;
                            String string2;
                            String string3;
                            String string4;
                            Integer numValueOf;
                            Integer numValueOf2;
                            Integer numValueOf3;
                            Integer numValueOf4;
                            String string5;
                            String string6;
                            String string7;
                            Integer numValueOf5;
                            Integer numValueOf6;
                            Integer numValueOf7;
                            String string8;
                            String string9;
                            String string10;
                            Integer numValueOf8;
                            C0VN5 c0vn5LIZLLL = C0VN5.LIZLLL(1, "\n        SELECT IM_USER_BASE_INFO.UID,\n        AVATAR_THUMB, AVATAR_MEDIUM, \n        NICK_NAME, UNIQUE_ID, \n        FOLLOW_STATUS, \n        FOLLOWER_COUNT, FOLLOWING_COUNT,\n        MAF_STATUS, REC_TYPE,\n        IM_USER_BASE_INFO.UPDATE_TIME,\n        SORT_WEIGHT, INITIAL_LETTER,\n        IM_USER_BASE_INFO.EXTRA,\n        FOLLOWER_STATUS, BLOCK, BLOCKED_BY, \n        RECOMMEND_REASON, ENTERPRISE_USER_VERIFY_REASON, \n        USER_VERIFY_REASON, USER_VERIFY_TYPE,\n        COLUMN_USER_SHARE_STATUS FROM IM_USER_BASE_INFO\n        INNER JOIN SHARE_PERMISSION ON IM_USER_BASE_INFO.UID = SHARE_PERMISSION.UID WHERE\n     MAF_STATUS = 1 AND FOLLOW_STATUS != 2 LIMIT ?");
                            c0vn5LIZLLL.LJIJ(1, i);
                            this.LIZ.assertNotSuspendingTransaction();
                            Cursor cursorLIZIZ = C0VN0.LIZIZ(this.LIZ, c0vn5LIZLLL, false);
                            try {
                                ArrayList arrayList = new ArrayList(cursorLIZIZ.getCount());
                                while (cursorLIZIZ.moveToNext()) {
                                    long j = cursorLIZIZ.getLong(0);
                                    Integer numValueOf9 = null;
                                    if (cursorLIZIZ.isNull(1)) {
                                        string = null;
                                    } else {
                                        string = cursorLIZIZ.getString(1);
                                    }
                                    if (cursorLIZIZ.isNull(2)) {
                                        string2 = null;
                                    } else {
                                        string2 = cursorLIZIZ.getString(2);
                                    }
                                    if (cursorLIZIZ.isNull(3)) {
                                        string3 = null;
                                    } else {
                                        string3 = cursorLIZIZ.getString(3);
                                    }
                                    if (cursorLIZIZ.isNull(4)) {
                                        string4 = null;
                                    } else {
                                        string4 = cursorLIZIZ.getString(4);
                                    }
                                    if (cursorLIZIZ.isNull(5)) {
                                        numValueOf = null;
                                    } else {
                                        numValueOf = Integer.valueOf(cursorLIZIZ.getInt(5));
                                    }
                                    if (cursorLIZIZ.isNull(6)) {
                                        numValueOf2 = null;
                                    } else {
                                        numValueOf2 = Integer.valueOf(cursorLIZIZ.getInt(6));
                                    }
                                    if (cursorLIZIZ.isNull(7)) {
                                        numValueOf3 = null;
                                    } else {
                                        numValueOf3 = Integer.valueOf(cursorLIZIZ.getInt(7));
                                    }
                                    if (cursorLIZIZ.isNull(8)) {
                                        numValueOf4 = null;
                                    } else {
                                        numValueOf4 = Integer.valueOf(cursorLIZIZ.getInt(8));
                                    }
                                    if (cursorLIZIZ.isNull(9)) {
                                        string5 = null;
                                    } else {
                                        string5 = cursorLIZIZ.getString(9);
                                    }
                                    long j2 = cursorLIZIZ.getLong(10);
                                    if (cursorLIZIZ.isNull(11)) {
                                        string6 = null;
                                    } else {
                                        string6 = cursorLIZIZ.getString(11);
                                    }
                                    if (cursorLIZIZ.isNull(12)) {
                                        string7 = null;
                                    } else {
                                        string7 = cursorLIZIZ.getString(12);
                                    }
                                    if (!cursorLIZIZ.isNull(13)) {
                                        cursorLIZIZ.getString(13);
                                    }
                                    if (cursorLIZIZ.isNull(14)) {
                                        numValueOf5 = null;
                                    } else {
                                        numValueOf5 = Integer.valueOf(cursorLIZIZ.getInt(14));
                                    }
                                    if (cursorLIZIZ.isNull(15)) {
                                        numValueOf6 = null;
                                    } else {
                                        numValueOf6 = Integer.valueOf(cursorLIZIZ.getInt(15));
                                    }
                                    if (cursorLIZIZ.isNull(16)) {
                                        numValueOf7 = null;
                                    } else {
                                        numValueOf7 = Integer.valueOf(cursorLIZIZ.getInt(16));
                                    }
                                    if (cursorLIZIZ.isNull(17)) {
                                        string8 = null;
                                    } else {
                                        string8 = cursorLIZIZ.getString(17);
                                    }
                                    if (cursorLIZIZ.isNull(18)) {
                                        string9 = null;
                                    } else {
                                        string9 = cursorLIZIZ.getString(18);
                                    }
                                    if (cursorLIZIZ.isNull(19)) {
                                        string10 = null;
                                    } else {
                                        string10 = cursorLIZIZ.getString(19);
                                    }
                                    if (cursorLIZIZ.isNull(20)) {
                                        numValueOf8 = null;
                                    } else {
                                        numValueOf8 = Integer.valueOf(cursorLIZIZ.getInt(20));
                                    }
                                    if (!cursorLIZIZ.isNull(21)) {
                                        numValueOf9 = Integer.valueOf(cursorLIZIZ.getInt(21));
                                    }
                                    arrayList.add(new C2201931BFv(j, string, string2, string3, string4, numValueOf, numValueOf2, numValueOf3, numValueOf4, string5, j2, string6, string7, numValueOf5, numValueOf6, numValueOf7, string8, string9, string10, numValueOf8, numValueOf9));
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

                        @Override // X.InterfaceC808350VnN
                        public final List<C2201931BFv> LJII(List<Long> list) {
                            String string;
                            String string2;
                            String string3;
                            String string4;
                            Integer numValueOf;
                            Integer numValueOf2;
                            Integer numValueOf3;
                            Integer numValueOf4;
                            String string5;
                            String string6;
                            String string7;
                            Integer numValueOf5;
                            Integer numValueOf6;
                            Integer numValueOf7;
                            String string8;
                            String string9;
                            String string10;
                            Integer numValueOf8;
                            StringBuilder sb = new StringBuilder();
                            sb.append("\n        SELECT IM_USER_BASE_INFO.UID,\n        AVATAR_THUMB, AVATAR_MEDIUM, \n        NICK_NAME, UNIQUE_ID, \n        FOLLOW_STATUS, \n        FOLLOWER_COUNT, FOLLOWING_COUNT,\n        MAF_STATUS, REC_TYPE,\n        IM_USER_BASE_INFO.UPDATE_TIME,\n        SORT_WEIGHT, INITIAL_LETTER,\n        IM_USER_BASE_INFO.EXTRA,\n        FOLLOWER_STATUS, BLOCK, BLOCKED_BY, \n        RECOMMEND_REASON, ENTERPRISE_USER_VERIFY_REASON, \n        USER_VERIFY_REASON, USER_VERIFY_TYPE,\n        COLUMN_USER_SHARE_STATUS FROM IM_USER_BASE_INFO\n        INNER JOIN SHARE_PERMISSION ON IM_USER_BASE_INFO.UID = SHARE_PERMISSION.UID WHERE\n     SHARE_PERMISSION.UID IN (");
                            ArrayList arrayList = (ArrayList) list;
                            int size = arrayList.size();
                            C0VIY.LIZ(sb, size);
                            sb.append(")");
                            C0VN5 c0vn5LIZLLL = C0VN5.LIZLLL(size, sb.toString());
                            Iterator it2 = arrayList.iterator();
                            int i = 1;
                            while (it2.hasNext()) {
                                c0vn5LIZLLL.LJIJ(i, ((Long) it2.next()).longValue());
                                i++;
                            }
                            this.LIZ.assertNotSuspendingTransaction();
                            Cursor cursorLIZIZ = C0VN0.LIZIZ(this.LIZ, c0vn5LIZLLL, false);
                            try {
                                ArrayList arrayList2 = new ArrayList(cursorLIZIZ.getCount());
                                while (cursorLIZIZ.moveToNext()) {
                                    long j = cursorLIZIZ.getLong(0);
                                    Integer numValueOf9 = null;
                                    if (cursorLIZIZ.isNull(1)) {
                                        string = null;
                                    } else {
                                        string = cursorLIZIZ.getString(1);
                                    }
                                    if (cursorLIZIZ.isNull(2)) {
                                        string2 = null;
                                    } else {
                                        string2 = cursorLIZIZ.getString(2);
                                    }
                                    if (cursorLIZIZ.isNull(3)) {
                                        string3 = null;
                                    } else {
                                        string3 = cursorLIZIZ.getString(3);
                                    }
                                    if (cursorLIZIZ.isNull(4)) {
                                        string4 = null;
                                    } else {
                                        string4 = cursorLIZIZ.getString(4);
                                    }
                                    if (cursorLIZIZ.isNull(5)) {
                                        numValueOf = null;
                                    } else {
                                        numValueOf = Integer.valueOf(cursorLIZIZ.getInt(5));
                                    }
                                    if (cursorLIZIZ.isNull(6)) {
                                        numValueOf2 = null;
                                    } else {
                                        numValueOf2 = Integer.valueOf(cursorLIZIZ.getInt(6));
                                    }
                                    if (cursorLIZIZ.isNull(7)) {
                                        numValueOf3 = null;
                                    } else {
                                        numValueOf3 = Integer.valueOf(cursorLIZIZ.getInt(7));
                                    }
                                    if (cursorLIZIZ.isNull(8)) {
                                        numValueOf4 = null;
                                    } else {
                                        numValueOf4 = Integer.valueOf(cursorLIZIZ.getInt(8));
                                    }
                                    if (cursorLIZIZ.isNull(9)) {
                                        string5 = null;
                                    } else {
                                        string5 = cursorLIZIZ.getString(9);
                                    }
                                    long j2 = cursorLIZIZ.getLong(10);
                                    if (cursorLIZIZ.isNull(11)) {
                                        string6 = null;
                                    } else {
                                        string6 = cursorLIZIZ.getString(11);
                                    }
                                    if (cursorLIZIZ.isNull(12)) {
                                        string7 = null;
                                    } else {
                                        string7 = cursorLIZIZ.getString(12);
                                    }
                                    if (!cursorLIZIZ.isNull(13)) {
                                        cursorLIZIZ.getString(13);
                                    }
                                    if (cursorLIZIZ.isNull(14)) {
                                        numValueOf5 = null;
                                    } else {
                                        numValueOf5 = Integer.valueOf(cursorLIZIZ.getInt(14));
                                    }
                                    if (cursorLIZIZ.isNull(15)) {
                                        numValueOf6 = null;
                                    } else {
                                        numValueOf6 = Integer.valueOf(cursorLIZIZ.getInt(15));
                                    }
                                    if (cursorLIZIZ.isNull(16)) {
                                        numValueOf7 = null;
                                    } else {
                                        numValueOf7 = Integer.valueOf(cursorLIZIZ.getInt(16));
                                    }
                                    if (cursorLIZIZ.isNull(17)) {
                                        string8 = null;
                                    } else {
                                        string8 = cursorLIZIZ.getString(17);
                                    }
                                    if (cursorLIZIZ.isNull(18)) {
                                        string9 = null;
                                    } else {
                                        string9 = cursorLIZIZ.getString(18);
                                    }
                                    if (cursorLIZIZ.isNull(19)) {
                                        string10 = null;
                                    } else {
                                        string10 = cursorLIZIZ.getString(19);
                                    }
                                    if (cursorLIZIZ.isNull(20)) {
                                        numValueOf8 = null;
                                    } else {
                                        numValueOf8 = Integer.valueOf(cursorLIZIZ.getInt(20));
                                    }
                                    if (!cursorLIZIZ.isNull(21)) {
                                        numValueOf9 = Integer.valueOf(cursorLIZIZ.getInt(21));
                                    }
                                    arrayList2.add(new C2201931BFv(j, string, string2, string3, string4, numValueOf, numValueOf2, numValueOf3, numValueOf4, string5, j2, string6, string7, numValueOf5, numValueOf6, numValueOf7, string8, string9, string10, numValueOf8, numValueOf9));
                                }
                                cursorLIZIZ.close();
                                c0vn5LIZLLL.release();
                                return arrayList2;
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                cursorLIZIZ.close();
                                c0vn5LIZLLL.release();
                                throw th;
                            }
                        }

                        @Override // X.InterfaceC808350VnN
                        public final void LJIIIIZZ(C796740VNg c796740VNg) {
                            this.LIZ.assertNotSuspendingTransaction();
                            this.LIZ.beginTransaction();
                            try {
                                handle(c796740VNg);
                                this.LIZ.setTransactionSuccessful();
                                this.LIZ.endTransaction();
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                this.LIZ.endTransaction();
                                throw th;
                            }
                        }

                        @Override // X.InterfaceC808350VnN
                        public final void LJIIIZ(C796740VNg c796740VNg) {
                            this.LIZ.assertNotSuspendingTransaction();
                            this.LIZ.beginTransaction();
                            try {
                                insert(c796740VNg);
                                this.LIZ.setTransactionSuccessful();
                                this.LIZ.endTransaction();
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                this.LIZ.endTransaction();
                                throw th;
                            }
                        }

                        @Override // X.InterfaceC808350VnN
                        public final C2201931BFv LJIIJ(long j) {
                            String string;
                            String string2;
                            String string3;
                            String string4;
                            Integer numValueOf;
                            Integer numValueOf2;
                            Integer numValueOf3;
                            Integer numValueOf4;
                            String string5;
                            String string6;
                            String string7;
                            Integer numValueOf5;
                            Integer numValueOf6;
                            Integer numValueOf7;
                            String string8;
                            String string9;
                            String string10;
                            Integer numValueOf8;
                            C0VN5 c0vn5LIZLLL = C0VN5.LIZLLL(1, "\n        SELECT IM_USER_BASE_INFO.UID,\n        AVATAR_THUMB, AVATAR_MEDIUM, \n        NICK_NAME, UNIQUE_ID, \n        FOLLOW_STATUS, \n        FOLLOWER_COUNT, FOLLOWING_COUNT,\n        MAF_STATUS, REC_TYPE,\n        IM_USER_BASE_INFO.UPDATE_TIME,\n        SORT_WEIGHT, INITIAL_LETTER,\n        IM_USER_BASE_INFO.EXTRA,\n        FOLLOWER_STATUS, BLOCK, BLOCKED_BY, \n        RECOMMEND_REASON, ENTERPRISE_USER_VERIFY_REASON, \n        USER_VERIFY_REASON, USER_VERIFY_TYPE,\n        COLUMN_USER_SHARE_STATUS FROM IM_USER_BASE_INFO\n        INNER JOIN SHARE_PERMISSION ON IM_USER_BASE_INFO.UID = SHARE_PERMISSION.UID WHERE\n     SHARE_PERMISSION.UID = ?");
                            c0vn5LIZLLL.LJIJ(1, j);
                            this.LIZ.assertNotSuspendingTransaction();
                            Cursor cursorLIZIZ = C0VN0.LIZIZ(this.LIZ, c0vn5LIZLLL, false);
                            try {
                                C2201931BFv c2201931BFv = null;
                                Integer numValueOf9 = null;
                                if (cursorLIZIZ.moveToFirst()) {
                                    long j2 = cursorLIZIZ.getLong(0);
                                    if (cursorLIZIZ.isNull(1)) {
                                        string = null;
                                    } else {
                                        string = cursorLIZIZ.getString(1);
                                    }
                                    if (cursorLIZIZ.isNull(2)) {
                                        string2 = null;
                                    } else {
                                        string2 = cursorLIZIZ.getString(2);
                                    }
                                    if (cursorLIZIZ.isNull(3)) {
                                        string3 = null;
                                    } else {
                                        string3 = cursorLIZIZ.getString(3);
                                    }
                                    if (cursorLIZIZ.isNull(4)) {
                                        string4 = null;
                                    } else {
                                        string4 = cursorLIZIZ.getString(4);
                                    }
                                    if (cursorLIZIZ.isNull(5)) {
                                        numValueOf = null;
                                    } else {
                                        numValueOf = Integer.valueOf(cursorLIZIZ.getInt(5));
                                    }
                                    if (cursorLIZIZ.isNull(6)) {
                                        numValueOf2 = null;
                                    } else {
                                        numValueOf2 = Integer.valueOf(cursorLIZIZ.getInt(6));
                                    }
                                    if (cursorLIZIZ.isNull(7)) {
                                        numValueOf3 = null;
                                    } else {
                                        numValueOf3 = Integer.valueOf(cursorLIZIZ.getInt(7));
                                    }
                                    if (cursorLIZIZ.isNull(8)) {
                                        numValueOf4 = null;
                                    } else {
                                        numValueOf4 = Integer.valueOf(cursorLIZIZ.getInt(8));
                                    }
                                    if (cursorLIZIZ.isNull(9)) {
                                        string5 = null;
                                    } else {
                                        string5 = cursorLIZIZ.getString(9);
                                    }
                                    long j3 = cursorLIZIZ.getLong(10);
                                    if (cursorLIZIZ.isNull(11)) {
                                        string6 = null;
                                    } else {
                                        string6 = cursorLIZIZ.getString(11);
                                    }
                                    if (cursorLIZIZ.isNull(12)) {
                                        string7 = null;
                                    } else {
                                        string7 = cursorLIZIZ.getString(12);
                                    }
                                    if (!cursorLIZIZ.isNull(13)) {
                                        cursorLIZIZ.getString(13);
                                    }
                                    if (cursorLIZIZ.isNull(14)) {
                                        numValueOf5 = null;
                                    } else {
                                        numValueOf5 = Integer.valueOf(cursorLIZIZ.getInt(14));
                                    }
                                    if (cursorLIZIZ.isNull(15)) {
                                        numValueOf6 = null;
                                    } else {
                                        numValueOf6 = Integer.valueOf(cursorLIZIZ.getInt(15));
                                    }
                                    if (cursorLIZIZ.isNull(16)) {
                                        numValueOf7 = null;
                                    } else {
                                        numValueOf7 = Integer.valueOf(cursorLIZIZ.getInt(16));
                                    }
                                    if (cursorLIZIZ.isNull(17)) {
                                        string8 = null;
                                    } else {
                                        string8 = cursorLIZIZ.getString(17);
                                    }
                                    if (cursorLIZIZ.isNull(18)) {
                                        string9 = null;
                                    } else {
                                        string9 = cursorLIZIZ.getString(18);
                                    }
                                    if (cursorLIZIZ.isNull(19)) {
                                        string10 = null;
                                    } else {
                                        string10 = cursorLIZIZ.getString(19);
                                    }
                                    if (cursorLIZIZ.isNull(20)) {
                                        numValueOf8 = null;
                                    } else {
                                        numValueOf8 = Integer.valueOf(cursorLIZIZ.getInt(20));
                                    }
                                    if (!cursorLIZIZ.isNull(21)) {
                                        numValueOf9 = Integer.valueOf(cursorLIZIZ.getInt(21));
                                    }
                                    c2201931BFv = new C2201931BFv(j2, string, string2, string3, string4, numValueOf, numValueOf2, numValueOf3, numValueOf4, string5, j3, string6, string7, numValueOf5, numValueOf6, numValueOf7, string8, string9, string10, numValueOf8, numValueOf9);
                                }
                                cursorLIZIZ.close();
                                c0vn5LIZLLL.release();
                                return c2201931BFv;
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                cursorLIZIZ.close();
                                c0vn5LIZLLL.release();
                                throw th;
                            }
                        }

                        @Override // X.InterfaceC808350VnN
                        public final C796740VNg LJIIJJI(long j) {
                            Integer numValueOf;
                            Integer numValueOf2;
                            C0VN5 c0vn5LIZLLL = C0VN5.LIZLLL(1, "SELECT * FROM SHARE_PERMISSION WHERE UID = ?");
                            c0vn5LIZLLL.LJIJ(1, j);
                            this.LIZ.assertNotSuspendingTransaction();
                            Cursor cursorLIZIZ = C0VN0.LIZIZ(this.LIZ, c0vn5LIZLLL, false);
                            try {
                                int iLIZIZ = C795450VIh.LIZIZ(cursorLIZIZ, "UID");
                                int iLIZIZ2 = C795450VIh.LIZIZ(cursorLIZIZ, "COLUMN_USER_SHARE_STATUS");
                                int iLIZIZ3 = C795450VIh.LIZIZ(cursorLIZIZ, "TTN_SHARE_STATUS");
                                int iLIZIZ4 = C795450VIh.LIZIZ(cursorLIZIZ, "UPDATE_TIME");
                                int iLIZIZ5 = C795450VIh.LIZIZ(cursorLIZIZ, "EXTRA");
                                C796740VNg c796740VNg = null;
                                String string = null;
                                if (cursorLIZIZ.moveToFirst()) {
                                    long j2 = cursorLIZIZ.getLong(iLIZIZ);
                                    if (cursorLIZIZ.isNull(iLIZIZ2)) {
                                        numValueOf = null;
                                    } else {
                                        numValueOf = Integer.valueOf(cursorLIZIZ.getInt(iLIZIZ2));
                                    }
                                    if (cursorLIZIZ.isNull(iLIZIZ3)) {
                                        numValueOf2 = null;
                                    } else {
                                        numValueOf2 = Integer.valueOf(cursorLIZIZ.getInt(iLIZIZ3));
                                    }
                                    long j3 = cursorLIZIZ.getLong(iLIZIZ4);
                                    if (!cursorLIZIZ.isNull(iLIZIZ5)) {
                                        string = cursorLIZIZ.getString(iLIZIZ5);
                                    }
                                    c796740VNg = new C796740VNg(j2, j3, numValueOf, numValueOf2, string);
                                }
                                cursorLIZIZ.close();
                                c0vn5LIZLLL.release();
                                return c796740VNg;
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                cursorLIZIZ.close();
                                c0vn5LIZLLL.release();
                                throw th;
                            }
                        }
                    };
                }
                c796690VNb = this.LLIZLLLIL;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return c796690VNb;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.0VNU] */
    @Override // com.ss.android.ugc.aweme.im.contacts.impl.data.base.IMContactDatabase
    public final InterfaceC1581706Hf LJFF() {
        C0VNU c0vnu;
        if (this.LLJI != null) {
            return this.LLJI;
        }
        synchronized (this) {
            try {
                if (this.LLJI == null) {
                    this.LLJI = new InterfaceC1581706Hf(this) { // from class: X.0VNU
                        public final AbstractC796540VMm LIZ;
                        public final C854570Xfj LIZIZ;

                        {
                            this.LIZ = this;
                            this.LIZIZ = new C854570Xfj(this, 5);
                            new C854550Xfh(this, 19);
                        }

                        @Override // X.InterfaceC1581706Hf
                        public final void LIZ(List<C1581806Hg> list) {
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

                        @Override // X.InterfaceC1581706Hf
                        public final C1581806Hg LIZJ(C1581806Hg c1581806Hg) {
                            this.LIZ.beginTransaction();
                            try {
                                C1581806Hg c1581806HgLIZIZ = LIZIZ(c1581806Hg.LIZIZ, c1581806Hg.LIZJ, c1581806Hg.LIZ);
                                LJ(c1581806Hg);
                                this.LIZ.setTransactionSuccessful();
                                this.LIZ.endTransaction();
                                return c1581806HgLIZIZ;
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                this.LIZ.endTransaction();
                                throw th;
                            }
                        }

                        public final void LJ(C1581806Hg c1581806Hg) {
                            this.LIZ.assertNotSuspendingTransaction();
                            this.LIZ.beginTransaction();
                            try {
                                this.LIZIZ.insert(c1581806Hg);
                                this.LIZ.setTransactionSuccessful();
                                this.LIZ.endTransaction();
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                this.LIZ.endTransaction();
                                throw th;
                            }
                        }

                        @Override // X.InterfaceC1581706Hf
                        public final C1581806Hg LIZIZ(int i, int i2, String str) {
                            String string;
                            C0VN5 c0vn5LIZLLL = C0VN5.LIZLLL(3, "SELECT * FROM USER_INTERACTION WHERE ID = ? AND TARGET_TYPE = ? AND BUSINESS_TYPE = ?");
                            if (str == null) {
                                c0vn5LIZLLL.LLD(1);
                            } else {
                                c0vn5LIZLLL.LJIILIIL(1, str);
                            }
                            c0vn5LIZLLL.LJIJ(2, i);
                            c0vn5LIZLLL.LJIJ(3, i2);
                            this.LIZ.assertNotSuspendingTransaction();
                            Cursor cursorLIZIZ = C0VN0.LIZIZ(this.LIZ, c0vn5LIZLLL, false);
                            try {
                                int iLIZIZ = C795450VIh.LIZIZ(cursorLIZIZ, "ID");
                                int iLIZIZ2 = C795450VIh.LIZIZ(cursorLIZIZ, "TARGET_TYPE");
                                int iLIZIZ3 = C795450VIh.LIZIZ(cursorLIZIZ, "BUSINESS_TYPE");
                                int iLIZIZ4 = C795450VIh.LIZIZ(cursorLIZIZ, "DATA");
                                C1581806Hg c1581806Hg = null;
                                String string2 = null;
                                if (cursorLIZIZ.moveToFirst()) {
                                    if (cursorLIZIZ.isNull(iLIZIZ)) {
                                        string = null;
                                    } else {
                                        string = cursorLIZIZ.getString(iLIZIZ);
                                    }
                                    int i3 = cursorLIZIZ.getInt(iLIZIZ2);
                                    int i4 = cursorLIZIZ.getInt(iLIZIZ3);
                                    if (!cursorLIZIZ.isNull(iLIZIZ4)) {
                                        string2 = cursorLIZIZ.getString(iLIZIZ4);
                                    }
                                    c1581806Hg = new C1581806Hg(string, i3, i4, string2);
                                }
                                cursorLIZIZ.close();
                                c0vn5LIZLLL.release();
                                return c1581806Hg;
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                cursorLIZIZ.close();
                                c0vn5LIZLLL.release();
                                throw th;
                            }
                        }

                        @Override // X.InterfaceC1581706Hf
                        public final List LIZLLL(int i, int i2, List list) {
                            String string;
                            StringBuilder sb = new StringBuilder();
                            sb.append("SELECT * FROM USER_INTERACTION WHERE TARGET_TYPE IN (");
                            ArrayList arrayList = (ArrayList) list;
                            int size = arrayList.size();
                            C0VIY.LIZ(sb, size);
                            sb.append(")  AND BUSINESS_TYPE = ? LIMIT ?");
                            int i3 = size + 2;
                            C0VN5 c0vn5LIZLLL = C0VN5.LIZLLL(i3, sb.toString());
                            Iterator it2 = arrayList.iterator();
                            int i4 = 1;
                            while (it2.hasNext()) {
                                c0vn5LIZLLL.LJIJ(i4, ((Integer) it2.next()).intValue());
                                i4++;
                            }
                            c0vn5LIZLLL.LJIJ(size + 1, i);
                            c0vn5LIZLLL.LJIJ(i3, i2);
                            this.LIZ.assertNotSuspendingTransaction();
                            Cursor cursorLIZIZ = C0VN0.LIZIZ(this.LIZ, c0vn5LIZLLL, false);
                            try {
                                int iLIZIZ = C795450VIh.LIZIZ(cursorLIZIZ, "ID");
                                int iLIZIZ2 = C795450VIh.LIZIZ(cursorLIZIZ, "TARGET_TYPE");
                                int iLIZIZ3 = C795450VIh.LIZIZ(cursorLIZIZ, "BUSINESS_TYPE");
                                int iLIZIZ4 = C795450VIh.LIZIZ(cursorLIZIZ, "DATA");
                                ArrayList arrayList2 = new ArrayList(cursorLIZIZ.getCount());
                                while (cursorLIZIZ.moveToNext()) {
                                    String string2 = null;
                                    if (cursorLIZIZ.isNull(iLIZIZ)) {
                                        string = null;
                                    } else {
                                        string = cursorLIZIZ.getString(iLIZIZ);
                                    }
                                    int i5 = cursorLIZIZ.getInt(iLIZIZ2);
                                    int i6 = cursorLIZIZ.getInt(iLIZIZ3);
                                    if (!cursorLIZIZ.isNull(iLIZIZ4)) {
                                        string2 = cursorLIZIZ.getString(iLIZIZ4);
                                    }
                                    arrayList2.add(new C1581806Hg(string, i5, i6, string2));
                                }
                                cursorLIZIZ.close();
                                c0vn5LIZLLL.release();
                                return arrayList2;
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                cursorLIZIZ.close();
                                c0vn5LIZLLL.release();
                                throw th;
                            }
                        }
                    };
                }
                c0vnu = this.LLJI;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return c0vnu;
    }

    @Override // X.AbstractC796540VMm
    public final void clearAllTables() {
        super.assertNotMainThread();
        C0VLF c0vlfLJLJJI = this.mOpenHelper.LJLJJI();
        try {
            super.beginTransaction();
            c0vlfLJLJJI.LJIILJJIL("DELETE FROM `IM_USER_BASE_INFO`");
            c0vlfLJLJJI.LJIILJJIL("DELETE FROM `SHARE_PERMISSION`");
            c0vlfLJLJJI.LJIILJJIL("DELETE FROM `USER_INTERACTION`");
            c0vlfLJLJJI.LJIILJJIL("DELETE FROM `IM_USER_BIZ_INFO`");
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
        return new C796620VMu(this, new HashMap(0), new HashMap(0), "IM_USER_BASE_INFO", "SHARE_PERMISSION", "USER_INTERACTION", "IM_USER_BIZ_INFO");
    }

    @Override // X.AbstractC796540VMm
    public final Set<Class<? extends InterfaceC2275591E5d>> getRequiredAutoMigrationSpecs() {
        return new HashSet();
    }

    @Override // X.AbstractC796540VMm
    public final Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
        HashMap map = new HashMap();
        map.put(InterfaceC2201871BFp.class, Collections.emptyList());
        map.put(InterfaceC808350VnN.class, Collections.emptyList());
        map.put(InterfaceC808330VnL.class, Collections.emptyList());
        map.put(InterfaceC1581706Hf.class, Collections.emptyList());
        return map;
    }

    @Override // X.AbstractC796540VMm
    public final InterfaceC796190VLd createOpenHelper(C796520VMk c796520VMk) {
        C0VN2 c0vn2 = new C0VN2(c796520VMk, new C0VN3() { // from class: X.0VNY
            @Override // X.C0VN3
            public final void onPostMigrate(C0VLF c0vlf) {
            }

            {
                super(16);
            }

            @Override // X.C0VN3
            public final void createAllTables(C0VLF c0vlf) {
                c0vlf.LJIILJJIL("CREATE TABLE IF NOT EXISTS `IM_USER_BASE_INFO` (`UID` INTEGER NOT NULL, `AVATAR_THUMB` TEXT, `AVATAR_MEDIUM` TEXT, `NICK_NAME` TEXT, `UNIQUE_ID` TEXT, `FOLLOW_STATUS` INTEGER, `FOLLOWER_COUNT` INTEGER, `FOLLOWING_COUNT` INTEGER, `MAF_STATUS` INTEGER, `REC_TYPE` TEXT, `UPDATE_TIME` INTEGER NOT NULL, `SORT_WEIGHT` TEXT, `INITIAL_LETTER` TEXT, `EXTRA` TEXT, `FOLLOWER_STATUS` INTEGER, `BLOCK` INTEGER, `BLOCKED_BY` INTEGER, `RECOMMEND_REASON` TEXT, `ENTERPRISE_USER_VERIFY_REASON` TEXT, `USER_VERIFY_REASON` TEXT, `USER_VERIFY_TYPE` INTEGER, `DELETED` INTEGER, PRIMARY KEY(`UID`))");
                c0vlf.LJIILJJIL("CREATE TABLE IF NOT EXISTS `SHARE_PERMISSION` (`UID` INTEGER NOT NULL, `COLUMN_USER_SHARE_STATUS` INTEGER, `TTN_SHARE_STATUS` INTEGER, `UPDATE_TIME` INTEGER NOT NULL, `EXTRA` TEXT, PRIMARY KEY(`UID`))");
                c0vlf.LJIILJJIL("CREATE TABLE IF NOT EXISTS `USER_INTERACTION` (`ID` TEXT NOT NULL, `TARGET_TYPE` INTEGER NOT NULL, `BUSINESS_TYPE` INTEGER NOT NULL, `DATA` TEXT, PRIMARY KEY(`ID`, `TARGET_TYPE`, `BUSINESS_TYPE`))");
                c0vlf.LJIILJJIL("CREATE TABLE IF NOT EXISTS `IM_USER_BIZ_INFO` (`UID` INTEGER NOT NULL, `SHARE_FILTER_TYPE` INTEGER, `AFFINITY_SCORE` REAL, `UPDATE_TIME` INTEGER, `USER_B2C_ACCOUNT_INFO` TEXT, `CHAT_BOT_INFO` TEXT, `CAMERA_INFO` TEXT, `ALLOW_SINGLE_CHAT_SCREENSHOT` INTEGER, `GROUP_CHAT_PERMISSION_INFO` TEXT, `ACTIVITY_STATUS_SETTING` INTEGER, `CHAT_BUBBLE_ID` INTEGER, `UNLOCKED_BUBBLE_IDS` TEXT, `VOICE_CALL_INFO` TEXT, PRIMARY KEY(`UID`))");
                c0vlf.LJIILJJIL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                c0vlf.LJIILJJIL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '14445767fa0a44d759c00376e7aad764')");
            }

            @Override // X.C0VN3
            public final void dropAllTables(C0VLF c0vlf) {
                c0vlf.LJIILJJIL("DROP TABLE IF EXISTS `IM_USER_BASE_INFO`");
                c0vlf.LJIILJJIL("DROP TABLE IF EXISTS `SHARE_PERMISSION`");
                c0vlf.LJIILJJIL("DROP TABLE IF EXISTS `USER_INTERACTION`");
                c0vlf.LJIILJJIL("DROP TABLE IF EXISTS `IM_USER_BIZ_INFO`");
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
                HashMap map = new HashMap(22);
                map.put("UID", new C795990VKj(1, 1, "UID", "INTEGER", null, true));
                map.put("AVATAR_THUMB", new C795990VKj(0, 1, "AVATAR_THUMB", "TEXT", null, false));
                map.put("AVATAR_MEDIUM", new C795990VKj(0, 1, "AVATAR_MEDIUM", "TEXT", null, false));
                map.put("NICK_NAME", new C795990VKj(0, 1, "NICK_NAME", "TEXT", null, false));
                map.put("UNIQUE_ID", new C795990VKj(0, 1, "UNIQUE_ID", "TEXT", null, false));
                map.put("FOLLOW_STATUS", new C795990VKj(0, 1, "FOLLOW_STATUS", "INTEGER", null, false));
                map.put("FOLLOWER_COUNT", new C795990VKj(0, 1, "FOLLOWER_COUNT", "INTEGER", null, false));
                map.put("FOLLOWING_COUNT", new C795990VKj(0, 1, "FOLLOWING_COUNT", "INTEGER", null, false));
                map.put("MAF_STATUS", new C795990VKj(0, 1, "MAF_STATUS", "INTEGER", null, false));
                map.put("REC_TYPE", new C795990VKj(0, 1, "REC_TYPE", "TEXT", null, false));
                map.put("UPDATE_TIME", new C795990VKj(0, 1, "UPDATE_TIME", "INTEGER", null, true));
                map.put("SORT_WEIGHT", new C795990VKj(0, 1, "SORT_WEIGHT", "TEXT", null, false));
                map.put("INITIAL_LETTER", new C795990VKj(0, 1, "INITIAL_LETTER", "TEXT", null, false));
                map.put("EXTRA", new C795990VKj(0, 1, "EXTRA", "TEXT", null, false));
                map.put("FOLLOWER_STATUS", new C795990VKj(0, 1, "FOLLOWER_STATUS", "INTEGER", null, false));
                map.put("BLOCK", new C795990VKj(0, 1, "BLOCK", "INTEGER", null, false));
                map.put("BLOCKED_BY", new C795990VKj(0, 1, "BLOCKED_BY", "INTEGER", null, false));
                map.put("RECOMMEND_REASON", new C795990VKj(0, 1, "RECOMMEND_REASON", "TEXT", null, false));
                map.put("ENTERPRISE_USER_VERIFY_REASON", new C795990VKj(0, 1, "ENTERPRISE_USER_VERIFY_REASON", "TEXT", null, false));
                map.put("USER_VERIFY_REASON", new C795990VKj(0, 1, "USER_VERIFY_REASON", "TEXT", null, false));
                map.put("USER_VERIFY_TYPE", new C795990VKj(0, 1, "USER_VERIFY_TYPE", "INTEGER", null, false));
                map.put("DELETED", new C795990VKj(0, 1, "DELETED", "INTEGER", null, false));
                C0VN6 c0vn6 = new C0VN6("IM_USER_BASE_INFO", map, new HashSet(0), new HashSet(0));
                C0VN6 c0vn6LIZ = C0VN6.LIZ(c0vlf, "IM_USER_BASE_INFO");
                if (!c0vn6.equals(c0vn6LIZ)) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("IM_USER_BASE_INFO(com.ss.android.ugc.aweme.im.contacts.impl.data.entity.IMUserBaseInfoEntity).\n Expected:\n");
                    sbLIZ.append(c0vn6);
                    sbLIZ.append("\n Found:\n");
                    sbLIZ.append(c0vn6LIZ);
                    return new C0VN4(false, C2188811AlT.LIZIZ(sbLIZ));
                }
                HashMap map2 = new HashMap(5);
                map2.put("UID", new C795990VKj(1, 1, "UID", "INTEGER", null, true));
                map2.put("COLUMN_USER_SHARE_STATUS", new C795990VKj(0, 1, "COLUMN_USER_SHARE_STATUS", "INTEGER", null, false));
                map2.put("TTN_SHARE_STATUS", new C795990VKj(0, 1, "TTN_SHARE_STATUS", "INTEGER", null, false));
                map2.put("UPDATE_TIME", new C795990VKj(0, 1, "UPDATE_TIME", "INTEGER", null, true));
                map2.put("EXTRA", new C795990VKj(0, 1, "EXTRA", "TEXT", null, false));
                C0VN6 c0vn62 = new C0VN6("SHARE_PERMISSION", map2, new HashSet(0), new HashSet(0));
                C0VN6 c0vn6LIZ2 = C0VN6.LIZ(c0vlf, "SHARE_PERMISSION");
                if (!c0vn62.equals(c0vn6LIZ2)) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("SHARE_PERMISSION(com.ss.android.ugc.aweme.im.contacts.impl.data.entity.SharePermissionEntity).\n Expected:\n");
                    sbLIZ2.append(c0vn62);
                    sbLIZ2.append("\n Found:\n");
                    sbLIZ2.append(c0vn6LIZ2);
                    return new C0VN4(false, C2188811AlT.LIZIZ(sbLIZ2));
                }
                HashMap map3 = new HashMap(4);
                map3.put("ID", new C795990VKj(1, 1, "ID", "TEXT", null, true));
                map3.put("TARGET_TYPE", new C795990VKj(2, 1, "TARGET_TYPE", "INTEGER", null, true));
                map3.put("BUSINESS_TYPE", new C795990VKj(3, 1, "BUSINESS_TYPE", "INTEGER", null, true));
                map3.put("DATA", new C795990VKj(0, 1, "DATA", "TEXT", null, false));
                C0VN6 c0vn63 = new C0VN6("USER_INTERACTION", map3, new HashSet(0), new HashSet(0));
                C0VN6 c0vn6LIZ3 = C0VN6.LIZ(c0vlf, "USER_INTERACTION");
                if (!c0vn63.equals(c0vn6LIZ3)) {
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("USER_INTERACTION(com.ss.android.ugc.aweme.im.contacts.impl.data.entity.UserInteractionEntity).\n Expected:\n");
                    sbLIZ3.append(c0vn63);
                    sbLIZ3.append("\n Found:\n");
                    sbLIZ3.append(c0vn6LIZ3);
                    return new C0VN4(false, C2188811AlT.LIZIZ(sbLIZ3));
                }
                HashMap map4 = new HashMap(13);
                map4.put("UID", new C795990VKj(1, 1, "UID", "INTEGER", null, true));
                map4.put("SHARE_FILTER_TYPE", new C795990VKj(0, 1, "SHARE_FILTER_TYPE", "INTEGER", null, false));
                map4.put("AFFINITY_SCORE", new C795990VKj(0, 1, "AFFINITY_SCORE", "REAL", null, false));
                map4.put("UPDATE_TIME", new C795990VKj(0, 1, "UPDATE_TIME", "INTEGER", null, false));
                map4.put("USER_B2C_ACCOUNT_INFO", new C795990VKj(0, 1, "USER_B2C_ACCOUNT_INFO", "TEXT", null, false));
                map4.put("CHAT_BOT_INFO", new C795990VKj(0, 1, "CHAT_BOT_INFO", "TEXT", null, false));
                map4.put("CAMERA_INFO", new C795990VKj(0, 1, "CAMERA_INFO", "TEXT", null, false));
                map4.put("ALLOW_SINGLE_CHAT_SCREENSHOT", new C795990VKj(0, 1, "ALLOW_SINGLE_CHAT_SCREENSHOT", "INTEGER", null, false));
                map4.put("GROUP_CHAT_PERMISSION_INFO", new C795990VKj(0, 1, "GROUP_CHAT_PERMISSION_INFO", "TEXT", null, false));
                map4.put("ACTIVITY_STATUS_SETTING", new C795990VKj(0, 1, "ACTIVITY_STATUS_SETTING", "INTEGER", null, false));
                map4.put("CHAT_BUBBLE_ID", new C795990VKj(0, 1, "CHAT_BUBBLE_ID", "INTEGER", null, false));
                map4.put("UNLOCKED_BUBBLE_IDS", new C795990VKj(0, 1, "UNLOCKED_BUBBLE_IDS", "TEXT", null, false));
                map4.put("VOICE_CALL_INFO", new C795990VKj(0, 1, "VOICE_CALL_INFO", "TEXT", null, false));
                C0VN6 c0vn64 = new C0VN6("IM_USER_BIZ_INFO", map4, new HashSet(0), new HashSet(0));
                C0VN6 c0vn6LIZ4 = C0VN6.LIZ(c0vlf, "IM_USER_BIZ_INFO");
                if (!c0vn64.equals(c0vn6LIZ4)) {
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append("IM_USER_BIZ_INFO(com.ss.android.ugc.aweme.im.contacts.impl.data.entity.IMUserBizInfoEntity).\n Expected:\n");
                    sbLIZ4.append(c0vn64);
                    sbLIZ4.append("\n Found:\n");
                    sbLIZ4.append(c0vn6LIZ4);
                    return new C0VN4(false, C2188811AlT.LIZIZ(sbLIZ4));
                }
                return new C0VN4(true, null);
            }
        }, "14445767fa0a44d759c00376e7aad764", "687925cd0045b8b862d3f3097d44cd66");
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
