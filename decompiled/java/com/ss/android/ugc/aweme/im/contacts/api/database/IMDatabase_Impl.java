package com.ss.android.ugc.aweme.im.contacts.api.database;

import X.AbstractC796510VMj;
import X.C0VKN;
import X.C0VLF;
import X.C0VN2;
import X.C0VN3;
import X.C796390VLx;
import X.C796520VMk;
import X.C796620VMu;
import X.InterfaceC2275591E5d;
import X.InterfaceC796190VLd;
import X.InterfaceC805460Vii;
import android.database.Cursor;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes14.dex */
public final class IMDatabase_Impl extends IMDatabase {
    public volatile C796390VLx LLILZLL;

    /* JADX WARN: Type inference failed for: r0v4, types: [X.0VLx] */
    @Override // com.ss.android.ugc.aweme.im.contacts.api.database.IMDatabase
    public final InterfaceC805460Vii LIZ() {
        C796390VLx c796390VLx;
        if (this.LLILZLL != null) {
            return this.LLILZLL;
        }
        synchronized (this) {
            try {
                if (this.LLILZLL == null) {
                    this.LLILZLL = new InterfaceC805460Vii(this) { // from class: X.0VLx
                        public final AbstractC796540VMm LIZIZ;
                        public final C854570Xfj LIZJ;
                        public final C854570Xfj LIZLLL;
                        public final C854550Xfh LJ;
                        public final C854550Xfh LJFF;
                        public final C854550Xfh LJI;

                        @Override // X.InterfaceC805460Vii
                        public final int LIZIZ() {
                            C0VN5 c0vn5LIZLLL = C0VN5.LIZLLL(0, "SELECT count(*) FROM RECENT_SHARE");
                            this.LIZIZ.assertNotSuspendingTransaction();
                            Cursor cursorLIZIZ = C0VN0.LIZIZ(this.LIZIZ, c0vn5LIZLLL, false);
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

                        {
                            this.LIZIZ = this;
                            this.LIZJ = new C854570Xfj(this, 29);
                            this.LIZLLL = new C854570Xfj(this, 30);
                            this.LJ = new C854550Xfh(this, 70);
                            this.LJFF = new C854550Xfh(this, 71);
                            this.LJI = new C854550Xfh(this, 72);
                        }

                        @Override // X.InterfaceC805460Vii
                        public final void LIZJ(String str) {
                            this.LIZIZ.assertNotSuspendingTransaction();
                            InterfaceC796340VLs interfaceC796340VLsAcquire = this.LJI.acquire();
                            interfaceC796340VLsAcquire.LJIILIIL(1, str);
                            long j = LSPassThroughRecordSizeConfig.DEFAULT;
                            interfaceC796340VLsAcquire.LJIJ(2, j);
                            interfaceC796340VLsAcquire.LJIJ(3, j);
                            this.LIZIZ.beginTransaction();
                            try {
                                interfaceC796340VLsAcquire.LJIIL();
                                this.LIZIZ.setTransactionSuccessful();
                                this.LIZIZ.endTransaction();
                                this.LJI.release(interfaceC796340VLsAcquire);
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                this.LIZIZ.endTransaction();
                                this.LJI.release(interfaceC796340VLsAcquire);
                                throw th;
                            }
                        }

                        @Override // X.InterfaceC805460Vii
                        public final List<String> LIZLLL(String str) {
                            String string;
                            C0VN5 c0vn5LIZLLL = C0VN5.LIZLLL(1, "SELECT ID FROM RECENT_SHARE WHERE SEND_TIME >= 0 AND CURR_UID = ? ORDER BY SEND_TIME DESC");
                            c0vn5LIZLLL.LJIILIIL(1, str);
                            this.LIZIZ.assertNotSuspendingTransaction();
                            Cursor cursorLIZIZ = C0VN0.LIZIZ(this.LIZIZ, c0vn5LIZLLL, false);
                            try {
                                ArrayList arrayList = new ArrayList(cursorLIZIZ.getCount());
                                while (cursorLIZIZ.moveToNext()) {
                                    if (cursorLIZIZ.isNull(0)) {
                                        string = null;
                                    } else {
                                        string = cursorLIZIZ.getString(0);
                                    }
                                    arrayList.add(string);
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

                        @Override // X.InterfaceC805460Vii
                        public final List<String> LJFF(String str) {
                            String string;
                            C0VN5 c0vn5LIZLLL = C0VN5.LIZLLL(1, "SELECT ID FROM RECENT_SHARE WHERE SHARE_TIME >= 0 AND CURR_UID = ? ORDER BY SHARE_TIME DESC");
                            c0vn5LIZLLL.LJIILIIL(1, str);
                            this.LIZIZ.assertNotSuspendingTransaction();
                            Cursor cursorLIZIZ = C0VN0.LIZIZ(this.LIZIZ, c0vn5LIZLLL, false);
                            try {
                                ArrayList arrayList = new ArrayList(cursorLIZIZ.getCount());
                                while (cursorLIZIZ.moveToNext()) {
                                    if (cursorLIZIZ.isNull(0)) {
                                        string = null;
                                    } else {
                                        string = cursorLIZIZ.getString(0);
                                    }
                                    arrayList.add(string);
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

                        @Override // X.InterfaceC805460Vii
                        public final void LJI(List<C796400VLy> list) {
                            this.LIZIZ.assertNotSuspendingTransaction();
                            this.LIZIZ.beginTransaction();
                            try {
                                this.LIZJ.insert((Iterable) list);
                                this.LIZIZ.setTransactionSuccessful();
                                this.LIZIZ.endTransaction();
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                this.LIZIZ.endTransaction();
                                throw th;
                            }
                        }

                        @Override // X.InterfaceC805460Vii
                        public final List LJII(String str) {
                            String string;
                            C0VN5 c0vn5LIZLLL = C0VN5.LIZLLL(2, "SELECT ID FROM RECENT_SHARE WHERE SHARE_TIME >= 0 AND CURR_UID = ? AND SHARE_TYPE = ?");
                            c0vn5LIZLLL.LJIILIIL(1, str);
                            c0vn5LIZLLL.LJIILIIL(2, "recent link share");
                            this.LIZIZ.assertNotSuspendingTransaction();
                            Cursor cursorLIZIZ = C0VN0.LIZIZ(this.LIZIZ, c0vn5LIZLLL, false);
                            try {
                                ArrayList arrayList = new ArrayList(cursorLIZIZ.getCount());
                                while (cursorLIZIZ.moveToNext()) {
                                    if (cursorLIZIZ.isNull(0)) {
                                        string = null;
                                    } else {
                                        string = cursorLIZIZ.getString(0);
                                    }
                                    arrayList.add(string);
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

                        @Override // X.InterfaceC805460Vii
                        public final List LJIIIIZZ(String str) {
                            String string;
                            String string2;
                            C0VN5 c0vn5LIZLLL = C0VN5.LIZLLL(2, "SELECT * FROM RECENT_SHARE WHERE SHARE_TIME >= 0 AND CURR_UID = ? ORDER BY SHARE_TIME DESC LIMIT ?");
                            c0vn5LIZLLL.LJIILIIL(1, str);
                            c0vn5LIZLLL.LJIJ(2, 100);
                            this.LIZIZ.assertNotSuspendingTransaction();
                            Cursor cursorLIZIZ = C0VN0.LIZIZ(this.LIZIZ, c0vn5LIZLLL, false);
                            try {
                                int iLIZIZ = C795450VIh.LIZIZ(cursorLIZIZ, "CURR_UID");
                                int iLIZIZ2 = C795450VIh.LIZIZ(cursorLIZIZ, "ID");
                                int iLIZIZ3 = C795450VIh.LIZIZ(cursorLIZIZ, "SHARE_TIME");
                                int iLIZIZ4 = C795450VIh.LIZIZ(cursorLIZIZ, "SHARE_TYPE");
                                int iLIZIZ5 = C795450VIh.LIZIZ(cursorLIZIZ, "SEND_TIME");
                                ArrayList arrayList = new ArrayList(cursorLIZIZ.getCount());
                                while (cursorLIZIZ.moveToNext()) {
                                    String string3 = null;
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
                                    long j = cursorLIZIZ.getLong(iLIZIZ3);
                                    if (!cursorLIZIZ.isNull(iLIZIZ4)) {
                                        string3 = cursorLIZIZ.getString(iLIZIZ4);
                                    }
                                    arrayList.add(new C796400VLy(j, cursorLIZIZ.getLong(iLIZIZ5), string, string2, string3));
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

                        @Override // X.InterfaceC805460Vii
                        public final List<C796400VLy> LJIIIZ(String str) {
                            String string;
                            String string2;
                            C0VN5 c0vn5LIZLLL = C0VN5.LIZLLL(1, "SELECT * FROM RECENT_SHARE  WHERE CURR_UID = ?");
                            c0vn5LIZLLL.LJIILIIL(1, str);
                            this.LIZIZ.assertNotSuspendingTransaction();
                            Cursor cursorLIZIZ = C0VN0.LIZIZ(this.LIZIZ, c0vn5LIZLLL, false);
                            try {
                                int iLIZIZ = C795450VIh.LIZIZ(cursorLIZIZ, "CURR_UID");
                                int iLIZIZ2 = C795450VIh.LIZIZ(cursorLIZIZ, "ID");
                                int iLIZIZ3 = C795450VIh.LIZIZ(cursorLIZIZ, "SHARE_TIME");
                                int iLIZIZ4 = C795450VIh.LIZIZ(cursorLIZIZ, "SHARE_TYPE");
                                int iLIZIZ5 = C795450VIh.LIZIZ(cursorLIZIZ, "SEND_TIME");
                                ArrayList arrayList = new ArrayList(cursorLIZIZ.getCount());
                                while (cursorLIZIZ.moveToNext()) {
                                    String string3 = null;
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
                                    long j = cursorLIZIZ.getLong(iLIZIZ3);
                                    if (!cursorLIZIZ.isNull(iLIZIZ4)) {
                                        string3 = cursorLIZIZ.getString(iLIZIZ4);
                                    }
                                    arrayList.add(new C796400VLy(j, cursorLIZIZ.getLong(iLIZIZ5), string, string2, string3));
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

                        @Override // X.InterfaceC805460Vii
                        public final List LJIIJ(String str) {
                            String string;
                            String string2;
                            C0VN5 c0vn5LIZLLL = C0VN5.LIZLLL(2, "SELECT * FROM RECENT_SHARE WHERE SEND_TIME >= 0 AND CURR_UID = ? ORDER BY SEND_TIME DESC LIMIT ?");
                            c0vn5LIZLLL.LJIILIIL(1, str);
                            c0vn5LIZLLL.LJIJ(2, 100);
                            this.LIZIZ.assertNotSuspendingTransaction();
                            Cursor cursorLIZIZ = C0VN0.LIZIZ(this.LIZIZ, c0vn5LIZLLL, false);
                            try {
                                int iLIZIZ = C795450VIh.LIZIZ(cursorLIZIZ, "CURR_UID");
                                int iLIZIZ2 = C795450VIh.LIZIZ(cursorLIZIZ, "ID");
                                int iLIZIZ3 = C795450VIh.LIZIZ(cursorLIZIZ, "SHARE_TIME");
                                int iLIZIZ4 = C795450VIh.LIZIZ(cursorLIZIZ, "SHARE_TYPE");
                                int iLIZIZ5 = C795450VIh.LIZIZ(cursorLIZIZ, "SEND_TIME");
                                ArrayList arrayList = new ArrayList(cursorLIZIZ.getCount());
                                while (cursorLIZIZ.moveToNext()) {
                                    String string3 = null;
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
                                    long j = cursorLIZIZ.getLong(iLIZIZ3);
                                    if (!cursorLIZIZ.isNull(iLIZIZ4)) {
                                        string3 = cursorLIZIZ.getString(iLIZIZ4);
                                    }
                                    arrayList.add(new C796400VLy(j, cursorLIZIZ.getLong(iLIZIZ5), string, string2, string3));
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

                        public final long LJIIJJI(C796400VLy c796400VLy) {
                            this.LIZIZ.assertNotSuspendingTransaction();
                            this.LIZIZ.beginTransaction();
                            try {
                                long jInsertAndReturnId = this.LIZLLL.insertAndReturnId(c796400VLy);
                                this.LIZIZ.setTransactionSuccessful();
                                this.LIZIZ.endTransaction();
                                return jInsertAndReturnId;
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                this.LIZIZ.endTransaction();
                                throw th;
                            }
                        }

                        @Override // X.InterfaceC805460Vii
                        public final void LJ(String str, String str2) {
                            this.LIZIZ.assertNotSuspendingTransaction();
                            InterfaceC796340VLs interfaceC796340VLsAcquire = this.LJFF.acquire();
                            if (str2 == null) {
                                interfaceC796340VLsAcquire.LLD(1);
                            } else {
                                interfaceC796340VLsAcquire.LJIILIIL(1, str2);
                            }
                            interfaceC796340VLsAcquire.LJIILIIL(2, str);
                            this.LIZIZ.beginTransaction();
                            try {
                                interfaceC796340VLsAcquire.LJIIL();
                                this.LIZIZ.setTransactionSuccessful();
                                this.LIZIZ.endTransaction();
                                this.LJFF.release(interfaceC796340VLsAcquire);
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                this.LIZIZ.endTransaction();
                                this.LJFF.release(interfaceC796340VLsAcquire);
                                throw th;
                            }
                        }

                        public final void LJIIL(long j, String str) {
                            this.LIZIZ.assertNotSuspendingTransaction();
                            InterfaceC796340VLs interfaceC796340VLsAcquire = this.LJ.acquire();
                            interfaceC796340VLsAcquire.LJIJ(1, j);
                            interfaceC796340VLsAcquire.LJIILIIL(2, str);
                            this.LIZIZ.beginTransaction();
                            try {
                                interfaceC796340VLsAcquire.LJIIL();
                                this.LIZIZ.setTransactionSuccessful();
                                this.LIZIZ.endTransaction();
                                this.LJ.release(interfaceC796340VLsAcquire);
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                this.LIZIZ.endTransaction();
                                this.LJ.release(interfaceC796340VLsAcquire);
                                throw th;
                            }
                        }

                        @Override // X.InterfaceC805460Vii
                        public final void LIZ(long j, String str, String str2) {
                            this.LIZIZ.beginTransaction();
                            try {
                                if (LJIIJJI(new C796400VLy(-1L, j, str, str2, "")) == -1) {
                                    LJIIL(j, str2);
                                }
                                this.LIZIZ.setTransactionSuccessful();
                                this.LIZIZ.endTransaction();
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                this.LIZIZ.endTransaction();
                                throw th;
                            }
                        }
                    };
                }
                c796390VLx = this.LLILZLL;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return c796390VLx;
    }

    @Override // X.AbstractC796540VMm
    public final void clearAllTables() {
        super.assertNotMainThread();
        C0VLF c0vlfLJLJJI = this.mOpenHelper.LJLJJI();
        try {
            super.beginTransaction();
            c0vlfLJLJJI.LJIILJJIL("DELETE FROM `SIMPLE_USER`");
            c0vlfLJLJJI.LJIILJJIL("DELETE FROM `RECENT_SHARE`");
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
        return new C796620VMu(this, new HashMap(0), new HashMap(0), "SIMPLE_USER", "RECENT_SHARE");
    }

    @Override // X.AbstractC796540VMm
    public final Set<Class<? extends InterfaceC2275591E5d>> getRequiredAutoMigrationSpecs() {
        return new HashSet();
    }

    @Override // X.AbstractC796540VMm
    public final Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
        HashMap map = new HashMap();
        map.put(InterfaceC805460Vii.class, Collections.emptyList());
        return map;
    }

    @Override // X.AbstractC796540VMm
    public final InterfaceC796190VLd createOpenHelper(C796520VMk c796520VMk) {
        C0VN2 c0vn2 = new C0VN2(c796520VMk, new C0VN3() { // from class: X.0VNZ
            @Override // X.C0VN3
            public final void onPostMigrate(C0VLF c0vlf) {
            }

            {
                super(36);
            }

            @Override // X.C0VN3
            public final void createAllTables(C0VLF c0vlf) {
                c0vlf.LJIILJJIL("CREATE TABLE IF NOT EXISTS `SIMPLE_USER` (`UID` TEXT NOT NULL, `SEC_UID` TEXT, `NICK_NAME` TEXT, `SIGNATURE` TEXT, `AVATAR_THUMB` TEXT, `FOLLOW_STATUS` INTEGER NOT NULL, `UNIQUE_ID` TEXT, `WEIBO_VERIFY` TEXT, `CUSTOM_VERIFY` TEXT, `ENTERPRISE_VERIFY_REASON` TEXT, `VERIFICATION_TYPE` TEXT, `REMARK_NAME` TEXT, `SORT_WEIGHT` TEXT, `INITIAL_LETTER` TEXT, `SHORT_ID` TEXT, `REMARK_PINYIN` TEXT, `REMARK_INITIAL` TEXT, `NICK_NAME_PINYIN` TEXT, `NICK_NAME_INITIAL` TEXT, `COMMERCE_USER_LEVEL` INTEGER, `COLUMN_CONTACT_NAME` TEXT, `COLUMN_CONTACT_NAME_PINYIN` TEXT, `COLUMN_CONTACT_NAME_INITIAL` TEXT, `COLUMN_USER_SHARE_STATUS` INTEGER, `USER_FRIEND_REC_TYPE` INTEGER, `USER_FRIEND_REC_TIME` INTEGER, `USER_FOLLOW_TIME` INTEGER, `BLOCK_STATUS` INTEGER, `MENTION_ENABLED` INTEGER NOT NULL DEFAULT 0, `COMMENT_MENTION_BLOCK_STATUS` INTEGER NOT NULL DEFAULT 0, `VIDEO_MENTION_BLOCK_STATUS` INTEGER NOT NULL DEFAULT 0, `VIDEO_TAG_BLOCK_STATUS` INTEGER NOT NULL DEFAULT 0, `QA_INVITE_BLOCK_STATUS` INTEGER NOT NULL DEFAULT 0, `FOLLOWER_STATUS` INTEGER NOT NULL DEFAULT 0, `ACCOUNT_TYPE` INTEGER, `FOLLOWER_COUNT` INTEGER NOT NULL DEFAULT 0, `FOLLOWING_COUNT` INTEGER NOT NULL DEFAULT 0, `INTERNAL_SHARE_HOLD_OUT_VERSION` INTEGER NOT NULL DEFAULT 0, `AVATAR_MEDIUM` TEXT, `WELCOME_MESSAGE_ENABLED` INTEGER NOT NULL DEFAULT 0, PRIMARY KEY(`UID`))");
                c0vlf.LJIILJJIL("CREATE TABLE IF NOT EXISTS `RECENT_SHARE` (`CURR_UID` TEXT NOT NULL, `ID` TEXT NOT NULL, `SHARE_TIME` INTEGER NOT NULL, `SHARE_TYPE` TEXT NOT NULL, `SEND_TIME` INTEGER NOT NULL, PRIMARY KEY(`ID`, `CURR_UID`))");
                c0vlf.LJIILJJIL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                c0vlf.LJIILJJIL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '3e7a90d66dd752a985cfcac676692993')");
            }

            @Override // X.C0VN3
            public final void dropAllTables(C0VLF c0vlf) {
                c0vlf.LJIILJJIL("DROP TABLE IF EXISTS `SIMPLE_USER`");
                c0vlf.LJIILJJIL("DROP TABLE IF EXISTS `RECENT_SHARE`");
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
                HashMap map = new HashMap(40);
                map.put("UID", new C795990VKj(1, 1, "UID", "TEXT", null, true));
                map.put("SEC_UID", new C795990VKj(0, 1, "SEC_UID", "TEXT", null, false));
                map.put("NICK_NAME", new C795990VKj(0, 1, "NICK_NAME", "TEXT", null, false));
                map.put("SIGNATURE", new C795990VKj(0, 1, "SIGNATURE", "TEXT", null, false));
                map.put("AVATAR_THUMB", new C795990VKj(0, 1, "AVATAR_THUMB", "TEXT", null, false));
                map.put("FOLLOW_STATUS", new C795990VKj(0, 1, "FOLLOW_STATUS", "INTEGER", null, true));
                map.put("UNIQUE_ID", new C795990VKj(0, 1, "UNIQUE_ID", "TEXT", null, false));
                map.put("WEIBO_VERIFY", new C795990VKj(0, 1, "WEIBO_VERIFY", "TEXT", null, false));
                map.put("CUSTOM_VERIFY", new C795990VKj(0, 1, "CUSTOM_VERIFY", "TEXT", null, false));
                map.put("ENTERPRISE_VERIFY_REASON", new C795990VKj(0, 1, "ENTERPRISE_VERIFY_REASON", "TEXT", null, false));
                map.put("VERIFICATION_TYPE", new C795990VKj(0, 1, "VERIFICATION_TYPE", "TEXT", null, false));
                map.put("REMARK_NAME", new C795990VKj(0, 1, "REMARK_NAME", "TEXT", null, false));
                map.put("SORT_WEIGHT", new C795990VKj(0, 1, "SORT_WEIGHT", "TEXT", null, false));
                map.put("INITIAL_LETTER", new C795990VKj(0, 1, "INITIAL_LETTER", "TEXT", null, false));
                map.put("SHORT_ID", new C795990VKj(0, 1, "SHORT_ID", "TEXT", null, false));
                map.put("REMARK_PINYIN", new C795990VKj(0, 1, "REMARK_PINYIN", "TEXT", null, false));
                map.put("REMARK_INITIAL", new C795990VKj(0, 1, "REMARK_INITIAL", "TEXT", null, false));
                map.put("NICK_NAME_PINYIN", new C795990VKj(0, 1, "NICK_NAME_PINYIN", "TEXT", null, false));
                map.put("NICK_NAME_INITIAL", new C795990VKj(0, 1, "NICK_NAME_INITIAL", "TEXT", null, false));
                map.put("COMMERCE_USER_LEVEL", new C795990VKj(0, 1, "COMMERCE_USER_LEVEL", "INTEGER", null, false));
                map.put("COLUMN_CONTACT_NAME", new C795990VKj(0, 1, "COLUMN_CONTACT_NAME", "TEXT", null, false));
                map.put("COLUMN_CONTACT_NAME_PINYIN", new C795990VKj(0, 1, "COLUMN_CONTACT_NAME_PINYIN", "TEXT", null, false));
                map.put("COLUMN_CONTACT_NAME_INITIAL", new C795990VKj(0, 1, "COLUMN_CONTACT_NAME_INITIAL", "TEXT", null, false));
                map.put("COLUMN_USER_SHARE_STATUS", new C795990VKj(0, 1, "COLUMN_USER_SHARE_STATUS", "INTEGER", null, false));
                map.put("USER_FRIEND_REC_TYPE", new C795990VKj(0, 1, "USER_FRIEND_REC_TYPE", "INTEGER", null, false));
                map.put("USER_FRIEND_REC_TIME", new C795990VKj(0, 1, "USER_FRIEND_REC_TIME", "INTEGER", null, false));
                map.put("USER_FOLLOW_TIME", new C795990VKj(0, 1, "USER_FOLLOW_TIME", "INTEGER", null, false));
                map.put("BLOCK_STATUS", new C795990VKj(0, 1, "BLOCK_STATUS", "INTEGER", null, false));
                map.put("MENTION_ENABLED", new C795990VKj(0, 1, "MENTION_ENABLED", "INTEGER", CardStruct.IStatusCode.DEFAULT, true));
                map.put("COMMENT_MENTION_BLOCK_STATUS", new C795990VKj(0, 1, "COMMENT_MENTION_BLOCK_STATUS", "INTEGER", CardStruct.IStatusCode.DEFAULT, true));
                map.put("VIDEO_MENTION_BLOCK_STATUS", new C795990VKj(0, 1, "VIDEO_MENTION_BLOCK_STATUS", "INTEGER", CardStruct.IStatusCode.DEFAULT, true));
                map.put("VIDEO_TAG_BLOCK_STATUS", new C795990VKj(0, 1, "VIDEO_TAG_BLOCK_STATUS", "INTEGER", CardStruct.IStatusCode.DEFAULT, true));
                map.put("QA_INVITE_BLOCK_STATUS", new C795990VKj(0, 1, "QA_INVITE_BLOCK_STATUS", "INTEGER", CardStruct.IStatusCode.DEFAULT, true));
                map.put("FOLLOWER_STATUS", new C795990VKj(0, 1, "FOLLOWER_STATUS", "INTEGER", CardStruct.IStatusCode.DEFAULT, true));
                map.put("ACCOUNT_TYPE", new C795990VKj(0, 1, "ACCOUNT_TYPE", "INTEGER", null, false));
                map.put("FOLLOWER_COUNT", new C795990VKj(0, 1, "FOLLOWER_COUNT", "INTEGER", CardStruct.IStatusCode.DEFAULT, true));
                map.put("FOLLOWING_COUNT", new C795990VKj(0, 1, "FOLLOWING_COUNT", "INTEGER", CardStruct.IStatusCode.DEFAULT, true));
                map.put("INTERNAL_SHARE_HOLD_OUT_VERSION", new C795990VKj(0, 1, "INTERNAL_SHARE_HOLD_OUT_VERSION", "INTEGER", CardStruct.IStatusCode.DEFAULT, true));
                map.put("AVATAR_MEDIUM", new C795990VKj(0, 1, "AVATAR_MEDIUM", "TEXT", null, false));
                map.put("WELCOME_MESSAGE_ENABLED", new C795990VKj(0, 1, "WELCOME_MESSAGE_ENABLED", "INTEGER", CardStruct.IStatusCode.DEFAULT, true));
                C0VN6 c0vn6 = new C0VN6("SIMPLE_USER", map, new HashSet(0), new HashSet(0));
                C0VN6 c0vn6LIZ = C0VN6.LIZ(c0vlf, "SIMPLE_USER");
                if (!c0vn6.equals(c0vn6LIZ)) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("SIMPLE_USER(com.ss.android.ugc.aweme.im.contacts.api.database.entity.IMUserEntity).\n Expected:\n");
                    sbLIZ.append(c0vn6);
                    sbLIZ.append("\n Found:\n");
                    sbLIZ.append(c0vn6LIZ);
                    return new C0VN4(false, C2188811AlT.LIZIZ(sbLIZ));
                }
                HashMap map2 = new HashMap(5);
                map2.put("CURR_UID", new C795990VKj(2, 1, "CURR_UID", "TEXT", null, true));
                map2.put("ID", new C795990VKj(1, 1, "ID", "TEXT", null, true));
                map2.put("SHARE_TIME", new C795990VKj(0, 1, "SHARE_TIME", "INTEGER", null, true));
                map2.put("SHARE_TYPE", new C795990VKj(0, 1, "SHARE_TYPE", "TEXT", null, true));
                map2.put("SEND_TIME", new C795990VKj(0, 1, "SEND_TIME", "INTEGER", null, true));
                C0VN6 c0vn62 = new C0VN6("RECENT_SHARE", map2, new HashSet(0), new HashSet(0));
                C0VN6 c0vn6LIZ2 = C0VN6.LIZ(c0vlf, "RECENT_SHARE");
                if (!c0vn62.equals(c0vn6LIZ2)) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("RECENT_SHARE(com.ss.android.ugc.aweme.im.contacts.api.database.entity.RecentShareEntity).\n Expected:\n");
                    sbLIZ2.append(c0vn62);
                    sbLIZ2.append("\n Found:\n");
                    sbLIZ2.append(c0vn6LIZ2);
                    return new C0VN4(false, C2188811AlT.LIZIZ(sbLIZ2));
                }
                return new C0VN4(true, null);
            }
        }, "3e7a90d66dd752a985cfcac676692993", "335cdcd755ab18bf2eb9d9f21e869b43");
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
