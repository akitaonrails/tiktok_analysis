package com.bytedance.android.livestrategy.ttm.db.database;

import X.AbstractC796510VMj;
import X.C0VKN;
import X.C0VLF;
import X.C0VMG;
import X.C0VMH;
import X.C0VMK;
import X.C0VMN;
import X.C0VMU;
import X.C0VMX;
import X.C0VN2;
import X.C0VN3;
import X.C796520VMk;
import X.C796620VMu;
import X.InterfaceC2275591E5d;
import X.InterfaceC796190VLd;
import android.database.Cursor;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.scene.Scene;
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
public final class LiveTtmDatabase_Impl extends LiveTtmDatabase {
    public volatile C0VMH LLILLL;
    public volatile C0VMG LLILZ;
    public volatile C0VMK LLILZIL;

    /* JADX WARN: Type inference failed for: r0v4, types: [X.0VMG] */
    @Override // com.bytedance.android.livestrategy.ttm.db.database.LiveTtmDatabase
    public final C0VMN LIZ() {
        C0VMG c0vmg;
        if (this.LLILZ != null) {
            return this.LLILZ;
        }
        synchronized (this) {
            try {
                if (this.LLILZ == null) {
                    this.LLILZ = new C0VMN(this) { // from class: X.0VMG
                        public final AbstractC796540VMm LIZ;
                        public final C854570Xfj LIZIZ;

                        @Override // X.C0VMN
                        public final List<C0VMJ> getAll() {
                            C0VN5 c0vn5LIZLLL = C0VN5.LIZLLL(0, "SELECT packageName, md5 FROM `package`");
                            this.LIZ.assertNotSuspendingTransaction();
                            Cursor cursorLIZIZ = C0VN0.LIZIZ(this.LIZ, c0vn5LIZLLL, false);
                            try {
                                ArrayList arrayList = new ArrayList(cursorLIZIZ.getCount());
                                while (cursorLIZIZ.moveToNext()) {
                                    String string = null;
                                    String string2 = cursorLIZIZ.isNull(0) ? null : cursorLIZIZ.getString(0);
                                    if (!cursorLIZIZ.isNull(1)) {
                                        string = cursorLIZIZ.getString(1);
                                    }
                                    arrayList.add(new C0VMJ(string2, string));
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

                        {
                            this.LIZ = this;
                            this.LIZIZ = new C854570Xfj(this, 19);
                            new C854550Xfh(this, 57);
                        }

                        @Override // X.C0VMN
                        public final void LIZ(List<C0VMI> list) {
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

                        @Override // X.C0VMN
                        public final void LIZIZ(List<String> list) {
                            this.LIZ.assertNotSuspendingTransaction();
                            StringBuilder sb = new StringBuilder();
                            sb.append("DELETE FROM `package` WHERE packageName IN (");
                            ArrayList<String> arrayList = (ArrayList) list;
                            C0VIY.LIZ(sb, arrayList.size());
                            sb.append(")");
                            InterfaceC796340VLs interfaceC796340VLsCompileStatement = this.LIZ.compileStatement(sb.toString());
                            int i = 1;
                            for (String str : arrayList) {
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

                        @Override // X.C0VMN
                        public final List<C0VMI> LIZJ(List<String> list) {
                            String string;
                            String string2;
                            Integer numValueOf;
                            StringBuilder sb = new StringBuilder();
                            sb.append("SELECT * FROM `package` WHERE packageName IN (");
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
                                int iLIZIZ = C795450VIh.LIZIZ(cursorLIZIZ, "packageName");
                                int iLIZIZ2 = C795450VIh.LIZIZ(cursorLIZIZ, "md5");
                                int iLIZIZ3 = C795450VIh.LIZIZ(cursorLIZIZ, "engineType");
                                int iLIZIZ4 = C795450VIh.LIZIZ(cursorLIZIZ, "optionType");
                                int iLIZIZ5 = C795450VIh.LIZIZ(cursorLIZIZ, "content");
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
                                    int i2 = cursorLIZIZ.getInt(iLIZIZ3);
                                    if (cursorLIZIZ.isNull(iLIZIZ4)) {
                                        numValueOf = null;
                                    } else {
                                        numValueOf = Integer.valueOf(cursorLIZIZ.getInt(iLIZIZ4));
                                    }
                                    if (!cursorLIZIZ.isNull(iLIZIZ5)) {
                                        string3 = cursorLIZIZ.getString(iLIZIZ5);
                                    }
                                    arrayList.add(new C0VMI(i2, string, string2, string3, numValueOf));
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
                c0vmg = this.LLILZ;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return c0vmg;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.0VMK] */
    @Override // com.bytedance.android.livestrategy.ttm.db.database.LiveTtmDatabase
    public final C0VMX LIZIZ() {
        C0VMK c0vmk;
        if (this.LLILZIL != null) {
            return this.LLILZIL;
        }
        synchronized (this) {
            try {
                if (this.LLILZIL == null) {
                    this.LLILZIL = new C0VMX(this) { // from class: X.0VMK
                        public final AbstractC796540VMm LIZ;
                        public final C854570Xfj LIZIZ;

                        @Override // X.C0VMX
                        public final List<C0VML> LIZLLL() {
                            C0VN5 c0vn5LIZLLL = C0VN5.LIZLLL(0, "SELECT * FROM scene");
                            this.LIZ.assertNotSuspendingTransaction();
                            Cursor cursorLIZIZ = C0VN0.LIZIZ(this.LIZ, c0vn5LIZLLL, false);
                            try {
                                int iLIZIZ = C795450VIh.LIZIZ(cursorLIZIZ, "uid");
                                int iLIZIZ2 = C795450VIh.LIZIZ(cursorLIZIZ, "sceneKey");
                                int iLIZIZ3 = C795450VIh.LIZIZ(cursorLIZIZ, "sceneType");
                                int iLIZIZ4 = C795450VIh.LIZIZ(cursorLIZIZ, "strategyKey");
                                int iLIZIZ5 = C795450VIh.LIZIZ(cursorLIZIZ, "uniqueKey");
                                ArrayList arrayList = new ArrayList(cursorLIZIZ.getCount());
                                while (cursorLIZIZ.moveToNext()) {
                                    long j = cursorLIZIZ.getLong(iLIZIZ);
                                    String string = null;
                                    String string2 = cursorLIZIZ.isNull(iLIZIZ2) ? null : cursorLIZIZ.getString(iLIZIZ2);
                                    int i = cursorLIZIZ.getInt(iLIZIZ3);
                                    String string3 = cursorLIZIZ.isNull(iLIZIZ4) ? null : cursorLIZIZ.getString(iLIZIZ4);
                                    if (!cursorLIZIZ.isNull(iLIZIZ5)) {
                                        string = cursorLIZIZ.getString(iLIZIZ5);
                                    }
                                    arrayList.add(new C0VML(j, string2, i, string3, string));
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

                        {
                            this.LIZ = this;
                            this.LIZIZ = new C854570Xfj(this, 20);
                            new C854550Xfh(this, 58);
                            new C854550Xfh(this, 59);
                        }

                        @Override // X.C0VMX
                        public final void LIZ(List<C0VML> list) {
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

                        @Override // X.C0VMX
                        public final List LIZJ(int i) {
                            String string;
                            String string2;
                            C0VN5 c0vn5LIZLLL = C0VN5.LIZLLL(2, "SELECT * FROM scene WHERE uid = ? AND sceneType = ?");
                            c0vn5LIZLLL.LJIJ(1, 0L);
                            c0vn5LIZLLL.LJIJ(2, i);
                            this.LIZ.assertNotSuspendingTransaction();
                            Cursor cursorLIZIZ = C0VN0.LIZIZ(this.LIZ, c0vn5LIZLLL, false);
                            try {
                                int iLIZIZ = C795450VIh.LIZIZ(cursorLIZIZ, "uid");
                                int iLIZIZ2 = C795450VIh.LIZIZ(cursorLIZIZ, "sceneKey");
                                int iLIZIZ3 = C795450VIh.LIZIZ(cursorLIZIZ, "sceneType");
                                int iLIZIZ4 = C795450VIh.LIZIZ(cursorLIZIZ, "strategyKey");
                                int iLIZIZ5 = C795450VIh.LIZIZ(cursorLIZIZ, "uniqueKey");
                                ArrayList arrayList = new ArrayList(cursorLIZIZ.getCount());
                                while (cursorLIZIZ.moveToNext()) {
                                    long j = cursorLIZIZ.getLong(iLIZIZ);
                                    String string3 = null;
                                    if (cursorLIZIZ.isNull(iLIZIZ2)) {
                                        string = null;
                                    } else {
                                        string = cursorLIZIZ.getString(iLIZIZ2);
                                    }
                                    int i2 = cursorLIZIZ.getInt(iLIZIZ3);
                                    if (cursorLIZIZ.isNull(iLIZIZ4)) {
                                        string2 = null;
                                    } else {
                                        string2 = cursorLIZIZ.getString(iLIZIZ4);
                                    }
                                    if (!cursorLIZIZ.isNull(iLIZIZ5)) {
                                        string3 = cursorLIZIZ.getString(iLIZIZ5);
                                    }
                                    arrayList.add(new C0VML(j, string, i2, string2, string3));
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

                        @Override // X.C0VMX
                        public final List LJ(String str) {
                            String string;
                            String string2;
                            C0VN5 c0vn5LIZLLL = C0VN5.LIZLLL(2, "SELECT * FROM scene WHERE uid = ? AND sceneKey = ?");
                            c0vn5LIZLLL.LJIJ(1, 0L);
                            if (str == null) {
                                c0vn5LIZLLL.LLD(2);
                            } else {
                                c0vn5LIZLLL.LJIILIIL(2, str);
                            }
                            this.LIZ.assertNotSuspendingTransaction();
                            Cursor cursorLIZIZ = C0VN0.LIZIZ(this.LIZ, c0vn5LIZLLL, false);
                            try {
                                int iLIZIZ = C795450VIh.LIZIZ(cursorLIZIZ, "uid");
                                int iLIZIZ2 = C795450VIh.LIZIZ(cursorLIZIZ, "sceneKey");
                                int iLIZIZ3 = C795450VIh.LIZIZ(cursorLIZIZ, "sceneType");
                                int iLIZIZ4 = C795450VIh.LIZIZ(cursorLIZIZ, "strategyKey");
                                int iLIZIZ5 = C795450VIh.LIZIZ(cursorLIZIZ, "uniqueKey");
                                ArrayList arrayList = new ArrayList(cursorLIZIZ.getCount());
                                while (cursorLIZIZ.moveToNext()) {
                                    long j = cursorLIZIZ.getLong(iLIZIZ);
                                    String string3 = null;
                                    if (cursorLIZIZ.isNull(iLIZIZ2)) {
                                        string = null;
                                    } else {
                                        string = cursorLIZIZ.getString(iLIZIZ2);
                                    }
                                    int i = cursorLIZIZ.getInt(iLIZIZ3);
                                    if (cursorLIZIZ.isNull(iLIZIZ4)) {
                                        string2 = null;
                                    } else {
                                        string2 = cursorLIZIZ.getString(iLIZIZ4);
                                    }
                                    if (!cursorLIZIZ.isNull(iLIZIZ5)) {
                                        string3 = cursorLIZIZ.getString(iLIZIZ5);
                                    }
                                    arrayList.add(new C0VML(j, string, i, string2, string3));
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

                        @Override // X.C0VMX
                        public final void LIZIZ(long j, String str, List<String> list) {
                            this.LIZ.assertNotSuspendingTransaction();
                            StringBuilder sb = new StringBuilder();
                            sb.append("DELETE FROM scene WHERE uid = ? AND sceneKey = ? AND strategyKey IN (");
                            C0VIY.LIZ(sb, list.size());
                            sb.append(")");
                            InterfaceC796340VLs interfaceC796340VLsCompileStatement = this.LIZ.compileStatement(sb.toString());
                            interfaceC796340VLsCompileStatement.LJIJ(1, j);
                            if (str == null) {
                                interfaceC796340VLsCompileStatement.LLD(2);
                            } else {
                                interfaceC796340VLsCompileStatement.LJIILIIL(2, str);
                            }
                            int i = 3;
                            for (String str2 : list) {
                                if (str2 == null) {
                                    interfaceC796340VLsCompileStatement.LLD(i);
                                } else {
                                    interfaceC796340VLsCompileStatement.LJIILIIL(i, str2);
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
                    };
                }
                c0vmk = this.LLILZIL;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return c0vmk;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.0VMH] */
    @Override // com.bytedance.android.livestrategy.ttm.db.database.LiveTtmDatabase
    public final C0VMU LIZJ() {
        C0VMH c0vmh;
        if (this.LLILLL != null) {
            return this.LLILLL;
        }
        synchronized (this) {
            try {
                if (this.LLILLL == null) {
                    this.LLILLL = new C0VMU(this) { // from class: X.0VMH
                        public final AbstractC796540VMm LIZ;
                        public final C854570Xfj LIZIZ;

                        {
                            this.LIZ = this;
                            this.LIZIZ = new C854570Xfj(this, 21);
                            new C854550Xfh(this, 60);
                        }

                        @Override // X.C0VMU
                        public final List<Long> LIZ(List<C0VMR> list) {
                            this.LIZ.assertNotSuspendingTransaction();
                            this.LIZ.beginTransaction();
                            try {
                                List<Long> listInsertAndReturnIdsList = this.LIZIZ.insertAndReturnIdsList(list);
                                this.LIZ.setTransactionSuccessful();
                                this.LIZ.endTransaction();
                                return listInsertAndReturnIdsList;
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                this.LIZ.endTransaction();
                                throw th;
                            }
                        }

                        @Override // X.C0VMU
                        public final void LIZIZ(List<String> list) {
                            this.LIZ.assertNotSuspendingTransaction();
                            StringBuilder sb = new StringBuilder();
                            sb.append("DELETE FROM strategy WHERE strategyKey IN (");
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

                        @Override // X.C0VMU
                        public final List<C0VMR> LIZJ(List<String> list) {
                            String string;
                            String string2;
                            String string3;
                            StringBuilder sb = new StringBuilder();
                            sb.append("SELECT * FROM strategy WHERE strategyKey in (");
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
                                int iLIZIZ = C795450VIh.LIZIZ(cursorLIZIZ, FollowStatusChangeMethod.PARAM_UID);
                                int iLIZIZ2 = C795450VIh.LIZIZ(cursorLIZIZ, "strategyKey");
                                int iLIZIZ3 = C795450VIh.LIZIZ(cursorLIZIZ, "engineType");
                                int iLIZIZ4 = C795450VIh.LIZIZ(cursorLIZIZ, "optType");
                                int iLIZIZ5 = C795450VIh.LIZIZ(cursorLIZIZ, "md5");
                                int iLIZIZ6 = C795450VIh.LIZIZ(cursorLIZIZ, "packageName");
                                int iLIZIZ7 = C795450VIh.LIZIZ(cursorLIZIZ, "extraJson");
                                ArrayList arrayList = new ArrayList(cursorLIZIZ.getCount());
                                while (cursorLIZIZ.moveToNext()) {
                                    long j = cursorLIZIZ.getLong(iLIZIZ);
                                    String string4 = null;
                                    if (cursorLIZIZ.isNull(iLIZIZ2)) {
                                        string = null;
                                    } else {
                                        string = cursorLIZIZ.getString(iLIZIZ2);
                                    }
                                    int i2 = cursorLIZIZ.getInt(iLIZIZ3);
                                    int i3 = cursorLIZIZ.getInt(iLIZIZ4);
                                    if (cursorLIZIZ.isNull(iLIZIZ5)) {
                                        string2 = null;
                                    } else {
                                        string2 = cursorLIZIZ.getString(iLIZIZ5);
                                    }
                                    if (cursorLIZIZ.isNull(iLIZIZ6)) {
                                        string3 = null;
                                    } else {
                                        string3 = cursorLIZIZ.getString(iLIZIZ6);
                                    }
                                    if (!cursorLIZIZ.isNull(iLIZIZ7)) {
                                        string4 = cursorLIZIZ.getString(iLIZIZ7);
                                    }
                                    arrayList.add(new C0VMR(string, i2, j, string2, string3, i3, string4));
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

                        @Override // X.C0VMU
                        public final C0VMR LIZLLL(String str) {
                            String string;
                            String string2;
                            String string3;
                            C0VN5 c0vn5LIZLLL = C0VN5.LIZLLL(1, "SELECT * FROM strategy WHERE strategyKey = ?");
                            if (str == null) {
                                c0vn5LIZLLL.LLD(1);
                            } else {
                                c0vn5LIZLLL.LJIILIIL(1, str);
                            }
                            this.LIZ.assertNotSuspendingTransaction();
                            Cursor cursorLIZIZ = C0VN0.LIZIZ(this.LIZ, c0vn5LIZLLL, false);
                            try {
                                int iLIZIZ = C795450VIh.LIZIZ(cursorLIZIZ, FollowStatusChangeMethod.PARAM_UID);
                                int iLIZIZ2 = C795450VIh.LIZIZ(cursorLIZIZ, "strategyKey");
                                int iLIZIZ3 = C795450VIh.LIZIZ(cursorLIZIZ, "engineType");
                                int iLIZIZ4 = C795450VIh.LIZIZ(cursorLIZIZ, "optType");
                                int iLIZIZ5 = C795450VIh.LIZIZ(cursorLIZIZ, "md5");
                                int iLIZIZ6 = C795450VIh.LIZIZ(cursorLIZIZ, "packageName");
                                int iLIZIZ7 = C795450VIh.LIZIZ(cursorLIZIZ, "extraJson");
                                C0VMR c0vmr = null;
                                String string4 = null;
                                if (cursorLIZIZ.moveToFirst()) {
                                    long j = cursorLIZIZ.getLong(iLIZIZ);
                                    if (cursorLIZIZ.isNull(iLIZIZ2)) {
                                        string = null;
                                    } else {
                                        string = cursorLIZIZ.getString(iLIZIZ2);
                                    }
                                    int i = cursorLIZIZ.getInt(iLIZIZ3);
                                    int i2 = cursorLIZIZ.getInt(iLIZIZ4);
                                    if (cursorLIZIZ.isNull(iLIZIZ5)) {
                                        string2 = null;
                                    } else {
                                        string2 = cursorLIZIZ.getString(iLIZIZ5);
                                    }
                                    if (cursorLIZIZ.isNull(iLIZIZ6)) {
                                        string3 = null;
                                    } else {
                                        string3 = cursorLIZIZ.getString(iLIZIZ6);
                                    }
                                    if (!cursorLIZIZ.isNull(iLIZIZ7)) {
                                        string4 = cursorLIZIZ.getString(iLIZIZ7);
                                    }
                                    c0vmr = new C0VMR(string, i, j, string2, string3, i2, string4);
                                }
                                cursorLIZIZ.close();
                                c0vn5LIZLLL.release();
                                return c0vmr;
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                cursorLIZIZ.close();
                                c0vn5LIZLLL.release();
                                throw th;
                            }
                        }
                    };
                }
                c0vmh = this.LLILLL;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return c0vmh;
    }

    @Override // X.AbstractC796540VMm
    public final void clearAllTables() {
        super.assertNotMainThread();
        C0VLF c0vlfLJLJJI = this.mOpenHelper.LJLJJI();
        try {
            super.beginTransaction();
            c0vlfLJLJJI.LJIILJJIL("DELETE FROM `strategy`");
            c0vlfLJLJJI.LJIILJJIL("DELETE FROM `package`");
            c0vlfLJLJJI.LJIILJJIL("DELETE FROM `scene`");
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
        return new C796620VMu(this, new HashMap(0), new HashMap(0), "strategy", "package", Scene.SCENE_SERVICE);
    }

    @Override // X.AbstractC796540VMm
    public final Set<Class<? extends InterfaceC2275591E5d>> getRequiredAutoMigrationSpecs() {
        return new HashSet();
    }

    @Override // X.AbstractC796540VMm
    public final Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
        HashMap map = new HashMap();
        map.put(C0VMU.class, Collections.emptyList());
        map.put(C0VMN.class, Collections.emptyList());
        map.put(C0VMX.class, Collections.emptyList());
        return map;
    }

    @Override // X.AbstractC796540VMm
    public final InterfaceC796190VLd createOpenHelper(C796520VMk c796520VMk) {
        C0VN2 c0vn2 = new C0VN2(c796520VMk, new C0VN3() { // from class: X.0VMF
            @Override // X.C0VN3
            public final void onPostMigrate(C0VLF c0vlf) {
            }

            {
                super(5);
            }

            @Override // X.C0VN3
            public final void createAllTables(C0VLF c0vlf) {
                c0vlf.LJIILJJIL("CREATE TABLE IF NOT EXISTS `strategy` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `strategyKey` TEXT NOT NULL, `engineType` INTEGER NOT NULL, `optType` INTEGER NOT NULL, `md5` TEXT NOT NULL, `packageName` TEXT NOT NULL, `extraJson` TEXT NOT NULL)");
                c0vlf.LJIILJJIL("CREATE UNIQUE INDEX IF NOT EXISTS `index_strategy_strategyKey` ON `strategy` (`strategyKey`)");
                c0vlf.LJIILJJIL("CREATE TABLE IF NOT EXISTS `package` (`packageName` TEXT NOT NULL, `md5` TEXT NOT NULL, `engineType` INTEGER NOT NULL, `optionType` INTEGER, `content` TEXT NOT NULL, PRIMARY KEY(`packageName`))");
                c0vlf.LJIILJJIL("CREATE TABLE IF NOT EXISTS `scene` (`uid` INTEGER NOT NULL, `sceneKey` TEXT NOT NULL, `sceneType` INTEGER NOT NULL, `strategyKey` TEXT NOT NULL, `uniqueKey` TEXT NOT NULL, PRIMARY KEY(`uid`, `sceneKey`, `sceneType`, `strategyKey`, `uniqueKey`))");
                c0vlf.LJIILJJIL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                c0vlf.LJIILJJIL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'ddec704df19b3062e6407c1e6ac05df2')");
            }

            @Override // X.C0VN3
            public final void dropAllTables(C0VLF c0vlf) {
                c0vlf.LJIILJJIL("DROP TABLE IF EXISTS `strategy`");
                c0vlf.LJIILJJIL("DROP TABLE IF EXISTS `package`");
                c0vlf.LJIILJJIL("DROP TABLE IF EXISTS `scene`");
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
                HashMap map = new HashMap(7);
                map.put(FollowStatusChangeMethod.PARAM_UID, new C795990VKj(1, 1, FollowStatusChangeMethod.PARAM_UID, "INTEGER", null, true));
                map.put("strategyKey", new C795990VKj(0, 1, "strategyKey", "TEXT", null, true));
                map.put("engineType", new C795990VKj(0, 1, "engineType", "INTEGER", null, true));
                map.put("optType", new C795990VKj(0, 1, "optType", "INTEGER", null, true));
                map.put("md5", new C795990VKj(0, 1, "md5", "TEXT", null, true));
                map.put("packageName", new C795990VKj(0, 1, "packageName", "TEXT", null, true));
                map.put("extraJson", new C795990VKj(0, 1, "extraJson", "TEXT", null, true));
                HashSet hashSet = new HashSet(0);
                HashSet hashSet2 = new HashSet(1);
                hashSet2.add(new C796450VMd(Arrays.asList("strategyKey"), "index_strategy_strategyKey", Arrays.asList("ASC"), true));
                C0VN6 c0vn6 = new C0VN6("strategy", map, hashSet, hashSet2);
                C0VN6 c0vn6LIZ = C0VN6.LIZ(c0vlf, "strategy");
                if (!c0vn6.equals(c0vn6LIZ)) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("strategy(com.bytedance.android.livestrategy.ttm.db.entities.StrategyEntity).\n Expected:\n");
                    sbLIZ.append(c0vn6);
                    sbLIZ.append("\n Found:\n");
                    sbLIZ.append(c0vn6LIZ);
                    return new C0VN4(false, C2188811AlT.LIZIZ(sbLIZ));
                }
                HashMap map2 = new HashMap(5);
                map2.put("packageName", new C795990VKj(1, 1, "packageName", "TEXT", null, true));
                map2.put("md5", new C795990VKj(0, 1, "md5", "TEXT", null, true));
                map2.put("engineType", new C795990VKj(0, 1, "engineType", "INTEGER", null, true));
                map2.put("optionType", new C795990VKj(0, 1, "optionType", "INTEGER", null, false));
                map2.put("content", new C795990VKj(0, 1, "content", "TEXT", null, true));
                C0VN6 c0vn62 = new C0VN6("package", map2, new HashSet(0), new HashSet(0));
                C0VN6 c0vn6LIZ2 = C0VN6.LIZ(c0vlf, "package");
                if (!c0vn62.equals(c0vn6LIZ2)) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("package(com.bytedance.android.livestrategy.ttm.db.entities.PackageEntity).\n Expected:\n");
                    sbLIZ2.append(c0vn62);
                    sbLIZ2.append("\n Found:\n");
                    sbLIZ2.append(c0vn6LIZ2);
                    return new C0VN4(false, C2188811AlT.LIZIZ(sbLIZ2));
                }
                HashMap map3 = new HashMap(5);
                map3.put("uid", new C795990VKj(1, 1, "uid", "INTEGER", null, true));
                map3.put("sceneKey", new C795990VKj(2, 1, "sceneKey", "TEXT", null, true));
                map3.put("sceneType", new C795990VKj(3, 1, "sceneType", "INTEGER", null, true));
                map3.put("strategyKey", new C795990VKj(4, 1, "strategyKey", "TEXT", null, true));
                map3.put("uniqueKey", new C795990VKj(5, 1, "uniqueKey", "TEXT", null, true));
                C0VN6 c0vn63 = new C0VN6(Scene.SCENE_SERVICE, map3, new HashSet(0), new HashSet(0));
                C0VN6 c0vn6LIZ3 = C0VN6.LIZ(c0vlf, Scene.SCENE_SERVICE);
                if (!c0vn63.equals(c0vn6LIZ3)) {
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("scene(com.bytedance.android.livestrategy.ttm.db.entities.SceneEntity).\n Expected:\n");
                    sbLIZ3.append(c0vn63);
                    sbLIZ3.append("\n Found:\n");
                    sbLIZ3.append(c0vn6LIZ3);
                    return new C0VN4(false, C2188811AlT.LIZIZ(sbLIZ3));
                }
                return new C0VN4(true, null);
            }
        }, "ddec704df19b3062e6407c1e6ac05df2", "ea7fd10a3a90d8edfd8fd494a07dddb8");
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
