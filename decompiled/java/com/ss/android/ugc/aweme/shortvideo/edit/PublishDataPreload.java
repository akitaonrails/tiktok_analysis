package com.ss.android.ugc.aweme.shortvideo.edit;

import X.C04TD;
import X.C0EME;
import X.C0EMG;
import X.C376900Eq8;
import X.C376910Eq9;
import X.C376960EqE;
import X.C376970EqF;
import com.ss.android.ugc.aweme.services.optimization.IPublishDataPreloadService;
import kotlin.jvm.internal.AFwS191S0000000_5;

/* JADX INFO: loaded from: classes6.dex */
public final class PublishDataPreload implements IPublishDataPreloadService {
    public static IPublishDataPreloadService LIZ() {
        Object objLIZ = C04TD.LIZ(IPublishDataPreloadService.class, false);
        if (objLIZ != null) {
            return (IPublishDataPreloadService) objLIZ;
        }
        if (C04TD.i5 == null) {
            synchronized (IPublishDataPreloadService.class) {
                if (C04TD.i5 == null) {
                    C04TD.i5 = new PublishDataPreload();
                }
            }
        }
        return C04TD.i5;
    }

    @Override // com.ss.android.ugc.aweme.services.optimization.IPublishDataPreloadService
    public final void stopCheckerCache() {
        C0EMG c0emg = C0EMG.LIZ;
        C0EME c0eme = new C0EME();
        c0emg.getClass();
        C0EMG.LIZIZ = c0eme;
        C376910Eq9 c376910Eq9 = C376910Eq9.LIZ;
        C376900Eq8 c376900Eq8 = new C376900Eq8();
        c376910Eq9.getClass();
        C376910Eq9.LIZIZ = c376900Eq8;
    }

    @Override // com.ss.android.ugc.aweme.services.optimization.IPublishDataPreloadService
    public final void startCheckerCache(Object obj) {
        VideoPublishEditModel videoPublishEditModel;
        if ((obj instanceof VideoPublishEditModel) && (videoPublishEditModel = (VideoPublishEditModel) obj) != null) {
            C376960EqE c376960EqE = new C376960EqE();
            c376960EqE.LIZ.clear();
            C376960EqE.LJFF(AFwS191S0000000_5.get$arr$(338));
            c376960EqE.LIZLLL(videoPublishEditModel);
            c376960EqE.LIZJ(videoPublishEditModel);
            c376960EqE.LIZ(videoPublishEditModel, true);
            c376960EqE.LIZ(videoPublishEditModel, false);
            c376960EqE.LIZIZ(videoPublishEditModel);
            C376960EqE.LJFF(AFwS191S0000000_5.get$arr$(339));
            C376910Eq9.LIZ.getClass();
            C376910Eq9.LIZIZ = c376960EqE;
            C376970EqF c376970EqF = new C376970EqF();
            c376970EqF.LIZ.clear();
            C376970EqF.LIZ(AFwS191S0000000_5.get$arr$(57));
            c376970EqF.LIZIZ(videoPublishEditModel);
            C376970EqF.LIZ(AFwS191S0000000_5.get$arr$(58));
            C0EMG.LIZ.getClass();
            C0EMG.LIZIZ = c376970EqF;
        }
    }
}
