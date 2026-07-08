package com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.liverecordings;

import X.C089E;
import X.C098200Yq;
import X.C099R;
import X.C0CHQ;
import X.C0OGG;
import X.C189200o6;
import X.C19292410dm;
import X.C201955140j;
import X.C2114508Qd;
import X.C2188811AlT;
import X.C2296908zH;
import X.C533650KwN;
import X.C533710KwT;
import X.C533770KwZ;
import X.C786410Ut5;
import X.C796500VMi;
import X.EnumC20227914Cv;
import X.InterfaceC1364105Vn;
import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.shortvideo.mediaselector.liverecordingsprotocol.LiveRecordingsRoomDatabase;
import com.ss.android.ugc.aweme.shortvideo.mediaselector.liverecordingsprotocol.LiveRecordingsRoomDatabaseAdapter;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class LiveRecordingsDatabaseImpl implements LiveRecordingsRoomDatabase {
    public final String LIZIZ = "LiveRecordingsDatabaseImpl";
    public final ConcurrentHashMap<Long, C533710KwT> LIZJ = new ConcurrentHashMap<>();

    public static LiveRecordingsRoomDatabaseAdapter LIZIZ() {
        String uid;
        LiveRecordingsRoomDatabaseAdapter liveRecordingsRoomDatabaseAdapter;
        synchronized (LiveRecordingsRoomDatabaseAdapter.LL) {
            C19292410dm currentUser = C0CHQ.LIZ().getAccountService().getCurrentUser();
            if (currentUser == null || (uid = currentUser.getUid()) == null) {
                uid = "null_user";
            }
            C533770KwZ c533770KwZ = C533770KwZ.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("buildDatabase for ");
            sbLIZ.append(uid);
            C201955140j.LIZLLL(c533770KwZ, "LiveRecordingsRoomDatabaseAdapter", C2188811AlT.LIZIZ(sbLIZ));
            if (Intrinsics.LJFF(uid, LiveRecordingsRoomDatabaseAdapter.LLILLL)) {
                liveRecordingsRoomDatabaseAdapter = LiveRecordingsRoomDatabaseAdapter.LLILLJJLI;
                if (liveRecordingsRoomDatabaseAdapter == null) {
                    Context contextM3 = C786410Ut5.M3(C0CHQ.LIZ);
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("album_live_recordings_db_");
                    sbLIZ2.append(uid);
                    sbLIZ2.append(".db");
                    C796500VMi c796500VMiLIZ = C0OGG.LIZ(contextM3, LiveRecordingsRoomDatabaseAdapter.class, C2188811AlT.LIZIZ(sbLIZ2));
                    c796500VMiLIZ.LIZJ();
                    c796500VMiLIZ.LJIIIZ = true;
                    c796500VMiLIZ.LJIIJ = true;
                    liveRecordingsRoomDatabaseAdapter = (LiveRecordingsRoomDatabaseAdapter) c796500VMiLIZ.LIZIZ();
                    LiveRecordingsRoomDatabaseAdapter.LLILLJJLI = liveRecordingsRoomDatabaseAdapter;
                }
            } else {
                LiveRecordingsRoomDatabaseAdapter.LLILLL = uid;
                LiveRecordingsRoomDatabaseAdapter liveRecordingsRoomDatabaseAdapter2 = LiveRecordingsRoomDatabaseAdapter.LLILLJJLI;
                if (liveRecordingsRoomDatabaseAdapter2 != null) {
                    liveRecordingsRoomDatabaseAdapter2.close();
                }
                LiveRecordingsRoomDatabaseAdapter.LLILLJJLI = null;
                Context contextM32 = C786410Ut5.M3(C0CHQ.LIZ);
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("album_live_recordings_db_");
                sbLIZ3.append(uid);
                sbLIZ3.append(".db");
                C796500VMi c796500VMiLIZ2 = C0OGG.LIZ(contextM32, LiveRecordingsRoomDatabaseAdapter.class, C2188811AlT.LIZIZ(sbLIZ3));
                c796500VMiLIZ2.LIZJ();
                c796500VMiLIZ2.LJIIIZ = true;
                c796500VMiLIZ2.LJIIJ = true;
                liveRecordingsRoomDatabaseAdapter = (LiveRecordingsRoomDatabaseAdapter) c796500VMiLIZ2.LIZIZ();
                LiveRecordingsRoomDatabaseAdapter.LLILLJJLI = liveRecordingsRoomDatabaseAdapter;
            }
        }
        return liveRecordingsRoomDatabaseAdapter;
    }

    public static final void LIZLLL(File file) {
        Object c098200Yq;
        if (!file.exists()) {
            return;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            C089E c089e = new C089E(fileArrListFiles);
            while (c089e.hasNext()) {
                File file2 = (File) c089e.next();
                if (file2.isDirectory()) {
                    LIZLLL(file2);
                } else {
                    try {
                        c098200Yq = Boolean.valueOf(file2.delete());
                        C189200o6.m2constructorimpl(c098200Yq);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        c098200Yq = new C098200Yq(th);
                        C189200o6.m2constructorimpl(c098200Yq);
                    }
                    C189200o6.m1boximpl(c098200Yq);
                }
            }
        }
        try {
            C189200o6.m2constructorimpl(Boolean.valueOf(file.delete()));
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            C189200o6.m2constructorimpl(new C098200Yq(th2));
        }
    }

    public final void LIZJ(List<String> list) {
        String absolutePath;
        Object objValueOf;
        C533770KwZ c533770KwZ = C533770KwZ.LIZIZ;
        String str = this.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("safeDeleteAll paths: ");
        sbLIZ.append(list);
        C201955140j.LIZLLL(c533770KwZ, str, C2188811AlT.LIZIZ(sbLIZ));
        File parentFile = C0CHQ.LIZ().LJJIIJZLJL().getPathService().LJIIJ(EnumC20227914Cv.LIVE_RECORDINGS, "", false).getParentFile();
        if (parentFile != null && (absolutePath = parentFile.getAbsolutePath()) != null) {
            Iterator<String> it2 = list.iterator();
            while (it2.hasNext()) {
                File fileLJ = C2114508Qd.LJ(new File(it2.next()), new File(absolutePath));
                if (fileLJ != null) {
                    try {
                        if (fileLJ.exists()) {
                            if (fileLJ.isDirectory()) {
                                LIZLLL(fileLJ);
                                objValueOf = Unit.LIZ;
                            } else {
                                objValueOf = Boolean.valueOf(fileLJ.delete());
                            }
                            C189200o6.m2constructorimpl(objValueOf);
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        C189200o6.m2constructorimpl(new C098200Yq(th));
                    }
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.mediaselector.liverecordingsprotocol.LiveRecordingsRoomDatabase
    public final Object LIZ(C533710KwT c533710KwT, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        Object objLIZIZ = C2296908zH.LIZIZ(new C533650KwN(this, c533710KwT, null), interfaceC1364105Vn);
        if (objLIZIZ == C099R.LJFF()) {
            return objLIZIZ;
        }
        return Unit.LIZ;
    }
}
