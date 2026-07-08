package com.ss.android.ugc.aweme.shortvideo.mediaselector.aicontentprotocol;

import X.AbstractC796510VMj;
import X.C0VKN;
import X.C0VKV;
import X.C0VLF;
import X.C0VN2;
import X.C0VN3;
import X.C796520VMk;
import X.C796620VMu;
import X.InterfaceC2275591E5d;
import X.InterfaceC534920KyQ;
import X.InterfaceC796190VLd;
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
public final class AlbumAiContentRoomDatabase_Impl extends AlbumAiContentRoomDatabase {
    public volatile C0VKV LLILLJJLI;

    /* JADX WARN: Type inference failed for: r0v4, types: [X.0VKV] */
    @Override // com.ss.android.ugc.aweme.shortvideo.mediaselector.aicontentprotocol.AlbumAiContentRoomDatabase
    public final InterfaceC534920KyQ LIZ() {
        C0VKV c0vkv;
        if (this.LLILLJJLI != null) {
            return this.LLILLJJLI;
        }
        synchronized (this) {
            try {
                if (this.LLILLJJLI == null) {
                    this.LLILLJJLI = new InterfaceC534920KyQ(this) { // from class: X.0VKV
                        public final AbstractC796540VMm LIZ;
                        public final C580780MqC LIZIZ;

                        @Override // X.InterfaceC534920KyQ
                        public final int LJ() {
                            C0VN5 c0vn5LIZLLL = C0VN5.LIZLLL(0, "SELECT count(*) FROM album_ai_content WHERE deleted != 1 AND ai_type != 0");
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

                        @Override // X.InterfaceC534920KyQ
                        public final List<C535020Kya> LJFF() throws Throwable {
                            C0VN5 c0vn5LIZLLL = C0VN5.LIZLLL(0, "SELECT * FROM album_ai_content WHERE ai_type != 0 ORDER BY created_time_ms DESC");
                            this.LIZ.assertNotSuspendingTransaction();
                            Cursor cursorLIZIZ = C0VN0.LIZIZ(this.LIZ, c0vn5LIZLLL, false);
                            try {
                                int iLIZIZ = C795450VIh.LIZIZ(cursorLIZIZ, "uuid");
                                int iLIZIZ2 = C795450VIh.LIZIZ(cursorLIZIZ, "task_id");
                                int iLIZIZ3 = C795450VIh.LIZIZ(cursorLIZIZ, "ai_type");
                                int iLIZIZ4 = C795450VIh.LIZIZ(cursorLIZIZ, "media_type");
                                int iLIZIZ5 = C795450VIh.LIZIZ(cursorLIZIZ, "width");
                                int iLIZIZ6 = C795450VIh.LIZIZ(cursorLIZIZ, "height");
                                int iLIZIZ7 = C795450VIh.LIZIZ(cursorLIZIZ, "duration");
                                int iLIZIZ8 = C795450VIh.LIZIZ(cursorLIZIZ, "ai_local_uri");
                                int iLIZIZ9 = C795450VIh.LIZIZ(cursorLIZIZ, "ai_remote_uri");
                                int iLIZIZ10 = C795450VIh.LIZIZ(cursorLIZIZ, "new_flag");
                                int iLIZIZ11 = C795450VIh.LIZIZ(cursorLIZIZ, "anchor_name");
                                int iLIZIZ12 = C795450VIh.LIZIZ(cursorLIZIZ, "anchor_id");
                                int iLIZIZ13 = C795450VIh.LIZIZ(cursorLIZIZ, "anchor_icon_url");
                                int iLIZIZ14 = C795450VIh.LIZIZ(cursorLIZIZ, "extra");
                                try {
                                    int iLIZIZ15 = C795450VIh.LIZIZ(cursorLIZIZ, "created_time_ms");
                                    int iLIZIZ16 = C795450VIh.LIZIZ(cursorLIZIZ, "deleted");
                                    ArrayList arrayList = new ArrayList(cursorLIZIZ.getCount());
                                    while (cursorLIZIZ.moveToNext()) {
                                        String string = null;
                                        String string2 = cursorLIZIZ.isNull(iLIZIZ) ? null : cursorLIZIZ.getString(iLIZIZ);
                                        String string3 = cursorLIZIZ.isNull(iLIZIZ2) ? null : cursorLIZIZ.getString(iLIZIZ2);
                                        int i = cursorLIZIZ.getInt(iLIZIZ3);
                                        int i2 = cursorLIZIZ.getInt(iLIZIZ4);
                                        int i3 = cursorLIZIZ.getInt(iLIZIZ5);
                                        int i4 = cursorLIZIZ.getInt(iLIZIZ6);
                                        int i5 = cursorLIZIZ.getInt(iLIZIZ7);
                                        String string4 = cursorLIZIZ.isNull(iLIZIZ8) ? null : cursorLIZIZ.getString(iLIZIZ8);
                                        String string5 = cursorLIZIZ.isNull(iLIZIZ9) ? null : cursorLIZIZ.getString(iLIZIZ9);
                                        boolean z = cursorLIZIZ.getInt(iLIZIZ10) != 0;
                                        String string6 = cursorLIZIZ.isNull(iLIZIZ11) ? null : cursorLIZIZ.getString(iLIZIZ11);
                                        String string7 = cursorLIZIZ.isNull(iLIZIZ12) ? null : cursorLIZIZ.getString(iLIZIZ12);
                                        String string8 = cursorLIZIZ.isNull(iLIZIZ13) ? null : cursorLIZIZ.getString(iLIZIZ13);
                                        if (!cursorLIZIZ.isNull(iLIZIZ14)) {
                                            string = cursorLIZIZ.getString(iLIZIZ14);
                                        }
                                        arrayList.add(new C535020Kya(string2, string3, i, i2, i3, i4, i5, string4, string5, z, string6, string7, string8, string, cursorLIZIZ.getLong(iLIZIZ15), cursorLIZIZ.getInt(iLIZIZ16)));
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

                        {
                            this.LIZ = this;
                            this.LIZIZ = new C580780MqC(this, 0);
                        }

                        @Override // X.InterfaceC534920KyQ
                        public final List<C535020Kya> LIZ(List<String> list) throws Throwable {
                            String string;
                            String string2;
                            String string3;
                            String string4;
                            boolean z;
                            String string5;
                            String string6;
                            String string7;
                            StringBuilder sb = new StringBuilder();
                            sb.append("SELECT * FROM album_ai_content WHERE uuid IN (");
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
                                int iLIZIZ = C795450VIh.LIZIZ(cursorLIZIZ, "uuid");
                                int iLIZIZ2 = C795450VIh.LIZIZ(cursorLIZIZ, "task_id");
                                int iLIZIZ3 = C795450VIh.LIZIZ(cursorLIZIZ, "ai_type");
                                int iLIZIZ4 = C795450VIh.LIZIZ(cursorLIZIZ, "media_type");
                                int iLIZIZ5 = C795450VIh.LIZIZ(cursorLIZIZ, "width");
                                int iLIZIZ6 = C795450VIh.LIZIZ(cursorLIZIZ, "height");
                                int iLIZIZ7 = C795450VIh.LIZIZ(cursorLIZIZ, "duration");
                                int iLIZIZ8 = C795450VIh.LIZIZ(cursorLIZIZ, "ai_local_uri");
                                int iLIZIZ9 = C795450VIh.LIZIZ(cursorLIZIZ, "ai_remote_uri");
                                int iLIZIZ10 = C795450VIh.LIZIZ(cursorLIZIZ, "new_flag");
                                int iLIZIZ11 = C795450VIh.LIZIZ(cursorLIZIZ, "anchor_name");
                                int iLIZIZ12 = C795450VIh.LIZIZ(cursorLIZIZ, "anchor_id");
                                int iLIZIZ13 = C795450VIh.LIZIZ(cursorLIZIZ, "anchor_icon_url");
                                int iLIZIZ14 = C795450VIh.LIZIZ(cursorLIZIZ, "extra");
                                try {
                                    int iLIZIZ15 = C795450VIh.LIZIZ(cursorLIZIZ, "created_time_ms");
                                    int iLIZIZ16 = C795450VIh.LIZIZ(cursorLIZIZ, "deleted");
                                    ArrayList arrayList = new ArrayList(cursorLIZIZ.getCount());
                                    while (cursorLIZIZ.moveToNext()) {
                                        String string8 = null;
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
                                        int i3 = cursorLIZIZ.getInt(iLIZIZ4);
                                        int i4 = cursorLIZIZ.getInt(iLIZIZ5);
                                        int i5 = cursorLIZIZ.getInt(iLIZIZ6);
                                        int i6 = cursorLIZIZ.getInt(iLIZIZ7);
                                        if (cursorLIZIZ.isNull(iLIZIZ8)) {
                                            string3 = null;
                                        } else {
                                            string3 = cursorLIZIZ.getString(iLIZIZ8);
                                        }
                                        if (cursorLIZIZ.isNull(iLIZIZ9)) {
                                            string4 = null;
                                        } else {
                                            string4 = cursorLIZIZ.getString(iLIZIZ9);
                                        }
                                        if (cursorLIZIZ.getInt(iLIZIZ10) != 0) {
                                            z = true;
                                        } else {
                                            z = false;
                                        }
                                        if (cursorLIZIZ.isNull(iLIZIZ11)) {
                                            string5 = null;
                                        } else {
                                            string5 = cursorLIZIZ.getString(iLIZIZ11);
                                        }
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
                                        if (!cursorLIZIZ.isNull(iLIZIZ14)) {
                                            string8 = cursorLIZIZ.getString(iLIZIZ14);
                                        }
                                        arrayList.add(new C535020Kya(string, string2, i2, i3, i4, i5, i6, string3, string4, z, string5, string6, string7, string8, cursorLIZIZ.getLong(iLIZIZ15), cursorLIZIZ.getInt(iLIZIZ16)));
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

                        @Override // X.InterfaceC534920KyQ
                        public final List<C535020Kya> LIZIZ(String str) throws Throwable {
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
                            boolean z;
                            String string5;
                            String string6;
                            String string7;
                            C0VN5 c0vn5LIZLLL = C0VN5.LIZLLL(1, "SELECT * FROM album_ai_content WHERE task_id = ?");
                            if (str == null) {
                                c0vn5LIZLLL.LLD(1);
                            } else {
                                c0vn5LIZLLL.LJIILIIL(1, str);
                            }
                            this.LIZ.assertNotSuspendingTransaction();
                            Cursor cursorLIZIZ = C0VN0.LIZIZ(this.LIZ, c0vn5LIZLLL, false);
                            try {
                                iLIZIZ = C795450VIh.LIZIZ(cursorLIZIZ, "uuid");
                                iLIZIZ2 = C795450VIh.LIZIZ(cursorLIZIZ, "task_id");
                                iLIZIZ3 = C795450VIh.LIZIZ(cursorLIZIZ, "ai_type");
                                iLIZIZ4 = C795450VIh.LIZIZ(cursorLIZIZ, "media_type");
                                iLIZIZ5 = C795450VIh.LIZIZ(cursorLIZIZ, "width");
                                iLIZIZ6 = C795450VIh.LIZIZ(cursorLIZIZ, "height");
                                iLIZIZ7 = C795450VIh.LIZIZ(cursorLIZIZ, "duration");
                                iLIZIZ8 = C795450VIh.LIZIZ(cursorLIZIZ, "ai_local_uri");
                                iLIZIZ9 = C795450VIh.LIZIZ(cursorLIZIZ, "ai_remote_uri");
                                iLIZIZ10 = C795450VIh.LIZIZ(cursorLIZIZ, "new_flag");
                                iLIZIZ11 = C795450VIh.LIZIZ(cursorLIZIZ, "anchor_name");
                                iLIZIZ12 = C795450VIh.LIZIZ(cursorLIZIZ, "anchor_id");
                                iLIZIZ13 = C795450VIh.LIZIZ(cursorLIZIZ, "anchor_icon_url");
                                iLIZIZ14 = C795450VIh.LIZIZ(cursorLIZIZ, "extra");
                            } catch (Throwable th) {
                                th = th;
                            }
                            try {
                                int iLIZIZ15 = C795450VIh.LIZIZ(cursorLIZIZ, "created_time_ms");
                                int iLIZIZ16 = C795450VIh.LIZIZ(cursorLIZIZ, "deleted");
                                ArrayList arrayList = new ArrayList(cursorLIZIZ.getCount());
                                while (cursorLIZIZ.moveToNext()) {
                                    String string8 = null;
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
                                    int i = cursorLIZIZ.getInt(iLIZIZ3);
                                    int i2 = cursorLIZIZ.getInt(iLIZIZ4);
                                    int i3 = cursorLIZIZ.getInt(iLIZIZ5);
                                    int i4 = cursorLIZIZ.getInt(iLIZIZ6);
                                    int i5 = cursorLIZIZ.getInt(iLIZIZ7);
                                    if (cursorLIZIZ.isNull(iLIZIZ8)) {
                                        string3 = null;
                                    } else {
                                        string3 = cursorLIZIZ.getString(iLIZIZ8);
                                    }
                                    if (cursorLIZIZ.isNull(iLIZIZ9)) {
                                        string4 = null;
                                    } else {
                                        string4 = cursorLIZIZ.getString(iLIZIZ9);
                                    }
                                    if (cursorLIZIZ.getInt(iLIZIZ10) != 0) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    if (cursorLIZIZ.isNull(iLIZIZ11)) {
                                        string5 = null;
                                    } else {
                                        string5 = cursorLIZIZ.getString(iLIZIZ11);
                                    }
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
                                    if (!cursorLIZIZ.isNull(iLIZIZ14)) {
                                        string8 = cursorLIZIZ.getString(iLIZIZ14);
                                    }
                                    arrayList.add(new C535020Kya(string, string2, i, i2, i3, i4, i5, string3, string4, z, string5, string6, string7, string8, cursorLIZIZ.getLong(iLIZIZ15), cursorLIZIZ.getInt(iLIZIZ16)));
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

                        @Override // X.InterfaceC534920KyQ
                        public final List<C535020Kya> LIZJ(int i) throws Throwable {
                            String string;
                            String string2;
                            String string3;
                            String string4;
                            boolean z;
                            String string5;
                            String string6;
                            String string7;
                            C0VN5 c0vn5LIZLLL = C0VN5.LIZLLL(1, "SELECT * FROM album_ai_content WHERE ai_type != 0 ORDER BY created_time_ms DESC LIMIT ?");
                            c0vn5LIZLLL.LJIJ(1, i);
                            this.LIZ.assertNotSuspendingTransaction();
                            Cursor cursorLIZIZ = C0VN0.LIZIZ(this.LIZ, c0vn5LIZLLL, false);
                            try {
                                int iLIZIZ = C795450VIh.LIZIZ(cursorLIZIZ, "uuid");
                                int iLIZIZ2 = C795450VIh.LIZIZ(cursorLIZIZ, "task_id");
                                int iLIZIZ3 = C795450VIh.LIZIZ(cursorLIZIZ, "ai_type");
                                int iLIZIZ4 = C795450VIh.LIZIZ(cursorLIZIZ, "media_type");
                                int iLIZIZ5 = C795450VIh.LIZIZ(cursorLIZIZ, "width");
                                int iLIZIZ6 = C795450VIh.LIZIZ(cursorLIZIZ, "height");
                                int iLIZIZ7 = C795450VIh.LIZIZ(cursorLIZIZ, "duration");
                                int iLIZIZ8 = C795450VIh.LIZIZ(cursorLIZIZ, "ai_local_uri");
                                int iLIZIZ9 = C795450VIh.LIZIZ(cursorLIZIZ, "ai_remote_uri");
                                int iLIZIZ10 = C795450VIh.LIZIZ(cursorLIZIZ, "new_flag");
                                int iLIZIZ11 = C795450VIh.LIZIZ(cursorLIZIZ, "anchor_name");
                                int iLIZIZ12 = C795450VIh.LIZIZ(cursorLIZIZ, "anchor_id");
                                int iLIZIZ13 = C795450VIh.LIZIZ(cursorLIZIZ, "anchor_icon_url");
                                int iLIZIZ14 = C795450VIh.LIZIZ(cursorLIZIZ, "extra");
                                try {
                                    int iLIZIZ15 = C795450VIh.LIZIZ(cursorLIZIZ, "created_time_ms");
                                    int iLIZIZ16 = C795450VIh.LIZIZ(cursorLIZIZ, "deleted");
                                    ArrayList arrayList = new ArrayList(cursorLIZIZ.getCount());
                                    while (cursorLIZIZ.moveToNext()) {
                                        String string8 = null;
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
                                        int i3 = cursorLIZIZ.getInt(iLIZIZ4);
                                        int i4 = cursorLIZIZ.getInt(iLIZIZ5);
                                        int i5 = cursorLIZIZ.getInt(iLIZIZ6);
                                        int i6 = cursorLIZIZ.getInt(iLIZIZ7);
                                        if (cursorLIZIZ.isNull(iLIZIZ8)) {
                                            string3 = null;
                                        } else {
                                            string3 = cursorLIZIZ.getString(iLIZIZ8);
                                        }
                                        if (cursorLIZIZ.isNull(iLIZIZ9)) {
                                            string4 = null;
                                        } else {
                                            string4 = cursorLIZIZ.getString(iLIZIZ9);
                                        }
                                        if (cursorLIZIZ.getInt(iLIZIZ10) != 0) {
                                            z = true;
                                        } else {
                                            z = false;
                                        }
                                        if (cursorLIZIZ.isNull(iLIZIZ11)) {
                                            string5 = null;
                                        } else {
                                            string5 = cursorLIZIZ.getString(iLIZIZ11);
                                        }
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
                                        if (!cursorLIZIZ.isNull(iLIZIZ14)) {
                                            string8 = cursorLIZIZ.getString(iLIZIZ14);
                                        }
                                        arrayList.add(new C535020Kya(string, string2, i2, i3, i4, i5, i6, string3, string4, z, string5, string6, string7, string8, cursorLIZIZ.getLong(iLIZIZ15), cursorLIZIZ.getInt(iLIZIZ16)));
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

                        @Override // X.InterfaceC534920KyQ
                        public final long LIZLLL(C535020Kya c535020Kya) {
                            this.LIZ.assertNotSuspendingTransaction();
                            this.LIZ.beginTransaction();
                            try {
                                long jInsertAndReturnId = this.LIZIZ.insertAndReturnId(c535020Kya);
                                this.LIZ.setTransactionSuccessful();
                                this.LIZ.endTransaction();
                                return jInsertAndReturnId;
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                this.LIZ.endTransaction();
                                throw th;
                            }
                        }

                        @Override // X.InterfaceC534920KyQ
                        public final List<C535020Kya> LJI(String str) throws Throwable {
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
                            boolean z;
                            String string5;
                            String string6;
                            String string7;
                            C0VN5 c0vn5LIZLLL = C0VN5.LIZLLL(1, "SELECT * FROM album_ai_content WHERE uuid = ?");
                            if (str == null) {
                                c0vn5LIZLLL.LLD(1);
                            } else {
                                c0vn5LIZLLL.LJIILIIL(1, str);
                            }
                            this.LIZ.assertNotSuspendingTransaction();
                            Cursor cursorLIZIZ = C0VN0.LIZIZ(this.LIZ, c0vn5LIZLLL, false);
                            try {
                                iLIZIZ = C795450VIh.LIZIZ(cursorLIZIZ, "uuid");
                                iLIZIZ2 = C795450VIh.LIZIZ(cursorLIZIZ, "task_id");
                                iLIZIZ3 = C795450VIh.LIZIZ(cursorLIZIZ, "ai_type");
                                iLIZIZ4 = C795450VIh.LIZIZ(cursorLIZIZ, "media_type");
                                iLIZIZ5 = C795450VIh.LIZIZ(cursorLIZIZ, "width");
                                iLIZIZ6 = C795450VIh.LIZIZ(cursorLIZIZ, "height");
                                iLIZIZ7 = C795450VIh.LIZIZ(cursorLIZIZ, "duration");
                                iLIZIZ8 = C795450VIh.LIZIZ(cursorLIZIZ, "ai_local_uri");
                                iLIZIZ9 = C795450VIh.LIZIZ(cursorLIZIZ, "ai_remote_uri");
                                iLIZIZ10 = C795450VIh.LIZIZ(cursorLIZIZ, "new_flag");
                                iLIZIZ11 = C795450VIh.LIZIZ(cursorLIZIZ, "anchor_name");
                                iLIZIZ12 = C795450VIh.LIZIZ(cursorLIZIZ, "anchor_id");
                                iLIZIZ13 = C795450VIh.LIZIZ(cursorLIZIZ, "anchor_icon_url");
                                iLIZIZ14 = C795450VIh.LIZIZ(cursorLIZIZ, "extra");
                            } catch (Throwable th) {
                                th = th;
                            }
                            try {
                                int iLIZIZ15 = C795450VIh.LIZIZ(cursorLIZIZ, "created_time_ms");
                                int iLIZIZ16 = C795450VIh.LIZIZ(cursorLIZIZ, "deleted");
                                ArrayList arrayList = new ArrayList(cursorLIZIZ.getCount());
                                while (cursorLIZIZ.moveToNext()) {
                                    String string8 = null;
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
                                    int i = cursorLIZIZ.getInt(iLIZIZ3);
                                    int i2 = cursorLIZIZ.getInt(iLIZIZ4);
                                    int i3 = cursorLIZIZ.getInt(iLIZIZ5);
                                    int i4 = cursorLIZIZ.getInt(iLIZIZ6);
                                    int i5 = cursorLIZIZ.getInt(iLIZIZ7);
                                    if (cursorLIZIZ.isNull(iLIZIZ8)) {
                                        string3 = null;
                                    } else {
                                        string3 = cursorLIZIZ.getString(iLIZIZ8);
                                    }
                                    if (cursorLIZIZ.isNull(iLIZIZ9)) {
                                        string4 = null;
                                    } else {
                                        string4 = cursorLIZIZ.getString(iLIZIZ9);
                                    }
                                    if (cursorLIZIZ.getInt(iLIZIZ10) != 0) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    if (cursorLIZIZ.isNull(iLIZIZ11)) {
                                        string5 = null;
                                    } else {
                                        string5 = cursorLIZIZ.getString(iLIZIZ11);
                                    }
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
                                    if (!cursorLIZIZ.isNull(iLIZIZ14)) {
                                        string8 = cursorLIZIZ.getString(iLIZIZ14);
                                    }
                                    arrayList.add(new C535020Kya(string, string2, i, i2, i3, i4, i5, string3, string4, z, string5, string6, string7, string8, cursorLIZIZ.getLong(iLIZIZ15), cursorLIZIZ.getInt(iLIZIZ16)));
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
                    };
                }
                c0vkv = this.LLILLJJLI;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return c0vkv;
    }

    @Override // X.AbstractC796540VMm
    public final void clearAllTables() {
        super.assertNotMainThread();
        C0VLF c0vlfLJLJJI = this.mOpenHelper.LJLJJI();
        try {
            super.beginTransaction();
            c0vlfLJLJJI.LJIILJJIL("DELETE FROM `album_ai_content`");
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
        return new C796620VMu(this, new HashMap(0), new HashMap(0), "album_ai_content");
    }

    @Override // X.AbstractC796540VMm
    public final Set<Class<? extends InterfaceC2275591E5d>> getRequiredAutoMigrationSpecs() {
        return new HashSet();
    }

    @Override // X.AbstractC796540VMm
    public final Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
        HashMap map = new HashMap();
        map.put(InterfaceC534920KyQ.class, Collections.emptyList());
        return map;
    }

    @Override // X.AbstractC796540VMm
    public final InterfaceC796190VLd createOpenHelper(C796520VMk c796520VMk) {
        C0VN2 c0vn2 = new C0VN2(c796520VMk, new C0VN3() { // from class: X.0VKU
            @Override // X.C0VN3
            public final void onPostMigrate(C0VLF c0vlf) {
            }

            {
                super(1);
            }

            @Override // X.C0VN3
            public final void createAllTables(C0VLF c0vlf) {
                c0vlf.LJIILJJIL("CREATE TABLE IF NOT EXISTS `album_ai_content` (`uuid` TEXT NOT NULL, `task_id` TEXT NOT NULL, `ai_type` INTEGER NOT NULL, `media_type` INTEGER NOT NULL, `width` INTEGER NOT NULL, `height` INTEGER NOT NULL, `duration` INTEGER NOT NULL, `ai_local_uri` TEXT, `ai_remote_uri` TEXT, `new_flag` INTEGER NOT NULL, `anchor_name` TEXT, `anchor_id` TEXT, `anchor_icon_url` TEXT, `extra` TEXT, `created_time_ms` INTEGER NOT NULL, `deleted` INTEGER NOT NULL, PRIMARY KEY(`uuid`))");
                c0vlf.LJIILJJIL("CREATE INDEX IF NOT EXISTS `index_album_ai_content_task_id` ON `album_ai_content` (`task_id`)");
                c0vlf.LJIILJJIL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                c0vlf.LJIILJJIL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '0ac318c0d9a0a32313f5e46e307d5b82')");
            }

            @Override // X.C0VN3
            public final void dropAllTables(C0VLF c0vlf) {
                c0vlf.LJIILJJIL("DROP TABLE IF EXISTS `album_ai_content`");
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
                HashMap map = new HashMap(16);
                map.put("uuid", new C795990VKj(1, 1, "uuid", "TEXT", null, true));
                map.put("task_id", new C795990VKj(0, 1, "task_id", "TEXT", null, true));
                map.put("ai_type", new C795990VKj(0, 1, "ai_type", "INTEGER", null, true));
                map.put("media_type", new C795990VKj(0, 1, "media_type", "INTEGER", null, true));
                map.put("width", new C795990VKj(0, 1, "width", "INTEGER", null, true));
                map.put("height", new C795990VKj(0, 1, "height", "INTEGER", null, true));
                map.put("duration", new C795990VKj(0, 1, "duration", "INTEGER", null, true));
                map.put("ai_local_uri", new C795990VKj(0, 1, "ai_local_uri", "TEXT", null, false));
                map.put("ai_remote_uri", new C795990VKj(0, 1, "ai_remote_uri", "TEXT", null, false));
                map.put("new_flag", new C795990VKj(0, 1, "new_flag", "INTEGER", null, true));
                map.put("anchor_name", new C795990VKj(0, 1, "anchor_name", "TEXT", null, false));
                map.put("anchor_id", new C795990VKj(0, 1, "anchor_id", "TEXT", null, false));
                map.put("anchor_icon_url", new C795990VKj(0, 1, "anchor_icon_url", "TEXT", null, false));
                map.put("extra", new C795990VKj(0, 1, "extra", "TEXT", null, false));
                map.put("created_time_ms", new C795990VKj(0, 1, "created_time_ms", "INTEGER", null, true));
                map.put("deleted", new C795990VKj(0, 1, "deleted", "INTEGER", null, true));
                HashSet hashSet = new HashSet(0);
                HashSet hashSet2 = new HashSet(1);
                hashSet2.add(new C796450VMd(Arrays.asList("task_id"), "index_album_ai_content_task_id", Arrays.asList("ASC"), false));
                C0VN6 c0vn6 = new C0VN6("album_ai_content", map, hashSet, hashSet2);
                C0VN6 c0vn6LIZ = C0VN6.LIZ(c0vlf, "album_ai_content");
                if (!c0vn6.equals(c0vn6LIZ)) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("album_ai_content(com.ss.android.ugc.aweme.shortvideo.mediaselector.aicontentprotocol.AlbumAiContent).\n Expected:\n");
                    sbLIZ.append(c0vn6);
                    sbLIZ.append("\n Found:\n");
                    sbLIZ.append(c0vn6LIZ);
                    return new C0VN4(false, C2188811AlT.LIZIZ(sbLIZ));
                }
                return new C0VN4(true, null);
            }
        }, "0ac318c0d9a0a32313f5e46e307d5b82", "b608fe5461e9f81f4d2858cf5c93deb8");
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
