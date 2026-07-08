package com.ss.android.ugc.aweme.tools.draft.db;

import X.C0CHQ;
import X.C0MZK;
import X.C12ES;
import X.C201955140j;
import X.C786410Ut5;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Pair;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.tools.draft.da.DBEvent;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: loaded from: classes9.dex */
public class SQLiteHelper extends SQLiteOpenHelper {
    public static SQLiteHelper sInstance;

    public SQLiteHelper() {
        super(C786410Ut5.M3(C0CHQ.LIZ), "aweme.db", null, 29, getErrorHandler());
    }

    public static DatabaseErrorHandler getErrorHandler() {
        return new DatabaseErrorHandler() { // from class: X.0MZN
            @Override // android.database.DatabaseErrorHandler
            public final void onCorruption(SQLiteDatabase sQLiteDatabase) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Corruption reported by sqlite on database: ");
                sbLIZ.append(sQLiteDatabase.getPath());
                C201955140j.LIZLLL(C0MAY.LIZIZ, "aweme-draft-monitor", C2188811AlT.LIZIZ(sbLIZ));
                if (!sQLiteDatabase.isOpen()) {
                    LIZ(sQLiteDatabase, sQLiteDatabase.getPath());
                    return;
                }
                List<Pair<String, String>> attachedDbs = null;
                try {
                    try {
                        attachedDbs = sQLiteDatabase.getAttachedDbs();
                    } catch (SQLiteException e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                    try {
                        sQLiteDatabase.close();
                    } catch (SQLiteException e2) {
                        TryCatchGuardChecker.doCheck(e2);
                    }
                    if (attachedDbs != null) {
                        Iterator<Pair<String, String>> it2 = attachedDbs.iterator();
                        while (it2.hasNext()) {
                            LIZ(sQLiteDatabase, (String) it2.next().second);
                        }
                        return;
                    }
                    LIZ(sQLiteDatabase, sQLiteDatabase.getPath());
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    if (attachedDbs != null) {
                        Iterator<Pair<String, String>> it3 = attachedDbs.iterator();
                        while (it3.hasNext()) {
                            LIZ(sQLiteDatabase, (String) it3.next().second);
                        }
                    } else {
                        LIZ(sQLiteDatabase, sQLiteDatabase.getPath());
                    }
                    throw th;
                }
            }

            public static void LIZ(SQLiteDatabase sQLiteDatabase, String str) {
                int i;
                boolean z;
                if (!u.LJIJI(str, ":memory:", true)) {
                    int length = str.length() - 1;
                    int i2 = 0;
                    boolean z2 = false;
                    while (i2 <= length) {
                        if (!z2) {
                            i = i2;
                        } else {
                            i = length;
                        }
                        if (Intrinsics.LJI(str.charAt(i), 32) <= 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (!z2) {
                            if (!z) {
                                z2 = true;
                            } else {
                                i2++;
                            }
                        } else if (!z) {
                            break;
                        } else {
                            length--;
                        }
                    }
                    if (str.subSequence(i2, length + 1).toString().length() != 0) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("draft db corruption deleted, path: ");
                        sbLIZ.append(sQLiteDatabase.getPath());
                        C201955140j.LIZLLL(C0MAY.LIZIZ, "aweme-draft-monitor", C2188811AlT.LIZIZ(sbLIZ));
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        C0MZK.LJ(new DBEvent("db_corruption_deleted", -1, -1, C0MZK.LIZIZ(), jCurrentTimeMillis, C0MZK.LIZ(jCurrentTimeMillis)));
                        try {
                            SQLiteDatabase.deleteDatabase(new C0VSJ(str));
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("delete failed: ");
                            sbLIZ2.append(e.getMessage());
                            C201955140j.LIZLLL(C0MAY.LIZIZ, "aweme-draft-monitor", C2188811AlT.LIZIZ(sbLIZ2));
                        }
                    }
                }
            }
        };
    }

