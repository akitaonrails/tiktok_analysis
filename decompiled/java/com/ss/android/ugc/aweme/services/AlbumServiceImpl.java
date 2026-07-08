package com.ss.android.ugc.aweme.services;

import X.C0C64;
import X.C0L3Q;
import X.C1659630tI1;
import X.C198H;
import X.C19EG;
import X.C20622515mp;
import X.C443120HZe;
import X.C530180Kqm;
import X.C533930Kwp;
import X.EnumC194317110p;
import X.InterfaceC20597015ii;
import X.InterfaceC533840Kwg;
import android.content.Context;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.shortvideo.FirstPhotoViewModel;
import com.ss.android.ugc.aweme.shortvideo.ui.task.PreloadMediaDataTask;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class AlbumServiceImpl implements InterfaceC533840Kwg {
    private final Scene getRecordScene(C19EG c19eg) {
        Scene scene;
        C198H c198hLC;
        InterfaceC20597015ii interfaceC20597015iiLIZJ = C20622515mp.LIZJ(c19eg);
        if (interfaceC20597015iiLIZJ == null) {
            return null;
        }
        C198H c198hLC2 = interfaceC20597015iiLIZJ.LC();
        if (c198hLC2 != null) {
            scene = c198hLC2.getScene();
        } else {
            scene = null;
        }
        if (!(scene instanceof C0L3Q) || (c198hLC = interfaceC20597015iiLIZJ.LC()) == null) {
            return null;
        }
        return c198hLC.getScene();
    }

    @Override // X.InterfaceC533840Kwg
    public void tryPreloadMediaAfterAlbumPermissionGranted(C19EG c19eg) {
        Scene recordScene = getRecordScene(c19eg);
        if (recordScene != null && C0C64.LJIILLIIL().LJIIIZ(31744, "studio_preload_media_after_permission_granted", true, false) && C533930Kwp.LIZJ() && ((FirstPhotoViewModel) C1659630tI1.LJIIIIZZ(recordScene, null, null, 6).get(FirstPhotoViewModel.class)).LL.getValue() == null) {
            new PreloadMediaDataTask(c19eg.getLifecycle(), c19eg, recordScene, EnumC194317110p.P0).run();
        }
    }

    @Override // X.InterfaceC533840Kwg
    public C443120HZe<Boolean, Integer, Long> checkMediaDurationValid(Context context, List<? extends MediaModel> list, long j, long j2) {
        int i = C530180Kqm.LIZIZ;
        return C530180Kqm.LIZ(context, list, j, j2);
    }
}
