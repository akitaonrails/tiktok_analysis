package com.ss.android.experiment;

import X.C13LP;
import X.C1849607Mg;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.launcher.service.experiment.IImageHeaderConfig;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes14.dex */
public final class ImageHeaderConfigImpl implements IImageHeaderConfig {
    @Override // com.ss.android.ugc.aweme.launcher.service.experiment.IImageHeaderConfig
    public final Set<String> LJ() {
        List<String> list;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        TTImageHeaderModel tTImageHeaderModelLIZ = C1849607Mg.LIZ();
        if (tTImageHeaderModelLIZ != null && (list = tTImageHeaderModelLIZ.pathList) != null) {
            linkedHashSet.addAll(list);
        }
        return C13LP.LLIFFJFJJ(linkedHashSet);
    }

    @Override // com.ss.android.ugc.aweme.launcher.service.experiment.IImageHeaderConfig
    public final String LIZ() {
        TTImageHeaderModel tTImageHeaderModelLIZ = C1849607Mg.LIZ();
        if (tTImageHeaderModelLIZ != null) {
            return tTImageHeaderModelLIZ.native_static_format;
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.launcher.service.experiment.IImageHeaderConfig
    public final long LIZIZ() {
        Long l;
        TTImageHeaderModel tTImageHeaderModelLIZ = C1849607Mg.LIZ();
        if (tTImageHeaderModelLIZ == null || (l = tTImageHeaderModelLIZ.batteryCheckTimeGap) == null) {
            return 60000L;
        }
        return l.longValue();
    }

    @Override // com.ss.android.ugc.aweme.launcher.service.experiment.IImageHeaderConfig
    public final long LIZJ() {
        Long l;
        TTImageHeaderModel tTImageHeaderModelLIZ = C1849607Mg.LIZ();
        if (tTImageHeaderModelLIZ == null || (l = tTImageHeaderModelLIZ.networkQualityCheckTimeGap) == null) {
            return 30000L;
        }
        return l.longValue();
    }

    @Override // com.ss.android.ugc.aweme.launcher.service.experiment.IImageHeaderConfig
    public final String LIZLLL() {
        TTImageHeaderModel tTImageHeaderModelLIZ = C1849607Mg.LIZ();
        if (tTImageHeaderModelLIZ != null) {
            return tTImageHeaderModelLIZ.h5_anim_format;
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.launcher.service.experiment.IImageHeaderConfig
    public final String LJFF() {
        TTImageHeaderModel tTImageHeaderModelLIZ = C1849607Mg.LIZ();
        if (tTImageHeaderModelLIZ != null) {
            return tTImageHeaderModelLIZ.lynx_anim_format;
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.launcher.service.experiment.IImageHeaderConfig
    public final String LJI() {
        TTImageHeaderModel tTImageHeaderModelLIZ = C1849607Mg.LIZ();
        if (tTImageHeaderModelLIZ != null) {
            return tTImageHeaderModelLIZ.lynx_static_format;
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.launcher.service.experiment.IImageHeaderConfig
    public final String LJII() {
        TTImageHeaderModel tTImageHeaderModelLIZ = C1849607Mg.LIZ();
        if (tTImageHeaderModelLIZ != null) {
            return tTImageHeaderModelLIZ.h5_static_format;
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.launcher.service.experiment.IImageHeaderConfig
    public final String LJIIIIZZ() {
        TTImageHeaderModel tTImageHeaderModelLIZ = C1849607Mg.LIZ();
        if (tTImageHeaderModelLIZ != null) {
            return tTImageHeaderModelLIZ.native_anim_format;
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.launcher.service.experiment.IImageHeaderConfig
    public final long LJIIIZ() {
        Long l;
        TTImageHeaderModel tTImageHeaderModelLIZ = C1849607Mg.LIZ();
        return (tTImageHeaderModelLIZ == null || (l = tTImageHeaderModelLIZ.memoryCheckTimeGap) == null) ? Mp4ScreenVideoLoadTimeout.CONTROL : l.longValue();
    }

    @Override // com.ss.android.ugc.aweme.launcher.service.experiment.IImageHeaderConfig
    public final boolean isEnable() {
        Boolean bool;
        TTImageHeaderModel tTImageHeaderModelLIZ = C1849607Mg.LIZ();
        if (tTImageHeaderModelLIZ == null || (bool = tTImageHeaderModelLIZ.enable) == null) {
            return false;
        }
        return bool.booleanValue();
    }
}
