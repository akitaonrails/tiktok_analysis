package com.ss.android.ugc.aweme.music.model;

import X.C1421080n5G;
import X.C2286708xd;
import com.ss.android.ugc.aweme.creative.model.music.StickPointMusicAlg;

/* JADX INFO: loaded from: classes23.dex */
public final class StickPointBeanUtil {
    public static final StickPointBeanUtil INSTANCE = new StickPointBeanUtil();

    public static final boolean existBeatsTrackerAlgFile(StickPointMusicAlg stickPointMusicAlg) {
        return C2286708xd.LIZJ(stickPointMusicAlg.getNoStrengthBeatsPath());
    }

    public static final boolean existMusicSyncAlgFile(StickPointMusicAlg stickPointMusicAlg) {
        return C2286708xd.LIZJ(stickPointMusicAlg.getMusicSyncPath());
    }

    public static final boolean existOnSetAlgFile(StickPointMusicAlg stickPointMusicAlg) {
        return C2286708xd.LIZJ(stickPointMusicAlg.getVeBeatsPath());
    }

    public static final boolean existSuccessivelyAlgFile(StickPointMusicAlg stickPointMusicAlg) {
        int algType = stickPointMusicAlg.getAlgType();
        C1421080n5G c1421080n5G = StickPointMusicAlg.Companion;
        c1421080n5G.getClass();
        if (algType == StickPointMusicAlg.BEATES_FILE_BEATS_A0) {
            return C2286708xd.LIZJ(stickPointMusicAlg.getVeBeatsPath());
        }
        int algType2 = stickPointMusicAlg.getAlgType();
        c1421080n5G.getClass();
        if (algType2 == StickPointMusicAlg.BEATES_FILE_SERVER_C) {
            return C2286708xd.LIZJ(stickPointMusicAlg.getDownBeatsPath());
        }
        int algType3 = stickPointMusicAlg.getAlgType();
        c1421080n5G.getClass();
        if (algType3 == StickPointMusicAlg.BEATES_FILE_CUSTOM) {
            return C2286708xd.LIZJ(stickPointMusicAlg.getManModeBeatsPath());
        }
        return false;
    }

    public static final boolean isSuccessivelyAlgType(StickPointMusicAlg stickPointMusicAlg) {
        int algType = stickPointMusicAlg.getAlgType();
        C1421080n5G c1421080n5G = StickPointMusicAlg.Companion;
        c1421080n5G.getClass();
        if (algType != StickPointMusicAlg.BEATES_FILE_SERVER_C) {
            int algType2 = stickPointMusicAlg.getAlgType();
            c1421080n5G.getClass();
            if (algType2 != StickPointMusicAlg.BEATES_FILE_BEATS_A0) {
                int algType3 = stickPointMusicAlg.getAlgType();
                c1421080n5G.getClass();
                if (algType3 != StickPointMusicAlg.BEATES_FILE_CUSTOM) {
                    return false;
                }
                return true;
            }
            return true;
        }
        return true;
    }
}
