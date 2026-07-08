package com.ss.android.ugc.aweme.relation.storage.db;

import X.AbstractC796510VMj;
import X.C0VKN;
import X.C0VLF;
import X.C0VN2;
import X.C0VN3;
import X.C796520VMk;
import X.C796620VMu;
import X.C816550W1l;
import X.C816570W1n;
import X.C830490Whz;
import X.InterfaceC2275591E5d;
import X.InterfaceC796190VLd;
import X.InterfaceC816560W1m;
import X.InterfaceC816590W1p;
import android.database.Cursor;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
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
public final class RelationDatabase_Impl extends RelationDatabase {
    public volatile C816570W1n LLILLJJLI;
    public volatile C816550W1l LLILLL;

    /* JADX WARN: Type inference failed for: r0v4, types: [X.0W1l] */
    @Override // com.ss.android.ugc.aweme.relation.storage.db.RelationDatabase
    public final InterfaceC816560W1m LIZ() {
        C816550W1l c816550W1l;
        if (this.LLILLL != null) {
            return this.LLILLL;
        }
        synchronized (this) {
            try {
                if (this.LLILLL == null) {
                    this.LLILLL = new InterfaceC816560W1m(this) { // from class: X.0W1l
                        public final AbstractC796540VMm LIZ;
                        public final C854550Xfh LIZIZ;

                        {
                            this.LIZ = this;
                            new C854550Xfh(this, 0);
                            this.LIZIZ = new C854550Xfh(this, 1);
                            new C854550Xfh(this, 2);
                        }

                        public final void LIZ(C830490Whz<String, C816640W1u> c830490Whz) {
                            String string;
                            String string2;
                            Boolean boolValueOf;
                            String string3;
                            String string4;
                            Integer numValueOf;
                            boolean z;
                            C830490Whz.c cVar = (C830490Whz.c) c830490Whz.keySet();
                            if (cVar.isEmpty()) {
                                return;
                            }
                            if (c830490Whz.LLILLL > 999) {
                                C830490Whz<String, C816640W1u> c830490Whz2 = new C830490Whz<>(999);
                                int i = c830490Whz.LLILLL;
                                int i2 = 0;
                                int i3 = 0;
                                while (i2 < i) {
                                    c830490Whz2.put(c830490Whz.LJFF(i2), null);
                                    i2++;
                                    i3++;
                                    if (i3 == 999) {
                                        LIZ(c830490Whz2);
                                        c830490Whz.putAll(c830490Whz2);
                                        c830490Whz2 = new C830490Whz<>(999);
                                        i3 = 0;
                                    }
                                }
                                if (i3 > 0) {
                                    LIZ(c830490Whz2);
                                    c830490Whz.putAll(c830490Whz2);
                                    return;
                                }
                                return;
                            }
                            StringBuilder sb = new StringBuilder();
                            sb.append("SELECT `uid`,`version`,`nickname`,`is_private_account`,`avatar_168`,`avatar_300` FROM `user_info` WHERE `uid` IN (");
                            int i4 = C830490Whz.this.LLILLL;
                            C0VIY.LIZ(sb, i4);
                            sb.append(")");
                            C0VN5 c0vn5LIZLLL = C0VN5.LIZLLL(i4, sb.toString());
                            Iterator it2 = cVar.iterator();
                            int i5 = 1;
                            while (true) {
                                AbstractC1322040kVW abstractC1322040kVW = (AbstractC1322040kVW) it2;
                                if (!abstractC1322040kVW.hasNext()) {
                                    break;
                                }
                                String str = (String) abstractC1322040kVW.next();
                                if (str == null) {
                                    c0vn5LIZLLL.LLD(i5);
                                } else {
                                    c0vn5LIZLLL.LJIILIIL(i5, str);
                                }
                                i5++;
                            }
                            Cursor cursorLIZIZ = C0VN0.LIZIZ(this.LIZ, c0vn5LIZLLL, false);
                            try {
                                int iLIZ = C795450VIh.LIZ(cursorLIZIZ, "uid");
                                if (iLIZ == -1) {
                                    cursorLIZIZ.close();
                                    return;
                                }
                                while (cursorLIZIZ.moveToNext()) {
                                    String string5 = cursorLIZIZ.getString(iLIZ);
                                    if (c830490Whz.containsKey(string5)) {
                                        if (cursorLIZIZ.isNull(0)) {
                                            string = null;
                                        } else {
                                            string = cursorLIZIZ.getString(0);
                                        }
                                        long j = cursorLIZIZ.getLong(1);
                                        if (cursorLIZIZ.isNull(2)) {
                                            string2 = null;
                                        } else {
                                            string2 = cursorLIZIZ.getString(2);
                                        }
                                        if (!cursorLIZIZ.isNull(3) && (numValueOf = Integer.valueOf(cursorLIZIZ.getInt(3))) != null) {
                                            if (numValueOf.intValue() != 0) {
                                                z = true;
                                            } else {
                                                z = false;
                                            }
                                            boolValueOf = Boolean.valueOf(z);
                                        } else {
                                            boolValueOf = null;
                                        }
                                        if (cursorLIZIZ.isNull(4)) {
                                            string3 = null;
                                        } else {
                                            string3 = cursorLIZIZ.getString(4);
                                        }
                                        if (cursorLIZIZ.isNull(5)) {
                                            string4 = null;
                                        } else {
                                            string4 = cursorLIZIZ.getString(5);
                                        }
                                        c830490Whz.put(string5, new C816640W1u(j, boolValueOf, string, string2, string3, string4));
                                    }
                                }
                                cursorLIZIZ.close();
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                cursorLIZIZ.close();
                                throw th;
                            }
                        }

                        @Override // X.InterfaceC816560W1m
                        public final void LIZIZ(String str) {
                            this.LIZ.assertNotSuspendingTransaction();
                            InterfaceC796340VLs interfaceC796340VLsAcquire = this.LIZIZ.acquire();
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
                                this.LIZIZ.release(interfaceC796340VLsAcquire);
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                this.LIZ.endTransaction();
                                this.LIZIZ.release(interfaceC796340VLsAcquire);
                                throw th;
                            }
                        }

                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // X.InterfaceC816560W1m
                        public final List<C0W2B> LIZJ(String[] strArr) {
                            String string;
                            String string2;
                            String string3;
                            String string4;
                            String string5;
                            String string6;
                            String string7;
                            Object c816680W1y;
                            StringBuilder sb = new StringBuilder();
                            sb.append("SELECT * FROM maf_info WHERE uid IN (");
                            int length = strArr.length;
                            C0VIY.LIZ(sb, length);
                            sb.append(")");
                            C0VN5 c0vn5LIZLLL = C0VN5.LIZLLL(length, sb.toString());
                            int i = 1;
                            for (String str : strArr) {
                                if (str == null) {
                                    c0vn5LIZLLL.LLD(i);
                                } else {
                                    c0vn5LIZLLL.LJIILIIL(i, str);
                                }
                                i++;
                            }
                            this.LIZ.assertNotSuspendingTransaction();
                            this.LIZ.beginTransaction();
                            try {
                                Cursor cursorLIZIZ = C0VN0.LIZIZ(this.LIZ, c0vn5LIZLLL, true);
                                try {
                                    int iLIZIZ = C795450VIh.LIZIZ(cursorLIZIZ, "uid");
                                    int iLIZIZ2 = C795450VIh.LIZIZ(cursorLIZIZ, "rec_type");
                                    int iLIZIZ3 = C795450VIh.LIZIZ(cursorLIZIZ, "rec_reason");
                                    int iLIZIZ4 = C795450VIh.LIZIZ(cursorLIZIZ, "relation_type");
                                    int iLIZIZ5 = C795450VIh.LIZIZ(cursorLIZIZ, "social_info");
                                    int iLIZIZ6 = C795450VIh.LIZIZ(cursorLIZIZ, "mutual_struct");
                                    int iLIZIZ7 = C795450VIh.LIZIZ(cursorLIZIZ, "external_recommend_reason");
                                    int iLIZIZ8 = C795450VIh.LIZIZ(cursorLIZIZ, "version");
                                    C830490Whz<String, C816640W1u> c830490Whz = new C830490Whz<>();
                                    C830490Whz<String, C816650W1v> c830490Whz2 = new C830490Whz<>();
                                    while (true) {
                                        string = null;
                                        if (!cursorLIZIZ.moveToNext()) {
                                            break;
                                        }
                                        c830490Whz.put(cursorLIZIZ.getString(iLIZIZ), null);
                                        c830490Whz2.put(cursorLIZIZ.getString(iLIZIZ), null);
                                    }
                                    cursorLIZIZ.moveToPosition(-1);
                                    LIZ(c830490Whz);
                                    LIZLLL(c830490Whz2);
                                    ArrayList arrayList = new ArrayList(cursorLIZIZ.getCount());
                                    while (cursorLIZIZ.moveToNext()) {
                                        if (cursorLIZIZ.isNull(iLIZIZ) && cursorLIZIZ.isNull(iLIZIZ2) && cursorLIZIZ.isNull(iLIZIZ3) && cursorLIZIZ.isNull(iLIZIZ4) && cursorLIZIZ.isNull(iLIZIZ5) && cursorLIZIZ.isNull(iLIZIZ6) && cursorLIZIZ.isNull(iLIZIZ7) && cursorLIZIZ.isNull(iLIZIZ8)) {
                                            c816680W1y = string;
                                        } else {
                                            if (cursorLIZIZ.isNull(iLIZIZ)) {
                                                string2 = string;
                                            } else {
                                                string2 = cursorLIZIZ.getString(iLIZIZ);
                                            }
                                            if (cursorLIZIZ.isNull(iLIZIZ2)) {
                                                string3 = string;
                                            } else {
                                                string3 = cursorLIZIZ.getString(iLIZIZ2);
                                            }
                                            if (cursorLIZIZ.isNull(iLIZIZ3)) {
                                                string4 = string;
                                            } else {
                                                string4 = cursorLIZIZ.getString(iLIZIZ3);
                                            }
                                            if (cursorLIZIZ.isNull(iLIZIZ4)) {
                                                string5 = string;
                                            } else {
                                                string5 = cursorLIZIZ.getString(iLIZIZ4);
                                            }
                                            if (cursorLIZIZ.isNull(iLIZIZ5)) {
                                                string6 = string;
                                            } else {
                                                string6 = cursorLIZIZ.getString(iLIZIZ5);
                                            }
                                            if (cursorLIZIZ.isNull(iLIZIZ6)) {
                                                string7 = string;
                                            } else {
                                                string7 = cursorLIZIZ.getString(iLIZIZ6);
                                            }
                                            if (!cursorLIZIZ.isNull(iLIZIZ7)) {
                                                string = cursorLIZIZ.getString(iLIZIZ7);
                                            }
                                            c816680W1y = new C816680W1y(string2, string3, cursorLIZIZ.getLong(iLIZIZ8), string4, string5, string6, string7, string);
                                        }
                                        arrayList.add(new C0W2B(c816680W1y, c830490Whz.get(cursorLIZIZ.getString(iLIZIZ)), c830490Whz2.get(cursorLIZIZ.getString(iLIZIZ))));
                                        string = null;
                                    }
                                    this.LIZ.setTransactionSuccessful();
                                    cursorLIZIZ.close();
                                    c0vn5LIZLLL.release();
                                    this.LIZ.endTransaction();
                                    return arrayList;
                                } catch (Throwable th) {
                                    TryCatchGuardChecker.doCheck(th);
                                    cursorLIZIZ.close();
                                    c0vn5LIZLLL.release();
                                    throw th;
                                }
                            } catch (Throwable th2) {
                                TryCatchGuardChecker.doCheck(th2);
                                this.LIZ.endTransaction();
                                throw th2;
                            }
                        }

                        public final void LIZLLL(C830490Whz<String, C816650W1v> c830490Whz) {
                            String string;
                            Integer numValueOf;
                            Integer numValueOf2;
                            Boolean boolValueOf;
                            Integer numValueOf3;
                            boolean z;
                            C830490Whz.c cVar = (C830490Whz.c) c830490Whz.keySet();
                            if (cVar.isEmpty()) {
                                return;
                            }
                            if (c830490Whz.LLILLL > 999) {
                                C830490Whz<String, C816650W1v> c830490Whz2 = new C830490Whz<>(999);
                                int i = c830490Whz.LLILLL;
                                int i2 = 0;
                                int i3 = 0;
                                while (i2 < i) {
                                    c830490Whz2.put(c830490Whz.LJFF(i2), null);
                                    i2++;
                                    i3++;
                                    if (i3 == 999) {
                                        LIZLLL(c830490Whz2);
                                        c830490Whz.putAll(c830490Whz2);
                                        c830490Whz2 = new C830490Whz<>(999);
                                        i3 = 0;
                                    }
                                }
                                if (i3 > 0) {
                                    LIZLLL(c830490Whz2);
                                    c830490Whz.putAll(c830490Whz2);
                                    return;
                                }
                                return;
                            }
                            StringBuilder sb = new StringBuilder();
                            sb.append("SELECT `uid`,`follow_status`,`follower_status`,`is_block`,`version` FROM `user_status` WHERE `uid` IN (");
                            int i4 = C830490Whz.this.LLILLL;
                            C0VIY.LIZ(sb, i4);
                            sb.append(")");
                            C0VN5 c0vn5LIZLLL = C0VN5.LIZLLL(i4, sb.toString());
                            Iterator it2 = cVar.iterator();
                            int i5 = 1;
                            while (true) {
                                AbstractC1322040kVW abstractC1322040kVW = (AbstractC1322040kVW) it2;
                                if (!abstractC1322040kVW.hasNext()) {
                                    break;
                                }
                                String str = (String) abstractC1322040kVW.next();
                                if (str == null) {
                                    c0vn5LIZLLL.LLD(i5);
                                } else {
                                    c0vn5LIZLLL.LJIILIIL(i5, str);
                                }
                                i5++;
                            }
                            Cursor cursorLIZIZ = C0VN0.LIZIZ(this.LIZ, c0vn5LIZLLL, false);
                            try {
                                int iLIZ = C795450VIh.LIZ(cursorLIZIZ, "uid");
                                if (iLIZ == -1) {
                                    cursorLIZIZ.close();
                                    return;
                                }
                                while (cursorLIZIZ.moveToNext()) {
                                    String string2 = cursorLIZIZ.getString(iLIZ);
                                    if (c830490Whz.containsKey(string2)) {
                                        if (cursorLIZIZ.isNull(0)) {
                                            string = null;
                                        } else {
                                            string = cursorLIZIZ.getString(0);
                                        }
                                        if (cursorLIZIZ.isNull(1)) {
                                            numValueOf = null;
                                        } else {
                                            numValueOf = Integer.valueOf(cursorLIZIZ.getInt(1));
                                        }
                                        if (cursorLIZIZ.isNull(2)) {
                                            numValueOf2 = null;
                                        } else {
                                            numValueOf2 = Integer.valueOf(cursorLIZIZ.getInt(2));
                                        }
                                        if (!cursorLIZIZ.isNull(3) && (numValueOf3 = Integer.valueOf(cursorLIZIZ.getInt(3))) != null) {
                                            if (numValueOf3.intValue() != 0) {
                                                z = true;
                                            } else {
                                                z = false;
                                            }
                                            boolValueOf = Boolean.valueOf(z);
                                        } else {
                                            boolValueOf = null;
                                        }
                                        c830490Whz.put(string2, new C816650W1v(string, numValueOf, numValueOf2, boolValueOf, cursorLIZIZ.getLong(4)));
                                    }
                                }
                                cursorLIZIZ.close();
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                cursorLIZIZ.close();
                                throw th;
                            }
                        }
                    };
                }
                c816550W1l = this.LLILLL;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return c816550W1l;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.0W1n] */
    @Override // com.ss.android.ugc.aweme.relation.storage.db.RelationDatabase
    public final InterfaceC816590W1p LIZIZ() {
        C816570W1n c816570W1n;
        if (this.LLILLJJLI != null) {
            return this.LLILLJJLI;
        }
        synchronized (this) {
            try {
                if (this.LLILLJJLI == null) {
                    this.LLILLJJLI = new InterfaceC816590W1p(this) { // from class: X.0W1n
                        public final AbstractC796540VMm LIZ;
                        public final C854570Xfj LIZIZ;
                        public final C854570Xfj LIZJ;
                        public final C854570Xfj LIZLLL;
                        public final C816600W1q LJ;
                        public final C816610W1r LJFF;
                        public final C816620W1s LJI;
                        public final C854550Xfh LJII;
                        public final C854550Xfh LJIIIIZZ;
                        public final C854550Xfh LJIIIZ;
                        public final C854550Xfh LJIIJ;
                        public final C854550Xfh LJIIJJI;

                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // X.InterfaceC816590W1p
                        public final List<C816630W1t> LIZJ() {
                            String string;
                            Boolean boolValueOf;
                            C816640W1u c816640W1u;
                            C0VN5 c0vn5LIZLLL = C0VN5.LIZLLL(0, "SELECT * FROM user_info");
                            this.LIZ.assertNotSuspendingTransaction();
                            this.LIZ.beginTransaction();
                            try {
                                Cursor cursorLIZIZ = C0VN0.LIZIZ(this.LIZ, c0vn5LIZLLL, true);
                                try {
                                    int iLIZIZ = C795450VIh.LIZIZ(cursorLIZIZ, "uid");
                                    int iLIZIZ2 = C795450VIh.LIZIZ(cursorLIZIZ, "version");
                                    int iLIZIZ3 = C795450VIh.LIZIZ(cursorLIZIZ, "nickname");
                                    int iLIZIZ4 = C795450VIh.LIZIZ(cursorLIZIZ, "is_private_account");
                                    int iLIZIZ5 = C795450VIh.LIZIZ(cursorLIZIZ, "avatar_168");
                                    int iLIZIZ6 = C795450VIh.LIZIZ(cursorLIZIZ, "avatar_300");
                                    C830490Whz<String, ArrayList<C816680W1y>> c830490Whz = new C830490Whz<>();
                                    C830490Whz<String, C816650W1v> c830490Whz2 = new C830490Whz<>();
                                    while (true) {
                                        string = null;
                                        if (!cursorLIZIZ.moveToNext()) {
                                            break;
                                        }
                                        String string2 = cursorLIZIZ.getString(iLIZIZ);
                                        if (c830490Whz.get(string2) == null) {
                                            c830490Whz.put(string2, new ArrayList<>());
                                        }
                                        c830490Whz2.put(cursorLIZIZ.getString(iLIZIZ), null);
                                    }
                                    cursorLIZIZ.moveToPosition(-1);
                                    LJIIIZ(c830490Whz);
                                    LJIIJ(c830490Whz2);
                                    ArrayList arrayList = new ArrayList(cursorLIZIZ.getCount());
                                    while (cursorLIZIZ.moveToNext()) {
                                        if (cursorLIZIZ.isNull(iLIZIZ) && cursorLIZIZ.isNull(iLIZIZ2) && cursorLIZIZ.isNull(iLIZIZ3) && cursorLIZIZ.isNull(iLIZIZ4) && cursorLIZIZ.isNull(iLIZIZ5) && cursorLIZIZ.isNull(iLIZIZ6)) {
                                            c816640W1u = string;
                                        } else {
                                            String string3 = cursorLIZIZ.isNull(iLIZIZ) ? string : cursorLIZIZ.getString(iLIZIZ);
                                            long j = cursorLIZIZ.getLong(iLIZIZ2);
                                            String string4 = cursorLIZIZ.isNull(iLIZIZ3) ? string : cursorLIZIZ.getString(iLIZIZ3);
                                            Integer numValueOf = cursorLIZIZ.isNull(iLIZIZ4) ? string : Integer.valueOf(cursorLIZIZ.getInt(iLIZIZ4));
                                            if (numValueOf == 0) {
                                                boolValueOf = string;
                                            } else {
                                                boolValueOf = Boolean.valueOf(numValueOf.intValue() != 0);
                                            }
                                            String string5 = cursorLIZIZ.isNull(iLIZIZ5) ? string : cursorLIZIZ.getString(iLIZIZ5);
                                            if (!cursorLIZIZ.isNull(iLIZIZ6)) {
                                                string = cursorLIZIZ.getString(iLIZIZ6);
                                            }
                                            c816640W1u = new C816640W1u(j, boolValueOf, string3, string4, string5, string);
                                        }
                                        ArrayList<C816680W1y> arrayList2 = c830490Whz.get(cursorLIZIZ.getString(iLIZIZ));
                                        if (arrayList2 == null) {
                                            arrayList2 = new ArrayList<>();
                                        }
                                        arrayList.add(new C816630W1t(c816640W1u, arrayList2, c830490Whz2.get(cursorLIZIZ.getString(iLIZIZ))));
                                        string = null;
                                    }
                                    this.LIZ.setTransactionSuccessful();
                                    cursorLIZIZ.close();
                                    c0vn5LIZLLL.release();
                                    this.LIZ.endTransaction();
                                    return arrayList;
                                } catch (Throwable th) {
                                    TryCatchGuardChecker.doCheck(th);
                                    cursorLIZIZ.close();
                                    c0vn5LIZLLL.release();
                                    throw th;
                                }
                            } catch (Throwable th2) {
                                TryCatchGuardChecker.doCheck(th2);
                                this.LIZ.endTransaction();
                                throw th2;
                            }
                        }

                        /* JADX WARN: Type inference failed for: r0v3, types: [X.0W1q] */
                        /* JADX WARN: Type inference failed for: r0v4, types: [X.0W1r] */
                        /* JADX WARN: Type inference failed for: r0v5, types: [X.0W1s] */
                        {
                            this.LIZ = this;
                            this.LIZIZ = new C854570Xfj(this, 0);
                            this.LIZJ = new C854570Xfj(this, 1);
                            this.LIZLLL = new C854570Xfj(this, 2);
                            this.LJ = new AbstractC796320VLq<C816680W1y>(this) { // from class: X.0W1q
                                @Override // X.AbstractC796320VLq, X.AbstractC795470VIj
                                public final String createQuery() {
                                    return "DELETE FROM `maf_info` WHERE `uid` = ? AND `rec_type` = ?";
                                }

                                @Override // X.AbstractC796320VLq
                                public final void bind(InterfaceC796340VLs interfaceC796340VLs, C816680W1y c816680W1y) {
                                    C816680W1y c816680W1y2 = c816680W1y;
                                    String str = c816680W1y2.LIZ;
                                    if (str == null) {
                                        interfaceC796340VLs.LLD(1);
                                    } else {
                                        interfaceC796340VLs.LJIILIIL(1, str);
                                    }
                                    String str2 = c816680W1y2.LIZIZ;
                                    if (str2 == null) {
                                        interfaceC796340VLs.LLD(2);
                                    } else {
                                        interfaceC796340VLs.LJIILIIL(2, str2);
                                    }
                                }
                            };
                            this.LJFF = new AbstractC796320VLq<C816640W1u>(this) { // from class: X.0W1r
                                @Override // X.AbstractC796320VLq, X.AbstractC795470VIj
                                public final String createQuery() {
                                    return "DELETE FROM `user_info` WHERE `uid` = ?";
                                }

                                @Override // X.AbstractC796320VLq
                                public final void bind(InterfaceC796340VLs interfaceC796340VLs, C816640W1u c816640W1u) {
                                    String str = c816640W1u.LIZ;
                                    if (str == null) {
                                        interfaceC796340VLs.LLD(1);
                                    } else {
                                        interfaceC796340VLs.LJIILIIL(1, str);
                                    }
                                }
                            };
                            this.LJI = new AbstractC796320VLq<C816650W1v>(this) { // from class: X.0W1s
                                @Override // X.AbstractC796320VLq, X.AbstractC795470VIj
                                public final String createQuery() {
                                    return "DELETE FROM `user_status` WHERE `uid` = ?";
                                }

                                @Override // X.AbstractC796320VLq
                                public final void bind(InterfaceC796340VLs interfaceC796340VLs, C816650W1v c816650W1v) {
                                    String str = c816650W1v.LIZ;
                                    if (str == null) {
                                        interfaceC796340VLs.LLD(1);
                                    } else {
                                        interfaceC796340VLs.LJIILIIL(1, str);
                                    }
                                }
                            };
                            new C854550Xfh(this, 8);
                            new C854550Xfh(this, 9);
                            new C854550Xfh(this, 10);
                            this.LJII = new C854550Xfh(this, 3);
                            this.LJIIIIZZ = new C854550Xfh(this, 4);
                            this.LJIIIZ = new C854550Xfh(this, 5);
                            this.LJIIJ = new C854550Xfh(this, 6);
                            this.LJIIJJI = new C854550Xfh(this, 7);
                        }

                        @Override // X.InterfaceC816590W1p
                        public final int LIZ(long j) {
                            this.LIZ.beginTransaction();
                            try {
                                int iLJIIL = LJIIL(j) + LJIILIIL(j) + LJIILJJIL(j);
                                this.LIZ.setTransactionSuccessful();
                                this.LIZ.endTransaction();
                                return iLJIIL;
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                this.LIZ.endTransaction();
                                throw th;
                            }
                        }

                        @Override // X.InterfaceC816590W1p
                        public final void LIZIZ(List<C816680W1y> list) {
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

                        @Override // X.InterfaceC816590W1p
                        public final void LIZLLL(List<C816670W1x> list) {
                            this.LIZ.beginTransaction();
                            try {
                                C816580W1o.LIZ(this, list);
                                this.LIZ.setTransactionSuccessful();
                                this.LIZ.endTransaction();
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                this.LIZ.endTransaction();
                                throw th;
                            }
                        }

                        @Override // X.InterfaceC816590W1p
                        public final void LJ(String str) {
                            this.LIZ.assertNotSuspendingTransaction();
                            InterfaceC796340VLs interfaceC796340VLsAcquire = this.LJIIIIZZ.acquire();
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
                                this.LJIIIIZZ.release(interfaceC796340VLsAcquire);
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                this.LIZ.endTransaction();
                                this.LJIIIIZZ.release(interfaceC796340VLsAcquire);
                                throw th;
                            }
                        }

                        @Override // X.InterfaceC816590W1p
                        public final void LJFF(List<C816640W1u> list) {
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

                        @Override // X.InterfaceC816590W1p
                        public final void LJI(String str) {
                            this.LIZ.assertNotSuspendingTransaction();
                            InterfaceC796340VLs interfaceC796340VLsAcquire = this.LJII.acquire();
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
                                this.LJII.release(interfaceC796340VLsAcquire);
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                this.LIZ.endTransaction();
                                this.LJII.release(interfaceC796340VLsAcquire);
                                throw th;
                            }
                        }

                        @Override // X.InterfaceC816590W1p
                        public final void LJII(List<C816650W1v> list) {
                            this.LIZ.assertNotSuspendingTransaction();
                            this.LIZ.beginTransaction();
                            try {
                                this.LIZLLL.insert((Iterable) list);
                                this.LIZ.setTransactionSuccessful();
                                this.LIZ.endTransaction();
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                this.LIZ.endTransaction();
                                throw th;
                            }
                        }

                        @Override // X.InterfaceC816590W1p
                        public final void LJIIIIZZ(C816670W1x c816670W1x) {
                            this.LIZ.beginTransaction();
                            try {
                                C816680W1y c816680W1y = c816670W1x.LIZJ;
                                if (c816680W1y != null) {
                                    LJIIJJI(c816680W1y);
                                }
                                C816640W1u c816640W1u = c816670W1x.LIZIZ;
                                if (c816640W1u != null) {
                                    LJIILL(c816640W1u);
                                }
                                C816650W1v c816650W1v = c816670W1x.LIZLLL;
                                if (c816650W1v != null) {
                                    LJIILLIIL(c816650W1v);
                                }
                                this.LIZ.setTransactionSuccessful();
                                this.LIZ.endTransaction();
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                this.LIZ.endTransaction();
                                throw th;
                            }
                        }

                        public final void LJIIIZ(C830490Whz<String, ArrayList<C816680W1y>> c830490Whz) {
                            String string;
                            String string2;
                            String string3;
                            String string4;
                            String string5;
                            String string6;
                            C830490Whz.c cVar = (C830490Whz.c) c830490Whz.keySet();
                            if (cVar.isEmpty()) {
                                return;
                            }
                            if (c830490Whz.LLILLL > 999) {
                                C830490Whz<String, ArrayList<C816680W1y>> c830490Whz2 = new C830490Whz<>(999);
                                int i = c830490Whz.LLILLL;
                                int i2 = 0;
                                int i3 = 0;
                                while (i2 < i) {
                                    c830490Whz2.put(c830490Whz.LJFF(i2), c830490Whz.LJIIIIZZ(i2));
                                    i2++;
                                    i3++;
                                    if (i3 == 999) {
                                        LJIIIZ(c830490Whz2);
                                        c830490Whz2 = new C830490Whz<>(999);
                                        i3 = 0;
                                    }
                                }
                                if (i3 > 0) {
                                    LJIIIZ(c830490Whz2);
                                    return;
                                }
                                return;
                            }
                            StringBuilder sb = new StringBuilder();
                            sb.append("SELECT `uid`,`rec_type`,`rec_reason`,`relation_type`,`social_info`,`mutual_struct`,`external_recommend_reason`,`version` FROM `maf_info` WHERE `uid` IN (");
                            int i4 = C830490Whz.this.LLILLL;
                            C0VIY.LIZ(sb, i4);
                            sb.append(")");
                            C0VN5 c0vn5LIZLLL = C0VN5.LIZLLL(i4, sb.toString());
                            Iterator it2 = cVar.iterator();
                            int i5 = 1;
                            while (true) {
                                AbstractC1322040kVW abstractC1322040kVW = (AbstractC1322040kVW) it2;
                                if (!abstractC1322040kVW.hasNext()) {
                                    break;
                                }
                                String str = (String) abstractC1322040kVW.next();
                                if (str == null) {
                                    c0vn5LIZLLL.LLD(i5);
                                } else {
                                    c0vn5LIZLLL.LJIILIIL(i5, str);
                                }
                                i5++;
                            }
                            Cursor cursorLIZIZ = C0VN0.LIZIZ(this.LIZ, c0vn5LIZLLL, false);
                            try {
                                int iLIZ = C795450VIh.LIZ(cursorLIZIZ, "uid");
                                if (iLIZ == -1) {
                                    cursorLIZIZ.close();
                                    return;
                                }
                                while (cursorLIZIZ.moveToNext()) {
                                    ArrayList<C816680W1y> arrayList = c830490Whz.get(cursorLIZIZ.getString(iLIZ));
                                    if (arrayList != null) {
                                        String string7 = null;
                                        if (cursorLIZIZ.isNull(0)) {
                                            string = null;
                                        } else {
                                            string = cursorLIZIZ.getString(0);
                                        }
                                        if (cursorLIZIZ.isNull(1)) {
                                            string2 = null;
                                        } else {
                                            string2 = cursorLIZIZ.getString(1);
                                        }
                                        if (cursorLIZIZ.isNull(2)) {
                                            string3 = null;
                                        } else {
                                            string3 = cursorLIZIZ.getString(2);
                                        }
                                        if (cursorLIZIZ.isNull(3)) {
                                            string4 = null;
                                        } else {
                                            string4 = cursorLIZIZ.getString(3);
                                        }
                                        if (cursorLIZIZ.isNull(4)) {
                                            string5 = null;
                                        } else {
                                            string5 = cursorLIZIZ.getString(4);
                                        }
                                        if (cursorLIZIZ.isNull(5)) {
                                            string6 = null;
                                        } else {
                                            string6 = cursorLIZIZ.getString(5);
                                        }
                                        if (!cursorLIZIZ.isNull(6)) {
                                            string7 = cursorLIZIZ.getString(6);
                                        }
                                        arrayList.add(new C816680W1y(string, string2, cursorLIZIZ.getLong(7), string3, string4, string5, string6, string7));
                                    }
                                }
                                cursorLIZIZ.close();
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                cursorLIZIZ.close();
                                throw th;
                            }
                        }

                        public final void LJIIJ(C830490Whz<String, C816650W1v> c830490Whz) {
                            String string;
                            Integer numValueOf;
                            Integer numValueOf2;
                            Boolean boolValueOf;
                            Integer numValueOf3;
                            boolean z;
                            C830490Whz.c cVar = (C830490Whz.c) c830490Whz.keySet();
                            if (cVar.isEmpty()) {
                                return;
                            }
                            if (c830490Whz.LLILLL > 999) {
                                C830490Whz<String, C816650W1v> c830490Whz2 = new C830490Whz<>(999);
                                int i = c830490Whz.LLILLL;
                                int i2 = 0;
                                int i3 = 0;
                                while (i2 < i) {
                                    c830490Whz2.put(c830490Whz.LJFF(i2), null);
                                    i2++;
                                    i3++;
                                    if (i3 == 999) {
                                        LJIIJ(c830490Whz2);
                                        c830490Whz.putAll(c830490Whz2);
                                        c830490Whz2 = new C830490Whz<>(999);
                                        i3 = 0;
                                    }
                                }
                                if (i3 > 0) {
                                    LJIIJ(c830490Whz2);
                                    c830490Whz.putAll(c830490Whz2);
                                    return;
                                }
                                return;
                            }
                            StringBuilder sb = new StringBuilder();
                            sb.append("SELECT `uid`,`follow_status`,`follower_status`,`is_block`,`version` FROM `user_status` WHERE `uid` IN (");
                            int i4 = C830490Whz.this.LLILLL;
                            C0VIY.LIZ(sb, i4);
                            sb.append(")");
                            C0VN5 c0vn5LIZLLL = C0VN5.LIZLLL(i4, sb.toString());
                            Iterator it2 = cVar.iterator();
                            int i5 = 1;
                            while (true) {
                                AbstractC1322040kVW abstractC1322040kVW = (AbstractC1322040kVW) it2;
                                if (!abstractC1322040kVW.hasNext()) {
                                    break;
                                }
                                String str = (String) abstractC1322040kVW.next();
                                if (str == null) {
                                    c0vn5LIZLLL.LLD(i5);
                                } else {
                                    c0vn5LIZLLL.LJIILIIL(i5, str);
                                }
                                i5++;
                            }
                            Cursor cursorLIZIZ = C0VN0.LIZIZ(this.LIZ, c0vn5LIZLLL, false);
                            try {
                                int iLIZ = C795450VIh.LIZ(cursorLIZIZ, "uid");
                                if (iLIZ == -1) {
                                    cursorLIZIZ.close();
                                    return;
                                }
                                while (cursorLIZIZ.moveToNext()) {
                                    String string2 = cursorLIZIZ.getString(iLIZ);
                                    if (c830490Whz.containsKey(string2)) {
                                        if (cursorLIZIZ.isNull(0)) {
                                            string = null;
                                        } else {
                                            string = cursorLIZIZ.getString(0);
                                        }
                                        if (cursorLIZIZ.isNull(1)) {
                                            numValueOf = null;
                                        } else {
                                            numValueOf = Integer.valueOf(cursorLIZIZ.getInt(1));
                                        }
                                        if (cursorLIZIZ.isNull(2)) {
                                            numValueOf2 = null;
                                        } else {
                                            numValueOf2 = Integer.valueOf(cursorLIZIZ.getInt(2));
                                        }
                                        if (!cursorLIZIZ.isNull(3) && (numValueOf3 = Integer.valueOf(cursorLIZIZ.getInt(3))) != null) {
                                            if (numValueOf3.intValue() != 0) {
                                                z = true;
                                            } else {
                                                z = false;
                                            }
                                            boolValueOf = Boolean.valueOf(z);
                                        } else {
                                            boolValueOf = null;
                                        }
                                        c830490Whz.put(string2, new C816650W1v(string, numValueOf, numValueOf2, boolValueOf, cursorLIZIZ.getLong(4)));
                                    }
                                }
                                cursorLIZIZ.close();
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                cursorLIZIZ.close();
                                throw th;
                            }
                        }

                        public final int LJIIJJI(C816680W1y c816680W1y) {
                            this.LIZ.assertNotSuspendingTransaction();
                            this.LIZ.beginTransaction();
                            try {
                                int iHandle = handle(c816680W1y);
                                this.LIZ.setTransactionSuccessful();
                                this.LIZ.endTransaction();
                                return iHandle;
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                this.LIZ.endTransaction();
                                throw th;
                            }
                        }

                        public final int LJIIL(long j) {
                            this.LIZ.assertNotSuspendingTransaction();
                            InterfaceC796340VLs interfaceC796340VLsAcquire = this.LJIIIZ.acquire();
                            interfaceC796340VLsAcquire.LJIJ(1, j);
                            this.LIZ.beginTransaction();
                            try {
                                int iLJIIL = interfaceC796340VLsAcquire.LJIIL();
                                this.LIZ.setTransactionSuccessful();
                                this.LIZ.endTransaction();
                                this.LJIIIZ.release(interfaceC796340VLsAcquire);
                                return iLJIIL;
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                this.LIZ.endTransaction();
                                this.LJIIIZ.release(interfaceC796340VLsAcquire);
                                throw th;
                            }
                        }

                        public final int LJIILIIL(long j) {
                            this.LIZ.assertNotSuspendingTransaction();
                            InterfaceC796340VLs interfaceC796340VLsAcquire = this.LJIIJ.acquire();
                            interfaceC796340VLsAcquire.LJIJ(1, j);
                            this.LIZ.beginTransaction();
                            try {
                                int iLJIIL = interfaceC796340VLsAcquire.LJIIL();
                                this.LIZ.setTransactionSuccessful();
                                this.LIZ.endTransaction();
                                this.LJIIJ.release(interfaceC796340VLsAcquire);
                                return iLJIIL;
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                this.LIZ.endTransaction();
                                this.LJIIJ.release(interfaceC796340VLsAcquire);
                                throw th;
                            }
                        }

                        public final int LJIILJJIL(long j) {
                            this.LIZ.assertNotSuspendingTransaction();
                            InterfaceC796340VLs interfaceC796340VLsAcquire = this.LJIIJJI.acquire();
                            interfaceC796340VLsAcquire.LJIJ(1, j);
                            this.LIZ.beginTransaction();
                            try {
                                int iLJIIL = interfaceC796340VLsAcquire.LJIIL();
                                this.LIZ.setTransactionSuccessful();
                                this.LIZ.endTransaction();
                                this.LJIIJJI.release(interfaceC796340VLsAcquire);
                                return iLJIIL;
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                this.LIZ.endTransaction();
                                this.LJIIJJI.release(interfaceC796340VLsAcquire);
                                throw th;
                            }
                        }

                        public final int LJIILL(C816640W1u c816640W1u) {
                            this.LIZ.assertNotSuspendingTransaction();
                            this.LIZ.beginTransaction();
                            try {
                                int iHandle = handle(c816640W1u);
                                this.LIZ.setTransactionSuccessful();
                                this.LIZ.endTransaction();
                                return iHandle;
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                this.LIZ.endTransaction();
                                throw th;
                            }
                        }

                        public final int LJIILLIIL(C816650W1v c816650W1v) {
                            this.LIZ.assertNotSuspendingTransaction();
                            this.LIZ.beginTransaction();
                            try {
                                int iHandle = handle(c816650W1v);
                                this.LIZ.setTransactionSuccessful();
                                this.LIZ.endTransaction();
                                return iHandle;
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                this.LIZ.endTransaction();
                                throw th;
                            }
                        }
                    };
                }
                c816570W1n = this.LLILLJJLI;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return c816570W1n;
    }

    @Override // X.AbstractC796540VMm
    public final void clearAllTables() {
        super.assertNotMainThread();
        C0VLF c0vlfLJLJJI = this.mOpenHelper.LJLJJI();
        try {
            super.beginTransaction();
            c0vlfLJLJJI.LJIILJJIL("DELETE FROM `maf_info`");
            c0vlfLJLJJI.LJIILJJIL("DELETE FROM `user_info`");
            c0vlfLJLJJI.LJIILJJIL("DELETE FROM `user_status`");
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
        return new C796620VMu(this, new HashMap(0), new HashMap(0), "maf_info", "user_info", "user_status");
    }

    @Override // X.AbstractC796540VMm
    public final Set<Class<? extends InterfaceC2275591E5d>> getRequiredAutoMigrationSpecs() {
        return new HashSet();
    }

    @Override // X.AbstractC796540VMm
    public final Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
        HashMap map = new HashMap();
        map.put(InterfaceC816590W1p.class, Collections.emptyList());
        map.put(InterfaceC816560W1m.class, Collections.emptyList());
        return map;
    }

    @Override // X.AbstractC796540VMm
    public final InterfaceC796190VLd createOpenHelper(C796520VMk c796520VMk) {
        C0VN2 c0vn2 = new C0VN2(c796520VMk, new C0VN3() { // from class: X.0VMA
            @Override // X.C0VN3
            public final void onPostMigrate(C0VLF c0vlf) {
            }

            {
                super(1);
            }

            @Override // X.C0VN3
            public final void createAllTables(C0VLF c0vlf) {
                c0vlf.LJIILJJIL("CREATE TABLE IF NOT EXISTS `maf_info` (`uid` TEXT NOT NULL, `rec_type` TEXT NOT NULL, `rec_reason` TEXT, `relation_type` TEXT, `social_info` TEXT, `mutual_struct` TEXT, `external_recommend_reason` TEXT, `version` INTEGER NOT NULL DEFAULT 0, PRIMARY KEY(`uid`, `rec_type`))");
                c0vlf.LJIILJJIL("CREATE INDEX IF NOT EXISTS `index_maf_info_uid` ON `maf_info` (`uid`)");
                c0vlf.LJIILJJIL("CREATE TABLE IF NOT EXISTS `user_info` (`uid` TEXT NOT NULL, `version` INTEGER NOT NULL DEFAULT 0, `nickname` TEXT, `is_private_account` INTEGER, `avatar_168` TEXT, `avatar_300` TEXT, PRIMARY KEY(`uid`))");
                c0vlf.LJIILJJIL("CREATE TABLE IF NOT EXISTS `user_status` (`uid` TEXT NOT NULL, `follow_status` INTEGER, `follower_status` INTEGER, `is_block` INTEGER, `version` INTEGER NOT NULL DEFAULT 0, PRIMARY KEY(`uid`))");
                c0vlf.LJIILJJIL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                c0vlf.LJIILJJIL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'f75f2d2e74b409761abba7970ba9bb1b')");
            }

            @Override // X.C0VN3
            public final void dropAllTables(C0VLF c0vlf) {
                c0vlf.LJIILJJIL("DROP TABLE IF EXISTS `maf_info`");
                c0vlf.LJIILJJIL("DROP TABLE IF EXISTS `user_info`");
                c0vlf.LJIILJJIL("DROP TABLE IF EXISTS `user_status`");
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
                map.put("uid", new C795990VKj(1, 1, "uid", "TEXT", null, true));
                map.put("rec_type", new C795990VKj(2, 1, "rec_type", "TEXT", null, true));
                map.put("rec_reason", new C795990VKj(0, 1, "rec_reason", "TEXT", null, false));
                map.put("relation_type", new C795990VKj(0, 1, "relation_type", "TEXT", null, false));
                map.put("social_info", new C795990VKj(0, 1, "social_info", "TEXT", null, false));
                map.put("mutual_struct", new C795990VKj(0, 1, "mutual_struct", "TEXT", null, false));
                map.put("external_recommend_reason", new C795990VKj(0, 1, "external_recommend_reason", "TEXT", null, false));
                map.put("version", new C795990VKj(0, 1, "version", "INTEGER", CardStruct.IStatusCode.DEFAULT, true));
                HashSet hashSet = new HashSet(0);
                HashSet hashSet2 = new HashSet(1);
                hashSet2.add(new C796450VMd(Arrays.asList("uid"), "index_maf_info_uid", Arrays.asList("ASC"), false));
                C0VN6 c0vn6 = new C0VN6("maf_info", map, hashSet, hashSet2);
                C0VN6 c0vn6LIZ = C0VN6.LIZ(c0vlf, "maf_info");
                if (!c0vn6.equals(c0vn6LIZ)) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("maf_info(com.ss.android.ugc.aweme.relation.storage.db.entity.MafInfo).\n Expected:\n");
                    sbLIZ.append(c0vn6);
                    sbLIZ.append("\n Found:\n");
                    sbLIZ.append(c0vn6LIZ);
                    return new C0VN4(false, C2188811AlT.LIZIZ(sbLIZ));
                }
                HashMap map2 = new HashMap(6);
                map2.put("uid", new C795990VKj(1, 1, "uid", "TEXT", null, true));
                map2.put("version", new C795990VKj(0, 1, "version", "INTEGER", CardStruct.IStatusCode.DEFAULT, true));
                map2.put("nickname", new C795990VKj(0, 1, "nickname", "TEXT", null, false));
                map2.put("is_private_account", new C795990VKj(0, 1, "is_private_account", "INTEGER", null, false));
                map2.put("avatar_168", new C795990VKj(0, 1, "avatar_168", "TEXT", null, false));
                map2.put("avatar_300", new C795990VKj(0, 1, "avatar_300", "TEXT", null, false));
                C0VN6 c0vn62 = new C0VN6("user_info", map2, new HashSet(0), new HashSet(0));
                C0VN6 c0vn6LIZ2 = C0VN6.LIZ(c0vlf, "user_info");
                if (!c0vn62.equals(c0vn6LIZ2)) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("user_info(com.ss.android.ugc.aweme.relation.storage.db.entity.UserInfo).\n Expected:\n");
                    sbLIZ2.append(c0vn62);
                    sbLIZ2.append("\n Found:\n");
                    sbLIZ2.append(c0vn6LIZ2);
                    return new C0VN4(false, C2188811AlT.LIZIZ(sbLIZ2));
                }
                HashMap map3 = new HashMap(5);
                map3.put("uid", new C795990VKj(1, 1, "uid", "TEXT", null, true));
                map3.put("follow_status", new C795990VKj(0, 1, "follow_status", "INTEGER", null, false));
                map3.put("follower_status", new C795990VKj(0, 1, "follower_status", "INTEGER", null, false));
                map3.put("is_block", new C795990VKj(0, 1, "is_block", "INTEGER", null, false));
                map3.put("version", new C795990VKj(0, 1, "version", "INTEGER", CardStruct.IStatusCode.DEFAULT, true));
                C0VN6 c0vn63 = new C0VN6("user_status", map3, new HashSet(0), new HashSet(0));
                C0VN6 c0vn6LIZ3 = C0VN6.LIZ(c0vlf, "user_status");
                if (!c0vn63.equals(c0vn6LIZ3)) {
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("user_status(com.ss.android.ugc.aweme.relation.storage.db.entity.UserStatus).\n Expected:\n");
                    sbLIZ3.append(c0vn63);
                    sbLIZ3.append("\n Found:\n");
                    sbLIZ3.append(c0vn6LIZ3);
                    return new C0VN4(false, C2188811AlT.LIZIZ(sbLIZ3));
                }
                return new C0VN4(true, null);
            }
        }, "f75f2d2e74b409761abba7970ba9bb1b", "3cf942b7b80d0268cb3398705318a429");
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
