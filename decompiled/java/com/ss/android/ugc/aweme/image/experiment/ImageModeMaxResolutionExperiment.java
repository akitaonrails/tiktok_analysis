package com.ss.android.ugc.aweme.image.experiment;

import X.C09CT;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes29.dex */
public final class ImageModeMaxResolutionExperiment {
    public static final ImageModeMaxResolution LIZ;

    static {
        new ImageModeMaxResolution(1280, 1280);
        LIZ = new ImageModeMaxResolution(1920, 1920);
    }

    public static ImageModeMaxResolution LIZ() {
        ImageModeMaxResolution imageModeMaxResolution;
        try {
            imageModeMaxResolution = (ImageModeMaxResolution) SettingsManager.LIZLLL().LJIIIIZZ("image_album_resolution_for_creation", ImageModeMaxResolution.class, LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            imageModeMaxResolution = LIZ;
        }
        return imageModeMaxResolution == null ? LIZ : imageModeMaxResolution;
    }

    public static final class ImageModeMaxResolution {

        @C09CT("height")
        public final int height;

        @C09CT("width")
        public final int width;

        public ImageModeMaxResolution(int i, int i2) {
            this.width = i;
            this.height = i2;
        }
    }
}
