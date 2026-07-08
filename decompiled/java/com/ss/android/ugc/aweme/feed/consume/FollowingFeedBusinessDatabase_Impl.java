package com.ss.android.ugc.aweme.feed.consume;

import X.AbstractC796510VMj;
import X.C0VKN;
import X.C0VLF;
import X.C0VLK;
import X.C0VLO;
import X.C0VLV;
import X.C0VLY;
import X.C0VN2;
import X.C0VN3;
import X.C796520VMk;
import X.C796620VMu;
import X.InterfaceC2275591E5d;
import X.InterfaceC796190VLd;
import X.InterfaceC804960Vhu;
import X.InterfaceC805040Vi2;
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

/* JADX INFO: loaded from: classes14.dex */
public final class FollowingFeedBusinessDatabase_Impl extends FollowingFeedBusinessDatabase {
    public volatile C0VLV LLILZIL;
    public volatile C0VLO LLILZLL;
    public volatile C0VLK LLIZ;

    /* JADX WARN: Type inference failed for: r0v4, types: [X.0VLV] */
    @Override // com.ss.android.ugc.aweme.feed.consume.FollowingFeedBusinessDatabase
    public final InterfaceC805040Vi2 LIZ() {
        C0VLV c0vlv;
        if (this.LLILZIL != null) {
            return this.LLILZIL;
        }
        synchronized (this) {
            try {
                if (this.LLILZIL == null) {
                    this.LLILZIL = new InterfaceC805040Vi2(this) { // from class: X.0VLV
                        public final AbstractC796540VMm LIZ;
                        public final C854570Xfj LIZIZ;
                        public final C0VLW LIZJ;
                        public final C854550Xfh LIZLLL;
                        public final C854550Xfh LJ;

                        /* JADX WARN: Type inference failed for: r0v1, types: [X.0VLW] */
                        {
                            this.LIZ = this;
                            this.LIZIZ = new C854570Xfj(this, 25);
                            this.LIZJ = new AbstractC796320VLq<C0VLX>(this) { // from class: X.0VLW
                                @Override // X.AbstractC796320VLq, X.AbstractC795470VIj
                                public final String createQuery() {
                                    return "UPDATE OR ABORT `following_feed_consume` SET `aweme_id` = ?,`uid` = ?,`insert_time` = ?,`read_status` = ?,`score` = ? WHERE `aweme_id` = ? AND `uid` = ?";
                                }

                                @Override // X.AbstractC796320VLq
                                public final void bind(InterfaceC796340VLs interfaceC796340VLs, C0VLX c0vlx) {
                                    C0VLX c0vlx2 = c0vlx;
                                    String str = c0vlx2.LIZ;
                                    if (str == null) {
                                        interfaceC796340VLs.LLD(1);
                                    } else {
                                        interfaceC796340VLs.LJIILIIL(1, str);
                                    }
                                    String str2 = c0vlx2.LIZIZ;
                                    if (str2 == null) {
                                        interfaceC796340VLs.LLD(2);
                                    } else {
                                        interfaceC796340VLs.LJIILIIL(2, str2);
                                    }
                                    interfaceC796340VLs.LJIJ(3, c0vlx2.LIZJ);
                                    interfaceC796340VLs.LJIJ(4, c0vlx2.LIZLLL);
                                    interfaceC796340VLs.LJJI(c0vlx2.LJ, 5);
                                    String str3 = c0vlx2.LIZ;
                                    if (str3 == null) {
                                        interfaceC796340VLs.LLD(6);
                                    } else {
                                        interfaceC796340VLs.LJIILIIL(6, str3);
                                    }
                                    String str4 = c0vlx2.LIZIZ;
                                    if (str4 == null) {
                                        interfaceC796340VLs.LLD(7);
                                    } else {
                                        interfaceC796340VLs.LJIILIIL(7, str4);
                                    }
                                }
                            };
                            this.LIZLLL = new C854550Xfh(this, 63);
                            this.LJ = new C854550Xfh(this, 64);
                        }

                        @Override // X.InterfaceC805040Vi2
                        public final void LIZ(List<C0VLX> list) {
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

                        @Override // X.InterfaceC805040Vi2
                        public final void LIZLLL(C0VLX c0vlx) {
                            this.LIZ.assertNotSuspendingTransaction();
                            this.LIZ.beginTransaction();
                            try {
                                handle(c0vlx);
                                this.LIZ.setTransactionSuccessful();
                                this.LIZ.endTransaction();
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                this.LIZ.endTransaction();
                                throw th;
                            }
                        }

                        @Override // X.InterfaceC805040Vi2
                        public final void LJ(String str) {
                            this.LIZ.assertNotSuspendingTransaction();
                            InterfaceC796340VLs interfaceC796340VLsAcquire = this.LJ.acquire();
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
                                this.LJ.release(interfaceC796340VLsAcquire);
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                this.LIZ.endTransaction();
                                this.LJ.release(interfaceC796340VLsAcquire);
                                throw th;
                            }
                        }

                        @Override // X.InterfaceC805040Vi2
                        public final List<C0VLX> LIZIZ(String str, String str2) {
                            String string;
                            C0VN5 c0vn5LIZLLL = C0VN5.LIZLLL(2, "SELECT * FROM following_feed_consume where uid = ? and aweme_id = ?");
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
                                int iLIZIZ = C795450VIh.LIZIZ(cursorLIZIZ, "aweme_id");
                                int iLIZIZ2 = C795450VIh.LIZIZ(cursorLIZIZ, "uid");
                                int iLIZIZ3 = C795450VIh.LIZIZ(cursorLIZIZ, "insert_time");
                                int iLIZIZ4 = C795450VIh.LIZIZ(cursorLIZIZ, "read_status");
                                int iLIZIZ5 = C795450VIh.LIZIZ(cursorLIZIZ, "score");
                                ArrayList arrayList = new ArrayList(cursorLIZIZ.getCount());
                                while (cursorLIZIZ.moveToNext()) {
                                    String string2 = null;
                                    if (cursorLIZIZ.isNull(iLIZIZ)) {
                                        string = null;
                                    } else {
                                        string = cursorLIZIZ.getString(iLIZIZ);
                                    }
                                    if (!cursorLIZIZ.isNull(iLIZIZ2)) {
                                        string2 = cursorLIZIZ.getString(iLIZIZ2);
                                    }
                                    arrayList.add(new C0VLX(string, cursorLIZIZ.getInt(iLIZIZ4), cursorLIZIZ.getDouble(iLIZIZ5), cursorLIZIZ.getLong(iLIZIZ3), string2));
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

                        @Override // X.InterfaceC805040Vi2
                        public final void LIZJ(long j, String str) {
                            this.LIZ.assertNotSuspendingTransaction();
                            InterfaceC796340VLs interfaceC796340VLsAcquire = this.LIZLLL.acquire();
                            if (str == null) {
                                interfaceC796340VLsAcquire.LLD(1);
                            } else {
                                interfaceC796340VLsAcquire.LJIILIIL(1, str);
                            }
                            interfaceC796340VLsAcquire.LJIJ(2, j);
                            this.LIZ.beginTransaction();
                            try {
                                interfaceC796340VLsAcquire.LJIIL();
                                this.LIZ.setTransactionSuccessful();
                                this.LIZ.endTransaction();
                                this.LIZLLL.release(interfaceC796340VLsAcquire);
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                this.LIZ.endTransaction();
                                this.LIZLLL.release(interfaceC796340VLsAcquire);
                                throw th;
                            }
                        }

                        @Override // X.InterfaceC805040Vi2
                        public final List LJFF(long j, long j2, String str) {
                            String string;
                            C0VN5 c0vn5LIZLLL = C0VN5.LIZLLL(3, "SELECT * FROM following_feed_consume where uid = ? and insert_time > ? and insert_time < ? ORDER BY score DESC");
                            if (str == null) {
                                c0vn5LIZLLL.LLD(1);
                            } else {
                                c0vn5LIZLLL.LJIILIIL(1, str);
                            }
                            c0vn5LIZLLL.LJIJ(2, j);
                            c0vn5LIZLLL.LJIJ(3, j2);
                            this.LIZ.assertNotSuspendingTransaction();
                            Cursor cursorLIZIZ = C0VN0.LIZIZ(this.LIZ, c0vn5LIZLLL, false);
                            try {
                                int iLIZIZ = C795450VIh.LIZIZ(cursorLIZIZ, "aweme_id");
                                int iLIZIZ2 = C795450VIh.LIZIZ(cursorLIZIZ, "uid");
                                int iLIZIZ3 = C795450VIh.LIZIZ(cursorLIZIZ, "insert_time");
                                int iLIZIZ4 = C795450VIh.LIZIZ(cursorLIZIZ, "read_status");
                                int iLIZIZ5 = C795450VIh.LIZIZ(cursorLIZIZ, "score");
                                ArrayList arrayList = new ArrayList(cursorLIZIZ.getCount());
                                while (cursorLIZIZ.moveToNext()) {
                                    String string2 = null;
                                    if (cursorLIZIZ.isNull(iLIZIZ)) {
                                        string = null;
                                    } else {
                                        string = cursorLIZIZ.getString(iLIZIZ);
                                    }
                                    if (!cursorLIZIZ.isNull(iLIZIZ2)) {
                                        string2 = cursorLIZIZ.getString(iLIZIZ2);
                                    }
                                    arrayList.add(new C0VLX(string, cursorLIZIZ.getInt(iLIZIZ4), cursorLIZIZ.getDouble(iLIZIZ5), cursorLIZIZ.getLong(iLIZIZ3), string2));
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
                c0vlv = this.LLILZIL;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return c0vlv;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.0VLO] */
    @Override // com.ss.android.ugc.aweme.feed.consume.FollowingFeedBusinessDatabase
    public final C0VLY LIZIZ() {
        C0VLO c0vlo;
        if (this.LLILZLL != null) {
            return this.LLILZLL;
        }
        synchronized (this) {
            try {
                if (this.LLILZLL == null) {
                    this.LLILZLL = new C0VLY(this) { // from class: X.0VLO
                        public final AbstractC796540VMm LIZ;
                        public final C854570Xfj LIZIZ;
                        public final C854550Xfh LIZJ;
                        public final C854550Xfh LIZLLL;

                        {
                            this.LIZ = this;
                            this.LIZIZ = new C854570Xfj(this, 26);
                            this.LIZJ = new C854550Xfh(this, 65);
                            this.LIZLLL = new C854550Xfh(this, 66);
                        }

                        @Override // X.C0VLY
                        public final void LIZ(List<C0VLP> list) {
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

                        @Override // X.C0VLY
                        public final void LIZIZ(String str) {
                            this.LIZ.assertNotSuspendingTransaction();
                            InterfaceC796340VLs interfaceC796340VLsAcquire = this.LIZLLL.acquire();
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
                                this.LIZLLL.release(interfaceC796340VLsAcquire);
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                this.LIZ.endTransaction();
                                this.LIZLLL.release(interfaceC796340VLsAcquire);
                                throw th;
                            }
                        }

                        @Override // X.C0VLY
                        public final List LIZJ(int i, String str) {
                            String string;
                            C0VN5 c0vn5LIZLLL = C0VN5.LIZLLL(2, "SELECT * FROM following_frequent_user_new where uid = ? LIMIT ?");
                            if (str == null) {
                                c0vn5LIZLLL.LLD(1);
                            } else {
                                c0vn5LIZLLL.LJIILIIL(1, str);
                            }
                            c0vn5LIZLLL.LJIJ(2, i);
                            this.LIZ.assertNotSuspendingTransaction();
                            Cursor cursorLIZIZ = C0VN0.LIZIZ(this.LIZ, c0vn5LIZLLL, false);
                            try {
                                int iLIZIZ = C795450VIh.LIZIZ(cursorLIZIZ, FollowStatusChangeMethod.PARAM_UID);
                                int iLIZIZ2 = C795450VIh.LIZIZ(cursorLIZIZ, "uid");
                                int iLIZIZ3 = C795450VIh.LIZIZ(cursorLIZIZ, "author_id");
                                int iLIZIZ4 = C795450VIh.LIZIZ(cursorLIZIZ, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
                                int iLIZIZ5 = C795450VIh.LIZIZ(cursorLIZIZ, "update_time");
                                ArrayList arrayList = new ArrayList(cursorLIZIZ.getCount());
                                while (cursorLIZIZ.moveToNext()) {
                                    long j = cursorLIZIZ.getLong(iLIZIZ);
                                    String string2 = null;
                                    if (cursorLIZIZ.isNull(iLIZIZ2)) {
                                        string = null;
                                    } else {
                                        string = cursorLIZIZ.getString(iLIZIZ2);
                                    }
                                    if (!cursorLIZIZ.isNull(iLIZIZ3)) {
                                        string2 = cursorLIZIZ.getString(iLIZIZ3);
                                    }
                                    arrayList.add(new C0VLP(cursorLIZIZ.getInt(iLIZIZ4), j, cursorLIZIZ.getLong(iLIZIZ5), string, string2));
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

                        @Override // X.C0VLY
                        public final void LIZLLL(String str, String str2) {
                            this.LIZ.assertNotSuspendingTransaction();
                            InterfaceC796340VLs interfaceC796340VLsAcquire = this.LIZJ.acquire();
                            if (str == null) {
                                interfaceC796340VLsAcquire.LLD(1);
                            } else {
                                interfaceC796340VLsAcquire.LJIILIIL(1, str);
                            }
                            if (str2 == null) {
                                interfaceC796340VLsAcquire.LLD(2);
                            } else {
                                interfaceC796340VLsAcquire.LJIILIIL(2, str2);
                            }
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
                    };
                }
                c0vlo = this.LLILZLL;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return c0vlo;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.0VLK] */
    @Override // com.ss.android.ugc.aweme.feed.consume.FollowingFeedBusinessDatabase
    public final InterfaceC804960Vhu LIZJ() {
        C0VLK c0vlk;
        if (this.LLIZ != null) {
            return this.LLIZ;
        }
        synchronized (this) {
            try {
                if (this.LLIZ == null) {
                    this.LLIZ = new InterfaceC804960Vhu(this) { // from class: X.0VLK
                        public final AbstractC796540VMm LIZ;
                        public final C0VLL LIZIZ;
                        public final C0VLM LIZJ;

                        /* JADX WARN: Type inference failed for: r0v0, types: [X.0VLL] */
                        /* JADX WARN: Type inference failed for: r0v1, types: [X.0VLM] */
                        {
                            this.LIZ = this;
                            this.LIZIZ = new AbstractC796330VLr<C0VLN>(this) { // from class: X.0VLL
                                @Override // X.AbstractC795470VIj
                                public final String createQuery() {
                                    return "INSERT OR REPLACE INTO `following_hvr_user` (`id`,`uid`,`author_id`,`frequently_watch`,`frequently_interact`) VALUES (nullif(?, 0),?,?,?,?)";
                                }

                                @Override // X.AbstractC796330VLr
                                public final void bind(InterfaceC796340VLs interfaceC796340VLs, C0VLN c0vln) {
                                    C0VLN c0vln2 = c0vln;
                                    interfaceC796340VLs.LJIJ(1, c0vln2.LIZ);
                                    String str = c0vln2.LIZIZ;
                                    if (str == null) {
                                        interfaceC796340VLs.LLD(2);
                                    } else {
                                        interfaceC796340VLs.LJIILIIL(2, str);
                                    }
                                    String str2 = c0vln2.LIZJ;
                                    if (str2 == null) {
                                        interfaceC796340VLs.LLD(3);
                                    } else {
                                        interfaceC796340VLs.LJIILIIL(3, str2);
                                    }
                                    interfaceC796340VLs.LJIJ(4, c0vln2.LIZLLL ? 1L : 0L);
                                    interfaceC796340VLs.LJIJ(5, c0vln2.LJ ? 1L : 0L);
                                }
                            };
                            this.LIZJ = new AbstractC795470VIj(this) { // from class: X.0VLM
                                @Override // X.AbstractC795470VIj
                                public final String createQuery() {
                                    return "DELETE FROM following_hvr_user where uid = ?";
                                }
                            };
                        }

                        @Override // X.InterfaceC804960Vhu
                        public final void LIZ(List<C0VLN> list) {
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

                        @Override // X.InterfaceC804960Vhu
                        public final void LIZIZ(String str) {
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

                        @Override // X.InterfaceC804960Vhu
                        public final List<C0VLN> LIZLLL(String str) {
                            String string;
                            boolean z;
                            boolean z2;
                            C0VN5 c0vn5LIZLLL = C0VN5.LIZLLL(1, "SELECT * FROM following_hvr_user where uid = ?");
                            if (str == null) {
                                c0vn5LIZLLL.LLD(1);
                            } else {
                                c0vn5LIZLLL.LJIILIIL(1, str);
                            }
                            this.LIZ.assertNotSuspendingTransaction();
                            Cursor cursorLIZIZ = C0VN0.LIZIZ(this.LIZ, c0vn5LIZLLL, false);
                            try {
                                int iLIZIZ = C795450VIh.LIZIZ(cursorLIZIZ, FollowStatusChangeMethod.PARAM_UID);
                                int iLIZIZ2 = C795450VIh.LIZIZ(cursorLIZIZ, "uid");
                                int iLIZIZ3 = C795450VIh.LIZIZ(cursorLIZIZ, "author_id");
                                int iLIZIZ4 = C795450VIh.LIZIZ(cursorLIZIZ, "frequently_watch");
                                int iLIZIZ5 = C795450VIh.LIZIZ(cursorLIZIZ, "frequently_interact");
                                ArrayList arrayList = new ArrayList(cursorLIZIZ.getCount());
                                while (cursorLIZIZ.moveToNext()) {
                                    long j = cursorLIZIZ.getLong(iLIZIZ);
                                    String string2 = null;
                                    if (cursorLIZIZ.isNull(iLIZIZ2)) {
                                        string = null;
                                    } else {
                                        string = cursorLIZIZ.getString(iLIZIZ2);
                                    }
                                    if (!cursorLIZIZ.isNull(iLIZIZ3)) {
                                        string2 = cursorLIZIZ.getString(iLIZIZ3);
                                    }
                                    if (cursorLIZIZ.getInt(iLIZIZ4) != 0) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    if (cursorLIZIZ.getInt(iLIZIZ5) != 0) {
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                    arrayList.add(new C0VLN(string, j, string2, z, z2));
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

                        @Override // X.InterfaceC804960Vhu
                        public final List LIZJ(int i, String str) {
                            String string;
                            boolean z;
                            boolean z2;
                            C0VN5 c0vn5LIZLLL = C0VN5.LIZLLL(2, "SELECT * FROM following_hvr_user where uid = ? ORDER BY id DESC LIMIT ?");
                            if (str == null) {
                                c0vn5LIZLLL.LLD(1);
                            } else {
                                c0vn5LIZLLL.LJIILIIL(1, str);
                            }
                            c0vn5LIZLLL.LJIJ(2, i);
                            this.LIZ.assertNotSuspendingTransaction();
                            Cursor cursorLIZIZ = C0VN0.LIZIZ(this.LIZ, c0vn5LIZLLL, false);
                            try {
                                int iLIZIZ = C795450VIh.LIZIZ(cursorLIZIZ, FollowStatusChangeMethod.PARAM_UID);
                                int iLIZIZ2 = C795450VIh.LIZIZ(cursorLIZIZ, "uid");
                                int iLIZIZ3 = C795450VIh.LIZIZ(cursorLIZIZ, "author_id");
                                int iLIZIZ4 = C795450VIh.LIZIZ(cursorLIZIZ, "frequently_watch");
                                int iLIZIZ5 = C795450VIh.LIZIZ(cursorLIZIZ, "frequently_interact");
                                ArrayList arrayList = new ArrayList(cursorLIZIZ.getCount());
                                while (cursorLIZIZ.moveToNext()) {
                                    long j = cursorLIZIZ.getLong(iLIZIZ);
                                    String string2 = null;
                                    if (cursorLIZIZ.isNull(iLIZIZ2)) {
                                        string = null;
                                    } else {
                                        string = cursorLIZIZ.getString(iLIZIZ2);
                                    }
                                    if (!cursorLIZIZ.isNull(iLIZIZ3)) {
                                        string2 = cursorLIZIZ.getString(iLIZIZ3);
                                    }
                                    if (cursorLIZIZ.getInt(iLIZIZ4) != 0) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    if (cursorLIZIZ.getInt(iLIZIZ5) != 0) {
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                    arrayList.add(new C0VLN(string, j, string2, z, z2));
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
                c0vlk = this.LLIZ;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return c0vlk;
    }

    @Override // X.AbstractC796540VMm
    public final void clearAllTables() {
        super.assertNotMainThread();
        C0VLF c0vlfLJLJJI = this.mOpenHelper.LJLJJI();
        try {
            super.beginTransaction();
            c0vlfLJLJJI.LJIILJJIL("DELETE FROM `following_feed_consume`");
            c0vlfLJLJJI.LJIILJJIL("DELETE FROM `following_frequent_user_new`");
            c0vlfLJLJJI.LJIILJJIL("DELETE FROM `following_hvr_user`");
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
        return new C796620VMu(this, new HashMap(0), new HashMap(0), "following_feed_consume", "following_frequent_user_new", "following_hvr_user");
    }

    @Override // X.AbstractC796540VMm
    public final Set<Class<? extends InterfaceC2275591E5d>> getRequiredAutoMigrationSpecs() {
        return new HashSet();
    }

    @Override // X.AbstractC796540VMm
    public final Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
        HashMap map = new HashMap();
        map.put(InterfaceC805040Vi2.class, Collections.emptyList());
        map.put(C0VLY.class, Collections.emptyList());
        map.put(InterfaceC804960Vhu.class, Collections.emptyList());
        return map;
    }

    @Override // X.AbstractC796540VMm
    public final InterfaceC796190VLd createOpenHelper(C796520VMk c796520VMk) {
        C0VN2 c0vn2 = new C0VN2(c796520VMk, new C0VN3() { // from class: X.0VLH
            @Override // X.C0VN3
            public final void onPostMigrate(C0VLF c0vlf) {
            }

            {
                super(4);
            }

            @Override // X.C0VN3
            public final void createAllTables(C0VLF c0vlf) {
                c0vlf.LJIILJJIL("CREATE TABLE IF NOT EXISTS `following_feed_consume` (`aweme_id` TEXT NOT NULL, `uid` TEXT NOT NULL, `insert_time` INTEGER NOT NULL, `read_status` INTEGER NOT NULL, `score` REAL NOT NULL, PRIMARY KEY(`aweme_id`, `uid`))");
                c0vlf.LJIILJJIL("CREATE TABLE IF NOT EXISTS `following_frequent_user_new` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `uid` TEXT NOT NULL, `author_id` TEXT NOT NULL, `status` INTEGER NOT NULL, `update_time` INTEGER NOT NULL)");
                c0vlf.LJIILJJIL("CREATE TABLE IF NOT EXISTS `following_hvr_user` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `uid` TEXT NOT NULL, `author_id` TEXT NOT NULL, `frequently_watch` INTEGER NOT NULL, `frequently_interact` INTEGER NOT NULL)");
                c0vlf.LJIILJJIL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                c0vlf.LJIILJJIL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '74aae57bd76af4ebf799a58c842f9e64')");
            }

            @Override // X.C0VN3
            public final void dropAllTables(C0VLF c0vlf) {
                c0vlf.LJIILJJIL("DROP TABLE IF EXISTS `following_feed_consume`");
                c0vlf.LJIILJJIL("DROP TABLE IF EXISTS `following_frequent_user_new`");
                c0vlf.LJIILJJIL("DROP TABLE IF EXISTS `following_hvr_user`");
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
                HashMap map = new HashMap(5);
                map.put("aweme_id", new C795990VKj(1, 1, "aweme_id", "TEXT", null, true));
                map.put("uid", new C795990VKj(2, 1, "uid", "TEXT", null, true));
                map.put("insert_time", new C795990VKj(0, 1, "insert_time", "INTEGER", null, true));
                map.put("read_status", new C795990VKj(0, 1, "read_status", "INTEGER", null, true));
                map.put("score", new C795990VKj(0, 1, "score", "REAL", null, true));
                C0VN6 c0vn6 = new C0VN6("following_feed_consume", map, new HashSet(0), new HashSet(0));
                C0VN6 c0vn6LIZ = C0VN6.LIZ(c0vlf, "following_feed_consume");
                if (!c0vn6.equals(c0vn6LIZ)) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("following_feed_consume(com.ss.android.ugc.aweme.feed.consume.FollowingFeedConsumeEntity).\n Expected:\n");
                    sbLIZ.append(c0vn6);
                    sbLIZ.append("\n Found:\n");
                    sbLIZ.append(c0vn6LIZ);
                    return new C0VN4(false, C2188811AlT.LIZIZ(sbLIZ));
                }
                HashMap map2 = new HashMap(5);
                map2.put(FollowStatusChangeMethod.PARAM_UID, new C795990VKj(1, 1, FollowStatusChangeMethod.PARAM_UID, "INTEGER", null, true));
                map2.put("uid", new C795990VKj(0, 1, "uid", "TEXT", null, true));
                map2.put("author_id", new C795990VKj(0, 1, "author_id", "TEXT", null, true));
                map2.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, new C795990VKj(0, 1, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, "INTEGER", null, true));
                map2.put("update_time", new C795990VKj(0, 1, "update_time", "INTEGER", null, true));
                C0VN6 c0vn62 = new C0VN6("following_frequent_user_new", map2, new HashSet(0), new HashSet(0));
                C0VN6 c0vn6LIZ2 = C0VN6.LIZ(c0vlf, "following_frequent_user_new");
                if (!c0vn62.equals(c0vn6LIZ2)) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("following_frequent_user_new(com.ss.android.ugc.aweme.feed.suggestfollowing.FollowingFrequentUserNewEntity).\n Expected:\n");
                    sbLIZ2.append(c0vn62);
                    sbLIZ2.append("\n Found:\n");
                    sbLIZ2.append(c0vn6LIZ2);
                    return new C0VN4(false, C2188811AlT.LIZIZ(sbLIZ2));
                }
                HashMap map3 = new HashMap(5);
                map3.put(FollowStatusChangeMethod.PARAM_UID, new C795990VKj(1, 1, FollowStatusChangeMethod.PARAM_UID, "INTEGER", null, true));
                map3.put("uid", new C795990VKj(0, 1, "uid", "TEXT", null, true));
                map3.put("author_id", new C795990VKj(0, 1, "author_id", "TEXT", null, true));
                map3.put("frequently_watch", new C795990VKj(0, 1, "frequently_watch", "INTEGER", null, true));
                map3.put("frequently_interact", new C795990VKj(0, 1, "frequently_interact", "INTEGER", null, true));
                C0VN6 c0vn63 = new C0VN6("following_hvr_user", map3, new HashSet(0), new HashSet(0));
                C0VN6 c0vn6LIZ3 = C0VN6.LIZ(c0vlf, "following_hvr_user");
                if (!c0vn63.equals(c0vn6LIZ3)) {
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("following_hvr_user(com.ss.android.ugc.aweme.feed.hvr.FollowingHvrUserEntity).\n Expected:\n");
                    sbLIZ3.append(c0vn63);
                    sbLIZ3.append("\n Found:\n");
                    sbLIZ3.append(c0vn6LIZ3);
                    return new C0VN4(false, C2188811AlT.LIZIZ(sbLIZ3));
                }
                return new C0VN4(true, null);
            }
        }, "74aae57bd76af4ebf799a58c842f9e64", "bcf005d3ec3af7d698df82a02275af62");
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