    public static SQLiteHelper getInstance() {
        if (sInstance == null) {
            synchronized (SQLiteHelper.class) {
                try {
                    if (sInstance == null) {
                        sInstance = new SQLiteHelper();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return sInstance;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `local_draft` (\n\t`video_path`\tTEXT NOT NULL PRIMARY KEY UNIQUE,\n\t`aweme`\tTEXT NOT NULL,\n\t`music_path`\tTEXT,\n\t`voice_path`\tTEXT ,\n\t`video_volume`\tINTEGER NOT NULL,\n\t`music_volume`\tINTEGER NOT NULL,\n\t`filter`\tINTEGER NOT NULL,\n\t`music`\tTEXT,\n\t`music_start`\tINTEGER NOT NULL,\n\t`time`\tLONG NOT NULL,\n\t`effect`\tINTEGER,\n\t`origin`\tINTEGER,\n\t`face_beauty`\tINTEGER,\n\t`user_id`\tTEXT,\n\t`segment_video`\tTEXT,\n\t`segment_sdk`\tTEXT,\n\t`hard_encode`\tINTEGER,\n\t`special_points`\tINTEGER,\n\t`sticker_id`\tTEXT,\n\t`music_id`\tTEXT,\n\t`sticker_path`\tTEXT,\n\t`effect_list`\tTEXT,\n\t`camera_poi`\tINTEGER,\n\t`filter_label`\tTEXT,\n\t`beauty_label`\tINTEGER,\n\t`reverse_path`\tTEXT,\n\t`music_effect`\tTEXT,\n\t`video_speed`\tTEXT,\n\t`music_effect_segments`\tTEXT,\n\t`is_private`\tINTEGER,\n\t`max_duration`\tINTEGER,\n\t`audio_track`\tTEXT,\n\t`new_version`\tINTEGER,\n\t`output_wav_path`\tTEXT,\n\t`custom_cover_start`\tFLOAT,\n\t`video_width`\tINTEGER\tDEFAULT 540,\n\t`video_height`\tINTEGER\tDEFAULT 960,\n\t`duet_from`\tTEXT,\n\t`sync_platforms`\tTEXT,\n\t`photo_movie`\tTEXT,\n\t`draft_extras`\tTEXT,\n\t`draft_view_info`\tTEXT,\n\t`save_time`\tLONG,\n\t`creative_model`\tTEXT,\n\t`is_published`\tINTEGER,\n\t`published_time`\tLONG,\n\t`published_aweme_id`\tTEXT,\n\t`format_type`\tINTEGER\tDEFAULT 1,\n\t`visible_to_user`\tINTEGER\tDEFAULT 1,\n\t`free_up_space`\tLONG\tDEFAULT 0,\n\t`with_template`\tINTEGER\tDEFAULT 0,\n\t`with_effect`\tINTEGER\tDEFAULT 0\n);");
        long jCurrentTimeMillis = System.currentTimeMillis();
        C0MZK.LIZJ().storeLong("short_creation_time", jCurrentTimeMillis);
        C0MZK.LJ(new DBEvent("db_create", -1, -1, C0MZK.LIZIZ(), jCurrentTimeMillis, C0MZK.LIZ(jCurrentTimeMillis)));
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        try {
            super.onDowngrade(sQLiteDatabase, i, i2);
            long jCurrentTimeMillis = System.currentTimeMillis();
            C0MZK.LJ(new DBEvent("db_downgrade", i, i2, C0MZK.LIZIZ(), jCurrentTimeMillis, C0MZK.LIZ(jCurrentTimeMillis)));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C201955140j.LJI("SQLiteHelper onDowngrade error", e);
            C12ES.LIZLLL(R.string.upgrade_exception_hint, C786410Ut5.M3(C0CHQ.LIZ));
            System.exit(0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:129:0x037b  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x038c  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x03bf A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0169 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0022  */
    /* JADX WARN: Type inference failed for: r13v1, types: [com.ss.android.ugc.aweme.draft.model.AVDraftExtras, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v5, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v4, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r7v5 */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:122:0x036d
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    @Override // android.database.sqlite.SQLiteOpenHelper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onUpgrade(android.database.sqlite.SQLiteDatabase r160, int r161, int r162) {
        /*
            Method dump skipped, instruction units count: 1130
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tools.draft.db.SQLiteHelper.onUpgrade(android.database.sqlite.SQLiteDatabase, int, int):void");
    }
}
